import scala.io.StdIn.readInt;

object q5 extends App {
    var b:Int = 0;
    def sum(a:Int): Unit= {
        if(a > 0) {
        if(a%2 == 0) {
            b = b + a;
        } 
        sum(a - 1);
        }
        else print(b);
    }

    print("Input a value:");
    var value = readInt();
    sum(value-1);
    
}