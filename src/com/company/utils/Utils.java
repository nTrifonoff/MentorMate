package com.company.utils;

import java.util.Random;

public class Utils {

  public static int[][] populateMatrix(int width, int height) {
    int[][] matrix = new int[width][height];

    Random rd = new Random();

    for (int row = 0; row < width; row++) {
      for (int col = 0; col < height; col++) {
        matrix[row][col] = rd.nextInt(2);
      }
    }

    return matrix;
  }

  public static void printMatrix(int[][] matrix) {
    for(int i = 0; i < matrix.length; i++) {
      for(int j = 0; j < matrix[i].length; j++) {
        String msg = String.format(" %d ", matrix[i][j]);
        System.out.print(msg);
      }
      System.out.println("\n");
    }
  }

}
