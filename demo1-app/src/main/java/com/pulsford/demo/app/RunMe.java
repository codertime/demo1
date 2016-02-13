package com.pulsford.demo.app;

import java.io.*;

/**
 * Created by Phil on 13/02/2016.
 */
public class RunMe {

    public static void main(String[] values) throws IOException {

        if (values.length == 0) {
            values = new String[]{"/"};
        }
        FileWriter fileWriter = new FileWriter(values[0] + File.separator + "out.txt");
        fileWriter.append("line 1/n");
        fileWriter.append("line 2");
        fileWriter.close();
        File file = new File(values[0] + File.separator + "out2.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println("line 3");
        pw.print("line 4");
        pw.close();

        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);


        System.out.println("**********************************");
        System.out.println(getPropertyValue("sdl.id.ldap.loader.properties.file"));
        String text;
        while ((text = br.readLine()) != null) {
            System.out.println(text);
        }
        br.close();


    }

    private static String getPropertyValue(String name) {
        return System.getProperty(name);
    }

}
