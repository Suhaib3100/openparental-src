package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes7.dex */
public final class g extends f implements wd.c {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final Annotation f76254c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l Annotation annotation) {
        super(fVar, null);
        l0.p(annotation, ProtectedSandApp.s("滆\u0001"));
        this.f76254c = annotation;
    }

    @Override // wd.c
    @fg.l
    public wd.a d() {
        return new e(this.f76254c);
    }
}
