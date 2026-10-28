package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.m2;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.u2;

/* compiled from: ChannelCoroutine.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010>\u001a\u00020=\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010?\u001a\u00020\u0007\u0012\u0006\u0010@\u001a\u00020\u0007¢\u0006\u0004\bA\u0010BJ\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0001J.\u0010\r\u001a\u00020\u00032#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00030\tH\u0097\u0001J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096\u0003J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096Aø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0001\u0010\u0016J\u0015\u0010\u0018\u001a\u0004\u0018\u00018\u0000H\u0097Aø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u0014J'\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0010\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0003H\u0016J\u0012\u0010\u001f\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J\u0016\u0010\"\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R \u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u0010.\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b.\u0010*R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000/8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101R#\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170/8\u0016X\u0096\u0005ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b3\u00101R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000/8VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b$\u00101R&\u0010:\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000007068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00109R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048F¢\u0006\u0006\u001a\u0004\b;\u0010'\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"Lkotlinx/coroutines/channels/o;", "E", "Lkotlinx/coroutines/a;", "Lkotlin/m2;", "Lkotlinx/coroutines/channels/n;", "", "cause", "", "Q", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "handler", "v", "Lkotlinx/coroutines/channels/p;", "iterator", "element", "offer", "(Ljava/lang/Object;)Z", "poll", "()Ljava/lang/Object;", "N", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/r;", "C", "a0", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "A", "Y", "(Ljava/lang/Object;)Ljava/lang/Object;", "cancel", "a", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "e", "y0", "q", "Lkotlinx/coroutines/channels/n;", "K1", "()Lkotlinx/coroutines/channels/n;", "_channel", "f", "()Z", "isClosedForReceive", "c0", "isClosedForSend", "isEmpty", "Lkotlinx/coroutines/selects/d;", "h", "()Lkotlinx/coroutines/selects/d;", "onReceive", "p", "onReceiveCatching", "onReceiveOrNull", "Lkotlinx/coroutines/selects/e;", "Lkotlinx/coroutines/channels/k0;", "M", "()Lkotlinx/coroutines/selects/e;", "onSend", "g", "channel", "Lkotlin/coroutines/g;", "parentContext", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/n;ZZ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public class o<E> extends kotlinx.coroutines.a<m2> implements n<E> {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final n<E> _channel;

    public o(@d5.d CoroutineContext coroutineContext, @d5.d n<E> nVar, boolean z5, boolean z6) {
        super(coroutineContext, z5, z6);
        this._channel = nVar;
    }

    @Override // kotlinx.coroutines.channels.g0
    @d5.d
    public Object A() {
        return this._channel.A();
    }

    @Override // kotlinx.coroutines.channels.g0
    @LowPriorityInOverloadResolution
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @d5.e
    public Object C(@d5.d Continuation<? super E> continuation) {
        return this._channel.C(continuation);
    }

    @Override // kotlinx.coroutines.channels.g0
    @d5.e
    public Object E(@d5.d Continuation<? super r<? extends E>> continuation) {
        Object E = this._channel.E(continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return E;
    }

    @d5.d
    protected final n<E> K1() {
        return this._channel;
    }

    @Override // kotlinx.coroutines.channels.k0
    @d5.d
    public kotlinx.coroutines.selects.e<E, k0<E>> M() {
        return this._channel.M();
    }

    @Override // kotlinx.coroutines.channels.g0
    @d5.e
    public Object N(@d5.d Continuation<? super E> continuation) {
        return this._channel.N(continuation);
    }

    @Override // kotlinx.coroutines.channels.k0
    /* renamed from: Q */
    public boolean a(@d5.e Throwable cause) {
        return this._channel.a(cause);
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
        B0 = B0();
        y0(new JobCancellationException(B0, null, this));
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

    @Override // kotlinx.coroutines.u2, kotlinx.coroutines.n2
    public /* synthetic */ void cancel() {
        String B0;
        B0 = B0();
        y0(new JobCancellationException(B0, null, this));
    }

    @Override // kotlinx.coroutines.u2, kotlinx.coroutines.n2
    public final void e(@d5.e CancellationException cancellationException) {
        String B0;
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            B0 = B0();
            cancellationException = new JobCancellationException(B0, null, this);
        }
        y0(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.g0
    public boolean f() {
        return this._channel.f();
    }

    @d5.d
    public final n<E> g() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.g0
    @d5.d
    public kotlinx.coroutines.selects.d<E> h() {
        return this._channel.h();
    }

    @Override // kotlinx.coroutines.channels.g0
    public boolean isEmpty() {
        return this._channel.isEmpty();
    }

    @Override // kotlinx.coroutines.channels.g0
    @d5.d
    public p<E> iterator() {
        return this._channel.iterator();
    }

    @Override // kotlinx.coroutines.channels.k0
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E element) {
        return this._channel.offer(element);
    }

    @Override // kotlinx.coroutines.channels.g0
    @d5.d
    public kotlinx.coroutines.selects.d<r<E>> p() {
        return this._channel.p();
    }

    @Override // kotlinx.coroutines.channels.g0
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    @d5.e
    public E poll() {
        return this._channel.poll();
    }

    @Override // kotlinx.coroutines.channels.g0
    @d5.d
    public kotlinx.coroutines.selects.d<E> q() {
        return this._channel.q();
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
