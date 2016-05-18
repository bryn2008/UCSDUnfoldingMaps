package guimodule;

import processing.core.*;

public class MyDisplay extends PApplet{

    PImage img;

    public void draw(){
        img = loadImage("palmTrees.jpg","jpg");
        size(600,500);
        img.resize(0, height);
        image(img,0,0);

        ellipse(width/4, height/4, width/5, height/5);

    }

}
