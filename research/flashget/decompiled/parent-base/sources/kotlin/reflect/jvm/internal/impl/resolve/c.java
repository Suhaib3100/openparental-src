package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.types.checker.e;
import kotlin.reflect.jvm.internal.impl.types.h1;

/* loaded from: classes7.dex */
class c implements e.a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f77861a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.a f77862b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.a f77863c;

    public c(boolean z4, kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        this.f77861a = z4;
        this.f77862b = aVar;
        this.f77863c = aVar2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.e.a
    public boolean a(h1 h1Var, h1 h1Var2) {
        boolean d5;
        d5 = d.d(this.f77861a, this.f77862b, this.f77863c, h1Var, h1Var2);
        return d5;
    }
}
