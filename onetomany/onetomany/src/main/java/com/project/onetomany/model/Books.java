package com.project.onetomany.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Entity
public class Books 
{
    @Id
    private int a_id;
    private String b_name;
    private String description;
    @JsonBackReference
    @ManyToOne
    @JoinColumn
    private Author author;
}
