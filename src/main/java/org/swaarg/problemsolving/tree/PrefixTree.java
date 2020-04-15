package org.swaarg.problemsolving.tree;

/**
 * Class: PrefixTree
 * Supports insert, search and startsWith functionality.
 *
 * @author Umang J Gala
 */
class PrefixTree {
  private TrieNode root;

  PrefixTree() {
    root = new TrieNode();
  }

  /**
   * insert
   * Inserts a word into the Prefix Tree.
   *
   * @param word word to insert into Prefix Tree
   */
  void insert(String word) {
    TrieNode parent = root;
    for (int charIndex = 0; charIndex < word.length(); charIndex++) {
      char character = word.charAt(charIndex);
      TrieNode child = parent.getChild(character);
      if (child == null) {
        child = new TrieNode();
        parent.setChild(character, child);
      }
      parent = child;
    }
    parent.setLeaf(true);
  }

  /**
   * search
   * Returns true if the word is present in Prefix Tree else false.
   *
   * @param word word to search
   * @return true if any word is present else false
   */
  boolean search(String word) {
    TrieNode leafNode = getLeaf(word);
    return leafNode != null && leafNode.isLeaf();
  }

  /**
   * Returns true if there is any word in the Prefix Tree that starts with the
   * given prefix else false.
   *
   * @param prefix prefix word
   * @return true if any word starts with prefix else false
   */
  boolean startsWith(String prefix) {
    return getLeaf(prefix) != null;
  }

  /**
   * getLeaf
   * Function that traverse to leaf node in Prefix Tree and returns the node
   * if all character are present else return null.
   *
   * @param word word to traverse
   * @return leaf node or null
   */
  private TrieNode getLeaf(String word) {
    TrieNode parent = root;
    for (int charIndex = 0; charIndex < word.length(); charIndex++) {
      char character = word.charAt(charIndex);
      TrieNode child = parent.getChild(character);
      if (child == null)
        return null;
      parent = child;
    }
    return parent;
  }
}
