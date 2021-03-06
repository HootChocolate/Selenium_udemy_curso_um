package suporte;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	/** Este método retorna a hora atual, formatada como "yyyyMMddhhmmss"
	 * 
	 *  @author jay
	 *  @return String
	 *  @date 04/07/2020
	 */
	public static String getDateFormatyyyyMMddhhmmss() {
		
		Date date = new Date();
		
		return  new SimpleDateFormat("yyyyMMddhhmmss").format(date);
	}
	
}
