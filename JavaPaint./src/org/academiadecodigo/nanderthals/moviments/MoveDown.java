package org.academiadecodigo.nanderthals.moviments;

import org.academiadecodigo.nanderthals.Cursor;
import org.academiadecodigo.nanderthals.Grid;
import org.academiadecodigo.nanderthals.Inicialize;

public class MoveDown implements Inicialize {


    @Override
    public void init() {
        if (Cursor.getPositionX() < Grid.getRect().getHeight() - Cursor.getCursor().getHeight()){
            Cursor.getCursor().translate(0, 15);
            Cursor.setPositionX(Cursor.getPositionX() + 15);
        }
    }

}
