package dev.be.api.service;

import dev.be.modulecommon.domain.Member;
import dev.be.modulecommon.repository.MemberRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DemoServiceTest {

    @Autowired
    private MemberRepository memberRepository;


    @DisplayName("DB 묘듈 연결")
    @Test
    void test() {
        // given


        // when
        Member test = memberRepository.save(Member.create("Test"));
        

        // then
        assertEquals(test.getName(), "Test");


    }
}