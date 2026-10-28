package kotlin.ranges;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.Comparable;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.ranges.ClosedRange;

/* compiled from: Ranges.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0012\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0016\u0010\u0005\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0013"}, d2 = {"Lkotlin/ranges/ComparableRange;", "T", "", "Lkotlin/ranges/ClosedRange;", "start", "endInclusive", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)V", "getEndInclusive", "()Ljava/lang/Comparable;", "Ljava/lang/Comparable;", "getStart", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.ranges.i, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
class ComparableRange<T extends Comparable<? super T>> implements ClosedRange<T> {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final T f23721o;

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final T f23722p;

    public ComparableRange(@d5.d T t5, @d5.d T t6) {
        l0.p(t5, ProtectedSandApp.s("䈢"));
        l0.p(t6, ProtectedSandApp.s("䈣"));
        this.f23721o = t5;
        this.f23722p = t6;
    }

    @Override // kotlin.ranges.ClosedRange
    public boolean b(@d5.d T t5) {
        return ClosedRange.a.a(this, t5);
    }

    public boolean equals(@d5.e Object other) {
        if (other instanceof ComparableRange) {
            if (!isEmpty() || !((ComparableRange) other).isEmpty()) {
                ComparableRange comparableRange = (ComparableRange) other;
                if (!l0.g(f(), comparableRange.f()) || !l0.g(p(), comparableRange.p())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.ClosedRange
    @d5.d
    public T f() {
        return this.f23721o;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (f().hashCode() * 31) + p().hashCode();
    }

    @Override // kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return ClosedRange.a.b(this);
    }

    @Override // kotlin.ranges.ClosedRange
    @d5.d
    public T p() {
        return this.f23722p;
    }

    @d5.d
    public String toString() {
        return f() + ProtectedSandApp.s("䈤") + p();
    }
}
