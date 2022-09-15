package exercicio1;
public class CurrencyConverter {
       static double getIOF(double amount) {
              return amount * (0.06);
       }

       static double dollarToReal(double amount, double dollarPrice) {
              double convertedAmount = amount * dollarPrice;
              return (convertedAmount) + getIOF(convertedAmount);
       }
}