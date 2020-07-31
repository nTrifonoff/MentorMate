package com.company.matchers;

import com.company.dto.Matrix;
import com.company.interfaces.IMatrixMatcher;
import com.company.utils.Utils;

import java.util.Arrays;

public class MainMatrixMatcher implements IMatrixMatcher {

  private final RedMatcher redMatcher;
  private final GreenMatcher greenMatcher;
  private int count;

  /**
   * Creates an instance of the MainMatrixMatcher class
   */
  public MainMatrixMatcher() {
    this.redMatcher = new RedMatcher();
    this.greenMatcher = new GreenMatcher();
  }

  /**
   * @see IMatrixMatcher#getResults(Matrix)
   */
  public int getResults(Matrix matrixDto) {
    int[][] matrix = Utils.populateMatrix(matrixDto.getWidth(), matrixDto.getHeight());

    for (int i = matrixDto.getNumberOfIterations(); i > 0; i--) {
      processIteration(matrix, matrixDto.getRow(), matrixDto.getColumn());
    }

    return count;
  }

  /**
   * Process iteration of the game.
   *
   * @param matrix -> current working matrix
   * @param cellRow -> row from which we could get the cell
   * @param cellColumn -> column from which we could get the cell
   */
  private void processIteration(int[][] matrix, int cellRow, int cellColumn) {
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        String rowStr = Arrays.toString(matrix[row]);

        if (matrix[row][col] == 1) {
          matrix[row][col] = greenMatcher.processRow(rowStr);
        } else {
          matrix[row][col] = redMatcher.processRow(rowStr);
        }

      }
    }

    if (matrix[cellRow][cellColumn] == 1) {
      count++;
    }
  }

}
