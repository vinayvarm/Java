package InterfaceRealtimeExample;

public class Safari implements WebDriverRules{

	
	@Override
	public void getUrl()
	{
		System.out.println("get url");
	};
	@Override
    public void getBrowser()
    {
    	System.out.println("get browser");
    };
    @Override
    public void getTitle()
    {
    	System.out.println("get title");
    };
    @Override
    public void quit() {
    	System.out.println("quit");
    };
}
