package com.gtd;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import utilidades.Render;

public class Juego extends ApplicationAdapter {

	private Texture texturaTierra;

	@Override
	public void create() {
		texturaTierra = new Texture(Gdx.files.internal("PORTADA - copia.jpg"));
	}



	@Override
	public void render() {
		ScreenUtils.clear(1, 0, 0, 1);
		Render.spriteBatch.begin();
		Render.spriteBatch.draw(texturaTierra, 300f, 150f);
		Render.spriteBatch.end();
	}
	
	@Override
	public void dispose() {

	}
}
