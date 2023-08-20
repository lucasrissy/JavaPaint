package org.academiadecodigo.nanderthals.operations;

import org.academiadecodigo.nanderthals.Inicialize;
import org.academiadecodigo.nanderthals.moviments.MoveDown;
import org.academiadecodigo.nanderthals.moviments.MoveLeft;
import org.academiadecodigo.nanderthals.moviments.MoveRigth;
import org.academiadecodigo.nanderthals.moviments.MoveUp;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;

public enum Operations {
    UP (KeyboardEvent.KEY_UP,new MoveUp()),
    DOWN(KeyboardEvent.KEY_DOWN,new MoveDown()),
    RIGHT(KeyboardEvent.KEY_RIGHT,new MoveRigth()),
    LEFT(KeyboardEvent.KEY_LEFT,new MoveLeft()),
    PAINT(KeyboardEvent.KEY_SPACE,new Paint()),
    SAVE(KeyboardEvent.KEY_S,new Save()),
    LOAD(KeyboardEvent.KEY_L,new Load()),
    CLEAR(KeyboardEvent.KEY_C,new Clear()),
    DELETE(KeyboardEvent.KEY_D,new Delete());

    private  int i;
    private Inicialize inicialize;


    Operations(int i, Inicialize inicialize) {
        this.i = i;
        this.inicialize = inicialize;
    }
    public static void Command (int value){
        for (Operations operations : values()){
            if (operations.i == value){
                operations.inicialize.init();
            }
        }
    }
}
