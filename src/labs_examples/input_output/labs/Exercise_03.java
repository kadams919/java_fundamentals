package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {

        byte[] bytes = {3, 5, 19, 23};
        System.out.println("--------------------");
        System.out.println("Byte Stream One");

        try {
            ByteArrayInputStream input = new ByteArrayInputStream(bytes);
            int i = input.read();
            while(i != -1) {
                System.out.print(i + " ");
                i = input.read();
            }
            input.close();

        } catch(IOException ex) {
            ex.printStackTrace();
        }

        System.out.println("\n--------------------");
        System.out.println("Byte Stream Two");
        try {
            InputStream input1 = new FileInputStream("/Users/katherineadams/CodingNomads/labs/java_fundamentals/java_fundamentals/src/labs_examples/input_output/files/byte_data");
            InputStream input2 = new FileInputStream("/Users/katherineadams/CodingNomads/labs/java_fundamentals/java_fundamentals/src/labs_examples/input_output/files/char_data.txt");

            SequenceInputStream sequenceInputStream =
                    new SequenceInputStream(input1, input2);

            int data = sequenceInputStream.read();
            while(data != -1){
                System.out.print(data);
                data = sequenceInputStream.read();
            }
        } catch(FileNotFoundException ex) {
            ex.printStackTrace();
        } catch(IOException ex) {
            ex.printStackTrace();
        }

        System.out.println("\n--------------------");
        System.out.println("Character Stream One");

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("/Users/katherineadams/CodingNomads/labs/java_fundamentals/java_fundamentals/src/labs_examples/input_output/files/char_data_2.txt");
            outputStream = new FileWriter("exercise03-output.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } catch(FileNotFoundException ex) {
            ex.printStackTrace();
        } catch(IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch(IOException ex) {
                ex.printStackTrace();
            }
            System.out.println("Wrote exercise03-output.txt");
        }

        System.out.println("--------------------");
        System.out.println("Character Stream Two");
        StringReader stringReader = null;
        PushbackReader pushbackReader = null;
        try {
            stringReader = new StringReader("This is a string to read.");
            pushbackReader = new PushbackReader(stringReader, 4);

            int first = pushbackReader.read();
            pushbackReader.unread(first);

            char[] c = new char[2];
            pushbackReader.read(c);
            System.out.println(new String(c));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pushbackReader != null) {
                    pushbackReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("--------------------");
        System.out.println("Demonstrate using Buffer on Bytes");
        BufferedInputStream inputStream4 = null;
        try {
            inputStream4 = new BufferedInputStream(new FileInputStream("/Users/katherineadams/CodingNomads/labs/java_fundamentals/java_fundamentals/src/labs_examples/input_output/files/byte_data"));

            int c = 0;
            while((c = inputStream4.read()) != -1)
                System.out.print((char) c);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("--------------------");
        System.out.println("Demonstrate using Buffer on Chars");
        try {
            BufferedReader inputStream3 = new BufferedReader(new FileReader("/Users/katherineadams/CodingNomads/labs/java_fundamentals/java_fundamentals/src/labs_examples/input_output/files/KtoD.txt"));
            BufferedWriter outputStream3 = new BufferedWriter(new FileWriter("characteroutput.txt"));
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Wrote characteroutput.txt");
        }

        System.out.println("--------------------");
        System.out.println("Demonstrating DataInputStream and DataOutputStream");

        try ( DataOutputStream dataOutputStream =
                      new DataOutputStream(new FileOutputStream("file.dat")) ) {
            dataOutputStream.writeDouble(3.0);
            dataOutputStream.writeDouble(4.0);
            dataOutputStream.writeDouble(5.0);
        } catch(FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try ( DataInputStream dataInputStream =
                      new DataInputStream(new FileInputStream("file.dat")) ) {
            while(dataInputStream.available() > 0) {
                double a = dataInputStream.readDouble();
                System.out.println(a);
            }
        } catch(FileNotFoundException ex) {
            ex.printStackTrace();
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
