package androidx.paging;

import androidx.paging.a;
import androidx.paging.e0;
import androidx.paging.f1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k1;
import kotlin.k2;

/* compiled from: RemoteMediatorAccessor.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 (*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u0018B#\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ+\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Landroidx/paging/g1;", "", "Key", "Value", "Landroidx/paging/h1;", "Lkotlinx/coroutines/r0;", "scope", "Landroidx/paging/f1;", "remoteMediator", "<init>", "(Lkotlinx/coroutines/r0;Landroidx/paging/f1;)V", "Lkotlin/k2;", "i", "()V", "h", "Landroidx/paging/g0;", "loadType", "Landroidx/paging/d1;", "pagingState", "c", "(Landroidx/paging/g0;Landroidx/paging/d1;)V", "b", "(Landroidx/paging/d1;)V", "Landroidx/paging/f1$a;", "a", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/r0;", "Landroidx/paging/f1;", "Landroidx/paging/b;", "Landroidx/paging/b;", "accessorState", "Landroidx/paging/p1;", "d", "Landroidx/paging/p1;", "isolationRunner", "Lkotlinx/coroutines/flow/t0;", "Landroidx/paging/f0;", "getState", "()Lkotlinx/coroutines/flow/t0;", "state", "e", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
final class g1<Key, Value> implements h1<Key, Value> {

    /* renamed from: f, reason: collision with root package name */
    private static final int f31696f = 2;

    /* renamed from: g, reason: collision with root package name */
    private static final int f31697g = 1;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.r0 scope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final f1<Key, Value> remoteMediator;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.paging.b<Key, Value> accessorState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final p1 isolationRunner;

    /* compiled from: RemoteMediatorAccessor.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31702a;

        static {
            int[] iArr = new int[g0.values().length];
            iArr[g0.REFRESH.ordinal()] = 1;
            f31702a = iArr;
        }
    }

    /* compiled from: RemoteMediatorAccessor.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.RemoteMediatorAccessImpl", f = "RemoteMediatorAccessor.kt", i = {0}, l = {397}, m = "initialize", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f31703b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f31704c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ g1<Key, Value> f31705d;

        /* renamed from: e, reason: collision with root package name */
        int f31706e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(g1<Key, Value> g1Var, kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
            this.f31705d = g1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f31704c = obj;
            this.f31706e |= Integer.MIN_VALUE;
            return this.f31705d.a(this);
        }
    }

    /* compiled from: RemoteMediatorAccessor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Landroidx/paging/a;", "it", "Lkotlin/k2;", "<anonymous>", "(Landroidx/paging/a;)V"}, k = 3, mv = {1, 5, 1})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<a<Key, Value>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f31707b = new d(1);

        d() {
            super(1);
        }

        public final void a(@fg.l a<Key, Value> it) {
            kotlin.jvm.internal.l0.p(it, "it");
            g0 g0Var = g0.APPEND;
            a.EnumC0519a enumC0519a = a.EnumC0519a.REQUIRES_REFRESH;
            it.i(g0Var, enumC0519a);
            it.i(g0.PREPEND, enumC0519a);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Object obj) {
            a((a) obj);
            return k2.f75408a;
        }
    }

    /* compiled from: RemoteMediatorAccessor.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1", f = "RemoteMediatorAccessor.kt", i = {}, l = {338}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 5, 1})
    static final class e extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31708b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g1<Key, Value> f31709c;

        /* compiled from: RemoteMediatorAccessor.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1", f = "RemoteMediatorAccessor.kt", i = {0}, l = {345}, m = "invokeSuspend", n = {"loadType"}, s = {"L$0"})
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Key", "Value", "Lkotlin/k2;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.l<kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            Object f31710b;

            /* renamed from: c, reason: collision with root package name */
            int f31711c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ g1<Key, Value> f31712d;

            /* compiled from: RemoteMediatorAccessor.kt */
            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0018\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Key", "Value", "Landroidx/paging/a;", "it", "Lkotlin/q0;", "Landroidx/paging/g0;", "Landroidx/paging/d1;", "<anonymous>", "(Landroidx/paging/a;)Lkotlin/q0;"}, k = 3, mv = {1, 5, 1})
            /* renamed from: androidx.paging.g1$e$a$a, reason: collision with other inner class name */
            static final class C0539a extends kotlin.jvm.internal.n0 implements ld.l<androidx.paging.a<Key, Value>, kotlin.q0<? extends g0, ? extends d1<Key, Value>>> {

                /* renamed from: b, reason: collision with root package name */
                public static final C0539a f31713b = new C0539a(1);

                C0539a() {
                    super(1);
                }

                @Override // ld.l
                @fg.m
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlin.q0<g0, d1<Key, Value>> invoke(@fg.l androidx.paging.a<Key, Value> it) {
                    kotlin.jvm.internal.l0.p(it, "it");
                    return it.g();
                }
            }

            /* compiled from: RemoteMediatorAccessor.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Landroidx/paging/a;", "it", "Lkotlin/k2;", "<anonymous>", "(Landroidx/paging/a;)V"}, k = 3, mv = {1, 5, 1})
            static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.paging.a<Key, Value>, k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ g0 f31714b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ f1.b f31715c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(g0 g0Var, f1.b bVar) {
                    super(1);
                    this.f31714b = g0Var;
                    this.f31715c = bVar;
                }

                public final void a(@fg.l androidx.paging.a<Key, Value> it) {
                    kotlin.jvm.internal.l0.p(it, "it");
                    it.c(this.f31714b);
                    if (((f1.b.C0538b) this.f31715c).getEndOfPaginationReached()) {
                        it.i(this.f31714b, a.EnumC0519a.COMPLETED);
                    }
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ k2 invoke(Object obj) {
                    a((androidx.paging.a) obj);
                    return k2.f75408a;
                }
            }

            /* compiled from: RemoteMediatorAccessor.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Landroidx/paging/a;", "it", "Lkotlin/k2;", "<anonymous>", "(Landroidx/paging/a;)V"}, k = 3, mv = {1, 5, 1})
            static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.paging.a<Key, Value>, k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ g0 f31716b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ f1.b f31717c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(g0 g0Var, f1.b bVar) {
                    super(1);
                    this.f31716b = g0Var;
                    this.f31717c = bVar;
                }

                public final void a(@fg.l androidx.paging.a<Key, Value> it) {
                    kotlin.jvm.internal.l0.p(it, "it");
                    it.c(this.f31716b);
                    it.j(this.f31716b, new e0.a(((f1.b.a) this.f31717c).getThrowable()));
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ k2 invoke(Object obj) {
                    a((androidx.paging.a) obj);
                    return k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g1<Key, Value> g1Var, kotlin.coroutines.d<? super a> dVar) {
                super(1, dVar);
                this.f31712d = g1Var;
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f31712d, dVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
            /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0052  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0049 -> B:5:0x004c). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r6) {
                /*
                    r5 = this;
                    kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r1 = r5.f31711c
                    r2 = 1
                    if (r1 == 0) goto L19
                    if (r1 != r2) goto L11
                    java.lang.Object r1 = r5.f31710b
                    androidx.paging.g0 r1 = (androidx.paging.g0) r1
                    kotlin.a1.n(r6)
                    goto L4c
                L11:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L19:
                    kotlin.a1.n(r6)
                L1c:
                    androidx.paging.g1<Key, Value> r6 = r5.f31712d
                    androidx.paging.b r6 = androidx.paging.g1.d(r6)
                    androidx.paging.g1$e$a$a r1 = androidx.paging.g1.e.a.C0539a.f31713b
                    java.lang.Object r6 = r6.b(r1)
                    kotlin.q0 r6 = (kotlin.q0) r6
                    if (r6 != 0) goto L2f
                    kotlin.k2 r6 = kotlin.k2.f75408a
                    return r6
                L2f:
                    java.lang.Object r1 = r6.a()
                    androidx.paging.g0 r1 = (androidx.paging.g0) r1
                    java.lang.Object r6 = r6.b()
                    androidx.paging.d1 r6 = (androidx.paging.d1) r6
                    androidx.paging.g1<Key, Value> r3 = r5.f31712d
                    androidx.paging.f1 r3 = androidx.paging.g1.f(r3)
                    r5.f31710b = r1
                    r5.f31711c = r2
                    java.lang.Object r6 = r3.c(r1, r6, r5)
                    if (r6 != r0) goto L4c
                    return r0
                L4c:
                    androidx.paging.f1$b r6 = (androidx.paging.f1.b) r6
                    boolean r3 = r6 instanceof androidx.paging.f1.b.C0538b
                    if (r3 == 0) goto L61
                    androidx.paging.g1<Key, Value> r3 = r5.f31712d
                    androidx.paging.b r3 = androidx.paging.g1.d(r3)
                    androidx.paging.g1$e$a$b r4 = new androidx.paging.g1$e$a$b
                    r4.<init>(r1, r6)
                    r3.b(r4)
                    goto L1c
                L61:
                    boolean r3 = r6 instanceof androidx.paging.f1.b.a
                    if (r3 == 0) goto L1c
                    androidx.paging.g1<Key, Value> r3 = r5.f31712d
                    androidx.paging.b r3 = androidx.paging.g1.d(r3)
                    androidx.paging.g1$e$a$c r4 = new androidx.paging.g1$e$a$c
                    r4.<init>(r1, r6)
                    r3.b(r4)
                    goto L1c
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.g1.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(g1<Key, Value> g1Var, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f31709c = g1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new e(this.f31709c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f31708b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                p1 p1Var = ((g1) this.f31709c).isolationRunner;
                a aVar2 = new a(this.f31709c, null);
                this.f31708b = 1;
                if (p1Var.b(1, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((e) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: RemoteMediatorAccessor.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1", f = "RemoteMediatorAccessor.kt", i = {0}, l = {266}, m = "invokeSuspend", n = {"launchAppendPrepend"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 5, 1})
    static final class f extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f31718b;

        /* renamed from: c, reason: collision with root package name */
        int f31719c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ g1<Key, Value> f31720d;

        /* compiled from: RemoteMediatorAccessor.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1", f = "RemoteMediatorAccessor.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Key", "Value", "Lkotlin/k2;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.l<kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            Object f31721b;

            /* renamed from: c, reason: collision with root package name */
            Object f31722c;

            /* renamed from: d, reason: collision with root package name */
            int f31723d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ g1<Key, Value> f31724e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ k1.a f31725f;

            /* compiled from: RemoteMediatorAccessor.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Landroidx/paging/a;", "it", "", "<anonymous>", "(Landroidx/paging/a;)Z"}, k = 3, mv = {1, 5, 1})
            /* renamed from: androidx.paging.g1$f$a$a, reason: collision with other inner class name */
            static final class C0540a extends kotlin.jvm.internal.n0 implements ld.l<androidx.paging.a<Key, Value>, Boolean> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ f1.b f31726b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0540a(f1.b bVar) {
                    super(1);
                    this.f31726b = bVar;
                }

                @Override // ld.l
                @fg.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@fg.l androidx.paging.a<Key, Value> it) {
                    kotlin.jvm.internal.l0.p(it, "it");
                    g0 g0Var = g0.REFRESH;
                    it.c(g0Var);
                    if (((f1.b.C0538b) this.f31726b).getEndOfPaginationReached()) {
                        a.EnumC0519a enumC0519a = a.EnumC0519a.COMPLETED;
                        it.i(g0Var, enumC0519a);
                        it.i(g0.PREPEND, enumC0519a);
                        it.i(g0.APPEND, enumC0519a);
                        it.d();
                    } else {
                        g0 g0Var2 = g0.PREPEND;
                        a.EnumC0519a enumC0519a2 = a.EnumC0519a.UNBLOCKED;
                        it.i(g0Var2, enumC0519a2);
                        it.i(g0.APPEND, enumC0519a2);
                    }
                    it.j(g0.PREPEND, null);
                    it.j(g0.APPEND, null);
                    return Boolean.valueOf(it.g() != null);
                }
            }

            /* compiled from: RemoteMediatorAccessor.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Landroidx/paging/a;", "it", "", "<anonymous>", "(Landroidx/paging/a;)Z"}, k = 3, mv = {1, 5, 1})
            static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.paging.a<Key, Value>, Boolean> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ f1.b f31727b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(f1.b bVar) {
                    super(1);
                    this.f31727b = bVar;
                }

                @Override // ld.l
                @fg.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@fg.l androidx.paging.a<Key, Value> it) {
                    kotlin.jvm.internal.l0.p(it, "it");
                    g0 g0Var = g0.REFRESH;
                    it.c(g0Var);
                    it.j(g0Var, new e0.a(((f1.b.a) this.f31727b).getThrowable()));
                    return Boolean.valueOf(it.g() != null);
                }
            }

            /* compiled from: RemoteMediatorAccessor.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Landroidx/paging/a;", "it", "Landroidx/paging/d1;", "<anonymous>", "(Landroidx/paging/a;)Landroidx/paging/d1;"}, k = 3, mv = {1, 5, 1})
            static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.paging.a<Key, Value>, d1<Key, Value>> {

                /* renamed from: b, reason: collision with root package name */
                public static final c f31728b = new c(1);

                c() {
                    super(1);
                }

                @Override // ld.l
                @fg.m
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d1<Key, Value> invoke(@fg.l androidx.paging.a<Key, Value> it) {
                    kotlin.jvm.internal.l0.p(it, "it");
                    return it.h();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g1<Key, Value> g1Var, k1.a aVar, kotlin.coroutines.d<? super a> dVar) {
                super(1, dVar);
                this.f31724e = g1Var;
                this.f31725f = aVar;
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f31724e, this.f31725f, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                g1<Key, Value> g1Var;
                k1.a aVar;
                boolean booleanValue;
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f31723d;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    d1<Key, Value> d1Var = (d1) ((g1) this.f31724e).accessorState.b(c.f31728b);
                    if (d1Var != null) {
                        g1Var = this.f31724e;
                        k1.a aVar3 = this.f31725f;
                        f1 f1Var = ((g1) g1Var).remoteMediator;
                        g0 g0Var = g0.REFRESH;
                        this.f31721b = g1Var;
                        this.f31722c = aVar3;
                        this.f31723d = 1;
                        obj = f1Var.c(g0Var, d1Var, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        aVar = aVar3;
                    }
                    return k2.f75408a;
                }
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (k1.a) this.f31722c;
                g1Var = (g1) this.f31721b;
                kotlin.a1.n(obj);
                f1.b bVar = (f1.b) obj;
                if (bVar instanceof f1.b.C0538b) {
                    booleanValue = ((Boolean) ((g1) g1Var).accessorState.b(new C0540a(bVar))).booleanValue();
                } else {
                    if (!(bVar instanceof f1.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    booleanValue = ((Boolean) ((g1) g1Var).accessorState.b(new b(bVar))).booleanValue();
                }
                aVar.f75322b = booleanValue;
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(g1<Key, Value> g1Var, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f31720d = g1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new f(this.f31720d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            k1.a aVar;
            kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f31719c;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                k1.a aVar3 = new k1.a();
                p1 p1Var = ((g1) this.f31720d).isolationRunner;
                a aVar4 = new a(this.f31720d, aVar3, null);
                this.f31718b = aVar3;
                this.f31719c = 1;
                if (p1Var.b(2, aVar4, this) == aVar2) {
                    return aVar2;
                }
                aVar = aVar3;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (k1.a) this.f31718b;
                kotlin.a1.n(obj);
            }
            if (aVar.f75322b) {
                this.f31720d.h();
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((f) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: RemoteMediatorAccessor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Landroidx/paging/a;", "it", "", "<anonymous>", "(Landroidx/paging/a;)Z"}, k = 3, mv = {1, 5, 1})
    static final class g extends kotlin.jvm.internal.n0 implements ld.l<a<Key, Value>, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g0 f31729b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d1<Key, Value> f31730c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(g0 g0Var, d1<Key, Value> d1Var) {
            super(1);
            this.f31729b = g0Var;
            this.f31730c = d1Var;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l a<Key, Value> it) {
            kotlin.jvm.internal.l0.p(it, "it");
            return Boolean.valueOf(it.a(this.f31729b, this.f31730c));
        }
    }

    /* compiled from: RemoteMediatorAccessor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Landroidx/paging/a;", "accessorState", "Lkotlin/k2;", "<anonymous>", "(Landroidx/paging/a;)V"}, k = 3, mv = {1, 5, 1})
    static final class h extends kotlin.jvm.internal.n0 implements ld.l<a<Key, Value>, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<g0> f31731b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(List<g0> list) {
            super(1);
            this.f31731b = list;
        }

        public final void a(@fg.l a<Key, Value> accessorState) {
            kotlin.jvm.internal.l0.p(accessorState, "accessorState");
            f0 e4 = accessorState.e();
            boolean z4 = e4.k() instanceof e0.a;
            accessorState.b();
            if (z4) {
                List<g0> list = this.f31731b;
                g0 g0Var = g0.REFRESH;
                list.add(g0Var);
                accessorState.i(g0Var, a.EnumC0519a.UNBLOCKED);
            }
            if (e4.i() instanceof e0.a) {
                if (!z4) {
                    this.f31731b.add(g0.APPEND);
                }
                accessorState.c(g0.APPEND);
            }
            if (e4.j() instanceof e0.a) {
                if (!z4) {
                    this.f31731b.add(g0.PREPEND);
                }
                accessorState.c(g0.PREPEND);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Object obj) {
            a((a) obj);
            return k2.f75408a;
        }
    }

    public g1(@fg.l kotlinx.coroutines.r0 scope, @fg.l f1<Key, Value> remoteMediator) {
        kotlin.jvm.internal.l0.p(scope, "scope");
        kotlin.jvm.internal.l0.p(remoteMediator, "remoteMediator");
        this.scope = scope;
        this.remoteMediator = remoteMediator;
        this.accessorState = new androidx.paging.b<>();
        this.isolationRunner = new p1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        kotlinx.coroutines.k.f(this.scope, null, null, new e(this, null), 3, null);
    }

    private final void i() {
        kotlinx.coroutines.k.f(this.scope, null, null, new f(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.paging.h1
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@fg.l kotlin.coroutines.d<? super androidx.paging.f1.a> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.paging.g1.c
            if (r0 == 0) goto L13
            r0 = r5
            androidx.paging.g1$c r0 = (androidx.paging.g1.c) r0
            int r1 = r0.f31706e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31706e = r1
            goto L18
        L13:
            androidx.paging.g1$c r0 = new androidx.paging.g1$c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f31704c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f31706e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f31703b
            androidx.paging.g1 r0 = (androidx.paging.g1) r0
            kotlin.a1.n(r5)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.a1.n(r5)
            androidx.paging.f1<Key, Value> r5 = r4.remoteMediator
            r0.f31703b = r4
            r0.f31706e = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            r1 = r5
            androidx.paging.f1$a r1 = (androidx.paging.f1.a) r1
            androidx.paging.f1$a r2 = androidx.paging.f1.a.LAUNCH_INITIAL_REFRESH
            if (r1 != r2) goto L52
            androidx.paging.b<Key, Value> r0 = r0.accessorState
            androidx.paging.g1$d r1 = androidx.paging.g1.d.f31707b
            r0.b(r1)
        L52:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.g1.a(kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.paging.j1
    public void b(@fg.l d1<Key, Value> pagingState) {
        kotlin.jvm.internal.l0.p(pagingState, "pagingState");
        ArrayList arrayList = new ArrayList();
        this.accessorState.b(new h(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c((g0) it.next(), pagingState);
        }
    }

    @Override // androidx.paging.j1
    public void c(@fg.l g0 loadType, @fg.l d1<Key, Value> pagingState) {
        kotlin.jvm.internal.l0.p(loadType, "loadType");
        kotlin.jvm.internal.l0.p(pagingState, "pagingState");
        if (((Boolean) this.accessorState.b(new g(loadType, pagingState))).booleanValue()) {
            if (b.f31702a[loadType.ordinal()] == 1) {
                i();
            } else {
                h();
            }
        }
    }

    @Override // androidx.paging.h1
    @fg.l
    public kotlinx.coroutines.flow.t0<f0> getState() {
        return this.accessorState.a();
    }
}
