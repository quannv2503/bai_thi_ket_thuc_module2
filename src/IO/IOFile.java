package IO;

import model.Phonebook;
import service.Method;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFile {
    public void writeFile(ArrayList<Phonebook> list) throws IOException {
        File file = new File("data/phonebook.csv");
        PrintWriter fileWriter = new PrintWriter(file);
        for (Phonebook phonebook : Method.phonebooks) {
            fileWriter.println(phonebook.toCSV());
        }
        fileWriter.close();
    }

    public ArrayList<Phonebook> readFromFile() throws IOException {
        File file = new File("data/phonebook.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        ArrayList<Phonebook> list = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            String[] data = line.split(",");
            Phonebook phonebook = new Phonebook(data[0], data[1], data[2], data[3], data[4], data[5], data[6]);
            list.add(phonebook);
        }
        return list;
    }

}
