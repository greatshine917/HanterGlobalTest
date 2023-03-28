package com.hanterglobal.test1.article;

import com.hanterglobal.test1.article.entity.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Gender, Long> {

}
