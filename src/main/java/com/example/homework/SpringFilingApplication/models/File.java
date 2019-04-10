package com.example.homework.SpringFilingApplication.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "files")
public class File {
    @Column
    private String name;
    @Column
    private String extension;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = false)
    private Folder folder;

    public File(String name, String extension, Folder folder){
        this.name = name;
        this.extension = extension;
        this.folder = folder;
    }

    public File(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
