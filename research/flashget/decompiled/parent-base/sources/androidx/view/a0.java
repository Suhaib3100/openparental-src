package androidx.view;

import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: FullyDrawnReporter.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a5\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Landroidx/activity/z;", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "reporter", "a", "(Landroidx/activity/z;Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a0 {

    /* compiled from: FullyDrawnReporter.kt */
    @f(c = "androidx.activity.FullyDrawnReporterKt", f = "FullyDrawnReporter.kt", i = {0}, l = {185}, m = "reportWhenComplete", n = {"$this$reportWhenComplete"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporterKt$reportWhenComplete$1\n*L\n1#1,190:1\n*E\n"})
    static final class a extends d {

        /* renamed from: b, reason: collision with root package name */
        Object f430b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f431c;

        /* renamed from: d, reason: collision with root package name */
        int f432d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            this.f431c = obj;
            this.f432d |= Integer.MIN_VALUE;
            return a0.a(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.k2] */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@fg.l androidx.view.z r4, @fg.l ld.l<? super kotlin.coroutines.d<? super kotlin.k2>, ? extends java.lang.Object> r5, @fg.l kotlin.coroutines.d<? super kotlin.k2> r6) {
        /*
            boolean r0 = r6 instanceof androidx.activity.a0.a
            if (r0 == 0) goto L13
            r0 = r6
            androidx.activity.a0$a r0 = (androidx.activity.a0.a) r0
            int r1 = r0.f432d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f432d = r1
            goto L18
        L13:
            androidx.activity.a0$a r0 = new androidx.activity.a0$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f431c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f432d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f430b
            androidx.activity.z r4 = (androidx.view.z) r4
            kotlin.a1.n(r6)     // Catch: java.lang.Throwable -> L2b
            goto L4f
        L2b:
            r5 = move-exception
            goto L55
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.a1.n(r6)
            r4.c()
            boolean r6 = r4.e()
            if (r6 == 0) goto L44
            kotlin.k2 r4 = kotlin.k2.f75408a
            return r4
        L44:
            r0.f430b = r4     // Catch: java.lang.Throwable -> L2b
            r0.f432d = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L2b
            if (r5 != r1) goto L4f
            return r1
        L4f:
            r4.h()
            kotlin.k2 r4 = kotlin.k2.f75408a
            return r4
        L55:
            r4.h()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.view.a0.a(androidx.activity.z, ld.l, kotlin.coroutines.d):java.lang.Object");
    }

    private static final Object b(z zVar, ld.l<? super kotlin.coroutines.d<? super k2>, ? extends Object> lVar, kotlin.coroutines.d<? super k2> dVar) {
        zVar.c();
        if (zVar.e()) {
            return k2.f75408a;
        }
        try {
            lVar.invoke(dVar);
            zVar.h();
            return k2.f75408a;
        } catch (Throwable th) {
            zVar.h();
            throw th;
        }
    }
}
