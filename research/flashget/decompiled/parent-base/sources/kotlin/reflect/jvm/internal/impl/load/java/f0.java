package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.compose.material3.j4;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: propertiesConventionUtil.kt */
@r1({"SMAP\npropertiesConventionUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 propertiesConventionUtil.kt\norg/jetbrains/kotlin/load/java/PropertiesConventionUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n766#2:103\n857#2,2:104\n*S KotlinDebug\n*F\n+ 1 propertiesConventionUtil.kt\norg/jetbrains/kotlin/load/java/PropertiesConventionUtilKt\n*L\n90#1:103\n90#1:104,2\n*E\n"})
/* loaded from: classes7.dex */
public final class f0 {
    @fg.l
    public static final List<kotlin.reflect.jvm.internal.impl.name.f> a(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(fVar, ProtectedSandApp.s("点\u0001"));
        String b5 = fVar.b();
        l0.o(b5, ProtectedSandApp.s("為\u0001"));
        return a0.c(b5) ? kotlin.collections.w.P(b(fVar)) : a0.d(b5) ? f(fVar) : g.f76425a.b(fVar);
    }

    @fg.m
    public static final kotlin.reflect.jvm.internal.impl.name.f b(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(fVar, ProtectedSandApp.s("炻\u0001"));
        kotlin.reflect.jvm.internal.impl.name.f e4 = e(fVar, ProtectedSandApp.s("炼\u0001"), false, null, 12, null);
        return e4 == null ? e(fVar, ProtectedSandApp.s("炽\u0001"), false, null, 8, null) : e4;
    }

    @fg.m
    public static final kotlin.reflect.jvm.internal.impl.name.f c(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, boolean z4) {
        l0.p(fVar, ProtectedSandApp.s("炻\u0001"));
        return e(fVar, ProtectedSandApp.s("炾\u0001"), false, z4 ? ProtectedSandApp.s("炽\u0001") : null, 4, null);
    }

    private static final kotlin.reflect.jvm.internal.impl.name.f d(kotlin.reflect.jvm.internal.impl.name.f fVar, String str, boolean z4, String str2) {
        if (fVar.g()) {
            return null;
        }
        String d5 = fVar.d();
        l0.o(d5, ProtectedSandApp.s("炿\u0001"));
        if (!kotlin.text.v.s2(d5, str, false, 2, null) || d5.length() == str.length()) {
            return null;
        }
        char charAt = d5.charAt(str.length());
        if ('a' <= charAt && charAt < '{') {
            return null;
        }
        if (str2 != null) {
            StringBuilder a5 = j4.a(str2);
            a5.append(kotlin.text.v.a4(d5, str));
            return kotlin.reflect.jvm.internal.impl.name.f.f(a5.toString());
        }
        if (!z4) {
            return fVar;
        }
        String c5 = de.a.c(kotlin.text.v.a4(d5, str), true);
        if (kotlin.reflect.jvm.internal.impl.name.f.h(c5)) {
            return kotlin.reflect.jvm.internal.impl.name.f.f(c5);
        }
        return null;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.name.f e(kotlin.reflect.jvm.internal.impl.name.f fVar, String str, boolean z4, String str2, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        if ((i4 & 8) != 0) {
            str2 = null;
        }
        return d(fVar, str, z4, str2);
    }

    @fg.l
    public static final List<kotlin.reflect.jvm.internal.impl.name.f> f(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(fVar, ProtectedSandApp.s("炻\u0001"));
        return kotlin.collections.w.Q(c(fVar, false), c(fVar, true));
    }
}
