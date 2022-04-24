package com.example.designPattern.command.concreteCommands;

import com.example.designPattern.command.base.Command;
import com.example.designPattern.command.receiver.Network;

public class NetworkCommand implements Command {
    private Network network;

    public NetworkCommand(Network network) {
        this.network = network;
    }

    @Override
    public void execute() {
        System.out.println("Network: " + network.getName() + "로 생성됨.");
    }

    @Override
    public void undo() {

    }
}
