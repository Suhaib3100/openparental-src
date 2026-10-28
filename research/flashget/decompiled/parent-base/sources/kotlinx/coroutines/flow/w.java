package kotlinx.coroutines.flow;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.InterfaceC1469b;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.z1;

/* compiled from: Merge.kt */
@Metadata(d1 = {"\u0000T\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\u001ag\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000227\u0010\t\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aq\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\r\u001a\u00020\f27\u0010\t\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014\u001a9\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0016\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0015\"\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001at\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022D\b\u0001\u0010\t\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001c\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u001b¢\u0006\u0002\b\u001eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001aj\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000229\b\u0005\u0010\t\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b!\u0010\u000b\u001ac\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000223\b\u0001\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u000b\" \u0010(\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%\"\u001a\u0010*\u001a\u00020)8\u0006X\u0087T¢\u0006\f\n\u0004\b*\u0010+\u0012\u0004\b,\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/i;", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "value", "Lkotlin/coroutines/d;", "", "transform", "a", "(Lkotlinx/coroutines/flow/i;Lld/p;)Lkotlinx/coroutines/flow/i;", "", "concurrency", "c", "(Lkotlinx/coroutines/flow/i;ILld/p;)Lkotlinx/coroutines/flow/i;", "e", "(Lkotlinx/coroutines/flow/i;)Lkotlinx/coroutines/flow/i;", "", "l", "(Ljava/lang/Iterable;)Lkotlinx/coroutines/flow/i;", "", "flows", "m", "([Lkotlinx/coroutines/flow/i;)Lkotlinx/coroutines/flow/i;", "f", "(Lkotlinx/coroutines/flow/i;I)Lkotlinx/coroutines/flow/i;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/j;", "Lkotlin/k2;", "Lkotlin/u;", "n", "(Lkotlinx/coroutines/flow/i;Lld/q;)Lkotlinx/coroutines/flow/i;", "b", "k", "I", "h", "()I", "i", "()V", "DEFAULT_CONCURRENCY", "", "DEFAULT_CONCURRENCY_PROPERTY_NAME", "Ljava/lang/String;", "j", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@r1({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,218:1\n53#2:219\n55#2:223\n53#2:224\n55#2:228\n50#3:220\n55#3:222\n50#3:225\n55#3:227\n107#4:221\n107#4:226\n107#4:229\n1#5:230\n*S KotlinDebug\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n47#1:219\n47#1:223\n74#1:224\n74#1:228\n47#1:220\n47#1:222\n74#1:225\n74#1:227\n47#1:221\n74#1:226\n82#1:229\n*E\n"})
/* loaded from: classes7.dex */
final /* synthetic */ class w {

    /* renamed from: a, reason: collision with root package name */
    private static final int f80547a = kotlinx.coroutines.internal.v0.b(ProtectedSandApp.s("螦\u0001"), 16, 1, Integer.MAX_VALUE);

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$f", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
    public static final class a<R> implements i<i<? extends R>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f80548b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p f80549c;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$f$b", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,222:1\n54#2:223\n*E\n"})
        /* renamed from: kotlinx.coroutines.flow.w$a$a, reason: collision with other inner class name */
        public static final class C1253a<T> implements j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f80550b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.p f80551c;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {223, 223}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.w$a$a$a, reason: collision with other inner class name */
            public static final class C1254a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f80552b;

                /* renamed from: c, reason: collision with root package name */
                int f80553c;

                /* renamed from: d, reason: collision with root package name */
                Object f80554d;

                public C1254a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f80552b = obj;
                    this.f80553c |= Integer.MIN_VALUE;
                    return C1253a.this.emit(null, this);
                }
            }

            public C1253a(j jVar, ld.p pVar) {
                this.f80550b = jVar;
                this.f80551c = pVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, @fg.l kotlin.coroutines.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.w.a.C1253a.C1254a
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.w$a$a$a r0 = (kotlinx.coroutines.flow.w.a.C1253a.C1254a) r0
                    int r1 = r0.f80553c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f80553c = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.w$a$a$a r0 = new kotlinx.coroutines.flow.w$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f80552b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f80553c
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L36
                    if (r2 != r3) goto L2a
                    kotlin.a1.n(r8)
                    goto L5f
                L2a:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "螠\u0001"
                    java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
                    r7.<init>(r8)
                    throw r7
                L36:
                    java.lang.Object r7 = r0.f80554d
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    kotlin.a1.n(r8)
                    goto L53
                L3e:
                    kotlin.a1.n(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f80550b
                    ld.p r2 = r6.f80551c
                    r0.f80554d = r8
                    r0.f80553c = r4
                    java.lang.Object r7 = r2.invoke(r7, r0)
                    if (r7 != r1) goto L50
                    return r1
                L50:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L53:
                    r2 = 0
                    r0.f80554d = r2
                    r0.f80553c = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5f
                    return r1
                L5f:
                    kotlin.k2 r7 = kotlin.k2.f75408a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.w.a.C1253a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public a(i iVar, ld.p pVar) {
            this.f80548b = iVar;
            this.f80549c = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l j jVar, @fg.l kotlin.coroutines.d dVar) {
            Object a5 = this.f80548b.a(new C1253a(jVar, this.f80549c), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* compiled from: Merge.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1", f = "Merge.kt", i = {}, l = {193, 193}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/k2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n*L\n1#1,218:1\n*E\n"})
    public static final class b<R, T> extends kotlin.coroutines.jvm.internal.o implements ld.q<j<? super R>, T, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f80556b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f80557c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f80558d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<T, kotlin.coroutines.d<? super i<? extends R>>, Object> f80559e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(ld.p<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> pVar, kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
            this.f80559e = pVar;
        }

        @Override // ld.q
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object R(@fg.l j<? super R> jVar, T t4, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            b bVar = new b(this.f80559e, dVar);
            bVar.f80557c = jVar;
            bVar.f80558d = t4;
            return bVar.invokeSuspend(k2.f75408a);
        }

        @fg.m
        public final Object d(@fg.l Object obj) {
            n.g((j) this.f80557c, (i) this.f80559e.invoke(this.f80558d, this), this);
            return k2.f75408a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            j jVar;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f80556b;
            if (i4 == 0) {
                a1.n(obj);
                jVar = (j) this.f80557c;
                Object obj2 = this.f80558d;
                ld.p<T, kotlin.coroutines.d<? super i<? extends R>>, Object> pVar = this.f80559e;
                this.f80557c = jVar;
                this.f80556b = 1;
                obj = pVar.invoke(obj2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException(ProtectedSandApp.s("螡\u0001"));
                    }
                    a1.n(obj);
                    return k2.f75408a;
                }
                jVar = (j) this.f80557c;
                a1.n(obj);
            }
            this.f80557c = null;
            this.f80556b = 2;
            if (n.g(jVar, (i) obj, this) == aVar) {
                return aVar;
            }
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$f", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
    public static final class c<R> implements i<i<? extends R>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f80560b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p f80561c;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$f$b", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,222:1\n54#2:223\n*E\n"})
        public static final class a<T> implements j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f80562b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.p f80563c;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {223, 223}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.w$c$a$a, reason: collision with other inner class name */
            public static final class C1255a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f80564b;

                /* renamed from: c, reason: collision with root package name */
                int f80565c;

                /* renamed from: d, reason: collision with root package name */
                Object f80566d;

                public C1255a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f80564b = obj;
                    this.f80565c |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(j jVar, ld.p pVar) {
                this.f80562b = jVar;
                this.f80563c = pVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, @fg.l kotlin.coroutines.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.w.c.a.C1255a
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.w$c$a$a r0 = (kotlinx.coroutines.flow.w.c.a.C1255a) r0
                    int r1 = r0.f80565c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f80565c = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.w$c$a$a r0 = new kotlinx.coroutines.flow.w$c$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f80564b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f80565c
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L36
                    if (r2 != r3) goto L2a
                    kotlin.a1.n(r8)
                    goto L5f
                L2a:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "螢\u0001"
                    java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
                    r7.<init>(r8)
                    throw r7
                L36:
                    java.lang.Object r7 = r0.f80566d
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    kotlin.a1.n(r8)
                    goto L53
                L3e:
                    kotlin.a1.n(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f80562b
                    ld.p r2 = r6.f80563c
                    r0.f80566d = r8
                    r0.f80565c = r4
                    java.lang.Object r7 = r2.invoke(r7, r0)
                    if (r7 != r1) goto L50
                    return r1
                L50:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L53:
                    r2 = 0
                    r0.f80566d = r2
                    r0.f80565c = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5f
                    return r1
                L5f:
                    kotlin.k2 r7 = kotlin.k2.f75408a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.w.c.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public c(i iVar, ld.p pVar) {
            this.f80560b = iVar;
            this.f80561c = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l j jVar, @fg.l kotlin.coroutines.d dVar) {
            Object a5 = this.f80560b.a(new a(jVar, this.f80561c), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,113:1\n83#2,2:114\n*E\n"})
    public static final class d<T> implements i<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f80568b;

        public d(i iVar) {
            this.f80568b = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l j<? super T> jVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            Object a5 = this.f80568b.a(new e(jVar), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }
    }

    /* compiled from: Merge.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "value", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class e<T> implements j {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j<T> f80569b;

        /* compiled from: Merge.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", f = "Merge.kt", i = {}, l = {83}, m = "emit", n = {}, s = {})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f80570b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ e<T> f80571c;

            /* renamed from: d, reason: collision with root package name */
            int f80572d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(e<? super T> eVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.f80571c = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80570b = obj;
                this.f80572d |= Integer.MIN_VALUE;
                return this.f80571c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        e(j<? super T> jVar) {
            this.f80569b = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.j
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(@fg.l kotlinx.coroutines.flow.i<? extends T> r5, @fg.l kotlin.coroutines.d<? super kotlin.k2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.w.e.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.w$e$a r0 = (kotlinx.coroutines.flow.w.e.a) r0
                int r1 = r0.f80572d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80572d = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.w$e$a r0 = new kotlinx.coroutines.flow.w$e$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f80570b
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80572d
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L27
                kotlin.a1.n(r6)
                goto L41
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "螣\u0001"
                java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
                r5.<init>(r6)
                throw r5
            L33:
                kotlin.a1.n(r6)
                kotlinx.coroutines.flow.j<T> r6 = r4.f80569b
                r0.f80572d = r3
                java.lang.Object r5 = kotlinx.coroutines.flow.n.g(r6, r5, r0)
                if (r5 != r1) goto L41
                return r1
            L41:
                kotlin.k2 r5 = kotlin.k2.f75408a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.w.e.emit(kotlinx.coroutines.flow.i, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* compiled from: Merge.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", i = {}, l = {217, 217}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/k2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class f<R, T> extends kotlin.coroutines.jvm.internal.o implements ld.q<j<? super R>, T, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f80573b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f80574c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f80575d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<T, kotlin.coroutines.d<? super R>, Object> f80576e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(ld.p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, kotlin.coroutines.d<? super f> dVar) {
            super(3, dVar);
            this.f80576e = pVar;
        }

        @Override // ld.q
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object R(@fg.l j<? super R> jVar, T t4, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            f fVar = new f(this.f80576e, dVar);
            fVar.f80574c = jVar;
            fVar.f80575d = t4;
            return fVar.invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            j jVar;
            Object obj2 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f80573b;
            if (i4 == 0) {
                a1.n(obj);
                j jVar2 = (j) this.f80574c;
                Object obj3 = this.f80575d;
                ld.p<T, kotlin.coroutines.d<? super R>, Object> pVar = this.f80576e;
                this.f80574c = jVar2;
                this.f80573b = 1;
                obj = pVar.invoke(obj3, this);
                jVar = jVar2;
                if (obj == obj2) {
                    return obj2;
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException(ProtectedSandApp.s("螤\u0001"));
                    }
                    a1.n(obj);
                    return k2.f75408a;
                }
                j jVar3 = (j) this.f80574c;
                a1.n(obj);
                jVar = jVar3;
            }
            this.f80574c = null;
            this.f80573b = 2;
            if (jVar.emit(obj, this) == obj2) {
                return obj2;
            }
            return k2.f75408a;
        }
    }

    @fg.l
    @z1
    public static final <T, R> i<R> a(@fg.l i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> pVar) {
        return e(new a(iVar, pVar));
    }

    @fg.l
    @z1
    public static final <T, R> i<R> b(@fg.l i<? extends T> iVar, @fg.l @InterfaceC1469b ld.p<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> pVar) {
        return n(iVar, new b(pVar, null));
    }

    @fg.l
    @z1
    public static final <T, R> i<R> c(@fg.l i<? extends T> iVar, int i4, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> pVar) {
        return f(new c(iVar, pVar), i4);
    }

    public static i d(i iVar, int i4, ld.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = f80547a;
        }
        return c(iVar, i4, pVar);
    }

    @fg.l
    @z1
    public static final <T> i<T> e(@fg.l i<? extends i<? extends T>> iVar) {
        return new d(iVar);
    }

    @fg.l
    @z1
    public static final <T> i<T> f(@fg.l i<? extends i<? extends T>> iVar, int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("螧\u0001"), i4).toString());
        }
        if (i4 == 1) {
            return e(iVar);
        }
        return new kotlinx.coroutines.flow.internal.f(iVar, i4, null, 0, null, 28, null);
    }

    public static i g(i iVar, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = f80547a;
        }
        return f(iVar, i4);
    }

    public static final int h() {
        return f80547a;
    }

    @a2
    public static /* synthetic */ void i() {
    }

    @a2
    public static /* synthetic */ void j() {
    }

    @fg.l
    @z1
    public static final <T, R> i<R> k(@fg.l i<? extends T> iVar, @fg.l @InterfaceC1469b ld.p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        return n(iVar, new f(pVar, null));
    }

    @fg.l
    public static final <T> i<T> l(@fg.l Iterable<? extends i<? extends T>> iterable) {
        return new kotlinx.coroutines.flow.internal.j(iterable, null, 0, null, 14, null);
    }

    @fg.l
    public static final <T> i<T> m(@fg.l i<? extends T>... iVarArr) {
        return l(kotlin.collections.l.B5(iVarArr));
    }

    @fg.l
    @z1
    public static final <T, R> i<R> n(@fg.l i<? extends T> iVar, @fg.l @InterfaceC1469b ld.q<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar) {
        return new kotlinx.coroutines.flow.internal.i(qVar, iVar, null, 0, null, 28, null);
    }
}
