package pio.daw;

import java.nio.file.Path;

public class ArgParser {
    private Path csvPath;

    public static ArgParser formArgs(String[] args){
        //TODO
    }

    public ArgParser(Path csvPath){
        this.csvPath = csvPath;
    }

    public Path getPath(){
        return this.csvPath;
    }
    
}
