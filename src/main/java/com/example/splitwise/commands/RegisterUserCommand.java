package com.example.splitwise.commands;

import java.util.Arrays;
import java.util.List;

public class RegisterUserCommand implements Command{
    @Override
    public boolean parse(String commandLine) {
        List<String> commandTokens = Arrays.stream(commandLine.split(" ")).toList();
        if(commandTokens.size() != 4){
            return false;
        }

        String firstToken = commandTokens.get(0);

        if(firstToken.equalsIgnoreCase(CommandKeywords.REGISTER_USER_TOKEN) == false){
            return false;
        }
        return true;
    }

    @Override
    public void execute(String commandine) {

    }
}
