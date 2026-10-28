package androidx.work;

import androidx.work.r;
import androidx.work.w;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Operation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"Landroidx/work/w;", "Landroidx/work/w$b$c;", "a", "(Landroidx/work/w;Lkotlin/coroutines/d;)Ljava/lang/Object;", "work-runtime-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class x {

    /* compiled from: Operation.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.work.OperationKt", f = "Operation.kt", i = {0}, l = {39}, m = "await", n = {"$this$await$iv"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f36617b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f36618c;

        /* renamed from: d, reason: collision with root package name */
        int f36619d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f36618c = obj;
            this.f36619d |= Integer.MIN_VALUE;
            return x.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@fg.l androidx.work.w r4, @fg.l kotlin.coroutines.d<? super androidx.work.w.b.c> r5) {
        /*
            boolean r0 = r5 instanceof androidx.work.x.a
            if (r0 == 0) goto L13
            r0 = r5
            androidx.work.x$a r0 = (androidx.work.x.a) r0
            int r1 = r0.f36619d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36619d = r1
            goto L18
        L13:
            androidx.work.x$a r0 = new androidx.work.x$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f36618c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f36619d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f36617b
            com.google.common.util.concurrent.ListenableFuture r4 = (com.google.common.util.concurrent.ListenableFuture) r4
            kotlin.a1.n(r5)
            goto L82
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.a1.n(r5)
            com.google.common.util.concurrent.ListenableFuture r4 = r4.a()
            java.lang.String r5 = "result"
            kotlin.jvm.internal.l0.o(r4, r5)
            boolean r5 = r4.isDone()
            if (r5 == 0) goto L54
            java.lang.Object r4 = r4.get()     // Catch: java.util.concurrent.ExecutionException -> L4a
            goto L83
        L4a:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L52
            goto L53
        L52:
            r4 = r5
        L53:
            throw r4
        L54:
            r0.f36617b = r4
            r0.f36619d = r3
            kotlinx.coroutines.q r5 = new kotlinx.coroutines.q
            kotlin.coroutines.d r2 = kotlin.coroutines.intrinsics.b.e(r0)
            r5.<init>(r2, r3)
            r5.e0()
            androidx.work.r$a r2 = new androidx.work.r$a
            r2.<init>(r5, r4)
            androidx.work.i r3 = androidx.work.i.INSTANCE
            r4.n2(r2, r3)
            androidx.work.r$b r2 = new androidx.work.r$b
            r2.<init>(r4)
            r5.k0(r2)
            java.lang.Object r5 = r5.y()
            if (r5 != r1) goto L7f
            kotlin.coroutines.jvm.internal.h.c(r0)
        L7f:
            if (r5 != r1) goto L82
            return r1
        L82:
            r4 = r5
        L83:
            java.lang.String r5 = "result.await()"
            kotlin.jvm.internal.l0.o(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.x.a(androidx.work.w, kotlin.coroutines.d):java.lang.Object");
    }

    private static final Object b(w wVar, kotlin.coroutines.d<? super w.b.c> dVar) {
        Object obj;
        ListenableFuture<w.b.c> result = wVar.a();
        l0.o(result, "result");
        if (result.isDone()) {
            try {
                obj = result.get();
            } catch (ExecutionException e4) {
                Throwable cause = e4.getCause();
                if (cause == null) {
                    throw e4;
                }
                throw cause;
            }
        } else {
            kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            qVar.e0();
            result.n2(new r.a(qVar, result), i.INSTANCE);
            qVar.k0(new r.b(result));
            obj = qVar.y();
            if (obj == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
        }
        l0.o(obj, "result.await()");
        return obj;
    }
}
