package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: Channels.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u000e\u0010\r\u001a%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "Lkotlinx/coroutines/channels/d0;", "channel", "Lkotlin/k2;", "d", "(Lkotlinx/coroutines/flow/j;Lkotlinx/coroutines/channels/d0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "consume", "e", "(Lkotlinx/coroutines/flow/j;Lkotlinx/coroutines/channels/d0;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/i;", "g", "(Lkotlinx/coroutines/channels/d0;)Lkotlinx/coroutines/flow/i;", "c", "Lkotlinx/coroutines/channels/d;", "b", "(Lkotlinx/coroutines/channels/d;)Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/r0;", "scope", "f", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/r0;)Lkotlinx/coroutines/channels/d0;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@r1({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/FlowKt__ChannelsKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,176:1\n107#2:177\n*S KotlinDebug\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/FlowKt__ChannelsKt\n*L\n153#1:177\n*E\n"})
/* loaded from: classes7.dex */
final /* synthetic */ class m {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Channels.kt\nkotlinx/coroutines/flow/FlowKt__ChannelsKt\n*L\n1#1,113:1\n154#2,2:114\n*E\n"})
    public static final class a<T> implements i<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.d f80266b;

        public a(kotlinx.coroutines.channels.d dVar) {
            this.f80266b = dVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l j<? super T> jVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            Object d5 = m.d(jVar, this.f80266b.w(), dVar);
            return d5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? d5 : k2.f75408a;
        }
    }

    /* compiled from: Channels.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", i = {0, 0, 0, 1, 1, 1}, l = {36, 37}, m = "emitAllImpl$FlowKt__ChannelsKt", n = {"$this$emitAllImpl", "channel", "consume", "$this$emitAllImpl", "channel", "consume"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f80267b;

        /* renamed from: c, reason: collision with root package name */
        Object f80268c;

        /* renamed from: d, reason: collision with root package name */
        Object f80269d;

        /* renamed from: e, reason: collision with root package name */
        boolean f80270e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80271f;

        /* renamed from: g, reason: collision with root package name */
        int f80272g;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f80271f = obj;
            this.f80272g |= Integer.MIN_VALUE;
            return m.e(null, null, false, this);
        }
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    public static final <T> i<T> b(@fg.l kotlinx.coroutines.channels.d<T> dVar) {
        return new a(dVar);
    }

    @fg.l
    public static final <T> i<T> c(@fg.l kotlinx.coroutines.channels.d0<? extends T> d0Var) {
        return new e(d0Var, true, null, 0, null, 28, null);
    }

    @fg.m
    public static final <T> Object d(@fg.l j<? super T> jVar, @fg.l kotlinx.coroutines.channels.d0<? extends T> d0Var, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object e4 = e(jVar, d0Var, true, dVar);
        return e4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? e4 : k2.f75408a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #1 {all -> 0x003a, blocks: (B:12:0x0034, B:14:0x0064, B:19:0x0079, B:21:0x0081, B:32:0x0056, B:34:0x0060), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlinx.coroutines.flow.j] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0093 -> B:13:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object e(kotlinx.coroutines.flow.j<? super T> r6, kotlinx.coroutines.channels.d0<? extends T> r7, boolean r8, kotlin.coroutines.d<? super kotlin.k2> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.m.b
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.m$b r0 = (kotlinx.coroutines.flow.m.b) r0
            int r1 = r0.f80272g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f80272g = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.m$b r0 = new kotlinx.coroutines.flow.m$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f80271f
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f80272g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L5a
            if (r2 == r4) goto L48
            if (r2 != r3) goto L3c
            boolean r8 = r0.f80270e
            java.lang.Object r6 = r0.f80269d
            kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
            java.lang.Object r7 = r0.f80268c
            kotlinx.coroutines.channels.d0 r7 = (kotlinx.coroutines.channels.d0) r7
            java.lang.Object r2 = r0.f80267b
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
            kotlin.a1.n(r9)     // Catch: java.lang.Throwable -> L3a
        L37:
            r9 = r6
            r6 = r2
            goto L64
        L3a:
            r6 = move-exception
            goto L9f
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "蝒\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L48:
            boolean r8 = r0.f80270e
            java.lang.Object r6 = r0.f80269d
            kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
            java.lang.Object r7 = r0.f80268c
            kotlinx.coroutines.channels.d0 r7 = (kotlinx.coroutines.channels.d0) r7
            java.lang.Object r2 = r0.f80267b
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
            kotlin.a1.n(r9)     // Catch: java.lang.Throwable -> L3a
            goto L79
        L5a:
            kotlin.a1.n(r9)
            kotlinx.coroutines.flow.t.b(r6)
            kotlinx.coroutines.channels.n r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3a
        L64:
            r0.f80267b = r6     // Catch: java.lang.Throwable -> L3a
            r0.f80268c = r7     // Catch: java.lang.Throwable -> L3a
            r0.f80269d = r9     // Catch: java.lang.Throwable -> L3a
            r0.f80270e = r8     // Catch: java.lang.Throwable -> L3a
            r0.f80272g = r4     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r2 = r9.c(r0)     // Catch: java.lang.Throwable -> L3a
            if (r2 != r1) goto L75
            return r1
        L75:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L79:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3a
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3a
            if (r9 == 0) goto L96
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3a
            r0.f80267b = r2     // Catch: java.lang.Throwable -> L3a
            r0.f80268c = r7     // Catch: java.lang.Throwable -> L3a
            r0.f80269d = r6     // Catch: java.lang.Throwable -> L3a
            r0.f80270e = r8     // Catch: java.lang.Throwable -> L3a
            r0.f80272g = r3     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L3a
            if (r9 != r1) goto L37
            return r1
        L96:
            if (r8 == 0) goto L9c
            r6 = 0
            kotlinx.coroutines.channels.r.b(r7, r6)
        L9c:
            kotlin.k2 r6 = kotlin.k2.f75408a
            return r6
        L9f:
            throw r6     // Catch: java.lang.Throwable -> La0
        La0:
            r9 = move-exception
            if (r8 == 0) goto La6
            kotlinx.coroutines.channels.r.b(r7, r6)
        La6:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.m.e(kotlinx.coroutines.flow.j, kotlinx.coroutines.channels.d0, boolean, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.l
    public static final <T> kotlinx.coroutines.channels.d0<T> f(@fg.l i<? extends T> iVar, @fg.l kotlinx.coroutines.r0 r0Var) {
        return kotlinx.coroutines.flow.internal.e.b(iVar).o(r0Var);
    }

    @fg.l
    public static final <T> i<T> g(@fg.l kotlinx.coroutines.channels.d0<? extends T> d0Var) {
        return new e(d0Var, false, null, 0, null, 28, null);
    }
}
