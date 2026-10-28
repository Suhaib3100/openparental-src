package com.tencent.qcloud.core.http;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes7.dex */
public final class MimeType {
    private static final Map<String, String> mimeTypes;

    static {
        HashMap hashMap = new HashMap();
        mimeTypes = hashMap;
        hashMap.put(ProtectedSandApp.s("妘\u0001"), ProtectedSandApp.s("妙\u0001"));
        hashMap.put(ProtectedSandApp.s("妚\u0001"), ProtectedSandApp.s("妛\u0001"));
        hashMap.put(ProtectedSandApp.s("妜\u0001"), ProtectedSandApp.s("妝\u0001"));
        String s4 = ProtectedSandApp.s("妞\u0001");
        String s5 = ProtectedSandApp.s("妟\u0001");
        hashMap.put(s4, s5);
        hashMap.put(ProtectedSandApp.s("妠\u0001"), s5);
        hashMap.put(ProtectedSandApp.s("妡\u0001"), ProtectedSandApp.s("妢\u0001"));
        hashMap.put(ProtectedSandApp.s("妣\u0001"), ProtectedSandApp.s("妤\u0001"));
        hashMap.put(ProtectedSandApp.s("妥\u0001"), ProtectedSandApp.s("妦\u0001"));
        hashMap.put(ProtectedSandApp.s("妧\u0001"), ProtectedSandApp.s("妨\u0001"));
        String s6 = ProtectedSandApp.s("妩\u0001");
        String s7 = ProtectedSandApp.s("妪\u0001");
        hashMap.put(s6, s7);
        hashMap.put(ProtectedSandApp.s("妫\u0001"), s7);
        hashMap.put(ProtectedSandApp.s("妬\u0001"), s7);
        String s10 = ProtectedSandApp.s("妭\u0001");
        String s11 = ProtectedSandApp.s("妮\u0001");
        hashMap.put(s10, s11);
        hashMap.put(ProtectedSandApp.s("妯\u0001"), ProtectedSandApp.s("妰\u0001"));
        String s12 = ProtectedSandApp.s("妱\u0001");
        String s13 = ProtectedSandApp.s("妲\u0001");
        hashMap.put(s12, s13);
        hashMap.put(ProtectedSandApp.s("妳\u0001"), ProtectedSandApp.s("妴\u0001"));
        hashMap.put(ProtectedSandApp.s("妵\u0001"), s13);
        hashMap.put(ProtectedSandApp.s("妶\u0001"), s13);
        hashMap.put(ProtectedSandApp.s("妷\u0001"), ProtectedSandApp.s("妸\u0001"));
        hashMap.put(ProtectedSandApp.s("妹\u0001"), ProtectedSandApp.s("妺\u0001"));
        hashMap.put(ProtectedSandApp.s("妻\u0001"), s11);
        hashMap.put(ProtectedSandApp.s("妼\u0001"), s11);
        hashMap.put(ProtectedSandApp.s("妽\u0001"), ProtectedSandApp.s("妾\u0001"));
        String s14 = ProtectedSandApp.s("妿\u0001");
        String s15 = ProtectedSandApp.s("姀\u0001");
        hashMap.put(s14, s15);
        hashMap.put(ProtectedSandApp.s("姁\u0001"), s15);
        hashMap.put(ProtectedSandApp.s("姂\u0001"), ProtectedSandApp.s("姃\u0001"));
        hashMap.put(ProtectedSandApp.s("姄\u0001"), ProtectedSandApp.s("姅\u0001"));
        hashMap.put(ProtectedSandApp.s("姆\u0001"), ProtectedSandApp.s("姇\u0001"));
        String s16 = ProtectedSandApp.s("姈\u0001");
        String s17 = ProtectedSandApp.s("姉\u0001");
        hashMap.put(s16, s17);
        hashMap.put(ProtectedSandApp.s("姊\u0001"), s17);
        hashMap.put(ProtectedSandApp.s("始\u0001"), ProtectedSandApp.s("姌\u0001"));
        hashMap.put(ProtectedSandApp.s("姍\u0001"), ProtectedSandApp.s("姎\u0001"));
        hashMap.put(ProtectedSandApp.s("姏\u0001"), ProtectedSandApp.s("姐\u0001"));
        hashMap.put(ProtectedSandApp.s("姑\u0001"), ProtectedSandApp.s("姒\u0001"));
    }

    public static String getTypeByFileName(String str) {
        if (str == null) {
            return null;
        }
        String s4 = ProtectedSandApp.s("姓\u0001");
        String substring = str.lastIndexOf(s4) != -1 ? str.substring(str.lastIndexOf(s4) + 1, str.length()) : "";
        Map<String, String> map = mimeTypes;
        String str2 = map.get(substring.toLowerCase(Locale.ROOT));
        return str2 == null ? map.get(ProtectedSandApp.s("妘\u0001")) : str2;
    }
}
