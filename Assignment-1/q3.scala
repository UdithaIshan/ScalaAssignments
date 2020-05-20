object q3 extends App {
    def cost(x: Int) : Double = {
        var totalCoverPrice: Double = x*24.95;
        var discount : Double = (totalCoverPrice*40.0)/100.0;
        var shipCost : Double = if(x>50){50.0*3.0 + 0.75*(x - 50)} else x * 3.0;
        return totalCoverPrice - discount + shipCost;
    }

    print(cost(60));
}