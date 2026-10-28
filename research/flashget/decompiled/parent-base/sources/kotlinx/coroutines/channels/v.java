package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.k2;
import kotlin.x0;
import kotlinx.coroutines.a3;
import kotlinx.coroutines.channels.e0;

/* compiled from: BroadcastChannel.kt */
@a3
@kotlin.k(level = kotlin.m.WARNING, message = "ConflatedBroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\tJ\u001c\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0097\u0001¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0012\u001a\u00020\u00112\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ5\u0010\u0019\u001a\u00020\u00112#\u0010\u0018\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00110\u0015H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b!\u0010\"J'\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110#2\u0006\u0010\u001b\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010&R\u0014\u0010)\u001a\u00020\f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(R&\u0010.\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000+0*8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\b\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u00102\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b1\u00100\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"Lkotlinx/coroutines/channels/v;", "E", "Lkotlinx/coroutines/channels/d;", "Lkotlinx/coroutines/channels/e;", "broadcast", "<init>", "(Lkotlinx/coroutines/channels/e;)V", "()V", "value", "(Ljava/lang/Object;)V", "", "cause", "", "f", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlin/k2;", "b", "(Ljava/util/concurrent/CancellationException;)V", "b0", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "handler", "d0", "(Lld/l;)V", "element", "offer", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/channels/d0;", "w", "()Lkotlinx/coroutines/channels/d0;", "f0", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/p;", "M", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/e;", "g0", "()Z", "isClosedForSend", "Lkotlinx/coroutines/selects/i;", "Lkotlinx/coroutines/channels/e0;", "r", "()Lkotlinx/coroutines/selects/i;", "onSend", "c", "()Ljava/lang/Object;", "d", "valueOrNull", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class v<E> implements d<E> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e<E> broadcast;

    private v(e<E> eVar) {
        this.broadcast = eVar;
    }

    @Override // kotlinx.coroutines.channels.e0
    @fg.l
    public Object M(E element) {
        return this.broadcast.M(element);
    }

    @Override // kotlinx.coroutines.channels.d
    public void b(@fg.m CancellationException cause) {
        this.broadcast.G(cause);
    }

    @Override // kotlinx.coroutines.channels.e0
    public boolean b0(@fg.m Throwable cause) {
        return this.broadcast.b0(cause);
    }

    public final E c() {
        return this.broadcast.N1();
    }

    @fg.m
    public final E d() {
        return this.broadcast.P1();
    }

    @Override // kotlinx.coroutines.channels.e0
    public void d0(@fg.l ld.l<? super Throwable, k2> handler) {
        this.broadcast.d0(handler);
    }

    @Override // kotlinx.coroutines.channels.d
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility only")
    public boolean f(Throwable cause) {
        return this.broadcast.G(cause);
    }

    @Override // kotlinx.coroutines.channels.e0
    @fg.m
    public Object f0(E e4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        return this.broadcast.f0(e4, dVar);
    }

    @Override // kotlinx.coroutines.channels.e0
    public boolean g0() {
        return this.broadcast.g0();
    }

    @Override // kotlinx.coroutines.channels.e0
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @x0(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E element) {
        e<E> eVar = this.broadcast;
        eVar.getClass();
        return e0.a.c(eVar, element);
    }

    @Override // kotlinx.coroutines.channels.e0
    @fg.l
    public kotlinx.coroutines.selects.i<E, e0<E>> r() {
        return this.broadcast.r();
    }

    @Override // kotlinx.coroutines.channels.d
    @fg.l
    public d0<E> w() {
        return this.broadcast.w();
    }

    public v() {
        this(new e(-1));
    }

    public v(E e4) {
        this();
        M(e4);
    }
}
