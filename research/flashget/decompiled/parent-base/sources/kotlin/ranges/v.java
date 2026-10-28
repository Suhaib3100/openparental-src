package kotlin.ranges;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.o2;
import kotlin.w1;

/* compiled from: UIntRange.kt */
@o2(markerClass = {kotlin.t.class})
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0017\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001e\u001a\u00020\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u0014\u0082\u0002\u0004\n\u0002\b!¨\u0006#"}, d2 = {"Lkotlin/ranges/v;", "", "Lkotlin/w1;", "start", "endInclusive", "", "step", "<init>", "(IIILkotlin/jvm/internal/w;)V", "", "iterator", "()Ljava/util/Iterator;", "", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "I", "j", "first", "c", "l", "last", "d", "m", "e", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@c1(version = "1.5")
/* loaded from: classes7.dex */
public class v implements Iterable<w1>, md.a {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int first;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int last;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int step;

    /* compiled from: UIntRange.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/ranges/v$a;", "", "<init>", "()V", "Lkotlin/w1;", "rangeStart", "rangeEnd", "", "step", "Lkotlin/ranges/v;", "a", "(III)Lkotlin/ranges/v;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.ranges.v$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final v a(int rangeStart, int rangeEnd, int step) {
            return new v(rangeStart, rangeEnd, step, null);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ v(int i4, int i5, int i6, kotlin.jvm.internal.w wVar) {
        this(i4, i5, i6);
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof v) {
            if (!isEmpty() || !((v) other).isEmpty()) {
                v vVar = (v) other;
                if (this.first != vVar.first || this.last != vVar.last || this.step != vVar.step) {
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
        return (((this.first * 31) + this.last) * 31) + this.step;
    }

    public boolean isEmpty() {
        int compare;
        int compare2;
        if (this.step > 0) {
            compare2 = Integer.compare(this.first ^ Integer.MIN_VALUE, this.last ^ Integer.MIN_VALUE);
            if (compare2 <= 0) {
                return false;
            }
        } else {
            compare = Integer.compare(this.first ^ Integer.MIN_VALUE, this.last ^ Integer.MIN_VALUE);
            if (compare >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    @fg.l
    public final Iterator<w1> iterator() {
        return new w(this.first, this.last, this.step, null);
    }

    /* renamed from: j, reason: from getter */
    public final int getFirst() {
        return this.first;
    }

    /* renamed from: l, reason: from getter */
    public final int getLast() {
        return this.last;
    }

    /* renamed from: m, reason: from getter */
    public final int getStep() {
        return this.step;
    }

    @fg.l
    public String toString() {
        StringBuilder sb;
        int i4;
        int i5 = this.step;
        String s4 = ProtectedSandApp.s("旺\u0001");
        if (i5 > 0) {
            sb = new StringBuilder();
            sb.append((Object) w1.h0(this.first));
            sb.append(ProtectedSandApp.s("旻\u0001"));
            sb.append((Object) w1.h0(this.last));
            sb.append(s4);
            i4 = this.step;
        } else {
            sb = new StringBuilder();
            sb.append((Object) w1.h0(this.first));
            sb.append(ProtectedSandApp.s("旼\u0001"));
            sb.append((Object) w1.h0(this.last));
            sb.append(s4);
            i4 = -this.step;
        }
        sb.append(i4);
        return sb.toString();
    }

    private v(int i4, int i5, int i6) {
        if (i6 == 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("旹\u0001"));
        }
        if (i6 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException(ProtectedSandApp.s("旸\u0001"));
        }
        this.first = i4;
        this.last = kotlin.internal.r.d(i4, i5, i6);
        this.step = i6;
    }
}
