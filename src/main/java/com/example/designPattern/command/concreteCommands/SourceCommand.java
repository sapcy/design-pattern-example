package com.example.designPattern.command.concreteCommands;

import com.example.designPattern.command.base.Command;
import com.example.designPattern.command.receiver.Source;

public class SourceCommand implements Command {
    private Source source;

    public SourceCommand(Source source) {
        this.source = source;
    }

    @Override
    public void execute() {
        System.out.println("Source: " + source.getName() + "로 생성됨.");
    }

    @Override
    public void undo() {

    }
}