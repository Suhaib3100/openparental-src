package kotlinx.coroutines.channels;

import androidx.collection.r2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.channels.p;
import kotlinx.coroutines.internal.s0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.t0;

/* compiled from: BroadcastChannel.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002CDB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u000f\u001a\u00028\u0000H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\u00020\n2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0010¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0018\u0010+\u001a\u00060'j\u0002`(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00102\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R<\u00107\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u001703j\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0017`48\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0017\u0010<\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b:\u0010;\u001a\u0004\b8\u00109R\u0019\u0010?\u001a\u0004\u0018\u00018\u00008F¢\u0006\f\u0012\u0004\b>\u0010;\u001a\u0004\b=\u00109R\u0014\u0010B\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006E"}, d2 = {"Lkotlinx/coroutines/channels/e;", "E", "Lkotlinx/coroutines/channels/j;", "Lkotlinx/coroutines/channels/d;", "", "capacity", "<init>", "(I)V", "Lkotlinx/coroutines/channels/d0;", "s", "Lkotlin/k2;", "R1", "(Lkotlinx/coroutines/channels/d0;)V", "w", "()Lkotlinx/coroutines/channels/d0;", "element", "f0", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/p;", "M", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/m;", "select", "", "i1", "(Lkotlinx/coroutines/selects/m;Ljava/lang/Object;)V", "", "cause", "", "b0", "(Ljava/lang/Throwable;)Z", "G", "", "toString", "()Ljava/lang/String;", "n", "I", "M1", "()I", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "o", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "", "p", "Ljava/util/List;", "subscribers", "q", "Ljava/lang/Object;", "lastConflatedElement", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "r", "Ljava/util/HashMap;", "onSendInternalResult", "N1", "()Ljava/lang/Object;", "O1", "()V", "value", "P1", "Q1", "valueOrNull", "g0", "()Z", "isClosedForSend", "a", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,414:1\n15#2:415\n15#2:416\n15#2:420\n15#2:423\n15#2:429\n15#2:430\n15#2:436\n15#2:439\n15#2:440\n15#2:441\n766#3:417\n857#3,2:418\n1855#3,2:421\n1747#3,3:424\n1855#3,2:427\n1855#3,2:431\n766#3:433\n857#3,2:434\n1855#3,2:437\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl\n*L\n166#1:415\n188#1:416\n213#1:420\n237#1:423\n279#1:429\n331#1:430\n343#1:436\n355#1:439\n382#1:440\n394#1:441\n189#1:417\n189#1:418,2\n226#1:421,2\n242#1:424,3\n251#1:427,2\n333#1:431,2\n338#1:433\n338#1:434,2\n346#1:437,2\n*E\n"})
/* loaded from: classes7.dex */
public final class e<E> extends j<E> implements kotlinx.coroutines.channels.d<E> {

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ReentrantLock lock;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private List<? extends j<E>> subscribers;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Object lastConflatedElement;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final HashMap<kotlinx.coroutines.selects.m<?>, Object> onSendInternalResult;

