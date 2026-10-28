package net.time4j.tz.model;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.mmkv.MMKV;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.time4j.d0;
import net.time4j.engine.b0;
import net.time4j.tz.m;
import net.time4j.tz.p;
import net.time4j.tz.q;

/* compiled from: TransitionModel.java */
/* loaded from: classes7.dex */
public abstract class l implements m, Serializable {

    /* renamed from: b, reason: collision with root package name */
    static final String f83621b = System.getProperty(ProtectedSandApp.s("飱\u0001"));

    l() {
    }

    static void j(q qVar, Appendable appendable) throws IOException {
        appendable.append(ProtectedSandApp.s("飲\u0001")).append(d0.W0(qVar.e(), net.time4j.scale.f.POSIX).toString());
        appendable.append(ProtectedSandApp.s("飳\u0001")).append(k(qVar.f()));
        appendable.append(ProtectedSandApp.s("飴\u0001")).append(k(qVar.i()));
        appendable.append(ProtectedSandApp.s("飵\u0001"));
        appendable.append(k(qVar.d()));
        appendable.append(f83621b);
    }

    private static String k(int i4) {
        return p.o(i4).toString();
    }

    static long l(int i4) {
        return (System.currentTimeMillis() / 1000) + ((long) (i4 * 3.1556952E7d));
    }

    public static m m(List<q> list) {
        return new a(list, true, true);
    }

    public static m n(p pVar, List<d> list) {
        return list.isEmpty() ? new e(pVar) : new j(pVar, list, true);
    }

    public static m o(p pVar, List<q> list, List<d> list2) {
        return p(pVar, list, list2, true, true);
    }

    static m p(p pVar, List<q> list, List<d> list2, boolean z4, boolean z5) {
        List<q> list3;
        List<d> list4;
        if (z4) {
            ArrayList arrayList = new ArrayList(list);
            list4 = new ArrayList<>(list2);
            Collections.sort(arrayList);
            Collections.sort(list4, k.INSTANCE);
            list3 = arrayList;
        } else {
            list3 = list;
            list4 = list2;
        }
        int size = list3.size();
        if (size == 0) {
            return list4.isEmpty() ? new e(pVar) : new j(pVar, list4, false);
        }
        p o4 = p.o(list3.get(0).f());
        if (z5 && !pVar.equals(o4)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("飶\u0001") + pVar + ProtectedSandApp.s("飷\u0001") + o4);
        }
        if (list4.isEmpty()) {
            return new a(list3, false, z5);
        }
        q qVar = list3.get(size - 1);
        long e4 = qVar.e() + 1;
        long l4 = l(1);
        if (e4 < l4) {
            list3.addAll(j.B(qVar, list4, e4, l4));
        }
        return new b(size, list3, list4, false, z5);
    }

    static List<p> q(int i4) {
        return Collections.singletonList(p.o(i4));
    }

    static List<p> r(int i4, int i5) {
        p o4 = p.o(i4);
        p p4 = p.p(i5, 0);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(o4);
        arrayList.add(p4);
        return Collections.unmodifiableList(arrayList);
    }

    static long s(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return net.time4j.base.c.i(b0.UNIX.transform(net.time4j.base.b.j(aVar.o(), aVar.q(), aVar.t()), b0.MODIFIED_JULIAN_DATE), 86400L) + (gVar.u() * MMKV.ExpireInHour) + (gVar.m() * 60) + gVar.h();
    }

    @Override // net.time4j.tz.m
    public boolean e() {
        return false;
    }

    @Override // net.time4j.tz.m
    public boolean isEmpty() {
        return false;
    }
}
