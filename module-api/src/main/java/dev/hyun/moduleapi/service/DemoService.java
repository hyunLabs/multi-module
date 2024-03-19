package dev.hyun.moduleapi.service;

import dev.hyun.modulecommon.enums.CodeEnum;
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

    public String save() {
        logger.info(CodeEnum.SUCCESS.getCode());
        logger.info(commonDemoService.commonService());
        return "save";
    }

    public String find() {
        return "find";
    }
}
