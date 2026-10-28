package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Await.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001\"\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0001\"\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\n0\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"T", "", "Lkotlinx/coroutines/c1;", "deferreds", "", "b", "([Lkotlinx/coroutines/c1;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "a", "(Ljava/util/Collection;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/n2;", "jobs", "Lkotlin/m2;", "d", "([Lkotlinx/coroutines/n2;Lkotlin/coroutines/d;)Ljava/lang/Object;", "c", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class f {

    /* compiled from: Await.kt */
    @DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {0}, l = {54}, m = "joinAll", n = {"$this$forEach$iv"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class a extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f27718r;

        /* renamed from: s, reason: collision with root package name */
        int f27719s;

        /* renamed from: t, reason: collision with root package name */
        int f27720t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f27721u;

        /* renamed from: v, reason: collision with root package name */
        int f27722v;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27721u = obj;
            this.f27722v |= Integer.MIN_VALUE;
            return f.d(null, this);
        }
    }

    /* compiled from: Await.kt */
    @DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {}, l = {66}, m = "joinAll", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class b extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f27723r;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f27724s;

        /* renamed from: t, reason: collision with root package name */
        int f27725t;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27724s = obj;
            this.f27725t |= Integer.MIN_VALUE;
            return f.c(null, this);
        }
    }

    @d5.e
    public static final <T> Object a(@d5.d Collection<? extends c1<? extends T>> collection, @d5.d Continuation<? super List<? extends T>> continuation) {
        if (collection.isEmpty()) {
            return EmptyList.f23167o;
        }
        Object[] array = collection.toArray(new c1[0]);
        if (array != null) {
            return new e((c1[]) array).b(continuation);
        }
        throw new NullPointerException(ProtectedSandApp.s("崽"));
    }

    @d5.e
    public static final <T> Object b(@d5.d c1<? extends T>[] c1VarArr, @d5.d Continuation<? super List<? extends T>> continuation) {
        return c1VarArr.length == 0 ? EmptyList.f23167o : new e(c1VarArr).b(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@d5.d java.util.Collection<? extends kotlinx.coroutines.n2> r4, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.f.b
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.f$b r0 = (kotlinx.coroutines.f.b) r0
            int r1 = r0.f27725t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27725t = r1
            goto L18
        L13:
            kotlinx.coroutines.f$b r0 = new kotlinx.coroutines.f$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f27724s
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27725t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f27723r
            java.util.Iterator r4 = (java.util.Iterator) r4
            kotlin.a1.n(r5)
            goto L3e
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "崾"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.a1.n(r5)
            java.util.Iterator r4 = r4.iterator()
        L3e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L55
            java.lang.Object r5 = r4.next()
            kotlinx.coroutines.n2 r5 = (kotlinx.coroutines.n2) r5
            r0.f27723r = r4
            r0.f27725t = r3
            java.lang.Object r5 = r5.H(r0)
            if (r5 != r1) goto L3e
            return r1
        L55:
            kotlin.m2 r4 = kotlin.m2.f23662a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.f.c(java.util.Collection, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0054 -> B:10:0x0057). Please report as a decompilation issue!!! */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(@d5.d kotlinx.coroutines.n2[] r6, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.f.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.f$a r0 = (kotlinx.coroutines.f.a) r0
            int r1 = r0.f27722v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27722v = r1
            goto L18
        L13:
            kotlinx.coroutines.f$a r0 = new kotlinx.coroutines.f$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27721u
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27722v
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L30
            int r6 = r0.f27720t
            int r2 = r0.f27719s
            java.lang.Object r4 = r0.f27718r
            kotlinx.coroutines.n2[] r4 = (kotlinx.coroutines.n2[]) r4
            kotlin.a1.n(r7)
            r7 = r4
            goto L57
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "崿"
            java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
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
            r0.f27718r = r7
            r0.f27719s = r2
            r0.f27720t = r6
            r0.f27722v = r3
            java.lang.Object r4 = r4.H(r0)
            if (r4 != r1) goto L57
            return r1
        L57:
            int r2 = r2 + r3
            goto L44
        L59:
            kotlin.m2 r6 = kotlin.m2.f23662a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.f.d(kotlinx.coroutines.n2[], kotlin.coroutines.d):java.lang.Object");
    }
}
