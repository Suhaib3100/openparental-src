package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes7.dex */
public final class m extends f implements wd.h {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final Class<?> f76269c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l Class<?> cls) {
        super(fVar, null);
        l0.p(cls, ProtectedSandApp.s("滮\u0001"));
        this.f76269c = cls;
    }

    @Override // wd.h
    @fg.l
    public wd.x a() {
        return z.f76282a.a(this.f76269c);
    }
}
