package at.ran.cc.OOP.Handy;

import java.util.ArrayList;
import java.util.List;

public class Memory {
    private int capacity;
    private List<Files> files;


    public Memory(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();

    }

    public void saveFile(Files file){
        this.files.add(file);
    }

    public void deleteFiles(){
        this.files.clear();
    }
    
    public void printFiles(){
        for (Files file: files) {
            System.out.println(file.getExtension());
            System.out.println(file.getSize());
            System.out.println(file.getName());
            System.out.println(file.getTimeStamp());
            System.out.println(file.getResolution() + "\n");
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Files> getFiles() {
        return files;
    }

    public void setFile(List<Files> files) {
        this.files = files;
    }
}

