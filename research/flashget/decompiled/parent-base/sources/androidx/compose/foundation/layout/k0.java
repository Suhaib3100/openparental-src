package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.i;
import androidx.compose.ui.layout.i1;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FlowLayout.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÂ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\bHÂ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÂ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÂ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\u00020\bHÂ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u000fHÂ\u0003¢\u0006\u0004\b \u0010!J,\u0010)\u001a\u00020(*\u00020\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010'\u001a\u00020&H\u0016ø\u0001\u0001¢\u0006\u0004\b)\u0010*J)\u0010.\u001a\u00020\u000f*\u00020+2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020,0#2\u0006\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010/J)\u00101\u001a\u00020\u000f*\u00020+2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020,0#2\u0006\u00100\u001a\u00020\u000fH\u0016¢\u0006\u0004\b1\u0010/J)\u00102\u001a\u00020\u000f*\u00020+2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020,0#2\u0006\u00100\u001a\u00020\u000fH\u0016¢\u0006\u0004\b2\u0010/J)\u00103\u001a\u00020\u000f*\u00020+2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020,0#2\u0006\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b3\u0010/J3\u00107\u001a\u00020\u000f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020,0#2\u0006\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\u000f¢\u0006\u0004\b7\u00108J+\u0010:\u001a\u00020\u000f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020,0#2\u0006\u0010-\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\u000f¢\u0006\u0004\b:\u0010;J3\u0010=\u001a\u00020\u000f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020,0#2\u0006\u0010<\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\u000f¢\u0006\u0004\b=\u00108Jg\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001ø\u0001\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010A\u001a\u00020@HÖ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\bC\u0010!J\u001a\u0010G\u001a\u00020F2\b\u0010E\u001a\u0004\u0018\u00010DHÖ\u0003¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010IR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010JR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010KR\u001a\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b.\u0010LR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010MR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010\u000e\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\bP\u0010LR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR4\u0010Y\u001a\u001f\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0S¢\u0006\u0002\bT8\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR4\u0010[\u001a\u001f\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0S¢\u0006\u0002\bT8\u0006¢\u0006\f\n\u0004\b\u0013\u0010V\u001a\u0004\bZ\u0010XR4\u0010]\u001a\u001f\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0S¢\u0006\u0002\bT8\u0006¢\u0006\f\n\u0004\b\u0015\u0010V\u001a\u0004\b\\\u0010XR4\u0010_\u001a\u001f\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0S¢\u0006\u0002\bT8\u0006¢\u0006\f\n\u0004\b\u0017\u0010V\u001a\u0004\b^\u0010X\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006`"}, d2 = {"Landroidx/compose/foundation/layout/k0;", "Landroidx/compose/ui/layout/m0;", "Landroidx/compose/foundation/layout/a1;", "orientation", "Landroidx/compose/foundation/layout/i$e;", "horizontalArrangement", "Landroidx/compose/foundation/layout/i$m;", "verticalArrangement", "Landroidx/compose/ui/unit/h;", "mainAxisArrangementSpacing", "Landroidx/compose/foundation/layout/d2;", "crossAxisSize", "Landroidx/compose/foundation/layout/x;", "crossAxisAlignment", "crossAxisArrangementSpacing", "", "maxItemsInMainAxis", "<init>", "(Landroidx/compose/foundation/layout/a1;Landroidx/compose/foundation/layout/i$e;Landroidx/compose/foundation/layout/i$m;FLandroidx/compose/foundation/layout/d2;Landroidx/compose/foundation/layout/x;FILkotlin/jvm/internal/w;)V", "j", "()Landroidx/compose/foundation/layout/a1;", "k", "()Landroidx/compose/foundation/layout/i$e;", "l", "()Landroidx/compose/foundation/layout/i$m;", "m", "()F", "n", "()Landroidx/compose/foundation/layout/d2;", "o", "()Landroidx/compose/foundation/layout/x;", "p", "q", "()I", "Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;", "Landroidx/compose/ui/layout/q;", "Landroidx/compose/ui/layout/p;", "height", "d", "(Landroidx/compose/ui/layout/q;Ljava/util/List;I)I", "width", "c", "e", "b", "crossAxisAvailable", "mainAxisSpacing", "crossAxisSpacing", "z", "(Ljava/util/List;III)I", "arrangementSpacing", "y", "(Ljava/util/List;II)I", "mainAxisAvailable", "x", "r", "(Landroidx/compose/foundation/layout/a1;Landroidx/compose/foundation/layout/i$e;Landroidx/compose/foundation/layout/i$m;FLandroidx/compose/foundation/layout/d2;Landroidx/compose/foundation/layout/x;FI)Landroidx/compose/foundation/layout/k0;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/foundation/layout/a1;", "Landroidx/compose/foundation/layout/i$e;", "Landroidx/compose/foundation/layout/i$m;", "F", "Landroidx/compose/foundation/layout/d2;", "f", "Landroidx/compose/foundation/layout/x;", "g", "h", "I", "Lkotlin/Function3;", "Lkotlin/u;", "i", "Lld/q;", "u", "()Lld/q;", "maxMainAxisIntrinsicItemSize", "t", "maxCrossAxisIntrinsicItemSize", "v", "minCrossAxisIntrinsicItemSize", "w", "minMainAxisIntrinsicItemSize", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowMeasurePolicy\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,757:1\n523#2:758\n1#3:759\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowMeasurePolicy\n*L\n235#1:758\n*E\n"})
/* loaded from: classes.dex */
final /* data */ class k0 implements androidx.compose.ui.layout.m0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a1 orientation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final i.e horizontalArrangement;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final i.m verticalArrangement;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float mainAxisArrangementSpacing;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d2 crossAxisSize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x crossAxisAlignment;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float crossAxisArrangementSpacing;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int maxItemsInMainAxis;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.q<androidx.compose.ui.layout.p, Integer, Integer, Integer> maxMainAxisIntrinsicItemSize;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.q<androidx.compose.ui.layout.p, Integer, Integer, Integer> maxCrossAxisIntrinsicItemSize;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.q<androidx.compose.ui.layout.p, Integer, Integer, Integer> minCrossAxisIntrinsicItemSize;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.q<androidx.compose.ui.layout.p, Integer, Integer, Integer> minMainAxisIntrinsicItemSize;

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/p;", "", "<anonymous parameter 0>", "w", "a", "(Landroidx/compose/ui/layout/p;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.layout.p, Integer, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f5159b = new a(3);

        a() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Integer R(androidx.compose.ui.layout.p pVar, Integer num, Integer num2) {
            return a(pVar, num.intValue(), num2.intValue());
        }

        @fg.l
        public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4, int i5) {
            return Integer.valueOf(pVar.t(i5));
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/p;", "", "<anonymous parameter 0>", "h", "a", "(Landroidx/compose/ui/layout/p;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.layout.p, Integer, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f5160b = new b(3);

        b() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Integer R(androidx.compose.ui.layout.p pVar, Integer num, Integer num2) {
            return a(pVar, num.intValue(), num2.intValue());
        }

        @fg.l
        public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4, int i5) {
            return Integer.valueOf(pVar.l0(i5));
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/p;", "", "<anonymous parameter 0>", "h", "a", "(Landroidx/compose/ui/layout/p;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.layout.p, Integer, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f5161b = new c(3);

        c() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Integer R(androidx.compose.ui.layout.p pVar, Integer num, Integer num2) {
            return a(pVar, num.intValue(), num2.intValue());
        }

        @fg.l
        public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4, int i5) {
            return Integer.valueOf(pVar.l0(i5));
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/p;", "", "<anonymous parameter 0>", "w", "a", "(Landroidx/compose/ui/layout/p;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.layout.p, Integer, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f5162b = new d(3);

        d() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Integer R(androidx.compose.ui.layout.p pVar, Integer num, Integer num2) {
            return a(pVar, num.intValue(), num2.intValue());
        }

        @fg.l
        public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4, int i5) {
            return Integer.valueOf(pVar.t(i5));
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f5163b = new e(1);

        e() {
            super(1);
        }

        public final void a(@fg.l i1.a aVar) {
        }

        @Override // ld.l
        public kotlin.k2 invoke(i1.a aVar) {
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowMeasurePolicy$measure$6\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,757:1\n476#2,11:758\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowMeasurePolicy$measure$6\n*L\n276#1:758,11\n*E\n"})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0 f5164b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ u1 f5165c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int[] f5166d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.o0 f5167e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(l0 l0Var, u1 u1Var, int[] iArr, androidx.compose.ui.layout.o0 o0Var) {
            super(1);
            this.f5164b = l0Var;
            this.f5165c = u1Var;
            this.f5166d = iArr;
            this.f5167e = o0Var;
        }

        public final void a(@fg.l i1.a aVar) {
            androidx.compose.runtime.collection.g<s1> b5 = this.f5164b.b();
            u1 u1Var = this.f5165c;
            int[] iArr = this.f5166d;
            androidx.compose.ui.layout.o0 o0Var = this.f5167e;
            int size = b5.getSize();
            if (size > 0) {
                s1[] L = b5.L();
                int i4 = 0;
                do {
                    u1Var.n(aVar, L[i4], iArr[i4], o0Var.getLayoutDirection());
                    i4++;
                } while (i4 < size);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/p;", "", "<anonymous parameter 0>", "w", "a", "(Landroidx/compose/ui/layout/p;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.layout.p, Integer, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f5168b = new g(3);

        g() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Integer R(androidx.compose.ui.layout.p pVar, Integer num, Integer num2) {
            return a(pVar, num.intValue(), num2.intValue());
        }

        @fg.l
        public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4, int i5) {
            return Integer.valueOf(pVar.Z(i5));
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/p;", "", "<anonymous parameter 0>", "h", "a", "(Landroidx/compose/ui/layout/p;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.layout.p, Integer, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f5169b = new h(3);

        h() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Integer R(androidx.compose.ui.layout.p pVar, Integer num, Integer num2) {
            return a(pVar, num.intValue(), num2.intValue());
        }

        @fg.l
        public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4, int i5) {
            return Integer.valueOf(pVar.k0(i5));
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/p;", "", "<anonymous parameter 0>", "h", "a", "(Landroidx/compose/ui/layout/p;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.layout.p, Integer, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final i f5170b = new i(3);

        i() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Integer R(androidx.compose.ui.layout.p pVar, Integer num, Integer num2) {
            return a(pVar, num.intValue(), num2.intValue());
        }

        @fg.l
        public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4, int i5) {
            return Integer.valueOf(pVar.k0(i5));
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/p;", "", "<anonymous parameter 0>", "w", "a", "(Landroidx/compose/ui/layout/p;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class j extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.layout.p, Integer, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final j f5171b = new j(3);

        j() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Integer R(androidx.compose.ui.layout.p pVar, Integer num, Integer num2) {
            return a(pVar, num.intValue(), num2.intValue());
        }

        @fg.l
        public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4, int i5) {
            return Integer.valueOf(pVar.Z(i5));
        }
    }

    public /* synthetic */ k0(a1 a1Var, i.e eVar, i.m mVar, float f4, d2 d2Var, x xVar, float f5, int i4, kotlin.jvm.internal.w wVar) {
        this(a1Var, eVar, mVar, f4, d2Var, xVar, f5, i4);
    }

    /* renamed from: j, reason: from getter */
    private final a1 getOrientation() {
        return this.orientation;
    }

    /* renamed from: k, reason: from getter */
    private final i.e getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    /* renamed from: l, reason: from getter */
    private final i.m getVerticalArrangement() {
        return this.verticalArrangement;
    }

    /* renamed from: m, reason: from getter */
    private final float getMainAxisArrangementSpacing() {
        return this.mainAxisArrangementSpacing;
    }

    /* renamed from: n, reason: from getter */
    private final d2 getCrossAxisSize() {
        return this.crossAxisSize;
    }

    /* renamed from: o, reason: from getter */
    private final x getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    /* renamed from: p, reason: from getter */
    private final float getCrossAxisArrangementSpacing() {
        return this.crossAxisArrangementSpacing;
    }

    /* renamed from: q, reason: from getter */
    private final int getMaxItemsInMainAxis() {
        return this.maxItemsInMainAxis;
    }

    public static k0 s(k0 k0Var, a1 a1Var, i.e eVar, i.m mVar, float f4, d2 d2Var, x xVar, float f5, int i4, int i5, Object obj) {
        a1 a1Var2 = (i5 & 1) != 0 ? k0Var.orientation : a1Var;
        i.e eVar2 = (i5 & 2) != 0 ? k0Var.horizontalArrangement : eVar;
        i.m mVar2 = (i5 & 4) != 0 ? k0Var.verticalArrangement : mVar;
        float f6 = (i5 & 8) != 0 ? k0Var.mainAxisArrangementSpacing : f4;
        d2 d2Var2 = (i5 & 16) != 0 ? k0Var.crossAxisSize : d2Var;
        x xVar2 = (i5 & 32) != 0 ? k0Var.crossAxisAlignment : xVar;
        float f7 = (i5 & 64) != 0 ? k0Var.crossAxisArrangementSpacing : f5;
        int i6 = (i5 & 128) != 0 ? k0Var.maxItemsInMainAxis : i4;
        k0Var.getClass();
        return new k0(a1Var2, eVar2, mVar2, f6, d2Var2, xVar2, f7, i6);
    }

    @Override // androidx.compose.ui.layout.m0
    @fg.l
    public androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
        int mainAxisTotalSize;
        if (list.isEmpty()) {
            return androidx.compose.ui.layout.o0.x2(o0Var, 0, 0, null, e.f5163b, 4, null);
        }
        u1 u1Var = new u1(this.orientation, this.horizontalArrangement, this.verticalArrangement, this.mainAxisArrangementSpacing, this.crossAxisSize, this.crossAxisAlignment, list, new androidx.compose.ui.layout.i1[list.size()], null);
        l0 h4 = j0.h(o0Var, u1Var, this.orientation, i1.d(j4, this.orientation), this.maxItemsInMainAxis);
        androidx.compose.runtime.collection.g<s1> b5 = h4.b();
        int size = b5.getSize();
        int[] iArr = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = b5.L()[i4].getCrossAxisSize();
        }
        int[] iArr2 = new int[size];
        int size2 = ((b5.getSize() - 1) * o0Var.q2(this.crossAxisArrangementSpacing)) + h4.getCrossAxisTotalSize();
        a1 a1Var = this.orientation;
        a1 a1Var2 = a1.Horizontal;
        if (a1Var == a1Var2) {
            i.m mVar = this.verticalArrangement;
            if (mVar == null) {
                throw new IllegalArgumentException("null verticalArrangement");
            }
            mVar.d(o0Var, size2, iArr, iArr2);
        } else {
            i.e eVar = this.horizontalArrangement;
            if (eVar == null) {
                throw new IllegalArgumentException("null horizontalArrangement");
            }
            eVar.e(o0Var, size2, iArr, o0Var.getLayoutDirection(), iArr2);
        }
        if (this.orientation == a1Var2) {
            size2 = h4.getMainAxisTotalSize();
            mainAxisTotalSize = size2;
        } else {
            mainAxisTotalSize = h4.getMainAxisTotalSize();
        }
        return androidx.compose.ui.layout.o0.x2(o0Var, androidx.compose.ui.unit.c.g(j4, size2), androidx.compose.ui.unit.c.f(j4, mainAxisTotalSize), null, new f(h4, u1Var, iArr2, o0Var), 4, null);
    }

    @Override // androidx.compose.ui.layout.m0
    public int b(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
        return this.orientation == a1.Horizontal ? y(list, i4, qVar.q2(this.mainAxisArrangementSpacing)) : x(list, i4, qVar.q2(this.mainAxisArrangementSpacing), qVar.q2(this.crossAxisArrangementSpacing));
    }

    @Override // androidx.compose.ui.layout.m0
    public int c(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
        return this.orientation == a1.Horizontal ? x(list, i4, qVar.q2(this.mainAxisArrangementSpacing), qVar.q2(this.crossAxisArrangementSpacing)) : z(list, i4, qVar.q2(this.mainAxisArrangementSpacing), qVar.q2(this.crossAxisArrangementSpacing));
    }

    @Override // androidx.compose.ui.layout.m0
    public int d(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
        return this.orientation == a1.Horizontal ? z(list, i4, qVar.q2(this.mainAxisArrangementSpacing), qVar.q2(this.crossAxisArrangementSpacing)) : x(list, i4, qVar.q2(this.mainAxisArrangementSpacing), qVar.q2(this.crossAxisArrangementSpacing));
    }

    @Override // androidx.compose.ui.layout.m0
    public int e(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
        return this.orientation == a1.Horizontal ? x(list, i4, qVar.q2(this.mainAxisArrangementSpacing), qVar.q2(this.crossAxisArrangementSpacing)) : y(list, i4, qVar.q2(this.mainAxisArrangementSpacing));
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) other;
        return this.orientation == k0Var.orientation && kotlin.jvm.internal.l0.g(this.horizontalArrangement, k0Var.horizontalArrangement) && kotlin.jvm.internal.l0.g(this.verticalArrangement, k0Var.verticalArrangement) && androidx.compose.ui.unit.h.l(this.mainAxisArrangementSpacing, k0Var.mainAxisArrangementSpacing) && this.crossAxisSize == k0Var.crossAxisSize && kotlin.jvm.internal.l0.g(this.crossAxisAlignment, k0Var.crossAxisAlignment) && androidx.compose.ui.unit.h.l(this.crossAxisArrangementSpacing, k0Var.crossAxisArrangementSpacing) && this.maxItemsInMainAxis == k0Var.maxItemsInMainAxis;
    }

    public int hashCode() {
        int hashCode = this.orientation.hashCode() * 31;
        i.e eVar = this.horizontalArrangement;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        i.m mVar = this.verticalArrangement;
        return Integer.hashCode(this.maxItemsInMainAxis) + androidx.compose.animation.l0.a(this.crossAxisArrangementSpacing, (this.crossAxisAlignment.hashCode() + ((this.crossAxisSize.hashCode() + ((androidx.compose.ui.unit.h.n(this.mainAxisArrangementSpacing) + ((hashCode2 + (mVar != null ? mVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31, 31);
    }

    @fg.l
    public final k0 r(@fg.l a1 orientation, @fg.m i.e horizontalArrangement, @fg.m i.m verticalArrangement, float mainAxisArrangementSpacing, @fg.l d2 crossAxisSize, @fg.l x crossAxisAlignment, float crossAxisArrangementSpacing, int maxItemsInMainAxis) {
        return new k0(orientation, horizontalArrangement, verticalArrangement, mainAxisArrangementSpacing, crossAxisSize, crossAxisAlignment, crossAxisArrangementSpacing, maxItemsInMainAxis);
    }

    @fg.l
    public final ld.q<androidx.compose.ui.layout.p, Integer, Integer, Integer> t() {
        return this.maxCrossAxisIntrinsicItemSize;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("FlowMeasurePolicy(orientation=");
        sb.append(this.orientation);
        sb.append(", horizontalArrangement=");
        sb.append(this.horizontalArrangement);
        sb.append(", verticalArrangement=");
        sb.append(this.verticalArrangement);
        sb.append(", mainAxisArrangementSpacing=");
        androidx.compose.foundation.b0.a(this.mainAxisArrangementSpacing, sb, ", crossAxisSize=");
        sb.append(this.crossAxisSize);
        sb.append(", crossAxisAlignment=");
        sb.append(this.crossAxisAlignment);
        sb.append(", crossAxisArrangementSpacing=");
        androidx.compose.foundation.b0.a(this.crossAxisArrangementSpacing, sb, ", maxItemsInMainAxis=");
        return androidx.view.e.a(sb, this.maxItemsInMainAxis, ')');
    }

    @fg.l
    public final ld.q<androidx.compose.ui.layout.p, Integer, Integer, Integer> u() {
        return this.maxMainAxisIntrinsicItemSize;
    }

    @fg.l
    public final ld.q<androidx.compose.ui.layout.p, Integer, Integer, Integer> v() {
        return this.minCrossAxisIntrinsicItemSize;
    }

    @fg.l
    public final ld.q<androidx.compose.ui.layout.p, Integer, Integer, Integer> w() {
        return this.minMainAxisIntrinsicItemSize;
    }

    public final int x(@fg.l List<? extends androidx.compose.ui.layout.p> measurables, int mainAxisAvailable, int mainAxisSpacing, int crossAxisSpacing) {
        int l4;
        l4 = j0.l(measurables, this.minMainAxisIntrinsicItemSize, this.minCrossAxisIntrinsicItemSize, mainAxisAvailable, mainAxisSpacing, crossAxisSpacing, this.maxItemsInMainAxis);
        return l4;
    }

    public final int y(@fg.l List<? extends androidx.compose.ui.layout.p> measurables, int height, int arrangementSpacing) {
        int p4;
        p4 = j0.p(measurables, this.maxMainAxisIntrinsicItemSize, height, arrangementSpacing, this.maxItemsInMainAxis);
        return p4;
    }

    public final int z(@fg.l List<? extends androidx.compose.ui.layout.p> measurables, int crossAxisAvailable, int mainAxisSpacing, int crossAxisSpacing) {
        int r4;
        r4 = j0.r(measurables, this.minMainAxisIntrinsicItemSize, this.minCrossAxisIntrinsicItemSize, crossAxisAvailable, mainAxisSpacing, crossAxisSpacing, this.maxItemsInMainAxis);
        return r4;
    }

    private k0(a1 a1Var, i.e eVar, i.m mVar, float f4, d2 d2Var, x xVar, float f5, int i4) {
        this.orientation = a1Var;
        this.horizontalArrangement = eVar;
        this.verticalArrangement = mVar;
        this.mainAxisArrangementSpacing = f4;
        this.crossAxisSize = d2Var;
        this.crossAxisAlignment = xVar;
        this.crossAxisArrangementSpacing = f5;
        this.maxItemsInMainAxis = i4;
        a1 a1Var2 = a1.Horizontal;
        this.maxMainAxisIntrinsicItemSize = a1Var == a1Var2 ? c.f5161b : d.f5162b;
        this.maxCrossAxisIntrinsicItemSize = a1Var == a1Var2 ? a.f5159b : b.f5160b;
        this.minCrossAxisIntrinsicItemSize = a1Var == a1Var2 ? g.f5168b : h.f5169b;
        this.minMainAxisIntrinsicItemSize = a1Var == a1Var2 ? i.f5170b : j.f5171b;
    }
}
