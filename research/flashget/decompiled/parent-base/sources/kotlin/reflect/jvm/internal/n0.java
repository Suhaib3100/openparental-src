package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.types.h1;

/* compiled from: typeOfImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lkotlin/reflect/s;", "lowerBound", "upperBound", "c", "(Lkotlin/reflect/s;Lkotlin/reflect/s;)Lkotlin/reflect/s;", "type", "a", "(Lkotlin/reflect/s;)Lkotlin/reflect/s;", "Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "d", "(Lkotlin/reflect/jvm/internal/impl/descriptors/e;)Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "b", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\ntypeOfImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeOfImpl.kt\nkotlin/reflect/jvm/internal/TypeOfImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
/* loaded from: classes7.dex */
public final class n0 {
    @fg.l
    public static final kotlin.reflect.s a(@fg.l kotlin.reflect.s sVar) {
        kotlin.jvm.internal.l0.p(sVar, ProtectedSandApp.s("臜\u0001"));
        kotlin.reflect.jvm.internal.impl.types.h0 type = ((d0) sVar).getType();
        if (!(type instanceof kotlin.reflect.jvm.internal.impl.types.p0)) {
            throw new IllegalArgumentException((ProtectedSandApp.s("臟\u0001") + sVar).toString());
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = type.O0().c();
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) c5 : null;
        if (eVar == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("臞\u0001") + sVar);
        }
        kotlin.reflect.jvm.internal.impl.types.p0 p0Var = (kotlin.reflect.jvm.internal.impl.types.p0) type;
        h1 j4 = d(eVar).j();
        kotlin.jvm.internal.l0.o(j4, ProtectedSandApp.s("臝\u0001"));
        return new d0(kotlin.reflect.jvm.internal.impl.types.i0.k(p0Var, null, j4, null, false, 26, null), null, 2, null);
    }

    @fg.l
    public static final kotlin.reflect.s b(@fg.l kotlin.reflect.s sVar) {
        kotlin.jvm.internal.l0.p(sVar, ProtectedSandApp.s("臜\u0001"));
        kotlin.reflect.jvm.internal.impl.types.h0 type = ((d0) sVar).getType();
        if (!(type instanceof kotlin.reflect.jvm.internal.impl.types.p0)) {
            throw new IllegalArgumentException((ProtectedSandApp.s("臠\u0001") + sVar).toString());
        }
        kotlin.reflect.jvm.internal.impl.types.p0 p0Var = (kotlin.reflect.jvm.internal.impl.types.p0) type;
        h1 j4 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.i(type).G().j();
        kotlin.jvm.internal.l0.o(j4, ProtectedSandApp.s("臝\u0001"));
        return new d0(kotlin.reflect.jvm.internal.impl.types.i0.k(p0Var, null, j4, null, false, 26, null), null, 2, null);
    }

    @fg.l
    public static final kotlin.reflect.s c(@fg.l kotlin.reflect.s sVar, @fg.l kotlin.reflect.s sVar2) {
        kotlin.jvm.internal.l0.p(sVar, ProtectedSandApp.s("臡\u0001"));
        kotlin.jvm.internal.l0.p(sVar2, ProtectedSandApp.s("臢\u0001"));
        kotlin.reflect.jvm.internal.impl.types.h0 type = ((d0) sVar).getType();
        String s4 = ProtectedSandApp.s("臣\u0001");
        kotlin.jvm.internal.l0.n(type, s4);
        kotlin.reflect.jvm.internal.impl.types.h0 type2 = ((d0) sVar2).getType();
        kotlin.jvm.internal.l0.n(type2, s4);
        return new d0(kotlin.reflect.jvm.internal.impl.types.i0.d((kotlin.reflect.jvm.internal.impl.types.p0) type, (kotlin.reflect.jvm.internal.impl.types.p0) type2), null, 2, null);
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.e d(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        kotlin.reflect.jvm.internal.impl.name.c p4 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f75734a.p(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.m(eVar));
        if (p4 != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.e o4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(eVar).o(p4);
            kotlin.jvm.internal.l0.o(o4, ProtectedSandApp.s("臤\u0001"));
            return o4;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("臥\u0001") + eVar);
    }
}
