package kotlin.sequences;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.a2;
import kotlin.c1;
import kotlin.g2;
import kotlin.jvm.internal.l0;
import kotlin.o2;
import kotlin.s1;
import kotlin.w1;

/* compiled from: _USequences.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00040\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00070\u0000H\u0007¢\u0006\u0004\b\b\u0010\u0003\u001a\u0019\u0010\n\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\t0\u0000H\u0007¢\u0006\u0004\b\n\u0010\u0003¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/m;", "Lkotlin/w1;", "b", "(Lkotlin/sequences/m;)I", "Lkotlin/a2;", "c", "(Lkotlin/sequences/m;)J", "Lkotlin/s1;", "a", "Lkotlin/g2;", "d", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/sequences/USequencesKt")
/* loaded from: classes7.dex */
class c0 {
    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    @kd.i(name = "sumOfUByte")
    public static final int a(@fg.l m<s1> mVar) {
        l0.p(mVar, ProtectedSandApp.s("苝\u0001"));
        Iterator<s1> it = mVar.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += w1.h(it.next().getData() & 255);
        }
        return i4;
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    @kd.i(name = "sumOfUInt")
    public static final int b(@fg.l m<w1> mVar) {
        l0.p(mVar, ProtectedSandApp.s("苝\u0001"));
        Iterator<w1> it = mVar.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += it.next().getData();
        }
        return i4;
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    @kd.i(name = "sumOfULong")
    public static final long c(@fg.l m<a2> mVar) {
        l0.p(mVar, ProtectedSandApp.s("苝\u0001"));
        Iterator<a2> it = mVar.iterator();
        long j4 = 0;
        while (it.hasNext()) {
            j4 += it.next().getData();
        }
        return j4;
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    @kd.i(name = "sumOfUShort")
    public static final int d(@fg.l m<g2> mVar) {
        l0.p(mVar, ProtectedSandApp.s("苝\u0001"));
        Iterator<g2> it = mVar.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += w1.h(it.next().getData() & g2.f75095e);
        }
        return i4;
    }
}
