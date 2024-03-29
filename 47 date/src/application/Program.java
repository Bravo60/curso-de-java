package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");

		Date now = new Date(); // now
		Date now1 = new Date(System.currentTimeMillis());
		
		Date data_inicial = new Date(0l);
		Date data = new Date(1000L * 60L * 60L * 5L);
		
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // Padr�o ISO 8601 e classe Instant UTC
		
		
		System.out.println("--------------------- sem formato -----------------------------");
		System.out.println(y1);
		System.out.println(y2);
		
		System.out.println();
		
		System.out.println("now: " + now);
		System.out.println("now1: " + now1);
		
		System.out.println();
		
		System.out.println("data_inicial: " + data_inicial); 
		System.out.println("data: " + data);
		
		System.out.println("y3: " + y3);
		
		System.out.println();
		
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		
		System.out.println();
				
		
		System.out.println("--------------------- sdf2 Brasil -----------------------------");

		System.out.println();
		
		System.out.println("now: " + sdf2.format(now));
		System.out.println("now1: " + sdf2.format(now1));
		
		System.out.println();
		
		System.out.println("data_inicial: " + sdf2.format(data_inicial)); // formato brasil 3 hs atrasado
		System.out.println("data: " + sdf2.format(data));
		
		System.out.println("y3: " + sdf2.format(y3));
		
		System.out.println();
		
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		
		System.out.println();
		
		System.out.println("---------------------- sdf3 -3 hs (Greenwich) ----------------------------");
	
		System.out.println();
		
		System.out.println("now: " + sdf3.format(now));
		System.out.println("now1: " + sdf3.format(now1));
		
		System.out.println();
		
		System.out.println("data_inicial: " + sdf3.format(data_inicial)); // formato brasil 3 hs atrasado
		System.out.println("data: " + sdf3.format(data));
		
		System.out.println("y3: " + sdf3.format(y3));
		
		System.out.println();
		
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		
		
		
		
	}

}
