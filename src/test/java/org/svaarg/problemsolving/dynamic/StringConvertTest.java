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
 * Class StringConvertTest
 *
 * @author Umang J Gala
 */
@RunWith(Parameterized.class)
public class StringConvertTest {

  @Parameterized.Parameters(name = "dynamic/StringConvertTest - Test: {index}")
  public static Collection<Object[]> data() {
    String directoryPath = System.getProperty("testFilesRootDirectory");
    directoryPath += "dynamic/stringconvert/";
    return TestHelper.getTestCases(new File(directoryPath));
  }

  @Parameter(0)
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
  public void stringConvertTest() {
    String toConvert = input.next();
    String toMatch = input.next();
    int expectedOutput = output.nextInt();
    StringConvert object = new StringConvert();
    assertEquals(expectedOutput, object.convertString(toConvert,toMatch));
  }

  @org.junit.After
  public void tearDown() throws Exception {
    input.close();
    output.close();
  }
}