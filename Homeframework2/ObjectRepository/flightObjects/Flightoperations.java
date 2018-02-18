package flightObjects;



public interface Flightoperations {
    String signing="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a";
    String username1="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input";
    String password1="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input";
	String submit1="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input";
    String home="html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a";
	String roundtrip="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]";
	String oneway="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]";
    String passengers="//*[contains(@name,'passCount')]";
    String departingfrom="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select";
    String on="//*[contains(@name,'fromMonth')]";
    //String on="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[1]";
    String on2="//*[contains(@name,'fromDay')]";
    String arrivingin="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td[2]/select";
    String returning="//*[contains(@name,'toMonth')]";
    String returning2="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[2]";
    String economyclass="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/input";
    String businessclass="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]";
    String Firstclass="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]";
    String Airline="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select";
    String continue1="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input";
    String departflight1="//*[contains(@value,'Blue Skies Airlines$360$270$5:03')]";
    String departflight2="//*[contains(@value,'Blue Skies Airlines$361$271$7:10')]";
    String departflight3="//*[contains(@value,'Pangea Airlines$362$274$9:17')]";
    String departflight4="//*[contains(@value,'Unified Airlines$363$281$11:24')]";
    String arriveflight1="//*[contains(@value,'Blue Skies Airlines$630$270$12:23')]";
    String arriveflight2="//*[contains(@value,'Blue Skies Airlines$631$273$14:30')]";
    String arriveflight3="//*[contains(@value,'Pangea Airlines$632$282$16:37')]";
    String arriveflight4="//*[contains(@value,'Unified Airlines$633$303$18:44')]";
    
    String continue2="//*[contains(@name,'reserveFlights')]";
    String departtable="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody";
    String returntable="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody";
   
    
    //Page for Entering passenger details and address details
    
    String firstname11="//*[contains(@name,'passFirst0')]";
    String lastname11="//*[contains(@name,'passLast0')]";
    String mealpreference="//*[contains(@name,'pass.0.meal')]";
    String cardtype="//*[contains(@name,'creditCard')]";
    String cardnumber="//*[contains(@name,'creditnumber')]";
    String cardexpirationdate="//*[contains(@name,'exp_dt_mn')]";
    String cardexpirationyear="//*[contains(@name,'cc_exp_dt_yr')]";
    String cardfirstname="//*[contains(@name,'cc_frst_name')]";
    String cardmidddlename="//*[contains(@name,'cc_mid_name')]";
    String cardlastname="//*[contains(@name,'cc_last_name')]";
    String cardbillingaddressline1="//*[contains(@name,'billAddress1')]";
    String cardbillingaddressline2="//*[contains(@name,'delAddress2')]";  
    String cardbillingcity="//*[contains(@name,'delCity')]";
    String cardbillingstate="//*[contains(@name,'delState')]";
    String cardbillingpostal="//*[contains(@name,'delZip')]";
    String cardbillingcountry="//*[contains(@name,'delCountry')]";
    String securepurchase="//*[contains(@src,'/images/forms/purchase.gif')]";
    String Carddeliveryaddress="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input";
   
    String itenaryconfirmation="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]";
    String backtoflight="//*[contains(@src,'/images/forms/backtoflights.gif')]";
    String backtohome="//*[contains(@src,'/images/forms/home.gif')]";
    String logout="//*[contains(@src,'/images/forms/Logout')]";


}
