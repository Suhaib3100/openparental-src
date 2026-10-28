package kotlin.ranges;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.NoSuchElementException;
import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.l0;
import kotlin.p2;
import kotlin.random.Random;
import kotlin.ranges.UIntProgression;
import kotlin.ranges.ULongProgression;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _URanges.kt */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\n\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0000\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u0000\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u0000\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\u0004\u001a\u001b\u0010\u000e\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0007\u001a\u001b\u0010\u000e\u001a\u00020\b*\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0012\u0010\n\u001a\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\r\u001a#\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a!\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a#\u0010\u0014\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a!\u0010\u0014\u001a\u00020\b*\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH\u0007¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010\u0014\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b!\u0010\"\u001a\u001c\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b'\u0010(\u001a\u001c\u0010#\u001a\u00020$*\u00020%2\b\u0010)\u001a\u0004\u0018\u00010\u0005H\u0087\n¢\u0006\u0002\b*\u001a\u001c\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\bH\u0087\u0002¢\u0006\u0004\b+\u0010,\u001a\u001c\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u000bH\u0087\u0002¢\u0006\u0004\b-\u0010.\u001a\u001c\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b0\u00101\u001a\u001c\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0004\b2\u00103\u001a\u001c\u0010#\u001a\u00020$*\u00020/2\b\u0010)\u001a\u0004\u0018\u00010\bH\u0087\n¢\u0006\u0002\b4\u001a\u001c\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u000bH\u0087\u0002¢\u0006\u0004\b5\u00106\u001a\u001c\u00107\u001a\u000208*\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\b:\u0010;\u001a\u001c\u00107\u001a\u000208*\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0087\u0004¢\u0006\u0004\b<\u0010=\u001a\u001c\u00107\u001a\u00020>*\u00020\b2\u0006\u00109\u001a\u00020\bH\u0087\u0004¢\u0006\u0004\b?\u0010@\u001a\u001c\u00107\u001a\u000208*\u00020\u000b2\u0006\u00109\u001a\u00020\u000bH\u0087\u0004¢\u0006\u0004\bA\u0010B\u001a\u0011\u0010C\u001a\u00020\u0005*\u000208H\u0007¢\u0006\u0002\u0010D\u001a\u0011\u0010C\u001a\u00020\b*\u00020>H\u0007¢\u0006\u0002\u0010E\u001a\u000e\u0010F\u001a\u0004\u0018\u00010\u0005*\u000208H\u0007\u001a\u000e\u0010F\u001a\u0004\u0018\u00010\b*\u00020>H\u0007\u001a\u0011\u0010G\u001a\u00020\u0005*\u000208H\u0007¢\u0006\u0002\u0010D\u001a\u0011\u0010G\u001a\u00020\b*\u00020>H\u0007¢\u0006\u0002\u0010E\u001a\u000e\u0010H\u001a\u0004\u0018\u00010\u0005*\u000208H\u0007\u001a\u000e\u0010H\u001a\u0004\u0018\u00010\b*\u00020>H\u0007\u001a\u0012\u0010I\u001a\u00020\u0005*\u00020%H\u0087\b¢\u0006\u0002\u0010J\u001a\u0019\u0010I\u001a\u00020\u0005*\u00020%2\u0006\u0010I\u001a\u00020KH\u0007¢\u0006\u0002\u0010L\u001a\u0012\u0010I\u001a\u00020\b*\u00020/H\u0087\b¢\u0006\u0002\u0010M\u001a\u0019\u0010I\u001a\u00020\b*\u00020/2\u0006\u0010I\u001a\u00020KH\u0007¢\u0006\u0002\u0010N\u001a\u000f\u0010O\u001a\u0004\u0018\u00010\u0005*\u00020%H\u0087\b\u001a\u0016\u0010O\u001a\u0004\u0018\u00010\u0005*\u00020%2\u0006\u0010I\u001a\u00020KH\u0007\u001a\u000f\u0010O\u001a\u0004\u0018\u00010\b*\u00020/H\u0087\b\u001a\u0016\u0010O\u001a\u0004\u0018\u00010\b*\u00020/2\u0006\u0010I\u001a\u00020KH\u0007\u001a\f\u0010P\u001a\u000208*\u000208H\u0007\u001a\f\u0010P\u001a\u00020>*\u00020>H\u0007\u001a\u0015\u0010Q\u001a\u000208*\u0002082\u0006\u0010Q\u001a\u00020RH\u0087\u0004\u001a\u0015\u0010Q\u001a\u00020>*\u00020>2\u0006\u0010Q\u001a\u00020SH\u0087\u0004\u001a\u001c\u0010T\u001a\u00020%*\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\bU\u0010V\u001a\u001c\u0010T\u001a\u00020%*\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0087\u0004¢\u0006\u0004\bW\u0010X\u001a\u001c\u0010T\u001a\u00020/*\u00020\b2\u0006\u00109\u001a\u00020\bH\u0087\u0004¢\u0006\u0004\bY\u0010Z\u001a\u001c\u0010T\u001a\u00020%*\u00020\u000b2\u0006\u00109\u001a\u00020\u000bH\u0087\u0004¢\u0006\u0004\b[\u0010\\¨\u0006]"}, d2 = {"coerceAtLeast", "Lkotlin/UByte;", "minimumValue", "coerceAtLeast-Kr8caGY", "(BB)B", "Lkotlin/UInt;", "coerceAtLeast-J1ME1BU", "(II)I", "Lkotlin/ULong;", "coerceAtLeast-eb3DHEI", "(JJ)J", "Lkotlin/UShort;", "coerceAtLeast-5PvTz6A", "(SS)S", "coerceAtMost", "maximumValue", "coerceAtMost-Kr8caGY", "coerceAtMost-J1ME1BU", "coerceAtMost-eb3DHEI", "coerceAtMost-5PvTz6A", "coerceIn", "coerceIn-b33U2AM", "(BBB)B", "coerceIn-WZ9TVnA", "(III)I", "range", "Lkotlin/ranges/ClosedRange;", "coerceIn-wuiCnnA", "(ILkotlin/ranges/ClosedRange;)I", "coerceIn-sambcqE", "(JJJ)J", "coerceIn-JPwROB0", "(JLkotlin/ranges/ClosedRange;)J", "coerceIn-VKSA0NQ", "(SSS)S", "contains", "", "Lkotlin/ranges/UIntRange;", "value", "contains-68kG9v0", "(Lkotlin/ranges/UIntRange;B)Z", "element", "contains-biwQdVI", "contains-fz5IDCE", "(Lkotlin/ranges/UIntRange;J)Z", "contains-ZsK3CEQ", "(Lkotlin/ranges/UIntRange;S)Z", "Lkotlin/ranges/ULongRange;", "contains-ULb-yJY", "(Lkotlin/ranges/ULongRange;B)Z", "contains-Gab390E", "(Lkotlin/ranges/ULongRange;I)Z", "contains-GYNo2lE", "contains-uhHAxoY", "(Lkotlin/ranges/ULongRange;S)Z", "downTo", "Lkotlin/ranges/UIntProgression;", "to", "downTo-Kr8caGY", "(BB)Lkotlin/ranges/UIntProgression;", "downTo-J1ME1BU", "(II)Lkotlin/ranges/UIntProgression;", "Lkotlin/ranges/ULongProgression;", "downTo-eb3DHEI", "(JJ)Lkotlin/ranges/ULongProgression;", "downTo-5PvTz6A", "(SS)Lkotlin/ranges/UIntProgression;", "first", "(Lkotlin/ranges/UIntProgression;)I", "(Lkotlin/ranges/ULongProgression;)J", "firstOrNull", "last", "lastOrNull", "random", "(Lkotlin/ranges/UIntRange;)I", "Lkotlin/random/Random;", "(Lkotlin/ranges/UIntRange;Lkotlin/random/Random;)I", "(Lkotlin/ranges/ULongRange;)J", "(Lkotlin/ranges/ULongRange;Lkotlin/random/Random;)J", "randomOrNull", "reversed", "step", "", "", "until", "until-Kr8caGY", "(BB)Lkotlin/ranges/UIntRange;", "until-J1ME1BU", "(II)Lkotlin/ranges/UIntRange;", "until-eb3DHEI", "(JJ)Lkotlin/ranges/ULongRange;", "until-5PvTz6A", "(SS)Lkotlin/ranges/UIntRange;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/ranges/URangesKt")
/* loaded from: classes5.dex */
public class c0 {
    @SinceKotlin(version = "1.7")
    public static final int A(@d5.d UIntProgression uIntProgression) {
        l0.p(uIntProgression, ProtectedSandApp.s("䇩"));
        if (!uIntProgression.isEmpty()) {
            return uIntProgression.getF23748o();
        }
        throw new NoSuchElementException(ProtectedSandApp.s("䇪") + uIntProgression + ProtectedSandApp.s("䇫"));
    }

