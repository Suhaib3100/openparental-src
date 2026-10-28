package kotlinx.coroutines.flow;

import java.util.Iterator;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.m2;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongRange;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.d2;

/* compiled from: Builders.kt */
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0007\u001a8\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0012\u001a\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0014\u001a-\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0016\"\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0012\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000\u001a#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\u001e\u0010\u0019\u001a\u0010\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\b*\u00020\u001f\u001a\u0010\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\b*\u00020\"\u001a\u0010\u0010&\u001a\b\u0012\u0004\u0012\u00020 0\b*\u00020%\u001a\u0010\u0010(\u001a\b\u0012\u0004\u0012\u00020#0\b*\u00020'\u001aM\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b*\u0010\n\u001aM\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b+\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"T", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/j;", "Lkotlin/coroutines/d;", "Lkotlin/m2;", "", "Lkotlin/u;", "block", "Lkotlinx/coroutines/flow/i;", "n", "(Lq3/p;)Lkotlinx/coroutines/flow/i;", "Lkotlin/Function0;", "f", "Lkotlin/Function1;", "g", "(Lq3/l;)Lkotlinx/coroutines/flow/i;", "", "a", "", "b", "Lkotlin/sequences/m;", "e", "", "elements", "p", "([Ljava/lang/Object;)Lkotlinx/coroutines/flow/i;", "value", "o", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/i;", "m", "j", "", "", "h", "", "", "i", "Lkotlin/ranges/l;", "c", "Lkotlin/ranges/o;", "d", "Lkotlinx/coroutines/channels/e0;", "l", "k", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes5.dex */
final /* synthetic */ class l {

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a implements kotlinx.coroutines.flow.i<Long> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ LongRange f28162o;

        /* compiled from: SafeCollector.common.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d19"}, s = {"L$0"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: kotlinx.coroutines.flow.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0435a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f28163r;

            /* renamed from: s, reason: collision with root package name */
            int f28164s;

            /* renamed from: u, reason: collision with root package name */
            Object f28166u;

            /* renamed from: v, reason: collision with root package name */
            Object f28167v;

            public C0435a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28163r = obj;
                this.f28164s |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(LongRange longRange) {
            this.f28162o = longRange;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.i
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@d5.d kotlinx.coroutines.flow.j<? super java.lang.Long> r8, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.l.a.C0435a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.l$a$a r0 = (kotlinx.coroutines.flow.l.a.C0435a) r0
                int r1 = r0.f28164s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28164s = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$a$a r0 = new kotlinx.coroutines.flow.l$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f28163r
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28164s
                r3 = 1
                if (r2 == 0) goto L3c
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.f28167v
                java.util.Iterator r8 = (java.util.Iterator) r8
                java.lang.Object r2 = r0.f28166u
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                kotlin.a1.n(r9)
                r9 = r2
                goto L48
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "嵥"
                java.lang.String r9 = com.flashget.kidsdownloader.ProtectedSandApp.s(r9)
                r8.<init>(r9)
                throw r8
            L3c:
                kotlin.a1.n(r9)
                kotlin.ranges.o r9 = r7.f28162o
                java.util.Iterator r9 = r9.iterator()
                r6 = r9
                r9 = r8
                r8 = r6
            L48:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto L67
                r2 = r8
                kotlin.collections.y0 r2 = (kotlin.collections.LongIterator) r2
                long r4 = r2.nextLong()
                java.lang.Long r2 = new java.lang.Long
                r2.<init>(r4)
                r0.f28166u = r9
                r0.f28167v = r8
                r0.f28164s = r3
                java.lang.Object r2 = r9.b(r2, r0)
                if (r2 != r1) goto L48
                return r1
            L67:
                kotlin.m2 r8 = kotlin.m2.f23662a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.a.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.a f28168o;

        public b(q3.a aVar) {
            this.f28168o = aVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d kotlinx.coroutines.flow.j<? super T> jVar, @d5.d Continuation<? super m2> continuation) {
            Object b6 = jVar.b((Object) this.f28168o.n(), continuation);
            return b6 == CoroutineSingletons.COROUTINE_SUSPENDED ? b6 : m2.f23662a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class c<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.l f28169o;

        /* compiled from: SafeCollector.common.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2", f = "Builders.kt", i = {}, l = {113, 113}, m = "collect", n = {}, s = {})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f28170r;

            /* renamed from: s, reason: collision with root package name */
            int f28171s;

            /* renamed from: u, reason: collision with root package name */
            Object f28173u;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28170r = obj;
                this.f28171s |= Integer.MIN_VALUE;
                return c.this.a(null, this);
            }
        }

        public c(q3.l lVar) {
            this.f28169o = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // kotlinx.coroutines.flow.i
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@d5.d kotlinx.coroutines.flow.j<? super T> r6, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.l.c.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.l$c$a r0 = (kotlinx.coroutines.flow.l.c.a) r0
                int r1 = r0.f28171s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28171s = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$c$a r0 = new kotlinx.coroutines.flow.l$c$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f28170r
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28171s
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3e
                if (r2 == r4) goto L36
                if (r2 != r3) goto L2a
                kotlin.a1.n(r7)
                goto L5a
            L2a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "嵦"
                java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
                r6.<init>(r7)
                throw r6
            L36:
                java.lang.Object r6 = r0.f28173u
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                kotlin.a1.n(r7)
                goto L4e
            L3e:
                kotlin.a1.n(r7)
                q3.l r7 = r5.f28169o
                r0.f28173u = r6
                r0.f28171s = r4
                java.lang.Object r7 = r7.N(r0)
                if (r7 != r1) goto L4e
                return r1
            L4e:
                r2 = 0
                r0.f28173u = r2
                r0.f28171s = r3
                java.lang.Object r6 = r6.b(r7, r0)
                if (r6 != r1) goto L5a
                return r1
            L5a:
                kotlin.m2 r6 = kotlin.m2.f23662a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.c.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class d<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Iterable f28174o;

        /* compiled from: SafeCollector.common.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d3"}, s = {"L$0"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f28175r;

            /* renamed from: s, reason: collision with root package name */
            int f28176s;

            /* renamed from: u, reason: collision with root package name */
            Object f28178u;

            /* renamed from: v, reason: collision with root package name */
            Object f28179v;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28175r = obj;
                this.f28176s |= Integer.MIN_VALUE;
                return d.this.a(null, this);
            }
        }

        public d(Iterable iterable) {
            this.f28174o = iterable;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.i
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@d5.d kotlinx.coroutines.flow.j<? super T> r6, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.l.d.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.l$d$a r0 = (kotlinx.coroutines.flow.l.d.a) r0
                int r1 = r0.f28176s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28176s = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$d$a r0 = new kotlinx.coroutines.flow.l$d$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f28175r
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28176s
                r3 = 1
                if (r2 == 0) goto L3c
                if (r2 != r3) goto L30
                java.lang.Object r6 = r0.f28179v
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.f28178u
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                kotlin.a1.n(r7)
                r7 = r2
                goto L48
            L30:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "嵧"
                java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
                r6.<init>(r7)
                throw r6
            L3c:
                kotlin.a1.n(r7)
                java.lang.Iterable r7 = r5.f28174o
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L48:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L5f
                java.lang.Object r2 = r6.next()
                r0.f28178u = r7
                r0.f28179v = r6
                r0.f28176s = r3
                java.lang.Object r2 = r7.b(r2, r0)
                if (r2 != r1) goto L48
                return r1
            L5f:
                kotlin.m2 r6 = kotlin.m2.f23662a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.d.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class e<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Iterator f28180o;

        /* compiled from: SafeCollector.common.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d5"}, s = {"L$0"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f28181r;

            /* renamed from: s, reason: collision with root package name */
            int f28182s;

            /* renamed from: u, reason: collision with root package name */
            Object f28184u;

            /* renamed from: v, reason: collision with root package name */
            Object f28185v;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28181r = obj;
                this.f28182s |= Integer.MIN_VALUE;
                return e.this.a(null, this);
            }
        }

        public e(Iterator it) {
            this.f28180o = it;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.i
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@d5.d kotlinx.coroutines.flow.j<? super T> r6, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.l.e.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.l$e$a r0 = (kotlinx.coroutines.flow.l.e.a) r0
                int r1 = r0.f28182s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28182s = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$e$a r0 = new kotlinx.coroutines.flow.l$e$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f28181r
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28182s
                r3 = 1
                if (r2 == 0) goto L3c
                if (r2 != r3) goto L30
                java.lang.Object r6 = r0.f28185v
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.f28184u
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                kotlin.a1.n(r7)
                r7 = r2
                goto L44
            L30:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "嵨"
                java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
                r6.<init>(r7)
                throw r6
            L3c:
                kotlin.a1.n(r7)
                java.util.Iterator r7 = r5.f28180o
                r4 = r7
                r7 = r6
                r6 = r4
            L44:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L5b
                java.lang.Object r2 = r6.next()
                r0.f28184u = r7
                r0.f28185v = r6
                r0.f28182s = r3
                java.lang.Object r2 = r7.b(r2, r0)
                if (r2 != r1) goto L44
                return r1
            L5b:
                kotlin.m2 r6 = kotlin.m2.f23662a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.e.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class f<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Sequence f28186o;

        /* compiled from: SafeCollector.common.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d7"}, s = {"L$0"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f28187r;

            /* renamed from: s, reason: collision with root package name */
            int f28188s;

            /* renamed from: u, reason: collision with root package name */
            Object f28190u;

            /* renamed from: v, reason: collision with root package name */
            Object f28191v;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28187r = obj;
                this.f28188s |= Integer.MIN_VALUE;
                return f.this.a(null, this);
            }
        }

        public f(Sequence sequence) {
            this.f28186o = sequence;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.i
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@d5.d kotlinx.coroutines.flow.j<? super T> r6, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.l.f.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.l$f$a r0 = (kotlinx.coroutines.flow.l.f.a) r0
                int r1 = r0.f28188s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28188s = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$f$a r0 = new kotlinx.coroutines.flow.l$f$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f28187r
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28188s
                r3 = 1
                if (r2 == 0) goto L3c
                if (r2 != r3) goto L30
                java.lang.Object r6 = r0.f28191v
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.f28190u
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                kotlin.a1.n(r7)
                r7 = r2
                goto L48
            L30:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "嵩"
                java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
                r6.<init>(r7)
                throw r6
            L3c:
                kotlin.a1.n(r7)
                kotlin.sequences.m r7 = r5.f28186o
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L48:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L5f
                java.lang.Object r2 = r6.next()
                r0.f28190u = r7
                r0.f28191v = r6
                r0.f28188s = r3
                java.lang.Object r2 = r7.b(r2, r0)
                if (r2 != r1) goto L48
                return r1
            L5f:
                kotlin.m2 r6 = kotlin.m2.f23662a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.f.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class g<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Object[] f28192o;

        /* compiled from: SafeCollector.common.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6", f = "Builders.kt", i = {0, 0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d11", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f28193r;

            /* renamed from: s, reason: collision with root package name */
            int f28194s;

            /* renamed from: u, reason: collision with root package name */
            Object f28196u;

            /* renamed from: v, reason: collision with root package name */
            Object f28197v;

            /* renamed from: w, reason: collision with root package name */
            int f28198w;

            /* renamed from: x, reason: collision with root package name */
            int f28199x;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28193r = obj;
                this.f28194s |= Integer.MIN_VALUE;
                return g.this.a(null, this);
            }
        }

        public g(Object[] objArr) {
            this.f28192o = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005e -> B:10:0x0061). Please report as a decompilation issue!!! */
        @Override // kotlinx.coroutines.flow.i
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@d5.d kotlinx.coroutines.flow.j<? super T> r8, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.l.g.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.l$g$a r0 = (kotlinx.coroutines.flow.l.g.a) r0
                int r1 = r0.f28194s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28194s = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$g$a r0 = new kotlinx.coroutines.flow.l$g$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f28193r
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28194s
                r3 = 1
                if (r2 == 0) goto L40
                if (r2 != r3) goto L34
                int r8 = r0.f28199x
                int r2 = r0.f28198w
                java.lang.Object r4 = r0.f28197v
                java.lang.Object[] r4 = (java.lang.Object[]) r4
                java.lang.Object r5 = r0.f28196u
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.j) r5
                kotlin.a1.n(r9)
                r9 = r5
                goto L61
            L34:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "嵪"
                java.lang.String r9 = com.flashget.kidsdownloader.ProtectedSandApp.s(r9)
                r8.<init>(r9)
                throw r8
            L40:
                kotlin.a1.n(r9)
                java.lang.Object[] r9 = r7.f28192o
                int r2 = r9.length
                r4 = 0
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r4
                r4 = r6
            L4c:
                if (r2 >= r8) goto L63
                r5 = r4[r2]
                r0.f28196u = r9
                r0.f28197v = r4
                r0.f28198w = r2
                r0.f28199x = r8
                r0.f28194s = r3
                java.lang.Object r5 = r9.b(r5, r0)
                if (r5 != r1) goto L61
                return r1
            L61:
                int r2 = r2 + r3
                goto L4c
            L63:
                kotlin.m2 r8 = kotlin.m2.f23662a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.g.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class h implements kotlinx.coroutines.flow.i<Integer> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int[] f28200o;

        /* compiled from: SafeCollector.common.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7", f = "Builders.kt", i = {0, 0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d13", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f28201r;

            /* renamed from: s, reason: collision with root package name */
            int f28202s;

            /* renamed from: u, reason: collision with root package name */
            Object f28204u;

            /* renamed from: v, reason: collision with root package name */
            Object f28205v;

            /* renamed from: w, reason: collision with root package name */
            int f28206w;

            /* renamed from: x, reason: collision with root package name */
            int f28207x;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28201r = obj;
                this.f28202s |= Integer.MIN_VALUE;
                return h.this.a(null, this);
            }
        }

        public h(int[] iArr) {
            this.f28200o = iArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0063 -> B:10:0x0066). Please report as a decompilation issue!!! */
        @Override // kotlinx.coroutines.flow.i
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@d5.d kotlinx.coroutines.flow.j<? super java.lang.Integer> r9, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof kotlinx.coroutines.flow.l.h.a
                if (r0 == 0) goto L13
                r0 = r10
                kotlinx.coroutines.flow.l$h$a r0 = (kotlinx.coroutines.flow.l.h.a) r0
                int r1 = r0.f28202s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28202s = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$h$a r0 = new kotlinx.coroutines.flow.l$h$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f28201r
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28202s
                r3 = 1
                if (r2 == 0) goto L40
                if (r2 != r3) goto L34
                int r9 = r0.f28207x
                int r2 = r0.f28206w
                java.lang.Object r4 = r0.f28205v
                int[] r4 = (int[]) r4
                java.lang.Object r5 = r0.f28204u
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.j) r5
                kotlin.a1.n(r10)
                r10 = r5
                goto L66
            L34:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "嵫"
                java.lang.String r10 = com.flashget.kidsdownloader.ProtectedSandApp.s(r10)
                r9.<init>(r10)
                throw r9
            L40:
                kotlin.a1.n(r10)
                int[] r10 = r8.f28200o
                int r2 = r10.length
                r4 = 0
                r7 = r10
                r10 = r9
                r9 = r2
                r2 = r4
                r4 = r7
            L4c:
                if (r2 >= r9) goto L68
                r5 = r4[r2]
                java.lang.Integer r6 = new java.lang.Integer
                r6.<init>(r5)
                r0.f28204u = r10
                r0.f28205v = r4
                r0.f28206w = r2
                r0.f28207x = r9
                r0.f28202s = r3
                java.lang.Object r5 = r10.b(r6, r0)
                if (r5 != r1) goto L66
                return r1
            L66:
                int r2 = r2 + r3
                goto L4c
            L68:
                kotlin.m2 r9 = kotlin.m2.f23662a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.h.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class i implements kotlinx.coroutines.flow.i<Long> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ long[] f28208o;

        /* compiled from: SafeCollector.common.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8", f = "Builders.kt", i = {0, 0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d15", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f28209r;

            /* renamed from: s, reason: collision with root package name */
            int f28210s;

            /* renamed from: u, reason: collision with root package name */
            Object f28212u;

            /* renamed from: v, reason: collision with root package name */
            Object f28213v;

            /* renamed from: w, reason: collision with root package name */
            int f28214w;

            /* renamed from: x, reason: collision with root package name */
            int f28215x;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28209r = obj;
                this.f28210s |= Integer.MIN_VALUE;
                return i.this.a(null, this);
            }
        }

        public i(long[] jArr) {
            this.f28208o = jArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0063 -> B:10:0x0066). Please report as a decompilation issue!!! */
        @Override // kotlinx.coroutines.flow.i
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@d5.d kotlinx.coroutines.flow.j<? super java.lang.Long> r10, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof kotlinx.coroutines.flow.l.i.a
                if (r0 == 0) goto L13
                r0 = r11
                kotlinx.coroutines.flow.l$i$a r0 = (kotlinx.coroutines.flow.l.i.a) r0
                int r1 = r0.f28210s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28210s = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$i$a r0 = new kotlinx.coroutines.flow.l$i$a
                r0.<init>(r11)
            L18:
                java.lang.Object r11 = r0.f28209r
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28210s
                r3 = 1
                if (r2 == 0) goto L40
                if (r2 != r3) goto L34
                int r10 = r0.f28215x
                int r2 = r0.f28214w
                java.lang.Object r4 = r0.f28213v
                long[] r4 = (long[]) r4
                java.lang.Object r5 = r0.f28212u
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.j) r5
                kotlin.a1.n(r11)
                r11 = r5
                goto L66
            L34:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "嵬"
                java.lang.String r11 = com.flashget.kidsdownloader.ProtectedSandApp.s(r11)
                r10.<init>(r11)
                throw r10
            L40:
                kotlin.a1.n(r11)
                long[] r11 = r9.f28208o
                int r2 = r11.length
                r4 = 0
                r8 = r11
                r11 = r10
                r10 = r2
                r2 = r4
                r4 = r8
            L4c:
                if (r2 >= r10) goto L68
                r5 = r4[r2]
                java.lang.Long r7 = new java.lang.Long
                r7.<init>(r5)
                r0.f28212u = r11
                r0.f28213v = r4
                r0.f28214w = r2
                r0.f28215x = r10
                r0.f28210s = r3
                java.lang.Object r5 = r11.b(r7, r0)
                if (r5 != r1) goto L66
                return r1
            L66:
                int r2 = r2 + r3
                goto L4c
            L68:
                kotlin.m2 r10 = kotlin.m2.f23662a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.i.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class j implements kotlinx.coroutines.flow.i<Integer> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ IntRange f28216o;

        /* compiled from: SafeCollector.common.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d17"}, s = {"L$0"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f28217r;

            /* renamed from: s, reason: collision with root package name */
            int f28218s;

            /* renamed from: u, reason: collision with root package name */
            Object f28220u;

            /* renamed from: v, reason: collision with root package name */
            Object f28221v;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28217r = obj;
                this.f28218s |= Integer.MIN_VALUE;
                return j.this.a(null, this);
            }
        }

        public j(IntRange intRange) {
            this.f28216o = intRange;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.i
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@d5.d kotlinx.coroutines.flow.j<? super java.lang.Integer> r7, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.l.j.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.l$j$a r0 = (kotlinx.coroutines.flow.l.j.a) r0
                int r1 = r0.f28218s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28218s = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$j$a r0 = new kotlinx.coroutines.flow.l$j$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f28217r
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28218s
                r3 = 1
                if (r2 == 0) goto L3c
                if (r2 != r3) goto L30
                java.lang.Object r7 = r0.f28221v
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r2 = r0.f28220u
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                kotlin.a1.n(r8)
                r8 = r2
                goto L48
            L30:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "嵭"
                java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
                r7.<init>(r8)
                throw r7
            L3c:
                kotlin.a1.n(r8)
                kotlin.ranges.l r8 = r6.f28216o
                java.util.Iterator r8 = r8.iterator()
                r5 = r8
                r8 = r7
                r7 = r5
            L48:
                boolean r2 = r7.hasNext()
                if (r2 == 0) goto L67
                r2 = r7
                kotlin.collections.x0 r2 = (kotlin.collections.IntIterator) r2
                int r2 = r2.nextInt()
                java.lang.Integer r4 = new java.lang.Integer
                r4.<init>(r2)
                r0.f28220u = r8
                r0.f28221v = r7
                r0.f28218s = r3
                java.lang.Object r2 = r8.b(r4, r0)
                if (r2 != r1) goto L48
                return r1
            L67:
                kotlin.m2 r7 = kotlin.m2.f23662a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.j.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class k<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Object[] f28222o;

        /* compiled from: SafeCollector.common.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", f = "Builders.kt", i = {0, 0}, l = {114}, m = "collect", n = {"this", "$this$flowOf_u24lambda_u2d8"}, s = {"L$0", "L$1"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f28223r;

            /* renamed from: s, reason: collision with root package name */
            int f28224s;

            /* renamed from: u, reason: collision with root package name */
            Object f28226u;

            /* renamed from: v, reason: collision with root package name */
            Object f28227v;

            /* renamed from: w, reason: collision with root package name */
            int f28228w;

            /* renamed from: x, reason: collision with root package name */
            int f28229x;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28223r = obj;
                this.f28224s |= Integer.MIN_VALUE;
                return k.this.a(null, this);
            }
        }

        public k(Object[] objArr) {
            this.f28222o = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005f -> B:10:0x0062). Please report as a decompilation issue!!! */
        @Override // kotlinx.coroutines.flow.i
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@d5.d kotlinx.coroutines.flow.j<? super T> r8, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.l.k.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.l$k$a r0 = (kotlinx.coroutines.flow.l.k.a) r0
                int r1 = r0.f28224s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28224s = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$k$a r0 = new kotlinx.coroutines.flow.l$k$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f28223r
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28224s
                r3 = 1
                if (r2 == 0) goto L40
                if (r2 != r3) goto L34
                int r8 = r0.f28229x
                int r2 = r0.f28228w
                java.lang.Object r4 = r0.f28227v
                kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
                java.lang.Object r5 = r0.f28226u
                kotlinx.coroutines.flow.l$k r5 = (kotlinx.coroutines.flow.l.k) r5
                kotlin.a1.n(r9)
                r9 = r4
                goto L62
            L34:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "嵮"
                java.lang.String r9 = com.flashget.kidsdownloader.ProtectedSandApp.s(r9)
                r8.<init>(r9)
                throw r8
            L40:
                kotlin.a1.n(r9)
                java.lang.Object[] r9 = r7.f28222o
                int r9 = r9.length
                r2 = 0
                r5 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L4b:
                if (r2 >= r8) goto L64
                java.lang.Object[] r4 = r5.f28222o
                r4 = r4[r2]
                r0.f28226u = r5
                r0.f28227v = r9
                r0.f28228w = r2
                r0.f28229x = r8
                r0.f28224s = r3
                java.lang.Object r4 = r9.b(r4, r0)
                if (r4 != r1) goto L62
                return r1
            L62:
                int r2 = r2 + r3
                goto L4b
            L64:
                kotlin.m2 r8 = kotlin.m2.f23662a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.k.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.l$l, reason: collision with other inner class name */
    public static final class C0436l<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Object f28230o;

        public C0436l(Object obj) {
            this.f28230o = obj;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d kotlinx.coroutines.flow.j<? super T> jVar, @d5.d Continuation<? super m2> continuation) {
            Object b6 = jVar.b((Object) this.f28230o, continuation);
            return b6 == CoroutineSingletons.COROUTINE_SUSPENDED ? b6 : m2.f23662a;
        }
    }

    @d5.d
    public static final <T> kotlinx.coroutines.flow.i<T> a(@d5.d Iterable<? extends T> iterable) {
        return new d(iterable);
    }

    @d5.d
    public static final <T> kotlinx.coroutines.flow.i<T> b(@d5.d Iterator<? extends T> it) {
        return new e(it);
    }

    @d5.d
    public static final kotlinx.coroutines.flow.i<Integer> c(@d5.d IntRange intRange) {
        return new j(intRange);
    }

    @d5.d
    public static final kotlinx.coroutines.flow.i<Long> d(@d5.d LongRange longRange) {
        return new a(longRange);
    }

    @d5.d
    public static final <T> kotlinx.coroutines.flow.i<T> e(@d5.d Sequence<? extends T> sequence) {
        return new f(sequence);
    }

    @d2
    @d5.d
    public static final <T> kotlinx.coroutines.flow.i<T> f(@d5.d q3.a<? extends T> aVar) {
        return new b(aVar);
    }

    @d2
    @d5.d
    public static final <T> kotlinx.coroutines.flow.i<T> g(@d5.d q3.l<? super Continuation<? super T>, ? extends Object> lVar) {
        return new c(lVar);
    }

    @d5.d
    public static final kotlinx.coroutines.flow.i<Integer> h(@d5.d int[] iArr) {
        return new h(iArr);
    }

    @d5.d
    public static final kotlinx.coroutines.flow.i<Long> i(@d5.d long[] jArr) {
        return new i(jArr);
    }

    @d5.d
    public static final <T> kotlinx.coroutines.flow.i<T> j(@d5.d T[] tArr) {
        return new g(tArr);
    }

    @d5.d
    public static final <T> kotlinx.coroutines.flow.i<T> k(@BuilderInference @d5.d q3.p<? super kotlinx.coroutines.channels.e0<? super T>, ? super Continuation<? super m2>, ? extends Object> pVar) {
        return new kotlinx.coroutines.flow.b(pVar, null, 0, null, 14, null);
    }

    @d5.d
    public static final <T> kotlinx.coroutines.flow.i<T> l(@BuilderInference @d5.d q3.p<? super kotlinx.coroutines.channels.e0<? super T>, ? super Continuation<? super m2>, ? extends Object> pVar) {
        return new kotlinx.coroutines.flow.f(pVar, null, 0, null, 14, null);
    }

    @d5.d
    public static final <T> kotlinx.coroutines.flow.i<T> m() {
        return kotlinx.coroutines.flow.h.f27988o;
    }

    @d5.d
    public static final <T> kotlinx.coroutines.flow.i<T> n(@BuilderInference @d5.d q3.p<? super kotlinx.coroutines.flow.j<? super T>, ? super Continuation<? super m2>, ? extends Object> pVar) {
        return new h0(pVar);
    }

    @d5.d
    public static final <T> kotlinx.coroutines.flow.i<T> o(T t5) {
        return new C0436l(t5);
    }

    @d5.d
    public static final <T> kotlinx.coroutines.flow.i<T> p(@d5.d T... tArr) {
        return new k(tArr);
    }
}
