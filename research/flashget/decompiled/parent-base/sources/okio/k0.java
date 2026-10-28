package okio;

import androidx.compose.animation.core.k1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* compiled from: SegmentPool.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0086D¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000b0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u001b"}, d2 = {"Lokio/k0;", "", "<init>", "()V", "Lokio/j0;", "e", "()Lokio/j0;", "segment", "Lkotlin/k2;", "d", "(Lokio/j0;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "a", "()Ljava/util/concurrent/atomic/AtomicReference;", "", "I", "c", "()I", "MAX_SIZE", "b", "Lokio/j0;", "LOCK", "HASH_BUCKET_COUNT", "", "[Ljava/util/concurrent/atomic/AtomicReference;", "hashBuckets", "byteCount", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final int MAX_SIZE = 65536;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final int HASH_BUCKET_COUNT;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final AtomicReference<j0>[] hashBuckets;

    /* renamed from: e, reason: collision with root package name */
    public static final k0 f85228e = new k0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final j0 LOCK = new j0(new byte[0], 0, 0, false, false);

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        HASH_BUCKET_COUNT = highestOneBit;
        AtomicReference<j0>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i4 = 0; i4 < highestOneBit; i4++) {
            atomicReferenceArr[i4] = new AtomicReference<>();
        }
        hashBuckets = atomicReferenceArr;
    }

    private k0() {
    }

    private final AtomicReference<j0> a() {
        Thread currentThread = Thread.currentThread();
        kotlin.jvm.internal.l0.o(currentThread, ProtectedSandApp.s("ᾀ"));
        return hashBuckets[(int) (currentThread.getId() & (HASH_BUCKET_COUNT - 1))];
    }

    @kd.n
    public static final void d(@fg.l j0 segment) {
        AtomicReference<j0> a5;
        j0 j0Var;
        kotlin.jvm.internal.l0.p(segment, ProtectedSandApp.s("ᾁ"));
        if (!(segment.next == null && segment.prev == null)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᾂ"));
        }
        if (segment.shared || (j0Var = (a5 = f85228e.a()).get()) == LOCK) {
            return;
        }
        int i4 = j0Var != null ? j0Var.limit : 0;
        if (i4 >= MAX_SIZE) {
            return;
        }
        segment.next = j0Var;
        segment.pos = 0;
        segment.limit = i4 + 8192;
        if (k1.a(a5, j0Var, segment)) {
            return;
        }
        segment.next = null;
    }

    @fg.l
    @kd.n
    public static final j0 e() {
        AtomicReference<j0> a5 = f85228e.a();
        j0 j0Var = LOCK;
        j0 andSet = a5.getAndSet(j0Var);
        if (andSet == j0Var) {
            return new j0();
        }
        if (andSet == null) {
            a5.set(null);
            return new j0();
        }
        a5.set(andSet.next);
        andSet.next = null;
        andSet.limit = 0;
        return andSet;
    }

    public final int b() {
        j0 j0Var = a().get();
        if (j0Var != null) {
            return j0Var.limit;
        }
        return 0;
    }

    public final int c() {
        return MAX_SIZE;
    }
}
