package com.company;

import java.util.Scanner;
import java.lang.Math.*;


public class Main {

    private static double areaFormulae(){
        int  option;
        double result, radius, pie = 3.1416, theta, diagonal1, diagonal2, breadth, height, length, sideA, sideB;

        System.out.println("\nSelect shape to calculate area");
        System.out.println("1.\tCircle");
        System.out.println("2.\tKite");
        System.out.println("3.\tParallelogram");
        System.out.println("4.\tRectangle");
        System.out.println("5.\tSector");
        System.out.println("6.\tSquare");
        System.out.println("7.\tTrapezium");
        System.out.println("8.\tTriangle");
        System.out.println("9.\tBack");

        System.out.print("\tYour Decision: ");

        Scanner scan = new Scanner(System.in);
        option = scan.nextInt();

        switch (option) {
            case 1:
                System.out.print("Enter Radius: ");
                radius = scan.nextDouble();
                System.out.print("\nRadius entered was: " +radius);

                result = radius*radius*pie;
                break;
            case 2:
                System.out.print("Enter Diagonal-1: ");
                diagonal1 = scan.nextDouble();
                System.out.print("Enter Diagonal-2: ");
                diagonal2 = scan.nextDouble();
                System.out.print("\nDiagonals entered were: " +diagonal1 +" and " +diagonal2);

                result = diagonal1*diagonal2*0.5;
                break;
            case 3:
                System.out.print("Enter Base-length: ");
                breadth = scan.nextDouble();
                System.out.print("Enter Height-length: ");
                height = scan.nextDouble();
                System.out.print("\nValues entered were: base = " +breadth +" and height" +height);

                result = breadth*height;
                break;
            case 4:
                System.out.print("Enter Length: ");
                length = scan.nextDouble();
                System.out.print("Enter Breadth: ");
                breadth = scan.nextDouble();
                System.out.print("\nValues entered were: Length = " +length +" and breadth" +breadth);

                result = breadth*length;
                break;
            case 5:
                System.out.print("Enter Theta: ");
                theta = scan.nextDouble();
                System.out.print("Enter Radius: ");
                radius = scan.nextDouble();
                System.out.print("\nValues entered were: Theta = " +theta +" and Radius" +radius);

                result = (theta/360)*pie*radius*radius;
                break;
            case 6:
                System.out.print("Enter Length: ");
                length = scan.nextDouble();
                System.out.print("\nLength entered was: " +length);

                result = length*length;
                break;
            case 7:
                System.out.print("Enter parallel Side-A: ");
                sideA = scan.nextDouble();
                System.out.print("Enter parallel Side-B: ");
                sideB = scan.nextDouble();
                System.out.print("Enter Height: ");
                height = scan.nextDouble();
                System.out.print("\nValues entered were: Sides A = " +sideA +" and B" +sideB +", and Height" +height);

                result = 0.5*sideA*sideB*height;
                break;
            case 8:
                System.out.print("Enter Base: ");
                breadth = scan.nextDouble();
                System.out.print("Enter Height: ");
                height = scan.nextDouble();
                System.out.print("\nValues entered were: Base = " +breadth +" and Height" +height);

                result = 0.5*breadth*height;
                break;
            case 0:
                result = 0;
                break;
            default:
                System.out.println("\nInvalid Decision");
                result = 0;
                break;
        }

        return result;
    }

