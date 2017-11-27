package com.dcruzee.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.dcruzee.game.FlappySetings;

public class DesktopLauncher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width = FlappySetings.WIDTH;
        config.height = FlappySetings.HEIGHT;
        config.title = FlappySetings.TITLE;
        config.resizable = false;
        new LwjglApplication(new FlappySetings(), config);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[0].length; j++)
                arr[i][j] = 1;
        arr[0][1] = 0;


        printarr(unique(arr));
    }

    public static int[][] unique(int[][] arr) {
        int[][] temp = new int[arr.length][arr[0].length];
        for (int i = 0; i < temp.length; i++)
            for (int j = 0; j < temp[0].length; j++)
                temp[i][j] = 1;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    System.out.println("0 at " + i + "x" + j);
                    for (int k = 0; k < arr[i].length; k++)
                        temp[i][k] = 0;
                    for (int k = 0; k < arr.length; k++)
                        temp[k][j] = 0;
                }
            }

        return temp;
    }

    public static void printarr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j]);
            System.out.println();

        }

    }
}
