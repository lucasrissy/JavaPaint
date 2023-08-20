package org.academiadecodigo.nanderthals.operations;

import org.academiadecodigo.nanderthals.Cursor;
import org.academiadecodigo.nanderthals.Inicialize;
import org.academiadecodigo.nanderthals.RectFactory;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class Delete implements Inicialize {

    private Cursor cursor;

    private void delete() {
        for (int i = 0; i < RectFactory.getListRectangle().size(); i++) {
            if (RectFactory.getListRectangle().get(i).getY() == cursor.getCursor().getY() && RectFactory.getListRectangle().get(i).getX() == cursor.getCursor().getX()) {
                RectFactory.getListRectangle().get(i).delete();
                RectFactory.getListRectangle().get(i).setColor(Color.RED);
                RectFactory.getListRectangle().get(i).draw();
                RectFactory.getListRectangle().remove(RectFactory.getListRectangle().get(i));
                System.out.println("here");
            }
        }
    }

    @Override
    public void init() {
        System.out.println("HERE");
       delete();

    }
}
