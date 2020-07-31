package com.company.interfaces;

import com.company.dto.Matrix;

public interface IMatrixMatcher {

  /**
   * Get how many times the cell was green.
   *
   * @param matrixDto -> DTO containing all of the need matrix data.
   * @return return number of times the cell was green
   */
  int getResults(Matrix matrixDto);

}
