package kotlin.ranges;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: Ranges.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002J\u0013\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\t¨\u0006\u0019"}, d2 = {"Lkotlin/ranges/ClosedFloatRange;", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "start", "endInclusive", "(FF)V", "_endInclusive", "_start", "getEndInclusive", "()Ljava/lang/Float;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "", "isEmpty", "lessThanOrEquals", "a", "b", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.ranges.e, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
final class ClosedFloatRange implements ClosedFloatingPointRange<Float> {

    /* renamed from: o, reason: collision with root package name */
    private final float f23717o;

    /* renamed from: p, reason: collision with root package name */
    private final float f23718p;

    public ClosedFloatRange(float f6, float f7) {
        this.f23717o = f6;
        this.f23718p = f7;
    }

    public boolean a(float f6) {
        return f6 >= this.f23717o && f6 <= this.f23718p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean b(Comparable comparable) {
        return a(((Number) comparable).floatValue());
    }

    @Override // kotlin.ranges.ClosedRange
    @d5.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Float p() {
        return Float.valueOf(this.f23718p);
    }

    @Override // kotlin.ranges.ClosedRange
    @d5.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Float f() {
        return Float.valueOf(this.f23717o);
    }

    public boolean e(float f6, float f7) {
        return f6 <= f7;
    }

    public boolean equals(@d5.e Object other) {
        if (!(other instanceof ClosedFloatRange)) {
            return false;
        }
        if (!isEmpty() || !((ClosedFloatRange) other).isEmpty()) {
            ClosedFloatRange closedFloatRange = (ClosedFloatRange) other;
            if (!(this.f23717o == closedFloatRange.f23717o)) {
                return false;
            }
            if (!(this.f23718p == closedFloatRange.f23718p)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange
    public /* bridge */ /* synthetic */ boolean g(Float f6, Float f7) {
        return e(f6.floatValue(), f7.floatValue());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f23717o) * 31) + Float.hashCode(this.f23718p);
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return this.f23717o > this.f23718p;
    }

    @d5.d
    public String toString() {
        return this.f23717o + ProtectedSandApp.s("罯") + this.f23718p;
    }
}
