/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.command;

/**
 *
 * @author tmv
 */
public interface Command {
    void execute();
    int priority();
}
