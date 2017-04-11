package com.gallery;

import javax.swing.*;
import java.awt.*;

class UserLayout extends JFrame {
    public UserLayout(){
        // get screen dimensions
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        System.out.println(screenHeight);
        System.out.println(screenWidth);

        // center frame in screen
        setSize(screenWidth / 2, screenHeight / 2);
        setLocation(screenWidth / 4, screenHeight / 4);
        setTitle("Image Gallery");
        setVisible(true);
    }
}
