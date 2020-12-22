import dto.Employer;
import dto.JoinedEntity;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[]args) {

        String csvFile1 = "Test_Task1.csv";
        String csvFile2 = "Test_Task2.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";

        List<Employer> listOfEmployers = new ArrayList<>();
        HashMap<Integer, String> mapOfDepartments = new HashMap<>();

        try {

            System.out.println("First file: ");
            br = new BufferedReader(new FileReader(csvFile1));
            br.readLine(); //skip header line
            while ((line = br.readLine()) != null) {

                String[] employer = line.split(cvsSplitBy);
                listOfEmployers.add(new Employer(Integer.valueOf(employer[0]).intValue(),employer[1],employer[2],Integer.valueOf(employer[3]).intValue()));
                System.out.println("Employer Id " + employer[0]+ " , firstname = " + employer[1] + ", secondname = " + employer[2] + ", depId = " + employer[3]);

            }

            System.out.println("\n\n Second file: ");
            br = new BufferedReader(new FileReader(csvFile2));

            br.readLine(); //skip header line
            while ((line = br.readLine()) != null) {

                String[] department = line.split(cvsSplitBy);

                mapOfDepartments.put(Integer.valueOf(department[0]), department[1]);
                System.out.println("Department Id " + department[0]+ " , depName = " + department[1]);

            }

            List<JoinedEntity> joinedList = listOfEmployers.stream()
                    .map(employer -> new JoinedEntity(employer.getFirstName(), employer.getLastName(), mapOfDepartments.get(employer.getDepId())))
                    .collect(Collectors.toList());

            System.out.println("\n\n Joined file: ");
            for(JoinedEntity entity : joinedList){
                System.out.println(entity);
            }

            System.gc();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}