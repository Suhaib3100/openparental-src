package net.time4j.calendar.hindu;

import androidx.compose.runtime.snapshots.f0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.time4j.engine.l;

/* compiled from: HinduCS.java */
/* loaded from: classes7.dex */
abstract class c implements l<d> {

    /* renamed from: b, reason: collision with root package name */
    static final long f82500b = -1132959;

    /* renamed from: a, reason: collision with root package name */
    final j f82501a;

    c(j jVar) {
        jVar.getClass();
        this.f82501a = jVar;
    }

    static double n(double d5, double d6) {
        return d5 - (Math.floor(d5 / d6) * d6);
    }

    @Override // net.time4j.engine.l
    public List<net.time4j.engine.j> a() {
        return Collections.unmodifiableList(new ArrayList(Arrays.asList(f.values())));
    }

    @Override // net.time4j.engine.l
    public long f(d dVar) {
        return dVar.b();
    }

    abstract d i(int i4, g gVar, e eVar);

    abstract d j(long j4);

    final boolean k(int i4, g gVar) {
        return !j(i(i4, gVar, e.e(15)).b()).B0().h().equals(gVar.h());
    }

    final boolean l(int i4, g gVar, e eVar) {
        d j4 = j(i(i4, gVar, eVar).b());
        return (j4.A0() == i4 && j4.B0().equals(gVar) && j4.w0().equals(eVar)) ? false : true;
    }

    abstract boolean m(int i4, g gVar, e eVar);

    public final long o(d dVar) {
        return dVar.b();
    }

    @Override // net.time4j.engine.l
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final d e(long j4) {
        long g4 = g();
        long d5 = d();
        if (j4 >= g4 && j4 <= d5) {
            return j(j4);
        }
        String s4 = ProtectedSandApp.s("邅\u0001");
        String s5 = ProtectedSandApp.s("邆\u0001");
        StringBuilder a5 = f0.a(s4, g4, s5);
        a5.append(j4);
        a5.append(s5);
        a5.append(d5);
        throw new IllegalArgumentException(a5.toString());
    }
}
