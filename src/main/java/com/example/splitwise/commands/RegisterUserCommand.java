package com.example.splitwise.commands;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RegisterUserCommand implements Command{
    private static final Logger LOGGER = LoggerFactory.getLogger(RegisterUserCommand.class);

    @Override
    public boolean parse(String commandLine) {
        List<String> commandTokens = Arrays.stream(commandLine.split(" ")).toList();
        if(commandTokens.size() != 4){
            LOGGER.info("This is not a Register user command");
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
        LOGGER.info("input command : " + commandine);
    }
}
