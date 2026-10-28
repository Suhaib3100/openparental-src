package androidx.compose.foundation.gestures;

import androidx.compose.ui.platform.s5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: DragGestureDetector.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aY\u0010\f\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a!\u0010\u0013\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0082\u0001\u0010\u001b\u001a\u00020\n*\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000e2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001726\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\n0\u0003H\u0086@¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0082\u0001\u0010\u001d\u001a\u00020\n*\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000e2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001726\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\n0\u0003H\u0086@¢\u0006\u0004\b\u001d\u0010\u001c\u001aY\u0010\u001f\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\r\u001aa\u0010\"\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010!\u001a\u00020 26\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a3\u0010$\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0012\u001a!\u0010%\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b%\u0010\u0014\u001a\u0082\u0001\u0010'\u001a\u00020\n*\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000e2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001726\u0010&\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\n0\u0003H\u0086@¢\u0006\u0004\b'\u0010\u001c\u001aY\u0010(\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b(\u0010\r\u001aa\u0010*\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010!\u001a\u00020 26\u0010)\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b*\u0010#\u001a3\u0010+\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b+\u0010\u0012\u001a!\u0010,\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b,\u0010\u0014\u001a\u0082\u0001\u0010.\u001a\u00020\n*\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000e2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001726\u0010-\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\n0\u0003H\u0086@¢\u0006\u0004\b.\u0010\u001c\u001a]\u00101\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000e2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000eH\u0080Hø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a5\u00103\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000eH\u0082Hø\u0001\u0000¢\u0006\u0004\b3\u0010\u0012\u001aK\u00106\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010!\u001a\u00020 2\u0006\u00105\u001a\u0002042\u0018\u0010)\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u0003H\u0080Hø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a\u0013\u00109\u001a\u000204*\u000208H\u0000¢\u0006\u0004\b9\u0010:\u001a!\u0010;\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b;\u0010\u0014\u001a\u001e\u0010=\u001a\u00020\u0010*\u00020<2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a\u001e\u0010@\u001a\u00020\u001e*\u00020?2\u0006\u0010!\u001a\u00020 H\u0000ø\u0001\u0000¢\u0006\u0004\b@\u0010A\"\u001a\u0010F\u001a\u0002048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u001a\u0010H\u001a\u0002048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bG\u0010E\"\u001a\u0010J\u001a\u0002048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010C\u001a\u0004\bI\u0010E\"\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010$\"\u0014\u0010M\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010$\"\u0014\u0010N\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010$\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006O"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Landroidx/compose/ui/input/pointer/a0;", "pointerId", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/b0;", "Lkotlin/r0;", "name", "change", "Li0/f;", "overSlop", "Lkotlin/k2;", "onTouchSlopReached", "j", "(Landroidx/compose/ui/input/pointer/c;JLld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function1;", "onDrag", "", "x", "(Landroidx/compose/ui/input/pointer/c;JLld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "(Landroidx/compose/ui/input/pointer/c;JLkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/k0;", "onDragStart", "Lkotlin/Function0;", "onDragEnd", "onDragCancel", "dragAmount", "n", "(Landroidx/compose/ui/input/pointer/k0;Lld/l;Lld/a;Lld/a;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "p", "", "m", "Landroidx/compose/ui/input/pointer/q0;", "pointerType", "l", "(Landroidx/compose/ui/input/pointer/c;JILld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "F", "k", "onVerticalDrag", "t", "f", "onPointerSlopReached", "e", "B", "d", "onHorizontalDrag", "r", "hasDragged", "motionConsumed", "v", "(Landroidx/compose/ui/input/pointer/c;JLld/l;Lld/l;Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "c", "Landroidx/compose/foundation/gestures/k0;", "pointerDirectionConfig", "h", "(Landroidx/compose/ui/input/pointer/c;JILandroidx/compose/foundation/gestures/k0;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/j0;", "E", "(Landroidx/compose/foundation/gestures/j0;)Landroidx/compose/foundation/gestures/k0;", "g", "Landroidx/compose/ui/input/pointer/p;", "C", "(Landroidx/compose/ui/input/pointer/p;J)Z", "Landroidx/compose/ui/platform/s5;", "D", "(Landroidx/compose/ui/platform/s5;I)F", "a", "Landroidx/compose/foundation/gestures/k0;", "z", "()Landroidx/compose/foundation/gestures/k0;", "HorizontalPointerDirectionConfig", "A", "VerticalPointerDirectionConfig", "y", "BidirectionalPointerDirectionConfig", "Landroidx/compose/ui/unit/h;", "mouseSlop", "defaultTouchSlop", "mouseToTouchSlopRatio", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,875:1\n659#1,10:876\n669#1,4:895\n673#1,38:906\n613#1,4:944\n617#1,2:957\n619#1,8:966\n659#1,10:974\n669#1,4:993\n673#1,38:1004\n659#1,10:1042\n669#1,4:1061\n673#1,38:1072\n579#1,6:1110\n613#1,4:1116\n617#1,2:1129\n619#1,8:1138\n586#1,10:1146\n613#1,4:1156\n617#1,2:1169\n619#1,8:1178\n659#1,10:1186\n669#1,4:1205\n673#1,38:1216\n659#1,10:1254\n669#1,4:1273\n673#1,38:1284\n579#1,6:1322\n613#1,4:1328\n617#1,2:1341\n619#1,8:1350\n586#1,10:1358\n613#1,4:1368\n617#1,2:1381\n619#1,8:1390\n613#1,4:1398\n617#1,2:1411\n619#1,8:1420\n613#1,4:1428\n617#1,2:1441\n619#1,8:1450\n116#2,2:886\n33#2,6:888\n118#2:894\n33#2,6:899\n118#2:905\n116#2,2:948\n33#2,6:950\n118#2:956\n33#2,6:959\n118#2:965\n116#2,2:984\n33#2,6:986\n118#2:992\n33#2,6:997\n118#2:1003\n116#2,2:1052\n33#2,6:1054\n118#2:1060\n33#2,6:1065\n118#2:1071\n116#2,2:1120\n33#2,6:1122\n118#2:1128\n33#2,6:1131\n118#2:1137\n116#2,2:1160\n33#2,6:1162\n118#2:1168\n33#2,6:1171\n118#2:1177\n116#2,2:1196\n33#2,6:1198\n118#2:1204\n33#2,6:1209\n118#2:1215\n116#2,2:1264\n33#2,6:1266\n118#2:1272\n33#2,6:1277\n118#2:1283\n116#2,2:1332\n33#2,6:1334\n118#2:1340\n33#2,6:1343\n118#2:1349\n116#2,2:1372\n33#2,6:1374\n118#2:1380\n33#2,6:1383\n118#2:1389\n116#2,2:1402\n33#2,6:1404\n118#2:1410\n33#2,6:1413\n118#2:1419\n116#2,2:1432\n33#2,6:1434\n118#2:1440\n33#2,6:1443\n118#2:1449\n116#2,2:1458\n33#2,6:1460\n118#2:1466\n116#2,2:1467\n33#2,6:1469\n118#2:1475\n116#2,2:1476\n33#2,6:1478\n118#2:1484\n116#2,2:1485\n33#2,6:1487\n118#2:1493\n116#2,2:1494\n33#2,6:1496\n118#2:1502\n116#2,2:1503\n33#2,6:1505\n118#2:1511\n116#2,2:1512\n33#2,6:1514\n118#2:1520\n116#2,2:1521\n33#2,6:1523\n118#2:1529\n164#3:1530\n154#3:1531\n81#4:1532\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n*L\n78#1:876,10\n78#1:895,4\n78#1:906,38\n142#1:944,4\n142#1:957,2\n142#1:966,8\n287#1:974,10\n287#1:993,4\n287#1:1004,38\n298#1:1042,10\n298#1:1061,4\n298#1:1072,38\n324#1:1110,6\n324#1:1116,4\n324#1:1129,2\n324#1:1138,8\n324#1:1146,10\n354#1:1156,4\n354#1:1169,2\n354#1:1178,8\n438#1:1186,10\n438#1:1205,4\n438#1:1216,38\n449#1:1254,10\n449#1:1273,4\n449#1:1284,38\n472#1:1322,6\n472#1:1328,4\n472#1:1341,2\n472#1:1350,8\n472#1:1358,10\n502#1:1368,4\n502#1:1381,2\n502#1:1390,8\n584#1:1398,4\n584#1:1411,2\n584#1:1420,8\n584#1:1428,4\n584#1:1441,2\n584#1:1450,8\n78#1:886,2\n78#1:888,6\n78#1:894\n78#1:899,6\n78#1:905\n142#1:948,2\n142#1:950,6\n142#1:956\n142#1:959,6\n142#1:965\n287#1:984,2\n287#1:986,6\n287#1:992\n287#1:997,6\n287#1:1003\n298#1:1052,2\n298#1:1054,6\n298#1:1060\n298#1:1065,6\n298#1:1071\n324#1:1120,2\n324#1:1122,6\n324#1:1128\n324#1:1131,6\n324#1:1137\n354#1:1160,2\n354#1:1162,6\n354#1:1168\n354#1:1171,6\n354#1:1177\n438#1:1196,2\n438#1:1198,6\n438#1:1204\n438#1:1209,6\n438#1:1215\n449#1:1264,2\n449#1:1266,6\n449#1:1272\n449#1:1277,6\n449#1:1283\n472#1:1332,2\n472#1:1334,6\n472#1:1340\n472#1:1343,6\n472#1:1349\n502#1:1372,2\n502#1:1374,6\n502#1:1380\n502#1:1383,6\n502#1:1389\n584#1:1402,2\n584#1:1404,6\n584#1:1410\n584#1:1413,6\n584#1:1419\n584#1:1432,2\n584#1:1434,6\n584#1:1440\n584#1:1443,6\n584#1:1449\n616#1:1458,2\n616#1:1460,6\n616#1:1466\n618#1:1467,2\n618#1:1469,6\n618#1:1475\n668#1:1476,2\n668#1:1478,6\n668#1:1484\n672#1:1485,2\n672#1:1487,6\n672#1:1493\n668#1:1494,2\n668#1:1496,6\n668#1:1502\n672#1:1503,2\n672#1:1505,6\n672#1:1511\n802#1:1512,2\n802#1:1514,6\n802#1:1520\n855#1:1521,2\n855#1:1523,6\n855#1:1529\n861#1:1530\n862#1:1531\n863#1:1532\n*E\n"})
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final k0 f4338a = new b();

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final k0 f4339b = new c();

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final k0 f4340c = new a();

    /* renamed from: d, reason: collision with root package name */
    private static final float f4341d;

    /* renamed from: e, reason: collision with root package name */
    private static final float f4342e;

    /* renamed from: f, reason: collision with root package name */
    private static final float f4343f;

    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"androidx/compose/foundation/gestures/u$a", "Landroidx/compose/foundation/gestures/k0;", "Li0/f;", "offset", "", "b", "(J)F", "totalPositionChange", "touchSlop", "a", "(JF)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements k0 {
        a() {
        }

        @Override // androidx.compose.foundation.gestures.k0
        public long a(long totalPositionChange, float touchSlop) {
            return i0.f.u(totalPositionChange, i0.f.x(i0.f.j(totalPositionChange, i0.f.m(totalPositionChange)), touchSlop));
        }

        @Override // androidx.compose.foundation.gestures.k0
        public float b(long offset) {
            return i0.f.m(offset);
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class a0 extends kotlin.jvm.internal.n0 implements ld.l<i0.f, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a0 f4344b = new a0(1);

        a0() {
            super(1);
        }

        public final void a(long j4) {
        }

        @Override // ld.l
        public k2 invoke(i0.f fVar) {
            fVar.getPackedValue();
            return k2.f75408a;
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"androidx/compose/foundation/gestures/u$b", "Landroidx/compose/foundation/gestures/k0;", "Li0/f;", "offset", "", "b", "(J)F", "totalPositionChange", "touchSlop", "a", "(JF)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements k0 {
        b() {
        }

        @Override // androidx.compose.foundation.gestures.k0
        public long a(long totalPositionChange, float touchSlop) {
            return i0.g.a(i0.f.p(totalPositionChange) - (Math.signum(i0.f.p(totalPositionChange)) * touchSlop), i0.f.r(totalPositionChange));
        }

        @Override // androidx.compose.foundation.gestures.k0
        public float b(long offset) {
            return Math.abs(i0.f.p(offset));
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class b0 extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b0 f4345b = new b0(0);

        b0() {
            super(0);
        }

        public final void a() {
        }

        @Override // ld.a
        public k2 invoke() {
            return k2.f75408a;
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"androidx/compose/foundation/gestures/u$c", "Landroidx/compose/foundation/gestures/k0;", "Li0/f;", "offset", "", "b", "(J)F", "totalPositionChange", "touchSlop", "a", "(JF)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements k0 {
        c() {
        }

        @Override // androidx.compose.foundation.gestures.k0
        public long a(long totalPositionChange, float touchSlop) {
            return i0.g.a(i0.f.p(totalPositionChange), i0.f.r(totalPositionChange) - (Math.signum(i0.f.r(totalPositionChange)) * touchSlop));
        }

        @Override // androidx.compose.foundation.gestures.k0
        public float b(long offset) {
            return Math.abs(i0.f.r(offset));
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c0 extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final c0 f4346b = new c0(0);

        c0() {
            super(0);
        }

        public final void a() {
        }

        @Override // ld.a
        public k2 invoke() {
            return k2.f75408a;
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0}, l = {878}, m = "awaitDragOrCancellation-rnUCldI", n = {"$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4347b;

        /* renamed from: c, reason: collision with root package name */
        Object f4348c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f4349d;

        /* renamed from: e, reason: collision with root package name */
        int f4350e;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4349d = obj;
            this.f4350e |= Integer.MIN_VALUE;
            return u.b(null, 0L, this);
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5", f = "DragGestureDetector.kt", i = {0, 1, 1}, l = {390, 392, 400}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "overSlop"}, s = {"L$0", "L$0", "L$1"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class d0 extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: c, reason: collision with root package name */
        Object f4351c;

        /* renamed from: d, reason: collision with root package name */
        int f4352d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f4353e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.l<i0.f, k2> f4354f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.ui.input.pointer.b0, Float, k2> f4355g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f4356h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f4357i;

        /* compiled from: DragGestureDetector.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/b0;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/input/pointer/b0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.input.pointer.b0, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.ui.input.pointer.b0, Float, k2> f4358b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ld.p<? super androidx.compose.ui.input.pointer.b0, ? super Float, k2> pVar) {
                super(1);
                this.f4358b = pVar;
            }

            public final void a(@fg.l androidx.compose.ui.input.pointer.b0 b0Var) {
                this.f4358b.invoke(b0Var, Float.valueOf(i0.f.r(androidx.compose.ui.input.pointer.q.k(b0Var))));
                b0Var.a();
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.input.pointer.b0 b0Var) {
                a(b0Var);
                return k2.f75408a;
            }
        }

        /* compiled from: DragGestureDetector.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/b0;", "change", "", "over", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/input/pointer/b0;F)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.input.pointer.b0, Float, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k1.e f4359b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(k1.e eVar) {
                super(2);
                this.f4359b = eVar;
            }

            public final void a(@fg.l androidx.compose.ui.input.pointer.b0 b0Var, float f4) {
                b0Var.a();
                this.f4359b.f75326b = f4;
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.input.pointer.b0 b0Var, Float f4) {
                a(b0Var, f4.floatValue());
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d0(ld.l<? super i0.f, k2> lVar, ld.p<? super androidx.compose.ui.input.pointer.b0, ? super Float, k2> pVar, ld.a<k2> aVar, ld.a<k2> aVar2, kotlin.coroutines.d<? super d0> dVar) {
            super(2, dVar);
            this.f4354f = lVar;
            this.f4355g = pVar;
            this.f4356h = aVar;
            this.f4357i = aVar2;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((d0) create(cVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            d0 d0Var = new d0(this.f4354f, this.f4355g, this.f4356h, this.f4357i, dVar);
            d0Var.f4353e = obj;
            return d0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00ae  */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r12.f4352d
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                kotlin.a1.n(r13)
                goto La6
            L14:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1c:
                java.lang.Object r1 = r12.f4351c
                kotlin.jvm.internal.k1$e r1 = (kotlin.jvm.internal.k1.e) r1
                java.lang.Object r3 = r12.f4353e
                androidx.compose.ui.input.pointer.c r3 = (androidx.compose.ui.input.pointer.c) r3
                kotlin.a1.n(r13)
                goto L70
            L28:
                java.lang.Object r1 = r12.f4353e
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                kotlin.a1.n(r13)
                goto L4b
            L30:
                kotlin.a1.n(r13)
                java.lang.Object r13 = r12.f4353e
                androidx.compose.ui.input.pointer.c r13 = (androidx.compose.ui.input.pointer.c) r13
                r12.f4353e = r13
                r12.f4352d = r4
                r6 = 0
                r7 = 0
                r9 = 2
                r10 = 0
                r5 = r13
                r8 = r12
                java.lang.Object r1 = androidx.compose.foundation.gestures.z0.f(r5, r6, r7, r8, r9, r10)
                if (r1 != r0) goto L48
                return r0
            L48:
                r11 = r1
                r1 = r13
                r13 = r11
            L4b:
                androidx.compose.ui.input.pointer.b0 r13 = (androidx.compose.ui.input.pointer.b0) r13
                kotlin.jvm.internal.k1$e r10 = new kotlin.jvm.internal.k1$e
                r10.<init>()
                long r5 = r13.getId()
                int r7 = r13.getType()
                androidx.compose.foundation.gestures.u$d0$b r8 = new androidx.compose.foundation.gestures.u$d0$b
                r8.<init>(r10)
                r12.f4353e = r1
                r12.f4351c = r10
                r12.f4352d = r3
                r4 = r1
                r9 = r12
                java.lang.Object r13 = androidx.compose.foundation.gestures.u.l(r4, r5, r7, r8, r9)
                if (r13 != r0) goto L6e
                return r0
            L6e:
                r3 = r1
                r1 = r10
            L70:
                androidx.compose.ui.input.pointer.b0 r13 = (androidx.compose.ui.input.pointer.b0) r13
                if (r13 == 0) goto Lb9
                ld.l<i0.f, kotlin.k2> r4 = r12.f4354f
                long r5 = r13.getPosition()
                i0.f r5 = i0.f.d(r5)
                r4.invoke(r5)
                ld.p<androidx.compose.ui.input.pointer.b0, java.lang.Float, kotlin.k2> r4 = r12.f4355g
                float r1 = r1.f75326b
                java.lang.Float r5 = new java.lang.Float
                r5.<init>(r1)
                r4.invoke(r13, r5)
                long r4 = r13.getId()
                androidx.compose.foundation.gestures.u$d0$a r13 = new androidx.compose.foundation.gestures.u$d0$a
                ld.p<androidx.compose.ui.input.pointer.b0, java.lang.Float, kotlin.k2> r1 = r12.f4355g
                r13.<init>(r1)
                r1 = 0
                r12.f4353e = r1
                r12.f4351c = r1
                r12.f4352d = r2
                java.lang.Object r13 = androidx.compose.foundation.gestures.u.F(r3, r4, r13, r12)
                if (r13 != r0) goto La6
                return r0
            La6:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lb4
                ld.a<kotlin.k2> r13 = r12.f4356h
                r13.invoke()
                goto Lb9
            Lb4:
                ld.a<kotlin.k2> r13 = r12.f4357i
                r13.invoke()
            Lb9:
                kotlin.k2 r13 = kotlin.k2.f75408a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.u.d0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0}, l = {878}, m = "awaitHorizontalDragOrCancellation-rnUCldI", n = {"$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4360b;

        /* renamed from: c, reason: collision with root package name */
        Object f4361c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f4362d;

        /* renamed from: e, reason: collision with root package name */
        int f4363e;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4362d = obj;
            this.f4363e |= Integer.MIN_VALUE;
            return u.d(null, 0L, this);
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0}, l = {108}, m = "drag-jO51t88", n = {"$this$drag_u2djO51t88", "onDrag"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e0 extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4364b;

        /* renamed from: c, reason: collision with root package name */
        Object f4365c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f4366d;

        /* renamed from: e, reason: collision with root package name */
        int f4367e;

        e0(kotlin.coroutines.d<? super e0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4366d = obj;
            this.f4367e |= Integer.MIN_VALUE;
            return u.x(null, 0L, null, this);
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {884, 926}, m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", n = {"onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlop$iv", "totalPositionChange$iv", "onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "dragEvent$iv", "touchSlop$iv", "totalPositionChange$iv"}, s = {"L$0", "L$2", "L$3", "F$0", "J$0", "L$0", "L$2", "L$3", "L$4", "F$0", "J$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4368b;

        /* renamed from: c, reason: collision with root package name */
        Object f4369c;

        /* renamed from: d, reason: collision with root package name */
        Object f4370d;

        /* renamed from: e, reason: collision with root package name */
        Object f4371e;

        /* renamed from: f, reason: collision with root package name */
        Object f4372f;

        /* renamed from: g, reason: collision with root package name */
        float f4373g;

        /* renamed from: h, reason: collision with root package name */
        long f4374h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f4375i;

        /* renamed from: j, reason: collision with root package name */
        int f4376j;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4375i = obj;
            this.f4376j |= Integer.MIN_VALUE;
            return u.e(null, 0L, 0, null, this);
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 0}, l = {878}, m = "drag-VnAYq1g", n = {"$this$drag_u2dVnAYq1g", "onDrag", "hasDragged", "motionConsumed", "$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2\n*L\n1#1,875:1\n*E\n"})
    static final class f0 extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4377b;

        /* renamed from: c, reason: collision with root package name */
        Object f4378c;

        /* renamed from: d, reason: collision with root package name */
        Object f4379d;

        /* renamed from: e, reason: collision with root package name */
        Object f4380e;

        /* renamed from: f, reason: collision with root package name */
        Object f4381f;

        /* renamed from: g, reason: collision with root package name */
        Object f4382g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f4383h;

        /* renamed from: i, reason: collision with root package name */
        int f4384i;

        f0(kotlin.coroutines.d<? super f0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4383h = obj;
            this.f4384i |= Integer.MIN_VALUE;
            return u.v(null, 0L, null, null, null, this);
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {884, 926}, m = "awaitHorizontalTouchSlopOrCancellation-jO51t88", n = {"onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlop$iv", "totalPositionChange$iv", "onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "dragEvent$iv", "touchSlop$iv", "totalPositionChange$iv"}, s = {"L$0", "L$2", "L$3", "F$0", "J$0", "L$0", "L$2", "L$3", "L$4", "F$0", "J$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4385b;

        /* renamed from: c, reason: collision with root package name */
        Object f4386c;

        /* renamed from: d, reason: collision with root package name */
        Object f4387d;

        /* renamed from: e, reason: collision with root package name */
        Object f4388e;

        /* renamed from: f, reason: collision with root package name */
        Object f4389f;

        /* renamed from: g, reason: collision with root package name */
        float f4390g;

        /* renamed from: h, reason: collision with root package name */
        long f4391h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f4392i;

        /* renamed from: j, reason: collision with root package name */
        int f4393j;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4392i = obj;
            this.f4393j |= Integer.MIN_VALUE;
            return u.f(null, 0L, null, this);
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0}, l = {884}, m = "horizontalDrag-jO51t88", n = {"onDrag", "$this$drag_u2dVnAYq1g$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g0 extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4394b;

        /* renamed from: c, reason: collision with root package name */
        Object f4395c;

        /* renamed from: d, reason: collision with root package name */
        Object f4396d;

        /* renamed from: e, reason: collision with root package name */
        Object f4397e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f4398f;

        /* renamed from: g, reason: collision with root package name */
        int f4399g;

        g0(kotlin.coroutines.d<? super g0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4398f = obj;
            this.f4399g |= Integer.MIN_VALUE;
            return u.B(null, 0L, null, this);
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0}, l = {809}, m = "awaitLongPressOrCancellation-rnUCldI", n = {"initialDown", "longPress"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4400b;

        /* renamed from: c, reason: collision with root package name */
        Object f4401c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f4402d;

        /* renamed from: e, reason: collision with root package name */
        int f4403e;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4402d = obj;
            this.f4403e |= Integer.MIN_VALUE;
            return u.g(null, 0L, this);
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0}, l = {884}, m = "verticalDrag-jO51t88", n = {"onDrag", "$this$drag_u2dVnAYq1g$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class h0 extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4404b;

        /* renamed from: c, reason: collision with root package name */
        Object f4405c;

        /* renamed from: d, reason: collision with root package name */
        Object f4406d;

        /* renamed from: e, reason: collision with root package name */
        Object f4407e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f4408f;

        /* renamed from: g, reason: collision with root package name */
        int f4409g;

        h0(kotlin.coroutines.d<? super h0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4408f = obj;
            this.f4409g |= Integer.MIN_VALUE;
            return u.F(null, 0L, null, this);
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", i = {0, 0, 1, 1, 1}, l = {812, 829}, m = "invokeSuspend", n = {"$this$withTimeout", "finished", "$this$withTimeout", "event", "finished"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,875:1\n86#2,2:876\n33#2,6:878\n88#2:884\n101#2,2:885\n33#2,6:887\n103#2:893\n101#2,2:894\n33#2,6:896\n103#2:902\n116#2,2:903\n33#2,6:905\n118#2:911\n116#2,2:912\n33#2,6:914\n118#2:920\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$2\n*L\n813#1:876,2\n813#1:878,6\n813#1:884\n819#1:885,2\n819#1:887,6\n819#1:893\n830#1:894,2\n830#1:896,6\n830#1:902\n834#1:903,2\n834#1:905,6\n834#1:911\n844#1:912,2\n844#1:914,6\n844#1:920\n*E\n"})
    static final class i extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: c, reason: collision with root package name */
        Object f4410c;

        /* renamed from: d, reason: collision with root package name */
        int f4411d;

        /* renamed from: e, reason: collision with root package name */
        int f4412e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f4413f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ k1.h<androidx.compose.ui.input.pointer.b0> f4414g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ k1.h<androidx.compose.ui.input.pointer.b0> f4415h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(k1.h<androidx.compose.ui.input.pointer.b0> hVar, k1.h<androidx.compose.ui.input.pointer.b0> hVar2, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f4414g = hVar;
            this.f4415h = hVar2;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((i) create(cVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            i iVar = new i(this.f4414g, this.f4415h, dVar);
            iVar.f4413f = obj;
            return iVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
        
            r2 = r6;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00a9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x006d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00cb A[EDGE_INSN: B:67:0x00cb->B:13:0x00cb BREAK  A[LOOP:0: B:7:0x00b8->B:10:0x00c8], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x00ba  */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v7, types: [T, androidx.compose.ui.input.pointer.b0] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00aa -> B:6:0x00ad). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 326
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.u.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {667, 693}, m = "awaitPointerSlopOrCancellation-pn7EDYM", n = {"$this$awaitPointerSlopOrCancellation_u2dpn7EDYM", "pointerDirectionConfig", "onPointerSlopReached", "pointer", "touchSlop", "totalPositionChange", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM", "pointerDirectionConfig", "onPointerSlopReached", "pointer", "dragEvent", "touchSlop", "totalPositionChange"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0", "J$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1\n*L\n1#1,875:1\n*E\n"})
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4416b;

        /* renamed from: c, reason: collision with root package name */
        Object f4417c;

        /* renamed from: d, reason: collision with root package name */
        Object f4418d;

        /* renamed from: e, reason: collision with root package name */
        Object f4419e;

        /* renamed from: f, reason: collision with root package name */
        Object f4420f;

        /* renamed from: g, reason: collision with root package name */
        float f4421g;

        /* renamed from: h, reason: collision with root package name */
        long f4422h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f4423i;

        /* renamed from: j, reason: collision with root package name */
        int f4424j;

        j(kotlin.coroutines.d<? super j> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4423i = obj;
            this.f4424j |= Integer.MIN_VALUE;
            return u.h(null, 0L, 0, null, null, this);
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {884, 926}, m = "awaitTouchSlopOrCancellation-jO51t88", n = {"onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlop$iv", "totalPositionChange$iv", "onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "dragEvent$iv", "touchSlop$iv", "totalPositionChange$iv"}, s = {"L$0", "L$2", "L$3", "F$0", "J$0", "L$0", "L$2", "L$3", "L$4", "F$0", "J$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4425b;

        /* renamed from: c, reason: collision with root package name */
        Object f4426c;

        /* renamed from: d, reason: collision with root package name */
        Object f4427d;

        /* renamed from: e, reason: collision with root package name */
        Object f4428e;

        /* renamed from: f, reason: collision with root package name */
        Object f4429f;

        /* renamed from: g, reason: collision with root package name */
        float f4430g;

        /* renamed from: h, reason: collision with root package name */
        long f4431h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f4432i;

        /* renamed from: j, reason: collision with root package name */
        int f4433j;

        k(kotlin.coroutines.d<? super k> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4432i = obj;
            this.f4433j |= Integer.MIN_VALUE;
            return u.j(null, 0L, null, this);
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0}, l = {878}, m = "awaitVerticalDragOrCancellation-rnUCldI", n = {"$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4434b;

        /* renamed from: c, reason: collision with root package name */
        Object f4435c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f4436d;

        /* renamed from: e, reason: collision with root package name */
        int f4437e;

        l(kotlin.coroutines.d<? super l> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4436d = obj;
            this.f4437e |= Integer.MIN_VALUE;
            return u.k(null, 0L, this);
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {884, 926}, m = "awaitVerticalPointerSlopOrCancellation-gDDlDlE", n = {"onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlop$iv", "totalPositionChange$iv", "onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "dragEvent$iv", "touchSlop$iv", "totalPositionChange$iv"}, s = {"L$0", "L$2", "L$3", "F$0", "J$0", "L$0", "L$2", "L$3", "L$4", "F$0", "J$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4438b;

        /* renamed from: c, reason: collision with root package name */
        Object f4439c;

        /* renamed from: d, reason: collision with root package name */
        Object f4440d;

        /* renamed from: e, reason: collision with root package name */
        Object f4441e;

        /* renamed from: f, reason: collision with root package name */
        Object f4442f;

        /* renamed from: g, reason: collision with root package name */
        float f4443g;

        /* renamed from: h, reason: collision with root package name */
        long f4444h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f4445i;

        /* renamed from: j, reason: collision with root package name */
        int f4446j;

        m(kotlin.coroutines.d<? super m> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4445i = obj;
            this.f4446j |= Integer.MIN_VALUE;
            return u.l(null, 0L, 0, null, this);
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {884, 926}, m = "awaitVerticalTouchSlopOrCancellation-jO51t88", n = {"onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlop$iv", "totalPositionChange$iv", "onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "dragEvent$iv", "touchSlop$iv", "totalPositionChange$iv"}, s = {"L$0", "L$2", "L$3", "F$0", "J$0", "L$0", "L$2", "L$3", "L$4", "F$0", "J$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4447b;

        /* renamed from: c, reason: collision with root package name */
        Object f4448c;

        /* renamed from: d, reason: collision with root package name */
        Object f4449d;

        /* renamed from: e, reason: collision with root package name */
        Object f4450e;

        /* renamed from: f, reason: collision with root package name */
        Object f4451f;

        /* renamed from: g, reason: collision with root package name */
        float f4452g;

        /* renamed from: h, reason: collision with root package name */
        long f4453h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f4454i;

        /* renamed from: j, reason: collision with root package name */
        int f4455j;

        n(kotlin.coroutines.d<? super n> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4454i = obj;
            this.f4455j |= Integer.MIN_VALUE;
            return u.m(null, 0L, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    public static final class o extends kotlin.jvm.internal.n0 implements ld.l<i0.f, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final o f4456b = new o(1);

        o() {
            super(1);
        }

        public final void a(long j4) {
        }

        @Override // ld.l
        public k2 invoke(i0.f fVar) {
            fVar.getPackedValue();
            return k2.f75408a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    public static final class p extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final p f4457b = new p(0);

        p() {
            super(0);
        }

        public final void a() {
        }

        @Override // ld.a
        public k2 invoke() {
            return k2.f75408a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    public static final class q extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final q f4458b = new q(0);

        q() {
            super(0);
        }

        public final void a() {
        }

        @Override // ld.a
        public k2 invoke() {
            return k2.f75408a;
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", f = "DragGestureDetector.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {175, 884, 926, 192}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointerDirectionConfig$iv", "pointer$iv", "touchSlop$iv", "totalPositionChange$iv", "$this$awaitEachGesture", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointerDirectionConfig$iv", "pointer$iv", "dragEvent$iv", "touchSlop$iv", "totalPositionChange$iv"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "F$0", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "F$0", "J$0"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5\n+ 2 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,875:1\n659#2,10:876\n669#2,4:895\n673#2,38:906\n116#3,2:886\n33#3,6:888\n118#3:894\n33#3,6:899\n118#3:905\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5\n*L\n179#1:876,10\n179#1:895,4\n179#1:906,38\n179#1:886,2\n179#1:888,6\n179#1:894\n179#1:899,6\n179#1:905\n*E\n"})
    static final class r extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: c, reason: collision with root package name */
        Object f4459c;

        /* renamed from: d, reason: collision with root package name */
        Object f4460d;

        /* renamed from: e, reason: collision with root package name */
        Object f4461e;

        /* renamed from: f, reason: collision with root package name */
        Object f4462f;

        /* renamed from: g, reason: collision with root package name */
        Object f4463g;

        /* renamed from: h, reason: collision with root package name */
        Object f4464h;

        /* renamed from: i, reason: collision with root package name */
        float f4465i;

        /* renamed from: j, reason: collision with root package name */
        long f4466j;

        /* renamed from: k, reason: collision with root package name */
        int f4467k;

        /* renamed from: l, reason: collision with root package name */
        private /* synthetic */ Object f4468l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ld.l<i0.f, k2> f4469m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.ui.input.pointer.b0, i0.f, k2> f4470n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f4471o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f4472p;

        /* compiled from: DragGestureDetector.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/b0;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/input/pointer/b0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.input.pointer.b0, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.ui.input.pointer.b0, i0.f, k2> f4473b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ld.p<? super androidx.compose.ui.input.pointer.b0, ? super i0.f, k2> pVar) {
                super(1);
                this.f4473b = pVar;
            }

            public final void a(@fg.l androidx.compose.ui.input.pointer.b0 b0Var) {
                this.f4473b.invoke(b0Var, i0.f.d(androidx.compose.ui.input.pointer.q.k(b0Var)));
                b0Var.a();
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.input.pointer.b0 b0Var) {
                a(b0Var);
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        r(ld.l<? super i0.f, k2> lVar, ld.p<? super androidx.compose.ui.input.pointer.b0, ? super i0.f, k2> pVar, ld.a<k2> aVar, ld.a<k2> aVar2, kotlin.coroutines.d<? super r> dVar) {
            super(2, dVar);
            this.f4469m = lVar;
            this.f4470n = pVar;
            this.f4471o = aVar;
            this.f4472p = aVar2;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((r) create(cVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            r rVar = new r(this.f4469m, this.f4470n, this.f4471o, this.f4472p, dVar);
            rVar.f4468l = obj;
            return rVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x024b  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0251  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x01da  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x01f7  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0110 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0159  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0199  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0146 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0207  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x01dd  */
        /* JADX WARN: Type inference failed for: r12v0 */
        /* JADX WARN: Type inference failed for: r12v3 */
        /* JADX WARN: Type inference failed for: r12v4 */
        /* JADX WARN: Type inference failed for: r12v6, types: [androidx.compose.ui.input.pointer.r, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* JADX WARN: Type inference failed for: r12v8 */
        /* JADX WARN: Type inference failed for: r12v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00d7 -> B:21:0x01f5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0152 -> B:21:0x01f5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01d3 -> B:18:0x01d4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01f4 -> B:21:0x01f5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0259 -> B:29:0x00f6). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 621
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.u.r.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class s extends kotlin.jvm.internal.n0 implements ld.l<i0.f, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final s f4474b = new s(1);

        s() {
            super(1);
        }

        public final void a(long j4) {
        }

        @Override // ld.l
        public k2 invoke(i0.f fVar) {
            fVar.getPackedValue();
            return k2.f75408a;
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class t extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final t f4475b = new t(0);

        t() {
            super(0);
        }

        public final void a() {
        }

        @Override // ld.a
        public k2 invoke() {
            return k2.f75408a;
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.gestures.u$u, reason: collision with other inner class name */
    static final class C0077u extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0077u f4476b = new C0077u(0);

        C0077u() {
            super(0);
        }

        public final void a() {
        }

        @Override // ld.a
        public k2 invoke() {
            return k2.f75408a;
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", i = {0, 1, 2}, l = {234, 235, 240}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "$this$awaitEachGesture"}, s = {"L$0", "L$0", "L$0"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,875:1\n33#2,6:876\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5\n*L\n246#1:876,6\n*E\n"})
    static final class v extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: c, reason: collision with root package name */
        int f4477c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f4478d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<i0.f, k2> f4479e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f4480f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f4481g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.ui.input.pointer.b0, i0.f, k2> f4482h;

        /* compiled from: DragGestureDetector.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/b0;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/input/pointer/b0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.input.pointer.b0, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.ui.input.pointer.b0, i0.f, k2> f4483b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ld.p<? super androidx.compose.ui.input.pointer.b0, ? super i0.f, k2> pVar) {
                super(1);
                this.f4483b = pVar;
            }

            public final void a(@fg.l androidx.compose.ui.input.pointer.b0 b0Var) {
                this.f4483b.invoke(b0Var, i0.f.d(androidx.compose.ui.input.pointer.q.k(b0Var)));
                b0Var.a();
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.input.pointer.b0 b0Var) {
                a(b0Var);
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        v(ld.l<? super i0.f, k2> lVar, ld.a<k2> aVar, ld.a<k2> aVar2, ld.p<? super androidx.compose.ui.input.pointer.b0, ? super i0.f, k2> pVar, kotlin.coroutines.d<? super v> dVar) {
            super(2, dVar);
            this.f4479e = lVar;
            this.f4480f = aVar;
            this.f4481g = aVar2;
            this.f4482h = pVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((v) create(cVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            v vVar = new v(this.f4479e, this.f4480f, this.f4481g, this.f4482h, dVar);
            vVar.f4478d = obj;
            return vVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x008c A[Catch: CancellationException -> 0x0017, TryCatch #0 {CancellationException -> 0x0017, blocks: (B:8:0x0013, B:9:0x0084, B:11:0x008c, B:13:0x009b, B:15:0x00a7, B:17:0x00aa, B:20:0x00ad, B:24:0x00b3, B:28:0x0026, B:29:0x005c, B:31:0x0060, B:36:0x002e, B:37:0x004b, B:41:0x003a), top: B:2:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00b3 A[Catch: CancellationException -> 0x0017, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0017, blocks: (B:8:0x0013, B:9:0x0084, B:11:0x008c, B:13:0x009b, B:15:0x00a7, B:17:0x00aa, B:20:0x00ad, B:24:0x00b3, B:28:0x0026, B:29:0x005c, B:31:0x0060, B:36:0x002e, B:37:0x004b, B:41:0x003a), top: B:2:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0060 A[Catch: CancellationException -> 0x0017, TryCatch #0 {CancellationException -> 0x0017, blocks: (B:8:0x0013, B:9:0x0084, B:11:0x008c, B:13:0x009b, B:15:0x00a7, B:17:0x00aa, B:20:0x00ad, B:24:0x00b3, B:28:0x0026, B:29:0x005c, B:31:0x0060, B:36:0x002e, B:37:0x004b, B:41:0x003a), top: B:2:0x0007 }] */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r12) {
            /*
                r11 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r11.f4477c
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L32
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r11.f4478d
                androidx.compose.ui.input.pointer.c r0 = (androidx.compose.ui.input.pointer.c) r0
                kotlin.a1.n(r12)     // Catch: java.util.concurrent.CancellationException -> L17
                goto L84
            L17:
                r12 = move-exception
                goto Lbb
            L1a:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L22:
                java.lang.Object r1 = r11.f4478d
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                kotlin.a1.n(r12)     // Catch: java.util.concurrent.CancellationException -> L17
                goto L5c
            L2a:
                java.lang.Object r1 = r11.f4478d
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                kotlin.a1.n(r12)     // Catch: java.util.concurrent.CancellationException -> L17
                goto L4b
            L32:
                kotlin.a1.n(r12)
                java.lang.Object r12 = r11.f4478d
                r1 = r12
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                r11.f4478d = r1     // Catch: java.util.concurrent.CancellationException -> L17
                r11.f4477c = r4     // Catch: java.util.concurrent.CancellationException -> L17
                r6 = 0
                r7 = 0
                r9 = 2
                r10 = 0
                r5 = r1
                r8 = r11
                java.lang.Object r12 = androidx.compose.foundation.gestures.z0.f(r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L17
                if (r12 != r0) goto L4b
                return r0
            L4b:
                androidx.compose.ui.input.pointer.b0 r12 = (androidx.compose.ui.input.pointer.b0) r12     // Catch: java.util.concurrent.CancellationException -> L17
                long r4 = r12.getId()     // Catch: java.util.concurrent.CancellationException -> L17
                r11.f4478d = r1     // Catch: java.util.concurrent.CancellationException -> L17
                r11.f4477c = r3     // Catch: java.util.concurrent.CancellationException -> L17
                java.lang.Object r12 = androidx.compose.foundation.gestures.u.g(r1, r4, r11)     // Catch: java.util.concurrent.CancellationException -> L17
                if (r12 != r0) goto L5c
                return r0
            L5c:
                androidx.compose.ui.input.pointer.b0 r12 = (androidx.compose.ui.input.pointer.b0) r12     // Catch: java.util.concurrent.CancellationException -> L17
                if (r12 == 0) goto Lb8
                ld.l<i0.f, kotlin.k2> r3 = r11.f4479e     // Catch: java.util.concurrent.CancellationException -> L17
                long r4 = r12.getPosition()     // Catch: java.util.concurrent.CancellationException -> L17
                i0.f r4 = i0.f.d(r4)     // Catch: java.util.concurrent.CancellationException -> L17
                r3.invoke(r4)     // Catch: java.util.concurrent.CancellationException -> L17
                long r3 = r12.getId()     // Catch: java.util.concurrent.CancellationException -> L17
                androidx.compose.foundation.gestures.u$v$a r12 = new androidx.compose.foundation.gestures.u$v$a     // Catch: java.util.concurrent.CancellationException -> L17
                ld.p<androidx.compose.ui.input.pointer.b0, i0.f, kotlin.k2> r5 = r11.f4482h     // Catch: java.util.concurrent.CancellationException -> L17
                r12.<init>(r5)     // Catch: java.util.concurrent.CancellationException -> L17
                r11.f4478d = r1     // Catch: java.util.concurrent.CancellationException -> L17
                r11.f4477c = r2     // Catch: java.util.concurrent.CancellationException -> L17
                java.lang.Object r12 = androidx.compose.foundation.gestures.u.x(r1, r3, r12, r11)     // Catch: java.util.concurrent.CancellationException -> L17
                if (r12 != r0) goto L83
                return r0
            L83:
                r0 = r1
            L84:
                java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.util.concurrent.CancellationException -> L17
                boolean r12 = r12.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L17
                if (r12 == 0) goto Lb3
                androidx.compose.ui.input.pointer.p r12 = r0.v3()     // Catch: java.util.concurrent.CancellationException -> L17
                java.util.List r12 = r12.e()     // Catch: java.util.concurrent.CancellationException -> L17
                int r0 = r12.size()     // Catch: java.util.concurrent.CancellationException -> L17
                r1 = 0
            L99:
                if (r1 >= r0) goto Lad
                java.lang.Object r2 = r12.get(r1)     // Catch: java.util.concurrent.CancellationException -> L17
                androidx.compose.ui.input.pointer.b0 r2 = (androidx.compose.ui.input.pointer.b0) r2     // Catch: java.util.concurrent.CancellationException -> L17
                boolean r3 = androidx.compose.ui.input.pointer.q.d(r2)     // Catch: java.util.concurrent.CancellationException -> L17
                if (r3 == 0) goto Laa
                r2.a()     // Catch: java.util.concurrent.CancellationException -> L17
            Laa:
                int r1 = r1 + 1
                goto L99
            Lad:
                ld.a<kotlin.k2> r12 = r11.f4480f     // Catch: java.util.concurrent.CancellationException -> L17
                r12.invoke()     // Catch: java.util.concurrent.CancellationException -> L17
                goto Lb8
            Lb3:
                ld.a<kotlin.k2> r12 = r11.f4481g     // Catch: java.util.concurrent.CancellationException -> L17
                r12.invoke()     // Catch: java.util.concurrent.CancellationException -> L17
            Lb8:
                kotlin.k2 r12 = kotlin.k2.f75408a
                return r12
            Lbb:
                ld.a<kotlin.k2> r0 = r11.f4481g
                r0.invoke()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.u.v.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class w extends kotlin.jvm.internal.n0 implements ld.l<i0.f, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final w f4484b = new w(1);

        w() {
            super(1);
        }

        public final void a(long j4) {
        }

        @Override // ld.l
        public k2 invoke(i0.f fVar) {
            fVar.getPackedValue();
            return k2.f75408a;
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class x extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final x f4485b = new x(0);

        x() {
            super(0);
        }

        public final void a() {
        }

        @Override // ld.a
        public k2 invoke() {
            return k2.f75408a;
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class y extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final y f4486b = new y(0);

        y() {
            super(0);
        }

        public final void a() {
        }

        @Override // ld.a
        public k2 invoke() {
            return k2.f75408a;
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5", f = "DragGestureDetector.kt", i = {0, 1, 1}, l = {538, 540, 551}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "overSlop"}, s = {"L$0", "L$0", "L$1"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class z extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: c, reason: collision with root package name */
        Object f4487c;

        /* renamed from: d, reason: collision with root package name */
        int f4488d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f4489e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.l<i0.f, k2> f4490f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.ui.input.pointer.b0, Float, k2> f4491g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f4492h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f4493i;

        /* compiled from: DragGestureDetector.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/b0;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/input/pointer/b0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.input.pointer.b0, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.ui.input.pointer.b0, Float, k2> f4494b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ld.p<? super androidx.compose.ui.input.pointer.b0, ? super Float, k2> pVar) {
                super(1);
                this.f4494b = pVar;
            }

            public final void a(@fg.l androidx.compose.ui.input.pointer.b0 b0Var) {
                this.f4494b.invoke(b0Var, Float.valueOf(i0.f.p(androidx.compose.ui.input.pointer.q.k(b0Var))));
                b0Var.a();
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.input.pointer.b0 b0Var) {
                a(b0Var);
                return k2.f75408a;
            }
        }

        /* compiled from: DragGestureDetector.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/b0;", "change", "", "over", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/input/pointer/b0;F)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.input.pointer.b0, Float, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k1.e f4495b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(k1.e eVar) {
                super(2);
                this.f4495b = eVar;
            }

            public final void a(@fg.l androidx.compose.ui.input.pointer.b0 b0Var, float f4) {
                b0Var.a();
                this.f4495b.f75326b = f4;
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.input.pointer.b0 b0Var, Float f4) {
                a(b0Var, f4.floatValue());
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        z(ld.l<? super i0.f, k2> lVar, ld.p<? super androidx.compose.ui.input.pointer.b0, ? super Float, k2> pVar, ld.a<k2> aVar, ld.a<k2> aVar2, kotlin.coroutines.d<? super z> dVar) {
            super(2, dVar);
            this.f4490f = lVar;
            this.f4491g = pVar;
            this.f4492h = aVar;
            this.f4493i = aVar2;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((z) create(cVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            z zVar = new z(this.f4490f, this.f4491g, this.f4492h, this.f4493i, dVar);
            zVar.f4489e = obj;
            return zVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00ae  */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r12.f4488d
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                kotlin.a1.n(r13)
                goto La6
            L14:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1c:
                java.lang.Object r1 = r12.f4487c
                kotlin.jvm.internal.k1$e r1 = (kotlin.jvm.internal.k1.e) r1
                java.lang.Object r3 = r12.f4489e
                androidx.compose.ui.input.pointer.c r3 = (androidx.compose.ui.input.pointer.c) r3
                kotlin.a1.n(r13)
                goto L70
            L28:
                java.lang.Object r1 = r12.f4489e
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                kotlin.a1.n(r13)
                goto L4b
            L30:
                kotlin.a1.n(r13)
                java.lang.Object r13 = r12.f4489e
                androidx.compose.ui.input.pointer.c r13 = (androidx.compose.ui.input.pointer.c) r13
                r12.f4489e = r13
                r12.f4488d = r4
                r6 = 0
                r7 = 0
                r9 = 2
                r10 = 0
                r5 = r13
                r8 = r12
                java.lang.Object r1 = androidx.compose.foundation.gestures.z0.f(r5, r6, r7, r8, r9, r10)
                if (r1 != r0) goto L48
                return r0
            L48:
                r11 = r1
                r1 = r13
                r13 = r11
            L4b:
                androidx.compose.ui.input.pointer.b0 r13 = (androidx.compose.ui.input.pointer.b0) r13
                kotlin.jvm.internal.k1$e r10 = new kotlin.jvm.internal.k1$e
                r10.<init>()
                long r5 = r13.getId()
                int r7 = r13.getType()
                androidx.compose.foundation.gestures.u$z$b r8 = new androidx.compose.foundation.gestures.u$z$b
                r8.<init>(r10)
                r12.f4489e = r1
                r12.f4487c = r10
                r12.f4488d = r3
                r4 = r1
                r9 = r12
                java.lang.Object r13 = androidx.compose.foundation.gestures.u.e(r4, r5, r7, r8, r9)
                if (r13 != r0) goto L6e
                return r0
            L6e:
                r3 = r1
                r1 = r10
            L70:
                androidx.compose.ui.input.pointer.b0 r13 = (androidx.compose.ui.input.pointer.b0) r13
                if (r13 == 0) goto Lb9
                ld.l<i0.f, kotlin.k2> r4 = r12.f4490f
                long r5 = r13.getPosition()
                i0.f r5 = i0.f.d(r5)
                r4.invoke(r5)
                ld.p<androidx.compose.ui.input.pointer.b0, java.lang.Float, kotlin.k2> r4 = r12.f4491g
                float r1 = r1.f75326b
                java.lang.Float r5 = new java.lang.Float
                r5.<init>(r1)
                r4.invoke(r13, r5)
                long r4 = r13.getId()
                androidx.compose.foundation.gestures.u$z$a r13 = new androidx.compose.foundation.gestures.u$z$a
                ld.p<androidx.compose.ui.input.pointer.b0, java.lang.Float, kotlin.k2> r1 = r12.f4491g
                r13.<init>(r1)
                r1 = 0
                r12.f4489e = r1
                r12.f4487c = r1
                r12.f4488d = r2
                java.lang.Object r13 = androidx.compose.foundation.gestures.u.B(r3, r4, r13, r12)
                if (r13 != r0) goto La6
                return r0
            La6:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lb4
                ld.a<kotlin.k2> r13 = r12.f4492h
                r13.invoke()
                goto Lb9
            Lb4:
                ld.a<kotlin.k2> r13 = r12.f4493i
                r13.invoke()
            Lb9:
                kotlin.k2 r13 = kotlin.k2.f75408a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.u.z.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        float g4 = androidx.compose.ui.unit.h.g((float) 0.125d);
        f4341d = g4;
        float f4 = 18;
        f4342e = f4;
        f4343f = g4 / f4;
    }

    @fg.l
    public static final k0 A() {
        return f4339b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e7, code lost:
    
        if ((i0.f.p(androidx.compose.ui.input.pointer.q.m(r13)) == 0.0f) == false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0077 -> B:10:0x007c). Please report as a decompilation issue!!! */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B(@fg.l androidx.compose.ui.input.pointer.c r17, long r18, @fg.l ld.l<? super androidx.compose.ui.input.pointer.b0, kotlin.k2> r20, @fg.l kotlin.coroutines.d<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.u.B(androidx.compose.ui.input.pointer.c, long, ld.l, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C(androidx.compose.ui.input.pointer.p pVar, long j4) {
        androidx.compose.ui.input.pointer.b0 b0Var;
        List<androidx.compose.ui.input.pointer.b0> e4 = pVar.e();
        int size = e4.size();
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                b0Var = null;
                break;
            }
            b0Var = e4.get(i4);
            if (androidx.compose.ui.input.pointer.a0.d(b0Var.getId(), j4)) {
                break;
            }
            i4++;
        }
        androidx.compose.ui.input.pointer.b0 b0Var2 = b0Var;
        if (b0Var2 != null && b0Var2.getPressed()) {
            z4 = true;
        }
        return true ^ z4;
    }

    public static final float D(@fg.l s5 s5Var, int i4) {
        androidx.compose.ui.input.pointer.q0.INSTANCE.getClass();
        return androidx.compose.ui.input.pointer.q0.i(i4, androidx.compose.ui.input.pointer.q0.f18818e) ? s5Var.h() * f4343f : s5Var.h();
    }

    @fg.l
    public static final k0 E(@fg.l j0 j0Var) {
        return j0Var == j0.Vertical ? f4339b : f4338a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e7, code lost:
    
        if ((i0.f.r(androidx.compose.ui.input.pointer.q.m(r13)) == 0.0f) == false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0077 -> B:10:0x007c). Please report as a decompilation issue!!! */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F(@fg.l androidx.compose.ui.input.pointer.c r17, long r18, @fg.l ld.l<? super androidx.compose.ui.input.pointer.b0, kotlin.k2> r20, @fg.l kotlin.coroutines.d<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.u.F(androidx.compose.ui.input.pointer.c, long, ld.l, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c8, code lost:
    
        if (androidx.compose.ui.input.pointer.q.q(r11) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0065 -> B:10:0x006a). Please report as a decompilation issue!!! */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@fg.l androidx.compose.ui.input.pointer.c r17, long r18, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.b0> r20) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.u.b(androidx.compose.ui.input.pointer.c, long, kotlin.coroutines.d):java.lang.Object");
    }

    private static final Object c(androidx.compose.ui.input.pointer.c cVar, long j4, ld.l<? super androidx.compose.ui.input.pointer.b0, Boolean> lVar, kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.b0> dVar) {
        androidx.compose.ui.input.pointer.b0 b0Var;
        k1.g gVar = new k1.g();
        gVar.f75328b = j4;
        while (true) {
            androidx.compose.ui.input.pointer.b0 b0Var2 = null;
            androidx.compose.ui.input.pointer.p pVar = (androidx.compose.ui.input.pointer.p) androidx.compose.ui.input.pointer.c.a1(cVar, null, dVar, 1, null);
            List<androidx.compose.ui.input.pointer.b0> e4 = pVar.e();
            int size = e4.size();
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    b0Var = null;
                    break;
                }
                b0Var = e4.get(i5);
                if (Boolean.valueOf(androidx.compose.ui.input.pointer.a0.d(b0Var.getId(), gVar.f75328b)).booleanValue()) {
                    break;
                }
                i5++;
            }
            androidx.compose.ui.input.pointer.b0 b0Var3 = b0Var;
            if (b0Var3 == null) {
                return null;
            }
            if (androidx.compose.ui.input.pointer.q.e(b0Var3)) {
                List<androidx.compose.ui.input.pointer.b0> e5 = pVar.e();
                int size2 = e5.size();
                while (true) {
                    if (i4 >= size2) {
                        break;
                    }
                    androidx.compose.ui.input.pointer.b0 b0Var4 = e5.get(i4);
                    if (Boolean.valueOf(b0Var4.getPressed()).booleanValue()) {
                        b0Var2 = b0Var4;
                        break;
                    }
                    i4++;
                }
                androidx.compose.ui.input.pointer.b0 b0Var5 = b0Var2;
                if (b0Var5 == null) {
                    return b0Var3;
                }
                gVar.f75328b = b0Var5.getId();
            } else if (lVar.invoke(b0Var3).booleanValue()) {
                return b0Var3;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d2, code lost:
    
        if ((i0.f.p(androidx.compose.ui.input.pointer.q.m(r11)) == 0.0f ? 1 : 0) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0065 -> B:10:0x006a). Please report as a decompilation issue!!! */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(@fg.l androidx.compose.ui.input.pointer.c r17, long r18, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.b0> r20) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.u.d(androidx.compose.ui.input.pointer.c, long, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x013b -> B:15:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x017f -> B:11:0x0186). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01ad -> B:14:0x0190). Please report as a decompilation issue!!! */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(@fg.l androidx.compose.ui.input.pointer.c r22, long r23, int r25, @fg.l ld.p<? super androidx.compose.ui.input.pointer.b0, ? super java.lang.Float, kotlin.k2> r26, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.b0> r27) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.u.e(androidx.compose.ui.input.pointer.c, long, int, ld.p, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x013c -> B:15:0x00b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0180 -> B:11:0x0187). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01ae -> B:14:0x0191). Please report as a decompilation issue!!! */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(@fg.l androidx.compose.ui.input.pointer.c r21, long r22, @fg.l ld.p<? super androidx.compose.ui.input.pointer.b0, ? super java.lang.Float, kotlin.k2> r24, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.b0> r25) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.u.f(androidx.compose.ui.input.pointer.c, long, ld.p, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, androidx.compose.ui.input.pointer.b0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6, types: [androidx.compose.ui.input.pointer.b0] */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(@fg.l androidx.compose.ui.input.pointer.c r9, long r10, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.b0> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.u.h
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.gestures.u$h r0 = (androidx.compose.foundation.gestures.u.h) r0
            int r1 = r0.f4403e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4403e = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.u$h r0 = new androidx.compose.foundation.gestures.u$h
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f4402d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f4403e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r9 = r0.f4401c
            kotlin.jvm.internal.k1$h r9 = (kotlin.jvm.internal.k1.h) r9
            java.lang.Object r10 = r0.f4400b
            androidx.compose.ui.input.pointer.b0 r10 = (androidx.compose.ui.input.pointer.b0) r10
            kotlin.a1.n(r12)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L99
            goto La2
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            kotlin.a1.n(r12)
            androidx.compose.ui.input.pointer.p r12 = r9.v3()
            boolean r12 = C(r12, r10)
            if (r12 == 0) goto L47
            return r4
        L47:
            androidx.compose.ui.input.pointer.p r12 = r9.v3()
            java.util.List r12 = r12.e()
            int r2 = r12.size()
            r5 = 0
        L54:
            if (r5 >= r2) goto L6b
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            androidx.compose.ui.input.pointer.b0 r7 = (androidx.compose.ui.input.pointer.b0) r7
            long r7 = r7.getId()
            boolean r7 = androidx.compose.ui.input.pointer.a0.d(r7, r10)
            if (r7 == 0) goto L68
            goto L6c
        L68:
            int r5 = r5 + 1
            goto L54
        L6b:
            r6 = r4
        L6c:
            r10 = r6
            androidx.compose.ui.input.pointer.b0 r10 = (androidx.compose.ui.input.pointer.b0) r10
            if (r10 != 0) goto L72
            return r4
        L72:
            kotlin.jvm.internal.k1$h r11 = new kotlin.jvm.internal.k1$h
            r11.<init>()
            kotlin.jvm.internal.k1$h r12 = new kotlin.jvm.internal.k1$h
            r12.<init>()
            r12.f75329b = r10
            androidx.compose.ui.platform.s5 r2 = r9.d()
            long r5 = r2.c()
            androidx.compose.foundation.gestures.u$i r2 = new androidx.compose.foundation.gestures.u$i     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L98
            r2.<init>(r12, r11, r4)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L98
            r0.f4400b = r10     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L98
            r0.f4401c = r11     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L98
            r0.f4403e = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L98
            java.lang.Object r9 = r9.k5(r5, r2, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L98
            if (r9 != r1) goto La2
            return r1
        L98:
            r9 = r11
        L99:
            T r9 = r9.f75329b
            androidx.compose.ui.input.pointer.b0 r9 = (androidx.compose.ui.input.pointer.b0) r9
            if (r9 != 0) goto La1
            r4 = r10
            goto La2
        La1:
            r4 = r9
        La2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.u.g(androidx.compose.ui.input.pointer.c, long, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x018c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x017f -> B:11:0x0185). Please report as a decompilation issue!!! */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(@fg.l androidx.compose.ui.input.pointer.c r21, long r22, int r24, @fg.l androidx.compose.foundation.gestures.k0 r25, @fg.l ld.p<? super androidx.compose.ui.input.pointer.b0, ? super i0.f, kotlin.k2> r26, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.b0> r27) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.u.h(androidx.compose.ui.input.pointer.c, long, int, androidx.compose.foundation.gestures.k0, ld.p, kotlin.coroutines.d):java.lang.Object");
    }

    private static final Object i(androidx.compose.ui.input.pointer.c cVar, long j4, int i4, k0 k0Var, ld.p<? super androidx.compose.ui.input.pointer.b0, ? super i0.f, k2> pVar, kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.b0> dVar) {
        androidx.compose.ui.input.pointer.b0 b0Var;
        long j5;
        androidx.compose.ui.input.pointer.b0 b0Var2;
        if (C(cVar.v3(), j4)) {
            return null;
        }
        float D = D(cVar.d(), i4);
        k1.g gVar = new k1.g();
        gVar.f75328b = j4;
        i0.f.INSTANCE.getClass();
        long j6 = i0.f.f74147c;
        while (true) {
            androidx.compose.ui.input.pointer.p pVar2 = (androidx.compose.ui.input.pointer.p) androidx.compose.ui.input.pointer.c.a1(cVar, null, dVar, 1, null);
            List<androidx.compose.ui.input.pointer.b0> e4 = pVar2.e();
            int size = e4.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    b0Var = null;
                    break;
                }
                b0Var = e4.get(i5);
                int i6 = i5;
                if (Boolean.valueOf(androidx.compose.ui.input.pointer.a0.d(b0Var.getId(), gVar.f75328b)).booleanValue()) {
                    break;
                }
                i5 = i6 + 1;
            }
            androidx.compose.ui.input.pointer.b0 b0Var3 = b0Var;
            if (b0Var3 == null || b0Var3.D()) {
                return null;
            }
            if (androidx.compose.ui.input.pointer.q.e(b0Var3)) {
                List<androidx.compose.ui.input.pointer.b0> e5 = pVar2.e();
                int size2 = e5.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size2) {
                        b0Var2 = null;
                        break;
                    }
                    b0Var2 = e5.get(i7);
                    if (Boolean.valueOf(b0Var2.getPressed()).booleanValue()) {
                        break;
                    }
                    i7++;
                }
                androidx.compose.ui.input.pointer.b0 b0Var4 = b0Var2;
                if (b0Var4 == null) {
                    return null;
                }
                gVar.f75328b = b0Var4.getId();
            } else {
                j6 = i0.f.v(j6, i0.f.u(b0Var3.getPosition(), b0Var3.getPreviousPosition()));
                if (k0Var.b(j6) < D) {
                    cVar.u3(androidx.compose.ui.input.pointer.r.Final, dVar);
                    if (b0Var3.D()) {
                        return null;
                    }
                } else {
                    pVar.invoke(b0Var3, i0.f.d(k0Var.a(j6, D)));
                    if (b0Var3.D()) {
                        return b0Var3;
                    }
                    i0.f.INSTANCE.getClass();
                    j5 = i0.f.f74147c;
                    j6 = j5;
                }
            }
            j5 = j6;
            j6 = j5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x013c -> B:15:0x00b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0180 -> B:11:0x0187). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01a9 -> B:14:0x0191). Please report as a decompilation issue!!! */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(@fg.l androidx.compose.ui.input.pointer.c r21, long r22, @fg.l ld.p<? super androidx.compose.ui.input.pointer.b0, ? super i0.f, kotlin.k2> r24, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.b0> r25) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.u.j(androidx.compose.ui.input.pointer.c, long, ld.p, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d2, code lost:
    
        if ((i0.f.r(androidx.compose.ui.input.pointer.q.m(r11)) == 0.0f ? 1 : 0) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0065 -> B:10:0x006a). Please report as a decompilation issue!!! */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(@fg.l androidx.compose.ui.input.pointer.c r17, long r18, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.b0> r20) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.u.k(androidx.compose.ui.input.pointer.c, long, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x013b -> B:15:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x017f -> B:11:0x0186). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01ad -> B:14:0x0190). Please report as a decompilation issue!!! */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(@fg.l androidx.compose.ui.input.pointer.c r22, long r23, int r25, @fg.l ld.p<? super androidx.compose.ui.input.pointer.b0, ? super java.lang.Float, kotlin.k2> r26, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.b0> r27) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.u.l(androidx.compose.ui.input.pointer.c, long, int, ld.p, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x013c -> B:15:0x00b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0180 -> B:11:0x0187). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01ae -> B:14:0x0191). Please report as a decompilation issue!!! */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(@fg.l androidx.compose.ui.input.pointer.c r21, long r22, @fg.l ld.p<? super androidx.compose.ui.input.pointer.b0, ? super java.lang.Float, kotlin.k2> r24, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.b0> r25) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.u.m(androidx.compose.ui.input.pointer.c, long, ld.p, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.m
    public static final Object n(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.l ld.l<? super i0.f, k2> lVar, @fg.l ld.a<k2> aVar, @fg.l ld.a<k2> aVar2, @fg.l ld.p<? super androidx.compose.ui.input.pointer.b0, ? super i0.f, k2> pVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object d5 = androidx.compose.foundation.gestures.f0.d(k0Var, new r(lVar, pVar, aVar2, aVar, null), dVar);
        return d5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? d5 : k2.f75408a;
    }

    public static /* synthetic */ Object o(androidx.compose.ui.input.pointer.k0 k0Var, ld.l lVar, ld.a aVar, ld.a aVar2, ld.p pVar, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            lVar = o.f4456b;
        }
        ld.l lVar2 = lVar;
        if ((i4 & 2) != 0) {
            aVar = p.f4457b;
        }
        ld.a aVar3 = aVar;
        if ((i4 & 4) != 0) {
            aVar2 = q.f4458b;
        }
        return n(k0Var, lVar2, aVar3, aVar2, pVar, dVar);
    }

    @fg.m
    public static final Object p(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.l ld.l<? super i0.f, k2> lVar, @fg.l ld.a<k2> aVar, @fg.l ld.a<k2> aVar2, @fg.l ld.p<? super androidx.compose.ui.input.pointer.b0, ? super i0.f, k2> pVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object d5 = androidx.compose.foundation.gestures.f0.d(k0Var, new v(lVar, aVar, aVar2, pVar, null), dVar);
        return d5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? d5 : k2.f75408a;
    }

    public static /* synthetic */ Object q(androidx.compose.ui.input.pointer.k0 k0Var, ld.l lVar, ld.a aVar, ld.a aVar2, ld.p pVar, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            lVar = s.f4474b;
        }
        ld.l lVar2 = lVar;
        if ((i4 & 2) != 0) {
            aVar = t.f4475b;
        }
        ld.a aVar3 = aVar;
        if ((i4 & 4) != 0) {
            aVar2 = C0077u.f4476b;
        }
        return p(k0Var, lVar2, aVar3, aVar2, pVar, dVar);
    }

    @fg.m
    public static final Object r(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.l ld.l<? super i0.f, k2> lVar, @fg.l ld.a<k2> aVar, @fg.l ld.a<k2> aVar2, @fg.l ld.p<? super androidx.compose.ui.input.pointer.b0, ? super Float, k2> pVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object d5 = androidx.compose.foundation.gestures.f0.d(k0Var, new z(lVar, pVar, aVar, aVar2, null), dVar);
        return d5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? d5 : k2.f75408a;
    }

    public static /* synthetic */ Object s(androidx.compose.ui.input.pointer.k0 k0Var, ld.l lVar, ld.a aVar, ld.a aVar2, ld.p pVar, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            lVar = w.f4484b;
        }
        ld.l lVar2 = lVar;
        if ((i4 & 2) != 0) {
            aVar = x.f4485b;
        }
        ld.a aVar3 = aVar;
        if ((i4 & 4) != 0) {
            aVar2 = y.f4486b;
        }
        return r(k0Var, lVar2, aVar3, aVar2, pVar, dVar);
    }

    @fg.m
    public static final Object t(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.l ld.l<? super i0.f, k2> lVar, @fg.l ld.a<k2> aVar, @fg.l ld.a<k2> aVar2, @fg.l ld.p<? super androidx.compose.ui.input.pointer.b0, ? super Float, k2> pVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object d5 = androidx.compose.foundation.gestures.f0.d(k0Var, new d0(lVar, pVar, aVar, aVar2, null), dVar);
        return d5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? d5 : k2.f75408a;
    }

    public static /* synthetic */ Object u(androidx.compose.ui.input.pointer.k0 k0Var, ld.l lVar, ld.a aVar, ld.a aVar2, ld.p pVar, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            lVar = a0.f4344b;
        }
        ld.l lVar2 = lVar;
        if ((i4 & 2) != 0) {
            aVar = b0.f4345b;
        }
        ld.a aVar3 = aVar;
        if ((i4 & 4) != 0) {
            aVar2 = c0.f4346b;
        }
        return t(k0Var, lVar2, aVar3, aVar2, pVar, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fb, code lost:
    
        if (r3.invoke(r15).booleanValue() != false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008b -> B:10:0x0091). Please report as a decompilation issue!!! */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(@fg.l androidx.compose.ui.input.pointer.c r19, long r20, @fg.l ld.l<? super androidx.compose.ui.input.pointer.b0, kotlin.k2> r22, @fg.l ld.l<? super androidx.compose.ui.input.pointer.b0, java.lang.Boolean> r23, @fg.l ld.l<? super androidx.compose.ui.input.pointer.b0, java.lang.Boolean> r24, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.b0> r25) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.u.v(androidx.compose.ui.input.pointer.c, long, ld.l, ld.l, ld.l, kotlin.coroutines.d):java.lang.Object");
    }

    private static final Object w(androidx.compose.ui.input.pointer.c cVar, long j4, ld.l<? super androidx.compose.ui.input.pointer.b0, k2> lVar, ld.l<? super androidx.compose.ui.input.pointer.b0, Boolean> lVar2, ld.l<? super androidx.compose.ui.input.pointer.b0, Boolean> lVar3, kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.b0> dVar) {
        androidx.compose.ui.input.pointer.b0 b0Var;
        androidx.compose.ui.input.pointer.b0 b0Var2;
        androidx.compose.ui.input.pointer.b0 b0Var3;
        long j5 = j4;
        if (C(cVar.v3(), j5)) {
            return null;
        }
        while (true) {
            k1.g gVar = new k1.g();
            gVar.f75328b = j5;
            while (true) {
                androidx.compose.ui.input.pointer.p pVar = (androidx.compose.ui.input.pointer.p) androidx.compose.ui.input.pointer.c.a1(cVar, null, dVar, 1, null);
                List<androidx.compose.ui.input.pointer.b0> e4 = pVar.e();
                int size = e4.size();
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        b0Var = null;
                        break;
                    }
                    b0Var = e4.get(i5);
                    if (Boolean.valueOf(androidx.compose.ui.input.pointer.a0.d(b0Var.getId(), gVar.f75328b)).booleanValue()) {
                        break;
                    }
                    i5++;
                }
                b0Var2 = b0Var;
                if (b0Var2 == null) {
                    b0Var2 = null;
                    break;
                }
                if (androidx.compose.ui.input.pointer.q.e(b0Var2)) {
                    List<androidx.compose.ui.input.pointer.b0> e5 = pVar.e();
                    int size2 = e5.size();
                    while (true) {
                        if (i4 >= size2) {
                            b0Var3 = null;
                            break;
                        }
                        b0Var3 = e5.get(i4);
                        if (Boolean.valueOf(b0Var3.getPressed()).booleanValue()) {
                            break;
                        }
                        i4++;
                    }
                    androidx.compose.ui.input.pointer.b0 b0Var4 = b0Var3;
                    if (b0Var4 == null) {
                        break;
                    }
                    gVar.f75328b = b0Var4.getId();
                } else if (lVar2.invoke(b0Var2).booleanValue()) {
                    break;
                }
            }
            if (b0Var2 == null || lVar3.invoke(b0Var2).booleanValue()) {
                return null;
            }
            if (androidx.compose.ui.input.pointer.q.e(b0Var2)) {
                return b0Var2;
            }
            lVar.invoke(b0Var2);
            j5 = b0Var2.getId();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0046 -> B:10:0x0049). Please report as a decompilation issue!!! */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x(@fg.l androidx.compose.ui.input.pointer.c r4, long r5, @fg.l ld.l<? super androidx.compose.ui.input.pointer.b0, kotlin.k2> r7, @fg.l kotlin.coroutines.d<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.u.e0
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.u$e0 r0 = (androidx.compose.foundation.gestures.u.e0) r0
            int r1 = r0.f4367e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4367e = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.u$e0 r0 = new androidx.compose.foundation.gestures.u$e0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f4366d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f4367e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.f4365c
            ld.l r4 = (ld.l) r4
            java.lang.Object r5 = r0.f4364b
            androidx.compose.ui.input.pointer.c r5 = (androidx.compose.ui.input.pointer.c) r5
            kotlin.a1.n(r8)
            r7 = r4
            r4 = r5
            goto L49
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.a1.n(r8)
        L3c:
            r0.f4364b = r4
            r0.f4365c = r7
            r0.f4367e = r3
            java.lang.Object r8 = b(r4, r5, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            androidx.compose.ui.input.pointer.b0 r8 = (androidx.compose.ui.input.pointer.b0) r8
            if (r8 != 0) goto L50
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L50:
            boolean r5 = androidx.compose.ui.input.pointer.q.e(r8)
            if (r5 == 0) goto L59
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L59:
            r7.invoke(r8)
            long r5 = r8.getId()
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.u.x(androidx.compose.ui.input.pointer.c, long, ld.l, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.l
    public static final k0 y() {
        return f4340c;
    }

    @fg.l
    public static final k0 z() {
        return f4338a;
    }
}
