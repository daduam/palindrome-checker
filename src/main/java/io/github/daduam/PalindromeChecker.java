package io.github.daduam;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class PalindromeChecker {
  public static boolean check(String word) {
    Deque<Character> stack = new ArrayDeque<>();
    Queue<Character> queue = new ArrayDeque<>();

    char[] letters = word.toLowerCase().replaceAll("\\s+", "").toCharArray();

    for (Character letter : letters) {
      stack.addFirst(letter);
      queue.add(letter);
    }

    while (!stack.isEmpty()) {
      if (stack.peek() != queue.peek())
        return false;

      stack.removeFirst();
      queue.remove();
    }

    return true;
  }
}
