package org.svaarg.problemsolving.leetcode;

// Author : Umang J Gala
// Date   : 05-Jan-2019

import org.junit.runners.Parameterized;
import org.svaarg.problemsolving.TestHelper;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Scanner;

import static org.junit.Assert.assertArrayEquals;

/**
 * Class: TwoSumTest
 *
 * @author Umang J Gala
 */
@org.junit.runner.RunWith(Parameterized.class)
public class TwoSumTest {

  @Parameterized.Parameters(name="array/TwoSumTest - Test: {index}")
  public static Collection<Object[]> data() {
    String directoryPath = System.getProperty("testFilesRootDirectory");
    directoryPath += "leetcode/twosum/";
    return TestHelper.getTestCases(new File(directoryPath));
  }

  @Parameterized.Parameter() public File inputFile;

  @Parameterized.Parameter(1) public File outputFile;

  private TwoSum object;
  private Scanner input, output;

  @org.junit.Before public void beforeTest() {
    try {
      object = new TwoSum();
      input = new Scanner(inputFile);
      output = new Scanner(outputFile);
    } catch (FileNotFoundException fileNotFoundException) {
      System.err.println("File not found: " + inputFile);
    }
  }

  @org.junit.Test public void twoSumTest() {
    int noOfElements = input.nextInt();
    int target = input.nextInt();
    int[] inputElements = new int[noOfElements];
    for (int index = 0; index < noOfElements; index++) {
      inputElements[index] = input.nextInt();
    }

    int[] outputElements = new int[2];
    outputElements[0] = output.nextInt();
    outputElements[1] = output.nextInt();

    assertArrayEquals(outputElements, object.twoSum(inputElements, target));
  }

  @org.junit.After public void afterTest() {
    input.close();
    output.close();
  }
}
