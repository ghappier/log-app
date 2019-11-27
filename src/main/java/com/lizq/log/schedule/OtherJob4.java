package com.lizq.log.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class OtherJob4 {

    private long debugIndex = 0;
    private long infoIndex = 0;
    private long warnIndex = 0;
    private long errorIndex = 0;

    @Scheduled(cron = "* * 0/1 * * ?")
    public void debug() {
        debugIndex++;
        log.debug("other job 4 debug日志{}", debugIndex);
    }

    @Scheduled(cron = "* * 0/1 * * ?")
    public void info() {
        infoIndex++;
        log.info("other job 4 info日志{}", infoIndex);
    }

    @Scheduled(cron = "* * 0/1 * * ?")
    public void warn() {
        warnIndex++;
        log.warn("other job 4 warn日志{}", warnIndex);
    }

    @Scheduled(cron = "* * 0/1 * * ?")
    public void error() {
        errorIndex++;
        log.error("other job 4 error日志{}", errorIndex);
    }
}
