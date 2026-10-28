package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u001c\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\u001a@\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0082\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a>\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0082\b¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\r\u001a\u00020\b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u000f\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u00020\b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u000e\u001a\u001b\u0010\u0012\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0010\u001a\u001b\u0010\u0013\u001a\u00020\b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u000e\u001a\u001b\u0010\u0014\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0010\u001a\u001b\u0010\u0016\u001a\u00020\u0015*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0018\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0010\u001a#\u0010\u001a\u001a\u00020\u0015*\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001c\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u0010\u001a#\u0010\u001d\u001a\u00020\u0015*\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001b\u001a\u001b\u0010\u001e\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u0010\u001a\u001b\u0010\u001f\u001a\u00020\b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010\u000e\u001a\u001b\u0010 \u001a\u00020\b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010\u000e\u001a\u0017\u0010!\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010#\u001a\u00020\b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b#\u0010\u000e\u001a#\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0%*\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\bH\u0002¢\u0006\u0004\b&\u0010'\u001a\u001b\u0010(\u001a\u00020\b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010\u000e\u001a#\u0010)\u001a\u00020\u0015*\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b)\u0010*\u001a#\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0%*\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\bH\u0002¢\u0006\u0004\b+\u0010'\u001a\u001b\u0010,\u001a\u00020\b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b,\u0010\u000e\u001a#\u0010-\u001a\u00020\u0015*\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b-\u0010*\u001a#\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0%*\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\bH\u0002¢\u0006\u0004\b.\u0010'\u001a\u001b\u0010/\u001a\u00020\b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b/\u0010\u000e\u001a#\u00100\u001a\u00020\u0015*\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b0\u0010*\u001a'\u00103\u001a\b\u0012\u0004\u0012\u00020\b0%*\u00020\u000b2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\b01H\u0002¢\u0006\u0004\b3\u00104\u001a#\u00105\u001a\b\u0012\u0004\u0012\u00020\b0%*\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u0010'\u001a\u001b\u00106\u001a\u00020\b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b6\u0010\u000e\u001a#\u00108\u001a\u00020\u0015*\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u00107\u001a\u00020\bH\u0002¢\u0006\u0004\b8\u0010*\u001a#\u00109\u001a\b\u0012\u0004\u0012\u00020\b0%*\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\bH\u0002¢\u0006\u0004\b9\u0010'\u001aK\u0010@\u001a\u00020\u0015*\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b2\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\b2\u0006\u0010?\u001a\u00020\bH\u0002¢\u0006\u0004\b@\u0010A\u001a#\u0010B\u001a\u00020\u0015*\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010:\u001a\u00020\bH\u0002¢\u0006\u0004\bB\u0010*\u001aB\u0010\u0000\u001a\u00020C*\u0012\u0012\u0004\u0012\u00020C0\u0001j\b\u0012\u0004\u0012\u00020C`\u00022\u0006\u0010D\u001a\u00020\b2\u0006\u0010E\u001a\u00020\b2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020C0FH\u0082\b¢\u0006\u0004\b\u0000\u0010H\u001a5\u0010I\u001a\u0004\u0018\u00010C*\u0012\u0012\u0004\u0012\u00020C0\u0001j\b\u0012\u0004\u0012\u00020C`\u00022\u0006\u0010D\u001a\u00020\b2\u0006\u0010E\u001a\u00020\bH\u0002¢\u0006\u0004\bI\u0010J\u001a3\u0010L\u001a\u00020\b*\u0012\u0012\u0004\u0012\u00020C0\u0001j\b\u0012\u0004\u0012\u00020C`\u00022\u0006\u0010K\u001a\u00020\b2\u0006\u0010E\u001a\u00020\bH\u0002¢\u0006\u0004\bL\u0010M\u001a3\u0010N\u001a\u00020\b*\u0012\u0012\u0004\u0012\u00020C0\u0001j\b\u0012\u0004\u0012\u00020C`\u00022\u0006\u0010D\u001a\u00020\b2\u0006\u0010E\u001a\u00020\bH\u0002¢\u0006\u0004\bN\u0010M\"\u0014\u0010P\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bO\u0010\u0016\"\u0014\u0010R\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bQ\u0010\u0016\"\u0014\u0010T\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bS\u0010\u0016\"\u0014\u0010V\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bU\u0010\u0016\"\u0014\u0010X\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bW\u0010\u0016\"\u0014\u0010Z\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bY\u0010\u0016\"\u0014\u0010\\\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b[\u0010\u0016\"\u0014\u0010^\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b]\u0010\u0016\"\u0014\u0010`\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b_\u0010\u0016\"\u0014\u0010b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\ba\u0010\u0016\"\u0014\u0010d\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bc\u0010\u0016\"\u0014\u0010f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\be\u0010\u0016\"\u0014\u0010h\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bg\u0010\u0016\"\u0014\u0010j\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bi\u0010\u0016\"\u0014\u0010l\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bk\u0010\u0016\"\u0014\u0010n\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bm\u0010\u0016\"\u0014\u0010p\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bo\u0010\u0016\"\u0014\u0010r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bq\u0010\u0016\"\u0014\u0010t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bs\u0010\u0016¨\u0006u"}, d2 = {"T", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lkotlin/Function1;", "", "predicate", "R", "(Ljava/util/ArrayList;Lld/l;)Ljava/lang/Object;", "", "Q", "(Ljava/util/ArrayList;Lld/l;)I", "", "address", "U", "([II)I", "c0", "([II)Z", "k0", "a0", "l0", "Y", "Lkotlin/k2;", "I", "([II)V", "Z", "value", "w0", "([IIZ)V", "L", "s0", "K", "J", "r0", "M", "(I)I", "d0", "len", "", "e0", "([II)Ljava/util/List;", "h0", "x0", "([III)V", "i0", "m0", "y0", "n0", "V", "v0", "", "indices", "q0", "([ILjava/lang/Iterable;)Ljava/util/List;", "W", "N", "anchor", "t0", "O", "key", "isNode", "hasDataKey", "hasData", "parentAnchor", "dataAnchor", "b0", "([IIIZZZII)V", "u0", "Landroidx/compose/runtime/d;", "index", "effectiveSize", "Lkotlin/Function0;", "block", "(Ljava/util/ArrayList;IILld/a;)Landroidx/compose/runtime/d;", "S", "(Ljava/util/ArrayList;II)Landroidx/compose/runtime/d;", "location", "p0", "(Ljava/util/ArrayList;II)I", "g0", "a", "parentAnchorPivot", "b", "Key_Offset", "c", "GroupInfo_Offset", "d", "ParentAnchor_Offset", "e", "Size_Offset", "f", "DataAnchor_Offset", "g", "Group_Fields_Size", "h", "NodeBit_Mask", "i", "ObjectKey_Mask", "j", "ObjectKey_Shift", "k", "Aux_Mask", "l", "Aux_Shift", "m", "Mark_Mask", "n", "ContainsMark_Mask", "o", "Slots_Shift", "p", "NodeCount_Mask", "q", "MinGroupGrowthSize", "r", "MinSlotsGrowthSize", "s", "LIVE_EDIT_INVALID_KEY", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3745:1\n82#2,3:3746\n33#2,4:3749\n85#2,2:3753\n38#2:3755\n87#2:3756\n1#3:3757\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n3539#1:3746,3\n3539#1:3749,4\n3539#1:3753,2\n3539#1:3755\n3539#1:3756\n*E\n"})
/* loaded from: classes.dex */
public final class z3 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f17339a = -2;

    /* renamed from: b, reason: collision with root package name */
    private static final int f17340b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int f17341c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f17342d = 2;

    /* renamed from: e, reason: collision with root package name */
    private static final int f17343e = 3;

    /* renamed from: f, reason: collision with root package name */
    private static final int f17344f = 4;

    /* renamed from: g, reason: collision with root package name */
    private static final int f17345g = 5;

    /* renamed from: h, reason: collision with root package name */
    private static final int f17346h = 1073741824;

    /* renamed from: i, reason: collision with root package name */
    private static final int f17347i = 536870912;

    /* renamed from: j, reason: collision with root package name */
    private static final int f17348j = 29;

    /* renamed from: k, reason: collision with root package name */
    private static final int f17349k = 268435456;

    /* renamed from: l, reason: collision with root package name */
    private static final int f17350l = 28;

    /* renamed from: m, reason: collision with root package name */
    private static final int f17351m = 134217728;

    /* renamed from: n, reason: collision with root package name */
    private static final int f17352n = 67108864;

    /* renamed from: o, reason: collision with root package name */
    private static final int f17353o = 28;

    /* renamed from: p, reason: collision with root package name */
    private static final int f17354p = 67108863;

    /* renamed from: q, reason: collision with root package name */
    private static final int f17355q = 32;

    /* renamed from: r, reason: collision with root package name */
    private static final int f17356r = 32;

    /* renamed from: s, reason: collision with root package name */
    private static final int f17357s = -3;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(int[] iArr, int i4) {
        int i5 = (i4 * 5) + 1;
        iArr[i5] = iArr[i5] | 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int J(int[] iArr, int i4) {
        int i5 = i4 * 5;
        if (i5 >= iArr.length) {
            return iArr.length;
        }
        return M(iArr[i5 + 1] >> 29) + iArr[i5 + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean K(int[] iArr, int i4) {
        return (iArr[(i4 * 5) + 1] & 201326592) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean L(int[] iArr, int i4) {
        return (iArr[(i4 * 5) + 1] & 67108864) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int M(int i4) {
        switch (i4) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int N(int[] iArr, int i4) {
        return iArr[(i4 * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> O(int[] iArr, int i4) {
        return q0(iArr, kotlin.ranges.s.B1(kotlin.ranges.s.W1(4, i4), 5));
    }

    static /* synthetic */ List P(int[] iArr, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = iArr.length;
        }
        return O(iArr, i4);
    }

    private static final <T> int Q(ArrayList<T> arrayList, ld.l<? super T, Boolean> lVar) {
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (lVar.invoke(arrayList.get(i4)).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    private static final <T> T R(ArrayList<T> arrayList, ld.l<? super T, Boolean> lVar) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            T t4 = arrayList.get(size);
            if (lVar.invoke(t4).booleanValue()) {
                return t4;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d S(ArrayList<d> arrayList, int i4, int i5) {
        int p02 = p0(arrayList, i4, i5);
        if (p02 >= 0) {
            return arrayList.get(p02);
        }
        return null;
    }

    private static final d T(ArrayList<d> arrayList, int i4, int i5, ld.a<d> aVar) {
        int p02 = p0(arrayList, i4, i5);
        if (p02 >= 0) {
            return arrayList.get(p02);
        }
        d invoke = aVar.invoke();
        arrayList.add(-(p02 + 1), invoke);
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int U(int[] iArr, int i4) {
        return iArr[(i4 * 5) + 1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int V(int[] iArr, int i4) {
        return iArr[(i4 * 5) + 3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> W(int[] iArr, int i4) {
        return q0(iArr, kotlin.ranges.s.B1(kotlin.ranges.s.W1(3, i4), 5));
    }

    static /* synthetic */ List X(int[] iArr, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = iArr.length;
        }
        return W(iArr, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Y(int[] iArr, int i4) {
        return (iArr[(i4 * 5) + 1] & 268435456) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Z(int[] iArr, int i4) {
        return (iArr[(i4 * 5) + 1] & f17351m) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a0(int[] iArr, int i4) {
        return (iArr[(i4 * 5) + 1] & f17347i) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(int[] iArr, int i4, int i5, boolean z4, boolean z5, boolean z6, int i6, int i7) {
        int i10 = z4 ? 1073741824 : 0;
        int i11 = z5 ? f17347i : 0;
        int i12 = z6 ? 268435456 : 0;
        int i13 = i4 * 5;
        iArr[i13] = i5;
        iArr[i13 + 1] = i10 | i11 | i12;
        iArr[i13 + 2] = i6;
        iArr[i13 + 3] = 0;
        iArr[i13 + 4] = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c0(int[] iArr, int i4) {
        return (iArr[(i4 * 5) + 1] & 1073741824) != 0;
    }

    private static final int d0(int[] iArr, int i4) {
        return iArr[i4 * 5];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> e0(int[] iArr, int i4) {
        return q0(iArr, kotlin.ranges.s.B1(kotlin.ranges.s.W1(0, i4), 5));
    }

    static /* synthetic */ List f0(int[] iArr, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = iArr.length;
        }
        return e0(iArr, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g0(ArrayList<d> arrayList, int i4, int i5) {
        int p02 = p0(arrayList, i4, i5);
        return p02 >= 0 ? p02 : -(p02 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h0(int[] iArr, int i4) {
        return iArr[(i4 * 5) + 1] & f17354p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> i0(int[] iArr, int i4) {
        List<Integer> q02 = q0(iArr, kotlin.ranges.s.B1(kotlin.ranges.s.W1(1, i4), 5));
        ArrayList arrayList = new ArrayList(q02.size());
        int size = q02.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(Integer.valueOf(q02.get(i5).intValue() & f17354p));
        }
        return arrayList;
    }

    static /* synthetic */ List j0(int[] iArr, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = iArr.length;
        }
        return i0(iArr, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k0(int[] iArr, int i4) {
        return iArr[(i4 * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l0(int[] iArr, int i4) {
        int i5 = i4 * 5;
        return iArr[i5 + 4] + M(iArr[i5 + 1] >> 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m0(int[] iArr, int i4) {
        return iArr[(i4 * 5) + 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> n0(int[] iArr, int i4) {
        return q0(iArr, kotlin.ranges.s.B1(kotlin.ranges.s.W1(2, i4), 5));
    }

    static /* synthetic */ List o0(int[] iArr, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = iArr.length;
        }
        return n0(iArr, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p0(ArrayList<d> arrayList, int i4, int i5) {
        int size = arrayList.size() - 1;
        int i6 = 0;
        while (i6 <= size) {
            int i7 = (i6 + size) >>> 1;
            int location = arrayList.get(i7).getLocation();
            if (location < 0) {
                location += i5;
            }
            int t4 = kotlin.jvm.internal.l0.t(location, i4);
            if (t4 < 0) {
                i6 = i7 + 1;
            } else {
                if (t4 <= 0) {
                    return i7;
                }
                size = i7 - 1;
            }
        }
        return -(i6 + 1);
    }

    public static final int q(int[] iArr, int i4) {
        return iArr[i4 * 5];
    }

    private static final List<Integer> q0(int[] iArr, Iterable<Integer> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r0(int[] iArr, int i4) {
        int i5 = i4 * 5;
        return iArr[i5 + 4] + M(iArr[i5 + 1] >> 28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(int[] iArr, int i4, boolean z4) {
        int i5 = (i4 * 5) + 1;
        if (z4) {
            iArr[i5] = iArr[i5] | 67108864;
        } else {
            iArr[i5] = iArr[i5] & (-67108865);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(int[] iArr, int i4, int i5) {
        iArr[(i4 * 5) + 4] = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(int[] iArr, int i4, int i5) {
        iArr[i4 * 5] = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(int[] iArr, int i4, int i5) {
        x.l0(i5 >= 0);
        iArr[(i4 * 5) + 3] = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(int[] iArr, int i4, boolean z4) {
        int i5 = (i4 * 5) + 1;
        if (z4) {
            iArr[i5] = iArr[i5] | f17351m;
        } else {
            iArr[i5] = iArr[i5] & (-134217729);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(int[] iArr, int i4, int i5) {
        x.l0(i5 >= 0 && i5 < f17354p);
        int i6 = (i4 * 5) + 1;
        iArr[i6] = i5 | (iArr[i6] & (-67108864));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y0(int[] iArr, int i4, int i5) {
        iArr[(i4 * 5) + 2] = i5;
    }
}
