package com.kunsheng.controller;

import com.kunsheng.service.DownloadService;
import com.sun.net.httpserver.HttpServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;

@RestController
@RequestMapping("/download")
public class ThreadDownloadController {
    @Autowired
    private DownloadService downloadService;

     //传来数据
    @GetMapping
    public  void download(String add, String MD5, int threadNum, String savePath, HttpRequest httpServer) throws IOException {
        HttpHeaders headers = httpServer.headers();
        System.out.println(headers);
        downloadService.downlpad(add,MD5,threadNum,savePath);

    }
}
