package com.dilitrust.recruitement.magnan.mynotes.server.repository;


import com.dilitrust.recruitement.magnan.mynotes.server.domain.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {


}
