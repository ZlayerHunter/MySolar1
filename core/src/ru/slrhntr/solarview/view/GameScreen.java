package ru.slrhntr.solarview.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

import ru.slrhntr.solarview.model.Earth;
import ru.slrhntr.solarview.model.Mercury;
import ru.slrhntr.solarview.model.Moon;
import ru.slrhntr.solarview.model.Sun;

public class GameScreen implements Screen{
	private SpriteBatch batch;
	private Texture backgroundTexture;
	private Texture earthTexture;
	private Texture mercuryTexture;
	private Texture moonTexture;
	private Earth earth;
	private Sun sun;
	private Mercury mercury;
	private Moon moon;
	private OrthographicCamera camera;
	public static float dt, earthdx = 160,mercurydx = 80, moondx = 50;
	public static float earthr=40,mercuryr=30;
	public static float speed;
	boolean Move = false;

	Texture buttonTexture;
	Sprite buttonSprite;
	Vector3 temp = new Vector3();

	void pressButton (){
		// Проверяем были ли касание по экрану?
		if(Gdx.input.justTouched()) {
			// Получаем координаты касания и устанавливаем эти значения в временный вектор
			temp.set(Gdx.input.getX(),Gdx.input.getY(),0);
			// получаем координаты касания относительно области просмотра нашей камеры
			camera.unproject(temp);
			float touchX = temp.x;
			float touchY= temp.y;
			// обработка касания по кнопке Stare
			if ((touchX>=-25) && touchX<= (25) && (touchY>=-350) && touchY<=(-300) ){
				speed = 0;
				Move = false;
			}
			else speed = 1;


			}
            }


	public void show() {
		batch = new SpriteBatch();
		backgroundTexture = new Texture("background2.jpg");
		earthTexture = new Texture("earth.png");
		mercuryTexture = new Texture("mercury.png");
		moonTexture = new Texture("moon.png");
		earth = new Earth(earthTexture,earthdx,earthr);
		mercury = new Mercury(mercuryTexture,mercurydx,mercuryr);
		moon = new Moon(moonTexture,moondx,20f);
		sun = new Sun();
		buttonTexture = new Texture("button.png");
		buttonSprite = new Sprite(buttonTexture);
		buttonSprite.setSize(50,50);
		buttonSprite.setPosition(-25,-350);
		pressButton ();
	}



	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0,0,0,0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.setProjectionMatrix(camera.combined);
		batch.draw(backgroundTexture,-Gdx.graphics.getWidth()/2,-Gdx.graphics.getHeight()/2);
		batch.draw(sun.getSun(),sun.getPosition().x,sun.getPosition().y,60,60);
		earth.draw(batch);
		mercury.draw(batch);
		moon.draw(batch);
		buttonSprite.draw(batch);
		pressButton();
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
		float aspectRatio = (float) height / width;
		camera = new OrthographicCamera(width,height);
		camera.update();

	}

	@Override
	public void pause() {


	}

	@Override
	public void resume() {

	}

	@Override
	public void hide() {

	}

	@Override
	public void dispose() {
		backgroundTexture.dispose();
		batch.dispose();
		earthTexture.dispose();
		mercuryTexture.dispose();
		moonTexture.dispose();
		buttonTexture.dispose();
	}
}