package org.academiadecodigo.nanderthals.moviments;

import org.academiadecodigo.nanderthals.Cursor;
import org.academiadecodigo.nanderthals.Inicialize;

public class MoveLeft implements Inicialize {

    @Override
    public void init() {
        if (Cursor.getPositionY() > 0){
          Cursor.getCursor().translate(-15, 0);
          Cursor.setPositionY(Cursor.getPositionY() - 15);
        }
    }
}
