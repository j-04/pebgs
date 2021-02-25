package ru.pebgs.model;

import javax.persistence.*;

@Entity
@Table(schema = "public", name = "mark")
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String value;

    private String name;

}
