package com.example.designPattern.command.concreteCommands;

import com.example.designPattern.command.base.Command;
import com.example.designPattern.command.receiver.Vm;

public class NetworkCommand implements Command {
    private Vm vm;

    public NetworkCommand(Vm vm) {
        this.vm = vm;
    }

    @Override
    public <T> void execute(T param) {
        vm.setNetwork((String) param);
        System.out.println("Network: " + param + "로 생성됨.");
    }

    @Override
    public void undo() {

    }
}
