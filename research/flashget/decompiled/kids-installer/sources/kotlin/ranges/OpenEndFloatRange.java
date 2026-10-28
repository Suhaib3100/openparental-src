package kotlin.ranges;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: Ranges.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002J\u0013\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\t¨\u0006\u0019"}, d2 = {"Lkotlin/ranges/OpenEndFloatRange;", "Lkotlin/ranges/OpenEndRange;", "", "start", "endExclusive", "(FF)V", "_endExclusive", "_start", "getEndExclusive", "()Ljava/lang/Float;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "", "isEmpty", "lessThanOrEquals", "a", "b", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.ranges.q, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class OpenEndFloatRange implements OpenEndRange<Float> {

    /* renamed from: o, reason: collision with root package name */
    private final float f23745o;

    /* renamed from: p, reason: collision with root package name */
    private final float f23746p;

    public OpenEndFloatRange(float f6, float f7) {
        this.f23745o = f6;
        this.f23746p = f7;
    }

    private final boolean e(float f6, float f7) {
        return f6 <= f7;
    }

    public boolean a(float f6) {
        return f6 >= this.f23745o && f6 < this.f23746p;
    }

    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ boolean b(Float f6) {
        return a(f6.floatValue());
    }

    @Override // kotlin.ranges.OpenEndRange
    @d5.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Float h() {
        return Float.valueOf(this.f23746p);
    }

    @Override // kotlin.ranges.OpenEndRange
    @d5.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Float f() {
        return Float.valueOf(this.f23745o);
    }

    public boolean equals(@d5.e Object other) {
        if (!(other instanceof OpenEndFloatRange)) {
            return false;
        }
        if (!isEmpty() || !((OpenEndFloatRange) other).isEmpty()) {
            OpenEndFloatRange openEndFloatRange = (OpenEndFloatRange) other;
            if (!(this.f23745o == openEndFloatRange.f23745o)) {
                return false;
            }
            if (!(this.f23746p == openEndFloatRange.f23746p)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f23745o) * 31) + Float.hashCode(this.f23746p);
    }

    @Override // kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        return this.f23745o >= this.f23746p;
    }

    @d5.d
    public String toString() {
        return this.f23745o + ProtectedSandApp.s("䈰") + this.f23746p;
    }
}
