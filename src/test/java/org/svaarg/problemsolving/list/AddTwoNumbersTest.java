package org.svaarg.problemsolving.list;

import org.junit.Assert;
import org.junit.runners.Parameterized;
import org.svaarg.problemsolving.TestHelper;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Scanner;

/**
 * Class: AddTwoNumbersTest
 *
 * @author Umang J Gala
 */
@org.junit.runner.RunWith(Parameterized.class)
public class AddTwoNumbersTest {
  @Parameterized.Parameters(name = "list/AddTwoNumbers - Test: {index}")
  public static Collection<Object[]> data() {
    String directoryPath = System.getProperty("testFilesRootDirectory");
    directoryPath += "list/addtwonumbers/";
    return TestHelper.getTestCases(new File(directoryPath));
  }

  @Parameterized.Parameter()
  public File inputFile;

  @Parameterized.Parameter(1)
  public File outputFile;

  private AddTwoNumbers object;
  private Scanner input, output;

  @org.junit.Before
  public void beforeTest() {
    object = new AddTwoNumbers();
    try {
      input = new Scanner(inputFile);
      output = new Scanner(outputFile);
    } catch (FileNotFoundException fileNotFoundException) {
      System.err.println("File not found: " + inputFile);
    }
  }

  @org.junit.Test
  public void addTwoNumbersTest() {
    LinkedList no1 = LinkedList.create(input.nextLine());
    LinkedList no2 = LinkedList.create(input.nextLine());
    LinkedList expectedList = LinkedList.create(output.nextLine());
    LinkedList actualList = new LinkedList(object.addTwoNumbers(no1.head, no2.head));
    Assert.assertEquals(expectedList, actualList);
  }

  @org.junit.After
  public void afterTest() {
    input.close();
    output.close();
  }
}