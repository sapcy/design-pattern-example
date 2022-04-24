package com.example.designPattern.command.concreteCommands;

import com.example.designPattern.command.base.Command;
import com.example.designPattern.command.receiver.Vm;

public class FlavorCommand implements Command {
    private Vm vm;

    public FlavorCommand(Vm vm) {
        this.vm = vm;
    }

    @Override
    public <T> void execute(T param) {
        vm.setFlavor((String) param);
        System.out.println("Flavor: " + param + "로 생성됨.");
    }

    @Override
    public void undo() {

    }
}
