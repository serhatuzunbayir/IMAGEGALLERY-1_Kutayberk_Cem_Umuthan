package com.gallery;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.*;

public class Images {
    public static void main(String[] args) {
        ImageFrame frame = new ImageFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class ImageFrame extends JFrame {
    public ImageFrame() {
        setTitle("Image Gallery");
        setSize(1280, 1024);

        ImageComponent component = new ImageComponent();
        add(component);
    }
}

class ImageComponent extends JComponent {
    public ImageComponent() {
        // acquire the image
        try {
            image[0] = ImageIO.read(new File("/Users/Paul/IdeaProjects/GUI/ImageGallery/v8.png"));
            image[1] = ImageIO.read(new File("/Users/Paul/IdeaProjects/GUI/ImageGallery/asyncawait.png"));
            image[2] = ImageIO.read(new File("/Users/Paul/IdeaProjects/GUI/ImageGallery/mixed.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void paintComponent(Graphics g) {
        if (image == null) return;

        int imageWidth = image[0].getWidth(this);
        int imageHeight = image[0].getHeight(this);
        // draw the image in the upper-left corner

        g.drawImage(image[1], 0, 0, 400, 300, null);
        g.drawImage(image[0], 400, 0, 400, 350, null);
        g.drawImage(image[2], 800, 0, 400, 350, null);


    }

    private Image[] image = new Image[3];
    ;
}
