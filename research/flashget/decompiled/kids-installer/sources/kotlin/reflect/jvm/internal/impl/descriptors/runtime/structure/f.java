package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes5.dex */
public abstract class f implements b4.b {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    public static final a f24402b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @d5.e
    private final kotlin.reflect.jvm.internal.impl.name.f f24403a;

    /* compiled from: ReflectJavaAnnotationArguments.kt */
    public static final class a {
        private a() {
        }

        @d5.d
        public final f a(@d5.d Object obj, @d5.e kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(obj, ProtectedSandApp.s("䢯"));
            return d.h(obj.getClass()) ? new q(fVar, (Enum) obj) : obj instanceof Annotation ? new g(fVar, (Annotation) obj) : obj instanceof Object[] ? new j(fVar, (Object[]) obj) : obj instanceof Class ? new m(fVar, (Class) obj) : new s(fVar, obj);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ f(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.jvm.internal.w wVar) {
        this(fVar);
    }

    @Override // b4.b
    @d5.e
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        return this.f24403a;
    }

    private f(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        this.f24403a = fVar;
    }
}
