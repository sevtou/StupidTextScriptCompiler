package org.dumb.builtin;

import org.dumb.exception.WrongArgumentNumberException;

import java.util.List;

public interface BuiltinFunction {
    String exec(List<String> args) throws WrongArgumentNumberException;
}
