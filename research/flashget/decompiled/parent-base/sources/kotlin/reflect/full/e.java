package kotlin.reflect.full;

import kotlin.reflect.jvm.internal.impl.utils.b;
import kotlin.reflect.q;

/* loaded from: classes7.dex */
class e implements b.d {

    /* renamed from: a, reason: collision with root package name */
    private final q f75536a;

    public e(q qVar) {
        this.f75536a = qVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.b.d
    public Iterable a(Object obj) {
        Iterable W;
        W = f.W(this.f75536a, (kotlin.reflect.d) obj);
        return W;
    }
}
