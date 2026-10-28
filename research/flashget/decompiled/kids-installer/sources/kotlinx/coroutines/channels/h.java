package kotlinx.coroutines.channels;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.m2;
import kotlinx.coroutines.channels.c;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.r0;

/* compiled from: ArrayChannel.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0006\u0010'\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020(\u0012 \u0010I\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010Gj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`H¢\u0006\u0004\bJ\u0010KJ\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u001f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u001fH\u0014¢\u0006\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u00100\u001a\u00060,j\u0002`-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001e\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010&R\u0014\u00109\u001a\u00020\u001f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u001f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b:\u00108R\u0014\u0010=\u001a\u00020\u001f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b<\u00108R\u0014\u0010?\u001a\u00020\u001f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b>\u00108R\u0014\u0010@\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u00108R\u0014\u0010B\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u00108R\u0014\u0010F\u001a\u00020C8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006L"}, d2 = {"Lkotlinx/coroutines/channels/h;", "E", "Lkotlinx/coroutines/channels/a;", "", "currentSize", "Lkotlinx/coroutines/internal/r0;", "u0", "(I)Lkotlinx/coroutines/internal/r0;", "element", "Lkotlin/m2;", "s0", "(ILjava/lang/Object;)V", "t0", "(I)V", "", "G", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/f;", "select", "H", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/f;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/j0;", "send", "m", "(Lkotlinx/coroutines/channels/j0;)Ljava/lang/Object;", "m0", "()Ljava/lang/Object;", "n0", "(Lkotlinx/coroutines/selects/f;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/f0;", "receive", "", "b0", "(Lkotlinx/coroutines/channels/f0;)Z", "wasClosed", "i0", "(Z)V", "r", "I", "capacity", "Lkotlinx/coroutines/channels/m;", "s", "Lkotlinx/coroutines/channels/m;", "onBufferOverflow", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "t", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "", "u", "[Ljava/lang/Object;", "buffer", "v", "head", "f0", "()Z", "isBufferAlwaysEmpty", "g0", "isBufferEmpty", "B", "isBufferAlwaysFull", "D", "isBufferFull", "isEmpty", "f", "isClosedForReceive", "", "n", "()Ljava/lang/String;", "bufferDebugString", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlinx/coroutines/channels/m;Lq3/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public class h<E> extends kotlinx.coroutines.channels.a<E> {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final m onBufferOverflow;

    @d5.d
    private volatile /* synthetic */ int size;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final ReentrantLock lock;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private Object[] buffer;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int head;

    /* compiled from: ArrayChannel.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27343a;

        static {
            int[] iArr = new int[m.values().length];
            iArr[m.SUSPEND.ordinal()] = 1;
            iArr[m.DROP_LATEST.ordinal()] = 2;
            iArr[m.DROP_OLDEST.ordinal()] = 3;
            f27343a = iArr;
        }
    }

    public h(int i5, @d5.d m mVar, @d5.e q3.l<? super E, m2> lVar) {
        super(lVar);
        this.capacity = i5;
        this.onBufferOverflow = mVar;
        if (!(i5 >= 1)) {
            throw new IllegalArgumentException(androidx.constraintlayout.solver.f.a(ProtectedSandApp.s("邓"), i5, ProtectedSandApp.s("邔")).toString());
        }
        this.lock = new ReentrantLock();
        Object[] objArr = new Object[Math.min(i5, 8)];
        kotlin.collections.p.V1(objArr, b.f27303c, 0, 0, 6, null);
        this.buffer = objArr;
        this.size = 0;
    }

    private final void s0(int currentSize, E element) {
        if (currentSize < this.capacity) {
            t0(currentSize);
            Object[] objArr = this.buffer;
            objArr[(this.head + currentSize) % objArr.length] = element;
        } else {
            Object[] objArr2 = this.buffer;
            int i5 = this.head;
            objArr2[i5 % objArr2.length] = null;
            objArr2[(currentSize + i5) % objArr2.length] = element;
            this.head = (i5 + 1) % objArr2.length;
        }
    }

    private final void t0(int currentSize) {
        Object[] objArr = this.buffer;
        if (currentSize >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.capacity);
            Object[] objArr2 = new Object[min];
            for (int i5 = 0; i5 < currentSize; i5++) {
                Object[] objArr3 = this.buffer;
                objArr2[i5] = objArr3[(this.head + i5) % objArr3.length];
            }
            kotlin.collections.p.M1(objArr2, b.f27303c, currentSize, min);
            this.buffer = objArr2;
            this.head = 0;
        }
    }

    private final r0 u0(int currentSize) {
        if (currentSize < this.capacity) {
            this.size = currentSize + 1;
            return null;
        }
        int i5 = a.f27343a[this.onBufferOverflow.ordinal()];
        if (i5 == 1) {
            return b.f27305e;
        }
        if (i5 == 2) {
            return b.f27304d;
        }
        if (i5 == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // kotlinx.coroutines.channels.c
    protected final boolean B() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.c
    protected final boolean D() {
        return this.size == this.capacity && this.onBufferOverflow == m.SUSPEND;
    }

    @Override // kotlinx.coroutines.channels.c
    @d5.d
    protected Object G(E element) {
        h0<E> O;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            int i5 = this.size;
            w<?> r5 = r();
            if (r5 != null) {
                return r5;
            }
            r0 u02 = u0(i5);
            if (u02 != null) {
                return u02;
            }
            if (i5 == 0) {
                do {
                    O = O();
                    if (O != null) {
                        if (O instanceof w) {
                            this.size = i5;
                            return O;
                        }
                        kotlin.jvm.internal.l0.m(O);
                    }
                } while (O.q0(element, null) == null);
                this.size = i5;
                m2 m2Var = m2.f23662a;
                reentrantLock.unlock();
                O.Z(element);
                return O.k();
            }
            s0(i5, element);
            return b.f27304d;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.c
    @d5.d
    protected Object H(E element, @d5.d kotlinx.coroutines.selects.f<?> select) {
        Object l02;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            int i5 = this.size;
            w<?> r5 = r();
            if (r5 != null) {
                return r5;
            }
            r0 u02 = u0(i5);
            if (u02 != null) {
                return u02;
            }
            if (i5 == 0) {
                do {
                    c.d<E> l5 = l(element);
                    l02 = select.l0(l5);
                    if (l02 == null) {
                        this.size = i5;
                        h0<? super E> o5 = l5.o();
                        m2 m2Var = m2.f23662a;
                        reentrantLock.unlock();
                        kotlin.jvm.internal.l0.m(o5);
                        h0<? super E> h0Var = o5;
                        h0Var.Z(element);
                        return h0Var.k();
                    }
                    if (l02 != b.f27305e) {
                    }
                } while (l02 == kotlinx.coroutines.internal.c.f28690b);
                if (l02 != kotlinx.coroutines.selects.g.d() && !(l02 instanceof w)) {
                    throw new IllegalStateException((ProtectedSandApp.s("邕") + l02).toString());
                }
                this.size = i5;
                return l02;
            }
            if (select.t()) {
                s0(i5, element);
                return b.f27304d;
            }
            this.size = i5;
            return kotlinx.coroutines.selects.g.d();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.a
    protected boolean b0(@d5.d f0<? super E> receive) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return super.b0(receive);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.a, kotlinx.coroutines.channels.g0
    public boolean f() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return super.f();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.a
    protected final boolean f0() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.a
    protected final boolean g0() {
        return this.size == 0;
    }

    @Override // kotlinx.coroutines.channels.a
    protected void i0(boolean wasClosed) {
        q3.l<E, m2> lVar = this.onUndeliveredElement;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            int i5 = this.size;
            UndeliveredElementException undeliveredElementException = null;
            for (int i6 = 0; i6 < i5; i6++) {
                Object obj = this.buffer[this.head];
                if (lVar != null && obj != b.f27303c) {
                    undeliveredElementException = kotlinx.coroutines.internal.i0.c(lVar, obj, undeliveredElementException);
                }
                Object[] objArr = this.buffer;
                int i7 = this.head;
                objArr[i7] = b.f27303c;
                this.head = (i7 + 1) % objArr.length;
            }
            this.size = 0;
            m2 m2Var = m2.f23662a;
            reentrantLock.unlock();
            super.i0(wasClosed);
            if (undeliveredElementException != null) {
                throw undeliveredElementException;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.a, kotlinx.coroutines.channels.g0
    public boolean isEmpty() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return h0();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.c
    @d5.e
    protected Object m(@d5.d j0 send) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return super.m(send);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.a
    @d5.e
    protected Object m0() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            int i5 = this.size;
            if (i5 == 0) {
                Object r5 = r();
                if (r5 == null) {
                    r5 = b.f27306f;
                }
                return r5;
            }
            Object[] objArr = this.buffer;
            int i6 = this.head;
            Object obj = objArr[i6];
            j0 j0Var = null;
            objArr[i6] = null;
            this.size = i5 - 1;
            Object obj2 = b.f27306f;
            boolean z5 = false;
            if (i5 == this.capacity) {
                j0 j0Var2 = null;
                while (true) {
                    j0 P = P();
                    if (P == null) {
                        j0Var = j0Var2;
                        break;
                    }
                    kotlin.jvm.internal.l0.m(P);
                    if (P.c1(null) != null) {
                        obj2 = P.getElement();
                        z5 = true;
                        j0Var = P;
                        break;
                    }
                    P.d1();
                    j0Var2 = P;
                }
            }
            if (obj2 != b.f27306f && !(obj2 instanceof w)) {
                this.size = i5;
                Object[] objArr2 = this.buffer;
                objArr2[(this.head + i5) % objArr2.length] = obj2;
            }
            this.head = (this.head + 1) % this.buffer.length;
            m2 m2Var = m2.f23662a;
            if (z5) {
                kotlin.jvm.internal.l0.m(j0Var);
                j0Var.Z0();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.c
    @d5.d
    protected String n() {
        return ProtectedSandApp.s("邖") + this.capacity + ProtectedSandApp.s("邗") + this.size + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f A[Catch: all -> 0x00c8, TRY_LEAVE, TryCatch #0 {all -> 0x00c8, blocks: (B:3:0x0005, B:5:0x0009, B:7:0x000f, B:11:0x0015, B:13:0x0029, B:48:0x0033, B:28:0x0085, B:30:0x0089, B:32:0x008d, B:33:0x00af, B:38:0x0099, B:40:0x009f, B:15:0x0043, B:17:0x0047, B:20:0x004b, B:22:0x0051, B:25:0x005d, B:43:0x0065, B:44:0x0083), top: B:2:0x0005 }] */
    @Override // kotlinx.coroutines.channels.a
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object n0(@d5.d kotlinx.coroutines.selects.f<?> r9) {
        /*
            r8 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r8.lock
            r0.lock()
            int r1 = r8.size     // Catch: java.lang.Throwable -> Lc8
            if (r1 != 0) goto L15
            kotlinx.coroutines.channels.w r9 = r8.r()     // Catch: java.lang.Throwable -> Lc8
            if (r9 != 0) goto L11
            kotlinx.coroutines.internal.r0 r9 = kotlinx.coroutines.channels.b.f27306f     // Catch: java.lang.Throwable -> Lc8
        L11:
            r0.unlock()
            return r9
        L15:
            java.lang.Object[] r2 = r8.buffer     // Catch: java.lang.Throwable -> Lc8
            int r3 = r8.head     // Catch: java.lang.Throwable -> Lc8
            r4 = r2[r3]     // Catch: java.lang.Throwable -> Lc8
            r5 = 0
            r2[r3] = r5     // Catch: java.lang.Throwable -> Lc8
            int r2 = r1 + (-1)
            r8.size = r2     // Catch: java.lang.Throwable -> Lc8
            kotlinx.coroutines.internal.r0 r2 = kotlinx.coroutines.channels.b.f27306f     // Catch: java.lang.Throwable -> Lc8
            int r3 = r8.capacity     // Catch: java.lang.Throwable -> Lc8
            r6 = 1
            if (r1 != r3) goto L84
        L29:
            kotlinx.coroutines.channels.a$g r3 = r8.X()     // Catch: java.lang.Throwable -> Lc8
            java.lang.Object r7 = r9.l0(r3)     // Catch: java.lang.Throwable -> Lc8
            if (r7 != 0) goto L43
            java.lang.Object r5 = r3.o()     // Catch: java.lang.Throwable -> Lc8
            kotlin.jvm.internal.l0.m(r5)     // Catch: java.lang.Throwable -> Lc8
            r2 = r5
            kotlinx.coroutines.channels.j0 r2 = (kotlinx.coroutines.channels.j0) r2     // Catch: java.lang.Throwable -> Lc8
            java.lang.Object r2 = r2.getElement()     // Catch: java.lang.Throwable -> Lc8
            r3 = r6
            goto L85
        L43:
            kotlinx.coroutines.internal.r0 r3 = kotlinx.coroutines.channels.b.f27306f     // Catch: java.lang.Throwable -> Lc8
            if (r7 == r3) goto L84
            java.lang.Object r3 = kotlinx.coroutines.internal.c.f28690b     // Catch: java.lang.Throwable -> Lc8
            if (r7 == r3) goto L29
            java.lang.Object r2 = kotlinx.coroutines.selects.g.d()     // Catch: java.lang.Throwable -> Lc8
            if (r7 != r2) goto L5d
            r8.size = r1     // Catch: java.lang.Throwable -> Lc8
            java.lang.Object[] r9 = r8.buffer     // Catch: java.lang.Throwable -> Lc8
            int r1 = r8.head     // Catch: java.lang.Throwable -> Lc8
            r9[r1] = r4     // Catch: java.lang.Throwable -> Lc8
            r0.unlock()
            return r7
        L5d:
            boolean r2 = r7 instanceof kotlinx.coroutines.channels.w     // Catch: java.lang.Throwable -> Lc8
            if (r2 == 0) goto L65
            r3 = r6
            r2 = r7
            r5 = r2
            goto L85
        L65:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc8
            r1.<init>()     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r2 = "邘"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> Lc8
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc8
            r1.append(r7)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc8
            r9.<init>(r1)     // Catch: java.lang.Throwable -> Lc8
            throw r9     // Catch: java.lang.Throwable -> Lc8
        L84:
            r3 = 0
        L85:
            kotlinx.coroutines.internal.r0 r7 = kotlinx.coroutines.channels.b.f27306f     // Catch: java.lang.Throwable -> Lc8
            if (r2 == r7) goto L99
            boolean r7 = r2 instanceof kotlinx.coroutines.channels.w     // Catch: java.lang.Throwable -> Lc8
            if (r7 != 0) goto L99
            r8.size = r1     // Catch: java.lang.Throwable -> Lc8
            java.lang.Object[] r9 = r8.buffer     // Catch: java.lang.Throwable -> Lc8
            int r7 = r8.head     // Catch: java.lang.Throwable -> Lc8
            int r7 = r7 + r1
            int r1 = r9.length     // Catch: java.lang.Throwable -> Lc8
            int r7 = r7 % r1
            r9[r7] = r2     // Catch: java.lang.Throwable -> Lc8
            goto Laf
        L99:
            boolean r9 = r9.t()     // Catch: java.lang.Throwable -> Lc8
            if (r9 != 0) goto Laf
            r8.size = r1     // Catch: java.lang.Throwable -> Lc8
            java.lang.Object[] r9 = r8.buffer     // Catch: java.lang.Throwable -> Lc8
            int r1 = r8.head     // Catch: java.lang.Throwable -> Lc8
            r9[r1] = r4     // Catch: java.lang.Throwable -> Lc8
            java.lang.Object r9 = kotlinx.coroutines.selects.g.d()     // Catch: java.lang.Throwable -> Lc8
            r0.unlock()
            return r9
        Laf:
            int r9 = r8.head     // Catch: java.lang.Throwable -> Lc8
            int r9 = r9 + r6
            java.lang.Object[] r1 = r8.buffer     // Catch: java.lang.Throwable -> Lc8
            int r1 = r1.length     // Catch: java.lang.Throwable -> Lc8
            int r9 = r9 % r1
            r8.head = r9     // Catch: java.lang.Throwable -> Lc8
            kotlin.m2 r9 = kotlin.m2.f23662a     // Catch: java.lang.Throwable -> Lc8
            r0.unlock()
            if (r3 == 0) goto Lc7
            kotlin.jvm.internal.l0.m(r5)
            kotlinx.coroutines.channels.j0 r5 = (kotlinx.coroutines.channels.j0) r5
            r5.Z0()
        Lc7:
            return r4
        Lc8:
            r9 = move-exception
            r0.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.h.n0(kotlinx.coroutines.selects.f):java.lang.Object");
    }
}
