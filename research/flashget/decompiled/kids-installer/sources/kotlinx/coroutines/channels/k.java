package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.m2;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.channels.k0;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.u2;

/* compiled from: Broadcast.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B%\u0012\u0006\u00106\u001a\u000205\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u00107\u001a\u00020\u000e¢\u0006\u0004\b8\u00109J.\u0010\f\u001a\u00020\u00032#\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0006H\u0097\u0001J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0096\u0001J\u001b\u0010\u0013\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007J\u0016\u0010\u001b\u001a\u00020\u00032\u000e\u0010\n\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aJ\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u000eH\u0014J\u0012\u0010\"\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016R \u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u000e8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)R&\u0010/\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,0+8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010)R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006:"}, d2 = {"Lkotlinx/coroutines/channels/k;", "E", "Lkotlinx/coroutines/a;", "Lkotlin/m2;", "Lkotlinx/coroutines/channels/e0;", "Lkotlinx/coroutines/channels/i;", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "cause", "handler", "v", "element", "", "offer", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/channels/g0;", "S", "a0", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/r;", "Y", "(Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "e", "y0", "value", "L1", "(Lkotlin/m2;)V", "handled", "H1", "Q", "q", "Lkotlinx/coroutines/channels/i;", "K1", "()Lkotlinx/coroutines/channels/i;", "_channel", "c0", "()Z", "isClosedForSend", "Lkotlinx/coroutines/selects/e;", "Lkotlinx/coroutines/channels/k0;", "M", "()Lkotlinx/coroutines/selects/e;", "onSend", "d", "isActive", "g", "()Lkotlinx/coroutines/channels/k0;", "channel", "Lkotlin/coroutines/g;", "parentContext", "active", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/i;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
class k<E> extends kotlinx.coroutines.a<m2> implements e0<E>, i<E> {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final i<E> _channel;

    public k(@d5.d CoroutineContext coroutineContext, @d5.d i<E> iVar, boolean z5) {
        super(coroutineContext, false, z5);
        this._channel = iVar;
        W0((n2) coroutineContext.b(n2.INSTANCE));
    }

    @Override // kotlinx.coroutines.a
    protected void H1(@d5.d Throwable th, boolean z5) {
        if (this._channel.a(th) || z5) {
            return;
        }
        r0.b(getContext(), th);
    }

    @d5.d
    protected final i<E> K1() {
        return this._channel;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a
    /* renamed from: L1, reason: merged with bridge method [inline-methods] */
    public void I1(@d5.d m2 value) {
        k0.a.a(this._channel, null, 1, null);
    }

    @Override // kotlinx.coroutines.channels.k0
    @d5.d
    public kotlinx.coroutines.selects.e<E, k0<E>> M() {
        return this._channel.M();
    }

    @Override // kotlinx.coroutines.channels.k0
    /* renamed from: Q */
    public boolean a(@d5.e Throwable cause) {
        boolean a6 = this._channel.a(cause);
        start();
        return a6;
    }

    @d5.d
    public g0<E> S() {
        return this._channel.S();
    }

    @Override // kotlinx.coroutines.channels.k0
    @d5.d
    public Object Y(E element) {
        return this._channel.Y(element);
    }

    @Override // kotlinx.coroutines.u2, kotlinx.coroutines.n2
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean a(Throwable cause) {
        String B0;
        if (cause == null) {
            B0 = B0();
            cause = new JobCancellationException(B0, null, this);
        }
        y0(cause);
        return true;
    }

    @Override // kotlinx.coroutines.channels.k0
    @d5.e
    public Object a0(E e6, @d5.d Continuation<? super m2> continuation) {
        return this._channel.a0(e6, continuation);
    }

    @Override // kotlinx.coroutines.channels.k0
    public boolean c0() {
        return this._channel.c0();
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.u2, kotlinx.coroutines.n2
    public boolean d() {
        return super.d();
    }

    @Override // kotlinx.coroutines.u2, kotlinx.coroutines.n2
    public final void e(@d5.e CancellationException cancellationException) {
        String B0;
        if (cancellationException == null) {
            B0 = B0();
            cancellationException = new JobCancellationException(B0, null, this);
        }
        y0(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.e0
    @d5.d
    public k0<E> g() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.k0
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E element) {
        return this._channel.offer(element);
    }

    @Override // kotlinx.coroutines.channels.k0
    @c2
    public void v(@d5.d q3.l<? super Throwable, m2> lVar) {
        this._channel.v(lVar);
    }

    @Override // kotlinx.coroutines.u2
    public void y0(@d5.d Throwable th) {
        CancellationException y12 = u2.y1(this, th, null, 1, null);
        this._channel.e(y12);
        w0(y12);
    }
}
