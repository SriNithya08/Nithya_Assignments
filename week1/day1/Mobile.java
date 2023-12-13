package week1.day1;

public class Mobile {
public static void main(String[] args) {
Mobile m = new Mobile();
System.out.println("This is my Mobile");
m.makeCall();
m.sendmsg();
	}
public void makeCall()
{
String mobileModel="Vivo";
float mobileWeight=1.86f;
System.out.println("The model of my Mobile is " +mobileModel + " and the weight is " +mobileWeight);	
}
public void sendmsg()
{
Boolean isFullCharged=true;
int mobileCost=15000;	
System.out.println("Battery is fully charged = " +isFullCharged + " and the cost is " +mobileCost);	
}

}
