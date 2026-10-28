package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.k1;
import kotlin.z0;

/* compiled from: BroadcastFrameClock.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001,B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u00032\f\b\u0002\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010%\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"0!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R \u0010'\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"0!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R\u0011\u0010+\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Landroidx/compose/runtime/h;", "Landroidx/compose/runtime/a2;", "Lkotlin/Function0;", "Lkotlin/k2;", "onNewAwaiters", "<init>", "(Lld/a;)V", "", "cause", "w", "(Ljava/lang/Throwable;)V", "", "timeNanos", "A", "(J)V", "R", "Lkotlin/Function1;", "onFrame", "u", "(Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancellationException", "b", "(Ljava/util/concurrent/CancellationException;)V", "Lld/a;", "", "c", "Ljava/lang/Object;", "lock", "d", "Ljava/lang/Throwable;", "failureCause", "", "Landroidx/compose/runtime/h$a;", "e", "Ljava/util/List;", "awaiters", "f", "spareList", "", "y", "()Z", "hasAwaiters", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,132:1\n82#2:133\n82#2:134\n82#2:144\n82#2:147\n314#3,9:135\n323#3,2:145\n33#4,6:148\n*S KotlinDebug\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n*L\n54#1:133\n62#1:134\n81#1:144\n112#1:147\n79#1:135,9\n79#1:145,2\n115#1:148,6\n*E\n"})
/* loaded from: classes.dex */
public final class h implements a2 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f16434g = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.a<kotlin.k2> onNewAwaiters;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object lock;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Throwable failureCause;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private List<a<?>> awaiters;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private List<a<?>> spareList;

    /* compiled from: BroadcastFrameClock.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/h$a;", "R", "", "Lkotlin/Function1;", "", "onFrame", "Lkotlin/coroutines/d;", "continuation", "<init>", "(Lld/l;Lkotlin/coroutines/d;)V", "timeNanos", "Lkotlin/k2;", "c", "(J)V", "a", "Lld/l;", "b", "()Lld/l;", "Lkotlin/coroutines/d;", "()Lkotlin/coroutines/d;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1#2:133\n*E\n"})
    private static final class a<R> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final ld.l<Long, R> onFrame;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final kotlin.coroutines.d<R> continuation;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@fg.l ld.l<? super Long, ? extends R> lVar, @fg.l kotlin.coroutines.d<? super R> dVar) {
            this.onFrame = lVar;
            this.continuation = dVar;
        }

        @fg.l
        public final kotlin.coroutines.d<R> a() {
            return this.continuation;
        }

        @fg.l
        public final ld.l<Long, R> b() {
            return this.onFrame;
        }

        public final void c(long timeNanos) {
            Object a5;
            kotlin.coroutines.d<R> dVar = this.continuation;
            try {
                z0.Companion companion = kotlin.z0.INSTANCE;
                a5 = this.onFrame.invoke(Long.valueOf(timeNanos));
            } catch (Throwable th) {
                z0.Companion companion2 = kotlin.z0.INSTANCE;
                a5 = kotlin.a1.a(th);
            }
            dVar.resumeWith(a5);
        }
    }

    /* compiled from: BroadcastFrameClock.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$withFrameNanos$2$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,132:1\n82#2:133\n*S KotlinDebug\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$withFrameNanos$2$1\n*L\n94#1:133\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<Throwable, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k1.h<a<R>> f16443c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k1.h<a<R>> hVar) {
            super(1);
            this.f16443c = hVar;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Throwable th) {
            invoke2(th);
            return kotlin.k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.m Throwable th) {
            a aVar;
            Object obj = h.this.lock;
            h hVar = h.this;
            k1.h<a<R>> hVar2 = this.f16443c;
            synchronized (obj) {
                try {
                    List list = hVar.awaiters;
                    Object obj2 = hVar2.f75329b;
                    if (obj2 == null) {
                        kotlin.jvm.internal.l0.S("awaiter");
                        aVar = null;
                    } else {
                        aVar = (a) obj2;
                    }
                    list.remove(aVar);
                    kotlin.k2 k2Var = kotlin.k2.f75408a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static void v(h hVar, CancellationException cancellationException, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            cancellationException = new CancellationException("clock cancelled");
        }
        hVar.w(cancellationException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(Throwable cause) {
        synchronized (this.lock) {
            try {
                if (this.failureCause != null) {
                    return;
                }
                this.failureCause = cause;
                List<a<?>> list = this.awaiters;
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    kotlin.coroutines.d<?> a5 = list.get(i4).a();
                    z0.Companion companion = kotlin.z0.INSTANCE;
                    a5.resumeWith(kotlin.a1.a(cause));
                }
                this.awaiters.clear();
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void A(long timeNanos) {
        synchronized (this.lock) {
            try {
                List<a<?>> list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    list.get(i4).c(timeNanos);
                }
                list.clear();
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlin.coroutines.g
    @fg.l
    public kotlin.coroutines.g O(@fg.l kotlin.coroutines.g gVar) {
        return g.b.a.d(this, gVar);
    }

    public final void b(@fg.l CancellationException cancellationException) {
        w(cancellationException);
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @fg.m
    public <E extends g.b> E c(@fg.l g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @fg.l
    public kotlin.coroutines.g d(@fg.l g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    public <R> R g(R r4, @fg.l ld.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r4, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, androidx.compose.runtime.h$a] */
    @Override // androidx.compose.runtime.a2
    @fg.m
    public <R> Object u(@fg.l ld.l<? super Long, ? extends R> lVar, @fg.l kotlin.coroutines.d<? super R> dVar) {
        a<?> aVar;
        ld.a<kotlin.k2> aVar2;
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        k1.h hVar = new k1.h();
        synchronized (this.lock) {
            Throwable th = this.failureCause;
            if (th != null) {
                z0.Companion companion = kotlin.z0.INSTANCE;
                qVar.resumeWith(kotlin.a1.a(th));
            } else {
                hVar.f75329b = new a(lVar, qVar);
                boolean isEmpty = this.awaiters.isEmpty();
                List<a<?>> list = this.awaiters;
                T t4 = hVar.f75329b;
                if (t4 == 0) {
                    kotlin.jvm.internal.l0.S("awaiter");
                    aVar = null;
                } else {
                    aVar = (a) t4;
                }
                list.add(aVar);
                qVar.k0(new b(hVar));
                if (isEmpty && (aVar2 = this.onNewAwaiters) != null) {
                    try {
                        aVar2.invoke();
                    } catch (Throwable th2) {
                        w(th2);
                    }
                }
            }
        }
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }

    public final boolean y() {
        boolean z4;
        synchronized (this.lock) {
            z4 = !this.awaiters.isEmpty();
        }
        return z4;
    }

    public h(@fg.m ld.a<kotlin.k2> aVar) {
        this.onNewAwaiters = aVar;
        this.lock = new Object();
        this.awaiters = new ArrayList();
        this.spareList = new ArrayList();
    }

    public /* synthetic */ h(ld.a aVar, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? null : aVar);
    }
}
