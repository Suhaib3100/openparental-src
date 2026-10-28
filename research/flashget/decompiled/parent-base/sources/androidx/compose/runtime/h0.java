package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.h;
import androidx.compose.runtime.internal.s;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: CompositionLocalMap.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aD\u0010\b\u001a\u00020\u0000*\u00020\u00002.\u0010\u0007\u001a*\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00050\u0002\u0012\u0004\u0012\u00020\u00060\u0001H\u0080\b¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n*\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n*\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0000¢\u0006\u0004\b\u0011\u0010\u0010\u001a5\u0010\u0017\u001a\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00130\u00122\u0006\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/t2;", "Lkotlin/Function1;", "", "Landroidx/compose/runtime/d0;", "", "Landroidx/compose/runtime/b5;", "Lkotlin/k2;", "mutator", "c", "(Landroidx/compose/runtime/t2;Lld/l;)Landroidx/compose/runtime/t2;", "T", "key", "", "a", "(Landroidx/compose/runtime/t2;Landroidx/compose/runtime/d0;)Z", "b", "(Landroidx/compose/runtime/t2;Landroidx/compose/runtime/d0;)Ljava/lang/Object;", "d", "", "Landroidx/compose/runtime/b3;", "values", "parentScope", "previous", "e", "([Landroidx/compose/runtime/b3;Landroidx/compose/runtime/t2;Landroidx/compose/runtime/t2;)Landroidx/compose/runtime/t2;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h0 {
    public static final <T> boolean a(@fg.l t2 t2Var, @fg.l d0<T> d0Var) {
        kotlin.jvm.internal.l0.n(d0Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return t2Var.containsKey(d0Var);
    }

    public static final <T> T b(@fg.l t2 t2Var, @fg.l d0<T> d0Var) {
        kotlin.jvm.internal.l0.n(d0Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        b5<? extends Object> b5Var = t2Var.get(d0Var);
        if (b5Var != null) {
            return (T) b5Var.getValue();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.runtime.t2] */
    @fg.l
    public static final t2 c(@fg.l t2 t2Var, @fg.l ld.l<? super Map<d0<Object>, b5<Object>>, kotlin.k2> lVar) {
        h.a<d0<Object>, b5<? extends Object>> g4 = t2Var.g();
        lVar.invoke(g4);
        return g4.a2();
    }

    public static final <T> T d(@fg.l t2 t2Var, @fg.l d0<T> d0Var) {
        return a(t2Var, d0Var) ? (T) b(t2Var, d0Var) : d0Var.c().getValue();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.runtime.t2] */
    @fg.l
    public static final t2 e(@fg.l b3<?>[] b3VarArr, @fg.l t2 t2Var, @fg.l t2 t2Var2) {
        androidx.compose.runtime.internal.s b5 = androidx.compose.runtime.internal.t.b();
        b5.getClass();
        s.a aVar = new s.a(b5);
        for (b3<?> b3Var : b3VarArr) {
            d0<?> b6 = b3Var.b();
            kotlin.jvm.internal.l0.n(b6, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            a3 a3Var = (a3) b6;
            if (b3Var.getCanOverride() || !a(t2Var, a3Var)) {
                aVar.put(a3Var, a3Var.d(b3Var.c(), (b5) t2Var2.get(a3Var)));
            }
        }
        return aVar.a2();
    }

    public static /* synthetic */ t2 f(b3[] b3VarArr, t2 t2Var, t2 t2Var2, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            t2Var2 = androidx.compose.runtime.internal.t.b();
        }
        return e(b3VarArr, t2Var, t2Var2);
    }
}
