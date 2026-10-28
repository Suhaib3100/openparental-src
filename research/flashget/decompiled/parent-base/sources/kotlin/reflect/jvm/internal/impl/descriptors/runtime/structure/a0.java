package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: ReflectJavaTypeParameter.kt */
@r1({"SMAP\nReflectJavaTypeParameter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaTypeParameter.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaTypeParameter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,50:1\n11065#2:51\n11400#2,3:52\n*S KotlinDebug\n*F\n+ 1 ReflectJavaTypeParameter.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaTypeParameter\n*L\n29#1:51\n29#1:52,3\n*E\n"})
/* loaded from: classes7.dex */
public final class a0 extends p implements h, wd.y {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final TypeVariable<?> f76227a;

    public a0(@fg.l TypeVariable<?> typeVariable) {
        l0.p(typeVariable, ProtectedSandApp.s("溁\u0001"));
        this.f76227a = typeVariable;
    }

    @Override // wd.d
    public boolean E() {
        return false;
    }

    @Override // wd.y
    @fg.l
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public List<n> getUpperBounds() {
        Type[] bounds = this.f76227a.getBounds();
        l0.o(bounds, ProtectedSandApp.s("溂\u0001"));
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new n(type));
        }
        n nVar = (n) kotlin.collections.w.k5(arrayList);
        return l0.g(nVar != null ? nVar.O() : null, Object.class) ? j0.f74919b : arrayList;
    }

    public boolean equals(@fg.m Object obj) {
        return (obj instanceof a0) && l0.g(this.f76227a, ((a0) obj).f76227a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h
    @fg.m
    public AnnotatedElement getElement() {
        TypeVariable<?> typeVariable = this.f76227a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    @Override // wd.t
    @fg.l
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        kotlin.reflect.jvm.internal.impl.name.f f4 = kotlin.reflect.jvm.internal.impl.name.f.f(this.f76227a.getName());
        l0.o(f4, ProtectedSandApp.s("溃\u0001"));
        return f4;
    }

    public int hashCode() {
        return this.f76227a.hashCode();
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        m2.a(a0.class, sb, ProtectedSandApp.s("溅\u0001"));
        sb.append(this.f76227a);
        return sb.toString();
    }

    @Override // wd.d
    @fg.l
    public List<e> getAnnotations() {
        Annotation[] declaredAnnotations;
        List<e> b5;
        AnnotatedElement element = getElement();
        return (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null || (b5 = i.b(declaredAnnotations)) == null) ? j0.f74919b : b5;
    }

    @Override // wd.d
    @fg.m
    public e k(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        Annotation[] declaredAnnotations;
        l0.p(cVar, ProtectedSandApp.s("溄\u0001"));
        AnnotatedElement element = getElement();
        if (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null) {
            return null;
        }
        return i.a(declaredAnnotations, cVar);
    }
}
