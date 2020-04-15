package org.swaarg.problemsolving.sort;

import org.junit.runners.Parameterized;
import org.swaarg.problemsolving.TestHelper;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Scanner;

import static org.junit.Assert.assertArrayEquals;

/**
 * Class: SortTest
 *
 * @author Umang J Gala
 */
@org.junit.runner.RunWith(Parameterized.class)
public class SortTest {
  @Parameterized.Parameters(name = "sort/SortTest - Test: {index}")
  public static Collection<Object[]> data() {
    String directoryPath = System.getProperty("testFilesRootDirectory");
    directoryPath += "sort/";
    return TestHelper.getTestCases(new File(directoryPath));
  }

  @Parameterized.Parameter()
  public File inputFile;

  @Parameterized.Parameter(1)
  public File outputFile;

  private Scanner input, output;
  private int noOfElements;
  private int[] inputElements, outputElements;

  @org.junit.Before
  public void beforeTest() {
    try {
      input = new Scanner(inputFile);
      output = new Scanner(outputFile);
    } catch (FileNotFoundException fileNotFoundException) {
      System.err.println("File not found: " + inputFile);
    }
  }

  @org.junit.After
  public void afterTest() {
    input.close();
    output.close();
  }

  private void readInputOutput() {
    noOfElements = input.nextInt();
    inputElements = new int[noOfElements];
    outputElements = new int[noOfElements];
    for (int index = 0; index < noOfElements; index++) {
      inputElements[index] = input.nextInt();
      outputElements[index] = output.nextInt();
    }
  }

  @org.junit.Test
  public void bubbleSortTest() {
    readInputOutput();
    BubbleSort.sort(inputElements);
    assertArrayEquals(outputElements, inputElements);
  }

  @org.junit.Test
  public void selectionSortTest() {
    readInputOutput();
    SelectionSort.sort(inputElements);
    assertArrayEquals(outputElements, inputElements);
  }

  @org.junit.Test
  public void insertionSortTest() {
    readInputOutput();
    InsertionSort.sort(inputElements);
    assertArrayEquals(outputElements, inputElements);
  }

  @org.junit.Test
  public void mergeSortTest() {
    readInputOutput();
    MergeSort.sort(inputElements, 0, noOfElements - 1);
    assertArrayEquals(outputElements, inputElements);
  }

  @org.junit.Test
  public void quickSortTest() {
    readInputOutput();
    QuickSort.sort(inputElements, 0, noOfElements - 1);
    assertArrayEquals(outputElements, inputElements);
  }

  @org.junit.Test
  public void shellSortTest() {
    readInputOutput();
    ShellSort.sort(inputElements);
    assertArrayEquals(outputElements, inputElements);
  }

  @org.junit.Test
  public void heapSortTest() {
    readInputOutput();
    HeapSort.sort(inputElements);
    assertArrayEquals(outputElements, inputElements);
  }
}
