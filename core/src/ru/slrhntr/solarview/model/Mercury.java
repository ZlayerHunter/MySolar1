package ru.slrhntr.solarview.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import ru.slrhntr.solarview.control.VectorMercury;

public class Mercury extends Object {
    private VectorMercury vectorMercury;
    public Mercury(Texture texture, float x, float r) {
        super(texture, x, r);
        vectorMercury = new VectorMercury(bounds);
    }
    @Override
    public void draw(SpriteBatch batch){
        super.draw(batch);
       vectorMercury.vector();
    }


}

