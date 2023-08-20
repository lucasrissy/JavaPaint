package org.academiadecodigo.nanderthals.operations;

import org.academiadecodigo.nanderthals.Cursor;
import org.academiadecodigo.nanderthals.Inicialize;
import org.academiadecodigo.nanderthals.RectFactory;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.util.ArrayList;


public class Paint implements Inicialize {

    private Cursor cursor;

    private void paint() {
        Rectangle rect = RectFactory.createRectangle(cursor.getCursor().getX(), cursor.getCursor().getY(), cursor.getCursor().getWidth(), cursor.getCursor().getHeight());

        rect.setColor(Color.RED);
        rect.draw();
        rect.fill();
        RectFactory.addRectangle(rect);
    }

    @Override
    public void init() {
        paint();
    }

}

