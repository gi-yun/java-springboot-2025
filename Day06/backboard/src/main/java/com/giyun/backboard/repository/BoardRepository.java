package com.giyun.backboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giyun.backboard.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

    // JPA를 사용하여 Board 엔티티에 대한 CRUD 작업을 수행할 수 있습니다.
    // 추가적인 메소드가 필요하다면 여기에 정의할 수 있습니다.

    // 예시: 특정 제목으로 게시글 검색
    // List<Board> findByTitleContaining(String title);

    Board findByTitle(String title); // 제목으로 게시글 조회

    List<Board> findByContentContaining(String title); // 비슷한 제목으로 게시글 조회

}
