package kotlinx.coroutines.flow;

import java.util.Iterator;
import kotlin.InterfaceC1469b;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\f\u0010\r\u001a6\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000eø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u0018\u0010\u0019\u001a-\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001a\"\u00028\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u001e\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0019\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b!\u0010\"\u001a#\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b#\u0010\u001d\u001a\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\b*\u00020$¢\u0006\u0004\b&\u0010'\u001a\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\b*\u00020(¢\u0006\u0004\b*\u0010+\u001a\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020%0\b*\u00020,¢\u0006\u0004\b-\u0010.\u001a\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020)0\b*\u00020/¢\u0006\u0004\b0\u00101\u001aM\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b3\u0010\n\u001aM\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b4\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"T", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/j;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "block", "Lkotlinx/coroutines/flow/i;", "n", "(Lld/p;)Lkotlinx/coroutines/flow/i;", "Lkotlin/Function0;", "f", "(Lld/a;)Lkotlinx/coroutines/flow/i;", "Lkotlin/Function1;", "g", "(Lld/l;)Lkotlinx/coroutines/flow/i;", "", "a", "(Ljava/lang/Iterable;)Lkotlinx/coroutines/flow/i;", "", "b", "(Ljava/util/Iterator;)Lkotlinx/coroutines/flow/i;", "Lkotlin/sequences/m;", "e", "(Lkotlin/sequences/m;)Lkotlinx/coroutines/flow/i;", "", "elements", "p", "([Ljava/lang/Object;)Lkotlinx/coroutines/flow/i;", "value", "o", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/i;", "m", "()Lkotlinx/coroutines/flow/i;", "j", "", "", "h", "([I)Lkotlinx/coroutines/flow/i;", "", "", "i", "([J)Lkotlinx/coroutines/flow/i;", "Lkotlin/ranges/l;", "c", "(Lkotlin/ranges/l;)Lkotlinx/coroutines/flow/i;", "Lkotlin/ranges/o;", "d", "(Lkotlin/ranges/o;)Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/channels/b0;", "l", "k", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@r1({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,354:1\n107#2:355\n107#2:356\n107#2:357\n107#2:358\n107#2:359\n107#2:360\n107#2:361\n107#2:362\n107#2:363\n107#2:364\n107#2:365\n107#2:366\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n68#1:355\n82#1:356\n89#1:357\n98#1:358\n107#1:359\n122#1:360\n131#1:361\n153#1:362\n164#1:363\n175#1:364\n184#1:365\n193#1:366\n*E\n"})
/* loaded from: classes7.dex */
public final /* synthetic */ class l {

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,113:1\n194#2:114\n195#2,2:116\n197#2:119\n1855#3:115\n1856#3:118\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n194#1:115\n194#1:118\n*E\n"})
    public static final class a implements kotlinx.coroutines.flow.i<Long> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.o f80195b;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10", f = "Builders.kt", i = {0}, l = {116}, m = "collect", n = {"$this$asFlow_u24lambda_u2419"}, s = {"L$0"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        /* renamed from: kotlinx.coroutines.flow.l$a$a, reason: collision with other inner class name */
        public static final class C1242a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f80196b;

            /* renamed from: c, reason: collision with root package name */
            int f80197c;

            /* renamed from: e, reason: collision with root package name */
            Object f80199e;

            /* renamed from: f, reason: collision with root package name */
            Object f80200f;

            public C1242a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80196b = obj;
                this.f80197c |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(kotlin.ranges.o oVar) {
            this.f80195b = oVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.i
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@fg.l kotlinx.coroutines.flow.j<? super java.lang.Long> r8, @fg.l kotlin.coroutines.d<? super kotlin.k2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.l.a.C1242a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.l$a$a r0 = (kotlinx.coroutines.flow.l.a.C1242a) r0
                int r1 = r0.f80197c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80197c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$a$a r0 = new kotlinx.coroutines.flow.l$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f80196b
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80197c
                r3 = 1
                if (r2 == 0) goto L3c
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.f80200f
                java.util.Iterator r8 = (java.util.Iterator) r8
                java.lang.Object r2 = r0.f80199e
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                kotlin.a1.n(r9)
                r9 = r2
                goto L48
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "蝅\u0001"
                java.lang.String r9 = com.flashget.parentalcontrol.ProtectedSandApp.s(r9)
                r8.<init>(r9)
                throw r8
            L3c:
                kotlin.a1.n(r9)
                kotlin.ranges.o r9 = r7.f80195b
                java.util.Iterator r9 = r9.iterator()
                r6 = r9
                r9 = r8
                r8 = r6
            L48:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto L67
                r2 = r8
                kotlin.collections.v0 r2 = (kotlin.collections.v0) r2
                long r4 = r2.c()
                java.lang.Long r2 = new java.lang.Long
                r2.<init>(r4)
                r0.f80199e = r9
                r0.f80200f = r8
                r0.f80197c = r3
                java.lang.Object r2 = r9.emit(r2, r0)
                if (r2 != r1) goto L48
                return r1
            L67:
                kotlin.k2 r8 = kotlin.k2.f75408a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.a.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,113:1\n69#2,2:114\n*E\n"})
    public static final class b<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a f80201b;

        public b(ld.a aVar) {
            this.f80201b = aVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j<? super T> jVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            Object emit = jVar.emit((Object) this.f80201b.invoke(), dVar);
            return emit == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? emit : k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,113:1\n83#2,2:114\n*E\n"})
    public static final class c<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l f80202b;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2", f = "Builders.kt", i = {}, l = {114, 114}, m = "collect", n = {}, s = {})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f80203b;

            /* renamed from: c, reason: collision with root package name */
            int f80204c;

            /* renamed from: e, reason: collision with root package name */
            Object f80206e;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80203b = obj;
                this.f80204c |= Integer.MIN_VALUE;
                return c.this.a(null, this);
            }
        }

        public c(ld.l lVar) {
            this.f80202b = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // kotlinx.coroutines.flow.i
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@fg.l kotlinx.coroutines.flow.j<? super T> r6, @fg.l kotlin.coroutines.d<? super kotlin.k2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.l.c.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.l$c$a r0 = (kotlinx.coroutines.flow.l.c.a) r0
                int r1 = r0.f80204c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80204c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$c$a r0 = new kotlinx.coroutines.flow.l$c$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f80203b
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80204c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3e
                if (r2 == r4) goto L36
                if (r2 != r3) goto L2a
                kotlin.a1.n(r7)
                goto L5a
            L2a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "蝆\u0001"
                java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
                r6.<init>(r7)
                throw r6
            L36:
                java.lang.Object r6 = r0.f80206e
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                kotlin.a1.n(r7)
                goto L4e
            L3e:
                kotlin.a1.n(r7)
                ld.l r7 = r5.f80202b
                r0.f80206e = r6
                r0.f80204c = r4
                java.lang.Object r7 = r7.invoke(r0)
                if (r7 != r1) goto L4e
                return r1
            L4e:
                r2 = 0
                r0.f80206e = r2
                r0.f80204c = r3
                java.lang.Object r6 = r6.emit(r7, r0)
                if (r6 != r1) goto L5a
                return r1
            L5a:
                kotlin.k2 r6 = kotlin.k2.f75408a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.c.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,113:1\n90#2:114\n91#2,2:116\n93#2:119\n1855#3:115\n1856#3:118\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n90#1:115\n90#1:118\n*E\n"})
    public static final class d<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f80207b;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", f = "Builders.kt", i = {0}, l = {116}, m = "collect", n = {"$this$asFlow_u24lambda_u243"}, s = {"L$0"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f80208b;

            /* renamed from: c, reason: collision with root package name */
            int f80209c;

            /* renamed from: e, reason: collision with root package name */
            Object f80211e;

            /* renamed from: f, reason: collision with root package name */
            Object f80212f;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80208b = obj;
                this.f80209c |= Integer.MIN_VALUE;
                return d.this.a(null, this);
            }
        }

        public d(Iterable iterable) {
            this.f80207b = iterable;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.i
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@fg.l kotlinx.coroutines.flow.j<? super T> r6, @fg.l kotlin.coroutines.d<? super kotlin.k2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.l.d.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.l$d$a r0 = (kotlinx.coroutines.flow.l.d.a) r0
                int r1 = r0.f80209c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80209c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$d$a r0 = new kotlinx.coroutines.flow.l$d$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f80208b
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80209c
                r3 = 1
                if (r2 == 0) goto L3c
                if (r2 != r3) goto L30
                java.lang.Object r6 = r0.f80212f
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.f80211e
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                kotlin.a1.n(r7)
                r7 = r2
                goto L48
            L30:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "蝇\u0001"
                java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
                r6.<init>(r7)
                throw r6
            L3c:
                kotlin.a1.n(r7)
                java.lang.Iterable r7 = r5.f80207b
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L48:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L5f
                java.lang.Object r2 = r6.next()
                r0.f80211e = r7
                r0.f80212f = r6
                r0.f80209c = r3
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L48
                return r1
            L5f:
                kotlin.k2 r6 = kotlin.k2.f75408a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.d.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,113:1\n99#2:114\n100#2,2:116\n102#2:119\n32#3:115\n33#3:118\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n99#1:115\n99#1:118\n*E\n"})
    public static final class e<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterator f80213b;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4", f = "Builders.kt", i = {0}, l = {116}, m = "collect", n = {"$this$asFlow_u24lambda_u245"}, s = {"L$0"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f80214b;

            /* renamed from: c, reason: collision with root package name */
            int f80215c;

            /* renamed from: e, reason: collision with root package name */
            Object f80217e;

            /* renamed from: f, reason: collision with root package name */
            Object f80218f;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80214b = obj;
                this.f80215c |= Integer.MIN_VALUE;
                return e.this.a(null, this);
            }
        }

        public e(Iterator it) {
            this.f80213b = it;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.i
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@fg.l kotlinx.coroutines.flow.j<? super T> r6, @fg.l kotlin.coroutines.d<? super kotlin.k2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.l.e.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.l$e$a r0 = (kotlinx.coroutines.flow.l.e.a) r0
                int r1 = r0.f80215c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80215c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$e$a r0 = new kotlinx.coroutines.flow.l$e$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f80214b
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80215c
                r3 = 1
                if (r2 == 0) goto L3c
                if (r2 != r3) goto L30
                java.lang.Object r6 = r0.f80218f
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.f80217e
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                kotlin.a1.n(r7)
                r7 = r2
                goto L44
            L30:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "蝈\u0001"
                java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
                r6.<init>(r7)
                throw r6
            L3c:
                kotlin.a1.n(r7)
                java.util.Iterator r7 = r5.f80213b
                r4 = r7
                r7 = r6
                r6 = r4
            L44:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L5b
                java.lang.Object r2 = r6.next()
                r0.f80217e = r7
                r0.f80218f = r6
                r0.f80215c = r3
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L44
                return r1
            L5b:
                kotlin.k2 r6 = kotlin.k2.f75408a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.e.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,113:1\n108#2:114\n109#2,2:116\n111#2:119\n1295#3:115\n1296#3:118\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n108#1:115\n108#1:118\n*E\n"})
    public static final class f<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.sequences.m f80219b;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5", f = "Builders.kt", i = {0}, l = {116}, m = "collect", n = {"$this$asFlow_u24lambda_u247"}, s = {"L$0"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f80220b;

            /* renamed from: c, reason: collision with root package name */
            int f80221c;

            /* renamed from: e, reason: collision with root package name */
            Object f80223e;

            /* renamed from: f, reason: collision with root package name */
            Object f80224f;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80220b = obj;
                this.f80221c |= Integer.MIN_VALUE;
                return f.this.a(null, this);
            }
        }

        public f(kotlin.sequences.m mVar) {
            this.f80219b = mVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.i
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@fg.l kotlinx.coroutines.flow.j<? super T> r6, @fg.l kotlin.coroutines.d<? super kotlin.k2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.l.f.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.l$f$a r0 = (kotlinx.coroutines.flow.l.f.a) r0
                int r1 = r0.f80221c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80221c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$f$a r0 = new kotlinx.coroutines.flow.l$f$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f80220b
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80221c
                r3 = 1
                if (r2 == 0) goto L3c
                if (r2 != r3) goto L30
                java.lang.Object r6 = r0.f80224f
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.f80223e
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                kotlin.a1.n(r7)
                r7 = r2
                goto L48
            L30:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "蝉\u0001"
                java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
                r6.<init>(r7)
                throw r6
            L3c:
                kotlin.a1.n(r7)
                kotlin.sequences.m r7 = r5.f80219b
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L48:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L5f
                java.lang.Object r2 = r6.next()
                r0.f80223e = r7
                r0.f80224f = r6
                r0.f80221c = r3
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L48
                return r1
            L5f:
                kotlin.k2 r6 = kotlin.k2.f75408a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.f.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,113:1\n154#2:114\n155#2,2:116\n157#2:119\n13579#3:115\n13580#3:118\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n154#1:115\n154#1:118\n*E\n"})
    public static final class g<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f80225b;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6", f = "Builders.kt", i = {0, 0}, l = {116}, m = "collect", n = {"$this$asFlow_u24lambda_u2411", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f80226b;

            /* renamed from: c, reason: collision with root package name */
            int f80227c;

            /* renamed from: e, reason: collision with root package name */
            Object f80229e;

            /* renamed from: f, reason: collision with root package name */
            Object f80230f;

            /* renamed from: g, reason: collision with root package name */
            int f80231g;

            /* renamed from: h, reason: collision with root package name */
            int f80232h;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80226b = obj;
                this.f80227c |= Integer.MIN_VALUE;
                return g.this.a(null, this);
            }
        }

        public g(Object[] objArr) {
            this.f80225b = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005e -> B:10:0x0061). Please report as a decompilation issue!!! */
        @Override // kotlinx.coroutines.flow.i
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@fg.l kotlinx.coroutines.flow.j<? super T> r8, @fg.l kotlin.coroutines.d<? super kotlin.k2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.l.g.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.l$g$a r0 = (kotlinx.coroutines.flow.l.g.a) r0
                int r1 = r0.f80227c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80227c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$g$a r0 = new kotlinx.coroutines.flow.l$g$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f80226b
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80227c
                r3 = 1
                if (r2 == 0) goto L40
                if (r2 != r3) goto L34
                int r8 = r0.f80232h
                int r2 = r0.f80231g
                java.lang.Object r4 = r0.f80230f
                java.lang.Object[] r4 = (java.lang.Object[]) r4
                java.lang.Object r5 = r0.f80229e
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.j) r5
                kotlin.a1.n(r9)
                r9 = r5
                goto L61
            L34:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "蝊\u0001"
                java.lang.String r9 = com.flashget.parentalcontrol.ProtectedSandApp.s(r9)
                r8.<init>(r9)
                throw r8
            L40:
                kotlin.a1.n(r9)
                java.lang.Object[] r9 = r7.f80225b
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
                r0.f80229e = r9
                r0.f80230f = r4
                r0.f80231g = r2
                r0.f80232h = r8
                r0.f80227c = r3
                java.lang.Object r5 = r9.emit(r5, r0)
                if (r5 != r1) goto L61
                return r1
            L61:
                int r2 = r2 + r3
                goto L4c
            L63:
                kotlin.k2 r8 = kotlin.k2.f75408a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.g.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,113:1\n165#2:114\n166#2,2:116\n168#2:119\n13600#3:115\n13601#3:118\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n165#1:115\n165#1:118\n*E\n"})
    public static final class h implements kotlinx.coroutines.flow.i<Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f80233b;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7", f = "Builders.kt", i = {0, 0}, l = {116}, m = "collect", n = {"$this$asFlow_u24lambda_u2413", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f80234b;

            /* renamed from: c, reason: collision with root package name */
            int f80235c;

            /* renamed from: e, reason: collision with root package name */
            Object f80237e;

            /* renamed from: f, reason: collision with root package name */
            Object f80238f;

            /* renamed from: g, reason: collision with root package name */
            int f80239g;

            /* renamed from: h, reason: collision with root package name */
            int f80240h;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80234b = obj;
                this.f80235c |= Integer.MIN_VALUE;
                return h.this.a(null, this);
            }
        }

        public h(int[] iArr) {
            this.f80233b = iArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0063 -> B:10:0x0066). Please report as a decompilation issue!!! */
        @Override // kotlinx.coroutines.flow.i
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@fg.l kotlinx.coroutines.flow.j<? super java.lang.Integer> r9, @fg.l kotlin.coroutines.d<? super kotlin.k2> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof kotlinx.coroutines.flow.l.h.a
                if (r0 == 0) goto L13
                r0 = r10
                kotlinx.coroutines.flow.l$h$a r0 = (kotlinx.coroutines.flow.l.h.a) r0
                int r1 = r0.f80235c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80235c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$h$a r0 = new kotlinx.coroutines.flow.l$h$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f80234b
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80235c
                r3 = 1
                if (r2 == 0) goto L40
                if (r2 != r3) goto L34
                int r9 = r0.f80240h
                int r2 = r0.f80239g
                java.lang.Object r4 = r0.f80238f
                int[] r4 = (int[]) r4
                java.lang.Object r5 = r0.f80237e
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.j) r5
                kotlin.a1.n(r10)
                r10 = r5
                goto L66
            L34:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "蝋\u0001"
                java.lang.String r10 = com.flashget.parentalcontrol.ProtectedSandApp.s(r10)
                r9.<init>(r10)
                throw r9
            L40:
                kotlin.a1.n(r10)
                int[] r10 = r8.f80233b
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
                r0.f80237e = r10
                r0.f80238f = r4
                r0.f80239g = r2
                r0.f80240h = r9
                r0.f80235c = r3
                java.lang.Object r5 = r10.emit(r6, r0)
                if (r5 != r1) goto L66
                return r1
            L66:
                int r2 = r2 + r3
                goto L4c
            L68:
                kotlin.k2 r9 = kotlin.k2.f75408a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.h.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,113:1\n176#2:114\n177#2,2:116\n179#2:119\n13607#3:115\n13608#3:118\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n176#1:115\n176#1:118\n*E\n"})
    public static final class i implements kotlinx.coroutines.flow.i<Long> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long[] f80241b;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8", f = "Builders.kt", i = {0, 0}, l = {116}, m = "collect", n = {"$this$asFlow_u24lambda_u2415", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f80242b;

            /* renamed from: c, reason: collision with root package name */
            int f80243c;

            /* renamed from: e, reason: collision with root package name */
            Object f80245e;

            /* renamed from: f, reason: collision with root package name */
            Object f80246f;

            /* renamed from: g, reason: collision with root package name */
            int f80247g;

            /* renamed from: h, reason: collision with root package name */
            int f80248h;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80242b = obj;
                this.f80243c |= Integer.MIN_VALUE;
                return i.this.a(null, this);
            }
        }

        public i(long[] jArr) {
            this.f80241b = jArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0063 -> B:10:0x0066). Please report as a decompilation issue!!! */
        @Override // kotlinx.coroutines.flow.i
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@fg.l kotlinx.coroutines.flow.j<? super java.lang.Long> r10, @fg.l kotlin.coroutines.d<? super kotlin.k2> r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof kotlinx.coroutines.flow.l.i.a
                if (r0 == 0) goto L13
                r0 = r11
                kotlinx.coroutines.flow.l$i$a r0 = (kotlinx.coroutines.flow.l.i.a) r0
                int r1 = r0.f80243c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80243c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$i$a r0 = new kotlinx.coroutines.flow.l$i$a
                r0.<init>(r11)
            L18:
                java.lang.Object r11 = r0.f80242b
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80243c
                r3 = 1
                if (r2 == 0) goto L40
                if (r2 != r3) goto L34
                int r10 = r0.f80248h
                int r2 = r0.f80247g
                java.lang.Object r4 = r0.f80246f
                long[] r4 = (long[]) r4
                java.lang.Object r5 = r0.f80245e
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.j) r5
                kotlin.a1.n(r11)
                r11 = r5
                goto L66
            L34:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "蝌\u0001"
                java.lang.String r11 = com.flashget.parentalcontrol.ProtectedSandApp.s(r11)
                r10.<init>(r11)
                throw r10
            L40:
                kotlin.a1.n(r11)
                long[] r11 = r9.f80241b
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
                r0.f80245e = r11
                r0.f80246f = r4
                r0.f80247g = r2
                r0.f80248h = r10
                r0.f80243c = r3
                java.lang.Object r5 = r11.emit(r7, r0)
                if (r5 != r1) goto L66
                return r1
            L66:
                int r2 = r2 + r3
                goto L4c
            L68:
                kotlin.k2 r10 = kotlin.k2.f75408a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.i.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,113:1\n185#2:114\n186#2,2:116\n188#2:119\n1855#3:115\n1856#3:118\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n185#1:115\n185#1:118\n*E\n"})
    public static final class j implements kotlinx.coroutines.flow.i<Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.l f80249b;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9", f = "Builders.kt", i = {0}, l = {116}, m = "collect", n = {"$this$asFlow_u24lambda_u2417"}, s = {"L$0"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f80250b;

            /* renamed from: c, reason: collision with root package name */
            int f80251c;

            /* renamed from: e, reason: collision with root package name */
            Object f80253e;

            /* renamed from: f, reason: collision with root package name */
            Object f80254f;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80250b = obj;
                this.f80251c |= Integer.MIN_VALUE;
                return j.this.a(null, this);
            }
        }

        public j(kotlin.ranges.l lVar) {
            this.f80249b = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.i
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@fg.l kotlinx.coroutines.flow.j<? super java.lang.Integer> r7, @fg.l kotlin.coroutines.d<? super kotlin.k2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.l.j.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.l$j$a r0 = (kotlinx.coroutines.flow.l.j.a) r0
                int r1 = r0.f80251c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80251c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$j$a r0 = new kotlinx.coroutines.flow.l$j$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f80250b
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80251c
                r3 = 1
                if (r2 == 0) goto L3c
                if (r2 != r3) goto L30
                java.lang.Object r7 = r0.f80254f
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r2 = r0.f80253e
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                kotlin.a1.n(r8)
                r8 = r2
                goto L48
            L30:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "蝍\u0001"
                java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
                r7.<init>(r8)
                throw r7
            L3c:
                kotlin.a1.n(r8)
                kotlin.ranges.l r8 = r6.f80249b
                java.util.Iterator r8 = r8.iterator()
                r5 = r8
                r8 = r7
                r7 = r5
            L48:
                boolean r2 = r7.hasNext()
                if (r2 == 0) goto L67
                r2 = r7
                kotlin.collections.u0 r2 = (kotlin.collections.u0) r2
                int r2 = r2.c()
                java.lang.Integer r4 = new java.lang.Integer
                r4.<init>(r2)
                r0.f80253e = r8
                r0.f80254f = r7
                r0.f80251c = r3
                java.lang.Object r2 = r8.emit(r4, r0)
                if (r2 != r1) goto L48
                return r1
            L67:
                kotlin.k2 r7 = kotlin.k2.f75408a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.j.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,113:1\n123#2,4:114\n*E\n"})
    public static final class k<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f80255b;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", f = "Builders.kt", i = {0, 0}, l = {115}, m = "collect", n = {"this", "$this$flowOf_u24lambda_u248"}, s = {"L$0", "L$1"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f80256b;

            /* renamed from: c, reason: collision with root package name */
            int f80257c;

            /* renamed from: e, reason: collision with root package name */
            Object f80259e;

            /* renamed from: f, reason: collision with root package name */
            Object f80260f;

            /* renamed from: g, reason: collision with root package name */
            int f80261g;

            /* renamed from: h, reason: collision with root package name */
            int f80262h;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80256b = obj;
                this.f80257c |= Integer.MIN_VALUE;
                return k.this.a(null, this);
            }
        }

        public k(Object[] objArr) {
            this.f80255b = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005f -> B:10:0x0062). Please report as a decompilation issue!!! */
        @Override // kotlinx.coroutines.flow.i
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@fg.l kotlinx.coroutines.flow.j<? super T> r8, @fg.l kotlin.coroutines.d<? super kotlin.k2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.l.k.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.l$k$a r0 = (kotlinx.coroutines.flow.l.k.a) r0
                int r1 = r0.f80257c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80257c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$k$a r0 = new kotlinx.coroutines.flow.l$k$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f80256b
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80257c
                r3 = 1
                if (r2 == 0) goto L40
                if (r2 != r3) goto L34
                int r8 = r0.f80262h
                int r2 = r0.f80261g
                java.lang.Object r4 = r0.f80260f
                kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
                java.lang.Object r5 = r0.f80259e
                kotlinx.coroutines.flow.l$k r5 = (kotlinx.coroutines.flow.l.k) r5
                kotlin.a1.n(r9)
                r9 = r4
                goto L62
            L34:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "蝎\u0001"
                java.lang.String r9 = com.flashget.parentalcontrol.ProtectedSandApp.s(r9)
                r8.<init>(r9)
                throw r8
            L40:
                kotlin.a1.n(r9)
                java.lang.Object[] r9 = r7.f80255b
                int r9 = r9.length
                r2 = 0
                r5 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L4b:
                if (r2 >= r8) goto L64
                java.lang.Object[] r4 = r5.f80255b
                r4 = r4[r2]
                r0.f80259e = r5
                r0.f80260f = r9
                r0.f80261g = r2
                r0.f80262h = r8
                r0.f80257c = r3
                java.lang.Object r4 = r9.emit(r4, r0)
                if (r4 != r1) goto L62
                return r1
            L62:
                int r2 = r2 + r3
                goto L4b
            L64:
                kotlin.k2 r8 = kotlin.k2.f75408a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.k.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,113:1\n136#2,2:114\n*E\n"})
    /* renamed from: kotlinx.coroutines.flow.l$l, reason: collision with other inner class name */
    public static final class C1243l<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f80263b;

        public C1243l(Object obj) {
            this.f80263b = obj;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j<? super T> jVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            Object emit = jVar.emit((Object) this.f80263b, dVar);
            return emit == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? emit : k2.f75408a;
        }
    }

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<T> a(@fg.l Iterable<? extends T> iterable) {
        return new d(iterable);
    }

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<T> b(@fg.l Iterator<? extends T> it) {
        return new e(it);
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<Integer> c(@fg.l kotlin.ranges.l lVar) {
        return new j(lVar);
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<Long> d(@fg.l kotlin.ranges.o oVar) {
        return new a(oVar);
    }

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<T> e(@fg.l kotlin.sequences.m<? extends T> mVar) {
        return new f(mVar);
    }

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<T> f(@fg.l ld.a<? extends T> aVar) {
        return new b(aVar);
    }

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<T> g(@fg.l ld.l<? super kotlin.coroutines.d<? super T>, ? extends Object> lVar) {
        return new c(lVar);
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<Integer> h(@fg.l int[] iArr) {
        return new h(iArr);
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<Long> i(@fg.l long[] jArr) {
        return new i(jArr);
    }

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<T> j(@fg.l T[] tArr) {
        return new g(tArr);
    }

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<T> k(@fg.l @InterfaceC1469b ld.p<? super kotlinx.coroutines.channels.b0<? super T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        return new kotlinx.coroutines.flow.b(pVar, null, 0, null, 14, null);
    }

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<T> l(@fg.l @InterfaceC1469b ld.p<? super kotlinx.coroutines.channels.b0<? super T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        return new kotlinx.coroutines.flow.f(pVar, null, 0, null, 14, null);
    }

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<T> m() {
        return kotlinx.coroutines.flow.h.f80019b;
    }

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<T> n(@fg.l @InterfaceC1469b ld.p<? super kotlinx.coroutines.flow.j<? super T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        return new h0(pVar);
    }

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<T> o(T t4) {
        return new C1243l(t4);
    }

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<T> p(@fg.l T... tArr) {
        return new k(tArr);
    }
}
