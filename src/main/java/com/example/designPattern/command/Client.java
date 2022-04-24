package com.example.designPattern.command;

import com.example.designPattern.command.base.Command;
import com.example.designPattern.command.concreteCommands.FlavorCommand;
import com.example.designPattern.command.concreteCommands.MetadataCommand;
import com.example.designPattern.command.concreteCommands.NetworkCommand;
import com.example.designPattern.command.concreteCommands.SourceCommand;
import com.example.designPattern.command.invoker.Provisioner;
import com.example.designPattern.command.receiver.Flavor;
import com.example.designPattern.command.receiver.Metadata;
import com.example.designPattern.command.receiver.Network;
import com.example.designPattern.command.receiver.Source;

public class Client {
    public static void main(String[] args) {
        Metadata metadata = new Metadata("test-vm-1");
        Flavor flavor = new Flavor("m1.medium");
        Network network = new Network("public-network");
        Source source = new Source("Ubuntu 20.04 LTS");

        Command metadataCom = new MetadataCommand(metadata);
        Command flavorCom = new FlavorCommand(flavor);
        Command networkCom = new NetworkCommand(network);
        Command sourceCom = new SourceCommand(source);

        Provisioner provisioner = new Provisioner();

        provisioner.setCommand(metadataCom);
        provisioner.execute();

        provisioner.setCommand(flavorCom);
        provisioner.execute();

        provisioner.setCommand(networkCom);
        provisioner.execute();

        provisioner.setCommand(sourceCom);
        provisioner.execute();

        provisioner.provision();
    }
}
