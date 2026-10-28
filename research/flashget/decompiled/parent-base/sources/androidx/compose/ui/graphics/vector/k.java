package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: PathNode.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b@\u001a;\u0010\n\u001a\u00020\t*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001ap\u0010\u0014\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000728\b\u0004\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00020\u000eH\u0082\b¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016\"\u0014\u0010\u001a\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016\"\u0014\u0010\u001c\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016\"\u0014\u0010\u001e\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0016\"\u0014\u0010 \u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0016\"\u0014\u0010\"\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0016\"\u0014\u0010$\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0016\"\u0014\u0010&\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0016\"\u0014\u0010(\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u0016\"\u0014\u0010*\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u0016\"\u0014\u0010,\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\u0016\"\u0014\u0010.\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\u0016\"\u0014\u00100\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010\u0016\"\u0014\u00102\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010\u0016\"\u0014\u00104\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010\u0016\"\u0014\u00106\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u0010\u0016\"\u0014\u00108\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u0010\u0016\"\u0014\u0010:\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u0010\u0016\"\u0014\u0010<\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b;\u0010\u0016\"\u0014\u0010?\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u0010>\"\u0014\u0010A\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010>\"\u0014\u0010C\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u0010>\"\u0014\u0010E\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010>\"\u0014\u0010G\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u0010>\"\u0014\u0010I\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u0010>\"\u0014\u0010K\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\bJ\u0010>\"\u0014\u0010M\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\bL\u0010>\"\u0014\u0010N\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010>¨\u0006O"}, d2 = {"", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/i;", "Lkotlin/collections/ArrayList;", "nodes", "", "args", "", "count", "Lkotlin/k2;", "a", "(CLjava/util/ArrayList;[FI)V", "", "numArgs", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "subArray", "start", "nodeFor", "b", "(Ljava/util/List;[FIILld/p;)V", "C", "RelativeCloseKey", "CloseKey", "c", "RelativeMoveToKey", "d", "MoveToKey", "e", "RelativeLineToKey", "f", "LineToKey", "g", "RelativeHorizontalToKey", "h", "HorizontalToKey", "i", "RelativeVerticalToKey", "j", "VerticalToKey", "k", "RelativeCurveToKey", "l", "CurveToKey", "m", "RelativeReflectiveCurveToKey", "n", "ReflectiveCurveToKey", "o", "RelativeQuadToKey", "p", "QuadToKey", "q", "RelativeReflectiveQuadToKey", "r", "ReflectiveQuadToKey", "s", "RelativeArcToKey", "t", "ArcToKey", "u", "I", "NUM_MOVE_TO_ARGS", "v", "NUM_LINE_TO_ARGS", "w", "NUM_HORIZONTAL_TO_ARGS", "x", "NUM_VERTICAL_TO_ARGS", "y", "NUM_CURVE_TO_ARGS", "z", "NUM_REFLECTIVE_CURVE_TO_ARGS", "A", "NUM_QUAD_TO_ARGS", "B", "NUM_REFLECTIVE_QUAD_TO_ARGS", "NUM_ARC_TO_ARGS", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPathNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n1#1,400:1\n347#1,15:401\n347#1,15:416\n347#1,15:431\n347#1,15:446\n347#1,15:461\n347#1,15:476\n347#1,15:491\n347#1,15:506\n347#1,15:521\n347#1,15:536\n347#1,15:551\n347#1,15:566\n347#1,15:581\n347#1,15:596\n347#1,15:611\n347#1,15:626\n347#1,15:641\n347#1,15:656\n*S KotlinDebug\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n154#1:401,15\n163#1:416,15\n167#1:431,15\n176#1:446,15\n180#1:461,15\n189#1:476,15\n198#1:491,15\n207#1:506,15\n216#1:521,15\n232#1:536,15\n243#1:551,15\n257#1:566,15\n271#1:581,15\n285#1:596,15\n294#1:611,15\n303#1:626,15\n312#1:641,15\n324#1:656,15\n*E\n"})
/* loaded from: classes.dex */
public final class k {
    private static final int A = 4;
    private static final int B = 2;
    private static final int C = 7;

    /* renamed from: a, reason: collision with root package name */
    private static final char f18252a = 'z';

    /* renamed from: b, reason: collision with root package name */
    private static final char f18253b = 'Z';

    /* renamed from: c, reason: collision with root package name */
    private static final char f18254c = 'm';

    /* renamed from: d, reason: collision with root package name */
    private static final char f18255d = 'M';

    /* renamed from: e, reason: collision with root package name */
    private static final char f18256e = 'l';

    /* renamed from: f, reason: collision with root package name */
    private static final char f18257f = 'L';

    /* renamed from: g, reason: collision with root package name */
    private static final char f18258g = 'h';

    /* renamed from: h, reason: collision with root package name */
    private static final char f18259h = 'H';

    /* renamed from: i, reason: collision with root package name */
    private static final char f18260i = 'v';

    /* renamed from: j, reason: collision with root package name */
    private static final char f18261j = 'V';

    /* renamed from: k, reason: collision with root package name */
    private static final char f18262k = 'c';

    /* renamed from: l, reason: collision with root package name */
    private static final char f18263l = 'C';

    /* renamed from: m, reason: collision with root package name */
    private static final char f18264m = 's';

    /* renamed from: n, reason: collision with root package name */
    private static final char f18265n = 'S';

    /* renamed from: o, reason: collision with root package name */
    private static final char f18266o = 'q';

    /* renamed from: p, reason: collision with root package name */
    private static final char f18267p = 'Q';

    /* renamed from: q, reason: collision with root package name */
    private static final char f18268q = 't';

    /* renamed from: r, reason: collision with root package name */
    private static final char f18269r = 'T';

    /* renamed from: s, reason: collision with root package name */
    private static final char f18270s = 'a';

    /* renamed from: t, reason: collision with root package name */
    private static final char f18271t = 'A';

    /* renamed from: u, reason: collision with root package name */
    private static final int f18272u = 2;

    /* renamed from: v, reason: collision with root package name */
    private static final int f18273v = 2;

    /* renamed from: w, reason: collision with root package name */
    private static final int f18274w = 1;

    /* renamed from: x, reason: collision with root package name */
    private static final int f18275x = 1;

    /* renamed from: y, reason: collision with root package name */
    private static final int f18276y = 6;

    /* renamed from: z, reason: collision with root package name */
    private static final int f18277z = 4;

    public static final void a(char c5, @fg.l ArrayList<i> arrayList, @fg.l float[] fArr, int i4) {
        if (c5 == 'z' || c5 == 'Z') {
            arrayList.add(i.b.f18200c);
            return;
        }
        int i5 = 0;
        if (c5 == 'm') {
            int i6 = i4 - 2;
            while (i5 <= i6) {
                int i7 = i5 + 1;
                i nVar = new i.n(fArr[i5], fArr[i7]);
                if (i5 > 0) {
                    nVar = new i.m(fArr[i5], fArr[i7]);
                }
                arrayList.add(nVar);
                i5 += 2;
            }
            return;
        }
        if (c5 == 'M') {
            int i10 = i4 - 2;
            while (i5 <= i10) {
                int i11 = i5 + 1;
                i fVar = new i.f(fArr[i5], fArr[i11]);
                if (i5 > 0) {
                    fVar = new i.e(fArr[i5], fArr[i11]);
                }
                arrayList.add(fVar);
                i5 += 2;
            }
            return;
        }
        if (c5 == 'l') {
            int i12 = i4 - 2;
            while (i5 <= i12) {
                arrayList.add(new i.m(fArr[i5], fArr[i5 + 1]));
                i5 += 2;
            }
            return;
        }
        if (c5 == 'L') {
            int i13 = i4 - 2;
            while (i5 <= i13) {
                arrayList.add(new i.e(fArr[i5], fArr[i5 + 1]));
                i5 += 2;
            }
            return;
        }
        if (c5 == 'h') {
            int i14 = i4 - 1;
            while (i5 <= i14) {
                arrayList.add(new i.l(fArr[i5]));
                i5++;
            }
            return;
        }
        if (c5 == 'H') {
            int i15 = i4 - 1;
            while (i5 <= i15) {
                arrayList.add(new i.d(fArr[i5]));
                i5++;
            }
            return;
        }
        if (c5 == 'v') {
            int i16 = i4 - 1;
            while (i5 <= i16) {
                arrayList.add(new i.r(fArr[i5]));
                i5++;
            }
            return;
        }
        if (c5 == 'V') {
            int i17 = i4 - 1;
            while (i5 <= i17) {
                arrayList.add(new i.s(fArr[i5]));
                i5++;
            }
            return;
        }
        if (c5 == 'c') {
            int i18 = i4 - 6;
            while (i5 <= i18) {
                arrayList.add(new i.k(fArr[i5], fArr[i5 + 1], fArr[i5 + 2], fArr[i5 + 3], fArr[i5 + 4], fArr[i5 + 5]));
                i5 += 6;
            }
            return;
        }
        if (c5 == 'C') {
            int i19 = i4 - 6;
            while (i5 <= i19) {
                arrayList.add(new i.c(fArr[i5], fArr[i5 + 1], fArr[i5 + 2], fArr[i5 + 3], fArr[i5 + 4], fArr[i5 + 5]));
                i5 += 6;
            }
            return;
        }
        if (c5 == 's') {
            int i20 = i4 - 4;
            while (i5 <= i20) {
                arrayList.add(new i.p(fArr[i5], fArr[i5 + 1], fArr[i5 + 2], fArr[i5 + 3]));
                i5 += 4;
            }
            return;
        }
        if (c5 == 'S') {
            int i21 = i4 - 4;
            while (i5 <= i21) {
                arrayList.add(new i.h(fArr[i5], fArr[i5 + 1], fArr[i5 + 2], fArr[i5 + 3]));
                i5 += 4;
            }
            return;
        }
        if (c5 == 'q') {
            int i22 = i4 - 4;
            while (i5 <= i22) {
                arrayList.add(new i.o(fArr[i5], fArr[i5 + 1], fArr[i5 + 2], fArr[i5 + 3]));
                i5 += 4;
            }
            return;
        }
        if (c5 == 'Q') {
            int i23 = i4 - 4;
            while (i5 <= i23) {
                arrayList.add(new i.g(fArr[i5], fArr[i5 + 1], fArr[i5 + 2], fArr[i5 + 3]));
                i5 += 4;
            }
            return;
        }
        if (c5 == 't') {
            int i24 = i4 - 2;
            while (i5 <= i24) {
                arrayList.add(new i.q(fArr[i5], fArr[i5 + 1]));
                i5 += 2;
            }
            return;
        }
        if (c5 == 'T') {
            int i25 = i4 - 2;
            while (i5 <= i25) {
                arrayList.add(new i.C0333i(fArr[i5], fArr[i5 + 1]));
                i5 += 2;
            }
            return;
        }
        if (c5 == 'a') {
            int i26 = i4 - 7;
            for (int i27 = 0; i27 <= i26; i27 += 7) {
                arrayList.add(new i.j(fArr[i27], fArr[i27 + 1], fArr[i27 + 2], Float.compare(fArr[i27 + 3], 0.0f) != 0, Float.compare(fArr[i27 + 4], 0.0f) != 0, fArr[i27 + 5], fArr[i27 + 6]));
            }
            return;
        }
        if (c5 != 'A') {
            throw new IllegalArgumentException(j.a("Unknown command for: ", c5));
        }
        int i28 = i4 - 7;
        for (int i29 = 0; i29 <= i28; i29 += 7) {
            arrayList.add(new i.a(fArr[i29], fArr[i29 + 1], fArr[i29 + 2], Float.compare(fArr[i29 + 3], 0.0f) != 0, Float.compare(fArr[i29 + 4], 0.0f) != 0, fArr[i29 + 5], fArr[i29 + 6]));
        }
    }

    private static final void b(List<i> list, float[] fArr, int i4, int i5, ld.p<? super float[], ? super Integer, ? extends i> pVar) {
        int i6 = i4 - i5;
        int i7 = 0;
        while (i7 <= i6) {
            i invoke = pVar.invoke(fArr, Integer.valueOf(i7));
            if ((invoke instanceof i.f) && i7 > 0) {
                invoke = new i.e(fArr[i7], fArr[i7 + 1]);
            } else if ((invoke instanceof i.n) && i7 > 0) {
                invoke = new i.m(fArr[i7], fArr[i7 + 1]);
            }
            list.add(invoke);
            i7 += i5;
        }
    }
}
