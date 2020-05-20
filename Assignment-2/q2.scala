import scala.io.StdIn.readInt;

object q2 extends App {
    def profit(ticketPrice: Int, attendence: Int) : Int = ticketPrice*attendence;


    def attendenceChange(ticketPrice: Int) : Int = {
        if(ticketPrice > 15)
            return ((ticketPrice - 15) / 5) * (-20);
        else if(15 > ticketPrice) 
            return ((15 - ticketPrice) / 5) * 20;
        else
            return 0;
    }

    def netProfit(ticketPrice: Int, attendence: Int) : Int = {
        return profit(ticketPrice, attendence + attendenceChange(ticketPrice)) - (500 + 3*(attendence + attendenceChange(ticketPrice)));
    }

    print("Input ticket price:");
    var ticketPrice = readInt();
    print("Profit : " + netProfit(ticketPrice, 120));

}