package com.project.onetomany.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Author 
{
    @Id
    private int a_id;
    private String a_name;  
    @JsonManagedReference
    @OneToMany(mappedBy="author",cascade = CascadeType.ALL)
    private List<Books> books;
}
