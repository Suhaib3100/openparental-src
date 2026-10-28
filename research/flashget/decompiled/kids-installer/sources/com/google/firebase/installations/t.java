package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: Utils.java */
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    private static t f16968e;

    /* renamed from: a, reason: collision with root package name */
    private final s2.a f16969a;

    /* renamed from: c, reason: collision with root package name */
    private static final String f16966c = ProtectedSandApp.s("ᛑ");

    /* renamed from: b, reason: collision with root package name */
    public static final long f16965b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f16967d = Pattern.compile(ProtectedSandApp.s("ᛒ"));

    private t(s2.a aVar) {
        this.f16969a = aVar;
    }

    public static t c() {
        return d(s2.b.a());
    }

    public static t d(s2.a aVar) {
        if (f16968e == null) {
            f16968e = new t(aVar);
        }
        return f16968e;
    }

    static boolean g(@q0 String str) {
        return f16967d.matcher(str).matches();
    }

    static boolean h(@q0 String str) {
        return str.contains(ProtectedSandApp.s("ᛓ"));
    }

    public long a() {
        return this.f16969a.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(@o0 com.google.firebase.installations.local.d dVar) {
        if (TextUtils.isEmpty(dVar.b())) {
            return true;
        }
        return dVar.c() + dVar.h() < b() + f16965b;
    }
}
