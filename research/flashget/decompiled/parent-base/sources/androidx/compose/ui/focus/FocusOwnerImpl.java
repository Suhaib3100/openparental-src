package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.collection.d2;
import androidx.compose.ui.focus.a0;
import androidx.compose.ui.focus.f;
import androidx.compose.ui.input.key.d;
import androidx.compose.ui.node.c1;
import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.a2;
import androidx.compose.ui.q;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: FocusOwnerImpl.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007JY\u0010\u000e\u001a\u00020\u0004\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\b*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0002H\u0082\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0015H\u0016¢\u0006\u0004\b#\u0010$J\u001a\u0010%\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010\u0017J\u001a\u0010&\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010\u001bJ\u001a\u0010'\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b'\u0010\u001bJ\u0017\u0010*\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00042\u0006\u0010-\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00042\u0006\u0010-\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u0011\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b7\u00108R\"\u0010>\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010/R\u0014\u0010A\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010@R\u001a\u0010G\u001a\u00020B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010K\u001a\u00020H8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010I\u001a\u0004\bC\u0010JR\"\u0010Q\u001a\u00020L8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b#\u0010M\u001a\u0004\bN\u0010O\"\u0004\b9\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010S\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006U"}, d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Landroidx/compose/ui/focus/s;", "Lkotlin/Function1;", "Lkotlin/Function0;", "Lkotlin/k2;", "onRequestApplyChangesListener", "<init>", "(Lld/l;)V", "Landroidx/compose/ui/node/j;", "T", "Landroidx/compose/ui/node/g1;", "type", "onPreVisit", "onVisit", "t", "(Landroidx/compose/ui/node/j;ILld/l;Lld/l;)V", "Landroidx/compose/ui/q$d;", "r", "(Landroidx/compose/ui/node/j;)Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/focus/f;", "focusDirection", "", "v", "(I)Z", "Landroidx/compose/ui/input/key/c;", "keyEvent", "u", "(Landroid/view/KeyEvent;)Z", "d", "()V", "n", "force", "o", "(Z)V", "refreshFocusEvents", "e", "(ZZ)V", "g", "p", "h", "Landroidx/compose/ui/input/rotary/d;", "event", "k", "(Landroidx/compose/ui/input/rotary/d;)Z", "Landroidx/compose/ui/focus/FocusTargetNode;", "node", "i", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/focus/i;", "b", "(Landroidx/compose/ui/focus/i;)V", "Landroidx/compose/ui/focus/w;", "l", "(Landroidx/compose/ui/focus/w;)V", "Li0/i;", "m", "()Li0/i;", "a", "Landroidx/compose/ui/focus/FocusTargetNode;", "q", "()Landroidx/compose/ui/focus/FocusTargetNode;", "s", "rootFocusNode", "Landroidx/compose/ui/focus/l;", "Landroidx/compose/ui/focus/l;", "focusInvalidationManager", "Landroidx/compose/ui/focus/o0;", "c", "Landroidx/compose/ui/focus/o0;", "f", "()Landroidx/compose/ui/focus/o0;", "focusTransactionManager", "Landroidx/compose/ui/q;", "Landroidx/compose/ui/q;", "()Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/ui/unit/w;", "Landroidx/compose/ui/unit/w;", "getLayoutDirection", "()Landroidx/compose/ui/unit/w;", "(Landroidx/compose/ui/unit/w;)V", "layoutDirection", "Landroidx/collection/d2;", "Landroidx/collection/d2;", "keysCurrentlyDown", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nFocusOwnerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n+ 2 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 10 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 11 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n*L\n1#1,335:1\n266#1:420\n267#1:492\n268#1:499\n269#1:546\n270#1:593\n271#1:600\n266#1:671\n267#1:743\n268#1:750\n269#1:797\n270#1:844\n271#1:851\n266#1:922\n267#1:994\n268#1:1001\n269#1:1048\n270#1:1095\n271#1:1102\n39#2,7:336\n46#2,4:346\n1#3:343\n1#3:358\n1#3:429\n1#3:609\n1#3:680\n1#3:860\n1#3:931\n1#3:1111\n1#3:1281\n1#3:1293\n728#4,2:344\n96#5:350\n96#5:419\n104#5:601\n104#5:670\n98#5:852\n98#5:921\n90#5,7:1272\n90#5:1288\n262#6:351\n230#6,5:352\n58#6:357\n59#6,8:359\n385#6,5:367\n263#6:372\n390#6:373\n395#6,2:375\n397#6,8:380\n405#6,9:391\n414#6,8:403\n68#6,7:411\n265#6:418\n253#6,2:421\n230#6,5:423\n58#6:428\n59#6,8:430\n385#6,5:438\n255#6,3:443\n390#6:446\n395#6,2:448\n397#6,8:453\n405#6,9:464\n414#6,8:476\n68#6,7:484\n258#6:491\n385#6,12:500\n397#6,8:515\n405#6,9:526\n414#6,8:538\n385#6,12:547\n397#6,8:562\n405#6,9:573\n414#6,8:585\n262#6:602\n230#6,5:603\n58#6:608\n59#6,8:610\n385#6,5:618\n263#6:623\n390#6:624\n395#6,2:626\n397#6,8:631\n405#6,9:642\n414#6,8:654\n68#6,7:662\n265#6:669\n253#6,2:672\n230#6,5:674\n58#6:679\n59#6,8:681\n385#6,5:689\n255#6,3:694\n390#6:697\n395#6,2:699\n397#6,8:704\n405#6,9:715\n414#6,8:727\n68#6,7:735\n258#6:742\n385#6,12:751\n397#6,8:766\n405#6,9:777\n414#6,8:789\n385#6,12:798\n397#6,8:813\n405#6,9:824\n414#6,8:836\n262#6:853\n230#6,5:854\n58#6:859\n59#6,8:861\n385#6,5:869\n263#6:874\n390#6:875\n395#6,2:877\n397#6,8:882\n405#6,9:893\n414#6,8:905\n68#6,7:913\n265#6:920\n253#6,2:923\n230#6,5:925\n58#6:930\n59#6,8:932\n385#6,5:940\n255#6,3:945\n390#6:948\n395#6,2:950\n397#6,8:955\n405#6,9:966\n414#6,8:978\n68#6,7:986\n258#6:993\n385#6,12:1002\n397#6,8:1017\n405#6,9:1028\n414#6,8:1040\n385#6,12:1049\n397#6,8:1064\n405#6,9:1075\n414#6,8:1087\n253#6,2:1103\n230#6,5:1105\n58#6:1110\n59#6,8:1112\n385#6,5:1120\n255#6,3:1125\n390#6:1128\n395#6,2:1130\n397#6,8:1135\n405#6,9:1146\n414#6,8:1158\n68#6,7:1166\n258#6:1173\n385#6,6:1180\n395#6,2:1187\n397#6,8:1192\n405#6,9:1203\n414#6,8:1215\n385#6,6:1223\n395#6,2:1230\n397#6,8:1235\n405#6,9:1246\n414#6,8:1258\n190#6:1280\n191#6,6:1282\n198#6,3:1290\n261#7:374\n261#7:447\n261#7:625\n261#7:698\n261#7:876\n261#7:949\n261#7:1129\n261#7:1186\n261#7:1229\n261#7:1289\n234#8,3:377\n237#8,3:400\n234#8,3:450\n237#8,3:473\n234#8,3:512\n237#8,3:535\n234#8,3:559\n237#8,3:582\n234#8,3:628\n237#8,3:651\n234#8,3:701\n237#8,3:724\n234#8,3:763\n237#8,3:786\n234#8,3:810\n237#8,3:833\n234#8,3:879\n237#8,3:902\n234#8,3:952\n237#8,3:975\n234#8,3:1014\n237#8,3:1037\n234#8,3:1061\n237#8,3:1084\n234#8,3:1132\n237#8,3:1155\n234#8,3:1189\n237#8,3:1212\n234#8,3:1232\n237#8,3:1255\n1208#9:388\n1187#9,2:389\n1208#9:461\n1187#9,2:462\n1208#9:523\n1187#9,2:524\n1208#9:570\n1187#9,2:571\n1208#9:639\n1187#9,2:640\n1208#9:712\n1187#9,2:713\n1208#9:774\n1187#9,2:775\n1208#9:821\n1187#9,2:822\n1208#9:890\n1187#9,2:891\n1208#9:963\n1187#9,2:964\n1208#9:1025\n1187#9,2:1026\n1208#9:1072\n1187#9,2:1073\n1208#9:1143\n1187#9,2:1144\n1208#9:1200\n1187#9,2:1201\n1208#9:1243\n1187#9,2:1244\n51#10,6:493\n33#10,6:594\n51#10,6:744\n33#10,6:845\n51#10,6:995\n33#10,6:1096\n51#10,6:1174\n33#10,6:1266\n47#11:1279\n*S KotlinDebug\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n*L\n212#1:420\n212#1:492\n212#1:499\n212#1:546\n212#1:593\n212#1:600\n225#1:671\n225#1:743\n225#1:750\n225#1:797\n225#1:844\n225#1:851\n240#1:922\n240#1:994\n240#1:1001\n240#1:1048\n240#1:1095\n240#1:1102\n138#1:336,7\n138#1:346,4\n138#1:343\n210#1:358\n212#1:429\n223#1:609\n225#1:680\n238#1:860\n240#1:931\n266#1:1111\n282#1:1281\n138#1:344,2\n210#1:350\n213#1:419\n223#1:601\n226#1:670\n238#1:852\n241#1:921\n282#1:1272,7\n283#1:1288\n210#1:351\n210#1:352,5\n210#1:357\n210#1:359,8\n210#1:367,5\n210#1:372\n210#1:373\n210#1:375,2\n210#1:380,8\n210#1:391,9\n210#1:403,8\n210#1:411,7\n210#1:418\n212#1:421,2\n212#1:423,5\n212#1:428\n212#1:430,8\n212#1:438,5\n212#1:443,3\n212#1:446\n212#1:448,2\n212#1:453,8\n212#1:464,9\n212#1:476,8\n212#1:484,7\n212#1:491\n212#1:500,12\n212#1:515,8\n212#1:526,9\n212#1:538,8\n212#1:547,12\n212#1:562,8\n212#1:573,9\n212#1:585,8\n223#1:602\n223#1:603,5\n223#1:608\n223#1:610,8\n223#1:618,5\n223#1:623\n223#1:624\n223#1:626,2\n223#1:631,8\n223#1:642,9\n223#1:654,8\n223#1:662,7\n223#1:669\n225#1:672,2\n225#1:674,5\n225#1:679\n225#1:681,8\n225#1:689,5\n225#1:694,3\n225#1:697\n225#1:699,2\n225#1:704,8\n225#1:715,9\n225#1:727,8\n225#1:735,7\n225#1:742\n225#1:751,12\n225#1:766,8\n225#1:777,9\n225#1:789,8\n225#1:798,12\n225#1:813,8\n225#1:824,9\n225#1:836,8\n238#1:853\n238#1:854,5\n238#1:859\n238#1:861,8\n238#1:869,5\n238#1:874\n238#1:875\n238#1:877,2\n238#1:882,8\n238#1:893,9\n238#1:905,8\n238#1:913,7\n238#1:920\n240#1:923,2\n240#1:925,5\n240#1:930\n240#1:932,8\n240#1:940,5\n240#1:945,3\n240#1:948\n240#1:950,2\n240#1:955,8\n240#1:966,9\n240#1:978,8\n240#1:986,7\n240#1:993\n240#1:1002,12\n240#1:1017,8\n240#1:1028,9\n240#1:1040,8\n240#1:1049,12\n240#1:1064,8\n240#1:1075,9\n240#1:1087,8\n266#1:1103,2\n266#1:1105,5\n266#1:1110\n266#1:1112,8\n266#1:1120,5\n266#1:1125,3\n266#1:1128\n266#1:1130,2\n266#1:1135,8\n266#1:1146,9\n266#1:1158,8\n266#1:1166,7\n266#1:1173\n268#1:1180,6\n268#1:1187,2\n268#1:1192,8\n268#1:1203,9\n268#1:1215,8\n269#1:1223,6\n269#1:1230,2\n269#1:1235,8\n269#1:1246,9\n269#1:1258,8\n282#1:1280\n282#1:1282,6\n282#1:1290,3\n210#1:374\n212#1:447\n223#1:625\n225#1:698\n238#1:876\n240#1:949\n266#1:1129\n268#1:1186\n269#1:1229\n283#1:1289\n210#1:377,3\n210#1:400,3\n212#1:450,3\n212#1:473,3\n212#1:512,3\n212#1:535,3\n212#1:559,3\n212#1:582,3\n223#1:628,3\n223#1:651,3\n225#1:701,3\n225#1:724,3\n225#1:763,3\n225#1:786,3\n225#1:810,3\n225#1:833,3\n238#1:879,3\n238#1:902,3\n240#1:952,3\n240#1:975,3\n240#1:1014,3\n240#1:1037,3\n240#1:1061,3\n240#1:1084,3\n266#1:1132,3\n266#1:1155,3\n268#1:1189,3\n268#1:1212,3\n269#1:1232,3\n269#1:1255,3\n210#1:388\n210#1:389,2\n212#1:461\n212#1:462,2\n212#1:523\n212#1:524,2\n212#1:570\n212#1:571,2\n223#1:639\n223#1:640,2\n225#1:712\n225#1:713,2\n225#1:774\n225#1:775,2\n225#1:821\n225#1:822,2\n238#1:890\n238#1:891,2\n240#1:963\n240#1:964,2\n240#1:1025\n240#1:1026,2\n240#1:1072\n240#1:1073,2\n266#1:1143\n266#1:1144,2\n268#1:1200\n268#1:1201,2\n269#1:1243\n269#1:1244,2\n212#1:493,6\n212#1:594,6\n225#1:744,6\n225#1:845,6\n240#1:995,6\n240#1:1096,6\n267#1:1174,6\n270#1:1266,6\n282#1:1279\n*E\n"})
/* loaded from: classes.dex */
public final class FocusOwnerImpl implements s {

