package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: ScatterSet.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001cB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u0007J\r\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\u000b\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u0012\u001a\u00028\u00002!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00050\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0012\u0010\u0013JC\u0010\u0014\u001a\u0004\u0018\u00018\u00002!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00050\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0014\u0010\u0013JA\u0010\u0019\u001a\u00020\u00172!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\rH\u0081\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010\u001b\u001a\u00020\u00172!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00170\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001b\u0010\u001aJA\u0010\u001c\u001a\u00020\u00052!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00050\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001c\u0010\u001dJA\u0010\u001e\u001a\u00020\u00052!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00050\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001f\u0010 JA\u0010!\u001a\u00020\u00152!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00050\rH\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b#\u0010$JY\u0010-\u001a\u00020,2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020%2\b\b\u0002\u0010)\u001a\u00020\u00152\b\b\u0002\u0010*\u001a\u00020%2\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020%\u0018\u00010\rH\u0007¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0015H\u0016¢\u0006\u0004\b/\u0010 J\u001a\u00101\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b1\u0010$J\u000f\u00102\u001a\u00020,H\u0016¢\u0006\u0004\b2\u00103J\u0018\u00104\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b4\u00105J\u0013\u00107\u001a\b\u0012\u0004\u0012\u00028\u000006¢\u0006\u0004\b7\u00108R\u001c\u0010<\u001a\u0002098\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u001c\u0010:\u0012\u0004\b;\u0010\u0004R$\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020=8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0006\u0010>\u0012\u0004\b?\u0010\u0004R\u0016\u0010B\u001a\u00020\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010AR\u0016\u0010C\u001a\u00020\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b7\u0010AR\u0011\u0010E\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\bD\u0010 R\u0011\u0010G\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\bF\u0010 \u0082\u0001\u0001H\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006I"}, d2 = {"Landroidx/collection/y2;", "E", "", "<init>", "()V", "", "b", "()Z", "B", "r", "s", "i", "()Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "element", "predicate", "j", "(Lld/l;)Ljava/lang/Object;", "k", "", "index", "Lkotlin/k2;", "block", "m", "(Lld/l;)V", "l", "a", "(Lld/l;)Z", "c", "f", "()I", "g", "(Lld/l;)I", "e", "(Ljava/lang/Object;)Z", "", "separator", "prefix", "postfix", "limit", "truncated", "transform", "", "z", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lld/l;)Ljava/lang/String;", "hashCode", "other", "equals", "toString", "()Ljava/lang/String;", "h", "(Ljava/lang/Object;)I", "", "d", "()Ljava/util/Set;", "", "[J", "p", "metadata", "", "[Ljava/lang/Object;", "o", "elements", "I", "_capacity", "_size", "n", "capacity", "q", "size", "Landroidx/collection/k2;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1100:1\n267#1,4:1101\n237#1,7:1105\n248#1,3:1113\n251#1,2:1117\n272#1,2:1119\n254#1,6:1121\n274#1:1127\n267#1,4:1128\n237#1,7:1132\n248#1,3:1140\n251#1,2:1144\n272#1,2:1146\n254#1,6:1148\n274#1:1154\n267#1,4:1155\n237#1,7:1159\n248#1,3:1167\n251#1,2:1171\n272#1,2:1173\n254#1,6:1175\n274#1:1181\n237#1,7:1184\n248#1,3:1192\n251#1,9:1196\n267#1,4:1205\n237#1,7:1209\n248#1,3:1217\n251#1,2:1221\n272#1,2:1223\n254#1,6:1225\n274#1:1231\n267#1,4:1232\n237#1,7:1236\n248#1,3:1244\n251#1,2:1248\n272#1,2:1250\n254#1,6:1252\n274#1:1258\n267#1,4:1259\n237#1,7:1263\n248#1,3:1271\n251#1,2:1275\n272#1,2:1277\n254#1,6:1279\n274#1:1285\n433#1:1286\n434#1:1290\n436#1,2:1292\n438#1,3:1295\n441#1:1301\n442#1:1305\n443#1:1307\n444#1,4:1310\n450#1:1315\n451#1,8:1317\n267#1,4:1325\n237#1,7:1329\n248#1,3:1337\n251#1,2:1341\n272#1,2:1343\n254#1,6:1345\n274#1:1351\n267#1,4:1352\n237#1,7:1356\n248#1,3:1364\n251#1,2:1368\n272#1,2:1370\n254#1,6:1372\n274#1:1378\n267#1,4:1379\n237#1,7:1383\n248#1,3:1391\n251#1,2:1395\n272#1,2:1397\n254#1,6:1399\n274#1:1405\n1826#2:1112\n1688#2:1116\n1826#2:1139\n1688#2:1143\n1826#2:1166\n1688#2:1170\n1826#2:1182\n1688#2:1183\n1826#2:1191\n1688#2:1195\n1826#2:1216\n1688#2:1220\n1826#2:1243\n1688#2:1247\n1826#2:1270\n1688#2:1274\n1605#2,3:1287\n1619#2:1291\n1615#2:1294\n1795#2,3:1298\n1809#2,3:1302\n1733#2:1306\n1721#2:1308\n1715#2:1309\n1728#2:1314\n1818#2:1316\n1826#2:1336\n1688#2:1340\n1826#2:1363\n1688#2:1367\n1826#2:1390\n1688#2:1394\n1605#2,3:1406\n1619#2:1409\n1615#2:1410\n1795#2,3:1411\n1809#2,3:1414\n1733#2:1417\n1721#2:1418\n1715#2:1419\n1728#2:1420\n1818#2:1421\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n201#1:1101,4\n201#1:1105,7\n201#1:1113,3\n201#1:1117,2\n201#1:1119,2\n201#1:1121,6\n201#1:1127\n214#1:1128,4\n214#1:1132,7\n214#1:1140,3\n214#1:1144,2\n214#1:1146,2\n214#1:1148,6\n214#1:1154\n227#1:1155,4\n227#1:1159,7\n227#1:1167,3\n227#1:1171,2\n227#1:1173,2\n227#1:1175,6\n227#1:1181\n270#1:1184,7\n270#1:1192,3\n270#1:1196,9\n284#1:1205,4\n284#1:1209,7\n284#1:1217,3\n284#1:1221,2\n284#1:1223,2\n284#1:1225,6\n284#1:1231\n297#1:1232,4\n297#1:1236,7\n297#1:1244,3\n297#1:1248,2\n297#1:1250,2\n297#1:1252,6\n297#1:1258\n318#1:1259,4\n318#1:1263,7\n318#1:1271,3\n318#1:1275,2\n318#1:1277,2\n318#1:1279,6\n318#1:1285\n329#1:1286\n329#1:1290\n329#1:1292,2\n329#1:1295,3\n329#1:1301\n329#1:1305\n329#1:1307\n329#1:1310,4\n329#1:1315\n329#1:1317,8\n352#1:1325,4\n352#1:1329,7\n352#1:1337,3\n352#1:1341,2\n352#1:1343,2\n352#1:1345,6\n352#1:1351\n378#1:1352,4\n378#1:1356,7\n378#1:1364,3\n378#1:1368,2\n378#1:1370,2\n378#1:1372,6\n378#1:1378\n407#1:1379,4\n407#1:1383,7\n407#1:1391,3\n407#1:1395,2\n407#1:1397,2\n407#1:1399,6\n407#1:1405\n201#1:1112\n201#1:1116\n214#1:1139\n214#1:1143\n227#1:1166\n227#1:1170\n243#1:1182\n250#1:1183\n270#1:1191\n270#1:1195\n284#1:1216\n284#1:1220\n297#1:1243\n297#1:1247\n318#1:1270\n318#1:1274\n329#1:1287,3\n329#1:1291\n329#1:1294\n329#1:1298,3\n329#1:1302,3\n329#1:1306\n329#1:1308\n329#1:1309\n329#1:1314\n329#1:1316\n352#1:1336\n352#1:1340\n378#1:1363\n378#1:1367\n407#1:1390\n407#1:1394\n433#1:1406,3\n434#1:1409\n437#1:1410\n440#1:1411,3\n441#1:1414,3\n442#1:1417\n443#1:1418\n443#1:1419\n447#1:1420\n450#1:1421\n*E\n"})
/* loaded from: classes.dex */
public abstract class y2<E> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public long[] metadata;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public Object[] elements;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public int _capacity;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public int _size;

    /* compiled from: ScatterSet.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0090\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/collection/y2$a;", "", "<init>", "(Landroidx/collection/y2;)V", "", "elements", "", "containsAll", "(Ljava/util/Collection;)Z", "element", "contains", "(Ljava/lang/Object;)Z", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "b", "()I", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1100:1\n1855#2,2:1101\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper\n*L\n478#1:1101,2\n*E\n"})
    public class a implements Set<E>, md.a {

        /* compiled from: ScatterSet.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.collection.ScatterSet$SetWrapper$iterator$1", f = "ScatterSet.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {495}, m = "invokeSuspend", n = {"$this$iterator", "k$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlin/sequences/o;", "Lkotlin/k2;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper$iterator$1\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1100:1\n267#2,4:1101\n237#2,7:1105\n248#2,3:1113\n251#2,2:1117\n272#2,2:1119\n254#2,6:1121\n274#2:1127\n1826#3:1112\n1688#3:1116\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper$iterator$1\n*L\n494#1:1101,4\n494#1:1105,7\n494#1:1113,3\n494#1:1117,2\n494#1:1119,2\n494#1:1121,6\n494#1:1127\n494#1:1112\n494#1:1116\n*E\n"})
        /* renamed from: androidx.collection.y2$a$a, reason: collision with other inner class name */
        static final class C0038a extends kotlin.coroutines.jvm.internal.k implements ld.p<kotlin.sequences.o<? super E>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: c, reason: collision with root package name */
            Object f2476c;

            /* renamed from: d, reason: collision with root package name */
            Object f2477d;

            /* renamed from: e, reason: collision with root package name */
            int f2478e;

            /* renamed from: f, reason: collision with root package name */
            int f2479f;

            /* renamed from: g, reason: collision with root package name */
            int f2480g;

            /* renamed from: h, reason: collision with root package name */
            int f2481h;

            /* renamed from: i, reason: collision with root package name */
            long f2482i;

            /* renamed from: j, reason: collision with root package name */
            int f2483j;

            /* renamed from: k, reason: collision with root package name */
            private /* synthetic */ Object f2484k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ y2<E> f2485l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0038a(y2<E> y2Var, kotlin.coroutines.d<? super C0038a> dVar) {
                super(2, dVar);
                this.f2485l = y2Var;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l kotlin.sequences.o<? super E> oVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((C0038a) create(oVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                C0038a c0038a = new C0038a(this.f2485l, dVar);
                c0038a.f2484k = obj;
                return c0038a;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0066  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x008a -> B:5:0x008d). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:15:0x0096). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0053 -> B:6:0x0064). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006d -> B:5:0x008d). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r21) {
                /*
                    r20 = this;
                    r0 = r20
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f2483j
                    r3 = 0
                    r4 = 8
                    r5 = 1
                    if (r2 == 0) goto L30
                    if (r2 != r5) goto L28
                    int r2 = r0.f2481h
                    int r6 = r0.f2480g
                    long r7 = r0.f2482i
                    int r9 = r0.f2479f
                    int r10 = r0.f2478e
                    java.lang.Object r11 = r0.f2477d
                    long[] r11 = (long[]) r11
                    java.lang.Object r12 = r0.f2476c
                    java.lang.Object[] r12 = (java.lang.Object[]) r12
                    java.lang.Object r13 = r0.f2484k
                    kotlin.sequences.o r13 = (kotlin.sequences.o) r13
                    kotlin.a1.n(r21)
                    goto L8d
                L28:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L30:
                    kotlin.a1.n(r21)
                    java.lang.Object r2 = r0.f2484k
                    kotlin.sequences.o r2 = (kotlin.sequences.o) r2
                    androidx.collection.y2<E> r6 = r0.f2485l
                    java.lang.Object[] r7 = r6.elements
                    long[] r6 = r6.metadata
                    int r8 = r6.length
                    int r8 = r8 + (-2)
                    if (r8 < 0) goto L9b
                    r9 = r3
                L43:
                    r10 = r6[r9]
                    long r12 = ~r10
                    r14 = 7
                    long r12 = r12 << r14
                    long r12 = r12 & r10
                    r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r12 = r12 & r14
                    int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                    if (r12 == 0) goto L96
                    int r12 = r9 - r8
                    int r12 = ~r12
                    int r12 = r12 >>> 31
                    int r12 = 8 - r12
                    r13 = r2
                    r2 = r3
                    r18 = r10
                    r11 = r6
                    r10 = r8
                    r6 = r12
                    r12 = r7
                    r7 = r18
                L64:
                    if (r2 >= r6) goto L90
                    r14 = 255(0xff, double:1.26E-321)
                    long r14 = r14 & r7
                    r16 = 128(0x80, double:6.3E-322)
                    int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                    if (r14 >= 0) goto L8d
                    int r14 = r9 << 3
                    int r14 = r14 + r2
                    r14 = r12[r14]
                    r0.f2484k = r13
                    r0.f2476c = r12
                    r0.f2477d = r11
                    r0.f2478e = r10
                    r0.f2479f = r9
                    r0.f2482i = r7
                    r0.f2480g = r6
                    r0.f2481h = r2
                    r0.f2483j = r5
                    java.lang.Object r14 = r13.b(r14, r0)
                    if (r14 != r1) goto L8d
                    return r1
                L8d:
                    long r7 = r7 >> r4
                    int r2 = r2 + r5
                    goto L64
                L90:
                    if (r6 != r4) goto L9b
                    r8 = r10
                    r6 = r11
                    r7 = r12
                    r2 = r13
                L96:
                    if (r9 == r8) goto L9b
                    int r9 = r9 + 1
                    goto L43
                L9b:
                    kotlin.k2 r1 = kotlin.k2.f75408a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.collection.y2.a.C0038a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(E e4) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public int b() {
            return y2.this._size;
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object element) {
            return y2.this.e(element);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(@fg.l Collection<? extends Object> elements) {
            kotlin.jvm.internal.l0.p(elements, "elements");
            y2<E> y2Var = y2.this;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!y2Var.e(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return y2.this.r();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        @fg.l
        public Iterator<E> iterator() {
            return kotlin.sequences.p.a(new C0038a(y2.this, null));
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public final /* bridge */ int size() {
            return b();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return kotlin.jvm.internal.v.a(this);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] array) {
            kotlin.jvm.internal.l0.p(array, "array");
            return (T[]) kotlin.jvm.internal.v.b(this, array);
        }
    }

    /* compiled from: ScatterSet.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "element", "", "a", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<E, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y2<E> f2486b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y2<E> y2Var) {
            super(1);
            this.f2486b = y2Var;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(E e4) {
            return e4 == this.f2486b ? "(this)" : String.valueOf(e4);
        }
    }

    public /* synthetic */ y2(kotlin.jvm.internal.w wVar) {
        this();
    }

    public static /* synthetic */ String A(y2 y2Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, ld.l lVar, int i5, Object obj) {
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
        CharSequence charSequence7 = charSequence4;
        if ((i5 & 32) != 0) {
            lVar = null;
        }
        return y2Var.z(charSequence, charSequence5, charSequence6, i6, charSequence7, lVar);
    }

    @kotlin.w0
    public static /* synthetic */ void o() {
    }

    @kotlin.w0
    public static /* synthetic */ void p() {
    }

    public final boolean B() {
        return this._size == 0;
    }

    public final boolean a(@fg.l ld.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        Object[] objArr = this.elements;
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
                    if ((255 & j4) < 128 && !predicate.invoke(objArr[(i4 << 3) + i6]).booleanValue()) {
                        return false;
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

    public final boolean c(@fg.l ld.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr[i4];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j4) < 128 && predicate.invoke(objArr[(i4 << 3) + i6]).booleanValue()) {
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

    @fg.l
    public final Set<E> d() {
        return new a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(E r18) {
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
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.y2.e(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(@fg.m Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) other;
        if (y2Var._size != this._size) {
            return false;
        }
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr[i4];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j4) < 128 && !y2Var.e(objArr[(i4 << 3) + i6])) {
                            return false;
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

    @androidx.annotation.g0(from = 0)
    /* renamed from: f, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    @androidx.annotation.g0(from = 0)
    public final int g(@fg.l ld.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        Object[] objArr = this.elements;
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
                        if ((255 & j4) < 128 && predicate.invoke(objArr[(i5 << 3) + i10]).booleanValue()) {
                            i6++;
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

    public final int h(E element) {
        int i4 = 0;
        int hashCode = (element != null ? element.hashCode() : 0) * x2.f2466j;
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
                if (kotlin.jvm.internal.l0.g(this.elements[numberOfTrailingZeros], element)) {
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

    public int hashCode() {
        Object[] objArr = this.elements;
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
                            Object obj = objArr[(i5 << 3) + i10];
                            i6 += obj != null ? obj.hashCode() : 0;
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

    public final E i() {
        Object[] objArr = this.elements;
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
                            return (E) objArr[(i4 << 3) + i6];
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
        throw new NoSuchElementException("The ScatterSet is empty");
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [E, java.lang.Object] */
    public final E j(@fg.l ld.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        Object[] objArr = this.elements;
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
                            ?? r10 = (Object) objArr[(i4 << 3) + i6];
                            if (predicate.invoke(r10).booleanValue()) {
                                return r10;
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
        throw new NoSuchElementException("Could not find a match");
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [E, java.lang.Object] */
    @fg.m
    public final E k(@fg.l ld.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        int i4 = 0;
        while (true) {
            long j4 = jArr[i4];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i4 - length)) >>> 31);
                for (int i6 = 0; i6 < i5; i6++) {
                    if ((255 & j4) < 128) {
                        ?? r10 = (Object) objArr[(i4 << 3) + i6];
                        if (predicate.invoke(r10).booleanValue()) {
                            return r10;
                        }
                    }
                    j4 >>= 8;
                }
                if (i5 != 8) {
                    return null;
                }
            }
            if (i4 == length) {
                return null;
            }
            i4++;
        }
    }

    public final void l(@fg.l ld.l<? super E, kotlin.k2> block) {
        kotlin.jvm.internal.l0.p(block, "block");
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

    @kotlin.w0
    public final void m(@fg.l ld.l<? super Integer, kotlin.k2> block) {
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

    @androidx.annotation.g0(from = 0)
    /* renamed from: n, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    @androidx.annotation.g0(from = 0)
    public final int q() {
        return this._size;
    }

    public final boolean r() {
        return this._size == 0;
    }

    public final boolean s() {
        return this._size != 0;
    }

    @fg.l
    @kd.j
    public final String t() {
        return A(this, null, null, null, 0, null, null, 63, null);
    }

    @fg.l
    public String toString() {
        return A(this, null, "[", "]", 0, null, new b(this), 25, null);
    }

    @fg.l
    @kd.j
    public final String u(@fg.l CharSequence separator) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        return A(this, separator, null, null, 0, null, null, 62, null);
    }

    @fg.l
    @kd.j
    public final String v(@fg.l CharSequence separator, @fg.l CharSequence prefix) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        return A(this, separator, prefix, null, 0, null, null, 60, null);
    }

    @fg.l
    @kd.j
    public final String w(@fg.l CharSequence separator, @fg.l CharSequence prefix, @fg.l CharSequence postfix) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        kotlin.jvm.internal.l0.p(postfix, "postfix");
        return A(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    @fg.l
    @kd.j
    public final String x(@fg.l CharSequence separator, @fg.l CharSequence prefix, @fg.l CharSequence postfix, int i4) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        kotlin.jvm.internal.l0.p(postfix, "postfix");
        return A(this, separator, prefix, postfix, i4, null, null, 48, null);
    }

    @fg.l
    @kd.j
    public final String y(@fg.l CharSequence separator, @fg.l CharSequence prefix, @fg.l CharSequence postfix, int i4, @fg.l CharSequence truncated) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        kotlin.jvm.internal.l0.p(postfix, "postfix");
        kotlin.jvm.internal.l0.p(truncated, "truncated");
        return A(this, separator, prefix, postfix, i4, truncated, null, 32, null);
    }

    @fg.l
    @kd.j
    public final String z(@fg.l CharSequence separator, @fg.l CharSequence prefix, @fg.l CharSequence postfix, int limit, @fg.l CharSequence truncated, @fg.m ld.l<? super E, ? extends CharSequence> transform) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        StringBuilder a5 = l.a(postfix, "postfix", truncated, "truncated", prefix);
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            loop0: while (true) {
                long j4 = jArr[i4];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8;
                    int i7 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i10 = 0; i10 < i7; i10++) {
                        if ((j4 & 255) < 128) {
                            Object obj = objArr[(i4 << 3) + i10];
                            if (i5 == limit) {
                                a5.append(truncated);
                                break loop0;
                            }
                            if (i5 != 0) {
                                a5.append(separator);
                            }
                            if (transform == null) {
                                a5.append(obj);
                            } else {
                                a5.append(transform.invoke(obj));
                            }
                            i5++;
                            i6 = 8;
                        }
                        j4 >>= i6;
                    }
                    if (i7 != i6) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                }
                i4++;
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

    private y2() {
        this.metadata = x2.f2461e;
        this.elements = m.a.f81462c;
    }
}
