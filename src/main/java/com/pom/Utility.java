package com.pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	public static String getproperty(String key) throws IOException
	{
		Properties pro = new Properties();
		
		String path=System.getProperty("user.dir")+"\\kml.properties";
		FileInputStream fis = new FileInputStream(path);
		pro.load(fis);
		return pro.getProperty(key);
		
		
	}

	
public static String get_data(String st) {
	
	
	String str="UTM Easting	UTM Northing	Zone	earthquake.time	MoonPhase.dynamic	earthquake.mag	earthquake.place	day.sunrise\r\n"
			+ "640723.32	1135601.56	13P	4/29/2016 1:33	dsc	6.6	Northern East Pacific Rise	14:32:18\r\n"
			+ "755956.64	1113561.56	58P	4/28/2016 19:33	dsc	7	1km SE of Norsup_Vanuatu	21:04:55\r\n"
			+ "588093.82	70292.84	17N	4/20/2016 8:33	asc	6.2	19km WNW of Muisne_Ecuador	13:12:54\r\n"
			+ "617978.03	41069	17N	4/16/2016 23:58	asc	7.8	27km SSE of Muisne_Ecuador	13:08:52\r\n"
			+ "661631.9	3628438.19	52S	4/15/2016 16:25	asc	7	1km WSW of Kumamoto-shi_Japan	22:28:02\r\n"
			+ "579265.91	1484087.34	15P	4/15/2016 14:11	asc	6.1	104km SSW of Champerico_Guatemala	13:44:25\r\n"
			+ "";
	return str;

}
}
