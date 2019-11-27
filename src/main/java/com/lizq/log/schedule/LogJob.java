package com.lizq.log.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LogJob {

    private long debugIndex = 0;
    private long infoIndex = 0;
    private long warnIndex = 0;
    private long errorIndex = 0;

    @Scheduled(cron = "* * 0/1 * * ?")
    public void debug() {
        debugIndex++;
        log.debug("job debug日志{}", debugIndex);
    }

    @Scheduled(cron = "* * 0/1 * * ?")
    public void info() {
        infoIndex++;
        log.info("job info日志{}", infoIndex);
    }

    @Scheduled(cron = "* * 0/1 * * ?")
    public void warn() {
        warnIndex++;
        log.warn("job warn日志{}", warnIndex);
    }

    @Scheduled(cron = "* * 0/1 * * ?")
    public void error() {
        errorIndex++;
        log.error("job error日志{}", errorIndex);
    }
}
