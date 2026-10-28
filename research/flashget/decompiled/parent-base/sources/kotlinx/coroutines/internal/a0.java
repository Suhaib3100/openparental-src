package kotlinx.coroutines.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LockFreeTaskQueue.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \f*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\u001b\u0018B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\f\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000b2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u000b2\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u000b2\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u001f\u0010 J-\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010$\"\u0004\b\u0001\u0010!2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0005¢\u0006\u0004\b'\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010)R\u0014\u0010*\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010(R\u0011\u0010,\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b+\u0010\u001aR\u0011\u0010/\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b-\u0010.R%\u00101\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000b008\u0002X\u0082\u0004R\u000b\u00103\u001a\u0002028\u0002X\u0082\u0004R\u0013\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001048\u0002X\u0082\u0004¨\u00066"}, d2 = {"Lkotlinx/coroutines/internal/a0;", "", "E", "", "capacity", "", "singleConsumer", "<init>", "(IZ)V", "index", "element", "Lkotlinx/coroutines/internal/Core;", "e", "(ILjava/lang/Object;)Lkotlinx/coroutines/internal/a0;", "oldHead", "newHead", "o", "(II)Lkotlinx/coroutines/internal/a0;", "", "l", "()J", "state", "c", "(J)Lkotlinx/coroutines/internal/a0;", "b", "d", "()Z", "a", "(Ljava/lang/Object;)I", "n", "()Ljava/lang/Object;", "m", "()Lkotlinx/coroutines/internal/a0;", "R", "Lkotlin/Function1;", "transform", "", "k", "(Lld/l;)Ljava/util/List;", "g", "I", "Z", "mask", "h", "isEmpty", "f", "()I", "size", "Lkotlinx/atomicfu/AtomicRef;", "_next", "Lkotlinx/atomicfu/AtomicLong;", "_state", "Lkotlinx/atomicfu/AtomicArray;", "array", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLockFreeTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n+ 2 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,308:1\n299#2,3:309\n299#2,3:312\n299#2,3:315\n299#2,3:318\n299#2,3:321\n299#2,3:325\n299#2,3:328\n1#3:324\n*S KotlinDebug\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n*L\n91#1:309,3\n92#1:312,3\n107#1:315,3\n167#1:318,3\n200#1:321,3\n231#1:325,3\n247#1:328,3\n*E\n"})
/* loaded from: classes7.dex */
public final class a0<E> {

    /* renamed from: h, reason: collision with root package name */
    public static final int f80728h = 8;

    /* renamed from: i, reason: collision with root package name */
    public static final int f80729i = 30;

    /* renamed from: j, reason: collision with root package name */
    public static final int f80730j = 1073741823;

    /* renamed from: k, reason: collision with root package name */
    public static final int f80731k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final long f80732l = 1073741823;

    /* renamed from: m, reason: collision with root package name */
    public static final int f80733m = 30;

    /* renamed from: n, reason: collision with root package name */
    public static final long f80734n = 1152921503533105152L;

    /* renamed from: o, reason: collision with root package name */
    public static final int f80735o = 60;

    /* renamed from: p, reason: collision with root package name */
    public static final long f80736p = 1152921504606846976L;

    /* renamed from: q, reason: collision with root package name */
    public static final int f80737q = 61;

    /* renamed from: r, reason: collision with root package name */
    public static final long f80738r = 2305843009213693952L;

    /* renamed from: s, reason: collision with root package name */
    public static final int f80739s = 1024;

    /* renamed from: u, reason: collision with root package name */
    public static final int f80741u = 0;

    /* renamed from: v, reason: collision with root package name */
    public static final int f80742v = 1;

    /* renamed from: w, reason: collision with root package name */
    public static final int f80743w = 2;

    @fg.m
    @kd.x
    private volatile Object _next;

    @kd.x
    private volatile long _state;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean singleConsumer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int mask;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final AtomicReferenceArray f80747d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final AtomicReferenceFieldUpdater f80726f = AtomicReferenceFieldUpdater.newUpdater(a0.class, Object.class, ProtectedSandApp.s("蟏\u0001"));

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final AtomicLongFieldUpdater f80727g = AtomicLongFieldUpdater.newUpdater(a0.class, ProtectedSandApp.s("蟐\u0001"));

    /* renamed from: t, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final s0 f80740t = new s0(ProtectedSandApp.s("蟑\u0001"));

    /* compiled from: LockFreeTaskQueue.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000bJR\u0010\u0015\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u000e*\u00020\u000426\u0010\u0014\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00028\u00010\u000fH\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\b*\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010\"\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0014\u0010$\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u0014\u0010%\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u0014\u0010&\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u0014\u0010'\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u001aR\u0014\u0010)\u001a\u00020(8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u001fR\u0014\u0010,\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u001a¨\u0006-"}, d2 = {"Lkotlinx/coroutines/internal/a0$a;", "", "<init>", "()V", "", "other", "e", "(JJ)J", "", "newHead", "b", "(JI)J", "newTail", "c", "T", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "head", "tail", "block", "d", "(JLld/p;)Ljava/lang/Object;", "a", "(J)I", "ADD_CLOSED", "I", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", "J", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "Lkotlinx/coroutines/internal/s0;", "REMOVE_FROZEN", "Lkotlinx/coroutines/internal/s0;", "TAIL_MASK", "TAIL_SHIFT", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.internal.a0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final int a(long j4) {
            return (j4 & a0.f80738r) != 0 ? 2 : 1;
        }

        public final long b(long j4, int i4) {
            return (j4 & (-1073741824)) | i4;
        }

        public final long c(long j4, int i4) {
            return (j4 & (-1152921503533105153L)) | (i4 << 30);
        }

        public final <T> T d(long j4, @fg.l ld.p<? super Integer, ? super Integer, ? extends T> pVar) {
            return pVar.invoke(Integer.valueOf((int) (a0.f80732l & j4)), Integer.valueOf((int) ((j4 & a0.f80734n) >> 30)));
        }

        public final long e(long j4, long j5) {
            return j4 & (~j5);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: LockFreeTaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/internal/a0$b;", "", "", "index", "<init>", "(I)V", "a", "I", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public final int index;

        public b(int i4) {
            this.index = i4;
        }
    }

    public a0(int i4, boolean z4) {
        this.capacity = i4;
        this.singleConsumer = z4;
        int i5 = i4 - 1;
        this.mask = i5;
        this.f80747d = new AtomicReferenceArray(i4);
        String s4 = ProtectedSandApp.s("蟒\u0001");
        if (i5 > 1073741823) {
            throw new IllegalStateException(s4);
        }
        if ((i4 & i5) != 0) {
            throw new IllegalStateException(s4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final a0<E> b(long state) {
        a0<E> a0Var = new a0<>(this.capacity * 2, this.singleConsumer);
        int i4 = (int) (f80732l & state);
        int i5 = (int) ((f80734n & state) >> 30);
        while (true) {
            int i6 = this.mask;
            if ((i4 & i6) == (i5 & i6)) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = f80727g;
                INSTANCE.getClass();
                atomicLongFieldUpdater.set(a0Var, state & (-1152921504606846977L));
                return a0Var;
            }
            Object obj = this.f80747d.get(i6 & i4);
            if (obj == null) {
                obj = new b(i4);
            }
            a0Var.f80747d.set(a0Var.mask & i4, obj);
            i4++;
        }
    }

    private final a0<E> c(long state) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80726f;
        while (true) {
            a0<E> a0Var = (a0) atomicReferenceFieldUpdater.get(this);
            if (a0Var != null) {
                return a0Var;
            }
            androidx.concurrent.futures.c.a(f80726f, this, null, b(state));
        }
    }

    private final a0<E> e(int index, E element) {
        Object obj = this.f80747d.get(this.mask & index);
        if (!(obj instanceof b) || ((b) obj).index != index) {
            return null;
        }
        this.f80747d.set(index & this.mask, element);
        return this;
    }

    private final void i(AtomicLongFieldUpdater atomicLongFieldUpdater, ld.l<? super Long, k2> lVar, Object obj) {
        while (true) {
            lVar.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    private final void j(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ld.l<Object, k2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final long l() {
        long j4;
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f80727g;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & 1152921504606846976L) != 0) {
                return j4;
            }
            j5 = j4 | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, j5));
        return j5;
    }

    private final a0<E> o(int oldHead, int newHead) {
        long j4;
        int i4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f80727g;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            i4 = (int) (f80732l & j4);
            if ((1152921504606846976L & j4) != 0) {
                return m();
            }
        } while (!f80727g.compareAndSet(this, j4, INSTANCE.b(j4, newHead)));
        this.f80747d.set(this.mask & i4, null);
        return null;
    }

    private final void p(AtomicLongFieldUpdater atomicLongFieldUpdater, ld.l<? super Long, Long> lVar, Object obj) {
        long j4;
        do {
            j4 = atomicLongFieldUpdater.get(obj);
        } while (!atomicLongFieldUpdater.compareAndSet(obj, j4, lVar.invoke(Long.valueOf(j4)).longValue()));
    }

    private final long q(AtomicLongFieldUpdater atomicLongFieldUpdater, ld.l<? super Long, Long> lVar, Object obj) {
        long j4;
        Long invoke;
        do {
            j4 = atomicLongFieldUpdater.get(obj);
            invoke = lVar.invoke(Long.valueOf(j4));
        } while (!atomicLongFieldUpdater.compareAndSet(obj, j4, invoke.longValue()));
        return invoke.longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004e, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(@fg.l E r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.internal.a0.f80727g
        L2:
            long r3 = r0.get(r12)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L16
            kotlinx.coroutines.internal.a0$a r13 = kotlinx.coroutines.internal.a0.INSTANCE
            int r13 = r13.a(r3)
            return r13
        L16:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r9 = (int) r5
            int r10 = r12.mask
            int r2 = r9 + 2
            r2 = r2 & r10
            r5 = r1 & r10
            r6 = 1
            if (r2 != r5) goto L30
            return r6
        L30:
            boolean r2 = r12.singleConsumer
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.f80747d
            r11 = r9 & r10
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L4f
            int r2 = r12.capacity
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L4e
            int r9 = r9 - r1
            r1 = r9 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L2
        L4e:
            return r6
        L4f:
            int r1 = r9 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.internal.a0.f80727g
            kotlinx.coroutines.internal.a0$a r5 = kotlinx.coroutines.internal.a0.INSTANCE
            long r5 = r5.c(r3, r1)
            r1 = r2
            r2 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L2
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f80747d
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L6a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.a0.f80727g
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L81
            kotlinx.coroutines.internal.a0 r0 = r0.m()
            kotlinx.coroutines.internal.a0 r0 = r0.e(r9, r13)
            if (r0 != 0) goto L6a
        L81:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.a0.a(java.lang.Object):int");
    }

    public final boolean d() {
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f80727g;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & f80738r) != 0) {
                return true;
            }
            if ((1152921504606846976L & j4) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, j4 | f80738r));
        return true;
    }

    public final int f() {
        long j4 = f80727g.get(this);
        return (((int) ((j4 & f80734n) >> 30)) - ((int) (f80732l & j4))) & f80730j;
    }

    public final boolean g() {
        return (f80727g.get(this) & f80738r) != 0;
    }

    public final boolean h() {
        long j4 = f80727g.get(this);
        return ((int) (f80732l & j4)) == ((int) ((j4 & f80734n) >> 30));
    }

    @fg.l
    public final <R> List<R> k(@fg.l ld.l<? super E, ? extends R> transform) {
        ArrayList arrayList = new ArrayList(this.capacity);
        long j4 = f80727g.get(this);
        int i4 = (int) (f80732l & j4);
        int i5 = (int) ((j4 & f80734n) >> 30);
        while (true) {
            int i6 = this.mask;
            if ((i4 & i6) == (i5 & i6)) {
                return arrayList;
            }
            a0.b0 b0Var = (Object) this.f80747d.get(i6 & i4);
            if (b0Var != null && !(b0Var instanceof b)) {
                arrayList.add(transform.invoke(b0Var));
            }
            i4++;
        }
    }

    @fg.l
    public final a0<E> m() {
        return c(l());
    }

    @fg.m
    public final Object n() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f80727g;
        while (true) {
            long j4 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j4) != 0) {
                return f80740t;
            }
            int i4 = (int) (f80732l & j4);
            int i5 = (int) ((f80734n & j4) >> 30);
            int i6 = this.mask;
            if ((i5 & i6) == (i4 & i6)) {
                return null;
            }
            Object obj = this.f80747d.get(i6 & i4);
            if (obj == null) {
                if (this.singleConsumer) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i7 = (i4 + 1) & f80730j;
                if (f80727g.compareAndSet(this, j4, INSTANCE.b(j4, i7))) {
                    this.f80747d.set(this.mask & i4, null);
                    return obj;
                }
                if (this.singleConsumer) {
                    a0<E> a0Var = this;
                    do {
                        a0Var = a0Var.o(i4, i7);
                    } while (a0Var != null);
                    return obj;
                }
            }
        }
    }
}
