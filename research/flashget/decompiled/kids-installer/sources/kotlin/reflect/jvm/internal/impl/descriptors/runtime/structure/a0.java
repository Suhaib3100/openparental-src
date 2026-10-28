package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaTypeParameter.kt */
/* loaded from: classes6.dex */
public final class a0 extends p implements h, b4.y {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final TypeVariable<?> f24377a;

    public a0(@d5.d TypeVariable<?> typeVariable) {
        l0.p(typeVariable, ProtectedSandApp.s("荔"));
        this.f24377a = typeVariable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h
    @d5.e
    public AnnotatedElement A() {
        TypeVariable<?> typeVariable = this.f24377a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    @Override // b4.y
    @d5.d
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public List<n> getUpperBounds() {
        Object k5;
        Type[] bounds = this.f24377a.getBounds();
        l0.o(bounds, ProtectedSandApp.s("荕"));
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new n(type));
        }
        k5 = j0.k5(arrayList);
        n nVar = (n) k5;
        return l0.g(nVar != null ? nVar.U() : null, Object.class) ? EmptyList.f23167o : arrayList;
    }

    public boolean equals(@d5.e Object obj) {
        return (obj instanceof a0) && l0.g(this.f24377a, ((a0) obj).f24377a);
    }

    @Override // b4.t
    @d5.d
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        kotlin.reflect.jvm.internal.impl.name.f p5 = kotlin.reflect.jvm.internal.impl.name.f.p(this.f24377a.getName());
        l0.o(p5, ProtectedSandApp.s("荗"));
        return p5;
    }

    public int hashCode() {
        return this.f24377a.hashCode();
    }

    @Override // b4.d
    public boolean o() {
        return false;
    }

    @d5.d
    public String toString() {
        return a0.class.getName() + ProtectedSandApp.s("荘") + this.f24377a;
    }

    @Override // b4.d
    @d5.e
    public e e(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        Annotation[] declaredAnnotations;
        l0.p(cVar, ProtectedSandApp.s("荖"));
        AnnotatedElement A = A();
        if (A == null || (declaredAnnotations = A.getDeclaredAnnotations()) == null) {
            return null;
        }
        return i.a(declaredAnnotations, cVar);
    }

    @Override // b4.d
    @d5.d
    public List<e> getAnnotations() {
        Annotation[] declaredAnnotations;
        List<e> b6;
        AnnotatedElement A = A();
        return (A == null || (declaredAnnotations = A.getDeclaredAnnotations()) == null || (b6 = i.b(declaredAnnotations)) == null) ? EmptyList.f23167o : b6;
    }
}
