import scala.io.StdIn.readInt;

object q4 extends App {
    def check(a:Int) : Unit = {
        if(a%2 == 0) {
            print(a);
            printf(" is even\n");
        }
        else if(a%2 != 0) {
            print(a);
            printf(" is odd\n");
        }
        if(a > 1)
        check(a - 1);
    }

    print("Enter a number to get odd even values: ");
    var value = readInt();
    check(value);
}