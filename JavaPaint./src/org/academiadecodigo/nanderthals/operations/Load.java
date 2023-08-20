package org.academiadecodigo.nanderthals.operations;

import org.academiadecodigo.nanderthals.Cursor;
import org.academiadecodigo.nanderthals.Inicialize;
import org.academiadecodigo.nanderthals.RectFactory;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Load implements Inicialize {

    private Cursor cursor;

    @Override
    public void init()  {
        try {
            load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void load() throws IOException {

        for (int i = 0; i < RectFactory.getListRectangle().size(); i++){
            RectFactory.getListRectangle().get(i).delete();
        }

        RectFactory.getListRectangle().clear();
        String line;

        try {
            BufferedReader bReader = new BufferedReader(new FileReader("paint/file.txt"));
            while (( line = bReader.readLine()) != null){
                String[] array = line.split(" ");

                for (String str : array){
                    String[] array2 = str.split(":");
                    int x = Integer.parseInt(array2[0]);
                    int y = Integer.parseInt(array2[1]);

                    Rectangle rect = new Rectangle(x,y, cursor.getCursor().getWidth(), cursor.getCursor().getHeight());
                    rect.setColor(Color.RED);
                    rect.fill();

                    RectFactory.getListRectangle().add(rect);
                }

            }
            bReader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }


}
