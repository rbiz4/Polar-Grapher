import java.util.*;
import apcslib.*;

public interface Function
{
  public void flipSign();
  public double getValue(double theta);
  public void draw (double angleFrom, int angleTo);
  public String toString();
}