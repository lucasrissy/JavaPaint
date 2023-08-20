package org.academiadecodigo.nanderthals.operations;

import org.academiadecodigo.nanderthals.Inicialize;
import org.academiadecodigo.nanderthals.RectFactory;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Save implements Inicialize {


    @Override
    public void init() {
        save();
    }
    private void save() {
        String string = "";

        for (int i = 0; i < RectFactory.getListRectangle().size(); i++){
            string += RectFactory.getListRectangle().get(i).getX() +
                    ":" + RectFactory.getListRectangle().get(i).getY()+" ";
        }
        try {
            System.out.println(string);
            System.out.println("here");
            BufferedWriter bWrite = new BufferedWriter(new FileWriter("paint/file.txt"));
            bWrite.write(string);
            bWrite.flush();
            bWrite.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
