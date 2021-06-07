package org.example;

import java.util.Scanner;

public class TroubleshootCarIssues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Is the car silent when you turn the key? y/n");
        String car_silent = scan.nextLine();

        if(car_silent.equals("y")){
            System.out.println("Are the battery terminals corroded? y/n");
            String terminals = scan.nextLine();
            if(terminals.equals("y")){
                System.out.println("Clean terminals and try starting again.");
            }
            else if(terminals.equals("n")){
                System.out.println("Replace cables and try again.");
            }
        }
        else if(car_silent.equals("n")){
            System.out.println("Does the car make a slicking noise? y/n");
            String slick = scan.nextLine();
            if(slick.equals("y")){
                System.out.println("Replace the battery.");
            }
            else if(slick.equals("n")){
                System.out.println("Does the car crank up but fail to start? y/n");
                String crank = scan.nextLine();
                if(crank.equals("y")){
                    System.out.println("Check spark plug connections.");
                }
                else if(crank.equals("n")){
                    System.out.println("Does the engine start and then die? y/n");
                    String start = scan.nextLine();
                    if(start.equals("y")){
                        System.out.println("Does you car have fuel injection? y/n");
                        String fuel = scan.nextLine();
                        if(fuel.equals("y")){
                            System.out.println("Get it in for service.");
                        }
                        else if(fuel.equals("n")){
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else if(start.equals("no")){
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
        else{
            System.out.println("you obviously did not enter what I wanted. Try again....");
        }
    }
}
