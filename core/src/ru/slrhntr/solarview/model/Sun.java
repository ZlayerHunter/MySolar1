package ru.slrhntr.solarview.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Circle;

public class Sun {

    private Texture textureSun;
    private Circle bounds;

    public Sun (){
        bounds = new Circle(-30,-30,60);
        textureSun = new Texture("sunsun.png");
    }
    public Circle getPosition(){
        return bounds;
    }
    public Texture getSun(){return textureSun;}
}




