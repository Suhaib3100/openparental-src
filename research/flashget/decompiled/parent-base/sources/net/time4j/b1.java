package net.time4j;

/* compiled from: ValueOperator.java */
/* loaded from: classes7.dex */
final class b1<T> implements net.time4j.engine.v<T> {

    /* renamed from: b, reason: collision with root package name */
    private final net.time4j.engine.v<T> f81883b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f81884c;

    private b1(net.time4j.engine.v<T> vVar, Object obj) {
        this.f81883b = vVar;
        this.f81884c = obj;
    }

    static <T> b1 b(net.time4j.engine.v<T> vVar, Object obj) {
        return new b1(vVar, obj);
    }

    Object a() {
        return this.f81884c;
    }

    @Override // net.time4j.engine.v
    public T apply(T t4) {
        return this.f81883b.apply(t4);
    }
}
