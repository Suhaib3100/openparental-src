package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Range;
import androidx.annotation.x0;
import kotlin.Metadata;
import kotlin.ranges.g;

/* compiled from: Range.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a2\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0087\f¢\u0006\u0004\b\u0004\u0010\u0005\u001a8\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00028\u0000H\u0087\n¢\u0006\u0004\b\u0007\u0010\b\u001a>\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\n¢\u0006\u0004\b\n\u0010\u000b\u001a>\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\f¢\u0006\u0004\b\f\u0010\u000b\u001a/\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "T", "that", "Landroid/util/Range;", "d", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Landroid/util/Range;", "value", "c", "(Landroid/util/Range;Ljava/lang/Comparable;)Landroid/util/Range;", "other", "b", "(Landroid/util/Range;Landroid/util/Range;)Landroid/util/Range;", "a", "Lkotlin/ranges/g;", "e", "(Landroid/util/Range;)Lkotlin/ranges/g;", "f", "(Lkotlin/ranges/g;)Landroid/util/Range;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Range.kt */
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001R\u001c\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00018\u00008\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\n \u0002*\u0004\u0018\u00018\u00008\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"androidx/core/util/d0$a", "Lkotlin/ranges/g;", "kotlin.jvm.PlatformType", "h", "()Ljava/lang/Comparable;", "endInclusive", "c", "start", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a<T> implements kotlin.ranges.g<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Range<T> f26840b;

        a(Range<T> range) {
            this.f26840b = range;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Z */
        @Override // kotlin.ranges.g
        public boolean b(Comparable comparable) {
            return g.a.a(this, comparable);
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.ranges.g
        public Comparable c() {
            return this.f26840b.getLower();
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.ranges.g
        public Comparable h() {
            return this.f26840b.getUpper();
        }

        @Override // kotlin.ranges.g
        public boolean isEmpty() {
            return g.a.b(this);
        }
    }

    @fg.l
    @x0(21)
    public static final <T extends Comparable<? super T>> Range<T> a(@fg.l Range<T> range, @fg.l Range<T> range2) {
        return range.intersect(range2);
    }

    @fg.l
    @x0(21)
    public static final <T extends Comparable<? super T>> Range<T> b(@fg.l Range<T> range, @fg.l Range<T> range2) {
        return range.extend(range2);
    }

    @fg.l
    @x0(21)
    public static final <T extends Comparable<? super T>> Range<T> c(@fg.l Range<T> range, @fg.l T t4) {
        return range.extend((Range<T>) t4);
    }

    @fg.l
    @x0(21)
    public static final <T extends Comparable<? super T>> Range<T> d(@fg.l T t4, @fg.l T t5) {
        return new Range<>(t4, t5);
    }

    @fg.l
    @x0(21)
    public static final <T extends Comparable<? super T>> kotlin.ranges.g<T> e(@fg.l Range<T> range) {
        return new a(range);
    }

    @fg.l
    @x0(21)
    public static final <T extends Comparable<? super T>> Range<T> f(@fg.l kotlin.ranges.g<T> gVar) {
        return new Range<>(gVar.c(), gVar.h());
    }
}
