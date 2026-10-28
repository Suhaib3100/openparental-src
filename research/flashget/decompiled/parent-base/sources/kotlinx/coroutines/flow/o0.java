package kotlinx.coroutines.flow;

import kotlin.Metadata;

/* compiled from: SharingStarted.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/flow/o0;", "", "Lkotlinx/coroutines/flow/t0;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/m0;", "a", "(Lkotlinx/coroutines/flow/t0;)Lkotlinx/coroutines/flow/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface o0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f80293a;

    /* compiled from: SharingStarted.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/flow/o0$a;", "", "<init>", "()V", "", "stopTimeoutMillis", "replayExpirationMillis", "Lkotlinx/coroutines/flow/o0;", "a", "(JJ)Lkotlinx/coroutines/flow/o0;", "b", "Lkotlinx/coroutines/flow/o0;", "c", "()Lkotlinx/coroutines/flow/o0;", "Eagerly", "d", "Lazily", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.flow.o0$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f80293a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final o0 Eagerly = new q0();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final o0 Lazily = new r0();

        private Companion() {
        }

        public static o0 b(Companion companion, long j4, long j5, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                j4 = 0;
            }
            if ((i4 & 2) != 0) {
                j5 = Long.MAX_VALUE;
            }
            companion.getClass();
            return new s0(j4, j5);
        }

        @fg.l
        public final o0 a(long stopTimeoutMillis, long replayExpirationMillis) {
            return new s0(stopTimeoutMillis, replayExpirationMillis);
        }

        @fg.l
        public final o0 c() {
            return Eagerly;
        }

        @fg.l
        public final o0 d() {
            return Lazily;
        }
    }

    @fg.l
    i<m0> a(@fg.l t0<Integer> subscriptionCount);
}
