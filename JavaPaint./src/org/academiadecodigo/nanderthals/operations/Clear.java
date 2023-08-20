package org.academiadecodigo.nanderthals.operations;

import org.academiadecodigo.nanderthals.Cursor;
import org.academiadecodigo.nanderthals.Inicialize;
import org.academiadecodigo.nanderthals.RectFactory;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;



public class Clear implements Inicialize {


    @Override
    public void init() {
        clearAll();
    }
    private void clearAll() {
        for (int i = 0; i < RectFactory.getListRectangle().size(); i++) {
            Rectangle rect = RectFactory.getListRectangle().get(i);
            rect.setColor(Color.BLACK);
            rect.draw();
            rect.delete();
        }
        RectFactory.getListRectangle().removeAll(RectFactory.getListRectangle());
    }

}
