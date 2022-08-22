package com.example.splitwise.commands;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommandRegistryImpl implements CommandRegistry{

    private List<Command> commands = new ArrayList<>();

    @Override
    public boolean registerCommand(Command command) {
        commands.add(command);
        return true;
    }

    @Override
    public Command getCommand(String commandLine) {
        for(Command command : commands){
            if(command.parse(commandLine)){
                return command;
            }
        }
        return null;
    }

    @Override
    public boolean removeCommand(Command command) {
        commands.remove(command);
        return true;
    }

    @Override
    public boolean executeCommandLine(String commandLine) {
        for(Command command: commands){
            if(command.parse(commandLine)){
                command.execute(commandLine);
                return true;
            }
        }
        return false;
    }
}
