package com.github.gzuliyujiang.oaid;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;

/* compiled from: DeviceIdentifier.java */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f50125a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile String f50126b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile String f50127c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile String f50128d;

    /* renamed from: e, reason: collision with root package name */
    private static volatile String f50129e;

    /* renamed from: f, reason: collision with root package name */
    private static volatile String f50130f;

    /* renamed from: g, reason: collision with root package name */
    private static volatile String f50131g;

    /* renamed from: h, reason: collision with root package name */
    private static volatile String f50132h;

    /* compiled from: DeviceIdentifier.java */
    static class a implements g {
        a() {
        }

        @Override // com.github.gzuliyujiang.oaid.g
        public void a(String result) {
            String unused = f.f50128d = result;
        }

        @Override // com.github.gzuliyujiang.oaid.g
        public void b(Exception error) {
            String unused = f.f50128d = "";
        }
    }

    private f() {
    }

    public static String b(Context context) {
        if (f50129e == null) {
            synchronized (f.class) {
                try {
                    if (f50129e == null) {
                        f50129e = e.d(context);
                    }
                } finally {
                }
            }
        }
        if (f50129e == null) {
            f50129e = "";
        }
        return f50129e;
    }

    public static String c() {
        if (TextUtils.isEmpty(f50126b)) {
            synchronized (f.class) {
                try {
                    if (TextUtils.isEmpty(f50126b)) {
                        f50126b = e.f();
                    }
                } finally {
                }
            }
        }
        if (f50126b == null) {
            f50126b = "";
        }
        return f50126b;
    }

    public static String d(Context context) {
        if (f50132h == null) {
            synchronized (f.class) {
                try {
                    if (f50132h == null) {
                        f50132h = e.h(context);
                    }
                } finally {
                }
            }
        }
        if (f50132h == null) {
            f50132h = "";
        }
        return f50132h;
    }

    public static String e(Context context) {
        if (f50127c == null) {
            synchronized (f.class) {
                try {
                    if (f50127c == null) {
                        f50127c = e.n(context);
                    }
                } finally {
                }
            }
        }
        if (f50127c == null) {
            f50127c = "";
        }
        return f50127c;
    }

    public static String f(Context context) {
        if (TextUtils.isEmpty(f50128d)) {
            synchronized (f.class) {
                try {
                    if (TextUtils.isEmpty(f50128d)) {
                        f50128d = e.k();
                        if (f50128d != null) {
                            if (f50128d.length() == 0) {
                            }
                        }
                        e.l(context, new a());
                    }
                } finally {
                }
            }
        }
        if (f50128d == null) {
            f50128d = "";
        }
        return f50128d;
    }

    public static String g() {
        if (f50131g == null) {
            synchronized (f.class) {
                try {
                    if (f50131g == null) {
                        f50131g = e.m();
                    }
                } finally {
                }
            }
        }
        if (f50131g == null) {
            f50131g = "";
        }
        return f50131g;
    }

    public static String h() {
        if (f50130f == null) {
            synchronized (f.class) {
                try {
                    if (f50130f == null) {
                        f50130f = e.r();
                    }
                } finally {
                }
            }
        }
        if (f50130f == null) {
            f50130f = "";
        }
        return f50130f;
    }

    public static void i(Application application) {
        if (f50125a) {
            return;
        }
        synchronized (f.class) {
            try {
                if (!f50125a) {
                    e.s(application);
                    f50125a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
