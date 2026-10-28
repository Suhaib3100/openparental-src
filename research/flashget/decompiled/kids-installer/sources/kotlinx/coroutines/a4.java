package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* compiled from: CoroutineContext.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\n\u001a\u00020\tJ\u0012\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0014R*\u0010\u0011\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/a4;", "T", "Lkotlinx/coroutines/internal/n0;", "Lkotlin/coroutines/g;", "context", "", "oldValue", "Lkotlin/m2;", "M1", "", "L1", "state", "F1", "Ljava/lang/ThreadLocal;", "Lkotlin/q0;", "r", "Ljava/lang/ThreadLocal;", "threadStateToRecover", "Lkotlin/coroutines/d;", "uCont", "<init>", "(Lkotlin/coroutines/g;Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class a4<T> extends kotlinx.coroutines.internal.n0<T> {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private ThreadLocal<Pair<CoroutineContext, Object>> threadStateToRecover;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a4(@d5.d kotlin.coroutines.CoroutineContext r3, @d5.d kotlin.coroutines.Continuation<? super T> r4) {
        /*
            r2 = this;
            kotlinx.coroutines.b4 r0 = kotlinx.coroutines.b4.f27277o
            kotlin.coroutines.g$b r1 = r3.b(r0)
            if (r1 != 0) goto Ld
            kotlin.coroutines.g r0 = r3.B(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.threadStateToRecover = r0
            kotlin.coroutines.g r4 = r4.getContext()
            kotlin.coroutines.e$b r0 = kotlin.coroutines.ContinuationInterceptor.f23289d
            kotlin.coroutines.g$b r4 = r4.b(r0)
            boolean r4 = r4 instanceof kotlinx.coroutines.o0
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = kotlinx.coroutines.internal.w0.c(r3, r4)
            kotlinx.coroutines.internal.w0.a(r3, r4)
            r2.M1(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.a4.<init>(kotlin.coroutines.g, kotlin.coroutines.d):void");
    }

    @Override // kotlinx.coroutines.internal.n0, kotlinx.coroutines.a
    protected void F1(@d5.e Object obj) {
        Pair<CoroutineContext, Object> pair = this.threadStateToRecover.get();
        if (pair != null) {
            kotlinx.coroutines.internal.w0.a(pair.a(), pair.b());
            this.threadStateToRecover.set(null);
        }
        Object a6 = k0.a(obj, this.uCont);
        Continuation<T> continuation = this.uCont;
        CoroutineContext context = continuation.getContext();
        Object c6 = kotlinx.coroutines.internal.w0.c(context, null);
        a4<?> g5 = c6 != kotlinx.coroutines.internal.w0.f28753a ? n0.g(continuation, context, c6) : null;
        try {
            this.uCont.s(a6);
            kotlin.m2 m2Var = kotlin.m2.f23662a;
        } finally {
            if (g5 == null || g5.L1()) {
                kotlinx.coroutines.internal.w0.a(context, c6);
            }
        }
    }

    public final boolean L1() {
        if (this.threadStateToRecover.get() == null) {
            return false;
        }
        this.threadStateToRecover.set(null);
        return true;
    }

    public final void M1(@d5.d CoroutineContext coroutineContext, @d5.e Object obj) {
        this.threadStateToRecover.set(new Pair<>(coroutineContext, obj));
    }
}
