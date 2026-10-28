package kotlinx.coroutines.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.z0;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.n3;
import kotlinx.coroutines.q1;
import kotlinx.coroutines.w3;

/* compiled from: DispatchedContinuation.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010!\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\b!\u0010\"J \u0010%\u001a\u00020\u00122\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010&JH\u0010+\u001a\u00020\u00122\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2%\b\b\u0010*\u001a\u001f\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u0012\u0018\u00010'H\u0080\bø\u0001\u0000¢\u0006\u0004\b+\u0010,J!\u0010.\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010 2\u0006\u0010\u001d\u001a\u00020\u001aH\u0010¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020\u000f2\b\u00100\u001a\u0004\u0018\u00010 H\u0080\b¢\u0006\u0004\b1\u00102J!\u00103\u001a\u00020\u00122\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0080\bø\u0001\u0000¢\u0006\u0004\b3\u0010&J\u001f\u00107\u001a\u00020\u00122\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00028\u0000H\u0000¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001e\u0010C\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b@\u0010A\u0012\u0004\bB\u0010\u0014R\u0014\u0010E\u001a\u00020 8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bD\u0010AR\u001a\u0010G\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0018R\u0014\u00105\u001a\u0002048\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bH\u0010IR\u001c\u0010L\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0013\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0P8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006R"}, d2 = {"Lkotlinx/coroutines/internal/l;", "T", "Lkotlinx/coroutines/g1;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/d;", "Lkotlinx/coroutines/m0;", "dispatcher", "continuation", "<init>", "(Lkotlinx/coroutines/m0;Lkotlin/coroutines/d;)V", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "q", "()Z", "Lkotlin/k2;", "j", "()V", "t", "Lkotlinx/coroutines/q;", "k", "()Lkotlinx/coroutines/q;", "Lkotlinx/coroutines/p;", "", "y", "(Lkotlinx/coroutines/p;)Ljava/lang/Throwable;", "cause", "s", "(Ljava/lang/Throwable;)Z", "", "i", "()Ljava/lang/Object;", "Lkotlin/z0;", "result", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "onCancellation", "u", "(Ljava/lang/Object;Lld/l;)V", "takenState", "c", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "w", "(Ljava/lang/Object;)Z", "x", "Lkotlin/coroutines/g;", "context", "value", "m", "(Lkotlin/coroutines/g;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "e", "Lkotlinx/coroutines/m0;", "f", "Lkotlin/coroutines/d;", "g", "Ljava/lang/Object;", "o", "_state", "h", "countOrElement", "n", "reusableCancellableContinuation", "getContext", "()Lkotlin/coroutines/g;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "d", "()Lkotlin/coroutines/d;", "delegate", "Lkotlinx/atomicfu/AtomicRef;", "_reusableCancellableContinuation", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.w0
@r1({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,317:1\n243#1,8:381\n255#1:389\n256#1,2:400\n258#1:404\n1#2:318\n1#2:324\n1#2:365\n297#3,5:319\n302#3,12:325\n314#3:359\n297#3,5:360\n302#3,12:366\n314#3:419\n200#4,3:337\n203#4,14:345\n200#4,3:378\n203#4,14:405\n95#5,5:340\n107#5,10:390\n118#5,2:402\n107#5,13:420\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n*L\n224#1:381,8\n225#1:389\n225#1:400,2\n225#1:404\n202#1:324\n223#1:365\n202#1:319,5\n202#1:325,12\n202#1:359\n223#1:360,5\n223#1:366,12\n223#1:419\n202#1:337,3\n202#1:345,14\n223#1:378,3\n223#1:405,14\n203#1:340,5\n225#1:390,10\n225#1:402,2\n255#1:420,13\n*E\n"})
/* loaded from: classes7.dex */
public final class l<T> extends g1<T> implements kotlin.coroutines.jvm.internal.e, kotlin.coroutines.d<T> {

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final AtomicReferenceFieldUpdater f80785i = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, ProtectedSandApp.s("蟪\u0001"));

    @fg.m
    @kd.x
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final kotlinx.coroutines.m0 dispatcher;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final kotlin.coroutines.d<T> continuation;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    @kd.f
    public Object _state;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final Object countOrElement;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@fg.l kotlinx.coroutines.m0 m0Var, @fg.l kotlin.coroutines.d<? super T> dVar) {
        super(-1);
        s0 s0Var;
        this.dispatcher = m0Var;
        this.continuation = dVar;
        s0Var = m.f80790a;
        this._state = s0Var;
        this.countOrElement = y0.b(dVar.getContext());
    }

    private final kotlinx.coroutines.q<?> n() {
        Object obj = f80785i.get(this);
        if (obj instanceof kotlinx.coroutines.q) {
            return (kotlinx.coroutines.q) obj;
        }
        return null;
    }

    public static /* synthetic */ void o() {
    }

    private final void r(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ld.l<Object, k2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    @Override // kotlinx.coroutines.g1
    public void c(@fg.m Object takenState, @fg.l Throwable cause) {
        if (takenState instanceof kotlinx.coroutines.e0) {
            ((kotlinx.coroutines.e0) takenState).onCancellation.invoke(cause);
        }
    }

    @Override // kotlinx.coroutines.g1
    @fg.l
    public kotlin.coroutines.d<T> d() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @fg.m
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kotlin.coroutines.d<T> dVar = this.continuation;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    @fg.l
    public kotlin.coroutines.g getContext() {
        return this.continuation.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @fg.m
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.g1
    @fg.m
    public Object i() {
        s0 s0Var;
        Object obj = this._state;
        s0Var = m.f80790a;
        this._state = s0Var;
        return obj;
    }

    public final void j() {
        while (f80785i.get(this) == m.f80791b) {
        }
    }

    @fg.m
    public final kotlinx.coroutines.q<T> k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80785i;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f80785i.set(this, m.f80791b);
                return null;
            }
            if (obj instanceof kotlinx.coroutines.q) {
                if (androidx.concurrent.futures.c.a(f80785i, this, obj, m.f80791b)) {
                    return (kotlinx.coroutines.q) obj;
                }
            } else if (obj != m.f80791b && !(obj instanceof Throwable)) {
                throw new IllegalStateException((ProtectedSandApp.s("蟫\u0001") + obj).toString());
            }
        }
    }

    public final void m(@fg.l kotlin.coroutines.g context, T value) {
        this._state = value;
        this.resumeMode = 1;
        this.dispatcher.U0(context, this);
    }

    public final boolean q() {
        return f80785i.get(this) != null;
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(@fg.l Object result) {
        kotlin.coroutines.g context = this.continuation.getContext();
        Object d5 = kotlinx.coroutines.i0.d(result, null, 1, null);
        if (this.dispatcher.c1(context)) {
            this._state = d5;
            this.resumeMode = 0;
            this.dispatcher.S0(context, this);
            return;
        }
        q1 b5 = n3.f80870a.b();
        if (b5.H1()) {
            this._state = d5;
            this.resumeMode = 0;
            b5.n1(this);
            return;
        }
        b5.y1(true);
        try {
            kotlin.coroutines.g context2 = this.continuation.getContext();
            Object c5 = y0.c(context2, this.countOrElement);
            try {
                this.continuation.resumeWith(result);
                k2 k2Var = k2.f75408a;
                while (b5.M1()) {
                }
            } finally {
                y0.a(context2, c5);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final boolean s(@fg.l Throwable cause) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80785i;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            s0 s0Var = m.f80791b;
            if (kotlin.jvm.internal.l0.g(obj, s0Var)) {
                if (androidx.concurrent.futures.c.a(f80785i, this, s0Var, cause)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.c.a(f80785i, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void t() {
        j();
        kotlinx.coroutines.q<?> n4 = n();
        if (n4 != null) {
            n4.s();
        }
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("蟬\u0001") + this.dispatcher + ProtectedSandApp.s("蟭\u0001") + kotlinx.coroutines.w0.c(this.continuation) + ']';
    }

    public final void u(@fg.l Object result, @fg.m ld.l<? super Throwable, k2> onCancellation) {
        Object c5 = kotlinx.coroutines.i0.c(result, onCancellation);
        if (this.dispatcher.c1(this.continuation.getContext())) {
            this._state = c5;
            this.resumeMode = 1;
            this.dispatcher.S0(this.continuation.getContext(), this);
            return;
        }
        q1 b5 = n3.f80870a.b();
        if (b5.H1()) {
            this._state = c5;
            this.resumeMode = 1;
            b5.n1(this);
            return;
        }
        b5.y1(true);
        try {
            kotlinx.coroutines.k2 k2Var = (kotlinx.coroutines.k2) this.continuation.getContext().c(kotlinx.coroutines.k2.INSTANCE);
            if (k2Var == null || k2Var.isActive()) {
                kotlin.coroutines.d<T> dVar = this.continuation;
                Object obj = this.countOrElement;
                kotlin.coroutines.g context = dVar.getContext();
                Object c6 = y0.c(context, obj);
                w3<?> g4 = c6 != y0.f80834a ? kotlinx.coroutines.l0.g(dVar, context, c6) : null;
                try {
                    this.continuation.resumeWith(result);
                    k2 k2Var2 = k2.f75408a;
                } finally {
                    if (g4 == null || g4.b2()) {
                        y0.a(context, c6);
                    }
                }
            } else {
                CancellationException x4 = k2Var.x();
                c(c5, x4);
                z0.Companion companion = kotlin.z0.INSTANCE;
                resumeWith(kotlin.a1.a(x4));
            }
            while (b5.M1()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final boolean w(@fg.m Object state) {
        kotlinx.coroutines.k2 k2Var = (kotlinx.coroutines.k2) this.continuation.getContext().c(kotlinx.coroutines.k2.INSTANCE);
        if (k2Var == null || k2Var.isActive()) {
            return false;
        }
        CancellationException x4 = k2Var.x();
        c(state, x4);
        z0.Companion companion = kotlin.z0.INSTANCE;
        resumeWith(kotlin.a1.a(x4));
        return true;
    }

    public final void x(@fg.l Object result) {
        kotlin.coroutines.d<T> dVar = this.continuation;
        Object obj = this.countOrElement;
        kotlin.coroutines.g context = dVar.getContext();
        Object c5 = y0.c(context, obj);
        w3<?> g4 = c5 != y0.f80834a ? kotlinx.coroutines.l0.g(dVar, context, c5) : null;
        try {
            this.continuation.resumeWith(result);
            k2 k2Var = k2.f75408a;
        } finally {
            if (g4 == null || g4.b2()) {
                y0.a(context, c5);
            }
        }
    }

    @fg.m
    public final Throwable y(@fg.l kotlinx.coroutines.p<?> continuation) {
        s0 s0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80785i;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            s0Var = m.f80791b;
            if (obj != s0Var) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.c.a(f80785i, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException(ProtectedSandApp.s("蟮\u0001"));
                }
                throw new IllegalStateException((ProtectedSandApp.s("蟫\u0001") + obj).toString());
            }
        } while (!androidx.concurrent.futures.c.a(f80785i, this, s0Var, continuation));
        return null;
    }
}
