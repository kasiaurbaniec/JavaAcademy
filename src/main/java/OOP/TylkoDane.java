package OOP;
/*
@author K Urbaniec
@since 2019.02.13

 */
public class TylkoDane {
   public TylkoDane() {
   }

   public void setI(int i) {
      this.i = i;
   }

   public void setD(double d) {
      this.d = d;
   }

   int i;
 double d;

   public TylkoDane(int i, double d) {
      this.i = i;
      this.d = d;
   }

   @Override
   public String toString() {
      return "TylkoDane{" +
              "i=" + i +
              ", d=" + d +
              '}';
   }
}
