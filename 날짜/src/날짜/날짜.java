package ��¥;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class ��¥ {
	public static void main(String[] args) {
		
		
	    ZoneId zi = ZoneId.of("Europe/London");
	    ZonedDateTime zdt = ZonedDateTime.now().withZoneSameInstant(zi);
	    System.out.println("���� �ð�:       "+zdt); 
	    
	    ZoneId zi2 = ZoneId.of("Europe/Berlin");
	    ZonedDateTime zdt2 = ZonedDateTime.now().withZoneSameInstant(zi2);
	    System.out.println("������ �ð�:      " +zdt2); 
	    
	    ZoneId zi3 = ZoneId.of("Asia/Dubai");
	    ZonedDateTime zdt3 = ZonedDateTime.now().withZoneSameInstant(zi3);
	    System.out.println("�ι��� �ð�:      " +zdt3);
	    
	    ZoneId zi4 = ZoneId.of("Asia/Kolkata");
	    ZonedDateTime zdt4 = ZonedDateTime.now().withZoneSameInstant(zi4);
	    System.out.println("�ε� �ð�:       " +zdt4);  

	    ZoneId zi5 = ZoneId.of("Asia/Shanghai");
	    ZonedDateTime zdt5 = ZonedDateTime.now().withZoneSameInstant(zi5);
	    System.out.println("�߱� �ð�:       " +zdt5);  
	    
	    ZoneId zi6 = ZoneId.of("Asia/Seoul");
	    ZonedDateTime zdt6 = ZonedDateTime.now().withZoneSameInstant(zi6);
	    System.out.println("�ѱ� �ð�:       " +zdt6);
	     
	    ZoneId zi7 = ZoneId.of("Asia/Tokyo");
	    ZonedDateTime zdt7 = ZonedDateTime.now().withZoneSameInstant(zi7);
	    System.out.println("�Ϻ� �ð�:       " +zdt7); 

	    ZoneId zi8 = ZoneId.of("Australia/Sydney");
	    ZonedDateTime zdt8 = ZonedDateTime.now().withZoneSameInstant(zi8);
	    System.out.println("ȣ�� �ð�:       " +zdt8);  
	    
	    ZoneId zi9 = ZoneId.of("Pacific/Chatham");
	    ZonedDateTime zdt9 = ZonedDateTime.now().withZoneSameInstant(zi9);
	    System.out.println("�������� �ð�:    " +zdt9); 
	    
	    ZoneId zi10 = ZoneId.of("America/Los_Angeles");
	    ZonedDateTime zdt10 = ZonedDateTime.now().withZoneSameInstant(zi10);
	    System.out.println("�ν��������� �ð�: " +zdt10); 
	    
	    ZoneId zi11 = ZoneId.of("America/New_York");
	    ZonedDateTime zdt11 = ZonedDateTime.now().withZoneSameInstant(zi11);
	    System.out.println("���� �ð�:       " +zdt11);  
	    

	    
	    ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
	    
	    String nowStr1 = now.format(DateTimeFormatter.ISO_DATE_TIME); // 2019-10-11T15:48:07.039+09:00[Asia/Seoul]
	    String nowStr2 = now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss z")); // 2019/10/11 15:48:07 KST
	    String nowStr3 = now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)); // 2019�� 10�� 11�� �ݿ��� ���� 3�� 48�� 07�� KST
	    String nowStr4 = now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(Locale.US)); // Friday, October 11, 2019 3:48:07 PM KST
	 
	    ZonedDateTime now1 = ZonedDateTime.parse(nowStr1);
	    ZonedDateTime now2 = ZonedDateTime.parse(nowStr2, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss z"));
	    ZonedDateTime now3 = ZonedDateTime.parse(nowStr3, DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
	    ZonedDateTime now4 = ZonedDateTime.parse(nowStr4, DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(Locale.US));
	 
	    System.out.println(now1);
	    System.out.println(now2);
	    System.out.println(now3);
	    System.out.println(now4);

	}
}
