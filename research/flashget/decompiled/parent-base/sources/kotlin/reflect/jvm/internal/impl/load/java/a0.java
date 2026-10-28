package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: JvmAbi.kt */
/* loaded from: classes7.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final a0 f76320a = new a0();

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final kotlin.reflect.jvm.internal.impl.name.c f76321b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final kotlin.reflect.jvm.internal.impl.name.b f76322c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.name.b f76323d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.name.b f76324e;

    static {
        kotlin.reflect.jvm.internal.impl.name.c cVar = new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("潸\u0001"));
        f76321b = cVar;
        kotlin.reflect.jvm.internal.impl.name.b m4 = kotlin.reflect.jvm.internal.impl.name.b.m(cVar);
        String s4 = ProtectedSandApp.s("潹\u0001");
        l0.o(m4, s4);
        f76322c = m4;
        kotlin.reflect.jvm.internal.impl.name.b m5 = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("潺\u0001")));
        l0.o(m5, s4);
        f76323d = m5;
        kotlin.reflect.jvm.internal.impl.name.b e4 = kotlin.reflect.jvm.internal.impl.name.b.e(ProtectedSandApp.s("潻\u0001"));
        l0.o(e4, ProtectedSandApp.s("潼\u0001"));
        f76324e = e4;
    }

    private a0() {
    }

    @fg.l
    @kd.n
    public static final String b(@fg.l String str) {
        l0.p(str, ProtectedSandApp.s("潽\u0001"));
        if (f(str)) {
            return str;
        }
        return ProtectedSandApp.s("潾\u0001") + de.a.a(str);
    }

    @kd.n
    public static final boolean c(@fg.l String str) {
        l0.p(str, ProtectedSandApp.s("潿\u0001"));
        return kotlin.text.v.s2(str, ProtectedSandApp.s("潾\u0001"), false, 2, null) || kotlin.text.v.s2(str, ProtectedSandApp.s("澀\u0001"), false, 2, null);
    }

    @kd.n
    public static final boolean d(@fg.l String str) {
        l0.p(str, ProtectedSandApp.s("潿\u0001"));
        return kotlin.text.v.s2(str, ProtectedSandApp.s("澁\u0001"), false, 2, null);
    }

    @fg.l
    @kd.n
    public static final String e(@fg.l String str) {
        String a5;
        l0.p(str, ProtectedSandApp.s("潽\u0001"));
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("澁\u0001"));
        if (f(str)) {
            a5 = str.substring(2);
            l0.o(a5, ProtectedSandApp.s("澂\u0001"));
        } else {
            a5 = de.a.a(str);
        }
        sb.append(a5);
        return sb.toString();
    }

    @kd.n
    public static final boolean f(@fg.l String str) {
        l0.p(str, ProtectedSandApp.s("潿\u0001"));
        if (!kotlin.text.v.s2(str, ProtectedSandApp.s("澀\u0001"), false, 2, null) || str.length() == 2) {
            return false;
        }
        char charAt = str.charAt(2);
        return l0.t(97, charAt) > 0 || l0.t(charAt, 122) > 0;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.name.b a() {
        return f76324e;
    }
}
