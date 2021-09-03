package com.dilitrust.recruitement.magnan.mynotes.server.form;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class NoteForm {
    private Long id;
    @NotEmpty
    private String note;
}
