package com.example.hackathonbackend;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PhotoService {
    private final PhotoRepository photoRepository;
    private final PostRepository postRepository;
    private final PhotoClient photoClient;

    @Transactional
    public List<String> getUrls(MultipartFile file){
        Long photoId = photoClient.getPhotoId(file).getId();

        Photo photo = photoRepository.findById(photoId).orElseThrow(RuntimeException::new);

        System.out.println(photo.getBrandName());

        return postRepository.findAllByPhoto(photo).stream().map(
                Post::getFileUrl
        ).toList();
    }
}