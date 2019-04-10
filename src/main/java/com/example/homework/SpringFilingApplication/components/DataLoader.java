package com.example.homework.SpringFilingApplication.components;

import com.example.homework.SpringFilingApplication.models.File;
import com.example.homework.SpringFilingApplication.models.Folder;
import com.example.homework.SpringFilingApplication.models.User;
import com.example.homework.SpringFilingApplication.repository.FileRepository;
import com.example.homework.SpringFilingApplication.repository.FolderRepository;
import com.example.homework.SpringFilingApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    public void run(ApplicationArguments args){
        User dave = new User("Dave");
        User bob = new User("bob");
        userRepository.save(bob);
        userRepository.save(dave);

        Folder folder1 = new Folder("stuff",bob);
        folderRepository.save(folder1);
        File file1 = new File("essay",".doc",folder1);
        File file2 = new File("cv",".pdf",folder1);

        fileRepository.save(file1);
        fileRepository.save(file2);

    }
}
