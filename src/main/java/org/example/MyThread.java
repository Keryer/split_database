package org.example;

import org.example.controller.TargetOrderController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;

@Component
class MyThread extends Thread   {
    @Autowired
    private TargetOrderController myController3 = new TargetOrderController(); //自动装配的controller
    private static TargetOrderController myController4 = new TargetOrderController(); //供静态main方法调用的controller
    @PostConstruct
    public void init() {
        myController4= myController3; //完成赋予操作
    }
    public void run()   {
        //do something here
        try {
            myController4.Trans();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
