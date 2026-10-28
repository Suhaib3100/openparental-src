package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes6.dex */
public final class g extends f implements b4.c {

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final Annotation f24404c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d Annotation annotation) {
        super(fVar, null);
        l0.p(annotation, ProtectedSandApp.s("荮"));
        this.f24404c = annotation;
    }

    @Override // b4.c
    @d5.d
    public b4.a a() {
        return new e(this.f24404c);
    }
}
