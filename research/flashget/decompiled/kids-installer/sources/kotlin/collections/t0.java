package kotlin.collections;

import a0.c;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Grouping.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u009e\u0001\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052b\u0010\u0006\u001a^\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u0001H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002H\u00030\u0007H\u0087\bø\u0001\u0000\u001a·\u0001\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u00102b\u0010\u0006\u001a^\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u0001H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002H\u00030\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001aI\u0010\u0014\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0016\b\u0002\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00150\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u0010H\u0007¢\u0006\u0002\u0010\u0016\u001a¿\u0001\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u000526\u0010\u0018\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u00192K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u001aH\u0087\bø\u0001\u0000\u001a\u007f\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u001b\u001a\u0002H\u000326\u0010\u0006\u001a2\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u0019H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001aØ\u0001\u0010\u001d\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u001026\u0010\u0018\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u00192K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u001aH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001a\u0093\u0001\u0010\u001d\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u00102\u0006\u0010\u001b\u001a\u0002H\u000326\u0010\u0006\u001a2\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u0019H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001f\u001a\u008b\u0001\u0010 \u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H!0\u0001\"\u0004\b\u0000\u0010!\"\b\b\u0001\u0010\u0004*\u0002H!\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H!¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H!0\u001aH\u0087\bø\u0001\u0000\u001a¤\u0001\u0010\"\u001a\u0002H\u0010\"\u0004\b\u0000\u0010!\"\b\b\u0001\u0010\u0004*\u0002H!\"\u0004\b\u0002\u0010\u0002\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H!0\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u00102K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H!¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H!0\u001aH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010#\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006$"}, d2 = {"aggregate", "", "K", "R", "T", "Lkotlin/collections/Grouping;", "operation", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "key", "accumulator", "element", "", "first", "aggregateTo", "M", "", "destination", "(Lkotlin/collections/Grouping;Ljava/util/Map;Lkotlin/jvm/functions/Function4;)Ljava/util/Map;", "eachCountTo", "", "(Lkotlin/collections/Grouping;Ljava/util/Map;)Ljava/util/Map;", "fold", "initialValueSelector", "Lkotlin/Function2;", "Lkotlin/Function3;", "initialValue", "(Lkotlin/collections/Grouping;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/Map;", "foldTo", "(Lkotlin/collections/Grouping;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)Ljava/util/Map;", "(Lkotlin/collections/Grouping;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/Map;", "reduce", "S", "reduceTo", "(Lkotlin/collections/Grouping;Ljava/util/Map;Lkotlin/jvm/functions/Function3;)Ljava/util/Map;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/GroupingKt")
@SourceDebugExtension({"SMAP\nGrouping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n1#1,291:1\n80#1,6:292\n53#1:298\n80#1,6:299\n80#1,6:305\n53#1:311\n80#1,6:312\n80#1,6:318\n53#1:324\n80#1,6:325\n80#1,6:331\n189#1:337\n80#1,6:338\n*S KotlinDebug\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n53#1:292,6\n112#1:298\n112#1:299,6\n143#1:305,6\n164#1:311\n164#1:312,6\n189#1:318,6\n211#1:324\n211#1:325,6\n239#1:331,6\n257#1:337\n257#1:338,6\n*E\n"})
/* loaded from: classes5.dex */
class t0 extends s0 {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @SinceKotlin(version = "1.1")
    @d5.d
    public static final <T, K, R> Map<K, R> c(@d5.d Grouping<T, ? extends K> grouping, @d5.d q3.r<? super K, ? super R, ? super T, ? super Boolean, ? extends R> rVar) {
        kotlin.jvm.internal.l0.p(grouping, ProtectedSandApp.s("㠪"));
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("㠫"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b6 = grouping.b();
        while (b6.hasNext()) {
            ?? next = b6.next();
            Object a6 = grouping.a(next);
            c.C0000c c0000c = (Object) linkedHashMap.get(a6);
            linkedHashMap.put(a6, rVar.S(a6, c0000c, next, Boolean.valueOf(c0000c == null && !linkedHashMap.containsKey(a6))));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @SinceKotlin(version = "1.1")
    @d5.d
    public static final <T, K, R, M extends Map<? super K, R>> M d(@d5.d Grouping<T, ? extends K> grouping, @d5.d M m5, @d5.d q3.r<? super K, ? super R, ? super T, ? super Boolean, ? extends R> rVar) {
        kotlin.jvm.internal.l0.p(grouping, ProtectedSandApp.s("㠬"));
        kotlin.jvm.internal.l0.p(m5, ProtectedSandApp.s("㠭"));
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("㠮"));
        Iterator<T> b6 = grouping.b();
        while (b6.hasNext()) {
            ?? next = b6.next();
            Object a6 = grouping.a(next);
            c.C0000c c0000c = (Object) m5.get(a6);
            m5.put(a6, rVar.S(a6, c0000c, next, Boolean.valueOf(c0000c == null && !m5.containsKey(a6))));
        }
        return m5;
    }

    @SinceKotlin(version = "1.1")
    @d5.d
    public static final <T, K, M extends Map<? super K, Integer>> M e(@d5.d Grouping<T, ? extends K> grouping, @d5.d M m5) {
        kotlin.jvm.internal.l0.p(grouping, ProtectedSandApp.s("㠯"));
        kotlin.jvm.internal.l0.p(m5, ProtectedSandApp.s("㠰"));
        Iterator<T> b6 = grouping.b();
        while (b6.hasNext()) {
            K a6 = grouping.a(b6.next());
            Object obj = m5.get(a6);
            if (obj == null && !m5.containsKey(a6)) {
                obj = 0;
            }
            m5.put(a6, Integer.valueOf(((Number) obj).intValue() + 1));
        }
        return m5;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @SinceKotlin(version = "1.1")
    @d5.d
    public static final <T, K, R> Map<K, R> f(@d5.d Grouping<T, ? extends K> grouping, R r5, @d5.d q3.p<? super R, ? super T, ? extends R> pVar) {
        kotlin.jvm.internal.l0.p(grouping, ProtectedSandApp.s("㠱"));
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("㠲"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b6 = grouping.b();
        while (b6.hasNext()) {
            ?? next = b6.next();
            K a6 = grouping.a(next);
            c.C0000c.a aVar = (Object) linkedHashMap.get(a6);
            if (aVar == null && !linkedHashMap.containsKey(a6)) {
                aVar = (Object) r5;
            }
            linkedHashMap.put(a6, pVar.g0(aVar, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @SinceKotlin(version = "1.1")
    @d5.d
    public static final <T, K, R> Map<K, R> g(@d5.d Grouping<T, ? extends K> grouping, @d5.d q3.p<? super K, ? super T, ? extends R> pVar, @d5.d q3.q<? super K, ? super R, ? super T, ? extends R> qVar) {
        kotlin.jvm.internal.l0.p(grouping, ProtectedSandApp.s("㠳"));
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("㠴"));
        kotlin.jvm.internal.l0.p(qVar, ProtectedSandApp.s("㠵"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b6 = grouping.b();
        while (b6.hasNext()) {
            ?? next = b6.next();
            Object a6 = grouping.a(next);
            R r5 = (Object) linkedHashMap.get(a6);
            if (r5 == null && !linkedHashMap.containsKey(a6)) {
                r5 = pVar.g0(a6, next);
            }
            linkedHashMap.put(a6, qVar.G(a6, r5, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @SinceKotlin(version = "1.1")
    @d5.d
    public static final <T, K, R, M extends Map<? super K, R>> M h(@d5.d Grouping<T, ? extends K> grouping, @d5.d M m5, R r5, @d5.d q3.p<? super R, ? super T, ? extends R> pVar) {
        kotlin.jvm.internal.l0.p(grouping, ProtectedSandApp.s("㠶"));
        kotlin.jvm.internal.l0.p(m5, ProtectedSandApp.s("㠷"));
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("㠸"));
        Iterator<T> b6 = grouping.b();
        while (b6.hasNext()) {
            ?? next = b6.next();
            K a6 = grouping.a(next);
            c.C0000c.a aVar = (Object) m5.get(a6);
            if (aVar == null && !m5.containsKey(a6)) {
                aVar = (Object) r5;
            }
            m5.put(a6, pVar.g0(aVar, next));
        }
        return m5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @SinceKotlin(version = "1.1")
    @d5.d
    public static final <T, K, R, M extends Map<? super K, R>> M i(@d5.d Grouping<T, ? extends K> grouping, @d5.d M m5, @d5.d q3.p<? super K, ? super T, ? extends R> pVar, @d5.d q3.q<? super K, ? super R, ? super T, ? extends R> qVar) {
        kotlin.jvm.internal.l0.p(grouping, ProtectedSandApp.s("㠹"));
        kotlin.jvm.internal.l0.p(m5, ProtectedSandApp.s("㠺"));
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("㠻"));
        kotlin.jvm.internal.l0.p(qVar, ProtectedSandApp.s("㠼"));
        Iterator<T> b6 = grouping.b();
        while (b6.hasNext()) {
            ?? next = b6.next();
            Object a6 = grouping.a(next);
            R r5 = (Object) m5.get(a6);
            if (r5 == null && !m5.containsKey(a6)) {
                r5 = pVar.g0(a6, next);
            }
            m5.put(a6, qVar.G(a6, r5, next));
        }
        return m5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.1")
    @d5.d
    public static final <S, T extends S, K> Map<K, S> j(@d5.d Grouping<T, ? extends K> grouping, @d5.d q3.q<? super K, ? super S, ? super T, ? extends S> qVar) {
        kotlin.jvm.internal.l0.p(grouping, ProtectedSandApp.s("㠽"));
        kotlin.jvm.internal.l0.p(qVar, ProtectedSandApp.s("㠾"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator b6 = grouping.b();
        while (b6.hasNext()) {
            S s5 = (Object) b6.next();
            Object a6 = grouping.a(s5);
            c.C0000c c0000c = (Object) linkedHashMap.get(a6);
            if (!(c0000c == null && !linkedHashMap.containsKey(a6))) {
                s5 = qVar.G(a6, c0000c, s5);
            }
            linkedHashMap.put(a6, s5);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.1")
    @d5.d
    public static final <S, T extends S, K, M extends Map<? super K, S>> M k(@d5.d Grouping<T, ? extends K> grouping, @d5.d M m5, @d5.d q3.q<? super K, ? super S, ? super T, ? extends S> qVar) {
        kotlin.jvm.internal.l0.p(grouping, ProtectedSandApp.s("㠿"));
        kotlin.jvm.internal.l0.p(m5, ProtectedSandApp.s("㡀"));
        kotlin.jvm.internal.l0.p(qVar, ProtectedSandApp.s("㡁"));
        Iterator b6 = grouping.b();
        while (b6.hasNext()) {
            S s5 = (Object) b6.next();
            Object a6 = grouping.a(s5);
            c.C0000c c0000c = (Object) m5.get(a6);
            if (!(c0000c == null && !m5.containsKey(a6))) {
                s5 = qVar.G(a6, c0000c, s5);
            }
            m5.put(a6, s5);
        }
        return m5;
    }
}
