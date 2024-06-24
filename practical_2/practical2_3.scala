

object salary{

  var nor_hours = 40;
  var ot_hours = 30;
  var tax_rate = 0.12;

  def main(args : Array[String])={

    def calculateSalary(nor_hours:Int, ot_hours:Int ):Double = {

        var total_salary = (nor_hours*250) + (ot_hours*85);

        return total_salary * (1 - tax_rate);
    }

    var salary = calculateSalary(nor_hours, ot_hours);
    println("Employee's salary : " + salary + " Rs");
  }
}
