import scala.io.StdIn.readInt;

object q1 extends App {
    def gcd(a:Int, b:Int):Int=b match{
        case 0 => a;
        case x if x>a => gcd(x,a);
        case x => gcd(x,a%x);
    }
    def prime(a:Int, b:Int = 2): Boolean = b match{
        case x if(x==a)=>true;
        case x if gcd(a,x)>1 => false;
        case x => prime(a,x+1);
    }

    print("Input a value:");
    var value = readInt();
    print(prime(value));
    
}