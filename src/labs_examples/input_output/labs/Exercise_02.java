package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        char c;
        File file = new File("src/labs_examples/input_output/files/char_data.txt");
        FileOutputStream fout = null;

        try {
            int i;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            fout = new FileOutputStream("exercise_02.txt");
            while ((i = bufferedReader.read()) != -1){
                i = (char) i;
                if(i == 'a') {
                    fout.write('-');
                } else if(i == 'e') {
                    fout.write('~');
                } else {
                    fout.write(i);
                }
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fout.close();
            } catch(IOException ex) {
                ex.printStackTrace();
            }
        }

        try(FileInputStream fin = new FileInputStream("exercise_02.txt")) {
            int i;

            while ((i = fin.read()) != -1){
                i = (char) i;
                if(i == '-') {
                    System.out.print('a');
                } else if(i == '~') {
                    System.out.print('e');
                } else {
                    System.out.print((char) i);
                }
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
