package kotlinx.coroutines.flow;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.m2;

/* compiled from: Channels.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0006\u0010&\u001a\u00020#\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b'\u0010(J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0012\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lkotlinx/coroutines/flow/e;", "T", "Lkotlinx/coroutines/flow/internal/d;", "Lkotlin/m2;", "p", "()V", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/m;", "onBufferOverflow", "i", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/m;)Lkotlinx/coroutines/flow/internal/d;", "Lkotlinx/coroutines/flow/i;", "l", "()Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/channels/e0;", "scope", "h", "(Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/u0;", "Lkotlinx/coroutines/channels/g0;", "o", "(Lkotlinx/coroutines/u0;)Lkotlinx/coroutines/channels/g0;", "Lkotlinx/coroutines/flow/j;", "collector", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "e", "()Ljava/lang/String;", "r", "Lkotlinx/coroutines/channels/g0;", "channel", "", "s", "Z", "consume", "<init>", "(Lkotlinx/coroutines/channels/g0;ZLkotlin/coroutines/g;ILkotlinx/coroutines/channels/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class e<T> extends kotlinx.coroutines.flow.internal.d<T> {

    /* renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f27971t = AtomicIntegerFieldUpdater.newUpdater(e.class, ProtectedSandApp.s("郰"));

    @d5.d
    private volatile /* synthetic */ int consumed;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final kotlinx.coroutines.channels.g0<T> channel;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final boolean consume;

    public /* synthetic */ e(kotlinx.coroutines.channels.g0 g0Var, boolean z5, CoroutineContext coroutineContext, int i5, kotlinx.coroutines.channels.m mVar, int i6, kotlin.jvm.internal.w wVar) {
        this(g0Var, z5, (i6 & 4) != 0 ? EmptyCoroutineContext.f23294o : coroutineContext, (i6 & 8) != 0 ? -3 : i5, (i6 & 16) != 0 ? kotlinx.coroutines.channels.m.SUSPEND : mVar);
    }

    private final void p() {
        if (this.consume) {
            if (!(f27971t.getAndSet(this, 1) == 0)) {
                throw new IllegalStateException(ProtectedSandApp.s("郱").toString());
            }
        }
    }

    @Override // kotlinx.coroutines.flow.internal.d, kotlinx.coroutines.flow.i
    @d5.e
    public Object a(@d5.d j<? super T> jVar, @d5.d Continuation<? super m2> continuation) {
        if (this.capacity != -3) {
            Object a6 = super.a(jVar, continuation);
            return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
        }
        p();
        Object e6 = m.e(jVar, this.channel, this.consume, continuation);
        return e6 == CoroutineSingletons.COROUTINE_SUSPENDED ? e6 : m2.f23662a;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @d5.d
    protected String e() {
        return ProtectedSandApp.s("郲") + this.channel;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @d5.e
    protected Object h(@d5.d kotlinx.coroutines.channels.e0<? super T> e0Var, @d5.d Continuation<? super m2> continuation) {
        Object e6 = m.e(new kotlinx.coroutines.flow.internal.w(e0Var), this.channel, this.consume, continuation);
        return e6 == CoroutineSingletons.COROUTINE_SUSPENDED ? e6 : m2.f23662a;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @d5.d
    protected kotlinx.coroutines.flow.internal.d<T> i(@d5.d CoroutineContext context, int capacity, @d5.d kotlinx.coroutines.channels.m onBufferOverflow) {
        return new e(this.channel, this.consume, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @d5.d
    public i<T> l() {
        return new e(this.channel, this.consume, null, 0, null, 28, null);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @d5.d
    public kotlinx.coroutines.channels.g0<T> o(@d5.d kotlinx.coroutines.u0 scope) {
        p();
        return this.capacity == -3 ? this.channel : super.o(scope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@d5.d kotlinx.coroutines.channels.g0<? extends T> g0Var, boolean z5, @d5.d CoroutineContext coroutineContext, int i5, @d5.d kotlinx.coroutines.channels.m mVar) {
        super(coroutineContext, i5, mVar);
        this.channel = g0Var;
        this.consume = z5;
        this.consumed = 0;
    }
}
