package com.giyun.backboard.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity // JPA 엔티티로 지정
public class Board {

    @Id // PK
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // 시퀀스 방식으로 자동 증가
    // @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 증가
    private Long bno; // 게시글 번호

    // @Column(name="subject", length = 250)
    @Column(length = 250)
    private String title; // 게시글 제목

    @Column(length = 8000)
    private String content; // 게시글 내용

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createDate; // 게시글 작성일

    @LastModifiedBy
    private String modifyDate;// 게시글 수정일
}
