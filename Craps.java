//Morgan Feller
//Will Hartig

import java.util.Scanner;

class Craps {
	public static void main(String[] args) {

		System.out.println("Craps");
        
		int point = (int)(Math.random()*5+1);
		System.out.println("Dice 1: " + point);

		int point2 = (int)(Math.random()*5+1);
		System.out.println("Dice 2: " + point2);

		int pointT = (int)(point + point2);
		System.out.println("Total: " + pointT);

		if (pointT == 7) {
			System.out.println("Win");
		}
		else if (pointT == 11) {
			System.out.println("Win");
        }
        else if (pointT == 2) {
            System.out.println("You suck");
        }
        else if (pointT == 3) {
            System.out.println("You suck");
        }
        else if (pointT == 12) {
            System.out.println("You suck");
        }
        else { System.out.println("You continue");
            int MorganT = -1;
            do {
                int Morgan = (int)(Math.random()*5+1);
                int Morgan2 = (int)(Math.random()*5+1);
                MorganT = (int)(Morgan + Morgan2);
                System.out.println("Dice 1: " + Morgan);
                System.out.println("Dice 2: " + Morgan2);
                System.out.println("Total: " + MorganT);
                if (MorganT == 7) {
                    System.out.println("You suck");
                }
                else if (MorganT == pointT) {
                    System.out.println("Win");
                }
                else { System.out.println("continue");
                }
            }while (MorganT != pointT);
        }

	}
}
