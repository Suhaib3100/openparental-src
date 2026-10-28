package androidx.compose.ui.text.caches;

import androidx.compose.runtime.internal.u;
import androidx.compose.ui.text.platform.z;
import fg.l;
import fg.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kd.i;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LruCache.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u0007J\u0017\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0007J\u0017\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u000fJ1\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00012\b\u0010\u0017\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001a\u0010\u000fJ\u001f\u0010\u001b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u001b\u0010\u000bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0004¢\u0006\u0004\b \u0010\u001fJ\r\u0010!\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u001fJ\r\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u001fJ\r\u0010#\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\u001fJ\r\u0010$\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\u001fJ\u0019\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J$\u0010.\u001a\u00028\u0002\"\u0004\b\u0002\u0010+2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00020,H\u0080\b¢\u0006\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R0\u00107\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000104j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`58\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00106R$\u0010;\u001a\u0012\u0012\u0004\u0012\u00028\u000008j\b\u0012\u0004\u0012\u00028\u0000`98\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010:R$\u0010?\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u00048G@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010=\u001a\u0004\b>\u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010=R\u0016\u0010@\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010=R\u0016\u0010A\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010=R\u0016\u0010B\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010=R\u0016\u0010C\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010=R\u0016\u0010D\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010=¨\u0006E"}, d2 = {"Landroidx/compose/ui/text/caches/b;", "K", "V", "", "", "maxSize", "<init>", "(I)V", "key", "value", "o", "(Ljava/lang/Object;Ljava/lang/Object;)I", "Lkotlin/k2;", "n", "g", "(Ljava/lang/Object;)Ljava/lang/Object;", "k", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "t", "m", "", "evicted", "oldValue", "newValue", "d", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "b", "q", "e", "()V", "i", "()I", "h", "j", "c", "l", "f", "", "r", "()Ljava/util/Map;", "", "toString", "()Ljava/lang/String;", "R", "Lkotlin/Function0;", "block", "s", "(Lld/a;)Ljava/lang/Object;", "Landroidx/compose/ui/text/platform/z;", "a", "Landroidx/compose/ui/text/platform/z;", "monitor", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "map", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Ljava/util/LinkedHashSet;", "keySet", "<set-?>", "I", "p", "size", "putCount", "createCount", "evictionCount", "hitCount", "missCount", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u(parameters = 0)
@r1({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/compose/ui/text/caches/LruCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,351:1\n348#1:352\n348#1:361\n348#1:363\n348#1:365\n348#1:367\n348#1:369\n348#1:371\n26#2:353\n26#2:355\n26#2:356\n26#2:357\n26#2:358\n26#2:359\n26#2:360\n26#2:362\n26#2:364\n26#2:366\n26#2:368\n26#2:370\n26#2:372\n26#2:373\n26#2:374\n26#2:375\n1#3:354\n*S KotlinDebug\n*F\n+ 1 LruCache.kt\nandroidx/compose/ui/text/caches/LruCache\n*L\n40#1:352\n295#1:361\n301#1:363\n307#1:365\n312#1:367\n317#1:369\n322#1:371\n40#1:353\n71#1:355\n86#1:356\n104#1:357\n142#1:358\n176#1:359\n218#1:360\n295#1:362\n301#1:364\n307#1:366\n312#1:368\n317#1:370\n322#1:372\n329#1:373\n339#1:374\n348#1:375\n*E\n"})
/* loaded from: classes.dex */
public class b<K, V> {

    /* renamed from: k, reason: collision with root package name */
    public static final int f20611k = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final z monitor = new z();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final HashMap<K, V> map;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final LinkedHashSet<K> keySet;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int maxSize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int putCount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int createCount;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int evictionCount;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int hitCount;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int missCount;

    public b(int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.maxSize = i4;
        this.map = new HashMap<>(0, 0.75f);
        this.keySet = new LinkedHashSet<>();
    }

    private final int o(K key, V value) {
        int q4 = q(key, value);
        if (q4 >= 0) {
            return q4;
        }
        throw new IllegalStateException(("Negative size: " + key + '=' + value).toString());
    }

    @m
    protected V b(K key) {
        return null;
    }

    public final int c() {
        int i4;
        synchronized (this.monitor) {
            i4 = this.createCount;
        }
        return i4;
    }

    protected void d(boolean evicted, K key, V oldValue, @m V newValue) {
    }

    public final void e() {
        t(-1);
    }

    public final int f() {
        int i4;
        synchronized (this.monitor) {
            i4 = this.evictionCount;
        }
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    public final V g(K key) {
        synchronized (this.monitor) {
            V v4 = this.map.get(key);
            if (v4 != null) {
                this.keySet.remove(key);
                this.keySet.add(key);
                this.hitCount++;
                return v4;
            }
            this.missCount++;
            V b5 = b(key);
            if (b5 == null) {
                return null;
            }
            synchronized (this.monitor) {
                try {
                    this.createCount++;
                    Object put = this.map.put(key, b5);
                    this.keySet.remove(key);
                    this.keySet.add(key);
                    if (put != 0) {
                        this.map.put(key, put);
                        v4 = put;
                    } else {
                        this.size = p() + o(key, b5);
                    }
                    k2 k2Var = k2.f75408a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (v4 != null) {
                d(false, key, b5, v4);
                return v4;
            }
            t(this.maxSize);
            return b5;
        }
    }

    public final int h() {
        int i4;
        synchronized (this.monitor) {
            i4 = this.hitCount;
        }
        return i4;
    }

    public final int i() {
        int i4;
        synchronized (this.monitor) {
            i4 = this.maxSize;
        }
        return i4;
    }

    public final int j() {
        int i4;
        synchronized (this.monitor) {
            i4 = this.missCount;
        }
        return i4;
    }

    @m
    public final V k(K key, V value) {
        V put;
        if (key == null || value == null) {
            throw null;
        }
        synchronized (this.monitor) {
            try {
                this.putCount++;
                this.size = p() + o(key, value);
                put = this.map.put(key, value);
                if (put != null) {
                    this.size = p() - o(key, put);
                }
                if (this.keySet.contains(key)) {
                    this.keySet.remove(key);
                }
                this.keySet.add(key);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (put != null) {
            d(false, key, put, value);
        }
        t(this.maxSize);
        return put;
    }

    public final int l() {
        int i4;
        synchronized (this.monitor) {
            i4 = this.putCount;
        }
        return i4;
    }

    @m
    public final V m(K key) {
        V remove;
        key.getClass();
        synchronized (this.monitor) {
            try {
                remove = this.map.remove(key);
                this.keySet.remove(key);
                if (remove != null) {
                    this.size = p() - o(key, remove);
                }
                k2 k2Var = k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (remove != null) {
            d(false, key, remove, null);
        }
        return remove;
    }

    public void n(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this.monitor) {
            this.maxSize = maxSize;
            k2 k2Var = k2.f75408a;
        }
        t(maxSize);
    }

    @i(name = "size")
    public final int p() {
        int i4;
        synchronized (this.monitor) {
            i4 = this.size;
        }
        return i4;
    }

    protected int q(K key, V value) {
        return 1;
    }

    @l
    public final Map<K, V> r() {
        LinkedHashMap linkedHashMap;
        synchronized (this.monitor) {
            linkedHashMap = new LinkedHashMap();
            Iterator<K> it = this.keySet.iterator();
            while (it.hasNext()) {
                K next = it.next();
                V v4 = this.map.get(next);
                l0.m(v4);
                linkedHashMap.put(next, v4);
            }
        }
        return linkedHashMap;
    }

    public final <R> R s(@l ld.a<? extends R> block) {
        R invoke;
        synchronized (this.monitor) {
            invoke = block.invoke();
        }
        return invoke;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0094, code lost:
    
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(int r8) {
        /*
            r7 = this;
        L0:
            androidx.compose.ui.text.platform.z r0 = r7.monitor
            monitor-enter(r0)
            int r1 = r7.p()     // Catch: java.lang.Throwable -> L18
            if (r1 < 0) goto L8d
            java.util.HashMap<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1b
            int r1 = r7.p()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L8d
            goto L1b
        L18:
            r8 = move-exception
            goto L95
        L1b:
            java.util.HashMap<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashSet<K> r2 = r7.keySet     // Catch: java.lang.Throwable -> L18
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 != r2) goto L8d
            int r1 = r7.p()     // Catch: java.lang.Throwable -> L18
            r2 = 1
            r3 = 0
            if (r1 <= r8) goto L78
            java.util.HashMap<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L78
            java.util.LinkedHashSet<K> r1 = r7.keySet     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = kotlin.collections.w.z2(r1)     // Catch: java.lang.Throwable -> L18
            java.util.HashMap<K, V> r4 = r7.map     // Catch: java.lang.Throwable -> L18
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L70
            java.util.HashMap<K, V> r5 = r7.map     // Catch: java.lang.Throwable -> L18
            java.util.Map r5 = kotlin.jvm.internal.u1.k(r5)     // Catch: java.lang.Throwable -> L18
            r5.remove(r1)     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashSet<K> r5 = r7.keySet     // Catch: java.lang.Throwable -> L18
            java.util.Collection r5 = kotlin.jvm.internal.u1.a(r5)     // Catch: java.lang.Throwable -> L18
            r5.remove(r1)     // Catch: java.lang.Throwable -> L18
            int r5 = r7.p()     // Catch: java.lang.Throwable -> L18
            kotlin.jvm.internal.l0.m(r1)     // Catch: java.lang.Throwable -> L18
            kotlin.jvm.internal.l0.m(r4)     // Catch: java.lang.Throwable -> L18
            int r6 = r7.o(r1, r4)     // Catch: java.lang.Throwable -> L18
            int r5 = r5 - r6
            r7.size = r5     // Catch: java.lang.Throwable -> L18
            int r5 = r7.evictionCount     // Catch: java.lang.Throwable -> L18
            int r5 = r5 + r2
            r7.evictionCount = r5     // Catch: java.lang.Throwable -> L18
            goto L7a
        L70:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "inconsistent state"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L18
            throw r8     // Catch: java.lang.Throwable -> L18
        L78:
            r1 = r3
            r4 = r1
        L7a:
            kotlin.k2 r5 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)
            if (r1 != 0) goto L82
            if (r4 != 0) goto L82
            return
        L82:
            kotlin.jvm.internal.l0.m(r1)
            kotlin.jvm.internal.l0.m(r4)
            r7.d(r2, r1, r4, r3)
            goto L0
        L8d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "map/keySet size inconsistency"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L18
            throw r8     // Catch: java.lang.Throwable -> L18
        L95:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.caches.b.t(int):void");
    }

    @l
    public String toString() {
        String str;
        synchronized (this.monitor) {
            try {
                int i4 = this.hitCount;
                int i5 = this.missCount + i4;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i5 != 0 ? (i4 * 100) / i5 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
