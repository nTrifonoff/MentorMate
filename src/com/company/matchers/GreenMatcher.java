package com.company.matchers;


import com.company.interfaces.IMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreenMatcher implements IMatcher {

  /**
   * @see IMatcher#processRow(String)
   */
  @Override
  public int processRow(String row) {
    Pattern pattern1 = Pattern.compile("(0{6}10{6})");
    Pattern pattern2 = Pattern.compile("(0{3}10{3})");
    Matcher matcher1 = pattern1.matcher(row);
    Matcher matcher2 = pattern2.matcher(row);

    boolean result = matcher1.find() || matcher2.find();

    return result ? 1 : 0;
  }

}
