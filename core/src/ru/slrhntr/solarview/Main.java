package ru.slrhntr.solarview;

import com.badlogic.gdx.Game;

import ru.slrhntr.solarview.view.GameScreen;


public class Main extends Game {

        @Override
    public void create() {
            setScreen(new GameScreen());

    }
}
