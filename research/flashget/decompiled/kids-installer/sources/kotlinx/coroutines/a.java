package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* compiled from: AbstractCoroutine.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u001f\u0012\u0006\u00103\u001a\u00020&\u0012\u0006\u00104\u001a\u00020\f\u0012\u0006\u00105\u001a\u00020\f¢\u0006\u0004\b6\u00107J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\u0012\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0004J\u001e\u0010\u0016\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\tJ\u0012\u0010\u0017\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u001b\u0010\u001cJO\u0010$\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00028\u00012'\u0010#\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00110!¢\u0006\u0002\b\"ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u001d\u0010-\u001a\u00020&8\u0006¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0014\u00102\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"Lkotlinx/coroutines/a;", "T", "Lkotlinx/coroutines/u2;", "Lkotlinx/coroutines/n2;", "Lkotlin/coroutines/d;", "Lkotlinx/coroutines/u0;", "value", "Lkotlin/m2;", "I1", "(Ljava/lang/Object;)V", "", "cause", "", "handled", "H1", "", "B0", "", "state", "n1", "Lkotlin/z0;", "result", "s", "F1", "exception", "V0", "(Ljava/lang/Throwable;)V", "h1", "()Ljava/lang/String;", "R", "Lkotlinx/coroutines/w0;", "start", "receiver", "Lkotlin/Function2;", "Lkotlin/u;", "block", "J1", "(Lkotlinx/coroutines/w0;Ljava/lang/Object;Lq3/p;)V", "Lkotlin/coroutines/g;", "p", "Lkotlin/coroutines/g;", "l", "()Lkotlin/coroutines/g;", "getContext$annotations", "()V", "context", "b0", "coroutineContext", "d", "()Z", "isActive", "parentContext", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/g;ZZ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@i2
/* loaded from: classes6.dex */
public abstract class a<T> extends u2 implements n2, Continuation<T>, u0 {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final CoroutineContext context;

    public a(@d5.d CoroutineContext coroutineContext, boolean z5, boolean z6) {
        super(z6);
        if (z5) {
            W0((n2) coroutineContext.b(n2.INSTANCE));
        }
        this.context = coroutineContext.B(this);
    }

    public static /* synthetic */ void G1() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.u2
    @d5.d
    public String B0() {
        return z0.a(this) + ProtectedSandApp.s("遱");
    }

    protected void F1(@d5.e Object obj) {
        s0(obj);
    }

    protected void H1(@d5.d Throwable th, boolean z5) {
    }

    protected void I1(T value) {
    }

    public final <R> void J1(@d5.d w0 start, R receiver, @d5.d q3.p<? super R, ? super Continuation<? super T>, ? extends Object> block) {
        start.invoke(block, receiver, this);
    }

    @Override // kotlinx.coroutines.u2
    public final void V0(@d5.d Throwable exception) {
        r0.b(this.context, exception);
    }

    @Override // kotlinx.coroutines.u0
    @d5.d
    /* renamed from: b0, reason: from getter */
    public CoroutineContext getCoroutineContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.u2, kotlinx.coroutines.n2
    public boolean d() {
        return super.d();
    }

    @Override // kotlinx.coroutines.u2
    @d5.d
    public String h1() {
        return z0.a(this);
    }

    @Override // kotlin.coroutines.Continuation
    @d5.d
    /* renamed from: l */
    public final CoroutineContext getContext() {
        return this.context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.u2
    protected final void n1(@d5.e Object obj) {
        if (!(obj instanceof f0)) {
            I1(obj);
        } else {
            f0 f0Var = (f0) obj;
            H1(f0Var.cause, f0Var.a());
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final void s(@d5.d Object result) {
        Object f12 = f1(k0.d(result, null, 1, null));
        if (f12 == v2.f29045b) {
            return;
        }
        F1(f12);
    }
}
