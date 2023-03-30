package com.hanterglobal.test1;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Category {
    private int parentIdx;
    private int childId;
}
