package kotlinx.coroutines.flow;

import com.android.internal.telephony.cdma.UserData;
import kotlin.InterfaceC1469b;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import org.apache.log4j.net.SyslogAppender;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Transform.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aO\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012$\b\u0004\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aO\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012$\b\u0004\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u001a&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\n\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0086\b¢\u0006\u0004\b\u000b\u0010\f\u001a3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\n*\u00020\u0005*\u0006\u0012\u0002\b\u00030\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b\u0011\u0010\f\u001ad\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000123\b\u0004\u0010\u0015\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\b\u001aj\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\n*\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u000125\b\u0004\u0010\u0015\u001a/\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\b\u001a)\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0019\u0010\f\u001aJ\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u001b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\b\u001a~\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00028\u00012H\b\u0001\u0010 \u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001eø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a~\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00028\u00012H\b\u0001\u0010 \u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001eø\u0001\u0000¢\u0006\u0004\b#\u0010\"\u001an\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012F\u0010 \u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001eø\u0001\u0000¢\u0006\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "", "predicate", "a", "(Lkotlinx/coroutines/flow/i;Lld/p;)Lkotlinx/coroutines/flow/i;", "d", "R", "b", "(Lkotlinx/coroutines/flow/i;)Lkotlinx/coroutines/flow/i;", "Lkotlin/reflect/d;", "klass", "c", "(Lkotlinx/coroutines/flow/i;Lkotlin/reflect/d;)Lkotlinx/coroutines/flow/i;", "e", "Lkotlin/r0;", "name", "value", "transform", "f", "g", "Lkotlin/collections/r0;", "l", "Lkotlin/k2;", "action", "h", "initial", "Lkotlin/Function3;", "accumulator", "operation", "k", "(Lkotlinx/coroutines/flow/i;Ljava/lang/Object;Lld/q;)Lkotlinx/coroutines/flow/i;", "i", "j", "(Lkotlinx/coroutines/flow/i;Lld/q;)Lkotlinx/coroutines/flow/i;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@r1({"SMAP\nTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,136:1\n21#1:143\n23#1:147\n21#1:148\n23#1:152\n50#2:137\n55#2:139\n50#2:140\n55#2:142\n50#2:144\n55#2:146\n50#2:149\n55#2:151\n50#2:153\n55#2:155\n50#2:156\n55#2:158\n50#2:159\n55#2:161\n50#2:163\n55#2:165\n107#3:138\n107#3:141\n107#3:145\n107#3:150\n107#3:154\n107#3:157\n107#3:160\n107#3:162\n107#3:164\n107#3:166\n107#3:167\n*S KotlinDebug\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n36#1:143\n36#1:147\n41#1:148\n41#1:152\n21#1:137\n21#1:139\n28#1:140\n28#1:142\n36#1:144\n36#1:146\n41#1:149\n41#1:151\n46#1:153\n46#1:155\n53#1:156\n53#1:158\n60#1:159\n60#1:161\n78#1:163\n78#1:165\n21#1:138\n28#1:141\n36#1:145\n41#1:150\n46#1:154\n53#1:157\n60#1:160\n68#1:162\n78#1:164\n105#1:166\n125#1:167\n*E\n"})
/* loaded from: classes7.dex */
public final /* synthetic */ class a0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/t$g", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
    public static final class a<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f79758b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p f79759c;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        /* renamed from: kotlinx.coroutines.flow.a0$a$a, reason: collision with other inner class name */
        public static final class C1223a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f79760b;

            /* renamed from: c, reason: collision with root package name */
            int f79761c;

            public C1223a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f79760b = obj;
                this.f79761c |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/t$h", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,222:1\n22#2,2:223\n*E\n"})
        public static final class b<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f79763b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.p f79764c;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {223, 223}, m = "emit", n = {"value", "$this$filter_u24lambda_u240"}, s = {"L$0", "L$1"})
            @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
            @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.a0$a$b$a, reason: collision with other inner class name */
            public static final class C1224a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f79765b;

                /* renamed from: c, reason: collision with root package name */
                int f79766c;

                /* renamed from: e, reason: collision with root package name */
                Object f79768e;

                /* renamed from: f, reason: collision with root package name */
                Object f79769f;

                public C1224a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f79765b = obj;
                    this.f79766c |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(kotlinx.coroutines.flow.j jVar, ld.p pVar) {
                this.f79763b = jVar;
                this.f79764c = pVar;
            }

            @fg.m
            public final Object a(Object obj, @fg.l kotlin.coroutines.d dVar) {
                new C1224a(dVar);
                kotlinx.coroutines.flow.j jVar = this.f79763b;
                if (((Boolean) this.f79764c.invoke(obj, dVar)).booleanValue()) {
                    jVar.emit(obj, dVar);
                }
                return k2.f75408a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r7, @fg.l kotlin.coroutines.d<? super kotlin.k2> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.a0.a.b.C1224a
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.a0$a$b$a r0 = (kotlinx.coroutines.flow.a0.a.b.C1224a) r0
                    int r1 = r0.f79766c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f79766c = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$a$b$a r0 = new kotlinx.coroutines.flow.a0$a$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f79765b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f79766c
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L40
                    if (r2 == r4) goto L36
                    if (r2 != r3) goto L2a
                    kotlin.a1.n(r8)
                    goto L6e
                L2a:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "蛓\u0001"
                    java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
                    r7.<init>(r8)
                    throw r7
                L36:
                    java.lang.Object r7 = r0.f79769f
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    java.lang.Object r2 = r0.f79768e
                    kotlin.a1.n(r8)
                    goto L58
                L40:
                    kotlin.a1.n(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f79763b
                    ld.p r2 = r6.f79764c
                    r0.f79768e = r7
                    r0.f79769f = r8
                    r0.f79766c = r4
                    java.lang.Object r2 = r2.invoke(r7, r0)
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
                    r0.f79768e = r8
                    r0.f79769f = r8
                    r0.f79766c = r3
                    java.lang.Object r7 = r7.emit(r2, r0)
                    if (r7 != r1) goto L6e
                    return r1
                L6e:
                    kotlin.k2 r7 = kotlin.k2.f75408a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.a.b.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public a(kotlinx.coroutines.flow.i iVar, ld.p pVar) {
            this.f79758b = iVar;
            this.f79759c = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j jVar, @fg.l kotlin.coroutines.d dVar) {
            Object a5 = this.f79758b.a(new b(jVar, this.f79759c), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }

        @fg.m
        public Object f(@fg.l kotlinx.coroutines.flow.j jVar, @fg.l kotlin.coroutines.d dVar) {
            new C1223a(dVar);
            this.f79758b.a(new b(jVar, this.f79759c), dVar);
            return k2.f75408a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
    public static final class b implements kotlinx.coroutines.flow.i<Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f79770b;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f79771b;

            /* renamed from: c, reason: collision with root package name */
            int f79772c;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f79771b = obj;
                this.f79772c |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$a$b", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,222:1\n22#2:223\n36#2:224\n23#2:225\n*E\n"})
        /* renamed from: kotlinx.coroutines.flow.a0$b$b, reason: collision with other inner class name */
        public static final class C1225b<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f79774b;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", f = "Transform.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
            @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.a0$b$b$a */
            public static final class a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f79775b;

                /* renamed from: c, reason: collision with root package name */
                int f79776c;

                /* renamed from: d, reason: collision with root package name */
                Object f79777d;

                /* renamed from: e, reason: collision with root package name */
                Object f79778e;

                public a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f79775b = obj;
                    this.f79776c |= Integer.MIN_VALUE;
                    return C1225b.this.emit(null, this);
                }
            }

            public C1225b(kotlinx.coroutines.flow.j jVar) {
                this.f79774b = jVar;
            }

            @fg.m
            public final Object a(Object obj, @fg.l kotlin.coroutines.d dVar) {
                new a(dVar);
                kotlinx.coroutines.flow.j jVar = this.f79774b;
                kotlin.jvm.internal.l0.P();
                if (obj != null) {
                    jVar.emit(obj, dVar);
                }
                return k2.f75408a;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @fg.l kotlin.coroutines.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.a0.b.C1225b.a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.a0$b$b$a r0 = (kotlinx.coroutines.flow.a0.b.C1225b.a) r0
                    int r1 = r0.f79776c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f79776c = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$b$b$a r0 = new kotlinx.coroutines.flow.a0$b$b$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f79775b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f79776c
                    r3 = 1
                    if (r2 == 0) goto L33
                    if (r2 != r3) goto L27
                    kotlin.a1.n(r6)
                    goto L46
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "蛔\u0001"
                    java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
                    r5.<init>(r6)
                    throw r5
                L33:
                    kotlin.a1.n(r6)
                    kotlinx.coroutines.flow.j r6 = r4.f79774b
                    kotlin.jvm.internal.l0.P()
                    if (r5 == 0) goto L46
                    r0.f79776c = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L46
                    return r1
                L46:
                    kotlin.k2 r5 = kotlin.k2.f75408a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.b.C1225b.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public b(kotlinx.coroutines.flow.i iVar) {
            this.f79770b = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j<? super Object> jVar, @fg.l kotlin.coroutines.d dVar) {
            kotlinx.coroutines.flow.i iVar = this.f79770b;
            kotlin.jvm.internal.l0.P();
            Object a5 = iVar.a(new C1225b(jVar), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }

        @fg.m
        public Object f(@fg.l kotlinx.coroutines.flow.j jVar, @fg.l kotlin.coroutines.d dVar) {
            new a(dVar);
            kotlinx.coroutines.flow.i iVar = this.f79770b;
            kotlin.jvm.internal.l0.P();
            iVar.a(new C1225b(jVar), dVar);
            return k2.f75408a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
    public static final class c implements kotlinx.coroutines.flow.i<Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f79780b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.d f79781c;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$a$b", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,222:1\n22#2:223\n41#2:224\n23#2:225\n*E\n"})
        public static final class a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f79782b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlin.reflect.d f79783c;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2", f = "Transform.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.a0$c$a$a, reason: collision with other inner class name */
            public static final class C1226a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f79784b;

                /* renamed from: c, reason: collision with root package name */
                int f79785c;

                /* renamed from: d, reason: collision with root package name */
                Object f79786d;

                /* renamed from: e, reason: collision with root package name */
                Object f79787e;

                public C1226a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f79784b = obj;
                    this.f79785c |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.j jVar, kotlin.reflect.d dVar) {
                this.f79782b = jVar;
                this.f79783c = dVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @fg.l kotlin.coroutines.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.a0.c.a.C1226a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.a0$c$a$a r0 = (kotlinx.coroutines.flow.a0.c.a.C1226a) r0
                    int r1 = r0.f79785c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f79785c = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$c$a$a r0 = new kotlinx.coroutines.flow.a0$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f79784b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f79785c
                    r3 = 1
                    if (r2 == 0) goto L33
                    if (r2 != r3) goto L27
                    kotlin.a1.n(r6)
                    goto L49
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "蛕\u0001"
                    java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
                    r5.<init>(r6)
                    throw r5
                L33:
                    kotlin.a1.n(r6)
                    kotlinx.coroutines.flow.j r6 = r4.f79782b
                    kotlin.reflect.d r2 = r4.f79783c
                    boolean r2 = r2.q(r5)
                    if (r2 == 0) goto L49
                    r0.f79785c = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L49
                    return r1
                L49:
                    kotlin.k2 r5 = kotlin.k2.f75408a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.c.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public c(kotlinx.coroutines.flow.i iVar, kotlin.reflect.d dVar) {
            this.f79780b = iVar;
            this.f79781c = dVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j<? super Object> jVar, @fg.l kotlin.coroutines.d dVar) {
            Object a5 = this.f79780b.a(new a(jVar, this.f79781c), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/t$g", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
    public static final class d<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f79789b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p f79790c;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f79791b;

            /* renamed from: c, reason: collision with root package name */
            int f79792c;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f79791b = obj;
                this.f79792c |= Integer.MIN_VALUE;
                return d.this.a(null, this);
            }
        }

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/t$h", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,222:1\n29#2,2:223\n*E\n"})
        public static final class b<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f79794b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.p f79795c;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {223, 223}, m = "emit", n = {"value", "$this$filterNot_u24lambda_u241"}, s = {"L$0", "L$1"})
            @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
            @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            public static final class a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f79796b;

                /* renamed from: c, reason: collision with root package name */
                int f79797c;

                /* renamed from: e, reason: collision with root package name */
                Object f79799e;

                /* renamed from: f, reason: collision with root package name */
                Object f79800f;

                public a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f79796b = obj;
                    this.f79797c |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(kotlinx.coroutines.flow.j jVar, ld.p pVar) {
                this.f79794b = jVar;
                this.f79795c = pVar;
            }

            @fg.m
            public final Object a(Object obj, @fg.l kotlin.coroutines.d dVar) {
                new a(dVar);
                kotlinx.coroutines.flow.j jVar = this.f79794b;
                if (!((Boolean) this.f79795c.invoke(obj, dVar)).booleanValue()) {
                    jVar.emit(obj, dVar);
                }
                return k2.f75408a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r7, @fg.l kotlin.coroutines.d<? super kotlin.k2> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.a0.d.b.a
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.a0$d$b$a r0 = (kotlinx.coroutines.flow.a0.d.b.a) r0
                    int r1 = r0.f79797c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f79797c = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$d$b$a r0 = new kotlinx.coroutines.flow.a0$d$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f79796b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f79797c
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L40
                    if (r2 == r4) goto L36
                    if (r2 != r3) goto L2a
                    kotlin.a1.n(r8)
                    goto L6e
                L2a:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "蛖\u0001"
                    java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
                    r7.<init>(r8)
                    throw r7
                L36:
                    java.lang.Object r7 = r0.f79800f
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    java.lang.Object r2 = r0.f79799e
                    kotlin.a1.n(r8)
                    goto L58
                L40:
                    kotlin.a1.n(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f79794b
                    ld.p r2 = r6.f79795c
                    r0.f79799e = r7
                    r0.f79800f = r8
                    r0.f79797c = r4
                    java.lang.Object r2 = r2.invoke(r7, r0)
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
                    r0.f79799e = r8
                    r0.f79800f = r8
                    r0.f79797c = r3
                    java.lang.Object r7 = r7.emit(r2, r0)
                    if (r7 != r1) goto L6e
                    return r1
                L6e:
                    kotlin.k2 r7 = kotlin.k2.f75408a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.d.b.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public d(kotlinx.coroutines.flow.i iVar, ld.p pVar) {
            this.f79789b = iVar;
            this.f79790c = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j jVar, @fg.l kotlin.coroutines.d dVar) {
            Object a5 = this.f79789b.a(new b(jVar, this.f79790c), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }

        @fg.m
        public Object f(@fg.l kotlinx.coroutines.flow.j jVar, @fg.l kotlin.coroutines.d dVar) {
            new a(dVar);
            this.f79789b.a(new b(jVar, this.f79790c), dVar);
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/t$g", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
    public static final class e<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f79801b;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/t$h", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,222:1\n47#2,2:223\n*E\n"})
        public static final class a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f79802b;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.a0$e$a$a, reason: collision with other inner class name */
            public static final class C1227a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f79803b;

                /* renamed from: c, reason: collision with root package name */
                int f79804c;

                public C1227a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f79803b = obj;
                    this.f79804c |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.j jVar) {
                this.f79802b = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r5, @fg.l kotlin.coroutines.d<? super kotlin.k2> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.a0.e.a.C1227a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.a0$e$a$a r0 = (kotlinx.coroutines.flow.a0.e.a.C1227a) r0
                    int r1 = r0.f79804c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f79804c = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$e$a$a r0 = new kotlinx.coroutines.flow.a0$e$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f79803b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f79804c
                    r3 = 1
                    if (r2 == 0) goto L33
                    if (r2 != r3) goto L27
                    kotlin.a1.n(r6)
                    goto L43
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "蛗\u0001"
                    java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
                    r5.<init>(r6)
                    throw r5
                L33:
                    kotlin.a1.n(r6)
                    kotlinx.coroutines.flow.j r6 = r4.f79802b
                    if (r5 == 0) goto L43
                    r0.f79804c = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.k2 r5 = kotlin.k2.f75408a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.e.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public e(kotlinx.coroutines.flow.i iVar) {
            this.f79801b = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j jVar, @fg.l kotlin.coroutines.d dVar) {
            Object a5 = this.f79801b.a(new a(jVar), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/t$g", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
    public static final class f<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f79806b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p f79807c;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f79808b;

            /* renamed from: c, reason: collision with root package name */
            int f79809c;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f79808b = obj;
                this.f79809c |= Integer.MIN_VALUE;
                return f.this.a(null, this);
            }
        }

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/t$h", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,222:1\n54#2:223\n*E\n"})
        public static final class b<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f79811b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.p f79812c;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {223, 223}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
            @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            public static final class a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f79813b;

                /* renamed from: c, reason: collision with root package name */
                int f79814c;

                /* renamed from: e, reason: collision with root package name */
                Object f79816e;

                public a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f79813b = obj;
                    this.f79814c |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(kotlinx.coroutines.flow.j jVar, ld.p pVar) {
                this.f79811b = jVar;
                this.f79812c = pVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @fg.m
            public final Object a(Object obj, @fg.l kotlin.coroutines.d dVar) {
                new a(dVar);
                this.f79811b.emit(this.f79812c.invoke(obj, dVar), dVar);
                return k2.f75408a;
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
            public final java.lang.Object emit(T r7, @fg.l kotlin.coroutines.d<? super kotlin.k2> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.a0.f.b.a
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.a0$f$b$a r0 = (kotlinx.coroutines.flow.a0.f.b.a) r0
                    int r1 = r0.f79814c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f79814c = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$f$b$a r0 = new kotlinx.coroutines.flow.a0$f$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f79813b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f79814c
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L36
                    if (r2 != r3) goto L2a
                    kotlin.a1.n(r8)
                    goto L5f
                L2a:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "蛘\u0001"
                    java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
                    r7.<init>(r8)
                    throw r7
                L36:
                    java.lang.Object r7 = r0.f79816e
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    kotlin.a1.n(r8)
                    goto L53
                L3e:
                    kotlin.a1.n(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f79811b
                    ld.p r2 = r6.f79812c
                    r0.f79816e = r8
                    r0.f79814c = r4
                    java.lang.Object r7 = r2.invoke(r7, r0)
                    if (r7 != r1) goto L50
                    return r1
                L50:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L53:
                    r2 = 0
                    r0.f79816e = r2
                    r0.f79814c = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5f
                    return r1
                L5f:
                    kotlin.k2 r7 = kotlin.k2.f75408a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.f.b.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public f(kotlinx.coroutines.flow.i iVar, ld.p pVar) {
            this.f79806b = iVar;
            this.f79807c = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j jVar, @fg.l kotlin.coroutines.d dVar) {
            Object a5 = this.f79806b.a(new b(jVar, this.f79807c), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }

        @fg.m
        public Object f(@fg.l kotlinx.coroutines.flow.j jVar, @fg.l kotlin.coroutines.d dVar) {
            new a(dVar);
            this.f79806b.a(new b(jVar, this.f79807c), dVar);
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/t$g", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
    public static final class g<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f79817b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p f79818c;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f79819b;

            /* renamed from: c, reason: collision with root package name */
            int f79820c;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f79819b = obj;
                this.f79820c |= Integer.MIN_VALUE;
                return g.this.a(null, this);
            }
        }

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/t$h", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,222:1\n61#2,2:223\n*E\n"})
        public static final class b<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f79822b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.p f79823c;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0}, l = {223, 224}, m = "emit", n = {"$this$mapNotNull_u24lambda_u246"}, s = {"L$0"})
            @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
            @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            public static final class a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f79824b;

                /* renamed from: c, reason: collision with root package name */
                int f79825c;

                /* renamed from: e, reason: collision with root package name */
                Object f79827e;

                public a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f79824b = obj;
                    this.f79825c |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(kotlinx.coroutines.flow.j jVar, ld.p pVar) {
                this.f79822b = jVar;
                this.f79823c = pVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @fg.m
            public final Object a(Object obj, @fg.l kotlin.coroutines.d dVar) {
                new a(dVar);
                kotlinx.coroutines.flow.j jVar = this.f79822b;
                Object invoke = this.f79823c.invoke(obj, dVar);
                if (invoke != null) {
                    jVar.emit(invoke, dVar);
                }
                return k2.f75408a;
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r7, @fg.l kotlin.coroutines.d<? super kotlin.k2> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.a0.g.b.a
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.a0$g$b$a r0 = (kotlinx.coroutines.flow.a0.g.b.a) r0
                    int r1 = r0.f79825c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f79825c = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$g$b$a r0 = new kotlinx.coroutines.flow.a0$g$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f79824b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f79825c
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L36
                    if (r2 != r3) goto L2a
                    kotlin.a1.n(r8)
                    goto L62
                L2a:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "蛙\u0001"
                    java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
                    r7.<init>(r8)
                    throw r7
                L36:
                    java.lang.Object r7 = r0.f79827e
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    kotlin.a1.n(r8)
                    goto L53
                L3e:
                    kotlin.a1.n(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f79822b
                    ld.p r2 = r6.f79823c
                    r0.f79827e = r8
                    r0.f79825c = r4
                    java.lang.Object r7 = r2.invoke(r7, r0)
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
                    r0.f79827e = r2
                    r0.f79825c = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L62
                    return r1
                L62:
                    kotlin.k2 r7 = kotlin.k2.f75408a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.g.b.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public g(kotlinx.coroutines.flow.i iVar, ld.p pVar) {
            this.f79817b = iVar;
            this.f79818c = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j jVar, @fg.l kotlin.coroutines.d dVar) {
            Object a5 = this.f79817b.a(new b(jVar, this.f79818c), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }

        @fg.m
        public Object f(@fg.l kotlinx.coroutines.flow.j jVar, @fg.l kotlin.coroutines.d dVar) {
            new a(dVar);
            this.f79817b.a(new b(jVar, this.f79818c), dVar);
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/t$g", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
    public static final class h<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f79828b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p f79829c;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/t$h", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,222:1\n79#2,2:223\n*E\n"})
        public static final class a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f79830b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.p f79831c;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {223, 224}, m = "emit", n = {"value", "$this$onEach_u24lambda_u248"}, s = {"L$0", "L$1"})
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.a0$h$a$a, reason: collision with other inner class name */
            public static final class C1228a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f79832b;

                /* renamed from: c, reason: collision with root package name */
                int f79833c;

                /* renamed from: e, reason: collision with root package name */
                Object f79835e;

                /* renamed from: f, reason: collision with root package name */
                Object f79836f;

                public C1228a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f79832b = obj;
                    this.f79833c |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.j jVar, ld.p pVar) {
                this.f79830b = jVar;
                this.f79831c = pVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r6, @fg.l kotlin.coroutines.d<? super kotlin.k2> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof kotlinx.coroutines.flow.a0.h.a.C1228a
                    if (r0 == 0) goto L13
                    r0 = r7
                    kotlinx.coroutines.flow.a0$h$a$a r0 = (kotlinx.coroutines.flow.a0.h.a.C1228a) r0
                    int r1 = r0.f79833c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f79833c = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$h$a$a r0 = new kotlinx.coroutines.flow.a0$h$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f79832b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f79833c
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L40
                    if (r2 == r4) goto L36
                    if (r2 != r3) goto L2a
                    kotlin.a1.n(r7)
                    goto L64
                L2a:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "蛚\u0001"
                    java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
                    r6.<init>(r7)
                    throw r6
                L36:
                    java.lang.Object r6 = r0.f79836f
                    kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                    java.lang.Object r2 = r0.f79835e
                    kotlin.a1.n(r7)
                    goto L56
                L40:
                    kotlin.a1.n(r7)
                    kotlinx.coroutines.flow.j r7 = r5.f79830b
                    ld.p r2 = r5.f79831c
                    r0.f79835e = r6
                    r0.f79836f = r7
                    r0.f79833c = r4
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    if (r2 != r1) goto L54
                    return r1
                L54:
                    r2 = r6
                    r6 = r7
                L56:
                    r7 = 0
                    r0.f79835e = r7
                    r0.f79836f = r7
                    r0.f79833c = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L64
                    return r1
                L64:
                    kotlin.k2 r6 = kotlin.k2.f75408a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.h.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public h(kotlinx.coroutines.flow.i iVar, ld.p pVar) {
            this.f79828b = iVar;
            this.f79829c = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j jVar, @fg.l kotlin.coroutines.d dVar) {
            Object a5 = this.f79828b.a(new a(jVar, this.f79829c), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,113:1\n106#2,7:114\n*E\n"})
    public static final class i<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f79837b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f79838c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q f79839d;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", f = "Transform.kt", i = {0, 0, 0}, l = {115, 116}, m = "collect", n = {"this", "$this$runningFold_u24lambda_u249", "accumulator"}, s = {"L$0", "L$1", "L$2"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f79840b;

            /* renamed from: c, reason: collision with root package name */
            int f79841c;

            /* renamed from: e, reason: collision with root package name */
            Object f79843e;

            /* renamed from: f, reason: collision with root package name */
            Object f79844f;

            /* renamed from: g, reason: collision with root package name */
            Object f79845g;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f79840b = obj;
                this.f79841c |= Integer.MIN_VALUE;
                return i.this.a(null, this);
            }
        }

        public i(Object obj, kotlinx.coroutines.flow.i iVar, ld.q qVar) {
            this.f79837b = obj;
            this.f79838c = iVar;
            this.f79839d = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0078 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // kotlinx.coroutines.flow.i
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@fg.l kotlinx.coroutines.flow.j<? super R> r7, @fg.l kotlin.coroutines.d<? super kotlin.k2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.a0.i.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.a0$i$a r0 = (kotlinx.coroutines.flow.a0.i.a) r0
                int r1 = r0.f79841c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f79841c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.a0$i$a r0 = new kotlinx.coroutines.flow.a0$i$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f79840b
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f79841c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L36
                if (r2 != r3) goto L2a
                kotlin.a1.n(r8)
                goto L79
            L2a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "蛛\u0001"
                java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
                r7.<init>(r8)
                throw r7
            L36:
                java.lang.Object r7 = r0.f79845g
                kotlin.jvm.internal.k1$h r7 = (kotlin.jvm.internal.k1.h) r7
                java.lang.Object r2 = r0.f79844f
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                java.lang.Object r4 = r0.f79843e
                kotlinx.coroutines.flow.a0$i r4 = (kotlinx.coroutines.flow.a0.i) r4
                kotlin.a1.n(r8)
                goto L60
            L46:
                kotlin.jvm.internal.k1$h r8 = androidx.compose.foundation.text.g.a(r8)
                java.lang.Object r2 = r6.f79837b
                r8.f75329b = r2
                r0.f79843e = r6
                r0.f79844f = r7
                r0.f79845g = r8
                r0.f79841c = r4
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L5d
                return r1
            L5d:
                r4 = r6
                r2 = r7
                r7 = r8
            L60:
                kotlinx.coroutines.flow.i r8 = r4.f79838c
                kotlinx.coroutines.flow.a0$j r5 = new kotlinx.coroutines.flow.a0$j
                ld.q r4 = r4.f79839d
                r5.<init>(r7, r4, r2)
                r7 = 0
                r0.f79843e = r7
                r0.f79844f = r7
                r0.f79845g = r7
                r0.f79841c = r3
                java.lang.Object r7 = r8.a(r5, r0)
                if (r7 != r1) goto L79
                return r1
            L79:
                kotlin.k2 r7 = kotlin.k2.f75408a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.i.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: Transform.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class j<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h<R> f79846b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.q<R, T, kotlin.coroutines.d<? super R>, Object> f79847c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<R> f79848d;

        /* compiled from: Transform.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", f = "Transform.kt", i = {0}, l = {109, 110}, m = "emit", n = {"this"}, s = {"L$0"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            Object f79849b;

            /* renamed from: c, reason: collision with root package name */
            Object f79850c;

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f79851d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ j<T> f79852e;

            /* renamed from: f, reason: collision with root package name */
            int f79853f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(j<? super T> jVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.f79852e = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f79851d = obj;
                this.f79853f |= Integer.MIN_VALUE;
                return this.f79852e.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        j(k1.h<R> hVar, ld.q<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar, kotlinx.coroutines.flow.j<? super R> jVar) {
            this.f79846b = hVar;
            this.f79847c = qVar;
            this.f79848d = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0071 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // kotlinx.coroutines.flow.j
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r8, @fg.l kotlin.coroutines.d<? super kotlin.k2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.a0.j.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.a0$j$a r0 = (kotlinx.coroutines.flow.a0.j.a) r0
                int r1 = r0.f79853f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f79853f = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.a0$j$a r0 = new kotlinx.coroutines.flow.a0$j$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f79851d
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f79853f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L42
                if (r2 == r4) goto L36
                if (r2 != r3) goto L2a
                kotlin.a1.n(r9)
                goto L72
            L2a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "蛜\u0001"
                java.lang.String r9 = com.flashget.parentalcontrol.ProtectedSandApp.s(r9)
                r8.<init>(r9)
                throw r8
            L36:
                java.lang.Object r8 = r0.f79850c
                kotlin.jvm.internal.k1$h r8 = (kotlin.jvm.internal.k1.h) r8
                java.lang.Object r2 = r0.f79849b
                kotlinx.coroutines.flow.a0$j r2 = (kotlinx.coroutines.flow.a0.j) r2
                kotlin.a1.n(r9)
                goto L5c
            L42:
                kotlin.a1.n(r9)
                kotlin.jvm.internal.k1$h<R> r9 = r7.f79846b
                ld.q<R, T, kotlin.coroutines.d<? super R>, java.lang.Object> r2 = r7.f79847c
                T r5 = r9.f75329b
                r0.f79849b = r7
                r0.f79850c = r9
                r0.f79853f = r4
                java.lang.Object r8 = r2.R(r5, r8, r0)
                if (r8 != r1) goto L58
                return r1
            L58:
                r2 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L5c:
                r8.f75329b = r9
                kotlinx.coroutines.flow.j<R> r8 = r2.f79848d
                kotlin.jvm.internal.k1$h<R> r9 = r2.f79846b
                T r9 = r9.f75329b
                r2 = 0
                r0.f79849b = r2
                r0.f79850c = r2
                r0.f79853f = r3
                java.lang.Object r8 = r8.emit(r9, r0)
                if (r8 != r1) goto L72
                return r1
            L72:
                kotlin.k2 r8 = kotlin.k2.f75408a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.j.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,113:1\n126#2,10:114\n*E\n"})
    public static final class k<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f79854b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.q f79855c;

        public k(kotlinx.coroutines.flow.i iVar, ld.q qVar) {
            this.f79854b = iVar;
            this.f79855c = qVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j<? super T> jVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            k1.h hVar = new k1.h();
            hVar.f75329b = (T) kotlinx.coroutines.flow.internal.s.f80148a;
            Object a5 = this.f79854b.a(new l(hVar, this.f79855c, jVar), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }
    }

    /* compiled from: Transform.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class l<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h<Object> f79856b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.q<T, T, kotlin.coroutines.d<? super T>, Object> f79857c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<T> f79858d;

        /* compiled from: Transform.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1", f = "Transform.kt", i = {0}, l = {UserData.IS91_MSG_TYPE_SHORT_MESSAGE_FULL, UserData.IS91_MSG_TYPE_SHORT_MESSAGE}, m = "emit", n = {"this"}, s = {"L$0"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            Object f79859b;

            /* renamed from: c, reason: collision with root package name */
            Object f79860c;

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f79861d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ l<T> f79862e;

            /* renamed from: f, reason: collision with root package name */
            int f79863f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(l<? super T> lVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.f79862e = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f79861d = obj;
                this.f79863f |= Integer.MIN_VALUE;
                return this.f79862e.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        l(k1.h<Object> hVar, ld.q<? super T, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> qVar, kotlinx.coroutines.flow.j<? super T> jVar) {
            this.f79856b = hVar;
            this.f79857c = qVar;
            this.f79858d = jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // kotlinx.coroutines.flow.j
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r8, @fg.l kotlin.coroutines.d<? super kotlin.k2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.a0.l.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.a0$l$a r0 = (kotlinx.coroutines.flow.a0.l.a) r0
                int r1 = r0.f79863f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f79863f = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.a0$l$a r0 = new kotlinx.coroutines.flow.a0$l$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f79861d
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f79863f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L42
                if (r2 == r4) goto L36
                if (r2 != r3) goto L2a
                kotlin.a1.n(r9)
                goto L7b
            L2a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "蛝\u0001"
                java.lang.String r9 = com.flashget.parentalcontrol.ProtectedSandApp.s(r9)
                r8.<init>(r9)
                throw r8
            L36:
                java.lang.Object r8 = r0.f79860c
                kotlin.jvm.internal.k1$h r8 = (kotlin.jvm.internal.k1.h) r8
                java.lang.Object r2 = r0.f79859b
                kotlinx.coroutines.flow.a0$l r2 = (kotlinx.coroutines.flow.a0.l) r2
                kotlin.a1.n(r9)
                goto L62
            L42:
                kotlin.a1.n(r9)
                kotlin.jvm.internal.k1$h<java.lang.Object> r9 = r7.f79856b
                T r2 = r9.f75329b
                kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.flow.internal.s.f80148a
                if (r2 != r5) goto L4f
                r2 = r7
                goto L65
            L4f:
                ld.q<T, T, kotlin.coroutines.d<? super T>, java.lang.Object> r5 = r7.f79857c
                r0.f79859b = r7
                r0.f79860c = r9
                r0.f79863f = r4
                java.lang.Object r8 = r5.R(r2, r8, r0)
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
                r9.f75329b = r8
                kotlinx.coroutines.flow.j<T> r8 = r2.f79858d
                kotlin.jvm.internal.k1$h<java.lang.Object> r9 = r2.f79856b
                T r9 = r9.f75329b
                r2 = 0
                r0.f79859b = r2
                r0.f79860c = r2
                r0.f79863f = r3
                java.lang.Object r8 = r8.emit(r9, r0)
                if (r8 != r1) goto L7b
                return r1
            L7b:
                kotlin.k2 r8 = kotlin.k2.f75408a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.l.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,113:1\n69#2,5:114\n*E\n"})
    public static final class m<T> implements kotlinx.coroutines.flow.i<kotlin.collections.r0<? extends T>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f79864b;

        public m(kotlinx.coroutines.flow.i iVar) {
            this.f79864b = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j<? super kotlin.collections.r0<? extends T>> jVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            Object a5 = this.f79864b.a(new n(jVar, new k1.f()), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }
    }

    /* compiled from: Transform.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt$withIndex$1$1\n+ 2 FlowExceptions.common.kt\nkotlinx/coroutines/flow/internal/FlowExceptions_commonKt\n*L\n1#1,136:1\n32#2,4:137\n*S KotlinDebug\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt$withIndex$1$1\n*L\n71#1:137,4\n*E\n"})
    static final class n<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<kotlin.collections.r0<? extends T>> f79865b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k1.f f79866c;

        /* compiled from: Transform.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", f = "Transform.kt", i = {}, l = {71}, m = "emit", n = {}, s = {})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f79867b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ n<T> f79868c;

            /* renamed from: d, reason: collision with root package name */
            int f79869d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(n<? super T> nVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.f79868c = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f79867b = obj;
                this.f79869d |= Integer.MIN_VALUE;
                return this.f79868c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        n(kotlinx.coroutines.flow.j<? super kotlin.collections.r0<? extends T>> jVar, k1.f fVar) {
            this.f79865b = jVar;
            this.f79866c = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
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
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.a0.n.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.a0$n$a r0 = (kotlinx.coroutines.flow.a0.n.a) r0
                int r1 = r0.f79869d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f79869d = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.a0$n$a r0 = new kotlinx.coroutines.flow.a0$n$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f79867b
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f79869d
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L27
                kotlin.a1.n(r9)
                goto L50
            L27:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "蛞\u0001"
                java.lang.String r9 = com.flashget.parentalcontrol.ProtectedSandApp.s(r9)
                r8.<init>(r9)
                throw r8
            L33:
                kotlin.a1.n(r9)
                kotlinx.coroutines.flow.j<kotlin.collections.r0<? extends T>> r9 = r7.f79865b
                kotlin.collections.r0 r2 = new kotlin.collections.r0
                kotlin.jvm.internal.k1$f r4 = r7.f79866c
                int r5 = r4.f75327b
                int r6 = r5 + 1
                r4.f75327b = r6
                if (r5 < 0) goto L53
                r2.<init>(r5, r8)
                r0.f79869d = r3
                java.lang.Object r8 = r9.emit(r2, r0)
                if (r8 != r1) goto L50
                return r1
            L50:
                kotlin.k2 r8 = kotlin.k2.f75408a
                return r8
            L53:
                java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
                java.lang.String r9 = "蛟\u0001"
                java.lang.String r9 = com.flashget.parentalcontrol.ProtectedSandApp.s(r9)
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.n.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<T> a(@fg.l kotlinx.coroutines.flow.i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
        return new a(iVar, pVar);
    }

    public static final <R> kotlinx.coroutines.flow.i<R> b(kotlinx.coroutines.flow.i<?> iVar) {
        kotlin.jvm.internal.l0.P();
        return new b(iVar);
    }

    @fg.l
    public static final <R> kotlinx.coroutines.flow.i<R> c(@fg.l kotlinx.coroutines.flow.i<?> iVar, @fg.l kotlin.reflect.d<R> dVar) {
        return new c(iVar, dVar);
    }

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<T> d(@fg.l kotlinx.coroutines.flow.i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
        return new d(iVar, pVar);
    }

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<T> e(@fg.l kotlinx.coroutines.flow.i<? extends T> iVar) {
        return new e(iVar);
    }

    @fg.l
    public static final <T, R> kotlinx.coroutines.flow.i<R> f(@fg.l kotlinx.coroutines.flow.i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        return new f(iVar, pVar);
    }

    @fg.l
    public static final <T, R> kotlinx.coroutines.flow.i<R> g(@fg.l kotlinx.coroutines.flow.i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        return new g(iVar, pVar);
    }

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<T> h(@fg.l kotlinx.coroutines.flow.i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        return new h(iVar, pVar);
    }

    @fg.l
    public static final <T, R> kotlinx.coroutines.flow.i<R> i(@fg.l kotlinx.coroutines.flow.i<? extends T> iVar, R r4, @fg.l @InterfaceC1469b ld.q<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return new i(r4, iVar, qVar);
    }

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<T> j(@fg.l kotlinx.coroutines.flow.i<? extends T> iVar, @fg.l ld.q<? super T, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> qVar) {
        return new k(iVar, qVar);
    }

    @fg.l
    public static final <T, R> kotlinx.coroutines.flow.i<R> k(@fg.l kotlinx.coroutines.flow.i<? extends T> iVar, R r4, @fg.l @InterfaceC1469b ld.q<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return new i(r4, iVar, qVar);
    }

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<kotlin.collections.r0<T>> l(@fg.l kotlinx.coroutines.flow.i<? extends T> iVar) {
        return new m(iVar);
    }
}
