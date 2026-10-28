package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: typeOfImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0002\u001a\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0000¨\u0006\t"}, d2 = {"Lkotlin/reflect/s;", "lowerBound", "upperBound", "c", "type", "a", "Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "d", "b", "kotlin-reflection"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class l0 {
    @d5.d
    public static final KType a(@d5.d KType kType) {
        kotlin.jvm.internal.l0.p(kType, ProtectedSandApp.s("奨"));
        kotlin.reflect.jvm.internal.impl.types.h0 type = ((b0) kType).getType();
        if (!(type instanceof p0)) {
            throw new IllegalArgumentException((ProtectedSandApp.s("奫") + kType).toString());
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = type.U0().b();
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) b6 : null;
        if (eVar == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("奪") + kType);
        }
        p0 p0Var = (p0) type;
        h1 m5 = d(eVar).m();
        kotlin.jvm.internal.l0.o(m5, ProtectedSandApp.s("奩"));
        return new b0(kotlin.reflect.jvm.internal.impl.types.i0.k(p0Var, null, m5, null, false, 26, null), null, 2, null);
    }

    @d5.d
    public static final KType b(@d5.d KType kType) {
        kotlin.jvm.internal.l0.p(kType, ProtectedSandApp.s("奬"));
        kotlin.reflect.jvm.internal.impl.types.h0 type = ((b0) kType).getType();
        if (!(type instanceof p0)) {
            throw new IllegalArgumentException((ProtectedSandApp.s("奮") + kType).toString());
        }
        p0 p0Var = (p0) type;
        h1 m5 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.i(type).G().m();
        kotlin.jvm.internal.l0.o(m5, ProtectedSandApp.s("奭"));
        return new b0(kotlin.reflect.jvm.internal.impl.types.i0.k(p0Var, null, m5, null, false, 26, null), null, 2, null);
    }

    @d5.d
    public static final KType c(@d5.d KType kType, @d5.d KType kType2) {
        kotlin.jvm.internal.l0.p(kType, ProtectedSandApp.s("奯"));
        kotlin.jvm.internal.l0.p(kType2, ProtectedSandApp.s("奰"));
        kotlin.reflect.jvm.internal.impl.types.h0 type = ((b0) kType).getType();
        String s5 = ProtectedSandApp.s("奱");
        kotlin.jvm.internal.l0.n(type, s5);
        kotlin.reflect.jvm.internal.impl.types.h0 type2 = ((b0) kType2).getType();
        kotlin.jvm.internal.l0.n(type2, s5);
        return new b0(kotlin.reflect.jvm.internal.impl.types.i0.d((p0) type, (p0) type2), null, 2, null);
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.e d(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        kotlin.reflect.jvm.internal.impl.name.c p5 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f23942a.p(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.m(eVar));
        if (p5 != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.e o5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(eVar).o(p5);
            kotlin.jvm.internal.l0.o(o5, ProtectedSandApp.s("奲"));
            return o5;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("女") + eVar);
    }
}
