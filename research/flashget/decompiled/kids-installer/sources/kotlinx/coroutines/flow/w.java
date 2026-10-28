package kotlinx.coroutines.flow;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.m2;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.d2;

/* compiled from: Merge.kt */
@Metadata(d1 = {"\u0000R\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\u001ag\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000227\u0010\t\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aq\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\r\u001a\u00020\f27\u0010\t\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002H\u0007\u001a\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0011\u001a9\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0014\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0013\"\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a.\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\fH\u0007\u001at\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022D\b\u0001\u0010\t\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0018¢\u0006\u0002\b\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aj\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000229\b\u0005\u0010\t\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u000b\u001ac\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000223\b\u0001\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u000b\" \u0010%\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"\"\u001a\u0010'\u001a\u00020&8\u0006X\u0087T¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/i;", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "value", "Lkotlin/coroutines/d;", "", "transform", "a", "(Lkotlinx/coroutines/flow/i;Lq3/p;)Lkotlinx/coroutines/flow/i;", "", "concurrency", "c", "(Lkotlinx/coroutines/flow/i;ILq3/p;)Lkotlinx/coroutines/flow/i;", "e", "", "l", "", "flows", "m", "([Lkotlinx/coroutines/flow/i;)Lkotlinx/coroutines/flow/i;", "f", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/j;", "Lkotlin/m2;", "Lkotlin/u;", "n", "(Lkotlinx/coroutines/flow/i;Lq3/q;)Lkotlinx/coroutines/flow/i;", "b", "k", "I", "h", "()I", "getDEFAULT_CONCURRENCY$annotations", "()V", "DEFAULT_CONCURRENCY", "", "DEFAULT_CONCURRENCY_PROPERTY_NAME", "Ljava/lang/String;", "getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes5.dex */
final /* synthetic */ class w {

    /* renamed from: a, reason: collision with root package name */
    private static final int f28501a = kotlinx.coroutines.internal.t0.b(ProtectedSandApp.s("嶬"), 16, 1, Integer.MAX_VALUE);

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/a0$e"}, k = 1, mv = {1, 6, 0})
    public static final class a<R> implements i<i<? extends R>> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ i f28502o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.p f28503p;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$e$b"}, k = 3, mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.flow.w$a$a, reason: collision with other inner class name */
        public static final class C0446a<T> implements j {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ j f28504o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ q3.p f28505p;

            /* compiled from: Emitters.kt */
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {223, 223}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: kotlinx.coroutines.flow.w$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C0447a extends ContinuationImpl {

                /* renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f28506r;

                /* renamed from: s, reason: collision with root package name */
                int f28507s;

                /* renamed from: t, reason: collision with root package name */
                Object f28508t;

                public C0447a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @d5.e
                public final Object A(@d5.d Object obj) {
                    this.f28506r = obj;
                    this.f28507s |= Integer.MIN_VALUE;
                    return C0446a.this.b(null, this);
                }
            }

            public C0446a(j jVar, q3.p pVar) {
                this.f28504o = jVar;
                this.f28505p = pVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            @Override // kotlinx.coroutines.flow.j
            @d5.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object b(java.lang.Object r7, @d5.d kotlin.coroutines.Continuation r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.w.a.C0446a.C0447a
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.w$a$a$a r0 = (kotlinx.coroutines.flow.w.a.C0446a.C0447a) r0
                    int r1 = r0.f28507s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f28507s = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.w$a$a$a r0 = new kotlinx.coroutines.flow.w$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f28506r
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.f28507s
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L36
                    if (r2 != r3) goto L2a
                    kotlin.a1.n(r8)
                    goto L5f
                L2a:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "嶨"
                    java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
                    r7.<init>(r8)
                    throw r7
                L36:
                    java.lang.Object r7 = r0.f28508t
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    kotlin.a1.n(r8)
                    goto L53
                L3e:
                    kotlin.a1.n(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f28504o
                    q3.p r2 = r6.f28505p
                    r0.f28508t = r8
                    r0.f28507s = r4
                    java.lang.Object r7 = r2.g0(r7, r0)
                    if (r7 != r1) goto L50
                    return r1
                L50:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L53:
                    r2 = 0
                    r0.f28508t = r2
                    r0.f28507s = r3
                    java.lang.Object r7 = r7.b(r8, r0)
                    if (r7 != r1) goto L5f
                    return r1
                L5f:
                    kotlin.m2 r7 = kotlin.m2.f23662a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.w.a.C0446a.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public a(i iVar, q3.p pVar) {
            this.f28502o = iVar;
            this.f28503p = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d j jVar, @d5.d Continuation continuation) {
            Object a6 = this.f28502o.a(new C0446a(jVar, this.f28503p), continuation);
            return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* compiled from: Merge.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1", f = "Merge.kt", i = {}, l = {190, 190}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    public static final class b<R, T> extends SuspendLambda implements q3.q<j<? super R>, T, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f28510s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f28511t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f28512u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ q3.p<T, Continuation<? super i<? extends R>>, Object> f28513v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(q3.p<? super T, ? super Continuation<? super i<? extends R>>, ? extends Object> pVar, Continuation<? super b> continuation) {
            super(3, continuation);
            this.f28513v = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            j jVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f28510s;
            if (i5 == 0) {
                a1.n(obj);
                jVar = (j) this.f28511t;
                Object obj2 = this.f28512u;
                q3.p<T, Continuation<? super i<? extends R>>, Object> pVar = this.f28513v;
                this.f28511t = jVar;
                this.f28510s = 1;
                obj = pVar.g0(obj2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException(ProtectedSandApp.s("鄤"));
                    }
                    a1.n(obj);
                    return m2.f23662a;
                }
                jVar = (j) this.f28511t;
                a1.n(obj);
            }
            this.f28511t = null;
            this.f28510s = 2;
            if (n.g(jVar, (i) obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return m2.f23662a;
        }

        @Override // q3.q
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object G(@d5.d j<? super R> jVar, T t5, @d5.e Continuation<? super m2> continuation) {
            b bVar = new b(this.f28513v, continuation);
            bVar.f28511t = jVar;
            bVar.f28512u = t5;
            return bVar.A(m2.f23662a);
        }

        @d5.e
        public final Object Z(@d5.d Object obj) {
            n.g((j) this.f28511t, (i) this.f28513v.g0(this.f28512u, this), this);
            return m2.f23662a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/a0$e"}, k = 1, mv = {1, 6, 0})
    public static final class c<R> implements i<i<? extends R>> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ i f28514o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.p f28515p;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$e$b"}, k = 3, mv = {1, 6, 0})
        public static final class a<T> implements j {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ j f28516o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ q3.p f28517p;

            /* compiled from: Emitters.kt */
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {223, 223}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: kotlinx.coroutines.flow.w$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C0448a extends ContinuationImpl {

                /* renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f28518r;

                /* renamed from: s, reason: collision with root package name */
                int f28519s;

                /* renamed from: t, reason: collision with root package name */
                Object f28520t;

                public C0448a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @d5.e
                public final Object A(@d5.d Object obj) {
                    this.f28518r = obj;
                    this.f28519s |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(j jVar, q3.p pVar) {
                this.f28516o = jVar;
                this.f28517p = pVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            @Override // kotlinx.coroutines.flow.j
            @d5.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object b(java.lang.Object r7, @d5.d kotlin.coroutines.Continuation r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.w.c.a.C0448a
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.w$c$a$a r0 = (kotlinx.coroutines.flow.w.c.a.C0448a) r0
                    int r1 = r0.f28519s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f28519s = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.w$c$a$a r0 = new kotlinx.coroutines.flow.w$c$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f28518r
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.f28519s
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L36
                    if (r2 != r3) goto L2a
                    kotlin.a1.n(r8)
                    goto L5f
                L2a:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "嶩"
                    java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
                    r7.<init>(r8)
                    throw r7
                L36:
                    java.lang.Object r7 = r0.f28520t
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    kotlin.a1.n(r8)
                    goto L53
                L3e:
                    kotlin.a1.n(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f28516o
                    q3.p r2 = r6.f28517p
                    r0.f28520t = r8
                    r0.f28519s = r4
                    java.lang.Object r7 = r2.g0(r7, r0)
                    if (r7 != r1) goto L50
                    return r1
                L50:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L53:
                    r2 = 0
                    r0.f28520t = r2
                    r0.f28519s = r3
                    java.lang.Object r7 = r7.b(r8, r0)
                    if (r7 != r1) goto L5f
                    return r1
                L5f:
                    kotlin.m2 r7 = kotlin.m2.f23662a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.w.c.a.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public c(i iVar, q3.p pVar) {
            this.f28514o = iVar;
            this.f28515p = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d j jVar, @d5.d Continuation continuation) {
            Object a6 = this.f28514o.a(new a(jVar, this.f28515p), continuation);
            return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class d<T> implements i<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ i f28522o;

        public d(i iVar) {
            this.f28522o = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d j<? super T> jVar, @d5.d Continuation<? super m2> continuation) {
            Object a6 = this.f28522o.a(new e(jVar), continuation);
            return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
        }
    }

    /* compiled from: Merge.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "value", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    static final class e<T> implements j {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ j<T> f28523o;

        /* compiled from: Merge.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", f = "Merge.kt", i = {}, l = {80}, m = "emit", n = {}, s = {})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f28524r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ e<T> f28525s;

            /* renamed from: t, reason: collision with root package name */
            int f28526t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(e<? super T> eVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f28525s = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28524r = obj;
                this.f28526t |= Integer.MIN_VALUE;
                return this.f28525s.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        e(j<? super T> jVar) {
            this.f28523o = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.j
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(@d5.d kotlinx.coroutines.flow.i<? extends T> r5, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.w.e.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.w$e$a r0 = (kotlinx.coroutines.flow.w.e.a) r0
                int r1 = r0.f28526t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28526t = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.w$e$a r0 = new kotlinx.coroutines.flow.w$e$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f28524r
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28526t
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L27
                kotlin.a1.n(r6)
                goto L41
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "嶪"
                java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                r5.<init>(r6)
                throw r5
            L33:
                kotlin.a1.n(r6)
                kotlinx.coroutines.flow.j<T> r6 = r4.f28523o
                r0.f28526t = r3
                java.lang.Object r5 = kotlinx.coroutines.flow.n.g(r6, r5, r0)
                if (r5 != r1) goto L41
                return r1
            L41:
                kotlin.m2 r5 = kotlin.m2.f23662a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.w.e.b(kotlinx.coroutines.flow.i, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* compiled from: Merge.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", i = {}, l = {214, 214}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class f<R, T> extends SuspendLambda implements q3.q<j<? super R>, T, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f28527s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f28528t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f28529u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ q3.p<T, Continuation<? super R>, Object> f28530v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(q3.p<? super T, ? super Continuation<? super R>, ? extends Object> pVar, Continuation<? super f> continuation) {
            super(3, continuation);
            this.f28530v = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            j jVar;
            Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f28527s;
            if (i5 == 0) {
                a1.n(obj);
                j jVar2 = (j) this.f28528t;
                Object obj3 = this.f28529u;
                q3.p<T, Continuation<? super R>, Object> pVar = this.f28530v;
                this.f28528t = jVar2;
                this.f28527s = 1;
                obj = pVar.g0(obj3, this);
                jVar = jVar2;
                if (obj == obj2) {
                    return obj2;
                }
            } else {
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException(ProtectedSandApp.s("鄥"));
                    }
                    a1.n(obj);
                    return m2.f23662a;
                }
                j jVar3 = (j) this.f28528t;
                a1.n(obj);
                jVar = jVar3;
            }
            this.f28528t = null;
            this.f28527s = 2;
            if (jVar.b(obj, this) == obj2) {
                return obj2;
            }
            return m2.f23662a;
        }

        @Override // q3.q
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object G(@d5.d j<? super R> jVar, T t5, @d5.e Continuation<? super m2> continuation) {
            f fVar = new f(this.f28530v, continuation);
            fVar.f28528t = jVar;
            fVar.f28529u = t5;
            return fVar.A(m2.f23662a);
        }
    }

    @d2
    @d5.d
    public static final <T, R> i<R> a(@d5.d i<? extends T> iVar, @d5.d q3.p<? super T, ? super Continuation<? super i<? extends R>>, ? extends Object> pVar) {
        return e(new a(iVar, pVar));
    }

    @c2
    @d5.d
    public static final <T, R> i<R> b(@d5.d i<? extends T> iVar, @BuilderInference @d5.d q3.p<? super T, ? super Continuation<? super i<? extends R>>, ? extends Object> pVar) {
        return n(iVar, new b(pVar, null));
    }

    @d2
    @d5.d
    public static final <T, R> i<R> c(@d5.d i<? extends T> iVar, int i5, @d5.d q3.p<? super T, ? super Continuation<? super i<? extends R>>, ? extends Object> pVar) {
        return f(new c(iVar, pVar), i5);
    }

    public static i d(i iVar, int i5, q3.p pVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = f28501a;
        }
        return c(iVar, i5, pVar);
    }

    @d2
    @d5.d
    public static final <T> i<T> e(@d5.d i<? extends i<? extends T>> iVar) {
        return new d(iVar);
    }

    @d2
    @d5.d
    public static final <T> i<T> f(@d5.d i<? extends i<? extends T>> iVar, int i5) {
        if (i5 > 0) {
            return i5 == 1 ? e(iVar) : new kotlinx.coroutines.flow.internal.f(iVar, i5, null, 0, null, 28, null);
        }
        throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("嶭"), i5).toString());
    }

    public static i g(i iVar, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = f28501a;
        }
        return f(iVar, i5);
    }

    public static final int h() {
        return f28501a;
    }

    @d2
    public static /* synthetic */ void i() {
    }

    @d2
    public static /* synthetic */ void j() {
    }

    @c2
    @d5.d
    public static final <T, R> i<R> k(@d5.d i<? extends T> iVar, @BuilderInference @d5.d q3.p<? super T, ? super Continuation<? super R>, ? extends Object> pVar) {
        return n(iVar, new f(pVar, null));
    }

    @d5.d
    public static final <T> i<T> l(@d5.d Iterable<? extends i<? extends T>> iterable) {
        return new kotlinx.coroutines.flow.internal.j(iterable, null, 0, null, 14, null);
    }

    @d5.d
    public static final <T> i<T> m(@d5.d i<? extends T>... iVarArr) {
        Iterable B5;
        B5 = kotlin.collections.t.B5(iVarArr);
        return l(B5);
    }

    @c2
    @d5.d
    public static final <T, R> i<R> n(@d5.d i<? extends T> iVar, @BuilderInference @d5.d q3.q<? super j<? super R>, ? super T, ? super Continuation<? super m2>, ? extends Object> qVar) {
        return new kotlinx.coroutines.flow.internal.i(qVar, iVar, null, 0, null, 28, null);
    }
}
