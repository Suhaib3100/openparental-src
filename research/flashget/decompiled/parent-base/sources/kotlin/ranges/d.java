package kotlin.ranges;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: Ranges.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Lkotlin/ranges/d;", "Lkotlin/ranges/f;", "", "start", "endInclusive", "<init>", "(DD)V", "a", "b", "", "g", "(DD)Z", "value", "(D)Z", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "D", "_start", "c", "_endInclusive", "e", "()Ljava/lang/Double;", "d", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class d implements f<Double> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final double _start;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final double _endInclusive;

    public d(double d5, double d6) {
        this._start = d5;
        this._endInclusive = d6;
    }

    public boolean a(double value) {
        return value >= this._start && value <= this._endInclusive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.f, kotlin.ranges.g
    public /* bridge */ /* synthetic */ boolean b(Comparable comparable) {
        return a(((Number) comparable).doubleValue());
    }

    @Override // kotlin.ranges.g
    public Comparable c() {
        return Double.valueOf(this._start);
    }

    @fg.l
    public Double d() {
        return Double.valueOf(this._endInclusive);
    }

    @fg.l
    public Double e() {
        return Double.valueOf(this._start);
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof d) {
            if (!isEmpty() || !((d) other).isEmpty()) {
                d dVar = (d) other;
                if (this._start != dVar._start || this._endInclusive != dVar._endInclusive) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.f
    public /* bridge */ /* synthetic */ boolean f(Double d5, Double d6) {
        return g(d5.doubleValue(), d6.doubleValue());
    }

    public boolean g(double a5, double b5) {
        return a5 <= b5;
    }

    @Override // kotlin.ranges.g
    public Comparable h() {
        return Double.valueOf(this._endInclusive);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.hashCode(this._start) * 31) + Double.hashCode(this._endInclusive);
    }

    @Override // kotlin.ranges.f, kotlin.ranges.g
    public boolean isEmpty() {
        return this._start > this._endInclusive;
    }

    @fg.l
    public String toString() {
        return this._start + ProtectedSandApp.s("族\u0001") + this._endInclusive;
    }
}
