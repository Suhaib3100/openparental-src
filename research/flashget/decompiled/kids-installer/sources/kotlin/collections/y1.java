package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.WasExperimental;

/* compiled from: _UCollections.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0019\u0010\u0000\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\u0005\u001a\u0017\u0010\f\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007¢\u0006\u0002\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0007¢\u0006\u0002\u0010\u0015\u001a\u0017\u0010\u0016\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\n0\u000eH\u0007¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"sum", "Lkotlin/UInt;", "", "Lkotlin/UByte;", "sumOfUByte", "(Ljava/lang/Iterable;)I", "sumOfUInt", "Lkotlin/ULong;", "sumOfULong", "(Ljava/lang/Iterable;)J", "Lkotlin/UShort;", "sumOfUShort", "toUByteArray", "Lkotlin/UByteArray;", "", "(Ljava/util/Collection;)[B", "toUIntArray", "Lkotlin/UIntArray;", "(Ljava/util/Collection;)[I", "toULongArray", "Lkotlin/ULongArray;", "(Ljava/util/Collection;)[J", "toUShortArray", "Lkotlin/UShortArray;", "(Ljava/util/Collection;)[S", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/UCollectionsKt")
/* loaded from: classes5.dex */
class y1 {
    @p3.i(name = "sumOfUByte")
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int a(@d5.d Iterable<UByte> iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("㸌"));
        Iterator<UByte> it = iterable.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 += UInt.r(it.next().getF27223o() & UByte.f27220r);
        }
        return i5;
    }

    @p3.i(name = "sumOfUInt")
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int b(@d5.d Iterable<UInt> iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("㸍"));
        Iterator<UInt> it = iterable.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 += it.next().getF27240o();
        }
        return i5;
    }

    @p3.i(name = "sumOfULong")
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long c(@d5.d Iterable<ULong> iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("㸎"));
        Iterator<ULong> it = iterable.iterator();
        long j5 = 0;
        while (it.hasNext()) {
            j5 += it.next().getF23071o();
        }
        return j5;
    }

    @p3.i(name = "sumOfUShort")
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int d(@d5.d Iterable<UShort> iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("㸏"));
        Iterator<UShort> it = iterable.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 += UInt.r(it.next().getF23343o() & UShort.f23340r);
        }
        return i5;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @d5.d
    public static final byte[] e(@d5.d Collection<UByte> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("㸐"));
        byte[] g5 = UByteArray.g(collection.size());
        Iterator<UByte> it = collection.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            g5[i5] = it.next().getF27223o();
            i5++;
        }
        return g5;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @d5.d
    public static final int[] f(@d5.d Collection<UInt> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("㸑"));
        int[] g5 = UIntArray.g(collection.size());
        Iterator<UInt> it = collection.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            g5[i5] = it.next().getF27240o();
            i5++;
        }
        return g5;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @d5.d
    public static final long[] g(@d5.d Collection<ULong> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("㸒"));
        long[] g5 = ULongArray.g(collection.size());
        Iterator<ULong> it = collection.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            g5[i5] = it.next().getF23071o();
            i5++;
        }
        return g5;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @d5.d
    public static final short[] h(@d5.d Collection<UShort> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("㸓"));
        short[] g5 = UShortArray.g(collection.size());
        Iterator<UShort> it = collection.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            g5[i5] = it.next().getF23343o();
            i5++;
        }
        return g5;
    }
}
