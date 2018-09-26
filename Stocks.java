import java.util.Scanner;
public class Stocks
{
public static void main(String[] args)
{
double share_price;
double num_of_shares; 
double comm_percent;

double cost;
double commission;
double totalcost;
       // Scanner to calculate the total cost.
       Scanner input = new Scanner(System.in);
       // Scanner to enter number of shares, price of shares, and percent for commission.
       System.out.print("Enter number of shares; ");
       num_of_shares = input.nextDouble();
       
       System.out.print("Enter the price per shares: ");
       share_price = input.nextDouble();
       
       System.out.print("Enter the percent for commission: ");
       comm_percent = input.nextDouble();
       // Calculation for cost.
       cost = num_of_shares * share_price;
       commission = comm_percent * cost;
       totalcost = cost + commission;
       
       System.out.print(" \nResults ");
       // Prints out the results from inputing the calculation.
       System.out.print(" \ncost: $" + cost );
       System.out.print(" \ncommission: $" + commission );
       System.out.print(" \ntotalcost: $" + totalcost );
       


}
}







