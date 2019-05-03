package org.svaarg.problemsolving.tree;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Class: PrefixTreeTest
 *
 * @author Umang J Gala
 */
public class PrefixTreeTest {
  private PrefixTree prefixTree;

  @org.junit.Before
  public void beforeTest() {
    prefixTree = new PrefixTree();
    prefixTree.insert("apple");
    prefixTree.insert("app");
    prefixTree.insert("aura");
  }

  @Test
  public void testSearch() {
    assertTrue(prefixTree.search("apple"));
    assertTrue(prefixTree.search("app"));
    assertTrue(prefixTree.search("aura"));

    assertFalse(prefixTree.search("aapl"));
    assertFalse(prefixTree.search("apples"));
  }

  @Test
  public void testStartsWith() {
    assertTrue(prefixTree.startsWith("a"));
    assertTrue(prefixTree.startsWith("appl"));
    assertTrue(prefixTree.startsWith("au"));

    assertFalse(prefixTree.startsWith("aapl"));
    assertFalse(prefixTree.startsWith("apps"));
  }
}