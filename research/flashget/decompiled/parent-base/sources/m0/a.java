package m0;

import androidx.compose.runtime.internal.u;
import fg.l;
import fg.m;
import kotlin.Metadata;

/* compiled from: VelocityTracker.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lm0/a;", "", "", "time", "", "dataPoint", "<init>", "(JF)V", "a", "()J", "b", "()F", "c", "(JF)Lm0/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "f", "h", "(J)V", "F", "e", "g", "(F)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f81464c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long time;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float dataPoint;

    public a(long j4, float f4) {
        this.time = j4;
        this.dataPoint = f4;
    }

    public static a d(a aVar, long j4, float f4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = aVar.time;
        }
        if ((i4 & 2) != 0) {
            f4 = aVar.dataPoint;
        }
        aVar.getClass();
        return new a(j4, f4);
    }

    /* renamed from: a, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* renamed from: b, reason: from getter */
    public final float getDataPoint() {
        return this.dataPoint;
    }

    @l
    public final a c(long time, float dataPoint) {
        return new a(time, dataPoint);
    }

    public final float e() {
        return this.dataPoint;
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return this.time == aVar.time && Float.compare(this.dataPoint, aVar.dataPoint) == 0;
    }

    public final long f() {
        return this.time;
    }

    public final void g(float f4) {
        this.dataPoint = f4;
    }

    public final void h(long j4) {
        this.time = j4;
    }

    public int hashCode() {
        return Float.hashCode(this.dataPoint) + (Long.hashCode(this.time) * 31);
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.time);
        sb.append(", dataPoint=");
        return androidx.compose.animation.b.a(sb, this.dataPoint, ')');
    }
}
