package log;


public class Log {
	public static final boolean DEBUG = true;
	
	public static void d(String tag, String msg) {
		if (DEBUG) {
			android.util.Log.d(tag, msg);
		}
	}
}