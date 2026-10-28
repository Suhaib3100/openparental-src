package androidx.paging;

import kotlin.Metadata;
import kotlin.k2;
import kotlinx.coroutines.channels.e0;

/* compiled from: SimpleChannelFlow.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002-\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"T", "Lkotlin/Function2;", "Landroidx/paging/n1;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "block", "Lkotlinx/coroutines/flow/i;", "a", "(Lld/p;)Lkotlinx/coroutines/flow/i;", "paging-common"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class m1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SimpleChannelFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1", f = "SimpleChannelFlow.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 5, 1})
    static final class a<T> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31998b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f31999c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<n1<T>, kotlin.coroutines.d<? super k2>, Object> f32000d;

        /* compiled from: SimpleChannelFlow.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1", f = "SimpleChannelFlow.kt", i = {0, 1}, l = {64, 65}, m = "invokeSuspend", n = {"producer", "producer"}, s = {"L$0", "L$0"})
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 5, 1})
        /* renamed from: androidx.paging.m1$a$a, reason: collision with other inner class name */
        static final class C0551a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            Object f32001b;

            /* renamed from: c, reason: collision with root package name */
            int f32002c;

            /* renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f32003d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j<T> f32004e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ld.p<n1<T>, kotlin.coroutines.d<? super k2>, Object> f32005f;

            /* compiled from: SimpleChannelFlow.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1", f = "SimpleChannelFlow.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 5, 1})
            /* renamed from: androidx.paging.m1$a$a$a, reason: collision with other inner class name */
            static final class C0552a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f32006b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.channels.l<T> f32007c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ ld.p<n1<T>, kotlin.coroutines.d<? super k2>, Object> f32008d;

                /* compiled from: SimpleChannelFlow.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1$1", f = "SimpleChannelFlow.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
                @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 5, 1})
                /* renamed from: androidx.paging.m1$a$a$a$a, reason: collision with other inner class name */
                static final class C0553a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

                    /* renamed from: b, reason: collision with root package name */
                    int f32009b;

                    /* renamed from: c, reason: collision with root package name */
                    private /* synthetic */ Object f32010c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ kotlinx.coroutines.channels.l<T> f32011d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ ld.p<n1<T>, kotlin.coroutines.d<? super k2>, Object> f32012e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0553a(kotlinx.coroutines.channels.l<T> lVar, ld.p<? super n1<T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, kotlin.coroutines.d<? super C0553a> dVar) {
                        super(2, dVar);
                        this.f32011d = lVar;
                        this.f32012e = pVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.l
                    public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                        C0553a c0553a = new C0553a(this.f32011d, this.f32012e, dVar);
                        c0553a.f32010c = obj;
                        return c0553a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    public final Object invokeSuspend(@fg.l Object obj) {
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                        int i4 = this.f32009b;
                        if (i4 == 0) {
                            kotlin.a1.n(obj);
                            o1 o1Var = new o1((kotlinx.coroutines.r0) this.f32010c, this.f32011d);
                            ld.p<n1<T>, kotlin.coroutines.d<? super k2>, Object> pVar = this.f32012e;
                            this.f32009b = 1;
                            if (pVar.invoke(o1Var, this) == aVar) {
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
                        return ((C0553a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0552a(kotlinx.coroutines.channels.l<T> lVar, ld.p<? super n1<T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, kotlin.coroutines.d<? super C0552a> dVar) {
                    super(2, dVar);
                    this.f32007c = lVar;
                    this.f32008d = pVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new C0552a(this.f32007c, this.f32008d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f32006b;
                    try {
                        if (i4 == 0) {
                            kotlin.a1.n(obj);
                            C0553a c0553a = new C0553a(this.f32007c, this.f32008d, null);
                            this.f32006b = 1;
                            if (kotlinx.coroutines.s0.g(c0553a, this) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a1.n(obj);
                        }
                        e0.a.a(this.f32007c, null, 1, null);
                    } catch (Throwable th) {
                        this.f32007c.b0(th);
                    }
                    return k2.f75408a;
                }

                @Override // ld.p
                @fg.m
                public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                    return ((C0552a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0551a(kotlinx.coroutines.flow.j<? super T> jVar, ld.p<? super n1<T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, kotlin.coroutines.d<? super C0551a> dVar) {
                super(2, dVar);
                this.f32004e = jVar;
                this.f32005f = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                C0551a c0551a = new C0551a(this.f32004e, this.f32005f, dVar);
                c0551a.f32003d = obj;
                return c0551a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:11:0x005d  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x005c A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0079 -> B:6:0x0018). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r13) {
                /*
                    r12 = this;
                    kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r1 = r12.f32002c
                    r2 = 2
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L2f
                    if (r1 == r3) goto L23
                    if (r1 != r2) goto L1b
                    java.lang.Object r1 = r12.f32001b
                    kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                    java.lang.Object r5 = r12.f32003d
                    kotlinx.coroutines.k2 r5 = (kotlinx.coroutines.k2) r5
                    kotlin.a1.n(r13)
                L18:
                    r13 = r1
                    r1 = r5
                    goto L50
                L1b:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L23:
                    java.lang.Object r1 = r12.f32001b
                    kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                    java.lang.Object r5 = r12.f32003d
                    kotlinx.coroutines.k2 r5 = (kotlinx.coroutines.k2) r5
                    kotlin.a1.n(r13)
                    goto L61
                L2f:
                    kotlin.a1.n(r13)
                    java.lang.Object r13 = r12.f32003d
                    r5 = r13
                    kotlinx.coroutines.r0 r5 = (kotlinx.coroutines.r0) r5
                    r13 = 0
                    r1 = 6
                    kotlinx.coroutines.channels.l r13 = kotlinx.coroutines.channels.o.d(r13, r4, r4, r1, r4)
                    androidx.paging.m1$a$a$a r8 = new androidx.paging.m1$a$a$a
                    ld.p<androidx.paging.n1<T>, kotlin.coroutines.d<? super kotlin.k2>, java.lang.Object> r1 = r12.f32005f
                    r8.<init>(r13, r1, r4)
                    r9 = 3
                    r10 = 0
                    r6 = 0
                    r7 = 0
                    kotlinx.coroutines.k2 r1 = kotlinx.coroutines.i.e(r5, r6, r7, r8, r9, r10)
                    kotlinx.coroutines.channels.n r13 = r13.iterator()
                L50:
                    r12.f32003d = r1
                    r12.f32001b = r13
                    r12.f32002c = r3
                    java.lang.Object r5 = r13.c(r12)
                    if (r5 != r0) goto L5d
                    return r0
                L5d:
                    r11 = r1
                    r1 = r13
                    r13 = r5
                    r5 = r11
                L61:
                    java.lang.Boolean r13 = (java.lang.Boolean) r13
                    boolean r13 = r13.booleanValue()
                    if (r13 == 0) goto L7c
                    java.lang.Object r13 = r1.next()
                    kotlinx.coroutines.flow.j<T> r6 = r12.f32004e
                    r12.f32003d = r5
                    r12.f32001b = r1
                    r12.f32002c = r2
                    java.lang.Object r13 = r6.emit(r13, r12)
                    if (r13 != r0) goto L18
                    return r0
                L7c:
                    kotlinx.coroutines.k2.a.b(r5, r4, r3, r4)
                    kotlin.k2 r13 = kotlin.k2.f75408a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.m1.a.C0551a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((C0551a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.p<? super n1<T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f32000d = pVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.flow.j<? super T> jVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f32000d, dVar);
            aVar.f31999c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f31998b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                C0551a c0551a = new C0551a((kotlinx.coroutines.flow.j) this.f31999c, this.f32000d, null);
                this.f31998b = 1;
                if (kotlinx.coroutines.s0.g(c0551a, this) == aVar) {
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

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<T> a(@fg.l ld.p<? super n1<T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> block) {
        kotlinx.coroutines.flow.i<T> d5;
        kotlin.jvm.internal.l0.p(block, "block");
        d5 = kotlinx.coroutines.flow.p.d(kotlinx.coroutines.flow.k.J0(new a(block, null)), -2, null, 2, null);
        return d5;
    }
}
