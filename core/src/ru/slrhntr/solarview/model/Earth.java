package ru.slrhntr.solarview.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import ru.slrhntr.solarview.control.VectorEarth;

public class Earth extends Object {

    private VectorEarth vectorEarth;
                public Earth(Texture texture,float x, float r) {
        super(texture, x, r);
        vectorEarth = new VectorEarth(bounds);
    }
    @Override
    public void draw(SpriteBatch batch){
        super.draw(batch);
        vectorEarth.vector();
    }


}

