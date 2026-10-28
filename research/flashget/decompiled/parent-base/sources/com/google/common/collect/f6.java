package com.google.common.collect;

import com.google.common.collect.s6;
import com.google.common.collect.y3;
import java.util.Map;

/* compiled from: SingletonImmutableTable.java */
@w0
@d9.b
/* loaded from: classes6.dex */
class f6<R, C, V> extends y3<R, C, V> {

    /* renamed from: d, reason: collision with root package name */
    final R f55738d;

    /* renamed from: e, reason: collision with root package name */
    final C f55739e;

    /* renamed from: f, reason: collision with root package name */
    final V f55740f;

    f6(R r4, C c5, V v4) {
        r4.getClass();
        this.f55738d = r4;
        c5.getClass();
        this.f55739e = c5;
        v4.getClass();
        this.f55740f = v4;
    }

    @Override // com.google.common.collect.y3, com.google.common.collect.s6
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public h3<R, V> n1(C c5) {
        c5.getClass();
        return S(c5) ? h3.u(this.f55738d, this.f55740f) : h3.t();
    }

    @Override // com.google.common.collect.y3, com.google.common.collect.s6
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public h3<C, Map<R, V>> j1() {
        return h3.u(this.f55739e, h3.u(this.f55738d, this.f55740f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.y3, com.google.common.collect.q
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public q3<s6.a<R, C, V>> b() {
        return q3.K(y3.g(this.f55738d, this.f55739e, this.f55740f));
    }

    @Override // com.google.common.collect.y3
    y3.b q() {
        return y3.b.a(this, new int[]{0}, new int[]{0});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.y3, com.google.common.collect.q
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public b3<V> c() {
        return q3.K(this.f55740f);
    }

    @Override // com.google.common.collect.s6
    public int size() {
        return 1;
    }

    @Override // com.google.common.collect.y3, com.google.common.collect.s6
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public h3<R, Map<C, V>> m() {
        return h3.u(this.f55738d, h3.u(this.f55739e, this.f55740f));
    }

    f6(s6.a<R, C, V> aVar) {
        this(aVar.a(), aVar.b(), aVar.getValue());
    }
}
