package com.hanterglobal.test1.article.entity;

import jakarta.persistence.Entity;

@Entity
public class Gender {

    // 공지사항은 이름은 같지만 각각 다른 게시판
    // 익명 게시판은 모두 같은 게시판이 각각 다른 카테고리에 소속되어 있다.
    // 카테고리 간의 관계 데이터를 parent_idx, child_id 2개의 값으로만 저장 해야 하며
    // 저장된 값을 임의의 자료구조를 통해 구조화 시켜서 위와 같은 관계 데이터를 얻을 수 있어야 한다.

    // 성별
    // 그룹
    // 이름
    // 게시판 아이디



}
