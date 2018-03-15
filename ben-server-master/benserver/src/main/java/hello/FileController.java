/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ben
 */
@RestController
public class FileController {

    @RequestMapping(value = "dog.jpg", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
    public void getJPEG(HttpServletResponse response) throws IOException {

        ClassPathResource imgFile = new ClassPathResource("image/dog.jpg");

        response.setContentType(MediaType.IMAGE_JPEG_VALUE);
        StreamUtils.copy(imgFile.getInputStream(), response.getOutputStream());
    }

    @RequestMapping(value = "cat.png", method = RequestMethod.GET, produces = MediaType.IMAGE_PNG_VALUE)
    public void getPNG(HttpServletResponse response) throws IOException {

        ClassPathResource imgFile = new ClassPathResource("image/cat.png");

        response.setContentType(MediaType.IMAGE_PNG_VALUE);
        StreamUtils.copy(imgFile.getInputStream(), response.getOutputStream());
    }

    @RequestMapping(value = "icon.ico", method = RequestMethod.GET)
    public void getICO(HttpServletResponse response) throws IOException {

        ClassPathResource imgFile = new ClassPathResource("image/icon.ico");

        response.setContentType(MediaType.IMAGE_PNG_VALUE);
        StreamUtils.copy(imgFile.getInputStream(), response.getOutputStream());
    }
}
