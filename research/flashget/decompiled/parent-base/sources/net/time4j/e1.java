package net.time4j;

import java.util.Collections;
import java.util.Locale;
import java.util.Set;

/* compiled from: WeekExtension.java */
/* loaded from: classes7.dex */
class e1 implements net.time4j.engine.s {
    e1() {
    }

    @Override // net.time4j.engine.s
    public net.time4j.engine.r<?> a(net.time4j.engine.r<?> rVar, Locale locale, net.time4j.engine.d dVar) {
        return rVar;
    }

    @Override // net.time4j.engine.s
    public Set<net.time4j.engine.q<?>> b(Locale locale, net.time4j.engine.d dVar) {
        return locale.getCountry().isEmpty() ? Collections.emptySet() : i1.k(locale).d();
    }

    @Override // net.time4j.engine.s
    public boolean c(net.time4j.engine.q<?> qVar) {
        return false;
    }

    @Override // net.time4j.engine.s
    public boolean d(Class<?> cls) {
        return false;
    }
}
