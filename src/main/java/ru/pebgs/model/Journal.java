package ru.pebgs.model;

import javax.persistence.*;

@Entity
@Table(schema = "public", name = "journal")
public class Journal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private Integer inTime;

    private Integer count;
}
