package androidx.compose.ui.node;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.node.d1;
import androidx.compose.ui.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: NodeChain.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0000\u0018\u00002\u00020\u0001:\u0002^cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0019\u001a\u00060\u0018R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJC\u0010!\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010\u000bJ\u0017\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010\u000bJ\u001f\u0010(\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\u0006H\u0002¢\u0006\u0004\b-\u0010)J\u001f\u0010.\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010+J'\u00101\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b1\u00102J\u0019\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u000103H\u0000¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\f2\u0006\u00108\u001a\u000207H\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\fH\u0000¢\u0006\u0004\b;\u0010\u000eJ\r\u0010<\u001a\u00020\f¢\u0006\u0004\b<\u0010\u000eJ\r\u0010=\u001a\u00020\f¢\u0006\u0004\b=\u0010\u000eJ\r\u0010>\u001a\u00020\f¢\u0006\u0004\b>\u0010\u000eJ\u0013\u0010A\u001a\b\u0012\u0004\u0012\u00020@0?¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\fH\u0000¢\u0006\u0004\bC\u0010\u000eJ\u000f\u0010D\u001a\u00020\fH\u0000¢\u0006\u0004\bD\u0010\u000eJ?\u0010I\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u00101\u0018\u00012\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000E2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160GH\u0080\bø\u0001\u0000¢\u0006\u0004\bI\u0010JJ=\u0010K\u001a\u00020\f\"\u0006\b\u0000\u00101\u0018\u00012\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000E2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0GH\u0080\bø\u0001\u0000¢\u0006\u0004\bK\u0010LJ,\u0010N\u001a\u00020\f2\u0006\u0010M\u001a\u00020\u00102\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0GH\u0080\b¢\u0006\u0004\bN\u0010LJ$\u0010O\u001a\u00020\f2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0GH\u0080\b¢\u0006\u0004\bO\u0010PJ$\u0010Q\u001a\u00020\f2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0GH\u0080\b¢\u0006\u0004\bQ\u0010PJ=\u0010R\u001a\u00020\f\"\u0006\b\u0000\u00101\u0018\u00012\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000E2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0GH\u0080\bø\u0001\u0000¢\u0006\u0004\bR\u0010LJ,\u0010S\u001a\u00020\f2\u0006\u0010M\u001a\u00020\u00102\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0GH\u0080\b¢\u0006\u0004\bS\u0010LJ$\u0010T\u001a\u00020\f2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0GH\u0080\b¢\u0006\u0004\bT\u0010PJ+\u0010U\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u00101\u0018\u00012\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000EH\u0080\bø\u0001\u0000¢\u0006\u0004\bU\u0010VJ+\u0010W\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u00101\u0018\u00012\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000EH\u0080\bø\u0001\u0000¢\u0006\u0004\bW\u0010VJ\u001e\u0010X\u001a\u00020\u00162\n\u0010F\u001a\u0006\u0012\u0002\b\u00030EH\u0000ø\u0001\u0000¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020\u00162\u0006\u0010M\u001a\u00020\u0010H\u0000¢\u0006\u0004\bZ\u0010YJ\u000f\u0010\\\u001a\u00020[H\u0016¢\u0006\u0004\b\\\u0010]R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u001a\u0010g\u001a\u00020b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR$\u0010m\u001a\u00020\u001c2\u0006\u0010h\u001a\u00020\u001c8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u001a\u0010 \u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010\bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010h\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bq\u0010o\u001a\u0004\b8\u0010\bR\u001e\u0010t\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u001e\u0010u\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010sR\u001c\u0010w\u001a\b\u0018\u00010\u0018R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010vR\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010xR\u0014\u0010{\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010~\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u007f"}, d2 = {"Landroidx/compose/ui/node/c1;", "", "Landroidx/compose/ui/node/h0;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/h0;)V", "Landroidx/compose/ui/q$d;", "E", "()Landroidx/compose/ui/q$d;", "paddedHead", "R", "(Landroidx/compose/ui/q$d;)Landroidx/compose/ui/q$d;", "Lkotlin/k2;", "L", "()V", "head", "", "offset", "Landroidx/compose/runtime/collection/g;", "Landroidx/compose/ui/q$c;", "before", "after", "", "shouldAttachOnInsert", "Landroidx/compose/ui/node/c1$a;", "l", "(Landroidx/compose/ui/q$d;ILandroidx/compose/runtime/collection/g;Landroidx/compose/runtime/collection/g;Z)Landroidx/compose/ui/node/c1$a;", "start", "Landroidx/compose/ui/node/e1;", "coordinator", "F", "(Landroidx/compose/ui/q$d;Landroidx/compose/ui/node/e1;)V", "tail", "K", "(ILandroidx/compose/runtime/collection/g;Landroidx/compose/runtime/collection/g;Landroidx/compose/ui/q$d;Z)V", "node", "i", "G", "element", "child", "h", "(Landroidx/compose/ui/q$c;Landroidx/compose/ui/q$d;)Landroidx/compose/ui/q$d;", "A", "(Landroidx/compose/ui/q$d;Landroidx/compose/ui/q$d;)Landroidx/compose/ui/q$d;", "parent", "g", "z", "prev", "next", "T", "(Landroidx/compose/ui/q$c;Landroidx/compose/ui/q$c;Landroidx/compose/ui/q$d;)V", "Landroidx/compose/ui/node/c1$b;", "logger", "U", "(Landroidx/compose/ui/node/c1$b;)V", "Landroidx/compose/ui/q;", "m", "S", "(Landroidx/compose/ui/q;)V", "H", "M", "C", "I", "", "Landroidx/compose/ui/layout/r0;", "p", "()Ljava/util/List;", "D", "J", "Landroidx/compose/ui/node/g1;", "type", "Lkotlin/Function1;", "block", "j", "(ILld/l;)Ljava/lang/Object;", "x", "(ILld/l;)V", "mask", "v", "w", "(Lld/l;)V", "y", "Q", "O", "P", "N", "(I)Ljava/lang/Object;", "u", "t", "(I)Z", "s", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/node/h0;", "o", "()Landroidx/compose/ui/node/h0;", "Landroidx/compose/ui/node/v;", "b", "Landroidx/compose/ui/node/v;", "n", "()Landroidx/compose/ui/node/v;", "innerCoordinator", "<set-?>", "c", "Landroidx/compose/ui/node/e1;", "q", "()Landroidx/compose/ui/node/e1;", "outerCoordinator", "d", "Landroidx/compose/ui/q$d;", "r", "e", "f", "Landroidx/compose/runtime/collection/g;", "current", "buffer", "Landroidx/compose/ui/node/c1$a;", "cachedDiffer", "Landroidx/compose/ui/node/c1$b;", "B", "()Z", "isUpdating", "k", "()I", "aggregateChildKindSet", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 7 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,862:1\n756#1,6:873\n725#1,6:890\n725#1,6:896\n733#1,3:903\n736#1,3:909\n756#1,6:912\n756#1,6:918\n702#1,8:926\n725#1,3:934\n710#1,2:937\n703#1:939\n704#1,11:983\n728#1,3:994\n715#1:997\n705#1:998\n708#1,2:999\n725#1,3:1001\n710#1,2:1004\n713#1,2:1049\n728#1,3:1051\n715#1:1054\n725#1,6:1055\n747#1,12:1061\n759#1,3:1116\n753#1:1119\n756#1,6:1120\n741#1,18:1126\n759#1,3:1187\n753#1:1190\n744#1:1191\n702#1,8:1192\n725#1,3:1200\n710#1,2:1203\n703#1:1205\n704#1,11:1249\n728#1,3:1260\n715#1:1263\n705#1:1264\n733#1,6:1265\n1#2:863\n1208#3:864\n1187#3,2:865\n1187#3,2:871\n1188#3:902\n1208#3:960\n1187#3,2:961\n1208#3:1026\n1187#3,2:1027\n1208#3:1093\n1187#3,2:1094\n1208#3:1164\n1187#3,2:1165\n1208#3:1226\n1187#3,2:1227\n523#4:867\n523#4:868\n523#4:869\n523#4:870\n476#4,11:879\n523#4:906\n728#4,2:907\n72#5:924\n261#6:925\n261#6:946\n261#6:1012\n261#6:1079\n261#6:1150\n261#6:1212\n385#7,6:940\n395#7,2:947\n397#7,8:952\n405#7,9:963\n414#7,8:975\n385#7,6:1006\n395#7,2:1013\n397#7,8:1018\n405#7,9:1029\n414#7,8:1041\n385#7,6:1073\n395#7,2:1080\n397#7,8:1085\n405#7,9:1096\n414#7,8:1108\n385#7,6:1144\n395#7,2:1151\n397#7,8:1156\n405#7,9:1167\n414#7,8:1179\n385#7,6:1206\n395#7,2:1213\n397#7,8:1218\n405#7,9:1229\n414#7,8:1241\n234#8,3:949\n237#8,3:972\n234#8,3:1015\n237#8,3:1038\n234#8,3:1082\n237#8,3:1105\n234#8,3:1153\n237#8,3:1176\n234#8,3:1215\n237#8,3:1238\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n*L\n219#1:873,6\n289#1:890,6\n299#1:896,6\n325#1:903,3\n325#1:909,3\n359#1:912,6\n365#1:918,6\n695#1:926,8\n695#1:934,3\n695#1:937,2\n695#1:939\n695#1:983,11\n695#1:994,3\n695#1:997\n695#1:998\n702#1:999,2\n702#1:1001,3\n702#1:1004,2\n702#1:1049,2\n702#1:1051,3\n702#1:1054\n709#1:1055,6\n741#1:1061,12\n741#1:1116,3\n741#1:1119\n748#1:1120,6\n764#1:1126,18\n764#1:1187,3\n764#1:1190\n764#1:1191\n771#1:1192,8\n771#1:1200,3\n771#1:1203,2\n771#1:1205\n771#1:1249,11\n771#1:1260,3\n771#1:1263\n771#1:1264\n787#1:1265,6\n114#1:864\n114#1:865,2\n196#1:871,2\n323#1:902\n695#1:960\n695#1:961,2\n703#1:1026\n703#1:1027,2\n742#1:1093\n742#1:1094,2\n764#1:1164\n764#1:1165,2\n771#1:1226\n771#1:1227,2\n125#1:867\n126#1:868\n176#1:869\n188#1:870\n223#1:879,11\n353#1:906\n353#1:907,2\n407#1:924\n407#1:925\n695#1:946\n703#1:1012\n742#1:1079\n764#1:1150\n771#1:1212\n695#1:940,6\n695#1:947,2\n695#1:952,8\n695#1:963,9\n695#1:975,8\n703#1:1006,6\n703#1:1013,2\n703#1:1018,8\n703#1:1029,9\n703#1:1041,8\n742#1:1073,6\n742#1:1080,2\n742#1:1085,8\n742#1:1096,9\n742#1:1108,8\n764#1:1144,6\n764#1:1151,2\n764#1:1156,8\n764#1:1167,9\n764#1:1179,8\n771#1:1206,6\n771#1:1213,2\n771#1:1218,8\n771#1:1229,9\n771#1:1241,8\n695#1:949,3\n695#1:972,3\n703#1:1015,3\n703#1:1038,3\n742#1:1082,3\n742#1:1105,3\n764#1:1153,3\n764#1:1176,3\n771#1:1215,3\n771#1:1238,3\n*E\n"})
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: j, reason: collision with root package name */
    public static final int f19198j = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h0 layoutNode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final v innerCoordinator;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private e1 outerCoordinator;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q.d tail;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private q.d head;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.runtime.collection.g<q.c> current;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.runtime.collection.g<q.c> buffer;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private a cachedDiffer;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private b logger;

    /* compiled from: NodeChain.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0082\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0014R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\"\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006."}, d2 = {"Landroidx/compose/ui/node/c1$a;", "Landroidx/compose/ui/node/o;", "Landroidx/compose/ui/q$d;", "node", "", "offset", "Landroidx/compose/runtime/collection/g;", "Landroidx/compose/ui/q$c;", "before", "after", "", "shouldAttachOnInsert", "<init>", "(Landroidx/compose/ui/node/c1;Landroidx/compose/ui/q$d;ILandroidx/compose/runtime/collection/g;Landroidx/compose/runtime/collection/g;Z)V", "oldIndex", "newIndex", "b", "(II)Z", "Lkotlin/k2;", "c", "(I)V", "atIndex", "a", "(II)V", "d", "Landroidx/compose/ui/q$d;", "g", "()Landroidx/compose/ui/q$d;", "l", "(Landroidx/compose/ui/q$d;)V", "I", "h", "()I", "m", "Landroidx/compose/runtime/collection/g;", "f", "()Landroidx/compose/runtime/collection/g;", "k", "(Landroidx/compose/runtime/collection/g;)V", "e", "j", "Z", "i", "()Z", "n", "(Z)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,862:1\n523#2:863\n523#2:864\n523#2:865\n523#2:866\n523#2:867\n523#2:870\n523#2:871\n72#3:868\n261#4:869\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n*L\n422#1:863\n423#1:864\n430#1:865\n431#1:866\n456#1:867\n472#1:870\n473#1:871\n457#1:868\n457#1:869\n*E\n"})
    private final class a implements o {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private q.d node;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int offset;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private androidx.compose.runtime.collection.g<q.c> before;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private androidx.compose.runtime.collection.g<q.c> after;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean shouldAttachOnInsert;

        public a(@fg.l q.d dVar, int i4, @fg.l androidx.compose.runtime.collection.g<q.c> gVar, @fg.l androidx.compose.runtime.collection.g<q.c> gVar2, boolean z4) {
            this.node = dVar;
            this.offset = i4;
            this.before = gVar;
            this.after = gVar2;
            this.shouldAttachOnInsert = z4;
        }

        @Override // androidx.compose.ui.node.o
        public void a(int atIndex, int oldIndex) {
            q.d child = this.node.getChild();
            kotlin.jvm.internal.l0.m(child);
            b bVar = c1.this.logger;
            if (bVar != null) {
                androidx.compose.runtime.collection.g<q.c> gVar = this.before;
                bVar.d(oldIndex, gVar.L()[this.offset + oldIndex], child);
            }
            if ((child.getKindSet() & 2) != 0) {
                e1 coordinator = child.getCoordinator();
                kotlin.jvm.internal.l0.m(coordinator);
                e1 wrappedBy = coordinator.getWrappedBy();
                e1 wrapped = coordinator.getWrapped();
                kotlin.jvm.internal.l0.m(wrapped);
                if (wrappedBy != null) {
                    wrappedBy.R4(wrapped);
                }
                wrapped.T4(wrappedBy);
                c1.this.F(this.node, wrapped);
            }
            this.node = c1.this.i(child);
        }

        @Override // androidx.compose.ui.node.o
        public boolean b(int oldIndex, int newIndex) {
            return d1.d(this.before.L()[this.offset + oldIndex], this.after.L()[this.offset + newIndex]) != 0;
        }

        @Override // androidx.compose.ui.node.o
        public void c(int newIndex) {
            int i4 = this.offset + newIndex;
            q.d dVar = this.node;
            this.node = c1.this.g(this.after.L()[i4], dVar);
            b bVar = c1.this.logger;
            if (bVar != null) {
                bVar.a(i4, i4, this.after.L()[i4], dVar, this.node);
            }
            if (!this.shouldAttachOnInsert) {
                this.node.r7(true);
                return;
            }
            q.d child = this.node.getChild();
            kotlin.jvm.internal.l0.m(child);
            e1 coordinator = child.getCoordinator();
            kotlin.jvm.internal.l0.m(coordinator);
            c0 e4 = k.e(this.node);
            if (e4 != null) {
                d0 d0Var = new d0(c1.this.getLayoutNode(), e4);
                this.node.x7(d0Var);
                c1.this.F(this.node, d0Var);
                d0Var.T4(coordinator.getWrappedBy());
                d0Var.R4(coordinator);
                coordinator.T4(d0Var);
            } else {
                this.node.x7(coordinator);
            }
            this.node.g7();
            this.node.m7();
            h1.a(this.node);
        }

        @Override // androidx.compose.ui.node.o
        public void d(int oldIndex, int newIndex) {
            q.d child = this.node.getChild();
            kotlin.jvm.internal.l0.m(child);
            this.node = child;
            androidx.compose.runtime.collection.g<q.c> gVar = this.before;
            q.c cVar = gVar.L()[this.offset + oldIndex];
            androidx.compose.runtime.collection.g<q.c> gVar2 = this.after;
            q.c cVar2 = gVar2.L()[this.offset + newIndex];
            if (kotlin.jvm.internal.l0.g(cVar, cVar2)) {
                b bVar = c1.this.logger;
                if (bVar != null) {
                    int i4 = this.offset;
                    bVar.e(i4 + oldIndex, i4 + newIndex, cVar, cVar2, this.node);
                    return;
                }
                return;
            }
            c1.this.T(cVar, cVar2, this.node);
            b bVar2 = c1.this.logger;
            if (bVar2 != null) {
                int i5 = this.offset;
                bVar2.b(i5 + oldIndex, i5 + newIndex, cVar, cVar2, this.node);
            }
        }

        @fg.l
        public final androidx.compose.runtime.collection.g<q.c> e() {
            return this.after;
        }

        @fg.l
        public final androidx.compose.runtime.collection.g<q.c> f() {
            return this.before;
        }

        @fg.l
        /* renamed from: g, reason: from getter */
        public final q.d getNode() {
            return this.node;
        }

        /* renamed from: h, reason: from getter */
        public final int getOffset() {
            return this.offset;
        }

        /* renamed from: i, reason: from getter */
        public final boolean getShouldAttachOnInsert() {
            return this.shouldAttachOnInsert;
        }

        public final void j(@fg.l androidx.compose.runtime.collection.g<q.c> gVar) {
            this.after = gVar;
        }

        public final void k(@fg.l androidx.compose.runtime.collection.g<q.c> gVar) {
            this.before = gVar;
        }

        public final void l(@fg.l q.d dVar) {
            this.node = dVar;
        }

        public final void m(int i4) {
            this.offset = i4;
        }

        public final void n(boolean z4) {
            this.shouldAttachOnInsert = z4;
        }
    }

    /* compiled from: NodeChain.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b`\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0010\u0010\u000fJ7\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H&¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/c1$b;", "", "", "index", "Landroidx/compose/ui/q$c;", "prev", "next", "Landroidx/compose/ui/q$d;", "node", "Lkotlin/k2;", "c", "(ILandroidx/compose/ui/q$c;Landroidx/compose/ui/q$c;Landroidx/compose/ui/q$d;)V", "oldIndex", "newIndex", "b", "(IILandroidx/compose/ui/q$c;Landroidx/compose/ui/q$c;Landroidx/compose/ui/q$d;)V", "e", "atIndex", "element", "child", "inserted", "a", "(IILandroidx/compose/ui/q$c;Landroidx/compose/ui/q$d;Landroidx/compose/ui/q$d;)V", "d", "(ILandroidx/compose/ui/q$c;Landroidx/compose/ui/q$d;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b {
        void a(int atIndex, int newIndex, @fg.l q.c element, @fg.l q.d child, @fg.l q.d inserted);

        void b(int oldIndex, int newIndex, @fg.l q.c prev, @fg.l q.c next, @fg.l q.d node);

        void c(int index, @fg.l q.c prev, @fg.l q.c next, @fg.l q.d node);

        void d(int oldIndex, @fg.l q.c element, @fg.l q.d node);

        void e(int oldIndex, int newIndex, @fg.l q.c prev, @fg.l q.c next, @fg.l q.d node);
    }

    public c1(@fg.l h0 h0Var) {
        this.layoutNode = h0Var;
        v vVar = new v(h0Var);
        this.innerCoordinator = vVar;
        this.outerCoordinator = vVar;
        b2 tail = vVar.getTail();
        this.tail = tail;
        this.head = tail;
    }

    private final q.d A(q.d node, q.d child) {
        q.d parent = child.getParent();
        if (parent != null) {
            parent.q7(node);
            node.u7(parent);
        }
        child.u7(node);
        node.q7(child);
        return node;
    }

    private final boolean B() {
        d1.a aVar;
        q.d dVar = this.head;
        aVar = d1.f19222a;
        return dVar == aVar;
    }

    private final q.d E() {
        d1.a aVar;
        d1.a aVar2;
        d1.a aVar3;
        d1.a aVar4;
        q.d dVar = this.head;
        aVar = d1.f19222a;
        if (dVar == aVar) {
            throw new IllegalStateException("padChain called on already padded chain");
        }
        q.d dVar2 = this.head;
        aVar2 = d1.f19222a;
        dVar2.u7(aVar2);
        aVar3 = d1.f19222a;
        aVar3.q7(dVar2);
        aVar4 = d1.f19222a;
        return aVar4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(q.d start, e1 coordinator) {
        d1.a aVar;
        for (q.d parent = start.getParent(); parent != null; parent = parent.getParent()) {
            aVar = d1.f19222a;
            if (parent == aVar) {
                h0 B0 = this.layoutNode.B0();
                coordinator.T4(B0 != null ? B0.d0() : null);
                this.outerCoordinator = coordinator;
                return;
            } else {
                if ((parent.getKindSet() & 2) != 0) {
                    return;
                }
                parent.x7(coordinator);
            }
        }
    }

    private final q.d G(q.d node) {
        q.d child = node.getChild();
        q.d parent = node.getParent();
        if (child != null) {
            child.u7(parent);
            node.q7(null);
        }
        if (parent != null) {
            parent.q7(child);
            node.u7(null);
        }
        kotlin.jvm.internal.l0.m(parent);
        return parent;
    }

    private final void K(int offset, androidx.compose.runtime.collection.g<q.c> before, androidx.compose.runtime.collection.g<q.c> after, q.d tail, boolean shouldAttachOnInsert) {
        a1.e(before.getSize() - offset, after.getSize() - offset, l(tail, offset, before, after, shouldAttachOnInsert));
        L();
    }

    private final void L() {
        d1.a aVar;
        int i4 = 0;
        for (q.d parent = this.tail.getParent(); parent != null; parent = parent.getParent()) {
            aVar = d1.f19222a;
            if (parent == aVar) {
                return;
            }
            i4 |= parent.getKindSet();
            parent.o7(i4);
        }
    }

    private final q.d R(q.d paddedHead) {
        d1.a aVar;
        d1.a aVar2;
        d1.a aVar3;
        d1.a aVar4;
        d1.a aVar5;
        d1.a aVar6;
        aVar = d1.f19222a;
        if (paddedHead != aVar) {
            throw new IllegalStateException("trimChain called on already trimmed chain");
        }
        aVar2 = d1.f19222a;
        q.d child = aVar2.getChild();
        if (child == null) {
            child = this.tail;
        }
        child.u7(null);
        aVar3 = d1.f19222a;
        aVar3.q7(null);
        aVar4 = d1.f19222a;
        aVar4.o7(-1);
        aVar5 = d1.f19222a;
        aVar5.x7(null);
        aVar6 = d1.f19222a;
        if (child != aVar6) {
            return child;
        }
        throw new IllegalStateException("trimChain did not update the head");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(q.c prev, q.c next, q.d node) {
        if ((prev instanceof y0) && (next instanceof y0)) {
            d1.f((y0) next, node);
            if (node.getIsAttached()) {
                h1.e(node);
                return;
            } else {
                node.v7(true);
                return;
            }
        }
        if (!(node instanceof c)) {
            throw new IllegalStateException("Unknown Modifier.Node type");
        }
        ((c) node).D7(next);
        if (node.getIsAttached()) {
            h1.e(node);
        } else {
            node.v7(true);
        }
    }

    public static final int c(c1 c1Var) {
        return c1Var.head.getAggregateChildKindSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q.d g(q.c element, q.d parent) {
        q.d cVar;
        if (element instanceof y0) {
            cVar = ((y0) element).i();
            cVar.s7(h1.h(cVar));
        } else {
            cVar = new c(element);
        }
        if (cVar.getIsAttached()) {
            throw new IllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        cVar.r7(true);
        return z(cVar, parent);
    }

    private final q.d h(q.c element, q.d child) {
        q.d cVar;
        if (element instanceof y0) {
            cVar = ((y0) element).i();
            cVar.s7(h1.h(cVar));
        } else {
            cVar = new c(element);
        }
        if (cVar.getIsAttached()) {
            throw new IllegalStateException("createAndInsertNodeAsParent called on an attached node");
        }
        cVar.r7(true);
        return A(cVar, child);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q.d i(q.d node) {
        if (node.getIsAttached()) {
            h1.d(node);
            node.n7();
            node.h7();
        }
        return G(node);
    }

    private final int k() {
        return this.head.getAggregateChildKindSet();
    }

    private final a l(q.d head, int offset, androidx.compose.runtime.collection.g<q.c> before, androidx.compose.runtime.collection.g<q.c> after, boolean shouldAttachOnInsert) {
        a aVar = this.cachedDiffer;
        if (aVar == null) {
            a aVar2 = new a(head, offset, before, after, shouldAttachOnInsert);
            this.cachedDiffer = aVar2;
            return aVar2;
        }
        aVar.l(head);
        aVar.m(offset);
        aVar.k(before);
        aVar.j(after);
        aVar.n(shouldAttachOnInsert);
        return aVar;
    }

    private final q.d z(q.d node, q.d parent) {
        q.d child = parent.getChild();
        if (child != null) {
            child.u7(node);
            node.q7(child);
        }
        parent.q7(node);
        node.u7(parent);
        return node;
    }

    public final void C() {
        for (q.d dVar = this.head; dVar != null; dVar = dVar.getChild()) {
            dVar.g7();
        }
    }

    public final void D() {
        for (q.d dVar = this.tail; dVar != null; dVar = dVar.getParent()) {
            if (dVar.getIsAttached()) {
                dVar.h7();
            }
        }
    }

    public final void H() {
        int size;
        for (q.d dVar = this.tail; dVar != null; dVar = dVar.getParent()) {
            if (dVar.getIsAttached()) {
                dVar.l7();
            }
        }
        androidx.compose.runtime.collection.g<q.c> gVar = this.current;
        if (gVar != null && (size = gVar.getSize()) > 0) {
            q.c[] L = gVar.L();
            int i4 = 0;
            do {
                q.c cVar = L[i4];
                if (cVar instanceof SuspendPointerInputElement) {
                    gVar.s0(i4, new ForceUpdateElement((y0) cVar));
                }
                i4++;
            } while (i4 < size);
        }
        J();
        D();
    }

    public final void I() {
        for (q.d dVar = this.head; dVar != null; dVar = dVar.getChild()) {
            dVar.m7();
            if (dVar.getInsertedNodeAwaitingAttachForInvalidation()) {
                h1.a(dVar);
            }
            if (dVar.getUpdatedNodeAwaitingAttachForInvalidation()) {
                h1.e(dVar);
            }
            dVar.r7(false);
            dVar.v7(false);
        }
    }

    public final void J() {
        for (q.d dVar = this.tail; dVar != null; dVar = dVar.getParent()) {
            if (dVar.getIsAttached()) {
                dVar.n7();
            }
        }
    }

    public final void M() {
        e1 d0Var;
        e1 e1Var = this.innerCoordinator;
        for (q.d parent = this.tail.getParent(); parent != null; parent = parent.getParent()) {
            c0 e4 = k.e(parent);
            if (e4 != null) {
                if (parent.getCoordinator() != null) {
                    e1 coordinator = parent.getCoordinator();
                    kotlin.jvm.internal.l0.n(coordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    d0Var = (d0) coordinator;
                    c0 layoutModifierNode = d0Var.getLayoutModifierNode();
                    d0Var.V5(e4);
                    if (layoutModifierNode != parent) {
                        d0Var.e4();
                    }
                } else {
                    d0Var = new d0(this.layoutNode, e4);
                    parent.x7(d0Var);
                }
                e1Var.T4(d0Var);
                d0Var.R4(e1Var);
                e1Var = d0Var;
            } else {
                parent.x7(e1Var);
            }
        }
        h0 B0 = this.layoutNode.B0();
        e1Var.T4(B0 != null ? B0.d0() : null);
        this.outerCoordinator = e1Var;
    }

    public final <T> T N(int type) {
        if ((this.head.getAggregateChildKindSet() & type) == 0) {
            return null;
        }
        for (Object obj = (T) this.tail; obj != null; obj = (T) ((q.d) obj).getParent()) {
            if ((((q.d) obj).getKindSet() & type) != 0) {
                kotlin.jvm.internal.l0.P();
                return (T) obj;
            }
        }
        return null;
    }

    public final void O(int mask, @fg.l ld.l<? super q.d, k2> block) {
        if ((this.head.getAggregateChildKindSet() & mask) == 0) {
            return;
        }
        for (q.d dVar = this.tail; dVar != null; dVar = dVar.getParent()) {
            if ((dVar.getKindSet() & mask) != 0) {
                block.invoke(dVar);
            }
        }
    }

    public final void P(@fg.l ld.l<? super q.d, k2> block) {
        for (q.d dVar = this.tail; dVar != null; dVar = dVar.getParent()) {
            block.invoke(dVar);
        }
    }

    public final <T> void Q(int type, ld.l<? super T, k2> block) {
        if ((this.head.getAggregateChildKindSet() & type) != 0) {
            for (q.d dVar = this.tail; dVar != null; dVar = dVar.getParent()) {
                if ((dVar.getKindSet() & type) != 0) {
                    for (q.d dVar2 = dVar; dVar2 != null; dVar2 = k.l(null)) {
                        kotlin.jvm.internal.l0.P();
                        block.invoke(dVar2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
    
        if (r2 >= r1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        if (r8 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
    
        if (r5 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:
    
        K(r2, r8, r9, r5, r18.layoutNode.f());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
    
        throw new java.lang.IllegalStateException("structuralUpdate requires a non-null tail");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b5, code lost:
    
        throw new java.lang.IllegalStateException("expected prior modifier list to be non-empty");
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S(@fg.l androidx.compose.ui.q r19) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.c1.S(androidx.compose.ui.q):void");
    }

    public final void U(@fg.m b logger) {
        this.logger = logger;
    }

    public final <T> T j(int type, ld.l<? super T, Boolean> block) {
        if ((this.head.getAggregateChildKindSet() & type) != 0) {
            for (q.d dVar = this.head; dVar != null; dVar = dVar.getChild()) {
                if ((dVar.getKindSet() & type) != 0) {
                    for (q.d dVar2 = dVar; dVar2 != null; dVar2 = k.l(null)) {
                        kotlin.jvm.internal.l0.P();
                        if (block.invoke(dVar2).booleanValue()) {
                            return dVar2;
                        }
                    }
                }
                if ((dVar.getAggregateChildKindSet() & type) == 0) {
                    break;
                }
            }
        }
        return null;
    }

    @fg.l
    /* renamed from: m, reason: from getter */
    public final q.d getHead() {
        return this.head;
    }

    @fg.l
    /* renamed from: n, reason: from getter */
    public final v getInnerCoordinator() {
        return this.innerCoordinator;
    }

    @fg.l
    /* renamed from: o, reason: from getter */
    public final h0 getLayoutNode() {
        return this.layoutNode;
    }

    @fg.l
    public final List<androidx.compose.ui.layout.r0> p() {
        androidx.compose.runtime.collection.g<q.c> gVar = this.current;
        if (gVar == null) {
            return kotlin.collections.j0.f74919b;
        }
        int i4 = 0;
        androidx.compose.runtime.collection.g gVar2 = new androidx.compose.runtime.collection.g(new androidx.compose.ui.layout.r0[gVar.getSize()], 0);
        q.d dVar = this.head;
        while (dVar != null && dVar != this.tail) {
            e1 coordinator = dVar.getCoordinator();
            if (coordinator == null) {
                throw new IllegalArgumentException("getModifierInfo called on node with no coordinator");
            }
            o1 layer = coordinator.getLayer();
            o1 layer2 = this.innerCoordinator.getLayer();
            q.d child = dVar.getChild();
            if (child != this.tail || dVar.getCoordinator() == child.getCoordinator()) {
                layer2 = null;
            }
            if (layer == null) {
                layer = layer2;
            }
            gVar2.b(new androidx.compose.ui.layout.r0(gVar.L()[i4], coordinator, layer));
            dVar = dVar.getChild();
            i4++;
        }
        return gVar2.l();
    }

    @fg.l
    /* renamed from: q, reason: from getter */
    public final e1 getOuterCoordinator() {
        return this.outerCoordinator;
    }

    @fg.l
    /* renamed from: r, reason: from getter */
    public final q.d getTail() {
        return this.tail;
    }

    public final boolean s(int mask) {
        return (mask & this.head.getAggregateChildKindSet()) != 0;
    }

    public final boolean t(int type) {
        return (type & this.head.getAggregateChildKindSet()) != 0;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        q.d dVar = this.head;
        if (dVar != this.tail) {
            while (true) {
                if (dVar == null || dVar == this.tail) {
                    break;
                }
                sb.append(String.valueOf(dVar));
                if (dVar.getChild() == this.tail) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                dVar = dVar.getChild();
            }
        } else {
            sb.append("]");
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final <T> T u(int type) {
        if ((this.head.getAggregateChildKindSet() & type) == 0) {
            return null;
        }
        for (Object obj = (T) this.head; obj != null; obj = (T) ((q.d) obj).getChild()) {
            if ((((q.d) obj).getKindSet() & type) != 0) {
                kotlin.jvm.internal.l0.P();
                return (T) obj;
            }
            if ((((q.d) obj).getAggregateChildKindSet() & type) == 0) {
                return null;
            }
        }
        return null;
    }

    public final void v(int mask, @fg.l ld.l<? super q.d, k2> block) {
        if ((this.head.getAggregateChildKindSet() & mask) == 0) {
            return;
        }
        for (q.d dVar = this.head; dVar != null; dVar = dVar.getChild()) {
            if ((dVar.getKindSet() & mask) != 0) {
                block.invoke(dVar);
            }
            if ((dVar.getAggregateChildKindSet() & mask) == 0) {
                return;
            }
        }
    }

    public final void w(@fg.l ld.l<? super q.d, k2> block) {
        for (q.d dVar = this.head; dVar != null; dVar = dVar.getChild()) {
            block.invoke(dVar);
        }
    }

    public final <T> void x(int type, ld.l<? super T, k2> block) {
        if ((this.head.getAggregateChildKindSet() & type) != 0) {
            for (q.d dVar = this.head; dVar != null; dVar = dVar.getChild()) {
                if ((dVar.getKindSet() & type) != 0) {
                    for (q.d dVar2 = dVar; dVar2 != null; dVar2 = k.l(null)) {
                        kotlin.jvm.internal.l0.P();
                        block.invoke(dVar2);
                    }
                }
                if ((dVar.getAggregateChildKindSet() & type) == 0) {
                    return;
                }
            }
        }
    }

    public final void y(@fg.l ld.l<? super q.d, k2> block) {
        for (q.d dVar = this.head; dVar != null && dVar != this.tail; dVar = dVar.getChild()) {
            block.invoke(dVar);
        }
    }
}
