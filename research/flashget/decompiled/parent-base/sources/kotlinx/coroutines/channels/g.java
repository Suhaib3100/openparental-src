package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.x0;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.channels.e0;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.r2;

/* compiled from: Broadcast.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B%\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0013\u001a\u00020\u00032#\u0010\u0012\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00030\rH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u00032\u000e\u0010\u0011\u001a\n\u0018\u00010\"j\u0004\u0018\u0001`#¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0003H\u0014¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\tH\u0014¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b.\u0010!R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b3\u00104R&\u0010:\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000007068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010;\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00104R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00028\u0000078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006?"}, d2 = {"Lkotlinx/coroutines/channels/g;", "E", "Lkotlinx/coroutines/a;", "Lkotlin/k2;", "Lkotlinx/coroutines/channels/b0;", "Lkotlinx/coroutines/channels/d;", "Lkotlin/coroutines/g;", "parentContext", "_channel", "", "active", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/d;Z)V", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "cause", "handler", "d0", "(Lld/l;)V", "element", "offer", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/channels/d0;", "w", "()Lkotlinx/coroutines/channels/d0;", "f0", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/p;", "M", "(Ljava/lang/Object;)Ljava/lang/Object;", "f", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "b", "(Ljava/util/concurrent/CancellationException;)V", "G0", "(Ljava/lang/Throwable;)V", "value", "c2", "(Lkotlin/k2;)V", "handled", "Y1", "(Ljava/lang/Throwable;Z)V", "b0", "e", "Lkotlinx/coroutines/channels/d;", "b2", "()Lkotlinx/coroutines/channels/d;", "g0", "()Z", "isClosedForSend", "Lkotlinx/coroutines/selects/i;", "Lkotlinx/coroutines/channels/e0;", "r", "()Lkotlinx/coroutines/selects/i;", "onSend", "isActive", "a", "()Lkotlinx/coroutines/channels/e0;", "channel", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBroadcast.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastCoroutine\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,202:1\n706#2,2:203\n706#2,2:205\n*S KotlinDebug\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastCoroutine\n*L\n152#1:203,2\n157#1:205,2\n*E\n"})
/* loaded from: classes7.dex */
class g<E> extends kotlinx.coroutines.a<k2> implements b0<E>, d<E> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d<E> _channel;

    public g(@fg.l kotlin.coroutines.g gVar, @fg.l d<E> dVar, boolean z4) {
        super(gVar, false, z4);
        this._channel = dVar;
        l1((kotlinx.coroutines.k2) gVar.c(kotlinx.coroutines.k2.INSTANCE));
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

    @Override // kotlinx.coroutines.a
    protected void Y1(@fg.l Throwable cause, boolean handled) {
        if (this._channel.b0(cause) || handled) {
            return;
        }
        o0.b(getF75269b(), cause);
    }

    @Override // kotlinx.coroutines.channels.b0
    @fg.l
    public e0<E> a() {
        return this;
    }

    @Override // kotlinx.coroutines.r2, kotlinx.coroutines.k2, kotlinx.coroutines.channels.d
    public final void b(@fg.m CancellationException cause) {
        String L0;
        if (cause == null) {
            L0 = L0();
            cause = new JobCancellationException(L0, null, this);
        }
        G0(cause);
    }

    @Override // kotlinx.coroutines.channels.e0
    public boolean b0(@fg.m Throwable cause) {
        boolean b02 = this._channel.b0(cause);
        start();
        return b02;
    }

    @fg.l
    protected final d<E> b2() {
        return this._channel;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a
    /* renamed from: c2, reason: merged with bridge method [inline-methods] */
    public void Z1(@fg.l k2 value) {
        e0.a.a(this._channel, null, 1, null);
    }

    @Override // kotlinx.coroutines.channels.e0
    public void d0(@fg.l ld.l<? super Throwable, k2> handler) {
        this._channel.d0(handler);
    }

    @Override // kotlinx.coroutines.r2, kotlinx.coroutines.k2, kotlinx.coroutines.channels.d
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean f(Throwable cause) {
        String L0;
        if (cause == null) {
            L0 = L0();
            cause = new JobCancellationException(L0, null, this);
        }
        G0(cause);
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

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.r2, kotlinx.coroutines.k2
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.channels.e0
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @x0(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E element) {
        return this._channel.offer(element);
    }

    @Override // kotlinx.coroutines.channels.e0
    @fg.l
    public kotlinx.coroutines.selects.i<E, e0<E>> r() {
        return this._channel.r();
    }

    @Override // kotlinx.coroutines.channels.d
    @fg.l
    public d0<E> w() {
        return this._channel.w();
    }
}
