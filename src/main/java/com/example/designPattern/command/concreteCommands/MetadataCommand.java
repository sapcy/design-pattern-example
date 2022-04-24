package com.example.designPattern.command.concreteCommands;

import com.example.designPattern.command.base.Command;
import com.example.designPattern.command.receiver.Vm;

public class MetadataCommand implements Command {
    private Vm vm;

    public MetadataCommand(Vm vm) {
        this.vm = vm;
    }

    @Override
    public <T> void execute(T param) {
        vm.setMetadata((String) param);
        System.out.println("Metadata: " + param + "로 생성됨.");
    }

    @Override
    public void undo() {

    }
}
