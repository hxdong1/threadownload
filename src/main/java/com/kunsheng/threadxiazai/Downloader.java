package com.kunsheng.threadxiazai;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
@Component

public class  Downloader extends Thread{
    //先将默认开启的线程个数确定下来
    private static int THREAD_AMOUNT = 8;
    void downloade12 (URL downloadAdd, String MD5, int threadNum, String savePath) throws IOException {
        //与目标资源建立连接
        HttpURLConnection conn = (HttpURLConnection) downloadAdd.openConnection();
        //获取目标文件长度；
        int contentLength = conn.getContentLength();
        //记录每个线程处理的数据
        int threadLen;
        //线程数默认值是8，如果传来指定的线程数，就使用指定的线程数
        if (threadNum != 0) {
            THREAD_AMOUNT = threadNum;
        }
        //计算出每个线程需要处理的数据
        threadLen = contentLength / THREAD_AMOUNT;
    }
}
