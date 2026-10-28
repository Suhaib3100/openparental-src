package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlinx.coroutines.n2;

/* compiled from: Scopes.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u0012\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0013\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lkotlinx/coroutines/internal/n0;", "T", "Lkotlinx/coroutines/a;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "I", "", "state", "Lkotlin/m2;", "s0", "F1", "Lkotlin/coroutines/d;", "q", "Lkotlin/coroutines/d;", "uCont", "i", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "", "Z0", "()Z", "isScopedCoroutine", "Lkotlinx/coroutines/n2;", "K1", "()Lkotlinx/coroutines/n2;", "parent", "Lkotlin/coroutines/g;", "context", "<init>", "(Lkotlin/coroutines/g;Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public class n0<T> extends kotlinx.coroutines.a<T> implements CoroutineStackFrame {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final Continuation<T> uCont;

    /* JADX WARN: Multi-variable type inference failed */
    public n0(@d5.d CoroutineContext coroutineContext, @d5.d Continuation<? super T> continuation) {
        super(coroutineContext, true, true);
        this.uCont = continuation;
    }

    @Override // kotlinx.coroutines.a
    protected void F1(@d5.e Object obj) {
        Continuation<T> continuation = this.uCont;
        continuation.s(kotlinx.coroutines.k0.a(obj, continuation));
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @d5.e
    /* renamed from: I */
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @d5.e
    public final n2 K1() {
        kotlinx.coroutines.x S0 = S0();
        if (S0 != null) {
            return S0.getParent();
        }
        return null;
    }

    @Override // kotlinx.coroutines.u2
    protected final boolean Z0() {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @d5.e
    /* renamed from: i */
    public final CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.uCont;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlinx.coroutines.u2
    protected void s0(@d5.e Object obj) {
        Continuation e6;
        e6 = kotlin.coroutines.intrinsics.c.e(this.uCont);
        m.g(e6, kotlinx.coroutines.k0.a(obj, this.uCont), null, 2, null);
    }
}
