package com.dilitrust.recruitement.magnan.mynotes.server.controller;

import com.dilitrust.recruitement.magnan.mynotes.server.domain.Note;
import com.dilitrust.recruitement.magnan.mynotes.server.form.NoteForm;
import com.dilitrust.recruitement.magnan.mynotes.server.repository.NoteRepository;
import com.google.common.hash.Hashing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.List;

@RestController
@RequestMapping("/note")
public class NoteRestController {
    @Autowired
    private NoteRepository repository;

    @GetMapping("/retrieve")
    public List<Note> retrieveAll() {
        return repository.findAll();
    }

    @GetMapping("/retrieve/{id}")
    public Note retrieveSingleNote(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PostMapping("/store")
    public Note storeSingleNote(@RequestBody NoteForm form) {
        Note note = new Note();

        Instant dateUTC = Instant.now();
        String originalString = form.getNote() + dateUTC;
        // Sha256 64 Round
        String sha256hex = Hashing.sha256().hashString(originalString, StandardCharsets.UTF_8).toString();
        note.setNote(form.getNote());
        note.setCreation_date(dateUTC);
        note.setHash(sha256hex);
        return repository.save(note);
    }

}
