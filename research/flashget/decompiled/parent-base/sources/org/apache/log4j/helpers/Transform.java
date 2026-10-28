package org.apache.log4j.helpers;

/* loaded from: classes3.dex */
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
            int i4 = 0;
            while (indexOf > -1) {
                stringBuffer.append(str.substring(i4, indexOf));
                stringBuffer.append("]]>]]&gt;<![CDATA[");
                i4 = CDATA_END_LEN + indexOf;
                if (i4 >= str.length()) {
                    return;
                } else {
                    indexOf = str.indexOf("]]>", i4);
                }
            }
            stringBuffer.append(str.substring(i4));
        }
    }

    public static String escapeTags(String str) {
        if (str == null || str.length() == 0 || (str.indexOf(34) == -1 && str.indexOf(38) == -1 && str.indexOf(60) == -1 && str.indexOf(62) == -1)) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(str.length() + 6);
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
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
