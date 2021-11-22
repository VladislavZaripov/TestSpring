package server.service;

import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import java.awt.image.BufferedImage;
import java.io.*;

@Service
public class ImageServiceImpl implements ImageService {
    @Override
    public void saveImage(String imageName, HttpServletRequest request) throws IOException{
        File file = new File("C://Users/zarip/Desktop/ImageSpring/" + imageName);
        InputStream inputStream = request.getInputStream();
        BufferedImage image = ImageIO.read(inputStream);
        OutputStream outputStream = new FileOutputStream(file);
        ImageIO.write(image,"png",outputStream);
        inputStream.close();
        outputStream.close();
    }

    @Override
    public byte[] loadImage(String imageName) throws IOException {
        File file = new File("C://Users/zarip/Desktop/ImageSpring/" + imageName);
        BufferedImage image = ImageIO.read(file);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(image, "png", baos);
        baos.flush();
        byte[] imageInByte = baos.toByteArray();
        baos.close();
        return imageInByte;
    }
}
