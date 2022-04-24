package com.example.designPattern.command.concreteCommands;

import com.example.designPattern.command.base.Command;
import com.example.designPattern.command.receiver.Vm;

public class SourceCommand implements Command {
    private Vm vm;

    public SourceCommand(Vm vm) {
        this.vm = vm;
    }

    @Override
    public <T> void execute(T param) {
        vm.setSource((String) param);
        System.out.println("Source: " + param + "로 생성됨.");
    }

    @Override
    public void undo() {

    }
}