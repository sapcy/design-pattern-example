package com.example.designPattern.command.concreteCommands;

import com.example.designPattern.command.base.Command;
import com.example.designPattern.command.receiver.Metadata;

public class MetadataCommand implements Command {
    private Metadata metadata;

    public MetadataCommand(Metadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public void execute() {
        System.out.println("Metadata: " + metadata.getName() + "로 생성됨.");
    }

    @Override
    public void undo() {

    }
}
