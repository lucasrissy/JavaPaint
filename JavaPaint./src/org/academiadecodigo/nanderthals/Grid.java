package org.academiadecodigo.nanderthals;

import org.academiadecodigo.simplegraphics.graphics.Line;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public abstract class Grid {

    private static int width,heigth;
    private static  Rectangle rect;

    public static void inicializeGrid (){
        width = 600;
        heigth = 600;
        rect = new Rectangle(0,0,width,heigth);
        rect.draw();
        createGrid();
    }

    public static void createGrid(){
        for(int i = 0; i < 600; i+= 15){
            Line linex = new Line(i,0,i,width);
            linex.draw();
            Line liney = new Line(0,i,heigth,i);
            liney.draw();
        }
    }

    public static Rectangle getRect() {
        return rect;
    }

}
