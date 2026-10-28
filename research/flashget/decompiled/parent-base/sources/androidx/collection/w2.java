package androidx.collection;

import androidx.constraintlayout.core.motion.utils.w;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import kotlin.Metadata;

/* compiled from: ScatterMap.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001%B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\bJ\u001a\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0001¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J6\u0010\u001c\u001a\u00020\u001a2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a0\u0015H\u0081\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJK\u0010 \u001a\u00020\u001a26\u0010\u001b\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001a0\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b \u0010!J6\u0010\"\u001a\u00020\u001a2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u001a0\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b\"\u0010\u001dJ6\u0010#\u001a\u00020\u001a2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001a0\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b#\u0010\u001dJ-\u0010%\u001a\u00020\u00062\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b%\u0010&J-\u0010'\u001a\u00020\u00062\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b'\u0010&J\r\u0010(\u001a\u00020\u0016¢\u0006\u0004\b(\u0010)J-\u0010*\u001a\u00020\u00162\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b.\u0010-J\u0015\u0010/\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00028\u0001¢\u0006\u0004\b/\u0010-J}\u00108\u001a\u0002072\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00102\u001a\u0002002\b\b\u0002\u00103\u001a\u0002002\b\b\u0002\u00104\u001a\u00020\u00162\b\b\u0002\u00105\u001a\u0002002:\b\u0002\u00106\u001a4\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u000200\u0018\u00010\u001eH\u0007¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0016H\u0016¢\u0006\u0004\b:\u0010)J\u001a\u0010<\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b<\u0010-J\u000f\u0010=\u001a\u000207H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u000207H\u0000¢\u0006\u0004\b?\u0010>J\u0018\u0010@\u001a\u00020\u00162\u0006\u0010\f\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b@\u0010AJ\u0019\u0010C\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010B¢\u0006\u0004\bC\u0010DR\u001c\u0010H\u001a\u00020E8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b%\u0010F\u0012\u0004\bG\u0010\u0005R$\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030I8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0007\u0010J\u0012\u0004\bK\u0010\u0005R$\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030I8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b'\u0010J\u0012\u0004\bM\u0010\u0005R\u0016\u0010P\u001a\u00020\u00168\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b?\u0010OR\u0016\u0010Q\u001a\u00020\u00168\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bC\u0010OR\u0011\u0010S\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bR\u0010)R\u0011\u0010U\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bT\u0010)\u0082\u0001\u0001V\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006W"}, d2 = {"Landroidx/collection/w2;", "K", "V", "", "<init>", "()V", "", "b", "()Z", "H", "x", "y", "key", "p", "(Ljava/lang/Object;)Ljava/lang/Object;", "defaultValue", "t", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "u", "(Ljava/lang/Object;Lld/a;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "index", "Lkotlin/k2;", "block", "m", "(Lld/l;)V", "Lkotlin/Function2;", "value", "l", "(Lld/p;)V", "n", "o", "predicate", "a", "(Lld/p;)Z", "c", "i", "()I", "j", "(Lld/p;)I", "f", "(Ljava/lang/Object;)Z", "g", "h", "", "separator", "prefix", "postfix", "limit", "truncated", "transform", "", "F", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lld/p;)Ljava/lang/String;", "hashCode", "other", "equals", "toString", "()Ljava/lang/String;", "d", "k", "(Ljava/lang/Object;)I", "", "e", "()Ljava/util/Map;", "", "[J", "s", "metadata", "", "[Ljava/lang/Object;", "r", "keys", "w", "values", "I", "_capacity", "_size", "q", "capacity", "v", "size", "Landroidx/collection/j2;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1850:1\n633#1:1851\n634#1:1855\n636#1,2:1857\n638#1,4:1860\n642#1:1867\n643#1:1871\n644#1:1873\n645#1,4:1876\n651#1:1881\n652#1,8:1883\n633#1:1891\n634#1:1895\n636#1,2:1897\n638#1,4:1900\n642#1:1907\n643#1:1911\n644#1:1913\n645#1,4:1916\n651#1:1921\n652#1,8:1923\n363#1,6:1933\n373#1,3:1940\n376#1,9:1944\n363#1,6:1953\n373#1,3:1960\n376#1,9:1964\n363#1,6:1973\n373#1,3:1980\n376#1,9:1984\n391#1,4:1993\n363#1,6:1997\n373#1,3:2004\n376#1,2:2008\n396#1,2:2010\n379#1,6:2012\n398#1:2018\n391#1,4:2019\n363#1,6:2023\n373#1,3:2030\n376#1,2:2034\n396#1,2:2036\n379#1,6:2038\n398#1:2044\n391#1,4:2045\n363#1,6:2049\n373#1,3:2056\n376#1,2:2060\n396#1,2:2062\n379#1,6:2064\n398#1:2070\n633#1:2071\n634#1:2075\n636#1,2:2077\n638#1,4:2080\n642#1:2087\n643#1:2091\n644#1:2093\n645#1,4:2096\n651#1:2101\n652#1,8:2103\n633#1:2111\n634#1:2115\n636#1,2:2117\n638#1,4:2120\n642#1:2127\n643#1:2131\n644#1:2133\n645#1,4:2136\n651#1:2141\n652#1,8:2143\n418#1,3:2151\n363#1,6:2154\n373#1,3:2161\n376#1,2:2165\n422#1,2:2167\n379#1,6:2169\n424#1:2175\n391#1,4:2176\n363#1,6:2180\n373#1,3:2187\n376#1,2:2191\n396#1,2:2193\n379#1,6:2195\n398#1:2201\n391#1,4:2202\n363#1,6:2206\n373#1,3:2213\n376#1,2:2217\n396#1,2:2219\n379#1,6:2221\n398#1:2227\n391#1,4:2228\n363#1,6:2232\n373#1,3:2239\n376#1,2:2243\n396#1,2:2245\n379#1,6:2247\n398#1:2253\n391#1,4:2254\n363#1,6:2258\n373#1,3:2265\n376#1,2:2269\n396#1,2:2271\n379#1,6:2273\n398#1:2279\n1605#2,3:1852\n1619#2:1856\n1615#2:1859\n1795#2,3:1864\n1809#2,3:1868\n1733#2:1872\n1721#2:1874\n1715#2:1875\n1728#2:1880\n1818#2:1882\n1605#2,3:1892\n1619#2:1896\n1615#2:1899\n1795#2,3:1904\n1809#2,3:1908\n1733#2:1912\n1721#2:1914\n1715#2:1915\n1728#2:1920\n1818#2:1922\n1826#2:1931\n1688#2:1932\n1826#2:1939\n1688#2:1943\n1826#2:1959\n1688#2:1963\n1826#2:1979\n1688#2:1983\n1826#2:2003\n1688#2:2007\n1826#2:2029\n1688#2:2033\n1826#2:2055\n1688#2:2059\n1605#2,3:2072\n1619#2:2076\n1615#2:2079\n1795#2,3:2084\n1809#2,3:2088\n1733#2:2092\n1721#2:2094\n1715#2:2095\n1728#2:2100\n1818#2:2102\n1605#2,3:2112\n1619#2:2116\n1615#2:2119\n1795#2,3:2124\n1809#2,3:2128\n1733#2:2132\n1721#2:2134\n1715#2:2135\n1728#2:2140\n1818#2:2142\n1826#2:2160\n1688#2:2164\n1826#2:2186\n1688#2:2190\n1826#2:2212\n1688#2:2216\n1826#2:2238\n1688#2:2242\n1826#2:2264\n1688#2:2268\n1661#2:2280\n1605#2,3:2281\n1619#2:2284\n1615#2:2285\n1795#2,3:2286\n1809#2,3:2289\n1733#2:2292\n1721#2:2293\n1715#2:2294\n1728#2:2295\n1818#2:2296\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap\n*L\n330#1:1851\n330#1:1855\n330#1:1857,2\n330#1:1860,4\n330#1:1867\n330#1:1871\n330#1:1873\n330#1:1876,4\n330#1:1881\n330#1:1883,8\n340#1:1891\n340#1:1895\n340#1:1897,2\n340#1:1900,4\n340#1:1907\n340#1:1911\n340#1:1913\n340#1:1916,4\n340#1:1921\n340#1:1923,8\n394#1:1933,6\n394#1:1940,3\n394#1:1944,9\n407#1:1953,6\n407#1:1960,3\n407#1:1964,9\n420#1:1973,6\n420#1:1980,3\n420#1:1984,9\n430#1:1993,4\n430#1:1997,6\n430#1:2004,3\n430#1:2008,2\n430#1:2010,2\n430#1:2012,6\n430#1:2018\n440#1:2019,4\n440#1:2023,6\n440#1:2030,3\n440#1:2034,2\n440#1:2036,2\n440#1:2038,6\n440#1:2044\n456#1:2045,4\n456#1:2049,6\n456#1:2056,3\n456#1:2060,2\n456#1:2062,2\n456#1:2064,6\n456#1:2070\n466#1:2071\n466#1:2075\n466#1:2077,2\n466#1:2080,4\n466#1:2087\n466#1:2091\n466#1:2093\n466#1:2096,4\n466#1:2101\n466#1:2103,8\n472#1:2111\n472#1:2115\n472#1:2117,2\n472#1:2120,4\n472#1:2127\n472#1:2131\n472#1:2133\n472#1:2136,4\n472#1:2141\n472#1:2143,8\n479#1:2151,3\n479#1:2154,6\n479#1:2161,3\n479#1:2165,2\n479#1:2167,2\n479#1:2169,6\n479#1:2175\n506#1:2176,4\n506#1:2180,6\n506#1:2187,3\n506#1:2191,2\n506#1:2193,2\n506#1:2195,6\n506#1:2201\n533#1:2202,4\n533#1:2206,6\n533#1:2213,3\n533#1:2217,2\n533#1:2219,2\n533#1:2221,6\n533#1:2227\n562#1:2228,4\n562#1:2232,6\n562#1:2239,3\n562#1:2243,2\n562#1:2245,2\n562#1:2247,6\n562#1:2253\n588#1:2254,4\n588#1:2258,6\n588#1:2265,3\n588#1:2269,2\n588#1:2271,2\n588#1:2273,6\n588#1:2279\n330#1:1852,3\n330#1:1856\n330#1:1859\n330#1:1864,3\n330#1:1868,3\n330#1:1872\n330#1:1874\n330#1:1875\n330#1:1880\n330#1:1882\n340#1:1892,3\n340#1:1896\n340#1:1899\n340#1:1904,3\n340#1:1908,3\n340#1:1912\n340#1:1914\n340#1:1915\n340#1:1920\n340#1:1922\n368#1:1931\n375#1:1932\n394#1:1939\n394#1:1943\n407#1:1959\n407#1:1963\n420#1:1979\n420#1:1983\n430#1:2003\n430#1:2007\n440#1:2029\n440#1:2033\n456#1:2055\n456#1:2059\n466#1:2072,3\n466#1:2076\n466#1:2079\n466#1:2084,3\n466#1:2088,3\n466#1:2092\n466#1:2094\n466#1:2095\n466#1:2100\n466#1:2102\n472#1:2112,3\n472#1:2116\n472#1:2119\n472#1:2124,3\n472#1:2128,3\n472#1:2132\n472#1:2134\n472#1:2135\n472#1:2140\n472#1:2142\n479#1:2160\n479#1:2164\n506#1:2186\n506#1:2190\n533#1:2212\n533#1:2216\n562#1:2238\n562#1:2242\n588#1:2264\n588#1:2268\n605#1:2280\n633#1:2281,3\n634#1:2284\n637#1:2285\n641#1:2286,3\n642#1:2289,3\n643#1:2292\n644#1:2293\n644#1:2294\n648#1:2295\n651#1:2296\n*E\n"})
/* loaded from: classes.dex */
public abstract class w2<K, V> {

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
    public Object[] values;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public int _capacity;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public int _size;

