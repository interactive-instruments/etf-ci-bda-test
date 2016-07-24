// Just a simple JAVA test class for testing bda and ci
public class Antarctica
{
    // The good old game
    public static void main( String[] args )
    {
        final long month_4_5 = 10368000;
        final long max = System.currentTimeMillis() + month_4_5;
        while(System.currentTimeMillis()<max) {
          try{
            System.out.println("Helge: Reinhold!");
            Thread.sleep(500);
            System.out.println("Reinhold: Helge!");
            Thread.sleep(500);
          }catch(InterruptedException e){
          }
          // Todo: rent dog sledge
        }
    }
}
