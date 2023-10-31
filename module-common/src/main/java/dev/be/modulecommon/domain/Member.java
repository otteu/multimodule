package dev.be.modulecommon.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;

    @Builder
    private Member(String name) {
        this.name = name;
    }

    public static Member create(String name) {
        return Member.builder()
                .name(name)
                .build();
    }
}
