package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.c;

/* compiled from: typeSignatureMapping.kt */
@r1({"SMAP\ntypeSignatureMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/TypeSignatureMappingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1#2:104\n1747#3,3:105\n*S KotlinDebug\n*F\n+ 1 typeSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/TypeSignatureMappingKt\n*L\n55#1:105,3\n*E\n"})
/* loaded from: classes7.dex */
public final class e0 {
    @fg.l
    public static final <T> T a(@fg.l p<T> pVar, @fg.l T t4, boolean z4) {
        l0.p(pVar, ProtectedSandApp.s("玾\u0001"));
        l0.p(t4, ProtectedSandApp.s("玿\u0001"));
        return z4 ? pVar.b(t4) : t4;
    }

    @fg.m
    public static final <T> T b(@fg.l kotlin.reflect.jvm.internal.impl.types.r1 r1Var, @fg.l ce.i iVar, @fg.l p<T> pVar, @fg.l d0 d0Var) {
        l0.p(r1Var, ProtectedSandApp.s("玾\u0001"));
        l0.p(iVar, ProtectedSandApp.s("珀\u0001"));
        l0.p(pVar, ProtectedSandApp.s("珁\u0001"));
        l0.p(d0Var, ProtectedSandApp.s("珂\u0001"));
        ce.n L = r1Var.L(iVar);
        if (!r1Var.v(L)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.builtins.i R = r1Var.R(L);
        if (R != null) {
            return (T) a(pVar, pVar.c(R), r1Var.A0(iVar) || kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.s.c(r1Var, iVar));
        }
        kotlin.reflect.jvm.internal.impl.builtins.i J = r1Var.J(L);
        if (J != null) {
            return pVar.a(ProtectedSandApp.s("珃\u0001") + kotlin.reflect.jvm.internal.impl.resolve.jvm.e.get(J).getDesc());
        }
        if (r1Var.z0(L)) {
            kotlin.reflect.jvm.internal.impl.name.d r02 = r1Var.r0(L);
            kotlin.reflect.jvm.internal.impl.name.b n4 = r02 != null ? kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f75734a.n(r02) : null;
            if (n4 != null) {
                if (!d0Var.a()) {
                    List<c.a> i4 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f75734a.i();
                    if (!(i4 instanceof Collection) || !i4.isEmpty()) {
                        Iterator<T> it = i4.iterator();
                        while (it.hasNext()) {
                            if (l0.g(((c.a) it.next()).d(), n4)) {
                                return null;
                            }
                        }
                    }
                }
                String f4 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.b(n4).f();
                l0.o(f4, ProtectedSandApp.s("珄\u0001"));
                return pVar.e(f4);
            }
        }
        return null;
    }
}
