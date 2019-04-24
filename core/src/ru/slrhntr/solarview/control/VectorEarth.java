package ru.slrhntr.solarview.control;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Polygon;

import ru.slrhntr.solarview.model.Earth;
import ru.slrhntr.solarview.view.GameScreen;

public class VectorEarth {
    public static float earthx;
    public static float earthy;
    public Polygon earthBounds;
    public VectorEarth(Polygon earthBounds){
        this.earthBounds = earthBounds;


    }

    public void vector(){
        earthBounds.rotate(1f);
        float c = MathUtils.cosDeg(earthBounds.getRotation());
        float s = MathUtils.sinDeg(earthBounds.getRotation());
        earthx = earthBounds.getOriginX()-20+ GameScreen.earthdx*c*GameScreen.speed;
        earthy = earthBounds.getOriginY()-20+ GameScreen.earthdx*2*s*GameScreen.speed;
        earthBounds.setPosition(earthx,earthy);



    }

}
