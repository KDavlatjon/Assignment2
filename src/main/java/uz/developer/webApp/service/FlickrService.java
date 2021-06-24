package uz.developer.webApp.service;

import com.google.gson.Gson;
import lombok.NoArgsConstructor;
import uz.developer.webApp.model.FlickrResponse;
import uz.developer.webApp.model.Photo;
import uz.developer.webApp.repositary.ServiceInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@org.springframework.stereotype.Service
public class FlickrService implements ServiceInterface {

    private final static String flickrApiUrl = "https://api.flickr.com/services/rest/?&method=flickr.photos.search&api_key=";
    private static String flickrApiKey = "f528a41ad70873d6cfb2787c951319c9";
    private static String photoSourceUrl = "https://farm{farm-id}.staticflickr.com/{server-id}/{id}_{secret}.jpg";
    @Override
    public List<String> searchPhoto(String tags) {
        List<String> listUrl = new ArrayList<>();
        try {
            URL url = new URL(flickrApiUrl+flickrApiKey+"&tags="+tags+"&format=json&nojsoncallback=1");
            URLConnection connection = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            Gson gson = new Gson();
            FlickrResponse flickrResponse = gson.fromJson(reader, FlickrResponse.class);

            List<Photo> photoList = flickrResponse.photos.photo;
            for (Photo photo : photoList) {

                String farm = photo.farm.toString();
                String server = photo.server.toString();

                String id = photo.id.toString();
                String secret = photo.secret.toString();

                String photoUrl = "https://farm"+farm+".staticflickr.com/"+server+"/"+id+"_"+secret+".jpg";
                listUrl.add(photoUrl);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(listUrl);
        return listUrl;
    }

}
