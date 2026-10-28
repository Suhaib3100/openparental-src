package kotlinx.coroutines.flow;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.m2;
import kotlinx.coroutines.d2;

/* compiled from: Channels.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0007\u001a&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "Lkotlinx/coroutines/channels/g0;", "channel", "Lkotlin/m2;", "d", "(Lkotlinx/coroutines/flow/j;Lkotlinx/coroutines/channels/g0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "consume", "e", "(Lkotlinx/coroutines/flow/j;Lkotlinx/coroutines/channels/g0;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/i;", "g", "c", "Lkotlinx/coroutines/channels/i;", "b", "Lkotlinx/coroutines/u0;", "scope", "f", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes5.dex */
final /* synthetic */ class m {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a<T> implements i<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.i f28233o;

        public a(kotlinx.coroutines.channels.i iVar) {
            this.f28233o = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d j<? super T> jVar, @d5.d Continuation<? super m2> continuation) {
            Object d6 = m.d(jVar, this.f28233o.S(), continuation);
            return d6 == CoroutineSingletons.COROUTINE_SUSPENDED ? d6 : m2.f23662a;
        }
    }

    /* compiled from: Channels.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", i = {0, 0, 0, 1, 1, 1}, l = {51, 62}, m = "emitAllImpl$FlowKt__ChannelsKt", n = {"$this$emitAllImpl", "channel", "consume", "$this$emitAllImpl", "channel", "consume"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class b<T> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f28234r;

        /* renamed from: s, reason: collision with root package name */
        Object f28235s;

        /* renamed from: t, reason: collision with root package name */
        boolean f28236t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f28237u;

        /* renamed from: v, reason: collision with root package name */
        int f28238v;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f28237u = obj;
            this.f28238v |= Integer.MIN_VALUE;
            return m.e(null, null, false, this);
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    @d5.d
    public static final <T> i<T> b(@d5.d kotlinx.coroutines.channels.i<T> iVar) {
        return new a(iVar);
    }

    @d5.d
    public static final <T> i<T> c(@d5.d kotlinx.coroutines.channels.g0<? extends T> g0Var) {
        return new e(g0Var, true, null, 0, null, 28, null);
    }

    @d5.e
    public static final <T> Object d(@d5.d j<? super T> jVar, @d5.d kotlinx.coroutines.channels.g0<? extends T> g0Var, @d5.d Continuation<? super m2> continuation) {
        Object e6 = e(jVar, g0Var, true, continuation);
        return e6 == CoroutineSingletons.COROUTINE_SUSPENDED ? e6 : m2.f23662a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:12:0x0030, B:20:0x0071, B:22:0x0077, B:28:0x0086, B:30:0x0087, B:46:0x004d), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:12:0x0030, B:20:0x0071, B:22:0x0077, B:28:0x0086, B:30:0x0087, B:46:0x004d), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlinx.coroutines.flow.j, kotlinx.coroutines.flow.j<? super T>] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlinx.coroutines.flow.j] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0097 -> B:13:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object e(kotlinx.coroutines.flow.j<? super T> r6, kotlinx.coroutines.channels.g0<? extends T> r7, boolean r8, kotlin.coroutines.Continuation<? super kotlin.m2> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.m.b
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.m$b r0 = (kotlinx.coroutines.flow.m.b) r0
            int r1 = r0.f28238v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28238v = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.m$b r0 = new kotlinx.coroutines.flow.m$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f28237u
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f28238v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L59
            if (r2 == r4) goto L43
            if (r2 != r3) goto L37
            boolean r6 = r0.f28236t
            java.lang.Object r7 = r0.f28235s
            kotlinx.coroutines.channels.g0 r7 = (kotlinx.coroutines.channels.g0) r7
            java.lang.Object r8 = r0.f28234r
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.j) r8
            kotlin.a1.n(r9)     // Catch: java.lang.Throwable -> L57
        L33:
            r5 = r8
            r8 = r6
            r6 = r5
            goto L5f
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "嵲"
            java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L43:
            boolean r6 = r0.f28236t
            java.lang.Object r7 = r0.f28235s
            kotlinx.coroutines.channels.g0 r7 = (kotlinx.coroutines.channels.g0) r7
            java.lang.Object r8 = r0.f28234r
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.j) r8
            kotlin.a1.n(r9)     // Catch: java.lang.Throwable -> L57
            kotlinx.coroutines.channels.r r9 = (kotlinx.coroutines.channels.r) r9     // Catch: java.lang.Throwable -> L57
            java.lang.Object r9 = r9.getHolder()     // Catch: java.lang.Throwable -> L57
            goto L71
        L57:
            r8 = move-exception
            goto L9e
        L59:
            kotlin.a1.n(r9)
            kotlinx.coroutines.flow.t.b(r6)
        L5f:
            r0.f28234r = r6     // Catch: java.lang.Throwable -> L9a
            r0.f28235s = r7     // Catch: java.lang.Throwable -> L9a
            r0.f28236t = r8     // Catch: java.lang.Throwable -> L9a
            r0.f28238v = r4     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r9 = r7.E(r0)     // Catch: java.lang.Throwable -> L9a
            if (r9 != r1) goto L6e
            return r1
        L6e:
            r5 = r8
            r8 = r6
            r6 = r5
        L71:
            boolean r2 = kotlinx.coroutines.channels.r.k(r9)     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L87
            java.lang.Throwable r8 = kotlinx.coroutines.channels.r.f(r9)     // Catch: java.lang.Throwable -> L57
            if (r8 != 0) goto L86
            if (r6 == 0) goto L83
            r6 = 0
            kotlinx.coroutines.channels.s.b(r7, r6)
        L83:
            kotlin.m2 r6 = kotlin.m2.f23662a
            return r6
        L86:
            throw r8     // Catch: java.lang.Throwable -> L57
        L87:
            java.lang.Object r9 = kotlinx.coroutines.channels.r.i(r9)     // Catch: java.lang.Throwable -> L57
            r0.f28234r = r8     // Catch: java.lang.Throwable -> L57
            r0.f28235s = r7     // Catch: java.lang.Throwable -> L57
            r0.f28236t = r6     // Catch: java.lang.Throwable -> L57
            r0.f28238v = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r9 = r8.b(r9, r0)     // Catch: java.lang.Throwable -> L57
            if (r9 != r1) goto L33
            return r1
        L9a:
            r6 = move-exception
            r5 = r8
            r8 = r6
            r6 = r5
        L9e:
            throw r8     // Catch: java.lang.Throwable -> L9f
        L9f:
            r9 = move-exception
            if (r6 == 0) goto La5
            kotlinx.coroutines.channels.s.b(r7, r8)
        La5:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.m.e(kotlinx.coroutines.flow.j, kotlinx.coroutines.channels.g0, boolean, kotlin.coroutines.d):java.lang.Object");
    }

    @d2
    @d5.d
    public static final <T> kotlinx.coroutines.channels.g0<T> f(@d5.d i<? extends T> iVar, @d5.d kotlinx.coroutines.u0 u0Var) {
        return kotlinx.coroutines.flow.internal.e.b(iVar).o(u0Var);
    }

    @d5.d
    public static final <T> i<T> g(@d5.d kotlinx.coroutines.channels.g0<? extends T> g0Var) {
        return new e(g0Var, false, null, 0, null, 28, null);
    }
}
