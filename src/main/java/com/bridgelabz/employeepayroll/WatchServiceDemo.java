package com.bridgelabz.employeepayroll;

import java.io.IOException;
import java.nio.file.*;
public class WatchServiceDemo {

        public  static void main(String[] args){

            // Folder to watch
            Path folder = Paths.get("PayrollFiles");

            try{

                // Create folder if it doesn't exist
                if (!Files.exists(folder)) {
                    Files.createDirectories(folder);
                }

                //Create WatchService
                WatchService watchService = FileSystems.getDefault().newWatchService();

                //Register folder
                folder.register(
                        watchService,
                        StandardWatchEventKinds.ENTRY_CREATE,
                        StandardWatchEventKinds.ENTRY_DELETE,
                        StandardWatchEventKinds.ENTRY_MODIFY
                );

                System.out.println("Watching Folder : " + folder.toAbsolutePath());

                while (true){

                    //Wait until some event happens
                    WatchKey key = watchService.take();

                    //Read all events
                    for(WatchEvent<?> event  : key.pollEvents()){

                        System.out.println(event.kind().name() + " -> " + event.context());

                    }

                    // Continue Watching
                    key.reset();

                }

            }catch(IOException e){

                System.out.println(e.getMessage());

            } catch (InterruptedException e) {

                throw new RuntimeException(e);
            }

        }

}
