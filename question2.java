public class question2
{
        public static void main(String arg[])
        {
            String currency = "CSC1009";
            switch(currency)
            {
                case "AUD":
                    System.out.println("Australian dollar");
                    break;
                case "MYR":
                    System.out.println("Malaysian ringgit");
                    break;
                case "IDR":
                    System.out.println("Indonesian rupiah");
                    break;
                case "CSC1009":
                    System.out.println("Object-Oriented Programming");
                    break;
                default:
                    System.out.println("Unknown Currency");
                    break;
            }
            System.out.println("After switch");
        }


}
