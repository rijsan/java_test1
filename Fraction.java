import java.io.*;
public class Fraction
{
    double numerator, denominator;

    Fraction(double numer, double denom)
    {
        numerator = numer;
        denominator = denom;
    }

    double divide()
    {
        return numerator/denominator;
    }

    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = 3;
        for(int i=0;i<t;i++)
        {
            System.out.println("Enter numerator and denominator");
            System.out.print("Numerator : ");
            double n = Double.parseDouble(br.readLine());
            System.out.print("Denominator : ");
            double m = Double.parseDouble(br.readLine());
            Fraction obj = new Fraction(n,m);
            double result = obj.divide();
            System.out.println("Result : "+result);
        }
    }
}
