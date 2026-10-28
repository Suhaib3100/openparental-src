package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: KeysMap.java */
/* loaded from: classes2.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f15804a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final int f15805b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15806c;

    public d(int i5, int i6) {
        this.f15805b = i5;
        this.f15806c = i6;
    }

    private String b(String str) {
        if (str != null) {
            return c(str, this.f15806c);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ᓌ"));
    }

    public static String c(String str, int i5) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > i5 ? trim.substring(0, i5) : trim;
    }

    @o0
    public synchronized Map<String, String> a() {
        return Collections.unmodifiableMap(new HashMap(this.f15804a));
    }

    public synchronized boolean d(String str, String str2) {
        String s5 = ProtectedSandApp.s("ᓍ");
        synchronized (this) {
            String b6 = b(str);
            if (this.f15804a.size() >= this.f15805b && !this.f15804a.containsKey(b6)) {
                com.google.firebase.crashlytics.internal.g.f().m(s5 + str + ProtectedSandApp.s("ᓎ") + this.f15805b);
                return false;
            }
            String c6 = c(str2, this.f15806c);
            if (com.google.firebase.crashlytics.internal.common.i.A(this.f15804a.get(b6), c6)) {
                return false;
            }
            Map<String, String> map = this.f15804a;
            if (str2 == null) {
                c6 = "";
            }
            map.put(b6, c6);
            return true;
        }
    }

    public synchronized void e(Map<String, String> map) {
        int i5 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String b6 = b(entry.getKey());
            if (this.f15804a.size() >= this.f15805b && !this.f15804a.containsKey(b6)) {
                i5++;
            }
            String value = entry.getValue();
            this.f15804a.put(b6, value == null ? "" : c(value, this.f15806c));
        }
        if (i5 > 0) {
            com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ᓏ") + i5 + ProtectedSandApp.s("ᓐ") + this.f15805b);
        }
    }
}
