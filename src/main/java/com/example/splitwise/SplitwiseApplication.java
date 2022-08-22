package com.example.splitwise;

import com.example.splitwise.commands.CommandRegistry;
import com.example.splitwise.commands.CommandRegistryImpl;
import com.example.splitwise.commands.RegisterUserCommand;
import com.example.splitwise.commands.UpdateProfileCommand;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.inject.Inject;

@SpringBootApplication
public class SplitwiseApplication implements CommandLineRunner {
    @Inject
    private CommandRegistry commandRegistry;

    public static void main(String[] args) {
        SpringApplication.run(SplitwiseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        commandRegistry.registerCommand(new RegisterUserCommand());
        commandRegistry.registerCommand(new UpdateProfileCommand());

        String input = "Register prashantexploring 008 some";
        commandRegistry.executeCommandLine(input);
    }
}
