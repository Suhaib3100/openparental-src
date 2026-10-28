package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.k2;
import kotlinx.coroutines.z1;

/* compiled from: Flow.kt */
@z1
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/flow/a;", "T", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/c;", "<init>", "()V", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "f", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class a<T> implements i<T>, c<T> {

    /* compiled from: Flow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", i = {0}, l = {230}, m = "collect", n = {"safeCollector"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.flow.a$a, reason: collision with other inner class name */
    static final class C1222a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79754b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f79755c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a<T> f79756d;

        /* renamed from: e, reason: collision with root package name */
        int f79757e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1222a(a<T> aVar, kotlin.coroutines.d<? super C1222a> dVar) {
            super(dVar);
            this.f79756d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79755c = obj;
            this.f79757e |= Integer.MIN_VALUE;
            return this.f79756d.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.i
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@fg.l kotlinx.coroutines.flow.j<? super T> r6, @fg.l kotlin.coroutines.d<? super kotlin.k2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.a.C1222a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.a$a r0 = (kotlinx.coroutines.flow.a.C1222a) r0
            int r1 = r0.f79757e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79757e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.a$a r0 = new kotlinx.coroutines.flow.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f79755c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79757e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f79754b
            kotlinx.coroutines.flow.internal.t r6 = (kotlinx.coroutines.flow.internal.t) r6
            kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L2b
            goto L51
        L2b:
            r7 = move-exception
            goto L5b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "蛠\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.a1.n(r7)
            kotlinx.coroutines.flow.internal.t r7 = new kotlinx.coroutines.flow.internal.t
            kotlin.coroutines.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f79754b = r7     // Catch: java.lang.Throwable -> L57
            r0.f79757e = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r6 = r5.f(r7, r0)     // Catch: java.lang.Throwable -> L57
            if (r6 != r1) goto L50
            return r1
        L50:
            r6 = r7
        L51:
            r6.releaseIntercepted()
            kotlin.k2 r6 = kotlin.k2.f75408a
            return r6
        L57:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L5b:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.m
    public abstract Object f(@fg.l j<? super T> jVar, @fg.l kotlin.coroutines.d<? super k2> dVar);
}
