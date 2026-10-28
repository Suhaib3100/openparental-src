package kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;

/* compiled from: NumbersJVM.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0005\u001a\u00020\t*\u00020\n2\u0006\u0010\b\u001a\u00020\u0001H\u0087\b\u001a\r\u0010\u000b\u001a\u00020\f*\u00020\u0006H\u0087\b\u001a\r\u0010\u000b\u001a\u00020\f*\u00020\tH\u0087\b\u001a\r\u0010\r\u001a\u00020\f*\u00020\u0006H\u0087\b\u001a\r\u0010\r\u001a\u00020\f*\u00020\tH\u0087\b\u001a\r\u0010\u000e\u001a\u00020\f*\u00020\u0006H\u0087\b\u001a\r\u0010\u000e\u001a\u00020\f*\u00020\tH\u0087\b\u001a\u0015\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0001H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\u0013\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010\u0013\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u0002*\u00020\u0006H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u0001*\u00020\tH\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u0002*\u00020\u0006H\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u0001*\u00020\tH\u0087\b¨\u0006\u0016"}, d2 = {"countLeadingZeroBits", "", "", "countOneBits", "countTrailingZeroBits", "fromBits", "", "Lkotlin/Double$Companion;", "bits", "", "Lkotlin/Float$Companion;", "isFinite", "", "isInfinite", "isNaN", "rotateLeft", "bitCount", "rotateRight", "takeHighestOneBit", "takeLowestOneBit", "toBits", "toRawBits", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: classes6.dex */
class l0 extends k0 {
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float A0(FloatCompanionObject floatCompanionObject, int i5) {
        kotlin.jvm.internal.l0.p(floatCompanionObject, ProtectedSandApp.s("緇"));
        return Float.intBitsToFloat(i5);
    }

    @InlineOnly
    private static final boolean B0(double d6) {
        return (Double.isInfinite(d6) || Double.isNaN(d6)) ? false : true;
    }

    @InlineOnly
    private static final boolean C0(float f6) {
        return (Float.isInfinite(f6) || Float.isNaN(f6)) ? false : true;
    }

    @InlineOnly
    private static final boolean D0(double d6) {
        return Double.isInfinite(d6);
    }

    @InlineOnly
    private static final boolean E0(float f6) {
        return Float.isInfinite(f6);
    }

    @InlineOnly
    private static final boolean F0(double d6) {
        return Double.isNaN(d6);
    }

    @InlineOnly
    private static final boolean G0(float f6) {
        return Float.isNaN(f6);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int H0(int i5, int i6) {
        return Integer.rotateLeft(i5, i6);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final long I0(long j5, int i5) {
        return Long.rotateLeft(j5, i5);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int J0(int i5, int i6) {
        return Integer.rotateRight(i5, i6);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final long K0(long j5, int i5) {
        return Long.rotateRight(j5, i5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int L0(int i5) {
        return Integer.highestOneBit(i5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final long M0(long j5) {
        return Long.highestOneBit(j5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int N0(int i5) {
        return Integer.lowestOneBit(i5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final long O0(long j5) {
        return Long.lowestOneBit(j5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int P0(float f6) {
        return Float.floatToIntBits(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long Q0(double d6) {
        return Double.doubleToLongBits(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int R0(float f6) {
        return Float.floatToRawIntBits(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long S0(double d6) {
        return Double.doubleToRawLongBits(d6);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int t0(int i5) {
        return Integer.numberOfLeadingZeros(i5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int u0(long j5) {
        return Long.numberOfLeadingZeros(j5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int v0(int i5) {
        return Integer.bitCount(i5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int w0(long j5) {
        return Long.bitCount(j5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int x0(int i5) {
        return Integer.numberOfTrailingZeros(i5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int y0(long j5) {
        return Long.numberOfTrailingZeros(j5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double z0(DoubleCompanionObject doubleCompanionObject, long j5) {
        kotlin.jvm.internal.l0.p(doubleCompanionObject, ProtectedSandApp.s("緈"));
        return Double.longBitsToDouble(j5);
    }
}
