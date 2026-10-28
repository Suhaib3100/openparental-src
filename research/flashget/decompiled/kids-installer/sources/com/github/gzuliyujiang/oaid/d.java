package com.github.gzuliyujiang.oaid;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;

/* compiled from: DeviceIdentifier.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f12199a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile String f12200b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile String f12201c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile String f12202d;

    /* renamed from: e, reason: collision with root package name */
    private static volatile String f12203e;

    /* renamed from: f, reason: collision with root package name */
    private static volatile String f12204f;

    /* renamed from: g, reason: collision with root package name */
    private static volatile String f12205g;

    /* renamed from: h, reason: collision with root package name */
    private static volatile String f12206h;

    /* compiled from: DeviceIdentifier.java */
    /* loaded from: classes3.dex */
    static class a implements e {
        a() {
        }

        @Override // com.github.gzuliyujiang.oaid.e
        public void a(String result) {
            String unused = d.f12202d = result;
        }

        @Override // com.github.gzuliyujiang.oaid.e
        public void b(Exception error) {
            String unused = d.f12202d = "";
        }
    }

    private d() {
    }

    public static String b(Context context) {
        if (f12203e == null) {
            synchronized (d.class) {
                if (f12203e == null) {
                    f12203e = c.d(context);
                }
            }
        }
        if (f12203e == null) {
            f12203e = "";
        }
        return f12203e;
    }

    public static String c() {
        if (TextUtils.isEmpty(f12200b)) {
            synchronized (d.class) {
                if (TextUtils.isEmpty(f12200b)) {
                    f12200b = c.f();
                }
            }
        }
        if (f12200b == null) {
            f12200b = "";
        }
        return f12200b;
    }

    public static String d(Context context) {
        if (f12206h == null) {
            synchronized (d.class) {
                if (f12206h == null) {
                    f12206h = c.h(context);
                }
            }
        }
        if (f12206h == null) {
            f12206h = "";
        }
        return f12206h;
    }

    public static String e(Context context) {
        if (f12201c == null) {
            synchronized (d.class) {
                if (f12201c == null) {
                    f12201c = c.n(context);
                }
            }
        }
        if (f12201c == null) {
            f12201c = "";
        }
        return f12201c;
    }

    public static String f(Context context) {
        if (TextUtils.isEmpty(f12202d)) {
            synchronized (d.class) {
                if (TextUtils.isEmpty(f12202d)) {
                    f12202d = c.k();
                    if (f12202d == null || f12202d.length() == 0) {
                        c.l(context, new a());
                    }
                }
            }
        }
        if (f12202d == null) {
            f12202d = "";
        }
        return f12202d;
    }

    public static String g() {
        if (f12205g == null) {
            synchronized (d.class) {
                if (f12205g == null) {
                    f12205g = c.m();
                }
            }
        }
        if (f12205g == null) {
            f12205g = "";
        }
        return f12205g;
    }

    public static String h() {
        if (f12204f == null) {
            synchronized (d.class) {
                if (f12204f == null) {
                    f12204f = c.r();
                }
            }
        }
        if (f12204f == null) {
            f12204f = "";
        }
        return f12204f;
    }

    public static void i(Application application) {
        if (f12199a) {
            return;
        }
        synchronized (d.class) {
            if (!f12199a) {
                c.s(application);
                f12199a = true;
            }
        }
    }
}
