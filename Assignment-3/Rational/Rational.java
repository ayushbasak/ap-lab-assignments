package Rational;
public class Rational{
    public int p;
    public int q;

    public Rational(){
        this.p = 0;
        this.q = 1;
    }
    public Rational(int a, int b){
        this.p = a;
        this.q = b;
    }
    public Rational(int w){
        this.p = w;
        this.q = 1;
    }
    public void Normalize(){
        if(this.q < 0){
            this.p *= -1;
        }
        if(this.p < 0 && this.q < 0){
            this.p *= -1;
            this.q *= -1;
        }
        int gcd =  gcd(this.p, this.q);
        this.p /= gcd;
        this.q /= gcd;
    }

    private int gcd(int a, int b){
        if(a == 0)
            return b;
        else
            return gcd(b%a,a);
    }

    public static Rational add(Rational a, Rational b){
        Rational send = new Rational();
        if(a.q == b.q){
            send.q = a.q;
            send.p = a.p + b.p;
        }
        else{
            send.q = a.q*b.q;
            send.p = a.p*b.q + b.p*a.q;
        }
        send.Normalize();
        return send;
    }
    public static Rational multiply(Rational a, Rational b){
        Rational send = new Rational();
        send.q = a.q*b.q;
        send.p = a.p * b.p;
        send.Normalize();
        return send;
    }
    public static Rational subtract(Rational a, Rational b){
        Rational send = new Rational();
        if(a.q == b.q){
            send.q = a.q;
            send.p = a.p - b.p;
        }
        else{
            send.q = a.q*b.q;
            send.p = a.p*b.q - b.p*a.q;
        }
        send.Normalize();
        return send;
    }
    public static Rational divide(Rational a, Rational b){
        Rational send = new Rational();
        send.p = a.p*b.q;
        send.q = a.q*b.p;
        if(send.q == 0)
            System.out.println("Division By Zero Error!");
        send.Normalize();
        return send;
    }
}