    @SinceKotlin(version = "1.7")
    public static final long B(@d5.d ULongProgression uLongProgression) {
        l0.p(uLongProgression, ProtectedSandApp.s("䇬"));
        if (!uLongProgression.isEmpty()) {
            return uLongProgression.getF23758o();
        }
        throw new NoSuchElementException(ProtectedSandApp.s("䇭") + uLongProgression + ProtectedSandApp.s("䇮"));
    }

    @SinceKotlin(version = "1.7")
    @d5.e
    public static final UInt C(@d5.d UIntProgression uIntProgression) {
        l0.p(uIntProgression, ProtectedSandApp.s("䇯"));
        if (uIntProgression.isEmpty()) {
            return null;
        }
        return UInt.h(uIntProgression.getF23748o());
    }

    @SinceKotlin(version = "1.7")
    @d5.e
    public static final ULong D(@d5.d ULongProgression uLongProgression) {
        l0.p(uLongProgression, ProtectedSandApp.s("䇰"));
        if (uLongProgression.isEmpty()) {
            return null;
        }
        return ULong.h(uLongProgression.getF23758o());
    }

    @SinceKotlin(version = "1.7")
    public static final int E(@d5.d UIntProgression uIntProgression) {
        l0.p(uIntProgression, ProtectedSandApp.s("䇱"));
        if (!uIntProgression.isEmpty()) {
            return uIntProgression.getF23749p();
        }
        throw new NoSuchElementException(ProtectedSandApp.s("䇲") + uIntProgression + ProtectedSandApp.s("䇳"));
    }

