package org.academiadecodigo.nanderthals.moviments;

import org.academiadecodigo.nanderthals.Cursor;
import org.academiadecodigo.nanderthals.Inicialize;
import org.academiadecodigo.nanderthals.operations.Paint;

public class MoveUp implements Inicialize {


    @Override
    public void init() {
        if (Cursor.getPositionX()> 0){
            Cursor.getCursor().translate(0, -15);
            Cursor.setPositionX(Cursor.getPositionX() - 15);
        }
    }

}
