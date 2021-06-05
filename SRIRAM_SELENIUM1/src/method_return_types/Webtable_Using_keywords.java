package method_return_types;

import org.openqa.selenium.WebElement;

public class Webtable_Using_keywords
{

	public static void main(String[] args) 
	{
		Repository obj=new Repository();
		obj.launch_browser("firefox");
		String url="http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx";
		obj.load_app(url);
        obj.set_timeout(50);

        String index_path="(//a[@href='https://www.icicidirect.com/equity/index/overview'][contains(.,'Index')])[3]";
        obj.click_element(index_path);
        
        WebElement cell=obj.Get_static_webtable_cell("/html/body/div[2]/main/div[2]/div/section[2]/article/div[2]", 4, 5);
        String record=cell.getText();
        System.out.println(record);
        
        WebElement nifty_500=obj.Get_dynamic_webtable_cells("/html/body/div[2]/main/div[2]/div/section[2]/article/div[2]", "Nifty 500", 5);
       obj.click_element(nifty_500);


	}

}
