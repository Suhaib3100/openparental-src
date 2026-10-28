package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.i;
import androidx.compose.foundation.layout.x;
import androidx.compose.runtime.v3;
import androidx.compose.ui.c;
import androidx.compose.ui.node.g;
import com.tencent.rtmp.TXLiveConstants;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: FlowLayout.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aV\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0087\b¢\u0006\u0004\b\u000e\u0010\u000f\u001aV\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001aZ\u0010!\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2#\u0010\u001e\u001a\u001f\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001d¢\u0006\u0002\b\f2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0087\u0001\u0010%\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2#\u0010\u001e\u001a\u001f\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001d¢\u0006\u0002\b\f2#\u0010#\u001a\u001f\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001d¢\u0006\u0002\b\f2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010&\u001aM\u0010+\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010,\u001a\u0087\u0001\u0010-\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2#\u0010\u001e\u001a\u001f\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001d¢\u0006\u0002\b\f2#\u0010#\u001a\u001f\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001d¢\u0006\u0002\b\f2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b-\u0010&\u001a6\u00106\u001a\u000205*\u00020.2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u0010\u0014\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a#\u00109\u001a\u00020\u0006*\u0002082\u0006\u00102\u001a\u0002012\u0006\u0010#\u001a\u00020\u0006H\u0000¢\u0006\u0004\b9\u0010:\u001a#\u0010;\u001a\u00020\u0006*\u0002082\u0006\u00102\u001a\u0002012\u0006\u0010\u001e\u001a\u00020\u0006H\u0000¢\u0006\u0004\b;\u0010:\u001a\u001b\u0010=\u001a\u00020\u0006*\u00020<2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b=\u0010>\u001a\u001b\u0010?\u001a\u00020\u0006*\u00020<2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b?\u0010>\u001a<\u0010A\u001a\u00020\u0006*\u0002082\u0006\u00104\u001a\u0002032\u0006\u00102\u001a\u0002012\u0014\u0010@\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010<\u0012\u0004\u0012\u00020\n0\bH\u0002ø\u0001\u0000¢\u0006\u0004\bA\u0010B\"\u0014\u0010E\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010D\"\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010D\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/foundation/layout/i$e;", "horizontalArrangement", "Landroidx/compose/foundation/layout/i$m;", "verticalArrangement", "", "maxItemsInEachRow", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/m0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "content", "b", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/layout/i$e;Landroidx/compose/foundation/layout/i$m;ILld/q;Landroidx/compose/runtime/t;II)V", "maxItemsInEachColumn", "Landroidx/compose/foundation/layout/h0;", "a", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/layout/i$m;Landroidx/compose/foundation/layout/i$e;ILld/q;Landroidx/compose/runtime/t;II)V", "maxItemsInMainAxis", "Landroidx/compose/ui/layout/m0;", "s", "(Landroidx/compose/foundation/layout/i$e;Landroidx/compose/foundation/layout/i$m;ILandroidx/compose/runtime/t;I)Landroidx/compose/ui/layout/m0;", "i", "(Landroidx/compose/foundation/layout/i$m;Landroidx/compose/foundation/layout/i$e;ILandroidx/compose/runtime/t;I)Landroidx/compose/ui/layout/m0;", "", "Landroidx/compose/ui/layout/p;", "children", "Lkotlin/Function3;", "mainAxisSize", "crossAxisAvailable", "mainAxisSpacing", "p", "(Ljava/util/List;Lld/q;III)I", "crossAxisSize", "crossAxisSpacing", "r", "(Ljava/util/List;Lld/q;Lld/q;IIII)I", "", "mainAxisSizes", "crossAxisSizes", "mainAxisAvailable", "m", "(Ljava/util/List;[I[IIIII)I", "l", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/foundation/layout/u1;", "measureHelper", "Landroidx/compose/foundation/layout/a1;", "orientation", "Landroidx/compose/foundation/layout/i1;", "constraints", "Landroidx/compose/foundation/layout/l0;", "h", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/foundation/layout/u1;Landroidx/compose/foundation/layout/a1;JI)Landroidx/compose/foundation/layout/l0;", "Landroidx/compose/ui/layout/l0;", "n", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/foundation/layout/a1;I)I", "j", "Landroidx/compose/ui/layout/i1;", "o", "(Landroidx/compose/ui/layout/i1;Landroidx/compose/foundation/layout/a1;)I", "k", "storePlaceable", "q", "(Landroidx/compose/ui/layout/l0;JLandroidx/compose/foundation/layout/a1;Lld/l;)I", "Landroidx/compose/foundation/layout/x;", "Landroidx/compose/foundation/layout/x;", "CROSS_AXIS_ALIGNMENT_TOP", "CROSS_AXIS_ALIGNMENT_START", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 9 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,757:1\n79#2,11:758\n92#2:789\n79#2,11:790\n92#2:821\n456#3,8:769\n464#3,6:783\n456#3,8:801\n464#3,6:815\n67#3,3:822\n66#3:825\n67#3,3:832\n66#3:835\n3737#4,6:777\n3737#4,6:809\n1116#5,6:826\n1116#5,6:836\n69#6,6:842\n69#6,6:849\n1#7:848\n1208#8:855\n1187#8,2:856\n322#9:858\n321#9:859\n324#9:860\n323#9:861\n321#9:862\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n*L\n72#1:758,11\n72#1:789\n122#1:790,11\n122#1:821\n72#1:769,8\n72#1:783,6\n122#1:801,8\n122#1:815,6\n158#1:822,3\n158#1:825\n179#1:832,3\n179#1:835\n72#1:777,6\n122#1:809,6\n158#1:826,6\n179#1:836,6\n447#1:842,6\n568#1:849,6\n608#1:855\n608#1:856,2\n609#1:858\n610#1:859\n611#1:860\n688#1:861\n689#1:862\n*E\n"})
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final x f5116a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final x f5117b;

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/i1;", "placeable", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.layout.i1, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1[] f5118b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5119c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.i1[] i1VarArr, int i4) {
            super(1);
            this.f5118b = i1VarArr;
            this.f5119c = i4;
        }

        public final void a(@fg.m androidx.compose.ui.layout.i1 i1Var) {
            this.f5118b[this.f5119c + 1] = i1Var;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.layout.i1 i1Var) {
            a(i1Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/i1;", "placeable", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.layout.i1, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1[] f5120b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.layout.i1[] i1VarArr) {
            super(1);
            this.f5120b = i1VarArr;
        }

        public final void a(@fg.m androidx.compose.ui.layout.i1 i1Var) {
            this.f5120b[0] = i1Var;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.layout.i1 i1Var) {
            a(i1Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/p;", "", "index", "<anonymous parameter 1>", "a", "(Landroidx/compose/ui/layout/p;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.layout.p, Integer, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f5121b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int[] iArr) {
            super(3);
            this.f5121b = iArr;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Integer R(androidx.compose.ui.layout.p pVar, Integer num, Integer num2) {
            return a(pVar, num.intValue(), num2.intValue());
        }

        @fg.l
        public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4, int i5) {
            return Integer.valueOf(this.f5121b[i4]);
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/p;", "", "index", "<anonymous parameter 1>", "a", "(Landroidx/compose/ui/layout/p;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.layout.p, Integer, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f5122b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int[] iArr) {
            super(3);
            this.f5122b = iArr;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Integer R(androidx.compose.ui.layout.p pVar, Integer num, Integer num2) {
            return a(pVar, num.intValue(), num2.intValue());
        }

        @fg.l
        public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4, int i5) {
            return Integer.valueOf(this.f5122b[i4]);
        }
    }

    static {
        x.Companion companion = x.INSTANCE;
        c.Companion companion2 = androidx.compose.ui.c.INSTANCE;
        c.InterfaceC0326c w4 = companion2.w();
        companion.getClass();
        f5116a = new x.g(w4);
        c.b u4 = companion2.u();
        companion.getClass();
        f5117b = new x.e(u4);
    }

    @d0
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void a(@fg.m androidx.compose.ui.q qVar, @fg.m i.m mVar, @fg.m i.e eVar, int i4, @fg.l ld.q<? super h0, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, @fg.m androidx.compose.runtime.t tVar, int i5, int i6) {
        tVar.P(-310290901);
        if ((i6 & 1) != 0) {
            qVar = androidx.compose.ui.q.INSTANCE;
        }
        if ((i6 & 2) != 0) {
            mVar = i.f5073a.r();
        }
        if ((i6 & 4) != 0) {
            eVar = i.f5073a.p();
        }
        if ((i6 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        androidx.compose.ui.layout.m0 i7 = i(mVar, eVar, i4, tVar, (i5 >> 3) & TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED);
        tVar.P(-1323940314);
        int j4 = androidx.compose.runtime.p.j(tVar, 0);
        androidx.compose.runtime.g0 B = tVar.B();
        g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
        ld.a<androidx.compose.ui.node.g> a5 = companion.a();
        ld.q<v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(qVar);
        if (tVar.s() == null) {
            androidx.compose.runtime.p.n();
        }
        tVar.W();
        if (tVar.getInserting()) {
            tVar.F(a5);
        } else {
            tVar.C();
        }
        ld.p a6 = androidx.compose.animation.p.a(companion, tVar, i7, tVar, B);
        if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
            androidx.compose.animation.d.a(j4, tVar, j4, a6);
        }
        androidx.compose.animation.e.a(0, g4, v3.a(tVar), tVar, 2058660585);
        qVar2.R(i0.f5108b, tVar, Integer.valueOf(((i5 >> 9) & 112) | 6));
        tVar.p0();
        tVar.H();
        tVar.p0();
        tVar.p0();
    }

    @d0
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void b(@fg.m androidx.compose.ui.q qVar, @fg.m i.e eVar, @fg.m i.m mVar, int i4, @fg.l ld.q<? super m0, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, @fg.m androidx.compose.runtime.t tVar, int i5, int i6) {
        tVar.P(1098475987);
        if ((i6 & 1) != 0) {
            qVar = androidx.compose.ui.q.INSTANCE;
        }
        if ((i6 & 2) != 0) {
            eVar = i.f5073a.p();
        }
        if ((i6 & 4) != 0) {
            mVar = i.f5073a.r();
        }
        if ((i6 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        androidx.compose.ui.layout.m0 s4 = s(eVar, mVar, i4, tVar, (i5 >> 3) & TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED);
        tVar.P(-1323940314);
        int j4 = androidx.compose.runtime.p.j(tVar, 0);
        androidx.compose.runtime.g0 B = tVar.B();
        g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
        ld.a<androidx.compose.ui.node.g> a5 = companion.a();
        ld.q<v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(qVar);
        if (tVar.s() == null) {
            androidx.compose.runtime.p.n();
        }
        tVar.W();
        if (tVar.getInserting()) {
            tVar.F(a5);
        } else {
            tVar.C();
        }
        ld.p a6 = androidx.compose.animation.p.a(companion, tVar, s4, tVar, B);
        if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
            androidx.compose.animation.d.a(j4, tVar, j4, a6);
        }
        androidx.compose.animation.e.a(0, g4, v3.a(tVar), tVar, 2058660585);
        qVar2.R(n0.f5222b, tVar, Integer.valueOf(((i5 >> 9) & 112) | 6));
        tVar.p0();
        tVar.H();
        tVar.p0();
        tVar.p0();
    }

    @fg.l
    public static final l0 h(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l u1 u1Var, @fg.l a1 a1Var, long j4, int i4) {
        androidx.compose.runtime.collection.g gVar = new androidx.compose.runtime.collection.g(new s1[16], 0);
        int p4 = androidx.compose.ui.unit.b.p(j4);
        int r4 = androidx.compose.ui.unit.b.r(j4);
        int o4 = androidx.compose.ui.unit.b.o(j4);
        List<androidx.compose.ui.layout.l0> g4 = u1Var.g();
        androidx.compose.ui.layout.i1[] placeables = u1Var.getPlaceables();
        int ceil = (int) Math.ceil(o0Var.v5(u1Var.getArrangementSpacing()));
        long a5 = androidx.compose.ui.unit.c.a(r4, p4, 0, o4);
        androidx.compose.ui.layout.l0 l0Var = (androidx.compose.ui.layout.l0) kotlin.collections.w.W2(g4, 0);
        Integer valueOf = l0Var != null ? Integer.valueOf(q(l0Var, a5, a1Var, new b(placeables))) : null;
        Integer[] numArr = new Integer[g4.size()];
        int size = g4.size();
        int i5 = p4;
        int i6 = 0;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i6 < size) {
            kotlin.jvm.internal.l0.m(valueOf);
            int intValue = valueOf.intValue();
            int i12 = i7 + intValue;
            i5 -= intValue;
            int i13 = i6 + 1;
            androidx.compose.ui.layout.l0 l0Var2 = (androidx.compose.ui.layout.l0) kotlin.collections.w.W2(g4, i13);
            int i14 = size;
            Integer valueOf2 = l0Var2 != null ? Integer.valueOf(q(l0Var2, a5, a1Var, new a(placeables, i6)) + ceil) : null;
            if (i13 < g4.size() && i13 - i10 < i4) {
                if (i5 - (valueOf2 != null ? valueOf2.intValue() : 0) >= 0) {
                    i6 = i13;
                    size = i14;
                    valueOf = valueOf2;
                    i7 = i12;
                }
            }
            r4 = Math.min(Math.max(r4, i12), p4);
            numArr[i11] = Integer.valueOf(i13);
            i11++;
            valueOf2 = valueOf2 != null ? Integer.valueOf(valueOf2.intValue() - ceil) : null;
            i5 = p4;
            i10 = i13;
            i12 = 0;
            i6 = i13;
            size = i14;
            valueOf = valueOf2;
            i7 = i12;
        }
        long q4 = i1.q(i1.f(a5, r4, 0, 0, 0, 14, null), a1Var);
        int i15 = 0;
        int i16 = 0;
        Integer num = (Integer) kotlin.collections.l.Pe(numArr, 0);
        int i17 = r4;
        int i18 = 0;
        while (num != null) {
            Integer[] numArr2 = numArr;
            s1 m4 = u1Var.m(o0Var, q4, i16, num.intValue());
            i15 += m4.getCrossAxisSize();
            i17 = Math.max(i17, m4.getMainAxisSize());
            gVar.b(m4);
            i16 = num.intValue();
            i18++;
            num = (Integer) kotlin.collections.l.Pe(numArr2, i18);
            numArr = numArr2;
        }
        return new l0(Math.max(i17, androidx.compose.ui.unit.b.r(j4)), Math.max(i15, androidx.compose.ui.unit.b.q(j4)), gVar);
    }

    @fg.l
    @androidx.compose.runtime.i
    @kotlin.w0
    public static final androidx.compose.ui.layout.m0 i(@fg.l i.m mVar, @fg.l i.e eVar, int i4, @fg.m androidx.compose.runtime.t tVar, int i5) {
        tVar.P(-2013098357);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-2013098357, i5, -1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:177)");
        }
        Integer valueOf = Integer.valueOf(i4);
        tVar.P(1618982084);
        boolean q02 = tVar.q0(valueOf) | tVar.q0(mVar) | tVar.q0(eVar);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new k0(a1.Vertical, eVar, mVar, mVar.getSpacing(), d2.Wrap, f5117b, eVar.getSpacing(), i4, null);
            tVar.E(Q);
        }
        tVar.p0();
        k0 k0Var = (k0) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k0Var;
    }

    public static final int j(@fg.l androidx.compose.ui.layout.l0 l0Var, @fg.l a1 a1Var, int i4) {
        return a1Var == a1.Horizontal ? l0Var.Z(i4) : l0Var.k0(i4);
    }

    public static final int k(@fg.l androidx.compose.ui.layout.i1 i1Var, @fg.l a1 a1Var) {
        return a1Var == a1.Horizontal ? i1Var.getHeight() : i1Var.getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(List<? extends androidx.compose.ui.layout.p> list, ld.q<? super androidx.compose.ui.layout.p, ? super Integer, ? super Integer, Integer> qVar, ld.q<? super androidx.compose.ui.layout.p, ? super Integer, ? super Integer, Integer> qVar2, int i4, int i5, int i6, int i7) {
        if (list.isEmpty()) {
            return 0;
        }
        Object W2 = kotlin.collections.w.W2(list, 0);
        androidx.compose.ui.layout.p pVar = (androidx.compose.ui.layout.p) W2;
        int intValue = pVar != null ? qVar2.R(pVar, 0, Integer.valueOf(i4)).intValue() : 0;
        int intValue2 = pVar != null ? qVar.R(pVar, 0, Integer.valueOf(intValue)).intValue() : 0;
        int size = list.size();
        int i10 = i4;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 < size) {
            list.get(i11);
            kotlin.jvm.internal.l0.m(W2);
            i10 -= intValue2;
            int max = Math.max(i13, intValue);
            i11++;
            Object W22 = kotlin.collections.w.W2(list, i11);
            androidx.compose.ui.layout.p pVar2 = (androidx.compose.ui.layout.p) W22;
            int intValue3 = pVar2 != null ? qVar2.R(pVar2, Integer.valueOf(i11), Integer.valueOf(i4)).intValue() : 0;
            int intValue4 = pVar2 != null ? qVar.R(pVar2, Integer.valueOf(i11), Integer.valueOf(intValue3)).intValue() + i5 : 0;
            if (i10 >= 0 && i11 != list.size()) {
                if (i11 - i14 != i7 && i10 - intValue4 >= 0) {
                    int i15 = intValue3;
                    i13 = max;
                    W2 = W22;
                    intValue2 = intValue4;
                    intValue = i15;
                }
            }
            i12 += max + i6;
            intValue4 -= i5;
            i10 = i4;
            max = 0;
            i14 = i11;
            int i152 = intValue3;
            i13 = max;
            W2 = W22;
            intValue2 = intValue4;
            intValue = i152;
        }
        return i12 - i6;
    }

    private static final int m(List<? extends androidx.compose.ui.layout.p> list, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7) {
        return l(list, new c(iArr), new d(iArr2), i4, i5, i6, i7);
    }

    public static final int n(@fg.l androidx.compose.ui.layout.l0 l0Var, @fg.l a1 a1Var, int i4) {
        return a1Var == a1.Horizontal ? l0Var.k0(i4) : l0Var.Z(i4);
    }

    public static final int o(@fg.l androidx.compose.ui.layout.i1 i1Var, @fg.l a1 a1Var) {
        return a1Var == a1.Horizontal ? i1Var.getWidth() : i1Var.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(List<? extends androidx.compose.ui.layout.p> list, ld.q<? super androidx.compose.ui.layout.p, ? super Integer, ? super Integer, Integer> qVar, int i4, int i5, int i6) {
        int size = list.size();
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i7 < size) {
            int intValue = qVar.R(list.get(i7), Integer.valueOf(i7), Integer.valueOf(i4)).intValue() + i5;
            int i13 = i7 + 1;
            if (i13 - i11 == i6 || i13 == list.size()) {
                i10 = Math.max(i10, (i12 + intValue) - i5);
                i12 = 0;
                i11 = i7;
            } else {
                i12 += intValue;
            }
            i7 = i13;
        }
        return i10;
    }

    private static final int q(androidx.compose.ui.layout.l0 l0Var, long j4, a1 a1Var, ld.l<? super androidx.compose.ui.layout.i1, kotlin.k2> lVar) {
        if (r1.m(r1.l(l0Var)) != 0.0f) {
            return n(l0Var, a1Var, Integer.MAX_VALUE);
        }
        androidx.compose.ui.layout.i1 m02 = l0Var.m0(i1.q(i1.f(j4, 0, 0, 0, 0, 14, null), a1Var));
        lVar.invoke(m02);
        return o(m02, a1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(List<? extends androidx.compose.ui.layout.p> list, ld.q<? super androidx.compose.ui.layout.p, ? super Integer, ? super Integer, Integer> qVar, ld.q<? super androidx.compose.ui.layout.p, ? super Integer, ? super Integer, Integer> qVar2, int i4, int i5, int i6, int i7) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i11 = 0; i11 < size2; i11++) {
            iArr2[i11] = 0;
        }
        int size3 = list.size();
        for (int i12 = 0; i12 < size3; i12++) {
            androidx.compose.ui.layout.p pVar = list.get(i12);
            int intValue = qVar.R(pVar, Integer.valueOf(i12), Integer.valueOf(i4)).intValue();
            iArr[i12] = intValue;
            iArr2[i12] = qVar2.R(pVar, Integer.valueOf(i12), Integer.valueOf(intValue)).intValue();
        }
        int bw = kotlin.collections.l.bw(iArr);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i13 = iArr2[0];
        kotlin.collections.u0 it = new kotlin.ranges.l(1, kotlin.collections.l.ue(iArr2), 1).iterator();
        while (it.hasNext()) {
            int i14 = iArr2[it.c()];
            if (i13 < i14) {
                i13 = i14;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i15 = iArr[0];
        kotlin.collections.u0 it2 = new kotlin.ranges.l(1, kotlin.collections.l.ue(iArr), 1).iterator();
        while (it2.hasNext()) {
            int i16 = iArr[it2.c()];
            if (i15 < i16) {
                i15 = i16;
            }
        }
        int i17 = bw;
        while (i15 < i17) {
            if (i13 == i4) {
                return bw;
            }
            int i18 = (i15 + i17) / 2;
            i13 = m(list, iArr, iArr2, i18, i5, i6, i7);
            if (i13 == i4) {
                return i18;
            }
            if (i13 > i4) {
                i15 = i18 + 1;
            } else {
                i17 = i18 - 1;
            }
            bw = i18;
        }
        return bw;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kotlin.w0
    public static final androidx.compose.ui.layout.m0 s(@fg.l i.e eVar, @fg.l i.m mVar, int i4, @fg.m androidx.compose.runtime.t tVar, int i5) {
        tVar.P(1479255111);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1479255111, i5, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:156)");
        }
        Integer valueOf = Integer.valueOf(i4);
        tVar.P(1618982084);
        boolean q02 = tVar.q0(valueOf) | tVar.q0(eVar) | tVar.q0(mVar);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new k0(a1.Horizontal, eVar, mVar, eVar.getSpacing(), d2.Wrap, f5116a, mVar.getSpacing(), i4, null);
            tVar.E(Q);
        }
        tVar.p0();
        k0 k0Var = (k0) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k0Var;
    }
}
