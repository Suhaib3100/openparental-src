package com.tencent.beacon.d;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Calendar;
import java.util.Map;

/* compiled from: BeaconStrategy.java */
/* loaded from: classes6.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f71394a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f71395b = false;

    /* renamed from: c, reason: collision with root package name */
    private String f71396c = ProtectedSandApp.s("㈃\u0001");

    /* renamed from: d, reason: collision with root package name */
    private int f71397d = 360;

    /* renamed from: e, reason: collision with root package name */
    private int f71398e = 100;

    /* renamed from: f, reason: collision with root package name */
    private Map<String, String> f71399f = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f71400g = false;

    /* renamed from: h, reason: collision with root package name */
    private e f71401h = new e(1);

    private a() {
    }

    public static a a() {
        if (f71394a == null) {
            synchronized (a.class) {
                try {
                    if (f71394a == null) {
                        f71394a = new a();
                    }
                } finally {
                }
            }
        }
        return f71394a;
    }

    public int b() {
        return this.f71397d;
    }

    public synchronized int c() {
        String str;
        Map<String, String> map = this.f71399f;
        if (map == null || (str = map.get(ProtectedSandApp.s("㈄\u0001"))) == null || str.trim().equals("")) {
            return this.f71398e;
        }
        int i4 = this.f71398e;
        try {
            i4 = Integer.parseInt(str);
        } catch (Exception e4) {
            com.tencent.beacon.base.util.c.a(e4);
        }
        return i4;
    }

    public e d() {
        return this.f71401h;
    }

    public synchronized boolean e() {
        Map<String, String> map = this.f71399f;
        if (map != null) {
            if (ProtectedSandApp.s("㈆\u0001").equalsIgnoreCase(map.get(ProtectedSandApp.s("㈅\u0001")))) {
                return Calendar.getInstance().get(11) == 0;
            }
        }
        return false;
    }

    public void a(int i4) {
        this.f71397d = i4;
    }

    public synchronized void a(Map<String, String> map) {
        this.f71399f = map;
    }

    public String a(String str) {
        Map<String, String> a5;
        e eVar = this.f71401h;
        if (eVar == null || (a5 = eVar.a()) == null) {
            return null;
        }
        return a5.get(str);
    }
}
