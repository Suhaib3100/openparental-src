package kotlinx.coroutines.flow;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.n2;

/* compiled from: Share.kt */
@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\r\u001aM\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a1\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aC\u0010\u001f\u001a\u00020\u001e\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b!\u0010\"\u001a#\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000#¢\u0006\u0004\b$\u0010%\u001aU\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2-\u0010+\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0(\u0012\u0006\u0012\u0004\u0018\u00010)0&¢\u0006\u0002\b*ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/r0;", "scope", "Lkotlinx/coroutines/flow/o0;", "started", "", "replay", "Lkotlinx/coroutines/flow/i0;", "g", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/r0;Lkotlinx/coroutines/flow/o0;I)Lkotlinx/coroutines/flow/i0;", "Lkotlinx/coroutines/flow/n0;", "c", "(Lkotlinx/coroutines/flow/i;I)Lkotlinx/coroutines/flow/n0;", "Lkotlin/coroutines/g;", "context", "upstream", "Lkotlinx/coroutines/flow/d0;", "shared", "initialValue", "Lkotlinx/coroutines/k2;", "d", "(Lkotlinx/coroutines/r0;Lkotlin/coroutines/g;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/d0;Lkotlinx/coroutines/flow/o0;Ljava/lang/Object;)Lkotlinx/coroutines/k2;", "Lkotlinx/coroutines/flow/t0;", "j", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/r0;Lkotlinx/coroutines/flow/o0;Ljava/lang/Object;)Lkotlinx/coroutines/flow/t0;", "i", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/r0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/y;", "result", "Lkotlin/k2;", "e", "(Lkotlinx/coroutines/r0;Lkotlin/coroutines/g;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/y;)V", "a", "(Lkotlinx/coroutines/flow/d0;)Lkotlinx/coroutines/flow/i0;", "Lkotlinx/coroutines/flow/e0;", "b", "(Lkotlinx/coroutines/flow/e0;)Lkotlinx/coroutines/flow/t0;", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/j;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "action", "f", "(Lkotlinx/coroutines/flow/i0;Lld/p;)Lkotlinx/coroutines/flow/i0;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@r1({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/FlowKt__ShareKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,426:1\n1#2:427\n*E\n"})
/* loaded from: classes7.dex */
final /* synthetic */ class z {

    /* compiled from: Share.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {214, 218, 219, 225}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f80672b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ o0 f80673c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i<T> f80674d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d0<T> f80675e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f80676f;

        /* compiled from: Share.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: kotlinx.coroutines.flow.z$a$a, reason: collision with other inner class name */
        static final class C1256a extends kotlin.coroutines.jvm.internal.o implements ld.p<Integer, kotlin.coroutines.d<? super Boolean>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f80677b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ int f80678c;

            C1256a(kotlin.coroutines.d<? super C1256a> dVar) {
                super(2, dVar);
            }

            @fg.m
            public final Object a(int i4, @fg.m kotlin.coroutines.d<? super Boolean> dVar) {
                return ((C1256a) create(Integer.valueOf(i4), dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                C1256a c1256a = new C1256a(2, dVar);
                c1256a.f80678c = ((Number) obj).intValue();
                return c1256a;
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ Object invoke(Integer num, kotlin.coroutines.d<? super Boolean> dVar) {
                return a(num.intValue(), dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                if (this.f80677b != 0) {
                    throw new IllegalStateException(ProtectedSandApp.s("螹\u0001"));
                }
                a1.n(obj);
                return Boolean.valueOf(this.f80678c > 0);
            }
        }

        /* compiled from: Share.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/flow/m0;", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/m0;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<m0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f80679b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f80680c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ i<T> f80681d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ d0<T> f80682e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ T f80683f;

            /* compiled from: Share.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: kotlinx.coroutines.flow.z$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C1257a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f80684a;

                static {
                    int[] iArr = new int[m0.values().length];
                    try {
                        iArr[m0.START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[m0.STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[m0.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f80684a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(i<? extends T> iVar, d0<T> d0Var, T t4, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f80681d = iVar;
                this.f80682e = d0Var;
                this.f80683f = t4;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l m0 m0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((b) create(m0Var, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                b bVar = new b(this.f80681d, this.f80682e, this.f80683f, dVar);
                bVar.f80680c = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f80679b;
                if (i4 == 0) {
                    a1.n(obj);
                    int i5 = C1257a.f80684a[((m0) this.f80680c).ordinal()];
                    if (i5 == 1) {
                        i<T> iVar = this.f80681d;
                        j jVar = this.f80682e;
                        this.f80679b = 1;
                        if (iVar.a(jVar, this) == aVar) {
                            return aVar;
                        }
                    } else if (i5 == 3) {
                        T t4 = this.f80683f;
                        if (t4 == k0.f80194a) {
                            this.f80682e.j();
                        } else {
                            this.f80682e.b(t4);
                        }
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("螺\u0001"));
                    }
                    a1.n(obj);
                }
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(o0 o0Var, i<? extends T> iVar, d0<T> d0Var, T t4, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f80673c = o0Var;
            this.f80674d = iVar;
            this.f80675e = d0Var;
            this.f80676f = t4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new a(this.f80673c, this.f80674d, this.f80675e, this.f80676f, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x006a A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r7.f80672b
                r2 = 4
                r3 = 3
                r4 = 1
                r5 = 2
                if (r1 == 0) goto L27
                if (r1 == r4) goto L23
                if (r1 == r5) goto L1f
                if (r1 == r3) goto L23
                if (r1 != r2) goto L13
                goto L23
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "螻\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                r8.<init>(r0)
                throw r8
            L1f:
                kotlin.a1.n(r8)
                goto L5e
            L23:
                kotlin.a1.n(r8)
                goto L8f
            L27:
                kotlin.a1.n(r8)
                kotlinx.coroutines.flow.o0 r8 = r7.f80673c
                kotlinx.coroutines.flow.o0$a r1 = kotlinx.coroutines.flow.o0.INSTANCE
                kotlinx.coroutines.flow.o0 r6 = r1.c()
                if (r8 != r6) goto L41
                kotlinx.coroutines.flow.i<T> r8 = r7.f80674d
                kotlinx.coroutines.flow.d0<T> r1 = r7.f80675e
                r7.f80672b = r4
                java.lang.Object r8 = r8.a(r1, r7)
                if (r8 != r0) goto L8f
                return r0
            L41:
                kotlinx.coroutines.flow.o0 r8 = r7.f80673c
                kotlinx.coroutines.flow.o0 r1 = r1.d()
                r4 = 0
                if (r8 != r1) goto L6b
                kotlinx.coroutines.flow.d0<T> r8 = r7.f80675e
                kotlinx.coroutines.flow.t0 r8 = r8.c()
                kotlinx.coroutines.flow.z$a$a r1 = new kotlinx.coroutines.flow.z$a$a
                r1.<init>(r5, r4)
                r7.f80672b = r5
                java.lang.Object r8 = kotlinx.coroutines.flow.y.b(r8, r1, r7)
                if (r8 != r0) goto L5e
                return r0
            L5e:
                kotlinx.coroutines.flow.i<T> r8 = r7.f80674d
                kotlinx.coroutines.flow.d0<T> r1 = r7.f80675e
                r7.f80672b = r3
                java.lang.Object r8 = r8.a(r1, r7)
                if (r8 != r0) goto L8f
                return r0
            L6b:
                kotlinx.coroutines.flow.o0 r8 = r7.f80673c
                kotlinx.coroutines.flow.d0<T> r1 = r7.f80675e
                kotlinx.coroutines.flow.t0 r1 = r1.c()
                kotlinx.coroutines.flow.i r8 = r8.a(r1)
                kotlinx.coroutines.flow.i r8 = kotlinx.coroutines.flow.s.a(r8)
                kotlinx.coroutines.flow.z$a$b r1 = new kotlinx.coroutines.flow.z$a$b
                kotlinx.coroutines.flow.i<T> r3 = r7.f80674d
                kotlinx.coroutines.flow.d0<T> r5 = r7.f80675e
                T r6 = r7.f80676f
                r1.<init>(r3, r5, r6, r4)
                r7.f80672b = r2
                java.lang.Object r8 = kotlinx.coroutines.flow.n.f(r8, r1, r7)
                if (r8 != r0) goto L8f
                return r0
            L8f:
                kotlin.k2 r8 = kotlin.k2.f75408a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.z.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: Share.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {}, l = {340}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f80685b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f80686c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i<T> f80687d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.y<t0<T>> f80688e;

        /* compiled from: Share.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/FlowKt__ShareKt$launchSharingDeferred$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,426:1\n1#2:427\n*E\n"})
        static final class a<T> implements j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k1.h<e0<T>> f80689b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.r0 f80690c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.y<t0<T>> f80691d;

            a(k1.h<e0<T>> hVar, kotlinx.coroutines.r0 r0Var, kotlinx.coroutines.y<t0<T>> yVar) {
                this.f80689b = hVar;
                this.f80690c = r0Var;
                this.f80691d = yVar;
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [T, kotlinx.coroutines.flow.e0, kotlinx.coroutines.flow.t0] */
            @Override // kotlinx.coroutines.flow.j
            @fg.m
            public final Object emit(T t4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
                k2 k2Var;
                e0<T> e0Var = this.f80689b.f75329b;
                if (e0Var != null) {
                    e0Var.setValue(t4);
                    k2Var = k2.f75408a;
                } else {
                    k2Var = null;
                }
                if (k2Var == null) {
                    kotlinx.coroutines.r0 r0Var = this.f80690c;
                    k1.h<e0<T>> hVar = this.f80689b;
                    kotlinx.coroutines.y<t0<T>> yVar = this.f80691d;
                    ?? r4 = (T) v0.a(t4);
                    yVar.I(new g0(r4, n2.B(r0Var.getCoroutineContext())));
                    hVar.f75329b = r4;
                }
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(i<? extends T> iVar, kotlinx.coroutines.y<t0<T>> yVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f80687d = iVar;
            this.f80688e = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f80687d, this.f80688e, dVar);
            bVar.f80686c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f80685b;
            try {
                if (i4 == 0) {
                    a1.n(obj);
                    kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f80686c;
                    k1.h hVar = new k1.h();
                    i<T> iVar = this.f80687d;
                    a aVar2 = new a(hVar, r0Var, this.f80688e);
                    this.f80685b = 1;
                    if (iVar.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("螼\u0001"));
                    }
                    a1.n(obj);
                }
                return k2.f75408a;
            } catch (Throwable th) {
                this.f80688e.e(th);
                throw th;
            }
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    @fg.l
    public static final <T> i0<T> a(@fg.l d0<T> d0Var) {
        return new f0(d0Var, null);
    }

    @fg.l
    public static final <T> t0<T> b(@fg.l e0<T> e0Var) {
        return new g0(e0Var, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        if (r3 == 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final <T> kotlinx.coroutines.flow.n0<T> c(kotlinx.coroutines.flow.i<? extends T> r7, int r8) {
        /*
            kotlinx.coroutines.channels.l$b r0 = kotlinx.coroutines.channels.l.INSTANCE
            int r0 = r0.a()
            if (r8 >= r0) goto L9
            goto La
        L9:
            r0 = r8
        La:
            int r0 = r0 - r8
            boolean r1 = r7 instanceof kotlinx.coroutines.flow.internal.d
            if (r1 == 0) goto L3c
            r1 = r7
            kotlinx.coroutines.flow.internal.d r1 = (kotlinx.coroutines.flow.internal.d) r1
            kotlinx.coroutines.flow.i r2 = r1.l()
            if (r2 == 0) goto L3c
            kotlinx.coroutines.flow.n0 r7 = new kotlinx.coroutines.flow.n0
            int r3 = r1.capacity
            r4 = -3
            if (r3 == r4) goto L26
            r4 = -2
            if (r3 == r4) goto L26
            if (r3 == 0) goto L26
            r0 = r3
            goto L34
        L26:
            kotlinx.coroutines.channels.i r4 = r1.onBufferOverflow
            kotlinx.coroutines.channels.i r5 = kotlinx.coroutines.channels.i.SUSPEND
            r6 = 0
            if (r4 != r5) goto L31
            if (r3 != 0) goto L34
        L2f:
            r0 = r6
            goto L34
        L31:
            if (r8 != 0) goto L2f
            r0 = 1
        L34:
            kotlinx.coroutines.channels.i r8 = r1.onBufferOverflow
            kotlin.coroutines.g r1 = r1.context
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3c:
            kotlinx.coroutines.flow.n0 r8 = new kotlinx.coroutines.flow.n0
            kotlinx.coroutines.channels.i r1 = kotlinx.coroutines.channels.i.SUSPEND
            kotlin.coroutines.i r2 = kotlin.coroutines.i.f75057b
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.z.c(kotlinx.coroutines.flow.i, int):kotlinx.coroutines.flow.n0");
    }

    private static final <T> kotlinx.coroutines.k2 d(kotlinx.coroutines.r0 r0Var, kotlin.coroutines.g gVar, i<? extends T> iVar, d0<T> d0Var, o0 o0Var, T t4) {
        return kotlinx.coroutines.i.d(r0Var, gVar, kotlin.jvm.internal.l0.g(o0Var, o0.INSTANCE.c()) ? kotlinx.coroutines.t0.DEFAULT : kotlinx.coroutines.t0.UNDISPATCHED, new a(o0Var, iVar, d0Var, t4, null));
    }

    private static final <T> void e(kotlinx.coroutines.r0 r0Var, kotlin.coroutines.g gVar, i<? extends T> iVar, kotlinx.coroutines.y<t0<T>> yVar) {
        kotlinx.coroutines.k.f(r0Var, gVar, null, new b(iVar, yVar, null), 2, null);
    }

    @fg.l
    public static final <T> i0<T> f(@fg.l i0<? extends T> i0Var, @fg.l ld.p<? super j<? super T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        return new y0(i0Var, pVar);
    }

    @fg.l
    public static final <T> i0<T> g(@fg.l i<? extends T> iVar, @fg.l kotlinx.coroutines.r0 r0Var, @fg.l o0 o0Var, int i4) {
        n0 c5 = c(iVar, i4);
        d0 a5 = k0.a(i4, c5.extraBufferCapacity, c5.onBufferOverflow);
        return new f0(a5, d(r0Var, c5.context, c5.upstream, a5, o0Var, k0.f80194a));
    }

    public static i0 h(i iVar, kotlinx.coroutines.r0 r0Var, o0 o0Var, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        return g(iVar, r0Var, o0Var, i4);
    }

    @fg.m
    public static final <T> Object i(@fg.l i<? extends T> iVar, @fg.l kotlinx.coroutines.r0 r0Var, @fg.l kotlin.coroutines.d<? super t0<? extends T>> dVar) {
        n0 c5 = c(iVar, 1);
        kotlinx.coroutines.y c6 = kotlinx.coroutines.a0.c(null, 1, null);
        e(r0Var, c5.context, c5.upstream, c6);
        return c6.z(dVar);
    }

    @fg.l
    public static final <T> t0<T> j(@fg.l i<? extends T> iVar, @fg.l kotlinx.coroutines.r0 r0Var, @fg.l o0 o0Var, T t4) {
        n0 c5 = c(iVar, 1);
        e0 a5 = v0.a(t4);
        return new g0(a5, d(r0Var, c5.context, c5.upstream, a5, o0Var, t4));
    }
}
