package kotlin.ranges;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Deprecated;
import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.WasExperimental;
import kotlin.p2;

/* compiled from: ULongRange.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001cB\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u001d\u0010\b\u001a\u00020\u00038VX\u0097\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f\u0082\u0002\u0004\n\u0002\b!¨\u0006\u001d"}, d2 = {"Lkotlin/ranges/ULongRange;", "Lkotlin/ranges/ULongProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/ULong;", "Lkotlin/ranges/OpenEndRange;", "start", "endInclusive", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "endExclusive", "getEndExclusive-s-VKNKU$annotations", "()V", "getEndExclusive-s-VKNKU", "()J", "getEndInclusive-s-VKNKU", "getStart-s-VKNKU", "contains", "", "value", "contains-VKZWuLQ", "(J)Z", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* renamed from: kotlin.ranges.a0, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
public final class ULongRange extends ULongProgression implements ClosedRange<ULong>, OpenEndRange<ULong> {

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    public static final a f23707s = new a(null);

    /* renamed from: t, reason: collision with root package name */
    @d5.d
    private static final ULongRange f23708t = new ULongRange(-1, 0);

    /* compiled from: ULongRange.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/ULongRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/ULongRange;", "getEMPTY", "()Lkotlin/ranges/ULongRange;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.ranges.a0$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        @d5.d
        public final ULongRange a() {
            return ULongRange.f23708t;
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ ULongRange(long j5, long j6, kotlin.jvm.internal.w wVar) {
        this(j5, j6);
    }

    @SinceKotlin(version = "1.9")
    @Deprecated(message = "Can throw an exception when it's impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static /* synthetic */ void x() {
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean b(ULong uLong) {
        return u(uLong.getF23071o());
    }

    @Override // kotlin.ranges.ULongProgression
    public boolean equals(@d5.e Object other) {
        if (other instanceof ULongRange) {
            if (!isEmpty() || !((ULongRange) other).isEmpty()) {
                ULongRange uLongRange = (ULongRange) other;
                if (getF23758o() != uLongRange.getF23758o() || getF23759p() != uLongRange.getF23759p()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.ClosedRange
    public ULong f() {
        return ULong.h(getF23758o());
    }

    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ ULong h() {
        return ULong.h(v());
    }

    @Override // kotlin.ranges.ULongProgression
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((int) (getF23758o() ^ ULong.r(getF23758o() >>> 32))) * 31) + ((int) (getF23759p() ^ (getF23759p() >>> 32)));
    }

    @Override // kotlin.ranges.ULongProgression, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        int compare;
        compare = Long.compare(getF23758o() ^ Long.MIN_VALUE, getF23759p() ^ Long.MIN_VALUE);
        return compare > 0;
    }

    @Override // kotlin.ranges.ClosedRange
    public ULong p() {
        return ULong.h(getF23759p());
    }

    @Override // kotlin.ranges.ULongProgression
    @d5.d
    public String toString() {
        return ((Object) ULong.m0(getF23758o())) + ProtectedSandApp.s("罪") + ((Object) p2.k(getF23759p()));
    }

    public boolean u(long j5) {
        int compare;
        int compare2;
        compare = Long.compare(getF23758o() ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
        if (compare <= 0) {
            compare2 = Long.compare(j5 ^ Long.MIN_VALUE, getF23759p() ^ Long.MIN_VALUE);
            if (compare2 <= 0) {
                return true;
            }
        }
        return false;
    }

    public long v() {
        if (getF23759p() == -1) {
            throw new IllegalStateException(ProtectedSandApp.s("罫").toString());
        }
        return ULong.r(1 & 4294967295L) + getF23759p();
    }

    public long y() {
        return getF23759p();
    }

    public long z() {
        return getF23758o();
    }

    private ULongRange(long j5, long j6) {
        super(j5, j6, 1L, null);
    }
}
