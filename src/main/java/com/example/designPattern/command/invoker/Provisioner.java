package com.example.designPattern.command.invoker;

import com.example.designPattern.command.base.Command;

import java.util.LinkedList;
import java.util.Queue;

public class Provisioner<T> {
    private Command command;
    private Queue<Command> queue = new LinkedList<>();

    public Provisioner() {}

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        queue.add(this.command);
    }

    public void provision() {
        while (!queue.isEmpty()) {
            Command pollCom = queue.poll();
            pollCom.execute();
        }
        System.out.println("VM이 생성되었습니다.");
    }

    public void undo() {
        command.undo();
    }
}
