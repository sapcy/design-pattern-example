package com.example.designPattern.command.invoker;

import com.example.designPattern.command.base.Command;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Provisioner<T> {
    private Command command;
    private Queue<Map<Command, String>> queue = new LinkedList<>();

    public Provisioner() {}

    public void setCommand(Command command) {
        this.command = command;
    }

    public <T> void execute(T param) {
        queue.add(Map.of(this.command, (String)param));
    }

    public void provision() {
        while (!queue.isEmpty()) {
            Map<Command, String> pollMap = queue.poll();
            for (Map.Entry<Command, String> entry : pollMap.entrySet()) {
                entry.getKey().execute(entry.getValue());
            }
        }
        System.out.println("VM이 생성되었습니다.");
    }

    public void undo() {
        command.undo();
    }
}
