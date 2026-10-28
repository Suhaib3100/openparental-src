package org.apache.log4j.helpers;

/* loaded from: classes5.dex */
public class Transform {
    private static final int CDATA_END_LEN = 3;
    private static final String CDATA_EMBEDED_END = "]]>]]&gt;<![CDATA[";
    private static final String CDATA_START = "<![CDATA[";
    private static final String CDATA_END = "]]>";
    private static final String CDATA_PSEUDO_END = "]]&gt;";

    public static void appendEscapingCDATA(StringBuffer stringBuffer, String str) {
        if (str != null) {
            int indexOf = str.indexOf("]]>");
            if (indexOf < 0) {
                stringBuffer.append(str);
                return;
            }
            int i5 = 0;
            while (indexOf > -1) {
                stringBuffer.append(str.substring(i5, indexOf));
                stringBuffer.append("]]>]]&gt;<![CDATA[");
                i5 = CDATA_END_LEN + indexOf;
                if (i5 >= str.length()) {
                    return;
                } else {
                    indexOf = str.indexOf("]]>", i5);
                }
            }
            stringBuffer.append(str.substring(i5));
        }
    }

    public static String escapeTags(String str) {
        if (str == null || str.length() == 0 || (str.indexOf(34) == -1 && str.indexOf(38) == -1 && str.indexOf(60) == -1 && str.indexOf(62) == -1)) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(str.length() + 6);
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (charAt > '>') {
                stringBuffer.append(charAt);
            } else if (charAt == '<') {
                stringBuffer.append("&lt;");
            } else if (charAt == '>') {
                stringBuffer.append("&gt;");
            } else if (charAt == '&') {
                stringBuffer.append("&amp;");
            } else if (charAt == '\"') {
                stringBuffer.append("&quot;");
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }
}
