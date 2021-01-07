package com.service;

import com.entity.WaterMark;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
@Service
public class ImageWaterMarkService {

    /**
     * imgFile 图像文件
     * imageFileName 图像文件名
     * uploadPath 服务器上上传文件的相对路径
     * realUploadPath 服务器上上传文件的物理路径
     */
    public String watermarkAdd(File imgFile, String imageFileName, String uploadPath, String realUploadPath, WaterMark waterMark) {

        String imgWithWatermarkFileName = "watermark_" + imageFileName;
        OutputStream os = null;

        try {
            Image image = ImageIO.read(imgFile);

            int width = image.getWidth(null);
            int height = image.getHeight(null);

            BufferedImage bufferedImage = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);  // ①
            Graphics2D g = bufferedImage.createGraphics();  // ②
            g.drawImage(image, 0, 0, width,height,null);  // ③


            g.setComposite( AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, 0.5f) );  // 设置水印透明度
            g.rotate(Math.toRadians(-10), bufferedImage.getWidth()/2, bufferedImage.getHeight()/2);  // 设置水印图片的旋转度

            int x = 20;
            int y = 20;

            int xInterval = width;
            int yInterval = 30;

            double count = 1.5;
            String waterMarkStr = waterMark.getTime()+waterMark.getUserName();
            while ( x < width*count ) {  // 循环添加多个水印 logo
                y = -height / 2;
                while( y < height*count ) {
                    g.drawString(waterMarkStr, x, y);  // ④
                    y += 50+ yInterval;
                }
                x += 50 + xInterval;
            }

            g.dispose();

            os = new FileOutputStream(realUploadPath + "/" + imgWithWatermarkFileName);
            JPEGImageEncoder en = JPEGCodec.createJPEGEncoder(os); // ⑤
            en.encode(bufferedImage); // ⑥

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return uploadPath + "/" + imgWithWatermarkFileName;
    }
}
