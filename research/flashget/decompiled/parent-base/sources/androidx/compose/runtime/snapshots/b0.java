package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.g;
import androidx.compose.runtime.x4;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: SnapshotStateList.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b+\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001_B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\r\u001a\u00028\u0001\"\u0004\b\u0001\u0010\b2\u001d\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0002\b\u000bH\u0082\b¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u000f\u001a\u00028\u0001\"\u0004\b\u0001\u0010\b2\u001d\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0002\b\u000bH\u0082\b¢\u0006\u0004\b\u000f\u0010\u000eJ)\u0010\u0011\u001a\u00020\u00102\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00100\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0013\u001a\u00028\u0001\"\u0004\b\u0001\u0010\b2\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00028\u00010\tH\u0082\b¢\u0006\u0004\b\u0013\u0010\u000eJ:\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0014\u001a\u00020\u00102\u001e\u0010\f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\tH\u0082\b¢\u0006\u0004\b\u0017\u0010\u0018J:\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\u001e\u0010\f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\tH\u0082\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\u00020\u00102\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016¢\u0006\u0004\b'\u0010(J\u0018\u0010+\u001a\u00028\u00002\u0006\u0010*\u001a\u00020)H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020)2\u0006\u0010\"\u001a\u00028\u0000H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0010H\u0016¢\u0006\u0004\b/\u00100J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0096\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020)2\u0006\u0010\"\u001a\u00028\u0000H\u0016¢\u0006\u0004\b4\u0010.J\u0015\u00106\u001a\b\u0012\u0004\u0012\u00028\u000005H\u0016¢\u0006\u0004\b6\u00107J\u001d\u00106\u001a\b\u0012\u0004\u0012\u00028\u0000052\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b6\u00108J%\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u00109\u001a\u00020)2\u0006\u0010:\u001a\u00020)H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00102\u0006\u0010\"\u001a\u00028\u0000H\u0016¢\u0006\u0004\b=\u0010$J\u001f\u0010=\u001a\u00020\u00162\u0006\u0010*\u001a\u00020)2\u0006\u0010\"\u001a\u00028\u0000H\u0016¢\u0006\u0004\b=\u0010>J%\u0010?\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016¢\u0006\u0004\b?\u0010@J\u001d\u0010?\u001a\u00020\u00102\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016¢\u0006\u0004\b?\u0010(J\u000f\u0010A\u001a\u00020\u0016H\u0016¢\u0006\u0004\bA\u0010\u0007J\u0017\u0010B\u001a\u00020\u00102\u0006\u0010\"\u001a\u00028\u0000H\u0016¢\u0006\u0004\bB\u0010$J\u001d\u0010C\u001a\u00020\u00102\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016¢\u0006\u0004\bC\u0010(J\u0017\u0010D\u001a\u00028\u00002\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\bD\u0010,J\u001d\u0010E\u001a\u00020\u00102\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016¢\u0006\u0004\bE\u0010(J \u0010F\u001a\u00028\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010\"\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\bF\u0010GJ\u001d\u0010H\u001a\u00020\u00162\u0006\u00109\u001a\u00020)2\u0006\u0010:\u001a\u00020)¢\u0006\u0004\bH\u0010IJ-\u0010L\u001a\u00020)2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010J\u001a\u00020)2\u0006\u0010K\u001a\u00020)H\u0000¢\u0006\u0004\bL\u0010MR$\u0010R\u001a\u00020\u001b2\u0006\u0010N\u001a\u00020\u001b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0019\u0010O\u001a\u0004\bP\u0010QR \u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\n8@X\u0080\u0004¢\u0006\f\u0012\u0004\bU\u0010\u0007\u001a\u0004\bS\u0010TR \u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f8AX\u0080\u0004¢\u0006\f\u0012\u0004\bX\u0010\u0007\u001a\u0004\bW\u0010!R\u0014\u0010\\\u001a\u00020)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0014\u0010^\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010[¨\u0006`"}, d2 = {"Landroidx/compose/runtime/snapshots/b0;", "T", "Landroidx/compose/runtime/snapshots/p0;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "<init>", "()V", "R", "Lkotlin/Function1;", "Landroidx/compose/runtime/snapshots/b0$a;", "Lkotlin/u;", "block", "L", "(Lld/l;)Ljava/lang/Object;", "I", "", "q", "(Lld/l;)Z", "p", "structural", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "Lkotlin/k2;", "x", "(ZLld/l;)V", "b", "(ZLld/l;)Z", "Landroidx/compose/runtime/snapshots/r0;", "value", "A", "(Landroidx/compose/runtime/snapshots/r0;)V", "", "w", "()Ljava/util/List;", "element", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "add", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "remove", "removeAll", "r", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "s", "(II)V", "start", "end", "v", "(Ljava/util/Collection;II)I", "<set-?>", "Landroidx/compose/runtime/snapshots/r0;", "F", "()Landroidx/compose/runtime/snapshots/r0;", "firstStateRecord", "i", "()Landroidx/compose/runtime/snapshots/b0$a;", "j", "readable", "f", "h", "debuggerDisplayValue", "m", "()I", "structure", "l", "size", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x4
@r1({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,484:1\n158#1:485\n197#1,10:487\n207#1:498\n158#1:499\n208#1,9:501\n154#1:510\n217#1,7:516\n227#1,6:526\n190#1,17:532\n207#1:550\n158#1:551\n208#1,9:553\n154#1:562\n217#1,7:568\n227#1,6:578\n195#1:584\n197#1,10:585\n207#1:596\n158#1:597\n208#1,9:599\n154#1:608\n217#1,7:614\n227#1,6:624\n154#1:630\n197#1,10:641\n207#1:652\n158#1:653\n208#1,9:655\n154#1:664\n217#1,7:670\n227#1,6:680\n197#1,10:686\n207#1:697\n158#1:698\n208#1,9:700\n154#1:709\n217#1,7:715\n227#1,6:725\n190#1,17:732\n207#1:750\n158#1:751\n208#1,9:753\n154#1:762\n217#1,7:768\n227#1,6:778\n195#1:784\n194#1,13:785\n207#1:799\n158#1:800\n208#1,9:802\n154#1:811\n217#1,7:817\n227#1,6:827\n195#1:833\n163#1,5:834\n168#1:840\n158#1:841\n169#1,7:843\n154#1:850\n176#1,7:856\n185#1,3:866\n163#1,5:869\n168#1:875\n158#1:876\n169#1,7:878\n154#1:885\n176#1,7:891\n185#1,3:901\n158#1:904\n163#1,5:916\n168#1:922\n158#1:923\n169#1,7:925\n154#1:932\n176#1,7:938\n185#1,3:948\n158#1:952\n154#1:954\n201#1,6:965\n207#1:972\n158#1:973\n208#1,9:975\n154#1:984\n217#1,7:990\n227#1,6:1000\n201#1,7:1006\n158#1:1013\n208#1,9:1015\n154#1:1024\n217#1,7:1030\n227#1,6:1040\n158#1:1047\n154#1:1049\n158#1:1061\n154#1:1063\n2283#2:486\n2283#2:500\n2176#2,2:511\n1714#2:513\n2178#2,2:514\n2180#2,3:523\n2283#2:552\n2176#2,2:563\n1714#2:565\n2178#2,2:566\n2180#2,3:575\n2283#2:598\n2176#2,2:609\n1714#2:611\n2178#2,2:612\n2180#2,3:621\n2176#2,2:631\n1714#2:633\n2178#2,2:635\n2180#2,3:638\n2283#2:654\n2176#2,2:665\n1714#2:667\n2178#2,2:668\n2180#2,3:677\n2283#2:699\n2176#2,2:710\n1714#2:712\n2178#2,2:713\n2180#2,3:722\n2283#2:752\n2176#2,2:763\n1714#2:765\n2178#2,2:766\n2180#2,3:775\n2283#2:801\n2176#2,2:812\n1714#2:814\n2178#2,2:815\n2180#2,3:824\n2283#2:842\n2176#2,2:851\n1714#2:853\n2178#2,2:854\n2180#2,3:863\n2283#2:877\n2176#2,2:886\n1714#2:888\n2178#2,2:889\n2180#2,3:898\n2283#2:905\n2176#2,2:906\n1714#2:908\n2178#2,5:910\n2283#2:915\n2283#2:924\n2176#2,2:933\n1714#2:935\n2178#2,2:936\n2180#2,3:945\n2283#2:953\n2176#2,2:955\n1714#2:957\n2178#2,2:959\n2180#2,3:962\n2283#2:974\n2176#2,2:985\n1714#2:987\n2178#2,2:988\n2180#2,3:997\n2283#2:1014\n2176#2,2:1025\n1714#2:1027\n2178#2,2:1028\n2180#2,3:1037\n2283#2:1048\n2176#2,2:1050\n1714#2:1052\n2178#2,2:1054\n2180#2,3:1057\n2283#2:1062\n2176#2,2:1064\n1714#2:1066\n2178#2,2:1068\n2180#2,3:1071\n82#3:497\n82#3:549\n82#3:595\n82#3:634\n82#3:637\n82#3:651\n82#3:696\n82#3:749\n82#3:798\n82#3:839\n82#3:874\n82#3:909\n82#3:921\n82#3:951\n82#3:958\n82#3:961\n82#3:971\n82#3:1046\n82#3:1053\n82#3:1056\n82#3:1060\n82#3:1067\n82#3:1070\n1#4:731\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n*L\n62#1:485\n105#1:487,10\n105#1:498\n105#1:499\n105#1:501,9\n105#1:510\n105#1:516,7\n105#1:526,6\n106#1:532,17\n106#1:550\n106#1:551\n106#1:553,9\n106#1:562\n106#1:568,7\n106#1:578,6\n106#1:584\n111#1:585,10\n111#1:596\n111#1:597\n111#1:599,9\n111#1:608\n111#1:614,7\n111#1:624,6\n113#1:630\n121#1:641,10\n121#1:652\n121#1:653\n121#1:655,9\n121#1:664\n121#1:670,7\n121#1:680,6\n122#1:686,10\n122#1:697\n122#1:698\n122#1:700,9\n122#1:709\n122#1:715,7\n122#1:725,6\n123#1:732,17\n123#1:750\n123#1:751\n123#1:753,9\n123#1:762\n123#1:768,7\n123#1:778,6\n123#1:784\n126#1:785,13\n126#1:799\n126#1:800\n126#1:802,9\n126#1:811\n126#1:817,7\n126#1:827,6\n126#1:833\n130#1:834,5\n130#1:840\n130#1:841\n130#1:843,7\n130#1:850\n130#1:856,7\n130#1:866,3\n137#1:869,5\n137#1:875\n137#1:876\n137#1:878,7\n137#1:885\n137#1:891,7\n137#1:901,3\n150#1:904\n160#1:916,5\n160#1:922\n160#1:923\n160#1:925,7\n160#1:932\n160#1:938,7\n160#1:948,3\n168#1:952\n175#1:954\n194#1:965,6\n194#1:972\n194#1:973\n194#1:975,9\n194#1:984\n194#1:990,7\n194#1:1000,6\n194#1:1006,7\n194#1:1013\n194#1:1015,9\n194#1:1024\n194#1:1030,7\n194#1:1040,6\n207#1:1047\n216#1:1049\n207#1:1061\n216#1:1063\n62#1:486\n105#1:500\n105#1:511,2\n105#1:513\n105#1:514,2\n105#1:523,3\n106#1:552\n106#1:563,2\n106#1:565\n106#1:566,2\n106#1:575,3\n111#1:598\n111#1:609,2\n111#1:611\n111#1:612,2\n111#1:621,3\n113#1:631,2\n113#1:633\n113#1:635,2\n113#1:638,3\n121#1:654\n121#1:665,2\n121#1:667\n121#1:668,2\n121#1:677,3\n122#1:699\n122#1:710,2\n122#1:712\n122#1:713,2\n122#1:722,3\n123#1:752\n123#1:763,2\n123#1:765\n123#1:766,2\n123#1:775,3\n126#1:801\n126#1:812,2\n126#1:814\n126#1:815,2\n126#1:824,3\n130#1:842\n130#1:851,2\n130#1:853\n130#1:854,2\n130#1:863,3\n137#1:877\n137#1:886,2\n137#1:888\n137#1:889,2\n137#1:898,3\n150#1:905\n154#1:906,2\n154#1:908\n154#1:910,5\n158#1:915\n160#1:924\n160#1:933,2\n160#1:935\n160#1:936,2\n160#1:945,3\n168#1:953\n175#1:955,2\n175#1:957\n175#1:959,2\n175#1:962,3\n194#1:974\n194#1:985,2\n194#1:987\n194#1:988,2\n194#1:997,3\n194#1:1014\n194#1:1025,2\n194#1:1027\n194#1:1028,2\n194#1:1037,3\n207#1:1048\n216#1:1050,2\n216#1:1052\n216#1:1054,2\n216#1:1057,3\n207#1:1062\n216#1:1064,2\n216#1:1066\n216#1:1068,2\n216#1:1071,3\n105#1:497\n106#1:549\n111#1:595\n113#1:634\n114#1:637\n121#1:651\n122#1:696\n123#1:749\n126#1:798\n130#1:839\n137#1:874\n154#1:909\n160#1:921\n167#1:951\n175#1:958\n176#1:961\n194#1:971\n206#1:1046\n216#1:1053\n217#1:1056\n206#1:1060\n216#1:1067\n217#1:1070\n*E\n"})
/* loaded from: classes.dex */
public final class b0<T> implements p0, List<T>, RandomAccess, md.e {

    /* renamed from: c, reason: collision with root package name */
    public static final int f17018c = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private r0 firstStateRecord = new a(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.l.b());

    /* compiled from: SnapshotStateList.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0006R\"\u0010\u0018\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/snapshots/b0$a;", "T", "Landroidx/compose/runtime/snapshots/r0;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "list", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;)V", "value", "Lkotlin/k2;", "c", "(Landroidx/compose/runtime/snapshots/r0;)V", "d", "()Landroidx/compose/runtime/snapshots/r0;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "i", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "l", "", "e", "I", "j", "()I", "m", "(I)V", "modification", "f", "k", "n", "structuralChange", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 0)
    @r1({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,484:1\n82#2:485\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n*L\n77#1:485\n*E\n"})
    public static final class a<T> extends r0 {

        /* renamed from: g, reason: collision with root package name */
        public static final int f17020g = 8;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> list;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int modification;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private int structuralChange;

        public a(@fg.l androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVar) {
            this.list = gVar;
        }

        @Override // androidx.compose.runtime.snapshots.r0
        public void c(@fg.l r0 value) {
            Object obj;
            obj = c0.f17032a;
            synchronized (obj) {
                kotlin.jvm.internal.l0.n(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
                this.list = ((a) value).list;
                this.modification = ((a) value).modification;
                this.structuralChange = ((a) value).structuralChange;
                k2 k2Var = k2.f75408a;
            }
        }

        @Override // androidx.compose.runtime.snapshots.r0
        @fg.l
        public r0 d() {
            return new a(this.list);
        }

        @fg.l
        public final androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> i() {
            return this.list;
        }

        /* renamed from: j, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        /* renamed from: k, reason: from getter */
        public final int getStructuralChange() {
            return this.structuralChange;
        }

        public final void l(@fg.l androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVar) {
            this.list = gVar;
        }

        public final void m(int i4) {
            this.modification = i4;
        }

        public final void n(int i4) {
            this.structuralChange = i4;
        }
    }

    /* compiled from: SnapshotStateList.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<List<T>, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17024b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Collection<T> f17025c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(int i4, Collection<? extends T> collection) {
            super(1);
            this.f17024b = i4;
            this.f17025c = collection;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l List<T> list) {
            return Boolean.valueOf(list.addAll(this.f17024b, this.f17025c));
        }
    }

    /* compiled from: SnapshotStateList.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<List<T>, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Collection<T> f17026b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Collection<? extends T> collection) {
            super(1);
            this.f17026b = collection;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l List<T> list) {
            return Boolean.valueOf(list.retainAll(this.f17026b));
        }
    }

    static void G(b0 b0Var, boolean z4, ld.l lVar, int i4, Object obj) {
        Object obj2;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> i5;
        m I;
        Object obj3;
        boolean z5;
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        do {
            obj2 = c0.f17032a;
            synchronized (obj2) {
                r0 r0Var = b0Var.firstStateRecord;
                kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) v.G((a) r0Var);
                modification = aVar.getModification();
                i5 = aVar.i();
                k2 k2Var = k2.f75408a;
            }
            kotlin.jvm.internal.l0.m(i5);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVar = (androidx.compose.runtime.external.kotlinx.collections.immutable.g) lVar.invoke(i5);
            if (kotlin.jvm.internal.l0.g(gVar, i5)) {
                return;
            }
            r0 r0Var2 = b0Var.firstStateRecord;
            kotlin.jvm.internal.l0.n(r0Var2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) r0Var2;
            v.M();
            synchronized (v.K()) {
                m.INSTANCE.getClass();
                I = v.I();
                a aVar3 = (a) v.r0(aVar2, b0Var, I);
                obj3 = c0.f17032a;
                synchronized (obj3) {
                    try {
                        if (aVar3.getModification() == modification) {
                            aVar3.l(gVar);
                            if (z4) {
                                aVar3.n(aVar3.getStructuralChange() + 1);
                            }
                            aVar3.m(aVar3.getModification() + 1);
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            v.U(I, b0Var);
        } while (!z5);
    }

    private final <R> R I(ld.l<? super a<T>, ? extends R> block) {
        r0 r0Var = this.firstStateRecord;
        kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return block.invoke(v.G((a) r0Var));
    }

    private final <R> R L(ld.l<? super a<T>, ? extends R> block) {
        m I;
        R invoke;
        r0 r0Var = this.firstStateRecord;
        kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        a aVar = (a) r0Var;
        v.M();
        synchronized (v.K()) {
            m.INSTANCE.getClass();
            I = v.I();
            invoke = block.invoke(v.r0(aVar, this, I));
        }
        v.U(I, this);
        return invoke;
    }

    private final boolean b(boolean structural, ld.l<? super androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T>, ? extends androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T>> block) {
        Object obj;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> i4;
        boolean z4;
        m I;
        Object obj2;
        do {
            obj = c0.f17032a;
            synchronized (obj) {
                r0 r0Var = this.firstStateRecord;
                kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) v.G((a) r0Var);
                modification = aVar.getModification();
                i4 = aVar.i();
                k2 k2Var = k2.f75408a;
            }
            kotlin.jvm.internal.l0.m(i4);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> invoke = block.invoke(i4);
            z4 = false;
            if (kotlin.jvm.internal.l0.g(invoke, i4)) {
                return false;
            }
            r0 r0Var2 = this.firstStateRecord;
            kotlin.jvm.internal.l0.n(r0Var2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) r0Var2;
            v.M();
            synchronized (v.K()) {
                m.INSTANCE.getClass();
                I = v.I();
                a aVar3 = (a) v.r0(aVar2, this, I);
                obj2 = c0.f17032a;
                synchronized (obj2) {
                    try {
                        if (aVar3.getModification() == modification) {
                            aVar3.l(invoke);
                            if (structural) {
                                aVar3.n(aVar3.getStructuralChange() + 1);
                            }
                            aVar3.m(aVar3.getModification() + 1);
                            z4 = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            v.U(I, this);
        } while (!z4);
        return true;
    }

    static boolean c(b0 b0Var, boolean z4, ld.l lVar, int i4, Object obj) {
        Object obj2;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> i5;
        boolean z5;
        m I;
        Object obj3;
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        do {
            obj2 = c0.f17032a;
            synchronized (obj2) {
                r0 r0Var = b0Var.firstStateRecord;
                kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) v.G((a) r0Var);
                modification = aVar.getModification();
                i5 = aVar.i();
                k2 k2Var = k2.f75408a;
            }
            kotlin.jvm.internal.l0.m(i5);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVar = (androidx.compose.runtime.external.kotlinx.collections.immutable.g) lVar.invoke(i5);
            z5 = false;
            if (kotlin.jvm.internal.l0.g(gVar, i5)) {
                return false;
            }
            r0 r0Var2 = b0Var.firstStateRecord;
            kotlin.jvm.internal.l0.n(r0Var2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) r0Var2;
            v.M();
            synchronized (v.K()) {
                m.INSTANCE.getClass();
                I = v.I();
                a aVar3 = (a) v.r0(aVar2, b0Var, I);
                obj3 = c0.f17032a;
                synchronized (obj3) {
                    try {
                        if (aVar3.getModification() == modification) {
                            aVar3.l(gVar);
                            if (z4) {
                                aVar3.n(aVar3.getStructuralChange() + 1);
                            }
                            aVar3.m(aVar3.getModification() + 1);
                            z5 = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            v.U(I, b0Var);
        } while (!z5);
        return true;
    }

    public static /* synthetic */ void h() {
    }

    public static /* synthetic */ void j() {
    }

    private final <R> R p(ld.l<? super List<T>, ? extends R> block) {
        Object obj;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> i4;
        R invoke;
        m I;
        Object obj2;
        boolean z4;
        do {
            obj = c0.f17032a;
            synchronized (obj) {
                r0 r0Var = this.firstStateRecord;
                kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) v.G((a) r0Var);
                modification = aVar.getModification();
                i4 = aVar.i();
                k2 k2Var = k2.f75408a;
            }
            kotlin.jvm.internal.l0.m(i4);
            g.a<T> g4 = i4.g();
            invoke = block.invoke(g4);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> a5 = g4.a();
            if (kotlin.jvm.internal.l0.g(a5, i4)) {
                break;
            }
            r0 r0Var2 = this.firstStateRecord;
            kotlin.jvm.internal.l0.n(r0Var2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) r0Var2;
            v.M();
            synchronized (v.K()) {
                m.INSTANCE.getClass();
                I = v.I();
                a aVar3 = (a) v.r0(aVar2, this, I);
                obj2 = c0.f17032a;
                synchronized (obj2) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(a5);
                        z4 = true;
                        aVar3.m(aVar3.getModification() + 1);
                        aVar3.n(aVar3.getStructuralChange() + 1);
                    } else {
                        z4 = false;
                    }
                }
            }
            v.U(I, this);
        } while (!z4);
        return invoke;
    }

    private final boolean q(ld.l<? super List<T>, Boolean> block) {
        Object obj;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> i4;
        Boolean invoke;
        m I;
        Object obj2;
        boolean z4;
        do {
            obj = c0.f17032a;
            synchronized (obj) {
                r0 r0Var = this.firstStateRecord;
                kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) v.G((a) r0Var);
                modification = aVar.getModification();
                i4 = aVar.i();
                k2 k2Var = k2.f75408a;
            }
            kotlin.jvm.internal.l0.m(i4);
            g.a<T> g4 = i4.g();
            invoke = block.invoke(g4);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> a5 = g4.a();
            if (kotlin.jvm.internal.l0.g(a5, i4)) {
                break;
            }
            r0 r0Var2 = this.firstStateRecord;
            kotlin.jvm.internal.l0.n(r0Var2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) r0Var2;
            v.M();
            synchronized (v.K()) {
                m.INSTANCE.getClass();
                I = v.I();
                a aVar3 = (a) v.r0(aVar2, this, I);
                obj2 = c0.f17032a;
                synchronized (obj2) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(a5);
                        z4 = true;
                        aVar3.m(aVar3.getModification() + 1);
                        aVar3.n(aVar3.getStructuralChange() + 1);
                    } else {
                        z4 = false;
                    }
                }
            }
            v.U(I, this);
        } while (!z4);
        return invoke.booleanValue();
    }

    private final void x(boolean structural, ld.l<? super androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T>, ? extends androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T>> block) {
        Object obj;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> i4;
        m I;
        Object obj2;
        boolean z4;
        do {
            obj = c0.f17032a;
            synchronized (obj) {
                r0 r0Var = this.firstStateRecord;
                kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) v.G((a) r0Var);
                modification = aVar.getModification();
                i4 = aVar.i();
                k2 k2Var = k2.f75408a;
            }
            kotlin.jvm.internal.l0.m(i4);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> invoke = block.invoke(i4);
            if (kotlin.jvm.internal.l0.g(invoke, i4)) {
                return;
            }
            r0 r0Var2 = this.firstStateRecord;
            kotlin.jvm.internal.l0.n(r0Var2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) r0Var2;
            v.M();
            synchronized (v.K()) {
                m.INSTANCE.getClass();
                I = v.I();
                a aVar3 = (a) v.r0(aVar2, this, I);
                obj2 = c0.f17032a;
                synchronized (obj2) {
                    try {
                        if (aVar3.getModification() == modification) {
                            aVar3.l(invoke);
                            z4 = true;
                            if (structural) {
                                aVar3.n(aVar3.getStructuralChange() + 1);
                            }
                            aVar3.m(aVar3.getModification() + 1);
                        } else {
                            z4 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            v.U(I, this);
        } while (!z4);
    }

    @Override // androidx.compose.runtime.snapshots.p0
    public void A(@fg.l r0 value) {
        value.g(this.firstStateRecord);
        kotlin.jvm.internal.l0.n(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.firstStateRecord = (a) value;
    }

    @Override // androidx.compose.runtime.snapshots.p0
    @fg.l
    /* renamed from: F, reason: from getter */
    public r0 getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T element) {
        Object obj;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> i4;
        boolean z4;
        m I;
        Object obj2;
        do {
            obj = c0.f17032a;
            synchronized (obj) {
                r0 r0Var = this.firstStateRecord;
                kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) v.G((a) r0Var);
                modification = aVar.getModification();
                i4 = aVar.i();
                k2 k2Var = k2.f75408a;
            }
            kotlin.jvm.internal.l0.m(i4);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> add = i4.add((androidx.compose.runtime.external.kotlinx.collections.immutable.g<T>) element);
            z4 = false;
            if (kotlin.jvm.internal.l0.g(add, i4)) {
                return false;
            }
            r0 r0Var2 = this.firstStateRecord;
            kotlin.jvm.internal.l0.n(r0Var2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) r0Var2;
            v.M();
            synchronized (v.K()) {
                m.INSTANCE.getClass();
                I = v.I();
                a aVar3 = (a) v.r0(aVar2, this, I);
                obj2 = c0.f17032a;
                synchronized (obj2) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(add);
                        aVar3.n(aVar3.getStructuralChange() + 1);
                        aVar3.m(aVar3.getModification() + 1);
                        z4 = true;
                    }
                }
            }
            v.U(I, this);
        } while (!z4);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int index, @fg.l Collection<? extends T> elements) {
        return q(new b(index, elements));
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        m I;
        Object obj;
        r0 r0Var = this.firstStateRecord;
        kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        a aVar = (a) r0Var;
        v.M();
        synchronized (v.K()) {
            m.INSTANCE.getClass();
            I = v.I();
            a aVar2 = (a) v.r0(aVar, this, I);
            obj = c0.f17032a;
            synchronized (obj) {
                aVar2.l(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.l.b());
                aVar2.m(aVar2.getModification() + 1);
                aVar2.n(aVar2.getStructuralChange() + 1);
            }
        }
        v.U(I, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return i().i().contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@fg.l Collection<? extends Object> elements) {
        return i().i().containsAll(elements);
    }

    @fg.l
    @kd.i(name = "getDebuggerDisplayValue")
    public final List<T> f() {
        r0 r0Var = this.firstStateRecord;
        kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((a) v.G((a) r0Var)).i();
    }

    @Override // java.util.List
    public T get(int index) {
        return i().i().get(index);
    }

    @fg.l
    public final a<T> i() {
        r0 r0Var = this.firstStateRecord;
        kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (a) v.c0((a) r0Var, this);
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        return i().i().indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return i().i().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @fg.l
    public Iterator<T> iterator() {
        return listIterator();
    }

    public int l() {
        return i().i().size();
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        return i().i().lastIndexOf(element);
    }

    @Override // java.util.List
    @fg.l
    public ListIterator<T> listIterator() {
        return new k0(this, 0);
    }

    public final int m() {
        r0 r0Var = this.firstStateRecord;
        kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((a) v.G((a) r0Var)).getStructuralChange();
    }

    public T r(int index) {
        Object obj;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> i4;
        m I;
        Object obj2;
        boolean z4;
        T t4 = get(index);
        do {
            obj = c0.f17032a;
            synchronized (obj) {
                r0 r0Var = this.firstStateRecord;
                kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) v.G((a) r0Var);
                modification = aVar.getModification();
                i4 = aVar.i();
                k2 k2Var = k2.f75408a;
            }
            kotlin.jvm.internal.l0.m(i4);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> B0 = i4.B0(index);
            if (kotlin.jvm.internal.l0.g(B0, i4)) {
                break;
            }
            r0 r0Var2 = this.firstStateRecord;
            kotlin.jvm.internal.l0.n(r0Var2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) r0Var2;
            v.M();
            synchronized (v.K()) {
                m.INSTANCE.getClass();
                I = v.I();
                a aVar3 = (a) v.r0(aVar2, this, I);
                obj2 = c0.f17032a;
                synchronized (obj2) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(B0);
                        z4 = true;
                        aVar3.n(aVar3.getStructuralChange() + 1);
                        aVar3.m(aVar3.getModification() + 1);
                    } else {
                        z4 = false;
                    }
                }
            }
            v.U(I, this);
        } while (!z4);
        return t4;
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i4) {
        return r(i4);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@fg.l Collection<? extends Object> elements) {
        Object obj;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> i4;
        boolean z4;
        m I;
        Object obj2;
        do {
            obj = c0.f17032a;
            synchronized (obj) {
                r0 r0Var = this.firstStateRecord;
                kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) v.G((a) r0Var);
                modification = aVar.getModification();
                i4 = aVar.i();
                k2 k2Var = k2.f75408a;
            }
            kotlin.jvm.internal.l0.m(i4);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> removeAll = i4.removeAll((Collection<? extends T>) elements);
            z4 = false;
            if (kotlin.jvm.internal.l0.g(removeAll, i4)) {
                return false;
            }
            r0 r0Var2 = this.firstStateRecord;
            kotlin.jvm.internal.l0.n(r0Var2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) r0Var2;
            v.M();
            synchronized (v.K()) {
                m.INSTANCE.getClass();
                I = v.I();
                a aVar3 = (a) v.r0(aVar2, this, I);
                obj2 = c0.f17032a;
                synchronized (obj2) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(removeAll);
                        aVar3.n(aVar3.getStructuralChange() + 1);
                        aVar3.m(aVar3.getModification() + 1);
                        z4 = true;
                    }
                }
            }
            v.U(I, this);
        } while (!z4);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@fg.l Collection<? extends Object> elements) {
        return q(new c(elements));
    }

    public final void s(int fromIndex, int toIndex) {
        Object obj;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> i4;
        m I;
        Object obj2;
        boolean z4;
        do {
            obj = c0.f17032a;
            synchronized (obj) {
                r0 r0Var = this.firstStateRecord;
                kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) v.G((a) r0Var);
                modification = aVar.getModification();
                i4 = aVar.i();
                k2 k2Var = k2.f75408a;
            }
            kotlin.jvm.internal.l0.m(i4);
            g.a<T> g4 = i4.g();
            g4.subList(fromIndex, toIndex).clear();
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> a5 = g4.a();
            if (kotlin.jvm.internal.l0.g(a5, i4)) {
                return;
            }
            r0 r0Var2 = this.firstStateRecord;
            kotlin.jvm.internal.l0.n(r0Var2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) r0Var2;
            v.M();
            synchronized (v.K()) {
                m.INSTANCE.getClass();
                I = v.I();
                a aVar3 = (a) v.r0(aVar2, this, I);
                obj2 = c0.f17032a;
                synchronized (obj2) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(a5);
                        z4 = true;
                        aVar3.m(aVar3.getModification() + 1);
                        aVar3.n(aVar3.getStructuralChange() + 1);
                    } else {
                        z4 = false;
                    }
                }
            }
            v.U(I, this);
        } while (!z4);
    }

    @Override // java.util.List
    public T set(int index, T element) {
        Object obj;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> i4;
        m I;
        Object obj2;
        boolean z4;
        T t4 = get(index);
        do {
            obj = c0.f17032a;
            synchronized (obj) {
                r0 r0Var = this.firstStateRecord;
                kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) v.G((a) r0Var);
                modification = aVar.getModification();
                i4 = aVar.i();
                k2 k2Var = k2.f75408a;
            }
            kotlin.jvm.internal.l0.m(i4);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> gVar = i4.set(index, (int) element);
            if (kotlin.jvm.internal.l0.g(gVar, i4)) {
                break;
            }
            r0 r0Var2 = this.firstStateRecord;
            kotlin.jvm.internal.l0.n(r0Var2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) r0Var2;
            v.M();
            synchronized (v.K()) {
                m.INSTANCE.getClass();
                I = v.I();
                a aVar3 = (a) v.r0(aVar2, this, I);
                obj2 = c0.f17032a;
                synchronized (obj2) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(gVar);
                        z4 = true;
                        aVar3.m(aVar3.getModification() + 1);
                    } else {
                        z4 = false;
                    }
                }
            }
            v.U(I, this);
        } while (!z4);
        return t4;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return l();
    }

    @Override // java.util.List
    @fg.l
    public List<T> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex > toIndex || toIndex > l()) {
            throw new IllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        return new s0(this, fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    public final int v(@fg.l Collection<? extends T> elements, int start, int end) {
        Object obj;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> i4;
        m I;
        Object obj2;
        boolean z4;
        int l4 = l();
        do {
            obj = c0.f17032a;
            synchronized (obj) {
                r0 r0Var = this.firstStateRecord;
                kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) v.G((a) r0Var);
                modification = aVar.getModification();
                i4 = aVar.i();
                k2 k2Var = k2.f75408a;
            }
            kotlin.jvm.internal.l0.m(i4);
            g.a<T> g4 = i4.g();
            g4.subList(start, end).retainAll(elements);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> a5 = g4.a();
            if (kotlin.jvm.internal.l0.g(a5, i4)) {
                break;
            }
            r0 r0Var2 = this.firstStateRecord;
            kotlin.jvm.internal.l0.n(r0Var2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) r0Var2;
            v.M();
            synchronized (v.K()) {
                m.INSTANCE.getClass();
                I = v.I();
                a aVar3 = (a) v.r0(aVar2, this, I);
                obj2 = c0.f17032a;
                synchronized (obj2) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(a5);
                        z4 = true;
                        aVar3.m(aVar3.getModification() + 1);
                        aVar3.n(aVar3.getStructuralChange() + 1);
                    } else {
                        z4 = false;
                    }
                }
            }
            v.U(I, this);
        } while (!z4);
        return l4 - l();
    }

    @fg.l
    public final List<T> w() {
        return i().i();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@fg.l Collection<? extends T> elements) {
        Object obj;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> i4;
        boolean z4;
        m I;
        Object obj2;
        do {
            obj = c0.f17032a;
            synchronized (obj) {
                r0 r0Var = this.firstStateRecord;
                kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) v.G((a) r0Var);
                modification = aVar.getModification();
                i4 = aVar.i();
                k2 k2Var = k2.f75408a;
            }
            kotlin.jvm.internal.l0.m(i4);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> addAll = i4.addAll(elements);
            z4 = false;
            if (kotlin.jvm.internal.l0.g(addAll, i4)) {
                return false;
            }
            r0 r0Var2 = this.firstStateRecord;
            kotlin.jvm.internal.l0.n(r0Var2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) r0Var2;
            v.M();
            synchronized (v.K()) {
                m.INSTANCE.getClass();
                I = v.I();
                a aVar3 = (a) v.r0(aVar2, this, I);
                obj2 = c0.f17032a;
                synchronized (obj2) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(addAll);
                        aVar3.n(aVar3.getStructuralChange() + 1);
                        aVar3.m(aVar3.getModification() + 1);
                        z4 = true;
                    }
                }
            }
            v.U(I, this);
        } while (!z4);
        return true;
    }

    @Override // java.util.List
    @fg.l
    public ListIterator<T> listIterator(int index) {
        return new k0(this, index);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object element) {
        Object obj;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> i4;
        boolean z4;
        m I;
        Object obj2;
        do {
            obj = c0.f17032a;
            synchronized (obj) {
                r0 r0Var = this.firstStateRecord;
                kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) v.G((a) r0Var);
                modification = aVar.getModification();
                i4 = aVar.i();
                k2 k2Var = k2.f75408a;
            }
            kotlin.jvm.internal.l0.m(i4);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> remove = i4.remove((androidx.compose.runtime.external.kotlinx.collections.immutable.g<T>) element);
            z4 = false;
            if (kotlin.jvm.internal.l0.g(remove, i4)) {
                return false;
            }
            r0 r0Var2 = this.firstStateRecord;
            kotlin.jvm.internal.l0.n(r0Var2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) r0Var2;
            v.M();
            synchronized (v.K()) {
                m.INSTANCE.getClass();
                I = v.I();
                a aVar3 = (a) v.r0(aVar2, this, I);
                obj2 = c0.f17032a;
                synchronized (obj2) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(remove);
                        aVar3.n(aVar3.getStructuralChange() + 1);
                        aVar3.m(aVar3.getModification() + 1);
                        z4 = true;
                    }
                }
            }
            v.U(I, this);
        } while (!z4);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.v.b(this, tArr);
    }

    @Override // java.util.List
    public void add(int index, T element) {
        Object obj;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> i4;
        m I;
        Object obj2;
        boolean z4;
        do {
            obj = c0.f17032a;
            synchronized (obj) {
                r0 r0Var = this.firstStateRecord;
                kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) v.G((a) r0Var);
                modification = aVar.getModification();
                i4 = aVar.i();
                k2 k2Var = k2.f75408a;
            }
            kotlin.jvm.internal.l0.m(i4);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> add = i4.add(index, (int) element);
            if (kotlin.jvm.internal.l0.g(add, i4)) {
                return;
            }
            r0 r0Var2 = this.firstStateRecord;
            kotlin.jvm.internal.l0.n(r0Var2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) r0Var2;
            v.M();
            synchronized (v.K()) {
                m.INSTANCE.getClass();
                I = v.I();
                a aVar3 = (a) v.r0(aVar2, this, I);
                obj2 = c0.f17032a;
                synchronized (obj2) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(add);
                        z4 = true;
                        aVar3.n(aVar3.getStructuralChange() + 1);
                        aVar3.m(aVar3.getModification() + 1);
                    } else {
                        z4 = false;
                    }
                }
            }
            v.U(I, this);
        } while (!z4);
    }
}
