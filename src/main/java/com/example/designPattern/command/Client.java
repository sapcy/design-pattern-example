package com.example.designPattern.command;

import com.example.designPattern.command.base.Command;
import com.example.designPattern.command.concreteCommands.FlavorCommand;
import com.example.designPattern.command.concreteCommands.MetadataCommand;
import com.example.designPattern.command.concreteCommands.NetworkCommand;
import com.example.designPattern.command.concreteCommands.SourceCommand;
import com.example.designPattern.command.invoker.Provisioner;
import com.example.designPattern.command.receiver.Vm;

public class Client {
    public static void main(String[] args) {
        Vm vm = new Vm();

        Command metadataCom = new MetadataCommand(vm);
        Command flavorCom = new FlavorCommand(vm);
        Command networkCom = new NetworkCommand(vm);
        Command sourceCom = new SourceCommand(vm);

        Provisioner provisioner = new Provisioner();

        provisioner.setCommand(metadataCom);
        provisioner.execute("test-vm-1");

        provisioner.setCommand(flavorCom);
        provisioner.execute("m1.medium");

        provisioner.setCommand(networkCom);
        provisioner.execute("public-network");

        provisioner.setCommand(sourceCom);
        provisioner.execute("Ubuntu 20.04 LTS");

        provisioner.provision();
    }
}