    private static double perimeterFormulae(){
        int  option;
        double result, radius, pie = 3.1416, theta, sideA, sideB, sideC, sideD;

        System.out.println("\nSelect shape to calculate perimeter");
        System.out.println("1.\tCircle");
        System.out.println("2.\tKite");
        System.out.println("3.\tParallelogram");
        System.out.println("4.\tRectangle");
        System.out.println("5.\tSector");
        System.out.println("6.\tSquare");
        System.out.println("7.\tTrapezium");
        System.out.println("8.\tTriangle");
        System.out.println("9.\tBack");

        System.out.print("\tYour Decision: ");

        Scanner scan = new Scanner(System.in);
        option = scan.nextInt();

        switch (option) {
            case 1:
                System.out.print("Enter Radius: ");
                radius = scan.nextDouble();
                System.out.print("\nRadius entered was: " +radius);

                result = 2*pie*radius;
                break;
            case 2:
                System.out.print("Enter adjacent sides of different length\n Enter Side-1: ");
                sideA = scan.nextDouble();
                System.out.print("Enter Side-2: ");
                sideB = scan.nextDouble();
                System.out.print("\nValues entered were: Side-1 = " +sideA +" and Side-2" +sideB);

                result = (sideA+sideB)*2;
                break;
            case 3:
                System.out.print("Enter length of parallel Side-1: ");
                sideA = scan.nextDouble();
                System.out.print("Enter length of parallel Side-2: ");
                sideB = scan.nextDouble();
                System.out.print("\nValues entered were: Side-1 = " +sideA +" and Side-2" +sideB);

                result = (sideA+sideB)*2;
                break;
            case 4:
                System.out.print("Enter length of parallel Side-1: ");
                sideA = scan.nextDouble();
                System.out.print("Enter length of parallel Side-2: ");
                sideB = scan.nextDouble();
                System.out.print("\nValues entered were: Side-1 = " +sideA +" and Side-2" +sideB);

                result = (sideA+sideB)*2;
                break;
            case 5:
                System.out.print("Enter Theta: ");
                theta = scan.nextDouble();
                System.out.print("Enter Radius: ");
                radius = scan.nextDouble();
                System.out.print("\nValues entered were: Theta = " +theta +" and Radius" +radius);

                result = (theta/180)*pie*radius;
                break;
            case 6:
                System.out.print("Enter Length: ");
                sideA = scan.nextDouble();
                System.out.print("\nLength entered was: " +sideA);

                result = 4*sideA;
                break;
            case 7:
                System.out.print("Enter Side-A: ");
                sideA = scan.nextDouble();
                System.out.print("Enter Side-B: ");
                sideB = scan.nextDouble();
                System.out.print("Enter Side-C: ");
                sideC = scan.nextDouble();
                System.out.print("Enter Side-D: ");
                sideD = scan.nextDouble();
                System.out.print("\nValues entered were: Sides A = " +sideA +", B = " +sideB +", C = " +sideC +"and D = " +sideD);

                result = sideA+sideB+sideC+sideD;
                break;
            case 8:
                System.out.print("Enter Side-A: ");
                sideA = scan.nextDouble();
                System.out.print("Enter Side-B: ");
                sideB = scan.nextDouble();
                System.out.print("Enter Side-C: ");
                sideC = scan.nextDouble();
                System.out.print("\nValues entered were: Sides A = " +sideA +", B = " +sideB +"and C = " +sideC);
                result = sideA+sideB+sideC;
                break;
            case 0:
                result = 0;
                break;
            default:
                System.out.println("\nInvalid Decision");
                result = 0;
                break;
        }

        return result;
    }

    private static void rightAngledTriangles(){
        int option;
        double result, sideA, sideB, sideC, theta1, theta2;

        System.out.println("\nSelect right-angled triangle problem to solve");
        System.out.println("1.\tCosine Rule");
        System.out.println("2.\tPythagoras Theorem");
        System.out.println("3.\tSine Rule");
        System.out.println("0.\tBack");

        System.out.print("\tYour Decision: ");

        Scanner scan = new Scanner(System.in);
        option = scan.nextInt();

        switch (option) {
            case 1:
                System.out.print("Enter length of Side-1: ");
                sideA = scan.nextDouble();
                System.out.print("Enter length of Side-2: ");
                sideB = scan.nextDouble();
                System.out.print("Enter Degree of angle to intersecting sides: ");
                theta1 = scan.nextDouble();

                result = Math.pow(sideA,2)+Math.pow(sideB,2)-(2*sideA*sideB*Math.cos(theta1));
                sideC = Math.sqrt(result);

                System.out.println("\nThe length of the third side is " +sideC);

                break;
            case 2:
                System.out.print("Enter length of Side-1: ");
                sideA = scan.nextDouble();
                System.out.print("Enter length of Side-2: ");
                sideB = scan.nextDouble();

                result = Math.pow(sideA,2)+Math.pow(sideB,2);
                sideC = Math.sqrt(result);

                System.out.println("\nThe length of the third side is " +sideC);
                break;
            case 3:
                System.out.print("Enter length of Side-1: ");
                sideA = scan.nextDouble();
                System.out.print("Enter length of Side-2: ");
                sideB = scan.nextDouble();
                System.out.print("Enter Degree of angle opposite Side-2: ");
                theta2 = scan.nextDouble();

                result = sideA*(Math.sin(theta2)/sideB);
                theta1 = Math.asin(result);

                System.out.println("\nThe angle opposite Side-1 is " +theta1);
                break;
            case 0:
                break;
            default:
                System.out.println("\nInvalid Decision: ");
                break;
        }
    }

