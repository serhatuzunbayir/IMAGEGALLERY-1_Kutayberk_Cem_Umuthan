package com.paulraven.imggallery;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by PaulRaven on 5/2/2017.
 */
public class ImgListTest {
    private String image_title;
    private Integer image_id;
    @Test
    public void setImage_title() throws Exception {
        ImgList imgList = new ImgList();
        imgList.setImage_title("Test");
        assertTrue(imgList.getImage_title() == "Test");
    }

    @Test
    public void setImage_id() throws Exception {
        ImgList imgList = new ImgList();
        imgList.setImage_id(3);
        assertTrue(imgList.getImg_ID() == 3);
    }

    @Test
    public void getImage_title() throws Exception {
        ImgList imgList = new ImgList();
        imgList.setImage_title("Test");
        assertTrue(imgList.getImage_title() == "Test");
    }

    @Test
    public void getImg_ID() throws Exception {
        ImgList imgList = new ImgList();
        imgList.setImage_id(3);
        assertTrue(imgList.getImg_ID() == 3);
    }

}