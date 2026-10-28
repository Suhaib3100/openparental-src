package kotlin.ranges;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.a2;
import kotlin.c1;
import kotlin.n2;
import kotlin.o2;

/* compiled from: ULongRange.kt */
@o2(markerClass = {kotlin.t.class})
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0017\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\u00020\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001c\u0082\u0002\u0004\n\u0002\b!¨\u0006%"}, d2 = {"Lkotlin/ranges/y;", "", "Lkotlin/a2;", "start", "endInclusive", "", "step", "<init>", "(JJJLkotlin/jvm/internal/w;)V", "", "iterator", "()Ljava/util/Iterator;", "", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "J", "j", "()J", "first", "c", "l", "last", "d", "m", "e", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@c1(version = "1.5")
/* loaded from: classes7.dex */
public class y implements Iterable<a2>, md.a {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long first;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long last;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long step;

    /* compiled from: ULongRange.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/ranges/y$a;", "", "<init>", "()V", "Lkotlin/a2;", "rangeStart", "rangeEnd", "", "step", "Lkotlin/ranges/y;", "a", "(JJJ)Lkotlin/ranges/y;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.ranges.y$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final y a(long rangeStart, long rangeEnd, long step) {
            return new y(rangeStart, rangeEnd, step, null);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ y(long j4, long j5, long j6, kotlin.jvm.internal.w wVar) {
        this(j4, j5, j6);
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof y) {
            if (!isEmpty() || !((y) other).isEmpty()) {
                y yVar = (y) other;
                if (this.first != yVar.first || this.last != yVar.last || this.step != yVar.step) {
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
        long j4 = this.first;
        int h4 = ((int) (j4 ^ a2.h(j4 >>> 32))) * 31;
        long j5 = this.last;
        int i4 = (h4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.step;
        return i4 + ((int) ((j6 >>> 32) ^ j6));
    }

    public boolean isEmpty() {
        int compare;
        int compare2;
        long j4 = this.step;
        long j5 = this.first;
        long j6 = this.last;
        if (j4 > 0) {
            compare2 = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
            if (compare2 <= 0) {
                return false;
            }
        } else {
            compare = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
            if (compare >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    @fg.l
    public final Iterator<a2> iterator() {
        return new z(this.first, this.last, this.step, null);
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

    @fg.l
    public String toString() {
        StringBuilder sb;
        long j4;
        long j5 = this.step;
        String s4 = ProtectedSandApp.s("斺\u0001");
        if (j5 > 0) {
            sb = new StringBuilder();
            sb.append((Object) a2.h0(this.first));
            sb.append(ProtectedSandApp.s("斻\u0001"));
            sb.append((Object) n2.l(this.last, 10));
            sb.append(s4);
            j4 = this.step;
        } else {
            sb = new StringBuilder();
            sb.append((Object) a2.h0(this.first));
            sb.append(ProtectedSandApp.s("於\u0001"));
            sb.append((Object) n2.l(this.last, 10));
            sb.append(s4);
            j4 = -this.step;
        }
        sb.append(j4);
        return sb.toString();
    }

    private y(long j4, long j5, long j6) {
        if (j6 == 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("方\u0001"));
        }
        if (j6 == Long.MIN_VALUE) {
            throw new IllegalArgumentException(ProtectedSandApp.s("斸\u0001"));
        }
        this.first = j4;
        this.last = kotlin.internal.r.c(j4, j5, j6);
        this.step = j6;
    }
}
