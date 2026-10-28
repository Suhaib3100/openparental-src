package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Set;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.w;
import kotlin.reflect.jvm.internal.impl.load.java.p;
import kotlin.text.v;
import wd.u;

/* compiled from: ReflectJavaClassFinder.kt */
/* loaded from: classes7.dex */
public final class d implements p {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final ClassLoader f76209a;

    public d(@fg.l ClassLoader classLoader) {
        l0.p(classLoader, ProtectedSandApp.s("湘\u0001"));
        this.f76209a = classLoader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.p
    @fg.m
    public wd.g a(@fg.l p.a aVar) {
        l0.p(aVar, ProtectedSandApp.s("湙\u0001"));
        kotlin.reflect.jvm.internal.impl.name.b a5 = aVar.a();
        kotlin.reflect.jvm.internal.impl.name.c h4 = a5.h();
        l0.o(h4, ProtectedSandApp.s("湚\u0001"));
        String b5 = a5.i().b();
        l0.o(b5, ProtectedSandApp.s("湛\u0001"));
        String h22 = v.h2(b5, '.', '$', false, 4, null);
        if (!h4.d()) {
            h22 = h4.b() + '.' + h22;
        }
        Class<?> a6 = e.a(this.f76209a, h22);
        if (a6 != null) {
            return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l(a6);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.p
    @fg.m
    public u b(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar, boolean z4) {
        l0.p(cVar, ProtectedSandApp.s("湜\u0001"));
        return new w(cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.p
    @fg.m
    public Set<String> c(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("湝\u0001"));
        return null;
    }
}
