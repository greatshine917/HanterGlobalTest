package com.hanterglobal.test1;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Post {
    private String title;
    private String content;
    private String category;
}
