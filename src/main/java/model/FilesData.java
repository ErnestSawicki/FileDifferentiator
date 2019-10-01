package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FilesData {

    private List<FileExtension> filesData;
    private Set<String> gifSignatures;
    private Set<String> jpgSignatures;
    private Set<String> pdfSignatures;


    public FilesData() {
        init();
    }

    private void init() {
        filesData = new ArrayList<>();

        gifSignatures = new HashSet<>();
        gifSignatures.add("GIF89a");
        gifSignatures.add("GIF86a");
        filesData.add(new FileExtension("GIF", gifSignatures));

        jpgSignatures = new HashSet<>();
        jpgSignatures.add("JFIF");
        filesData.add(new FileExtension("JPG", jpgSignatures));

        pdfSignatures = new HashSet<>();
        pdfSignatures.add("%PDF");
        filesData.add(new FileExtension("PDF", pdfSignatures));
    }

    public List<FileExtension> getFilesData() {
        return filesData;
    }
}
