package org.swaarg.problemsolving.list;

/**
 * Class: LinkedList
 * Object to represent Singly Linked List
 * Supports create and insertAtEnd functionality
 *
 * @author Umang J Gala
 */
public class LinkedList {
  ListNode head;

  /**
   * default constructor
   * initialize head to null
   */
  LinkedList() {
    head = null;
  }

  /**
   * initialize the linked list head to parameter passed as head
   *
   * @param head value to initialize linked list head
   */
  LinkedList(ListNode head) {
    this.head = head;
  }

  /**
   * equals
   * checks whether other object is same as this object
   *
   * @param obj object to be check
   * @return true if this object is same as obj argument else false
   */
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    LinkedList list = (LinkedList) obj;
    if (this.head == list.head)
      return true;
    if (this.head == null || list.head == null)
      return false;
    ListNode left = this.head;
    ListNode right = list.head;
    while (left.next != null && right.next != null) {
      if (left.value != right.value)
        return false;
      left = left.next;
      right = right.next;
    }
    return left.next == null && right.next == null;
  }

  /**
   * create (static method)
   * function to create the linked list from the space separated elements sent
   * in the string
   * if the string is null or empty, it returns linked list with null head
   *
   * @param list string of space separated elements
   * @return linked list with elements or linked list with null head
   */
  public static LinkedList create(String list) {
    if (list == null || list.isEmpty())
      return new LinkedList();
    LinkedList linkedList = new LinkedList();
    String[] elements = list.split(" ");
    for (String element : elements) {
      insertAtEnd(linkedList, Integer.parseInt(element));
    }
    return linkedList;
  }

  /**
   * insertAtEnd (static method)
   * insert the value as node to the end of linked list
   *
   * @param linkedList list to add value
   * @param value      value to be added to the list
   */
  public static void insertAtEnd(LinkedList linkedList, int value) {
    ListNode newNode = new ListNode(value);
    newNode.next = null;
    if (linkedList.head == null)
      linkedList.head = newNode;
    else {
      ListNode last = linkedList.head;
      while (last.next != null)
        last = last.next;
      last.next = newNode;
    }
  }
}
