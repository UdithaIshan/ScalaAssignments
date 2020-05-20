object q1 extends App {
    def normalHour(x:Int) : Int = x*150;

    def ot(x:Int) : Int = x*75;

    def tax(x:Int, y:Int) : Double = {
        return (normalHour(x) + ot(y))*0.1;
    }

    def salary(normalH: Int, otH: Int) : Double = {
        return normalHour(normalH) + ot(otH) - tax(normalH, otH);
    }

    printf("%.2f", salary(40, 20));
}