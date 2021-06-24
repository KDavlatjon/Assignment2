package uz.developer.webApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.developer.webApp.service.FlickrService;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class FlickrController {

    private final FlickrService flickrService;
    @Autowired
    public FlickrController( FlickrService flickrService) {
        this.flickrService = flickrService;
    }
    @GetMapping(path = "/photos/{tags}")
    public List<String> getImages(@PathVariable(value = "tags", required = false) String tags){
        List<String> body = flickrService.searchPhoto(tags);
        System.out.println("body="+body);
        return body;
    }
}
