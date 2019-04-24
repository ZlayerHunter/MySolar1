package ru.slrhntr.solarview.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Polygon;

import ru.slrhntr.solarview.utils.Constant;
import ru.slrhntr.solarview.view.GameScreen;

public abstract class Object {

    Sprite object;
    Polygon bounds;

    float xx = Constant.APP_WIDHT/2;
    float yy = Constant.APP_HEIGHT/2;

        Object(Texture texture,float x, float r){
            object = new Sprite(texture);
            object.setSize(r,r);
            object.setOriginCenter();

            bounds = new Polygon(new float[]{0f,0f,r,0f,r,r,0f,r});
        }

    void draw(SpriteBatch batch){
            object.setPosition(bounds.getX(),bounds.getY());
            object.setRotation(bounds.getRotation());
            object.draw(batch);

    }

    public Polygon getBounds(){
           return bounds ;}

}





