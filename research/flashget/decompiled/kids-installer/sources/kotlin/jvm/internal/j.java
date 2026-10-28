package kotlin.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.collections.BooleanIterator;
import kotlin.collections.ByteIterator;
import kotlin.collections.CharIterator;
import kotlin.collections.DoubleIterator;
import kotlin.collections.FloatIterator;
import kotlin.collections.IntIterator;
import kotlin.collections.LongIterator;
import kotlin.collections.ShortIterator;

/* compiled from: ArrayIterators.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0005\u001a\u000e\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007\u001a\u000e\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\t\u001a\u000e\u0010\u0000\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u000b\u001a\u000e\u0010\u0000\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\r\u001a\u000e\u0010\u0000\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000f\u001a\u000e\u0010\u0000\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0011¨\u0006\u0012"}, d2 = {"iterator", "Lkotlin/collections/BooleanIterator;", "array", "", "Lkotlin/collections/ByteIterator;", "", "Lkotlin/collections/CharIterator;", "", "Lkotlin/collections/DoubleIterator;", "", "Lkotlin/collections/FloatIterator;", "", "Lkotlin/collections/IntIterator;", "", "Lkotlin/collections/LongIterator;", "", "Lkotlin/collections/ShortIterator;", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j {
    @d5.d
    public static final BooleanIterator a(@d5.d boolean[] zArr) {
        l0.p(zArr, ProtectedSandApp.s("䅖"));
        return new ArrayBooleanIterator(zArr);
    }

    @d5.d
    public static final ByteIterator b(@d5.d byte[] bArr) {
        l0.p(bArr, ProtectedSandApp.s("䅗"));
        return new ArrayByteIterator(bArr);
    }

    @d5.d
    public static final CharIterator c(@d5.d char[] cArr) {
        l0.p(cArr, ProtectedSandApp.s("䅘"));
        return new ArrayCharIterator(cArr);
    }

    @d5.d
    public static final DoubleIterator d(@d5.d double[] dArr) {
        l0.p(dArr, ProtectedSandApp.s("䅙"));
        return new ArrayDoubleIterator(dArr);
    }

    @d5.d
    public static final FloatIterator e(@d5.d float[] fArr) {
        l0.p(fArr, ProtectedSandApp.s("䅚"));
        return new ArrayFloatIterator(fArr);
    }

    @d5.d
    public static final IntIterator f(@d5.d int[] iArr) {
        l0.p(iArr, ProtectedSandApp.s("䅛"));
        return new ArrayIntIterator(iArr);
    }

    @d5.d
    public static final LongIterator g(@d5.d long[] jArr) {
        l0.p(jArr, ProtectedSandApp.s("䅜"));
        return new ArrayLongIterator(jArr);
    }

    @d5.d
    public static final ShortIterator h(@d5.d short[] sArr) {
        l0.p(sArr, ProtectedSandApp.s("䅝"));
        return new ArrayShortIterator(sArr);
    }
}
