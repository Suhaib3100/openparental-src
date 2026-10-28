package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f;

/* compiled from: ReflectJavaAnnotation.kt */
/* loaded from: classes6.dex */
public final class e extends p implements b4.a {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final Annotation f24401a;

    public e(@d5.d Annotation annotation) {
        l0.p(annotation, ProtectedSandApp.s("荪"));
        this.f24401a = annotation;
    }

    @d5.d
    public final Annotation U() {
        return this.f24401a;
    }

    @Override // b4.a
    @d5.d
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public l E() {
        return new l(p3.b.e(p3.b.a(this.f24401a)));
    }

    public boolean equals(@d5.e Object obj) {
        return (obj instanceof e) && this.f24401a == ((e) obj).f24401a;
    }

    @Override // b4.a
    @d5.d
    public Collection<b4.b> g() {
        Method[] declaredMethods = p3.b.e(p3.b.a(this.f24401a)).getDeclaredMethods();
        l0.o(declaredMethods, ProtectedSandApp.s("荫"));
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            f.a aVar = f.f24402b;
            Object invoke = method.invoke(this.f24401a, new Object[0]);
            l0.o(invoke, ProtectedSandApp.s("荬"));
            arrayList.add(aVar.a(invoke, kotlin.reflect.jvm.internal.impl.name.f.p(method.getName())));
        }
        return arrayList;
    }

    @Override // b4.a
    @d5.d
    public kotlin.reflect.jvm.internal.impl.name.b h() {
        return d.a(p3.b.e(p3.b.a(this.f24401a)));
    }

    public int hashCode() {
        return System.identityHashCode(this.f24401a);
    }

    @Override // b4.a
    public boolean j() {
        return false;
    }

    @Override // b4.a
    public boolean s() {
        return false;
    }

    @d5.d
    public String toString() {
        return e.class.getName() + ProtectedSandApp.s("荭") + this.f24401a;
    }
}
