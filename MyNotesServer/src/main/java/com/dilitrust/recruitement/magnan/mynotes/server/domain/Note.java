package com.dilitrust.recruitement.magnan.mynotes.server.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "note")
public class Note {
    @Id
    @Column
    @GeneratedValue
    private Long id;

    @Column(length = 10000)
    private String note;

    @Column
    private Instant creation_date;

    @Column(length = 256)
    private String hash;

}
