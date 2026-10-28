package kotlin.ranges;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.WasExperimental;

/* compiled from: UIntRange.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0086\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0016\u0010\b\u001a\u00020\u0002ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u0002ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u0082\u0002\u0004\n\u0002\b!¨\u0006\u001a"}, d2 = {"Lkotlin/ranges/UIntProgression;", "", "Lkotlin/UInt;", "start", "endInclusive", "step", "", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "first", "getFirst-pVg5ArA", "()I", "I", "last", "getLast-pVg5ArA", "getStep", "equals", "", "other", "", "hashCode", "isEmpty", "iterator", "", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* renamed from: kotlin.ranges.v, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public class UIntProgression implements Iterable<UInt>, r3.a {

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    public static final a f23747r = new a(null);

    /* renamed from: o, reason: collision with root package name */
    private final int f23748o;

    /* renamed from: p, reason: collision with root package name */
    private final int f23749p;

    /* renamed from: q, reason: collision with root package name */
    private final int f23750q;

    /* compiled from: UIntRange.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/ranges/UIntProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/UIntProgression;", "rangeStart", "Lkotlin/UInt;", "rangeEnd", "step", "", "fromClosedRange-Nkh28Cs", "(III)Lkotlin/ranges/UIntProgression;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.ranges.v$a */
    public static final class a {
        private a() {
        }

        @d5.d
        public final UIntProgression a(int i5, int i6, int i7) {
            return new UIntProgression(i5, i6, i7, null);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ UIntProgression(int i5, int i6, int i7, kotlin.jvm.internal.w wVar) {
        this(i5, i6, i7);
    }

    public boolean equals(@d5.e Object other) {
        if (other instanceof UIntProgression) {
            if (!isEmpty() || !((UIntProgression) other).isEmpty()) {
                UIntProgression uIntProgression = (UIntProgression) other;
                if (this.f23748o != uIntProgression.f23748o || this.f23749p != uIntProgression.f23749p || this.f23750q != uIntProgression.f23750q) {
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
        return (((this.f23748o * 31) + this.f23749p) * 31) + this.f23750q;
    }

    public boolean isEmpty() {
        int compare;
        int compare2;
        if (this.f23750q > 0) {
            compare2 = Integer.compare(this.f23748o ^ Integer.MIN_VALUE, this.f23749p ^ Integer.MIN_VALUE);
            if (compare2 > 0) {
                return true;
            }
        } else {
            compare = Integer.compare(this.f23748o ^ Integer.MIN_VALUE, this.f23749p ^ Integer.MIN_VALUE);
            if (compare < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    @d5.d
    public final Iterator<UInt> iterator() {
        return new UIntProgressionIterator(this.f23748o, this.f23749p, this.f23750q, null);
    }

    /* renamed from: q, reason: from getter */
    public final int getF23748o() {
        return this.f23748o;
    }

    /* renamed from: r, reason: from getter */
    public final int getF23749p() {
        return this.f23749p;
    }

    /* renamed from: s, reason: from getter */
    public final int getF23750q() {
        return this.f23750q;
    }

    @d5.d
    public String toString() {
        StringBuilder sb;
        int i5;
        int i6 = this.f23750q;
        String s5 = ProtectedSandApp.s("䊽");
        if (i6 > 0) {
            sb = new StringBuilder();
            sb.append((Object) UInt.m0(this.f23748o));
            sb.append(ProtectedSandApp.s("䊾"));
            sb.append((Object) UInt.m0(this.f23749p));
            sb.append(s5);
            i5 = this.f23750q;
        } else {
            sb = new StringBuilder();
            sb.append((Object) UInt.m0(this.f23748o));
            sb.append(ProtectedSandApp.s("䊿"));
            sb.append((Object) UInt.m0(this.f23749p));
            sb.append(s5);
            i5 = -this.f23750q;
        }
        sb.append(i5);
        return sb.toString();
    }

    private UIntProgression(int i5, int i6, int i7) {
        if (i7 == 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("䊼"));
        }
        if (i7 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException(ProtectedSandApp.s("䊻"));
        }
        this.f23748o = i5;
        this.f23749p = kotlin.internal.r.d(i5, i6, i7);
        this.f23750q = i7;
    }
}
