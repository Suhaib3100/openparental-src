package androidx.compose.material3;

import androidx.compose.ui.layout.i1;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: OutlinedTextField.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJC\u0010\u0016\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u0019\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00020\u00122\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J,\u0010\u001f\u001a\u00020\u001e*\u00020\u001a2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J)\u0010!\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\"J)\u0010#\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010\"J)\u0010$\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b$\u0010\"J)\u0010%\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b%\u0010\"R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Landroidx/compose/material3/s7;", "Landroidx/compose/ui/layout/m0;", "Lkotlin/Function1;", "Li0/n;", "Lkotlin/k2;", "onLabelMeasured", "", "singleLine", "", "animationProgress", "Landroidx/compose/foundation/layout/l1;", "paddingValues", "<init>", "(Lld/l;ZFLandroidx/compose/foundation/layout/l1;)V", "Landroidx/compose/ui/layout/q;", "", "Landroidx/compose/ui/layout/p;", "measurables", "", "height", "Lkotlin/Function2;", "intrinsicMeasurer", "n", "(Landroidx/compose/ui/layout/q;Ljava/util/List;ILld/p;)I", "width", "m", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;", "e", "(Landroidx/compose/ui/layout/q;Ljava/util/List;I)I", "c", "b", "d", "Lld/l;", "Z", "F", "Landroidx/compose/foundation/layout/l1;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1156:1\n116#2,2:1157\n33#2,6:1159\n118#2:1165\n116#2,2:1166\n33#2,6:1168\n118#2:1174\n116#2,2:1175\n33#2,6:1177\n118#2:1183\n116#2,2:1184\n33#2,6:1186\n118#2:1192\n116#2,2:1193\n33#2,6:1195\n118#2:1201\n116#2,2:1202\n33#2,6:1204\n118#2:1210\n544#2,2:1211\n33#2,6:1213\n546#2:1219\n116#2,2:1220\n33#2,6:1222\n118#2:1228\n544#2,2:1229\n33#2,6:1231\n546#2:1237\n544#2,2:1238\n33#2,6:1240\n546#2:1246\n116#2,2:1247\n33#2,6:1249\n118#2:1255\n116#2,2:1256\n33#2,6:1258\n118#2:1264\n116#2,2:1265\n33#2,6:1267\n118#2:1273\n116#2,2:1274\n33#2,6:1276\n118#2:1282\n116#2,2:1283\n33#2,6:1285\n118#2:1291\n116#2,2:1292\n33#2,6:1294\n118#2:1300\n116#2,2:1301\n33#2,6:1303\n118#2:1309\n116#2,2:1310\n33#2,6:1312\n118#2:1318\n116#2,2:1319\n33#2,6:1321\n118#2:1327\n116#2,2:1328\n33#2,6:1330\n118#2:1336\n116#2,2:1337\n33#2,6:1339\n118#2:1345\n544#2,2:1346\n33#2,6:1348\n546#2:1354\n116#2,2:1355\n33#2,6:1357\n118#2:1363\n116#2,2:1364\n33#2,6:1366\n118#2:1372\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldMeasurePolicy\n*L\n653#1:1157,2\n653#1:1159,6\n653#1:1165\n660#1:1166,2\n660#1:1168,6\n660#1:1174\n666#1:1175,2\n666#1:1177,6\n666#1:1183\n672#1:1184,2\n672#1:1186,6\n672#1:1192\n690#1:1193,2\n690#1:1195,6\n690#1:1201\n697#1:1202,2\n697#1:1204,6\n697#1:1210\n711#1:1211,2\n711#1:1213,6\n711#1:1219\n715#1:1220,2\n715#1:1222,6\n715#1:1228\n763#1:1229,2\n763#1:1231,6\n763#1:1237\n835#1:1238,2\n835#1:1240,6\n835#1:1246\n836#1:1247,2\n836#1:1249,6\n836#1:1255\n839#1:1256,2\n839#1:1258,6\n839#1:1264\n842#1:1265,2\n842#1:1267,6\n842#1:1273\n845#1:1274,2\n845#1:1276,6\n845#1:1282\n848#1:1283,2\n848#1:1285,6\n848#1:1291\n851#1:1292,2\n851#1:1294,6\n851#1:1300\n875#1:1301,2\n875#1:1303,6\n875#1:1309\n881#1:1310,2\n881#1:1312,6\n881#1:1318\n888#1:1319,2\n888#1:1321,6\n888#1:1327\n892#1:1328,2\n892#1:1330,6\n892#1:1336\n899#1:1337,2\n899#1:1339,6\n899#1:1345\n908#1:1346,2\n908#1:1348,6\n908#1:1354\n910#1:1355,2\n910#1:1357,6\n910#1:1363\n914#1:1364,2\n914#1:1366,6\n914#1:1372\n*E\n"})
/* loaded from: classes.dex */
final class s7 implements androidx.compose.ui.layout.m0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<i0.n, kotlin.k2> onLabelMeasured;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean singleLine;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float animationProgress;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.layout.l1 paddingValues;

    /* compiled from: OutlinedTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/p;", "intrinsicMeasurable", "", "w", "a", "(Landroidx/compose/ui/layout/p;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.p, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f14335b = new a(2);

        a() {
            super(2);
        }

        @fg.l
        public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4) {
            return Integer.valueOf(pVar.t(i4));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.p pVar, Integer num) {
            return a(pVar, num.intValue());
        }
    }

    /* compiled from: OutlinedTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/p;", "intrinsicMeasurable", "", "h", "a", "(Landroidx/compose/ui/layout/p;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.p, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f14336b = new b(2);

        b() {
            super(2);
        }

        @fg.l
        public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4) {
            return Integer.valueOf(pVar.l0(i4));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.p pVar, Integer num) {
            return a(pVar, num.intValue());
        }
    }

    /* compiled from: OutlinedTextField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f14337b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f14338c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f14339d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f14340e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f14341f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f14342g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f14343h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f14344i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f14345j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f14346k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f14347l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ s7 f14348m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.o0 f14349n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i4, int i5, androidx.compose.ui.layout.i1 i1Var, androidx.compose.ui.layout.i1 i1Var2, androidx.compose.ui.layout.i1 i1Var3, androidx.compose.ui.layout.i1 i1Var4, androidx.compose.ui.layout.i1 i1Var5, androidx.compose.ui.layout.i1 i1Var6, androidx.compose.ui.layout.i1 i1Var7, androidx.compose.ui.layout.i1 i1Var8, androidx.compose.ui.layout.i1 i1Var9, s7 s7Var, androidx.compose.ui.layout.o0 o0Var) {
            super(1);
            this.f14337b = i4;
            this.f14338c = i5;
            this.f14339d = i1Var;
            this.f14340e = i1Var2;
            this.f14341f = i1Var3;
            this.f14342g = i1Var4;
            this.f14343h = i1Var5;
            this.f14344i = i1Var6;
            this.f14345j = i1Var7;
            this.f14346k = i1Var8;
            this.f14347l = i1Var9;
            this.f14348m = s7Var;
            this.f14349n = o0Var;
        }

        public final void a(@fg.l i1.a aVar) {
            r7.o(aVar, this.f14337b, this.f14338c, this.f14339d, this.f14340e, this.f14341f, this.f14342g, this.f14343h, this.f14344i, this.f14345j, this.f14346k, this.f14347l, this.f14348m.animationProgress, this.f14348m.singleLine, this.f14349n.getDensity(), this.f14349n.getLayoutDirection(), this.f14348m.paddingValues);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: OutlinedTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/p;", "intrinsicMeasurable", "", "w", "a", "(Landroidx/compose/ui/layout/p;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.p, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f14350b = new d(2);

        d() {
            super(2);
        }

        @fg.l
        public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4) {
            return Integer.valueOf(pVar.Z(i4));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.p pVar, Integer num) {
            return a(pVar, num.intValue());
        }
    }

    /* compiled from: OutlinedTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/p;", "intrinsicMeasurable", "", "h", "a", "(Landroidx/compose/ui/layout/p;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.p, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f14351b = new e(2);

        e() {
            super(2);
        }

        @fg.l
        public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4) {
            return Integer.valueOf(pVar.k0(i4));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.p pVar, Integer num) {
            return a(pVar, num.intValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s7(@fg.l ld.l<? super i0.n, kotlin.k2> lVar, boolean z4, float f4, @fg.l androidx.compose.foundation.layout.l1 l1Var) {
        this.onLabelMeasured = lVar;
        this.singleLine = z4;
        this.animationProgress = f4;
        this.paddingValues = l1Var;
    }

    private final int m(androidx.compose.ui.layout.q qVar, List<? extends androidx.compose.ui.layout.p> list, int i4, ld.p<? super androidx.compose.ui.layout.p, ? super Integer, Integer> pVar) {
        androidx.compose.ui.layout.p pVar2;
        int i5;
        int i6;
        androidx.compose.ui.layout.p pVar3;
        int i7;
        androidx.compose.ui.layout.p pVar4;
        androidx.compose.ui.layout.p pVar5;
        int i10;
        androidx.compose.ui.layout.p pVar6;
        int i11;
        androidx.compose.ui.layout.p pVar7;
        androidx.compose.ui.layout.p pVar8;
        int k4;
        int size = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                pVar2 = null;
                break;
            }
            pVar2 = list.get(i12);
            if (kotlin.jvm.internal.l0.g(sa.f(pVar2), "Leading")) {
                break;
            }
            i12++;
        }
        androidx.compose.ui.layout.p pVar9 = pVar2;
        if (pVar9 != null) {
            i5 = r7.q(i4, pVar9.l0(Integer.MAX_VALUE));
            i6 = pVar.invoke(pVar9, Integer.valueOf(i4)).intValue();
        } else {
            i5 = i4;
            i6 = 0;
        }
        int size2 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                pVar3 = null;
                break;
            }
            pVar3 = list.get(i13);
            if (kotlin.jvm.internal.l0.g(sa.f(pVar3), "Trailing")) {
                break;
            }
            i13++;
        }
        androidx.compose.ui.layout.p pVar10 = pVar3;
        if (pVar10 != null) {
            i5 = r7.q(i5, pVar10.l0(Integer.MAX_VALUE));
            i7 = pVar.invoke(pVar10, Integer.valueOf(i4)).intValue();
        } else {
            i7 = 0;
        }
        int size3 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                pVar4 = null;
                break;
            }
            pVar4 = list.get(i14);
            if (kotlin.jvm.internal.l0.g(sa.f(pVar4), "Label")) {
                break;
            }
            i14++;
        }
        androidx.compose.ui.layout.p pVar11 = pVar4;
        int intValue = pVar11 != null ? pVar.invoke(pVar11, Integer.valueOf(androidx.compose.ui.util.d.b(i5, i4, this.animationProgress))).intValue() : 0;
        int size4 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size4) {
                pVar5 = null;
                break;
            }
            pVar5 = list.get(i15);
            if (kotlin.jvm.internal.l0.g(sa.f(pVar5), "Prefix")) {
                break;
            }
            i15++;
        }
        androidx.compose.ui.layout.p pVar12 = pVar5;
        if (pVar12 != null) {
            i10 = pVar.invoke(pVar12, Integer.valueOf(i5)).intValue();
            i5 = r7.q(i5, pVar12.l0(Integer.MAX_VALUE));
        } else {
            i10 = 0;
        }
        int size5 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size5) {
                pVar6 = null;
                break;
            }
            pVar6 = list.get(i16);
            if (kotlin.jvm.internal.l0.g(sa.f(pVar6), "Suffix")) {
                break;
            }
            i16++;
        }
        androidx.compose.ui.layout.p pVar13 = pVar6;
        if (pVar13 != null) {
            int intValue2 = pVar.invoke(pVar13, Integer.valueOf(i5)).intValue();
            i5 = r7.q(i5, pVar13.l0(Integer.MAX_VALUE));
            i11 = intValue2;
        } else {
            i11 = 0;
        }
        int size6 = list.size();
        for (int i17 = 0; i17 < size6; i17++) {
            androidx.compose.ui.layout.p pVar14 = list.get(i17);
            if (kotlin.jvm.internal.l0.g(sa.f(pVar14), "TextField")) {
                int intValue3 = pVar.invoke(pVar14, Integer.valueOf(i5)).intValue();
                int size7 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size7) {
                        pVar7 = null;
                        break;
                    }
                    pVar7 = list.get(i18);
                    if (kotlin.jvm.internal.l0.g(sa.f(pVar7), "Hint")) {
                        break;
                    }
                    i18++;
                }
                androidx.compose.ui.layout.p pVar15 = pVar7;
                int intValue4 = pVar15 != null ? pVar.invoke(pVar15, Integer.valueOf(i5)).intValue() : 0;
                int size8 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size8) {
                        pVar8 = null;
                        break;
                    }
                    androidx.compose.ui.layout.p pVar16 = list.get(i19);
                    if (kotlin.jvm.internal.l0.g(sa.f(pVar16), "Supporting")) {
                        pVar8 = pVar16;
                        break;
                    }
                    i19++;
                }
                androidx.compose.ui.layout.p pVar17 = pVar8;
                k4 = r7.k(i6, i7, i10, i11, intValue3, intValue, intValue4, pVar17 != null ? pVar.invoke(pVar17, Integer.valueOf(i4)).intValue() : 0, this.animationProgress, sa.m(), qVar.getDensity(), this.paddingValues);
                return k4;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int n(androidx.compose.ui.layout.q qVar, List<? extends androidx.compose.ui.layout.p> list, int i4, ld.p<? super androidx.compose.ui.layout.p, ? super Integer, Integer> pVar) {
        androidx.compose.ui.layout.p pVar2;
        androidx.compose.ui.layout.p pVar3;
        androidx.compose.ui.layout.p pVar4;
        androidx.compose.ui.layout.p pVar5;
        androidx.compose.ui.layout.p pVar6;
        androidx.compose.ui.layout.p pVar7;
        int l4;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            androidx.compose.ui.layout.p pVar8 = list.get(i5);
            if (kotlin.jvm.internal.l0.g(sa.f(pVar8), "TextField")) {
                int intValue = pVar.invoke(pVar8, Integer.valueOf(i4)).intValue();
                int size2 = list.size();
                int i6 = 0;
                while (true) {
                    pVar2 = null;
                    if (i6 >= size2) {
                        pVar3 = null;
                        break;
                    }
                    pVar3 = list.get(i6);
                    if (kotlin.jvm.internal.l0.g(sa.f(pVar3), "Label")) {
                        break;
                    }
                    i6++;
                }
                androidx.compose.ui.layout.p pVar9 = pVar3;
                int intValue2 = pVar9 != null ? pVar.invoke(pVar9, Integer.valueOf(i4)).intValue() : 0;
                int size3 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size3) {
                        pVar4 = null;
                        break;
                    }
                    pVar4 = list.get(i7);
                    if (kotlin.jvm.internal.l0.g(sa.f(pVar4), "Trailing")) {
                        break;
                    }
                    i7++;
                }
                androidx.compose.ui.layout.p pVar10 = pVar4;
                int intValue3 = pVar10 != null ? pVar.invoke(pVar10, Integer.valueOf(i4)).intValue() : 0;
                int size4 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size4) {
                        pVar5 = null;
                        break;
                    }
                    pVar5 = list.get(i10);
                    if (kotlin.jvm.internal.l0.g(sa.f(pVar5), "Leading")) {
                        break;
                    }
                    i10++;
                }
                androidx.compose.ui.layout.p pVar11 = pVar5;
                int intValue4 = pVar11 != null ? pVar.invoke(pVar11, Integer.valueOf(i4)).intValue() : 0;
                int size5 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size5) {
                        pVar6 = null;
                        break;
                    }
                    pVar6 = list.get(i11);
                    if (kotlin.jvm.internal.l0.g(sa.f(pVar6), "Prefix")) {
                        break;
                    }
                    i11++;
                }
                androidx.compose.ui.layout.p pVar12 = pVar6;
                int intValue5 = pVar12 != null ? pVar.invoke(pVar12, Integer.valueOf(i4)).intValue() : 0;
                int size6 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size6) {
                        pVar7 = null;
                        break;
                    }
                    pVar7 = list.get(i12);
                    if (kotlin.jvm.internal.l0.g(sa.f(pVar7), "Suffix")) {
                        break;
                    }
                    i12++;
                }
                androidx.compose.ui.layout.p pVar13 = pVar7;
                int intValue6 = pVar13 != null ? pVar.invoke(pVar13, Integer.valueOf(i4)).intValue() : 0;
                int size7 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size7) {
                        break;
                    }
                    androidx.compose.ui.layout.p pVar14 = list.get(i13);
                    if (kotlin.jvm.internal.l0.g(sa.f(pVar14), "Hint")) {
                        pVar2 = pVar14;
                        break;
                    }
                    i13++;
                }
                androidx.compose.ui.layout.p pVar15 = pVar2;
                l4 = r7.l(intValue4, intValue3, intValue5, intValue6, intValue, intValue2, pVar15 != null ? pVar.invoke(pVar15, Integer.valueOf(i4)).intValue() : 0, this.animationProgress, sa.m(), qVar.getDensity(), this.paddingValues);
                return l4;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.m0
    @fg.l
    public androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
        androidx.compose.ui.layout.l0 l0Var;
        androidx.compose.ui.layout.l0 l0Var2;
        androidx.compose.ui.layout.l0 l0Var3;
        androidx.compose.ui.layout.l0 l0Var4;
        androidx.compose.ui.layout.l0 l0Var5;
        androidx.compose.ui.layout.l0 l0Var6;
        androidx.compose.ui.layout.l0 l0Var7;
        int l4;
        int k4;
        List<? extends androidx.compose.ui.layout.l0> list2 = list;
        int q22 = o0Var.q2(this.paddingValues.getBottom());
        long e4 = androidx.compose.ui.unit.b.e(j4, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                l0Var = null;
                break;
            }
            l0Var = list2.get(i4);
            if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var), "Leading")) {
                break;
            }
            i4++;
        }
        androidx.compose.ui.layout.l0 l0Var8 = l0Var;
        androidx.compose.ui.layout.i1 m02 = l0Var8 != null ? l0Var8.m0(e4) : null;
        int o4 = sa.o(m02);
        int max = Math.max(0, sa.n(m02));
        int size2 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size2) {
                l0Var2 = null;
                break;
            }
            l0Var2 = list2.get(i5);
            if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var2), "Trailing")) {
                break;
            }
            i5++;
        }
        androidx.compose.ui.layout.l0 l0Var9 = l0Var2;
        androidx.compose.ui.layout.i1 m03 = l0Var9 != null ? l0Var9.m0(androidx.compose.ui.unit.c.j(e4, -o4, 0, 2, null)) : null;
        int o5 = sa.o(m03) + o4;
        int max2 = Math.max(max, sa.n(m03));
        int size3 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size3) {
                l0Var3 = null;
                break;
            }
            l0Var3 = list2.get(i6);
            if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var3), "Prefix")) {
                break;
            }
            i6++;
        }
        androidx.compose.ui.layout.l0 l0Var10 = l0Var3;
        androidx.compose.ui.layout.i1 m04 = l0Var10 != null ? l0Var10.m0(androidx.compose.ui.unit.c.j(e4, -o5, 0, 2, null)) : null;
        int o6 = sa.o(m04) + o5;
        int max3 = Math.max(max2, sa.n(m04));
        int size4 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size4) {
                l0Var4 = null;
                break;
            }
            l0Var4 = list2.get(i7);
            if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var4), "Suffix")) {
                break;
            }
            i7++;
        }
        androidx.compose.ui.layout.l0 l0Var11 = l0Var4;
        androidx.compose.ui.layout.i1 m05 = l0Var11 != null ? l0Var11.m0(androidx.compose.ui.unit.c.j(e4, -o6, 0, 2, null)) : null;
        int o7 = sa.o(m05) + o6;
        int max4 = Math.max(max3, sa.n(m05));
        int q23 = o0Var.q2(this.paddingValues.c(o0Var.getLayoutDirection())) + o0Var.q2(this.paddingValues.b(o0Var.getLayoutDirection()));
        int i10 = -o7;
        int b5 = androidx.compose.ui.util.d.b(i10 - q23, -q23, this.animationProgress);
        int i11 = -q22;
        long i12 = androidx.compose.ui.unit.c.i(e4, b5, i11);
        int size5 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size5) {
                l0Var5 = null;
                break;
            }
            androidx.compose.ui.layout.l0 l0Var12 = list2.get(i13);
            int i14 = size5;
            if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var12), "Label")) {
                l0Var5 = l0Var12;
                break;
            }
            i13++;
            size5 = i14;
        }
        androidx.compose.ui.layout.l0 l0Var13 = l0Var5;
        androidx.compose.ui.layout.i1 m06 = l0Var13 != null ? l0Var13.m0(i12) : null;
        if (m06 != null) {
            this.onLabelMeasured.invoke(i0.n.c(i0.o.a(m06.getWidth(), m06.getHeight())));
        }
        int size6 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size6) {
                l0Var6 = null;
                break;
            }
            l0Var6 = list2.get(i15);
            int i16 = size6;
            if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var6), "Supporting")) {
                break;
            }
            i15++;
            size6 = i16;
        }
        androidx.compose.ui.layout.l0 l0Var14 = l0Var6;
        int Z = l0Var14 != null ? l0Var14.Z(androidx.compose.ui.unit.b.r(j4)) : 0;
        int max5 = Math.max(sa.n(m06) / 2, o0Var.q2(this.paddingValues.getTop()));
        long e5 = androidx.compose.ui.unit.b.e(androidx.compose.ui.unit.c.i(j4, i10, (i11 - max5) - Z), 0, 0, 0, 0, 11, null);
        int size7 = list.size();
        int i17 = 0;
        while (i17 < size7) {
            int i18 = size7;
            androidx.compose.ui.layout.l0 l0Var15 = list2.get(i17);
            int i19 = i17;
            if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var15), "TextField")) {
                androidx.compose.ui.layout.i1 m07 = l0Var15.m0(e5);
                long e6 = androidx.compose.ui.unit.b.e(e5, 0, 0, 0, 0, 14, null);
                int size8 = list.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size8) {
                        l0Var7 = null;
                        break;
                    }
                    l0Var7 = list2.get(i20);
                    int i21 = size8;
                    if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var7), "Hint")) {
                        break;
                    }
                    i20++;
                    list2 = list;
                    size8 = i21;
                }
                androidx.compose.ui.layout.l0 l0Var16 = l0Var7;
                androidx.compose.ui.layout.i1 m08 = l0Var16 != null ? l0Var16.m0(e6) : null;
                int max6 = Math.max(max4, Math.max(sa.n(m07), sa.n(m08)) + max5 + q22);
                l4 = r7.l(sa.o(m02), sa.o(m03), sa.o(m04), sa.o(m05), m07.getWidth(), sa.o(m06), sa.o(m08), this.animationProgress, j4, o0Var.getDensity(), this.paddingValues);
                androidx.compose.ui.layout.i1 m09 = l0Var14 != null ? l0Var14.m0(androidx.compose.ui.unit.b.e(androidx.compose.ui.unit.c.j(e4, 0, -max6, 1, null), 0, l4, 0, 0, 9, null)) : null;
                int n4 = sa.n(m09);
                k4 = r7.k(sa.n(m02), sa.n(m03), sa.n(m04), sa.n(m05), m07.getHeight(), sa.n(m06), sa.n(m08), sa.n(m09), this.animationProgress, j4, o0Var.getDensity(), this.paddingValues);
                int i22 = k4 - n4;
                int size9 = list.size();
                for (int i23 = 0; i23 < size9; i23++) {
                    androidx.compose.ui.layout.l0 l0Var17 = list.get(i23);
                    if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var17), "Container")) {
                        return androidx.compose.ui.layout.o0.x2(o0Var, l4, k4, null, new c(k4, l4, m02, m03, m04, m05, m07, m06, m08, l0Var17.m0(androidx.compose.ui.unit.c.a(l4 != Integer.MAX_VALUE ? l4 : 0, l4, i22 != Integer.MAX_VALUE ? i22 : 0, i22)), m09, this, o0Var), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i17 = i19 + 1;
            size7 = i18;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.m0
    public int b(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
        return n(qVar, list, i4, b.f14336b);
    }

    @Override // androidx.compose.ui.layout.m0
    public int c(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
        return m(qVar, list, i4, d.f14350b);
    }

    @Override // androidx.compose.ui.layout.m0
    public int d(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
        return n(qVar, list, i4, e.f14351b);
    }

    @Override // androidx.compose.ui.layout.m0
    public int e(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
        return m(qVar, list, i4, a.f14335b);
    }
}
