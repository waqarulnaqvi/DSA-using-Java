import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
//19 30

public class pt_288_currency_convertor {
    public static void main(String[] args) throws IOException {
//        API=Application Programming Interface:
//        API always have API key
//        API monitoring - you can't do illegal activity and unlimited requests in API.
        HashMap<Integer,String> currencyCodes=new HashMap<Integer,String>();

//      Add currency codes
currencyCodes.put(1,"USD");
currencyCodes.put(2,"CAD");
currencyCodes.put(3,"EUR");
currencyCodes.put(4,"HKD");
currencyCodes.put(5,"INR");

String fromCodes,toCode;

        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the currency converter!");

//From which currency:
        System.out.println("From");
        System.out.println("1 for us dollar\n2 for canadian dollar\n3 for Euro\n4 for HongKong Dollar\n5 for Indian Rupees");
        fromCodes=currencyCodes.get(sc.nextInt());
        System.out.println();


//To which currency:
        System.out.println("To");
        System.out.println("1 for us dollar\n2 for canadian dollar\n3 for Euro\n4 for HongKong Dollar\n5 for Indian Dollar");
        toCode=currencyCodes.get(sc.nextInt());
        System.out.println("to code "+toCode);
        System.out.println("from code "+fromCodes);

// Amount:
        System.out.println("Amount you wish to convert:");
//        BigDecimal amount=sc.nextBigDecimal();
        Double amount=sc.nextDouble();
sendHttpsRequest(fromCodes,toCode,amount);

//        sendHttpGetRequest(fromCodes,toCode,amount);
        System.out.println("Thank you for using the currency converter!");
   }
    public static void sendHttpsRequest(String fromcode,String  toCode,Double amount) throws IOException {

        DecimalFormat f=new DecimalFormat("00.00");
String GETURL="https://api.exchangerateapi.io/latest?base="+toCode +"&symbols="+fromcode;
URL url=new URL(GETURL);
HttpURLConnection httpURLConnection=
        (HttpURLConnection) url.openConnection();

httpURLConnection.setRequestMethod("GET");
int responseCode=httpURLConnection.getResponseCode();

if(responseCode==HttpURLConnection.HTTP_OK)//success
{
    BufferedReader in =new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
    String inputLine;
    StringBuffer response=new StringBuffer();

    while ((inputLine=in.readLine())!=null)
    {
        response.append(inputLine);

    }in.close();

//    http://www.json./
//    Download jar file for java json
JSONObject obj=new JSONObject(response.toString());
Double exchangeRate=obj.getJSONObject("rates").getDouble(fromcode);
    System.out.println(obj.getJSONObject("rates"));
    System.out.println(exchangeRate);
    System.out.println();
    System.out.println(f.format(amount) + fromcode +" = "+f.format(amount/exchangeRate) +toCode);
}
else {
    System.out.println("GET request failed!!");
}

    }
}
