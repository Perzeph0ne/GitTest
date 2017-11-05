import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class test {
	public static void main(String args[]){
		
		
		//test data
		ArrayList<String> data = new ArrayList<String>(
			    Arrays.asList(
			    		"2017-09-01T00:00:09.000+0700",
			    		"2017-09-01T00:02:14.000+0700",
			    		"2017-09-01T00:02:26.000+0700",
			    		"2017-09-01T00:02:38.000+0700",
			    		"2017-09-01T00:04:48.000+0700",
			    		"2017-09-01T00:31:07.000+0700",
			    		"2017-09-01T00:31:56.000+0700",
			    		"2017-09-01T00:32:17.000+0700",
			    		"2017-09-01T00:32:31.000+0700",
			    		"2017-09-01T00:32:34.000+0700",
			    		"2017-09-01T00:32:36.000+0700",
			    		"2017-09-01T00:32:39.000+0700"
			    		));
		//
		List<List<Integer>> rawData = new ArrayList<>();
//		for(int i=0; i<288; i++){
//			//rawData.add(new ArrayList<>());
//			rawData.add(new ArrayList<Integer>(Arrays.asList(0,0)));
//		}
		for(String d:data){
			DateTime dt = new DateTime(d);
//			DateTimeFormatter fmt = DateTimeFormat.forPattern("MMMM, yyyy dd HH:mm:ss");
			
			int second = dt.getSecondOfDay();
			//get second of day and divide by 60 to see which interval (per minute)
			//if second%60 != 0 -> minute+=1
			int min = (int)Math.ceil(second/60.0);
			int interval = (int)Math.ceil((min-1)/5);
			
			DateTimeFormatter fmt = DateTimeFormat.forPattern("HH:mm:ss");
			String str = fmt.print(dt);
			System.out.println("min:"+min+"\tinterval:"+interval+"\t"+str);
			rawData.add(new ArrayList<Integer>(Arrays.asList( interval+1, min, 1)));
//			rawData.get(interval).set(0, rawData.get(interval).get(0)+1);
//			rawData.get(interval).set(1, rawData.get(interval).get(1)+5);
			//List<Double> sample = new ArrayList<>();
		}
		
		System.out.println(rawData);
		//get first record
//		DateTime dt = new DateTime("2017-09-30T23:56:51.000+0700");
//		DateTimeFormatter fmt = DateTimeFormat.forPattern("MMMM, yyyy dd HH:mm:ss");
//		String str = fmt.print(dt);
//		System.out.println(str);
//		
//		int hour = dt.getHourOfDay();
//		int minute = dt.getMinuteOfHour();
//		int second = dt.getSecondOfMinute();
//		System.out.println(hour+":"+minute+":"+second);
//		
//		int hour = dt.getHourOfDay();
//		int minute = dt.getMinuteOfDay();
//		int second = dt.getSecondOfDay();
//		System.out.println(hour+":"+minute+":"+second);
//		
//		
//		//get second of day and divide by 60 to see which interval (per minute)
//		//if second%60 != 0 -> minute+=1
//		System.out.println((int)Math.ceil(second/60.0));
//		
//		List<List<Double>> rawData = new ArrayList<>();
//		//List<Double> sample = new ArrayList<>();
//		
//		for(int i=0; i<288; i++){
//			rawData.add(new ArrayList<Double>());
//		}
//		//loop data by record
//		
//		
//		for(int i=0; i<10; i++){
//			if(i%2==0){
//				rawData.get(0).add((double)i);
//				
//			}
//			else{
//				rawData.get(1).add((double)i);
//			}
//		}
//		
//		System.out.println(rawData);
		
	}
}
