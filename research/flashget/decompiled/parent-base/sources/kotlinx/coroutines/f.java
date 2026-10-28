package kotlinx.coroutines;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Await.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001\"\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0001\"\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\n0\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"T", "", "Lkotlinx/coroutines/z0;", "deferreds", "", "b", "([Lkotlinx/coroutines/z0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "a", "(Ljava/util/Collection;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/k2;", "jobs", "Lkotlin/k2;", "d", "([Lkotlinx/coroutines/k2;Lkotlin/coroutines/d;)Ljava/lang/Object;", "c", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n37#2,2:128\n13579#3,2:130\n1855#4,2:132\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitKt\n*L\n42#1:128,2\n54#1:130,2\n66#1:132,2\n*E\n"})
/* loaded from: classes7.dex */
public final class f {

    /* compiled from: Await.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {0}, l = {54}, m = "joinAll", n = {"$this$forEach$iv"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79744b;

        /* renamed from: c, reason: collision with root package name */
        int f79745c;

        /* renamed from: d, reason: collision with root package name */
        int f79746d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f79747e;

        /* renamed from: f, reason: collision with root package name */
        int f79748f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79747e = obj;
            this.f79748f |= Integer.MIN_VALUE;
            return f.d(null, this);
        }
    }

    /* compiled from: Await.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {}, l = {66}, m = "joinAll", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79749b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f79750c;

        /* renamed from: d, reason: collision with root package name */
        int f79751d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79750c = obj;
            this.f79751d |= Integer.MIN_VALUE;
            return f.c(null, this);
        }
    }

    @fg.m
    public static final <T> Object a(@fg.l Collection<? extends z0<? extends T>> collection, @fg.l kotlin.coroutines.d<? super List<? extends T>> dVar) {
        return collection.isEmpty() ? kotlin.collections.j0.f74919b : new e((z0[]) collection.toArray(new z0[0])).c(dVar);
    }

    @fg.m
    public static final <T> Object b(@fg.l z0<? extends T>[] z0VarArr, @fg.l kotlin.coroutines.d<? super List<? extends T>> dVar) {
        return z0VarArr.length == 0 ? kotlin.collections.j0.f74919b : new e(z0VarArr).c(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@fg.l java.util.Collection<? extends kotlinx.coroutines.k2> r4, @fg.l kotlin.coroutines.d<? super kotlin.k2> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.f.b
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.f$b r0 = (kotlinx.coroutines.f.b) r0
            int r1 = r0.f79751d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79751d = r1
            goto L18
        L13:
            kotlinx.coroutines.f$b r0 = new kotlinx.coroutines.f$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f79750c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79751d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f79749b
            java.util.Iterator r4 = (java.util.Iterator) r4
            kotlin.a1.n(r5)
            goto L40
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "蛒\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.a1.n(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L40:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L57
            java.lang.Object r5 = r4.next()
            kotlinx.coroutines.k2 r5 = (kotlinx.coroutines.k2) r5
            r0.f79749b = r4
            r0.f79751d = r3
            java.lang.Object r5 = r5.j0(r0)
            if (r5 != r1) goto L40
            return r1
        L57:
            kotlin.k2 r4 = kotlin.k2.f75408a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.f.c(java.util.Collection, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0054 -> B:10:0x0057). Please report as a decompilation issue!!! */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(@fg.l kotlinx.coroutines.k2[] r6, @fg.l kotlin.coroutines.d<? super kotlin.k2> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.f.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.f$a r0 = (kotlinx.coroutines.f.a) r0
            int r1 = r0.f79748f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79748f = r1
            goto L18
        L13:
            kotlinx.coroutines.f$a r0 = new kotlinx.coroutines.f$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f79747e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79748f
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L30
            int r6 = r0.f79746d
            int r2 = r0.f79745c
            java.lang.Object r4 = r0.f79744b
            kotlinx.coroutines.k2[] r4 = (kotlinx.coroutines.k2[]) r4
            kotlin.a1.n(r7)
            r7 = r4
            goto L57
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "蛒\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L3c:
            kotlin.a1.n(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L44:
            if (r2 >= r6) goto L59
            r4 = r7[r2]
            r0.f79744b = r7
            r0.f79745c = r2
            r0.f79746d = r6
            r0.f79748f = r3
            java.lang.Object r4 = r4.j0(r0)
            if (r4 != r1) goto L57
            return r1
        L57:
            int r2 = r2 + r3
            goto L44
        L59:
            kotlin.k2 r6 = kotlin.k2.f75408a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.f.d(kotlinx.coroutines.k2[], kotlin.coroutines.d):java.lang.Object");
    }
}