    @SinceKotlin(version = "1.7")
    public static final long F(@d5.d ULongProgression uLongProgression) {
        l0.p(uLongProgression, ProtectedSandApp.s("䇴"));
        if (!uLongProgression.isEmpty()) {
            return uLongProgression.getF23759p();
        }
        throw new NoSuchElementException(ProtectedSandApp.s("䇵") + uLongProgression + ProtectedSandApp.s("䇶"));
    }

    @SinceKotlin(version = "1.7")
    @d5.e
    public static final UInt G(@d5.d UIntProgression uIntProgression) {
        l0.p(uIntProgression, ProtectedSandApp.s("䇷"));
        if (uIntProgression.isEmpty()) {
            return null;
        }
        return UInt.h(uIntProgression.getF23749p());
    }

    @SinceKotlin(version = "1.7")
    @d5.e
    public static final ULong H(@d5.d ULongProgression uLongProgression) {
        l0.p(uLongProgression, ProtectedSandApp.s("䇸"));
        if (uLongProgression.isEmpty()) {
            return null;
        }
        return ULong.h(uLongProgression.getF23759p());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final int I(UIntRange uIntRange) {
        l0.p(uIntRange, ProtectedSandApp.s("䇹"));
        return J(uIntRange, Random.f23691o);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int J(@d5.d UIntRange uIntRange, @d5.d Random random) {
        l0.p(uIntRange, ProtectedSandApp.s("䇺"));
        l0.p(random, ProtectedSandApp.s("䇻"));
        try {
            return kotlin.random.h.h(random, uIntRange);
        } catch (IllegalArgumentException e6) {
            throw new NoSuchElementException(e6.getMessage());
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final long K(ULongRange uLongRange) {
        l0.p(uLongRange, ProtectedSandApp.s("䇼"));
        return L(uLongRange, Random.f23691o);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long L(@d5.d ULongRange uLongRange, @d5.d Random random) {
        l0.p(uLongRange, ProtectedSandApp.s("䇽"));
        l0.p(random, ProtectedSandApp.s("䇾"));
        try {
            return kotlin.random.h.l(random, uLongRange);
        } catch (IllegalArgumentException e6) {
            throw new NoSuchElementException(e6.getMessage());
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final UInt M(UIntRange uIntRange) {
        l0.p(uIntRange, ProtectedSandApp.s("䇿"));
        return N(uIntRange, Random.f23691o);
    }

    @SinceKotlin(version = "1.5")
    @d5.e
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    public static final UInt N(@d5.d UIntRange uIntRange, @d5.d Random random) {
        l0.p(uIntRange, ProtectedSandApp.s("䈀"));
        l0.p(random, ProtectedSandApp.s("䈁"));
        if (uIntRange.isEmpty()) {
            return null;
        }
        return UInt.h(kotlin.random.h.h(random, uIntRange));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final ULong O(ULongRange uLongRange) {
        l0.p(uLongRange, ProtectedSandApp.s("䈂"));
        return P(uLongRange, Random.f23691o);
    }

    @SinceKotlin(version = "1.5")
    @d5.e
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    public static final ULong P(@d5.d ULongRange uLongRange, @d5.d Random random) {
        l0.p(uLongRange, ProtectedSandApp.s("䈃"));
        l0.p(random, ProtectedSandApp.s("䈄"));
        if (uLongRange.isEmpty()) {
            return null;
        }
        return ULong.h(kotlin.random.h.l(random, uLongRange));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @d5.d
    public static final UIntProgression Q(@d5.d UIntProgression uIntProgression) {
        l0.p(uIntProgression, ProtectedSandApp.s("䈅"));
        return UIntProgression.f23747r.a(uIntProgression.getF23749p(), uIntProgression.getF23748o(), -uIntProgression.getF23750q());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @d5.d
    public static final ULongProgression R(@d5.d ULongProgression uLongProgression) {
        l0.p(uLongProgression, ProtectedSandApp.s("䈆"));
        return ULongProgression.f23757r.a(uLongProgression.getF23759p(), uLongProgression.getF23758o(), -uLongProgression.getF23760q());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @d5.d
    public static final UIntProgression S(@d5.d UIntProgression uIntProgression, int i5) {
        l0.p(uIntProgression, ProtectedSandApp.s("䈇"));
        t.a(i5 > 0, Integer.valueOf(i5));
        UIntProgression.a aVar = UIntProgression.f23747r;
        int f23748o = uIntProgression.getF23748o();
        int f23749p = uIntProgression.getF23749p();
        if (uIntProgression.getF23750q() <= 0) {
            i5 = -i5;
        }
        return aVar.a(f23748o, f23749p, i5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @d5.d
    public static final ULongProgression T(@d5.d ULongProgression uLongProgression, long j5) {
        l0.p(uLongProgression, ProtectedSandApp.s("䈈"));
        t.a(j5 > 0, Long.valueOf(j5));
        ULongProgression.a aVar = ULongProgression.f23757r;
        long f23758o = uLongProgression.getF23758o();
        long f23759p = uLongProgression.getF23759p();
        if (uLongProgression.getF23760q() <= 0) {
            j5 = -j5;
        }
        return aVar.a(f23758o, f23759p, j5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @d5.d
    public static final UIntRange U(short s5, short s6) {
        int i5 = s6 & UShort.f23340r;
        if (l0.t(i5, 0) > 0) {
            return new UIntRange(UInt.r(s5 & UShort.f23340r), i5 - 1, null);
        }
        UIntRange.f23755s.getClass();
        return UIntRange.f23756t;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @d5.d
    public static UIntRange V(int i5, int i6) {
        int compare;
        compare = Integer.compare(i6 ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return new UIntRange(i5, UInt.r(i6 - 1), null);
        }
        UIntRange.f23755s.getClass();
        return UIntRange.f23756t;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @d5.d
    public static final UIntRange W(byte b6, byte b7) {
        int i5 = b7 & UByte.f27220r;
        if (l0.t(i5, 0) > 0) {
            return new UIntRange(UInt.r(b6 & UByte.f27220r), i5 - 1, null);
        }
        UIntRange.f23755s.getClass();
        return UIntRange.f23756t;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @d5.d
    public static ULongRange X(long j5, long j6) {
        int compare;
        compare = Long.compare(j6 ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE);
        if (compare > 0) {
            return new ULongRange(j5, j6 - ULong.r(1 & 4294967295L), null);
        }
        ULongRange.f23707s.getClass();
        return ULongRange.f23708t;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final short a(short s5, short s6) {
        return l0.t(s5 & UShort.f23340r, 65535 & s6) < 0 ? s6 : s5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int b(int i5, int i6) {
        int compare;
        compare = Integer.compare(i5 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE);
        return compare < 0 ? i6 : i5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final byte c(byte b6, byte b7) {
        return l0.t(b6 & UByte.f27220r, b7 & UByte.f27220r) < 0 ? b7 : b6;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long d(long j5, long j6) {
        int compare;
        compare = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
        return compare < 0 ? j6 : j5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final short e(short s5, short s6) {
        return l0.t(s5 & UShort.f23340r, 65535 & s6) > 0 ? s6 : s5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int f(int i5, int i6) {
        int compare;
        compare = Integer.compare(i5 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE);
        return compare > 0 ? i6 : i5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final byte g(byte b6, byte b7) {
        return l0.t(b6 & UByte.f27220r, b7 & UByte.f27220r) > 0 ? b7 : b6;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long h(long j5, long j6) {
        int compare;
        compare = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
        return compare > 0 ? j6 : j5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long i(long j5, @d5.d ClosedRange<ULong> closedRange) {
        int compare;
        int compare2;
        l0.p(closedRange, ProtectedSandApp.s("䈉"));
        if (closedRange instanceof ClosedFloatingPointRange) {
            return ((ULong) u.N(ULong.h(j5), (ClosedFloatingPointRange) closedRange)).getF23071o();
        }
        if (closedRange.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("䈊") + closedRange + org.apache.commons.io.k.f32026a);
        }
        compare = Long.compare(j5 ^ Long.MIN_VALUE, closedRange.f().getF23071o() ^ Long.MIN_VALUE);
        if (compare < 0) {
            return closedRange.f().getF23071o();
        }
        compare2 = Long.compare(j5 ^ Long.MIN_VALUE, closedRange.p().getF23071o() ^ Long.MIN_VALUE);
        return compare2 > 0 ? closedRange.p().getF23071o() : j5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final short j(short s5, short s6, short s7) {
        int i5 = s6 & UShort.f23340r;
        int i6 = s7 & UShort.f23340r;
        if (l0.t(i5, i6) <= 0) {
            int i7 = 65535 & s5;
            return l0.t(i7, i5) < 0 ? s6 : l0.t(i7, i6) > 0 ? s7 : s5;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("䈋") + ((Object) UShort.k0(s7)) + ProtectedSandApp.s("䈌") + ((Object) UShort.k0(s6)) + org.apache.commons.io.k.f32026a);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int k(int i5, int i6, int i7) {
        int compare;
        int compare2;
        int compare3;
        compare = Integer.compare(i6 ^ Integer.MIN_VALUE, i7 ^ Integer.MIN_VALUE);
        if (compare <= 0) {
            compare2 = Integer.compare(i5 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE);
            if (compare2 < 0) {
                return i6;
            }
            compare3 = Integer.compare(i5 ^ Integer.MIN_VALUE, i7 ^ Integer.MIN_VALUE);
            return compare3 > 0 ? i7 : i5;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("䈍") + ((Object) UInt.m0(i7)) + ProtectedSandApp.s("䈎") + ((Object) UInt.m0(i6)) + org.apache.commons.io.k.f32026a);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final byte l(byte b6, byte b7, byte b8) {
        int i5 = b7 & UByte.f27220r;
        int i6 = b8 & UByte.f27220r;
        if (l0.t(i5, i6) <= 0) {
            int i7 = b6 & UByte.f27220r;
            return l0.t(i7, i5) < 0 ? b7 : l0.t(i7, i6) > 0 ? b8 : b6;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("䈏") + ((Object) UByte.k0(b8)) + ProtectedSandApp.s("䈐") + ((Object) UByte.k0(b7)) + org.apache.commons.io.k.f32026a);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long m(long j5, long j6, long j7) {
        int compare;
        int compare2;
        int compare3;
        compare = Long.compare(j6 ^ Long.MIN_VALUE, j7 ^ Long.MIN_VALUE);
        if (compare <= 0) {
            compare2 = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
            if (compare2 < 0) {
                return j6;
            }
            compare3 = Long.compare(j5 ^ Long.MIN_VALUE, j7 ^ Long.MIN_VALUE);
            return compare3 > 0 ? j7 : j5;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("䈑") + ((Object) ULong.m0(j7)) + ProtectedSandApp.s("䈒") + ((Object) p2.k(j6)) + org.apache.commons.io.k.f32026a);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int n(int i5, @d5.d ClosedRange<UInt> closedRange) {
        int compare;
        int compare2;
        l0.p(closedRange, ProtectedSandApp.s("䈓"));
        if (closedRange instanceof ClosedFloatingPointRange) {
            return ((UInt) u.N(UInt.h(i5), (ClosedFloatingPointRange) closedRange)).getF27240o();
        }
        if (closedRange.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("䈔") + closedRange + org.apache.commons.io.k.f32026a);
        }
        compare = Integer.compare(i5 ^ Integer.MIN_VALUE, closedRange.f().getF27240o() ^ Integer.MIN_VALUE);
        if (compare < 0) {
            return closedRange.f().getF27240o();
        }
        compare2 = Integer.compare(i5 ^ Integer.MIN_VALUE, closedRange.p().getF27240o() ^ Integer.MIN_VALUE);
        return compare2 > 0 ? closedRange.p().getF27240o() : i5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final boolean o(@d5.d UIntRange uIntRange, byte b6) {
        l0.p(uIntRange, ProtectedSandApp.s("䈕"));
        return uIntRange.u(UInt.r(b6 & UByte.f27220r));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final boolean p(ULongRange uLongRange, ULong uLong) {
        l0.p(uLongRange, ProtectedSandApp.s("䈖"));
        return uLong != null && uLongRange.u(uLong.getF23071o());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final boolean q(@d5.d ULongRange uLongRange, int i5) {
        l0.p(uLongRange, ProtectedSandApp.s("䈗"));
        return uLongRange.u(ULong.r(i5 & 4294967295L));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final boolean r(@d5.d ULongRange uLongRange, byte b6) {
        l0.p(uLongRange, ProtectedSandApp.s("䈘"));
        return uLongRange.u(ULong.r(b6 & 255));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final boolean s(@d5.d UIntRange uIntRange, short s5) {
        l0.p(uIntRange, ProtectedSandApp.s("䈙"));
        return uIntRange.u(UInt.r(s5 & UShort.f23340r));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final boolean t(UIntRange uIntRange, UInt uInt) {
        l0.p(uIntRange, ProtectedSandApp.s("䈚"));
        return uInt != null && uIntRange.u(uInt.getF27240o());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final boolean u(@d5.d UIntRange uIntRange, long j5) {
        l0.p(uIntRange, ProtectedSandApp.s("䈛"));
        return ULong.r(j5 >>> 32) == 0 && uIntRange.u(UInt.r((int) j5));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final boolean v(@d5.d ULongRange uLongRange, short s5) {
        l0.p(uLongRange, ProtectedSandApp.s("䈜"));
        return uLongRange.u(ULong.r(s5 & okhttp3.internal.ws.g.f31429s));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @d5.d
    public static final UIntProgression w(short s5, short s6) {
        return UIntProgression.f23747r.a(UInt.r(s5 & UShort.f23340r), s6 & UShort.f23340r, -1);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @d5.d
    public static final UIntProgression x(int i5, int i6) {
        return UIntProgression.f23747r.a(i5, i6, -1);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @d5.d
    public static final UIntProgression y(byte b6, byte b7) {
        return UIntProgression.f23747r.a(UInt.r(b6 & UByte.f27220r), b7 & UByte.f27220r, -1);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @d5.d
    public static final ULongProgression z(long j5, long j6) {
        return ULongProgression.f23757r.a(j5, j6, -1L);
    }
}
