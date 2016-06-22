package akhil.alltrans;

public class StringEscape {
    public static String XMLUnescape(String s) {
        String retval = s.replaceAll("&amp;", "&");
        retval = retval.replaceAll("&quot;", "\"");
        retval = retval.replaceAll("&apos;", "'");
        retval = retval.replaceAll("&lt;", "<");
        retval = retval.replaceAll("&gt;", ">");
        return retval;
    }
}
