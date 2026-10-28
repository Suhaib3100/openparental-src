package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;

/* compiled from: ReflectAnnotationSource.kt */
/* loaded from: classes5.dex */
public final class b implements a1 {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final Annotation f24357b;

    public b(@d5.d Annotation annotation) {
        l0.p(annotation, ProtectedSandApp.s("䠞"));
        this.f24357b = annotation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a1
    @d5.d
    public b1 a() {
        b1 b1Var = b1.f24130a;
        l0.o(b1Var, ProtectedSandApp.s("䠟"));
        return b1Var;
    }

    @d5.d
    public final Annotation d() {
        return this.f24357b;
    }
}
