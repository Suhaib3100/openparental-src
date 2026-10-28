package net.time4j.calendar.service;

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.lang.Comparable;
import net.time4j.calendar.o0;
import net.time4j.engine.b0;
import net.time4j.engine.h0;
import net.time4j.engine.q;
import net.time4j.engine.r;
import net.time4j.engine.v;
import net.time4j.engine.x;

/* compiled from: StdDateElement.java */
/* loaded from: classes7.dex */
public abstract class h<V extends Comparable<V>, T extends r<T>> extends net.time4j.format.d<V> implements o0<V, T> {

    /* renamed from: c, reason: collision with root package name */
    private final transient char f82645c;
    private final Class<T> chrono;

    /* renamed from: d, reason: collision with root package name */
    private final transient boolean f82646d;

    /* compiled from: StdDateElement.java */
    private static class a<T extends r<T>> implements v<T> {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f82647b;

        a(boolean z4) {
            this.f82647b = z4;
        }

        @Override // net.time4j.engine.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public T apply(T t4) {
            b0 b0Var = b0.UTC;
            long longValue = ((Long) t4.r(b0Var)).longValue();
            return (T) t4.L(b0Var, this.f82647b ? longValue - 1 : longValue + 1);
        }
    }

    public h(String str, Class<T> cls, char c5, boolean z4) {
        super(str);
        this.chrono = cls;
        this.f82645c = c5;
        this.f82646d = z4;
    }

    @Override // net.time4j.calendar.o0
    public v<T> b() {
        return h0.l(this);
    }

    @Override // net.time4j.calendar.o0
    public v<T> c() {
        return h0.j(this);
    }

    public v<T> f() {
        return this.f82646d ? new a(false) : h0.h(this);
    }

    @Override // net.time4j.engine.e, net.time4j.engine.q
    public char getSymbol() {
        return this.f82645c;
    }

    @Override // net.time4j.calendar.o0
    public v<T> h() {
        return h0.c(this);
    }

    @Override // net.time4j.engine.q
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.q
    public boolean isTimeElement() {
        return false;
    }

    @Override // net.time4j.calendar.o0
    public v<T> j() {
        return h0.d(this);
    }

    @Override // net.time4j.engine.e
    protected boolean k(net.time4j.engine.e<?> eVar) {
        return this.chrono == ((h) eVar).chrono;
    }

    public v<T> l() {
        return this.f82646d ? new a(true) : h0.f(this);
    }

    protected Object readResolve() throws ObjectStreamException {
        String name = name();
        for (q<?> qVar : x.N(this.chrono).H()) {
            if (qVar.name().equals(name)) {
                return qVar;
            }
        }
        throw new InvalidObjectException(name);
    }

    protected Class<T> y() {
        return this.chrono;
    }
}
