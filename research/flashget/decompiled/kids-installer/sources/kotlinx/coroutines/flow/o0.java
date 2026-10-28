package kotlinx.coroutines.flow;

import kotlin.Metadata;

/* compiled from: SharingStarted.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/flow/o0;", "", "Lkotlinx/coroutines/flow/t0;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/m0;", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public interface o0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    public static final Companion INSTANCE = Companion.f28259a;

    /* compiled from: SharingStarted.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/flow/o0$a;", "", "", "stopTimeoutMillis", "replayExpirationMillis", "Lkotlinx/coroutines/flow/o0;", "a", "b", "Lkotlinx/coroutines/flow/o0;", "c", "()Lkotlinx/coroutines/flow/o0;", "Eagerly", "d", "Lazily", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.o0$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f28259a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private static final o0 Eagerly = new q0();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private static final o0 Lazily = new r0();

        private Companion() {
        }

        public static o0 b(Companion companion, long j5, long j6, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                j5 = 0;
            }
            if ((i5 & 2) != 0) {
                j6 = Long.MAX_VALUE;
            }
            companion.getClass();
            return new s0(j5, j6);
        }

        @d5.d
        public final o0 a(long stopTimeoutMillis, long replayExpirationMillis) {
            return new s0(stopTimeoutMillis, replayExpirationMillis);
        }

        @d5.d
        public final o0 c() {
            return Eagerly;
        }

        @d5.d
        public final o0 d() {
            return Lazily;
        }
    }

    @d5.d
    i<m0> a(@d5.d t0<Integer> subscriptionCount);
}
