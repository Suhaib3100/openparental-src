package kotlinx.coroutines.flow;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.k1;
import kotlin.m2;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.q2;

/* compiled from: Share.kt */
@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a6\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a1\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aC\u0010\u001e\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00160\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010\u001a\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000!\u001aU\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2-\u0010(\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0%\u0012\u0006\u0012\u0004\u0018\u00010&0#¢\u0006\u0002\b'ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/u0;", "scope", "Lkotlinx/coroutines/flow/o0;", "started", "", "replay", "Lkotlinx/coroutines/flow/i0;", "g", "Lkotlinx/coroutines/flow/n0;", "c", "(Lkotlinx/coroutines/flow/i;I)Lkotlinx/coroutines/flow/n0;", "Lkotlin/coroutines/g;", "context", "upstream", "Lkotlinx/coroutines/flow/d0;", "shared", "initialValue", "Lkotlinx/coroutines/n2;", "d", "(Lkotlinx/coroutines/u0;Lkotlin/coroutines/g;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/d0;Lkotlinx/coroutines/flow/o0;Ljava/lang/Object;)Lkotlinx/coroutines/n2;", "Lkotlinx/coroutines/flow/t0;", "j", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/u0;Lkotlinx/coroutines/flow/o0;Ljava/lang/Object;)Lkotlinx/coroutines/flow/t0;", "i", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/u0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/a0;", "result", "Lkotlin/m2;", "e", "(Lkotlinx/coroutines/u0;Lkotlin/coroutines/g;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/a0;)V", "a", "Lkotlinx/coroutines/flow/e0;", "b", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/j;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "action", "f", "(Lkotlinx/coroutines/flow/i0;Lq3/p;)Lkotlinx/coroutines/flow/i0;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes5.dex */
final /* synthetic */ class z {

    /* compiled from: Share.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {214, 218, 219, 225}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class a extends SuspendLambda implements q3.p<kotlinx.coroutines.u0, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f28626s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ o0 f28627t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ i<T> f28628u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ d0<T> f28629v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ T f28630w;

        /* compiled from: Share.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.flow.z$a$a, reason: collision with other inner class name */
        static final class C0449a extends SuspendLambda implements q3.p<Integer, Continuation<? super Boolean>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f28631s;

            /* renamed from: t, reason: collision with root package name */
            /* synthetic */ int f28632t;

            C0449a(Continuation<? super C0449a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.f28631s != 0) {
                    throw new IllegalStateException(ProtectedSandApp.s("鄫"));
                }
                a1.n(obj);
                return Boolean.valueOf(this.f28632t > 0);
            }

            @d5.e
            public final Object R(int i5, @d5.e Continuation<? super Boolean> continuation) {
                return ((C0449a) c(Integer.valueOf(i5), continuation)).A(m2.f23662a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.d
            public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
                C0449a c0449a = new C0449a(continuation);
                c0449a.f28632t = ((Number) obj).intValue();
                return c0449a;
            }

            @Override // q3.p
            public /* bridge */ /* synthetic */ Object g0(Integer num, Continuation<? super Boolean> continuation) {
                return R(num.intValue(), continuation);
            }
        }

        /* compiled from: Share.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/flow/m0;", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        static final class b extends SuspendLambda implements q3.p<m0, Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f28633s;

            /* renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f28634t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ i<T> f28635u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ d0<T> f28636v;

            /* renamed from: w, reason: collision with root package name */
            final /* synthetic */ T f28637w;

            /* compiled from: Share.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: kotlinx.coroutines.flow.z$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public /* synthetic */ class C0450a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f28638a;

                static {
                    int[] iArr = new int[m0.values().length];
                    iArr[m0.START.ordinal()] = 1;
                    iArr[m0.STOP.ordinal()] = 2;
                    iArr[m0.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    f28638a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(i<? extends T> iVar, d0<T> d0Var, T t5, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f28635u = iVar;
                this.f28636v = d0Var;
                this.f28637w = t5;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.f28633s;
                if (i5 == 0) {
                    a1.n(obj);
                    int i6 = C0450a.f28638a[((m0) this.f28634t).ordinal()];
                    if (i6 == 1) {
                        i<T> iVar = this.f28635u;
                        j jVar = this.f28636v;
                        this.f28633s = 1;
                        if (iVar.a(jVar, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else if (i6 == 3) {
                        T t5 = this.f28637w;
                        if (t5 == k0.f28161a) {
                            this.f28636v.j();
                        } else {
                            this.f28636v.k(t5);
                        }
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("鄬"));
                    }
                    a1.n(obj);
                }
                return m2.f23662a;
            }

            @Override // q3.p
            @d5.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object g0(@d5.d m0 m0Var, @d5.e Continuation<? super m2> continuation) {
                return ((b) c(m0Var, continuation)).A(m2.f23662a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.d
            public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
                b bVar = new b(this.f28635u, this.f28636v, this.f28637w, continuation);
                bVar.f28634t = obj;
                return bVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(o0 o0Var, i<? extends T> iVar, d0<T> d0Var, T t5, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f28627t = o0Var;
            this.f28628u = iVar;
            this.f28629v = d0Var;
            this.f28630w = t5;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x006a A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r7.f28626s
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L27
                if (r1 == r5) goto L23
                if (r1 == r4) goto L1f
                if (r1 == r3) goto L23
                if (r1 != r2) goto L13
                goto L23
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "鄭"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
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
                kotlinx.coroutines.flow.o0 r8 = r7.f28627t
                kotlinx.coroutines.flow.o0$a r1 = kotlinx.coroutines.flow.o0.INSTANCE
                kotlinx.coroutines.flow.o0 r6 = r1.c()
                if (r8 != r6) goto L41
                kotlinx.coroutines.flow.i<T> r8 = r7.f28628u
                kotlinx.coroutines.flow.d0<T> r1 = r7.f28629v
                r7.f28626s = r5
                java.lang.Object r8 = r8.a(r1, r7)
                if (r8 != r0) goto L8f
                return r0
            L41:
                kotlinx.coroutines.flow.o0 r8 = r7.f28627t
                kotlinx.coroutines.flow.o0 r1 = r1.d()
                r5 = 0
                if (r8 != r1) goto L6b
                kotlinx.coroutines.flow.d0<T> r8 = r7.f28629v
                kotlinx.coroutines.flow.t0 r8 = r8.t()
                kotlinx.coroutines.flow.z$a$a r1 = new kotlinx.coroutines.flow.z$a$a
                r1.<init>(r5)
                r7.f28626s = r4
                java.lang.Object r8 = kotlinx.coroutines.flow.y.b(r8, r1, r7)
                if (r8 != r0) goto L5e
                return r0
            L5e:
                kotlinx.coroutines.flow.i<T> r8 = r7.f28628u
                kotlinx.coroutines.flow.d0<T> r1 = r7.f28629v
                r7.f28626s = r3
                java.lang.Object r8 = r8.a(r1, r7)
                if (r8 != r0) goto L8f
                return r0
            L6b:
                kotlinx.coroutines.flow.o0 r8 = r7.f28627t
                kotlinx.coroutines.flow.d0<T> r1 = r7.f28629v
                kotlinx.coroutines.flow.t0 r1 = r1.t()
                kotlinx.coroutines.flow.i r8 = r8.a(r1)
                kotlinx.coroutines.flow.i r8 = kotlinx.coroutines.flow.s.a(r8)
                kotlinx.coroutines.flow.z$a$b r1 = new kotlinx.coroutines.flow.z$a$b
                kotlinx.coroutines.flow.i<T> r3 = r7.f28628u
                kotlinx.coroutines.flow.d0<T> r4 = r7.f28629v
                T r6 = r7.f28630w
                r1.<init>(r3, r4, r6, r5)
                r7.f28626s = r2
                java.lang.Object r8 = kotlinx.coroutines.flow.n.f(r8, r1, r7)
                if (r8 != r0) goto L8f
                return r0
            L8f:
                kotlin.m2 r8 = kotlin.m2.f23662a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.z.a.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d kotlinx.coroutines.u0 u0Var, @d5.e Continuation<? super m2> continuation) {
            return ((a) c(u0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            return new a(this.f28627t, this.f28628u, this.f28629v, this.f28630w, continuation);
        }
    }

    /* compiled from: Share.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {}, l = {340}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class b extends SuspendLambda implements q3.p<kotlinx.coroutines.u0, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f28639s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f28640t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ i<T> f28641u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.a0<t0<T>> f28642v;

        /* compiled from: Share.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes5.dex */
        static final class a<T> implements j {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ k1.h<e0<T>> f28643o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.u0 f28644p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.a0<t0<T>> f28645q;

            a(k1.h<e0<T>> hVar, kotlinx.coroutines.u0 u0Var, kotlinx.coroutines.a0<t0<T>> a0Var) {
                this.f28643o = hVar;
                this.f28644p = u0Var;
                this.f28645q = a0Var;
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [T, kotlinx.coroutines.flow.e0, kotlinx.coroutines.flow.t0] */
            @Override // kotlinx.coroutines.flow.j
            @d5.e
            public final Object b(T t5, @d5.d Continuation<? super m2> continuation) {
                m2 m2Var;
                e0<T> e0Var = this.f28643o.f23572o;
                if (e0Var != null) {
                    e0Var.setValue(t5);
                    m2Var = m2.f23662a;
                } else {
                    m2Var = null;
                }
                if (m2Var == null) {
                    kotlinx.coroutines.u0 u0Var = this.f28644p;
                    k1.h<e0<T>> hVar = this.f28643o;
                    kotlinx.coroutines.a0<t0<T>> a0Var = this.f28645q;
                    ?? r42 = (T) v0.a(t5);
                    a0Var.i0(new g0(r42, q2.B(u0Var.getCoroutineContext())));
                    hVar.f23572o = r42;
                }
                return m2.f23662a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(i<? extends T> iVar, kotlinx.coroutines.a0<t0<T>> a0Var, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f28641u = iVar;
            this.f28642v = a0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f28639s;
            try {
                if (i5 == 0) {
                    a1.n(obj);
                    kotlinx.coroutines.u0 u0Var = (kotlinx.coroutines.u0) this.f28640t;
                    k1.h hVar = new k1.h();
                    i<T> iVar = this.f28641u;
                    a aVar = new a(hVar, u0Var, this.f28642v);
                    this.f28639s = 1;
                    if (iVar.a(aVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("鄮"));
                    }
                    a1.n(obj);
                }
                return m2.f23662a;
            } catch (Throwable th) {
                this.f28642v.k(th);
                throw th;
            }
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d kotlinx.coroutines.u0 u0Var, @d5.e Continuation<? super m2> continuation) {
            return ((b) c(u0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            b bVar = new b(this.f28641u, this.f28642v, continuation);
            bVar.f28640t = obj;
            return bVar;
        }
    }

    @d5.d
    public static final <T> i0<T> a(@d5.d d0<T> d0Var) {
        return new f0(d0Var, null);
    }

    @d5.d
    public static final <T> t0<T> b(@d5.d e0<T> e0Var) {
        return new g0(e0Var, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        if (r3 == 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final <T> kotlinx.coroutines.flow.n0<T> c(kotlinx.coroutines.flow.i<? extends T> r7, int r8) {
        /*
            kotlinx.coroutines.channels.n$b r0 = kotlinx.coroutines.channels.n.INSTANCE
            int r0 = r0.a()
            if (r8 >= r0) goto L9
            goto La
        L9:
            r0 = r8
        La:
            int r0 = r0 - r8
            boolean r1 = r7 instanceof kotlinx.coroutines.flow.internal.d
            if (r1 == 0) goto L3d
            r1 = r7
            kotlinx.coroutines.flow.internal.d r1 = (kotlinx.coroutines.flow.internal.d) r1
            kotlinx.coroutines.flow.i r2 = r1.l()
            if (r2 == 0) goto L3d
            kotlinx.coroutines.flow.n0 r7 = new kotlinx.coroutines.flow.n0
            int r3 = r1.capacity
            r4 = -3
            if (r3 == r4) goto L26
            r4 = -2
            if (r3 == r4) goto L26
            if (r3 == 0) goto L26
            r0 = r3
            goto L35
        L26:
            kotlinx.coroutines.channels.m r4 = r1.onBufferOverflow
            kotlinx.coroutines.channels.m r5 = kotlinx.coroutines.channels.m.SUSPEND
            r6 = 0
            if (r4 != r5) goto L30
            if (r3 != 0) goto L35
            goto L34
        L30:
            if (r8 != 0) goto L34
            r0 = 1
            goto L35
        L34:
            r0 = r6
        L35:
            kotlinx.coroutines.channels.m r8 = r1.onBufferOverflow
            kotlin.coroutines.g r1 = r1.context
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3d:
            kotlinx.coroutines.flow.n0 r8 = new kotlinx.coroutines.flow.n0
            kotlinx.coroutines.channels.m r1 = kotlinx.coroutines.channels.m.SUSPEND
            kotlin.coroutines.i r2 = kotlin.coroutines.EmptyCoroutineContext.f23294o
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.z.c(kotlinx.coroutines.flow.i, int):kotlinx.coroutines.flow.n0");
    }

    private static final <T> n2 d(kotlinx.coroutines.u0 u0Var, CoroutineContext coroutineContext, i<? extends T> iVar, d0<T> d0Var, o0 o0Var, T t5) {
        return kotlinx.coroutines.j.d(u0Var, coroutineContext, kotlin.jvm.internal.l0.g(o0Var, o0.INSTANCE.c()) ? kotlinx.coroutines.w0.DEFAULT : kotlinx.coroutines.w0.UNDISPATCHED, new a(o0Var, iVar, d0Var, t5, null));
    }

    private static final <T> void e(kotlinx.coroutines.u0 u0Var, CoroutineContext coroutineContext, i<? extends T> iVar, kotlinx.coroutines.a0<t0<T>> a0Var) {
        kotlinx.coroutines.l.f(u0Var, coroutineContext, null, new b(iVar, a0Var, null), 2, null);
    }

    @d5.d
    public static final <T> i0<T> f(@d5.d i0<? extends T> i0Var, @d5.d q3.p<? super j<? super T>, ? super Continuation<? super m2>, ? extends Object> pVar) {
        return new y0(i0Var, pVar);
    }

    @d5.d
    public static final <T> i0<T> g(@d5.d i<? extends T> iVar, @d5.d kotlinx.coroutines.u0 u0Var, @d5.d o0 o0Var, int i5) {
        n0 c6 = c(iVar, i5);
        d0 a6 = k0.a(i5, c6.extraBufferCapacity, c6.onBufferOverflow);
        return new f0(a6, d(u0Var, c6.context, c6.upstream, a6, o0Var, k0.f28161a));
    }

    public static i0 h(i iVar, kotlinx.coroutines.u0 u0Var, o0 o0Var, int i5, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            i5 = 0;
        }
        return g(iVar, u0Var, o0Var, i5);
    }

    @d5.e
    public static final <T> Object i(@d5.d i<? extends T> iVar, @d5.d kotlinx.coroutines.u0 u0Var, @d5.d Continuation<? super t0<? extends T>> continuation) {
        n0 c6 = c(iVar, 1);
        kotlinx.coroutines.a0 c7 = kotlinx.coroutines.c0.c(null, 1, null);
        e(u0Var, c6.context, c6.upstream, c7);
        return c7.R(continuation);
    }

    @d5.d
    public static final <T> t0<T> j(@d5.d i<? extends T> iVar, @d5.d kotlinx.coroutines.u0 u0Var, @d5.d o0 o0Var, T t5) {
        n0 c6 = c(iVar, 1);
        e0 a6 = v0.a(t5);
        return new g0(a6, d(u0Var, c6.context, c6.upstream, a6, o0Var, t5));
    }
}
