package com.study.board.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String username; // ID
    private String password; // Password
    private String name; // 이름
    private String email; // 이메일

    private String role; // 권한

    private LocalDateTime createDate; // 생성 날짜

    @PrePersist // DB에 insert 되기 직전에 실행되는 Annotation, DB에 값을 넣으면 자동실행
    public void createDate(){
        this.createDate = LocalDateTime.now();
    }
}
