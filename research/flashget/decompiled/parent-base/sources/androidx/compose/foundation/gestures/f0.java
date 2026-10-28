package androidx.compose.foundation.gestures;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: ForEachGesture.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001a=\u0010\u0007\u001a\u00020\u0003*\u00020\u00002'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0002\b\u0005H\u0087@¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0014\u0010\r\u001a\u00020\u0003*\u00020\u0000H\u0080@¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0003*\u00020\tH\u0080@¢\u0006\u0004\b\u000f\u0010\u0010\u001a=\u0010\u0011\u001a\u00020\u0003*\u00020\u00002'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0002\b\u0005H\u0086@¢\u0006\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "block", "e", "(Landroidx/compose/ui/input/pointer/k0;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/c;", "", "a", "(Landroidx/compose/ui/input/pointer/c;)Z", "c", "(Landroidx/compose/ui/input/pointer/k0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "(Landroidx/compose/ui/input/pointer/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "d", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nForEachGesture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForEachGesture.kt\nandroidx/compose/foundation/gestures/ForEachGestureKt\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,122:1\n329#2:123\n329#2:142\n101#3,2:124\n33#3,6:126\n103#3:132\n101#3,2:133\n33#3,6:135\n103#3:141\n*S KotlinDebug\n*F\n+ 1 ForEachGesture.kt\nandroidx/compose/foundation/gestures/ForEachGestureKt\n*L\n45#1:123\n100#1:142\n71#1:124,2\n71#1:126,6\n71#1:132\n87#1:133,2\n87#1:135,6\n87#1:141\n*E\n"})
/* loaded from: classes.dex */
public final class f0 {

    /* compiled from: ForEachGesture.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", f = "ForEachGesture.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: c, reason: collision with root package name */
        int f4013c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f4014d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(2, dVar);
            aVar.f4014d = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f4013c;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.ui.input.pointer.c cVar = (androidx.compose.ui.input.pointer.c) this.f4014d;
                this.f4013c = 1;
                if (f0.b(cVar, this) == aVar) {
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

    /* compiled from: ForEachGesture.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", i = {0}, l = {86}, m = "awaitAllPointersUp", n = {"$this$awaitAllPointersUp"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4015b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f4016c;

        /* renamed from: d, reason: collision with root package name */
        int f4017d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4016c = obj;
            this.f4017d |= Integer.MIN_VALUE;
            return f0.b(null, this);
        }
    }

    /* compiled from: ForEachGesture.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", i = {0, 1, 2}, l = {104, 107, 112}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, s = {"L$0", "L$0", "L$0"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: c, reason: collision with root package name */
        int f4018c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f4019d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.g f4020e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super k2>, Object> f4021f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(kotlin.coroutines.g gVar, ld.p<? super androidx.compose.ui.input.pointer.c, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f4020e = gVar;
            this.f4021f = pVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((c) create(cVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f4020e, this.f4021f, dVar);
            cVar.f4019d = obj;
            return cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.input.pointer.c, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.ui.input.pointer.c, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0057 -> B:8:0x0026). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x006e -> B:8:0x0026). Please report as a decompilation issue!!! */
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
                int r1 = r7.f4018c
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L32
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r7.f4019d
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                kotlin.a1.n(r8)
                goto L26
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                java.lang.Object r1 = r7.f4019d
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                kotlin.a1.n(r8)     // Catch: java.util.concurrent.CancellationException -> L28
            L26:
                r8 = r1
                goto L39
            L28:
                r8 = move-exception
                goto L5e
            L2a:
                java.lang.Object r1 = r7.f4019d
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                kotlin.a1.n(r8)     // Catch: java.util.concurrent.CancellationException -> L28
                goto L4f
            L32:
                kotlin.a1.n(r8)
                java.lang.Object r8 = r7.f4019d
                androidx.compose.ui.input.pointer.c r8 = (androidx.compose.ui.input.pointer.c) r8
            L39:
                kotlin.coroutines.g r1 = r7.f4020e
                boolean r1 = kotlinx.coroutines.n2.C(r1)
                if (r1 == 0) goto L72
                ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super kotlin.k2>, java.lang.Object> r1 = r7.f4021f     // Catch: java.util.concurrent.CancellationException -> L5a
                r7.f4019d = r8     // Catch: java.util.concurrent.CancellationException -> L5a
                r7.f4018c = r4     // Catch: java.util.concurrent.CancellationException -> L5a
                java.lang.Object r1 = r1.invoke(r8, r7)     // Catch: java.util.concurrent.CancellationException -> L5a
                if (r1 != r0) goto L4e
                return r0
            L4e:
                r1 = r8
            L4f:
                r7.f4019d = r1     // Catch: java.util.concurrent.CancellationException -> L28
                r7.f4018c = r3     // Catch: java.util.concurrent.CancellationException -> L28
                java.lang.Object r8 = androidx.compose.foundation.gestures.f0.b(r1, r7)     // Catch: java.util.concurrent.CancellationException -> L28
                if (r8 != r0) goto L26
                return r0
            L5a:
                r1 = move-exception
                r6 = r1
                r1 = r8
                r8 = r6
            L5e:
                kotlin.coroutines.g r5 = r7.f4020e
                boolean r5 = kotlinx.coroutines.n2.C(r5)
                if (r5 == 0) goto L71
                r7.f4019d = r1
                r7.f4018c = r2
                java.lang.Object r8 = androidx.compose.foundation.gestures.f0.b(r1, r7)
                if (r8 != r0) goto L26
                return r0
            L71:
                throw r8
            L72:
                kotlin.k2 r8 = kotlin.k2.f75408a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.f0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ForEachGesture.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {48, 51, 56}, m = "forEachGesture", n = {"$this$forEachGesture", "block", "currentContext", "$this$forEachGesture", "block", "currentContext", "$this$forEachGesture", "block", "currentContext"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4022b;

        /* renamed from: c, reason: collision with root package name */
        Object f4023c;

        /* renamed from: d, reason: collision with root package name */
        Object f4024d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f4025e;

        /* renamed from: f, reason: collision with root package name */
        int f4026f;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4025e = obj;
            this.f4026f |= Integer.MIN_VALUE;
            return f0.e(null, null, this);
        }
    }

    public static final boolean a(@fg.l androidx.compose.ui.input.pointer.c cVar) {
        List<androidx.compose.ui.input.pointer.b0> e4 = cVar.v3().e();
        int size = e4.size();
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            if (e4.get(i4).getPressed()) {
                z4 = true;
                break;
            }
            i4++;
        }
        return !z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
    
        if (a(r6) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0046 -> B:10:0x0049). Please report as a decompilation issue!!! */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@fg.l androidx.compose.ui.input.pointer.c r6, @fg.l kotlin.coroutines.d<? super kotlin.k2> r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.f0.b
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.f0$b r0 = (androidx.compose.foundation.gestures.f0.b) r0
            int r1 = r0.f4017d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4017d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.f0$b r0 = new androidx.compose.foundation.gestures.f0$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f4016c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f4017d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.f4015b
            androidx.compose.ui.input.pointer.c r6 = (androidx.compose.ui.input.pointer.c) r6
            kotlin.a1.n(r7)
            goto L49
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.a1.n(r7)
            boolean r7 = a(r6)
            if (r7 != 0) goto L66
        L3c:
            androidx.compose.ui.input.pointer.r r7 = androidx.compose.ui.input.pointer.r.Final
            r0.f4015b = r6
            r0.f4017d = r3
            java.lang.Object r7 = r6.u3(r7, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            androidx.compose.ui.input.pointer.p r7 = (androidx.compose.ui.input.pointer.p) r7
            java.util.List r7 = r7.e()
            int r2 = r7.size()
            r4 = 0
        L54:
            if (r4 >= r2) goto L66
            java.lang.Object r5 = r7.get(r4)
            androidx.compose.ui.input.pointer.b0 r5 = (androidx.compose.ui.input.pointer.b0) r5
            boolean r5 = r5.getPressed()
            if (r5 == 0) goto L63
            goto L3c
        L63:
            int r4 = r4 + 1
            goto L54
        L66:
            kotlin.k2 r6 = kotlin.k2.f75408a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.f0.b(androidx.compose.ui.input.pointer.c, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.m
    public static final Object c(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object o32 = k0Var.o3(new a(2, null), dVar);
        return o32 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? o32 : k2.f75408a;
    }

    @fg.m
    public static final Object d(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.l ld.p<? super androidx.compose.ui.input.pointer.c, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object o32 = k0Var.o3(new c(dVar.getContext(), pVar, null), dVar);
        return o32 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? o32 : k2.f75408a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(4:(1:(1:12)(2:37|38))(2:39|40)|13|14|(3:19|20|(1:22)(6:23|24|(1:26)|13|14|(2:16|17)(0)))(0))(7:41|42|24|(0)|13|14|(0)(0)))(3:43|14|(0)(0))))|45|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0053, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.input.pointer.k0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.input.pointer.k0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.ui.input.pointer.k0] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.coroutines.g] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008f -> B:13:0x0050). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a9 -> B:13:0x0050). Please report as a decompilation issue!!! */
    @fg.m
    @kotlin.k(message = "Use awaitEachGesture instead. forEachGesture() can drop events between gestures.", replaceWith = @kotlin.x0(expression = "awaitEachGesture(block)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(@fg.l androidx.compose.ui.input.pointer.k0 r8, @fg.l ld.p<? super androidx.compose.ui.input.pointer.k0, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends java.lang.Object> r9, @fg.l kotlin.coroutines.d<? super kotlin.k2> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.f0.d
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.f0$d r0 = (androidx.compose.foundation.gestures.f0.d) r0
            int r1 = r0.f4026f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4026f = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.f0$d r0 = new androidx.compose.foundation.gestures.f0$d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f4025e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f4026f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L65
            if (r2 == r5) goto L55
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r8 = r0.f4024d
            kotlin.coroutines.g r8 = (kotlin.coroutines.g) r8
            java.lang.Object r9 = r0.f4023c
            ld.p r9 = (ld.p) r9
            java.lang.Object r2 = r0.f4022b
            androidx.compose.ui.input.pointer.k0 r2 = (androidx.compose.ui.input.pointer.k0) r2
            kotlin.a1.n(r10)
            goto L50
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            java.lang.Object r8 = r0.f4024d
            kotlin.coroutines.g r8 = (kotlin.coroutines.g) r8
            java.lang.Object r9 = r0.f4023c
            ld.p r9 = (ld.p) r9
            java.lang.Object r2 = r0.f4022b
            androidx.compose.ui.input.pointer.k0 r2 = (androidx.compose.ui.input.pointer.k0) r2
            kotlin.a1.n(r10)     // Catch: java.util.concurrent.CancellationException -> L53
        L50:
            r10 = r8
            r8 = r2
            goto L6c
        L53:
            r10 = move-exception
            goto L97
        L55:
            java.lang.Object r8 = r0.f4024d
            kotlin.coroutines.g r8 = (kotlin.coroutines.g) r8
            java.lang.Object r9 = r0.f4023c
            ld.p r9 = (ld.p) r9
            java.lang.Object r2 = r0.f4022b
            androidx.compose.ui.input.pointer.k0 r2 = (androidx.compose.ui.input.pointer.k0) r2
            kotlin.a1.n(r10)     // Catch: java.util.concurrent.CancellationException -> L53
            goto L83
        L65:
            kotlin.a1.n(r10)
            kotlin.coroutines.g r10 = r0.getContext()
        L6c:
            boolean r2 = kotlinx.coroutines.n2.C(r10)
            if (r2 == 0) goto Lad
            r0.f4022b = r8     // Catch: java.util.concurrent.CancellationException -> L92
            r0.f4023c = r9     // Catch: java.util.concurrent.CancellationException -> L92
            r0.f4024d = r10     // Catch: java.util.concurrent.CancellationException -> L92
            r0.f4026f = r5     // Catch: java.util.concurrent.CancellationException -> L92
            java.lang.Object r2 = r9.invoke(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L92
            if (r2 != r1) goto L81
            return r1
        L81:
            r2 = r8
            r8 = r10
        L83:
            r0.f4022b = r2     // Catch: java.util.concurrent.CancellationException -> L53
            r0.f4023c = r9     // Catch: java.util.concurrent.CancellationException -> L53
            r0.f4024d = r8     // Catch: java.util.concurrent.CancellationException -> L53
            r0.f4026f = r4     // Catch: java.util.concurrent.CancellationException -> L53
            java.lang.Object r10 = c(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L53
            if (r10 != r1) goto L50
            return r1
        L92:
            r2 = move-exception
            r7 = r2
            r2 = r8
            r8 = r10
            r10 = r7
        L97:
            boolean r6 = kotlinx.coroutines.n2.C(r8)
            if (r6 == 0) goto Lac
            r0.f4022b = r2
            r0.f4023c = r9
            r0.f4024d = r8
            r0.f4026f = r3
            java.lang.Object r10 = c(r2, r0)
            if (r10 != r1) goto L50
            return r1
        Lac:
            throw r10
        Lad:
            kotlin.k2 r8 = kotlin.k2.f75408a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.f0.e(androidx.compose.ui.input.pointer.k0, ld.p, kotlin.coroutines.d):java.lang.Object");
    }
}
