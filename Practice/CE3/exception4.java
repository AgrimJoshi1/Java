package Practice.CE3;

public class exception4 {
    static class abc extends Exception{
        abc(String message){
            super(message);
        }
    }
    public static void main(String[] args) {

        //throw
        int age = 15;
         

        try{
            if(age<18){
            throw new abc("Not eligible");
        }
            System.out.println(age<18);


        }
        catch(abc e){
            System.out.println(e.getMessage());
        }

       
    }
    
}
