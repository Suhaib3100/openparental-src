package net.time4j.calendar.service;

import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import net.time4j.calendar.EthiopianTime;
import net.time4j.engine.q;
import net.time4j.engine.r;
import net.time4j.engine.s;
import net.time4j.m0;

/* compiled from: EthiopianExtension.java */
/* loaded from: classes7.dex */
public class b implements s {
    /* JADX WARN: Type inference failed for: r2v1, types: [net.time4j.engine.r, net.time4j.engine.r<?>] */
    @Override // net.time4j.engine.s
    public r<?> a(r<?> rVar, Locale locale, net.time4j.engine.d dVar) {
        q<?> qVar = EthiopianTime.f81962k;
        if (!rVar.w(qVar)) {
            return rVar;
        }
        int intValue = ((Integer) rVar.r(qVar)).intValue();
        if (intValue == 12) {
            intValue = 0;
        }
        int i4 = intValue + 6;
        if (i4 >= 12) {
            i4 = intValue - 6;
        }
        return rVar.K(m0.f83373x, i4);
    }

    @Override // net.time4j.engine.s
    public Set<q<?>> b(Locale locale, net.time4j.engine.d dVar) {
        return Collections.singleton(EthiopianTime.f81962k);
    }

    @Override // net.time4j.engine.s
    public boolean c(q<?> qVar) {
        return EthiopianTime.f81962k.equals(qVar);
    }

    @Override // net.time4j.engine.s
    public boolean d(Class<?> cls) {
        return false;
    }
}
