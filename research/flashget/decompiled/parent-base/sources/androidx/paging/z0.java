package androidx.paging;

import androidx.annotation.c1;
import androidx.paging.r0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.k2;

/* compiled from: PagingDataDiffer.kt */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000¡\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t*\u0001O\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0016\u001a\u0004\u0018\u00010\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H¦@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010 \u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u0012H\u0086\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010!J\u0013\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\f¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\f¢\u0006\u0004\b(\u0010'J\u001b\u0010*\u001a\u00020\f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u00020\f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0004\b,\u0010+J!\u0010/\u001a\u00020\f2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\f0-¢\u0006\u0004\b/\u00100J!\u00101\u001a\u00020\f2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\f0-¢\u0006\u0004\b1\u00100R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00109\u001a\b\u0012\u0004\u0012\u00028\u0000068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R \u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00140B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010L\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001d\u0010X\u001a\b\u0012\u0004\u0012\u00020.0S8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\f0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0011\u0010_\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0017\u0010a\u001a\b\u0012\u0004\u0012\u00020\f0S8F¢\u0006\u0006\u001a\u0004\b`\u0010W\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006b"}, d2 = {"Landroidx/paging/z0;", "", "T", "Landroidx/paging/n;", "differCallback", "Lkotlinx/coroutines/m0;", "mainDispatcher", "<init>", "(Landroidx/paging/n;Lkotlinx/coroutines/m0;)V", "Landroidx/paging/f0;", "source", "mediator", "Lkotlin/k2;", "r", "(Landroidx/paging/f0;Landroidx/paging/f0;)V", "Landroidx/paging/k0;", "previousList", "newList", "", "lastAccessedIndex", "Lkotlin/Function0;", "onListPresentable", "y", "(Landroidx/paging/k0;Landroidx/paging/k0;ILld/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "x", "()Z", "Landroidx/paging/y0;", "pagingData", "q", "(Landroidx/paging/y0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "index", "s", "(I)Ljava/lang/Object;", "w", "Landroidx/paging/b0;", "D", "()Landroidx/paging/b0;", "C", "()V", "z", "listener", "p", "(Lld/a;)V", "B", "Lkotlin/Function1;", "Landroidx/paging/i;", "o", "(Lld/l;)V", "A", "a", "Landroidx/paging/n;", "b", "Lkotlinx/coroutines/m0;", "Landroidx/paging/r0;", "c", "Landroidx/paging/r0;", "presenter", "Landroidx/paging/u1;", "d", "Landroidx/paging/u1;", "receiver", "Landroidx/paging/i0;", "e", "Landroidx/paging/i0;", "combinedLoadStatesCollection", "Ljava/util/concurrent/CopyOnWriteArrayList;", "f", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onPagesUpdatedListeners", "Landroidx/paging/p1;", "g", "Landroidx/paging/p1;", "collectFromRunner", "h", "Z", "lastAccessedIndexUnfulfilled", "i", "I", "androidx/paging/z0$c", "j", "Landroidx/paging/z0$c;", "processPageEventCallback", "Lkotlinx/coroutines/flow/i;", "k", "Lkotlinx/coroutines/flow/i;", "t", "()Lkotlinx/coroutines/flow/i;", "loadStateFlow", "Lkotlinx/coroutines/flow/d0;", "l", "Lkotlinx/coroutines/flow/d0;", "_onPagesUpdatedFlow", "v", "()I", "size", "u", "onPagesUpdatedFlow", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class z0<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n differCallback;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.m0 mainDispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private r0<T> presenter;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private u1 receiver;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i0 combinedLoadStatesCollection;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final CopyOnWriteArrayList<ld.a<k2>> onPagesUpdatedListeners;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final p1 collectFromRunner;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private volatile boolean lastAccessedIndexUnfulfilled;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private volatile int lastAccessedIndex;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c processPageEventCallback;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.flow.i<i> loadStateFlow;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.flow.d0<k2> _onPagesUpdatedFlow;

    /* compiled from: PagingDataDiffer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Lkotlin/k2;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z0<T> f32483b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z0<T> z0Var) {
            super(0);
            this.f32483b = z0Var;
        }

        public final void a() {
            ((z0) this.f32483b)._onPagesUpdatedFlow.b(k2.f75408a);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: PagingDataDiffer.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataDiffer$collectFrom$2", f = "PagingDataDiffer.kt", i = {}, l = {467}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Lkotlin/k2;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.l<kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f32484b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z0<T> f32485c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ y0<T> f32486d;

        /* compiled from: PagingDataDiffer.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataDiffer$collectFrom$2$1$1", f = "PagingDataDiffer.kt", i = {0, 0}, l = {151, 193}, m = "invokeSuspend", n = {"newPresenter", "onListPresentableCalled"}, s = {"L$0", "L$1"})
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 5, 1})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            Object f32487b;

            /* renamed from: c, reason: collision with root package name */
            Object f32488c;

            /* renamed from: d, reason: collision with root package name */
            int f32489d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ l0<T> f32490e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ z0<T> f32491f;

            /* compiled from: PagingDataDiffer.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Lkotlin/k2;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
            /* renamed from: androidx.paging.z0$b$a$a, reason: collision with other inner class name */
            static final class C0566a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ z0<T> f32492b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ r0<T> f32493c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ k1.a f32494d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0566a(z0<T> z0Var, r0<T> r0Var, k1.a aVar) {
                    super(0);
                    this.f32492b = z0Var;
                    this.f32493c = r0Var;
                    this.f32494d = aVar;
                }

                public final void a() {
                    ((z0) this.f32492b).presenter = this.f32493c;
                    this.f32494d.f75322b = true;
                }

                @Override // ld.a
                public /* bridge */ /* synthetic */ k2 invoke() {
                    a();
                    return k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l0<T> l0Var, z0<T> z0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f32490e = l0Var;
                this.f32491f = z0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f32490e, this.f32491f, dVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x00fb  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0076  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x00c0  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x00f0  */
            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r12) {
                /*
                    Method dump skipped, instructions count: 511
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.z0.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* compiled from: Collect.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/n$a", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: androidx.paging.z0$b$b, reason: collision with other inner class name */
        public static final class C0567b implements kotlinx.coroutines.flow.j<l0<T>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z0 f32495b;

            public C0567b(z0 z0Var) {
                this.f32495b = z0Var;
            }

            @Override // kotlinx.coroutines.flow.j
            @fg.m
            public Object emit(l0<T> l0Var, @fg.l kotlin.coroutines.d<? super k2> dVar) {
                Object h4 = kotlinx.coroutines.i.h(this.f32495b.mainDispatcher, new a(l0Var, this.f32495b, null), dVar);
                return h4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? h4 : k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(z0<T> z0Var, y0<T> y0Var, kotlin.coroutines.d<? super b> dVar) {
            super(1, dVar);
            this.f32485c = z0Var;
            this.f32486d = y0Var;
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((b) create(dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.l kotlin.coroutines.d<?> dVar) {
            return new b(this.f32485c, this.f32486d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f32484b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                ((z0) this.f32485c).receiver = this.f32486d.getReceiver();
                kotlinx.coroutines.flow.i<l0<T>> e4 = this.f32486d.e();
                C0567b c0567b = new C0567b(this.f32485c);
                this.f32484b = 1;
                if (e4.a(c0567b, this) == aVar) {
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
    }

    /* compiled from: PagingDataDiffer.kt */
    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0007J!\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"androidx/paging/z0$c", "Landroidx/paging/r0$b;", "", "position", "count", "Lkotlin/k2;", "a", "(II)V", "onInserted", "onRemoved", "Landroidx/paging/f0;", "source", "mediator", "c", "(Landroidx/paging/f0;Landroidx/paging/f0;)V", "Landroidx/paging/g0;", "loadType", "", "fromMediator", "Landroidx/paging/e0;", "loadState", "b", "(Landroidx/paging/g0;ZLandroidx/paging/e0;)V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c implements r0.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z0<T> f32496a;

        c(z0<T> z0Var) {
            this.f32496a = z0Var;
        }

        @Override // androidx.paging.r0.b
        public void a(int position, int count) {
            ((z0) this.f32496a).differCallback.a(position, count);
        }

        @Override // androidx.paging.r0.b
        public void b(@fg.l g0 loadType, boolean fromMediator, @fg.l e0 loadState) {
            kotlin.jvm.internal.l0.p(loadType, "loadType");
            kotlin.jvm.internal.l0.p(loadState, "loadState");
            if (kotlin.jvm.internal.l0.g(((z0) this.f32496a).combinedLoadStatesCollection.c(loadType, fromMediator), loadState)) {
                return;
            }
            ((z0) this.f32496a).combinedLoadStatesCollection.i(loadType, fromMediator, loadState);
        }

        @Override // androidx.paging.r0.b
        public void c(@fg.l f0 source, @fg.m f0 mediator) {
            kotlin.jvm.internal.l0.p(source, "source");
            this.f32496a.r(source, mediator);
        }

        @Override // androidx.paging.r0.b
        public void onInserted(int position, int count) {
            ((z0) this.f32496a).differCallback.onInserted(position, count);
        }

        @Override // androidx.paging.r0.b
        public void onRemoved(int position, int count) {
            ((z0) this.f32496a).differCallback.onRemoved(position, count);
        }
    }

    public z0(@fg.l n differCallback, @fg.l kotlinx.coroutines.m0 mainDispatcher) {
        kotlin.jvm.internal.l0.p(differCallback, "differCallback");
        kotlin.jvm.internal.l0.p(mainDispatcher, "mainDispatcher");
        this.differCallback = differCallback;
        this.mainDispatcher = mainDispatcher;
        r0.INSTANCE.getClass();
        this.presenter = r0.f32257g;
        i0 i0Var = new i0();
        this.combinedLoadStatesCollection = i0Var;
        this.onPagesUpdatedListeners = new CopyOnWriteArrayList<>();
        this.collectFromRunner = new p1(false, 1, null);
        this.processPageEventCallback = new c(this);
        this.loadStateFlow = i0Var.d();
        this._onPagesUpdatedFlow = kotlinx.coroutines.flow.k0.a(0, 64, kotlinx.coroutines.channels.i.DROP_OLDEST);
        p(new a(this));
    }

    public final void A(@fg.l ld.l<? super i, k2> listener) {
        kotlin.jvm.internal.l0.p(listener, "listener");
        this.combinedLoadStatesCollection.g(listener);
    }

    public final void B(@fg.l ld.a<k2> listener) {
        kotlin.jvm.internal.l0.p(listener, "listener");
        this.onPagesUpdatedListeners.remove(listener);
    }

    public final void C() {
        u1 u1Var = this.receiver;
        if (u1Var == null) {
            return;
        }
        u1Var.b();
    }

    @fg.l
    public final b0<T> D() {
        return this.presenter.q();
    }

    public final void o(@fg.l ld.l<? super i, k2> listener) {
        kotlin.jvm.internal.l0.p(listener, "listener");
        this.combinedLoadStatesCollection.a(listener);
    }

    public final void p(@fg.l ld.a<k2> listener) {
        kotlin.jvm.internal.l0.p(listener, "listener");
        this.onPagesUpdatedListeners.add(listener);
    }

    @fg.m
    public final Object q(@fg.l y0<T> y0Var, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object c5 = p1.c(this.collectFromRunner, 0, new b(this, y0Var, null), dVar, 1, null);
        return c5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? c5 : k2.f75408a;
    }

    public final void r(@fg.l f0 source, @fg.m f0 mediator) {
        kotlin.jvm.internal.l0.p(source, "source");
        if (kotlin.jvm.internal.l0.g(this.combinedLoadStatesCollection.getSource(), source) && kotlin.jvm.internal.l0.g(this.combinedLoadStatesCollection.getMediator(), mediator)) {
            return;
        }
        this.combinedLoadStatesCollection.h(source, mediator);
    }

    @fg.m
    public final T s(@androidx.annotation.g0(from = 0) int index) {
        this.lastAccessedIndexUnfulfilled = true;
        this.lastAccessedIndex = index;
        u1 u1Var = this.receiver;
        if (u1Var != null) {
            u1Var.a(this.presenter.b(index));
        }
        return this.presenter.k(index);
    }

    @fg.l
    public final kotlinx.coroutines.flow.i<i> t() {
        return this.loadStateFlow;
    }

    @fg.l
    public final kotlinx.coroutines.flow.i<k2> u() {
        return kotlinx.coroutines.flow.k.l(this._onPagesUpdatedFlow);
    }

    public final int v() {
        return this.presenter.getSize();
    }

    @fg.m
    public final T w(@androidx.annotation.g0(from = 0) int index) {
        return this.presenter.k(index);
    }

    public boolean x() {
        return false;
    }

    @fg.m
    public abstract Object y(@fg.l k0<T> k0Var, @fg.l k0<T> k0Var2, int i4, @fg.l ld.a<k2> aVar, @fg.l kotlin.coroutines.d<? super Integer> dVar);

    public final void z() {
        u1 u1Var = this.receiver;
        if (u1Var == null) {
            return;
        }
        u1Var.refresh();
    }

    public /* synthetic */ z0(n nVar, kotlinx.coroutines.m0 m0Var, int i4, kotlin.jvm.internal.w wVar) {
        this(nVar, (i4 & 2) != 0 ? kotlinx.coroutines.j1.e() : m0Var);
    }
}
