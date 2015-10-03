package Strategy;

import java.io.File;
import java.util.ArrayList;

//Let's use the example of a file compression tool - where we create either zip or rar files. First we'll need a strategy:
//Strategy Interface
interface CompressionStrategy {
    public void compressFiles(ArrayList<File> files);
}

//And we'll need to provide our two implementations, one for zip and one for rar
class ZipCompressionStrategy implements CompressionStrategy {
    public void compressFiles(ArrayList<File> files) {
        //using ZIP approach
    }
}

class RarCompressionStrategy implements CompressionStrategy {
    public void compressFiles(ArrayList<File> files) {
        //using RAR approach
    }
}

//Our context will provide a way for the client to compress the files.
// Let's say that there is a preferences setting in our application that sets
// which compression algorithm to use.
// We can change our strategy using the setCompressionStrategy method in the Context.
class CompressionContext {
    private CompressionStrategy strategy;

    //this can be set at runtime by the application preferences
    public void setCompressionStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    //use the strategy
    public void createArchive(ArrayList<File> files) {
        strategy.compressFiles(files);
    }
}

//It's obvious that all the client has to do now is pass through the files to the CompressionContext
public class Client {
    public static void main(String[] args) {
        ArrayList<File> fileList = null;//files coming from some source we take it as null for here
        CompressionContext ctx = new CompressionContext();
        //we could assume context is already set by preferences
        ctx.setCompressionStrategy(new ZipCompressionStrategy());
        //get a list of files...
        ctx.createArchive(fileList);
    }
}







