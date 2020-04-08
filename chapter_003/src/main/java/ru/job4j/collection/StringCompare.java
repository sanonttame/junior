package ru.job4j.collection;

import java.util.Comparator;

/**
 * String comparator
 * @author Anton
 * @version 0.2
 */
public class StringCompare implements Comparator<String> {

    /**
     * new compare()
     * @param left,right left right
     * @return -1,0 or 1 (left < right, left == right, left > right)
     */
    @Override
    public int compare(String left, String right) {
        int rslt = 0;
        int minLenght = Math.min(left.length(), right.length());
        for (int i = 0; i < minLenght; i++) {
              if (left.charAt(i) != right.charAt(i)) {
                  rslt =  Character.compare(left.charAt(i), right.charAt(i));
                  break;
              } else if (rslt == 0) {
                  rslt = Integer.compare(left.length(), right.length());
              }
          }

      return rslt;
    }
}

