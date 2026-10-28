package kotlinx.coroutines.channels;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.m2;

/* compiled from: ArrayBroadcastChannel.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001bB\u000f\u0012\u0006\u0010-\u001a\u00020(¢\u0006\u0004\bR\u0010GJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u000f\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\fH\u0082\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\bJ\u0019\u0010\u001b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u001b\u0010\bJ\u001f\u0010\u001e\u001a\u00020\t2\u000e\u0010\u0005\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00028\u0000H\u0014¢\u0006\u0004\b\"\u0010#J#\u0010&\u001a\u00020!2\u0006\u0010 \u001a\u00028\u00002\n\u0010%\u001a\u0006\u0012\u0002\b\u00030$H\u0014¢\u0006\u0004\b&\u0010'R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0018\u00102\u001a\u00060.j\u0002`/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R6\u0010<\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f07j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f`88\u0002X\u0082\u0004¢\u0006\f\n\u0004\b9\u0010:\u0012\u0004\b;\u0010\u000bR$\u0010A\u001a\u00020\u00112\u0006\u0010=\u001a\u00020\u00118B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b>\u0010\u0013\"\u0004\b?\u0010@R$\u0010D\u001a\u00020\u00112\u0006\u0010=\u001a\u00020\u00118B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bB\u0010\u0013\"\u0004\bC\u0010@R$\u0010H\u001a\u00020(2\u0006\u0010=\u001a\u00020(8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bE\u0010,\"\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bL\u0010JR\u0014\u0010Q\u001a\u00020N8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006S"}, d2 = {"Lkotlinx/coroutines/channels/g;", "E", "Lkotlinx/coroutines/channels/c;", "Lkotlinx/coroutines/channels/i;", "", "cause", "", "U", "(Ljava/lang/Throwable;)Z", "Lkotlin/m2;", "V", "()V", "Lkotlinx/coroutines/channels/g$a;", "addSub", "removeSub", "j0", "(Lkotlinx/coroutines/channels/g$a;Lkotlinx/coroutines/channels/g$a;)V", "", "W", "()J", "index", "X", "(J)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/g0;", "S", "()Lkotlinx/coroutines/channels/g0;", "Q", "a", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "e", "(Ljava/util/concurrent/CancellationException;)V", "element", "", "G", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/f;", "select", "H", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/f;)Ljava/lang/Object;", "", "r", "I", "Z", "()I", "capacity", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "s", "Ljava/util/concurrent/locks/ReentrantLock;", "bufferLock", "", "t", "[Ljava/lang/Object;", "buffer", "", "Lkotlinx/coroutines/internal/SubscribersList;", "u", "Ljava/util/List;", "getSubscribers$annotations", "subscribers", "value", "b0", "g0", "(J)V", "head", "f0", "i0", "tail", "d0", "h0", "(I)V", "size", "B", "()Z", "isBufferAlwaysFull", "D", "isBufferFull", "", "n", "()Ljava/lang/String;", "bufferDebugString", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class g<E> extends c<E> implements i<E> {

    @d5.d
    private volatile /* synthetic */ long _head;

    @d5.d
    private volatile /* synthetic */ int _size;

    @d5.d
    private volatile /* synthetic */ long _tail;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final ReentrantLock bufferLock;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Object[] buffer;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final List<a<E>> subscribers;

    /* compiled from: ArrayBroadcastChannel.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0006J\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u000f\u0010\tJ\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001c\u001a\u00060\u0018j\u0002`\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0006R\u0014\u0010'\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0006R\u0014\u0010)\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0006R\u0014\u0010+\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0006¨\u0006."}, d2 = {"Lkotlinx/coroutines/channels/g$a;", "E", "Lkotlinx/coroutines/channels/a;", "Lkotlinx/coroutines/channels/g0;", "", "u0", "()Z", "", "v0", "()Ljava/lang/Object;", "", "cause", "Q", "(Ljava/lang/Throwable;)Z", "s0", "m0", "Lkotlinx/coroutines/selects/f;", "select", "n0", "(Lkotlinx/coroutines/selects/f;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/g;", "r", "Lkotlinx/coroutines/channels/g;", "broadcastChannel", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "s", "Ljava/util/concurrent/locks/ReentrantLock;", "subLock", "", "value", "t0", "()J", "w0", "(J)V", "subHead", "f0", "isBufferAlwaysEmpty", "g0", "isBufferEmpty", "B", "isBufferAlwaysFull", "D", "isBufferFull", "<init>", "(Lkotlinx/coroutines/channels/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    private static final class a<E> extends kotlinx.coroutines.channels.a<E> implements g0<E> {

        @d5.d
        private volatile /* synthetic */ long _subHead;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g<E> broadcastChannel;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final ReentrantLock subLock;

        public a(@d5.d g<E> gVar) {
            super(null);
            this.broadcastChannel = gVar;
            this.subLock = new ReentrantLock();
            this._subHead = 0L;
        }

        private final boolean u0() {
            if (o() != null) {
                return false;
            }
            return (g0() && this.broadcastChannel.o() == null) ? false : true;
        }

        private final Object v0() {
            long j5 = this._subHead;
            w<?> o5 = this.broadcastChannel.o();
            if (j5 < g.T(this.broadcastChannel)) {
                Object X = this.broadcastChannel.X(j5);
                w<?> o6 = o();
                return o6 != null ? o6 : X;
            }
            if (o5 != null) {
                return o5;
            }
            w<?> o7 = o();
            return o7 == null ? b.f27306f : o7;
        }

        @Override // kotlinx.coroutines.channels.c
        protected boolean B() {
            throw new IllegalStateException(ProtectedSandApp.s("邌").toString());
        }

        @Override // kotlinx.coroutines.channels.c
        protected boolean D() {
            throw new IllegalStateException(ProtectedSandApp.s("邍").toString());
        }

        @Override // kotlinx.coroutines.channels.c, kotlinx.coroutines.channels.k0
        public boolean Q(@d5.e Throwable cause) {
            boolean Q = super.Q(cause);
            if (Q) {
                g.k0(this.broadcastChannel, null, this, 1, null);
                ReentrantLock reentrantLock = this.subLock;
                reentrantLock.lock();
                try {
                    this._subHead = g.T(this.broadcastChannel);
                    m2 m2Var = m2.f23662a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            return Q;
        }

        @Override // kotlinx.coroutines.channels.a
        protected boolean f0() {
            return false;
        }

        @Override // kotlinx.coroutines.channels.a
        protected boolean g0() {
            return this._subHead >= g.T(this.broadcastChannel);
        }

        @Override // kotlinx.coroutines.channels.a
        @d5.e
        protected Object m0() {
            boolean z5;
            ReentrantLock reentrantLock = this.subLock;
            reentrantLock.lock();
            try {
                Object v02 = v0();
                if ((v02 instanceof w) || v02 == b.f27306f) {
                    z5 = false;
                } else {
                    this._subHead++;
                    z5 = true;
                }
                reentrantLock.unlock();
                w wVar = v02 instanceof w ? (w) v02 : null;
                if (wVar != null) {
                    Q(wVar.closeCause);
                }
                if (s0() ? true : z5) {
                    g.k0(this.broadcastChannel, null, null, 3, null);
                }
                return v02;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        @Override // kotlinx.coroutines.channels.a
        @d5.e
        protected Object n0(@d5.d kotlinx.coroutines.selects.f<?> select) {
            ReentrantLock reentrantLock = this.subLock;
            reentrantLock.lock();
            try {
                Object v02 = v0();
                boolean z5 = false;
                if (!(v02 instanceof w) && v02 != b.f27306f) {
                    if (select.t()) {
                        this._subHead++;
                        z5 = true;
                    } else {
                        v02 = kotlinx.coroutines.selects.g.d();
                    }
                }
                reentrantLock.unlock();
                w wVar = v02 instanceof w ? (w) v02 : null;
                if (wVar != null) {
                    Q(wVar.closeCause);
                }
                if (s0() ? true : z5) {
                    g.k0(this.broadcastChannel, null, null, 3, null);
                }
                return v02;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x001d, code lost:
        
            r2 = (kotlinx.coroutines.channels.w) r1;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean s0() {
            /*
                r8 = this;
                r0 = 0
            L1:
                boolean r1 = r8.u0()
                r2 = 0
                if (r1 == 0) goto L56
                java.util.concurrent.locks.ReentrantLock r1 = r8.subLock
                boolean r1 = r1.tryLock()
                if (r1 == 0) goto L56
                java.lang.Object r1 = r8.v0()     // Catch: java.lang.Throwable -> L4f
                kotlinx.coroutines.internal.r0 r3 = kotlinx.coroutines.channels.b.f27306f     // Catch: java.lang.Throwable -> L4f
                if (r1 != r3) goto L19
                goto L38
            L19:
                boolean r3 = r1 instanceof kotlinx.coroutines.channels.w     // Catch: java.lang.Throwable -> L4f
                if (r3 == 0) goto L21
                kotlinx.coroutines.channels.w r1 = (kotlinx.coroutines.channels.w) r1     // Catch: java.lang.Throwable -> L4f
                r2 = r1
                goto L2c
            L21:
                kotlinx.coroutines.channels.h0 r3 = r8.O()     // Catch: java.lang.Throwable -> L4f
                if (r3 != 0) goto L28
                goto L2c
            L28:
                boolean r4 = r3 instanceof kotlinx.coroutines.channels.w     // Catch: java.lang.Throwable -> L4f
                if (r4 == 0) goto L32
            L2c:
                java.util.concurrent.locks.ReentrantLock r1 = r8.subLock
                r1.unlock()
                goto L56
            L32:
                kotlinx.coroutines.internal.r0 r2 = r3.q0(r1, r2)     // Catch: java.lang.Throwable -> L4f
                if (r2 != 0) goto L3e
            L38:
                java.util.concurrent.locks.ReentrantLock r1 = r8.subLock
                r1.unlock()
                goto L1
            L3e:
                long r4 = r8._subHead     // Catch: java.lang.Throwable -> L4f
                r6 = 1
                long r4 = r4 + r6
                r8._subHead = r4     // Catch: java.lang.Throwable -> L4f
                java.util.concurrent.locks.ReentrantLock r0 = r8.subLock
                r0.unlock()
                r3.Z(r1)
                r0 = 1
                goto L1
            L4f:
                r0 = move-exception
                java.util.concurrent.locks.ReentrantLock r1 = r8.subLock
                r1.unlock()
                throw r0
            L56:
                if (r2 == 0) goto L5d
                java.lang.Throwable r1 = r2.closeCause
                r8.Q(r1)
            L5d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.g.a.s0():boolean");
        }

        /* renamed from: t0, reason: from getter */
        public final long get_subHead() {
            return this._subHead;
        }

        public final void w0(long j5) {
            this._subHead = j5;
        }
    }

    public g(int i5) {
        super(null);
        this.capacity = i5;
        if (!(i5 >= 1)) {
            throw new IllegalArgumentException(androidx.constraintlayout.solver.f.a(ProtectedSandApp.s("邏"), i5, ProtectedSandApp.s("邐")).toString());
        }
        this.bufferLock = new ReentrantLock();
        this.buffer = new Object[i5];
        this._head = 0L;
        this._tail = 0L;
        this._size = 0;
        this.subscribers = kotlinx.coroutines.internal.f.d();
    }

    public static final long T(g gVar) {
        return gVar._tail;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlinx.coroutines.channels.i
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final boolean a(Throwable cause) {
        boolean Q = Q(cause);
        Iterator<a<E>> it = this.subscribers.iterator();
        while (it.hasNext()) {
            it.next().a(cause);
        }
        return Q;
    }

    private final void V() {
        boolean z5;
        Iterator<a<E>> it = this.subscribers.iterator();
        boolean z6 = false;
        loop0: while (true) {
            z5 = z6;
            while (it.hasNext()) {
                if (it.next().s0()) {
                    break;
                } else {
                    z5 = true;
                }
            }
            z6 = true;
        }
        if (z6 || !z5) {
            k0(this, null, null, 3, null);
        }
    }

    private final long W() {
        Iterator<a<E>> it = this.subscribers.iterator();
        long j5 = Long.MAX_VALUE;
        while (it.hasNext()) {
            long j6 = it.next().get_subHead();
            if (j5 > j6) {
                j5 = j6;
            }
        }
        return j5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E X(long index) {
        return (E) this.buffer[(int) (index % this.capacity)];
    }

    /* renamed from: b0, reason: from getter */
    private final long get_head() {
        return this._head;
    }

    /* renamed from: d0, reason: from getter */
    private final int get_size() {
        return this._size;
    }

    private static /* synthetic */ void e0() {
    }

    /* renamed from: f0, reason: from getter */
    private final long get_tail() {
        return this._tail;
    }

    private final void g0(long j5) {
        this._head = j5;
    }

    private final void h0(int i5) {
        this._size = i5;
    }

    private final void i0(long j5) {
        this._tail = j5;
    }

    private final void j0(a<E> addSub, a<E> removeSub) {
        j0 P;
        while (true) {
            ReentrantLock reentrantLock = this.bufferLock;
            reentrantLock.lock();
            if (addSub != null) {
                try {
                    addSub.w0(this._tail);
                    boolean isEmpty = this.subscribers.isEmpty();
                    this.subscribers.add(addSub);
                    if (!isEmpty) {
                        return;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            if (removeSub != null) {
                this.subscribers.remove(removeSub);
                if (this._head != removeSub.get_subHead()) {
                    return;
                }
            }
            long W = W();
            long j5 = this._tail;
            long j6 = this._head;
            if (W > j5) {
                W = j5;
            }
            if (W <= j6) {
                return;
            }
            int i5 = this._size;
            while (j6 < W) {
                Object[] objArr = this.buffer;
                int i6 = this.capacity;
                objArr[(int) (j6 % i6)] = null;
                boolean z5 = i5 >= i6;
                j6++;
                this._head = j6;
                i5--;
                this._size = i5;
                if (z5) {
                    do {
                        P = P();
                        if (P != null && !(P instanceof w)) {
                            kotlin.jvm.internal.l0.m(P);
                        }
                    } while (P.c1(null) == null);
                    this.buffer[(int) (j5 % this.capacity)] = P.getElement();
                    this._size = i5 + 1;
                    this._tail = j5 + 1;
                    m2 m2Var = m2.f23662a;
                    reentrantLock.unlock();
                    P.Z0();
                    V();
                    addSub = null;
                    removeSub = null;
                }
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void k0(g gVar, a aVar, a aVar2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            aVar = null;
        }
        if ((i5 & 2) != 0) {
            aVar2 = null;
        }
        gVar.j0(aVar, aVar2);
    }

    @Override // kotlinx.coroutines.channels.c
    protected boolean B() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.c
    protected boolean D() {
        return this._size >= this.capacity;
    }

    @Override // kotlinx.coroutines.channels.c
    @d5.d
    protected Object G(E element) {
        ReentrantLock reentrantLock = this.bufferLock;
        reentrantLock.lock();
        try {
            w<?> r5 = r();
            if (r5 != null) {
                return r5;
            }
            int i5 = this._size;
            if (i5 >= this.capacity) {
                return b.f27305e;
            }
            long j5 = this._tail;
            this.buffer[(int) (j5 % this.capacity)] = element;
            this._size = i5 + 1;
            this._tail = j5 + 1;
            m2 m2Var = m2.f23662a;
            reentrantLock.unlock();
            V();
            return b.f27304d;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.c
    @d5.d
    protected Object H(E element, @d5.d kotlinx.coroutines.selects.f<?> select) {
        ReentrantLock reentrantLock = this.bufferLock;
        reentrantLock.lock();
        try {
            w<?> r5 = r();
            if (r5 != null) {
                return r5;
            }
            int i5 = this._size;
            if (i5 >= this.capacity) {
                return b.f27305e;
            }
            if (!select.t()) {
                return kotlinx.coroutines.selects.g.d();
            }
            long j5 = this._tail;
            this.buffer[(int) (j5 % this.capacity)] = element;
            this._size = i5 + 1;
            this._tail = j5 + 1;
            m2 m2Var = m2.f23662a;
            reentrantLock.unlock();
            V();
            return b.f27304d;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.c, kotlinx.coroutines.channels.k0
    public boolean Q(@d5.e Throwable cause) {
        if (!super.Q(cause)) {
            return false;
        }
        V();
        return true;
    }

    @Override // kotlinx.coroutines.channels.i
    @d5.d
    public g0<E> S() {
        a aVar = new a(this);
        k0(this, aVar, null, 2, null);
        return aVar;
    }

    /* renamed from: Z, reason: from getter */
    public final int getCapacity() {
        return this.capacity;
    }

    @Override // kotlinx.coroutines.channels.i
    public void e(@d5.e CancellationException cause) {
        a(cause);
    }

    @Override // kotlinx.coroutines.channels.c
    @d5.d
    protected String n() {
        return ProtectedSandApp.s("邑") + this.buffer.length + ProtectedSandApp.s("邒") + this._size + ')';
    }
}
