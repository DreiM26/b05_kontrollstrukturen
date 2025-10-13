// b05_kontrollstruktur
// g_geschachteltes_if

public class ABCAnalyse3
{
   public static void main(String [] args)
   {
      char prioritaet = 'X'; //nur 1 Buschtabe es ist mit ''
      
      if(prioritaet == 'A')
      {
         System.out.println("Hoch");
      }

         if(prioritaet == 'B')
         {
            System.out.println("Mittel");
         }
         else
         {
            System.out.println("Niedrig");
         }

      if(prioritaet == 'X')
      {
            System.out.println("Unzulaessiger Wert");
      }
      
   }
}
