package org.academiadecodigo.nanderthals;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.util.ArrayList;

public abstract class RectFactory {
    private static ArrayList<Rectangle> listRectangle = new ArrayList<>();

    public static ArrayList<Rectangle> getListRectangle() {
        return listRectangle;
    }

    public static Rectangle createRectangle (int xPosition, int yPosition, int width, int heigth){
        Rectangle rect = new Rectangle(xPosition,yPosition,width,heigth);
        return rect;
    }

    public static void addRectangle(Rectangle rectangle){
         listRectangle.add(rectangle);
         System.out.println(listRectangle.size());
    }



}
