package kotlinx.coroutines.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.m2;
import kotlinx.coroutines.a4;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.t1;
import kotlinx.coroutines.t3;

/* compiled from: DispatchedContinuation.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010;\u001a\u000208\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\bL\u0010MJ\u0017\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010!\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"JH\u0010'\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2%\b\b\u0010&\u001a\u001f\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\r\u0018\u00010#H\u0086\bø\u0001\u0000¢\u0006\u0004\b'\u0010(J!\u0010*\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u0016H\u0010¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010\u001cH\u0086\b¢\u0006\u0004\b-\u0010.J!\u0010/\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\bø\u0001\u0000¢\u0006\u0004\b/\u0010\"J\u001f\u00103\u001a\u00020\r2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00028\u0000H\u0000¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107R\u0014\u0010;\u001a\u0002088\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010<R\u001e\u0010?\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u000b\u0010=\u0012\u0004\b>\u0010\u000fR\u0014\u0010A\u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b@\u0010=R\u001a\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0013R\u0014\u00101\u001a\u0002008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001c\u0010H\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006N"}, d2 = {"Lkotlinx/coroutines/internal/l;", "T", "Lkotlinx/coroutines/j1;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/d;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "I", "()Ljava/lang/StackTraceElement;", "", "t", "()Z", "Lkotlin/m2;", "k", "()V", "w", "Lkotlinx/coroutines/s;", "n", "()Lkotlinx/coroutines/s;", "Lkotlinx/coroutines/q;", "continuation", "", "B", "(Lkotlinx/coroutines/q;)Ljava/lang/Throwable;", "cause", "v", "(Ljava/lang/Throwable;)Z", "", "j", "()Ljava/lang/Object;", "Lkotlin/z0;", "result", "s", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "onCancellation", "x", "(Ljava/lang/Object;Lq3/l;)V", "takenState", "c", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "z", "(Ljava/lang/Object;)Z", "A", "Lkotlin/coroutines/g;", "context", "value", "o", "(Lkotlin/coroutines/g;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/o0;", "r", "Lkotlinx/coroutines/o0;", "dispatcher", "Lkotlin/coroutines/d;", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "_state", "u", "countOrElement", "p", "reusableCancellableContinuation", "l", "()Lkotlin/coroutines/g;", "i", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "e", "()Lkotlin/coroutines/d;", "delegate", "<init>", "(Lkotlinx/coroutines/o0;Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class l<T> extends j1<T> implements CoroutineStackFrame, Continuation<T> {

    /* renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28718v = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, ProtectedSandApp.s("鄶"));

    @d5.d
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final kotlinx.coroutines.o0 dispatcher;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final Continuation<T> continuation;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @d5.e
    @p3.f
    public Object _state;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final Object countOrElement;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@d5.d kotlinx.coroutines.o0 o0Var, @d5.d Continuation<? super T> continuation) {
        super(-1);
        r0 r0Var;
        this.dispatcher = o0Var;
        this.continuation = continuation;
        r0Var = m.f28724a;
        this._state = r0Var;
        this.countOrElement = w0.b(getContext());
        this._reusableCancellableContinuation = null;
    }

    private final kotlinx.coroutines.s<?> p() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof kotlinx.coroutines.s) {
            return (kotlinx.coroutines.s) obj;
        }
        return null;
    }

    public static /* synthetic */ void q() {
    }

    public final void A(@d5.d Object result) {
        Continuation<T> continuation = this.continuation;
        Object obj = this.countOrElement;
        CoroutineContext context = continuation.getContext();
        Object c6 = w0.c(context, obj);
        a4<?> g5 = c6 != w0.f28753a ? kotlinx.coroutines.n0.g(continuation, context, c6) : null;
        try {
            this.continuation.s(result);
            m2 m2Var = m2.f23662a;
        } finally {
            if (g5 == null || g5.L1()) {
                w0.a(context, c6);
            }
        }
    }

    @d5.e
    public final Throwable B(@d5.d kotlinx.coroutines.q<?> continuation) {
        r0 r0Var;
        do {
            Object obj = this._reusableCancellableContinuation;
            r0Var = m.f28725b;
            if (obj != r0Var) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(kotlinx.coroutines.r.a(ProtectedSandApp.s("鄸"), obj));
                }
                if (androidx.concurrent.futures.d.a(f28718v, this, obj, null)) {
                    return (Throwable) obj;
                }
                throw new IllegalArgumentException(ProtectedSandApp.s("鄷").toString());
            }
        } while (!androidx.concurrent.futures.d.a(f28718v, this, r0Var, continuation));
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @d5.e
    /* renamed from: I */
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.j1
    public void c(@d5.e Object takenState, @d5.d Throwable cause) {
        if (takenState instanceof kotlinx.coroutines.g0) {
            ((kotlinx.coroutines.g0) takenState).onCancellation.N(cause);
        }
    }

    @Override // kotlinx.coroutines.j1
    @d5.d
    public Continuation<T> e() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @d5.e
    /* renamed from: i */
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.continuation;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlinx.coroutines.j1
    @d5.e
    public Object j() {
        r0 r0Var;
        Object obj = this._state;
        r0Var = m.f28724a;
        this._state = r0Var;
        return obj;
    }

    public final void k() {
        while (this._reusableCancellableContinuation == m.f28725b) {
        }
    }

    @Override // kotlin.coroutines.Continuation
    @d5.d
    /* renamed from: l */
    public CoroutineContext getContext() {
        return this.continuation.getContext();
    }

    @d5.e
    public final kotlinx.coroutines.s<T> n() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = m.f28725b;
                return null;
            }
            if (obj instanceof kotlinx.coroutines.s) {
                if (androidx.concurrent.futures.d.a(f28718v, this, obj, m.f28725b)) {
                    return (kotlinx.coroutines.s) obj;
                }
            } else if (obj != m.f28725b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(kotlinx.coroutines.r.a(ProtectedSandApp.s("鄹"), obj));
            }
        }
    }

    public final void o(@d5.d CoroutineContext context, T value) {
        this._state = value;
        this.resumeMode = 1;
        this.dispatcher.A0(context, this);
    }

    @Override // kotlin.coroutines.Continuation
    public void s(@d5.d Object result) {
        CoroutineContext context = this.continuation.getContext();
        Object d6 = kotlinx.coroutines.k0.d(result, null, 1, null);
        if (this.dispatcher.B0(context)) {
            this._state = d6;
            this.resumeMode = 0;
            this.dispatcher.y0(context, this);
            return;
        }
        t1 b6 = t3.f29007a.b();
        if (b6.f1()) {
            this._state = d6;
            this.resumeMode = 0;
            b6.O0(this);
            return;
        }
        b6.T0(true);
        try {
            CoroutineContext context2 = getContext();
            Object c6 = w0.c(context2, this.countOrElement);
            try {
                this.continuation.s(result);
                m2 m2Var = m2.f23662a;
                while (b6.m1()) {
                }
            } finally {
                w0.a(context2, c6);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final boolean t() {
        return this._reusableCancellableContinuation != null;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("鄺") + this.dispatcher + ProtectedSandApp.s("鄻") + kotlinx.coroutines.z0.c(this.continuation) + ']';
    }

    public final boolean v(@d5.d Throwable cause) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            r0 r0Var = m.f28725b;
            if (kotlin.jvm.internal.l0.g(obj, r0Var)) {
                if (androidx.concurrent.futures.d.a(f28718v, this, r0Var, cause)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.d.a(f28718v, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void w() {
        k();
        kotlinx.coroutines.s<?> p5 = p();
        if (p5 != null) {
            p5.v();
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void x(@d5.d Object result, @d5.e q3.l<? super Throwable, m2> onCancellation) {
        boolean z5;
        Object c6 = kotlinx.coroutines.k0.c(result, onCancellation);
        if (this.dispatcher.B0(getContext())) {
            this._state = c6;
            this.resumeMode = 1;
            this.dispatcher.y0(getContext(), this);
            return;
        }
        t1 b6 = t3.f29007a.b();
        if (b6.f1()) {
            this._state = c6;
            this.resumeMode = 1;
            b6.O0(this);
            return;
        }
        b6.T0(true);
        try {
            n2 n2Var = (n2) getContext().b(n2.INSTANCE);
            if (n2Var == null || n2Var.d()) {
                z5 = false;
            } else {
                CancellationException O = n2Var.O();
                c(c6, O);
                Result.a aVar = Result.f27242p;
                s(kotlin.a1.a(O));
                z5 = true;
            }
            if (!z5) {
                Continuation<T> continuation = this.continuation;
                Object obj = this.countOrElement;
                CoroutineContext context = continuation.getContext();
                Object c7 = w0.c(context, obj);
                a4<?> g5 = c7 != w0.f28753a ? kotlinx.coroutines.n0.g(continuation, context, c7) : null;
                try {
                    this.continuation.s(result);
                    m2 m2Var = m2.f23662a;
                    if (g5 == null || g5.L1()) {
                        w0.a(context, c7);
                    }
                } catch (Throwable th) {
                    if (g5 == null || g5.L1()) {
                        w0.a(context, c7);
                    }
                    throw th;
                }
            }
            while (b6.m1()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final boolean z(@d5.e Object state) {
        n2 n2Var = (n2) getContext().b(n2.INSTANCE);
        if (n2Var == null || n2Var.d()) {
            return false;
        }
        CancellationException O = n2Var.O();
        c(state, O);
        Result.a aVar = Result.f27242p;
        s(kotlin.a1.a(O));
        return true;
    }
}
