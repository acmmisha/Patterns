/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.command;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Receiver class for commands
 * @author tmv
 */
public class Receiver {
    
    private final Queue<Command> queue = new PriorityQueue<>(Comparator.comparingInt(Command::priority).reversed());
    private final Deque<Command> history = new ArrayDeque<>();
    
    public void operation(Command c) {
        history.push(c);
        queue.offer(c);
    }

    public void operations(List<Command> commandList) {
        commandList.forEach(c -> history.push(c));
        commandList.forEach(c -> queue.offer(c));
    }
    
    public Command getLastCommand() {
        return history.pop();
    }
    
    public synchronized List<Command> getLastCommands(int numberOfCommands) {
        List<Command> result = new ArrayList<>();
        while(numberOfCommands != 0 && history.size() > 0) {
            result.add(history.pop());
            numberOfCommands--;
        }
        return result;
    }
    
    public synchronized void perform() {
        System.out.println(queue);
        System.out.println(history);
    }
}
