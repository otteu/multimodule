package dev.be.api.controller;


import dev.be.api.service.DemoService;
import dev.be.modulecommon.domain.Member;
import dev.be.modulecommon.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class DemoController {

    private final DemoService demoService;
    private final MemberRepository memberRepository;

    @GetMapping("/save")
    public String save() {
        memberRepository.save(Member.create(Thread.currentThread().getName()));
        return demoService.save();
    }

    @GetMapping("/find")
    public String find() {
        return demoService.find();
    }

}