    /* renamed from: g, reason: collision with root package name */
    public static final int f17485g = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l focusInvalidationManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.ui.unit.w layoutDirection;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private d2 keysCurrentlyDown;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private FocusTargetNode rootFocusNode = new FocusTargetNode();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final o0 focusTransactionManager = new o0();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.q modifier = new y0<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // androidx.compose.ui.node.y0
        public boolean equals(@fg.m Object other) {
            return other == this;
        }

        @Override // androidx.compose.ui.node.y0
        public int hashCode() {
            return FocusOwnerImpl.this.getRootFocusNode().hashCode();
        }

        @Override // androidx.compose.ui.node.y0
        public FocusTargetNode i() {
            return FocusOwnerImpl.this.getRootFocusNode();
        }

        @Override // androidx.compose.ui.node.y0
        public void k(@fg.l a2 a2Var) {
            a2Var.d("RootFocusTarget");
        }

        @Override // androidx.compose.ui.node.y0
        public void m(FocusTargetNode focusTargetNode) {
        }

        @fg.l
        public FocusTargetNode n() {
            return FocusOwnerImpl.this.getRootFocusNode();
        }

        public void o(@fg.l FocusTargetNode node) {
        }
    };

    /* compiled from: FocusOwnerImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17492a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f17493b;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f17492a = iArr;
            int[] iArr2 = new int[k0.values().length];
            try {
                iArr2[k0.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[k0.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[k0.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[k0.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f17493b = iArr2;
        }
    }

    /* compiled from: FocusOwnerImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "destination", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nFocusOwnerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$foundNextItem$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,335:1\n90#2:336\n262#3:337\n230#3,5:338\n58#3:343\n59#3,8:345\n385#3,5:353\n263#3:358\n390#3:359\n395#3,2:361\n397#3,8:366\n405#3,9:377\n414#3,8:389\n68#3,7:397\n265#3:404\n1#4:344\n1#4:412\n261#5:360\n234#6,3:363\n237#6,3:386\n1208#7:374\n1187#7,2:375\n39#8,7:405\n46#8,4:415\n728#9,2:413\n*S KotlinDebug\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$foundNextItem$1\n*L\n182#1:336\n182#1:337\n182#1:338,5\n182#1:343\n182#1:345,8\n182#1:353,5\n182#1:358\n182#1:359\n182#1:361,2\n182#1:366,8\n182#1:377,9\n182#1:389,8\n182#1:397,7\n182#1:404\n182#1:344\n187#1:412\n182#1:360\n182#1:363,3\n182#1:386,3\n182#1:374\n182#1:375,2\n187#1:405,7\n187#1:415,4\n187#1:413,2\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<FocusTargetNode, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f17494b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusOwnerImpl f17495c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f17496d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k1.a f17497e;

        /* compiled from: FocusOwnerImpl.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f17498a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.Redirected.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.Cancelled.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.RedirectCancelled.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[c.None.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f17498a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FocusTargetNode focusTargetNode, FocusOwnerImpl focusOwnerImpl, int i4, k1.a aVar) {
            super(1);
            this.f17494b = focusTargetNode;
            this.f17495c = focusOwnerImpl;
            this.f17496d = i4;
            this.f17497e = aVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l FocusTargetNode focusTargetNode) {
            q.d dVar;
            boolean z4;
            boolean z5;
            c1 nodes;
            if (kotlin.jvm.internal.l0.g(focusTargetNode, this.f17494b)) {
                return Boolean.FALSE;
            }
            if (!focusTargetNode.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            q.d parent = focusTargetNode.getNode().getParent();
            androidx.compose.ui.node.h0 p4 = androidx.compose.ui.node.k.p(focusTargetNode);
            loop0: while (true) {
                dVar = null;
                z4 = true;
                if (p4 == null) {
                    break;
                }
                if ((androidx.compose.ui.focus.a.a(p4) & 1024) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & 1024) != 0) {
                            q.d dVar2 = parent;
                            androidx.compose.runtime.collection.g gVar = null;
                            while (dVar2 != null) {
                                if (dVar2 instanceof FocusTargetNode) {
                                    dVar = dVar2;
                                    break loop0;
                                }
                                if ((dVar2.getKindSet() & 1024) != 0 && (dVar2 instanceof androidx.compose.ui.node.l)) {
                                    int i4 = 0;
                                    for (q.d delegate = ((androidx.compose.ui.node.l) dVar2).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                        if ((delegate.getKindSet() & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                dVar2 = delegate;
                                            } else {
                                                if (gVar == null) {
                                                    gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                                }
                                                if (dVar2 != null) {
                                                    gVar.b(dVar2);
                                                    dVar2 = null;
                                                }
                                                gVar.b(delegate);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                dVar2 = androidx.compose.ui.node.k.l(gVar);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                p4 = p4.B0();
                parent = (p4 == null || (nodes = p4.getNodes()) == null) ? null : nodes.getTail();
            }
            if (dVar == null) {
                throw new IllegalStateException("Focus search landed at the root.");
            }
            o0 focusTransactionManager = this.f17495c.getFocusTransactionManager();
            int i5 = this.f17496d;
            k1.a aVar = this.f17497e;
            try {
                z5 = focusTransactionManager.ongoingTransaction;
                if (z5) {
                    focusTransactionManager.g();
                }
                o0.a(focusTransactionManager);
                int i6 = a.f17498a[p0.k(focusTargetNode, i5).ordinal()];
                if (i6 != 1) {
                    if (i6 == 2 || i6 == 3) {
                        aVar.f75322b = true;
                    } else {
                        if (i6 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z4 = p0.l(focusTargetNode);
                    }
                }
                Boolean valueOf = Boolean.valueOf(z4);
                focusTransactionManager.h();
                return valueOf;
            } catch (Throwable th) {
                focusTransactionManager.h();
                throw th;
            }
        }
    }

    public FocusOwnerImpl(@fg.l ld.l<? super ld.a<k2>, k2> lVar) {
        this.focusInvalidationManager = new l(lVar);
    }

    private final q.d r(androidx.compose.ui.node.j jVar) {
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitLocalDescendants called on an unattached node");
        }
        q.d node = jVar.getNode();
        q.d dVar = null;
        if ((node.getAggregateChildKindSet() & 9216) != 0) {
            for (q.d child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & 9216) != 0) {
                    if ((child.getKindSet() & 1024) != 0) {
                        return dVar;
                    }
                    dVar = child;
                }
            }
        }
        return dVar;
    }

    private final <T extends androidx.compose.ui.node.j> void t(androidx.compose.ui.node.j jVar, int i4, ld.l<? super T, k2> lVar, ld.l<? super T, k2> lVar2) {
        int size;
        c1 nodes;
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        q.d parent = jVar.getNode().getParent();
        androidx.compose.ui.node.h0 p4 = androidx.compose.ui.node.k.p(jVar);
        ArrayList arrayList = null;
        while (p4 != null) {
            if ((androidx.compose.ui.focus.a.a(p4) & i4) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i4) != 0) {
                        for (q.d dVar = parent; dVar != null; dVar = androidx.compose.ui.node.k.l(null)) {
                            kotlin.jvm.internal.l0.P();
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(dVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            p4 = p4.B0();
            parent = (p4 == null || (nodes = p4.getNodes()) == null) ? null : nodes.getTail();
        }
        if (arrayList != null && arrayList.size() - 1 >= 0) {
            while (true) {
                int i5 = size - 1;
                lVar.invoke((Object) arrayList.get(size));
                if (i5 < 0) {
                    break;
                } else {
                    size = i5;
                }
            }
        }
        for (q.d node = jVar.getNode(); node != null; node = androidx.compose.ui.node.k.l(null)) {
            kotlin.jvm.internal.l0.P();
            lVar.invoke(node);
        }
        for (q.d node2 = jVar.getNode(); node2 != null; node2 = androidx.compose.ui.node.k.l(null)) {
            kotlin.jvm.internal.l0.P();
            lVar2.invoke(node2);
        }
        if (arrayList != null) {
            int size2 = arrayList.size();
            for (int i6 = 0; i6 < size2; i6++) {
                lVar2.invoke((Object) arrayList.get(i6));
            }
        }
    }

    private final boolean u(KeyEvent keyEvent) {
        long a5 = androidx.compose.ui.input.key.e.a(keyEvent);
        int b5 = androidx.compose.ui.input.key.e.b(keyEvent);
        d.Companion companion = androidx.compose.ui.input.key.d.INSTANCE;
        companion.getClass();
        if (androidx.compose.ui.input.key.d.g(b5, androidx.compose.ui.input.key.d.f18651e)) {
            d2 d2Var = this.keysCurrentlyDown;
            if (d2Var == null) {
                d2Var = new d2(3);
                this.keysCurrentlyDown = d2Var;
            }
            d2Var.T(a5);
        } else {
            companion.getClass();
            if (androidx.compose.ui.input.key.d.g(b5, androidx.compose.ui.input.key.d.f18650d)) {
                d2 d2Var2 = this.keysCurrentlyDown;
                if (d2Var2 == null || !d2Var2.d(a5)) {
                    return false;
                }
                d2 d2Var3 = this.keysCurrentlyDown;
                if (d2Var3 != null) {
                    d2Var3.W(a5);
                }
            }
        }
        return true;
    }

    private final boolean v(int focusDirection) {
        boolean l4;
        if (this.rootFocusNode.I0().getHasFocus() && !this.rootFocusNode.I0().isFocused()) {
            f.Companion companion = f.INSTANCE;
            companion.getClass();
            if (f.l(focusDirection, f.f17526c)) {
                l4 = true;
            } else {
                companion.getClass();
                l4 = f.l(focusDirection, f.f17527d);
            }
            if (l4) {
                e(false, true);
                if (this.rootFocusNode.I0().isFocused()) {
                    return g(focusDirection);
                }
                return false;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.s
    public void a(@fg.l androidx.compose.ui.unit.w wVar) {
        this.layoutDirection = wVar;
    }

    @Override // androidx.compose.ui.focus.s
    public void b(@fg.l i node) {
        this.focusInvalidationManager.d(node);
    }

    @Override // androidx.compose.ui.focus.s
    @fg.l
    /* renamed from: c, reason: from getter */
    public androidx.compose.ui.q getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.focus.s
    public void d() {
        if (this.rootFocusNode.I0() == k0.Inactive) {
            this.rootFocusNode.L7(k0.Active);
        }
    }

    @Override // androidx.compose.ui.focus.s
    public void e(boolean force, boolean refreshFocusEvents) {
        boolean z4;
        k0 k0Var;
        o0 o0Var = this.focusTransactionManager;
        try {
            z4 = o0Var.ongoingTransaction;
            if (z4) {
                o0Var.g();
            }
            o0.a(o0Var);
            if (!force) {
                FocusTargetNode focusTargetNode = this.rootFocusNode;
                f.INSTANCE.getClass();
                int i4 = a.f17492a[p0.h(focusTargetNode, f.f17533j).ordinal()];
                if (i4 == 1 || i4 == 2 || i4 == 3) {
                    o0Var.h();
                    return;
                }
            }
            k0 I0 = this.rootFocusNode.I0();
            if (p0.d(this.rootFocusNode, force, refreshFocusEvents)) {
                FocusTargetNode focusTargetNode2 = this.rootFocusNode;
                int i5 = a.f17493b[I0.ordinal()];
                if (i5 == 1 || i5 == 2 || i5 == 3) {
                    k0Var = k0.Active;
                } else {
                    if (i5 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    k0Var = k0.Inactive;
                }
                focusTargetNode2.L7(k0Var);
            }
            k2 k2Var = k2.f75408a;
            o0Var.h();
        } catch (Throwable th) {
            o0Var.h();
            throw th;
        }
    }

    @Override // androidx.compose.ui.focus.s
    @fg.l
    /* renamed from: f, reason: from getter */
    public o0 getFocusTransactionManager() {
        return this.focusTransactionManager;
    }

    @Override // androidx.compose.ui.focus.m
    public boolean g(int focusDirection) {
        FocusTargetNode b5 = q0.b(this.rootFocusNode);
        if (b5 == null) {
            return false;
        }
        a0 a5 = q0.a(b5, focusDirection, getLayoutDirection());
        a0.Companion companion = a0.INSTANCE;
        companion.getClass();
        if (a5 != a0.f17515d) {
            companion.getClass();
            return a5 != a0.f17516e && a5.e();
        }
        k1.a aVar = new k1.a();
        boolean e4 = q0.e(this.rootFocusNode, focusDirection, getLayoutDirection(), new b(b5, this, focusDirection, aVar));
        if (aVar.f75322b) {
            return false;
        }
        return e4 || v(focusDirection);
    }

    @Override // androidx.compose.ui.focus.s
    @fg.l
    public androidx.compose.ui.unit.w getLayoutDirection() {
        androidx.compose.ui.unit.w wVar = this.layoutDirection;
        if (wVar != null) {
            return wVar;
        }
        kotlin.jvm.internal.l0.S("layoutDirection");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    @Override // androidx.compose.ui.focus.s
    public boolean h(@fg.l KeyEvent keyEvent) {
        androidx.compose.ui.input.key.j jVar;
        int size;
        c1 nodes;
        androidx.compose.ui.node.l lVar;
        c1 nodes2;
        FocusTargetNode b5 = q0.b(this.rootFocusNode);
        if (b5 == null) {
            jVar = null;
        } else {
            if (!b5.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            q.d parent = b5.getNode().getParent();
            androidx.compose.ui.node.h0 p4 = androidx.compose.ui.node.k.p(b5);
            loop0: while (true) {
                if (p4 == null) {
                    lVar = 0;
                    break;
                }
                if ((androidx.compose.ui.focus.a.a(p4) & 131072) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & 131072) != 0) {
                            androidx.compose.runtime.collection.g gVar = null;
                            lVar = parent;
                            while (lVar != 0) {
                                if (lVar instanceof androidx.compose.ui.input.key.j) {
                                    break loop0;
                                }
                                if ((lVar.getKindSet() & 131072) != 0 && (lVar instanceof androidx.compose.ui.node.l)) {
                                    q.d delegate = lVar.getDelegate();
                                    int i4 = 0;
                                    lVar = lVar;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & 131072) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                lVar = delegate;
                                            } else {
                                                if (gVar == null) {
                                                    gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                                }
                                                if (lVar != 0) {
                                                    gVar.b(lVar);
                                                    lVar = 0;
                                                }
                                                gVar.b(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        lVar = lVar;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                lVar = androidx.compose.ui.node.k.l(gVar);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                p4 = p4.B0();
                parent = (p4 == null || (nodes2 = p4.getNodes()) == null) ? null : nodes2.getTail();
            }
            jVar = (androidx.compose.ui.input.key.j) lVar;
        }
        if (jVar != null) {
            if (!jVar.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            q.d parent2 = jVar.getNode().getParent();
            androidx.compose.ui.node.h0 p5 = androidx.compose.ui.node.k.p(jVar);
            ArrayList arrayList = null;
            while (p5 != null) {
                if ((androidx.compose.ui.focus.a.a(p5) & 131072) != 0) {
                    while (parent2 != null) {
                        if ((parent2.getKindSet() & 131072) != 0) {
                            q.d dVar = parent2;
                            androidx.compose.runtime.collection.g gVar2 = null;
                            while (dVar != null) {
                                if (dVar instanceof androidx.compose.ui.input.key.j) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(dVar);
                                } else if ((dVar.getKindSet() & 131072) != 0 && (dVar instanceof androidx.compose.ui.node.l)) {
                                    int i5 = 0;
                                    for (q.d delegate2 = ((androidx.compose.ui.node.l) dVar).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                        if ((delegate2.getKindSet() & 131072) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                dVar = delegate2;
                                            } else {
                                                if (gVar2 == null) {
                                                    gVar2 = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                                }
                                                if (dVar != null) {
                                                    gVar2.b(dVar);
                                                    dVar = null;
                                                }
                                                gVar2.b(delegate2);
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                dVar = androidx.compose.ui.node.k.l(gVar2);
                            }
                        }
                        parent2 = parent2.getParent();
                    }
                }
                p5 = p5.B0();
                parent2 = (p5 == null || (nodes = p5.getNodes()) == null) ? null : nodes.getTail();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i6 = size - 1;
                    if (((androidx.compose.ui.input.key.j) arrayList.get(size)).v0(keyEvent)) {
                        return true;
                    }
                    if (i6 < 0) {
                        break;
                    }
                    size = i6;
                }
            }
            androidx.compose.ui.node.l node = jVar.getNode();
            androidx.compose.runtime.collection.g gVar3 = null;
            while (node != 0) {
                if (node instanceof androidx.compose.ui.input.key.j) {
                    if (((androidx.compose.ui.input.key.j) node).v0(keyEvent)) {
                        return true;
                    }
                } else if ((node.getKindSet() & 131072) != 0 && (node instanceof androidx.compose.ui.node.l)) {
                    q.d delegate3 = node.getDelegate();
                    int i7 = 0;
                    node = node;
                    while (delegate3 != null) {
                        if ((delegate3.getKindSet() & 131072) != 0) {
                            i7++;
                            if (i7 == 1) {
                                node = delegate3;
                            } else {
                                if (gVar3 == null) {
                                    gVar3 = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                }
                                if (node != 0) {
                                    gVar3.b(node);
                                    node = 0;
                                }
                                gVar3.b(delegate3);
                            }
                        }
                        delegate3 = delegate3.getChild();
                        node = node;
                    }
                    if (i7 == 1) {
                    }
                }
                node = androidx.compose.ui.node.k.l(gVar3);
            }
            androidx.compose.ui.node.l node2 = jVar.getNode();
            androidx.compose.runtime.collection.g gVar4 = null;
            while (node2 != 0) {
                if (node2 instanceof androidx.compose.ui.input.key.j) {
                    if (((androidx.compose.ui.input.key.j) node2).F1(keyEvent)) {
                        return true;
                    }
                } else if ((node2.getKindSet() & 131072) != 0 && (node2 instanceof androidx.compose.ui.node.l)) {
                    q.d delegate4 = node2.getDelegate();
                    int i10 = 0;
                    node2 = node2;
                    while (delegate4 != null) {
                        if ((delegate4.getKindSet() & 131072) != 0) {
                            i10++;
                            if (i10 == 1) {
                                node2 = delegate4;
                            } else {
                                if (gVar4 == null) {
                                    gVar4 = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                }
                                if (node2 != 0) {
                                    gVar4.b(node2);
                                    node2 = 0;
                                }
                                gVar4.b(delegate4);
                            }
                        }
                        delegate4 = delegate4.getChild();
                        node2 = node2;
                    }
                    if (i10 == 1) {
                    }
                }
                node2 = androidx.compose.ui.node.k.l(gVar4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    if (((androidx.compose.ui.input.key.j) arrayList.get(i11)).F1(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.s
    public void i(@fg.l FocusTargetNode node) {
        this.focusInvalidationManager.f(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    @Override // androidx.compose.ui.focus.s
    public boolean k(@fg.l androidx.compose.ui.input.rotary.d event) {
        androidx.compose.ui.input.rotary.b bVar;
        int size;
        c1 nodes;
        androidx.compose.ui.node.l lVar;
        c1 nodes2;
        FocusTargetNode b5 = q0.b(this.rootFocusNode);
        if (b5 == null) {
            bVar = null;
        } else {
            if (!b5.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            q.d parent = b5.getNode().getParent();
            androidx.compose.ui.node.h0 p4 = androidx.compose.ui.node.k.p(b5);
            loop0: while (true) {
                if (p4 == null) {
                    lVar = 0;
                    break;
                }
                if ((androidx.compose.ui.focus.a.a(p4) & 16384) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & 16384) != 0) {
                            androidx.compose.runtime.collection.g gVar = null;
                            lVar = parent;
                            while (lVar != 0) {
                                if (lVar instanceof androidx.compose.ui.input.rotary.b) {
                                    break loop0;
                                }
                                if ((lVar.getKindSet() & 16384) != 0 && (lVar instanceof androidx.compose.ui.node.l)) {
                                    q.d delegate = lVar.getDelegate();
                                    int i4 = 0;
                                    lVar = lVar;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & 16384) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                lVar = delegate;
                                            } else {
                                                if (gVar == null) {
                                                    gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                                }
                                                if (lVar != 0) {
                                                    gVar.b(lVar);
                                                    lVar = 0;
                                                }
                                                gVar.b(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        lVar = lVar;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                lVar = androidx.compose.ui.node.k.l(gVar);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                p4 = p4.B0();
                parent = (p4 == null || (nodes2 = p4.getNodes()) == null) ? null : nodes2.getTail();
            }
            bVar = (androidx.compose.ui.input.rotary.b) lVar;
        }
        if (bVar != null) {
            if (!bVar.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            q.d parent2 = bVar.getNode().getParent();
            androidx.compose.ui.node.h0 p5 = androidx.compose.ui.node.k.p(bVar);
            ArrayList arrayList = null;
            while (p5 != null) {
                if ((androidx.compose.ui.focus.a.a(p5) & 16384) != 0) {
                    while (parent2 != null) {
                        if ((parent2.getKindSet() & 16384) != 0) {
                            q.d dVar = parent2;
                            androidx.compose.runtime.collection.g gVar2 = null;
                            while (dVar != null) {
                                if (dVar instanceof androidx.compose.ui.input.rotary.b) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(dVar);
                                } else if ((dVar.getKindSet() & 16384) != 0 && (dVar instanceof androidx.compose.ui.node.l)) {
                                    int i5 = 0;
                                    for (q.d delegate2 = ((androidx.compose.ui.node.l) dVar).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                        if ((delegate2.getKindSet() & 16384) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                dVar = delegate2;
                                            } else {
                                                if (gVar2 == null) {
                                                    gVar2 = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                                }
                                                if (dVar != null) {
                                                    gVar2.b(dVar);
                                                    dVar = null;
                                                }
                                                gVar2.b(delegate2);
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                dVar = androidx.compose.ui.node.k.l(gVar2);
                            }
                        }
                        parent2 = parent2.getParent();
                    }
                }
                p5 = p5.B0();
                parent2 = (p5 == null || (nodes = p5.getNodes()) == null) ? null : nodes.getTail();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i6 = size - 1;
                    if (((androidx.compose.ui.input.rotary.b) arrayList.get(size)).f1(event)) {
                        return true;
                    }
                    if (i6 < 0) {
                        break;
                    }
                    size = i6;
                }
            }
            androidx.compose.ui.node.l node = bVar.getNode();
            androidx.compose.runtime.collection.g gVar3 = null;
            while (node != 0) {
                if (node instanceof androidx.compose.ui.input.rotary.b) {
                    if (((androidx.compose.ui.input.rotary.b) node).f1(event)) {
                        return true;
                    }
                } else if ((node.getKindSet() & 16384) != 0 && (node instanceof androidx.compose.ui.node.l)) {
                    q.d delegate3 = node.getDelegate();
                    int i7 = 0;
                    node = node;
                    while (delegate3 != null) {
                        if ((delegate3.getKindSet() & 16384) != 0) {
                            i7++;
                            if (i7 == 1) {
                                node = delegate3;
                            } else {
                                if (gVar3 == null) {
                                    gVar3 = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                }
                                if (node != 0) {
                                    gVar3.b(node);
                                    node = 0;
                                }
                                gVar3.b(delegate3);
                            }
                        }
                        delegate3 = delegate3.getChild();
                        node = node;
                    }
                    if (i7 == 1) {
                    }
                }
                node = androidx.compose.ui.node.k.l(gVar3);
            }
            androidx.compose.ui.node.l node2 = bVar.getNode();
            androidx.compose.runtime.collection.g gVar4 = null;
            while (node2 != 0) {
                if (node2 instanceof androidx.compose.ui.input.rotary.b) {
                    if (((androidx.compose.ui.input.rotary.b) node2).r4(event)) {
                        return true;
                    }
                } else if ((node2.getKindSet() & 16384) != 0 && (node2 instanceof androidx.compose.ui.node.l)) {
                    q.d delegate4 = node2.getDelegate();
                    int i10 = 0;
                    node2 = node2;
                    while (delegate4 != null) {
                        if ((delegate4.getKindSet() & 16384) != 0) {
                            i10++;
                            if (i10 == 1) {
                                node2 = delegate4;
                            } else {
                                if (gVar4 == null) {
                                    gVar4 = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                }
                                if (node2 != 0) {
                                    gVar4.b(node2);
                                    node2 = 0;
                                }
                                gVar4.b(delegate4);
                            }
                        }
                        delegate4 = delegate4.getChild();
                        node2 = node2;
                    }
                    if (i10 == 1) {
                    }
                }
                node2 = androidx.compose.ui.node.k.l(gVar4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    if (((androidx.compose.ui.input.rotary.b) arrayList.get(i11)).r4(event)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.s
    public void l(@fg.l w node) {
        this.focusInvalidationManager.e(node);
    }

    @Override // androidx.compose.ui.focus.s
    @fg.m
    public i0.i m() {
        FocusTargetNode b5 = q0.b(this.rootFocusNode);
        if (b5 != null) {
            return q0.d(b5);
        }
        return null;
    }

    @Override // androidx.compose.ui.focus.s
    public void n() {
        p0.d(this.rootFocusNode, true, true);
    }

    @Override // androidx.compose.ui.focus.m
    public void o(boolean force) {
        e(force, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    @Override // androidx.compose.ui.focus.s
    public boolean p(@fg.l KeyEvent keyEvent) {
        int size;
        c1 nodes;
        androidx.compose.ui.node.l lVar;
        c1 nodes2;
        if (!u(keyEvent)) {
            return false;
        }
        FocusTargetNode b5 = q0.b(this.rootFocusNode);
        if (b5 == null) {
            throw new IllegalStateException("Event can't be processed because we do not have an active focus target.");
        }
        q.d r4 = r(b5);
        if (r4 == null) {
            if (!b5.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            q.d parent = b5.getNode().getParent();
            androidx.compose.ui.node.h0 p4 = androidx.compose.ui.node.k.p(b5);
            loop0: while (true) {
                if (p4 == null) {
                    lVar = 0;
                    break;
                }
                if ((androidx.compose.ui.focus.a.a(p4) & 8192) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & 8192) != 0) {
                            lVar = parent;
                            androidx.compose.runtime.collection.g gVar = null;
                            while (lVar != 0) {
                                if (lVar instanceof androidx.compose.ui.input.key.g) {
                                    break loop0;
                                }
                                if ((lVar.getKindSet() & 8192) != 0 && (lVar instanceof androidx.compose.ui.node.l)) {
                                    q.d delegate = lVar.getDelegate();
                                    int i4 = 0;
                                    lVar = lVar;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & 8192) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                lVar = delegate;
                                            } else {
                                                if (gVar == null) {
                                                    gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                                }
                                                if (lVar != 0) {
                                                    gVar.b(lVar);
                                                    lVar = 0;
                                                }
                                                gVar.b(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        lVar = lVar;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                lVar = androidx.compose.ui.node.k.l(gVar);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                p4 = p4.B0();
                parent = (p4 == null || (nodes2 = p4.getNodes()) == null) ? null : nodes2.getTail();
            }
            androidx.compose.ui.input.key.g gVar2 = (androidx.compose.ui.input.key.g) lVar;
            r4 = gVar2 != null ? gVar2.getNode() : null;
        }
        if (r4 != null) {
            if (!r4.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            q.d parent2 = r4.getNode().getParent();
            androidx.compose.ui.node.h0 p5 = androidx.compose.ui.node.k.p(r4);
            ArrayList arrayList = null;
            while (p5 != null) {
                if ((androidx.compose.ui.focus.a.a(p5) & 8192) != 0) {
                    while (parent2 != null) {
                        if ((parent2.getKindSet() & 8192) != 0) {
                            q.d dVar = parent2;
                            androidx.compose.runtime.collection.g gVar3 = null;
                            while (dVar != null) {
                                if (dVar instanceof androidx.compose.ui.input.key.g) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(dVar);
                                } else if ((dVar.getKindSet() & 8192) != 0 && (dVar instanceof androidx.compose.ui.node.l)) {
                                    int i5 = 0;
                                    for (q.d delegate2 = ((androidx.compose.ui.node.l) dVar).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                        if ((delegate2.getKindSet() & 8192) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                dVar = delegate2;
                                            } else {
                                                if (gVar3 == null) {
                                                    gVar3 = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                                }
                                                if (dVar != null) {
                                                    gVar3.b(dVar);
                                                    dVar = null;
                                                }
                                                gVar3.b(delegate2);
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                dVar = androidx.compose.ui.node.k.l(gVar3);
                            }
                        }
                        parent2 = parent2.getParent();
                    }
                }
                p5 = p5.B0();
                parent2 = (p5 == null || (nodes = p5.getNodes()) == null) ? null : nodes.getTail();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i6 = size - 1;
                    if (((androidx.compose.ui.input.key.g) arrayList.get(size)).n3(keyEvent)) {
                        return true;
                    }
                    if (i6 < 0) {
                        break;
                    }
                    size = i6;
                }
            }
            androidx.compose.ui.node.l node = r4.getNode();
            androidx.compose.runtime.collection.g gVar4 = null;
            while (node != 0) {
                if (node instanceof androidx.compose.ui.input.key.g) {
                    if (((androidx.compose.ui.input.key.g) node).n3(keyEvent)) {
                        return true;
                    }
                } else if ((node.getKindSet() & 8192) != 0 && (node instanceof androidx.compose.ui.node.l)) {
                    q.d delegate3 = node.getDelegate();
                    int i7 = 0;
                    node = node;
                    while (delegate3 != null) {
                        if ((delegate3.getKindSet() & 8192) != 0) {
                            i7++;
                            if (i7 == 1) {
                                node = delegate3;
                            } else {
                                if (gVar4 == null) {
                                    gVar4 = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                }
                                if (node != 0) {
                                    gVar4.b(node);
                                    node = 0;
                                }
                                gVar4.b(delegate3);
                            }
                        }
                        delegate3 = delegate3.getChild();
                        node = node;
                    }
                    if (i7 == 1) {
                    }
                }
                node = androidx.compose.ui.node.k.l(gVar4);
            }
            androidx.compose.ui.node.l node2 = r4.getNode();
            androidx.compose.runtime.collection.g gVar5 = null;
            while (node2 != 0) {
                if (node2 instanceof androidx.compose.ui.input.key.g) {
                    if (((androidx.compose.ui.input.key.g) node2).k4(keyEvent)) {
                        return true;
                    }
                } else if ((node2.getKindSet() & 8192) != 0 && (node2 instanceof androidx.compose.ui.node.l)) {
                    q.d delegate4 = node2.getDelegate();
                    int i10 = 0;
                    node2 = node2;
                    while (delegate4 != null) {
                        if ((delegate4.getKindSet() & 8192) != 0) {
                            i10++;
                            if (i10 == 1) {
                                node2 = delegate4;
                            } else {
                                if (gVar5 == null) {
                                    gVar5 = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                }
                                if (node2 != 0) {
                                    gVar5.b(node2);
                                    node2 = 0;
                                }
                                gVar5.b(delegate4);
                            }
                        }
                        delegate4 = delegate4.getChild();
                        node2 = node2;
                    }
                    if (i10 == 1) {
                    }
                }
                node2 = androidx.compose.ui.node.k.l(gVar5);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    if (((androidx.compose.ui.input.key.g) arrayList.get(i11)).k4(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @fg.l
    /* renamed from: q, reason: from getter */
    public final FocusTargetNode getRootFocusNode() {
        return this.rootFocusNode;
    }

    public final void s(@fg.l FocusTargetNode focusTargetNode) {
        this.rootFocusNode = focusTargetNode;
    }
}
