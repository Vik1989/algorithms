package InterviewMCQs;

public class Base {
    public int p;
    protected int k;

}

 class Test{

      public static void main(String[] args) {

          SubBase subBase = new SubBase();
          subBase.p = 10;
          subBase.k = 20;

          subBase.display();
      }
  }
class SubBase extends Base
{
 int k;
 void display(){

     super.p =3;
     super.k = 10;

    System.out.println(p + "  "+k);
 }
Integer t;
}