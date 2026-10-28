package kotlin.reflect.full;

import kotlin.reflect.KClass;
import kotlin.reflect.KProperty1;
import kotlin.reflect.jvm.internal.impl.utils.b;

/* loaded from: classes5.dex */
class e implements b.d {

    /* renamed from: a, reason: collision with root package name */
    private final KProperty1 f23787a;

    public e(KProperty1 kProperty1) {
        this.f23787a = kProperty1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.b.d
    public Iterable a(Object obj) {
        Iterable W;
        W = f.W(this.f23787a, (KClass) obj);
        return W;
    }
}
