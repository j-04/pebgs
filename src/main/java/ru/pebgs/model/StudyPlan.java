package ru.pebgs.model;

import javax.persistence.*;

@Entity
@Table(schema = "public", name = "study_plan")
public class StudyPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
}
