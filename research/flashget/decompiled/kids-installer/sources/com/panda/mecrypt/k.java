package com.panda.mecrypt;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.gson.Gson;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: EncryUtil.java */
/* loaded from: classes5.dex */
public class k {
    public static boolean a(String str, String str2, String str3, String str4) throws Exception {
        try {
            TreeMap treeMap = (TreeMap) new Gson().fromJson(h.n(a.b(str, o.b(str2, str4))), TreeMap.class);
            String s5 = ProtectedSandApp.s("㘐");
            String m5 = p.m((String) treeMap.get(s5));
            StringBuffer stringBuffer = new StringBuffer();
            for (Map.Entry entry : treeMap.entrySet()) {
                if (!p.c((String) entry.getKey(), s5)) {
                    stringBuffer.append(entry.getValue() == null ? "" : (String) entry.getValue());
                }
            }
            return o.a(stringBuffer.toString(), m5, str3);
        } catch (Exception e6) {
            e6.printStackTrace();
            e6.fillInStackTrace();
            return false;
        }
    }

    public static String b(TreeMap<String, String> treeMap, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<Map.Entry<String, String>> it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next().getValue());
        }
        return p.g(str) ? j.d(stringBuffer.toString(), str, ProtectedSandApp.s("㘑")) : "";
    }

    public static String c(TreeMap<String, Object> treeMap, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<Map.Entry<String, Object>> it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next().getValue());
        }
        return (str == null || str.isEmpty()) ? "" : o.i(stringBuffer.toString(), str);
    }
}
