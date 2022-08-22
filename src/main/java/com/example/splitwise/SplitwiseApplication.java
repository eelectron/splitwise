package com.example.splitwise;

import com.example.splitwise.commands.CommandRegistry;
import com.example.splitwise.commands.CommandRegistryImpl;
import com.example.splitwise.commands.RegisterUserCommand;
import com.example.splitwise.commands.UpdateProfileCommand;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.inject.Inject;

@SpringBootApplication
@EnableJpaAuditing
public class SplitwiseApplication implements CommandLineRunner {
    @Inject
    private CommandRegistry commandRegistry;

    @Inject
    private RegisterUserCommand registerUserCommand;

    @Inject
    private UpdateProfileCommand updateProfileCommand;

    public static void main(String[] args) {
        SpringApplication.run(SplitwiseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        commandRegistry.registerCommand(registerUserCommand);
        commandRegistry.registerCommand(updateProfileCommand);

        String input = "Register prashantexploring 008 some";
        commandRegistry.executeCommandLine(input);
    }
}
