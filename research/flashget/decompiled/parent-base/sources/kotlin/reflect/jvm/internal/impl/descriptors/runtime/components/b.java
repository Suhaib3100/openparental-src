package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;

/* compiled from: ReflectAnnotationSource.kt */
/* loaded from: classes7.dex */
public final class b implements a1 {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final Annotation f76207b;

    public b(@fg.l Annotation annotation) {
        l0.p(annotation, ProtectedSandApp.s("湂\u0001"));
        this.f76207b = annotation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a1
    @fg.l
    public b1 b() {
        b1 b1Var = b1.f75928a;
        l0.o(b1Var, ProtectedSandApp.s("湃\u0001"));
        return b1Var;
    }

    @fg.l
    public final Annotation d() {
        return this.f76207b;
    }
}
