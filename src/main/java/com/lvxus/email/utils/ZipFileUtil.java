package com.lvxus.email.utils;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileUtil {

    public static ByteArrayOutputStream zip(String content, String zipPath, HttpServletResponse response) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
        try {
            zipOutputStream.setLevel(9);
            zipOutputStream.putNextEntry(new ZipEntry(zipPath));
            byte[] bytes = content.getBytes(StandardCharsets.UTF_8);
            zipOutputStream.write(bytes, 0, bytes.length);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                byteArrayOutputStream.close();
                zipOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return byteArrayOutputStream;
    }

    public static ByteArrayOutputStream zipFiles(Map<String, String> fileContentMap, HttpServletResponse response) {
        Set<String> strings = fileContentMap.keySet();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
        strings.forEach(key -> {
            try {
                zipOutputStream.setLevel(9);
                zipOutputStream.putNextEntry(new ZipEntry(key));
                String content = fileContentMap.get(key);
                byte[] bytes = content.getBytes(StandardCharsets.UTF_8);
                zipOutputStream.write(bytes, 0, bytes.length);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        try {
            zipOutputStream.close();
            byteArrayOutputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return byteArrayOutputStream;
    }

    public static void zipDownload(ByteArrayOutputStream byteArrayOutputStream, HttpServletResponse response) {
        ServletOutputStream servletOutputStream = null;
        try {
            byte[] zipBytes = byteArrayOutputStream.toByteArray();
            //下面就是下载的那一套了
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/x-msdownload");
            String filename = new String("压缩文件下载.zip".getBytes(StandardCharsets.UTF_8), "ISO8859-1");
            response.addHeader("Content-Disposition", "attachment;filename=" + filename);
            servletOutputStream = response.getOutputStream();
            servletOutputStream.write(zipBytes);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                servletOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
