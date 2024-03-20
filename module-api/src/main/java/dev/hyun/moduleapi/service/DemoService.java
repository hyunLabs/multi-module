package dev.hyun.moduleapi.service;

import dev.hyun.moduleapi.exception.CustomException;
import dev.hyun.modulecommon.domain.Member;
import dev.hyun.modulecommon.enums.CodeEnum;
import dev.hyun.modulecommon.repositories.MemberRepository;
import dev.hyun.modulecommon.service.CommonDemoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class DemoService {

    private final Logger logger = LoggerFactory.getLogger(DemoService.class);

    private final CommonDemoService commonDemoService;

    private final MemberRepository memberRepository;

    public String save() {
        memberRepository.save(Member.builder()
                                    .name(Thread.currentThread().getName())
                                    .build());
        return "save";
    }

    public String find() {
        int size = memberRepository.findAll().size();
        logger.info("DBB size : " + size);
        return "find";
    }

    public String exception() {
        if (true) {
            throw new CustomException(CodeEnum.UNKNOWN_ERROR);
        }
        return "exception";
    }
}
