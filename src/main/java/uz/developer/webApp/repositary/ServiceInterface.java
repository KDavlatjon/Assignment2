package uz.developer.webApp.repositary;

import uz.developer.webApp.model.FlickrResponse;
import uz.developer.webApp.model.Photo;

import java.util.List;

public interface ServiceInterface {

    List<String> searchPhoto(String tags);

}
