package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.jvm.internal.l0;

/* compiled from: propertiesConventionUtil.kt */
/* loaded from: classes5.dex */
public final class f0 {
    @d5.d
    public static final List<kotlin.reflect.jvm.internal.impl.name.f> a(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
        List<kotlin.reflect.jvm.internal.impl.name.f> P;
        l0.p(fVar, ProtectedSandApp.s("䧚"));
        String h5 = fVar.h();
        l0.o(h5, ProtectedSandApp.s("䧛"));
        if (!a0.c(h5)) {
            return a0.d(h5) ? f(fVar) : g.f24571a.b(fVar);
        }
        P = kotlin.collections.a0.P(b(fVar));
        return P;
    }

    @d5.e
    public static final kotlin.reflect.jvm.internal.impl.name.f b(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(fVar, ProtectedSandApp.s("䧜"));
        kotlin.reflect.jvm.internal.impl.name.f e6 = e(fVar, ProtectedSandApp.s("䧝"), false, null, 12, null);
        return e6 == null ? e(fVar, ProtectedSandApp.s("䧞"), false, null, 8, null) : e6;
    }

    @d5.e
    public static final kotlin.reflect.jvm.internal.impl.name.f c(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, boolean z5) {
        l0.p(fVar, ProtectedSandApp.s("䧟"));
        return e(fVar, ProtectedSandApp.s("䧠"), false, z5 ? ProtectedSandApp.s("䧡") : null, 4, null);
    }

    private static final kotlin.reflect.jvm.internal.impl.name.f d(kotlin.reflect.jvm.internal.impl.name.f fVar, String str, boolean z5, String str2) {
        boolean s22;
        String a42;
        String a43;
        if (fVar.q()) {
            return null;
        }
        String l5 = fVar.l();
        l0.o(l5, ProtectedSandApp.s("䧢"));
        boolean z6 = false;
        s22 = kotlin.text.e0.s2(l5, str, false, 2, null);
        if (!s22 || l5.length() == str.length()) {
            return null;
        }
        char charAt = l5.charAt(str.length());
        if ('a' <= charAt && charAt < '{') {
            z6 = true;
        }
        if (z6) {
            return null;
        }
        if (str2 != null) {
            StringBuilder a6 = androidx.constraintlayout.motion.widget.r.a(str2);
            a43 = kotlin.text.h0.a4(l5, str);
            a6.append(a43);
            return kotlin.reflect.jvm.internal.impl.name.f.p(a6.toString());
        }
        if (!z5) {
            return fVar;
        }
        a42 = kotlin.text.h0.a4(l5, str);
        String c6 = i4.a.c(a42, true);
        if (kotlin.reflect.jvm.internal.impl.name.f.r(c6)) {
            return kotlin.reflect.jvm.internal.impl.name.f.p(c6);
        }
        return null;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.name.f e(kotlin.reflect.jvm.internal.impl.name.f fVar, String str, boolean z5, String str2, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z5 = true;
        }
        if ((i5 & 8) != 0) {
            str2 = null;
        }
        return d(fVar, str, z5, str2);
    }

    @d5.d
    public static final List<kotlin.reflect.jvm.internal.impl.name.f> f(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
        List<kotlin.reflect.jvm.internal.impl.name.f> Q;
        l0.p(fVar, ProtectedSandApp.s("䧣"));
        Q = kotlin.collections.a0.Q(c(fVar, false), c(fVar, true));
        return Q;
    }
}
