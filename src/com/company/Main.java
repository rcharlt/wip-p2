package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String toTitle ="";
        String toDesc="";
        String titleGet;
        String toPriority="";
        int personOption = 4;

        Scanner title = new Scanner(System.in);
        Scanner desc = new Scanner(System.in);
        Scanner priority = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Scanner get = new Scanner(System.in);
        Scanner newT = new Scanner(System.in);
        Scanner newD = new Scanner(System.in);
        Scanner newP = new Scanner(System.in);


        Map<String, ToDo> info = new HashMap<>();


        while (personOption != 0) {
            System.out.println("What would you like to do?");
            System.out.println("(1)- Add task. ");
            System.out.println("(2)- Remove task. ");
            System.out.println("(3)- Edit a task.");
            System.out.println("(4)- View full to-do list.");
            System.out.println("(0)- Exit ");
            while (!input.hasNextInt()) {
                System.out.println("Invalid input\nPlease try again, enter an integer value:");
                input.next();
            }
            ToDo toDo = new ToDo(toTitle, toDesc, toPriority);
            personOption = input.nextInt();

            if (personOption == 1) {
                System.out.println("What is the task name?");
                toTitle = title.nextLine();

                System.out.println("Give a description of the task.");
                toDesc = desc.nextLine();

                System.out.println("Give the task a priority (0 being the lowest priority, 5 being the highest priority).");
                toPriority = priority.nextLine();
                boolean isInt = false;
                while (!isInt) {
                    try {
                        Integer.parseInt(toPriority);
                        isInt = true;
                    } catch (NumberFormatException e) {
                        System.out.println(toPriority + " is not a valid integer. ");
                        toPriority = priority.nextLine();
                    }

                    info.put(toTitle, toDo);
                }
                } else if (personOption == 2) {
                    System.out.println("Enter a task name to remove it from the list.");
                    titleGet = get.nextLine();
                    info.remove(titleGet);
                    System.out.println(titleGet + " is now removed from the to-do list.");

                } else  if (personOption == 3){
                System.out.println("Enter the title of the task you want to edit.");
                titleGet = get.nextLine();
                String val = info.get(titleGet).toString();
                System.out.println("Enter a new title: ");
                String newTitle = newT.nextLine();
                toDo.setTitle(newTitle);
                System.out.println("Enter a new description: ");
                String descGet = newD.nextLine();
                toDo.setDescription(descGet);
                System.out.println("Enter a new priority: ");
                String newPri = newP.nextLine();
                toDo.setDescription(newPri);


                } else if(personOption == 4){
                System.out.println(info.toString());
            }
            }
        }
    }
