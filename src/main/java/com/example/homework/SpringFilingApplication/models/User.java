package com.example.homework.SpringFilingApplication.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Column
    private String name;
    @Column
    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Folder> folders;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public User(String name){
        this.name = name;
        this.folders = new ArrayList<Folder>();
    }

    public User(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long newId){
        this.id = newId;
    }
//
//    public void addFolder(Folder folder){
//        this.folders.add(folder);
//
//    }

//    public Folder getFolder() {
//        return folder;
//    }
//
//    public void setFolder(Folder folder) {
//        this.folder = folder;
//    }
}
