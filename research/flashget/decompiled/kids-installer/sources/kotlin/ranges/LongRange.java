package kotlin.ranges;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Deprecated;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;

/* compiled from: PrimitiveRanges.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001aB\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002J\u0013\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u001a\u0010\b\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, d2 = {"Lkotlin/ranges/LongRange;", "Lkotlin/ranges/LongProgression;", "Lkotlin/ranges/ClosedRange;", "", "Lkotlin/ranges/OpenEndRange;", "start", "endInclusive", "(JJ)V", "endExclusive", "getEndExclusive$annotations", "()V", "getEndExclusive", "()Ljava/lang/Long;", "getEndInclusive", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.ranges.o, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
public final class LongRange extends LongProgression implements ClosedRange<Long>, OpenEndRange<Long> {

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    public static final a f23741s = new a(null);

    /* renamed from: t, reason: collision with root package name */
    @d5.d
    private static final LongRange f23742t = new LongRange(1, 0);

    /* compiled from: PrimitiveRanges.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/LongRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/LongRange;", "getEMPTY", "()Lkotlin/ranges/LongRange;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.ranges.o$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        @d5.d
        public final LongRange a() {
            return LongRange.f23742t;
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public LongRange(long j5, long j6) {
        super(j5, j6, 1L);
    }

    @SinceKotlin(version = "1.9")
    @Deprecated(message = "Can throw an exception when it's impossible to represent the value with Long type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static /* synthetic */ void y() {
    }

    @Override // kotlin.ranges.ClosedRange
    @d5.d
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Long f() {
        return Long.valueOf(getF23734o());
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean b(Long l5) {
        return v(l5.longValue());
    }

    @Override // kotlin.ranges.LongProgression
    public boolean equals(@d5.e Object other) {
        if (other instanceof LongRange) {
            if (!isEmpty() || !((LongRange) other).isEmpty()) {
                LongRange longRange = (LongRange) other;
                if (getF23734o() != longRange.getF23734o() || getF23735p() != longRange.getF23735p()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.LongProgression
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (getF23734o() ^ (getF23734o() >>> 32))) + (getF23735p() ^ (getF23735p() >>> 32)));
    }

    @Override // kotlin.ranges.LongProgression, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return getF23734o() > getF23735p();
    }

    @Override // kotlin.ranges.LongProgression
    @d5.d
    public String toString() {
        return getF23734o() + ProtectedSandApp.s("署") + getF23735p();
    }

    public boolean v(long j5) {
        return getF23734o() <= j5 && j5 <= getF23735p();
    }

    @Override // kotlin.ranges.OpenEndRange
    @d5.d
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Long h() {
        if (getF23735p() != Long.MAX_VALUE) {
            return Long.valueOf(getF23735p() + 1);
        }
        throw new IllegalStateException(ProtectedSandApp.s("罳").toString());
    }

    @Override // kotlin.ranges.ClosedRange
    @d5.d
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Long p() {
        return Long.valueOf(getF23735p());
    }
}
