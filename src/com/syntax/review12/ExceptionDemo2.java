package com.syntax.review12;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        String name="!Batch 15 is SMART";
        try{
            System.out.println(name.charAt(-1));//StringIndexOutOfBoundException

        }catch(StringIndexOutOfBoundsException e) {
            /*
            ass a tester you will always use printStackTrace
             */
            //this method provide all the information to find and fix issue
            e.printStackTrace();
        }catch (NullPointerException e){
            /*
            if we are interested in only the message we can uer getMessage method
             */
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("rest of the program");
    }
}
