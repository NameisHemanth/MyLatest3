package interfacetopic;
interface AutomationConstants
{
	String BROWSER_NAME="chrome";
	String CHROME_PATH="CHROMEPATH";
	String FIREFOX_PATH="FIREFOXPATH";
}
public class Tester6
{
	public static void main(String[] args) 
	{
		System.out.println(AutomationConstants.BROWSER_NAME);
		System.out.println(AutomationConstants.CHROME_PATH);
		System.out.println(AutomationConstants.FIREFOX_PATH);
	}
}
