import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileProcessor{
    private File citiesFile,packagesFile,vehiclesFile,missionsFile,resultFile;
    private File[] files = new File[5];

    public FileProcessor(){}

    public void read(String[] args){
        for(int i=0; i<args.length; i++) {
            System.out.println("Reading file "+args[i]);
            files[i] = new File(args[i]);
        }
        for(File file : files) {
            if(file.getName().equals("cities.txt")) {citiesFile=file;}
            else if(file.getName().equals("packages.txt")) {packagesFile=file;}
            else if(file.getName().equals("vehicles.txt")) {vehiclesFile=file;}
            else if(file.getName().equals("missions.txt")) {missionsFile=file;}
            else if(file.getName().equals("result.txt")) {resultFile=file;}
            else{
                System.out.println("Unknown file");
                System.out.println("Usage: java Main <cities.txt> <packages.txt> <vehicles.txt> <missions.txt> <result.txt>");
                System.exit(0);
            }
        }
//        // Declaring loop variable
//        int i;
//
//        //Cities
//        StringBuilder citiesRaw = new StringBuilder();
//        FileReader fr = new FileReader(files[0]);
//        while (true) {
//            try {
//                if ((i = fr.read()) == -1) break;
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            // Print all the content of a file
//            citiesRaw.append((char) i);
//        }
//        String[] cities= citiesRaw.toString().split("\n");
//        System.out.println(cities.length+Arrays.toString(cities));
//
//        //Packages
//        StringBuilder packagesRaw = new StringBuilder();
//        fr = new FileReader(files[1]);
//        while (true) {
//            try {
//                if ((i = fr.read()) == -1) break;
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            // Print all the content of a file
//            packagesRaw.append((char) i);
//        }
//        String[] packages= packagesRaw.toString().split("\n");
//        System.out.println(packages.length+Arrays.toString(packages));
    }
}
