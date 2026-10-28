package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.a2;
import kotlin.b2;
import kotlin.g2;
import kotlin.h2;
import kotlin.o2;
import kotlin.w1;
import kotlin.x1;

/* compiled from: _UCollections.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0007\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00050\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\t0\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\r0\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0012\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u0014\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\t0\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0013\u001a\u0019\u0010\u0017\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\r0\u0011H\u0007¢\u0006\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, d2 = {"", "Lkotlin/s1;", "Lkotlin/t1;", "e", "(Ljava/util/Collection;)[B", "Lkotlin/w1;", "Lkotlin/x1;", "f", "(Ljava/util/Collection;)[I", "Lkotlin/a2;", "Lkotlin/b2;", "g", "(Ljava/util/Collection;)[J", "Lkotlin/g2;", "Lkotlin/h2;", "h", "(Ljava/util/Collection;)[S", "", "b", "(Ljava/lang/Iterable;)I", "c", "(Ljava/lang/Iterable;)J", "a", "d", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/UCollectionsKt")
/* loaded from: classes7.dex */
class v1 {
    @o2(markerClass = {kotlin.t.class})
    @kotlin.c1(version = "1.5")
    @kd.i(name = "sumOfUByte")
    public static final int a(@fg.l Iterable<kotlin.s1> iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("或\u0001"));
        Iterator<kotlin.s1> it = iterable.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += w1.h(it.next().getData() & 255);
        }
        return i4;
    }

    @o2(markerClass = {kotlin.t.class})
    @kotlin.c1(version = "1.5")
    @kd.i(name = "sumOfUInt")
    public static final int b(@fg.l Iterable<w1> iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("或\u0001"));
        Iterator<w1> it = iterable.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += it.next().getData();
        }
        return i4;
    }

    @o2(markerClass = {kotlin.t.class})
    @kotlin.c1(version = "1.5")
    @kd.i(name = "sumOfULong")
    public static final long c(@fg.l Iterable<a2> iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("或\u0001"));
        Iterator<a2> it = iterable.iterator();
        long j4 = 0;
        while (it.hasNext()) {
            j4 += it.next().getData();
        }
        return j4;
    }

    @o2(markerClass = {kotlin.t.class})
    @kotlin.c1(version = "1.5")
    @kd.i(name = "sumOfUShort")
    public static final int d(@fg.l Iterable<g2> iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("或\u0001"));
        Iterator<g2> it = iterable.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += w1.h(it.next().getData() & g2.f75095e);
        }
        return i4;
    }

    @fg.l
    @kotlin.c1(version = "1.3")
    @kotlin.t
    public static final byte[] e(@fg.l Collection<kotlin.s1> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("或\u0001"));
        byte[] f4 = kotlin.t1.f(collection.size());
        Iterator<kotlin.s1> it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            f4[i4] = it.next().getData();
            i4++;
        }
        return f4;
    }

    @fg.l
    @kotlin.c1(version = "1.3")
    @kotlin.t
    public static final int[] f(@fg.l Collection<w1> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("或\u0001"));
        int[] f4 = x1.f(collection.size());
        Iterator<w1> it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            f4[i4] = it.next().getData();
            i4++;
        }
        return f4;
    }

    @fg.l
    @kotlin.c1(version = "1.3")
    @kotlin.t
    public static final long[] g(@fg.l Collection<a2> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("或\u0001"));
        long[] f4 = b2.f(collection.size());
        Iterator<a2> it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            f4[i4] = it.next().getData();
            i4++;
        }
        return f4;
    }

    @fg.l
    @kotlin.c1(version = "1.3")
    @kotlin.t
    public static final short[] h(@fg.l Collection<g2> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("或\u0001"));
        short[] f4 = h2.f(collection.size());
        Iterator<g2> it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            f4[i4] = it.next().getData();
            i4++;
        }
        return f4;
    }
}
