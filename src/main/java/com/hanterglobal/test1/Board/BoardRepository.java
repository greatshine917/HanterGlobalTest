package com.hanterglobal.test1.Board;

import com.hanterglobal.test1.Board.entity.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Gender, Long> {

}
