package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.config.CorsConfig;
import org.example.controller.TargetOrderController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;
import java.io.IOException;

@Slf4j
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//@MapperScan("org.example.dao")
@ComponentScan("org.example.*")
@EnableScheduling
@Import(CorsConfig.class)
public class Transfer {

    @Autowired
    //private TargetOrderController myController2; //自动装配的controller
    private static TargetOrderController myController ; //供静态main方法调用的controller

   // @PostConstruct
    //public void init() {
    //    myController= myController2; //完成赋予操作
    //}
    //@Scheduled(cron = "0 0 0 2 * ?")                      //每月2日定时启动
    //@Scheduled(cron = "0 3 * * * ?")

    public static void main(String[] args) throws InterruptedException, IOException {
        SpringApplication.run(Transfer.class, args);
        log.info("项目启动成功...");
        //myController.Trans();

        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //System.out.print(sdf.format(System.currentTimeMillis())+"   Waiting");
        //MyThread NewThread = new MyThread();
        //启动线程：
        //NewThread.setName("Trans");
        //NewThread.start();
    }
}