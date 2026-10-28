package androidx.compose.runtime.internal;

import androidx.compose.runtime.e3;
import androidx.compose.runtime.f3;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: ComposableLambda.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001d\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018\"\u0014\u0010\u001a\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018¨\u0006\u001b"}, d2 = {"", "bits", "slot", "a", "(II)I", "f", "(I)I", "d", "Landroidx/compose/runtime/e3;", "other", "", "e", "(Landroidx/compose/runtime/e3;Landroidx/compose/runtime/e3;)Z", "Landroidx/compose/runtime/t;", "composer", "key", "tracked", "", "block", "Landroidx/compose/runtime/internal/a;", "b", "(Landroidx/compose/runtime/t;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/a;", "c", "(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/a;", "I", "SLOTS_PER_INT", "BITS_PER_SLOT", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nComposableLambda.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambda.kt\nandroidx/compose/runtime/internal/ComposableLambdaKt\n+ 2 BitwiseOperators.kt\nandroidx/compose/runtime/BitwiseOperatorsKt\n*L\n1#1,617:1\n26#2:618\n*S KotlinDebug\n*F\n+ 1 ComposableLambda.kt\nandroidx/compose/runtime/internal/ComposableLambdaKt\n*L\n594#1:618\n*E\n"})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f16784a = 10;

    /* renamed from: b, reason: collision with root package name */
    private static final int f16785b = 3;

    public static final int a(int i4, int i5) {
        return i4 << (((i5 % 10) * 3) + 1);
    }

    @fg.l
    @androidx.compose.runtime.q
    public static final a b(@fg.l androidx.compose.runtime.t tVar, int i4, boolean z4, @fg.l Object obj) {
        b bVar;
        tVar.P(Integer.rotateLeft(i4, 1));
        Object Q = tVar.Q();
        if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
            bVar = new b(i4, z4, obj);
            tVar.E(bVar);
        } else {
            l0.n(Q, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            bVar = (b) Q;
            bVar.W(obj);
        }
        tVar.p0();
        return bVar;
    }

    @fg.l
    @androidx.compose.runtime.q
    public static final a c(int i4, boolean z4, @fg.l Object obj) {
        return new b(i4, z4, obj);
    }

    public static final int d(int i4) {
        return a(2, i4);
    }

    public static final boolean e(@fg.m e3 e3Var, @fg.l e3 e3Var2) {
        if (e3Var != null) {
            if ((e3Var instanceof f3) && (e3Var2 instanceof f3)) {
                f3 f3Var = (f3) e3Var;
                if (!f3Var.v() || l0.g(e3Var, e3Var2) || l0.g(f3Var.getAnchor(), ((f3) e3Var2).getAnchor())) {
                }
            }
            return false;
        }
        return true;
    }

    public static final int f(int i4) {
        return a(1, i4);
    }
}