    private static void indices(double base){
        int option;
        double result, power1, power2;

        System.out.println("\nSelect your required law");
        System.out.println("1.\tDivision Law");
        System.out.println("2.\tInverse-power Law");
        System.out.println("3.\tMultiplication Law");
        System.out.println("4.\tPower Law");
        System.out.println("5.\tRoot Law");
        System.out.println("6.\tRoot Power Law");
        System.out.println("7.\tUnity Law");
        System.out.println("8.\tZero-power law");
        System.out.println("0.\tBack");

        System.out.print("\tYour Decision: ");

        Scanner scan = new Scanner(System.in);
        option = scan.nextInt();

        switch (option) {
            case 1:
                System.out.print("Enter Power 1: ");
                power1 = scan.nextDouble();
                System.out.print("Enter Power 2: ");
                power2 = scan.nextDouble();
                System.out.print("\nPowers entered were: " + power1 + " and " + power2);

                result = power1 - power2;

                System.out.print("Result: " + Math.pow(base,result));
                break;
            case 2:
                System.out.print("Enter Negative Power only: ");
                power1 = scan.nextDouble();
                System.out.print("\nPower entered was: -" + power1);

                result = power1;

                System.out.print("Result: " + (Math.pow(base,result)));
                break;
            case 3:
                System.out.print("Enter Power 1: ");
                power1 = scan.nextDouble();
                System.out.print("Enter Power 2: ");
                power2 = scan.nextDouble();
                System.out.print("\nPowers entered were: " + power1 + " and " + power2);

                result = power1 + power2;

                System.out.print("Result: "+ Math.pow(base,result));
                break;
            case 4:
                System.out.print("Enter inner Power: ");
                power1 = scan.nextDouble();
                System.out.print("Enter outer Power: ");
                power2 = scan.nextDouble();
                System.out.print("\nPowers entered were: inner = " + power1 + " and outer = " + power2);

                result = power1 * power2;

                System.out.print("Result: " + Math.pow(base,result));
                break;
            case 5:
                System.out.print("Enter Power's Denominator: ");
                power1 = scan.nextDouble();
                System.out.print("\nPowers entered was: Denominator = " + power1);

                result = Math.pow(base,(1/power1));

                System.out.print("Result: " + result);

                break;
            case 6:
                System.out.print("Enter Power's Numerator: ");
                power1 = scan.nextDouble();
                System.out.print("Enter Power's Denominator: ");
                power2 = scan.nextDouble();
                System.out.print("\nPowers entered were: Numerator = " + power1 + " and Denominator = " + power2);

                result =  Math.pow(Math.pow(base,(1/power1)),power2);

                System.out.print("Result: " +result);

                break;
            case 7:
                System.out.print("Power is 1");

                System.out.print("Result: " + base);
                break;
            case 8:
                System.out.print("Power is 0");

                System.out.print("Result: 1");
                break;
            case 0:
                break;
            default:

                System.out.print("Invalid Operation");
                break;
        }
    }

    private static void quadraticEquation(){
        double a, b, c, x1, x2;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Coefficient of X-square term: ");
        a = scan.nextDouble();
        System.out.print("Enter Coefficient of X term: ");
        b = scan.nextDouble();
        System.out.print("Enter Constant term: ");
        c = scan.nextDouble();
        System.out.print("\nEntered Values\n\tCoefficient of X-square: " +a +"\n\tCoefficient of X: " +b +"\n\tConstant Term: " +c);

        x1 = (-b+Math.pow((Math.pow(b,2)-(4*a*c)),0.5))/(2*a);
        x2 = (-b-Math.pow((Math.pow(b,2)-(4*a*c)),0.5))/(2*a);

        System.out.print("Results: X1 = " +x1 +" and X2 = " +x2);
    }

    private static void mathsFormulae(){
        int formulaNo;
        double result, test = 0, base;
        Scanner scan = new Scanner(System.in);

        do {

            System.out.println("\nSelect a Math problem");
            System.out.println("1.\tAreas");        //shapes, circle
            System.out.println("2.\tPerimeters");   //shapes
            System.out.println("3.\tRight-angle Triangles");    //pythagoras, cosine & sine rule
            System.out.println("4.\tIndices");      //the 7 laws. basic
            System.out.println("5.\tQuadratic Eqn");//Quadratic formula
            System.out.println("0.\tBack");

            System.out.print("Option: ");

            formulaNo = scan.nextInt();

            switch (formulaNo){
                case 1:
                    //Areas
                    result = areaFormulae();
                    if(result == test){}
                    else
                        System.out.print("Area is: " +result +"unitSquared");
                    break;
                case 2:
                    //Perimeter
                    result = perimeterFormulae();
                    if(result == test){}
                    else
                        System.out.print("Perimeter is: " +result +"units");
                    break;
                case 3:
                    //Triangles
                    rightAngledTriangles();
                    break;
                case 4:
                    //Indices
                    System.out.print("Enter number's base");

                    base = scan.nextInt();
                    System.out.print("Base entered was: " +base);

                    indices(base);
                    break;
                case 5:
                    //Quadratic Equation
                    quadraticEquation();
                    break;
                case 0:
                    //back
                    break;
                default:
                    break;
            }

        }while(formulaNo != 0);
    }

