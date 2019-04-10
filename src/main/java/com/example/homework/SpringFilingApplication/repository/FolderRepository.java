package com.example.homework.SpringFilingApplication.repository;

import com.example.homework.SpringFilingApplication.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder,Long> {
}
