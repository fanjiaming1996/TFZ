package com.fan.tfz;

import com.fan.tfz.utils.SnapShot;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class task {
    @Scheduled(cron = "*/10 * * * * ?")
    private void getLenovoSnapShot() {
        SnapShot cam = new SnapShot("C:\\lenovo\\", "png");//
        cam.snapShot();
    }
}
