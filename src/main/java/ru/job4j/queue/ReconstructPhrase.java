package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder temp = new StringBuilder();
        int size = evenElements.size();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0)  {
                temp.append(evenElements.poll());
            } else {
                evenElements.poll();
            }
        }
        return temp.toString();
    }

    private String getDescendingElements() {
        StringBuilder temp = new StringBuilder();
        int size = descendingElements.size();
        for (int i = 0; i < size; i++) {
            temp.append(descendingElements.pollLast());
        }
        return temp.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}