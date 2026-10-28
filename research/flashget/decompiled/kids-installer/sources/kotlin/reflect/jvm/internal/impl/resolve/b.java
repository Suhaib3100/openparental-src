package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.types.checker.e;
import kotlin.reflect.jvm.internal.impl.types.h1;

/* loaded from: classes5.dex */
class b implements e.a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f25879a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.a f25880b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.a f25881c;

    public b(boolean z5, kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        this.f25879a = z5;
        this.f25880b = aVar;
        this.f25881c = aVar2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.e.a
    public boolean a(h1 h1Var, h1 h1Var2) {
        boolean d6;
        d6 = c.d(this.f25879a, this.f25880b, this.f25881c, h1Var, h1Var2);
        return d6;
    }
}
