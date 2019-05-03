package org.svaarg.problemsolving.dynamic;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.svaarg.problemsolving.TestHelper;

import java.io.File;
import java.util.Collection;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * Class: NoThreeTest
 *
 * @author Umang J Gala
 */
@RunWith(Parameterized.class)
public class NoThreeTest {

  @Parameterized.Parameters(name = "dynamic/NoThreeTest - Test: {index}")
  public static Collection<Object[]> data() {
    String directoryPath = System.getProperty("testFilesRootDirectory");
    directoryPath += "dynamic/nothree/";
    return TestHelper.getTestCases(new File(directoryPath));
  }

  @Parameter
  public File inputFile;

  @Parameter(1)
  public File outputFile;

  private Scanner input, output;

  @org.junit.Before
  public void setUp() throws Exception {
    input = new Scanner(inputFile);
    output = new Scanner(outputFile);
  }

  @org.junit.Test
  public void maxSumWithNoThreeConsecutiveElementTest() throws Exception {
    int noOfElements = input.nextInt();
    int[] inputSequence = new int[noOfElements];
    int expectedOutput = output.nextInt();
    for (int index = 0; index < noOfElements; index++) {
      inputSequence[index] = input.nextInt();
    }
    NoThree object = new NoThree();
    assertEquals(expectedOutput,
            object.maximumSumWithNoThreeConsecutiveElement(inputSequence));
  }

  @org.junit.After
  public void tearDown() throws Exception {
    input.close();
    output.close();
  }
}
