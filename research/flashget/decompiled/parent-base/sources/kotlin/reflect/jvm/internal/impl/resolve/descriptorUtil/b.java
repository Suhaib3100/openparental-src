package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.reflect.jvm.internal.impl.utils.b;

/* loaded from: classes7.dex */
class b implements b.d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f77906a;

    public b(boolean z4) {
        this.f77906a = z4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.b.d
    public Iterable a(Object obj) {
        Iterable g4;
        g4 = c.g(this.f77906a, (kotlin.reflect.jvm.internal.impl.descriptors.b) obj);
        return g4;
    }
}
