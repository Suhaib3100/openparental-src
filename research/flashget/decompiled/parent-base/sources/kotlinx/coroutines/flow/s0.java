package kotlinx.coroutines.flow;

import androidx.compose.foundation.layout.f3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.flow.v;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: SharingStarted.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/flow/s0;", "Lkotlinx/coroutines/flow/o0;", "", "stopTimeout", "replayExpiration", "<init>", "(JJ)V", "Lkotlinx/coroutines/flow/t0;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/m0;", "a", "(Lkotlinx/coroutines/flow/t0;)Lkotlinx/coroutines/flow/i;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "J", "c", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSharingStarted.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharingStarted.kt\nkotlinx/coroutines/flow/StartedWhileSubscribed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,209:1\n1#2:210\n*E\n"})
/* loaded from: classes7.dex */
final class s0 implements o0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long stopTimeout;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long replayExpiration;

    /* compiled from: SharingStarted.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {178, 180, 182, 183, 185}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlinx/coroutines/flow/m0;", "", "count", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.q<j<? super m0>, Integer, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f80383b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f80384c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ int f80385d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Object R(j<? super m0> jVar, Integer num, kotlin.coroutines.d<? super k2> dVar) {
            return a(jVar, num.intValue(), dVar);
        }

        @fg.m
        public final Object a(@fg.l j<? super m0> jVar, int i4, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            a aVar = s0.this.new a(dVar);
            aVar.f80384c = jVar;
            aVar.f80385d = i4;
            return aVar.invokeSuspend(k2.f75408a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x009d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x008f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r10) {
            /*
                r9 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r9.f80383b
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
                java.lang.String r0 = "蝵\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                r10.<init>(r0)
                throw r10
            L22:
                java.lang.Object r1 = r9.f80384c
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.a1.n(r10)
                goto L90
            L2a:
                java.lang.Object r1 = r9.f80384c
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.a1.n(r10)
                goto L7f
            L32:
                java.lang.Object r1 = r9.f80384c
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.a1.n(r10)
                goto L66
            L3a:
                kotlin.a1.n(r10)
                goto L9e
            L3e:
                kotlin.a1.n(r10)
                java.lang.Object r10 = r9.f80384c
                r1 = r10
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                int r10 = r9.f80385d
                if (r10 <= 0) goto L55
                kotlinx.coroutines.flow.m0 r10 = kotlinx.coroutines.flow.m0.START
                r9.f80383b = r6
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9e
                return r0
            L55:
                kotlinx.coroutines.flow.s0 r10 = kotlinx.coroutines.flow.s0.this
                long r6 = kotlinx.coroutines.flow.s0.c(r10)
                r9.f80384c = r1
                r9.f80383b = r5
                java.lang.Object r10 = kotlinx.coroutines.c1.b(r6, r9)
                if (r10 != r0) goto L66
                return r0
            L66:
                kotlinx.coroutines.flow.s0 r10 = kotlinx.coroutines.flow.s0.this
                long r5 = kotlinx.coroutines.flow.s0.b(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L90
                kotlinx.coroutines.flow.m0 r10 = kotlinx.coroutines.flow.m0.STOP
                r9.f80384c = r1
                r9.f80383b = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L7f
                return r0
            L7f:
                kotlinx.coroutines.flow.s0 r10 = kotlinx.coroutines.flow.s0.this
                long r4 = kotlinx.coroutines.flow.s0.b(r10)
                r9.f80384c = r1
                r9.f80383b = r3
                java.lang.Object r10 = kotlinx.coroutines.c1.b(r4, r9)
                if (r10 != r0) goto L90
                return r0
            L90:
                kotlinx.coroutines.flow.m0 r10 = kotlinx.coroutines.flow.m0.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.f80384c = r3
                r9.f80383b = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9e
                return r0
            L9e:
                kotlin.k2 r10 = kotlin.k2.f75408a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.s0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SharingStarted.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/m0;", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/m0;)Z"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<m0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f80387b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f80388c;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l m0 m0Var, @fg.m kotlin.coroutines.d<? super Boolean> dVar) {
            return ((b) create(m0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = new b(2, dVar);
            bVar.f80388c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f80387b != 0) {
                throw new IllegalStateException(ProtectedSandApp.s("蝶\u0001"));
            }
            a1.n(obj);
            return Boolean.valueOf(((m0) this.f80388c) != m0.START);
        }
    }

    public s0(long j4, long j5) {
        this.stopTimeout = j4;
        this.replayExpiration = j5;
        String s4 = ProtectedSandApp.s("蝷\u0001");
        if (j4 < 0) {
            throw new IllegalArgumentException(androidx.compose.ui.input.pointer.s.a(ProtectedSandApp.s("蝹\u0001"), j4, s4).toString());
        }
        if (j5 < 0) {
            throw new IllegalArgumentException(androidx.compose.ui.input.pointer.s.a(ProtectedSandApp.s("蝸\u0001"), j5, s4).toString());
        }
    }

    @Override // kotlinx.coroutines.flow.o0
    @fg.l
    public i<m0> a(@fg.l t0<Integer> subscriptionCount) {
        return s.a(new v.e(w.n(subscriptionCount, new a(null)), new b(2, null)));
    }

    public boolean equals(@fg.m Object other) {
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

    @fg.l
    public String toString() {
        kotlin.collections.builders.b bVar = new kotlin.collections.builders.b(2);
        long j4 = this.stopTimeout;
        String s4 = ProtectedSandApp.s("蝺\u0001");
        if (j4 > 0) {
            bVar.add(ProtectedSandApp.s("蝻\u0001") + this.stopTimeout + s4);
        }
        if (this.replayExpiration < Long.MAX_VALUE) {
            bVar.add(ProtectedSandApp.s("蝼\u0001") + this.replayExpiration + s4);
        }
        return f3.a(new StringBuilder(ProtectedSandApp.s("蝽\u0001")), kotlin.collections.w.m3(kotlin.collections.w.a(bVar), null, null, null, 0, null, null, 63, null), ')');
    }
}
