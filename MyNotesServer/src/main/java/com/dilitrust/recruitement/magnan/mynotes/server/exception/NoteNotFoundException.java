package com.dilitrust.recruitement.magnan.mynotes.server.exception;

public class NoteNotFoundException extends RuntimeException {
    public NoteNotFoundException(Long id) {
        super("Could not find note " + id);
    }
}
