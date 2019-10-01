package model;

import java.io.*;
import java.util.Set;

public class Reader {

    private FilesData filesData = new FilesData();

    public String checkDataTypeOfFile(String fileName){
        try {
            String streamedData;
            File file = new File(fileName);
            BufferedReader bR = new BufferedReader(new FileReader(file));
            while ((streamedData =  bR.readLine()) != null){
                for (int i = 0; i < filesData.getFilesData().size(); i++) {
                    String fileExtension = filesData.getFilesData().get(i).getFileName();
                    String[] fileSignatures = filesData.getFilesData().get(i).fileSignaturesArray();
                    for (int j = 0; j < fileSignatures.length; j++) {
//                        System.out.println(fileSignatures[j]);
                        if(streamedData.contains(fileSignatures[j])){
                            return fileExtension;
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "EXTENSION NOT FOUND";
    }

}
