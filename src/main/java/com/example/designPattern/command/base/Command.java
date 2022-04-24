package com.example.designPattern.command.base;

public interface Command {
    <T> void execute(T param);
    void undo();
}
