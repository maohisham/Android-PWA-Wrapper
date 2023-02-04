package at.xtools.pwawrapper;

public class Constants {
    public Constants(){}
    // Root page
    public static String WEBAPP_URL = "https://www.xbox.com/en-us/play";
    public static String WEBAPP_HOST = "xbox.com"; // used for checking Intent-URLs

	// User Agent tweaks
    public static boolean POSTFIX_USER_AGENT = false; // set to true to append USER_AGENT_POSTFIX to user agent
    public static boolean OVERRIDE_USER_AGENT = true; // set to true to use USER_AGENT instead of default one
    public static String USER_AGENT_POSTFIX = "AndroidApp"; // useful for identifying traffic, e.g. in Google Analytics
    public static String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36 Edg/109.0.1518.70";
	
	// Constants
    // window transition duration in ms
    public static int SLIDE_EFFECT = 2200;
    // show your app when the page is loaded XX %.
    // lower it, if you've got server-side rendering (e.g. to 35),
    // bump it up to ~98 if you don't have SSR or a loading screen in your web app
    public static int PROGRESS_THRESHOLD = 63;
    // turn on/off mixed content (both https+http within one page) for API >= 21
    public static boolean ENABLE_MIXED_CONTENT = true;
}
