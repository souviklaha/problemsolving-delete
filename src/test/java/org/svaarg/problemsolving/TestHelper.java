package org.svaarg.problemsolving;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Class: TestHelper
 *
 * @author Umang J Gala
 */
public class TestHelper {
  public static Collection<Object[]> getTestCases(File directory) {
    Collection<Object[]> testCases = new ArrayList<>();
    for (File file : directory.listFiles()) {
      if (file.getName().endsWith(".in")) {
        testCases.add(new Object[]{
                new File(file.getAbsolutePath()),
                new File(file.getAbsolutePath().replace(".in", ".out"))
        });
      }
    }
    return testCases;
  }
}
