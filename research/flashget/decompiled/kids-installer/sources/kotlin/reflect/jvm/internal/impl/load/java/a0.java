package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: JvmAbi.kt */
/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final a0 f24470a = new a0();

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final kotlin.reflect.jvm.internal.impl.name.c f24471b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final kotlin.reflect.jvm.internal.impl.name.b f24472c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.b f24473d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.b f24474e;

    static {
        kotlin.reflect.jvm.internal.impl.name.c cVar = new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䣧"));
        f24471b = cVar;
        kotlin.reflect.jvm.internal.impl.name.b m5 = kotlin.reflect.jvm.internal.impl.name.b.m(cVar);
        l0.o(m5, ProtectedSandApp.s("䣨"));
        f24472c = m5;
        kotlin.reflect.jvm.internal.impl.name.b m6 = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䣩")));
        l0.o(m6, ProtectedSandApp.s("䣪"));
        f24473d = m6;
        kotlin.reflect.jvm.internal.impl.name.b e6 = kotlin.reflect.jvm.internal.impl.name.b.e(ProtectedSandApp.s("䣫"));
        l0.o(e6, ProtectedSandApp.s("䣬"));
        f24474e = e6;
    }

    private a0() {
    }

    @d5.d
    @p3.n
    public static final String b(@d5.d String str) {
        l0.p(str, ProtectedSandApp.s("䣭"));
        if (f(str)) {
            return str;
        }
        return ProtectedSandApp.s("䣮") + i4.a.a(str);
    }

    @p3.n
    public static final boolean c(@d5.d String str) {
        boolean s22;
        boolean s23;
        l0.p(str, ProtectedSandApp.s("䣯"));
        s22 = kotlin.text.e0.s2(str, ProtectedSandApp.s("䣰"), false, 2, null);
        if (!s22) {
            s23 = kotlin.text.e0.s2(str, ProtectedSandApp.s("䣱"), false, 2, null);
            if (!s23) {
                return false;
            }
        }
        return true;
    }

    @p3.n
    public static final boolean d(@d5.d String str) {
        boolean s22;
        l0.p(str, ProtectedSandApp.s("䣲"));
        s22 = kotlin.text.e0.s2(str, ProtectedSandApp.s("䣳"), false, 2, null);
        return s22;
    }

    @d5.d
    @p3.n
    public static final String e(@d5.d String str) {
        String a6;
        l0.p(str, ProtectedSandApp.s("䣴"));
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䣵"));
        if (f(str)) {
            a6 = str.substring(2);
            l0.o(a6, ProtectedSandApp.s("䣶"));
        } else {
            a6 = i4.a.a(str);
        }
        sb.append(a6);
        return sb.toString();
    }

    @p3.n
    public static final boolean f(@d5.d String str) {
        boolean s22;
        l0.p(str, ProtectedSandApp.s("䣷"));
        s22 = kotlin.text.e0.s2(str, ProtectedSandApp.s("䣸"), false, 2, null);
        if (!s22 || str.length() == 2) {
            return false;
        }
        char charAt = str.charAt(2);
        return l0.t(97, charAt) > 0 || l0.t(charAt, 122) > 0;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.name.b a() {
        return f24474e;
    }
}
