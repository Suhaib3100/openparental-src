package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes6.dex */
public final class q extends f implements b4.m {

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final Enum<?> f24423c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d Enum<?> r32) {
        super(fVar, null);
        l0.p(r32, ProtectedSandApp.s("莭"));
        this.f24423c = r32;
    }

    @Override // b4.m
    @d5.e
    public kotlin.reflect.jvm.internal.impl.name.b b() {
        Class<?> cls = this.f24423c.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
        }
        l0.o(cls, ProtectedSandApp.s("莮"));
        return d.a(cls);
    }

    @Override // b4.m
    @d5.e
    public kotlin.reflect.jvm.internal.impl.name.f d() {
        return kotlin.reflect.jvm.internal.impl.name.f.p(this.f24423c.name());
    }
}
