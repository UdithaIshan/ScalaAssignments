object q5 extends App {
    var b:Int = 0;
    def sum(a:Int): Unit={
        if(a > 0) {
        if(a%2 == 0) {
            b = b + a;
        } 
        sum(a - 1);
        }
        else print(b);
    }

    sum(5);
}