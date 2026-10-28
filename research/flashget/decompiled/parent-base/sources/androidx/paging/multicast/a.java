package androidx.paging.multicast;

import fg.l;
import fg.m;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k2;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.channels.e0;
import kotlinx.coroutines.flow.a0;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.t;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.y;
import ld.p;
import ld.q;

/* compiled from: StoreRealActor.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000 \b*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u000fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001b\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Landroidx/paging/multicast/a;", "T", "", "Lkotlinx/coroutines/r0;", "scope", "<init>", "(Lkotlinx/coroutines/r0;)V", "Lkotlin/k2;", "d", "()V", "f", "msg", "e", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "g", "c", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/l;", "a", "Lkotlinx/coroutines/channels/l;", "inboundChannel", "Lkotlinx/coroutines/y;", "b", "Lkotlinx/coroutines/y;", "closeCompleted", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "didClose", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class a<T> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: e, reason: collision with root package name */
    @l
    private static final Object f32014e = new Object();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final kotlinx.coroutines.channels.l<Object> inboundChannel;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final y<k2> closeCompleted;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final AtomicBoolean didClose;

    /* compiled from: StoreRealActor.kt */
    @f(c = "androidx.paging.multicast.StoreRealActor$1", f = "StoreRealActor.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "msg", "Lkotlin/k2;", "<anonymous>", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 5, 1})
    /* renamed from: androidx.paging.multicast.a$a, reason: collision with other inner class name */
    static final class C0554a extends o implements p<Object, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f32018b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f32019c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a<T> f32020d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0554a(a<T> aVar, kotlin.coroutines.d<? super C0554a> dVar) {
            super(2, dVar);
            this.f32020d = aVar;
        }

        @Override // ld.p
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@m Object obj, @m kotlin.coroutines.d<? super k2> dVar) {
            return ((C0554a) create(obj, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            C0554a c0554a = new C0554a(this.f32020d, dVar);
            c0554a.f32019c = obj;
            return c0554a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f32018b;
            if (i4 == 0) {
                a1.n(obj);
                Object obj2 = this.f32019c;
                a.INSTANCE.getClass();
                if (obj2 == a.f32014e) {
                    this.f32020d.d();
                } else {
                    a<T> aVar2 = this.f32020d;
                    this.f32018b = 1;
                    if (aVar2.e(obj2, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: StoreRealActor.kt */
    @f(c = "androidx.paging.multicast.StoreRealActor$2", f = "StoreRealActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "", "", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    static final class b extends o implements q<j<? super Object>, Throwable, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f32021b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a<T> f32022c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a<T> aVar, kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
            this.f32022c = aVar;
        }

        @Override // ld.q
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object R(@l j<Object> jVar, @m Throwable th, @m kotlin.coroutines.d<? super k2> dVar) {
            return new b(this.f32022c, dVar).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f32021b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            this.f32022c.d();
            return k2.f75408a;
        }
    }

    /* compiled from: StoreRealActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/paging/multicast/a$c;", "", "<init>", "()V", "CLOSE_TOKEN", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: androidx.paging.multicast.a$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        public final Object a() {
            return a.f32014e;
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: StoreRealActor.kt */
    @f(c = "androidx.paging.multicast.StoreRealActor", f = "StoreRealActor.kt", i = {0}, l = {74, 76}, m = "close", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f32023b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f32024c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a<T> f32025d;

        /* renamed from: e, reason: collision with root package name */
        int f32026e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a<T> aVar, kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
            this.f32025d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            this.f32024c = obj;
            this.f32026e |= Integer.MIN_VALUE;
            return this.f32025d.c(this);
        }
    }

    public a(@l r0 scope) {
        l0.p(scope, "scope");
        kotlinx.coroutines.channels.l<Object> d5 = kotlinx.coroutines.channels.o.d(0, null, null, 6, null);
        this.inboundChannel = d5;
        this.closeCompleted = a0.c(null, 1, null);
        this.didClose = new AtomicBoolean(false);
        k.V0(new t.b(new a0.h(k.X(d5), new C0554a(this, null)), new b(this, null)), scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        if (this.didClose.compareAndSet(false, true)) {
            try {
                f();
            } finally {
                e0.a.a(this.inboundChannel, null, 1, null);
                this.closeCompleted.I(k2.f75408a);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@fg.l kotlin.coroutines.d<? super kotlin.k2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.paging.multicast.a.d
            if (r0 == 0) goto L13
            r0 = r6
            androidx.paging.multicast.a$d r0 = (androidx.paging.multicast.a.d) r0
            int r1 = r0.f32026e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32026e = r1
            goto L18
        L13:
            androidx.paging.multicast.a$d r0 = new androidx.paging.multicast.a$d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f32024c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f32026e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.a1.n(r6)
            goto L5b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            java.lang.Object r2 = r0.f32023b
            androidx.paging.multicast.a r2 = (androidx.paging.multicast.a) r2
            kotlin.a1.n(r6)
            goto L4d
        L3a:
            kotlin.a1.n(r6)
            kotlinx.coroutines.channels.l<java.lang.Object> r6 = r5.inboundChannel
            java.lang.Object r2 = androidx.paging.multicast.a.f32014e
            r0.f32023b = r5
            r0.f32026e = r4
            java.lang.Object r6 = r6.f0(r2, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            kotlinx.coroutines.y<kotlin.k2> r6 = r2.closeCompleted
            r2 = 0
            r0.f32023b = r2
            r0.f32026e = r3
            java.lang.Object r6 = r6.z(r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            kotlin.k2 r6 = kotlin.k2.f75408a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.multicast.a.c(kotlin.coroutines.d):java.lang.Object");
    }

    @m
    public abstract Object e(T t4, @l kotlin.coroutines.d<? super k2> dVar);

    public void f() {
    }

    @m
    public final Object g(T t4, @l kotlin.coroutines.d<? super k2> dVar) {
        Object f02 = this.inboundChannel.f0(t4, dVar);
        return f02 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? f02 : k2.f75408a;
    }
}
