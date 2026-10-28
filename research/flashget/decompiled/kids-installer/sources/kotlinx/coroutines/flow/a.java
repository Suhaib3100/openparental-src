package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.m2;
import kotlinx.coroutines.d2;

/* compiled from: Flow.kt */
@d2
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/flow/a;", "T", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "e", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public abstract class a<T> implements i<T>, c<T> {

    /* compiled from: Flow.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", i = {0}, l = {230}, m = "collect", n = {"safeCollector"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.flow.a$a, reason: collision with other inner class name */
    static final class C0416a extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f27732r;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f27733s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ a<T> f27734t;

        /* renamed from: u, reason: collision with root package name */
        int f27735u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0416a(a<T> aVar, Continuation<? super C0416a> continuation) {
            super(continuation);
            this.f27734t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27733s = obj;
            this.f27735u |= Integer.MIN_VALUE;
            return this.f27734t.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.i
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@d5.d kotlinx.coroutines.flow.j<? super T> r6, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.a.C0416a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.a$a r0 = (kotlinx.coroutines.flow.a.C0416a) r0
            int r1 = r0.f27735u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27735u = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.a$a r0 = new kotlinx.coroutines.flow.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f27733s
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27735u
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f27732r
            kotlinx.coroutines.flow.internal.t r6 = (kotlinx.coroutines.flow.internal.t) r6
            kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L2b
            goto L51
        L2b:
            r7 = move-exception
            goto L5b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "郏"
            java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.a1.n(r7)
            kotlinx.coroutines.flow.internal.t r7 = new kotlinx.coroutines.flow.internal.t
            kotlin.coroutines.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f27732r = r7     // Catch: java.lang.Throwable -> L57
            r0.f27735u = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r6 = r5.e(r7, r0)     // Catch: java.lang.Throwable -> L57
            if (r6 != r1) goto L50
            return r1
        L50:
            r6 = r7
        L51:
            r6.C()
            kotlin.m2 r6 = kotlin.m2.f23662a
            return r6
        L57:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L5b:
            r6.C()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
    }

    @d5.e
    public abstract Object e(@d5.d j<? super T> jVar, @d5.d Continuation<? super m2> continuation);
}
