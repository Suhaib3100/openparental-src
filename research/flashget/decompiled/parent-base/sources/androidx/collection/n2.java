package androidx.collection;

import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: ObjectIntMap.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u0007J\r\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u0007J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J6\u0010\u001b\u001a\u00020\u00192!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0015H\u0081\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJK\u0010\u001f\u001a\u00020\u001926\u0010\u001a\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00190\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J6\u0010!\u001a\u00020\u00192!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00190\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b!\u0010\u001cJ6\u0010\"\u001a\u00020\u00192!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00190\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b\"\u0010\u001cJ-\u0010$\u001a\u00020\u00052\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b$\u0010%J-\u0010&\u001a\u00020\u00052\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020\f¢\u0006\u0004\b'\u0010(J-\u0010)\u001a\u00020\f2\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b-\u0010,J\u0015\u0010.\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b.\u0010/JA\u00107\u001a\u0002062\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00102\u001a\u0002002\b\b\u0002\u00103\u001a\u0002002\b\b\u0002\u00104\u001a\u00020\f2\b\b\u0002\u00105\u001a\u000200H\u0007¢\u0006\u0004\b7\u00108J\u007f\u0010:\u001a\u0002062\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00102\u001a\u0002002\b\b\u0002\u00103\u001a\u0002002\b\b\u0002\u00104\u001a\u00020\f2\b\b\u0002\u00105\u001a\u00020028\b\u0004\u00109\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u0002000\u001dH\u0087\bø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\fH\u0016¢\u0006\u0004\b<\u0010(J\u001a\u0010>\u001a\u00020\u00052\b\u0010=\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b>\u0010,J\u000f\u0010?\u001a\u000206H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0001¢\u0006\u0004\bA\u0010\u000eR\u001c\u0010E\u001a\u00020B8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b$\u0010C\u0012\u0004\bD\u0010\u0004R$\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020F8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0006\u0010G\u0012\u0004\bH\u0010\u0004R\u001c\u0010M\u001a\u00020J8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b&\u0010K\u0012\u0004\bL\u0010\u0004R\u001c\u0010P\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b+\u0010N\u0012\u0004\bO\u0010\u0004R\u001c\u0010R\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b-\u0010N\u0012\u0004\bQ\u0010\u0004R\u0011\u0010T\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bS\u0010(R\u0011\u0010V\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bU\u0010(\u0082\u0001\u0001W\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006X"}, d2 = {"Landroidx/collection/n2;", "K", "", "<init>", "()V", "", "b", "()Z", "N", "x", "y", "key", "", "n", "(Ljava/lang/Object;)I", "defaultValue", "r", "(Ljava/lang/Object;I)I", "Lkotlin/Function0;", "s", "(Ljava/lang/Object;Lld/a;)I", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "index", "Lkotlin/k2;", "block", "k", "(Lld/l;)V", "Lkotlin/Function2;", "value", "j", "(Lld/p;)V", "l", "m", "predicate", "a", "(Lld/p;)Z", "c", "g", "()I", "h", "(Lld/p;)I", "d", "(Ljava/lang/Object;)Z", "e", "f", "(I)Z", "", "separator", "prefix", "postfix", "limit", "truncated", "", "E", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "transform", "F", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lld/p;)Ljava/lang/String;", "hashCode", "other", "equals", "toString", "()Ljava/lang/String;", "i", "", "[J", "q", "metadata", "", "[Ljava/lang/Object;", "p", "keys", "", "[I", "u", "values", "I", "v", "_capacity", "w", "_size", "o", "capacity", "t", "size", "Landroidx/collection/g2;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nObjectIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1074:1\n373#1,6:1077\n383#1,3:1084\n386#1,9:1088\n373#1,6:1097\n383#1,3:1104\n386#1,9:1108\n373#1,6:1117\n383#1,3:1124\n386#1,9:1128\n401#1,4:1137\n373#1,6:1141\n383#1,3:1148\n386#1,2:1152\n406#1,2:1154\n389#1,6:1156\n408#1:1162\n401#1,4:1163\n373#1,6:1167\n383#1,3:1174\n386#1,2:1178\n406#1,2:1180\n389#1,6:1182\n408#1:1188\n401#1,4:1189\n373#1,6:1193\n383#1,3:1200\n386#1,2:1204\n406#1,2:1206\n389#1,6:1208\n408#1:1214\n428#1,3:1215\n373#1,6:1218\n383#1,3:1225\n386#1,2:1229\n431#1,2:1231\n389#1,6:1233\n433#1:1239\n401#1,4:1240\n373#1,6:1244\n383#1,3:1251\n386#1,2:1255\n406#1,2:1257\n389#1,6:1259\n408#1:1265\n401#1,4:1266\n373#1,6:1270\n383#1,3:1277\n386#1,2:1281\n406#1,2:1283\n389#1,6:1285\n408#1:1291\n401#1,4:1292\n373#1,6:1296\n383#1,3:1303\n386#1,2:1307\n406#1,2:1309\n389#1,6:1311\n408#1:1317\n401#1,4:1318\n373#1,6:1322\n383#1,3:1329\n386#1,2:1333\n406#1,2:1335\n389#1,6:1337\n408#1:1343\n401#1,4:1344\n373#1,6:1348\n383#1,3:1355\n386#1,2:1359\n406#1,2:1361\n389#1,6:1363\n408#1:1369\n401#1,4:1370\n373#1,6:1374\n383#1,3:1381\n386#1,2:1385\n406#1,2:1387\n389#1,6:1389\n408#1:1395\n537#1,11:1412\n401#1,4:1423\n373#1,6:1427\n383#1,3:1434\n386#1,2:1438\n406#1:1440\n548#1,10:1441\n407#1:1451\n389#1,6:1452\n408#1:1458\n558#1,2:1459\n537#1,11:1461\n401#1,4:1472\n373#1,6:1476\n383#1,3:1483\n386#1,2:1487\n406#1:1489\n548#1,10:1490\n407#1:1500\n389#1,6:1501\n408#1:1507\n558#1,2:1508\n537#1,11:1510\n401#1,4:1521\n373#1,6:1525\n383#1,3:1532\n386#1,2:1536\n406#1:1538\n548#1,10:1539\n407#1:1549\n389#1,6:1550\n408#1:1556\n558#1,2:1557\n537#1,11:1559\n401#1,4:1570\n373#1,6:1574\n383#1,3:1581\n386#1,2:1585\n406#1:1587\n548#1,10:1588\n407#1:1598\n389#1,6:1599\n408#1:1605\n558#1,2:1606\n537#1,11:1608\n401#1,4:1619\n373#1,6:1623\n383#1,3:1630\n386#1,2:1634\n406#1:1636\n548#1,10:1637\n407#1:1647\n389#1,6:1648\n408#1:1654\n558#1,2:1655\n1826#2:1075\n1688#2:1076\n1826#2:1083\n1688#2:1087\n1826#2:1103\n1688#2:1107\n1826#2:1123\n1688#2:1127\n1826#2:1147\n1688#2:1151\n1826#2:1173\n1688#2:1177\n1826#2:1199\n1688#2:1203\n1826#2:1224\n1688#2:1228\n1826#2:1250\n1688#2:1254\n1826#2:1276\n1688#2:1280\n1826#2:1302\n1688#2:1306\n1826#2:1328\n1688#2:1332\n1826#2:1354\n1688#2:1358\n1826#2:1380\n1688#2:1384\n1605#2,3:1396\n1619#2:1399\n1615#2:1400\n1795#2,3:1401\n1809#2,3:1404\n1733#2:1407\n1721#2:1408\n1715#2:1409\n1728#2:1410\n1818#2:1411\n1826#2:1433\n1688#2:1437\n1826#2:1482\n1688#2:1486\n1826#2:1531\n1688#2:1535\n1826#2:1580\n1688#2:1584\n1826#2:1629\n1688#2:1633\n*S KotlinDebug\n*F\n+ 1 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n*L\n404#1:1077,6\n404#1:1084,3\n404#1:1088,9\n417#1:1097,6\n417#1:1104,3\n417#1:1108,9\n430#1:1117,6\n430#1:1124,3\n430#1:1128,9\n439#1:1137,4\n439#1:1141,6\n439#1:1148,3\n439#1:1152,2\n439#1:1154,2\n439#1:1156,6\n439#1:1162\n449#1:1163,4\n449#1:1167,6\n449#1:1174,3\n449#1:1178,2\n449#1:1180,2\n449#1:1182,6\n449#1:1188\n465#1:1189,4\n465#1:1193,6\n465#1:1200,3\n465#1:1204,2\n465#1:1206,2\n465#1:1208,6\n465#1:1214\n488#1:1215,3\n488#1:1218,6\n488#1:1225,3\n488#1:1229,2\n488#1:1231,2\n488#1:1233,6\n488#1:1239\n512#1:1240,4\n512#1:1244,6\n512#1:1251,3\n512#1:1255,2\n512#1:1257,2\n512#1:1259,6\n512#1:1265\n547#1:1266,4\n547#1:1270,6\n547#1:1277,3\n547#1:1281,2\n547#1:1283,2\n547#1:1285,6\n547#1:1291\n547#1:1292,4\n547#1:1296,6\n547#1:1303,3\n547#1:1307,2\n547#1:1309,2\n547#1:1311,6\n547#1:1317\n568#1:1318,4\n568#1:1322,6\n568#1:1329,3\n568#1:1333,2\n568#1:1335,2\n568#1:1337,6\n568#1:1343\n597#1:1344,4\n597#1:1348,6\n597#1:1355,3\n597#1:1359,2\n597#1:1361,2\n597#1:1363,6\n597#1:1369\n619#1:1370,4\n619#1:1374,6\n619#1:1381,3\n619#1:1385,2\n619#1:1387,2\n619#1:1389,6\n619#1:1395\n-1#1:1412,11\n-1#1:1423,4\n-1#1:1427,6\n-1#1:1434,3\n-1#1:1438,2\n-1#1:1440\n-1#1:1441,10\n-1#1:1451\n-1#1:1452,6\n-1#1:1458\n-1#1:1459,2\n-1#1:1461,11\n-1#1:1472,4\n-1#1:1476,6\n-1#1:1483,3\n-1#1:1487,2\n-1#1:1489\n-1#1:1490,10\n-1#1:1500\n-1#1:1501,6\n-1#1:1507\n-1#1:1508,2\n-1#1:1510,11\n-1#1:1521,4\n-1#1:1525,6\n-1#1:1532,3\n-1#1:1536,2\n-1#1:1538\n-1#1:1539,10\n-1#1:1549\n-1#1:1550,6\n-1#1:1556\n-1#1:1557,2\n-1#1:1559,11\n-1#1:1570,4\n-1#1:1574,6\n-1#1:1581,3\n-1#1:1585,2\n-1#1:1587\n-1#1:1588,10\n-1#1:1598\n-1#1:1599,6\n-1#1:1605\n-1#1:1606,2\n-1#1:1608,11\n-1#1:1619,4\n-1#1:1623,6\n-1#1:1630,3\n-1#1:1634,2\n-1#1:1636\n-1#1:1637,10\n-1#1:1647\n-1#1:1648,6\n-1#1:1654\n-1#1:1655,2\n378#1:1075\n385#1:1076\n404#1:1083\n404#1:1087\n417#1:1103\n417#1:1107\n430#1:1123\n430#1:1127\n439#1:1147\n439#1:1151\n449#1:1173\n449#1:1177\n465#1:1199\n465#1:1203\n488#1:1224\n488#1:1228\n512#1:1250\n512#1:1254\n547#1:1276\n547#1:1280\n547#1:1302\n547#1:1306\n568#1:1328\n568#1:1332\n597#1:1354\n597#1:1358\n619#1:1380\n619#1:1384\n638#1:1396,3\n639#1:1399\n642#1:1400\n646#1:1401,3\n647#1:1404,3\n648#1:1407\n649#1:1408\n649#1:1409\n653#1:1410\n656#1:1411\n-1#1:1433\n-1#1:1437\n-1#1:1482\n-1#1:1486\n-1#1:1531\n-1#1:1535\n-1#1:1580\n-1#1:1584\n-1#1:1629\n-1#1:1633\n*E\n"})
/* loaded from: classes.dex */
public abstract class n2<K> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public long[] metadata;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public Object[] keys;

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

    public /* synthetic */ n2(kotlin.jvm.internal.w wVar) {
        this();
    }

    public static /* synthetic */ String L(n2 n2Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, int i5, Object obj) {
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
        return n2Var.E(charSequence, charSequence5, charSequence6, i6, charSequence4);
    }

    public static /* synthetic */ String M(n2 n2Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, ld.p pVar, int i5, Object obj) {
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
        StringBuilder a5 = k.a(charSequence5, "truncated", pVar, "transform", prefix);
        Object[] objArr = n2Var.keys;
        int[] iArr = n2Var.values;
        long[] jArr3 = n2Var.metadata;
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
                            Object obj2 = objArr[i16];
                            int i17 = iArr[i16];
                            if (i11 == i7) {
                                a5.append(charSequence5);
                                break loop0;
                            }
                            if (i11 != 0) {
                                a5.append(separator);
                            }
                            jArr2 = jArr3;
                            a5.append((CharSequence) pVar.invoke(obj2, Integer.valueOf(i17)));
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
        Object[] objArr;
        Object[] objArr2;
        int i4;
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        StringBuilder a5 = l.a(postfix, "postfix", truncated, "truncated", prefix);
        Object[] objArr3 = this.keys;
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
                            Object obj = objArr3[i12];
                            int i13 = iArr[i12];
                            objArr2 = objArr3;
                            if (i6 == limit) {
                                a5.append(truncated);
                                break loop0;
                            }
                            if (i6 != 0) {
                                a5.append(separator);
                            }
                            a5.append(obj);
                            a5.append('=');
                            a5.append(i13);
                            i6++;
                            i4 = 8;
                        } else {
                            objArr2 = objArr3;
                            i4 = i7;
                        }
                        j4 >>= i4;
                        i11++;
                        i7 = i4;
                        objArr3 = objArr2;
                    }
                    objArr = objArr3;
                    if (i10 != i7) {
                        break;
                    }
                } else {
                    objArr = objArr3;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
                objArr3 = objArr;
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
    public final String F(@fg.l CharSequence separator, @fg.l CharSequence prefix, @fg.l CharSequence postfix, int limit, @fg.l CharSequence truncated, @fg.l ld.p<? super K, ? super Integer, ? extends CharSequence> transform) {
        Object[] objArr;
        Object[] objArr2;
        CharSequence separator2 = separator;
        kotlin.jvm.internal.l0.p(separator2, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        kotlin.jvm.internal.l0.p(postfix, "postfix");
        StringBuilder a5 = k.a(truncated, "truncated", transform, "transform", prefix);
        Object[] objArr3 = this.keys;
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
                            Object obj = objArr3[i11];
                            int i12 = iArr[i11];
                            objArr2 = objArr3;
                            if (i5 == limit) {
                                a5.append(truncated);
                                break loop0;
                            }
                            if (i5 != 0) {
                                a5.append(separator2);
                            }
                            a5.append(transform.invoke(obj, Integer.valueOf(i12)));
                            i5++;
                        } else {
                            objArr2 = objArr3;
                        }
                        j4 >>= 8;
                        i10++;
                        separator2 = separator;
                        objArr3 = objArr2;
                    }
                    objArr = objArr3;
                    if (i7 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr3;
                }
                if (i6 == length) {
                    break;
                }
                i4 = i6 + 1;
                separator2 = separator;
                objArr3 = objArr;
            }
        }
        a5.append(postfix);
        String sb = a5.toString();
        kotlin.jvm.internal.l0.o(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }

    @fg.l
    @kd.j
    public final String G(@fg.l CharSequence separator, @fg.l CharSequence prefix, @fg.l CharSequence charSequence, int i4, @fg.l ld.p<? super K, ? super Integer, ? extends CharSequence> pVar) {
        int i5;
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        StringBuilder a5 = k.a(charSequence, "postfix", pVar, "transform", prefix);
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            int i7 = 0;
            loop0: while (true) {
                long j4 = jArr[i6];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8;
                    int i11 = 8 - ((~(i6 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j4 & 255) < 128) {
                            int i13 = (i6 << 3) + i12;
                            Object obj = objArr[i13];
                            int i14 = iArr[i13];
                            if (i7 == i4) {
                                a5.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i7 != 0) {
                                a5.append(separator);
                            }
                            a5.append(pVar.invoke(obj, Integer.valueOf(i14)));
                            i7++;
                            i5 = 8;
                        } else {
                            i5 = i10;
                        }
                        j4 >>= i5;
                        i12++;
                        i10 = i5;
                    }
                    if (i11 != i10) {
                        break;
                    }
                }
                if (i6 == length) {
                    break;
                }
                i6++;
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
    public final String H(@fg.l CharSequence separator, @fg.l CharSequence prefix, @fg.l CharSequence charSequence, @fg.l ld.p<? super K, ? super Integer, ? extends CharSequence> pVar) {
        int i4;
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        StringBuilder a5 = k.a(charSequence, "postfix", pVar, "transform", prefix);
        Object[] objArr = this.keys;
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
                            Object obj = objArr[i12];
                            int i13 = iArr[i12];
                            if (i6 == -1) {
                                a5.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i6 != 0) {
                                a5.append(separator);
                            }
                            a5.append(pVar.invoke(obj, Integer.valueOf(i13)));
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
    public final String I(@fg.l CharSequence separator, @fg.l CharSequence charSequence, @fg.l ld.p<? super K, ? super Integer, ? extends CharSequence> pVar) {
        int i4;
        kotlin.jvm.internal.l0.p(separator, "separator");
        StringBuilder a5 = k.a(charSequence, "prefix", pVar, "transform", charSequence);
        Object[] objArr = this.keys;
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
                            Object obj = objArr[i12];
                            int i13 = iArr[i12];
                            if (i6 == -1) {
                                a5.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i6 != 0) {
                                a5.append(separator);
                            }
                            a5.append(pVar.invoke(obj, Integer.valueOf(i13)));
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
    public final String J(@fg.l CharSequence separator, @fg.l ld.p<? super K, ? super Integer, ? extends CharSequence> transform) {
        int i4;
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(transform, "transform");
        StringBuilder sb = new StringBuilder("");
        Object[] objArr = this.keys;
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
                            Object obj = objArr[i12];
                            int i13 = iArr[i12];
                            if (i6 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i6 != 0) {
                                sb.append(separator);
                            }
                            sb.append(transform.invoke(obj, Integer.valueOf(i13)));
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

    @fg.l
    @kd.j
    public final String K(@fg.l ld.p<? super K, ? super Integer, ? extends CharSequence> transform) {
        int i4;
        kotlin.jvm.internal.l0.p(transform, "transform");
        StringBuilder sb = new StringBuilder("");
        Object[] objArr = this.keys;
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
                            Object obj = objArr[i12];
                            int i13 = iArr[i12];
                            if (i6 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i6 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(transform.invoke(obj, Integer.valueOf(i13)));
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

    public final boolean a(@fg.l ld.p<? super K, ? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        Object[] objArr = this.keys;
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
                        if (!predicate.invoke(objArr[i7], Integer.valueOf(iArr[i7])).booleanValue()) {
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

    public final boolean c(@fg.l ld.p<? super K, ? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        Object[] objArr = this.keys;
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
                            if (predicate.invoke(objArr[i7], Integer.valueOf(iArr[i7])).booleanValue()) {
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

    public final boolean d(K key) {
        return i(key) >= 0;
    }

    public final boolean e(K key) {
        return i(key) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(@fg.m Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) other;
        if (n2Var._size != this._size) {
            return false;
        }
        Object[] objArr = this.keys;
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
                            if (iArr[i7] != n2Var.n(objArr[i7])) {
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

    public final int h(@fg.l ld.p<? super K, ? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        Object[] objArr = this.keys;
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
                            if (predicate.invoke(objArr[i11], Integer.valueOf(iArr[i11])).booleanValue()) {
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
        Object[] objArr = this.keys;
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
                            Object obj = objArr[i11];
                            i6 += Integer.hashCode(iArr[i11]) ^ (obj != null ? obj.hashCode() : 0);
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
    public final int i(K key) {
        int i4 = 0;
        int hashCode = (key != null ? key.hashCode() : 0) * x2.f2466j;
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 & 127;
        int i7 = this._capacity;
        int i10 = i5 >>> 7;
        while (true) {
            int i11 = i10 & i7;
            long[] jArr = this.metadata;
            int i12 = i11 >> 3;
            int i13 = (i11 & 7) << 3;
            long j4 = ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr[i12] >>> i13);
            long j5 = (i6 * x2.f2467k) ^ j4;
            for (long j6 = (~j5) & (j5 - x2.f2467k) & (-9187201950435737472L); j6 != 0; j6 &= j6 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i11) & i7;
                if (kotlin.jvm.internal.l0.g(this.keys[numberOfTrailingZeros], key)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i4 += 8;
            i10 = i11 + i4;
        }
    }

    public final void j(@fg.l ld.p<? super K, ? super Integer, kotlin.k2> block) {
        kotlin.jvm.internal.l0.p(block, "block");
        Object[] objArr = this.keys;
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
                        block.invoke(objArr[i7], Integer.valueOf(iArr[i7]));
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

    public final void l(@fg.l ld.l<? super K, kotlin.k2> block) {
        kotlin.jvm.internal.l0.p(block, "block");
        Object[] objArr = this.keys;
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
                        block.invoke(objArr[(i4 << 3) + i6]);
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

    public final int n(K key) {
        int i4 = i(key);
        if (i4 >= 0) {
            return this.values[i4];
        }
        throw new NoSuchElementException("There is no key " + key + " in the map");
    }

    /* renamed from: o, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    public final int r(K key, int defaultValue) {
        int i4 = i(key);
        return i4 >= 0 ? this.values[i4] : defaultValue;
    }

    public final int s(K key, @fg.l ld.a<Integer> defaultValue) {
        kotlin.jvm.internal.l0.p(defaultValue, "defaultValue");
        int i4 = i(key);
        return i4 >= 0 ? this.values[i4] : defaultValue.invoke().intValue();
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
        Object[] objArr = this.keys;
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
                            Object obj = objArr[i10];
                            int i11 = iArr[i10];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
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

    private n2() {
        this.metadata = x2.f2461e;
        this.keys = m.a.f81462c;
        this.values = o0.b();
    }
}
