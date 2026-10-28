package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* compiled from: SegmentPool.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0002R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0018"}, d2 = {"Lokio/k0;", "", "Lokio/j0;", "e", "segment", "Lkotlin/m2;", "d", "Ljava/util/concurrent/atomic/AtomicReference;", "a", "", "I", "c", "()I", "MAX_SIZE", "b", "Lokio/j0;", "LOCK", "HASH_BUCKET_COUNT", "", "[Ljava/util/concurrent/atomic/AtomicReference;", "hashBuckets", "byteCount", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class k0 {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final int HASH_BUCKET_COUNT;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final AtomicReference<j0>[] hashBuckets;

    /* renamed from: e, reason: collision with root package name */
    public static final k0 f31672e = new k0();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final int MAX_SIZE = 65536;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final j0 LOCK = new j0(new byte[0], 0, 0, false, false);

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        HASH_BUCKET_COUNT = highestOneBit;
        AtomicReference<j0>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i5 = 0; i5 < highestOneBit; i5++) {
            atomicReferenceArr[i5] = new AtomicReference<>();
        }
        hashBuckets = atomicReferenceArr;
    }

    private k0() {
    }

    private final AtomicReference<j0> a() {
        Thread currentThread = Thread.currentThread();
        kotlin.jvm.internal.l0.o(currentThread, ProtectedSandApp.s("桌"));
        return hashBuckets[(int) (currentThread.getId() & (HASH_BUCKET_COUNT - 1))];
    }

    @p3.n
    public static final void d(@d5.d j0 j0Var) {
        AtomicReference<j0> a6;
        j0 j0Var2;
        kotlin.jvm.internal.l0.p(j0Var, ProtectedSandApp.s("桍"));
        if (!(j0Var.next == null && j0Var.prev == null)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("桎").toString());
        }
        if (j0Var.shared || (j0Var2 = (a6 = f31672e.a()).get()) == LOCK) {
            return;
        }
        int i5 = j0Var2 != null ? j0Var2.limit : 0;
        if (i5 >= MAX_SIZE) {
            return;
        }
        j0Var.next = j0Var2;
        j0Var.pos = 0;
        j0Var.limit = i5 + 8192;
        if (android.view.x.a(a6, j0Var2, j0Var)) {
            return;
        }
        j0Var.next = null;
    }

    @d5.d
    @p3.n
    public static final j0 e() {
        AtomicReference<j0> a6 = f31672e.a();
        j0 j0Var = LOCK;
        j0 andSet = a6.getAndSet(j0Var);
        if (andSet == j0Var) {
            return new j0();
        }
        if (andSet == null) {
            a6.set(null);
            return new j0();
        }
        a6.set(andSet.next);
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
