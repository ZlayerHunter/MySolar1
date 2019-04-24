package ru.slrhntr.solarview.control;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Polygon;

import ru.slrhntr.solarview.model.Earth;
import ru.slrhntr.solarview.view.GameScreen;


public class VectorMoon {
    private Polygon moonBounds;
    public VectorMoon(Polygon moonBounds){
        this.moonBounds = moonBounds;

    }

        public void vector(){
        moonBounds.rotate(4f);
        float c = GameScreen.moondx*MathUtils.cosDeg(moonBounds.getRotation()*GameScreen.speed);
        float s = GameScreen.moondx*MathUtils.sinDeg(moonBounds.getRotation()*GameScreen.speed);
        float x = moonBounds.getOriginX();
        float y = moonBounds.getOriginY();
        float xe = VectorEarth.earthx;
        float ye = VectorEarth.earthy;
        moonBounds.setPosition(xe-x+c,ye-y+s);


    }

}