    /* compiled from: ScatterMap.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0090\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\fR&\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f0\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/collection/w2$a;", "", "<init>", "(Landroidx/collection/w2;)V", "", "isEmpty", "()Z", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "containsValue", "(Ljava/lang/Object;)Z", "containsKey", "", "", "b", "()Ljava/util/Set;", "entries", "c", "keys", "", "e", "()Ljava/util/Collection;", "values", "", "d", "()I", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public class a implements Map<K, V>, md.a {

        /* compiled from: ScatterMap.kt */
        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000b\u001a\u00020\u00032\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000e\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"androidx/collection/w2$a$a", "", "", "", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "element", "c", "(Ljava/util/Map$Entry;)Z", "", "f", "()I", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlin.jvm.internal.r1({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$entries$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1850:1\n1726#2,3:1851\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$entries$1\n*L\n712#1:1851,3\n*E\n"})
        /* renamed from: androidx.collection.w2$a$a, reason: collision with other inner class name */
        public static final class C0034a implements Set<Map.Entry<? extends K, ? extends V>>, md.a {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ w2<K, V> f2417b;

            /* compiled from: ScatterMap.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {w.h.f22555k}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
            @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"K", "V", "Lkotlin/sequences/o;", "", "Lkotlin/k2;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 8, 0})
            @kotlin.jvm.internal.r1({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1850:1\n363#2,6:1851\n373#2,3:1858\n376#2,9:1862\n1826#3:1857\n1688#3:1861\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1\n*L\n699#1:1851,6\n699#1:1858,3\n699#1:1862,9\n699#1:1857\n699#1:1861\n*E\n"})
            /* renamed from: androidx.collection.w2$a$a$a, reason: collision with other inner class name */
            static final class C0035a extends kotlin.coroutines.jvm.internal.k implements ld.p<kotlin.sequences.o<? super Map.Entry<? extends K, ? extends V>>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                /* renamed from: c, reason: collision with root package name */
                Object f2418c;

                /* renamed from: d, reason: collision with root package name */
                Object f2419d;

                /* renamed from: e, reason: collision with root package name */
                int f2420e;

                /* renamed from: f, reason: collision with root package name */
                int f2421f;

                /* renamed from: g, reason: collision with root package name */
                int f2422g;

                /* renamed from: h, reason: collision with root package name */
                int f2423h;

                /* renamed from: i, reason: collision with root package name */
                long f2424i;

                /* renamed from: j, reason: collision with root package name */
                int f2425j;

                /* renamed from: k, reason: collision with root package name */
                private /* synthetic */ Object f2426k;

                /* renamed from: l, reason: collision with root package name */
                final /* synthetic */ w2<K, V> f2427l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0035a(w2<K, V> w2Var, kotlin.coroutines.d<? super C0035a> dVar) {
                    super(2, dVar);
                    this.f2427l = w2Var;
                }

                @Override // ld.p
                @fg.m
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@fg.l kotlin.sequences.o<? super Map.Entry<? extends K, ? extends V>> oVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                    return ((C0035a) create(oVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    C0035a c0035a = new C0035a(this.f2427l, dVar);
                    c0035a.f2426k = obj;
                    return c0035a;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0067  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0096 -> B:5:0x0099). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x009c -> B:6:0x009d). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0051 -> B:7:0x0065). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a9 -> B:18:0x00aa). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r22) {
                    /*
                        Method dump skipped, instructions count: 179
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.collection.w2.a.C0034a.C0035a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            C0034a(w2<K, V> w2Var) {
                this.f2417b = w2Var;
            }

            @Override // java.util.Set, java.util.Collection
            public /* bridge */ /* synthetic */ boolean add(Object obj) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean addAll(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            public boolean b(Map.Entry<? extends K, ? extends V> entry) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            public boolean c(@fg.l Map.Entry<? extends K, ? extends V> element) {
                kotlin.jvm.internal.l0.p(element, "element");
                return kotlin.jvm.internal.l0.g(this.f2417b.p(element.getKey()), element.getValue());
            }

            @Override // java.util.Set, java.util.Collection
            public void clear() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public final /* bridge */ boolean contains(Object obj) {
                if (obj instanceof Map.Entry) {
                    return c((Map.Entry) obj);
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Set, java.util.Collection
            public boolean containsAll(@fg.l Collection<? extends Object> elements) {
                kotlin.jvm.internal.l0.p(elements, "elements");
                Collection<? extends Object> collection = elements;
                w2<K, V> w2Var = this.f2417b;
                if (collection.isEmpty()) {
                    return true;
                }
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!kotlin.jvm.internal.l0.g(w2Var.p(entry.getKey()), entry.getValue())) {
                        return false;
                    }
                }
                return true;
            }

            public int f() {
                return this.f2417b._size;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean isEmpty() {
                return this.f2417b.x();
            }

            @Override // java.util.Set, java.util.Collection, java.lang.Iterable
            @fg.l
            public Iterator<Map.Entry<K, V>> iterator() {
                return kotlin.sequences.p.a(new C0035a(this.f2417b, null));
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
            public final int size() {
                return this.f2417b._size;
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
        @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"androidx/collection/w2$a$b", "", "", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "element", "contains", "(Ljava/lang/Object;)Z", "", "b", "()I", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlin.jvm.internal.r1({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$keys$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1850:1\n1726#2,3:1851\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$keys$1\n*L\n731#1:1851,3\n*E\n"})
        public static final class b implements Set<K>, md.a {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ w2<K, V> f2428b;

            /* compiled from: ScatterMap.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.collection.ScatterMap$MapWrapper$keys$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {726}, m = "invokeSuspend", n = {"$this$iterator", "k$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
            @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"K", "V", "Lkotlin/sequences/o;", "Lkotlin/k2;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 8, 0})
            @kotlin.jvm.internal.r1({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$keys$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1850:1\n405#2,3:1851\n363#2,6:1854\n373#2,3:1861\n376#2,2:1865\n409#2,2:1867\n379#2,6:1869\n411#2:1875\n1826#3:1860\n1688#3:1864\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$keys$1$iterator$1\n*L\n725#1:1851,3\n725#1:1854,6\n725#1:1861,3\n725#1:1865,2\n725#1:1867,2\n725#1:1869,6\n725#1:1875\n725#1:1860\n725#1:1864\n*E\n"})
            /* renamed from: androidx.collection.w2$a$b$a, reason: collision with other inner class name */
            static final class C0036a extends kotlin.coroutines.jvm.internal.k implements ld.p<kotlin.sequences.o<? super K>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                /* renamed from: c, reason: collision with root package name */
                Object f2429c;

                /* renamed from: d, reason: collision with root package name */
                Object f2430d;

                /* renamed from: e, reason: collision with root package name */
                int f2431e;

                /* renamed from: f, reason: collision with root package name */
                int f2432f;

                /* renamed from: g, reason: collision with root package name */
                int f2433g;

                /* renamed from: h, reason: collision with root package name */
                int f2434h;

                /* renamed from: i, reason: collision with root package name */
                long f2435i;

                /* renamed from: j, reason: collision with root package name */
                int f2436j;

                /* renamed from: k, reason: collision with root package name */
                private /* synthetic */ Object f2437k;

                /* renamed from: l, reason: collision with root package name */
                final /* synthetic */ w2<K, V> f2438l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0036a(w2<K, V> w2Var, kotlin.coroutines.d<? super C0036a> dVar) {
                    super(2, dVar);
                    this.f2438l = w2Var;
                }

                @Override // ld.p
                @fg.m
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@fg.l kotlin.sequences.o<? super K> oVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                    return ((C0036a) create(oVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    C0036a c0036a = new C0036a(this.f2438l, dVar);
                    c0036a.f2437k = obj;
                    return c0036a;
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
                        int r2 = r0.f2436j
                        r3 = 0
                        r4 = 8
                        r5 = 1
                        if (r2 == 0) goto L30
                        if (r2 != r5) goto L28
                        int r2 = r0.f2434h
                        int r6 = r0.f2433g
                        long r7 = r0.f2435i
                        int r9 = r0.f2432f
                        int r10 = r0.f2431e
                        java.lang.Object r11 = r0.f2430d
                        long[] r11 = (long[]) r11
                        java.lang.Object r12 = r0.f2429c
                        java.lang.Object[] r12 = (java.lang.Object[]) r12
                        java.lang.Object r13 = r0.f2437k
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
                        java.lang.Object r2 = r0.f2437k
                        kotlin.sequences.o r2 = (kotlin.sequences.o) r2
                        androidx.collection.w2<K, V> r6 = r0.f2438l
                        java.lang.Object[] r7 = r6.keys
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
                        r0.f2437k = r13
                        r0.f2429c = r12
                        r0.f2430d = r11
                        r0.f2431e = r10
                        r0.f2432f = r9
                        r0.f2435i = r7
                        r0.f2433g = r6
                        r0.f2434h = r2
                        r0.f2436j = r5
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
                    throw new UnsupportedOperationException("Method not decompiled: androidx.collection.w2.a.b.C0036a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            b(w2<K, V> w2Var) {
                this.f2428b = w2Var;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean add(K k4) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean addAll(Collection<? extends K> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            public int b() {
                return this.f2428b._size;
            }

            @Override // java.util.Set, java.util.Collection
            public void clear() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean contains(Object element) {
                return this.f2428b.g(element);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Set, java.util.Collection
            public boolean containsAll(@fg.l Collection<? extends Object> elements) {
                kotlin.jvm.internal.l0.p(elements, "elements");
                Collection<? extends Object> collection = elements;
                w2<K, V> w2Var = this.f2428b;
                if (collection.isEmpty()) {
                    return true;
                }
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    if (!w2Var.g(it.next())) {
                        return false;
                    }
                }
                return true;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean isEmpty() {
                return this.f2428b.x();
            }

            @Override // java.util.Set, java.util.Collection, java.lang.Iterable
            @fg.l
            public Iterator<K> iterator() {
                return kotlin.sequences.p.a(new C0036a(this.f2428b, null));
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
            public final int size() {
                return this.f2428b._size;
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
        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"androidx/collection/w2$a$c", "", "", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "elements", "containsAll", "(Ljava/util/Collection;)Z", "element", "contains", "(Ljava/lang/Object;)Z", "", "b", "()I", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlin.jvm.internal.r1({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$values$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1850:1\n1726#2,3:1851\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$values$1\n*L\n749#1:1851,3\n*E\n"})
        public static final class c implements Collection<V>, md.a {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ w2<K, V> f2439b;

            /* compiled from: ScatterMap.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.collection.ScatterMap$MapWrapper$values$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {744}, m = "invokeSuspend", n = {"$this$iterator", "v$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
            @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"K", "V", "Lkotlin/sequences/o;", "Lkotlin/k2;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 8, 0})
            @kotlin.jvm.internal.r1({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$values$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1850:1\n418#2,3:1851\n363#2,6:1854\n373#2,3:1861\n376#2,2:1865\n422#2,2:1867\n379#2,6:1869\n424#2:1875\n1826#3:1860\n1688#3:1864\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$values$1$iterator$1\n*L\n743#1:1851,3\n743#1:1854,6\n743#1:1861,3\n743#1:1865,2\n743#1:1867,2\n743#1:1869,6\n743#1:1875\n743#1:1860\n743#1:1864\n*E\n"})
            /* renamed from: androidx.collection.w2$a$c$a, reason: collision with other inner class name */
            static final class C0037a extends kotlin.coroutines.jvm.internal.k implements ld.p<kotlin.sequences.o<? super V>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                /* renamed from: c, reason: collision with root package name */
                Object f2440c;

                /* renamed from: d, reason: collision with root package name */
                Object f2441d;

                /* renamed from: e, reason: collision with root package name */
                int f2442e;

                /* renamed from: f, reason: collision with root package name */
                int f2443f;

                /* renamed from: g, reason: collision with root package name */
                int f2444g;

                /* renamed from: h, reason: collision with root package name */
                int f2445h;

                /* renamed from: i, reason: collision with root package name */
                long f2446i;

                /* renamed from: j, reason: collision with root package name */
                int f2447j;

                /* renamed from: k, reason: collision with root package name */
                private /* synthetic */ Object f2448k;

                /* renamed from: l, reason: collision with root package name */
                final /* synthetic */ w2<K, V> f2449l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0037a(w2<K, V> w2Var, kotlin.coroutines.d<? super C0037a> dVar) {
                    super(2, dVar);
                    this.f2449l = w2Var;
                }

                @Override // ld.p
                @fg.m
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@fg.l kotlin.sequences.o<? super V> oVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                    return ((C0037a) create(oVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    C0037a c0037a = new C0037a(this.f2449l, dVar);
                    c0037a.f2448k = obj;
                    return c0037a;
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
                        int r2 = r0.f2447j
                        r3 = 0
                        r4 = 8
                        r5 = 1
                        if (r2 == 0) goto L30
                        if (r2 != r5) goto L28
                        int r2 = r0.f2445h
                        int r6 = r0.f2444g
                        long r7 = r0.f2446i
                        int r9 = r0.f2443f
                        int r10 = r0.f2442e
                        java.lang.Object r11 = r0.f2441d
                        long[] r11 = (long[]) r11
                        java.lang.Object r12 = r0.f2440c
                        java.lang.Object[] r12 = (java.lang.Object[]) r12
                        java.lang.Object r13 = r0.f2448k
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
                        java.lang.Object r2 = r0.f2448k
                        kotlin.sequences.o r2 = (kotlin.sequences.o) r2
                        androidx.collection.w2<K, V> r6 = r0.f2449l
                        java.lang.Object[] r7 = r6.values
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
                        r0.f2448k = r13
                        r0.f2440c = r12
                        r0.f2441d = r11
                        r0.f2442e = r10
                        r0.f2443f = r9
                        r0.f2446i = r7
                        r0.f2444g = r6
                        r0.f2445h = r2
                        r0.f2447j = r5
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
                    throw new UnsupportedOperationException("Method not decompiled: androidx.collection.w2.a.c.C0037a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            c(w2<K, V> w2Var) {
                this.f2439b = w2Var;
            }

            @Override // java.util.Collection
            public boolean add(V v4) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public boolean addAll(Collection<? extends V> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            public int b() {
                return this.f2439b._size;
            }

            @Override // java.util.Collection
            public void clear() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public boolean contains(Object element) {
                return this.f2439b.h(element);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Collection
            public boolean containsAll(@fg.l Collection<? extends Object> elements) {
                kotlin.jvm.internal.l0.p(elements, "elements");
                Collection<? extends Object> collection = elements;
                w2<K, V> w2Var = this.f2439b;
                if (collection.isEmpty()) {
                    return true;
                }
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    if (!w2Var.h(it.next())) {
                        return false;
                    }
                }
                return true;
            }

            @Override // java.util.Collection
            public boolean isEmpty() {
                return this.f2439b.x();
            }

            @Override // java.util.Collection, java.lang.Iterable
            @fg.l
            public Iterator<V> iterator() {
                return kotlin.sequences.p.a(new C0037a(this.f2439b, null));
            }

            @Override // java.util.Collection
            public boolean remove(Object obj) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public boolean removeAll(Collection<? extends Object> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public boolean removeIf(Predicate<? super V> predicate) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public boolean retainAll(Collection<? extends Object> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public final int size() {
                return this.f2439b._size;
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
        }

        @fg.l
        public Set<Map.Entry<K, V>> b() {
            return new C0034a(w2.this);
        }

        @fg.l
        public Set<K> c() {
            return new b(w2.this);
        }

        @Override // java.util.Map
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V compute(K k4, BiFunction<? super K, ? super V, ? extends V> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V computeIfAbsent(K k4, Function<? super K, ? extends V> function) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V computeIfPresent(K k4, BiFunction<? super K, ? super V, ? extends V> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public boolean containsKey(Object key) {
            return w2.this.g(key);
        }

        @Override // java.util.Map
        public boolean containsValue(Object value) {
            return w2.this.h(value);
        }

        public int d() {
            return w2.this._size;
        }

        @fg.l
        public Collection<V> e() {
            return new c(w2.this);
        }

        @Override // java.util.Map
        public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
            return b();
        }

        @Override // java.util.Map
        @fg.m
        public V get(Object key) {
            return w2.this.p(key);
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return w2.this.x();
        }

        @Override // java.util.Map
        public final /* bridge */ Set<K> keySet() {
            return c();
        }

        @Override // java.util.Map
        public V merge(K k4, V v4, BiFunction<? super V, ? super V, ? extends V> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V put(K k4, V v4) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V putIfAbsent(K k4, V v4) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V replace(K k4, V v4) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final /* bridge */ int size() {
            return d();
        }

        @Override // java.util.Map
        public final /* bridge */ Collection<V> values() {
            return e();
        }

        @Override // java.util.Map
        public boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public boolean replace(K k4, V v4, V v5) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ w2(kotlin.jvm.internal.w wVar) {
        this();
    }

    public static /* synthetic */ String G(w2 w2Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, ld.p pVar, int i5, Object obj) {
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
            pVar = null;
        }
        return w2Var.F(charSequence, charSequence5, charSequence6, i6, charSequence7, pVar);
    }

    @kotlin.w0
    public static /* synthetic */ void r() {
    }

    @kotlin.w0
    public static /* synthetic */ void s() {
    }

    @kotlin.w0
    public static /* synthetic */ void w() {
    }

    @fg.l
    @kd.j
    public final String A(@fg.l CharSequence separator) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        return G(this, separator, null, null, 0, null, null, 62, null);
    }

    @fg.l
    @kd.j
    public final String B(@fg.l CharSequence separator, @fg.l CharSequence prefix) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        return G(this, separator, prefix, null, 0, null, null, 60, null);
    }

    @fg.l
    @kd.j
    public final String C(@fg.l CharSequence separator, @fg.l CharSequence prefix, @fg.l CharSequence postfix) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        kotlin.jvm.internal.l0.p(postfix, "postfix");
        return G(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    @fg.l
    @kd.j
    public final String D(@fg.l CharSequence separator, @fg.l CharSequence prefix, @fg.l CharSequence postfix, int i4) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        kotlin.jvm.internal.l0.p(postfix, "postfix");
        return G(this, separator, prefix, postfix, i4, null, null, 48, null);
    }

    @fg.l
    @kd.j
    public final String E(@fg.l CharSequence separator, @fg.l CharSequence prefix, @fg.l CharSequence postfix, int i4, @fg.l CharSequence truncated) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        kotlin.jvm.internal.l0.p(postfix, "postfix");
        kotlin.jvm.internal.l0.p(truncated, "truncated");
        return G(this, separator, prefix, postfix, i4, truncated, null, 32, null);
    }

    @fg.l
    @kd.j
    public final String F(@fg.l CharSequence separator, @fg.l CharSequence prefix, @fg.l CharSequence postfix, int limit, @fg.l CharSequence truncated, @fg.m ld.p<? super K, ? super V, ? extends CharSequence> transform) {
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        StringBuilder a5 = l.a(postfix, "postfix", truncated, "truncated", prefix);
        Object[] objArr5 = this.keys;
        Object[] objArr6 = this.values;
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
                            Object obj = objArr5[i11];
                            objArr3 = objArr5;
                            Object obj2 = objArr6[i11];
                            objArr4 = objArr6;
                            if (i5 == limit) {
                                a5.append(truncated);
                                break loop0;
                            }
                            if (i5 != 0) {
                                a5.append(separator);
                            }
                            if (transform == null) {
                                a5.append(obj);
                                a5.append('=');
                                a5.append(obj2);
                            } else {
                                a5.append(transform.invoke(obj, obj2));
                            }
                            i5++;
                        } else {
                            objArr3 = objArr5;
                            objArr4 = objArr6;
                        }
                        j4 >>= 8;
                        i10++;
                        objArr6 = objArr4;
                        objArr5 = objArr3;
                    }
                    objArr = objArr5;
                    objArr2 = objArr6;
                    if (i7 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr5;
                    objArr2 = objArr6;
                }
                if (i6 == length) {
                    break;
                }
                i4 = i6 + 1;
                objArr6 = objArr2;
                objArr5 = objArr;
            }
        }
        a5.append(postfix);
        String sb = a5.toString();
        kotlin.jvm.internal.l0.o(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }

    public final boolean H() {
        return this._size == 0;
    }

    public final boolean a(@fg.l ld.p<? super K, ? super V, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
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
                        if (!predicate.invoke(objArr[i7], objArr2[i7]).booleanValue()) {
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

    public final boolean c(@fg.l ld.p<? super K, ? super V, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
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
                            if (predicate.invoke(objArr[i7], objArr2[i7]).booleanValue()) {
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

    @fg.l
    public final String d() {
        StringBuilder sb = new StringBuilder("{metadata=[");
        int i4 = this._capacity;
        for (int i5 = 0; i5 < i4; i5++) {
            long j4 = (this.metadata[i5 >> 3] >> ((i5 & 7) << 3)) & 255;
            if (j4 == 128) {
                sb.append("Empty");
            } else if (j4 == 254) {
                sb.append("Deleted");
            } else {
                sb.append(j4);
            }
            sb.append(", ");
        }
        sb.append("], keys=[");
        int length = this.keys.length;
        for (int i6 = 0; i6 < length; i6++) {
            sb.append(this.keys[i6]);
            sb.append(", ");
        }
        sb.append("], values=[");
        int length2 = this.values.length;
        for (int i7 = 0; i7 < length2; i7++) {
            sb.append(this.values[i7]);
            sb.append(", ");
        }
        sb.append("]}");
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @fg.l
    public final Map<K, V> e() {
        return new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(@fg.m Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) other;
        if (w2Var._size != this._size) {
            return false;
        }
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            loop0: while (true) {
                long j4 = jArr[i4];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j4) < 128) {
                            int i7 = (i4 << 3) + i6;
                            Object obj = objArr[i7];
                            Object obj2 = objArr2[i7];
                            if (obj2 == null) {
                                if (w2Var.p(obj) != null || !w2Var.g(obj)) {
                                    break loop0;
                                }
                            } else if (!kotlin.jvm.internal.l0.g(obj2, w2Var.p(obj))) {
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
            return false;
        }
        return true;
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
    public final boolean f(K r18) {
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.w2.f(java.lang.Object):boolean");
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
    public final boolean g(K r18) {
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.w2.g(java.lang.Object):boolean");
    }

    public final boolean h(V value) {
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr[i4];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j4) < 128 && kotlin.jvm.internal.l0.g(value, objArr[(i4 << 3) + i6])) {
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

    public int hashCode() {
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
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
                            Object obj2 = objArr2[i11];
                            i6 += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    /* renamed from: i, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final int j(@fg.l ld.p<? super K, ? super V, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
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
                            if (predicate.invoke(objArr[i11], objArr2[i11]).booleanValue()) {
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

    public final int k(K key) {
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

    public final void l(@fg.l ld.p<? super K, ? super V, kotlin.k2> block) {
        kotlin.jvm.internal.l0.p(block, "block");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
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
                        block.invoke(objArr[i7], objArr2[i7]);
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

    public final void n(@fg.l ld.l<? super K, kotlin.k2> block) {
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

    public final void o(@fg.l ld.l<? super V, kotlin.k2> block) {
        kotlin.jvm.internal.l0.p(block, "block");
        Object[] objArr = this.values;
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

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V p(K r14) {
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
            java.lang.Object[] r14 = r13.values
            r14 = r14[r10]
            goto L74
        L73:
            r14 = 0
        L74:
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.w2.p(java.lang.Object):java.lang.Object");
    }

    /* renamed from: q, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V t(K r14, V r15) {
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
            if (r4 == 0) goto L74
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object[] r14 = r13.values
            r14 = r14[r10]
            return r14
        L73:
            return r15
        L74:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.w2.t(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @fg.l
    public String toString() {
        if (x()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
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
                            Object obj2 = objArr2[i10];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
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

    public final V u(K key, @fg.l ld.a<? extends V> defaultValue) {
        kotlin.jvm.internal.l0.p(defaultValue, "defaultValue");
        V p4 = p(key);
        return p4 == null ? defaultValue.invoke() : p4;
    }

    public final int v() {
        return this._size;
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
        return G(this, null, null, null, 0, null, null, 63, null);
    }

    private w2() {
        this.metadata = x2.f2461e;
        Object[] objArr = m.a.f81462c;
        this.keys = objArr;
        this.values = objArr;
    }
}
