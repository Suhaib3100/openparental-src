package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: CalendarModel.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@f5
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0014J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\n\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b#\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b$\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b%\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006("}, d2 = {"Landroidx/compose/material3/r0;", "", "", "year", "month", "dayOfMonth", "", "utcTimeMillis", "<init>", "(IIIJ)V", "other", "a", "(Landroidx/compose/material3/r0;)I", "Landroidx/compose/material3/s0;", "calendarModel", "", "skeleton", "h", "(Landroidx/compose/material3/s0;Ljava/lang/String;)Ljava/lang/String;", "b", "()I", "c", "d", "e", "()J", "f", "(IIIJ)Landroidx/compose/material3/r0;", "toString", "()Ljava/lang/String;", "hashCode", "", "", "equals", "(Ljava/lang/Object;)Z", "I", "l", "j", "i", "J", "k", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class r0 implements Comparable<r0> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f13923f = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int year;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int month;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int dayOfMonth;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long utcTimeMillis;

    public r0(int i4, int i5, int i6, long j4) {
        this.year = i4;
        this.month = i5;
        this.dayOfMonth = i6;
        this.utcTimeMillis = j4;
    }

    public static r0 g(r0 r0Var, int i4, int i5, int i6, long j4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i4 = r0Var.year;
        }
        if ((i7 & 2) != 0) {
            i5 = r0Var.month;
        }
        int i10 = i5;
        if ((i7 & 4) != 0) {
            i6 = r0Var.dayOfMonth;
        }
        int i11 = i6;
        if ((i7 & 8) != 0) {
            j4 = r0Var.utcTimeMillis;
        }
        r0Var.getClass();
        return new r0(i4, i10, i11, j4);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@fg.l r0 other) {
        return kotlin.jvm.internal.l0.u(this.utcTimeMillis, other.utcTimeMillis);
    }

    /* renamed from: b, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    /* renamed from: c, reason: from getter */
    public final int getMonth() {
        return this.month;
    }

    /* renamed from: d, reason: from getter */
    public final int getDayOfMonth() {
        return this.dayOfMonth;
    }

    /* renamed from: e, reason: from getter */
    public final long getUtcTimeMillis() {
        return this.utcTimeMillis;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) other;
        return this.year == r0Var.year && this.month == r0Var.month && this.dayOfMonth == r0Var.dayOfMonth && this.utcTimeMillis == r0Var.utcTimeMillis;
    }

    @fg.l
    public final r0 f(int year, int month, int dayOfMonth, long utcTimeMillis) {
        return new r0(year, month, dayOfMonth, utcTimeMillis);
    }

    @fg.l
    public final String h(@fg.l s0 calendarModel, @fg.l String skeleton) {
        return calendarModel.b(this, skeleton, calendarModel.getLocale());
    }

    public int hashCode() {
        return Long.hashCode(this.utcTimeMillis) + androidx.compose.foundation.w1.a(this.dayOfMonth, androidx.compose.foundation.w1.a(this.month, Integer.hashCode(this.year) * 31, 31), 31);
    }

    public final int i() {
        return this.dayOfMonth;
    }

    public final int j() {
        return this.month;
    }

    public final long k() {
        return this.utcTimeMillis;
    }

    public final int l() {
        return this.year;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("CalendarDate(year=");
        sb.append(this.year);
        sb.append(", month=");
        sb.append(this.month);
        sb.append(", dayOfMonth=");
        sb.append(this.dayOfMonth);
        sb.append(", utcTimeMillis=");
        return androidx.collection.y0.a(sb, this.utcTimeMillis, ')');
    }
}
