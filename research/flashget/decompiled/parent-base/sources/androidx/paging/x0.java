package androidx.paging;

import kotlin.Metadata;

/* compiled from: PagingConfig.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u0000 \u00142\u00020\u0001:\u0001\fBC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"Landroidx/paging/x0;", "", "", "pageSize", "prefetchDistance", "", "enablePlaceholders", "initialLoadSize", "maxSize", "jumpThreshold", "<init>", "(IIZIII)V", "a", "I", "b", "c", "Z", "d", "e", "f", "g", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class x0 {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: h, reason: collision with root package name */
    public static final int f32433h = Integer.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public static final int f32434i = 3;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public final int pageSize;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public final int prefetchDistance;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public final boolean enablePlaceholders;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public final int initialLoadSize;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public final int maxSize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public final int jumpThreshold;

    /* compiled from: PagingConfig.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\u0003R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/paging/x0$a;", "", "<init>", "()V", "", "MAX_SIZE_UNBOUNDED", "I", "a", "DEFAULT_INITIAL_PAGE_MULTIPLIER", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: androidx.paging.x0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void a() {
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    @kd.j
    public x0(int i4) {
        this(i4, 0, false, 0, 0, 0, 62, null);
    }

    @kd.j
    public x0(int i4, @androidx.annotation.g0(from = 0) int i5) {
        this(i4, i5, false, 0, 0, 0, 60, null);
    }

    @kd.j
    public x0(int i4, @androidx.annotation.g0(from = 0) int i5, boolean z4) {
        this(i4, i5, z4, 0, 0, 0, 56, null);
    }

    @kd.j
    public x0(int i4, @androidx.annotation.g0(from = 0) int i5, boolean z4, @androidx.annotation.g0(from = 1) int i6) {
        this(i4, i5, z4, i6, 0, 0, 48, null);
    }

    @kd.j
    public x0(int i4, @androidx.annotation.g0(from = 0) int i5, boolean z4, @androidx.annotation.g0(from = 1) int i6, @androidx.annotation.g0(from = 2) int i7) {
        this(i4, i5, z4, i6, i7, 0, 32, null);
    }

    @kd.j
    public x0(int i4, @androidx.annotation.g0(from = 0) int i5, boolean z4, @androidx.annotation.g0(from = 1) int i6, @androidx.annotation.g0(from = 2) int i7, int i10) {
        this.pageSize = i4;
        this.prefetchDistance = i5;
        this.enablePlaceholders = z4;
        this.initialLoadSize = i6;
        this.maxSize = i7;
        this.jumpThreshold = i10;
        if (!z4 && i5 == 0) {
            throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        }
        if (i7 == Integer.MAX_VALUE || i7 >= (i5 * 2) + i4) {
            if (!(i10 == Integer.MIN_VALUE || i10 > 0)) {
                throw new IllegalArgumentException("jumpThreshold must be positive to enable jumps or COUNT_UNDEFINED to disable jumping.");
            }
        } else {
            StringBuilder a5 = androidx.collection.n1.a("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=", i4, ", prefetchDist=", i5, ", maxSize=");
            a5.append(i7);
            throw new IllegalArgumentException(a5.toString());
        }
    }

    public /* synthetic */ x0(int i4, int i5, boolean z4, int i6, int i7, int i10, int i11, kotlin.jvm.internal.w wVar) {
        this(i4, (i11 & 2) != 0 ? i4 : i5, (i11 & 4) != 0 ? true : z4, (i11 & 8) != 0 ? i4 * 3 : i6, (i11 & 16) != 0 ? Integer.MAX_VALUE : i7, (i11 & 32) != 0 ? Integer.MIN_VALUE : i10);
    }
}
