package androidx.view;

import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.k2;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.k3;
import kotlinx.coroutines.s0;
import ld.p;

/* compiled from: CoroutineLiveData.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BM\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012-\u0010\r\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007¢\u0006\u0002\b\fø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\nH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0019\u0010\u0018R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/lifecycle/j;", "T", "Landroidx/lifecycle/m0;", "Lkotlin/coroutines/g;", "context", "", "timeoutInMs", "Lkotlin/Function2;", "Landroidx/lifecycle/k0;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "block", "<init>", "(Lkotlin/coroutines/g;JLld/p;)V", "Landroidx/lifecycle/LiveData;", "source", "Lkotlinx/coroutines/m1;", "w", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/d;)Ljava/lang/Object;", "v", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "m", "()V", "n", "Landroidx/lifecycle/d;", "Landroidx/lifecycle/d;", "blockRunner", "Landroidx/lifecycle/o;", "o", "Landroidx/lifecycle/o;", "emittedSource", "lifecycle-livedata-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1432j<T> extends m0<T> {

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @m
    private C1420d<T> blockRunner;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @m
    private C1439o emittedSource;

    /* compiled from: CoroutineLiveData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.j$a */
    static final class a extends n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1432j<T> f30343b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C1432j<T> c1432j) {
            super(0);
            this.f30343b = c1432j;
        }

        public final void a() {
            ((C1432j) this.f30343b).blockRunner = null;
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: CoroutineLiveData.kt */
    @f(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", i = {0}, l = {235}, m = "clearSource$lifecycle_livedata_ktx_release", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.j$b */
    static final class b extends d {

        /* renamed from: b, reason: collision with root package name */
        Object f30344b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f30345c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1432j<T> f30346d;

        /* renamed from: e, reason: collision with root package name */
        int f30347e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C1432j<T> c1432j, kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
            this.f30346d = c1432j;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            this.f30345c = obj;
            this.f30347e |= Integer.MIN_VALUE;
            return this.f30346d.v(this);
        }
    }

    /* compiled from: CoroutineLiveData.kt */
    @f(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", i = {0, 0, 1}, l = {228, 229}, m = "emitSource$lifecycle_livedata_ktx_release", n = {"this", "source", "this"}, s = {"L$0", "L$1", "L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.j$c */
    static final class c extends d {

        /* renamed from: b, reason: collision with root package name */
        Object f30348b;

        /* renamed from: c, reason: collision with root package name */
        Object f30349c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f30350d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C1432j<T> f30351e;

        /* renamed from: f, reason: collision with root package name */
        int f30352f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C1432j<T> c1432j, kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
            this.f30351e = c1432j;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            this.f30350d = obj;
            this.f30352f |= Integer.MIN_VALUE;
            return this.f30351e.w(null, this);
        }
    }

    public /* synthetic */ C1432j(g gVar, long j4, p pVar, int i4, w wVar) {
        this((i4 & 1) != 0 ? i.f75057b : gVar, (i4 & 2) != 0 ? C1434k.f30360a : j4, pVar);
    }

    @Override // androidx.view.m0, androidx.view.LiveData
    protected void m() {
        super.m();
        C1420d<T> c1420d = this.blockRunner;
        if (c1420d != null) {
            c1420d.h();
        }
    }

    @Override // androidx.view.m0, androidx.view.LiveData
    protected void n() {
        super.n();
        C1420d<T> c1420d = this.blockRunner;
        if (c1420d != null) {
            c1420d.g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(@fg.l kotlin.coroutines.d<? super kotlin.k2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.view.C1432j.b
            if (r0 == 0) goto L13
            r0 = r5
            androidx.lifecycle.j$b r0 = (androidx.view.C1432j.b) r0
            int r1 = r0.f30347e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30347e = r1
            goto L18
        L13:
            androidx.lifecycle.j$b r0 = new androidx.lifecycle.j$b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f30345c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f30347e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f30344b
            androidx.lifecycle.j r0 = (androidx.view.C1432j) r0
            kotlin.a1.n(r5)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.a1.n(r5)
            androidx.lifecycle.o r5 = r4.emittedSource
            if (r5 == 0) goto L45
            r0.f30344b = r4
            r0.f30347e = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            r5 = 0
            r0.emittedSource = r5
            kotlin.k2 r5 = kotlin.k2.f75408a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.view.C1432j.v(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(@fg.l androidx.view.LiveData<T> r6, @fg.l kotlin.coroutines.d<? super kotlinx.coroutines.m1> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.view.C1432j.c
            if (r0 == 0) goto L13
            r0 = r7
            androidx.lifecycle.j$c r0 = (androidx.view.C1432j.c) r0
            int r1 = r0.f30352f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30352f = r1
            goto L18
        L13:
            androidx.lifecycle.j$c r0 = new androidx.lifecycle.j$c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f30350d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f30352f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.f30348b
            androidx.lifecycle.j r6 = (androidx.view.C1432j) r6
            kotlin.a1.n(r7)
            goto L64
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.f30349c
            androidx.lifecycle.LiveData r6 = (androidx.view.LiveData) r6
            java.lang.Object r2 = r0.f30348b
            androidx.lifecycle.j r2 = (androidx.view.C1432j) r2
            kotlin.a1.n(r7)
            r7 = r6
            r6 = r2
            goto L56
        L44:
            kotlin.a1.n(r7)
            r0.f30348b = r5
            r0.f30349c = r6
            r0.f30352f = r4
            java.lang.Object r7 = r5.v(r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r7 = r6
            r6 = r5
        L56:
            r0.f30348b = r6
            r2 = 0
            r0.f30349c = r2
            r0.f30352f = r3
            java.lang.Object r7 = androidx.view.C1434k.a(r6, r7, r0)
            if (r7 != r1) goto L64
            return r1
        L64:
            androidx.lifecycle.o r7 = (androidx.view.C1439o) r7
            r6.emittedSource = r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.view.C1432j.w(androidx.lifecycle.LiveData, kotlin.coroutines.d):java.lang.Object");
    }

    public C1432j(@l g context, long j4, @l p<? super InterfaceC1435k0<T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> block) {
        l0.p(context, "context");
        l0.p(block, "block");
        this.blockRunner = new C1420d<>(this, block, j4, s0.a(j1.e().j1().O(context).O(k3.a((kotlinx.coroutines.k2) context.c(kotlinx.coroutines.k2.INSTANCE)))), new a(this));
    }
}
