package net.time4j.calendar.service;

import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import net.time4j.calendar.KoreanCalendar;
import net.time4j.engine.q;
import net.time4j.engine.r;
import net.time4j.engine.s;
import net.time4j.l0;

/* compiled from: KoreanExtension.java */
/* loaded from: classes7.dex */
public class f implements s {
    /* JADX WARN: Type inference failed for: r1v1, types: [net.time4j.engine.r, net.time4j.engine.r<?>] */
    @Override // net.time4j.engine.s
    public r<?> a(r<?> rVar, Locale locale, net.time4j.engine.d dVar) {
        if (!rVar.w(KoreanCalendar.f82179t)) {
            return rVar;
        }
        return rVar.K(l0.f83327r, rVar.l(r2) - 2333);
    }

    @Override // net.time4j.engine.s
    public Set<q<?>> b(Locale locale, net.time4j.engine.d dVar) {
        return Collections.emptySet();
    }

    @Override // net.time4j.engine.s
    public boolean c(q<?> qVar) {
        return qVar == KoreanCalendar.f82179t;
    }

    @Override // net.time4j.engine.s
    public boolean d(Class<?> cls) {
        return cls == l0.class;
    }
}
