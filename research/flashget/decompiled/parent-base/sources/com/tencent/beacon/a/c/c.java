package com.tencent.beacon.a.c;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.module.BeaconModule;
import com.tencent.beacon.module.ModuleName;
import java.util.HashMap;
import java.util.Map;

/* compiled from: BeaconInfo.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f71080a;

    /* renamed from: b, reason: collision with root package name */
    private Context f71081b;

    /* renamed from: c, reason: collision with root package name */
    private byte f71082c;

    /* renamed from: d, reason: collision with root package name */
    private String f71083d;

    /* renamed from: f, reason: collision with root package name */
    private String f71085f;

    /* renamed from: g, reason: collision with root package name */
    private long f71086g;

    /* renamed from: e, reason: collision with root package name */
    private String f71084e = "";

    /* renamed from: h, reason: collision with root package name */
    private String f71087h = "";

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, String> f71088i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private String f71089j = "";

    /* renamed from: k, reason: collision with root package name */
    private String f71090k = "";

    /* renamed from: l, reason: collision with root package name */
    private String f71091l = "";

    /* renamed from: m, reason: collision with root package name */
    private boolean f71092m = true;

    public c() {
        this.f71082c = (byte) -1;
        this.f71083d = "";
        this.f71085f = "";
        this.f71082c = (byte) 1;
        this.f71083d = ProtectedSandApp.s("〻\u0001");
        this.f71085f = ProtectedSandApp.s("〼\u0001");
    }

    public static c c() {
        if (f71080a == null) {
            synchronized (c.class) {
                try {
                    if (f71080a == null) {
                        f71080a = new c();
                    }
                } finally {
                }
            }
        }
        return f71080a;
    }

    public synchronized String a() {
        return this.f71085f;
    }

    public void b(String str) {
        this.f71085f = str;
    }

    public String d() {
        return this.f71091l;
    }

    @o0
    public String e() {
        return this.f71087h;
    }

    public String f() {
        return this.f71090k;
    }

    public synchronized byte g() {
        return this.f71082c;
    }

    public synchronized String h() {
        return this.f71083d;
    }

    public String i() {
        return ProtectedSandApp.s("〽\u0001");
    }

    public synchronized long j() {
        return this.f71086g;
    }

    public String k() {
        return this.f71089j;
    }

    public synchronized void a(long j4) {
        this.f71086g = j4;
    }

    public synchronized Context b() {
        return this.f71081b;
    }

    public void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f71090k = str;
    }

    public synchronized void a(Context context) {
        if (this.f71081b == null) {
            Context applicationContext = context.getApplicationContext();
            this.f71081b = applicationContext;
            if (applicationContext == null) {
                this.f71081b = context;
            }
        }
    }

    public String a(String str) {
        String str2 = this.f71088i.get(str);
        return str2 == null ? "" : str2;
    }

    public void a(String str, String str2) {
        this.f71088i.put(str, str2);
    }

    public void c(String str) {
        this.f71087h = str;
    }

    public BeaconModule a(ModuleName moduleName) {
        return BeaconModule.f71636a.get(moduleName);
    }

    public void a(boolean z4) {
        this.f71092m = z4;
    }
}
