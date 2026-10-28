package net.time4j.format.expert;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import net.time4j.engine.ChronoException;

/* compiled from: ParsedValue.java */
/* loaded from: classes7.dex */
class y extends x<y> {

    /* renamed from: c, reason: collision with root package name */
    private Map<net.time4j.engine.q<?>, Object> f83065c = null;

    /* renamed from: b, reason: collision with root package name */
    private Object f83064b = null;

    y() {
    }

    @Override // net.time4j.engine.r
    public Set<net.time4j.engine.q<?>> A() {
        Map<net.time4j.engine.q<?>, Object> map = this.f83065c;
        return map == null ? Collections.emptySet() : Collections.unmodifiableSet(map.keySet());
    }

    @Override // net.time4j.format.expert.x
    <E> E P() {
        return (E) this.f83064b;
    }

    @Override // net.time4j.format.expert.x
    void Q(net.time4j.engine.q<?> qVar, int i4) {
        qVar.getClass();
        Map map = this.f83065c;
        if (map == null) {
            map = new HashMap();
            this.f83065c = map;
        }
        map.put(qVar, Integer.valueOf(i4));
    }

    @Override // net.time4j.format.expert.x
    void R(net.time4j.engine.q<?> qVar, Object obj) {
        qVar.getClass();
        if (obj != null) {
            Map map = this.f83065c;
            if (map == null) {
                map = new HashMap();
                this.f83065c = map;
            }
            map.put(qVar, obj);
            return;
        }
        Map<net.time4j.engine.q<?>, Object> map2 = this.f83065c;
        if (map2 != null) {
            map2.remove(qVar);
            if (this.f83065c.isEmpty()) {
                this.f83065c = null;
            }
        }
    }

    @Override // net.time4j.format.expert.x
    void S(Object obj) {
        this.f83064b = obj;
    }

    @Override // net.time4j.engine.r, net.time4j.engine.p
    public int l(net.time4j.engine.q<Integer> qVar) {
        qVar.getClass();
        Map<net.time4j.engine.q<?>, Object> map = this.f83065c;
        if (map == null || !map.containsKey(qVar)) {
            return Integer.MIN_VALUE;
        }
        return qVar.getType().cast(map.get(qVar)).intValue();
    }

    @Override // net.time4j.engine.r, net.time4j.engine.p
    public <V> V r(net.time4j.engine.q<V> qVar) {
        qVar.getClass();
        Map<net.time4j.engine.q<?>, Object> map = this.f83065c;
        if (map == null || !map.containsKey(qVar)) {
            throw new ChronoException(net.time4j.g0.a(qVar, new StringBuilder(ProtectedSandApp.s("镱\u0001"))));
        }
        return qVar.getType().cast(map.get(qVar));
    }

    @Override // net.time4j.engine.r, net.time4j.engine.p
    public boolean w(net.time4j.engine.q<?> qVar) {
        Map<net.time4j.engine.q<?>, Object> map;
        if (qVar == null || (map = this.f83065c) == null) {
            return false;
        }
        return map.containsKey(qVar);
    }
}
