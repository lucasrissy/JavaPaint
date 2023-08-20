package org.academiadecodigo.nanderthals.operations;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;

public class Movement implements KeyboardHandler {

    ;
    private Keyboard key;


    public Movement() {
        key = new Keyboard(this);
        addKeyBoard();
    }

    public void addKeyBoard() {

        KeyboardEvent moveRight = new KeyboardEvent();
        KeyboardEvent moveLeft = new KeyboardEvent();
        KeyboardEvent moveDown = new KeyboardEvent();
        KeyboardEvent moveUp = new KeyboardEvent();
        KeyboardEvent paint = new KeyboardEvent();
        KeyboardEvent delete = new KeyboardEvent();
        KeyboardEvent clearAll = new KeyboardEvent();
        KeyboardEvent load = new KeyboardEvent();
        KeyboardEvent save = new KeyboardEvent();


        moveRight.setKey(39);
        moveLeft.setKey(37);
        moveDown.setKey(40);
        moveUp.setKey(38);
        paint.setKey(32);
        delete.setKey(68);
        clearAll.setKey(67);
        load.setKey(76);
        save.setKey(83);

        moveRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        key.addEventListener(moveRight);
        moveLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        key.addEventListener(moveLeft);
        moveDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        key.addEventListener(moveDown);
        moveUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        key.addEventListener(moveUp);
        paint.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        key.addEventListener(paint);
        delete.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        key.addEventListener(delete);
        clearAll.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        key.addEventListener(clearAll);
        load.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        key.addEventListener(load);
        save.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        key.addEventListener(save);
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        Operations.Command(keyboardEvent.getKey());
    }


    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}

