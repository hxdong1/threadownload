package com.kunsheng.download;

import org.springframework.util.DigestUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoTest2 {
    public static void main(String[] args) throws IOException {
        String filePath1 = "E:\\视频\\第二节.mp4";
        String filePath2 = "E:\\视频2\\第二节.mp4";
        String s = DigestUtils.md5DigestAsHex(new FileInputStream(filePath1));
        String s1 = DigestUtils.md5DigestAsHex(new FileInputStream(filePath2));
        if (s.equals(s1)){
            System.out.println("文件一致");
        }else {
            System.out.println("文件不一致");
        }
    }
}
