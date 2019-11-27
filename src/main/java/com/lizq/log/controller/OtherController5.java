package com.lizq.log.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class OtherController5 {
    private long debugIndex = 0;
    private long infoIndex = 0;
    private long warnIndex = 0;
    private long errorIndex = 0;

    @Scheduled(cron = "* * 0/1 * * ?")
    public void debug() {
        debugIndex++;
        log.debug("other controller 5 debug日志{}", debugIndex);
    }

    @Scheduled(cron = "* * 0/1 * * ?")
    public void info() {
        infoIndex++;
        log.info("other controller 5 info日志{}", infoIndex);
    }

    @Scheduled(cron = "* * 0/1 * * ?")
    public void warn() {
        warnIndex++;
        log.warn("other controller 5 warn日志{}", warnIndex);
    }

    @Scheduled(cron = "* * 0/1 * * ?")
    public void error() {
        errorIndex++;
        log.error("other controller 5 error日志{}", errorIndex);
    }
}
