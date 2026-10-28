package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: ScatterMap.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001aB\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0007J\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\rJ \u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0082\b¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00028\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJU\u0010#\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00028\u000028\u0010\"\u001a4\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u001a\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00028\u00010\u001fH\u0086\bø\u0001\u0000¢\u0006\u0004\b#\u0010$J \u0010%\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0001¢\u0006\u0004\b'\u0010(J)\u0010,\u001a\u00020\b2\u001a\u0010+\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*0)¢\u0006\u0004\b,\u0010-J'\u0010/\u001a\u00020\b2\u0018\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*0.¢\u0006\u0004\b/\u00100J'\u00102\u001a\u00020\b2\u0018\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*01¢\u0006\u0004\b2\u00103J!\u00106\u001a\u00020\b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000104¢\u0006\u0004\b6\u00107J!\u00108\u001a\u00020\b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b8\u00109J$\u0010;\u001a\u00020\b2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*H\u0086\n¢\u0006\u0004\b;\u0010<J,\u0010=\u001a\u00020\b2\u001a\u0010+\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*0)H\u0086\n¢\u0006\u0004\b=\u0010-J*\u0010>\u001a\u00020\b2\u0018\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*0.H\u0086\n¢\u0006\u0004\b>\u00100J*\u0010?\u001a\u00020\b2\u0018\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*01H\u0086\n¢\u0006\u0004\b?\u00103J$\u0010@\u001a\u00020\b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000104H\u0086\n¢\u0006\u0004\b@\u00107J$\u0010A\u001a\u00020\b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0086\n¢\u0006\u0004\bA\u00109J\u0017\u0010B\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\bB\u0010CJ\u001d\u0010E\u001a\u00020D2\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0001¢\u0006\u0004\bE\u0010FJ-\u0010H\u001a\u00020\b2\u0018\u0010G\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020D0\u001fH\u0086\bø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\u0018\u0010\u0002\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\u0002\u0010JJ \u0010L\u001a\u00020\b2\u000e\u0010K\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000)H\u0086\n¢\u0006\u0004\bL\u0010MJ\u001e\u0010N\u001a\u00020\b2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000.H\u0086\n¢\u0006\u0004\bN\u00100J\u001e\u0010O\u001a\u00020\b2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0086\n¢\u0006\u0004\bO\u00103J\u001e\u0010Q\u001a\u00020\b2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000PH\u0086\n¢\u0006\u0004\bQ\u0010RJ\u001e\u0010T\u001a\u00020\b2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000SH\u0086\n¢\u0006\u0004\bT\u0010UJ\u0019\u0010V\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0015\u001a\u00020\u0004H\u0001¢\u0006\u0004\bV\u0010WJ\r\u0010\u0001\u001a\u00020\b¢\u0006\u0004\b\u0001\u0010\rJ\u0017\u0010X\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u0000H\u0001¢\u0006\u0004\bX\u0010YJ\r\u0010Z\u001a\u00020\u0004¢\u0006\u0004\bZ\u0010[J\u0019\u0010]\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\\¢\u0006\u0004\b]\u0010^R\u0016\u0010`\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006b"}, d2 = {"Landroidx/collection/j2;", "K", "V", "Landroidx/collection/w2;", "", "initialCapacity", "<init>", "(I)V", "Lkotlin/k2;", "R", "capacity", "Q", "P", "()V", "hash1", "M", "(I)I", "I", "newCapacity", "p0", "m0", "index", "", "value", "s0", "(IJ)V", "key", "Lkotlin/Function0;", "defaultValue", "O", "(Ljava/lang/Object;Lld/a;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "computeBlock", "L", "(Ljava/lang/Object;Lld/p;)Ljava/lang/Object;", "q0", "(Ljava/lang/Object;Ljava/lang/Object;)V", "e0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lkotlin/q0;", "pairs", "j0", "([Lkotlin/q0;)V", "", "g0", "(Ljava/lang/Iterable;)V", "Lkotlin/sequences/m;", "i0", "(Lkotlin/sequences/m;)V", "", "from", "h0", "(Ljava/util/Map;)V", "f0", "(Landroidx/collection/w2;)V", "pair", "b0", "(Lkotlin/q0;)V", "d0", "Z", "c0", "a0", "Y", "k0", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "l0", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "predicate", "n0", "(Lld/p;)V", "(Ljava/lang/Object;)V", "keys", "X", "([Ljava/lang/Object;)V", "U", "W", "Landroidx/collection/y2;", "T", "(Landroidx/collection/y2;)V", "Landroidx/collection/p2;", "S", "(Landroidx/collection/p2;)V", "o0", "(I)Ljava/lang/Object;", "N", "(Ljava/lang/Object;)I", "r0", "()I", "", "J", "()Ljava/util/Map;", "f", "growthLimit", "a", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 7 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1850:1\n1284#1,2:2019\n1288#1,5:2027\n1284#1,2:2058\n1288#1,5:2066\n1284#1,2:2083\n1288#1,5:2091\n1284#1,2:2097\n1288#1,5:2105\n1#2:1851\n1672#3,6:1852\n1826#3:1870\n1688#3:1874\n1605#3,3:1887\n1619#3:1891\n1615#3:1894\n1795#3,3:1899\n1809#3,3:1903\n1733#3:1907\n1721#3:1909\n1715#3:1910\n1728#3:1915\n1818#3:1917\n1605#3,3:1927\n1619#3:1931\n1615#3:1934\n1795#3,3:1939\n1809#3,3:1943\n1733#3:1947\n1721#3:1949\n1715#3:1950\n1728#3:1955\n1818#3:1957\n1826#3:1972\n1688#3:1976\n1826#3:1997\n1688#3:2001\n1672#3,6:2021\n1672#3,6:2032\n1605#3,3:2038\n1615#3:2041\n1619#3:2042\n1795#3,3:2043\n1809#3,3:2046\n1733#3:2049\n1721#3:2050\n1715#3:2051\n1728#3:2052\n1818#3:2053\n1682#3:2054\n1661#3:2055\n1680#3:2056\n1661#3:2057\n1672#3,6:2060\n1795#3,3:2071\n1826#3:2074\n1715#3:2075\n1685#3:2076\n1661#3:2077\n1605#3,3:2078\n1615#3:2081\n1619#3:2082\n1672#3,6:2085\n1661#3:2096\n1672#3,6:2099\n1672#3,6:2110\n1672#3,6:2116\n215#4,2:1858\n391#5,4:1860\n363#5,6:1864\n373#5,3:1871\n376#5,2:1875\n396#5,2:1877\n379#5,6:1879\n398#5:1885\n633#5:1886\n634#5:1890\n636#5,2:1892\n638#5,4:1895\n642#5:1902\n643#5:1906\n644#5:1908\n645#5,4:1911\n651#5:1916\n652#5,8:1918\n633#5:1926\n634#5:1930\n636#5,2:1932\n638#5,4:1935\n642#5:1942\n643#5:1946\n644#5:1948\n645#5,4:1951\n651#5:1956\n652#5,8:1958\n363#5,6:1966\n373#5,3:1973\n376#5,9:1977\n267#6,4:1986\n237#6,7:1990\n248#6,3:1998\n251#6,2:2002\n272#6,2:2004\n254#6,6:2006\n274#6:2012\n305#7,6:2013\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n*L\n1113#1:2019,2\n1113#1:2027,5\n1180#1:2058,2\n1180#1:2066,5\n1254#1:2083,2\n1254#1:2091,5\n1270#1:2097,2\n1270#1:2105,5\n848#1:1852,6\n972#1:1870\n972#1:1874\n1021#1:1887,3\n1021#1:1891\n1021#1:1894\n1021#1:1899,3\n1021#1:1903,3\n1021#1:1907\n1021#1:1909\n1021#1:1910\n1021#1:1915\n1021#1:1917\n1033#1:1927,3\n1033#1:1931\n1033#1:1934\n1033#1:1939,3\n1033#1:1943,3\n1033#1:1947\n1033#1:1949\n1033#1:1950\n1033#1:1955\n1033#1:1957\n1047#1:1972\n1047#1:1976\n1093#1:1997\n1093#1:2001\n1113#1:2021,6\n1129#1:2032,6\n1145#1:2038,3\n1146#1:2041\n1147#1:2042\n1154#1:2043,3\n1155#1:2046,3\n1156#1:2049\n1157#1:2050\n1157#1:2051\n1161#1:2052\n1164#1:2053\n1173#1:2054\n1173#1:2055\n1179#1:2056\n1179#1:2057\n1180#1:2060,6\n1195#1:2071,3\n1196#1:2074\n1198#1:2075\n1249#1:2076\n1249#1:2077\n1251#1:2078,3\n1252#1:2081\n1254#1:2082\n1254#1:2085,6\n1268#1:2096\n1270#1:2099,6\n1285#1:2110,6\n1291#1:2116,6\n963#1:1858,2\n972#1:1860,4\n972#1:1864,6\n972#1:1871,3\n972#1:1875,2\n972#1:1877,2\n972#1:1879,6\n972#1:1885\n1021#1:1886\n1021#1:1890\n1021#1:1892,2\n1021#1:1895,4\n1021#1:1902\n1021#1:1906\n1021#1:1908\n1021#1:1911,4\n1021#1:1916\n1021#1:1918,8\n1033#1:1926\n1033#1:1930\n1033#1:1932,2\n1033#1:1935,4\n1033#1:1942\n1033#1:1946\n1033#1:1948\n1033#1:1951,4\n1033#1:1956\n1033#1:1958,8\n1047#1:1966,6\n1047#1:1973,3\n1047#1:1977,9\n1093#1:1986,4\n1093#1:1990,7\n1093#1:1998,3\n1093#1:2002,2\n1093#1:2004,2\n1093#1:2006,6\n1093#1:2012\n1102#1:2013,6\n*E\n"})
/* loaded from: classes.dex */
public final class j2<K, V> extends w2<K, V> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    /* compiled from: ScatterMap.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00120\u0001R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\u00020\u00062\u0014\u0010\r\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/collection/j2$a;", "Landroidx/collection/w2$a;", "Landroidx/collection/w2;", "", "<init>", "(Landroidx/collection/j2;)V", "Lkotlin/k2;", "clear", "()V", "key", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "putAll", "(Ljava/util/Map;)V", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "b", "()Ljava/util/Set;", "entries", "c", "keys", "", "e", "()Ljava/util/Collection;", "values", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1850:1\n215#2,2:1851\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper\n*L\n1590#1:1851,2\n*E\n"})
    private final class a extends w2<K, V>.a implements Map<K, V>, md.g {

        /* compiled from: ScatterMap.kt */
        @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0010#\n\u0002\u0010'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000e\u001a\u00020\u00032\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0011\u001a\u00020\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0013\u001a\u00020\u00032\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J)\u0010\u0015\u001a\u00020\u00032\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ)\u0010\u0016\u001a\u00020\u00032\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ#\u0010\u0017\u001a\u00020\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0012R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"androidx/collection/j2$a$a", "", "", "", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "Lkotlin/k2;", "clear", "()V", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "element", "c", "(Ljava/util/Map$Entry;)Z", "addAll", "b", "retainAll", "removeAll", "h", "", "f", "()I", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlin.jvm.internal.r1({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1850:1\n1726#2,3:1851\n363#3,6:1854\n373#3,3:1861\n376#3,9:1865\n363#3,6:1874\n373#3,3:1881\n376#3,9:1885\n633#3:1894\n634#3:1898\n636#3,2:1900\n638#3,4:1903\n642#3:1910\n643#3:1914\n644#3:1916\n645#3,4:1919\n651#3:1924\n652#3,8:1926\n1826#4:1860\n1688#4:1864\n1826#4:1880\n1688#4:1884\n1605#4,3:1895\n1619#4:1899\n1615#4:1902\n1795#4,3:1907\n1809#4,3:1911\n1733#4:1915\n1721#4:1917\n1715#4:1918\n1728#4:1923\n1818#4:1925\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1\n*L\n1358#1:1851,3\n1376#1:1854,6\n1376#1:1861,3\n1376#1:1865,9\n1398#1:1874,6\n1398#1:1881,3\n1398#1:1885,9\n1413#1:1894\n1413#1:1898\n1413#1:1900,2\n1413#1:1903,4\n1413#1:1910\n1413#1:1914\n1413#1:1916\n1413#1:1919,4\n1413#1:1924\n1413#1:1926,8\n1376#1:1860\n1376#1:1864\n1398#1:1880\n1398#1:1884\n1413#1:1895,3\n1413#1:1899\n1413#1:1902\n1413#1:1907,3\n1413#1:1911,3\n1413#1:1915\n1413#1:1917\n1413#1:1918\n1413#1:1923\n1413#1:1925\n*E\n"})
        /* renamed from: androidx.collection.j2$a$a, reason: collision with other inner class name */
        public static final class C0025a implements Set<Map.Entry<K, V>>, md.h {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j2<K, V> f2265b;

            /* compiled from: ScatterMap.kt */
            @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR4\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0018\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\f\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"androidx/collection/j2$a$a$a", "", "", "", "hasNext", "()Z", "d", "()Ljava/util/Map$Entry;", "Lkotlin/k2;", "remove", "()V", "", "b", "Ljava/util/Iterator;", "c", "()Ljava/util/Iterator;", "f", "(Ljava/util/Iterator;)V", "iterator", "", "I", "()I", "e", "(I)V", "current", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.collection.j2$a$a$a, reason: collision with other inner class name */
            public static final class C0026a implements Iterator<Map.Entry<K, V>>, md.d {

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                @fg.l
                private Iterator<? extends Map.Entry<K, V>> iterator;

                /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                private int current = -1;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ j2<K, V> f2268d;

                /* compiled from: ScatterMap.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1328}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
                @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"K", "V", "Lkotlin/sequences/o;", "", "Lkotlin/k2;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 8, 0})
                @kotlin.jvm.internal.r1({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1850:1\n363#2,6:1851\n373#2,3:1858\n376#2,9:1862\n1826#3:1857\n1688#3:1861\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1\n*L\n1326#1:1851,6\n1326#1:1858,3\n1326#1:1862,9\n1326#1:1857\n1326#1:1861\n*E\n"})
                /* renamed from: androidx.collection.j2$a$a$a$a, reason: collision with other inner class name */
                static final class C0027a extends kotlin.coroutines.jvm.internal.k implements ld.p<kotlin.sequences.o<? super Map.Entry<K, V>>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                    /* renamed from: c, reason: collision with root package name */
                    Object f2269c;

                    /* renamed from: d, reason: collision with root package name */
                    Object f2270d;

                    /* renamed from: e, reason: collision with root package name */
                    Object f2271e;

                    /* renamed from: f, reason: collision with root package name */
                    int f2272f;

                    /* renamed from: g, reason: collision with root package name */
                    int f2273g;

                    /* renamed from: h, reason: collision with root package name */
                    int f2274h;

                    /* renamed from: i, reason: collision with root package name */
                    int f2275i;

                    /* renamed from: j, reason: collision with root package name */
                    long f2276j;

                    /* renamed from: k, reason: collision with root package name */
                    int f2277k;

                    /* renamed from: l, reason: collision with root package name */
                    private /* synthetic */ Object f2278l;

                    /* renamed from: m, reason: collision with root package name */
                    final /* synthetic */ j2<K, V> f2279m;

                    /* renamed from: n, reason: collision with root package name */
                    final /* synthetic */ C0026a f2280n;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0027a(j2<K, V> j2Var, C0026a c0026a, kotlin.coroutines.d<? super C0027a> dVar) {
                        super(2, dVar);
                        this.f2279m = j2Var;
                        this.f2280n = c0026a;
                    }

                    @Override // ld.p
                    @fg.m
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(@fg.l kotlin.sequences.o<? super Map.Entry<K, V>> oVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                        return ((C0027a) create(oVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.l
                    public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                        C0027a c0027a = new C0027a(this.f2279m, this.f2280n, dVar);
                        c0027a.f2278l = obj;
                        return c0027a;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x00b0  */
                    /* JADX WARN: Removed duplicated region for block: B:19:0x00c0  */
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0070  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x00a5 -> B:5:0x00a8). Please report as a decompilation issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00ab -> B:6:0x00ac). Please report as a decompilation issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0058 -> B:7:0x006e). Please report as a decompilation issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00bd -> B:18:0x00be). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r23) {
                        /*
                            Method dump skipped, instructions count: 199
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.j2.a.C0025a.C0026a.C0027a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                C0026a(j2<K, V> j2Var) {
                    this.f2268d = j2Var;
                    this.iterator = kotlin.sequences.p.a(new C0027a(j2Var, this, null));
                }

                /* renamed from: b, reason: from getter */
                public final int getCurrent() {
                    return this.current;
                }

                @fg.l
                public final Iterator<Map.Entry<K, V>> c() {
                    return this.iterator;
                }

                @Override // java.util.Iterator
                @fg.l
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, V> next() {
                    return this.iterator.next();
                }

                public final void e(int i4) {
                    this.current = i4;
                }

                public final void f(@fg.l Iterator<? extends Map.Entry<K, V>> it) {
                    kotlin.jvm.internal.l0.p(it, "<set-?>");
                    this.iterator = it;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.iterator.hasNext();
                }

                @Override // java.util.Iterator
                public void remove() {
                    int i4 = this.current;
                    if (i4 != -1) {
                        this.f2268d.o0(i4);
                        this.current = -1;
                    }
                }
            }

            C0025a(j2<K, V> j2Var) {
                this.f2265b = j2Var;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean addAll(@fg.l Collection<? extends Map.Entry<K, V>> elements) {
                kotlin.jvm.internal.l0.p(elements, "elements");
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Set, java.util.Collection
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public boolean add(@fg.l Map.Entry<K, V> element) {
                kotlin.jvm.internal.l0.p(element, "element");
                throw new UnsupportedOperationException();
            }

            public boolean c(@fg.l Map.Entry<K, V> element) {
                kotlin.jvm.internal.l0.p(element, "element");
                return kotlin.jvm.internal.l0.g(this.f2265b.p(element.getKey()), element.getValue());
            }

            @Override // java.util.Set, java.util.Collection
            public void clear() {
                this.f2265b.K();
            }

            @Override // java.util.Set, java.util.Collection
            public final /* bridge */ boolean contains(Object obj) {
                if (kotlin.jvm.internal.u1.I(obj)) {
                    return c((Map.Entry) obj);
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Set, java.util.Collection
            public boolean containsAll(@fg.l Collection<? extends Object> elements) {
                kotlin.jvm.internal.l0.p(elements, "elements");
                Collection<? extends Object> collection = elements;
                j2<K, V> j2Var = this.f2265b;
                if (collection.isEmpty()) {
                    return true;
                }
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!kotlin.jvm.internal.l0.g(j2Var.p(entry.getKey()), entry.getValue())) {
                        return false;
                    }
                }
                return true;
            }

            public int f() {
                return this.f2265b._size;
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
            
                if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
            
                r15 = -1;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean h(@fg.l java.util.Map.Entry<K, V> r20) {
                /*
                    r19 = this;
                    r0 = r19
                    java.lang.String r1 = "element"
                    r2 = r20
                    kotlin.jvm.internal.l0.p(r2, r1)
                    androidx.collection.j2<K, V> r1 = r0.f2265b
                    java.lang.Object r3 = r20.getKey()
                    if (r3 == 0) goto L16
                    int r5 = r3.hashCode()
                    goto L17
                L16:
                    r5 = 0
                L17:
                    r6 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
                    int r5 = r5 * r6
                    int r6 = r5 << 16
                    r5 = r5 ^ r6
                    r6 = r5 & 127(0x7f, float:1.78E-43)
                    int r7 = r1._capacity
                    int r5 = r5 >>> 7
                    r5 = r5 & r7
                    r8 = 0
                L26:
                    long[] r9 = r1.metadata
                    int r10 = r5 >> 3
                    r11 = r5 & 7
                    int r11 = r11 << 3
                    r12 = r9[r10]
                    long r12 = r12 >>> r11
                    r14 = 1
                    int r10 = r10 + r14
                    r15 = r9[r10]
                    int r9 = 64 - r11
                    long r9 = r15 << r9
                    long r14 = (long) r11
                    long r14 = -r14
                    r11 = 63
                    long r14 = r14 >> r11
                    long r9 = r9 & r14
                    long r9 = r9 | r12
                    long r11 = (long) r6
                    r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
                    long r11 = r11 * r13
                    long r11 = r11 ^ r9
                    long r13 = r11 - r13
                    long r11 = ~r11
                    long r11 = r11 & r13
                    r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r11 = r11 & r13
                L52:
                    r17 = 0
                    int r15 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
                    if (r15 == 0) goto L72
                    int r15 = java.lang.Long.numberOfTrailingZeros(r11)
                    int r15 = r15 >> 3
                    int r15 = r15 + r5
                    r15 = r15 & r7
                    java.lang.Object[] r4 = r1.keys
                    r4 = r4[r15]
                    boolean r4 = kotlin.jvm.internal.l0.g(r4, r3)
                    if (r4 == 0) goto L6b
                    goto L7c
                L6b:
                    r17 = 1
                    long r17 = r11 - r17
                    long r11 = r11 & r17
                    goto L52
                L72:
                    long r11 = ~r9
                    r4 = 6
                    long r11 = r11 << r4
                    long r9 = r9 & r11
                    long r9 = r9 & r13
                    int r4 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
                    if (r4 == 0) goto L97
                    r15 = -1
                L7c:
                    if (r15 < 0) goto L95
                    androidx.collection.j2<K, V> r1 = r0.f2265b
                    java.lang.Object[] r1 = r1.values
                    r1 = r1[r15]
                    java.lang.Object r2 = r20.getValue()
                    boolean r1 = kotlin.jvm.internal.l0.g(r1, r2)
                    if (r1 == 0) goto L95
                    androidx.collection.j2<K, V> r1 = r0.f2265b
                    r1.o0(r15)
                    r1 = 1
                    return r1
                L95:
                    r4 = 0
                    return r4
                L97:
                    r4 = 0
                    int r8 = r8 + 8
                    int r5 = r5 + r8
                    r5 = r5 & r7
                    goto L26
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.collection.j2.a.C0025a.h(java.util.Map$Entry):boolean");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean isEmpty() {
                return this.f2265b.x();
            }

            @Override // java.util.Set, java.util.Collection, java.lang.Iterable
            @fg.l
            public Iterator<Map.Entry<K, V>> iterator() {
                return new C0026a(this.f2265b);
            }

            @Override // java.util.Set, java.util.Collection
            public final /* bridge */ boolean remove(Object obj) {
                if (kotlin.jvm.internal.u1.I(obj)) {
                    return h((Map.Entry) obj);
                }
                return false;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean removeAll(@fg.l Collection<? extends Object> elements) {
                boolean z4;
                int i4;
                kotlin.jvm.internal.l0.p(elements, "elements");
                j2<K, V> j2Var = this.f2265b;
                long[] jArr = j2Var.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    boolean z5 = false;
                    while (true) {
                        long j4 = jArr[i5];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8;
                            int i7 = 8 - ((~(i5 - length)) >>> 31);
                            int i10 = 0;
                            while (i10 < i7) {
                                if ((255 & j4) < 128) {
                                    int i11 = (i5 << 3) + i10;
                                    Iterator<? extends Object> it = elements.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Map.Entry entry = (Map.Entry) it.next();
                                        if (kotlin.jvm.internal.l0.g(entry.getKey(), j2Var.keys[i11]) && kotlin.jvm.internal.l0.g(entry.getValue(), j2Var.values[i11])) {
                                            j2Var.o0(i11);
                                            z5 = true;
                                            break;
                                        }
                                    }
                                    i4 = 8;
                                } else {
                                    i4 = i6;
                                }
                                j4 >>= i4;
                                i10++;
                                i6 = i4;
                            }
                            if (i7 != i6) {
                                return z5;
                            }
                        }
                        if (i5 == length) {
                            z4 = z5;
                            break;
                        }
                        i5++;
                    }
                } else {
                    z4 = false;
                }
                return z4;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean retainAll(@fg.l Collection<? extends Object> elements) {
                boolean z4;
                int i4;
                kotlin.jvm.internal.l0.p(elements, "elements");
                j2<K, V> j2Var = this.f2265b;
                long[] jArr = j2Var.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    boolean z5 = false;
                    while (true) {
                        long j4 = jArr[i5];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8;
                            int i7 = 8 - ((~(i5 - length)) >>> 31);
                            int i10 = 0;
                            while (i10 < i7) {
                                if ((255 & j4) < 128) {
                                    int i11 = (i5 << 3) + i10;
                                    Iterator<? extends Object> it = elements.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            j2Var.o0(i11);
                                            z5 = true;
                                            break;
                                        }
                                        Map.Entry entry = (Map.Entry) it.next();
                                        if (kotlin.jvm.internal.l0.g(entry.getKey(), j2Var.keys[i11]) && kotlin.jvm.internal.l0.g(entry.getValue(), j2Var.values[i11])) {
                                            break;
                                        }
                                    }
                                    i4 = 8;
                                } else {
                                    i4 = i6;
                                }
                                j4 >>= i4;
                                i10++;
                                i6 = i4;
                            }
                            if (i7 != i6) {
                                return z5;
                            }
                        }
                        if (i5 == length) {
                            z4 = z5;
                            break;
                        }
                        i5++;
                    }
                } else {
                    z4 = false;
                }
                return z4;
            }

            @Override // java.util.Set, java.util.Collection
            public final int size() {
                return this.f2265b._size;
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

        /* compiled from: ScatterMap.kt */
        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"androidx/collection/j2$a$b", "", "", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "Lkotlin/k2;", "clear", "()V", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "element", "add", "(Ljava/lang/Object;)Z", "retainAll", "removeAll", "remove", "containsAll", "contains", "", "b", "()I", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlin.jvm.internal.r1({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$keys$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1850:1\n363#2,6:1851\n373#2,3:1858\n376#2,9:1862\n363#2,6:1871\n373#2,3:1878\n376#2,9:1882\n633#2:1891\n634#2:1895\n636#2,2:1897\n638#2,4:1900\n642#2:1907\n643#2:1911\n644#2:1913\n645#2,4:1916\n651#2:1921\n652#2,8:1923\n1826#3:1857\n1688#3:1861\n1826#3:1877\n1688#3:1881\n1605#3,3:1892\n1619#3:1896\n1615#3:1899\n1795#3,3:1904\n1809#3,3:1908\n1733#3:1912\n1721#3:1914\n1715#3:1915\n1728#3:1920\n1818#3:1922\n1726#4,3:1931\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$keys$1\n*L\n1466#1:1851,6\n1466#1:1858,3\n1466#1:1862,9\n1477#1:1871,6\n1477#1:1878,3\n1477#1:1882,9\n1487#1:1891\n1487#1:1895\n1487#1:1897,2\n1487#1:1900,4\n1487#1:1907\n1487#1:1911\n1487#1:1913\n1487#1:1916,4\n1487#1:1921\n1487#1:1923,8\n1466#1:1857\n1466#1:1861\n1477#1:1877\n1477#1:1881\n1487#1:1892,3\n1487#1:1896\n1487#1:1899\n1487#1:1904,3\n1487#1:1908,3\n1487#1:1912\n1487#1:1914\n1487#1:1915\n1487#1:1920\n1487#1:1922\n1496#1:1931,3\n*E\n"})
        public static final class b implements Set<K>, md.h {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j2<K, V> f2281b;

            /* compiled from: ScatterMap.kt */
            @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"androidx/collection/j2$a$b$a", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "Lkotlin/k2;", "remove", "()V", "", "", "b", "Ljava/util/Iterator;", "iterator", "c", "I", "current", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.collection.j2$a$b$a, reason: collision with other inner class name */
            public static final class C0028a implements Iterator<K>, md.d {

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                @fg.l
                private final Iterator<Integer> iterator;

                /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                private int current = -1;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ j2<K, V> f2284d;

                /* compiled from: ScatterMap.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1431}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3"})
                @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"K", "V", "Lkotlin/sequences/o;", "", "Lkotlin/k2;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 8, 0})
                @kotlin.jvm.internal.r1({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1850:1\n363#2,6:1851\n373#2,3:1858\n376#2,9:1862\n1826#3:1857\n1688#3:1861\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1\n*L\n1430#1:1851,6\n1430#1:1858,3\n1430#1:1862,9\n1430#1:1857\n1430#1:1861\n*E\n"})
                /* renamed from: androidx.collection.j2$a$b$a$a, reason: collision with other inner class name */
                static final class C0029a extends kotlin.coroutines.jvm.internal.k implements ld.p<kotlin.sequences.o<? super Integer>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                    /* renamed from: c, reason: collision with root package name */
                    Object f2285c;

                    /* renamed from: d, reason: collision with root package name */
                    int f2286d;

                    /* renamed from: e, reason: collision with root package name */
                    int f2287e;

                    /* renamed from: f, reason: collision with root package name */
                    int f2288f;

                    /* renamed from: g, reason: collision with root package name */
                    int f2289g;

                    /* renamed from: h, reason: collision with root package name */
                    long f2290h;

                    /* renamed from: i, reason: collision with root package name */
                    int f2291i;

                    /* renamed from: j, reason: collision with root package name */
                    private /* synthetic */ Object f2292j;

                    /* renamed from: k, reason: collision with root package name */
                    final /* synthetic */ j2<K, V> f2293k;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0029a(j2<K, V> j2Var, kotlin.coroutines.d<? super C0029a> dVar) {
                        super(2, dVar);
                        this.f2293k = j2Var;
                    }

                    @Override // ld.p
                    @fg.m
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(@fg.l kotlin.sequences.o<? super Integer> oVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                        return ((C0029a) create(oVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.l
                    public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                        C0029a c0029a = new C0029a(this.f2293k, dVar);
                        c0029a.f2292j = obj;
                        return c0029a;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
                    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
                    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0063  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0088 -> B:5:0x008b). Please report as a decompilation issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004b -> B:15:0x0094). Please report as a decompilation issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004d -> B:6:0x0061). Please report as a decompilation issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006a -> B:5:0x008b). Please report as a decompilation issue!!! */
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
                            int r2 = r0.f2291i
                            r3 = 0
                            r4 = 8
                            r5 = 1
                            if (r2 == 0) goto L2c
                            if (r2 != r5) goto L24
                            int r2 = r0.f2289g
                            int r6 = r0.f2288f
                            long r7 = r0.f2290h
                            int r9 = r0.f2287e
                            int r10 = r0.f2286d
                            java.lang.Object r11 = r0.f2285c
                            long[] r11 = (long[]) r11
                            java.lang.Object r12 = r0.f2292j
                            kotlin.sequences.o r12 = (kotlin.sequences.o) r12
                            kotlin.a1.n(r21)
                            goto L8b
                        L24:
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                            r1.<init>(r2)
                            throw r1
                        L2c:
                            kotlin.a1.n(r21)
                            java.lang.Object r2 = r0.f2292j
                            kotlin.sequences.o r2 = (kotlin.sequences.o) r2
                            androidx.collection.j2<K, V> r6 = r0.f2293k
                            long[] r6 = r6.metadata
                            int r7 = r6.length
                            int r7 = r7 + (-2)
                            if (r7 < 0) goto L99
                            r8 = r3
                        L3d:
                            r9 = r6[r8]
                            long r11 = ~r9
                            r13 = 7
                            long r11 = r11 << r13
                            long r11 = r11 & r9
                            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                            long r11 = r11 & r13
                            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                            if (r11 == 0) goto L94
                            int r11 = r8 - r7
                            int r11 = ~r11
                            int r11 = r11 >>> 31
                            int r11 = 8 - r11
                            r12 = r2
                            r2 = r3
                            r17 = r11
                            r11 = r6
                            r6 = r17
                            r18 = r9
                            r10 = r7
                            r9 = r8
                            r7 = r18
                        L61:
                            if (r2 >= r6) goto L8e
                            r13 = 255(0xff, double:1.26E-321)
                            long r13 = r13 & r7
                            r15 = 128(0x80, double:6.3E-322)
                            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                            if (r13 >= 0) goto L8b
                            int r13 = r9 << 3
                            int r13 = r13 + r2
                            java.lang.Integer r14 = new java.lang.Integer
                            r14.<init>(r13)
                            r0.f2292j = r12
                            r0.f2285c = r11
                            r0.f2286d = r10
                            r0.f2287e = r9
                            r0.f2290h = r7
                            r0.f2288f = r6
                            r0.f2289g = r2
                            r0.f2291i = r5
                            java.lang.Object r13 = r12.b(r14, r0)
                            if (r13 != r1) goto L8b
                            return r1
                        L8b:
                            long r7 = r7 >> r4
                            int r2 = r2 + r5
                            goto L61
                        L8e:
                            if (r6 != r4) goto L99
                            r8 = r9
                            r7 = r10
                            r6 = r11
                            r2 = r12
                        L94:
                            if (r8 == r7) goto L99
                            int r8 = r8 + 1
                            goto L3d
                        L99:
                            kotlin.k2 r1 = kotlin.k2.f75408a
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.j2.a.b.C0028a.C0029a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                C0028a(j2<K, V> j2Var) {
                    this.f2284d = j2Var;
                    this.iterator = kotlin.sequences.p.a(new C0029a(j2Var, null));
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.iterator.hasNext();
                }

                @Override // java.util.Iterator
                public K next() {
                    int intValue = this.iterator.next().intValue();
                    this.current = intValue;
                    return (K) this.f2284d.keys[intValue];
                }

                @Override // java.util.Iterator
                public void remove() {
                    int i4 = this.current;
                    if (i4 >= 0) {
                        this.f2284d.o0(i4);
                        this.current = -1;
                    }
                }
            }

            b(j2<K, V> j2Var) {
                this.f2281b = j2Var;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean add(K element) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean addAll(@fg.l Collection<? extends K> elements) {
                kotlin.jvm.internal.l0.p(elements, "elements");
                throw new UnsupportedOperationException();
            }

            public int b() {
                return this.f2281b._size;
            }

            @Override // java.util.Set, java.util.Collection
            public void clear() {
                this.f2281b.K();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean contains(Object element) {
                return this.f2281b.g(element);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Set, java.util.Collection
            public boolean containsAll(@fg.l Collection<? extends Object> elements) {
                kotlin.jvm.internal.l0.p(elements, "elements");
                Collection<? extends Object> collection = elements;
                j2<K, V> j2Var = this.f2281b;
                if (collection.isEmpty()) {
                    return true;
                }
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    if (!j2Var.g(it.next())) {
                        return false;
                    }
                }
                return true;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean isEmpty() {
                return this.f2281b.x();
            }

            @Override // java.util.Set, java.util.Collection, java.lang.Iterable
            @fg.l
            public Iterator<K> iterator() {
                return new C0028a(this.f2281b);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
            
                if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
            
                r12 = -1;
             */
            @Override // java.util.Set, java.util.Collection
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean remove(java.lang.Object r19) {
                /*
                    r18 = this;
                    r0 = r18
                    r1 = r19
                    androidx.collection.j2<K, V> r2 = r0.f2281b
                    if (r1 == 0) goto Ld
                    int r4 = r19.hashCode()
                    goto Le
                Ld:
                    r4 = 0
                Le:
                    r5 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
                    int r4 = r4 * r5
                    int r5 = r4 << 16
                    r4 = r4 ^ r5
                    r5 = r4 & 127(0x7f, float:1.78E-43)
                    int r6 = r2._capacity
                    int r4 = r4 >>> 7
                    r4 = r4 & r6
                    r7 = 0
                L1d:
                    long[] r8 = r2.metadata
                    int r9 = r4 >> 3
                    r10 = r4 & 7
                    int r10 = r10 << 3
                    r11 = r8[r9]
                    long r11 = r11 >>> r10
                    r13 = 1
                    int r9 = r9 + r13
                    r14 = r8[r9]
                    int r8 = 64 - r10
                    long r8 = r14 << r8
                    long r14 = (long) r10
                    long r14 = -r14
                    r10 = 63
                    long r14 = r14 >> r10
                    long r8 = r8 & r14
                    long r8 = r8 | r11
                    long r10 = (long) r5
                    r14 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
                    long r10 = r10 * r14
                    long r10 = r10 ^ r8
                    long r14 = r10 - r14
                    long r10 = ~r10
                    long r10 = r10 & r14
                    r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r10 = r10 & r14
                L49:
                    r16 = 0
                    int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
                    if (r12 == 0) goto L69
                    int r12 = java.lang.Long.numberOfTrailingZeros(r10)
                    int r12 = r12 >> 3
                    int r12 = r12 + r4
                    r12 = r12 & r6
                    java.lang.Object[] r3 = r2.keys
                    r3 = r3[r12]
                    boolean r3 = kotlin.jvm.internal.l0.g(r3, r1)
                    if (r3 == 0) goto L62
                    goto L73
                L62:
                    r16 = 1
                    long r16 = r10 - r16
                    long r10 = r10 & r16
                    goto L49
                L69:
                    long r10 = ~r8
                    r3 = 6
                    long r10 = r10 << r3
                    long r8 = r8 & r10
                    long r8 = r8 & r14
                    int r3 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
                    if (r3 == 0) goto L7d
                    r12 = -1
                L73:
                    if (r12 < 0) goto L7b
                    androidx.collection.j2<K, V> r1 = r0.f2281b
                    r1.o0(r12)
                    return r13
                L7b:
                    r3 = 0
                    return r3
                L7d:
                    r3 = 0
                    int r7 = r7 + 8
                    int r4 = r4 + r7
                    r4 = r4 & r6
                    goto L1d
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.collection.j2.a.b.remove(java.lang.Object):boolean");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean removeAll(@fg.l Collection<? extends Object> elements) {
                kotlin.jvm.internal.l0.p(elements, "elements");
                j2<K, V> j2Var = this.f2281b;
                long[] jArr = j2Var.metadata;
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
                                    if (kotlin.collections.w.W1(elements, j2Var.keys[i7])) {
                                        j2Var.o0(i7);
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

            @Override // java.util.Set, java.util.Collection
            public boolean retainAll(@fg.l Collection<? extends Object> elements) {
                kotlin.jvm.internal.l0.p(elements, "elements");
                j2<K, V> j2Var = this.f2281b;
                long[] jArr = j2Var.metadata;
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
                                    if (!kotlin.collections.w.W1(elements, j2Var.keys[i7])) {
                                        j2Var.o0(i7);
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

            @Override // java.util.Set, java.util.Collection
            public final int size() {
                return this.f2281b._size;
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

        /* compiled from: ScatterMap.kt */
        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"androidx/collection/j2$a$c", "", "", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "Lkotlin/k2;", "clear", "()V", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "element", "add", "(Ljava/lang/Object;)Z", "retainAll", "removeAll", "remove", "containsAll", "contains", "", "b", "()I", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlin.jvm.internal.r1({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1850:1\n363#2,6:1851\n373#2,3:1858\n376#2,9:1862\n363#2,6:1871\n373#2,3:1878\n376#2,9:1882\n363#2,6:1891\n373#2,3:1898\n376#2,9:1902\n1826#3:1857\n1688#3:1861\n1826#3:1877\n1688#3:1881\n1826#3:1897\n1688#3:1901\n1726#4,3:1911\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1\n*L\n1546#1:1851,6\n1546#1:1858,3\n1546#1:1862,9\n1557#1:1871,6\n1557#1:1878,3\n1557#1:1882,9\n1567#1:1891,6\n1567#1:1898,3\n1567#1:1902,9\n1546#1:1857\n1546#1:1861\n1557#1:1877\n1557#1:1881\n1567#1:1897\n1567#1:1901\n1577#1:1911,3\n*E\n"})
        public static final class c implements Collection<V>, md.b {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j2<K, V> f2294b;

            /* compiled from: ScatterMap.kt */
            @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"androidx/collection/j2$a$c$a", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "Lkotlin/k2;", "remove", "()V", "", "", "b", "Ljava/util/Iterator;", "iterator", "c", "I", "current", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.collection.j2$a$c$a, reason: collision with other inner class name */
            public static final class C0030a implements Iterator<V>, md.d {

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                @fg.l
                private final Iterator<Integer> iterator;

                /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                private int current = -1;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ j2<K, V> f2297d;

                /* compiled from: ScatterMap.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1511}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3"})
                @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"K", "V", "Lkotlin/sequences/o;", "", "Lkotlin/k2;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 8, 0})
                @kotlin.jvm.internal.r1({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1850:1\n363#2,6:1851\n373#2,3:1858\n376#2,9:1862\n1826#3:1857\n1688#3:1861\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1\n*L\n1510#1:1851,6\n1510#1:1858,3\n1510#1:1862,9\n1510#1:1857\n1510#1:1861\n*E\n"})
                /* renamed from: androidx.collection.j2$a$c$a$a, reason: collision with other inner class name */
                static final class C0031a extends kotlin.coroutines.jvm.internal.k implements ld.p<kotlin.sequences.o<? super Integer>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                    /* renamed from: c, reason: collision with root package name */
                    Object f2298c;

                    /* renamed from: d, reason: collision with root package name */
                    int f2299d;

                    /* renamed from: e, reason: collision with root package name */
                    int f2300e;

                    /* renamed from: f, reason: collision with root package name */
                    int f2301f;

                    /* renamed from: g, reason: collision with root package name */
                    int f2302g;

                    /* renamed from: h, reason: collision with root package name */
                    long f2303h;

                    /* renamed from: i, reason: collision with root package name */
                    int f2304i;

                    /* renamed from: j, reason: collision with root package name */
                    private /* synthetic */ Object f2305j;

                    /* renamed from: k, reason: collision with root package name */
                    final /* synthetic */ j2<K, V> f2306k;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0031a(j2<K, V> j2Var, kotlin.coroutines.d<? super C0031a> dVar) {
                        super(2, dVar);
                        this.f2306k = j2Var;
                    }

                    @Override // ld.p
                    @fg.m
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(@fg.l kotlin.sequences.o<? super Integer> oVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                        return ((C0031a) create(oVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.l
                    public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                        C0031a c0031a = new C0031a(this.f2306k, dVar);
                        c0031a.f2305j = obj;
                        return c0031a;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
                    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
                    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0063  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0088 -> B:5:0x008b). Please report as a decompilation issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004b -> B:15:0x0094). Please report as a decompilation issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004d -> B:6:0x0061). Please report as a decompilation issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006a -> B:5:0x008b). Please report as a decompilation issue!!! */
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
                            int r2 = r0.f2304i
                            r3 = 0
                            r4 = 8
                            r5 = 1
                            if (r2 == 0) goto L2c
                            if (r2 != r5) goto L24
                            int r2 = r0.f2302g
                            int r6 = r0.f2301f
                            long r7 = r0.f2303h
                            int r9 = r0.f2300e
                            int r10 = r0.f2299d
                            java.lang.Object r11 = r0.f2298c
                            long[] r11 = (long[]) r11
                            java.lang.Object r12 = r0.f2305j
                            kotlin.sequences.o r12 = (kotlin.sequences.o) r12
                            kotlin.a1.n(r21)
                            goto L8b
                        L24:
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                            r1.<init>(r2)
                            throw r1
                        L2c:
                            kotlin.a1.n(r21)
                            java.lang.Object r2 = r0.f2305j
                            kotlin.sequences.o r2 = (kotlin.sequences.o) r2
                            androidx.collection.j2<K, V> r6 = r0.f2306k
                            long[] r6 = r6.metadata
                            int r7 = r6.length
                            int r7 = r7 + (-2)
                            if (r7 < 0) goto L99
                            r8 = r3
                        L3d:
                            r9 = r6[r8]
                            long r11 = ~r9
                            r13 = 7
                            long r11 = r11 << r13
                            long r11 = r11 & r9
                            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                            long r11 = r11 & r13
                            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                            if (r11 == 0) goto L94
                            int r11 = r8 - r7
                            int r11 = ~r11
                            int r11 = r11 >>> 31
                            int r11 = 8 - r11
                            r12 = r2
                            r2 = r3
                            r17 = r11
                            r11 = r6
                            r6 = r17
                            r18 = r9
                            r10 = r7
                            r9 = r8
                            r7 = r18
                        L61:
                            if (r2 >= r6) goto L8e
                            r13 = 255(0xff, double:1.26E-321)
                            long r13 = r13 & r7
                            r15 = 128(0x80, double:6.3E-322)
                            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                            if (r13 >= 0) goto L8b
                            int r13 = r9 << 3
                            int r13 = r13 + r2
                            java.lang.Integer r14 = new java.lang.Integer
                            r14.<init>(r13)
                            r0.f2305j = r12
                            r0.f2298c = r11
                            r0.f2299d = r10
                            r0.f2300e = r9
                            r0.f2303h = r7
                            r0.f2301f = r6
                            r0.f2302g = r2
                            r0.f2304i = r5
                            java.lang.Object r13 = r12.b(r14, r0)
                            if (r13 != r1) goto L8b
                            return r1
                        L8b:
                            long r7 = r7 >> r4
                            int r2 = r2 + r5
                            goto L61
                        L8e:
                            if (r6 != r4) goto L99
                            r8 = r9
                            r7 = r10
                            r6 = r11
                            r2 = r12
                        L94:
                            if (r8 == r7) goto L99
                            int r8 = r8 + 1
                            goto L3d
                        L99:
                            kotlin.k2 r1 = kotlin.k2.f75408a
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.j2.a.c.C0030a.C0031a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                C0030a(j2<K, V> j2Var) {
                    this.f2297d = j2Var;
                    this.iterator = kotlin.sequences.p.a(new C0031a(j2Var, null));
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.iterator.hasNext();
                }

                @Override // java.util.Iterator
                public V next() {
                    int intValue = this.iterator.next().intValue();
                    this.current = intValue;
                    return (V) this.f2297d.values[intValue];
                }

                @Override // java.util.Iterator
                public void remove() {
                    int i4 = this.current;
                    if (i4 >= 0) {
                        this.f2297d.o0(i4);
                        this.current = -1;
                    }
                }
            }

            c(j2<K, V> j2Var) {
                this.f2294b = j2Var;
            }

            @Override // java.util.Collection
            public boolean add(V element) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Collection
            public boolean addAll(@fg.l Collection<? extends V> elements) {
                kotlin.jvm.internal.l0.p(elements, "elements");
                throw new UnsupportedOperationException();
            }

            public int b() {
                return this.f2294b._size;
            }

            @Override // java.util.Collection
            public void clear() {
                this.f2294b.K();
            }

            @Override // java.util.Collection
            public boolean contains(Object element) {
                return this.f2294b.h(element);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Collection
            public boolean containsAll(@fg.l Collection<? extends Object> elements) {
                kotlin.jvm.internal.l0.p(elements, "elements");
                Collection<? extends Object> collection = elements;
                j2<K, V> j2Var = this.f2294b;
                if (collection.isEmpty()) {
                    return true;
                }
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    if (!j2Var.h(it.next())) {
                        return false;
                    }
                }
                return true;
            }

            @Override // java.util.Collection
            public boolean isEmpty() {
                return this.f2294b.x();
            }

            @Override // java.util.Collection, java.lang.Iterable
            @fg.l
            public Iterator<V> iterator() {
                return new C0030a(this.f2294b);
            }

            @Override // java.util.Collection
            public boolean remove(Object element) {
                j2<K, V> j2Var = this.f2294b;
                long[] jArr = j2Var.metadata;
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
                                    if (kotlin.jvm.internal.l0.g(j2Var.values[i7], element)) {
                                        j2Var.o0(i7);
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

            @Override // java.util.Collection
            public boolean removeAll(@fg.l Collection<? extends Object> elements) {
                kotlin.jvm.internal.l0.p(elements, "elements");
                j2<K, V> j2Var = this.f2294b;
                long[] jArr = j2Var.metadata;
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
                                    if (kotlin.collections.w.W1(elements, j2Var.values[i7])) {
                                        j2Var.o0(i7);
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

            @Override // java.util.Collection
            public boolean retainAll(@fg.l Collection<? extends Object> elements) {
                kotlin.jvm.internal.l0.p(elements, "elements");
                j2<K, V> j2Var = this.f2294b;
                long[] jArr = j2Var.metadata;
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
                                    if (!kotlin.collections.w.W1(elements, j2Var.values[i7])) {
                                        j2Var.o0(i7);
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

            @Override // java.util.Collection
            public final int size() {
                return this.f2294b._size;
            }

            @Override // java.util.Collection
            public Object[] toArray() {
                return kotlin.jvm.internal.v.a(this);
            }

            @Override // java.util.Collection
            public <T> T[] toArray(T[] array) {
                kotlin.jvm.internal.l0.p(array, "array");
                return (T[]) kotlin.jvm.internal.v.b(this, array);
            }
        }

        public a() {
            super();
        }

        @Override // androidx.collection.w2.a
        @fg.l
        public Set<Map.Entry<K, V>> b() {
            return new C0025a(j2.this);
        }

        @Override // androidx.collection.w2.a
        @fg.l
        public Set<K> c() {
            return new b(j2.this);
        }

        @Override // androidx.collection.w2.a, java.util.Map
        public void clear() {
            j2.this.K();
        }

        @Override // androidx.collection.w2.a
        @fg.l
        public Collection<V> e() {
            return new c(j2.this);
        }

        @Override // androidx.collection.w2.a, java.util.Map
        @fg.m
        public V put(K key, V value) {
            return j2.this.e0(key, value);
        }

        @Override // androidx.collection.w2.a, java.util.Map
        public void putAll(@fg.l Map<? extends K, ? extends V> from) {
            kotlin.jvm.internal.l0.p(from, "from");
            for (Map.Entry<? extends K, ? extends V> entry : from.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }

        @Override // androidx.collection.w2.a, java.util.Map
        @fg.m
        public V remove(Object key) {
            return j2.this.k0(key);
        }
    }

    public j2() {
        this(0, 1, null);
    }

    private final void I() {
        int compare;
        if (this._capacity > 8) {
            compare = Long.compare((kotlin.a2.h(this._size) * 32) ^ Long.MIN_VALUE, (this._capacity * 25) ^ Long.MIN_VALUE);
            if (compare <= 0) {
                p0(this._capacity);
                return;
            }
        }
        p0(x2.w(this._capacity));
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

    private final void P() {
        this.growthLimit = x2.o(this._capacity) - this._size;
    }

    private final void Q(int capacity) {
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
        P();
    }

    private final void R(int initialCapacity) {
        int max = initialCapacity > 0 ? Math.max(7, x2.x(initialCapacity)) : 0;
        this._capacity = max;
        Q(max);
        this.keys = new Object[max];
        this.values = new Object[max];
    }

    private final void m0() {
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

    private final void p0(int newCapacity) {
        int i4;
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i5 = this._capacity;
        R(newCapacity);
        Object[] objArr3 = this.keys;
        Object[] objArr4 = this.values;
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
                jArr2[i14] = (jArr2[i14] & (~(255 << i15))) | (j4 << i15);
                objArr3[M] = obj;
                objArr4[M] = objArr2[i4];
            } else {
                i4 = i6;
            }
            i6 = i4 + 1;
        }
    }

    private final void s0(int index, long value) {
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

    @fg.l
    public final Map<K, V> J() {
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
        kotlin.collections.l.M1(this.values, null, 0, this._capacity);
        kotlin.collections.l.M1(this.keys, null, 0, this._capacity);
        P();
    }

    public final V L(K key, @fg.l ld.p<? super K, ? super V, ? extends V> computeBlock) {
        kotlin.jvm.internal.l0.p(computeBlock, "computeBlock");
        int N = N(key);
        boolean z4 = N < 0;
        V invoke = computeBlock.invoke(key, z4 ? null : this.values[N]);
        if (z4) {
            int i4 = ~N;
            this.keys[i4] = key;
            this.values[i4] = invoke;
        } else {
            this.values[N] = invoke;
        }
        return invoke;
    }

    @kotlin.w0
    public final int N(K key) {
        int hashCode = (key != null ? key.hashCode() : 0) * x2.f2466j;
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
                if (kotlin.jvm.internal.l0.g(this.keys[numberOfTrailingZeros], key)) {
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
                return ~M;
            }
            i11 += 8;
            i10 = (i10 + i11) & i7;
            i6 = i14;
        }
    }

    public final V O(K key, @fg.l ld.a<? extends V> defaultValue) {
        kotlin.jvm.internal.l0.p(defaultValue, "defaultValue");
        V p4 = p(key);
        if (p4 != null) {
            return p4;
        }
        V invoke = defaultValue.invoke();
        q0(key, invoke);
        return invoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S(@fg.l p2<K> keys) {
        kotlin.jvm.internal.l0.p(keys, "keys");
        Object[] objArr = keys.content;
        int i4 = keys._size;
        for (int i5 = 0; i5 < i4; i5++) {
            k0(objArr[i5]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T(@fg.l y2<K> keys) {
        kotlin.jvm.internal.l0.p(keys, "keys");
        Object[] objArr = keys.elements;
        long[] jArr = keys.metadata;
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
                        k0(objArr[(i4 << 3) + i6]);
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

    public final void U(@fg.l Iterable<? extends K> keys) {
        kotlin.jvm.internal.l0.p(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            k0(it.next());
        }
    }

    public final void V(K key) {
        k0(key);
    }

    public final void W(@fg.l kotlin.sequences.m<? extends K> keys) {
        kotlin.jvm.internal.l0.p(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            k0(it.next());
        }
    }

    public final void X(@fg.l K[] keys) {
        kotlin.jvm.internal.l0.p(keys, "keys");
        for (K k4 : keys) {
            k0(k4);
        }
    }

    public final void Y(@fg.l w2<K, V> from) {
        kotlin.jvm.internal.l0.p(from, "from");
        f0(from);
    }

    public final void Z(@fg.l Iterable<? extends kotlin.q0<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.l0.p(pairs, "pairs");
        g0(pairs);
    }

    public final void a0(@fg.l Map<K, ? extends V> from) {
        kotlin.jvm.internal.l0.p(from, "from");
        h0(from);
    }

    public final void b0(@fg.l kotlin.q0<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.l0.p(pair, "pair");
        q0(pair.e(), pair.f());
    }

    public final void c0(@fg.l kotlin.sequences.m<? extends kotlin.q0<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.l0.p(pairs, "pairs");
        i0(pairs);
    }

    public final void d0(@fg.l kotlin.q0<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.l0.p(pairs, "pairs");
        j0(pairs);
    }

    @fg.m
    public final V e0(K key, V value) {
        int N = N(key);
        if (N < 0) {
            N = ~N;
        }
        Object[] objArr = this.values;
        V v4 = (V) objArr[N];
        this.keys[N] = key;
        objArr[N] = value;
        return v4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f0(@fg.l w2<K, V> from) {
        kotlin.jvm.internal.l0.p(from, "from");
        Object[] objArr = from.keys;
        Object[] objArr2 = from.values;
        long[] jArr = from.metadata;
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
                        q0(objArr[i7], objArr2[i7]);
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

    public final void g0(@fg.l Iterable<? extends kotlin.q0<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.l0.p(pairs, "pairs");
        for (kotlin.q0<? extends K, ? extends V> q0Var : pairs) {
            q0(q0Var.a(), q0Var.b());
        }
    }

    public final void h0(@fg.l Map<K, ? extends V> from) {
        kotlin.jvm.internal.l0.p(from, "from");
        for (Map.Entry<K, ? extends V> entry : from.entrySet()) {
            q0(entry.getKey(), entry.getValue());
        }
    }

    public final void i0(@fg.l kotlin.sequences.m<? extends kotlin.q0<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.l0.p(pairs, "pairs");
        for (kotlin.q0<? extends K, ? extends V> q0Var : pairs) {
            q0(q0Var.a(), q0Var.b());
        }
    }

    public final void j0(@fg.l kotlin.q0<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.l0.p(pairs, "pairs");
        for (kotlin.q0<? extends K, ? extends V> q0Var : pairs) {
            q0(q0Var.a(), q0Var.b());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V k0(K r14) {
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
            java.lang.Object[] r11 = r13.keys
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
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object r14 = r13.o0(r10)
            return r14
        L73:
            r14 = 0
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.j2.k0(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l0(K r18, V r19) {
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
            java.lang.Object[] r15 = r0.keys
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
            if (r7 == 0) goto L84
            r11 = -1
        L71:
            if (r11 < 0) goto L83
            java.lang.Object[] r1 = r0.values
            r1 = r1[r11]
            r7 = r19
            boolean r1 = kotlin.jvm.internal.l0.g(r1, r7)
            if (r1 == 0) goto L83
            r0.o0(r11)
            return r12
        L83:
            return r2
        L84:
            r7 = r19
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.j2.l0(java.lang.Object, java.lang.Object):boolean");
    }

    public final void n0(@fg.l ld.p<? super K, ? super V, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
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
                        if (predicate.invoke(this.keys[i7], this.values[i7]).booleanValue()) {
                            o0(i7);
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

    @fg.m
    @kotlin.w0
    public final V o0(int index) {
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
        this.keys[index] = null;
        Object[] objArr = this.values;
        V v4 = (V) objArr[index];
        objArr[index] = null;
        return v4;
    }

    public final void q0(K key, V value) {
        int N = N(key);
        if (N < 0) {
            N = ~N;
        }
        this.keys[N] = key;
        this.values[N] = value;
    }

    public final int r0() {
        int i4 = this._capacity;
        int x4 = x2.x(x2.z(this._size));
        if (x4 >= i4) {
            return 0;
        }
        p0(x4);
        return i4 - this._capacity;
    }

    public /* synthetic */ j2(int i4, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? 6 : i4);
    }

    public j2(int i4) {
        super(null);
        if (i4 >= 0) {
            R(x2.z(i4));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }
}
