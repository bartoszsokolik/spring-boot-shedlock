package pl.solutions.software.sokolik.bartosz.configuration;

import net.javacrumbs.shedlock.core.SchedulerLock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

    private static final Logger LOGGER = LoggerFactory.getLogger(Scheduler.class);

    @Value("${service.name}")
    private String serviceName;

    @Scheduled(cron = "0 */1 * * * *")
    @SchedulerLock(name = "defaultSchedulerLock")
    public void schedule() throws InterruptedException {
        LOGGER.info("Locked with service {}", serviceName);
        Thread.sleep(3000);
        LOGGER.info("Unlocked with service {}", serviceName);
    }
}
