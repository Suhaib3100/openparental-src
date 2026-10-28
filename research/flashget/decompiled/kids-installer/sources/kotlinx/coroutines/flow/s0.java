package kotlinx.coroutines.flow;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.m2;
import kotlinx.coroutines.flow.v;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: SharingStarted.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0017R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/flow/s0;", "Lkotlinx/coroutines/flow/o0;", "Lkotlinx/coroutines/flow/t0;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/m0;", "a", "", "toString", "", "other", "", "equals", "hashCode", "", "b", "J", "stopTimeout", "c", "replayExpiration", "<init>", "(JJ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
final class s0 implements o0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long stopTimeout;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long replayExpiration;

    /* compiled from: SharingStarted.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {178, SubsamplingScaleImageView.ORIENTATION_180, 182, 183, 185}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlinx/coroutines/flow/m0;", "", "count", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class a extends SuspendLambda implements q3.q<j<? super m0>, Integer, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f28338s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f28339t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ int f28340u;

        a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x009d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x008f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r10) {
            /*
                r9 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r9.f28338s
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3e
                if (r1 == r6) goto L3a
                if (r1 == r5) goto L32
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L22
                if (r1 != r2) goto L16
                goto L3a
            L16:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "鄜"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                r10.<init>(r0)
                throw r10
            L22:
                java.lang.Object r1 = r9.f28339t
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.a1.n(r10)
                goto L90
            L2a:
                java.lang.Object r1 = r9.f28339t
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.a1.n(r10)
                goto L7f
            L32:
                java.lang.Object r1 = r9.f28339t
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.a1.n(r10)
                goto L66
            L3a:
                kotlin.a1.n(r10)
                goto L9e
            L3e:
                kotlin.a1.n(r10)
                java.lang.Object r10 = r9.f28339t
                r1 = r10
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                int r10 = r9.f28340u
                if (r10 <= 0) goto L55
                kotlinx.coroutines.flow.m0 r10 = kotlinx.coroutines.flow.m0.START
                r9.f28338s = r6
                java.lang.Object r10 = r1.b(r10, r9)
                if (r10 != r0) goto L9e
                return r0
            L55:
                kotlinx.coroutines.flow.s0 r10 = kotlinx.coroutines.flow.s0.this
                long r6 = kotlinx.coroutines.flow.s0.c(r10)
                r9.f28339t = r1
                r9.f28338s = r5
                java.lang.Object r10 = kotlinx.coroutines.f1.b(r6, r9)
                if (r10 != r0) goto L66
                return r0
            L66:
                kotlinx.coroutines.flow.s0 r10 = kotlinx.coroutines.flow.s0.this
                long r5 = kotlinx.coroutines.flow.s0.b(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L90
                kotlinx.coroutines.flow.m0 r10 = kotlinx.coroutines.flow.m0.STOP
                r9.f28339t = r1
                r9.f28338s = r4
                java.lang.Object r10 = r1.b(r10, r9)
                if (r10 != r0) goto L7f
                return r0
            L7f:
                kotlinx.coroutines.flow.s0 r10 = kotlinx.coroutines.flow.s0.this
                long r4 = kotlinx.coroutines.flow.s0.b(r10)
                r9.f28339t = r1
                r9.f28338s = r3
                java.lang.Object r10 = kotlinx.coroutines.f1.b(r4, r9)
                if (r10 != r0) goto L90
                return r0
            L90:
                kotlinx.coroutines.flow.m0 r10 = kotlinx.coroutines.flow.m0.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.f28339t = r3
                r9.f28338s = r2
                java.lang.Object r10 = r1.b(r10, r9)
                if (r10 != r0) goto L9e
                return r0
            L9e:
                kotlin.m2 r10 = kotlin.m2.f23662a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.s0.a.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.q
        public /* bridge */ /* synthetic */ Object G(j<? super m0> jVar, Integer num, Continuation<? super m2> continuation) {
            return R(jVar, num.intValue(), continuation);
        }

        @d5.e
        public final Object R(@d5.d j<? super m0> jVar, int i5, @d5.e Continuation<? super m2> continuation) {
            a aVar = s0.this.new a(continuation);
            aVar.f28339t = jVar;
            aVar.f28340u = i5;
            return aVar.A(m2.f23662a);
        }
    }

    /* compiled from: SharingStarted.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/m0;", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class b extends SuspendLambda implements q3.p<m0, Continuation<? super Boolean>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f28342s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f28343t;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f28342s != 0) {
                throw new IllegalStateException(ProtectedSandApp.s("鄝"));
            }
            a1.n(obj);
            return Boolean.valueOf(((m0) this.f28343t) != m0.START);
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d m0 m0Var, @d5.e Continuation<? super Boolean> continuation) {
            return ((b) c(m0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            b bVar = new b(continuation);
            bVar.f28343t = obj;
            return bVar;
        }
    }

    public s0(long j5, long j6) {
        this.stopTimeout = j5;
        this.replayExpiration = j6;
        boolean z5 = j5 >= 0;
        String s5 = ProtectedSandApp.s("嶆");
        if (!z5) {
            throw new IllegalArgumentException((ProtectedSandApp.s("嶈") + j5 + s5).toString());
        }
        if (j6 >= 0) {
            return;
        }
        throw new IllegalArgumentException((ProtectedSandApp.s("嶇") + j6 + s5).toString());
    }

    @Override // kotlinx.coroutines.flow.o0
    @d5.d
    public i<m0> a(@d5.d t0<Integer> subscriptionCount) {
        return s.a(new v.e(w.n(subscriptionCount, new a(null)), new b(null)));
    }

    public boolean equals(@d5.e Object other) {
        if (other instanceof s0) {
            s0 s0Var = (s0) other;
            if (this.stopTimeout == s0Var.stopTimeout && this.replayExpiration == s0Var.replayExpiration) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return Long.hashCode(this.replayExpiration) + (Long.hashCode(this.stopTimeout) * 31);
    }

    @d5.d
    public String toString() {
        List a6;
        String m32;
        ListBuilder listBuilder = new ListBuilder(2);
        long j5 = this.stopTimeout;
        String s5 = ProtectedSandApp.s("嶉");
        if (j5 > 0) {
            listBuilder.add(ProtectedSandApp.s("嶊") + this.stopTimeout + s5);
        }
        if (this.replayExpiration < Long.MAX_VALUE) {
            listBuilder.add(ProtectedSandApp.s("嶋") + this.replayExpiration + s5);
        }
        a6 = kotlin.collections.z.a(listBuilder);
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("嶌"));
        m32 = kotlin.collections.j0.m3(a6, null, null, null, 0, null, null, 63, null);
        return c1.c.a(sb, m32, ')');
    }
}
