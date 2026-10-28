package kotlin.ranges;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.collections.CharIterator;
import kotlin.jvm.internal.l0;

/* compiled from: Progressions.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\t\u0010\u0015\u001a\u00020\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lkotlin/ranges/CharProgression;", "", "", "start", "endInclusive", "step", "", "(CCI)V", "first", "getFirst", "()C", "last", "getLast", "getStep", "()I", "equals", "", "other", "", "hashCode", "isEmpty", "iterator", "Lkotlin/collections/CharIterator;", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.ranges.a, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public class CharProgression implements Iterable<Character>, r3.a {

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    public static final a f23703r = new a(null);

    /* renamed from: o, reason: collision with root package name */
    private final char f23704o;

    /* renamed from: p, reason: collision with root package name */
    private final char f23705p;

    /* renamed from: q, reason: collision with root package name */
    private final int f23706q;

    /* compiled from: Progressions.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lkotlin/ranges/CharProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/CharProgression;", "rangeStart", "", "rangeEnd", "step", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.ranges.a$a */
    public static final class a {
        private a() {
        }

        @d5.d
        public final CharProgression a(char c6, char c7, int i5) {
            return new CharProgression(c6, c7, i5);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public CharProgression(char c6, char c7, int i5) {
        if (i5 == 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("䇥"));
        }
        if (i5 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException(ProtectedSandApp.s("䇤"));
        }
        this.f23704o = c6;
        this.f23705p = (char) kotlin.internal.n.c(c6, c7, i5);
        this.f23706q = i5;
    }

    public boolean equals(@d5.e Object other) {
        if (other instanceof CharProgression) {
            if (!isEmpty() || !((CharProgression) other).isEmpty()) {
                CharProgression charProgression = (CharProgression) other;
                if (this.f23704o != charProgression.f23704o || this.f23705p != charProgression.f23705p || this.f23706q != charProgression.f23706q) {
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
        return (((this.f23704o * 31) + this.f23705p) * 31) + this.f23706q;
    }

    public boolean isEmpty() {
        if (this.f23706q > 0) {
            if (l0.t(this.f23704o, this.f23705p) > 0) {
                return true;
            }
        } else if (l0.t(this.f23704o, this.f23705p) < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: q, reason: from getter */
    public final char getF23704o() {
        return this.f23704o;
    }

    /* renamed from: r, reason: from getter */
    public final char getF23705p() {
        return this.f23705p;
    }

    /* renamed from: s, reason: from getter */
    public final int getF23706q() {
        return this.f23706q;
    }

    @Override // java.lang.Iterable
    @d5.d
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public CharIterator iterator() {
        return new CharProgressionIterator(this.f23704o, this.f23705p, this.f23706q);
    }

    @d5.d
    public String toString() {
        StringBuilder sb;
        int i5;
        int i6 = this.f23706q;
        String s5 = ProtectedSandApp.s("䇦");
        if (i6 > 0) {
            sb = new StringBuilder();
            sb.append(this.f23704o);
            sb.append(ProtectedSandApp.s("䇧"));
            sb.append(this.f23705p);
            sb.append(s5);
            i5 = this.f23706q;
        } else {
            sb = new StringBuilder();
            sb.append(this.f23704o);
            sb.append(ProtectedSandApp.s("䇨"));
            sb.append(this.f23705p);
            sb.append(s5);
            i5 = -this.f23706q;
        }
        sb.append(i5);
        return sb.toString();
    }
}
