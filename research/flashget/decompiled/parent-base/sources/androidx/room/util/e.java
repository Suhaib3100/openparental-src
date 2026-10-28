package androidx.room.util;

import androidx.annotation.c1;
import androidx.collection.e1;
import fg.l;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;

/* compiled from: RelationUtil.kt */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
@kd.i(name = "RelationUtil")
@Metadata(d1 = {"\u00004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ay\u0010\u000b\u001a\u00020\t\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00022\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00042\u0006\u0010\u0007\u001a\u00020\u00062.\u0010\n\u001a*\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0004\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f\u001aC\u0010\u000e\u001a\u00020\t\"\u0004\b\u0000\u0010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000e\u0010\u000f\u001aY\u0010\u0011\u001a\u00020\t\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "K", "V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "map", "", "isRelationCollection", "Lkotlin/Function1;", "Lkotlin/k2;", "fetchBlock", "b", "(Ljava/util/HashMap;ZLld/l;)V", "Landroidx/collection/e1;", "c", "(Landroidx/collection/e1;ZLld/l;)V", "Landroidx/collection/a;", "a", "(Landroidx/collection/a;ZLld/l;)V", "room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e {
    public static final <K, V> void a(@l androidx.collection.a<K, V> map, boolean z4, @l ld.l<? super androidx.collection.a<K, V>, k2> fetchBlock) {
        l0.p(map, "map");
        l0.p(fetchBlock, "fetchBlock");
        androidx.collection.a aVar = new androidx.collection.a(999);
        int size = map.getSize();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            if (z4) {
                aVar.put(map.keyAt(i4), map.valueAt(i4));
            } else {
                aVar.put(map.keyAt(i4), null);
            }
            i4++;
            i5++;
            if (i5 == 999) {
                fetchBlock.invoke(aVar);
                if (!z4) {
                    map.putAll((Map) aVar);
                }
                aVar.clear();
                i5 = 0;
            }
        }
        if (i5 > 0) {
            fetchBlock.invoke(aVar);
            if (z4) {
                return;
            }
            map.putAll((Map) aVar);
        }
    }

    public static final <K, V> void b(@l HashMap<K, V> map, boolean z4, @l ld.l<? super HashMap<K, V>, k2> fetchBlock) {
        int i4;
        l0.p(map, "map");
        l0.p(fetchBlock, "fetchBlock");
        HashMap hashMap = new HashMap(999);
        loop0: while (true) {
            i4 = 0;
            for (K key : map.keySet()) {
                if (z4) {
                    l0.o(key, "key");
                    hashMap.put(key, map.get(key));
                } else {
                    l0.o(key, "key");
                    hashMap.put(key, null);
                }
                i4++;
                if (i4 == 999) {
                    fetchBlock.invoke(hashMap);
                    if (!z4) {
                        map.putAll(hashMap);
                    }
                    hashMap.clear();
                }
            }
            break loop0;
        }
        if (i4 > 0) {
            fetchBlock.invoke(hashMap);
            if (z4) {
                return;
            }
            map.putAll(hashMap);
        }
    }

    public static final <V> void c(@l e1<V> map, boolean z4, @l ld.l<? super e1<V>, k2> fetchBlock) {
        l0.p(map, "map");
        l0.p(fetchBlock, "fetchBlock");
        e1<? extends V> e1Var = new e1<>(999);
        int z5 = map.z();
        int i4 = 0;
        int i5 = 0;
        while (i4 < z5) {
            if (z4) {
                e1Var.p(map.o(i4), map.A(i4));
            } else {
                e1Var.p(map.o(i4), null);
            }
            i4++;
            i5++;
            if (i5 == 999) {
                fetchBlock.invoke(e1Var);
                if (!z4) {
                    map.q(e1Var);
                }
                e1Var.c();
                i5 = 0;
            }
        }
        if (i5 > 0) {
            fetchBlock.invoke(e1Var);
            if (z4) {
                return;
            }
            map.q(e1Var);
        }
    }
}
