package kotlin.ranges;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.collections.v0;

/* compiled from: Progressions.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0016\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001b¨\u0006$"}, d2 = {"Lkotlin/ranges/m;", "", "", "start", "endInclusive", "step", "<init>", "(JJJ)V", "Lkotlin/collections/v0;", "p", "()Lkotlin/collections/v0;", "", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "J", "j", "()J", "first", "c", "l", "last", "d", "m", "e", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public class m implements Iterable<Long>, md.a {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long first;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long last;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long step;

    /* compiled from: Progressions.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/ranges/m$a;", "", "<init>", "()V", "", "rangeStart", "rangeEnd", "step", "Lkotlin/ranges/m;", "a", "(JJJ)Lkotlin/ranges/m;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.ranges.m$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final m a(long rangeStart, long rangeEnd, long step) {
            return new m(rangeStart, rangeEnd, step);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public m(long j4, long j5, long j6) {
        if (j6 == 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("旡\u0001"));
        }
        if (j6 == Long.MIN_VALUE) {
            throw new IllegalArgumentException(ProtectedSandApp.s("无\u0001"));
        }
        this.first = j4;
        this.last = kotlin.internal.n.d(j4, j5, j6);
        this.step = j6;
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof m) {
            if (!isEmpty() || !((m) other).isEmpty()) {
                m mVar = (m) other;
                if (this.first != mVar.first || this.last != mVar.last || this.step != mVar.step) {
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
        long j4 = 31;
        long j5 = this.first;
        long j6 = this.last;
        long j7 = (((j5 ^ (j5 >>> 32)) * j4) + (j6 ^ (j6 >>> 32))) * j4;
        long j10 = this.step;
        return (int) (j7 + (j10 ^ (j10 >>> 32)));
    }

    public boolean isEmpty() {
        long j4 = this.step;
        long j5 = this.first;
        long j6 = this.last;
        if (j4 > 0) {
            if (j5 <= j6) {
                return false;
            }
        } else if (j5 >= j6) {
            return false;
        }
        return true;
    }

    /* renamed from: j, reason: from getter */
    public final long getFirst() {
        return this.first;
    }

    /* renamed from: l, reason: from getter */
    public final long getLast() {
        return this.last;
    }

    /* renamed from: m, reason: from getter */
    public final long getStep() {
        return this.step;
    }

    @Override // java.lang.Iterable
    @fg.l
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public v0 iterator() {
        return new n(this.first, this.last, this.step);
    }

    @fg.l
    public String toString() {
        StringBuilder sb;
        long j4;
        long j5 = this.step;
        String s4 = ProtectedSandApp.s("既\u0001");
        if (j5 > 0) {
            sb = new StringBuilder();
            sb.append(this.first);
            sb.append(ProtectedSandApp.s("旣\u0001"));
            sb.append(this.last);
            sb.append(s4);
            j4 = this.step;
        } else {
            sb = new StringBuilder();
            sb.append(this.first);
            sb.append(ProtectedSandApp.s("旤\u0001"));
            sb.append(this.last);
            sb.append(s4);
            j4 = -this.step;
        }
        sb.append(j4);
        return sb.toString();
    }
}
