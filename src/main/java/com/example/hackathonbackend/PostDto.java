package com.example.hackathonbackend;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class PostDto {
    private final String content;
    private final String url;
}
