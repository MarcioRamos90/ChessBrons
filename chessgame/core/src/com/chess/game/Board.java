package com.chess.game;

import com.badlogic.gdx.graphics.Color;
public class Board {
    CellHouse[][] board;

    void create() {
        board = new CellHouse[8][8];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = new CellHouse();
                board[i][j].create();
            }
        }
    }

    void render() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if ((i + j) % 2 == 0) {
                    Color color = new Color(1f,1f,0f,1f);
                    board[i][j].setColor(color);
                } else {
                    Color color = new Color(1f,0f,0f,1f);

                    board[i][j].setColor(color);
                }
                board[i][j].setY(i * 100);
                board[i][j].setX(j * 100);
                board[i][j].render();
            }
        }
    }
}
