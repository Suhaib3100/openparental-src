package androidx.compose.material3;

import androidx.compose.material3.t9;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import androidx.compose.ui.t;
import java.util.List;
import kotlin.Metadata;

/* compiled from: NavigationDrawer.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a`\u0010\u0013\u001a\u00020\t2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001aS\u0010\u0015\u001a\u00020\t2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a?\u0010\u0017\u001a\u00020\t2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001al\u0010#\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0002\b\n¢\u0006\u0002\b\"H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001al\u0010%\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0002\b\n¢\u0006\u0002\b\"H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010$\u001al\u0010&\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0002\b\n¢\u0006\u0002\b\"H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010$\u001aj\u0010'\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0002\b\n¢\u0006\u0002\b\"H\u0003ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a\u008e\u0001\u00103\u001a\u00020\t2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\u0006\u0010*\u001a\u00020\u00032\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\r\u001a\u00020\f2\u0015\b\u0002\u0010,\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n2\u0015\b\u0002\u0010-\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n2\b\b\u0002\u0010.\u001a\u00020\u00192\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00102\u001a\u000201H\u0007¢\u0006\u0004\b3\u00104\u001a'\u00107\u001a\u0002052\u0006\u0010%\u001a\u0002052\u0006\u0010\u0015\u001a\u0002052\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108\u001a>\u0010=\u001a\u00020\t2\u0006\u00109\u001a\u00020\u00032\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010;\u001a\b\u0012\u0004\u0012\u0002050\b2\u0006\u0010<\u001a\u00020\u0010H\u0003ø\u0001\u0000¢\u0006\u0004\b=\u0010>\"\u0014\u0010@\u001a\u0002058\u0002X\u0082D¢\u0006\u0006\n\u0004\b%\u0010?\"\u0014\u0010A\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010?\"\u0014\u0010B\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010?\"\u001a\u0010E\u001a\b\u0012\u0004\u0012\u0002050C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010D\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006F"}, d2 = {"Landroidx/compose/material3/x4;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material3/w4;", "r", "(Landroidx/compose/material3/x4;Lld/l;Landroidx/compose/runtime/t;II)Landroidx/compose/material3/w4;", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "drawerContent", "Landroidx/compose/ui/q;", "modifier", "drawerState", "gesturesEnabled", "Landroidx/compose/ui/graphics/d2;", "scrimColor", "content", "e", "(Lld/p;Landroidx/compose/ui/q;Landroidx/compose/material3/w4;ZJLld/p;Landroidx/compose/runtime/t;II)V", "b", "(Lld/p;Landroidx/compose/ui/q;Landroidx/compose/material3/w4;ZLld/p;Landroidx/compose/runtime/t;II)V", "h", "(Lld/p;Landroidx/compose/ui/q;Lld/p;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/ui/graphics/e6;", "drawerShape", "drawerContainerColor", "drawerContentColor", "Landroidx/compose/ui/unit/h;", "drawerTonalElevation", "Landroidx/compose/foundation/layout/n2;", "windowInsets", "Landroidx/compose/foundation/layout/u;", "Lkotlin/u;", "d", "(Landroidx/compose/ui/q;Landroidx/compose/ui/graphics/e6;JJFLandroidx/compose/foundation/layout/n2;Lld/q;Landroidx/compose/runtime/t;II)V", "a", "g", "c", "(Landroidx/compose/foundation/layout/n2;Landroidx/compose/ui/q;Landroidx/compose/ui/graphics/e6;JJFLld/q;Landroidx/compose/runtime/t;II)V", "label", "selected", "onClick", "icon", "badge", "shape", "Landroidx/compose/material3/j7;", "colors", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "f", "(Lld/p;ZLld/a;Landroidx/compose/ui/q;Lld/p;Lld/p;Landroidx/compose/ui/graphics/e6;Landroidx/compose/material3/j7;Landroidx/compose/foundation/interaction/k;Landroidx/compose/runtime/t;II)V", "", "pos", "q", "(FFF)F", "open", "onClose", "fraction", "color", "i", "(ZLld/a;Lld/a;JLandroidx/compose/runtime/t;I)V", "F", "DrawerPositionalThreshold", "DrawerVelocityThreshold", "MinimumDrawerWidth", "Landroidx/compose/animation/core/h2;", "Landroidx/compose/animation/core/h2;", "AnimationSpec", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 11 Composer.kt\nandroidx/compose/runtime/Updater\n+ 12 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 13 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,948:1\n1116#2,6:949\n1116#2,3:960\n1119#2,3:966\n1116#2,6:973\n1116#2,6:1056\n1116#2,6:1062\n1116#2,6:1068\n1116#2,6:1074\n1116#2,6:1126\n1116#2,3:1137\n1119#2,3:1143\n1116#2,6:1184\n1116#2,6:1221\n1116#2,6:1399\n1116#2,6:1405\n1116#2,6:1412\n1116#2,6:1418\n1116#2,6:1424\n487#3,4:955\n491#3,2:963\n495#3:969\n487#3,4:1132\n491#3,2:1140\n495#3:1146\n25#4:959\n456#4,8:997\n464#4,3:1011\n456#4,8:1033\n464#4,3:1047\n467#4,3:1051\n456#4,8:1097\n464#4,3:1111\n467#4,3:1115\n467#4,3:1120\n25#4:1136\n456#4,8:1166\n464#4,3:1180\n456#4,8:1204\n464#4,3:1218\n456#4,8:1244\n464#4,3:1258\n467#4,3:1262\n456#4,8:1285\n464#4,3:1299\n467#4,3:1303\n467#4,3:1308\n467#4,3:1312\n456#4,8:1334\n464#4,3:1348\n456#4,8:1370\n464#4,3:1384\n467#4,3:1388\n467#4,3:1393\n487#5:965\n487#5:1142\n162#6:970\n162#6:1147\n162#6:1398\n163#6:1411\n74#7:971\n74#7:979\n74#7:1125\n74#7:1148\n1#8:972\n68#9,6:980\n74#9:1014\n67#9,7:1015\n74#9:1050\n78#9:1055\n68#9,6:1080\n74#9:1114\n78#9:1119\n78#9:1124\n68#9,6:1149\n74#9:1183\n68#9,6:1227\n74#9:1261\n78#9:1266\n67#9,7:1267\n74#9:1302\n78#9:1307\n78#9:1316\n67#9,7:1352\n74#9:1387\n78#9:1392\n78#10,11:986\n78#10,11:1022\n91#10:1054\n78#10,11:1086\n91#10:1118\n91#10:1123\n78#10,11:1155\n75#10,14:1190\n78#10,11:1233\n91#10:1265\n78#10,11:1274\n91#10:1306\n91#10:1311\n91#10:1315\n78#10,11:1323\n78#10,11:1359\n91#10:1391\n91#10:1396\n3737#11,6:1005\n3737#11,6:1041\n3737#11,6:1105\n3737#11,6:1174\n3737#11,6:1212\n3737#11,6:1252\n3737#11,6:1293\n3737#11,6:1342\n3737#11,6:1378\n87#12,6:1317\n93#12:1351\n97#12:1397\n154#13:1430\n154#13:1431\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt\n*L\n281#1:949,6\n315#1:960,3\n315#1:966,3\n321#1:973,6\n347#1:1056,6\n355#1:1062,6\n362#1:1068,6\n369#1:1074,6\n423#1:1126,6\n433#1:1137,3\n433#1:1143,3\n465#1:1184,6\n447#1:1221,6\n613#1:1399,6\n732#1:1405,6\n923#1:1412,6\n924#1:1418,6\n936#1:1424,6\n315#1:955,4\n315#1:963,2\n315#1:969\n433#1:1132,4\n433#1:1140,2\n433#1:1146\n315#1:959\n332#1:997,8\n332#1:1011,3\n342#1:1033,8\n342#1:1047,3\n342#1:1051,3\n360#1:1097,8\n360#1:1111,3\n360#1:1115,3\n332#1:1120,3\n433#1:1136\n437#1:1166,8\n437#1:1180,3\n446#1:1204,8\n446#1:1218,3\n447#1:1244,8\n447#1:1258,3\n447#1:1262,3\n462#1:1285,8\n462#1:1299,3\n462#1:1303,3\n446#1:1308,3\n437#1:1312,3\n502#1:1334,8\n502#1:1348,3\n504#1:1370,8\n504#1:1384,3\n504#1:1388,3\n502#1:1393,3\n315#1:965\n433#1:1142\n316#1:970\n434#1:1147\n610#1:1398\n920#1:1411\n317#1:971\n331#1:979\n417#1:1125\n436#1:1148\n332#1:980,6\n332#1:1014\n342#1:1015,7\n342#1:1050\n342#1:1055\n360#1:1080,6\n360#1:1114\n360#1:1119\n332#1:1124\n437#1:1149,6\n437#1:1183\n447#1:1227,6\n447#1:1261\n447#1:1266\n462#1:1267,7\n462#1:1302\n462#1:1307\n437#1:1316\n504#1:1352,7\n504#1:1387\n504#1:1392\n332#1:986,11\n342#1:1022,11\n342#1:1054\n360#1:1086,11\n360#1:1118\n332#1:1123\n437#1:1155,11\n446#1:1190,14\n447#1:1233,11\n447#1:1265\n462#1:1274,11\n462#1:1306\n446#1:1311\n437#1:1315\n502#1:1323,11\n504#1:1359,11\n504#1:1391\n502#1:1396\n332#1:1005,6\n342#1:1041,6\n360#1:1105,6\n437#1:1174,6\n446#1:1212,6\n447#1:1252,6\n462#1:1293,6\n502#1:1342,6\n504#1:1378,6\n502#1:1317,6\n502#1:1351\n502#1:1397\n942#1:1430\n943#1:1431\n*E\n"})
/* loaded from: classes.dex */
public final class l7 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f12190a = 0.5f;

    /* renamed from: b, reason: collision with root package name */
    private static final float f12191b = androidx.compose.ui.unit.h.g(400);

    /* renamed from: c, reason: collision with root package name */
    private static final float f12192c = 240;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.animation.core.h2<Float> f12193d = new androidx.compose.animation.core.h2<>(256, 0, null, 6, null);

    /* compiled from: NavigationDrawer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12194b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f12195c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f12196d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f12197e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f12198f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f12199g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f12200h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f12201i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f12202j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.q qVar, androidx.compose.ui.graphics.e6 e6Var, long j4, long j5, float f4, androidx.compose.foundation.layout.n2 n2Var, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f12194b = qVar;
            this.f12195c = e6Var;
            this.f12196d = j4;
            this.f12197e = j5;
            this.f12198f = f4;
            this.f12199g = n2Var;
            this.f12200h = qVar2;
            this.f12201i = i4;
            this.f12202j = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            l7.a(this.f12194b, this.f12195c, this.f12196d, this.f12197e, this.f12198f, this.f12199g, this.f12200h, tVar, androidx.compose.runtime.g3.b(this.f12201i | 1), this.f12202j);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w4 f12203b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.unit.d f12204c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f12205d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f12206e;

        /* compiled from: NavigationDrawer.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/u4;", "Landroidx/compose/material3/x4;", "Lkotlin/k2;", "a", "(Landroidx/compose/material3/u4;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<u4<x4>, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f12207b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f12208c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(float f4, float f5) {
                super(1);
                this.f12207b = f4;
                this.f12208c = f5;
            }

            public final void a(@fg.l u4<x4> u4Var) {
                u4Var.a(x4.Closed, this.f12207b);
                u4Var.a(x4.Open, this.f12208c);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(u4<x4> u4Var) {
                a(u4Var);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(w4 w4Var, androidx.compose.ui.unit.d dVar, float f4, float f5) {
            super(0);
            this.f12203b = w4Var;
            this.f12204c = dVar;
            this.f12205d = f4;
            this.f12206e = f5;
        }

        public final void a() {
            this.f12203b.t(this.f12204c);
            androidx.compose.material3.k.N(this.f12203b.g(), androidx.compose.material3.j.a(new a(this.f12205d, this.f12206e)), null, 2, null);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12209b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w4 f12210c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f12211d;

        /* compiled from: NavigationDrawer.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ w4 f12212b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.r0 f12213c;

            /* compiled from: NavigationDrawer.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1$1$1", f = "NavigationDrawer.kt", i = {}, l = {455}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.l7$c$a$a, reason: collision with other inner class name */
            static final class C0270a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f12214b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ w4 f12215c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0270a(w4 w4Var, kotlin.coroutines.d<? super C0270a> dVar) {
                    super(2, dVar);
                    this.f12215c = w4Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new C0270a(this.f12215c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f12214b;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        w4 w4Var = this.f12215c;
                        this.f12214b = 1;
                        if (w4Var.f(this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                    }
                    return kotlin.k2.f75408a;
                }

                @Override // ld.p
                @fg.m
                public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                    return ((C0270a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w4 w4Var, kotlinx.coroutines.r0 r0Var) {
                super(0);
                this.f12212b = w4Var;
                this.f12213c = r0Var;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                if (this.f12212b.g().s().invoke(x4.Closed).booleanValue()) {
                    kotlinx.coroutines.k.f(this.f12213c, null, null, new C0270a(this.f12212b, null), 3, null);
                }
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, w4 w4Var, kotlinx.coroutines.r0 r0Var) {
            super(1);
            this.f12209b = str;
            this.f12210c = w4Var;
            this.f12211d = r0Var;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.h1(zVar, this.f12209b);
            if (this.f12210c.p()) {
                androidx.compose.ui.semantics.w.p(zVar, null, new a(this.f12210c, this.f12211d), 1, null);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    static final class d implements androidx.compose.ui.layout.m0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w4 f12216a;

        /* compiled from: NavigationDrawer.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f12217b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f12218c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ w4 f12219d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.layout.i1 i1Var, androidx.compose.ui.layout.i1 i1Var2, w4 w4Var) {
                super(1);
                this.f12217b = i1Var;
                this.f12218c = i1Var2;
                this.f12219d = w4Var;
            }

            public final void a(@fg.l i1.a aVar) {
                i1.a.m(aVar, this.f12217b, kotlin.math.b.L0(this.f12219d.s()) + this.f12218c.getWidth(), 0, 0.0f, 4, null);
                i1.a.m(aVar, this.f12218c, kotlin.math.b.L0(this.f12219d.s()), 0, 0.0f, 4, null);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
                a(aVar);
                return kotlin.k2.f75408a;
            }
        }

        d(w4 w4Var) {
            this.f12216a = w4Var;
        }

        @Override // androidx.compose.ui.layout.m0
        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
            androidx.compose.ui.layout.i1 m02 = list.get(0).m0(j4);
            androidx.compose.ui.layout.i1 m03 = list.get(1).m0(j4);
            return androidx.compose.ui.layout.o0.x2(o0Var, m03.getWidth(), m03.getHeight(), null, new a(m03, m02, this.f12216a), 4, null);
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12220b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12221c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w4 f12222d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f12223e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12224f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f12225g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f12226h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.q qVar, w4 w4Var, boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, int i4, int i5) {
            super(2);
            this.f12220b = pVar;
            this.f12221c = qVar;
            this.f12222d = w4Var;
            this.f12223e = z4;
            this.f12224f = pVar2;
            this.f12225g = i4;
            this.f12226h = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            l7.b(this.f12220b, this.f12221c, this.f12222d, this.f12223e, this.f12224f, tVar, androidx.compose.runtime.g3.b(this.f12225g | 1), this.f12226h);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt$DrawerSheet$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,948:1\n74#2,6:949\n80#2:983\n84#2:988\n78#3,11:955\n91#3:987\n456#4,8:966\n464#4,3:980\n467#4,3:984\n3737#5,6:974\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt$DrawerSheet$1\n*L\n646#1:949,6\n646#1:983\n646#1:988\n646#1:955,11\n646#1:987\n646#1:966,8\n646#1:980,3\n646#1:984,3\n646#1:974,6\n*E\n"})
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f12227b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f12228c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(androidx.compose.foundation.layout.n2 n2Var, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar) {
            super(2);
            this.f12227b = n2Var;
            this.f12228c = qVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(959363152, i4, -1, "androidx.compose.material3.DrawerSheet.<anonymous> (NavigationDrawer.kt:645)");
            }
            androidx.compose.ui.q e4 = androidx.compose.foundation.layout.d3.e(androidx.compose.foundation.layout.c2.A(androidx.compose.ui.q.INSTANCE, l7.f12192c, 0.0f, v4.f15026a.c(), 0.0f, 10, null), this.f12227b);
            ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> qVar = this.f12228c;
            tVar.P(-483455358);
            androidx.compose.ui.layout.m0 a5 = androidx.compose.material3.d.a(androidx.compose.ui.c.INSTANCE, androidx.compose.foundation.layout.i.f5073a.r(), tVar, 0, -1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(e4);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a6);
            } else {
                tVar.C();
            }
            ld.p a7 = androidx.compose.animation.p.a(companion, tVar, a5, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a7);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            qVar.R(androidx.compose.foundation.layout.v.f5347a, tVar, 6);
            tVar.p0();
            tVar.H();
            tVar.p0();
            tVar.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f12229b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12230c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f12231d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f12232e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f12233f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f12234g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f12235h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f12236i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f12237j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(androidx.compose.foundation.layout.n2 n2Var, androidx.compose.ui.q qVar, androidx.compose.ui.graphics.e6 e6Var, long j4, long j5, float f4, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f12229b = n2Var;
            this.f12230c = qVar;
            this.f12231d = e6Var;
            this.f12232e = j4;
            this.f12233f = j5;
            this.f12234g = f4;
            this.f12235h = qVar2;
            this.f12236i = i4;
            this.f12237j = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            l7.c(this.f12229b, this.f12230c, this.f12231d, this.f12232e, this.f12233f, this.f12234g, this.f12235h, tVar, androidx.compose.runtime.g3.b(this.f12236i | 1), this.f12237j);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12238b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f12239c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f12240d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f12241e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f12242f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f12243g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f12244h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f12245i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f12246j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(androidx.compose.ui.q qVar, androidx.compose.ui.graphics.e6 e6Var, long j4, long j5, float f4, androidx.compose.foundation.layout.n2 n2Var, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f12238b = qVar;
            this.f12239c = e6Var;
            this.f12240d = j4;
            this.f12241e = j5;
            this.f12242f = f4;
            this.f12243g = n2Var;
            this.f12244h = qVar2;
            this.f12245i = i4;
            this.f12246j = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            l7.d(this.f12238b, this.f12239c, this.f12240d, this.f12241e, this.f12242f, this.f12243g, this.f12244h, tVar, androidx.compose.runtime.g3.b(this.f12245i | 1), this.f12246j);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w4 f12247b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.unit.d f12248c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f12249d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f12250e;

        /* compiled from: NavigationDrawer.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/u4;", "Landroidx/compose/material3/x4;", "Lkotlin/k2;", "a", "(Landroidx/compose/material3/u4;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<u4<x4>, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f12251b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f12252c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(float f4, float f5) {
                super(1);
                this.f12251b = f4;
                this.f12252c = f5;
            }

            public final void a(@fg.l u4<x4> u4Var) {
                u4Var.a(x4.Closed, this.f12251b);
                u4Var.a(x4.Open, this.f12252c);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(u4<x4> u4Var) {
                a(u4Var);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(w4 w4Var, androidx.compose.ui.unit.d dVar, float f4, float f5) {
            super(0);
            this.f12247b = w4Var;
            this.f12248c = dVar;
            this.f12249d = f4;
            this.f12250e = f5;
        }

        public final void a() {
            this.f12247b.t(this.f12248c);
            androidx.compose.material3.k.N(this.f12247b.g(), androidx.compose.material3.j.a(new a(this.f12249d, this.f12250e)), null, 2, null);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class j extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f12253b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w4 f12254c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f12255d;

        /* compiled from: NavigationDrawer.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1$1", f = "NavigationDrawer.kt", i = {}, l = {352}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f12256b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ w4 f12257c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w4 w4Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f12257c = w4Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f12257c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f12256b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    w4 w4Var = this.f12257c;
                    this.f12256b = 1;
                    if (w4Var.f(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z4, w4 w4Var, kotlinx.coroutines.r0 r0Var) {
            super(0);
            this.f12253b = z4;
            this.f12254c = w4Var;
            this.f12255d = r0Var;
        }

        public final void a() {
            if (this.f12253b && this.f12254c.g().s().invoke(x4.Closed).booleanValue()) {
                kotlinx.coroutines.k.f(this.f12255d, null, null, new a(this.f12254c, null), 3, null);
            }
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class k extends kotlin.jvm.internal.n0 implements ld.a<Float> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f12258b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f12259c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w4 f12260d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(float f4, float f5, w4 w4Var) {
            super(0);
            this.f12258b = f4;
            this.f12259c = f5;
            this.f12260d = w4Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(l7.q(this.f12258b, this.f12259c, this.f12260d.s()));
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/q;", "a", "(Landroidx/compose/ui/unit/d;)J"}, k = 3, mv = {1, 8, 0})
    static final class l extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w4 f12261b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(w4 w4Var) {
            super(1);
            this.f12261b = w4Var;
        }

        public final long a(@fg.l androidx.compose.ui.unit.d dVar) {
            return androidx.compose.ui.unit.r.a(kotlin.math.b.L0(this.f12261b.s()), 0);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.q invoke(androidx.compose.ui.unit.d dVar) {
            return androidx.compose.ui.unit.q.b(a(dVar));
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class m extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12262b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w4 f12263c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f12264d;

        /* compiled from: NavigationDrawer.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ w4 f12265b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.r0 f12266c;

            /* compiled from: NavigationDrawer.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1$1$1", f = "NavigationDrawer.kt", i = {}, l = {377}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.l7$m$a$a, reason: collision with other inner class name */
            static final class C0271a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f12267b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ w4 f12268c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0271a(w4 w4Var, kotlin.coroutines.d<? super C0271a> dVar) {
                    super(2, dVar);
                    this.f12268c = w4Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new C0271a(this.f12268c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f12267b;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        w4 w4Var = this.f12268c;
                        this.f12267b = 1;
                        if (w4Var.f(this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                    }
                    return kotlin.k2.f75408a;
                }

                @Override // ld.p
                @fg.m
                public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                    return ((C0271a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w4 w4Var, kotlinx.coroutines.r0 r0Var) {
                super(0);
                this.f12265b = w4Var;
                this.f12266c = r0Var;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                if (this.f12265b.g().s().invoke(x4.Closed).booleanValue()) {
                    kotlinx.coroutines.k.f(this.f12266c, null, null, new C0271a(this.f12265b, null), 3, null);
                }
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, w4 w4Var, kotlinx.coroutines.r0 r0Var) {
            super(1);
            this.f12262b = str;
            this.f12263c = w4Var;
            this.f12264d = r0Var;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.h1(zVar, this.f12262b);
            if (this.f12263c.p()) {
                androidx.compose.ui.semantics.w.p(zVar, null, new a(this.f12263c, this.f12264d), 1, null);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class n extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12269b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12270c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w4 f12271d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f12272e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f12273f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12274g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f12275h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f12276i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.q qVar, w4 w4Var, boolean z4, long j4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, int i4, int i5) {
            super(2);
            this.f12269b = pVar;
            this.f12270c = qVar;
            this.f12271d = w4Var;
            this.f12272e = z4;
            this.f12273f = j4;
            this.f12274g = pVar2;
            this.f12275h = i4;
            this.f12276i = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            l7.e(this.f12269b, this.f12270c, this.f12271d, this.f12272e, this.f12273f, this.f12274g, tVar, androidx.compose.runtime.g3.b(this.f12275h | 1), this.f12276i);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class o extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final o f12277b = new o(1);

        o() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.i.INSTANCE.getClass();
            androidx.compose.ui.semantics.w.l1(zVar, androidx.compose.ui.semantics.i.f20313g);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt$NavigationDrawerItem$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,948:1\n154#2:949\n154#2:985\n154#2:1026\n87#3,6:950\n93#3:984\n97#3:1031\n78#4,11:956\n78#4,11:992\n91#4:1024\n91#4:1030\n456#5,8:967\n464#5,3:981\n456#5,8:1003\n464#5,3:1017\n467#5,3:1021\n467#5,3:1027\n3737#6,6:975\n3737#6,6:1011\n68#7,6:986\n74#7:1020\n78#7:1025\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt$NavigationDrawerItem$3\n*L\n746#1:949\n752#1:985\n759#1:1026\n745#1:950,6\n745#1:984\n745#1:1031\n745#1:956,11\n754#1:992,11\n754#1:1024\n745#1:1030\n745#1:967,8\n745#1:981,3\n754#1:1003,8\n754#1:1017,3\n754#1:1021,3\n745#1:1027,3\n745#1:975,6\n754#1:1011,6\n754#1:986,6\n754#1:1020\n754#1:1025\n*E\n"})
    static final class p extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12278b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j7 f12279c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f12280d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12281e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12282f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, j7 j7Var, boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3) {
            super(2);
            this.f12278b = pVar;
            this.f12279c = j7Var;
            this.f12280d = z4;
            this.f12281e = pVar2;
            this.f12282f = pVar3;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(191488423, i4, -1, "androidx.compose.material3.NavigationDrawerItem.<anonymous> (NavigationDrawer.kt:744)");
            }
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            androidx.compose.ui.q o4 = androidx.compose.foundation.layout.j1.o(companion, androidx.compose.ui.unit.h.g(16), 0.0f, 24, 0.0f, 10, null);
            c.Companion companion2 = androidx.compose.ui.c.INSTANCE;
            c.InterfaceC0326c q4 = companion2.q();
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f12278b;
            j7 j7Var = this.f12279c;
            boolean z4 = this.f12280d;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar2 = this.f12281e;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar3 = this.f12282f;
            tVar.P(693286680);
            androidx.compose.ui.layout.m0 d5 = androidx.compose.foundation.layout.w1.d(androidx.compose.foundation.layout.i.f5073a.p(), q4, tVar, 48);
            tVar.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion3 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion3.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(o4);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a5);
            } else {
                tVar.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion3, tVar, d5, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.y1 y1Var = androidx.compose.foundation.layout.y1.f5410a;
            tVar.P(-1538529193);
            if (pVar != null) {
                androidx.compose.runtime.f0.b(p3.a().e(androidx.compose.ui.graphics.d2.n(j7Var.b(z4, tVar, 0).getValue().M())), pVar, tVar, androidx.compose.runtime.b3.f15974d);
                androidx.compose.foundation.layout.f2.a(androidx.compose.foundation.layout.c2.B(companion, 12), tVar, 6);
            }
            tVar.p0();
            androidx.compose.ui.q e4 = androidx.compose.foundation.layout.x1.e(y1Var, companion, 1.0f, false, 2, null);
            tVar.P(733328855);
            androidx.compose.ui.layout.m0 a7 = androidx.compose.animation.a0.a(companion2, false, tVar, 0, -1323940314);
            int j5 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B2 = tVar.B();
            ld.a<androidx.compose.ui.node.g> a8 = companion3.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(e4);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a8);
            } else {
                tVar.C();
            }
            ld.p a10 = androidx.compose.animation.p.a(companion3, tVar, a7, tVar, B2);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j5))) {
                androidx.compose.animation.d.a(j5, tVar, j5, a10);
            }
            androidx.compose.animation.e.a(0, g5, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.p pVar4 = androidx.compose.foundation.layout.p.f5235a;
            androidx.compose.runtime.b3<androidx.compose.ui.graphics.d2> e5 = p3.a().e(androidx.compose.ui.graphics.d2.n(j7Var.c(z4, tVar, 0).getValue().M()));
            int i5 = androidx.compose.runtime.b3.f15974d;
            androidx.compose.runtime.f0.b(e5, pVar3, tVar, i5);
            tVar.p0();
            tVar.H();
            tVar.p0();
            tVar.p0();
            tVar.P(-533536502);
            if (pVar2 != null) {
                androidx.compose.foundation.layout.f2.a(androidx.compose.foundation.layout.c2.B(companion, 12), tVar, 6);
                androidx.compose.runtime.f0.b(p3.a().e(androidx.compose.ui.graphics.d2.n(j7Var.d(z4, tVar, 0).getValue().M())), pVar2, tVar, i5);
            }
            if (androidx.compose.animation.y.a(tVar)) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class q extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12283b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f12284c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f12285d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12286e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12287f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12288g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f12289h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ j7 f12290i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f12291j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f12292k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f12293l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, boolean z4, ld.a<kotlin.k2> aVar, androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, androidx.compose.ui.graphics.e6 e6Var, j7 j7Var, androidx.compose.foundation.interaction.k kVar, int i4, int i5) {
            super(2);
            this.f12283b = pVar;
            this.f12284c = z4;
            this.f12285d = aVar;
            this.f12286e = qVar;
            this.f12287f = pVar2;
            this.f12288g = pVar3;
            this.f12289h = e6Var;
            this.f12290i = j7Var;
            this.f12291j = kVar;
            this.f12292k = i4;
            this.f12293l = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            l7.f(this.f12283b, this.f12284c, this.f12285d, this.f12286e, this.f12287f, this.f12288g, this.f12289h, this.f12290i, this.f12291j, tVar, androidx.compose.runtime.g3.b(this.f12292k | 1), this.f12293l);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class r extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12294b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str) {
            super(1);
            this.f12294b = str;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.h1(zVar, this.f12294b);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class s extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12295b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f12296c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f12297d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f12298e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f12299f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f12300g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f12301h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f12302i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f12303j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(androidx.compose.ui.q qVar, androidx.compose.ui.graphics.e6 e6Var, long j4, long j5, float f4, androidx.compose.foundation.layout.n2 n2Var, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f12295b = qVar;
            this.f12296c = e6Var;
            this.f12297d = j4;
            this.f12298e = j5;
            this.f12299f = f4;
            this.f12300g = n2Var;
            this.f12301h = qVar2;
            this.f12302i = i4;
            this.f12303j = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            l7.g(this.f12295b, this.f12296c, this.f12297d, this.f12298e, this.f12299f, this.f12300g, this.f12301h, tVar, androidx.compose.runtime.g3.b(this.f12302i | 1), this.f12303j);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class t extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12304b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12305c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12306d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f12307e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f12308f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        t(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, int i4, int i5) {
            super(2);
            this.f12304b = pVar;
            this.f12305c = qVar;
            this.f12306d = pVar2;
            this.f12307e = i4;
            this.f12308f = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            l7.h(this.f12304b, this.f12305c, this.f12306d, tVar, androidx.compose.runtime.g3.b(this.f12307e | 1), this.f12308f);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class u extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.f, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f12309b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<Float> f12310c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(long j4, ld.a<Float> aVar) {
            super(1);
            this.f12309b = j4;
            this.f12310c = aVar;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.f fVar) {
            androidx.compose.ui.graphics.drawscope.f.t5(fVar, this.f12309b, 0L, 0L, this.f12310c.invoke().floatValue(), null, null, 0, 118, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
            a(fVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class v extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f12311b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f12312c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<Float> f12313d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f12314e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f12315f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(boolean z4, ld.a<kotlin.k2> aVar, ld.a<Float> aVar2, long j4, int i4) {
            super(2);
            this.f12311b = z4;
            this.f12312c = aVar;
            this.f12313d = aVar2;
            this.f12314e = j4;
            this.f12315f = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            l7.i(this.f12311b, this.f12312c, this.f12313d, this.f12314e, tVar, androidx.compose.runtime.g3.b(this.f12315f | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.NavigationDrawerKt$Scrim$dismissDrawer$1$1", f = "NavigationDrawer.kt", i = {}, l = {923}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    static final class w extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f12316b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f12317c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f12318d;

        /* compiled from: NavigationDrawer.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<i0.f, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.a<kotlin.k2> f12319b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ld.a<kotlin.k2> aVar) {
                super(1);
                this.f12319b = aVar;
            }

            public final void a(long j4) {
                this.f12319b.invoke();
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(i0.f fVar) {
                a(fVar.getPackedValue());
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(ld.a<kotlin.k2> aVar, kotlin.coroutines.d<? super w> dVar) {
            super(2, dVar);
            this.f12318d = aVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((w) create(k0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            w wVar = new w(this.f12318d, dVar);
            wVar.f12317c = obj;
            return wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f12316b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.ui.input.pointer.k0 k0Var = (androidx.compose.ui.input.pointer.k0) this.f12317c;
                a aVar2 = new a(this.f12318d);
                this.f12316b = 1;
                if (androidx.compose.foundation.gestures.z0.m(k0Var, null, null, null, aVar2, this, 7, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class x extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12320b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f12321c;

        /* compiled from: NavigationDrawer.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.a<kotlin.k2> f12322b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ld.a<kotlin.k2> aVar) {
                super(0);
                this.f12322b = aVar;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                this.f12322b.invoke();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(String str, ld.a<kotlin.k2> aVar) {
            super(1);
            this.f12320b = str;
            this.f12321c = aVar;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.a1(zVar, this.f12320b);
            androidx.compose.ui.semantics.w.x0(zVar, null, new a(this.f12321c), 1, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class y extends kotlin.jvm.internal.n0 implements ld.l<x4, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final y f12323b = new y(1);

        y() {
            super(1);
        }

        @fg.l
        public final Boolean a(@fg.l x4 x4Var) {
            return Boolean.TRUE;
        }

        @Override // ld.l
        public Boolean invoke(x4 x4Var) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/material3/w4;", "a", "()Landroidx/compose/material3/w4;"}, k = 3, mv = {1, 8, 0})
    static final class z extends kotlin.jvm.internal.n0 implements ld.a<w4> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ x4 f12324b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<x4, Boolean> f12325c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        z(x4 x4Var, ld.l<? super x4, Boolean> lVar) {
            super(0);
            this.f12324b = x4Var;
            this.f12325c = lVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w4 invoke() {
            return new w4(this.f12324b, this.f12325c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0081  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.m androidx.compose.ui.q r25, @fg.m androidx.compose.ui.graphics.e6 r26, long r27, long r29, float r31, @fg.m androidx.compose.foundation.layout.n2 r32, @fg.l ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r33, @fg.m androidx.compose.runtime.t r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.l7.a(androidx.compose.ui.q, androidx.compose.ui.graphics.e6, long, long, float, androidx.compose.foundation.layout.n2, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02e9  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r24, @fg.m androidx.compose.ui.q r25, @fg.m androidx.compose.material3.w4 r26, boolean r27, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r28, @fg.m androidx.compose.runtime.t r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 1007
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.l7.b(ld.p, androidx.compose.ui.q, androidx.compose.material3.w4, boolean, ld.p, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0073  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(androidx.compose.foundation.layout.n2 r26, androidx.compose.ui.q r27, androidx.compose.ui.graphics.e6 r28, long r29, long r31, float r33, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r34, androidx.compose.runtime.t r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.l7.c(androidx.compose.foundation.layout.n2, androidx.compose.ui.q, androidx.compose.ui.graphics.e6, long, long, float, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00bb  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(@fg.m androidx.compose.ui.q r23, @fg.m androidx.compose.ui.graphics.e6 r24, long r25, long r27, float r29, @fg.m androidx.compose.foundation.layout.n2 r30, @fg.l ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r31, @fg.m androidx.compose.runtime.t r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.l7.d(androidx.compose.ui.q, androidx.compose.ui.graphics.e6, long, long, float, androidx.compose.foundation.layout.n2, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02d0  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(@fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r29, @fg.m androidx.compose.ui.q r30, @fg.m androidx.compose.material3.w4 r31, boolean r32, long r33, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r35, @fg.m androidx.compose.runtime.t r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.l7.e(ld.p, androidx.compose.ui.q, androidx.compose.material3.w4, boolean, long, ld.p, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f1  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(@fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r35, boolean r36, @fg.l ld.a<kotlin.k2> r37, @fg.m androidx.compose.ui.q r38, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r39, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r40, @fg.m androidx.compose.ui.graphics.e6 r41, @fg.m androidx.compose.material3.j7 r42, @fg.m androidx.compose.foundation.interaction.k r43, @fg.m androidx.compose.runtime.t r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.l7.f(ld.p, boolean, ld.a, androidx.compose.ui.q, ld.p, ld.p, androidx.compose.ui.graphics.e6, androidx.compose.material3.j7, androidx.compose.foundation.interaction.k, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ba  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(@fg.m androidx.compose.ui.q r25, @fg.m androidx.compose.ui.graphics.e6 r26, long r27, long r29, float r31, @fg.m androidx.compose.foundation.layout.n2 r32, @fg.l ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r33, @fg.m androidx.compose.runtime.t r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.l7.g(androidx.compose.ui.q, androidx.compose.ui.graphics.e6, long, long, float, androidx.compose.foundation.layout.n2, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0048  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(@fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r16, @fg.m androidx.compose.ui.q r17, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r18, @fg.m androidx.compose.runtime.t r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.l7.h(ld.p, androidx.compose.ui.q, ld.p, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void i(boolean z4, ld.a<kotlin.k2> aVar, ld.a<Float> aVar2, long j4, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.ui.q qVar;
        androidx.compose.runtime.t o4 = tVar.o(2106487387);
        if ((i4 & 6) == 0) {
            i5 = (o4.b(z4) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.S(aVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.S(aVar2) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.g(j4) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(2106487387, i5, -1, "androidx.compose.material3.Scrim (NavigationDrawer.kt:918)");
            }
            t9.Companion companion = t9.INSTANCE;
            String a5 = v9.a(t.c.f20444a, o4, 0);
            o4.P(-1858700652);
            if (z4) {
                q.Companion companion2 = androidx.compose.ui.q.INSTANCE;
                o4.P(-1858700588);
                int i6 = i5 & 112;
                boolean z5 = i6 == 32;
                Object Q = o4.Q();
                if (z5 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                    Q = new w(aVar, null);
                    o4.E(Q);
                }
                o4.p0();
                androidx.compose.ui.q e4 = androidx.compose.ui.input.pointer.u0.e(companion2, aVar, (ld.p) Q);
                o4.P(-1858700504);
                boolean q02 = (i6 == 32) | o4.q0(a5);
                Object Q2 = o4.Q();
                if (q02 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                    Q2 = new x(a5, aVar);
                    o4.E(Q2);
                }
                o4.p0();
                qVar = androidx.compose.ui.semantics.o.e(e4, true, (ld.l) Q2);
            } else {
                qVar = androidx.compose.ui.q.INSTANCE;
            }
            o4.p0();
            androidx.compose.ui.q w32 = androidx.compose.foundation.layout.c2.f(androidx.compose.ui.q.INSTANCE, 0.0f, 1, null).w3(qVar);
            o4.P(-1858700263);
            boolean z6 = ((i5 & 7168) == 2048) | ((i5 & 896) == 256);
            Object Q3 = o4.Q();
            if (z6 || Q3 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q3 = new u(j4, aVar2);
                o4.E(Q3);
            }
            o4.p0();
            androidx.compose.foundation.e0.b(w32, (ld.l) Q3, o4, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new v(z4, aVar, aVar2, j4, i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float q(float f4, float f5, float f6) {
        return kotlin.ranges.s.H((f6 - f4) / (f5 - f4), 0.0f, 1.0f);
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final w4 r(@fg.l x4 x4Var, @fg.m ld.l<? super x4, Boolean> lVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(2098699222);
        if ((i5 & 2) != 0) {
            lVar = y.f12323b;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(2098699222, i4, -1, "androidx.compose.material3.rememberDrawerState (NavigationDrawer.kt:279)");
        }
        Object[] objArr = new Object[0];
        androidx.compose.runtime.saveable.l<w4, x4> a5 = w4.f15260d.a(lVar);
        tVar.P(-21510967);
        boolean z4 = ((((i4 & 14) ^ 6) > 4 && tVar.q0(x4Var)) || (i4 & 6) == 4) | ((((i4 & 112) ^ 48) > 32 && tVar.q0(lVar)) || (i4 & 48) == 32);
        Object Q = tVar.Q();
        if (z4 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new z(x4Var, lVar);
            tVar.E(Q);
        }
        tVar.p0();
        w4 w4Var = (w4) androidx.compose.runtime.saveable.d.d(objArr, a5, null, (ld.a) Q, tVar, 0, 4);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return w4Var;
    }
}
