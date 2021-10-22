/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise1;

/**
 *
 * @author Oluwaseun Samuel
 */
public class Practise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Data Types
       int myNum = 5;
        short myNum1 = 30000;
        int myNum2 = 4000022;
        long myNum3 = 7748884889L;
        float myNum4 = 132.83883f;
        double myNum5 = 0.9494388448d;
        float myNum6 = 23e3f;
        double myNum7 = 3929e29d;
        boolean isJavaFun = true;
        char myGrade ='A';
        String word = "Hello World";
        System.out.println(word);
        System.out.println(myGrade);
        System.out.println(isJavaFun);
        System.out.println(myNum);
        System.out.println(myNum1);
        System.out.println(myNum2);
        System.out.println(myNum3);
        System.out.println(myNum4);
        System.out.println(myNum5);
        System.out.println(myNum6);
        System.out.println(myNum7);
        
       byte myNum42 = 45;
       float myShort = myNum42;
       double myDouble= 4.383d;
       int myInt = (int)myDouble;
       System.out.println(myDouble);
       System.out.println(myInt);
        
       //Printing out Numbers 
       int sum1 = 84848+8828;
       int sum2 = 7575775+sum1;
       int sum3 = sum1+sum2;
       System.out.println(sum3);
       
       //f +=4;
       //Manipulating Texts
       String wordes = "Hello Nestor";
       System.out.println(wordes);
       System.out.println("The lenght of the word is: " + word.length());
       String text = "Please locate where 'locate' is";
       System.out.println(word.toUpperCase());
       System.out.println(word.toLowerCase());
       System.out.println(text.indexOf("is"));
       System.out.println(text.indexOf("Please"));
       String firstname = "John";
       String lastname = "Doe";
       System.out.println(firstname+" "+lastname);
       System.out.println(firstname.concat(lastname));
       System.out.println("Mom said \"Come here Jerry or i will box your ears\", He ran swiftly towards her.");
       System.out.println("It\'s is ok");
       System.out.println("The character \\ is called a backlash");
       String num1 = "4";
       String num2 = "7" ;
       System.out.println(num1+num2);
       
       //Math Functions
       System.out.println (Math.max(3, 7));
       System.out.println(Math.min(298.474, 74.2762));
       System.out.println(Math.sqrt(49));
       System.out.println(Math.abs(-4774.3847));
       
        //Random Numbers 
       int randomNumber = (int)(Math.random()*10);
       System.out.println(randomNumber);
       
       //Boolean
       boolean isJavaFunr = true;
       boolean iLikeFood = false;
       System.out.println(isJavaFunr);
       System.out.println(iLikeFood);
       
       // Comparison
       int num21=6;
       int num23= 76;
       System.out.println(num21<num23);
       System.out.println(num21 == 23);
       
       // if-else
       int num43 = 43;
       int num25 = 24;  
       if (num43<num25)
       {
           System.out.println("num1 is greater than num2");
       } else
       {
           System.out.println ("num1 is less than num2");
       }
        
       
       int time = 70;
       //if - else-if - else
       if (time<18)
       {
           System.out.println("Good morning");
       }
       else if(time<30)
       {
           System.out.println("Good afternoon");
       }
       else 
       {
           System.out.println("Good evening");
       }
       //Shorter Iteration of if-else
       int timer = 64;
       String worded = (timer>73)? "Good morning":"Good evening";
       System.out.println(worded);
       
       int amount = 10000;
       String status = (amount > 30000) ? "Bigger boy": "Sapa";
       System.out.println(status);
        
       int num = 405;
       String wordem = (num>75) ? "greater":"lesser";
       System.out.println(num+" is "+wordem);
       
       //Switch
       int day = 7;
       switch (day){
           case 1 :
               System.out.println("Monday");
               break;
           case 2:
               System.out.println("Tuesday");
               break;
           case 3 :
               System.out.println("Wednesday");
               break;
           case 4:
               System.out.println("Thursday");
               break;
           case 5 :
               System.out.println("Friday");
               break;
           case 6:
               System.out.println("Saturday");
               break;
           case 7:
               System.out.println("Sunday");
               break;
               
       }
       
       switch("windy"){
           case "rainy":
               System.out.println("Umbrella");
               break;
           case "sunny":
               System.out.println("Sunscreen tan");
               break;
           case "stormy":
               System.out.println("Indoors");
               break;
           case "windy":
               System.out.println("Camera");
           
       }
        
       int daynum = 2;
       switch(daynum){
           case 6 :
               System.out.println("Today is Saturday");
               break;
           case 7:
               System.out.println("Today is Sunday");
               break;
           default: 
               System.out.println("Can't wait for the weekend!");
       } 
        
       //Do While loop
       int number1 = 1;
       do{
           System.out.println("Hello World");
           number1++;
       }
       while( number1< 5);
       int me = 0;
       do{
           System.out.println("I love Nestor");
           me++;
       }
       while(me<5);

       //For loop
       for(int i = 2; i<=10; i+=2){
           System.out.println("I love Nestor "+i);
           
       }
       
       String[] cars = {"Volvo", "BMW", "Lambogini", "Ferarri", "Ford"};
       for(String car: cars){
           System.out.println(car);
       }
       
       //Break and Continue
       for (int i = 0; i<10; i++){
           if (i ==4){
               break;
           }
           System.out.println(i);
       }
       for(int i = 0; i <= 10; i++){
           if(i ==5){
               continue;
           }
           System.out.println(i);
       }
       
       int i =0;
       while (i <=10){
           if (i ==4){
               i++;
               continue;
           }
           System.out.println(i);
           i++;
       }
          
       int l = 1;
       while (l<= 10){
           if (l == 6){
               l++;
               continue;
               
           }
           System.out.println(l);
           l++;
       }
       //Arrays
       String [] carsName = {"Volvo","Ferarri", "Lamborgini","Audi","Ford"};
       for (String car : carsName){
           System.out.print(car+"\n");
       }
       carsName[2]="Range Rover";
       System.out.println(cars[2]);
       System.out.println(cars.length);
       
       int[][] myNumbers = {{9,5,6,2},{1,6,5,3}};
       for (int p = 0 ; p<myNumbers.length; p++){
           
           for (int j = 0; j<myNumbers[p].length; j++){
               System.out.println(myNumbers[p][j]);
           
       
       }
           
    
           
       

       


    
    }
    
    }}
