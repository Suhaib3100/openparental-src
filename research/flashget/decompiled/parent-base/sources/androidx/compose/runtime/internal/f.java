package androidx.compose.runtime.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: ComposableLambdaN.jvm.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a7\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/t;", "composer", "", "key", "", "tracked", "arity", "", "block", "Landroidx/compose/runtime/internal/d;", "a", "(Landroidx/compose/runtime/t;IZILjava/lang/Object;)Landroidx/compose/runtime/internal/d;", "b", "(IZILjava/lang/Object;)Landroidx/compose/runtime/internal/d;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaN_jvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n1#2:180\n*E\n"})
/* loaded from: classes.dex */
public final class f {
    @fg.l
    @androidx.compose.runtime.q
    public static final d a(@fg.l androidx.compose.runtime.t tVar, int i4, boolean z4, int i5, @fg.l Object obj) {
        e eVar;
        tVar.P(i4);
        Object Q = tVar.Q();
        if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
            eVar = new e(i4, z4, i5);
            tVar.E(eVar);
        } else {
            l0.n(Q, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaNImpl");
            eVar = (e) Q;
        }
        eVar.f(obj);
        tVar.p0();
        return eVar;
    }

    @fg.l
    @androidx.compose.runtime.q
    public static final d b(int i4, boolean z4, int i5, @fg.l Object obj) {
        e eVar = new e(i4, z4, i5);
        eVar.f(obj);
        return eVar;
    }
}
