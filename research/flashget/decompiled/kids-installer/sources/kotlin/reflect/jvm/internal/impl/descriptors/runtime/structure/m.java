package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes6.dex */
public final class m extends f implements b4.h {

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final Class<?> f24419c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d Class<?> cls) {
        super(fVar, null);
        l0.p(cls, ProtectedSandApp.s("莔"));
        this.f24419c = cls;
    }

    @Override // b4.h
    @d5.d
    public b4.x c() {
        return z.f24432a.a(this.f24419c);
    }
}
