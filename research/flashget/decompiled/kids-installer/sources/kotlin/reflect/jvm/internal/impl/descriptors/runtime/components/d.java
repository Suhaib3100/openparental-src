package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import b4.u;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Set;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.w;
import kotlin.reflect.jvm.internal.impl.load.java.p;
import kotlin.text.Typography;
import kotlin.text.e0;

/* compiled from: ReflectJavaClassFinder.kt */
/* loaded from: classes5.dex */
public final class d implements p {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final ClassLoader f24359a;

    public d(@d5.d ClassLoader classLoader) {
        l0.p(classLoader, ProtectedSandApp.s("䡌"));
        this.f24359a = classLoader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.p
    @d5.e
    public b4.g a(@d5.d p.a aVar) {
        String h22;
        l0.p(aVar, ProtectedSandApp.s("䡍"));
        kotlin.reflect.jvm.internal.impl.name.b a6 = aVar.a();
        kotlin.reflect.jvm.internal.impl.name.c h5 = a6.h();
        l0.o(h5, ProtectedSandApp.s("䡎"));
        String b6 = a6.i().b();
        l0.o(b6, ProtectedSandApp.s("䡏"));
        h22 = e0.h2(b6, org.apache.commons.io.k.f32026a, Typography.f27127c, false, 4, null);
        if (!h5.d()) {
            h22 = h5.b() + org.apache.commons.io.k.f32026a + h22;
        }
        Class<?> a7 = e.a(this.f24359a, h22);
        if (a7 != null) {
            return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l(a7);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.p
    @d5.e
    public Set<String> b(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("䡐"));
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.p
    @d5.e
    public u c(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, boolean z5) {
        l0.p(cVar, ProtectedSandApp.s("䡑"));
        return new w(cVar);
    }
}
