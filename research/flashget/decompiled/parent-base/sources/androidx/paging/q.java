package androidx.paging;

import kotlin.Metadata;

/* compiled from: CachedPageEventFlow.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ%\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u00050\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/paging/q;", "", "T", "<init>", "()V", "Lkotlin/collections/r0;", "Landroidx/paging/l0;", "event", "Lkotlin/k2;", "b", "(Lkotlin/collections/r0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "a", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/r;", "Landroidx/paging/r;", "list", "Lkotlinx/coroutines/sync/a;", "Lkotlinx/coroutines/sync/a;", "lock", "", "c", "I", "maxEventIndex", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
final class q<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final r<T> list = new r<>();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.sync.a lock = kotlinx.coroutines.sync.c.b(false, 1, null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int maxEventIndex = -1;

    /* compiled from: CachedPageEventFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", i = {0, 0}, l = {262}, m = "getStateAsEvents", n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f32224b;

        /* renamed from: c, reason: collision with root package name */
        Object f32225c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f32226d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ q<T> f32227e;

        /* renamed from: f, reason: collision with root package name */
        int f32228f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q<T> qVar, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f32227e = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f32226d = obj;
            this.f32228f |= Integer.MIN_VALUE;
            return this.f32227e.a(this);
        }
    }

    /* compiled from: CachedPageEventFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", i = {0, 0, 0}, l = {262}, m = "record", n = {"this", "event", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f32229b;

        /* renamed from: c, reason: collision with root package name */
        Object f32230c;

        /* renamed from: d, reason: collision with root package name */
        Object f32231d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f32232e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ q<T> f32233f;

        /* renamed from: g, reason: collision with root package name */
        int f32234g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q<T> qVar, kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
            this.f32233f = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f32232e = obj;
            this.f32234g |= Integer.MIN_VALUE;
            return this.f32233f.b(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072 A[Catch: all -> 0x007e, TryCatch #0 {all -> 0x007e, blocks: (B:11:0x004c, B:12:0x006c, B:14:0x0072, B:16:0x007a, B:17:0x0080), top: B:10:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@fg.l kotlin.coroutines.d<? super java.util.List<? extends kotlin.collections.r0<? extends androidx.paging.l0<T>>>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.paging.q.a
            if (r0 == 0) goto L13
            r0 = r9
            androidx.paging.q$a r0 = (androidx.paging.q.a) r0
            int r1 = r0.f32228f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32228f = r1
            goto L18
        L13:
            androidx.paging.q$a r0 = new androidx.paging.q$a
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f32226d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f32228f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r1 = r0.f32225c
            kotlinx.coroutines.sync.a r1 = (kotlinx.coroutines.sync.a) r1
            java.lang.Object r0 = r0.f32224b
            androidx.paging.q r0 = (androidx.paging.q) r0
            kotlin.a1.n(r9)
            goto L4c
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            kotlin.a1.n(r9)
            kotlinx.coroutines.sync.a r9 = r8.lock
            r0.f32224b = r8
            r0.f32225c = r9
            r0.f32228f = r3
            java.lang.Object r0 = r9.f(r4, r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            r0 = r8
            r1 = r9
        L4c:
            androidx.paging.r<T> r9 = r0.list     // Catch: java.lang.Throwable -> L7e
            java.util.List r9 = r9.b()     // Catch: java.lang.Throwable -> L7e
            int r0 = r0.maxEventIndex     // Catch: java.lang.Throwable -> L7e
            int r2 = r9.size()     // Catch: java.lang.Throwable -> L7e
            int r0 = r0 - r2
            int r0 = r0 + r3
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Throwable -> L7e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7e
            r3 = 10
            int r3 = kotlin.collections.w.b0(r9, r3)     // Catch: java.lang.Throwable -> L7e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L7e
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L7e
            r3 = 0
        L6c:
            boolean r5 = r9.hasNext()     // Catch: java.lang.Throwable -> L7e
            if (r5 == 0) goto L8d
            java.lang.Object r5 = r9.next()     // Catch: java.lang.Throwable -> L7e
            int r6 = r3 + 1
            if (r3 >= 0) goto L80
            kotlin.collections.w.Z()     // Catch: java.lang.Throwable -> L7e
            goto L80
        L7e:
            r9 = move-exception
            goto L91
        L80:
            androidx.paging.l0 r5 = (androidx.paging.l0) r5     // Catch: java.lang.Throwable -> L7e
            kotlin.collections.r0 r7 = new kotlin.collections.r0     // Catch: java.lang.Throwable -> L7e
            int r3 = r3 + r0
            r7.<init>(r3, r5)     // Catch: java.lang.Throwable -> L7e
            r2.add(r7)     // Catch: java.lang.Throwable -> L7e
            r3 = r6
            goto L6c
        L8d:
            r1.g(r4)
            return r2
        L91:
            r1.g(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.q.a(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@fg.l kotlin.collections.r0<? extends androidx.paging.l0<T>> r6, @fg.l kotlin.coroutines.d<? super kotlin.k2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.paging.q.b
            if (r0 == 0) goto L13
            r0 = r7
            androidx.paging.q$b r0 = (androidx.paging.q.b) r0
            int r1 = r0.f32234g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32234g = r1
            goto L18
        L13:
            androidx.paging.q$b r0 = new androidx.paging.q$b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f32232e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f32234g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r6 = r0.f32231d
            kotlinx.coroutines.sync.a r6 = (kotlinx.coroutines.sync.a) r6
            java.lang.Object r1 = r0.f32230c
            kotlin.collections.r0 r1 = (kotlin.collections.r0) r1
            java.lang.Object r0 = r0.f32229b
            androidx.paging.q r0 = (androidx.paging.q) r0
            kotlin.a1.n(r7)
            r7 = r6
            r6 = r1
            goto L53
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            kotlin.a1.n(r7)
            kotlinx.coroutines.sync.a r7 = r5.lock
            r0.f32229b = r5
            r0.f32230c = r6
            r0.f32231d = r7
            r0.f32234g = r3
            java.lang.Object r0 = r7.f(r4, r0)
            if (r0 != r1) goto L52
            return r1
        L52:
            r0 = r5
        L53:
            int r1 = r6.e()     // Catch: java.lang.Throwable -> L6a
            r0.maxEventIndex = r1     // Catch: java.lang.Throwable -> L6a
            androidx.paging.r<T> r0 = r0.list     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r6 = r6.f()     // Catch: java.lang.Throwable -> L6a
            androidx.paging.l0 r6 = (androidx.paging.l0) r6     // Catch: java.lang.Throwable -> L6a
            r0.a(r6)     // Catch: java.lang.Throwable -> L6a
            kotlin.k2 r6 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> L6a
            r7.g(r4)
            return r6
        L6a:
            r6 = move-exception
            r7.g(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.q.b(kotlin.collections.r0, kotlin.coroutines.d):java.lang.Object");
    }
}
