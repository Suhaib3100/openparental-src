package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: ActualJvm.jvm.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a,\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0081\b¢\u0006\u0004\b\t\u0010\n\u001a*\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0002\b\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a0\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\b\u000eH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001c\u0010\u001d*\u001e\b\u0000\u0010 \u001a\u0004\b\u0000\u0010\u001e\"\b\u0012\u0004\u0012\u00028\u00000\u001f2\b\u0012\u0004\u0012\u00028\u00000\u001f*\f\b\u0000\u0010\"\"\u00020!2\u00020!¨\u0006#"}, d2 = {"", "instance", "", "d", "(Ljava/lang/Object;)I", "R", "lock", "Lkotlin/Function0;", "block", "g", "(Ljava/lang/Object;Lld/a;)Ljava/lang/Object;", "Landroidx/compose/runtime/t;", "composer", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "composable", "e", "(Landroidx/compose/runtime/t;Lld/p;)V", "T", "f", "(Landroidx/compose/runtime/t;Lld/p;)Ljava/lang/Object;", "it", "c", "(Ljava/lang/Object;)V", "", "a", "()J", "", "b", "()Ljava/lang/String;", "V", "Ljava/util/concurrent/atomic/AtomicReference;", "AtomicReference", "Lfg/p;", "TestOnly", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {
    public static final long a() {
        return Thread.currentThread().getId();
    }

    @fg.l
    public static final String b() {
        return Thread.currentThread().getName();
    }

    public static final void c(@fg.l Object obj) {
    }

    public static final int d(@fg.m Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void e(@fg.l t tVar, @fg.l ld.p<? super t, ? super Integer, kotlin.k2> pVar) {
        kotlin.jvm.internal.l0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        ((ld.p) kotlin.jvm.internal.u1.q(pVar, 2)).invoke(tVar, 1);
    }

    public static final <T> T f(@fg.l t tVar, @fg.l ld.p<? super t, ? super Integer, ? extends T> pVar) {
        kotlin.jvm.internal.l0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, T of androidx.compose.runtime.ActualJvm_jvmKt.invokeComposableForResult>");
        return (T) ((ld.p) kotlin.jvm.internal.u1.q(pVar, 2)).invoke(tVar, 1);
    }

    @kotlin.w0
    public static final <R> R g(@fg.l Object obj, @fg.l ld.a<? extends R> aVar) {
        R invoke;
        synchronized (obj) {
            invoke = aVar.invoke();
        }
        return invoke;
    }
}
