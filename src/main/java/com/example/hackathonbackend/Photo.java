package com.example.hackathonbackend;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fileUrl;

    @Column(nullable = false)
    private String brandImageUrl;

    @Column(nullable = false)
    private String brandName;

    @OneToMany(mappedBy = "photo")
    private List<Post> posts;
}
