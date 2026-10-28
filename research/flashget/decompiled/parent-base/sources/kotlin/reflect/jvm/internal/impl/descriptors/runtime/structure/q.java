package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes7.dex */
public final class q extends f implements wd.m {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final Enum<?> f76273c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l Enum<?> r32) {
        super(fVar, null);
        l0.p(r32, ProtectedSandApp.s("漃\u0001"));
        this.f76273c = r32;
    }

    @Override // wd.m
    @fg.m
    public kotlin.reflect.jvm.internal.impl.name.b b() {
        Class<?> cls = this.f76273c.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
        }
        l0.m(cls);
        return d.a(cls);
    }

    @Override // wd.m
    @fg.m
    public kotlin.reflect.jvm.internal.impl.name.f c() {
        return kotlin.reflect.jvm.internal.impl.name.f.f(this.f76273c.name());
    }
}
