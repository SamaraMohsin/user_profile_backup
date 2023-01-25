package com.xloop.resourceloop.candidateprofile.model;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter

@Entity
@Table(name = "candidate_academic_information")
public class CandidateAcademicInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Setter
    private String currentDegree;
    @Setter
    private String Title;
    @Setter
    private String University;
    @Setter
    private boolean Degree_progress;
    @Setter
    private LocalDate Graduation_date;
    @Setter
    private float CGPA;
    @Setter
    private String Final_Year_Project;
    @Setter
    private String Certificates;
}
