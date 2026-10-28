package kotlin.ranges;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.collections.u0;

/* compiled from: Progressions.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0016\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u0013¨\u0006\""}, d2 = {"Lkotlin/ranges/j;", "", "", "start", "endInclusive", "step", "<init>", "(III)V", "Lkotlin/collections/u0;", "p", "()Lkotlin/collections/u0;", "", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "I", "j", "first", "c", "l", "last", "d", "m", "e", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public class j implements Iterable<Integer>, md.a {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int first;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int last;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int step;

    /* compiled from: Progressions.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/ranges/j$a;", "", "<init>", "()V", "", "rangeStart", "rangeEnd", "step", "Lkotlin/ranges/j;", "a", "(III)Lkotlin/ranges/j;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.ranges.j$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final j a(int rangeStart, int rangeEnd, int step) {
            return new j(rangeStart, rangeEnd, step);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public j(int i4, int i5, int i6) {
        if (i6 == 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("旚\u0001"));
        }
        if (i6 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException(ProtectedSandApp.s("旙\u0001"));
        }
        this.first = i4;
        this.last = kotlin.internal.n.c(i4, i5, i6);
        this.step = i6;
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof j) {
            if (!isEmpty() || !((j) other).isEmpty()) {
                j jVar = (j) other;
                if (this.first != jVar.first || this.last != jVar.last || this.step != jVar.step) {
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
        if (this.step > 0) {
            if (this.first <= this.last) {
                return false;
            }
        } else if (this.first >= this.last) {
            return false;
        }
        return true;
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

    @Override // java.lang.Iterable
    @fg.l
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public u0 iterator() {
        return new k(this.first, this.last, this.step);
    }

    @fg.l
    public String toString() {
        StringBuilder sb;
        int i4;
        int i5 = this.step;
        String s4 = ProtectedSandApp.s("旛\u0001");
        if (i5 > 0) {
            sb = new StringBuilder();
            sb.append(this.first);
            sb.append(ProtectedSandApp.s("旜\u0001"));
            sb.append(this.last);
            sb.append(s4);
            i4 = this.step;
        } else {
            sb = new StringBuilder();
            sb.append(this.first);
            sb.append(ProtectedSandApp.s("旝\u0001"));
            sb.append(this.last);
            sb.append(s4);
            i4 = -this.step;
        }
        sb.append(i4);
        return sb.toString();
    }
}
