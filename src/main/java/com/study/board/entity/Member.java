package com.study.board.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
public class Member {

    @Id @GeneratedValue
    private Long seq;
    private String email;
    private String password;
    private String name;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate date;

    public Member(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.date = LocalDate.now();
    }
}
