package org.svaarg.problemsolving.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * Class: TrieNode
 * Object to represent Trie Node
 *
 * @author Umang J Gala
 */
class TrieNode {
  private boolean leaf;
  private Map<Character, TrieNode> children;

  /**
   * default constructor
   */
  TrieNode() {
    leaf = false;
    children = new HashMap<>();
  }

  /**
   * getChild
   * returns the TrieNode of child 'c', if present
   *
   * @param c child character
   * @return TrieNode of child 'c'
   */
  TrieNode getChild(char c) {
    return children.get(c);
  }

  /**
   * setChild
   * add 'c' as child of this
   *
   * @param c child character
   * @param child TrieNode of child 'c'
   */
  void setChild(char c, TrieNode child) {
    children.put(c, child);
  }

  /**
   * setLeaf
   * set this as leaf node
   *
   * @param flag boolean value
   */
  void setLeaf(boolean flag) {
    leaf = flag;
  }

  /**
   * isLeaf
   * return if this is leaf node or not
   * @return boolean value
   */
  boolean isLeaf() {
    return leaf;
  }
}
