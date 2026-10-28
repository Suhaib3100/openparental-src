package com.meituan.android.walle;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ChannelReader.java */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f70016a = ProtectedSandApp.s("ᡟ\u0001");

    private d() {
    }

    public static c a(File file) {
        Map<String, String> b5 = b(file);
        if (b5 == null) {
            return null;
        }
        String s4 = ProtectedSandApp.s("ᡟ\u0001");
        String str = b5.get(s4);
        b5.remove(s4);
        return new c(str, b5);
    }

    public static Map<String, String> b(File file) {
        try {
            String d5 = f.d(file, a.f70002e);
            if (d5 == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(d5);
            Iterator<String> keys = jSONObject.keys();
            HashMap hashMap = new HashMap();
            while (keys.hasNext()) {
                String obj = keys.next().toString();
                hashMap.put(obj, jSONObject.getString(obj));
            }
            return hashMap;
        } catch (JSONException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public static String c(File file) {
        return f.d(file, a.f70002e);
    }
}
