/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.curso.ejerciciosjava;

/**
 *
 * @author jlunaque
 */
public class EjerciciosJava {

    /**
     *
     * @param word
     * @return
     */
    public static boolean isPalindrome(String word){
        boolean isPalindrome = true;
        String word1 = word.replaceAll(" ", "");
        
        for(int i=0; i<word1.length(); i++){
            if(word1.charAt(i)!=word1.charAt(word1.length()-i-1)){
                isPalindrome = false;
                System.out.println("La palabra no es palindromo");
            }
        }
        return isPalindrome;
        
    }
    
    public static boolean isCapicua(int number){ // palindromo para numeros
        boolean isCapicua = true;
        int remainder;
        int reversed = 0;
        int aux_number = number;
        
        while(aux_number > 0){
            remainder = aux_number % 10;
            reversed = reversed*10 + remainder;
            
            aux_number = aux_number/10;
        }
        
        if (number!=reversed){
            isCapicua = false;
        }
        
        return isCapicua;
    }
    
    public static int factorial(int number){
        int factorial = 1;
        for(int i=number; i>1; i--){
            factorial = factorial*i;
        }
        return factorial;
    }
    
    public static int mcd(int number1, int number2){  // maximo comun divisor usando el algoritmo de euclides
        int remainder = 0;
        while(number1 % number2 != 0){
            remainder = number1 % number2;
            number1 = number2;
            number2 = remainder;
        }
        return remainder;
        
    }
    
    /**
     *
     * @param number
     * @return
     */
    public static int cuentaCifras(int number){ // funcion que cuenta el numero de cifras de un numero 
        int cociente = 1;
        int counter = 0;
        while(cociente != 0){
            cociente = number / 10;
            number = cociente;
            counter = counter +1;
        }
        return counter;
    }
    
    public static boolean isAmstrong(int number){
        boolean isAmstrong = true;
        int reminder = 1;
        int cociente;
        int suma = 0;
        int aux_number = number;
        int cifras = cuentaCifras(number);
        while(reminder != 0){
            reminder = aux_number % 10;
            cociente = aux_number / 10;
            aux_number = cociente;
            suma = (int) (suma + Math.pow(reminder, cifras));
            }
        
        if(suma != number){
            isAmstrong = false;
        }
        
        return isAmstrong;
        
    }
    
    public static String reverse(String word){
        String reversed = "";
        for(int i = word.length() - 1; i >= 0; i--){
            reversed = reversed + word.charAt(i);    
        }
        return reversed;
    }
    
    public static int cuentaPaquetes(int kilos){   
        int remainder;
        int counter=0;
        if(kilos<0){
            throw new IllegalArgumentException("Please enter a positive number of kilos!!");
        }
        remainder = kilos % 5;
        if(remainder == 0){
            counter = kilos/5;
        }
        else if(remainder > 3 && remainder < 5){
            counter = kilos/5 + 2;
        }
        else if(remainder==3){
            counter = kilos/5 + 1;
        }
        else if(remainder<3 && remainder>0){
            counter = kilos/5 + remainder;
        }
        
        return counter;
        
    }
    
    public static int equivalenciaRoman(char leter){ // funcion que establece equivalencias entre las letras romanas y su
        switch(leter){                               // valor numerico decimal
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            default:
                return 1000;
                
        }
    }
    
    public static int romanoDecimal(String roman){  // funcion que pasa de romano a decimal
        int counter = 0;
        int decimal=0;
        boolean hadFinished = false;
        int left;
        int right;
        while(counter < roman.length() && hadFinished == false){
           if(counter == roman.length() - 1){
              decimal = decimal + equivalenciaRoman(roman.charAt(counter));
              hadFinished = true;
           }
           if (hadFinished == false){
               left = equivalenciaRoman(roman.charAt(counter));
               right = equivalenciaRoman(roman.charAt(counter + 1));  
           
           
           
                if (left >= right){
                    counter = counter + 1;
                    decimal = decimal + left;
                }
                else{
                    counter = counter + 2;
                    decimal = decimal + right - left;
                }
           } 
           
            
        }
        return decimal;
        
    } 
    
    public static int cuentaDias(String fecha1, String fecha2){
        
        return 0;
        
    }
    
    public static int recursivoFibonacci(int n){  // Fibonacci de manera recursiva
        if (n==1){
            return 0;
        }
        else if (n==0){
            return 1;
        }
        else return recursivoFibonacci(n-1) + recursivoFibonacci(n-2);
    }
    
    public static int Fibonacci(int n){   // Fibonacci de manera no recursiva
        int[] vector = new int[n];
        vector[0] = 1;
        vector[1] = 1;
        for(int i=2; i<n; i++){
            vector[i] = vector[i-1] + vector[i-2];
        }
        return vector[n-1];
    }
    
    public static void main(String[] args) {
        /*
        String prueba = "monja";
        int prueba1 = 848;
        int number = 656;
        int number2 = 153;
        int kilos = 55;
        String romano = "MCMLIII";
        
        System.out.println("Hello World!");
        System.out.println(prueba + " es un palindromo? " + isPalindrome(prueba));
        System.out.println(prueba1 + " es un numero capicua? " + isCapicua(prueba1));
        //System.out.println("El factorial de " + number + " es " + factorial(number));
        System.out.println("El mcd de " + prueba1 + " y " + number + " es " + mcd(prueba1,number));
        System.out.println("El numero " + prueba1 + " tiene " + cuentaCifras(prueba1) + " cifras.");
        System.out.println("El numero " + number2 + " es Amstrong? " + isAmstrong(number2));
        System.out.println(reverse(prueba));
        System.out.println("Para " + kilos + " kilos necesito " + cuentaPaquetes(kilos) + " paquetes de 5, 3, 1 kg. ");
        System.out.println(romanoDecimal(romano));
        */
        
        /*
        System.out.println(Fibonacci(10));
        Supermarket merca = new Supermarket("Mercadona");
        Product galleta = new Product(1.55, "Galleta Hacendado");
        Product fuet = new Product(2.56, "Espetec Hacendado casa Tarradella");
        Product whisky = new Product(6.20, "Whisky Callander 37.5 grados");
        merca.addProduct(galleta);
        merca.addProduct(fuet);
        merca.addProduct(whisky);
        merca.printProducts();
        */
        
        Calculator calc = new Calculator();
        Sum sum = new Sum();
        sum.setNum1(5);
        sum.setNum2(89);
        
        calc.setOperation(sum);
        System.out.println(calc.operate());
        
        
        
    }
    
    
    
}
