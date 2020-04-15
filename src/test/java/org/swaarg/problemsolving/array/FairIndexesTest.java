package org.swaarg.problemsolving.array;

import org.junit.runners.Parameterized;
import org.swaarg.problemsolving.TestHelper;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * Class: FairIndexesTest
 *
 * @author Umang J Gala
 */
@org.junit.runner.RunWith(Parameterized.class)
public class FairIndexesTest {
  @Parameterized.Parameters(name = "array/FairIndexesTest - Test: {index}")
  public static Collection<Object[]> data() {
    String directoryPath = System.getProperty("testFilesRootDirectory");
    directoryPath += "array/fairindexes/";
    return TestHelper.getTestCases(new File(directoryPath));
  }

  @Parameterized.Parameter()
  public File inputFile;

  @Parameterized.Parameter(1)
  public File outputFile;

  private FairIndexes object;
  private Scanner input, output;

  @org.junit.Before
  public void beforeTest() {
    try {
      object = new FairIndexes();
      input = new Scanner(inputFile);
      output = new Scanner(outputFile);
    } catch (FileNotFoundException fileNotFoundException) {
      System.err.println("File not found: " + inputFile);
    }
  }

  @org.junit.Test
  public void fairIndexesTest() {
    int noOfElements = input.nextInt();
    int[] arrayOne = new int[noOfElements];
    for (int index = 0; index < noOfElements; index++) {
      arrayOne[index] = input.nextInt();
    }
    int[] arrayTwo = new int[noOfElements];
    for (int index = 0; index < noOfElements; index++) {
      arrayTwo[index] = input.nextInt();
    }

    int noOfFairIndexes = output.nextInt();

    assertEquals(noOfFairIndexes, object.fairIndexes(arrayOne, arrayTwo, noOfElements));
  }

  @org.junit.After
  public void afterTest() {
    input.close();
    output.close();
  }
}
