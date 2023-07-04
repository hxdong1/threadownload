package com.kunsheng.service;

import java.io.IOException;
import java.net.MalformedURLException;

public interface DownloadService {
    void downlpad(String add, String MD5, int threadNum, String savePath) throws IOException;
}
