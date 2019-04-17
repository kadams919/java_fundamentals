package labs_examples.input_output.labs;

import java.io.*;
import java.util.ArrayList;

/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */
public class Exercise_04 {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList();

        String filePath = "/Users/katherineadams/CodingNomads/labs/java_fundamentals/java_fundamentals/src/labs_examples/input_output/labs/people.csv";


        try (BufferedReader br =
                     new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                people.add(mapValuesToPersonObject(values));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedWriter writer = null;

        try {

            writer = new BufferedWriter(new FileWriter("peoplev2.csv"));

            for(Person person : people) {
                System.out.println(person.toString());
                writer.write(person.toString());
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch(IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private static Person mapValuesToPersonObject(String[] values) {

        Person person = new Person();

        person.setFirstName(values[0]);
        person.setMiddleName(values[1]);
        person.setLastName(values[2]);
        person.setAge(Integer.parseInt(values[3]));

        return person;

    }
}