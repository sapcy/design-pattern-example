package com.example.designPattern.command.receiver;

public class Vm {
    String metadata;
    String source;
    String flavor;
    String network;

    public Vm() {}

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setNetwork(String network) {
        this.network = network;
    }
}
