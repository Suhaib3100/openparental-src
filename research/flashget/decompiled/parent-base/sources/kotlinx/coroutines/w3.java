package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: CoroutineContext.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0018\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/w3;", "T", "Lkotlinx/coroutines/internal/o0;", "Lkotlin/coroutines/g;", "context", "Lkotlin/coroutines/d;", "uCont", "<init>", "(Lkotlin/coroutines/g;Lkotlin/coroutines/d;)V", "", "oldValue", "Lkotlin/k2;", "c2", "(Lkotlin/coroutines/g;Ljava/lang/Object;)V", "", "b2", "()Z", "state", "W1", "(Ljava/lang/Object;)V", "Ljava/lang/ThreadLocal;", "Lkotlin/q0;", "f", "Ljava/lang/ThreadLocal;", "threadStateToRecover", "threadLocalIsSet", "Z", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nCoroutineContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,314:1\n1#2:315\n107#3,13:316\n*S KotlinDebug\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n*L\n269#1:316,13\n*E\n"})
/* loaded from: classes7.dex */
public final class w3<T> extends kotlinx.coroutines.internal.o0<T> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ThreadLocal<kotlin.q0<kotlin.coroutines.g, Object>> threadStateToRecover;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w3(@fg.l kotlin.coroutines.g r3, @fg.l kotlin.coroutines.d<? super T> r4) {
        /*
            r2 = this;
            kotlinx.coroutines.x3 r0 = kotlinx.coroutines.x3.f81201b
            kotlin.coroutines.g$b r1 = r3.c(r0)
            if (r1 != 0) goto Ld
            kotlin.coroutines.g r0 = r3.O(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.threadStateToRecover = r0
            kotlin.coroutines.g r4 = r4.getContext()
            kotlin.coroutines.e$b r0 = kotlin.coroutines.e.INSTANCE
            kotlin.coroutines.g$b r4 = r4.c(r0)
            boolean r4 = r4 instanceof kotlinx.coroutines.m0
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = kotlinx.coroutines.internal.y0.c(r3, r4)
            kotlinx.coroutines.internal.y0.a(r3, r4)
            r2.c2(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.w3.<init>(kotlin.coroutines.g, kotlin.coroutines.d):void");
    }

    @Override // kotlinx.coroutines.internal.o0, kotlinx.coroutines.a
    protected void W1(@fg.m Object state) {
        if (this.threadLocalIsSet) {
            kotlin.q0<kotlin.coroutines.g, Object> q0Var = this.threadStateToRecover.get();
            if (q0Var != null) {
                kotlinx.coroutines.internal.y0.a(q0Var.a(), q0Var.b());
            }
            this.threadStateToRecover.remove();
        }
        Object a5 = i0.a(state, this.uCont);
        kotlin.coroutines.d<T> dVar = this.uCont;
        kotlin.coroutines.g context = dVar.getContext();
        Object c5 = kotlinx.coroutines.internal.y0.c(context, null);
        w3<?> g4 = c5 != kotlinx.coroutines.internal.y0.f80834a ? l0.g(dVar, context, c5) : null;
        try {
            this.uCont.resumeWith(a5);
            kotlin.k2 k2Var = kotlin.k2.f75408a;
        } finally {
            if (g4 == null || g4.b2()) {
                kotlinx.coroutines.internal.y0.a(context, c5);
            }
        }
    }

    public final boolean b2() {
        boolean z4 = this.threadLocalIsSet && this.threadStateToRecover.get() == null;
        this.threadStateToRecover.remove();
        return !z4;
    }

    public final void c2(@fg.l kotlin.coroutines.g context, @fg.m Object oldValue) {
        this.threadLocalIsSet = true;
        this.threadStateToRecover.set(new kotlin.q0<>(context, oldValue));
    }
}
