package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.d1;

/* compiled from: TypeAttributeTranslator.kt */
/* loaded from: classes5.dex */
public final class p implements c1 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final p f26514a = new p();

    private p() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.c1
    @d5.d
    public d1 a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.e h1 h1Var, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        List<? extends b1<?>> k5;
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("垐"));
        if (gVar.isEmpty()) {
            d1.f26381p.getClass();
            return d1.f26382q;
        }
        d1.a aVar = d1.f26381p;
        k5 = kotlin.collections.z.k(new k(gVar));
        return aVar.g(k5);
    }
}
