package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String toTitle;
        String toDesc;
        int toPriority;
        String titleGet;
        int personOption = 4;

        Scanner title = new Scanner(System.in);
        Scanner desc = new Scanner(System.in);
        Scanner priority = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Scanner get = new Scanner(System.in);


        HashMap<String, ToDo> info = new HashMap<>();


        while (personOption != 0) {
            System.out.println("What would you like to do?");
            System.out.println("(1)- Add task. ");
            System.out.println("(2)- Remove task. ");
            System.out.println("(3)- Edit a task.");
            System.out.println("(4)- View full to-do list.");
            System.out.println("(0)- Exit ");

            personOption = input.nextInt();

            if (personOption == 1) {
                System.out.println("What is the task name");
                toTitle = title.nextLine();

                System.out.println("Give a description of the task.");
                toDesc = desc.nextLine();

                System.out.println("Give the task a priority (0 being the lowest priority, 5 being the highest priority).");
                toPriority = priority.nextInt();

                ToDo toDo = new ToDo(toTitle,toDesc,toPriority);


                info.put(toTitle, toDo);

            } else if (personOption == 2) {
                System.out.println("Enter a task name to find out description and priority.");
                titleGet = get.nextLine();
                String val = info.get(titleGet).toString();
                System.out.println(val);

            } else if (personOption == 3) {
                System.out.println(info.toString());
            }

        }
    }
}