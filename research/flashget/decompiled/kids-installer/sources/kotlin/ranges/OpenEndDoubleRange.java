package kotlin.ranges;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: Ranges.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002J\u0013\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\t¨\u0006\u0019"}, d2 = {"Lkotlin/ranges/OpenEndDoubleRange;", "Lkotlin/ranges/OpenEndRange;", "", "start", "endExclusive", "(DD)V", "_endExclusive", "_start", "getEndExclusive", "()Ljava/lang/Double;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "", "isEmpty", "lessThanOrEquals", "a", "b", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.ranges.p, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class OpenEndDoubleRange implements OpenEndRange<Double> {

    /* renamed from: o, reason: collision with root package name */
    private final double f23743o;

    /* renamed from: p, reason: collision with root package name */
    private final double f23744p;

    public OpenEndDoubleRange(double d6, double d7) {
        this.f23743o = d6;
        this.f23744p = d7;
    }

    private final boolean e(double d6, double d7) {
        return d6 <= d7;
    }

    public boolean a(double d6) {
        return d6 >= this.f23743o && d6 < this.f23744p;
    }

    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ boolean b(Double d6) {
        return a(d6.doubleValue());
    }

    @Override // kotlin.ranges.OpenEndRange
    @d5.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Double h() {
        return Double.valueOf(this.f23744p);
    }

    @Override // kotlin.ranges.OpenEndRange
    @d5.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Double f() {
        return Double.valueOf(this.f23743o);
    }

    public boolean equals(@d5.e Object other) {
        if (!(other instanceof OpenEndDoubleRange)) {
            return false;
        }
        if (!isEmpty() || !((OpenEndDoubleRange) other).isEmpty()) {
            OpenEndDoubleRange openEndDoubleRange = (OpenEndDoubleRange) other;
            if (!(this.f23743o == openEndDoubleRange.f23743o)) {
                return false;
            }
            if (!(this.f23744p == openEndDoubleRange.f23744p)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.hashCode(this.f23743o) * 31) + Double.hashCode(this.f23744p);
    }

    @Override // kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        return this.f23743o >= this.f23744p;
    }

    @d5.d
    public String toString() {
        return this.f23743o + ProtectedSandApp.s("䈯") + this.f23744p;
    }
}
