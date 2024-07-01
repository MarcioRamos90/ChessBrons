package com.chess.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.utils.ScreenUtils;

public class Game extends ApplicationAdapter {
	Board board;

	@Override
	public void create () {
		board = new Board();
		board.create();
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 1,1, 1);
		board.render();
	}
}
