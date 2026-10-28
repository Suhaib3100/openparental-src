package android.view;

import android.view.t;
import d5.d;
import d5.e;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.v0;
import q3.p;

/* compiled from: RepeatOnLifecycle.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aH\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aH\u0010\r\u001a\u00020\u0006*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/t;", "Landroidx/lifecycle/t$c;", "state", "Lkotlin/Function2;", "Lkotlinx/coroutines/u0;", "Lkotlin/coroutines/d;", "Lkotlin/m2;", "", "Lkotlin/u;", "block", "a", "(Landroidx/lifecycle/t;Landroidx/lifecycle/t$c;Lq3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/lifecycle/a0;", "b", "(Landroidx/lifecycle/a0;Landroidx/lifecycle/t$c;Lq3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "lifecycle-runtime-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt {
    @e
    public static final Object a(@d t tVar, @d t.c cVar, @d p<? super u0, ? super Continuation<? super m2>, ? extends Object> pVar, @d Continuation<? super m2> continuation) {
        if (!(cVar != t.c.INITIALIZED)) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
        }
        if (tVar.b() == t.c.DESTROYED) {
            return m2.f23662a;
        }
        Object g5 = v0.g(new RepeatOnLifecycleKt$repeatOnLifecycle$3(tVar, cVar, pVar, null), continuation);
        return g5 == CoroutineSingletons.COROUTINE_SUSPENDED ? g5 : m2.f23662a;
    }

    @e
    public static final Object b(@d a0 a0Var, @d t.c cVar, @d p<? super u0, ? super Continuation<? super m2>, ? extends Object> pVar, @d Continuation<? super m2> continuation) {
        t lifecycle = a0Var.getLifecycle();
        l0.o(lifecycle, "lifecycle");
        Object a6 = a(lifecycle, cVar, pVar, continuation);
        return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
    }
}
