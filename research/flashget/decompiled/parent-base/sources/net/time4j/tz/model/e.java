package net.time4j.tz.model;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import net.time4j.tz.m;
import net.time4j.tz.p;
import net.time4j.tz.q;

/* compiled from: EmptyTransitionModel.java */
/* loaded from: classes7.dex */
final class e implements m, Serializable {
    private static final long serialVersionUID = 1374714021808040253L;
    private final p offset;

    e(p pVar) {
        this.offset = pVar;
    }

    @Override // net.time4j.tz.m
    public q a(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return null;
    }

    @Override // net.time4j.tz.m
    public List<q> b() {
        return Collections.emptyList();
    }

    @Override // net.time4j.tz.m
    public List<q> c(net.time4j.base.f fVar, net.time4j.base.f fVar2) {
        return Collections.emptyList();
    }

    @Override // net.time4j.tz.m
    public q d(net.time4j.base.f fVar) {
        return null;
    }

    @Override // net.time4j.tz.m
    public boolean e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.offset.equals(((e) obj).offset);
        }
        return false;
    }

    @Override // net.time4j.tz.m
    public p f() {
        return this.offset;
    }

    @Override // net.time4j.tz.m
    public void g(Appendable appendable) throws IOException {
        Appendable append = appendable.append(ProtectedSandApp.s("餒\u0001"));
        String str = l.f83621b;
        append.append(str).append(ProtectedSandApp.s("餓\u0001"));
        appendable.append(this.offset.canonical()).append(str);
    }

    @Override // net.time4j.tz.m
    public List<p> h(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return Collections.singletonList(this.offset);
    }

    public int hashCode() {
        return this.offset.hashCode();
    }

    @Override // net.time4j.tz.m
    public q i(net.time4j.base.f fVar) {
        return null;
    }

    @Override // net.time4j.tz.m
    public boolean isEmpty() {
        return true;
    }

    public String toString() {
        return ProtectedSandApp.s("餔\u0001") + this.offset.canonical();
    }
}
