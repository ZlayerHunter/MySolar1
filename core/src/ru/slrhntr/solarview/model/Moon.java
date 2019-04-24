package ru.slrhntr.solarview.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import ru.slrhntr.solarview.control.VectorMoon;

public class Moon extends Object {
    private VectorMoon vectorMoon;
    public Moon(Texture texture, float x, float r) {
        super(texture, x, r);
        vectorMoon = new VectorMoon(bounds);
    }
    @Override
    public void draw(SpriteBatch batch){
        super.draw(batch);
        vectorMoon.vector();
    }


}