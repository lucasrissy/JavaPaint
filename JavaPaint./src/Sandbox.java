import org.academiadecodigo.nanderthals.Cursor;
import org.academiadecodigo.nanderthals.Grid;
import org.academiadecodigo.nanderthals.operations.Movement;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.util.ArrayList;

public class Sandbox {
    public static void main(String[] args) {
        ArrayList<Rectangle> list = new ArrayList<>();
        Movement movement = new Movement();
        Grid.inicializeGrid();
        Cursor.initCursor();
    }

}
