package android.view;

import d5.d;
import d5.e;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.m2;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.q3;
import kotlinx.coroutines.v0;
import q3.p;

/* compiled from: CoroutineLiveData.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BM\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012-\u0010\u001e\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0019¢\u0006\u0002\b\u001dø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\bH\u0014J\b\u0010\f\u001a\u00020\bH\u0014R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/lifecycle/g;", "T", "Landroidx/lifecycle/h0;", "Landroidx/lifecycle/LiveData;", "source", "Lkotlinx/coroutines/p1;", "v", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/m2;", "u", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "l", "m", "Landroidx/lifecycle/c;", "n", "Landroidx/lifecycle/c;", "blockRunner", "Landroidx/lifecycle/l;", "o", "Landroidx/lifecycle/l;", "emittedSource", "Lkotlin/coroutines/g;", "context", "", "timeoutInMs", "Lkotlin/Function2;", "Landroidx/lifecycle/f0;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "<init>", "(Lkotlin/coroutines/g;JLq3/p;)V", "lifecycle-livedata-ktx_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: androidx.lifecycle.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0530g<T> extends h0<T> {

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @e
    private C0526c<T> blockRunner;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @e
    private l emittedSource;

    /* compiled from: CoroutineLiveData.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {"T", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: androidx.lifecycle.g$a */
    static final class a extends Lambda implements q3.a<m2> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ C0530g<T> f8559p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C0530g<T> c0530g) {
            super(0);
            this.f8559p = c0530g;
        }

        public final void a() {
            ((C0530g) this.f8559p).blockRunner = null;
        }

        @Override // q3.a
        public /* bridge */ /* synthetic */ m2 n() {
            a();
            return m2.f23662a;
        }
    }

    /* compiled from: CoroutineLiveData.kt */
    @DebugMetadata(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", i = {0}, l = {234}, m = "clearSource$lifecycle_livedata_ktx_release", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: androidx.lifecycle.g$b */
    static final class b extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f8560r;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f8561s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ C0530g<T> f8562t;

        /* renamed from: u, reason: collision with root package name */
        int f8563u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C0530g<T> c0530g, Continuation<? super b> continuation) {
            super(continuation);
            this.f8562t = c0530g;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object A(@d Object obj) {
            this.f8561s = obj;
            this.f8563u |= Integer.MIN_VALUE;
            return this.f8562t.u(this);
        }
    }

    /* compiled from: CoroutineLiveData.kt */
    @DebugMetadata(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", i = {0, 0, 1}, l = {227, 228}, m = "emitSource$lifecycle_livedata_ktx_release", n = {"this", "source", "this"}, s = {"L$0", "L$1", "L$0"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: androidx.lifecycle.g$c */
    static final class c extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f8564r;

        /* renamed from: s, reason: collision with root package name */
        Object f8565s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f8566t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ C0530g<T> f8567u;

        /* renamed from: v, reason: collision with root package name */
        int f8568v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C0530g<T> c0530g, Continuation<? super c> continuation) {
            super(continuation);
            this.f8567u = c0530g;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object A(@d Object obj) {
            this.f8566t = obj;
            this.f8568v |= Integer.MIN_VALUE;
            return this.f8567u.v(null, this);
        }
    }

    public /* synthetic */ C0530g(CoroutineContext coroutineContext, long j5, p pVar, int i5, w wVar) {
        this((i5 & 1) != 0 ? EmptyCoroutineContext.f23294o : coroutineContext, (i5 & 2) != 0 ? C0532i.f8582a : j5, pVar);
    }

    @Override // android.view.h0, android.view.LiveData
    protected void l() {
        super.l();
        C0526c<T> c0526c = this.blockRunner;
        if (c0526c == null) {
            return;
        }
        c0526c.h();
    }

    @Override // android.view.h0, android.view.LiveData
    protected void m() {
        super.m();
        C0526c<T> c0526c = this.blockRunner;
        if (c0526c == null) {
            return;
        }
        c0526c.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(@d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.view.C0530g.b
            if (r0 == 0) goto L13
            r0 = r5
            androidx.lifecycle.g$b r0 = (android.view.C0530g.b) r0
            int r1 = r0.f8563u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8563u = r1
            goto L18
        L13:
            androidx.lifecycle.g$b r0 = new androidx.lifecycle.g$b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f8561s
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f8563u
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f8560r
            androidx.lifecycle.g r0 = (android.view.C0530g) r0
            kotlin.a1.n(r5)
            goto L47
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.a1.n(r5)
            androidx.lifecycle.l r5 = r4.emittedSource
            if (r5 != 0) goto L3c
        L3a:
            r0 = r4
            goto L47
        L3c:
            r0.f8560r = r4
            r0.f8563u = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L3a
            return r1
        L47:
            r5 = 0
            r0.emittedSource = r5
            kotlin.m2 r5 = kotlin.m2.f23662a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.view.C0530g.u(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(@d5.d android.view.LiveData<T> r6, @d5.d kotlin.coroutines.Continuation<? super kotlinx.coroutines.p1> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof android.view.C0530g.c
            if (r0 == 0) goto L13
            r0 = r7
            androidx.lifecycle.g$c r0 = (android.view.C0530g.c) r0
            int r1 = r0.f8568v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8568v = r1
            goto L18
        L13:
            androidx.lifecycle.g$c r0 = new androidx.lifecycle.g$c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f8566t
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f8568v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.f8564r
            androidx.lifecycle.g r6 = (android.view.C0530g) r6
            kotlin.a1.n(r7)
            goto L64
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.f8565s
            androidx.lifecycle.LiveData r6 = (android.view.LiveData) r6
            java.lang.Object r2 = r0.f8564r
            androidx.lifecycle.g r2 = (android.view.C0530g) r2
            kotlin.a1.n(r7)
            r7 = r6
            r6 = r2
            goto L56
        L44:
            kotlin.a1.n(r7)
            r0.f8564r = r5
            r0.f8565s = r6
            r0.f8568v = r4
            java.lang.Object r7 = r5.u(r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r7 = r6
            r6 = r5
        L56:
            r0.f8564r = r6
            r2 = 0
            r0.f8565s = r2
            r0.f8568v = r3
            java.lang.Object r7 = android.view.C0532i.a(r6, r7, r0)
            if (r7 != r1) goto L64
            return r1
        L64:
            androidx.lifecycle.l r7 = (android.view.l) r7
            r6.emittedSource = r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: android.view.C0530g.v(androidx.lifecycle.LiveData, kotlin.coroutines.d):java.lang.Object");
    }

    public C0530g(@d CoroutineContext context, long j5, @d p<? super f0<T>, ? super Continuation<? super m2>, ? extends Object> block) {
        l0.p(context, "context");
        l0.p(block, "block");
        this.blockRunner = new C0526c<>(this, block, j5, v0.a(m1.e().J0().B(context).B(q3.a((n2) context.b(n2.INSTANCE)))), new a(this));
    }
}
