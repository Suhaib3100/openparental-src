package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.x0;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.r2;

/* compiled from: ChannelCoroutine.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0015\u001a\u00020\u00032#\u0010\u0014\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00030\u0011H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00018\u0000H\u0097\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\"\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0096Aø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\"\u0010 J\u0015\u0010#\u001a\u0004\u0018\u00018\u0000H\u0097Aø\u0001\u0000¢\u0006\u0004\b#\u0010 J\u001b\u0010$\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0096\u0001ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010\u001eJ'\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030!2\u0006\u0010\u001a\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0003H\u0017¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b+\u0010\u0010J\u001d\u0010.\u001a\u00020\u00032\u000e\u0010\u000e\u001a\n\u0018\u00010,j\u0004\u0018\u0001`-¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b0\u00101R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u00108\u001a\u00020\b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b9\u00107R\u0014\u0010;\u001a\u00020\b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b;\u00107R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000<8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b=\u0010>R#\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!0<8\u0016X\u0096\u0005ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b@\u0010>R\u001c\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000<8VX\u0097\u0005¢\u0006\u0006\u001a\u0004\bB\u0010>R&\u0010H\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000E0D8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048F¢\u0006\u0006\u001a\u0004\bI\u00105\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006K"}, d2 = {"Lkotlinx/coroutines/channels/m;", "E", "Lkotlinx/coroutines/a;", "Lkotlin/k2;", "Lkotlinx/coroutines/channels/l;", "Lkotlin/coroutines/g;", "parentContext", "_channel", "", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/l;ZZ)V", "", "cause", "b0", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "handler", "d0", "(Lld/l;)V", "Lkotlinx/coroutines/channels/n;", "iterator", "()Lkotlinx/coroutines/channels/n;", "element", "offer", "(Ljava/lang/Object;)Z", "poll", "()Ljava/lang/Object;", "a0", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/p;", "V", "U", "f0", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "T", "M", "(Ljava/lang/Object;)Ljava/lang/Object;", "cancel", "()V", "f", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "b", "(Ljava/util/concurrent/CancellationException;)V", "G0", "(Ljava/lang/Throwable;)V", "e", "Lkotlinx/coroutines/channels/l;", "b2", "()Lkotlinx/coroutines/channels/l;", "j", "()Z", "isClosedForReceive", "g0", "isClosedForSend", "isEmpty", "Lkotlinx/coroutines/selects/g;", "P", "()Lkotlinx/coroutines/selects/g;", "onReceive", "Q", "onReceiveCatching", "R", "onReceiveOrNull", "Lkotlinx/coroutines/selects/i;", "Lkotlinx/coroutines/channels/e0;", "r", "()Lkotlinx/coroutines/selects/i;", "onSend", "a", "channel", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nChannelCoroutine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,41:1\n706#2,2:42\n706#2,2:44\n706#2,2:46\n*S KotlinDebug\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n*L\n21#1:42,2\n26#1:44,2\n32#1:46,2\n*E\n"})
/* loaded from: classes7.dex */
public class m<E> extends kotlinx.coroutines.a<k2> implements l<E> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l<E> _channel;

    public m(@fg.l kotlin.coroutines.g gVar, @fg.l l<E> lVar, boolean z4, boolean z5) {
        super(gVar, z4, z5);
        this._channel = lVar;
    }

    @Override // kotlinx.coroutines.r2
    public void G0(@fg.l Throwable cause) {
        CancellationException P1 = r2.P1(this, cause, null, 1, null);
        this._channel.b(P1);
        F0(P1);
    }

    @Override // kotlinx.coroutines.channels.e0
    @fg.l
    public Object M(E element) {
        return this._channel.M(element);
    }

    @Override // kotlinx.coroutines.channels.d0
    @fg.l
    public kotlinx.coroutines.selects.g<E> P() {
        return this._channel.P();
    }

    @Override // kotlinx.coroutines.channels.d0
    @fg.l
    public kotlinx.coroutines.selects.g<p<E>> Q() {
        return this._channel.Q();
    }

    @Override // kotlinx.coroutines.channels.d0
    @fg.l
    public kotlinx.coroutines.selects.g<E> R() {
        return this._channel.R();
    }

    @Override // kotlinx.coroutines.channels.d0
    @fg.l
    public Object T() {
        return this._channel.T();
    }

    @Override // kotlinx.coroutines.channels.d0
    @fg.m
    @kotlin.internal.h
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @x0(expression = "receiveCatching().getOrNull()", imports = {}))
    public Object U(@fg.l kotlin.coroutines.d<? super E> dVar) {
        return this._channel.U(dVar);
    }

    @Override // kotlinx.coroutines.channels.d0
    @fg.m
    public Object V(@fg.l kotlin.coroutines.d<? super p<? extends E>> dVar) {
        Object V = this._channel.V(dVar);
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        return V;
    }

    @fg.l
    public final l<E> a() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.d0
    @fg.m
    public Object a0(@fg.l kotlin.coroutines.d<? super E> dVar) {
        return this._channel.a0(dVar);
    }

    @Override // kotlinx.coroutines.r2, kotlinx.coroutines.k2, kotlinx.coroutines.channels.d
    public final void b(@fg.m CancellationException cause) {
        String L0;
        if (isCancelled()) {
            return;
        }
        if (cause == null) {
            L0 = L0();
            cause = new JobCancellationException(L0, null, this);
        }
        G0(cause);
    }

    @Override // kotlinx.coroutines.channels.e0
    public boolean b0(@fg.m Throwable cause) {
        return this._channel.b0(cause);
    }

    @fg.l
    protected final l<E> b2() {
        return this._channel;
    }

    @Override // kotlinx.coroutines.r2, kotlinx.coroutines.k2, kotlinx.coroutines.channels.d0
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        String L0;
        L0 = L0();
        G0(new JobCancellationException(L0, null, this));
    }

    @Override // kotlinx.coroutines.channels.e0
    public void d0(@fg.l ld.l<? super Throwable, k2> handler) {
        this._channel.d0(handler);
    }

    @Override // kotlinx.coroutines.r2, kotlinx.coroutines.k2, kotlinx.coroutines.channels.d
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean f(Throwable cause) {
        String L0;
        L0 = L0();
        G0(new JobCancellationException(L0, null, this));
        return true;
    }

    @Override // kotlinx.coroutines.channels.e0
    @fg.m
    public Object f0(E e4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        return this._channel.f0(e4, dVar);
    }

    @Override // kotlinx.coroutines.channels.e0
    public boolean g0() {
        return this._channel.g0();
    }

    @Override // kotlinx.coroutines.channels.d0
    public boolean isEmpty() {
        return this._channel.isEmpty();
    }

    @Override // kotlinx.coroutines.channels.d0
    @fg.l
    public n<E> iterator() {
        return this._channel.iterator();
    }

    @Override // kotlinx.coroutines.channels.d0
    public boolean j() {
        return this._channel.j();
    }

    @Override // kotlinx.coroutines.channels.e0
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @x0(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E element) {
        return this._channel.offer(element);
    }

    @Override // kotlinx.coroutines.channels.d0
    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @x0(expression = "tryReceive().getOrNull()", imports = {}))
    public E poll() {
        return this._channel.poll();
    }

    @Override // kotlinx.coroutines.channels.e0
    @fg.l
    public kotlinx.coroutines.selects.i<E, e0<E>> r() {
        return this._channel.r();
    }
}
