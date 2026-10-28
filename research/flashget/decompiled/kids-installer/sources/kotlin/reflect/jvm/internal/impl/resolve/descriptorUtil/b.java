package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.reflect.jvm.internal.impl.utils.b;

/* loaded from: classes5.dex */
class b implements b.d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f25923a;

    public b(boolean z5) {
        this.f25923a = z5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.b.d
    public Iterable a(Object obj) {
        Iterable g5;
        g5 = c.g(this.f25923a, (kotlin.reflect.jvm.internal.impl.descriptors.b) obj);
        return g5;
    }
}
