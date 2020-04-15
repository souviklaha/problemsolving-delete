package org.swaarg.problemsolving.array;

import org.junit.runners.Parameterized;
import org.swaarg.problemsolving.TestHelper;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * Class: CountingElementsTest
 *
 * @author Umang J Gala
 */
@org.junit.runner.RunWith(Parameterized.class)
public class CountingElementsTest {

  @Parameterized.Parameters(name = "array/CountElementsTest - Test: {index}")
  public static Collection<Object[]> data() {
    String directoryPath = System.getProperty("testFilesRootDirectory");
    directoryPath += "array/countingelements/";
    return TestHelper.getTestCases(new File(directoryPath));
  }

  @Parameterized.Parameter()
  public File inputFile;

  @Parameterized.Parameter(1)
  public File outputFile;

  private CountingElements object;
  private Scanner input, output;

  @org.junit.Before
  public void beforeTest() {
    try {
      object = new CountingElements();
      input = new Scanner(inputFile);
      output = new Scanner(outputFile);
    } catch (FileNotFoundException fileNotFoundException) {
      System.err.println("File not found: " + inputFile);
    }
  }

  @org.junit.Test
  public void countElementsTest() {
    assertEquals(output.nextInt(),
        object.countElements(Arrays.createIntArray(input.nextLine())));
  }

  @org.junit.After
  public void afterTest() {
    input.close();
    output.close();
  }
}