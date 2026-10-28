package com.tencent.liteav.base;

import android.text.TextUtils;
import android.util.Patterns;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public class PiiElider {
    private static final String[] APP_NAMESPACE;
    private static final Pattern CONSOLE_MSG;
    private static final Pattern DOMAIN_NAME;
    private static final Pattern IP_ADDRESS;
    private static final Pattern LIKELY_EXCEPTION_LOG;
    private static final Pattern MAC_ADDRESS;
    private static final String[] SYSTEM_NAMESPACE;
    private static final Pattern WEB_URL;
    private static final String CONSOLE_ELISION = ProtectedSandApp.s("削\u0001");
    private static final String GOOD_GTLD_CHAR = ProtectedSandApp.s("剋\u0001");
    private static final String IRI = ProtectedSandApp.s("剌\u0001");
    private static final String GOOD_IRI_CHAR = ProtectedSandApp.s("前\u0001");
    private static final String GTLD = ProtectedSandApp.s("剎\u0001");
    private static final String HOST_NAME = ProtectedSandApp.s("剏\u0001");
    private static final String MAC_ELISION = ProtectedSandApp.s("剐\u0001");
    private static final String URL_ELISION = ProtectedSandApp.s("剑\u0001");
    private static final String EMAIL_ELISION = ProtectedSandApp.s("剒\u0001");

    static {
        Pattern compile = Pattern.compile(ProtectedSandApp.s("剓\u0001"));
        IP_ADDRESS = compile;
        Pattern compile2 = Pattern.compile(ProtectedSandApp.s("剔\u0001") + compile + ProtectedSandApp.s("剕\u0001"));
        DOMAIN_NAME = compile2;
        LIKELY_EXCEPTION_LOG = Pattern.compile(ProtectedSandApp.s("剖\u0001"));
        WEB_URL = Pattern.compile(ProtectedSandApp.s("剗\u0001") + compile2 + ProtectedSandApp.s("剘\u0001"));
        MAC_ADDRESS = Pattern.compile(ProtectedSandApp.s("剙\u0001"));
        CONSOLE_MSG = Pattern.compile(ProtectedSandApp.s("剚\u0001"));
        APP_NAMESPACE = new String[]{ProtectedSandApp.s("剛\u0001"), ProtectedSandApp.s("剜\u0001")};
        SYSTEM_NAMESPACE = new String[]{ProtectedSandApp.s("剟\u0001"), ProtectedSandApp.s("剠\u0001"), ProtectedSandApp.s("剡\u0001"), ProtectedSandApp.s("剢\u0001"), ProtectedSandApp.s("剣\u0001"), ProtectedSandApp.s("剤\u0001"), ProtectedSandApp.s("剥\u0001"), ProtectedSandApp.s("剦\u0001"), ProtectedSandApp.s("剧\u0001"), ProtectedSandApp.s("剨\u0001"), ProtectedSandApp.s("剩\u0001"), ProtectedSandApp.s("剪\u0001"), ProtectedSandApp.s("剫\u0001"), ProtectedSandApp.s("剬\u0001"), ProtectedSandApp.s("剭\u0001"), ProtectedSandApp.s("剮\u0001"), ProtectedSandApp.s("副\u0001"), ProtectedSandApp.s("剰\u0001"), ProtectedSandApp.s("剱\u0001"), ProtectedSandApp.s("割\u0001"), ProtectedSandApp.s("剳\u0001"), ProtectedSandApp.s("剴\u0001"), ProtectedSandApp.s("創\u0001"), ProtectedSandApp.s("剶\u0001"), ProtectedSandApp.s("剷\u0001"), ProtectedSandApp.s("剸\u0001"), ProtectedSandApp.s("剹\u0001"), ProtectedSandApp.s("剺\u0001"), ProtectedSandApp.s("剻\u0001"), ProtectedSandApp.s("剼\u0001"), ProtectedSandApp.s("剽\u0001"), ProtectedSandApp.s("剾\u0001"), ProtectedSandApp.s("剿\u0001"), ProtectedSandApp.s("劀\u0001"), ProtectedSandApp.s("劁\u0001"), ProtectedSandApp.s("劂\u0001"), ProtectedSandApp.s("劃\u0001"), ProtectedSandApp.s("劄\u0001"), ProtectedSandApp.s("劅\u0001"), ProtectedSandApp.s("劆\u0001"), ProtectedSandApp.s("劇\u0001"), ProtectedSandApp.s("劈\u0001"), ProtectedSandApp.s("劉\u0001"), ProtectedSandApp.s("劊\u0001"), ProtectedSandApp.s("劋\u0001"), ProtectedSandApp.s("劌\u0001"), ProtectedSandApp.s("劍\u0001"), ProtectedSandApp.s("劎\u0001"), ProtectedSandApp.s("劏\u0001"), ProtectedSandApp.s("剝\u0001"), ProtectedSandApp.s("剞\u0001")};
    }

    public static String elideConsole(String str) {
        return CONSOLE_MSG.matcher(str).replaceAll(ProtectedSandApp.s("削\u0001"));
    }

    public static String elideEmail(String str) {
        return Patterns.EMAIL_ADDRESS.matcher(str).replaceAll(ProtectedSandApp.s("剒\u0001"));
    }

    public static String elideMac(String str) {
        return MAC_ADDRESS.matcher(str).replaceAll(ProtectedSandApp.s("剐\u0001"));
    }

    public static String elideUrl(String str) {
        if (LIKELY_EXCEPTION_LOG.matcher(str).find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        Matcher matcher = WEB_URL.matcher(sb);
        int i4 = 0;
        while (matcher.find(i4)) {
            int start = matcher.start();
            int end = matcher.end();
            String substring = sb.substring(start, end);
            if (likelyToBeAppNamespace(substring) || likelyToBeSystemNamespace(substring)) {
                i4 = end;
            } else {
                sb.replace(start, end, ProtectedSandApp.s("剑\u0001"));
                i4 = start + 24;
                matcher = WEB_URL.matcher(sb);
            }
        }
        return sb.toString();
    }

    private static boolean likelyToBeAppNamespace(String str) {
        for (String str2 : APP_NAMESPACE) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean likelyToBeSystemNamespace(String str) {
        for (String str2 : SYSTEM_NAMESPACE) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static String sanitizeStacktrace(String str) {
        String[] split = str.split(ProtectedSandApp.s("劐\u0001"));
        split[0] = elideUrl(split[0]);
        for (int i4 = 1; i4 < split.length; i4++) {
            if (split[i4].startsWith(ProtectedSandApp.s("劑\u0001"))) {
                split[i4] = elideUrl(split[i4]);
            }
        }
        return TextUtils.join(ProtectedSandApp.s("劒\u0001"), split);
    }
}
