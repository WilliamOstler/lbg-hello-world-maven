package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(sayHello());
        System.out.println(sayHelloToSomeone("SDAlice"));
        System.out.println(sayHelloToSomeone("BobW"));
        System.out.println(sayHelloToSomeone("Ch54arlie"));
        System.out.println(sayHelloToSomeone("Zena"));
        System.out.println(sayHelloToSomeone("Wiqlliam"));
        System.out.println(sayGoodbye());
    }

    public static String sayHello(){
        return "Hello World!";
    }

    public static String sayGoodbye(){
        return "Goodbye World!";
    }

    public static String sayHelloToSomeone(String name){
        return "Hello " + name ;
    }
}
