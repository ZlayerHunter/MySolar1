package ru.slrhntr.solarview.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import ru.slrhntr.solarview.Main;
import ru.slrhntr.solarview.utils.Constant;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.height = Constant.APP_HEIGHT;
		config.width = Constant.APP_WIDHT;

		new LwjglApplication(new Main(), config);
	}
}
