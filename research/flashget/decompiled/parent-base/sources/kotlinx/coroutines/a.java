package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: AbstractCoroutine.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0004¢\u0006\u0004\b\u001b\u0010\u0010J\u001e\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0010J\u0019\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001f\u0010\u0010J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0011H\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0010¢\u0006\u0004\b#\u0010\u0018JO\u0010+\u001a\u00020\u000e\"\u0004\b\u0001\u0010$2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00028\u00012'\u0010*\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00190(¢\u0006\u0002\b)ø\u0001\u0000¢\u0006\u0004\b+\u0010,R\u001d\u00103\u001a\u00020\u00068\u0006¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00100R\u0014\u00106\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107\u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"Lkotlinx/coroutines/a;", "T", "Lkotlinx/coroutines/r2;", "Lkotlinx/coroutines/k2;", "Lkotlin/coroutines/d;", "Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/g;", "parentContext", "", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/g;ZZ)V", "value", "Lkotlin/k2;", "Z1", "(Ljava/lang/Object;)V", "", "cause", "handled", "Y1", "(Ljava/lang/Throwable;Z)V", "", "L0", "()Ljava/lang/String;", "", "state", "F1", "Lkotlin/z0;", "result", "resumeWith", "W1", "exception", "k1", "(Ljava/lang/Throwable;)V", "x1", "R", "Lkotlinx/coroutines/t0;", "start", "receiver", "Lkotlin/Function2;", "Lkotlin/u;", "block", "a2", "(Lkotlinx/coroutines/t0;Ljava/lang/Object;Lld/p;)V", "d", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "X1", "()V", "context", "q", "coroutineContext", "isActive", "()Z", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f2
/* loaded from: classes7.dex */
public abstract class a<T> extends r2 implements k2, kotlin.coroutines.d<T>, r0 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.coroutines.g context;

    public a(@fg.l kotlin.coroutines.g gVar, boolean z4, boolean z5) {
        super(z5);
        if (z4) {
            l1((k2) gVar.c(k2.INSTANCE));
        }
        this.context = gVar.O(this);
    }

    public static /* synthetic */ void X1() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.r2
    protected final void F1(@fg.m Object state) {
        if (!(state instanceof d0)) {
            Z1(state);
        } else {
            d0 d0Var = (d0) state;
            Y1(d0Var.cause, d0Var.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.r2
    @fg.l
    public String L0() {
        return w0.a(this) + ProtectedSandApp.s("薘\u0001");
    }

    protected void W1(@fg.m Object state) {
        y0(state);
    }

    protected void Y1(@fg.l Throwable cause, boolean handled) {
    }

    protected void Z1(T value) {
    }

    public final <R> void a2(@fg.l t0 start, R receiver, @fg.l ld.p<? super R, ? super kotlin.coroutines.d<? super T>, ? extends Object> block) {
        start.invoke(block, receiver, this);
    }

    @Override // kotlin.coroutines.d
    @fg.l
    public final kotlin.coroutines.g getContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.r2, kotlinx.coroutines.k2
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.r2
    public final void k1(@fg.l Throwable exception) {
        o0.b(this.context, exception);
    }

    @Override // kotlinx.coroutines.r0
    @fg.l
    /* renamed from: q */
    public kotlin.coroutines.g getCoroutineContext() {
        return this.context;
    }

    @Override // kotlin.coroutines.d
    public final void resumeWith(@fg.l Object result) {
        Object v12 = v1(i0.d(result, null, 1, null));
        if (v12 == s2.f80933b) {
            return;
        }
        W1(v12);
    }

    @Override // kotlinx.coroutines.r2
    @fg.l
    public String x1() {
        return w0.a(this);
    }
}
