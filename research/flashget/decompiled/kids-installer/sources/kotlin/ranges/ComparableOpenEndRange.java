package kotlin.ranges;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.Comparable;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.ranges.OpenEndRange;

/* compiled from: Ranges.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0012\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0016\u0010\u0005\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0013"}, d2 = {"Lkotlin/ranges/ComparableOpenEndRange;", "T", "", "Lkotlin/ranges/OpenEndRange;", "start", "endExclusive", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)V", "getEndExclusive", "()Ljava/lang/Comparable;", "Ljava/lang/Comparable;", "getStart", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.ranges.h, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
class ComparableOpenEndRange<T extends Comparable<? super T>> implements OpenEndRange<T> {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final T f23719o;

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final T f23720p;

    public ComparableOpenEndRange(@d5.d T t5, @d5.d T t6) {
        l0.p(t5, ProtectedSandApp.s("䈟"));
        l0.p(t6, ProtectedSandApp.s("䈠"));
        this.f23719o = t5;
        this.f23720p = t6;
    }

    @Override // kotlin.ranges.OpenEndRange
    public boolean b(@d5.d T t5) {
        return OpenEndRange.a.a(this, t5);
    }

    public boolean equals(@d5.e Object other) {
        if (other instanceof ComparableOpenEndRange) {
            if (!isEmpty() || !((ComparableOpenEndRange) other).isEmpty()) {
                ComparableOpenEndRange comparableOpenEndRange = (ComparableOpenEndRange) other;
                if (!l0.g(f(), comparableOpenEndRange.f()) || !l0.g(h(), comparableOpenEndRange.h())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.OpenEndRange
    @d5.d
    public T f() {
        return this.f23719o;
    }

    @Override // kotlin.ranges.OpenEndRange
    @d5.d
    public T h() {
        return this.f23720p;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (f().hashCode() * 31) + h().hashCode();
    }

    @Override // kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        return OpenEndRange.a.b(this);
    }

    @d5.d
    public String toString() {
        return f() + ProtectedSandApp.s("䈡") + h();
    }
}
