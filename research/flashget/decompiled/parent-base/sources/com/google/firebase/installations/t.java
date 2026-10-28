package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: Utils.java */
/* loaded from: classes6.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    private static t f59836e;

    /* renamed from: a, reason: collision with root package name */
    private final ca.a f59837a;

    /* renamed from: c, reason: collision with root package name */
    private static final String f59834c = ProtectedSandApp.s("Ě\u0001");

    /* renamed from: b, reason: collision with root package name */
    public static final long f59833b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f59835d = Pattern.compile(ProtectedSandApp.s("ě\u0001"));

    private t(ca.a aVar) {
        this.f59837a = aVar;
    }

    public static t c() {
        return d(ca.b.a());
    }

    public static t d(ca.a aVar) {
        if (f59836e == null) {
            f59836e = new t(aVar);
        }
        return f59836e;
    }

    static boolean g(@q0 String str) {
        return f59835d.matcher(str).matches();
    }

    static boolean h(@q0 String str) {
        return str.contains(ProtectedSandApp.s("Ě\u0001"));
    }

    public long a() {
        return this.f59837a.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(this.f59837a.currentTimeMillis());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(@o0 com.google.firebase.installations.local.d dVar) {
        if (TextUtils.isEmpty(dVar.b())) {
            return true;
        }
        return dVar.c() + dVar.h() < b() + f59833b;
    }
}
