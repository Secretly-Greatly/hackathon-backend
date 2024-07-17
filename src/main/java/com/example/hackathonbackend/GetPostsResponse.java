package com.example.hackathonbackend;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
@Builder
public class GetPostsResponse {
    private final String brandName;
    private String brandImageUrl;
    private final List<PostDto> postDtos;
}
