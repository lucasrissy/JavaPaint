package org.academiadecodigo.nanderthals.moviments;

import org.academiadecodigo.nanderthals.Cursor;
import org.academiadecodigo.nanderthals.Grid;
import org.academiadecodigo.nanderthals.Inicialize;

public class MoveRigth implements Inicialize {

    @Override
    public void init() {
        if (Cursor.getPositionY() < Grid.getRect().getWidth() - Cursor.getCursor().getWidth()){
            Cursor.getCursor().translate(15, 0);
            Cursor.setPositionY(Cursor.getPositionY() + 15);
        }

    }

}
