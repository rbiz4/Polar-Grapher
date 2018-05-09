import java.util.*;
import apcslib.*;

public class rose extends r
{
   private int a;
   private int b;
   private boolean isSin;
   
   public rose (DrawingTool Pen, SketchPad Paper)
   {
      super(Pen, Paper, 1);
      a = 1;
      b = 2;
      isSin = true;
   }
   
   public rose (DrawingTool Pen, SketchPad Paper, int Sign, int A, int B, boolean IsSin)
   {
      super(Pen, Paper, Sign);
      a = A;
      b = B;
      isSin = IsSin;
   }
   
   public double getValue(double theta)
   {
      double value = 0;
      
      if (isSin)
         value = a * Math.sin(b * theta);
         
      else
         value = a * Math.cos(b * theta);
      
      return value;
   }
   
   public String toString ()
   {
      String Return = "Length of one petal: " + (a / 2) + "\n";                      
      
      if (a % 2 == 0)
         Return += "Number of Petals: " + (2 * a) + "\n";
      else
         Return += "Number of Petals: " + a + "\n";
      
      if (isSin)
         Return += "Alignment: y-axis\n";
      else
         Return += "Alignment: x-axis\n";
      
      return Return;
   }
}