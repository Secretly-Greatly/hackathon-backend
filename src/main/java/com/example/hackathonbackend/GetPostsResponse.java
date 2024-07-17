package com.example.hackathonbackend;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class GetPostsResponse {
    private final String content;
    private final String url;
}
