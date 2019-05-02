package org.svaarg.problemsolving.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * Class: TrieNode
 *
 * @author Umang J Gala
 */
class TrieNode {
  private boolean leaf;
  private Map<Character, TrieNode> children;

  TrieNode() {
    leaf = false;
    children = new HashMap<>();
  }

  TrieNode getChild(char c){
    return children.get(c);
  }

  void setChild(char c, TrieNode child){
    children.put(c,child);
  }

  void setLeaf(boolean flag){
    leaf=flag;
  }

  boolean isLeaf(){
    return leaf;
  }
}
