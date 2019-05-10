package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        String filePath = "src/labs_examples/input_output/files/byte_data";
        int j = 0;

        try {
            fileInputStream = new FileInputStream(filePath);
            fileOutputStream = new FileOutputStream("exercise_01.txt");

            do {
                for(int i = 0; i < 5; i++) {
                    j = fileInputStream.read();
                    if(j != -1) {
                        fileOutputStream.write(j);
                    }
                }
            } while (j != -1);

        } catch(FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch(IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                if(fileInputStream != null) {
                    fileInputStream.close();
                }

                if(fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch(IOException ioException) {
                ioException.printStackTrace();
            }

        }
    }

}
class Example {
    public static void main(String[] args) {

        int[] vals = {1,2,3,4,5};

        for(int i = 0; i < vals.length/2; ++i){
            int temp = vals[i];
            vals[i] = vals[vals.length - 1 -i];
            vals[vals.length - 1 -i] = temp;
        }

        for(int i : vals){
            System.out.println(i);
        }

    }
}
