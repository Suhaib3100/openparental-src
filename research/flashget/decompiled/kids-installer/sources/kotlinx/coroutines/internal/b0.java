package kotlinx.coroutines.internal;

import a0.c;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

/* compiled from: LockFreeTaskQueue.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\b\u0000\u0018\u0000 \u0007*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\u0017\u0013B\u0017\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010'\u001a\u00020\u0014¢\u0006\u0004\b.\u0010/J3\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00062\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00062\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 \"\u0004\b\u0001\u0010\u001d2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0014¢\u0006\u0004\b#\u0010\u0016R\u0014\u0010%\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u0014\u0010'\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010&R\u0014\u0010(\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u0011\u0010*\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b)\u0010\u0016R\u0011\u0010-\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lkotlinx/coroutines/internal/b0;", "", "E", "", "index", "element", "Lkotlinx/coroutines/internal/Core;", "e", "(ILjava/lang/Object;)Lkotlinx/coroutines/internal/b0;", "oldHead", "newHead", "m", "(II)Lkotlinx/coroutines/internal/b0;", "", "j", "()J", "state", "c", "(J)Lkotlinx/coroutines/internal/b0;", "b", "", "d", "()Z", "a", "(Ljava/lang/Object;)I", "l", "()Ljava/lang/Object;", "k", "()Lkotlinx/coroutines/internal/b0;", "R", "Lkotlin/Function1;", "transform", "", "i", "(Lq3/l;)Ljava/util/List;", "g", "I", "capacity", "Z", "singleConsumer", "mask", "h", "isEmpty", "f", "()I", "size", "<init>", "(IZ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class b0<E> {

    /* renamed from: h, reason: collision with root package name */
    public static final int f28668h = 8;

    /* renamed from: i, reason: collision with root package name */
    public static final int f28669i = 30;

    /* renamed from: j, reason: collision with root package name */
    public static final int f28670j = 1073741823;

    /* renamed from: k, reason: collision with root package name */
    public static final int f28671k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final long f28672l = 1073741823;

    /* renamed from: m, reason: collision with root package name */
    public static final int f28673m = 30;

    /* renamed from: n, reason: collision with root package name */
    public static final long f28674n = 1152921503533105152L;

    /* renamed from: o, reason: collision with root package name */
    public static final int f28675o = 60;

    /* renamed from: p, reason: collision with root package name */
    public static final long f28676p = 1152921504606846976L;

    /* renamed from: q, reason: collision with root package name */
    public static final int f28677q = 61;

    /* renamed from: r, reason: collision with root package name */
    public static final long f28678r = 2305843009213693952L;

    /* renamed from: s, reason: collision with root package name */
    public static final int f28679s = 1024;

    /* renamed from: u, reason: collision with root package name */
    public static final int f28681u = 0;

    /* renamed from: v, reason: collision with root package name */
    public static final int f28682v = 1;

    /* renamed from: w, reason: collision with root package name */
    public static final int f28683w = 2;

    @d5.d
    private volatile /* synthetic */ Object _next = null;

    @d5.d
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean singleConsumer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int mask;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private /* synthetic */ AtomicReferenceArray f28687d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.d
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: t, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final r0 f28680t = new r0(ProtectedSandApp.s("巉"));

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28666f = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, ProtectedSandApp.s("巊"));

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f28667g = AtomicLongFieldUpdater.newUpdater(b0.class, ProtectedSandApp.s("巋"));

    /* compiled from: LockFreeTaskQueue.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0004J\u0012\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0012\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005JR\u0010\u0011\u001a\u00028\u0001\"\u0004\b\u0001\u0010\n*\u00020\u000226\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00028\u00010\u000bH\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012J\n\u0010\u0013\u001a\u00020\u0005*\u00020\u0002R\u0014\u0010\u0014\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015R\u0014\u0010 \u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0014\u0010!\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0015R\u0014\u0010\"\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0014\u0010$\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u0014\u0010'\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0015¨\u0006*"}, d2 = {"Lkotlinx/coroutines/internal/b0$a;", "", "", "other", "e", "", "newHead", "b", "newTail", "c", "T", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "head", "tail", "block", "d", "(JLq3/p;)Ljava/lang/Object;", "a", "ADD_CLOSED", "I", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", "J", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "Lkotlinx/coroutines/internal/r0;", "REMOVE_FROZEN", "Lkotlinx/coroutines/internal/r0;", "TAIL_MASK", "TAIL_SHIFT", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.internal.b0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final int a(long j5) {
            return (j5 & b0.f28678r) != 0 ? 2 : 1;
        }

        public final long b(long j5, int i5) {
            return (j5 & (-1073741824)) | (i5 << 0);
        }

        public final long c(long j5, int i5) {
            return (j5 & (-1152921503533105153L)) | (i5 << 30);
        }

        public final <T> T d(long j5, @d5.d q3.p<? super Integer, ? super Integer, ? extends T> pVar) {
            return pVar.g0(Integer.valueOf((int) ((b0.f28672l & j5) >> 0)), Integer.valueOf((int) ((j5 & b0.f28674n) >> 30)));
        }

        public final long e(long j5, long j6) {
            return j5 & (~j6);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: LockFreeTaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/internal/b0$b;", "", "", "a", "I", "index", "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @p3.f
        public final int index;

        public b(int i5) {
            this.index = i5;
        }
    }

    public b0(int i5, boolean z5) {
        this.capacity = i5;
        this.singleConsumer = z5;
        int i6 = i5 - 1;
        this.mask = i6;
        this.f28687d = new AtomicReferenceArray(i5);
        boolean z6 = i6 <= 1073741823;
        String s5 = ProtectedSandApp.s("巌");
        if (!z6) {
            throw new IllegalStateException(s5.toString());
        }
        if (!((i5 & i6) == 0)) {
            throw new IllegalStateException(s5.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final b0<E> b(long state) {
        b0<E> b0Var = new b0<>(this.capacity * 2, this.singleConsumer);
        int i5 = (int) ((f28672l & state) >> 0);
        int i6 = (int) ((f28674n & state) >> 30);
        while (true) {
            int i7 = this.mask;
            if ((i5 & i7) == (i6 & i7)) {
                INSTANCE.getClass();
                b0Var._state = state & (-1152921504606846977L);
                return b0Var;
            }
            Object obj = this.f28687d.get(i7 & i5);
            if (obj == null) {
                obj = new b(i5);
            }
            b0Var.f28687d.set(b0Var.mask & i5, obj);
            i5++;
        }
    }

    private final b0<E> c(long state) {
        while (true) {
            b0<E> b0Var = (b0) this._next;
            if (b0Var != null) {
                return b0Var;
            }
            androidx.concurrent.futures.d.a(f28666f, this, null, b(state));
        }
    }

    private final b0<E> e(int index, E element) {
        Object obj = this.f28687d.get(this.mask & index);
        if (!(obj instanceof b) || ((b) obj).index != index) {
            return null;
        }
        this.f28687d.set(index & this.mask, element);
        return this;
    }

    private final long j() {
        long j5;
        long j6;
        do {
            j5 = this._state;
            if ((j5 & 1152921504606846976L) != 0) {
                return j5;
            }
            j6 = j5 | 1152921504606846976L;
        } while (!f28667g.compareAndSet(this, j5, j6));
        return j6;
    }

    private final b0<E> m(int oldHead, int newHead) {
        long j5;
        int i5;
        do {
            j5 = this._state;
            i5 = (int) ((f28672l & j5) >> 0);
            if ((1152921504606846976L & j5) != 0) {
                return k();
            }
        } while (!f28667g.compareAndSet(this, j5, INSTANCE.b(j5, newHead)));
        this.f28687d.set(i5 & this.mask, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(@d5.d E r13) {
        /*
            r12 = this;
        L0:
            long r2 = r12._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L12
            kotlinx.coroutines.internal.b0$a r13 = kotlinx.coroutines.internal.b0.INSTANCE
            int r13 = r13.a(r2)
            return r13
        L12:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            r8 = 0
            long r0 = r0 >> r8
            int r0 = (int) r0
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r1 = 30
            long r4 = r4 >> r1
            int r9 = (int) r4
            int r10 = r12.mask
            int r1 = r9 + 2
            r1 = r1 & r10
            r4 = r0 & r10
            r5 = 1
            if (r1 != r4) goto L2e
            return r5
        L2e:
            boolean r1 = r12.singleConsumer
            r4 = 1073741823(0x3fffffff, float:1.9999999)
            if (r1 != 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r12.f28687d
            r11 = r9 & r10
            java.lang.Object r1 = r1.get(r11)
            if (r1 == 0) goto L4d
            int r1 = r12.capacity
            r2 = 1024(0x400, float:1.435E-42)
            if (r1 < r2) goto L4c
            int r9 = r9 - r0
            r0 = r9 & r4
            int r1 = r1 >> 1
            if (r0 <= r1) goto L0
        L4c:
            return r5
        L4d:
            int r0 = r9 + 1
            r0 = r0 & r4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.b0.f28667g
            kotlinx.coroutines.internal.b0$a r4 = kotlinx.coroutines.internal.b0.INSTANCE
            long r4 = r4.c(r2, r0)
            r0 = r1
            r1 = r12
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f28687d
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L68:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L7b
            kotlinx.coroutines.internal.b0 r0 = r0.k()
            kotlinx.coroutines.internal.b0 r0 = r0.e(r9, r13)
            if (r0 != 0) goto L68
        L7b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.b0.a(java.lang.Object):int");
    }

    public final boolean d() {
        long j5;
        do {
            j5 = this._state;
            if ((j5 & f28678r) != 0) {
                return true;
            }
            if ((1152921504606846976L & j5) != 0) {
                return false;
            }
        } while (!f28667g.compareAndSet(this, j5, j5 | f28678r));
        return true;
    }

    public final int f() {
        long j5 = this._state;
        return (((int) ((j5 & f28674n) >> 30)) - ((int) ((f28672l & j5) >> 0))) & f28670j;
    }

    public final boolean g() {
        return (this._state & f28678r) != 0;
    }

    public final boolean h() {
        long j5 = this._state;
        return ((int) ((f28672l & j5) >> 0)) == ((int) ((j5 & f28674n) >> 30));
    }

    @d5.d
    public final <R> List<R> i(@d5.d q3.l<? super E, ? extends R> transform) {
        ArrayList arrayList = new ArrayList(this.capacity);
        long j5 = this._state;
        int i5 = (int) ((f28672l & j5) >> 0);
        int i6 = (int) ((j5 & f28674n) >> 30);
        while (true) {
            int i7 = this.mask;
            if ((i5 & i7) == (i6 & i7)) {
                return arrayList;
            }
            c.C0000c c0000c = (Object) this.f28687d.get(i7 & i5);
            if (c0000c != null && !(c0000c instanceof b)) {
                arrayList.add(transform.N(c0000c));
            }
            i5++;
        }
    }

    @d5.d
    public final b0<E> k() {
        return c(j());
    }

    @d5.e
    public final Object l() {
        while (true) {
            long j5 = this._state;
            if ((1152921504606846976L & j5) != 0) {
                return f28680t;
            }
            int i5 = (int) ((f28672l & j5) >> 0);
            int i6 = (int) ((f28674n & j5) >> 30);
            int i7 = this.mask;
            if ((i6 & i7) == (i5 & i7)) {
                return null;
            }
            Object obj = this.f28687d.get(i7 & i5);
            if (obj == null) {
                if (this.singleConsumer) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i8 = (i5 + 1) & f28670j;
                if (f28667g.compareAndSet(this, j5, INSTANCE.b(j5, i8))) {
                    this.f28687d.set(this.mask & i5, null);
                    return obj;
                }
                if (this.singleConsumer) {
                    b0<E> b0Var = this;
                    do {
                        b0Var = b0Var.m(i5, i8);
                    } while (b0Var != null);
                    return obj;
                }
            }
        }
    }
}
