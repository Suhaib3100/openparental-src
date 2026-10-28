package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Grouping.kt */
@Metadata(d1 = {"\u0000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\u001a¥\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032b\u0010\f\u001a^\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00018\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00020\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a¹\u0001\u0010\u0013\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0016\b\u0003\u0010\u0011*\u0010\u0012\u0006\b\u0000\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0012\u001a\u00028\u00032b\u0010\f\u001a^\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00018\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00020\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001aÆ\u0001\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000326\u0010\u0016\u001a2\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u00152K\u0010\f\u001aG\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u0017H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001aÚ\u0001\u0010\u001a\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0016\b\u0003\u0010\u0011*\u0010\u0012\u0006\b\u0000\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0012\u001a\u00028\u000326\u0010\u0016\u001a2\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u00152K\u0010\f\u001aG\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u0017H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0081\u0001\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u001c\u001a\u00028\u000226\u0010\f\u001a2\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u0015H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0095\u0001\u0010\u001f\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0016\b\u0003\u0010\u0011*\u0010\u0012\u0006\b\u0000\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0012\u001a\u00028\u00032\u0006\u0010\u001c\u001a\u00028\u000226\u0010\f\u001a2\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u0015H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0092\u0001\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010!\"\b\b\u0001\u0010\u0000*\u00028\u0000\"\u0004\b\u0002\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00032K\u0010\f\u001aG\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00000\u0017H\u0087\bø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a¦\u0001\u0010$\u001a\u00028\u0003\"\u0004\b\u0000\u0010!\"\b\b\u0001\u0010\u0000*\u00028\u0000\"\u0004\b\u0002\u0010\u0001\"\u0016\b\u0003\u0010\u0011*\u0010\u0012\u0006\b\u0000\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\u0010*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0012\u001a\u00028\u00032K\u0010\f\u001aG\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00000\u0017H\u0087\bø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001aK\u0010'\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0016\b\u0002\u0010\u0011*\u0010\u0012\u0006\b\u0000\u0012\u00028\u0001\u0012\u0004\u0012\u00020&0\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0012\u001a\u00028\u0002H\u0007¢\u0006\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006)"}, d2 = {"T", "K", "R", "Lkotlin/collections/n0;", "Lkotlin/Function4;", "Lkotlin/r0;", "name", "key", "accumulator", "element", "", "first", "operation", "", "c", "(Lkotlin/collections/n0;Lld/r;)Ljava/util/Map;", "", "M", "destination", "d", "(Lkotlin/collections/n0;Ljava/util/Map;Lld/r;)Ljava/util/Map;", "Lkotlin/Function2;", "initialValueSelector", "Lkotlin/Function3;", "g", "(Lkotlin/collections/n0;Lld/p;Lld/q;)Ljava/util/Map;", "i", "(Lkotlin/collections/n0;Ljava/util/Map;Lld/p;Lld/q;)Ljava/util/Map;", "initialValue", "f", "(Lkotlin/collections/n0;Ljava/lang/Object;Lld/p;)Ljava/util/Map;", "h", "(Lkotlin/collections/n0;Ljava/util/Map;Ljava/lang/Object;Lld/p;)Ljava/util/Map;", "S", "j", "(Lkotlin/collections/n0;Lld/q;)Ljava/util/Map;", "k", "(Lkotlin/collections/n0;Ljava/util/Map;Lld/q;)Ljava/util/Map;", "", "e", "(Lkotlin/collections/n0;Ljava/util/Map;)Ljava/util/Map;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/GroupingKt")
@kotlin.jvm.internal.r1({"SMAP\nGrouping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n1#1,291:1\n80#1,6:292\n53#1:298\n80#1,6:299\n80#1,6:305\n53#1:311\n80#1,6:312\n80#1,6:318\n53#1:324\n80#1,6:325\n80#1,6:331\n189#1:337\n80#1,6:338\n*S KotlinDebug\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n53#1:292,6\n112#1:298\n112#1:299,6\n143#1:305,6\n164#1:311\n164#1:312,6\n189#1:318,6\n211#1:324\n211#1:325,6\n239#1:331,6\n257#1:337\n257#1:338,6\n*E\n"})
/* loaded from: classes7.dex */
class q0 extends p0 {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @fg.l
    @kotlin.c1(version = "1.1")
    public static final <T, K, R> Map<K, R> c(@fg.l n0<T, ? extends K> n0Var, @fg.l ld.r<? super K, ? super R, ? super T, ? super Boolean, ? extends R> rVar) {
        kotlin.jvm.internal.l0.p(n0Var, ProtectedSandApp.s("懸\u0001"));
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("懹\u0001"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b5 = n0Var.b();
        while (b5.hasNext()) {
            ?? next = b5.next();
            Object a5 = n0Var.a(next);
            a0.b0 b0Var = (Object) linkedHashMap.get(a5);
            linkedHashMap.put(a5, rVar.i(a5, b0Var, next, Boolean.valueOf(b0Var == null && !linkedHashMap.containsKey(a5))));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @fg.l
    @kotlin.c1(version = "1.1")
    public static final <T, K, R, M extends Map<? super K, R>> M d(@fg.l n0<T, ? extends K> n0Var, @fg.l M m4, @fg.l ld.r<? super K, ? super R, ? super T, ? super Boolean, ? extends R> rVar) {
        kotlin.jvm.internal.l0.p(n0Var, ProtectedSandApp.s("懸\u0001"));
        kotlin.jvm.internal.l0.p(m4, ProtectedSandApp.s("懺\u0001"));
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("懹\u0001"));
        Iterator<T> b5 = n0Var.b();
        while (b5.hasNext()) {
            ?? next = b5.next();
            Object a5 = n0Var.a(next);
            a0.b0 b0Var = (Object) m4.get(a5);
            m4.put(a5, rVar.i(a5, b0Var, next, Boolean.valueOf(b0Var == null && !m4.containsKey(a5))));
        }
        return m4;
    }

    @fg.l
    @kotlin.c1(version = "1.1")
    public static final <T, K, M extends Map<? super K, Integer>> M e(@fg.l n0<T, ? extends K> n0Var, @fg.l M m4) {
        kotlin.jvm.internal.l0.p(n0Var, ProtectedSandApp.s("懸\u0001"));
        kotlin.jvm.internal.l0.p(m4, ProtectedSandApp.s("懺\u0001"));
        Iterator<T> b5 = n0Var.b();
        while (b5.hasNext()) {
            K a5 = n0Var.a(b5.next());
            Object obj = m4.get(a5);
            if (obj == null && !m4.containsKey(a5)) {
                obj = 0;
            }
            m4.put(a5, Integer.valueOf(((Number) obj).intValue() + 1));
        }
        return m4;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @fg.l
    @kotlin.c1(version = "1.1")
    public static final <T, K, R> Map<K, R> f(@fg.l n0<T, ? extends K> n0Var, R r4, @fg.l ld.p<? super R, ? super T, ? extends R> pVar) {
        kotlin.jvm.internal.l0.p(n0Var, ProtectedSandApp.s("懸\u0001"));
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("懹\u0001"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b5 = n0Var.b();
        while (b5.hasNext()) {
            ?? next = b5.next();
            K a5 = n0Var.a(next);
            a0.c cVar = (Object) linkedHashMap.get(a5);
            if (cVar == null && !linkedHashMap.containsKey(a5)) {
                cVar = (Object) r4;
            }
            linkedHashMap.put(a5, pVar.invoke(cVar, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @fg.l
    @kotlin.c1(version = "1.1")
    public static final <T, K, R> Map<K, R> g(@fg.l n0<T, ? extends K> n0Var, @fg.l ld.p<? super K, ? super T, ? extends R> pVar, @fg.l ld.q<? super K, ? super R, ? super T, ? extends R> qVar) {
        kotlin.jvm.internal.l0.p(n0Var, ProtectedSandApp.s("懸\u0001"));
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("懻\u0001"));
        kotlin.jvm.internal.l0.p(qVar, ProtectedSandApp.s("懹\u0001"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b5 = n0Var.b();
        while (b5.hasNext()) {
            ?? next = b5.next();
            Object a5 = n0Var.a(next);
            R r4 = (Object) linkedHashMap.get(a5);
            if (r4 == null && !linkedHashMap.containsKey(a5)) {
                r4 = pVar.invoke(a5, next);
            }
            linkedHashMap.put(a5, qVar.R(a5, r4, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @fg.l
    @kotlin.c1(version = "1.1")
    public static final <T, K, R, M extends Map<? super K, R>> M h(@fg.l n0<T, ? extends K> n0Var, @fg.l M m4, R r4, @fg.l ld.p<? super R, ? super T, ? extends R> pVar) {
        kotlin.jvm.internal.l0.p(n0Var, ProtectedSandApp.s("懸\u0001"));
        kotlin.jvm.internal.l0.p(m4, ProtectedSandApp.s("懺\u0001"));
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("懹\u0001"));
        Iterator<T> b5 = n0Var.b();
        while (b5.hasNext()) {
            ?? next = b5.next();
            K a5 = n0Var.a(next);
            a0.c cVar = (Object) m4.get(a5);
            if (cVar == null && !m4.containsKey(a5)) {
                cVar = (Object) r4;
            }
            m4.put(a5, pVar.invoke(cVar, next));
        }
        return m4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @fg.l
    @kotlin.c1(version = "1.1")
    public static final <T, K, R, M extends Map<? super K, R>> M i(@fg.l n0<T, ? extends K> n0Var, @fg.l M m4, @fg.l ld.p<? super K, ? super T, ? extends R> pVar, @fg.l ld.q<? super K, ? super R, ? super T, ? extends R> qVar) {
        kotlin.jvm.internal.l0.p(n0Var, ProtectedSandApp.s("懸\u0001"));
        kotlin.jvm.internal.l0.p(m4, ProtectedSandApp.s("懺\u0001"));
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("懻\u0001"));
        kotlin.jvm.internal.l0.p(qVar, ProtectedSandApp.s("懹\u0001"));
        Iterator<T> b5 = n0Var.b();
        while (b5.hasNext()) {
            ?? next = b5.next();
            Object a5 = n0Var.a(next);
            R r4 = (Object) m4.get(a5);
            if (r4 == null && !m4.containsKey(a5)) {
                r4 = pVar.invoke(a5, next);
            }
            m4.put(a5, qVar.R(a5, r4, next));
        }
        return m4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    @kotlin.c1(version = "1.1")
    public static final <S, T extends S, K> Map<K, S> j(@fg.l n0<T, ? extends K> n0Var, @fg.l ld.q<? super K, ? super S, ? super T, ? extends S> qVar) {
        kotlin.jvm.internal.l0.p(n0Var, ProtectedSandApp.s("懸\u0001"));
        kotlin.jvm.internal.l0.p(qVar, ProtectedSandApp.s("懹\u0001"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator b5 = n0Var.b();
        while (b5.hasNext()) {
            S s4 = (Object) b5.next();
            Object a5 = n0Var.a(s4);
            a0.b0 b0Var = (Object) linkedHashMap.get(a5);
            if (!(b0Var == null && !linkedHashMap.containsKey(a5))) {
                s4 = qVar.R(a5, b0Var, s4);
            }
            linkedHashMap.put(a5, s4);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    @kotlin.c1(version = "1.1")
    public static final <S, T extends S, K, M extends Map<? super K, S>> M k(@fg.l n0<T, ? extends K> n0Var, @fg.l M m4, @fg.l ld.q<? super K, ? super S, ? super T, ? extends S> qVar) {
        kotlin.jvm.internal.l0.p(n0Var, ProtectedSandApp.s("懸\u0001"));
        kotlin.jvm.internal.l0.p(m4, ProtectedSandApp.s("懺\u0001"));
        kotlin.jvm.internal.l0.p(qVar, ProtectedSandApp.s("懹\u0001"));
        Iterator b5 = n0Var.b();
        while (b5.hasNext()) {
            S s4 = (Object) b5.next();
            Object a5 = n0Var.a(s4);
            a0.b0 b0Var = (Object) m4.get(a5);
            if (!(b0Var == null && !m4.containsKey(a5))) {
                s4 = qVar.R(a5, b0Var, s4);
            }
            m4.put(a5, s4);
        }
        return m4;
    }
}
