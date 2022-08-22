package com.example.splitwise.commands;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class UpdateProfileCommand implements Command{
    private static final Logger LOGGER = LoggerFactory.getLogger(UpdateProfileCommand.class);

    @Override
    public boolean parse(String commandLine) {

        List<String> commandTokens = Arrays.stream(commandLine.split(" ")).toList();
        if(commandTokens.size() != 3){
            LOGGER.info("This is not UpdateProfileCommand .");
            return false;
        }

        String firstToken = commandTokens.get(0);

        if(firstToken.equalsIgnoreCase(CommandKeywords.UPDATE_PROFILE_TOKEN) == false){
            return false;
        }
        return true;
    }

    @Override
    public void execute(String commandine) {
        LOGGER.info("input command : " + commandine);
    }
}
