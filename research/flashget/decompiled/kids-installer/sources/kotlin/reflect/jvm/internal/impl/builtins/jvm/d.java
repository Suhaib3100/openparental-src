package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.a0;
import kotlin.collections.p1;
import kotlin.jvm.internal.l0;

/* compiled from: JavaToKotlinClassMapper.kt */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final d f23962a = new d();

    private d() {
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.e f(d dVar, kotlin.reflect.jvm.internal.impl.name.c cVar, kotlin.reflect.jvm.internal.impl.builtins.h hVar, Integer num, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            num = null;
        }
        return dVar.e(cVar, hVar, num);
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.descriptors.e a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(eVar, ProtectedSandApp.s("䕈"));
        kotlin.reflect.jvm.internal.impl.name.c o5 = c.f23942a.o(kotlin.reflect.jvm.internal.impl.resolve.e.m(eVar));
        if (o5 != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.e o6 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(eVar).o(o5);
            l0.o(o6, ProtectedSandApp.s("䕉"));
            return o6;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("䕊") + eVar + ProtectedSandApp.s("䕋"));
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.descriptors.e b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(eVar, ProtectedSandApp.s("䕌"));
        kotlin.reflect.jvm.internal.impl.name.c p5 = c.f23942a.p(kotlin.reflect.jvm.internal.impl.resolve.e.m(eVar));
        if (p5 != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.e o5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(eVar).o(p5);
            l0.o(o5, ProtectedSandApp.s("䕍"));
            return o5;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("䕎") + eVar + ProtectedSandApp.s("䕏"));
    }

    public final boolean c(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(eVar, ProtectedSandApp.s("䕐"));
        return c.f23942a.k(kotlin.reflect.jvm.internal.impl.resolve.e.m(eVar));
    }

    public final boolean d(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(eVar, ProtectedSandApp.s("䕑"));
        return c.f23942a.l(kotlin.reflect.jvm.internal.impl.resolve.e.m(eVar));
    }

    @d5.e
    public final kotlin.reflect.jvm.internal.impl.descriptors.e e(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.builtins.h hVar, @d5.e Integer num) {
        l0.p(cVar, ProtectedSandApp.s("䕒"));
        l0.p(hVar, ProtectedSandApp.s("䕓"));
        kotlin.reflect.jvm.internal.impl.name.b m5 = (num == null || !l0.g(cVar, c.f23942a.h())) ? c.f23942a.m(cVar) : kotlin.reflect.jvm.internal.impl.builtins.l.a(num.intValue());
        if (m5 != null) {
            return hVar.o(m5.b());
        }
        return null;
    }

    @d5.d
    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> g(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.builtins.h hVar) {
        List O;
        Set f6;
        l0.p(cVar, ProtectedSandApp.s("䕔"));
        l0.p(hVar, ProtectedSandApp.s("䕕"));
        kotlin.reflect.jvm.internal.impl.descriptors.e f7 = f(this, cVar, hVar, null, 4, null);
        if (f7 == null) {
            return EmptySet.f23181o;
        }
        kotlin.reflect.jvm.internal.impl.name.c p5 = c.f23942a.p(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.m(f7));
        if (p5 == null) {
            f6 = p1.f(f7);
            return f6;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e o5 = hVar.o(p5);
        l0.o(o5, ProtectedSandApp.s("䕖"));
        O = a0.O(f7, o5);
        return O;
    }
}
