package androidx.core.util;

import android.util.Range;
import androidx.annotation.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.ranges.ClosedRange;

/* compiled from: Range.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0087\f¢\u0006\u0004\b\u0004\u0010\u0005\u001a8\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00028\u0000H\u0087\n¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\n\u001a7\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\f\u001a(\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\fH\u0007¨\u0006\u000f"}, d2 = {"", "T", "that", "Landroid/util/Range;", "d", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Landroid/util/Range;", "value", "c", "(Landroid/util/Range;Ljava/lang/Comparable;)Landroid/util/Range;", "other", "b", "a", "Lkotlin/ranges/g;", "e", "f", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class s {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Range.kt */
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001R\u001c\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00018\u00008\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\n \u0002*\u0004\u0018\u00018\u00008\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"androidx/core/util/s$a", "Lkotlin/ranges/g;", "kotlin.jvm.PlatformType", "p", "()Ljava/lang/Comparable;", "endInclusive", "f", "start", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a<T> implements ClosedRange<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Range<T> f5282o;

        a(Range<T> range) {
            this.f5282o = range;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Z */
        @Override // kotlin.ranges.ClosedRange
        public boolean b(@d5.d Comparable comparable) {
            return ClosedRange.a.a(this, comparable);
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.ranges.ClosedRange
        public Comparable f() {
            return this.f5282o.getLower();
        }

        @Override // kotlin.ranges.ClosedRange
        public boolean isEmpty() {
            return ClosedRange.a.b(this);
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.ranges.ClosedRange
        public Comparable p() {
            return this.f5282o.getUpper();
        }
    }

    @x0(21)
    @d5.d
    public static final <T extends Comparable<? super T>> Range<T> a(@d5.d Range<T> range, @d5.d Range<T> other) {
        l0.p(range, "<this>");
        l0.p(other, "other");
        Range<T> intersect = range.intersect(other);
        l0.o(intersect, "intersect(other)");
        return intersect;
    }

    @x0(21)
    @d5.d
    public static final <T extends Comparable<? super T>> Range<T> b(@d5.d Range<T> range, @d5.d Range<T> other) {
        l0.p(range, "<this>");
        l0.p(other, "other");
        Range<T> extend = range.extend(other);
        l0.o(extend, "extend(other)");
        return extend;
    }

    @x0(21)
    @d5.d
    public static final <T extends Comparable<? super T>> Range<T> c(@d5.d Range<T> range, @d5.d T value) {
        l0.p(range, "<this>");
        l0.p(value, "value");
        Range<T> extend = range.extend((Range<T>) value);
        l0.o(extend, "extend(value)");
        return extend;
    }

    @x0(21)
    @d5.d
    public static final <T extends Comparable<? super T>> Range<T> d(@d5.d T t5, @d5.d T that) {
        l0.p(t5, "<this>");
        l0.p(that, "that");
        return new Range<>(t5, that);
    }

    @x0(21)
    @d5.d
    public static final <T extends Comparable<? super T>> ClosedRange<T> e(@d5.d Range<T> range) {
        l0.p(range, "<this>");
        return new a(range);
    }

    @x0(21)
    @d5.d
    public static final <T extends Comparable<? super T>> Range<T> f(@d5.d ClosedRange<T> closedRange) {
        l0.p(closedRange, "<this>");
        return new Range<>(closedRange.f(), closedRange.p());
    }
}
