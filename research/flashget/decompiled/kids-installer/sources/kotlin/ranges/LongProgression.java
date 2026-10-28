package kotlin.ranges;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.collections.LongIterator;

/* compiled from: Progressions.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\t\u0010\u0014\u001a\u00020\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0007\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lkotlin/ranges/LongProgression;", "", "", "start", "endInclusive", "step", "(JJJ)V", "first", "getFirst", "()J", "last", "getLast", "getStep", "equals", "", "other", "", "hashCode", "", "isEmpty", "iterator", "Lkotlin/collections/LongIterator;", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.ranges.m, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public class LongProgression implements Iterable<Long>, r3.a {

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    public static final a f23733r = new a(null);

    /* renamed from: o, reason: collision with root package name */
    private final long f23734o;

    /* renamed from: p, reason: collision with root package name */
    private final long f23735p;

    /* renamed from: q, reason: collision with root package name */
    private final long f23736q;

    /* compiled from: Progressions.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lkotlin/ranges/LongProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/LongProgression;", "rangeStart", "", "rangeEnd", "step", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.ranges.m$a */
    public static final class a {
        private a() {
        }

        @d5.d
        public final LongProgression a(long j5, long j6, long j7) {
            return new LongProgression(j5, j6, j7);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public LongProgression(long j5, long j6, long j7) {
        if (j7 == 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("䈫"));
        }
        if (j7 == Long.MIN_VALUE) {
            throw new IllegalArgumentException(ProtectedSandApp.s("䈪"));
        }
        this.f23734o = j5;
        this.f23735p = kotlin.internal.n.d(j5, j6, j7);
        this.f23736q = j7;
    }

    public boolean equals(@d5.e Object other) {
        if (other instanceof LongProgression) {
            if (!isEmpty() || !((LongProgression) other).isEmpty()) {
                LongProgression longProgression = (LongProgression) other;
                if (this.f23734o != longProgression.f23734o || this.f23735p != longProgression.f23735p || this.f23736q != longProgression.f23736q) {
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
        long j5 = 31;
        long j6 = this.f23734o;
        long j7 = this.f23735p;
        long j8 = (((j6 ^ (j6 >>> 32)) * j5) + (j7 ^ (j7 >>> 32))) * j5;
        long j9 = this.f23736q;
        return (int) (j8 + (j9 ^ (j9 >>> 32)));
    }

    public boolean isEmpty() {
        long j5 = this.f23736q;
        long j6 = this.f23734o;
        long j7 = this.f23735p;
        if (j5 > 0) {
            if (j6 > j7) {
                return true;
            }
        } else if (j6 < j7) {
            return true;
        }
        return false;
    }

    /* renamed from: q, reason: from getter */
    public final long getF23734o() {
        return this.f23734o;
    }

    /* renamed from: r, reason: from getter */
    public final long getF23735p() {
        return this.f23735p;
    }

    /* renamed from: s, reason: from getter */
    public final long getF23736q() {
        return this.f23736q;
    }

    @Override // java.lang.Iterable
    @d5.d
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public LongIterator iterator() {
        return new LongProgressionIterator(this.f23734o, this.f23735p, this.f23736q);
    }

    @d5.d
    public String toString() {
        StringBuilder sb;
        long j5;
        long j6 = this.f23736q;
        String s5 = ProtectedSandApp.s("䈬");
        if (j6 > 0) {
            sb = new StringBuilder();
            sb.append(this.f23734o);
            sb.append(ProtectedSandApp.s("䈭"));
            sb.append(this.f23735p);
            sb.append(s5);
            j5 = this.f23736q;
        } else {
            sb = new StringBuilder();
            sb.append(this.f23734o);
            sb.append(ProtectedSandApp.s("䈮"));
            sb.append(this.f23735p);
            sb.append(s5);
            j5 = -this.f23736q;
        }
        sb.append(j5);
        return sb.toString();
    }
}
