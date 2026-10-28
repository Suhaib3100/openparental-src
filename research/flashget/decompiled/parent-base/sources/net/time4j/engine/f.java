package net.time4j.engine;

/* compiled from: BasicUnit.java */
/* loaded from: classes7.dex */
public abstract class f implements w {
    protected f() {
    }

    protected final <T extends r<T>> o0<T> a(T t4) {
        return b(t4.y());
    }

    protected <T extends r<T>> o0<T> b(x<T> xVar) {
        return null;
    }

    @Override // net.time4j.engine.w
    public boolean isCalendrical() {
        return Double.compare(getLength(), 86400.0d) >= 0;
    }
}
