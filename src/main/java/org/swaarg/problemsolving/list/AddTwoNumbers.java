package org.swaarg.problemsolving.list;

/**
 * Class: AddTwoNumbers
 * Add two numbers whose digits are stored in linked list
 *
 * @author Umang J Gala
 */
public class AddTwoNumbers {
  /**
   * addTwoNumbers
   * function to add two numbers whose digits are stored in reverser order in
   * linked list and return linked list with its sum digits
   *
   * @param no1 number one list
   * @param no2 number two list
   * @return sum of two numbers in list
   */
  public ListNode addTwoNumbers(ListNode no1, ListNode no2) {
    ListNode resultHead = new ListNode(0);
    ListNode p = no1, q = no2, current = resultHead;
    int carry = 0;
    while (p != null || q != null) {
      int x = p != null ? p.value : 0;
      int y = q != null ? q.value : 0;
      int sum = carry + x + y;
      carry = sum / 10;
      current.next = new ListNode(sum % 10);
      current = current.next;
      if (p != null) p = p.next;
      if (q != null) q = q.next;
    }
    if (carry > 0)
      current.next = new ListNode(carry);
    return resultHead.next;
  }
}
