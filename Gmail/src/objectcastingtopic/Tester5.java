package objectcastingtopic;
//Upcasting in case of method Overriding
class Father
{
	public void smoking()
	{
		System.out.println("Normal Smoker");
	}
}
class Son extends Father
{
	public void smoking()
	{
		System.out.println("Chain Smoker");
	}
}
public class Tester5
{
	public static void main(String[] args)
	{
		Father f1 = new Son();//Auto Upcasting
		f1.smoking();
		System.out.println("==============");
		Son s1=(Son)f1;
		s1.smoking();
	}
}
//Adi==> normal
//Ali==> normal
//anjana==> normal
//gayatri ==> normal
//jyothi ==> chain
//prdnya ==> chain
//pushpa ==> normal
//Manisha ==> chain
//shilpa ==> normal
//shweta ==> normal


