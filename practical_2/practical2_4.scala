

object theater{

  var perf_cost = 500;
  var attendee_cost = 3;

  var max_attendees = 140;
  var mid_attendees = 120;
  var min_attendees = 100;

  def get_profit(price:Int):Int = price match{
    
    case x if (price == 15) => calculate(price,mid_attendees);

    case x if (price == 10) => calculate(price,max_attendees);

    case x if (price == 20) => calculate(price,min_attendees);
  }

  def calculate(price:Int, attendence:Int):Int = {
    
    return ((price * attendence) - (500 + (3 * attendence)));

  }

  def main(args : Array[String]) = {

        var profit_of_low_price = get_profit(10);
        var profit_of_mid_price = get_profit(15);
        var profit_of_max_price = get_profit(20);

       println("Profit when ticket price is 10Rs : " + profit_of_low_price);
       println("Profit when ticket price is 15Rs : " + profit_of_mid_price);
       println("Profit when ticket price is 20Rs : " + profit_of_max_price);

       println("");
       println("Ticket price with highest profit is 20Rs");
  }
}
