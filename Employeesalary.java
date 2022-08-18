
package learning;

public class Employeesalary {
	public static void main(String[] args) {
	
	int emplevel;
	int boa;
    int bonus;
	double pf;
	double mpay;
	double ypay;
	double taxslab;
	double taxpay;
	double netmonthlypay;
	
	String empname = "Ovi";
	int bs = 10000;
	
if  ((bs > 1) && (bs <= 7000)) {
	emplevel = 1;
	boa = 5000;
	bonus = 2000;
	}

else if ((bs > 7000) && (bs <= 10000)) {
	emplevel = 2;
	boa = 7000;
	bonus = 2500;
	}
else if ((bs > 10000) && (bs <= 12000)) {
	emplevel = 3;
	boa = 9000;
	bonus = 3000;
	}
else  {
	emplevel = 4;
	boa = 10000;
	bonus = 3500;
	}
System.out.println("Employee Name is : "+empname );	
System.out.println("Employee monthly basic salary is : "+bs );	
System.out.println("Employee Level is : "+emplevel );

pf = ((bs*12)/100);
System.out.println("Provident fund is : "+pf );

mpay = (bs-pf+boa+bonus);
System.out.println("Monthly Pay is : "+mpay );

ypay = mpay*12;
System.out.println("yearly Pay is : "+ypay );

//taxslab
if ((ypay > 1) && (ypay <= 250000)) {
	taxslab = 0;
}
	else if ((ypay > 250000) && (ypay <= 500000)) {
	taxslab = 0.05;}
	else if ((ypay > 500000) && (ypay <= 750000)) {
		taxslab = 0.10;}

	else if ((ypay >750000) && (ypay <= 1000000)) {
		taxslab = 0.15;}

	else if ((ypay >1000000) && (ypay <= 1250000)) {
		taxslab = 0.20;}

	else if ((ypay >1250000) && (ypay <= 1500000)) {
		taxslab = 0.25;}

	else   {taxslab = 0.30;}
		
System.out.println("tax percentage is : "+taxslab );

taxpay = (ypay*taxslab);
System.out.println("Tax payment is : "+taxpay );
netmonthlypay=(mpay-(taxpay/12));
System.out.println("Net monthly payment is : "+netmonthlypay );
   }

}	

