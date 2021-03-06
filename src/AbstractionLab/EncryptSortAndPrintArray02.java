package AbstractionLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EncryptSortAndPrintArray02 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n =  Integer.parseInt(reader.readLine());
        String [] names = new String[n];
        int [] sumOfNames = new int[names.length];

        for (int i = 0; i < n; i++) {
            String name = reader.readLine();
            names[i] = name;
        }

        for (int i = 0; i < n; i++) {
            for (char letter : names[i].toCharArray()) {
                int sum = 0;
                if (letter == 'a' | letter == 'o' | letter == 'e' | letter == 'i' | letter == 'u'
                        |letter == 'A' | letter == 'O' | letter == 'E' | letter == 'I' | letter == 'U'){
                    sum += letter * names[i].length();
                }else {
                    sum += letter / names[i].length();
                }
                sumOfNames[i] += sum;
            }
        }

        Arrays.sort(sumOfNames);

        for (int name : sumOfNames) {
            System.out.println(name);
        }
    }
}
