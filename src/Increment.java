public class Increment {
        public static void main(String[] args)
        {
            int a=2;
            int b=2;
            int c=a++ + ++a + ++b + b++ + ++a;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }
