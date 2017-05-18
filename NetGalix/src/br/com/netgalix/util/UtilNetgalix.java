package br.com.netgalix.util;

import java.util.Date;
import java.text.SimpleDateFormat;

public class UtilNetgalix {

	public static Date treatToDate(String param) {
        if (param != null && param.trim().length() > 0) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date result = sdf.parse(param);
                return result;
            } catch (Exception ex) {
                return null;
            }
        }
        return null;
    }
	
	public static String treatToLongString(Date param) {
        if (param != null) {
            SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy");
            String data = formatter.format(param);
            return data;
        }
        return "";
    }
	
	public static boolean validaData(String data) {


        if (data.length() != 10) {
            //      System.out.println("vai false");
            return false;

        }

        for (int i = 0; i < data.length(); i++) {

            System.out.println(data.charAt(i));
            if (i != 2 && i != 5) {
                if (isNumeber(data.charAt(i)) != true) {
                    //        System.out.println("vai false");
                    return false;
                }

            }
            if ((i == 2 || i == 5) && data.charAt(i) != '/') {
                //      System.out.println("vai false");
                return false;
            }
        }
        //System.out.println("vai true");
        return true;
    }
	
	private static boolean isNumeber(char a) {

        if (a == '0' || a == '1' || a == '2' || a == '3' || a == '4' || a == '5'
                || a == '6' || a == '7' || a == '8' || a == '9') {
            return true;
        }
        return false;
    }
	
	public static Date pegarDataAtual(){
		String data = "dd/MM/yyyy";
		String data2;  
		  
		Date agora = new Date();  
		SimpleDateFormat formata = new SimpleDateFormat(data);  
		data2 = formata.format(agora);  
		Date data3 = UtilNetgalix.treatToDate(data2);
		return data3;
	}

}
