package kotlin.ranges;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.collections.IntIterator;

/* compiled from: Progressions.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\t\u0010\u0013\u001a\u00020\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0007\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lkotlin/ranges/IntProgression;", "", "", "start", "endInclusive", "step", "(III)V", "first", "getFirst", "()I", "last", "getLast", "getStep", "equals", "", "other", "", "hashCode", "isEmpty", "iterator", "Lkotlin/collections/IntIterator;", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.ranges.j, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public class IntProgression implements Iterable<Integer>, r3.a {

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    public static final a f23723r = new a(null);

    /* renamed from: o, reason: collision with root package name */
    private final int f23724o;

    /* renamed from: p, reason: collision with root package name */
    private final int f23725p;

    /* renamed from: q, reason: collision with root package name */
    private final int f23726q;

    /* compiled from: Progressions.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lkotlin/ranges/IntProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/IntProgression;", "rangeStart", "", "rangeEnd", "step", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.ranges.j$a */
    public static final class a {
        private a() {
        }

        @d5.d
        public final IntProgression a(int i5, int i6, int i7) {
            return new IntProgression(i5, i6, i7);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public IntProgression(int i5, int i6, int i7) {
        if (i7 == 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("䈦"));
        }
        if (i7 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException(ProtectedSandApp.s("䈥"));
        }
        this.f23724o = i5;
        this.f23725p = kotlin.internal.n.c(i5, i6, i7);
        this.f23726q = i7;
    }

    public boolean equals(@d5.e Object other) {
        if (other instanceof IntProgression) {
            if (!isEmpty() || !((IntProgression) other).isEmpty()) {
                IntProgression intProgression = (IntProgression) other;
                if (this.f23724o != intProgression.f23724o || this.f23725p != intProgression.f23725p || this.f23726q != intProgression.f23726q) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f23724o * 31) + this.f23725p) * 31) + this.f23726q;
    }

    public boolean isEmpty() {
        if (this.f23726q > 0) {
            if (this.f23724o > this.f23725p) {
                return true;
            }
        } else if (this.f23724o < this.f23725p) {
            return true;
        }
        return false;
    }

    /* renamed from: q, reason: from getter */
    public final int getF23724o() {
        return this.f23724o;
    }

    /* renamed from: r, reason: from getter */
    public final int getF23725p() {
        return this.f23725p;
    }

    /* renamed from: s, reason: from getter */
    public final int getF23726q() {
        return this.f23726q;
    }

    @Override // java.lang.Iterable
    @d5.d
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public IntIterator iterator() {
        return new IntProgressionIterator(this.f23724o, this.f23725p, this.f23726q);
    }

    @d5.d
    public String toString() {
        StringBuilder sb;
        int i5;
        int i6 = this.f23726q;
        String s5 = ProtectedSandApp.s("䈧");
        if (i6 > 0) {
            sb = new StringBuilder();
            sb.append(this.f23724o);
            sb.append(ProtectedSandApp.s("䈨"));
            sb.append(this.f23725p);
            sb.append(s5);
            i5 = this.f23726q;
        } else {
            sb = new StringBuilder();
            sb.append(this.f23724o);
            sb.append(ProtectedSandApp.s("䈩"));
            sb.append(this.f23725p);
            sb.append(s5);
            i5 = -this.f23726q;
        }
        sb.append(i5);
        return sb.toString();
    }
}
