

object expressions{

  def main(args: Array[String]) = {

   var a = 2;
   var b = 3;
   var c = 4;
   var d = 5;
   var k:Float = 4.3f;

   println((b-1)*a + c *(d-1));
   println(a+1);

   def ques4(c:Int):Int={
            return (c+1);
   }

   println(ques4(c));
  
   def ques5(c:Int,a:Int):Int = {
            return ((c+1)*(a+1));
  }

   println(ques5(c,a));
  }
}
