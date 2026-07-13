package com.bridgelabz.employeepayroll;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOperationsDemo {

    public  static  void main(String[] args){

        // Create a working directory inside user home
        String userHome = System.getProperty("user.home");
        Path basePath = Paths.get(userHome, "TempPlayGround");

        try {
            // 1. Check File Exists
            System.out.println("Checking if path exists: " + Files.exists(basePath));

            if(! Files.exists(basePath)){

                Files.createDirectories(basePath);
                System.out.println("Directory created: " + basePath);

            }

            // 3. Create Empty File
            Path tempFile = basePath.resolve("Sample.txt");
            if (!Files.exists(tempFile)) {
                Files.createFile(tempFile);
                System.out.println("Empty file created: " + tempFile);
            }

            // 4. List Files and Directories
            System.out.println("\nAll files and directories in " + basePath + ":");
            try(DirectoryStream<Path> stream = Files.newDirectoryStream(basePath)){

                for (Path path : stream) {
                    System.out.println(path.getFileName());
                }

            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }

            // 5. List Files with Extension
            System.out.println("\nFiles with .txt extension:");
            try(DirectoryStream<Path> stream = Files.newDirectoryStream(basePath, "*.txt")){
                for (Path path : stream) {
                    System.out.println(path.getFileName());
                }
            }

            // 6. Delete File and Check File Not Exist
            if(Files.exists(tempFile)){

                Files.delete(tempFile);
                System.out.println("\nFile deleted: " + tempFile);

            }

            System.out.println("File exists after delete? " + Files.exists(tempFile));


        }catch (IOException e){



        }





    }


}
