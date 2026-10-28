package kotlin.ranges;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Progressions.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0016\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0014¨\u0006%"}, d2 = {"Lkotlin/ranges/a;", "", "", "start", "endInclusive", "", "step", "<init>", "(CCI)V", "Lkotlin/collections/v;", "p", "()Lkotlin/collections/v;", "", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "C", "j", "()C", "first", "c", "l", "last", "d", "I", "m", "e", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public class a implements Iterable<Character>, md.a {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final char first;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final char last;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int step;

    /* compiled from: Progressions.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/ranges/a$a;", "", "<init>", "()V", "", "rangeStart", "rangeEnd", "", "step", "Lkotlin/ranges/a;", "a", "(CCI)Lkotlin/ranges/a;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.ranges.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final a a(char rangeStart, char rangeEnd, int step) {
            return new a(rangeStart, rangeEnd, step);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public a(char c5, char c6, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("旀\u0001"));
        }
        if (i4 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException(ProtectedSandApp.s("斿\u0001"));
        }
        this.first = c5;
        this.last = (char) kotlin.internal.n.c(c5, c6, i4);
        this.step = i4;
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof a) {
            if (!isEmpty() || !((a) other).isEmpty()) {
                a aVar = (a) other;
                if (this.first != aVar.first || this.last != aVar.last || this.step != aVar.step) {
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
            if (l0.t(this.first, this.last) <= 0) {
                return false;
            }
        } else if (l0.t(this.first, this.last) >= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: j, reason: from getter */
    public final char getFirst() {
        return this.first;
    }

    /* renamed from: l, reason: from getter */
    public final char getLast() {
        return this.last;
    }

    /* renamed from: m, reason: from getter */
    public final int getStep() {
        return this.step;
    }

    @Override // java.lang.Iterable
    @fg.l
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public kotlin.collections.v iterator() {
        return new b(this.first, this.last, this.step);
    }

    @fg.l
    public String toString() {
        StringBuilder sb;
        int i4;
        int i5 = this.step;
        String s4 = ProtectedSandApp.s("旁\u0001");
        if (i5 > 0) {
            sb = new StringBuilder();
            sb.append(this.first);
            sb.append(ProtectedSandApp.s("旂\u0001"));
            sb.append(this.last);
            sb.append(s4);
            i4 = this.step;
        } else {
            sb = new StringBuilder();
            sb.append(this.first);
            sb.append(ProtectedSandApp.s("旃\u0001"));
            sb.append(this.last);
            sb.append(s4);
            i4 = -this.step;
        }
        sb.append(i4);
        return sb.toString();
    }
}
