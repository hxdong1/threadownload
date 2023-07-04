package com.kunsheng.service.Impl;

import com.kunsheng.service.DownloadService;
import com.kunsheng.threadxiazai.Downloader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * url:资源下载地址
 * MD5:传来的网页资源进行本地下载文件进行核对
 * threadNum对线程进行指定线程数
 * savePath保存地址
 * */
@Service
public class DownloadServiceImpl implements DownloadService {
    @Autowired
    private DownloadService downloadService;

    @Override
    public void downlpad(String add, String MD5, int threadNum, String savePath) throws MalformedURLException {
        URL downloadAdd = new URL(add);
        //对保存路径进行判断
        File saveFile = new File(savePath);
        if (!saveFile.exists()) {
            saveFile.mkdirs();
        }
        //调用方法
        }
}