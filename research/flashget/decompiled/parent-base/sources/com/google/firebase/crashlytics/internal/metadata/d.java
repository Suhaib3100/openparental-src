package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: KeysMap.java */
/* loaded from: classes6.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f58906a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final int f58907b;

    /* renamed from: c, reason: collision with root package name */
    private final int f58908c;

    public d(int i4, int i5) {
        this.f58907b = i4;
        this.f58908c = i5;
    }

    private String b(String str) {
        if (str != null) {
            return c(str, this.f58908c);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ﴂ"));
    }

    public static String c(String str, int i4) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > i4 ? trim.substring(0, i4) : trim;
    }

    @o0
    public synchronized Map<String, String> a() {
        return Collections.unmodifiableMap(new HashMap(this.f58906a));
    }

    public synchronized boolean d(String str, String str2) {
        String s4 = ProtectedSandApp.s("ﴃ");
        synchronized (this) {
            String b5 = b(str);
            if (this.f58906a.size() >= this.f58907b && !this.f58906a.containsKey(b5)) {
                com.google.firebase.crashlytics.internal.g.f().m(s4 + str + ProtectedSandApp.s("ﴄ") + this.f58907b);
                return false;
            }
            String c5 = c(str2, this.f58908c);
            if (com.google.firebase.crashlytics.internal.common.i.A(this.f58906a.get(b5), c5)) {
                return false;
            }
            Map<String, String> map = this.f58906a;
            if (str2 == null) {
                c5 = "";
            }
            map.put(b5, c5);
            return true;
        }
    }

    public synchronized void e(Map<String, String> map) {
        try {
            int i4 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String b5 = b(entry.getKey());
                if (this.f58906a.size() >= this.f58907b && !this.f58906a.containsKey(b5)) {
                    i4++;
                }
                String value = entry.getValue();
                this.f58906a.put(b5, value == null ? "" : c(value, this.f58908c));
            }
            if (i4 > 0) {
                com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ﴅ") + i4 + ProtectedSandApp.s("ﴆ") + this.f58907b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
