package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: JavaClassDataFinder.kt */
/* loaded from: classes5.dex */
public final class i implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.h {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final p f25040a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final h f25041b;

    public i(@d5.d p pVar, @d5.d h hVar) {
        l0.p(pVar, ProtectedSandApp.s("䲍"));
        l0.p(hVar, ProtectedSandApp.s("䲎"));
        this.f25040a = pVar;
        this.f25041b = hVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.h
    @d5.e
    public kotlin.reflect.jvm.internal.impl.serialization.deserialization.g a(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("䲏"));
        r b6 = q.b(this.f25040a, bVar);
        if (b6 == null) {
            return null;
        }
        l0.g(b6.h(), bVar);
        return this.f25041b.i(b6);
    }
}
