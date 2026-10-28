package androidx.compose.material3;

import androidx.compose.ui.layout.i1;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: TextField.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ?\u0010\u0011\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0015\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0014\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u001c\u001a\u00020\u001b*\u00020\u00172\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001e\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010 \u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010\u001fJ)\u0010!\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u001fJ)\u0010\"\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010%\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/material3/ua;", "Landroidx/compose/ui/layout/m0;", "", "singleLine", "", "animationProgress", "Landroidx/compose/foundation/layout/l1;", "paddingValues", "<init>", "(ZFLandroidx/compose/foundation/layout/l1;)V", "", "Landroidx/compose/ui/layout/p;", "measurables", "", "height", "Lkotlin/Function2;", "intrinsicMeasurer", "n", "(Ljava/util/List;ILld/p;)I", "Landroidx/compose/ui/layout/q;", "width", "m", "(Landroidx/compose/ui/layout/q;Ljava/util/List;ILld/p;)I", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;", "e", "(Landroidx/compose/ui/layout/q;Ljava/util/List;I)I", "c", "b", "d", "Z", "F", "Landroidx/compose/foundation/layout/l1;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1164:1\n116#2,2:1165\n33#2,6:1167\n118#2:1173\n116#2,2:1174\n33#2,6:1176\n118#2:1182\n116#2,2:1183\n33#2,6:1185\n118#2:1191\n116#2,2:1192\n33#2,6:1194\n118#2:1200\n116#2,2:1201\n33#2,6:1203\n118#2:1209\n116#2,2:1210\n33#2,6:1212\n118#2:1218\n544#2,2:1219\n33#2,6:1221\n546#2:1227\n116#2,2:1228\n33#2,6:1230\n118#2:1236\n544#2,2:1237\n33#2,6:1239\n546#2:1245\n544#2,2:1246\n33#2,6:1248\n546#2:1254\n116#2,2:1255\n33#2,6:1257\n118#2:1263\n116#2,2:1264\n33#2,6:1266\n118#2:1272\n116#2,2:1273\n33#2,6:1275\n118#2:1281\n116#2,2:1282\n33#2,6:1284\n118#2:1290\n116#2,2:1291\n33#2,6:1293\n118#2:1299\n116#2,2:1300\n33#2,6:1302\n118#2:1308\n116#2,2:1309\n33#2,6:1311\n118#2:1317\n116#2,2:1318\n33#2,6:1320\n118#2:1326\n116#2,2:1327\n33#2,6:1329\n118#2:1335\n116#2,2:1336\n33#2,6:1338\n118#2:1344\n116#2,2:1345\n33#2,6:1347\n118#2:1353\n544#2,2:1354\n33#2,6:1356\n546#2:1362\n116#2,2:1363\n33#2,6:1365\n118#2:1371\n116#2,2:1372\n33#2,6:1374\n118#2:1380\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldMeasurePolicy\n*L\n653#1:1165,2\n653#1:1167,6\n653#1:1173\n658#1:1174,2\n658#1:1176,6\n658#1:1182\n664#1:1183,2\n664#1:1185,6\n664#1:1191\n670#1:1192,2\n670#1:1194,6\n670#1:1200\n682#1:1201,2\n682#1:1203,6\n682#1:1209\n686#1:1210,2\n686#1:1212,6\n686#1:1218\n699#1:1219,2\n699#1:1221,6\n699#1:1227\n705#1:1228,2\n705#1:1230,6\n705#1:1236\n747#1:1237,2\n747#1:1239,6\n747#1:1245\n838#1:1246,2\n838#1:1248,6\n838#1:1254\n839#1:1255,2\n839#1:1257,6\n839#1:1263\n842#1:1264,2\n842#1:1266,6\n842#1:1272\n845#1:1273,2\n845#1:1275,6\n845#1:1281\n848#1:1282,2\n848#1:1284,6\n848#1:1290\n851#1:1291,2\n851#1:1293,6\n851#1:1299\n854#1:1300,2\n854#1:1302,6\n854#1:1308\n875#1:1309,2\n875#1:1311,6\n875#1:1317\n881#1:1318,2\n881#1:1320,6\n881#1:1326\n887#1:1327,2\n887#1:1329,6\n887#1:1335\n891#1:1336,2\n891#1:1338,6\n891#1:1344\n898#1:1345,2\n898#1:1347,6\n898#1:1353\n907#1:1354,2\n907#1:1356,6\n907#1:1362\n908#1:1363,2\n908#1:1365,6\n908#1:1371\n912#1:1372,2\n912#1:1374,6\n912#1:1380\n*E\n"})
/* loaded from: classes.dex */
final class ua implements androidx.compose.ui.layout.m0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean singleLine;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float animationProgress;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.layout.l1 paddingValues;

    /* compiled from: TextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/p;", "intrinsicMeasurable", "", "w", "a", "(Landroidx/compose/ui/layout/p;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.p, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f14973b = new a(2);

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

    /* compiled from: TextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/p;", "intrinsicMeasurable", "", "h", "a", "(Landroidx/compose/ui/layout/p;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.p, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f14974b = new b(2);

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

    /* compiled from: TextField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f14975b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f14976c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f14977d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f14978e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f14979f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f14980g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f14981h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f14982i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f14983j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f14984k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f14985l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ua f14986m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f14987n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.o0 f14988o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.layout.i1 i1Var, int i4, int i5, androidx.compose.ui.layout.i1 i1Var2, androidx.compose.ui.layout.i1 i1Var3, androidx.compose.ui.layout.i1 i1Var4, androidx.compose.ui.layout.i1 i1Var5, androidx.compose.ui.layout.i1 i1Var6, androidx.compose.ui.layout.i1 i1Var7, androidx.compose.ui.layout.i1 i1Var8, androidx.compose.ui.layout.i1 i1Var9, ua uaVar, int i6, androidx.compose.ui.layout.o0 o0Var) {
            super(1);
            this.f14975b = i1Var;
            this.f14976c = i4;
            this.f14977d = i5;
            this.f14978e = i1Var2;
            this.f14979f = i1Var3;
            this.f14980g = i1Var4;
            this.f14981h = i1Var5;
            this.f14982i = i1Var6;
            this.f14983j = i1Var7;
            this.f14984k = i1Var8;
            this.f14985l = i1Var9;
            this.f14986m = uaVar;
            this.f14987n = i6;
            this.f14988o = o0Var;
        }

        public final void a(@fg.l i1.a aVar) {
            androidx.compose.ui.layout.i1 i1Var = this.f14975b;
            if (i1Var == null) {
                ta.p(aVar, this.f14976c, this.f14977d, this.f14978e, this.f14979f, this.f14980g, this.f14981h, this.f14982i, this.f14983j, this.f14984k, this.f14985l, this.f14986m.singleLine, this.f14988o.getDensity(), this.f14986m.paddingValues);
                return;
            }
            int i4 = this.f14976c;
            int i5 = this.f14977d;
            androidx.compose.ui.layout.i1 i1Var2 = this.f14978e;
            androidx.compose.ui.layout.i1 i1Var3 = this.f14979f;
            androidx.compose.ui.layout.i1 i1Var4 = this.f14980g;
            androidx.compose.ui.layout.i1 i1Var5 = this.f14981h;
            androidx.compose.ui.layout.i1 i1Var6 = this.f14982i;
            androidx.compose.ui.layout.i1 i1Var7 = this.f14983j;
            androidx.compose.ui.layout.i1 i1Var8 = this.f14984k;
            androidx.compose.ui.layout.i1 i1Var9 = this.f14985l;
            boolean z4 = this.f14986m.singleLine;
            int i6 = this.f14987n;
            ta.o(aVar, i4, i5, i1Var2, i1Var, i1Var3, i1Var4, i1Var5, i1Var6, i1Var7, i1Var8, i1Var9, z4, i6, this.f14975b.getHeight() + i6, this.f14986m.animationProgress, this.f14988o.getDensity());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/p;", "intrinsicMeasurable", "", "w", "a", "(Landroidx/compose/ui/layout/p;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.p, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f14989b = new d(2);

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

    /* compiled from: TextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/p;", "intrinsicMeasurable", "", "h", "a", "(Landroidx/compose/ui/layout/p;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.p, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f14990b = new e(2);

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

    public ua(boolean z4, float f4, @fg.l androidx.compose.foundation.layout.l1 l1Var) {
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
            i5 = ta.r(i4, pVar9.l0(Integer.MAX_VALUE));
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
            i5 = ta.r(i5, pVar10.l0(Integer.MAX_VALUE));
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
        int intValue = pVar11 != null ? pVar.invoke(pVar11, Integer.valueOf(i5)).intValue() : 0;
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
            int intValue2 = pVar.invoke(pVar12, Integer.valueOf(i5)).intValue();
            i5 = ta.r(i5, pVar12.l0(Integer.MAX_VALUE));
            i10 = intValue2;
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
            i11 = pVar.invoke(pVar13, Integer.valueOf(i5)).intValue();
            i5 = ta.r(i5, pVar13.l0(Integer.MAX_VALUE));
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
                    pVar8 = list.get(i19);
                    if (kotlin.jvm.internal.l0.g(sa.f(pVar8), "Supporting")) {
                        break;
                    }
                    i19++;
                }
                androidx.compose.ui.layout.p pVar16 = pVar8;
                k4 = ta.k(intValue3, intValue, i6, i7, i10, i11, intValue4, pVar16 != null ? pVar.invoke(pVar16, Integer.valueOf(i4)).intValue() : 0, this.animationProgress, sa.m(), qVar.getDensity(), this.paddingValues);
                return k4;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int n(List<? extends androidx.compose.ui.layout.p> measurables, int height, ld.p<? super androidx.compose.ui.layout.p, ? super Integer, Integer> intrinsicMeasurer) {
        androidx.compose.ui.layout.p pVar;
        androidx.compose.ui.layout.p pVar2;
        androidx.compose.ui.layout.p pVar3;
        androidx.compose.ui.layout.p pVar4;
        androidx.compose.ui.layout.p pVar5;
        androidx.compose.ui.layout.p pVar6;
        int l4;
        int size = measurables.size();
        for (int i4 = 0; i4 < size; i4++) {
            androidx.compose.ui.layout.p pVar7 = measurables.get(i4);
            if (kotlin.jvm.internal.l0.g(sa.f(pVar7), "TextField")) {
                int intValue = intrinsicMeasurer.invoke(pVar7, Integer.valueOf(height)).intValue();
                int size2 = measurables.size();
                int i5 = 0;
                while (true) {
                    pVar = null;
                    if (i5 >= size2) {
                        pVar2 = null;
                        break;
                    }
                    pVar2 = measurables.get(i5);
                    if (kotlin.jvm.internal.l0.g(sa.f(pVar2), "Label")) {
                        break;
                    }
                    i5++;
                }
                androidx.compose.ui.layout.p pVar8 = pVar2;
                int intValue2 = pVar8 != null ? intrinsicMeasurer.invoke(pVar8, Integer.valueOf(height)).intValue() : 0;
                int size3 = measurables.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size3) {
                        pVar3 = null;
                        break;
                    }
                    pVar3 = measurables.get(i6);
                    if (kotlin.jvm.internal.l0.g(sa.f(pVar3), "Trailing")) {
                        break;
                    }
                    i6++;
                }
                androidx.compose.ui.layout.p pVar9 = pVar3;
                int intValue3 = pVar9 != null ? intrinsicMeasurer.invoke(pVar9, Integer.valueOf(height)).intValue() : 0;
                int size4 = measurables.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size4) {
                        pVar4 = null;
                        break;
                    }
                    pVar4 = measurables.get(i7);
                    if (kotlin.jvm.internal.l0.g(sa.f(pVar4), "Prefix")) {
                        break;
                    }
                    i7++;
                }
                androidx.compose.ui.layout.p pVar10 = pVar4;
                int intValue4 = pVar10 != null ? intrinsicMeasurer.invoke(pVar10, Integer.valueOf(height)).intValue() : 0;
                int size5 = measurables.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size5) {
                        pVar5 = null;
                        break;
                    }
                    pVar5 = measurables.get(i10);
                    if (kotlin.jvm.internal.l0.g(sa.f(pVar5), "Suffix")) {
                        break;
                    }
                    i10++;
                }
                androidx.compose.ui.layout.p pVar11 = pVar5;
                int intValue5 = pVar11 != null ? intrinsicMeasurer.invoke(pVar11, Integer.valueOf(height)).intValue() : 0;
                int size6 = measurables.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size6) {
                        pVar6 = null;
                        break;
                    }
                    pVar6 = measurables.get(i11);
                    if (kotlin.jvm.internal.l0.g(sa.f(pVar6), "Leading")) {
                        break;
                    }
                    i11++;
                }
                androidx.compose.ui.layout.p pVar12 = pVar6;
                int intValue6 = pVar12 != null ? intrinsicMeasurer.invoke(pVar12, Integer.valueOf(height)).intValue() : 0;
                int size7 = measurables.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size7) {
                        break;
                    }
                    androidx.compose.ui.layout.p pVar13 = measurables.get(i12);
                    if (kotlin.jvm.internal.l0.g(sa.f(pVar13), "Hint")) {
                        pVar = pVar13;
                        break;
                    }
                    i12++;
                }
                androidx.compose.ui.layout.p pVar14 = pVar;
                l4 = ta.l(intValue6, intValue3, intValue4, intValue5, intValue, intValue2, pVar14 != null ? intrinsicMeasurer.invoke(pVar14, Integer.valueOf(height)).intValue() : 0, sa.m());
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
        int q22 = o0Var.q2(this.paddingValues.getTop());
        int q23 = o0Var.q2(this.paddingValues.getBottom());
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
            int i10 = size4;
            if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var4), "Suffix")) {
                break;
            }
            i7++;
            size4 = i10;
        }
        androidx.compose.ui.layout.l0 l0Var11 = l0Var4;
        androidx.compose.ui.layout.i1 m05 = l0Var11 != null ? l0Var11.m0(androidx.compose.ui.unit.c.j(e4, -o6, 0, 2, null)) : null;
        int o7 = sa.o(m05) + o6;
        int max4 = Math.max(max3, sa.n(m05));
        int i11 = -o7;
        long i12 = androidx.compose.ui.unit.c.i(e4, i11, -q23);
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
        int n4 = sa.n(m06) + q22;
        long i17 = androidx.compose.ui.unit.c.i(androidx.compose.ui.unit.b.e(j4, 0, 0, 0, 0, 11, null), i11, ((-n4) - q23) - Z);
        int size7 = list.size();
        int i18 = 0;
        while (i18 < size7) {
            int i19 = size7;
            androidx.compose.ui.layout.l0 l0Var15 = list2.get(i18);
            int i20 = i18;
            if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var15), "TextField")) {
                androidx.compose.ui.layout.i1 m07 = l0Var15.m0(i17);
                long e5 = androidx.compose.ui.unit.b.e(i17, 0, 0, 0, 0, 14, null);
                int size8 = list.size();
                int i21 = 0;
                while (true) {
                    if (i21 >= size8) {
                        l0Var7 = null;
                        break;
                    }
                    l0Var7 = list2.get(i21);
                    int i22 = size8;
                    if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var7), "Hint")) {
                        break;
                    }
                    i21++;
                    list2 = list;
                    size8 = i22;
                }
                androidx.compose.ui.layout.l0 l0Var16 = l0Var7;
                androidx.compose.ui.layout.i1 m08 = l0Var16 != null ? l0Var16.m0(e5) : null;
                int max5 = Math.max(max4, Math.max(sa.n(m07), sa.n(m08)) + n4 + q23);
                l4 = ta.l(sa.o(m02), sa.o(m03), sa.o(m04), sa.o(m05), m07.getWidth(), sa.o(m06), sa.o(m08), j4);
                androidx.compose.ui.layout.i1 m09 = l0Var14 != null ? l0Var14.m0(androidx.compose.ui.unit.b.e(androidx.compose.ui.unit.c.j(e4, 0, -max5, 1, null), 0, l4, 0, 0, 9, null)) : null;
                int n5 = sa.n(m09);
                k4 = ta.k(m07.getHeight(), sa.n(m06), sa.n(m02), sa.n(m03), sa.n(m04), sa.n(m05), sa.n(m08), sa.n(m09), this.animationProgress, j4, o0Var.getDensity(), this.paddingValues);
                int i23 = k4 - n5;
                int size9 = list.size();
                for (int i24 = 0; i24 < size9; i24++) {
                    androidx.compose.ui.layout.l0 l0Var17 = list.get(i24);
                    if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var17), "Container")) {
                        return androidx.compose.ui.layout.o0.x2(o0Var, l4, k4, null, new c(m06, l4, k4, m07, m08, m02, m03, m04, m05, l0Var17.m0(androidx.compose.ui.unit.c.a(l4 != Integer.MAX_VALUE ? l4 : 0, l4, i23 != Integer.MAX_VALUE ? i23 : 0, i23)), m09, this, q22, o0Var), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i18 = i20 + 1;
            size7 = i19;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.m0
    public int b(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
        return n(list, i4, b.f14974b);
    }

    @Override // androidx.compose.ui.layout.m0
    public int c(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
        return m(qVar, list, i4, d.f14989b);
    }

    @Override // androidx.compose.ui.layout.m0
    public int d(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
        return n(list, i4, e.f14990b);
    }

    @Override // androidx.compose.ui.layout.m0
    public int e(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
        return m(qVar, list, i4, a.f14973b);
    }
}
