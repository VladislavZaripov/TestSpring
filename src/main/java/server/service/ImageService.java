package server.service;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public interface ImageService{

    void saveImage(String imageName, HttpServletRequest request) throws IOException;

    byte[] loadImage(String imageName) throws IOException;
}
