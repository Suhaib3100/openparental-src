package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.z0;
import androidx.compose.ui.layout.i1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.r0;

/* compiled from: LazyStaggeredGridMeasure.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001e\u001a7\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\b\u0004H\u0083\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\f\u001a\u00020\u000b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001e\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0084\u0001\u0010*\u001a\u00020)*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'H\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a3\u00102\u001a\u00020)*\u00020,2\u0006\u0010-\u001a\u00020\u00162\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020\u001eH\u0003¢\u0006\u0004\b2\u00103\u001a=\u00107\u001a\b\u0012\u0004\u0012\u00020\n0\u0015*\u00020,2\u0012\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u00105\u001a\u00020.2\u0006\u00106\u001a\u00020\u0016H\u0002¢\u0006\u0004\b7\u00108\u001aY\u0010?\u001a\b\u0012\u0004\u0012\u00020\n0\u0015*\u00020,2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u00032!\u0010=\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u001e0\u00032\u0006\u0010>\u001a\u00020\u001eH\u0083\b¢\u0006\u0004\b?\u0010@\u001a>\u0010C\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00152\b\b\u0002\u0010A\u001a\u00020\u001e2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u0003H\u0082\b¢\u0006\u0004\bC\u0010D\u001a+\u0010F\u001a\u00020\u0010*\u00020E2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00100\u0003H\u0082\bø\u0001\u0000¢\u0006\u0004\bF\u0010G\u001a\u001b\u0010I\u001a\u00020\u0010*\u00020.2\u0006\u0010H\u001a\u00020\u0016H\u0002¢\u0006\u0004\bI\u0010J\u001a\u001e\u0010L\u001a\u00020\u0016*\u00020.2\u0006\u0010K\u001a\u00020EH\u0002ø\u0001\u0000¢\u0006\u0004\bL\u0010M\u001a\u001d\u0010O\u001a\u00020\u0016*\u00020.2\b\b\u0002\u0010N\u001a\u00020\u0016H\u0000¢\u0006\u0004\bO\u0010P\u001a4\u0010Q\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u0003H\u0082\b¢\u0006\u0004\bQ\u0010R\u001a\u0013\u0010S\u001a\u00020\u0016*\u00020.H\u0002¢\u0006\u0004\bS\u0010T\u001a(\u0010U\u001a\u00020.*\u00020.2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0003H\u0082\b¢\u0006\u0004\bU\u0010V\u001a#\u0010Y\u001a\u00020\u0010*\u00020,2\u0006\u0010W\u001a\u00020.2\u0006\u0010X\u001a\u00020\u0016H\u0002¢\u0006\u0004\bY\u0010Z\u001a#\u0010]\u001a\u00020\u0016*\u00020,2\u0006\u0010[\u001a\u00020\u00162\u0006\u0010\\\u001a\u00020\u0016H\u0002¢\u0006\u0004\b]\u0010^\"\u0014\u0010`\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b?\u0010_\"\u0014\u0010b\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u0010a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006c"}, d2 = {"T", "Landroidx/compose/foundation/lazy/layout/x;", "scope", "Lkotlin/Function1;", "Lkotlin/u;", "block", "u", "(Landroidx/compose/foundation/lazy/layout/x;Lld/l;)Ljava/lang/Object;", "", "Lkotlin/collections/k;", "Landroidx/compose/foundation/lazy/staggeredgrid/a0;", "", "d", "([Lkotlin/collections/k;)Ljava/lang/String;", "Lkotlin/Function0;", "message", "Lkotlin/k2;", "c", "(Lld/a;)V", "Landroidx/compose/foundation/lazy/staggeredgrid/j0;", "state", "", "", "pinnedItems", "Landroidx/compose/foundation/lazy/staggeredgrid/m;", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/h0;", "resolvedSlots", "Landroidx/compose/ui/unit/b;", "constraints", "", "isVertical", "reverseLayout", "Landroidx/compose/ui/unit/q;", "contentOffset", "mainAxisAvailableSize", "mainAxisSpacing", "beforeContentPadding", "afterContentPadding", "Lkotlinx/coroutines/r0;", "coroutineScope", "Landroidx/compose/foundation/lazy/staggeredgrid/y;", "r", "(Landroidx/compose/foundation/lazy/layout/x;Landroidx/compose/foundation/lazy/staggeredgrid/j0;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/m;Landroidx/compose/foundation/lazy/staggeredgrid/h0;JZZJIIIILkotlinx/coroutines/r0;)Landroidx/compose/foundation/lazy/staggeredgrid/y;", "Landroidx/compose/foundation/lazy/staggeredgrid/u;", "initialScrollDelta", "", "initialItemIndices", "initialItemOffsets", "canRestartMeasure", "o", "(Landroidx/compose/foundation/lazy/staggeredgrid/u;I[I[IZ)Landroidx/compose/foundation/lazy/staggeredgrid/y;", "measuredItems", "itemScrollOffsets", "mainAxisLayoutSize", "b", "(Landroidx/compose/foundation/lazy/staggeredgrid/u;[Lkotlin/collections/k;[II)Ljava/util/List;", "position", "Lkotlin/r0;", "name", "itemIndex", "filter", "beforeVisibleBounds", "a", "(Landroidx/compose/foundation/lazy/staggeredgrid/u;Lld/l;Lld/l;Z)Ljava/util/List;", "reverse", "action", "f", "(Ljava/util/List;ZLld/l;)V", "Landroidx/compose/foundation/lazy/staggeredgrid/l0;", "i", "(JLld/l;)V", "delta", "s", "([II)V", "indexRange", "n", "([IJ)I", "minBound", "l", "([II)I", "k", "([Ljava/lang/Object;Lld/l;)I", "j", "([I)I", "t", "([ILld/l;)[I", "indices", "itemCount", "e", "(Landroidx/compose/foundation/lazy/staggeredgrid/u;[II)V", "item", "lane", "h", "(Landroidx/compose/foundation/lazy/staggeredgrid/u;II)I", "Z", "DebugLoggingEnabled", "I", "Unset", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 4 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 5 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1225:1\n51#1,9:1236\n73#1,4:1245\n957#1:1262\n958#1,3:1267\n73#1,4:1270\n73#1,4:1274\n73#1,4:1278\n957#1:1289\n958#1,3:1294\n73#1,4:1305\n73#1,4:1309\n957#1:1330\n958#1,3:1335\n73#1,4:1340\n73#1,4:1346\n73#1,4:1350\n957#1:1371\n958#1,3:1376\n73#1,4:1379\n73#1,4:1383\n1017#1,4:1387\n73#1,4:1391\n73#1,4:1395\n926#1,3:1399\n944#1:1402\n929#1:1407\n930#1,9:1410\n945#1:1426\n940#1:1427\n926#1,3:1428\n944#1:1431\n929#1:1436\n930#1,9:1439\n945#1:1455\n940#1:1456\n73#1,4:1457\n61#1:1465\n990#1,11:1469\n957#1:1480\n958#1,3:1485\n944#1:1488\n945#1:1501\n957#1:1530\n958#1,3:1535\n495#2,4:1226\n500#2:1235\n129#3,5:1230\n239#4:1249\n236#4:1250\n236#4:1256\n239#4:1282\n236#4:1283\n236#4:1299\n239#4:1317\n236#4:1318\n236#4:1324\n239#4:1358\n236#4:1359\n236#4:1365\n953#5:1251\n952#5:1252\n951#5:1254\n953#5:1257\n952#5:1258\n951#5:1260\n951#5:1263\n952#5:1265\n953#5:1284\n952#5:1285\n951#5:1287\n951#5:1290\n952#5:1292\n951#5:1297\n953#5:1300\n952#5:1301\n951#5:1303\n953#5:1319\n952#5:1320\n951#5:1322\n953#5:1325\n952#5:1326\n951#5:1328\n951#5:1331\n952#5:1333\n951#5:1338\n953#5:1360\n952#5:1361\n951#5:1363\n953#5:1366\n952#5:1367\n951#5:1369\n951#5:1372\n952#5:1374\n951#5:1481\n952#5:1483\n951#5:1526\n952#5:1528\n951#5:1531\n952#5:1533\n62#6:1253\n55#6:1255\n62#6:1259\n55#6:1261\n55#6:1264\n62#6:1266\n62#6:1286\n55#6:1288\n55#6:1291\n62#6:1293\n55#6:1298\n62#6:1302\n55#6:1304\n62#6:1321\n55#6:1323\n62#6:1327\n55#6:1329\n55#6:1332\n62#6:1334\n55#6:1339\n62#6:1362\n55#6:1364\n62#6:1368\n55#6:1370\n55#6:1373\n62#6:1375\n55#6:1482\n62#6:1484\n55#6:1527\n62#6:1529\n55#6:1532\n62#6:1534\n12774#7,2:1313\n12541#7,2:1315\n12774#7,2:1344\n12583#7,2:1354\n12774#7,2:1356\n12583#7,2:1408\n12583#7,2:1437\n12774#7,2:1461\n12583#7,2:1463\n12744#7,2:1467\n51#8,4:1403\n56#8:1419\n33#8,6:1420\n51#8,4:1432\n56#8:1448\n33#8,6:1449\n51#8,6:1489\n33#8,6:1495\n51#8,6:1502\n33#8,6:1508\n51#8,6:1514\n33#8,6:1520\n1#9:1466\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n*L\n249#1:1236,9\n312#1:1245,4\n357#1:1262\n357#1:1267,3\n369#1:1270,4\n411#1:1274,4\n450#1:1278,4\n478#1:1289\n478#1:1294,3\n502#1:1305,4\n505#1:1309,4\n538#1:1330\n538#1:1335,3\n559#1:1340,4\n582#1:1346,4\n585#1:1350,4\n657#1:1371\n657#1:1376,3\n695#1:1379,4\n698#1:1383,4\n715#1:1387,4\n719#1:1391,4\n741#1:1395,4\n771#1:1399,3\n771#1:1402\n771#1:1407\n771#1:1410,9\n771#1:1426\n771#1:1427\n801#1:1428,3\n801#1:1431\n801#1:1436\n801#1:1439,9\n801#1:1455\n801#1:1456\n832#1:1457,4\n249#1:1465\n890#1:1469,11\n913#1:1480\n913#1:1485,3\n928#1:1488\n928#1:1501\n970#1:1530\n970#1:1535,3\n114#1:1226,4\n114#1:1235\n114#1:1230,5\n349#1:1249\n349#1:1250\n356#1:1256\n476#1:1282\n476#1:1283\n495#1:1299\n529#1:1317\n529#1:1318\n533#1:1324\n649#1:1358\n649#1:1359\n656#1:1365\n349#1:1251\n349#1:1252\n349#1:1254\n356#1:1257\n356#1:1258\n356#1:1260\n357#1:1263\n357#1:1265\n476#1:1284\n476#1:1285\n476#1:1287\n478#1:1290\n478#1:1292\n486#1:1297\n495#1:1300\n495#1:1301\n495#1:1303\n529#1:1319\n529#1:1320\n529#1:1322\n533#1:1325\n533#1:1326\n533#1:1328\n538#1:1331\n538#1:1333\n550#1:1338\n649#1:1360\n649#1:1361\n649#1:1363\n656#1:1366\n656#1:1367\n656#1:1369\n657#1:1372\n657#1:1374\n913#1:1481\n913#1:1483\n957#1:1526\n957#1:1528\n970#1:1531\n970#1:1533\n349#1:1253\n349#1:1255\n356#1:1259\n356#1:1261\n357#1:1264\n357#1:1266\n476#1:1286\n476#1:1288\n478#1:1291\n478#1:1293\n486#1:1298\n495#1:1302\n495#1:1304\n529#1:1321\n529#1:1323\n533#1:1327\n533#1:1329\n538#1:1332\n538#1:1334\n550#1:1339\n649#1:1362\n649#1:1364\n656#1:1368\n656#1:1370\n657#1:1373\n657#1:1375\n913#1:1482\n913#1:1484\n957#1:1527\n957#1:1529\n970#1:1532\n970#1:1534\n514#1:1313,2\n517#1:1315,2\n578#1:1344,2\n592#1:1354,2\n600#1:1356,2\n784#1:1408,2\n817#1:1437,2\n850#1:1461,2\n851#1:1463,2\n888#1:1467,2\n771#1:1403,4\n771#1:1419\n771#1:1420,6\n801#1:1432,4\n801#1:1448\n801#1:1449,6\n928#1:1489,6\n928#1:1495,6\n944#1:1502,6\n944#1:1508,6\n944#1:1514,6\n944#1:1520,6\n*E\n"})
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f6485a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final int f6486b = Integer.MIN_VALUE;

    /* compiled from: LazyStaggeredGridMeasure.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f6487b = new a(1);

        a() {
            super(1);
        }

        public final void a(@fg.l i1.a aVar) {
        }

        @Override // ld.l
        public k2 invoke(i1.a aVar) {
            return k2.f75408a;
        }
    }

    /* compiled from: LazyStaggeredGridMeasure.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt$measure$1$29\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1225:1\n33#2,6:1226\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt$measure$1$29\n*L\n858#1:1226,6\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<i1.a, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<a0> f6488b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ u f6489c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<a0> list, u uVar) {
            super(1);
            this.f6488b = list;
            this.f6489c = uVar;
        }

        public final void a(@fg.l i1.a aVar) {
            List<a0> list = this.f6488b;
            u uVar = this.f6489c;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                list.get(i4).s(aVar, uVar);
            }
            this.f6489c.getState().J().getValue();
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
            a(aVar);
            return k2.f75408a;
        }
    }

    @z0
    private static final List<a0> a(u uVar, ld.l<? super a0, k2> lVar, ld.l<? super Integer, Boolean> lVar2, boolean z4) {
        List<Integer> n4 = uVar.n();
        ArrayList arrayList = null;
        if (z4) {
            int size = n4.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i4 = size - 1;
                    int intValue = n4.get(size).intValue();
                    if (lVar2.invoke(Integer.valueOf(intValue)).booleanValue()) {
                        long q4 = uVar.q(uVar.getItemProvider(), intValue, 0);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        a0 c5 = uVar.getMeasuredItemProvider().c(intValue, q4);
                        lVar.invoke(c5);
                        arrayList.add(c5);
                    }
                    if (i4 < 0) {
                        break;
                    }
                    size = i4;
                }
            }
        } else {
            int size2 = n4.size();
            for (int i5 = 0; i5 < size2; i5++) {
                int intValue2 = n4.get(i5).intValue();
                if (lVar2.invoke(Integer.valueOf(intValue2)).booleanValue()) {
                    long q5 = uVar.q(uVar.getItemProvider(), intValue2, 0);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    a0 c6 = uVar.getMeasuredItemProvider().c(intValue2, q5);
                    lVar.invoke(c6);
                    arrayList.add(c6);
                }
            }
        }
        return arrayList == null ? kotlin.collections.j0.f74919b : arrayList;
    }

    private static final List<a0> b(u uVar, kotlin.collections.k<a0>[] kVarArr, int[] iArr, int i4) {
        int i5 = 0;
        for (kotlin.collections.k<a0> kVar : kVarArr) {
            i5 += kVar.getSize();
        }
        ArrayList arrayList = new ArrayList(i5);
        while (true) {
            for (kotlin.collections.k<a0> kVar2 : kVarArr) {
                if (!kVar2.isEmpty()) {
                    int length = kVarArr.length;
                    int i6 = -1;
                    int i7 = Integer.MAX_VALUE;
                    for (int i10 = 0; i10 < length; i10++) {
                        a0 m4 = kVarArr[i10].m();
                        int index = m4 != null ? m4.getIndex() : Integer.MAX_VALUE;
                        if (i7 > index) {
                            i6 = i10;
                            i7 = index;
                        }
                    }
                    a0 removeFirst = kVarArr[i6].removeFirst();
                    if (removeFirst.getLane() == i6) {
                        long b5 = l0.b(removeFirst.getLane(), removeFirst.getSpan());
                        int n4 = n(iArr, b5);
                        int i11 = uVar.getResolvedSlots().getPositions()[i6];
                        if (removeFirst.n() != 0) {
                            removeFirst.t(n4, i11, i4);
                            arrayList.add(removeFirst);
                            int i12 = (int) (b5 & 4294967295L);
                            for (int i13 = (int) (b5 >> 32); i13 < i12; i13++) {
                                iArr[i13] = removeFirst.getSizeWithSpacings() + n4;
                            }
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    private static final void c(ld.a<String> aVar) {
    }

    private static final String d(kotlin.collections.k<a0>[] kVarArr) {
        return "";
    }

    private static final void e(u uVar, int[] iArr, int i4) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i5 = length - 1;
            while (true) {
                if (iArr[length] < i4 && uVar.getLaneInfo().a(iArr[length], length)) {
                    break;
                } else {
                    iArr[length] = h(uVar, iArr[length], length);
                }
            }
            if (iArr[length] >= 0 && !uVar.s(uVar.getItemProvider(), iArr[length])) {
                uVar.getLaneInfo().l(iArr[length], length);
            }
            if (i5 < 0) {
                return;
            } else {
                length = i5;
            }
        }
    }

    private static final <T> void f(List<? extends T> list, boolean z4, ld.l<? super T, k2> lVar) {
        if (!z4) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                lVar.invoke(list.get(i4));
            }
            return;
        }
        int size2 = list.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i5 = size2 - 1;
            lVar.invoke(list.get(size2));
            if (i5 < 0) {
                return;
            } else {
                size2 = i5;
            }
        }
    }

    static /* synthetic */ void g(List list, boolean z4, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        if (!z4) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                lVar.invoke(list.get(i5));
            }
            return;
        }
        int size2 = list.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i6 = size2 - 1;
            lVar.invoke(list.get(size2));
            if (i6 < 0) {
                return;
            } else {
                size2 = i6;
            }
        }
    }

    private static final int h(u uVar, int i4, int i5) {
        return uVar.getLaneInfo().f(i4, i5);
    }

    private static final void i(long j4, ld.l<? super Integer, k2> lVar) {
        int i4 = (int) (j4 & 4294967295L);
        for (int i5 = (int) (j4 >> 32); i5 < i4; i5++) {
            lVar.invoke(Integer.valueOf(i5));
        }
    }

    private static final int j(int[] iArr) {
        int length = iArr.length;
        int i4 = -1;
        int i5 = Integer.MIN_VALUE;
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = iArr[i6];
            if (i5 < i7) {
                i4 = i6;
                i5 = i7;
            }
        }
        return i4;
    }

    private static final <T> int k(T[] tArr, ld.l<? super T, Integer> lVar) {
        int length = tArr.length;
        int i4 = -1;
        int i5 = Integer.MAX_VALUE;
        for (int i6 = 0; i6 < length; i6++) {
            int intValue = lVar.invoke(tArr[i6]).intValue();
            if (i5 > intValue) {
                i4 = i6;
                i5 = intValue;
            }
        }
        return i4;
    }

    public static final int l(@fg.l int[] iArr, int i4) {
        int length = iArr.length;
        int i5 = -1;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < length; i7++) {
            int i10 = i4 + 1;
            int i11 = iArr[i7];
            if (i10 <= i11 && i11 < i6) {
                i5 = i7;
                i6 = i11;
            }
        }
        return i5;
    }

    public static /* synthetic */ int m(int[] iArr, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = Integer.MIN_VALUE;
        }
        return l(iArr, i4);
    }

    private static final int n(int[] iArr, long j4) {
        int i4 = (int) (j4 & 4294967295L);
        int i5 = Integer.MIN_VALUE;
        for (int i6 = (int) (j4 >> 32); i6 < i4; i6++) {
            i5 = Math.max(i5, iArr[i6]);
        }
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x022b, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0241, code lost:
    
        r3 = m(r12, 0, 1, null);
        r0 = kotlin.collections.l.Xk(r10) + 1;
        r15 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x024c, code lost:
    
        if (r0 < r15) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x071b, code lost:
    
        r8 = r10;
        r4 = r11;
        r25 = r14;
        r24 = r15;
        r10 = r27;
        r5 = r28;
        r1 = r29;
        r29 = r30;
        r28 = r43;
        r27 = r12;
        r2 = r40.q(r40.getItemProvider(), r0, r3);
        r11 = r40.getLaneInfo();
        r4 = (int) (r2 & 4294967295L);
        r14 = (int) (r2 >> 32);
        r15 = r4 - r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x074e, code lost:
    
        if (r15 == 1) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0750, code lost:
    
        r20 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0755, code lost:
    
        if (r20 == false) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0757, code lost:
    
        r5 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x075a, code lost:
    
        r11.l(r0, r5);
        r5 = r40.getMeasuredItemProvider().c(r0, r2);
        r2 = n(r27, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x076c, code lost:
    
        if (r15 == 1) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x076e, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0771, code lost:
    
        if (r15 == false) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0773, code lost:
    
        r15 = r40.getLaneInfo().g(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x077b, code lost:
    
        if (r15 != null) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x077d, code lost:
    
        r15 = new int[r40.getLaneCount()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0785, code lost:
    
        r3 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0786, code lost:
    
        if (r3 >= r4) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0788, code lost:
    
        if (r15 == null) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x078a, code lost:
    
        r15[r3] = r2 - r27[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0790, code lost:
    
        r8[r3] = r0;
        r27[r3] = r5.getSizeWithSpacings() + r2;
        r7[r3].addLast(r5);
        r3 = r3 + 1;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x07a6, code lost:
    
        r39 = r1;
        r40.getLaneInfo().k(r0, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x07af, code lost:
    
        if (r2 >= r13) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x07b3, code lost:
    
        if (r27[r14] > r13) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x07b5, code lost:
    
        r5.v(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0784, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0770, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0759, code lost:
    
        r5 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0753, code lost:
    
        r20 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0560, code lost:
    
        if (r13[r4] > r10) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x02fd, code lost:
    
        r2 = m(r8, 0, 1, null);
        r3 = j(r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0308, code lost:
    
        if (r2 == r3) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x030e, code lost:
    
        if (r8[r2] != r8[r3]) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0310, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0312, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0313, code lost:
    
        r3 = r29[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0316, code lost:
    
        if (r3 != (-1)) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0318, code lost:
    
        r9 = r40;
        r3 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x031e, code lost:
    
        r3 = h(r9, r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0322, code lost:
    
        if (r3 >= 0) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0368, code lost:
    
        r5 = r28;
        r13 = r29;
        r24 = r10;
        r25 = r11;
        r10 = r9.q(r40.getItemProvider(), r3, r2);
        r2 = r40.getLaneInfo();
        r28 = r14;
        r29 = r15;
        r4 = (int) (r10 & 4294967295L);
        r15 = r0;
        r42 = r1;
        r0 = (int) (r10 >> 32);
        r1 = r4 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0393, code lost:
    
        if (r1 == 1) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0395, code lost:
    
        r14 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0398, code lost:
    
        r2.l(r3, r14);
        r2 = r40.getMeasuredItemProvider().c(r3, r10);
        r10 = n(r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x03a8, code lost:
    
        if (r1 == 1) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x03aa, code lost:
    
        r1 = r40.getLaneInfo().g(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x03b4, code lost:
    
        if (r0 >= r4) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x03b8, code lost:
    
        if (r8[r0] == r10) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x03ba, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x03bb, code lost:
    
        r7[r0].addFirst(r2);
        r13[r0] = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x03c2, code lost:
    
        if (r1 != null) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x03c4, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x03c8, code lost:
    
        r8[r0] = (r2.getSizeWithSpacings() + r10) + r11;
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x03c6, code lost:
    
        r11 = r1[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x03b3, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0397, code lost:
    
        r14 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0324, code lost:
    
        r13 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0326, code lost:
    
        if (r0 != false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x032c, code lost:
    
        if (q(r13, r9, r8, r2) == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x032f, code lost:
    
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x035c, code lost:
    
        r42 = r1;
        r24 = r10;
        r25 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0332, code lost:
    
        if (r44 == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0334, code lost:
    
        r40.getLaneInfo().j();
        r0 = r13.length;
        r1 = new int[r0];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x033f, code lost:
    
        if (r3 >= r0) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0341, code lost:
    
        r1[r3] = -1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0347, code lost:
    
        r0 = r8.length;
        r3 = new int[r0];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x034b, code lost:
    
        if (r4 >= r0) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x034d, code lost:
    
        r3[r4] = r8[r2];
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x035b, code lost:
    
        return o(r9, r28, r1, r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x031c, code lost:
    
        r9 = r40;
     */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x064d  */
    @androidx.compose.foundation.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.compose.foundation.lazy.staggeredgrid.y o(androidx.compose.foundation.lazy.staggeredgrid.u r40, int r41, int[] r42, int[] r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 2096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.v.o(androidx.compose.foundation.lazy.staggeredgrid.u, int, int[], int[], boolean):androidx.compose.foundation.lazy.staggeredgrid.y");
    }

    private static final boolean p(int[] iArr, int[] iArr2, u uVar) {
        int length = iArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (iArr2[i4] < Math.max(-uVar.getMainAxisSpacing(), 0) && i5 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean q(int[] iArr, u uVar, int[] iArr2, int i4) {
        int length = iArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (h(uVar, iArr[i5], i5) == -1 && iArr2[i5] != iArr2[i4]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i6 = 0; i6 < length2; i6++) {
            if (h(uVar, iArr[i6], i6) != -1 && iArr2[i6] >= iArr2[i4]) {
                return true;
            }
        }
        int h4 = uVar.getLaneInfo().h(0);
        return (h4 == 0 || h4 == -1 || h4 == -2) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    @z0
    public static final y r(@fg.l androidx.compose.foundation.lazy.layout.x xVar, @fg.l j0 j0Var, @fg.l List<Integer> list, @fg.l m mVar, @fg.l h0 h0Var, long j4, boolean z4, boolean z5, long j5, int i4, int i5, int i6, int i7, @fg.l r0 r0Var) {
        T t4;
        int n4;
        T t5;
        u uVar = new u(j0Var, list, mVar, h0Var, j4, z4, xVar, i4, j5, i6, i7, z5, i5, r0Var, null);
        k1.h hVar = new k1.h();
        k1.h hVar2 = new k1.h();
        androidx.compose.runtime.snapshots.m c5 = androidx.compose.runtime.snapshots.m.INSTANCE.c();
        try {
            androidx.compose.runtime.snapshots.m r4 = c5.r();
            try {
                int[] h02 = j0Var.h0(mVar, j0Var.getScrollPosition().h());
                int[] k4 = j0Var.getScrollPosition().k();
                if (h02.length == uVar.getLaneCount()) {
                    t4 = h02;
                } else {
                    uVar.getLaneInfo().j();
                    int laneCount = uVar.getLaneCount();
                    int[] iArr = new int[laneCount];
                    int i10 = 0;
                    while (i10 < laneCount) {
                        if (i10 >= h02.length || (n4 = h02[i10]) == -1) {
                            n4 = i10 == 0 ? 0 : n(iArr, l0.b(0, i10)) + 1;
                        }
                        iArr[i10] = n4;
                        uVar.getLaneInfo().l(iArr[i10], i10);
                        i10++;
                    }
                    t4 = iArr;
                }
                hVar.f75329b = t4;
                if (k4.length == uVar.getLaneCount()) {
                    t5 = k4;
                } else {
                    int laneCount2 = uVar.getLaneCount();
                    int[] iArr2 = new int[laneCount2];
                    int i11 = 0;
                    while (i11 < laneCount2) {
                        iArr2[i11] = i11 < k4.length ? k4[i11] : i11 == 0 ? 0 : iArr2[i11 - 1];
                        i11++;
                    }
                    t5 = iArr2;
                }
                hVar2.f75329b = t5;
                k2 k2Var = k2.f75408a;
                c5.y(r4);
                c5.d();
                return o(uVar, kotlin.math.b.L0(j0Var.getScrollToBeConsumed()), (int[]) hVar.f75329b, (int[]) hVar2.f75329b, true);
            } catch (Throwable th) {
                c5.y(r4);
                throw th;
            }
        } catch (Throwable th2) {
            c5.d();
            throw th2;
        }
    }

    private static final void s(int[] iArr, int i4) {
        int length = iArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            iArr[i5] = iArr[i5] + i4;
        }
    }

    private static final int[] t(int[] iArr, ld.l<? super Integer, Integer> lVar) {
        int length = iArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            iArr[i4] = lVar.invoke(Integer.valueOf(iArr[i4])).intValue();
        }
        return iArr;
    }

    @z0
    private static final <T> T u(androidx.compose.foundation.lazy.layout.x xVar, ld.l<? super androidx.compose.foundation.lazy.layout.x, ? extends T> lVar) {
        return lVar.invoke(xVar);
    }
}
