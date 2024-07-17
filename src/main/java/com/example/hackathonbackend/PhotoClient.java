package com.example.hackathonbackend;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(name = "photo", url = "http://192.168.1.70:8000/photo_upload", configuration = FeignClientConfiguration.class)
public interface PhotoClient {
    @GetMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    PhotoResponse getPhotoId(@RequestPart("file") MultipartFile file);
}
