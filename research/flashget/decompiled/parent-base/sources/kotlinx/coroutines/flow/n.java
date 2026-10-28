package kotlinx.coroutines.flow;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Collect.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001am\u0010\u0013\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002H\b\u0004\u0010\u0012\u001aB\b\u0001\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\nH\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001aV\u0010\u0016\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u000021\u0010\u0012\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a1\u0010\u001a\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aX\u0010\u001c\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u000023\b\u0004\u0010\u0012\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0015H\u0087Hø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/flow/i;", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "T", "Lkotlinx/coroutines/r0;", "scope", "Lkotlinx/coroutines/k2;", "h", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/r0;)Lkotlinx/coroutines/k2;", "Lkotlin/Function3;", "", "Lkotlin/r0;", "name", "index", "value", "Lkotlin/coroutines/d;", "", "action", "d", "(Lkotlinx/coroutines/flow/i;Lld/q;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function2;", "f", "(Lkotlinx/coroutines/flow/i;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/j;", "flow", "g", "(Lkotlinx/coroutines/flow/j;Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes7.dex */
final /* synthetic */ class n {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Collect.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/n$a", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collect$3\n*L\n1#1,118:1\n*E\n"})
    public static final class a<T> implements j<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<T, kotlin.coroutines.d<? super k2>, Object> f80273b;

        /* compiled from: Collect.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
        @r1({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collect$3$emit$1\n*L\n1#1,118:1\n*E\n"})
        /* renamed from: kotlinx.coroutines.flow.n$a$a, reason: collision with other inner class name */
        public static final class C1244a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f80274b;

            /* renamed from: d, reason: collision with root package name */
            int f80276d;

            public C1244a(kotlin.coroutines.d<? super C1244a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80274b = obj;
                this.f80276d |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(ld.p<? super T, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
            this.f80273b = pVar;
        }

        @fg.m
        public Object a(T t4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            new C1244a(dVar);
            this.f80273b.invoke(t4, dVar);
            return k2.f75408a;
        }

        @Override // kotlinx.coroutines.flow.j
        @fg.m
        public Object emit(T t4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            Object invoke = this.f80273b.invoke(t4, dVar);
            return invoke == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? invoke : k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Collect.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"kotlinx/coroutines/flow/n$b", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "b", "I", "index", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2\n+ 2 FlowExceptions.common.kt\nkotlinx/coroutines/flow/internal/FlowExceptions_commonKt\n*L\n1#1,118:1\n32#2,4:119\n*S KotlinDebug\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2\n*L\n62#1:119,4\n*E\n"})
    public static final class b<T> implements j<T> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.q<Integer, T, kotlin.coroutines.d<? super k2>, Object> f80278c;

        /* compiled from: Collect.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
        @r1({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2$emit$1\n*L\n1#1,118:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f80279b;

            /* renamed from: d, reason: collision with root package name */
            int f80281d;

            public a(kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80279b = obj;
                this.f80281d |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(ld.q<? super Integer, ? super T, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar) {
            this.f80278c = qVar;
        }

        @fg.m
        public Object a(T t4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            new a(dVar);
            ld.q<Integer, T, kotlin.coroutines.d<? super k2>, Object> qVar = this.f80278c;
            int i4 = this.index;
            this.index = i4 + 1;
            if (i4 < 0) {
                throw new ArithmeticException(ProtectedSandApp.s("蝓\u0001"));
            }
            qVar.R(Integer.valueOf(i4), t4, dVar);
            return k2.f75408a;
        }

        @Override // kotlinx.coroutines.flow.j
        @fg.m
        public Object emit(T t4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            ld.q<Integer, T, kotlin.coroutines.d<? super k2>, Object> qVar = this.f80278c;
            int i4 = this.index;
            this.index = i4 + 1;
            if (i4 < 0) {
                throw new ArithmeticException(ProtectedSandApp.s("蝓\u0001"));
            }
            Object R = qVar.R(new Integer(i4), t4, dVar);
            return R == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? R : k2.f75408a;
        }
    }

    /* compiled from: Collect.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f80282b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i<T> f80283c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(i<? extends T> iVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f80283c = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new c(this.f80283c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f80282b;
            if (i4 == 0) {
                a1.n(obj);
                i<T> iVar = this.f80283c;
                this.f80282b = 1;
                if (n.a(iVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("蝔\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((c) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    @fg.m
    public static final Object a(@fg.l i<?> iVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object a5 = iVar.a(kotlinx.coroutines.flow.internal.r.f80147b, dVar);
        return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Backwards compatibility with JS and K/N")
    public static final <T> Object b(i<? extends T> iVar, ld.p<? super T, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, kotlin.coroutines.d<? super k2> dVar) {
        Object a5 = iVar.a(new a(pVar), dVar);
        return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Backwards compatibility with JS and K/N")
    private static final <T> Object c(i<? extends T> iVar, ld.p<? super T, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, kotlin.coroutines.d<? super k2> dVar) {
        iVar.a(new a(pVar), dVar);
        return k2.f75408a;
    }

    @fg.m
    public static final <T> Object d(@fg.l i<? extends T> iVar, @fg.l ld.q<? super Integer, ? super T, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object a5 = iVar.a(new b(qVar), dVar);
        return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
    }

    private static final <T> Object e(i<? extends T> iVar, ld.q<? super Integer, ? super T, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, kotlin.coroutines.d<? super k2> dVar) {
        iVar.a(new b(qVar), dVar);
        return k2.f75408a;
    }

    @fg.m
    public static final <T> Object f(@fg.l i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object a5 = a(p.d(w.k(iVar, pVar), 0, null, 2, null), dVar);
        return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
    }

    @fg.m
    public static final <T> Object g(@fg.l j<? super T> jVar, @fg.l i<? extends T> iVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        t.b(jVar);
        Object a5 = iVar.a(jVar, dVar);
        return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
    }

    @fg.l
    public static final <T> kotlinx.coroutines.k2 h(@fg.l i<? extends T> iVar, @fg.l kotlinx.coroutines.r0 r0Var) {
        kotlinx.coroutines.k2 f4;
        f4 = kotlinx.coroutines.k.f(r0Var, null, null, new c(iVar, null), 3, null);
        return f4;
    }
}
