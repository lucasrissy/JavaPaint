package org.academiadecodigo.nanderthals;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public abstract class Cursor {

    private static Rectangle cursor;
    private static int positionY = 0;
    private static int positionX = 0;


    public static void initCursor(){
        cursor =new Rectangle(0,0,15,15);
        cursor.draw();
        cursor.fill();
        cursor.setColor(Color.RED);
    }

    public static Rectangle getCursor() {
        return cursor;
    }

    public static int getPositionY() {
        return positionY;
    }

    public static int getPositionX() {
        return positionX;
    }

    public static void setPositionY(int positionY) {
        Cursor.positionY = positionY;
    }

    public static void setPositionX(int positionX) {
        Cursor.positionX = positionX;
    }
}
