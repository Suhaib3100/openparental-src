package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: ScatterSet.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001RB\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\fJ \u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0082\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\u00020\u001c2\u000e\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000!¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u00020\u001c2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000%¢\u0006\u0004\b&\u0010'J\u001b\u0010)\u001a\u00020\u001c2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000(¢\u0006\u0004\b)\u0010*J\u001b\u0010\u0001\u001a\u00020\u001c2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0001\u0010+J\u001b\u0010-\u001a\u00020\u001c2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000,¢\u0006\u0004\b-\u0010.J \u0010/\u001a\u00020\u00072\u000e\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000!H\u0086\u0002¢\u0006\u0004\b/\u00100J\u001e\u00101\u001a\u00020\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0086\u0002¢\u0006\u0004\b1\u00102J\u001e\u00103\u001a\u00020\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0086\u0002¢\u0006\u0004\b3\u00104J\u001e\u00105\u001a\u00020\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b5\u00106J\u001e\u00107\u001a\u00020\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0086\u0002¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b9\u0010\u001eJ\u0018\u0010:\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b:\u0010 J\u001d\u0010;\u001a\u00020\u001c2\u000e\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000!¢\u0006\u0004\b;\u0010$J\u001b\u0010<\u001a\u00020\u001c2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000(¢\u0006\u0004\b<\u0010*J\u001b\u0010=\u001a\u00020\u001c2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000%¢\u0006\u0004\b=\u0010'J\u001b\u0010>\u001a\u00020\u001c2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b>\u0010+J\u001b\u0010?\u001a\u00020\u001c2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000,¢\u0006\u0004\b?\u0010.J \u0010@\u001a\u00020\u00072\u000e\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000!H\u0086\u0002¢\u0006\u0004\b@\u00100J\u001e\u0010A\u001a\u00020\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0086\u0002¢\u0006\u0004\bA\u00104J\u001e\u0010B\u001a\u00020\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0086\u0002¢\u0006\u0004\bB\u00102J\u001e\u0010C\u001a\u00020\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\bC\u00106J\u001e\u0010D\u001a\u00020\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0086\u0002¢\u0006\u0004\bD\u00108J'\u0010G\u001a\u00020\u00072\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001c0EH\u0086\bø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0003H\u0001¢\u0006\u0004\bI\u0010\u0006J\r\u0010J\u001a\u00020\u0007¢\u0006\u0004\bJ\u0010\fJ\u000f\u0010K\u001a\u00020\u0003H\u0007¢\u0006\u0004\bK\u0010LJ\u0013\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000M¢\u0006\u0004\bN\u0010OR\u0016\u0010Q\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006S"}, d2 = {"Landroidx/collection/k2;", "E", "Landroidx/collection/y2;", "", "initialCapacity", "<init>", "(I)V", "Lkotlin/k2;", "P", "capacity", "O", "N", "()V", "element", "L", "(Ljava/lang/Object;)I", "hash1", "M", "(I)I", "I", "newCapacity", "l0", "i0", "index", "", "value", "n0", "(IJ)V", "", "C", "(Ljava/lang/Object;)Z", "Z", "(Ljava/lang/Object;)V", "", "elements", "H", "([Ljava/lang/Object;)Z", "", "F", "(Ljava/lang/Iterable;)Z", "Lkotlin/sequences/m;", "G", "(Lkotlin/sequences/m;)Z", "(Landroidx/collection/y2;)Z", "Landroidx/collection/p2;", "D", "(Landroidx/collection/p2;)Z", "b0", "([Ljava/lang/Object;)V", "Y", "(Ljava/lang/Iterable;)V", "a0", "(Lkotlin/sequences/m;)V", "X", "(Landroidx/collection/y2;)V", "W", "(Landroidx/collection/p2;)V", "c0", "T", "h0", "g0", "f0", "e0", "d0", "V", "U", "S", "R", "Q", "Lkotlin/Function1;", "predicate", "k0", "(Lld/l;)V", "j0", "K", "m0", "()I", "", "J", "()Ljava/util/Set;", "e", "growthLimit", "a", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 8 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1100:1\n1018#1,2:1285\n1022#1,5:1293\n1018#1,2:1324\n1022#1,5:1332\n1018#1,2:1349\n1022#1,5:1357\n1018#1,2:1363\n1022#1,5:1371\n1#2:1101\n1672#3,6:1102\n1826#3:1125\n1688#3:1129\n1605#3,3:1148\n1619#3:1152\n1615#3:1155\n1795#3,3:1159\n1809#3,3:1163\n1733#3:1167\n1721#3:1169\n1715#3:1170\n1728#3:1175\n1818#3:1177\n1605#3,3:1187\n1619#3:1191\n1615#3:1194\n1795#3,3:1198\n1809#3,3:1202\n1733#3:1206\n1721#3:1208\n1715#3:1209\n1728#3:1214\n1818#3:1216\n1826#3:1242\n1688#3:1246\n1826#3:1271\n1688#3:1275\n1672#3,6:1287\n1672#3,6:1298\n1605#3,3:1304\n1615#3:1307\n1619#3:1308\n1795#3,3:1309\n1809#3,3:1312\n1733#3:1315\n1721#3:1316\n1715#3:1317\n1728#3:1318\n1818#3:1319\n1682#3:1320\n1661#3:1321\n1680#3:1322\n1661#3:1323\n1672#3,6:1326\n1795#3,3:1337\n1826#3:1340\n1715#3:1341\n1685#3:1342\n1661#3:1343\n1605#3,3:1344\n1615#3:1347\n1619#3:1348\n1672#3,6:1351\n1661#3:1362\n1672#3,6:1365\n1672#3,6:1376\n1672#3,6:1382\n13579#4,2:1108\n13579#4,2:1225\n1855#5,2:1110\n1855#5,2:1229\n1295#6,2:1112\n1295#6,2:1227\n267#7,4:1114\n237#7,7:1118\n248#7,3:1126\n251#7,2:1130\n272#7,2:1132\n254#7,6:1134\n274#7:1140\n433#7:1147\n434#7:1151\n436#7,2:1153\n438#7,3:1156\n441#7:1162\n442#7:1166\n443#7:1168\n444#7,4:1171\n450#7:1176\n451#7,8:1178\n433#7:1186\n434#7:1190\n436#7,2:1192\n438#7,3:1195\n441#7:1201\n442#7:1205\n443#7:1207\n444#7,4:1210\n450#7:1215\n451#7,8:1217\n267#7,4:1231\n237#7,7:1235\n248#7,3:1243\n251#7,2:1247\n272#7,2:1249\n254#7,6:1251\n274#7:1257\n237#7,7:1264\n248#7,3:1272\n251#7,9:1276\n305#8,6:1141\n305#8,6:1258\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n*L\n857#1:1285,2\n857#1:1293,5\n917#1:1324,2\n917#1:1332,5\n989#1:1349,2\n989#1:1357,5\n1004#1:1363,2\n1004#1:1371,5\n567#1:1102,6\n692#1:1125\n692#1:1129\n714#1:1148,3\n714#1:1152\n714#1:1155\n714#1:1159,3\n714#1:1163,3\n714#1:1167\n714#1:1169\n714#1:1170\n714#1:1175\n714#1:1177\n727#1:1187,3\n727#1:1191\n727#1:1194\n727#1:1198,3\n727#1:1202,3\n727#1:1206\n727#1:1208\n727#1:1209\n727#1:1214\n727#1:1216\n823#1:1242\n823#1:1246\n843#1:1271\n843#1:1275\n857#1:1287,6\n868#1:1298,6\n882#1:1304,3\n883#1:1307\n884#1:1308\n891#1:1309,3\n892#1:1312,3\n893#1:1315\n894#1:1316\n894#1:1317\n898#1:1318\n901#1:1319\n910#1:1320\n910#1:1321\n916#1:1322\n916#1:1323\n917#1:1326,6\n931#1:1337,3\n932#1:1340\n934#1:1341\n984#1:1342\n984#1:1343\n986#1:1344,3\n987#1:1347\n989#1:1348\n989#1:1351,6\n1002#1:1362\n1004#1:1365,6\n1019#1:1376,6\n1025#1:1382,6\n662#1:1108,2\n793#1:1225,2\n672#1:1110,2\n813#1:1229,2\n682#1:1112,2\n803#1:1227,2\n692#1:1114,4\n692#1:1118,7\n692#1:1126,3\n692#1:1130,2\n692#1:1132,2\n692#1:1134,6\n692#1:1140\n714#1:1147\n714#1:1151\n714#1:1153,2\n714#1:1156,3\n714#1:1162\n714#1:1166\n714#1:1168\n714#1:1171,4\n714#1:1176\n714#1:1178,8\n727#1:1186\n727#1:1190\n727#1:1192,2\n727#1:1195,3\n727#1:1201\n727#1:1205\n727#1:1207\n727#1:1210,4\n727#1:1215\n727#1:1217,8\n823#1:1231,4\n823#1:1235,7\n823#1:1243,3\n823#1:1247,2\n823#1:1249,2\n823#1:1251,6\n823#1:1257\n843#1:1264,7\n843#1:1272,3\n843#1:1276,9\n702#1:1141,6\n833#1:1258,6\n*E\n"})
/* loaded from: classes.dex */
public final class k2<E> extends y2<E> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    /* compiled from: ScatterSet.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\tJ\u001d\u0010\u0015\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\u0015\u0010\rJ\u001d\u0010\u0016\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Landroidx/collection/k2$a;", "Landroidx/collection/y2$a;", "Landroidx/collection/y2;", "", "<init>", "(Landroidx/collection/k2;)V", "element", "", "add", "(Ljava/lang/Object;)Z", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "Lkotlin/k2;", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "remove", "retainAll", "removeAll", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1100:1\n237#2,7:1101\n248#2,3:1109\n251#2,9:1113\n1826#3:1108\n1688#3:1112\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper\n*L\n1080#1:1101,7\n1080#1:1109,3\n1080#1:1113,9\n1080#1:1108\n1080#1:1112\n*E\n"})
    private final class a extends y2<E>.a implements Set<E>, md.h {

        /* compiled from: ScatterSet.kt */
        @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"androidx/collection/k2$a$a", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "Lkotlin/k2;", "remove", "()V", "", "b", "I", "()I", "d", "(I)V", "current", "", "c", "Ljava/util/Iterator;", "()Ljava/util/Iterator;", "iterator", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.collection.k2$a$a, reason: collision with other inner class name */
        public static final class C0032a implements Iterator<E>, md.d {

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private int current = -1;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @fg.l
            private final Iterator<E> iterator;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ k2<E> f2313d;

            /* compiled from: ScatterSet.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1060}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlin/sequences/o;", "Lkotlin/k2;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 8, 0})
            @kotlin.jvm.internal.r1({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1100:1\n237#2,7:1101\n248#2,3:1109\n251#2,9:1113\n1826#3:1108\n1688#3:1112\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1\n*L\n1057#1:1101,7\n1057#1:1109,3\n1057#1:1113,9\n1057#1:1108\n1057#1:1112\n*E\n"})
            /* renamed from: androidx.collection.k2$a$a$a, reason: collision with other inner class name */
            static final class C0033a extends kotlin.coroutines.jvm.internal.k implements ld.p<kotlin.sequences.o<? super E>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                /* renamed from: c, reason: collision with root package name */
                Object f2314c;

                /* renamed from: d, reason: collision with root package name */
                Object f2315d;

                /* renamed from: e, reason: collision with root package name */
                Object f2316e;

                /* renamed from: f, reason: collision with root package name */
                int f2317f;

                /* renamed from: g, reason: collision with root package name */
                int f2318g;

                /* renamed from: h, reason: collision with root package name */
                int f2319h;

                /* renamed from: i, reason: collision with root package name */
                int f2320i;

                /* renamed from: j, reason: collision with root package name */
                long f2321j;

                /* renamed from: k, reason: collision with root package name */
                int f2322k;

                /* renamed from: l, reason: collision with root package name */
                private /* synthetic */ Object f2323l;

                /* renamed from: m, reason: collision with root package name */
                final /* synthetic */ k2<E> f2324m;

                /* renamed from: n, reason: collision with root package name */
                final /* synthetic */ C0032a f2325n;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0033a(k2<E> k2Var, C0032a c0032a, kotlin.coroutines.d<? super C0033a> dVar) {
                    super(2, dVar);
                    this.f2324m = k2Var;
                    this.f2325n = c0032a;
                }

                @Override // ld.p
                @fg.m
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@fg.l kotlin.sequences.o<? super E> oVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                    return ((C0033a) create(oVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    C0033a c0033a = new C0033a(this.f2324m, this.f2325n, dVar);
                    c0033a.f2323l = obj;
                    return c0033a;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x00a0  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x00ad  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x006f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x009a -> B:5:0x009d). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0055 -> B:15:0x00ab). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0057 -> B:6:0x006d). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0076 -> B:5:0x009d). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r23) {
                    /*
                        r22 = this;
                        r0 = r22
                        kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                        int r2 = r0.f2322k
                        r4 = 8
                        r5 = 1
                        if (r2 == 0) goto L34
                        if (r2 != r5) goto L2c
                        int r2 = r0.f2320i
                        int r6 = r0.f2319h
                        long r7 = r0.f2321j
                        int r9 = r0.f2318g
                        int r10 = r0.f2317f
                        java.lang.Object r11 = r0.f2316e
                        long[] r11 = (long[]) r11
                        java.lang.Object r12 = r0.f2315d
                        androidx.collection.k2 r12 = (androidx.collection.k2) r12
                        java.lang.Object r13 = r0.f2314c
                        androidx.collection.k2$a$a r13 = (androidx.collection.k2.a.C0032a) r13
                        java.lang.Object r14 = r0.f2323l
                        kotlin.sequences.o r14 = (kotlin.sequences.o) r14
                        kotlin.a1.n(r23)
                        goto L9d
                    L2c:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r1
                    L34:
                        kotlin.a1.n(r23)
                        java.lang.Object r2 = r0.f2323l
                        kotlin.sequences.o r2 = (kotlin.sequences.o) r2
                        androidx.collection.k2<E> r6 = r0.f2324m
                        androidx.collection.k2$a$a r7 = r0.f2325n
                        long[] r8 = r6.metadata
                        int r9 = r8.length
                        int r9 = r9 + (-2)
                        if (r9 < 0) goto Lb0
                        r10 = 0
                    L47:
                        r11 = r8[r10]
                        long r13 = ~r11
                        r15 = 7
                        long r13 = r13 << r15
                        long r13 = r13 & r11
                        r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                        long r13 = r13 & r15
                        int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                        if (r13 == 0) goto Lab
                        int r13 = r10 - r9
                        int r13 = ~r13
                        int r13 = r13 >>> 31
                        int r13 = 8 - r13
                        r14 = r2
                        r2 = 0
                        r19 = r11
                        r12 = r6
                        r11 = r8
                        r6 = r13
                        r13 = r7
                        r7 = r19
                        r21 = r10
                        r10 = r9
                        r9 = r21
                    L6d:
                        if (r2 >= r6) goto La0
                        r15 = 255(0xff, double:1.26E-321)
                        long r15 = r15 & r7
                        r17 = 128(0x80, double:6.3E-322)
                        int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                        if (r15 >= 0) goto L9d
                        int r15 = r9 << 3
                        int r15 = r15 + r2
                        r13.d(r15)
                        java.lang.Object[] r3 = r12.elements
                        r3 = r3[r15]
                        r0.f2323l = r14
                        r0.f2314c = r13
                        r0.f2315d = r12
                        r0.f2316e = r11
                        r0.f2317f = r10
                        r0.f2318g = r9
                        r0.f2321j = r7
                        r0.f2319h = r6
                        r0.f2320i = r2
                        r0.f2322k = r5
                        java.lang.Object r3 = r14.b(r3, r0)
                        if (r3 != r1) goto L9d
                        return r1
                    L9d:
                        long r7 = r7 >> r4
                        int r2 = r2 + r5
                        goto L6d
                    La0:
                        if (r6 != r4) goto Lb0
                        r8 = r11
                        r6 = r12
                        r7 = r13
                        r2 = r14
                        r19 = r10
                        r10 = r9
                        r9 = r19
                    Lab:
                        if (r10 == r9) goto Lb0
                        int r10 = r10 + 1
                        goto L47
                    Lb0:
                        kotlin.k2 r1 = kotlin.k2.f75408a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.collection.k2.a.C0032a.C0033a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            C0032a(k2<E> k2Var) {
                this.f2313d = k2Var;
                this.iterator = kotlin.sequences.p.a(new C0033a(k2Var, this, null));
            }

            /* renamed from: b, reason: from getter */
            public final int getCurrent() {
                return this.current;
            }

            @fg.l
            public final Iterator<E> c() {
                return this.iterator;
            }

            public final void d(int i4) {
                this.current = i4;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.iterator.hasNext();
            }

            @Override // java.util.Iterator
            public E next() {
                return this.iterator.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                int i4 = this.current;
                if (i4 != -1) {
                    this.f2313d.j0(i4);
                    this.current = -1;
                }
            }
        }

        public a() {
            super();
        }

        @Override // androidx.collection.y2.a, java.util.Set, java.util.Collection
        public boolean add(E element) {
            return k2.this.C(element);
        }

        @Override // androidx.collection.y2.a, java.util.Set, java.util.Collection
        public boolean addAll(@fg.l Collection<? extends E> elements) {
            kotlin.jvm.internal.l0.p(elements, "elements");
            return k2.this.F(elements);
        }

        @Override // androidx.collection.y2.a, java.util.Set, java.util.Collection
        public void clear() {
            k2.this.K();
        }

        @Override // androidx.collection.y2.a, java.util.Set, java.util.Collection, java.lang.Iterable
        @fg.l
        public Iterator<E> iterator() {
            return new C0032a(k2.this);
        }

        @Override // androidx.collection.y2.a, java.util.Set, java.util.Collection
        public boolean remove(Object element) {
            return k2.this.c0(element);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.collection.y2.a, java.util.Set, java.util.Collection
        public boolean removeAll(@fg.l Collection<? extends Object> elements) {
            kotlin.jvm.internal.l0.p(elements, "elements");
            int i4 = k2.this._size;
            Iterator<? extends Object> it = elements.iterator();
            while (it.hasNext()) {
                k2.this.T(it.next());
            }
            return i4 != k2.this._size;
        }

        @Override // androidx.collection.y2.a, java.util.Set, java.util.Collection
        public boolean retainAll(@fg.l Collection<? extends Object> elements) {
            kotlin.jvm.internal.l0.p(elements, "elements");
            k2<E> k2Var = k2.this;
            long[] jArr = k2Var.metadata;
            int length = jArr.length - 2;
            boolean z4 = false;
            if (length >= 0) {
                int i4 = 0;
                boolean z5 = false;
                while (true) {
                    long j4 = jArr[i4];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        for (int i6 = 0; i6 < i5; i6++) {
                            if ((255 & j4) < 128) {
                                int i7 = (i4 << 3) + i6;
                                if (!elements.contains(k2Var.elements[i7])) {
                                    k2Var.j0(i7);
                                    z5 = true;
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i5 != 8) {
                            return z5;
                        }
                    }
                    if (i4 == length) {
                        z4 = z5;
                        break;
                    }
                    i4++;
                }
            }
            return z4;
        }
    }

    public k2() {
        this(0, 1, null);
    }

    private final void I() {
        int compare;
        if (this._capacity > 8) {
            compare = Long.compare((kotlin.a2.h(this._size) * 32) ^ Long.MIN_VALUE, (this._capacity * 25) ^ Long.MIN_VALUE);
            if (compare <= 0) {
                i0();
                return;
            }
        }
        l0(x2.w(this._capacity));
    }

    private final int L(E element) {
        int hashCode = (element != null ? element.hashCode() : 0) * x2.f2466j;
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this._capacity;
        int i10 = i5 & i7;
        int i11 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            long j4 = ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr[i12] >>> i13);
            long j5 = i6;
            int i14 = i6;
            long j6 = j4 ^ (j5 * x2.f2467k);
            for (long j7 = (~j6) & (j6 - x2.f2467k) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                int numberOfTrailingZeros = (i10 + (Long.numberOfTrailingZeros(j7) >> 3)) & i7;
                if (kotlin.jvm.internal.l0.g(this.elements[numberOfTrailingZeros], element)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int M = M(i5);
                if (this.growthLimit == 0 && ((this.metadata[M >> 3] >> ((M & 7) << 3)) & 255) != 254) {
                    I();
                    M = M(i5);
                }
                this._size++;
                int i15 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i16 = M >> 3;
                long j10 = jArr2[i16];
                int i17 = (M & 7) << 3;
                this.growthLimit = i15 - (((j10 >> i17) & 255) == 128 ? 1 : 0);
                jArr2[i16] = (j10 & (~(255 << i17))) | (j5 << i17);
                int i18 = this._capacity;
                int i19 = ((M - 7) & i18) + (i18 & 7);
                int i20 = i19 >> 3;
                int i21 = (i19 & 7) << 3;
                jArr2[i20] = ((~(255 << i21)) & jArr2[i20]) | (j5 << i21);
                return M;
            }
            i11 += 8;
            i10 = (i10 + i11) & i7;
            i6 = i14;
        }
    }

    private final int M(int hash1) {
        int i4 = this._capacity;
        int i5 = hash1 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i10 = (i5 & 7) << 3;
            long j4 = ((jArr[i7 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i7] >>> i10);
            long j5 = j4 & ((~j4) << 7) & (-9187201950435737472L);
            if (j5 != 0) {
                return (i5 + (Long.numberOfTrailingZeros(j5) >> 3)) & i4;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    private final void N() {
        this.growthLimit = x2.o(this._capacity) - this._size;
    }

    private final void O(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = x2.f2461e;
        } else {
            jArr = new long[((capacity + 15) & (-8)) >> 3];
            kotlin.collections.l.U1(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.metadata = jArr;
        int i4 = capacity >> 3;
        long j4 = 255 << ((capacity & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j4)) | j4;
        N();
    }

    private final void P(int initialCapacity) {
        int max = initialCapacity > 0 ? Math.max(7, x2.x(initialCapacity)) : 0;
        this._capacity = max;
        O(max);
        this.elements = new Object[max];
    }

    private final void i0() {
        long[] jArr = this.metadata;
        int i4 = this._capacity;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = i6 >> 3;
            int i10 = (i6 & 7) << 3;
            if (((jArr[i7] >> i10) & 255) == 254) {
                long[] jArr2 = this.metadata;
                jArr2[i7] = (128 << i10) | (jArr2[i7] & (~(255 << i10)));
                int i11 = this._capacity;
                int i12 = ((i6 - 7) & i11) + (i11 & 7);
                int i13 = i12 >> 3;
                int i14 = (i12 & 7) << 3;
                jArr2[i13] = ((~(255 << i14)) & jArr2[i13]) | (128 << i14);
                i5++;
            }
        }
        this.growthLimit += i5;
    }

    private final void l0(int newCapacity) {
        int i4;
        long[] jArr = this.metadata;
        Object[] objArr = this.elements;
        int i5 = this._capacity;
        P(newCapacity);
        Object[] objArr2 = this.elements;
        int i6 = 0;
        while (i6 < i5) {
            if (((jArr[i6 >> 3] >> ((i6 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i6];
                int hashCode = (obj != null ? obj.hashCode() : 0) * x2.f2466j;
                int i7 = hashCode ^ (hashCode << 16);
                int M = M(i7 >>> 7);
                long j4 = i7 & 127;
                long[] jArr2 = this.metadata;
                int i10 = M >> 3;
                int i11 = (M & 7) << 3;
                i4 = i6;
                jArr2[i10] = (jArr2[i10] & (~(255 << i11))) | (j4 << i11);
                int i12 = this._capacity;
                int i13 = ((M - 7) & i12) + (i12 & 7);
                int i14 = i13 >> 3;
                int i15 = (i13 & 7) << 3;
                jArr2[i14] = ((~(255 << i15)) & jArr2[i14]) | (j4 << i15);
                objArr2[M] = obj;
            } else {
                i4 = i6;
            }
            i6 = i4 + 1;
        }
    }

    private final void n0(int index, long value) {
        long[] jArr = this.metadata;
        int i4 = index >> 3;
        int i5 = (index & 7) << 3;
        jArr[i4] = (jArr[i4] & (~(255 << i5))) | (value << i5);
        int i6 = this._capacity;
        int i7 = ((index - 7) & i6) + (i6 & 7);
        int i10 = i7 >> 3;
        int i11 = (i7 & 7) << 3;
        jArr[i10] = (value << i11) | (jArr[i10] & (~(255 << i11)));
    }

    public final boolean C(E element) {
        int i4 = this._size;
        this.elements[L(element)] = element;
        return this._size != i4;
    }

    public final boolean D(@fg.l p2<E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        W(elements);
        return i4 != this._size;
    }

    public final boolean E(@fg.l y2<E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        X(elements);
        return i4 != this._size;
    }

    public final boolean F(@fg.l Iterable<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        Y(elements);
        return i4 != this._size;
    }

    public final boolean G(@fg.l kotlin.sequences.m<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        a0(elements);
        return i4 != this._size;
    }

    public final boolean H(@fg.l E[] elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        b0(elements);
        return i4 != this._size;
    }

    @fg.l
    public final Set<E> J() {
        return new a();
    }

    public final void K() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != x2.f2461e) {
            kotlin.collections.l.U1(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.metadata;
            int i4 = this._capacity;
            int i5 = i4 >> 3;
            long j4 = 255 << ((i4 & 7) << 3);
            jArr2[i5] = (jArr2[i5] & (~j4)) | j4;
        }
        kotlin.collections.l.M1(this.elements, null, 0, this._capacity);
        N();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(@fg.l p2<E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        Object[] objArr = elements.content;
        int i4 = elements._size;
        for (int i5 = 0; i5 < i4; i5++) {
            T(objArr[i5]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(@fg.l y2<E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j4 = jArr[i4];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i4 - length)) >>> 31);
                for (int i6 = 0; i6 < i5; i6++) {
                    if ((255 & j4) < 128) {
                        T(objArr[(i4 << 3) + i6]);
                    }
                    j4 >>= 8;
                }
                if (i5 != 8) {
                    return;
                }
            }
            if (i4 == length) {
                return;
            } else {
                i4++;
            }
        }
    }

    public final void S(@fg.l Iterable<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            T(it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T(E r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13._capacity
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.metadata
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.elements
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.l0.g(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L72
            r10 = -1
        L6c:
            if (r10 < 0) goto L71
            r13.j0(r10)
        L71:
            return
        L72:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.k2.T(java.lang.Object):void");
    }

    public final void U(@fg.l kotlin.sequences.m<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            T(it.next());
        }
    }

    public final void V(@fg.l E[] elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        for (E e4 : elements) {
            T(e4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W(@fg.l p2<E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        Object[] objArr = elements.content;
        int i4 = elements._size;
        for (int i5 = 0; i5 < i4; i5++) {
            Z(objArr[i5]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X(@fg.l y2<E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j4 = jArr[i4];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i4 - length)) >>> 31);
                for (int i6 = 0; i6 < i5; i6++) {
                    if ((255 & j4) < 128) {
                        Z(objArr[(i4 << 3) + i6]);
                    }
                    j4 >>= 8;
                }
                if (i5 != 8) {
                    return;
                }
            }
            if (i4 == length) {
                return;
            } else {
                i4++;
            }
        }
    }

    public final void Y(@fg.l Iterable<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            Z(it.next());
        }
    }

    public final void Z(E element) {
        this.elements[L(element)] = element;
    }

    public final void a0(@fg.l kotlin.sequences.m<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            Z(it.next());
        }
    }

    public final void b0(@fg.l E[] elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        for (E e4 : elements) {
            Z(e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c0(E r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r18.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0._capacity
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.metadata
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.elements
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.l0.g(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.j0(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.k2.c0(java.lang.Object):boolean");
    }

    public final boolean d0(@fg.l p2<E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        Q(elements);
        return i4 != this._size;
    }

    public final boolean e0(@fg.l y2<E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        R(elements);
        return i4 != this._size;
    }

    public final boolean f0(@fg.l Iterable<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        S(elements);
        return i4 != this._size;
    }

    public final boolean g0(@fg.l kotlin.sequences.m<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        U(elements);
        return i4 != this._size;
    }

    public final boolean h0(@fg.l E[] elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        V(elements);
        return i4 != this._size;
    }

    @kotlin.w0
    public final void j0(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i4 = index >> 3;
        int i5 = (index & 7) << 3;
        jArr[i4] = (jArr[i4] & (~(255 << i5))) | (254 << i5);
        int i6 = this._capacity;
        int i7 = ((index - 7) & i6) + (i6 & 7);
        int i10 = i7 >> 3;
        int i11 = (i7 & 7) << 3;
        jArr[i10] = (jArr[i10] & (~(255 << i11))) | (254 << i11);
        this.elements[index] = null;
    }

    public final void k0(@fg.l ld.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j4 = jArr[i4];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i4 - length)) >>> 31);
                for (int i6 = 0; i6 < i5; i6++) {
                    if ((255 & j4) < 128) {
                        int i7 = (i4 << 3) + i6;
                        if (predicate.invoke(objArr[i7]).booleanValue()) {
                            j0(i7);
                        }
                    }
                    j4 >>= 8;
                }
                if (i5 != 8) {
                    return;
                }
            }
            if (i4 == length) {
                return;
            } else {
                i4++;
            }
        }
    }

    @androidx.annotation.g0(from = 0)
    public final int m0() {
        int i4 = this._capacity;
        int x4 = x2.x(x2.z(this._size));
        if (x4 >= i4) {
            return 0;
        }
        l0(x4);
        return i4 - this._capacity;
    }

    public /* synthetic */ k2(int i4, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? 6 : i4);
    }

    public k2(int i4) {
        super(null);
        if (i4 >= 0) {
            P(x2.z(i4));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }
}
