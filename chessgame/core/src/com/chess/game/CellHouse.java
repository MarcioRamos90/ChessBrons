package com.chess.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class CellHouse {
    float x = 0;
    float y = 0;
    float width = 100;
    float height = 100;

    Color color;

    ShapeRenderer shape;
    ShapeRenderer line;

    public void create () {
        shape = new ShapeRenderer();
        line = new ShapeRenderer();
    }

    public void render() {
        line.begin(ShapeRenderer.ShapeType.Line);
        line.rect(x,y,100,100);
        line.setColor(1f,1f,1f,1f);
        line.end();

        shape.begin(ShapeRenderer.ShapeType.Filled);
        shape.rect(x,y,100,100);
        shape.setColor(color);
        shape.end();
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
