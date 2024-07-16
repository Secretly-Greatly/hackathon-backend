package com.example.hackathonbackend;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PhotoController {
    private final PhotoService photoService;

    @GetMapping("/photo")
    public List<String> getUrls(@RequestPart("file") MultipartFile file){
        return photoService.getUrls(file);
    }
}
