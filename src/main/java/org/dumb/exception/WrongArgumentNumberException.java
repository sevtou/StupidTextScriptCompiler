package org.dumb.exception;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class WrongArgumentNumberException extends Exception {
    private int expected;
    private List<String> args;

    public WrongArgumentNumberException(int expected, List<String> args) {
        super(String.format("Expected %d argument, found %d argument: %s", expected, args.size(), args));
        this.expected = expected;
        this.args = args;
    }

    public WrongArgumentNumberException(int expected, List<String> args, Throwable cause) {
        super(String.format("Expected %d argument, found %d argument: %s", expected, args.size(), args), cause);
        this.expected = expected;
        this.args = args;
    }

    @Override
    public String toString() {
        StackTraceElement[] ste = this.getStackTrace();
        String className = ste[1].getClassName();
        return String.format("In function %s: %s", className, this.getMessage());
    }
}
