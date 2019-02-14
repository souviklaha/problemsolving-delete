package org.svaarg.problemsolving.array;

import org.junit.runners.Parameterized;
import org.svaarg.problemsolving.TestHelper;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Scanner;

import static org.junit.Assert.assertArrayEquals;

/**
 * Class: ReversePositiveNumbersTest
 *
 * @author    Umang J Gala
 */
@org.junit.runner.RunWith(Parameterized.class)
public class ReversePositiveNumbersTest {

  @Parameterized.Parameters(name="array/ReversePositiveNumbersTest - Test: {index}")
  public static Collection<Object[]> data() {
    String directoryPath = System.getProperty("testFilesRootDirectory");
    directoryPath += "array/reversepositivenumbers/";
    return TestHelper.getTestCases(new File(directoryPath));
  }

  @Parameterized.Parameter() public File inputFile;

  @Parameterized.Parameter(1) public File outputFile;

  private ReversePositiveNumbers object;
  private Scanner input, output;

  @org.junit.Before public void beforeTest() {
    try {
      object = new ReversePositiveNumbers();
      input = new Scanner(inputFile);
      output = new Scanner(outputFile);
    } catch (FileNotFoundException fileNotFoundException) {
      System.err.println("File not found: " + inputFile);
    }
  }

  @org.junit.After public void afterTest() {
    input.close();
    output.close();
  }

  @org.junit.Test public void reversePositiveNosTest() {
    int noOfElements = input.nextInt();
    int[] inputElements = new int[noOfElements];
    int[] outputElements = new int[noOfElements];
    for (int index = 0; index < noOfElements; index++) {
      inputElements[index] = input.nextInt();
      outputElements[index] = output.nextInt();
    }

    object.reversePositiveNos(inputElements);

    assertArrayEquals(outputElements, inputElements);
  }

}