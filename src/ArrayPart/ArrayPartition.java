package ArrayPart;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayPartition {

    // 1st line take number of element
    // 2nd line take elements

    public static void main(String[] args) {
        // TODO: create test

        try {
            // TODO: throw out invalid value
            var br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Array size: ");
            var size = Integer.parseInt(br.readLine());

            var arrayNums = new int[size];
            System.out.println(size + " elements: ");
            var nums = br.readLine();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
