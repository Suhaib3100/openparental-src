package kotlinx.coroutines.flow;

import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.k1;
import kotlin.m2;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Transform.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aO\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012$\b\u0004\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aO\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012$\b\u0004\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u001a\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\n\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0086\b\u001a\"\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\u001ad\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000123\b\u0004\u0010\u0010\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\b\u001aj\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\n*\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u000125\b\u0004\u0010\u0010\u001a/\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\b\u001a\"\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001aJ\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\b\u001a~\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0018\u001a\u00028\u00012H\b\u0001\u0010\u001b\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0019ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a~\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0018\u001a\u00028\u00012H\b\u0001\u0010\u001b\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0019ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001d\u001an\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012F\u0010\u001b\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0019ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "", "predicate", "a", "(Lkotlinx/coroutines/flow/i;Lq3/p;)Lkotlinx/coroutines/flow/i;", "c", "R", "b", "d", "Lkotlin/r0;", "name", "value", "transform", "e", "f", "Lkotlin/collections/u0;", "k", "Lkotlin/m2;", "action", "g", "initial", "Lkotlin/Function3;", "accumulator", "operation", "j", "(Lkotlinx/coroutines/flow/i;Ljava/lang/Object;Lq3/q;)Lkotlinx/coroutines/flow/i;", "h", "i", "(Lkotlinx/coroutines/flow/i;Lq3/q;)Lkotlinx/coroutines/flow/i;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes5.dex */
final /* synthetic */ class a0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/t$g"}, k = 1, mv = {1, 6, 0})
    public static final class a<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f27736o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.p f27737p;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = SyslogAppender.LOG_LOCAL6)
        /* renamed from: kotlinx.coroutines.flow.a0$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0417a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f27738r;

            /* renamed from: s, reason: collision with root package name */
            int f27739s;

            public C0417a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f27738r = obj;
                this.f27739s |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/t$h"}, k = 3, mv = {1, 6, 0})
        public static final class b<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f27741o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ q3.p f27742p;

            /* compiled from: Emitters.kt */
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {223, 223}, m = "emit", n = {"value", "$this$filter_u24lambda_u2d0"}, s = {"L$0", "L$1"})
            @Metadata(k = 3, mv = {1, 6, 0}, xi = SyslogAppender.LOG_LOCAL6)
            /* renamed from: kotlinx.coroutines.flow.a0$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C0418a extends ContinuationImpl {

                /* renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f27743r;

                /* renamed from: s, reason: collision with root package name */
                int f27744s;

                /* renamed from: u, reason: collision with root package name */
                Object f27746u;

                /* renamed from: v, reason: collision with root package name */
                Object f27747v;

                public C0418a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @d5.e
                public final Object A(@d5.d Object obj) {
                    this.f27743r = obj;
                    this.f27744s |= Integer.MIN_VALUE;
                    return b.this.b(null, this);
                }
            }

            public b(kotlinx.coroutines.flow.j jVar, q3.p pVar) {
                this.f27741o = jVar;
                this.f27742p = pVar;
            }

            @d5.e
            public final Object a(Object obj, @d5.d Continuation continuation) {
                new C0418a(continuation);
                kotlinx.coroutines.flow.j jVar = this.f27741o;
                if (((Boolean) this.f27742p.g0(obj, continuation)).booleanValue()) {
                    jVar.b(obj, continuation);
                }
                return m2.f23662a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            @Override // kotlinx.coroutines.flow.j
            @d5.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object b(T r7, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.a0.a.b.C0418a
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.a0$a$b$a r0 = (kotlinx.coroutines.flow.a0.a.b.C0418a) r0
                    int r1 = r0.f27744s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f27744s = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$a$b$a r0 = new kotlinx.coroutines.flow.a0$a$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f27743r
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.f27744s
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L40
                    if (r2 == r4) goto L36
                    if (r2 != r3) goto L2a
                    kotlin.a1.n(r8)
                    goto L6e
                L2a:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "嵀"
                    java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
                    r7.<init>(r8)
                    throw r7
                L36:
                    java.lang.Object r7 = r0.f27747v
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    java.lang.Object r2 = r0.f27746u
                    kotlin.a1.n(r8)
                    goto L58
                L40:
                    kotlin.a1.n(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f27741o
                    q3.p r2 = r6.f27742p
                    r0.f27746u = r7
                    r0.f27747v = r8
                    r0.f27744s = r4
                    java.lang.Object r2 = r2.g0(r7, r0)
                    if (r2 != r1) goto L54
                    return r1
                L54:
                    r5 = r2
                    r2 = r7
                    r7 = r8
                    r8 = r5
                L58:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 == 0) goto L6e
                    r8 = 0
                    r0.f27746u = r8
                    r0.f27747v = r8
                    r0.f27744s = r3
                    java.lang.Object r7 = r7.b(r2, r0)
                    if (r7 != r1) goto L6e
                    return r1
                L6e:
                    kotlin.m2 r7 = kotlin.m2.f23662a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.a.b.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public a(kotlinx.coroutines.flow.i iVar, q3.p pVar) {
            this.f27736o = iVar;
            this.f27737p = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d kotlinx.coroutines.flow.j jVar, @d5.d Continuation continuation) {
            Object a6 = this.f27736o.a(new b(jVar, this.f27737p), continuation);
            return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
        }

        @d5.e
        public Object e(@d5.d kotlinx.coroutines.flow.j jVar, @d5.d Continuation continuation) {
            new C0417a(continuation);
            this.f27736o.a(new b(jVar, this.f27737p), continuation);
            return m2.f23662a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/a0$a"}, k = 1, mv = {1, 6, 0})
    public static final class b implements kotlinx.coroutines.flow.i<Object> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f27748o;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = SyslogAppender.LOG_LOCAL6)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f27749r;

            /* renamed from: s, reason: collision with root package name */
            int f27750s;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f27749r = obj;
                this.f27750s |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$a$b"}, k = 3, mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.flow.a0$b$b, reason: collision with other inner class name */
        public static final class C0419b<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f27752o;

            /* compiled from: Emitters.kt */
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", f = "Transform.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 6, 0}, xi = SyslogAppender.LOG_LOCAL6)
            /* renamed from: kotlinx.coroutines.flow.a0$b$b$a */
            /* loaded from: classes6.dex */
            public static final class a extends ContinuationImpl {

                /* renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f27753r;

                /* renamed from: s, reason: collision with root package name */
                int f27754s;

                /* renamed from: t, reason: collision with root package name */
                Object f27755t;

                /* renamed from: u, reason: collision with root package name */
                Object f27756u;

                public a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @d5.e
                public final Object A(@d5.d Object obj) {
                    this.f27753r = obj;
                    this.f27754s |= Integer.MIN_VALUE;
                    return C0419b.this.b(null, this);
                }
            }

            public C0419b(kotlinx.coroutines.flow.j jVar) {
                this.f27752o = jVar;
            }

            @d5.e
            public final Object a(Object obj, @d5.d Continuation continuation) {
                new a(continuation);
                kotlinx.coroutines.flow.j jVar = this.f27752o;
                kotlin.jvm.internal.l0.P();
                if (obj instanceof Object) {
                    jVar.b(obj, continuation);
                }
                return m2.f23662a;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // kotlinx.coroutines.flow.j
            @d5.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object b(java.lang.Object r5, @d5.d kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.a0.b.C0419b.a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.a0$b$b$a r0 = (kotlinx.coroutines.flow.a0.b.C0419b.a) r0
                    int r1 = r0.f27754s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f27754s = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$b$b$a r0 = new kotlinx.coroutines.flow.a0$b$b$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f27753r
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.f27754s
                    r3 = 1
                    if (r2 == 0) goto L33
                    if (r2 != r3) goto L27
                    kotlin.a1.n(r6)
                    goto L48
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "嵁"
                    java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                    r5.<init>(r6)
                    throw r5
                L33:
                    kotlin.a1.n(r6)
                    kotlinx.coroutines.flow.j r6 = r4.f27752o
                    kotlin.jvm.internal.l0.P()
                    boolean r2 = r5 instanceof java.lang.Object
                    if (r2 == 0) goto L48
                    r0.f27754s = r3
                    java.lang.Object r5 = r6.b(r5, r0)
                    if (r5 != r1) goto L48
                    return r1
                L48:
                    kotlin.m2 r5 = kotlin.m2.f23662a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.b.C0419b.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public b(kotlinx.coroutines.flow.i iVar) {
            this.f27748o = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d kotlinx.coroutines.flow.j<? super Object> jVar, @d5.d Continuation continuation) {
            kotlinx.coroutines.flow.i iVar = this.f27748o;
            kotlin.jvm.internal.l0.P();
            Object a6 = iVar.a(new C0419b(jVar), continuation);
            return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
        }

        @d5.e
        public Object e(@d5.d kotlinx.coroutines.flow.j jVar, @d5.d Continuation continuation) {
            new a(continuation);
            kotlinx.coroutines.flow.i iVar = this.f27748o;
            kotlin.jvm.internal.l0.P();
            iVar.a(new C0419b(jVar), continuation);
            return m2.f23662a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/t$g"}, k = 1, mv = {1, 6, 0})
    public static final class c<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f27758o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.p f27759p;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = SyslogAppender.LOG_LOCAL6)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f27760r;

            /* renamed from: s, reason: collision with root package name */
            int f27761s;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f27760r = obj;
                this.f27761s |= Integer.MIN_VALUE;
                return c.this.a(null, this);
            }
        }

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/t$h"}, k = 3, mv = {1, 6, 0})
        public static final class b<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f27763o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ q3.p f27764p;

            /* compiled from: Emitters.kt */
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {223, 223}, m = "emit", n = {"value", "$this$filterNot_u24lambda_u2d1"}, s = {"L$0", "L$1"})
            @Metadata(k = 3, mv = {1, 6, 0}, xi = SyslogAppender.LOG_LOCAL6)
            /* loaded from: classes6.dex */
            public static final class a extends ContinuationImpl {

                /* renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f27765r;

                /* renamed from: s, reason: collision with root package name */
                int f27766s;

                /* renamed from: u, reason: collision with root package name */
                Object f27768u;

                /* renamed from: v, reason: collision with root package name */
                Object f27769v;

                public a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @d5.e
                public final Object A(@d5.d Object obj) {
                    this.f27765r = obj;
                    this.f27766s |= Integer.MIN_VALUE;
                    return b.this.b(null, this);
                }
            }

            public b(kotlinx.coroutines.flow.j jVar, q3.p pVar) {
                this.f27763o = jVar;
                this.f27764p = pVar;
            }

            @d5.e
            public final Object a(Object obj, @d5.d Continuation continuation) {
                new a(continuation);
                kotlinx.coroutines.flow.j jVar = this.f27763o;
                if (!((Boolean) this.f27764p.g0(obj, continuation)).booleanValue()) {
                    jVar.b(obj, continuation);
                }
                return m2.f23662a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            @Override // kotlinx.coroutines.flow.j
            @d5.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object b(T r7, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.a0.c.b.a
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.a0$c$b$a r0 = (kotlinx.coroutines.flow.a0.c.b.a) r0
                    int r1 = r0.f27766s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f27766s = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$c$b$a r0 = new kotlinx.coroutines.flow.a0$c$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f27765r
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.f27766s
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L40
                    if (r2 == r4) goto L36
                    if (r2 != r3) goto L2a
                    kotlin.a1.n(r8)
                    goto L6e
                L2a:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "嵂"
                    java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
                    r7.<init>(r8)
                    throw r7
                L36:
                    java.lang.Object r7 = r0.f27769v
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    java.lang.Object r2 = r0.f27768u
                    kotlin.a1.n(r8)
                    goto L58
                L40:
                    kotlin.a1.n(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f27763o
                    q3.p r2 = r6.f27764p
                    r0.f27768u = r7
                    r0.f27769v = r8
                    r0.f27766s = r4
                    java.lang.Object r2 = r2.g0(r7, r0)
                    if (r2 != r1) goto L54
                    return r1
                L54:
                    r5 = r2
                    r2 = r7
                    r7 = r8
                    r8 = r5
                L58:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 != 0) goto L6e
                    r8 = 0
                    r0.f27768u = r8
                    r0.f27769v = r8
                    r0.f27766s = r3
                    java.lang.Object r7 = r7.b(r2, r0)
                    if (r7 != r1) goto L6e
                    return r1
                L6e:
                    kotlin.m2 r7 = kotlin.m2.f23662a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.c.b.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public c(kotlinx.coroutines.flow.i iVar, q3.p pVar) {
            this.f27758o = iVar;
            this.f27759p = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d kotlinx.coroutines.flow.j jVar, @d5.d Continuation continuation) {
            Object a6 = this.f27758o.a(new b(jVar, this.f27759p), continuation);
            return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
        }

        @d5.e
        public Object e(@d5.d kotlinx.coroutines.flow.j jVar, @d5.d Continuation continuation) {
            new a(continuation);
            this.f27758o.a(new b(jVar, this.f27759p), continuation);
            return m2.f23662a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/t$g"}, k = 1, mv = {1, 6, 0})
    public static final class d<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f27770o;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/t$h"}, k = 3, mv = {1, 6, 0})
        public static final class a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f27771o;

            /* compiled from: Emitters.kt */
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: kotlinx.coroutines.flow.a0$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C0420a extends ContinuationImpl {

                /* renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f27772r;

                /* renamed from: s, reason: collision with root package name */
                int f27773s;

                public C0420a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @d5.e
                public final Object A(@d5.d Object obj) {
                    this.f27772r = obj;
                    this.f27773s |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.j jVar) {
                this.f27771o = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // kotlinx.coroutines.flow.j
            @d5.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object b(T r5, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.a0.d.a.C0420a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.a0$d$a$a r0 = (kotlinx.coroutines.flow.a0.d.a.C0420a) r0
                    int r1 = r0.f27773s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f27773s = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$d$a$a r0 = new kotlinx.coroutines.flow.a0$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f27772r
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.f27773s
                    r3 = 1
                    if (r2 == 0) goto L33
                    if (r2 != r3) goto L27
                    kotlin.a1.n(r6)
                    goto L43
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "嵃"
                    java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                    r5.<init>(r6)
                    throw r5
                L33:
                    kotlin.a1.n(r6)
                    kotlinx.coroutines.flow.j r6 = r4.f27771o
                    if (r5 == 0) goto L43
                    r0.f27773s = r3
                    java.lang.Object r5 = r6.b(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.m2 r5 = kotlin.m2.f23662a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.d.a.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public d(kotlinx.coroutines.flow.i iVar) {
            this.f27770o = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d kotlinx.coroutines.flow.j jVar, @d5.d Continuation continuation) {
            Object a6 = this.f27770o.a(new a(jVar), continuation);
            return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/t$g"}, k = 1, mv = {1, 6, 0})
    public static final class e<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f27775o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.p f27776p;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = SyslogAppender.LOG_LOCAL6)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f27777r;

            /* renamed from: s, reason: collision with root package name */
            int f27778s;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f27777r = obj;
                this.f27778s |= Integer.MIN_VALUE;
                return e.this.a(null, this);
            }
        }

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/t$h"}, k = 3, mv = {1, 6, 0})
        public static final class b<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f27780o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ q3.p f27781p;

            /* compiled from: Emitters.kt */
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {223, 223}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 6, 0}, xi = SyslogAppender.LOG_LOCAL6)
            /* loaded from: classes6.dex */
            public static final class a extends ContinuationImpl {

                /* renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f27782r;

                /* renamed from: s, reason: collision with root package name */
                int f27783s;

                /* renamed from: u, reason: collision with root package name */
                Object f27785u;

                public a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @d5.e
                public final Object A(@d5.d Object obj) {
                    this.f27782r = obj;
                    this.f27783s |= Integer.MIN_VALUE;
                    return b.this.b(null, this);
                }
            }

            public b(kotlinx.coroutines.flow.j jVar, q3.p pVar) {
                this.f27780o = jVar;
                this.f27781p = pVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @d5.e
            public final Object a(Object obj, @d5.d Continuation continuation) {
                new a(continuation);
                this.f27780o.b(this.f27781p.g0(obj, continuation), continuation);
                return m2.f23662a;
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
            public final java.lang.Object b(T r7, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.a0.e.b.a
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.a0$e$b$a r0 = (kotlinx.coroutines.flow.a0.e.b.a) r0
                    int r1 = r0.f27783s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f27783s = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$e$b$a r0 = new kotlinx.coroutines.flow.a0$e$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f27782r
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.f27783s
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L36
                    if (r2 != r3) goto L2a
                    kotlin.a1.n(r8)
                    goto L5f
                L2a:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "嵄"
                    java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
                    r7.<init>(r8)
                    throw r7
                L36:
                    java.lang.Object r7 = r0.f27785u
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    kotlin.a1.n(r8)
                    goto L53
                L3e:
                    kotlin.a1.n(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f27780o
                    q3.p r2 = r6.f27781p
                    r0.f27785u = r8
                    r0.f27783s = r4
                    java.lang.Object r7 = r2.g0(r7, r0)
                    if (r7 != r1) goto L50
                    return r1
                L50:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L53:
                    r2 = 0
                    r0.f27785u = r2
                    r0.f27783s = r3
                    java.lang.Object r7 = r7.b(r8, r0)
                    if (r7 != r1) goto L5f
                    return r1
                L5f:
                    kotlin.m2 r7 = kotlin.m2.f23662a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.e.b.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public e(kotlinx.coroutines.flow.i iVar, q3.p pVar) {
            this.f27775o = iVar;
            this.f27776p = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d kotlinx.coroutines.flow.j jVar, @d5.d Continuation continuation) {
            Object a6 = this.f27775o.a(new b(jVar, this.f27776p), continuation);
            return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
        }

        @d5.e
        public Object e(@d5.d kotlinx.coroutines.flow.j jVar, @d5.d Continuation continuation) {
            new a(continuation);
            this.f27775o.a(new b(jVar, this.f27776p), continuation);
            return m2.f23662a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/t$g"}, k = 1, mv = {1, 6, 0})
    public static final class f<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f27786o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.p f27787p;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = SyslogAppender.LOG_LOCAL6)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f27788r;

            /* renamed from: s, reason: collision with root package name */
            int f27789s;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f27788r = obj;
                this.f27789s |= Integer.MIN_VALUE;
                return f.this.a(null, this);
            }
        }

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/t$h"}, k = 3, mv = {1, 6, 0})
        public static final class b<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f27791o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ q3.p f27792p;

            /* compiled from: Emitters.kt */
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0}, l = {223, 224}, m = "emit", n = {"$this$mapNotNull_u24lambda_u2d5"}, s = {"L$0"})
            @Metadata(k = 3, mv = {1, 6, 0}, xi = SyslogAppender.LOG_LOCAL6)
            /* loaded from: classes6.dex */
            public static final class a extends ContinuationImpl {

                /* renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f27793r;

                /* renamed from: s, reason: collision with root package name */
                int f27794s;

                /* renamed from: u, reason: collision with root package name */
                Object f27796u;

                public a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @d5.e
                public final Object A(@d5.d Object obj) {
                    this.f27793r = obj;
                    this.f27794s |= Integer.MIN_VALUE;
                    return b.this.b(null, this);
                }
            }

            public b(kotlinx.coroutines.flow.j jVar, q3.p pVar) {
                this.f27791o = jVar;
                this.f27792p = pVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @d5.e
            public final Object a(Object obj, @d5.d Continuation continuation) {
                new a(continuation);
                kotlinx.coroutines.flow.j jVar = this.f27791o;
                Object g02 = this.f27792p.g0(obj, continuation);
                if (g02 != null) {
                    jVar.b(g02, continuation);
                }
                return m2.f23662a;
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            @Override // kotlinx.coroutines.flow.j
            @d5.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object b(T r7, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.a0.f.b.a
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.a0$f$b$a r0 = (kotlinx.coroutines.flow.a0.f.b.a) r0
                    int r1 = r0.f27794s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f27794s = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$f$b$a r0 = new kotlinx.coroutines.flow.a0$f$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f27793r
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.f27794s
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L36
                    if (r2 != r3) goto L2a
                    kotlin.a1.n(r8)
                    goto L62
                L2a:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "嵅"
                    java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
                    r7.<init>(r8)
                    throw r7
                L36:
                    java.lang.Object r7 = r0.f27796u
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    kotlin.a1.n(r8)
                    goto L53
                L3e:
                    kotlin.a1.n(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f27791o
                    q3.p r2 = r6.f27792p
                    r0.f27796u = r8
                    r0.f27794s = r4
                    java.lang.Object r7 = r2.g0(r7, r0)
                    if (r7 != r1) goto L50
                    return r1
                L50:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L53:
                    if (r8 != 0) goto L56
                    goto L62
                L56:
                    r2 = 0
                    r0.f27796u = r2
                    r0.f27794s = r3
                    java.lang.Object r7 = r7.b(r8, r0)
                    if (r7 != r1) goto L62
                    return r1
                L62:
                    kotlin.m2 r7 = kotlin.m2.f23662a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.f.b.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public f(kotlinx.coroutines.flow.i iVar, q3.p pVar) {
            this.f27786o = iVar;
            this.f27787p = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d kotlinx.coroutines.flow.j jVar, @d5.d Continuation continuation) {
            Object a6 = this.f27786o.a(new b(jVar, this.f27787p), continuation);
            return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
        }

        @d5.e
        public Object e(@d5.d kotlinx.coroutines.flow.j jVar, @d5.d Continuation continuation) {
            new a(continuation);
            this.f27786o.a(new b(jVar, this.f27787p), continuation);
            return m2.f23662a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/t$g"}, k = 1, mv = {1, 6, 0})
    public static final class g<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f27797o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.p f27798p;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/t$h"}, k = 3, mv = {1, 6, 0})
        public static final class a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f27799o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ q3.p f27800p;

            /* compiled from: Emitters.kt */
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {223, 224}, m = "emit", n = {"value", "$this$onEach_u24lambda_u2d7"}, s = {"L$0", "L$1"})
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: kotlinx.coroutines.flow.a0$g$a$a, reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C0421a extends ContinuationImpl {

                /* renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f27801r;

                /* renamed from: s, reason: collision with root package name */
                int f27802s;

                /* renamed from: u, reason: collision with root package name */
                Object f27804u;

                /* renamed from: v, reason: collision with root package name */
                Object f27805v;

                public C0421a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @d5.e
                public final Object A(@d5.d Object obj) {
                    this.f27801r = obj;
                    this.f27802s |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.j jVar, q3.p pVar) {
                this.f27799o = jVar;
                this.f27800p = pVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            @Override // kotlinx.coroutines.flow.j
            @d5.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object b(T r6, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof kotlinx.coroutines.flow.a0.g.a.C0421a
                    if (r0 == 0) goto L13
                    r0 = r7
                    kotlinx.coroutines.flow.a0$g$a$a r0 = (kotlinx.coroutines.flow.a0.g.a.C0421a) r0
                    int r1 = r0.f27802s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f27802s = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$g$a$a r0 = new kotlinx.coroutines.flow.a0$g$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f27801r
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.f27802s
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L40
                    if (r2 == r4) goto L36
                    if (r2 != r3) goto L2a
                    kotlin.a1.n(r7)
                    goto L64
                L2a:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "嵆"
                    java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
                    r6.<init>(r7)
                    throw r6
                L36:
                    java.lang.Object r6 = r0.f27805v
                    kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                    java.lang.Object r2 = r0.f27804u
                    kotlin.a1.n(r7)
                    goto L56
                L40:
                    kotlin.a1.n(r7)
                    kotlinx.coroutines.flow.j r7 = r5.f27799o
                    q3.p r2 = r5.f27800p
                    r0.f27804u = r6
                    r0.f27805v = r7
                    r0.f27802s = r4
                    java.lang.Object r2 = r2.g0(r6, r0)
                    if (r2 != r1) goto L54
                    return r1
                L54:
                    r2 = r6
                    r6 = r7
                L56:
                    r7 = 0
                    r0.f27804u = r7
                    r0.f27805v = r7
                    r0.f27802s = r3
                    java.lang.Object r6 = r6.b(r2, r0)
                    if (r6 != r1) goto L64
                    return r1
                L64:
                    kotlin.m2 r6 = kotlin.m2.f23662a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.g.a.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public g(kotlinx.coroutines.flow.i iVar, q3.p pVar) {
            this.f27797o = iVar;
            this.f27798p = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d kotlinx.coroutines.flow.j jVar, @d5.d Continuation continuation) {
            Object a6 = this.f27797o.a(new a(jVar, this.f27798p), continuation);
            return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class h<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Object f27806o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f27807p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ q3.q f27808q;

        /* compiled from: SafeCollector.common.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", f = "Transform.kt", i = {0, 0, 0}, l = {114, 115}, m = "collect", n = {"this", "$this$runningFold_u24lambda_u2d8", "accumulator"}, s = {"L$0", "L$1", "L$2"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f27809r;

            /* renamed from: s, reason: collision with root package name */
            int f27810s;

            /* renamed from: u, reason: collision with root package name */
            Object f27812u;

            /* renamed from: v, reason: collision with root package name */
            Object f27813v;

            /* renamed from: w, reason: collision with root package name */
            Object f27814w;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f27809r = obj;
                this.f27810s |= Integer.MIN_VALUE;
                return h.this.a(null, this);
            }
        }

        public h(Object obj, kotlinx.coroutines.flow.i iVar, q3.q qVar) {
            this.f27806o = obj;
            this.f27807p = iVar;
            this.f27808q = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x007c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // kotlinx.coroutines.flow.i
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@d5.d kotlinx.coroutines.flow.j<? super R> r7, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.a0.h.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.a0$h$a r0 = (kotlinx.coroutines.flow.a0.h.a) r0
                int r1 = r0.f27810s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f27810s = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.a0$h$a r0 = new kotlinx.coroutines.flow.a0$h$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f27809r
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f27810s
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L36
                if (r2 != r3) goto L2a
                kotlin.a1.n(r8)
                goto L7d
            L2a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "嵇"
                java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
                r7.<init>(r8)
                throw r7
            L36:
                java.lang.Object r7 = r0.f27814w
                kotlin.jvm.internal.k1$h r7 = (kotlin.jvm.internal.k1.h) r7
                java.lang.Object r2 = r0.f27813v
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                java.lang.Object r4 = r0.f27812u
                kotlinx.coroutines.flow.a0$h r4 = (kotlinx.coroutines.flow.a0.h) r4
                kotlin.a1.n(r8)
                goto L64
            L46:
                kotlin.a1.n(r8)
                kotlin.jvm.internal.k1$h r8 = new kotlin.jvm.internal.k1$h
                r8.<init>()
                java.lang.Object r2 = r6.f27806o
                r8.f23572o = r2
                r0.f27812u = r6
                r0.f27813v = r7
                r0.f27814w = r8
                r0.f27810s = r4
                java.lang.Object r2 = r7.b(r2, r0)
                if (r2 != r1) goto L61
                return r1
            L61:
                r4 = r6
                r2 = r7
                r7 = r8
            L64:
                kotlinx.coroutines.flow.i r8 = r4.f27807p
                kotlinx.coroutines.flow.a0$i r5 = new kotlinx.coroutines.flow.a0$i
                q3.q r4 = r4.f27808q
                r5.<init>(r7, r4, r2)
                r7 = 0
                r0.f27812u = r7
                r0.f27813v = r7
                r0.f27814w = r7
                r0.f27810s = r3
                java.lang.Object r7 = r8.a(r5, r0)
                if (r7 != r1) goto L7d
                return r1
            L7d:
                kotlin.m2 r7 = kotlin.m2.f23662a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.h.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: Transform.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    static final class i<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ k1.h<R> f27815o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.q<R, T, Continuation<? super R>, Object> f27816p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<R> f27817q;

        /* compiled from: Transform.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", f = "Transform.kt", i = {0}, l = {103, 104}, m = "emit", n = {"this"}, s = {"L$0"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            Object f27818r;

            /* renamed from: s, reason: collision with root package name */
            Object f27819s;

            /* renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f27820t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ i<T> f27821u;

            /* renamed from: v, reason: collision with root package name */
            int f27822v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(i<? super T> iVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f27821u = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f27820t = obj;
                this.f27822v |= Integer.MIN_VALUE;
                return this.f27821u.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        i(k1.h<R> hVar, q3.q<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> qVar, kotlinx.coroutines.flow.j<? super R> jVar) {
            this.f27815o = hVar;
            this.f27816p = qVar;
            this.f27817q = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0071 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // kotlinx.coroutines.flow.j
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(T r8, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.a0.i.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.a0$i$a r0 = (kotlinx.coroutines.flow.a0.i.a) r0
                int r1 = r0.f27822v
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f27822v = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.a0$i$a r0 = new kotlinx.coroutines.flow.a0$i$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f27820t
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f27822v
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L42
                if (r2 == r4) goto L36
                if (r2 != r3) goto L2a
                kotlin.a1.n(r9)
                goto L72
            L2a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "嵈"
                java.lang.String r9 = com.flashget.kidsdownloader.ProtectedSandApp.s(r9)
                r8.<init>(r9)
                throw r8
            L36:
                java.lang.Object r8 = r0.f27819s
                kotlin.jvm.internal.k1$h r8 = (kotlin.jvm.internal.k1.h) r8
                java.lang.Object r2 = r0.f27818r
                kotlinx.coroutines.flow.a0$i r2 = (kotlinx.coroutines.flow.a0.i) r2
                kotlin.a1.n(r9)
                goto L5c
            L42:
                kotlin.a1.n(r9)
                kotlin.jvm.internal.k1$h<R> r9 = r7.f27815o
                q3.q<R, T, kotlin.coroutines.d<? super R>, java.lang.Object> r2 = r7.f27816p
                T r5 = r9.f23572o
                r0.f27818r = r7
                r0.f27819s = r9
                r0.f27822v = r4
                java.lang.Object r8 = r2.G(r5, r8, r0)
                if (r8 != r1) goto L58
                return r1
            L58:
                r2 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L5c:
                r8.f23572o = r9
                kotlinx.coroutines.flow.j<R> r8 = r2.f27817q
                kotlin.jvm.internal.k1$h<R> r9 = r2.f27815o
                T r9 = r9.f23572o
                r2 = 0
                r0.f27818r = r2
                r0.f27819s = r2
                r0.f27822v = r3
                java.lang.Object r8 = r8.b(r9, r0)
                if (r8 != r1) goto L72
                return r1
            L72:
                kotlin.m2 r8 = kotlin.m2.f23662a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.i.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class j<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f27823o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.q f27824p;

        public j(kotlinx.coroutines.flow.i iVar, q3.q qVar) {
            this.f27823o = iVar;
            this.f27824p = qVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d kotlinx.coroutines.flow.j<? super T> jVar, @d5.d Continuation<? super m2> continuation) {
            k1.h hVar = new k1.h();
            hVar.f23572o = (T) kotlinx.coroutines.flow.internal.s.f28115a;
            Object a6 = this.f27823o.a(new k(hVar, this.f27824p, jVar), continuation);
            return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
        }
    }

    /* compiled from: Transform.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    static final class k<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ k1.h<Object> f27825o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.q<T, T, Continuation<? super T>, Object> f27826p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<T> f27827q;

        /* compiled from: Transform.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1", f = "Transform.kt", i = {0}, l = {125, 127}, m = "emit", n = {"this"}, s = {"L$0"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            Object f27828r;

            /* renamed from: s, reason: collision with root package name */
            Object f27829s;

            /* renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f27830t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ k<T> f27831u;

            /* renamed from: v, reason: collision with root package name */
            int f27832v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(k<? super T> kVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f27831u = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f27830t = obj;
                this.f27832v |= Integer.MIN_VALUE;
                return this.f27831u.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        k(k1.h<Object> hVar, q3.q<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> qVar, kotlinx.coroutines.flow.j<? super T> jVar) {
            this.f27825o = hVar;
            this.f27826p = qVar;
            this.f27827q = jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // kotlinx.coroutines.flow.j
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(T r8, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.a0.k.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.a0$k$a r0 = (kotlinx.coroutines.flow.a0.k.a) r0
                int r1 = r0.f27832v
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f27832v = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.a0$k$a r0 = new kotlinx.coroutines.flow.a0$k$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f27830t
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f27832v
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L42
                if (r2 == r4) goto L36
                if (r2 != r3) goto L2a
                kotlin.a1.n(r9)
                goto L7b
            L2a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "嵉"
                java.lang.String r9 = com.flashget.kidsdownloader.ProtectedSandApp.s(r9)
                r8.<init>(r9)
                throw r8
            L36:
                java.lang.Object r8 = r0.f27829s
                kotlin.jvm.internal.k1$h r8 = (kotlin.jvm.internal.k1.h) r8
                java.lang.Object r2 = r0.f27828r
                kotlinx.coroutines.flow.a0$k r2 = (kotlinx.coroutines.flow.a0.k) r2
                kotlin.a1.n(r9)
                goto L62
            L42:
                kotlin.a1.n(r9)
                kotlin.jvm.internal.k1$h<java.lang.Object> r9 = r7.f27825o
                T r2 = r9.f23572o
                kotlinx.coroutines.internal.r0 r5 = kotlinx.coroutines.flow.internal.s.f28115a
                if (r2 != r5) goto L4f
                r2 = r7
                goto L65
            L4f:
                q3.q<T, T, kotlin.coroutines.d<? super T>, java.lang.Object> r5 = r7.f27826p
                r0.f27828r = r7
                r0.f27829s = r9
                r0.f27832v = r4
                java.lang.Object r8 = r5.G(r2, r8, r0)
                if (r8 != r1) goto L5e
                return r1
            L5e:
                r2 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L62:
                r6 = r9
                r9 = r8
                r8 = r6
            L65:
                r9.f23572o = r8
                kotlinx.coroutines.flow.j<T> r8 = r2.f27827q
                kotlin.jvm.internal.k1$h<java.lang.Object> r9 = r2.f27825o
                T r9 = r9.f23572o
                r2 = 0
                r0.f27828r = r2
                r0.f27829s = r2
                r0.f27832v = r3
                java.lang.Object r8 = r8.b(r9, r0)
                if (r8 != r1) goto L7b
                return r1
            L7b:
                kotlin.m2 r8 = kotlin.m2.f23662a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.k.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class l<T> implements kotlinx.coroutines.flow.i<IndexedValue<? extends T>> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f27833o;

        public l(kotlinx.coroutines.flow.i iVar) {
            this.f27833o = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d kotlinx.coroutines.flow.j<? super IndexedValue<? extends T>> jVar, @d5.d Continuation<? super m2> continuation) {
            Object a6 = this.f27833o.a(new m(jVar, new k1.f()), continuation);
            return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
        }
    }

    /* compiled from: Transform.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    static final class m<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<IndexedValue<? extends T>> f27834o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ k1.f f27835p;

        /* compiled from: Transform.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", f = "Transform.kt", i = {}, l = {65}, m = "emit", n = {}, s = {})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f27836r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ m<T> f27837s;

            /* renamed from: t, reason: collision with root package name */
            int f27838t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(m<? super T> mVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f27837s = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f27836r = obj;
                this.f27838t |= Integer.MIN_VALUE;
                return this.f27837s.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        m(kotlinx.coroutines.flow.j<? super IndexedValue<? extends T>> jVar, k1.f fVar) {
            this.f27834o = jVar;
            this.f27835p = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.j
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(T r8, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.a0.m.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.a0$m$a r0 = (kotlinx.coroutines.flow.a0.m.a) r0
                int r1 = r0.f27838t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f27838t = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.a0$m$a r0 = new kotlinx.coroutines.flow.a0$m$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f27836r
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f27838t
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L27
                kotlin.a1.n(r9)
                goto L50
            L27:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "嵊"
                java.lang.String r9 = com.flashget.kidsdownloader.ProtectedSandApp.s(r9)
                r8.<init>(r9)
                throw r8
            L33:
                kotlin.a1.n(r9)
                kotlinx.coroutines.flow.j<kotlin.collections.u0<? extends T>> r9 = r7.f27834o
                kotlin.collections.u0 r2 = new kotlin.collections.u0
                kotlin.jvm.internal.k1$f r4 = r7.f27835p
                int r5 = r4.f23570o
                int r6 = r5 + 1
                r4.f23570o = r6
                if (r5 < 0) goto L53
                r2.<init>(r5, r8)
                r0.f27838t = r3
                java.lang.Object r8 = r9.b(r2, r0)
                if (r8 != r1) goto L50
                return r1
            L50:
                kotlin.m2 r8 = kotlin.m2.f23662a
                return r8
            L53:
                java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
                java.lang.String r9 = "嵋"
                java.lang.String r9 = com.flashget.kidsdownloader.ProtectedSandApp.s(r9)
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.m.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @d5.d
    public static final <T> kotlinx.coroutines.flow.i<T> a(@d5.d kotlinx.coroutines.flow.i<? extends T> iVar, @d5.d q3.p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
        return new a(iVar, pVar);
    }

    public static final <R> kotlinx.coroutines.flow.i<R> b(kotlinx.coroutines.flow.i<?> iVar) {
        kotlin.jvm.internal.l0.P();
        return new b(iVar);
    }

    @d5.d
    public static final <T> kotlinx.coroutines.flow.i<T> c(@d5.d kotlinx.coroutines.flow.i<? extends T> iVar, @d5.d q3.p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
        return new c(iVar, pVar);
    }

    @d5.d
    public static final <T> kotlinx.coroutines.flow.i<T> d(@d5.d kotlinx.coroutines.flow.i<? extends T> iVar) {
        return new d(iVar);
    }

    @d5.d
    public static final <T, R> kotlinx.coroutines.flow.i<R> e(@d5.d kotlinx.coroutines.flow.i<? extends T> iVar, @d5.d q3.p<? super T, ? super Continuation<? super R>, ? extends Object> pVar) {
        return new e(iVar, pVar);
    }

    @d5.d
    public static final <T, R> kotlinx.coroutines.flow.i<R> f(@d5.d kotlinx.coroutines.flow.i<? extends T> iVar, @d5.d q3.p<? super T, ? super Continuation<? super R>, ? extends Object> pVar) {
        return new f(iVar, pVar);
    }

    @d5.d
    public static final <T> kotlinx.coroutines.flow.i<T> g(@d5.d kotlinx.coroutines.flow.i<? extends T> iVar, @d5.d q3.p<? super T, ? super Continuation<? super m2>, ? extends Object> pVar) {
        return new g(iVar, pVar);
    }

    @d5.d
    public static final <T, R> kotlinx.coroutines.flow.i<R> h(@d5.d kotlinx.coroutines.flow.i<? extends T> iVar, R r5, @BuilderInference @d5.d q3.q<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> qVar) {
        return new h(r5, iVar, qVar);
    }

    @d5.d
    public static final <T> kotlinx.coroutines.flow.i<T> i(@d5.d kotlinx.coroutines.flow.i<? extends T> iVar, @d5.d q3.q<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> qVar) {
        return new j(iVar, qVar);
    }

    @d5.d
    public static final <T, R> kotlinx.coroutines.flow.i<R> j(@d5.d kotlinx.coroutines.flow.i<? extends T> iVar, R r5, @BuilderInference @d5.d q3.q<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> qVar) {
        return new h(r5, iVar, qVar);
    }

    @d5.d
    public static final <T> kotlinx.coroutines.flow.i<IndexedValue<T>> k(@d5.d kotlinx.coroutines.flow.i<? extends T> iVar) {
        return new l(iVar);
    }
}
