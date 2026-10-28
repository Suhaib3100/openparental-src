package kotlinx.coroutines.flow.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;

/* compiled from: Merge.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003Bz\u0012B\u0010\r\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004¢\u0006\u0002\b\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dRS\u0010\r\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004¢\u0006\u0002\b\f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lkotlinx/coroutines/flow/internal/i;", "T", "R", "Lkotlinx/coroutines/flow/internal/g;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/j;", "Lkotlin/r0;", "name", "value", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "transform", "Lkotlinx/coroutines/flow/i;", "flow", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "<init>", "(Lld/q;Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V", "Lkotlinx/coroutines/flow/internal/d;", "k", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)Lkotlinx/coroutines/flow/internal/d;", "collector", "t", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "f", "Lld/q;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
/* loaded from: classes7.dex */
public final class i<T, R> extends g<T, R> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.q<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.d<? super k2>, Object> transform;

    /* compiled from: Merge.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f80057b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f80058c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i<T, R> f80059d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<R> f80060e;

        /* compiled from: Merge.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlinx.coroutines.flow.internal.i$a$a, reason: collision with other inner class name */
        static final class C1233a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k1.h<kotlinx.coroutines.k2> f80061b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ r0 f80062c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ i<T, R> f80063d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j<R> f80064e;

            /* compiled from: Merge.kt */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: kotlinx.coroutines.flow.internal.i$a$a$a, reason: collision with other inner class name */
            static final class C1234a extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f80065b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ i<T, R> f80066c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.j<R> f80067d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ T f80068e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1234a(i<T, R> iVar, kotlinx.coroutines.flow.j<? super R> jVar, T t4, kotlin.coroutines.d<? super C1234a> dVar) {
                    super(2, dVar);
                    this.f80066c = iVar;
                    this.f80067d = jVar;
                    this.f80068e = t4;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new C1234a(this.f80066c, this.f80067d, this.f80068e, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f80065b;
                    if (i4 == 0) {
                        a1.n(obj);
                        ld.q qVar = ((i) this.f80066c).transform;
                        kotlinx.coroutines.flow.j<R> jVar = this.f80067d;
                        T t4 = this.f80068e;
                        this.f80065b = 1;
                        if (qVar.R(jVar, t4, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException(ProtectedSandApp.s("蜘\u0001"));
                        }
                        a1.n(obj);
                    }
                    return k2.f75408a;
                }

                @Override // ld.p
                @fg.m
                public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                    return ((C1234a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                }
            }

            /* compiled from: Merge.kt */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", i = {0, 0}, l = {30}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: kotlinx.coroutines.flow.internal.i$a$a$b */
            static final class b extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                Object f80069b;

                /* renamed from: c, reason: collision with root package name */
                Object f80070c;

                /* renamed from: d, reason: collision with root package name */
                Object f80071d;

                /* renamed from: e, reason: collision with root package name */
                /* synthetic */ Object f80072e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ C1233a<T> f80073f;

                /* renamed from: g, reason: collision with root package name */
                int f80074g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(C1233a<? super T> c1233a, kotlin.coroutines.d<? super b> dVar) {
                    super(dVar);
                    this.f80073f = c1233a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f80072e = obj;
                    this.f80074g |= Integer.MIN_VALUE;
                    return this.f80073f.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C1233a(k1.h<kotlinx.coroutines.k2> hVar, r0 r0Var, i<T, R> iVar, kotlinx.coroutines.flow.j<? super R> jVar) {
                this.f80061b = hVar;
                this.f80062c = r0Var;
                this.f80063d = iVar;
                this.f80064e = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, @fg.l kotlin.coroutines.d<? super kotlin.k2> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.i.a.C1233a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    kotlinx.coroutines.flow.internal.i$a$a$b r0 = (kotlinx.coroutines.flow.internal.i.a.C1233a.b) r0
                    int r1 = r0.f80074g
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f80074g = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.i$a$a$b r0 = new kotlinx.coroutines.flow.internal.i$a$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f80072e
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f80074g
                    r3 = 1
                    if (r2 == 0) goto L3d
                    if (r2 != r3) goto L31
                    java.lang.Object r8 = r0.f80071d
                    kotlinx.coroutines.k2 r8 = (kotlinx.coroutines.k2) r8
                    java.lang.Object r8 = r0.f80070c
                    java.lang.Object r0 = r0.f80069b
                    kotlinx.coroutines.flow.internal.i$a$a r0 = (kotlinx.coroutines.flow.internal.i.a.C1233a) r0
                    kotlin.a1.n(r9)
                    goto L60
                L31:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "蜙\u0001"
                    java.lang.String r9 = com.flashget.parentalcontrol.ProtectedSandApp.s(r9)
                    r8.<init>(r9)
                    throw r8
                L3d:
                    kotlin.a1.n(r9)
                    kotlin.jvm.internal.k1$h<kotlinx.coroutines.k2> r9 = r7.f80061b
                    T r9 = r9.f75329b
                    kotlinx.coroutines.k2 r9 = (kotlinx.coroutines.k2) r9
                    if (r9 == 0) goto L5f
                    kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                    r2.<init>()
                    r9.b(r2)
                    r0.f80069b = r7
                    r0.f80070c = r8
                    r0.f80071d = r9
                    r0.f80074g = r3
                    java.lang.Object r9 = r9.j0(r0)
                    if (r9 != r1) goto L5f
                    return r1
                L5f:
                    r0 = r7
                L60:
                    kotlin.jvm.internal.k1$h<kotlinx.coroutines.k2> r9 = r0.f80061b
                    kotlinx.coroutines.r0 r1 = r0.f80062c
                    kotlinx.coroutines.t0 r3 = kotlinx.coroutines.t0.UNDISPATCHED
                    kotlinx.coroutines.flow.internal.i$a$a$a r4 = new kotlinx.coroutines.flow.internal.i$a$a$a
                    kotlinx.coroutines.flow.internal.i<T, R> r2 = r0.f80063d
                    kotlinx.coroutines.flow.j<R> r0 = r0.f80064e
                    r5 = 0
                    r4.<init>(r2, r0, r8, r5)
                    r5 = 1
                    r6 = 0
                    r2 = 0
                    kotlinx.coroutines.k2 r8 = kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
                    r9.f75329b = r8
                    kotlin.k2 r8 = kotlin.k2.f75408a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.i.a.C1233a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(i<T, R> iVar, kotlinx.coroutines.flow.j<? super R> jVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f80059d = iVar;
            this.f80060e = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f80059d, this.f80060e, dVar);
            aVar.f80058c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f80057b;
            if (i4 == 0) {
                a1.n(obj);
                r0 r0Var = (r0) this.f80058c;
                k1.h hVar = new k1.h();
                i<T, R> iVar = this.f80059d;
                kotlinx.coroutines.flow.i<S> iVar2 = iVar.flow;
                C1233a c1233a = new C1233a(hVar, r0Var, iVar, this.f80060e);
                this.f80057b = 1;
                if (iVar2.a(c1233a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("蜚\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    public /* synthetic */ i(ld.q qVar, kotlinx.coroutines.flow.i iVar, kotlin.coroutines.g gVar, int i4, kotlinx.coroutines.channels.i iVar2, int i5, kotlin.jvm.internal.w wVar) {
        this(qVar, iVar, (i5 & 4) != 0 ? kotlin.coroutines.i.f75057b : gVar, (i5 & 8) != 0 ? -2 : i4, (i5 & 16) != 0 ? kotlinx.coroutines.channels.i.SUSPEND : iVar2);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @fg.l
    protected d<R> k(@fg.l kotlin.coroutines.g context, int capacity, @fg.l kotlinx.coroutines.channels.i onBufferOverflow) {
        return new i(this.transform, this.flow, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.g
    @fg.m
    protected Object t(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object g4 = s0.g(new a(this, jVar, null), dVar);
        return g4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? g4 : k2.f75408a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@fg.l ld.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, @fg.l kotlinx.coroutines.flow.i<? extends T> iVar, @fg.l kotlin.coroutines.g gVar, int i4, @fg.l kotlinx.coroutines.channels.i iVar2) {
        super(iVar, gVar, i4, iVar2);
        this.transform = qVar;
    }
}
