package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: DateRangePicker.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\nB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\n\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0011\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/t8;", "", "Landroidx/compose/ui/unit/q;", "gridStartCoordinates", "gridEndCoordinates", "", "firstIsSelectionStart", "lastIsSelectionEnd", "<init>", "(JJZZLkotlin/jvm/internal/w;)V", "a", "J", "c", "()J", "b", "Z", "()Z", "d", "e", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t8 {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: f, reason: collision with root package name */
    public static final int f14628f = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long gridStartCoordinates;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long gridEndCoordinates;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean firstIsSelectionStart;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean lastIsSelectionEnd;

    /* compiled from: DateRangePicker.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/material3/t8$a;", "", "<init>", "()V", "Landroidx/compose/material3/j2;", "month", "Landroidx/compose/material3/r0;", "startDate", "endDate", "Landroidx/compose/material3/t8;", "a", "(Landroidx/compose/material3/j2;Landroidx/compose/material3/r0;Landroidx/compose/material3/r0;)Landroidx/compose/material3/t8;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.t8$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.m
        public final t8 a(@fg.l j2 month, @fg.l r0 startDate, @fg.l r0 endDate) {
            if (startDate.k() > month.getEndUtcTimeMillis() || endDate.k() < month.m()) {
                return null;
            }
            boolean z4 = startDate.k() >= month.m();
            boolean z5 = endDate.k() <= month.getEndUtcTimeMillis();
            int i4 = z4 ? (startDate.i() + month.i()) - 1 : month.i();
            int i5 = z5 ? (endDate.i() + month.i()) - 1 : (month.l() + month.i()) - 1;
            return new t8(androidx.compose.ui.unit.r.a(i4 % 7, i4 / 7), androidx.compose.ui.unit.r.a(i5 % 7, i5 / 7), z4, z5, null);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ t8(long j4, long j5, boolean z4, boolean z5, kotlin.jvm.internal.w wVar) {
        this(j4, j5, z4, z5);
    }

    /* renamed from: a, reason: from getter */
    public final boolean getFirstIsSelectionStart() {
        return this.firstIsSelectionStart;
    }

    /* renamed from: b, reason: from getter */
    public final long getGridEndCoordinates() {
        return this.gridEndCoordinates;
    }

    /* renamed from: c, reason: from getter */
    public final long getGridStartCoordinates() {
        return this.gridStartCoordinates;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getLastIsSelectionEnd() {
        return this.lastIsSelectionEnd;
    }

    private t8(long j4, long j5, boolean z4, boolean z5) {
        this.gridStartCoordinates = j4;
        this.gridEndCoordinates = j5;
        this.firstIsSelectionStart = z4;
        this.lastIsSelectionEnd = z5;
    }
}
