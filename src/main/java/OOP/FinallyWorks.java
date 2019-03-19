package OOP;

public class FinallyWorks {
    static int count=0;

    public static void main(String[] args) {
        while(true){
            try{
                if(count++==0)

                    throw new ThreeException();
                    System.out.println("brak wyjątku");

            } catch (ThreeException e){
                System.out.println("Wyjątek Three Exception");
            }
            finally {
                System.out.println("W bloku finally");
            if(count==2)break;
            }
        }
    }
}
