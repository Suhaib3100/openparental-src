package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: ProduceState.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u000bH\u0096\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001b\u001a\u00028\u00008\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/z2;", "T", "Landroidx/compose/runtime/y2;", "Landroidx/compose/runtime/k2;", "state", "Lkotlin/coroutines/g;", "coroutineContext", "<init>", "(Landroidx/compose/runtime/k2;Lkotlin/coroutines/g;)V", "O", "()Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/k2;", "z", "()Lld/l;", "Lkotlin/Function0;", "onDispose", "", "n0", "(Lld/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "Lkotlin/coroutines/g;", "q", "()Lkotlin/coroutines/g;", "getValue", "setValue", "(Ljava/lang/Object;)V", "value", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nProduceState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/ProduceStateScopeImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,223:1\n314#2,11:224\n*S KotlinDebug\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/ProduceStateScopeImpl\n*L\n50#1:224,11\n*E\n"})
/* loaded from: classes.dex */
final class z2<T> implements y2<T>, k2<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.coroutines.g coroutineContext;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ k2<T> f17334c;

    /* compiled from: ProduceState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.ProduceStateScopeImpl", f = "ProduceState.kt", i = {0}, l = {224}, m = "awaitDispose", n = {"onDispose"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f17335b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f17336c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ z2<T> f17337d;

        /* renamed from: e, reason: collision with root package name */
        int f17338e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z2<T> z2Var, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f17337d = z2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f17336c = obj;
            this.f17338e |= Integer.MIN_VALUE;
            return this.f17337d.n0(null, this);
        }
    }

    public z2(@fg.l k2<T> k2Var, @fg.l kotlin.coroutines.g gVar) {
        this.coroutineContext = gVar;
        this.f17334c = k2Var;
    }

    @Override // androidx.compose.runtime.k2
    public T O() {
        return this.f17334c.O();
    }

    @Override // androidx.compose.runtime.k2, androidx.compose.runtime.b5
    public T getValue() {
        return this.f17334c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // androidx.compose.runtime.y2
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n0(@fg.l ld.a<kotlin.k2> r5, @fg.l kotlin.coroutines.d<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.runtime.z2.a
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.runtime.z2$a r0 = (androidx.compose.runtime.z2.a) r0
            int r1 = r0.f17338e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17338e = r1
            goto L18
        L13:
            androidx.compose.runtime.z2$a r0 = new androidx.compose.runtime.z2$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f17336c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f17338e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            java.lang.Object r5 = r0.f17335b
            ld.a r5 = (ld.a) r5
            kotlin.a1.n(r6)     // Catch: java.lang.Throwable -> L33
            goto L54
        L33:
            r6 = move-exception
            goto L5a
        L35:
            kotlin.a1.n(r6)
            r0.f17335b = r5     // Catch: java.lang.Throwable -> L33
            r0.f17338e = r3     // Catch: java.lang.Throwable -> L33
            kotlinx.coroutines.q r6 = new kotlinx.coroutines.q     // Catch: java.lang.Throwable -> L33
            kotlin.coroutines.d r2 = kotlin.coroutines.intrinsics.b.e(r0)     // Catch: java.lang.Throwable -> L33
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L33
            r6.e0()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r6 = r6.y()     // Catch: java.lang.Throwable -> L33
            if (r6 != r1) goto L51
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: java.lang.Throwable -> L33
        L51:
            if (r6 != r1) goto L54
            return r1
        L54:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L33
            r6.<init>()     // Catch: java.lang.Throwable -> L33
            throw r6     // Catch: java.lang.Throwable -> L33
        L5a:
            r5.invoke()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.z2.n0(ld.a, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.r0
    @fg.l
    /* renamed from: q, reason: from getter */
    public kotlin.coroutines.g getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.runtime.k2
    public void setValue(T t4) {
        this.f17334c.setValue(t4);
    }

    @Override // androidx.compose.runtime.k2
    @fg.l
    public ld.l<T, kotlin.k2> z() {
        return this.f17334c.z();
    }
}
