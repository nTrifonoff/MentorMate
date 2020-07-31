package com.company.dto;

public class Matrix {

  private final int width;
  private final int height;
  private final int row;
  private final int column;
  private final int numberOfIterations;
  private int[][] matrix;

  public Matrix(int width, int height, int row, int column, int numberOfIterations) {
    this.width = width;
    this.height = height;
    this.row = row;
    this.column = column;
    this.numberOfIterations = numberOfIterations;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public int[][] getMatrix() {
    return matrix;
  }

  public void setMatrix(int[][] matrix) {
    this.matrix = matrix;
  }

  public int getRow() {
    return row;
  }

  public int getColumn() {
    return column;
  }

  public int getNumberOfIterations() {
    return numberOfIterations;
  }
}
