package ru.pebgs.model;

import javax.persistence.*;

@Entity
@Table(schema = "public", name = "exam_type")
public class ExamType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String type;
}
