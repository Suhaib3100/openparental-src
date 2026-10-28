package androidx.collection;

import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: FloatIntMap.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J6\u0010\u001b\u001a\u00020\u00192!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0015H\u0081\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJK\u0010\u001f\u001a\u00020\u001926\u0010\u001a\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00190\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J6\u0010!\u001a\u00020\u00192!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00190\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b!\u0010\u001cJ6\u0010\"\u001a\u00020\u00192!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00190\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b\"\u0010\u001cJ-\u0010$\u001a\u00020\u00042\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b$\u0010%J-\u0010&\u001a\u00020\u00042\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020\f¢\u0006\u0004\b'\u0010(J-\u0010)\u001a\u00020\f2\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b-\u0010,J\u0015\u0010.\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b.\u0010/JA\u00107\u001a\u0002062\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00102\u001a\u0002002\b\b\u0002\u00103\u001a\u0002002\b\b\u0002\u00104\u001a\u00020\f2\b\b\u0002\u00105\u001a\u000200H\u0007¢\u0006\u0004\b7\u00108J\u007f\u0010:\u001a\u0002062\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00102\u001a\u0002002\b\b\u0002\u00103\u001a\u0002002\b\b\u0002\u00104\u001a\u00020\f2\b\b\u0002\u00105\u001a\u00020028\b\u0004\u00109\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u0002000\u001dH\u0087\bø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\fH\u0016¢\u0006\u0004\b<\u0010(J\u001a\u0010>\u001a\u00020\u00042\b\u0010=\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u000206H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\bB\u0010\u000eR\u001c\u0010F\u001a\u00020C8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b$\u0010D\u0012\u0004\bE\u0010\u0003R\u001c\u0010J\u001a\u00020G8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0005\u0010H\u0012\u0004\bI\u0010\u0003R\u001c\u0010N\u001a\u00020K8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b&\u0010L\u0012\u0004\bM\u0010\u0003R\u001c\u0010Q\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b+\u0010O\u0012\u0004\bP\u0010\u0003R\u001c\u0010S\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b-\u0010O\u0012\u0004\bR\u0010\u0003R\u0011\u0010U\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bT\u0010(R\u0011\u0010W\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bV\u0010(\u0082\u0001\u0001X\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006Y"}, d2 = {"Landroidx/collection/p;", "", "<init>", "()V", "", "b", "()Z", "N", "x", "y", "", "key", "", "n", "(F)I", "defaultValue", "r", "(FI)I", "Lkotlin/Function0;", "s", "(FLld/a;)I", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "index", "Lkotlin/k2;", "block", "k", "(Lld/l;)V", "Lkotlin/Function2;", "value", "j", "(Lld/p;)V", "l", "m", "predicate", "a", "(Lld/p;)Z", "c", "g", "()I", "h", "(Lld/p;)I", "d", "(F)Z", "e", "f", "(I)Z", "", "separator", "prefix", "postfix", "limit", "truncated", "", "E", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "transform", "F", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lld/p;)Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "i", "", "[J", "q", "metadata", "", "[F", "p", "keys", "", "[I", "u", "values", "I", "v", "_capacity", "w", "_size", "o", "capacity", "t", "size", "Landroidx/collection/l1;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nFloatIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatIntMap.kt\nandroidx/collection/FloatIntMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 3 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,1047:1\n357#1,6:1050\n367#1,3:1057\n370#1,9:1061\n357#1,6:1070\n367#1,3:1077\n370#1,9:1081\n357#1,6:1090\n367#1,3:1097\n370#1,9:1101\n385#1,4:1110\n357#1,6:1114\n367#1,3:1121\n370#1,2:1125\n389#1,2:1127\n373#1,6:1129\n391#1:1135\n385#1,4:1136\n357#1,6:1140\n367#1,3:1147\n370#1,2:1151\n389#1,2:1153\n373#1,6:1155\n391#1:1161\n385#1,4:1162\n357#1,6:1166\n367#1,3:1173\n370#1,2:1177\n389#1,2:1179\n373#1,6:1181\n391#1:1187\n410#1,3:1188\n357#1,6:1191\n367#1,3:1198\n370#1,2:1202\n413#1,2:1204\n373#1,6:1206\n415#1:1212\n385#1,4:1213\n357#1,6:1217\n367#1,3:1224\n370#1,2:1228\n389#1,2:1230\n373#1,6:1232\n391#1:1238\n385#1,4:1239\n357#1,6:1243\n367#1,3:1250\n370#1,2:1254\n389#1,2:1256\n373#1,6:1258\n391#1:1264\n385#1,4:1265\n357#1,6:1269\n367#1,3:1276\n370#1,2:1280\n389#1,2:1282\n373#1,6:1284\n391#1:1290\n385#1,4:1291\n357#1,6:1295\n367#1,3:1302\n370#1,2:1306\n389#1,2:1308\n373#1,6:1310\n391#1:1316\n385#1,4:1317\n357#1,6:1321\n367#1,3:1328\n370#1,2:1332\n389#1,2:1334\n373#1,6:1336\n391#1:1342\n385#1,4:1343\n357#1,6:1347\n367#1,3:1354\n370#1,2:1358\n389#1,2:1360\n373#1,6:1362\n391#1:1368\n519#1,11:1385\n385#1,4:1396\n357#1,6:1400\n367#1,3:1407\n370#1,2:1411\n389#1:1413\n530#1,10:1414\n390#1:1424\n373#1,6:1425\n391#1:1431\n540#1,2:1432\n519#1,11:1434\n385#1,4:1445\n357#1,6:1449\n367#1,3:1456\n370#1,2:1460\n389#1:1462\n530#1,10:1463\n390#1:1473\n373#1,6:1474\n391#1:1480\n540#1,2:1481\n519#1,11:1483\n385#1,4:1494\n357#1,6:1498\n367#1,3:1505\n370#1,2:1509\n389#1:1511\n530#1,10:1512\n390#1:1522\n373#1,6:1523\n391#1:1529\n540#1,2:1530\n519#1,11:1532\n385#1,4:1543\n357#1,6:1547\n367#1,3:1554\n370#1,2:1558\n389#1:1560\n530#1,10:1561\n390#1:1571\n373#1,6:1572\n391#1:1578\n540#1,2:1579\n519#1,11:1581\n385#1,4:1592\n357#1,6:1596\n367#1,3:1603\n370#1,2:1607\n389#1:1609\n530#1,10:1610\n390#1:1620\n373#1,6:1621\n391#1:1627\n540#1,2:1628\n1826#2:1048\n1688#2:1049\n1826#2:1056\n1688#2:1060\n1826#2:1076\n1688#2:1080\n1826#2:1096\n1688#2:1100\n1826#2:1120\n1688#2:1124\n1826#2:1146\n1688#2:1150\n1826#2:1172\n1688#2:1176\n1826#2:1197\n1688#2:1201\n1826#2:1223\n1688#2:1227\n1826#2:1249\n1688#2:1253\n1826#2:1275\n1688#2:1279\n1826#2:1301\n1688#2:1305\n1826#2:1327\n1688#2:1331\n1826#2:1353\n1688#2:1357\n1619#2:1372\n1615#2:1373\n1795#2,3:1374\n1809#2,3:1377\n1733#2:1380\n1721#2:1381\n1715#2:1382\n1728#2:1383\n1818#2:1384\n1826#2:1406\n1688#2:1410\n1826#2:1455\n1688#2:1459\n1826#2:1504\n1688#2:1508\n1826#2:1553\n1688#2:1557\n1826#2:1602\n1688#2:1606\n849#3,3:1369\n*S KotlinDebug\n*F\n+ 1 FloatIntMap.kt\nandroidx/collection/FloatIntMap\n*L\n388#1:1050,6\n388#1:1057,3\n388#1:1061,9\n400#1:1070,6\n400#1:1077,3\n400#1:1081,9\n412#1:1090,6\n412#1:1097,3\n412#1:1101,9\n421#1:1110,4\n421#1:1114,6\n421#1:1121,3\n421#1:1125,2\n421#1:1127,2\n421#1:1129,6\n421#1:1135\n431#1:1136,4\n431#1:1140,6\n431#1:1147,3\n431#1:1151,2\n431#1:1153,2\n431#1:1155,6\n431#1:1161\n447#1:1162,4\n447#1:1166,6\n447#1:1173,3\n447#1:1177,2\n447#1:1179,2\n447#1:1181,6\n447#1:1187\n470#1:1188,3\n470#1:1191,6\n470#1:1198,3\n470#1:1202,2\n470#1:1204,2\n470#1:1206,6\n470#1:1212\n494#1:1213,4\n494#1:1217,6\n494#1:1224,3\n494#1:1228,2\n494#1:1230,2\n494#1:1232,6\n494#1:1238\n529#1:1239,4\n529#1:1243,6\n529#1:1250,3\n529#1:1254,2\n529#1:1256,2\n529#1:1258,6\n529#1:1264\n529#1:1265,4\n529#1:1269,6\n529#1:1276,3\n529#1:1280,2\n529#1:1282,2\n529#1:1284,6\n529#1:1290\n550#1:1291,4\n550#1:1295,6\n550#1:1302,3\n550#1:1306,2\n550#1:1308,2\n550#1:1310,6\n550#1:1316\n576#1:1317,4\n576#1:1321,6\n576#1:1328,3\n576#1:1332,2\n576#1:1334,2\n576#1:1336,6\n576#1:1342\n598#1:1343,4\n598#1:1347,6\n598#1:1354,3\n598#1:1358,2\n598#1:1360,2\n598#1:1362,6\n598#1:1368\n-1#1:1385,11\n-1#1:1396,4\n-1#1:1400,6\n-1#1:1407,3\n-1#1:1411,2\n-1#1:1413\n-1#1:1414,10\n-1#1:1424\n-1#1:1425,6\n-1#1:1431\n-1#1:1432,2\n-1#1:1434,11\n-1#1:1445,4\n-1#1:1449,6\n-1#1:1456,3\n-1#1:1460,2\n-1#1:1462\n-1#1:1463,10\n-1#1:1473\n-1#1:1474,6\n-1#1:1480\n-1#1:1481,2\n-1#1:1483,11\n-1#1:1494,4\n-1#1:1498,6\n-1#1:1505,3\n-1#1:1509,2\n-1#1:1511\n-1#1:1512,10\n-1#1:1522\n-1#1:1523,6\n-1#1:1529\n-1#1:1530,2\n-1#1:1532,11\n-1#1:1543,4\n-1#1:1547,6\n-1#1:1554,3\n-1#1:1558,2\n-1#1:1560\n-1#1:1561,10\n-1#1:1571\n-1#1:1572,6\n-1#1:1578\n-1#1:1579,2\n-1#1:1581,11\n-1#1:1592,4\n-1#1:1596,6\n-1#1:1603,3\n-1#1:1607,2\n-1#1:1609\n-1#1:1610,10\n-1#1:1620\n-1#1:1621,6\n-1#1:1627\n-1#1:1628,2\n362#1:1048\n369#1:1049\n388#1:1056\n388#1:1060\n400#1:1076\n400#1:1080\n412#1:1096\n412#1:1100\n421#1:1120\n421#1:1124\n431#1:1146\n431#1:1150\n447#1:1172\n447#1:1176\n470#1:1197\n470#1:1201\n494#1:1223\n494#1:1227\n529#1:1249\n529#1:1253\n529#1:1275\n529#1:1279\n550#1:1301\n550#1:1305\n576#1:1327\n576#1:1331\n598#1:1353\n598#1:1357\n618#1:1372\n621#1:1373\n625#1:1374,3\n626#1:1377,3\n627#1:1380\n628#1:1381\n628#1:1382\n632#1:1383\n635#1:1384\n-1#1:1406\n-1#1:1410\n-1#1:1455\n-1#1:1459\n-1#1:1504\n-1#1:1508\n-1#1:1553\n-1#1:1557\n-1#1:1602\n-1#1:1606\n617#1:1369,3\n*E\n"})
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public long[] metadata;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public float[] keys;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public int[] values;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public int _capacity;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public int _size;

    public /* synthetic */ p(kotlin.jvm.internal.w wVar) {
        this();
    }

    public static /* synthetic */ String L(p pVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i5 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i5 & 4) == 0 ? charSequence3 : "";
        if ((i5 & 8) != 0) {
            i4 = -1;
        }
        int i6 = i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        return pVar.E(charSequence, charSequence5, charSequence6, i6, charSequence4);
    }

    public static /* synthetic */ String M(p pVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, ld.p pVar2, int i5, Object obj) {
        long[] jArr;
        long[] jArr2;
        int i6;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        CharSequence separator = (i5 & 1) != 0 ? ", " : charSequence;
        CharSequence prefix = (i5 & 2) != 0 ? "" : charSequence2;
        CharSequence postfix = (i5 & 4) == 0 ? charSequence3 : "";
        int i7 = (i5 & 8) != 0 ? -1 : i4;
        CharSequence charSequence5 = (i5 & 16) != 0 ? "..." : charSequence4;
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        kotlin.jvm.internal.l0.p(postfix, "postfix");
        StringBuilder a5 = k.a(charSequence5, "truncated", pVar2, "transform", prefix);
        float[] fArr = pVar.keys;
        int[] iArr = pVar.values;
        long[] jArr3 = pVar.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            loop0: while (true) {
                long j4 = jArr3[i10];
                int i12 = i10;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j4 & 255) < 128) {
                            int i16 = (i12 << 3) + i15;
                            float f4 = fArr[i16];
                            int i17 = iArr[i16];
                            if (i11 == i7) {
                                a5.append(charSequence5);
                                break loop0;
                            }
                            if (i11 != 0) {
                                a5.append(separator);
                            }
                            Float valueOf = Float.valueOf(f4);
                            jArr2 = jArr3;
                            a5.append((CharSequence) pVar2.invoke(valueOf, Integer.valueOf(i17)));
                            i11++;
                            i6 = 8;
                        } else {
                            jArr2 = jArr3;
                            i6 = i13;
                        }
                        j4 >>= i6;
                        i15++;
                        i13 = i6;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i14 != i13) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i12 == length) {
                    break;
                }
                i10 = i12 + 1;
                jArr3 = jArr;
            }
        }
        a5.append(postfix);
        String sb = a5.toString();
        kotlin.jvm.internal.l0.o(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }

    @kotlin.w0
    public static /* synthetic */ void p() {
    }

    @kotlin.w0
    public static /* synthetic */ void q() {
    }

    @kotlin.w0
    public static /* synthetic */ void u() {
    }

    public static /* synthetic */ void v() {
    }

    public static /* synthetic */ void w() {
    }

    @fg.l
    @kd.j
    public final String A(@fg.l CharSequence separator) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        return L(this, separator, null, null, 0, null, 30, null);
    }

    @fg.l
    @kd.j
    public final String B(@fg.l CharSequence separator, @fg.l CharSequence prefix) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        return L(this, separator, prefix, null, 0, null, 28, null);
    }

    @fg.l
    @kd.j
    public final String C(@fg.l CharSequence separator, @fg.l CharSequence prefix, @fg.l CharSequence postfix) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        kotlin.jvm.internal.l0.p(postfix, "postfix");
        return L(this, separator, prefix, postfix, 0, null, 24, null);
    }

    @fg.l
    @kd.j
    public final String D(@fg.l CharSequence separator, @fg.l CharSequence prefix, @fg.l CharSequence postfix, int i4) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        kotlin.jvm.internal.l0.p(postfix, "postfix");
        return L(this, separator, prefix, postfix, i4, null, 16, null);
    }

    @fg.l
    @kd.j
    public final String E(@fg.l CharSequence separator, @fg.l CharSequence prefix, @fg.l CharSequence postfix, int limit, @fg.l CharSequence truncated) {
        float[] fArr;
        float[] fArr2;
        int i4;
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        StringBuilder a5 = l.a(postfix, "postfix", truncated, "truncated", prefix);
        float[] fArr3 = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            loop0: while (true) {
                long j4 = jArr[i5];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8;
                    int i10 = 8 - ((~(i5 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j4 & 255) < 128) {
                            int i12 = (i5 << 3) + i11;
                            float f4 = fArr3[i12];
                            int i13 = iArr[i12];
                            fArr2 = fArr3;
                            if (i6 == limit) {
                                a5.append(truncated);
                                break loop0;
                            }
                            if (i6 != 0) {
                                a5.append(separator);
                            }
                            a5.append(f4);
                            a5.append('=');
                            a5.append(i13);
                            i6++;
                            i4 = 8;
                        } else {
                            fArr2 = fArr3;
                            i4 = i7;
                        }
                        j4 >>= i4;
                        i11++;
                        i7 = i4;
                        fArr3 = fArr2;
                    }
                    fArr = fArr3;
                    if (i10 != i7) {
                        break;
                    }
                } else {
                    fArr = fArr3;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
                fArr3 = fArr;
            }
            String sb = a5.toString();
            kotlin.jvm.internal.l0.o(sb, "StringBuilder().apply(builderAction).toString()");
            return sb;
        }
        a5.append(postfix);
        String sb2 = a5.toString();
        kotlin.jvm.internal.l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @fg.l
    @kd.j
    public final String F(@fg.l CharSequence separator, @fg.l CharSequence prefix, @fg.l CharSequence postfix, int limit, @fg.l CharSequence truncated, @fg.l ld.p<? super Float, ? super Integer, ? extends CharSequence> transform) {
        CharSequence separator2 = separator;
        kotlin.jvm.internal.l0.p(separator2, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        kotlin.jvm.internal.l0.p(postfix, "postfix");
        StringBuilder a5 = k.a(truncated, "truncated", transform, "transform", prefix);
        float[] fArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            loop0: while (true) {
                long j4 = jArr[i4];
                int i6 = i4;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i7) {
                        if ((j4 & 255) < 128) {
                            int i11 = (i6 << 3) + i10;
                            float f4 = fArr[i11];
                            int i12 = iArr[i11];
                            if (i5 == limit) {
                                a5.append(truncated);
                                break loop0;
                            }
                            if (i5 != 0) {
                                a5.append(separator2);
                            }
                            a5.append(transform.invoke(Float.valueOf(f4), Integer.valueOf(i12)));
                            i5++;
                        }
                        j4 >>= 8;
                        i10++;
                        separator2 = separator;
                    }
                    if (i7 != 8) {
                        break;
                    }
                }
                if (i6 == length) {
                    break;
                }
                i4 = i6 + 1;
                separator2 = separator;
            }
        }
        a5.append(postfix);
        String sb = a5.toString();
        kotlin.jvm.internal.l0.o(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }

    @fg.l
    @kd.j
    public final String G(@fg.l CharSequence charSequence, @fg.l CharSequence prefix, @fg.l CharSequence charSequence2, int i4, @fg.l ld.p<? super Float, ? super Integer, ? extends CharSequence> pVar) {
        CharSequence separator = charSequence;
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        StringBuilder a5 = k.a(charSequence2, "postfix", pVar, "transform", prefix);
        float[] fArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            loop0: while (true) {
                long j4 = jArr[i5];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8;
                    int i10 = 8 - ((~(i5 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j4 & 255) < 128) {
                            int i12 = (i5 << 3) + i11;
                            float f4 = fArr[i12];
                            int i13 = iArr[i12];
                            if (i6 == i4) {
                                a5.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i6 != 0) {
                                a5.append(separator);
                            }
                            a5.append(pVar.invoke(Float.valueOf(f4), Integer.valueOf(i13)));
                            i6++;
                        }
                        j4 >>= 8;
                        i11++;
                        separator = charSequence;
                        i7 = 8;
                    }
                    if (i10 != i7) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                }
                i5++;
                separator = charSequence;
            }
            String sb = a5.toString();
            kotlin.jvm.internal.l0.o(sb, "StringBuilder().apply(builderAction).toString()");
            return sb;
        }
        a5.append(charSequence2);
        String sb2 = a5.toString();
        kotlin.jvm.internal.l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @fg.l
    @kd.j
    public final String H(@fg.l CharSequence separator, @fg.l CharSequence prefix, @fg.l CharSequence charSequence, @fg.l ld.p<? super Float, ? super Integer, ? extends CharSequence> pVar) {
        int i4;
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        StringBuilder a5 = k.a(charSequence, "postfix", pVar, "transform", prefix);
        float[] fArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            loop0: while (true) {
                long j4 = jArr[i5];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8;
                    int i10 = 8 - ((~(i5 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j4 & 255) < 128) {
                            int i12 = (i5 << 3) + i11;
                            float f4 = fArr[i12];
                            int i13 = iArr[i12];
                            if (i6 == -1) {
                                a5.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i6 != 0) {
                                a5.append(separator);
                            }
                            a5.append(pVar.invoke(Float.valueOf(f4), Integer.valueOf(i13)));
                            i6++;
                            i4 = 8;
                        } else {
                            i4 = i7;
                        }
                        j4 >>= i4;
                        i11++;
                        i7 = i4;
                    }
                    if (i10 != i7) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                }
                i5++;
            }
            String sb = a5.toString();
            kotlin.jvm.internal.l0.o(sb, "StringBuilder().apply(builderAction).toString()");
            return sb;
        }
        a5.append(charSequence);
        String sb2 = a5.toString();
        kotlin.jvm.internal.l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @fg.l
    @kd.j
    public final String I(@fg.l CharSequence separator, @fg.l CharSequence charSequence, @fg.l ld.p<? super Float, ? super Integer, ? extends CharSequence> pVar) {
        int i4;
        kotlin.jvm.internal.l0.p(separator, "separator");
        StringBuilder a5 = k.a(charSequence, "prefix", pVar, "transform", charSequence);
        float[] fArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            loop0: while (true) {
                long j4 = jArr[i5];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8;
                    int i10 = 8 - ((~(i5 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j4 & 255) < 128) {
                            int i12 = (i5 << 3) + i11;
                            float f4 = fArr[i12];
                            int i13 = iArr[i12];
                            if (i6 == -1) {
                                a5.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i6 != 0) {
                                a5.append(separator);
                            }
                            a5.append(pVar.invoke(Float.valueOf(f4), Integer.valueOf(i13)));
                            i6++;
                            i4 = 8;
                        } else {
                            i4 = i7;
                        }
                        j4 >>= i4;
                        i11++;
                        i7 = i4;
                    }
                    if (i10 != i7) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                }
                i5++;
            }
        }
        a5.append((CharSequence) "");
        String sb = a5.toString();
        kotlin.jvm.internal.l0.o(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }

    @fg.l
    @kd.j
    public final String J(@fg.l CharSequence separator, @fg.l ld.p<? super Float, ? super Integer, ? extends CharSequence> transform) {
        int i4;
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(transform, "transform");
        StringBuilder sb = new StringBuilder("");
        float[] fArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            loop0: while (true) {
                long j4 = jArr[i5];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8;
                    int i10 = 8 - ((~(i5 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j4 & 255) < 128) {
                            int i12 = (i5 << 3) + i11;
                            float f4 = fArr[i12];
                            int i13 = iArr[i12];
                            if (i6 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i6 != 0) {
                                sb.append(separator);
                            }
                            sb.append(transform.invoke(Float.valueOf(f4), Integer.valueOf(i13)));
                            i6++;
                            i4 = 8;
                        } else {
                            i4 = i7;
                        }
                        j4 >>= i4;
                        i11++;
                        i7 = i4;
                    }
                    if (i10 != i7) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                }
                i5++;
            }
            String sb2 = sb.toString();
            kotlin.jvm.internal.l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        sb.append((CharSequence) "");
        String sb22 = sb.toString();
        kotlin.jvm.internal.l0.o(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    @fg.l
    @kd.j
    public final String K(@fg.l ld.p<? super Float, ? super Integer, ? extends CharSequence> transform) {
        int i4;
        kotlin.jvm.internal.l0.p(transform, "transform");
        StringBuilder sb = new StringBuilder("");
        float[] fArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            loop0: while (true) {
                long j4 = jArr[i5];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8;
                    int i10 = 8 - ((~(i5 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j4 & 255) < 128) {
                            int i12 = (i5 << 3) + i11;
                            float f4 = fArr[i12];
                            int i13 = iArr[i12];
                            if (i6 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i6 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(transform.invoke(Float.valueOf(f4), Integer.valueOf(i13)));
                            i6++;
                            i4 = 8;
                        } else {
                            i4 = i7;
                        }
                        j4 >>= i4;
                        i11++;
                        i7 = i4;
                    }
                    if (i10 != i7) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                }
                i5++;
            }
        }
        sb.append((CharSequence) "");
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final boolean N() {
        return this._size == 0;
    }

    public final boolean a(@fg.l ld.p<? super Float, ? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        float[] fArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i4 = 0;
        while (true) {
            long j4 = jArr[i4];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i4 - length)) >>> 31);
                for (int i6 = 0; i6 < i5; i6++) {
                    if ((255 & j4) < 128) {
                        int i7 = (i4 << 3) + i6;
                        if (!predicate.invoke(Float.valueOf(fArr[i7]), Integer.valueOf(iArr[i7])).booleanValue()) {
                            return false;
                        }
                    }
                    j4 >>= 8;
                }
                if (i5 != 8) {
                    return true;
                }
            }
            if (i4 == length) {
                return true;
            }
            i4++;
        }
    }

    public final boolean b() {
        return this._size != 0;
    }

    public final boolean c(@fg.l ld.p<? super Float, ? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        float[] fArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr[i4];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j4) < 128) {
                            int i7 = (i4 << 3) + i6;
                            if (predicate.invoke(Float.valueOf(fArr[i7]), Integer.valueOf(iArr[i7])).booleanValue()) {
                                return true;
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                }
                i4++;
            }
        }
        return false;
    }

    public final boolean d(float key) {
        return i(key) >= 0;
    }

    public final boolean e(float key) {
        return i(key) >= 0;
    }

    public boolean equals(@fg.m Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof p)) {
            return false;
        }
        p pVar = (p) other;
        if (pVar._size != this._size) {
            return false;
        }
        float[] fArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr[i4];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j4) < 128) {
                            int i7 = (i4 << 3) + i6;
                            if (iArr[i7] != pVar.n(fArr[i7])) {
                                return false;
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                }
                i4++;
            }
        }
        return true;
    }

    public final boolean f(int value) {
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr[i4];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j4) < 128 && value == iArr[(i4 << 3) + i6]) {
                            return true;
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                }
                i4++;
            }
        }
        return false;
    }

    /* renamed from: g, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final int h(@fg.l ld.p<? super Float, ? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        float[] fArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i4 = 0;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                long j4 = jArr[i5];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i10 = 0; i10 < i7; i10++) {
                        if ((255 & j4) < 128) {
                            int i11 = (i5 << 3) + i10;
                            if (predicate.invoke(Float.valueOf(fArr[i11]), Integer.valueOf(iArr[i11])).booleanValue()) {
                                i6++;
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i7 != 8) {
                        return i6;
                    }
                }
                if (i5 == length) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
        }
        return i4;
    }

    public int hashCode() {
        float[] fArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i4 = 0;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                long j4 = jArr[i5];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i10 = 0; i10 < i7; i10++) {
                        if ((255 & j4) < 128) {
                            int i11 = (i5 << 3) + i10;
                            float f4 = fArr[i11];
                            i6 += Integer.hashCode(iArr[i11]) ^ Float.hashCode(f4);
                        }
                        j4 >>= 8;
                    }
                    if (i7 != 8) {
                        return i6;
                    }
                }
                if (i5 == length) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
        }
        return i4;
    }

    @kotlin.w0
    public final int i(float key) {
        int hashCode = Float.hashCode(key) * x2.f2466j;
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 & 127;
        int i6 = this._capacity;
        int i7 = (i4 >>> 7) & i6;
        int i10 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i11 = i7 >> 3;
            int i12 = (i7 & 7) << 3;
            long j4 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j5 = (i5 * x2.f2467k) ^ j4;
            for (long j6 = (~j5) & (j5 - x2.f2467k) & (-9187201950435737472L); j6 != 0; j6 &= j6 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i7) & i6;
                if (this.keys[numberOfTrailingZeros] == key) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i7 = (i7 + i10) & i6;
        }
    }

    public final void j(@fg.l ld.p<? super Float, ? super Integer, kotlin.k2> block) {
        kotlin.jvm.internal.l0.p(block, "block");
        float[] fArr = this.keys;
        int[] iArr = this.values;
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
                        block.invoke(Float.valueOf(fArr[i7]), Integer.valueOf(iArr[i7]));
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

    @kotlin.w0
    public final void k(@fg.l ld.l<? super Integer, kotlin.k2> block) {
        kotlin.jvm.internal.l0.p(block, "block");
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
                        j.a(i4 << 3, i6, block);
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

    public final void l(@fg.l ld.l<? super Float, kotlin.k2> block) {
        kotlin.jvm.internal.l0.p(block, "block");
        float[] fArr = this.keys;
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
                        block.invoke(Float.valueOf(fArr[(i4 << 3) + i6]));
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

    public final void m(@fg.l ld.l<? super Integer, kotlin.k2> block) {
        kotlin.jvm.internal.l0.p(block, "block");
        int[] iArr = this.values;
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
                        block.invoke(Integer.valueOf(iArr[(i4 << 3) + i6]));
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

    public final int n(float key) {
        int i4 = i(key);
        if (i4 >= 0) {
            return this.values[i4];
        }
        throw new NoSuchElementException("Cannot find value for key " + key);
    }

    /* renamed from: o, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    public final int r(float key, int defaultValue) {
        int i4 = i(key);
        return i4 >= 0 ? this.values[i4] : defaultValue;
    }

    public final int s(float key, @fg.l ld.a<Integer> defaultValue) {
        kotlin.jvm.internal.l0.p(defaultValue, "defaultValue");
        int i4 = i(key);
        return i4 < 0 ? defaultValue.invoke().intValue() : this.values[i4];
    }

    public final int t() {
        return this._size;
    }

    @fg.l
    public String toString() {
        if (x()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        float[] fArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                long j4 = jArr[i4];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j4) < 128) {
                            int i10 = (i4 << 3) + i7;
                            float f4 = fArr[i10];
                            int i11 = iArr[i10];
                            sb.append(f4);
                            sb.append("=");
                            sb.append(i11);
                            i5++;
                            if (i5 < this._size) {
                                sb.append(", ");
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                }
                i4++;
            }
        }
        return c.a(sb, '}', "s.append('}').toString()");
    }

    public final boolean x() {
        return this._size == 0;
    }

    public final boolean y() {
        return this._size != 0;
    }

    @fg.l
    @kd.j
    public final String z() {
        return L(this, null, null, null, 0, null, 31, null);
    }

    private p() {
        this.metadata = x2.f2461e;
        this.keys = a0.g();
        this.values = o0.b();
    }
}
