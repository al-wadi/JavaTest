package com.java.java_test.web;

import com.java.java_test.model.Photo;
import com.java.java_test.service.PhotosService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.util.*;

@RestController
public class PhotosController {


    private  final PhotosService photosService;

    public PhotosController(PhotosService photosService) {
        this.photosService = photosService;
    }


    @GetMapping("/")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/photos")
    public Iterable<Photo> get(){
        return photosService.get();
    }

    @GetMapping("/photos/{id}")
    public Photo get(@PathVariable Integer id){
        Photo photo =photosService.get(id);
        if(photo==null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return photo ;
    }

    @DeleteMapping("/photos/{id}")
    public void delete (@PathVariable Integer id) {
        photosService.remove(id);
        }

    @PostMapping("/photos")
    public Photo create (@RequestPart("data") MultipartFile file) throws IOException {

        return photosService.save(file.getOriginalFilename(), file.getContentType() , file.getBytes());

    }

}
