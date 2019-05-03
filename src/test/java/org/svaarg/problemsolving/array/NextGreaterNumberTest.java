package org.svaarg.problemsolving.array;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.svaarg.problemsolving.TestHelper;

import java.io.File;
import java.util.Collection;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * Class: NextGreaterNumberTest
 *
 * @author Umang J Gala
 */
@RunWith(Parameterized.class)
public class NextGreaterNumberTest {
  @Parameterized.Parameters(name = "array/NextGreaterNumberTest - Test: {index}")
  public static Collection<Object[]> data() {
    String directoryPath = System.getProperty("testFilesRootDirectory");
    directoryPath += "array/nextgreaternumber/";
    return TestHelper.getTestCases(new File(directoryPath));
  }

  @Parameter()
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
  public void nextGreaterNumberTest() {
    Integer number = input.nextInt();
    int expectedOutput = output.nextInt();
    NextGreaterNumber object = new NextGreaterNumber();
    assertEquals(expectedOutput, object.findNext(number.toString().toCharArray()));
  }

  @org.junit.After
  public void tearDown() {
    input.close();
    output.close();
  }
}