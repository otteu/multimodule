package dev.be.api.service;

import dev.be.modulecommon.enums.CodeEnum;
import dev.be.modulecommon.service.CommonDemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class DemoService {

    private final CommonDemoService commonDemoService;
    public String save() {
        System.out.println(CodeEnum.SUCCESS.getCode());
        System.out.println(commonDemoService.commonService());
        return "save";
    }

    public String find() {
        return "find";
    }



}
