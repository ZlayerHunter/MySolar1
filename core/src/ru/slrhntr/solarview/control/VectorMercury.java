package ru.slrhntr.solarview.control;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Polygon;
import ru.slrhntr.solarview.view.GameScreen;

public class VectorMercury {
    private Polygon mercuryBounds;
    public VectorMercury(Polygon mercuryBounds){
        this.mercuryBounds = mercuryBounds;

    }
    public void vector(){
        mercuryBounds.rotate(-1.3f);
        float c = MathUtils.cosDeg(mercuryBounds.getRotation());
        float s = MathUtils.sinDeg(mercuryBounds.getRotation());
        mercuryBounds.setPosition(   mercuryBounds.getOriginX()-15+ GameScreen.mercurydx*c*GameScreen.speed,
                                     mercuryBounds.getOriginY()-15+ GameScreen.mercurydx*2*s*GameScreen.speed);

    }

}
