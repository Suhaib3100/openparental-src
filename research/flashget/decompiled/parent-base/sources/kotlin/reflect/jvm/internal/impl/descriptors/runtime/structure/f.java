package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes7.dex */
public abstract class f implements wd.b {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static final a f76252b = new a();

    /* renamed from: a, reason: collision with root package name */
    @fg.m
    private final kotlin.reflect.jvm.internal.impl.name.f f76253a;

    /* compiled from: ReflectJavaAnnotationArguments.kt */
    public static final class a {
        private a() {
        }

        @fg.l
        public final f a(@fg.l Object obj, @fg.m kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(obj, ProtectedSandApp.s("滅\u0001"));
            return d.h(obj.getClass()) ? new q(fVar, (Enum) obj) : obj instanceof Annotation ? new g(fVar, (Annotation) obj) : obj instanceof Object[] ? new j(fVar, (Object[]) obj) : obj instanceof Class ? new m(fVar, (Class) obj) : new s(fVar, obj);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ f(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.jvm.internal.w wVar) {
        this(fVar);
    }

    @Override // wd.b
    @fg.m
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        return this.f76253a;
    }

    private f(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        this.f76253a = fVar;
    }
}
