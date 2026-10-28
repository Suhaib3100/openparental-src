package kotlin.ranges;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: Ranges.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002J\u0013\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\t¨\u0006\u0019"}, d2 = {"Lkotlin/ranges/ClosedDoubleRange;", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "start", "endInclusive", "(DD)V", "_endInclusive", "_start", "getEndInclusive", "()Ljava/lang/Double;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "", "isEmpty", "lessThanOrEquals", "a", "b", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.ranges.d, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
final class ClosedDoubleRange implements ClosedFloatingPointRange<Double> {

    /* renamed from: o, reason: collision with root package name */
    private final double f23715o;

    /* renamed from: p, reason: collision with root package name */
    private final double f23716p;

    public ClosedDoubleRange(double d6, double d7) {
        this.f23715o = d6;
        this.f23716p = d7;
    }

    public boolean a(double d6) {
        return d6 >= this.f23715o && d6 <= this.f23716p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean b(Comparable comparable) {
        return a(((Number) comparable).doubleValue());
    }

    @Override // kotlin.ranges.ClosedRange
    @d5.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Double p() {
        return Double.valueOf(this.f23716p);
    }

    @Override // kotlin.ranges.ClosedRange
    @d5.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Double f() {
        return Double.valueOf(this.f23715o);
    }

    public boolean e(double d6, double d7) {
        return d6 <= d7;
    }

    public boolean equals(@d5.e Object other) {
        if (!(other instanceof ClosedDoubleRange)) {
            return false;
        }
        if (!isEmpty() || !((ClosedDoubleRange) other).isEmpty()) {
            ClosedDoubleRange closedDoubleRange = (ClosedDoubleRange) other;
            if (!(this.f23715o == closedDoubleRange.f23715o)) {
                return false;
            }
            if (!(this.f23716p == closedDoubleRange.f23716p)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange
    public /* bridge */ /* synthetic */ boolean g(Double d6, Double d7) {
        return e(d6.doubleValue(), d7.doubleValue());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.hashCode(this.f23715o) * 31) + Double.hashCode(this.f23716p);
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return this.f23715o > this.f23716p;
    }

    @d5.d
    public String toString() {
        return this.f23715o + ProtectedSandApp.s("置") + this.f23716p;
    }
}
