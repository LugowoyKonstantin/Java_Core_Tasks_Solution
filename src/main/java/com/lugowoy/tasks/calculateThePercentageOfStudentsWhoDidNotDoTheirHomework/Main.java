package com.lugowoy.tasks.calculateThePercentageOfStudentsWhoDidNotDoTheirHomework;

import com.lugowoy.helper.io.reading.Reader;
import com.lugowoy.helper.io.reading.ReadingConsole;

/** Created by Konstantin Lugowoy on 17.06.2017. */

public class Main {

    public static void main(String[] args) {

        int numberOfStudentsWhoDidTheirHomework = enterNumberOfStudents("Enter the number of students who did their homework :");

        int numberOfStudentsWhoDidNotDoTheirHomework = enterNumberOfStudents("Enter the number of students who did not do their homework :");

        double percentageOfStudentsWhoDidNotDoTheirHomework = (double) (numberOfStudentsWhoDidTheirHomework + numberOfStudentsWhoDidNotDoTheirHomework)
                                                                        * numberOfStudentsWhoDidNotDoTheirHomework / 100;

        System.out.printf("Percentage of students who did not do their homework : %.2f",
                                                                          percentageOfStudentsWhoDidNotDoTheirHomework);

    }

    private static int enterNumberOfStudents(String msg) {
        Reader reader = Reader.getReader(new ReadingConsole());
        int numberOfStudents;

        System.out.println(msg);
        while (true) {
            numberOfStudents = reader.readInt();
            if (numberOfStudents >= 0) {
                break;
            } else {
                System.out.println("Number of students must be a positive number or is equal zero.");
                System.out.println("Re-enter : ");
            }
        }
        return numberOfStudents;
    }

}

