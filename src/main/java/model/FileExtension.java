package model;

import java.util.Arrays;
import java.util.Set;

public class FileExtension {

    private String fileName;
    private Set<String> fileSignatures;

    public FileExtension(String fileName, Set<String> fileSignatures) {
        this.fileName = fileName;
        this.fileSignatures = fileSignatures;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Set<String> getFileSignatures() {
        return fileSignatures;
    }

    public String[] fileSignaturesArray(){
        return Arrays.copyOf(fileSignatures.toArray(), fileSignatures.size(), String[].class);
    }

    public void setFileSignatures(Set<String> fileSignatures) {
        this.fileSignatures = fileSignatures;
    }
}
