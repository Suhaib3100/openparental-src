package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import kotlin.collections.l1;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: JavaToKotlinClassMapper.kt */
@r1({"SMAP\nJavaToKotlinClassMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaToKotlinClassMapper.kt\norg/jetbrains/kotlin/builtins/jvm/JavaToKotlinClassMapper\n*L\n1#1,80:1\n75#1,3:81\n75#1,3:84\n*S KotlinDebug\n*F\n+ 1 JavaToKotlinClassMapper.kt\norg/jetbrains/kotlin/builtins/jvm/JavaToKotlinClassMapper\n*L\n59#1:81,3\n65#1:84,3\n*E\n"})
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final d f75754a = new d();

    private d() {
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.e f(d dVar, kotlin.reflect.jvm.internal.impl.name.c cVar, kotlin.reflect.jvm.internal.impl.builtins.h hVar, Integer num, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            num = null;
        }
        return dVar.e(cVar, hVar, num);
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.e a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(eVar, ProtectedSandApp.s("楊\u0001"));
        kotlin.reflect.jvm.internal.impl.name.c o4 = c.f75734a.o(kotlin.reflect.jvm.internal.impl.resolve.f.m(eVar));
        if (o4 != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.e o5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(eVar).o(o4);
            l0.o(o5, ProtectedSandApp.s("楋\u0001"));
            return o5;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("楌\u0001") + eVar + ProtectedSandApp.s("楍\u0001"));
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.e b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(eVar, ProtectedSandApp.s("楎\u0001"));
        kotlin.reflect.jvm.internal.impl.name.c p4 = c.f75734a.p(kotlin.reflect.jvm.internal.impl.resolve.f.m(eVar));
        if (p4 != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.e o4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(eVar).o(p4);
            l0.o(o4, ProtectedSandApp.s("楋\u0001"));
            return o4;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("楌\u0001") + eVar + ProtectedSandApp.s("楏\u0001"));
    }

    public final boolean c(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(eVar, ProtectedSandApp.s("楊\u0001"));
        return c.f75734a.k(kotlin.reflect.jvm.internal.impl.resolve.f.m(eVar));
    }

    public final boolean d(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(eVar, ProtectedSandApp.s("楎\u0001"));
        return c.f75734a.l(kotlin.reflect.jvm.internal.impl.resolve.f.m(eVar));
    }

    @fg.m
    public final kotlin.reflect.jvm.internal.impl.descriptors.e e(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.builtins.h hVar, @fg.m Integer num) {
        l0.p(cVar, ProtectedSandApp.s("楐\u0001"));
        l0.p(hVar, ProtectedSandApp.s("楑\u0001"));
        kotlin.reflect.jvm.internal.impl.name.b m4 = (num == null || !l0.g(cVar, c.f75734a.h())) ? c.f75734a.m(cVar) : kotlin.reflect.jvm.internal.impl.builtins.l.a(num.intValue());
        if (m4 != null) {
            return hVar.o(m4.b());
        }
        return null;
    }

    @fg.l
    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> g(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.builtins.h hVar) {
        l0.p(cVar, ProtectedSandApp.s("楐\u0001"));
        l0.p(hVar, ProtectedSandApp.s("楑\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.e f4 = f(this, cVar, hVar, null, 4, null);
        if (f4 == null) {
            return kotlin.collections.l0.f74939b;
        }
        kotlin.reflect.jvm.internal.impl.name.c p4 = c.f75734a.p(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.m(f4));
        if (p4 == null) {
            return l1.f(f4);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e o4 = hVar.o(p4);
        l0.o(o4, ProtectedSandApp.s("楋\u0001"));
        return w.O(f4, o4);
    }
}
