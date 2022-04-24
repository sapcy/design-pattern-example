package com.example.designPattern.command.concreteCommands;

import com.example.designPattern.command.base.Command;
import com.example.designPattern.command.receiver.Flavor;

public class FlavorCommand implements Command {
    private Flavor flavor;

    public FlavorCommand(Flavor flavor) {
        this.flavor = flavor;
    }

    @Override
    public void execute() {
        System.out.println("Flavor: " + flavor.getName() + "로 생성됨.");
    }

    @Override
    public void undo() {

    }
}