    /* compiled from: BroadcastChannel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/channels/e$a;", "Lkotlinx/coroutines/channels/j;", "<init>", "(Lkotlinx/coroutines/channels/e;)V", "", "cause", "", "J1", "(Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n*L\n1#1,414:1\n15#2:415\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered\n*L\n362#1:415\n*E\n"})
    private final class a extends j<E> {
        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            super(e.this.getCapacity(), null, 2, 0 == true ? 1 : 0);
        }

        @Override // kotlinx.coroutines.channels.j
        /* renamed from: J1, reason: merged with bridge method [inline-methods] */
        public boolean G(@fg.m Throwable cause) {
            ReentrantLock reentrantLock = ((e) e.this).lock;
            e<E> eVar = e.this;
            reentrantLock.lock();
            try {
                eVar.R1(this);
                return super.G(cause);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* compiled from: BroadcastChannel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/channels/e$b;", "Lkotlinx/coroutines/channels/w;", "<init>", "(Lkotlinx/coroutines/channels/e;)V", "", "cause", "", "O1", "(Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class b extends w<E> {
        public b() {
            super(1, i.DROP_OLDEST, null, 4, null);
        }

        @Override // kotlinx.coroutines.channels.j
        /* renamed from: O1, reason: merged with bridge method [inline-methods] */
        public boolean G(@fg.m Throwable cause) {
            e.this.R1(this);
            return super.G(cause);
        }
    }

    /* compiled from: BroadcastChannel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2", f = "BroadcastChannel.kt", i = {}, l = {291}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$registerSelectForSend$2\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,414:1\n15#2:415\n1#3:416\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$registerSelectForSend$2\n*L\n304#1:415\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f79290b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e<E> f79291c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f79292d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.selects.m<?> f79293e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e<E> eVar, Object obj, kotlinx.coroutines.selects.m<?> mVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f79291c = eVar;
            this.f79292d = obj;
            this.f79293e = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new c(this.f79291c, this.f79292d, this.f79293e, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f79290b;
            boolean z4 = true;
            try {
                if (i4 == 0) {
                    a1.n(obj);
                    e<E> eVar = this.f79291c;
                    Object obj2 = this.f79292d;
                    this.f79290b = 1;
                    if (eVar.f0(obj2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("蘎\u0001"));
                    }
                    a1.n(obj);
                }
            } catch (Throwable th) {
                if (!this.f79291c.g0() || (!(th instanceof ClosedSendChannelException) && this.f79291c.p0() != th)) {
                    throw th;
                }
                z4 = false;
            }
            ReentrantLock reentrantLock = ((e) this.f79291c).lock;
            e<E> eVar2 = this.f79291c;
            kotlinx.coroutines.selects.m<?> mVar = this.f79293e;
            reentrantLock.lock();
            try {
                ((e) eVar2).onSendInternalResult.put(mVar, z4 ? k2.f75408a : k.z());
                l0.n(mVar, ProtectedSandApp.s("蘏\u0001"));
                k2 k2Var = k2.f75408a;
                if (((kotlinx.coroutines.selects.l) mVar).o0(eVar2, k2Var) != kotlinx.coroutines.selects.r.REREGISTER) {
                    ((e) eVar2).onSendInternalResult.remove(mVar);
                }
                reentrantLock.unlock();
                return k2Var;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((c) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: BroadcastChannel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.BroadcastChannelImpl", f = "BroadcastChannel.kt", i = {0, 0}, l = {230}, m = "send", n = {"this", "element"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79294b;

        /* renamed from: c, reason: collision with root package name */
        Object f79295c;

        /* renamed from: d, reason: collision with root package name */
        Object f79296d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f79297e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e<E> f79298f;

        /* renamed from: g, reason: collision with root package name */
        int f79299g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(e<E> eVar, kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
            this.f79298f = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79297e = obj;
            this.f79299g |= Integer.MIN_VALUE;
            return this.f79298f.f0(null, this);
        }
    }

    public e(int i4) {
        super(0, null);
        s0 s0Var;
        this.capacity = i4;
        if (i4 < 1 && i4 != -1) {
            throw new IllegalArgumentException(r2.a(ProtectedSandApp.s("蘑\u0001"), i4, ProtectedSandApp.s("蘒\u0001")).toString());
        }
        this.lock = new ReentrantLock();
        this.subscribers = j0.f74919b;
        s0Var = f.f79300a;
        this.lastConflatedElement = s0Var;
        this.onSendInternalResult = new HashMap<>();
    }

    public static /* synthetic */ void O1() {
    }

    public static /* synthetic */ void Q1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void R1(d0<? extends E> s4) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            List<? extends j<E>> list = this.subscribers;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((j) obj) != s4) {
                    arrayList.add(obj);
                }
            }
            this.subscribers = arrayList;
            k2 k2Var = k2.f75408a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.j
    public boolean G(@fg.m Throwable cause) {
        s0 s0Var;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.subscribers.iterator();
            while (it.hasNext()) {
                ((j) it.next()).G(cause);
            }
            s0Var = f.f79300a;
            this.lastConflatedElement = s0Var;
            boolean G = super.G(cause);
            reentrantLock.unlock();
            return G;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.j, kotlinx.coroutines.channels.e0
    @fg.l
    public Object M(E element) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (g0()) {
                return super.M(element);
            }
            List<? extends j<E>> list = this.subscribers;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).v1()) {
                        p.INSTANCE.getClass();
                        return p.f79411c;
                    }
                }
            }
            if (this.capacity == -1) {
                this.lastConflatedElement = element;
            }
            Iterator<T> it2 = this.subscribers.iterator();
            while (it2.hasNext()) {
                ((j) it2.next()).M(element);
            }
            p.Companion companion = p.INSTANCE;
            k2 k2Var = k2.f75408a;
            companion.getClass();
            return p.c(k2Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: M1, reason: from getter */
    public final int getCapacity() {
        return this.capacity;
    }

    public final E N1() {
        s0 s0Var;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (g0()) {
                Throwable h02 = h0();
                if (h02 == null) {
                    throw new IllegalStateException(ProtectedSandApp.s("蘓\u0001"));
                }
                throw h02;
            }
            Object obj = this.lastConflatedElement;
            s0Var = f.f79300a;
            if (obj == s0Var) {
                throw new IllegalStateException(ProtectedSandApp.s("蘔\u0001"));
            }
            E e4 = (E) this.lastConflatedElement;
            reentrantLock.unlock();
            return e4;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @fg.m
    public final E P1() {
        s0 s0Var;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            E e4 = null;
            if (!j()) {
                Object obj = this.lastConflatedElement;
                s0Var = f.f79300a;
                if (obj != s0Var) {
                    e4 = (E) this.lastConflatedElement;
                }
            }
            return e4;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.j, kotlinx.coroutines.channels.e0
    public boolean b0(@fg.m Throwable cause) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.subscribers.iterator();
            while (it.hasNext()) {
                ((j) it.next()).b0(cause);
            }
            List<? extends j<E>> list = this.subscribers;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((j) obj).r0()) {
                    arrayList.add(obj);
                }
            }
            this.subscribers = arrayList;
            boolean K = K(cause, false);
            reentrantLock.unlock();
            return K;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007f -> B:10:0x0082). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.channels.j, kotlinx.coroutines.channels.e0
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f0(E r7, @fg.l kotlin.coroutines.d<? super kotlin.k2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.e.d
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.e$d r0 = (kotlinx.coroutines.channels.e.d) r0
            int r1 = r0.f79299g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79299g = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.e$d r0 = new kotlinx.coroutines.channels.e$d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f79297e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79299g
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.f79296d
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r2 = r0.f79295c
            java.lang.Object r4 = r0.f79294b
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.e) r4
            kotlin.a1.n(r8)
            goto L82
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "蘕\u0001"
            java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
            r7.<init>(r8)
            throw r7
        L3d:
            kotlin.a1.n(r8)
            java.util.concurrent.locks.ReentrantLock r8 = r6.lock
            r8.lock()
            boolean r2 = r6.g0()     // Catch: java.lang.Throwable -> L53
            if (r2 != 0) goto L9b
            int r2 = r6.capacity     // Catch: java.lang.Throwable -> L53
            r4 = -1
            if (r2 != r4) goto L55
            r6.lastConflatedElement = r7     // Catch: java.lang.Throwable -> L53
            goto L55
        L53:
            r7 = move-exception
            goto La0
        L55:
            java.util.List<? extends kotlinx.coroutines.channels.j<E>> r2 = r6.subscribers     // Catch: java.lang.Throwable -> L53
            r8.unlock()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r8 = r2.iterator()
            r4 = r6
            r5 = r8
            r8 = r7
            r7 = r5
        L64:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L98
            java.lang.Object r2 = r7.next()
            kotlinx.coroutines.channels.j r2 = (kotlinx.coroutines.channels.j) r2
            r0.f79294b = r4
            r0.f79295c = r8
            r0.f79296d = r7
            r0.f79299g = r3
            java.lang.Object r2 = r2.o1(r8, r0)
            if (r2 != r1) goto L7f
            return r1
        L7f:
            r5 = r2
            r2 = r8
            r8 = r5
        L82:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L96
            boolean r8 = r4.g0()
            if (r8 != 0) goto L91
            goto L96
        L91:
            java.lang.Throwable r7 = r4.p0()
            throw r7
        L96:
            r8 = r2
            goto L64
        L98:
            kotlin.k2 r7 = kotlin.k2.f75408a
            return r7
        L9b:
            java.lang.Throwable r7 = r6.p0()     // Catch: java.lang.Throwable -> L53
            throw r7     // Catch: java.lang.Throwable -> L53
        La0:
            r8.unlock()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.e.f0(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.j, kotlinx.coroutines.channels.e0
    public boolean g0() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return super.g0();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.j
    protected void i1(@fg.l kotlinx.coroutines.selects.m<?> select, @fg.m Object element) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Object remove = this.onSendInternalResult.remove(select);
            if (remove != null) {
                select.d(remove);
                return;
            }
            k2 k2Var = k2.f75408a;
            reentrantLock.unlock();
            kotlinx.coroutines.k.f(kotlinx.coroutines.s0.a(select.getContext()), null, t0.UNDISPATCHED, new c(this, element, select, null), 1, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.j
    @fg.l
    public String toString() {
        s0 s0Var;
        StringBuilder sb = new StringBuilder();
        Object obj = this.lastConflatedElement;
        s0Var = f.f79300a;
        sb.append(obj != s0Var ? androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.i.a(new StringBuilder(ProtectedSandApp.s("蘖\u0001")), this.lastConflatedElement, ProtectedSandApp.s("蘗\u0001")) : "");
        sb.append(ProtectedSandApp.s("蘘\u0001"));
        sb.append(super.toString());
        sb.append(ProtectedSandApp.s("蘙\u0001"));
        sb.append(kotlin.collections.w.m3(this.subscribers, ProtectedSandApp.s("蘚\u0001"), ProtectedSandApp.s("蘛\u0001"), ProtectedSandApp.s("蘜\u0001"), 0, null, null, 56, null));
        return sb.toString();
    }

    @Override // kotlinx.coroutines.channels.d
    @fg.l
    public d0<E> w() {
        s0 s0Var;
        s0 s0Var2;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            a bVar = this.capacity == -1 ? new b() : new a();
            if (g0()) {
                Object obj = this.lastConflatedElement;
                s0Var2 = f.f79300a;
                if (obj == s0Var2) {
                    ((j) bVar).b0(h0());
                    reentrantLock.unlock();
                    return bVar;
                }
            }
            Object obj2 = this.lastConflatedElement;
            s0Var = f.f79300a;
            if (obj2 != s0Var) {
                ((j) bVar).M(N1());
            }
            this.subscribers = kotlin.collections.w.E4(this.subscribers, bVar);
            reentrantLock.unlock();
            return bVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
