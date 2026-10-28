package kotlinx.coroutines.flow.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.a1;
import kotlinx.coroutines.channels.b0;
import kotlinx.coroutines.channels.d0;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.r0;

/* compiled from: Merge.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BA\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u00162\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/flow/internal/f;", "T", "Lkotlinx/coroutines/flow/internal/d;", "Lkotlinx/coroutines/flow/i;", "flow", "", "concurrency", "Lkotlin/coroutines/g;", "context", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "<init>", "(Lkotlinx/coroutines/flow/i;ILkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V", "k", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)Lkotlinx/coroutines/flow/internal/d;", "Lkotlinx/coroutines/r0;", "scope", "Lkotlinx/coroutines/channels/d0;", "o", "(Lkotlinx/coroutines/r0;)Lkotlinx/coroutines/channels/d0;", "Lkotlinx/coroutines/channels/b0;", "Lkotlin/k2;", "i", "(Lkotlinx/coroutines/channels/b0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "f", "()Ljava/lang/String;", "e", "Lkotlinx/coroutines/flow/i;", "I", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class f<T> extends d<T> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.flow.i<kotlinx.coroutines.flow.i<T>> flow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int concurrency;

    /* compiled from: Merge.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "inner", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class a<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k2 f80039b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.sync.d f80040c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b0<T> f80041d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ w<T> f80042e;

        /* compiled from: Merge.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlinx.coroutines.flow.internal.f$a$a, reason: collision with other inner class name */
        static final class C1232a extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f80043b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i<T> f80044c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ w<T> f80045d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.sync.d f80046e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1232a(kotlinx.coroutines.flow.i<? extends T> iVar, w<T> wVar, kotlinx.coroutines.sync.d dVar, kotlin.coroutines.d<? super C1232a> dVar2) {
                super(2, dVar2);
                this.f80044c = iVar;
                this.f80045d = wVar;
                this.f80046e = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new C1232a(this.f80044c, this.f80045d, this.f80046e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f80043b;
                try {
                    if (i4 == 0) {
                        a1.n(obj);
                        kotlinx.coroutines.flow.i<T> iVar = this.f80044c;
                        w<T> wVar = this.f80045d;
                        this.f80043b = 1;
                        if (iVar.a(wVar, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException(ProtectedSandApp.s("蜓\u0001"));
                        }
                        a1.n(obj);
                    }
                    this.f80046e.release();
                    return kotlin.k2.f75408a;
                } catch (Throwable th) {
                    this.f80046e.release();
                    throw th;
                }
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((C1232a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* compiled from: Merge.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", f = "Merge.kt", i = {0, 0}, l = {66}, m = "emit", n = {"this", "inner"}, s = {"L$0", "L$1"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        static final class b extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            Object f80047b;

            /* renamed from: c, reason: collision with root package name */
            Object f80048c;

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f80049d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ a<T> f80050e;

            /* renamed from: f, reason: collision with root package name */
            int f80051f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(a<? super T> aVar, kotlin.coroutines.d<? super b> dVar) {
                super(dVar);
                this.f80050e = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80049d = obj;
                this.f80051f |= Integer.MIN_VALUE;
                return this.f80050e.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(k2 k2Var, kotlinx.coroutines.sync.d dVar, b0<? super T> b0Var, w<T> wVar) {
            this.f80039b = k2Var;
            this.f80040c = dVar;
            this.f80041d = b0Var;
            this.f80042e = wVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.j
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(@fg.l kotlinx.coroutines.flow.i<? extends T> r8, @fg.l kotlin.coroutines.d<? super kotlin.k2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.f.a.b
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.internal.f$a$b r0 = (kotlinx.coroutines.flow.internal.f.a.b) r0
                int r1 = r0.f80051f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80051f = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.internal.f$a$b r0 = new kotlinx.coroutines.flow.internal.f$a$b
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f80049d
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80051f
                r3 = 1
                if (r2 == 0) goto L3b
                if (r2 != r3) goto L2f
                java.lang.Object r8 = r0.f80048c
                kotlinx.coroutines.flow.i r8 = (kotlinx.coroutines.flow.i) r8
                java.lang.Object r0 = r0.f80047b
                kotlinx.coroutines.flow.internal.f$a r0 = (kotlinx.coroutines.flow.internal.f.a) r0
                kotlin.a1.n(r9)
                goto L55
            L2f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "蜔\u0001"
                java.lang.String r9 = com.flashget.parentalcontrol.ProtectedSandApp.s(r9)
                r8.<init>(r9)
                throw r8
            L3b:
                kotlin.a1.n(r9)
                kotlinx.coroutines.k2 r9 = r7.f80039b
                if (r9 == 0) goto L45
                kotlinx.coroutines.n2.A(r9)
            L45:
                kotlinx.coroutines.sync.d r9 = r7.f80040c
                r0.f80047b = r7
                r0.f80048c = r8
                r0.f80051f = r3
                java.lang.Object r9 = r9.e(r0)
                if (r9 != r1) goto L54
                return r1
            L54:
                r0 = r7
            L55:
                kotlinx.coroutines.channels.b0<T> r1 = r0.f80041d
                kotlinx.coroutines.flow.internal.f$a$a r4 = new kotlinx.coroutines.flow.internal.f$a$a
                kotlinx.coroutines.flow.internal.w<T> r9 = r0.f80042e
                kotlinx.coroutines.sync.d r0 = r0.f80040c
                r2 = 0
                r4.<init>(r8, r9, r0, r2)
                r5 = 3
                r6 = 0
                r3 = 0
                kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
                kotlin.k2 r8 = kotlin.k2.f75408a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.f.a.emit(kotlinx.coroutines.flow.i, kotlin.coroutines.d):java.lang.Object");
        }
    }

    public /* synthetic */ f(kotlinx.coroutines.flow.i iVar, int i4, kotlin.coroutines.g gVar, int i5, kotlinx.coroutines.channels.i iVar2, int i6, kotlin.jvm.internal.w wVar) {
        this(iVar, i4, (i6 & 4) != 0 ? kotlin.coroutines.i.f75057b : gVar, (i6 & 8) != 0 ? -2 : i5, (i6 & 16) != 0 ? kotlinx.coroutines.channels.i.SUSPEND : iVar2);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @fg.l
    protected String f() {
        return ProtectedSandApp.s("蜕\u0001") + this.concurrency;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @fg.m
    protected Object i(@fg.l b0<? super T> b0Var, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object a5 = this.flow.a(new a((k2) dVar.getF75269b().c(k2.INSTANCE), kotlinx.coroutines.sync.f.b(this.concurrency, 0, 2, null), b0Var, new w(b0Var)), dVar);
        return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : kotlin.k2.f75408a;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @fg.l
    protected d<T> k(@fg.l kotlin.coroutines.g context, int capacity, @fg.l kotlinx.coroutines.channels.i onBufferOverflow) {
        return new f(this.flow, this.concurrency, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @fg.l
    public d0<T> o(@fg.l r0 scope) {
        return kotlinx.coroutines.channels.z.e(scope, this.context, this.capacity, m());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@fg.l kotlinx.coroutines.flow.i<? extends kotlinx.coroutines.flow.i<? extends T>> iVar, int i4, @fg.l kotlin.coroutines.g gVar, int i5, @fg.l kotlinx.coroutines.channels.i iVar2) {
        super(gVar, i5, iVar2);
        this.flow = iVar;
        this.concurrency = i4;
    }
}
