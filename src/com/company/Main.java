package com.company;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Main {

    public static void main(String[] args) {
        int number = 1;
        int finishNumber = 20;
        int evensFound = 0;
        while (number <= finishNumber){
            if (!isAnEvenNumber(number)){
                number++;

                continue;
            }
            evensFound++;
            if(evensFound == 5){
                break;
            }


            number++;
            System.out.println("Heeeloooo");
            System.out.println("GtHubTest");
        }
        //isAnEvenNumber();

        System.out.println("Even number " + evensFound);
    }


    public static int Test1(int count) {

        while (count != 5) {

            if (count <= 2) {
                System.out.println("iteration count " + count);
            } else {
                System.out.println("This is a count " + count);

            }
            count++;
            if (count > 6) {
                System.out.println("Breaking the loop");
                break;
            }

        }
        return (0);

    }

    public static void Test2() {
        int count = 6;
        while (count != 6) {
            System.out.println("Count " + count);
            count++;

            for (int j = 6; j != 6; j++) {
                System.out.println("Count value is " + count);
            }
        }

        count = 1;
        do {

            System.out.println("Count value was " + count);
            count++;

            if (count > 100) {
                break;
            }

        } while (count != 6);

    }

    public static void isEvenNumber() {
        int numberCount = 1;
        boolean evenNumber = false;
        do {

            System.out.println("Count value was " + numberCount);
            numberCount++;
            if (numberCount > 100) {
                break;
            }

            int evenOnly = numberCount % 2;

            if (evenNumber) {
                System.out.println("Even Number Only" + evenOnly);
            }

        } while (numberCount == 100);

    }

    public static boolean isAnEvenNumber(int number){
        if((number % 2) == 0) {
            return true;
        }else {
            return false;
        }



    }


}