    private static void characterRemoval(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input String:");
        String Sentence = scan.nextLine();


        char Caps[] = {' ','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char Small[] = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};


        System.out.println("String entered: " +Sentence);

        for (int i = 0; i < Sentence.length(); i++) {
            for(int j = 0; j < 26; j++){
                if (Sentence.charAt(i) == Caps[j]) {
                    System.out.print(Small[j]);
                    //System.out.println(Sentence.charAt(i));
                }
                if (Sentence.charAt(i) == Small[j]) {
                    System.out.print(Sentence.charAt(i));
                    //System.out.println(Sentence.charAt(i));
                }
            }
        }
    }

    private static void wordCounter(){
        int counter = 0;
        char prevChar = '\0';

        Scanner scan = new Scanner(System.in);
        System.out.print("Input String: ");
        String Sentence = scan.nextLine();

        System.out.println("Sentence entered: " +Sentence);

        for (int i = 0; i < Sentence.length(); i++) {
            if (prevChar == ' ') {
                prevChar = Sentence.charAt(i);
            }
            else if (Sentence.charAt(i) == ' ') {
                counter++;
                prevChar = Sentence.charAt(i);
            }

            if((i == (Sentence.length()-1)) && (prevChar != ' '))
                counter++;
        }

        if(counter == 1)
            System.out.println(counter +" word found");
        else if (counter > 1)
            System.out.println(counter +" words found");
        else
            System.out.println("NO word found");
    }

    private static void wordSearch(){
        int isFound;
        String input;
        Scanner scan = new Scanner(System.in);

        String poem = "I loved you first: but afterwards your love\n" +
                "Christina Rossetti (1830 - 1894)\n" +
                "‘Love knows not ‘mine’ or ‘thine’’:\n " +
                "Here Christina Rossetti champions mutual, adoring love between two people.\n" +
                "Not just for the star-struck lover, this poem explores the\n" +
                "symbiotic relationship of love with charming modesty.\n" +
                "The canon of love poetry wouldn’t be complete without\n"+
                "the creative influence of Rossetti, whose body of work is\n"+
                "known for its devotional ballads.\n" +
                "I loved you first: but afterwards your love\n" +
                "Outsoaring mine, sang such a loftier song\n" +
                "As drowned the friendly cooings of my dove.\n" +
                "\n" +
                "Which owes the other most? my love was long,\n" +
                "And yours one moment seemed to wax more strong;\n" +
                "I loved and guessed at you, you construed me\n" +
                "And loved me for what might or might not be –\n" +
                "Nay, weights and measures do us both a wrong.\n" +
                "For verily love knows not ‘mine’ or ‘thine;’\n" +
                "With separate ‘I’ and ‘thou’ free love has done,\n" +
                "For one is both and both are one in love:\n" +
                "Rich love knows nought of ‘thine that is not mine;’\n" +
                "Both have the strength and both the length thereof,\n" +
                "Both of us, of the love which makes us one.";
        System.out.println(poem);

        System.out.print("\n\nSearch: ");

        input = scan.nextLine();

        isFound = poem.indexOf(input);

        if(isFound > 0){
            System.out.println("\nString is Found");
            System.out.print("at position index " +isFound);
        }
        else
            System.out.println("\nString is NOT Found");
    }

    public static void main(String[] args) {

        int option;

        do{
            System.out.println("\nMain Menu\nA multipurpose program");
            System.out.println("1.\tWord counter");
            System.out.println("2.\tWord search");
            System.out.println("3.\tMaths Formulae");
            System.out.println("4.\tCharacter removal");
            System.out.println("5.\tExit");

            System.out.print("Option: ");

            Scanner scan = new Scanner(System.in);

            option = scan.nextInt();

            switch (option){
                case 1:
                    //Word counter
                    wordCounter();
                    break;
                case 2:
                    //Word search
                    wordSearch();
                    break;
                case 3:
                    //Maths Formulae
                    mathsFormulae();
                    break;
                case 4:
                    //Character removal
                    characterRemoval();
                    break;
                case 5:
                    //Exit
                    break;
                default:
                    break;

            }
        }while(option != 5);
    }
}
