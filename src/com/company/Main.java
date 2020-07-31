package com.company;

import com.company.dto.Matrix;
import com.company.interfaces.IMatrixMatcher;
import com.company.matchers.MainMatrixMatcher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  private static final IMatrixMatcher matcher = new MainMatrixMatcher();

  public static void main(String[] args) throws IOException {
    //Enter data using BufferReader
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String[] input = reader.readLine().split("\\s*,\\s*");
    int width = Integer.parseInt(input[0]);
    int height = Integer.parseInt(input[1]);

    if (width > height || height > width || height >= 1000 || width <= 0) {
      System.out.println("Wrong Input!");
      return;
    }

    String[] secondInput = reader.readLine().split("\\s*,\\s*");
    int cellRow = Integer.parseInt(secondInput[0]);
    int cellNumber = Integer.parseInt(secondInput[1]);
    int numberOfIterations = Integer.parseInt(secondInput[2]);

    Matrix matrixDto = new Matrix(width, height, cellRow, cellNumber, numberOfIterations);

    int resultCount = matcher.getResults(matrixDto);

    System.out.println("Result: " + resultCount);
  }
}
