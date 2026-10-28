package kotlin.sequences;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.WasExperimental;
import kotlin.jvm.internal.l0;

/* compiled from: _USequences.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0019\u0010\u0000\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\u0005¨\u0006\f"}, d2 = {"sum", "Lkotlin/UInt;", "Lkotlin/sequences/Sequence;", "Lkotlin/UByte;", "sumOfUByte", "(Lkotlin/sequences/Sequence;)I", "sumOfUInt", "Lkotlin/ULong;", "sumOfULong", "(Lkotlin/sequences/Sequence;)J", "Lkotlin/UShort;", "sumOfUShort", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/sequences/USequencesKt")
/* loaded from: classes5.dex */
class c0 {
    @p3.i(name = "sumOfUByte")
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int a(@d5.d Sequence<UByte> sequence) {
        l0.p(sequence, ProtectedSandApp.s("娒"));
        Iterator<UByte> it = sequence.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 += UInt.r(it.next().getF27223o() & UByte.f27220r);
        }
        return i5;
    }

    @p3.i(name = "sumOfUInt")
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int b(@d5.d Sequence<UInt> sequence) {
        l0.p(sequence, ProtectedSandApp.s("娓"));
        Iterator<UInt> it = sequence.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 += it.next().getF27240o();
        }
        return i5;
    }

    @p3.i(name = "sumOfULong")
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long c(@d5.d Sequence<ULong> sequence) {
        l0.p(sequence, ProtectedSandApp.s("娔"));
        Iterator<ULong> it = sequence.iterator();
        long j5 = 0;
        while (it.hasNext()) {
            j5 += it.next().getF23071o();
        }
        return j5;
    }

    @p3.i(name = "sumOfUShort")
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int d(@d5.d Sequence<UShort> sequence) {
        l0.p(sequence, ProtectedSandApp.s("娕"));
        Iterator<UShort> it = sequence.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 += UInt.r(it.next().getF23343o() & UShort.f23340r);
        }
        return i5;
    }
}
