package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.n1;
import kotlin.reflect.jvm.internal.impl.descriptors.o1;
import sd.a;

/* compiled from: ReflectJavaMember.kt */
@r1({"SMAP\nReflectJavaMember.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaMember.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaMember\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
/* loaded from: classes7.dex */
public abstract class t extends p implements h, v, wd.q {
    @Override // wd.d
    public boolean E() {
        return false;
    }

    @Override // wd.q
    @fg.l
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public l N() {
        Class<?> declaringClass = P().getDeclaringClass();
        l0.o(declaringClass, ProtectedSandApp.s("滶\u0001"));
        return new l(declaringClass);
    }

    @fg.l
    public abstract Member P();

    @fg.l
    protected final List<wd.b0> Q(@fg.l Type[] typeArr, @fg.l Annotation[][] annotationArr, boolean z4) {
        String str;
        l0.p(typeArr, ProtectedSandApp.s("滷\u0001"));
        l0.p(annotationArr, ProtectedSandApp.s("滸\u0001"));
        ArrayList arrayList = new ArrayList(typeArr.length);
        List<String> b5 = c.f76238a.b(P());
        int size = b5 != null ? b5.size() - typeArr.length : 0;
        int length = typeArr.length;
        int i4 = 0;
        while (i4 < length) {
            z a5 = z.f76282a.a(typeArr[i4]);
            if (b5 != null) {
                str = (String) kotlin.collections.w.W2(b5, i4 + size);
                if (str == null) {
                    throw new IllegalStateException((ProtectedSandApp.s("滹\u0001") + i4 + '+' + size + ProtectedSandApp.s("滺\u0001") + getName() + ProtectedSandApp.s("滻\u0001") + a5 + ProtectedSandApp.s("滼\u0001") + this).toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new b0(a5, annotationArr[i4], str, z4 && i4 == kotlin.collections.l.we(typeArr)));
            i4++;
        }
        return arrayList;
    }

    public boolean equals(@fg.m Object obj) {
        return (obj instanceof t) && l0.g(P(), ((t) obj).P());
    }

    @Override // wd.d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h
    @fg.l
    public AnnotatedElement getElement() {
        Member P = P();
        l0.n(P, ProtectedSandApp.s("滽\u0001"));
        return (AnnotatedElement) P;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.v
    public int getModifiers() {
        return P().getModifiers();
    }

    @Override // wd.t
    @fg.l
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        String name = P().getName();
        kotlin.reflect.jvm.internal.impl.name.f f4 = name != null ? kotlin.reflect.jvm.internal.impl.name.f.f(name) : null;
        return f4 == null ? kotlin.reflect.jvm.internal.impl.name.h.f77589b : f4;
    }

    @Override // wd.s
    @fg.l
    public o1 getVisibility() {
        int modifiers = getModifiers();
        return Modifier.isPublic(modifiers) ? n1.h.f76199c : Modifier.isPrivate(modifiers) ? n1.e.f76196c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? a.c.f91854c : a.b.f91853c : a.C1395a.f91852c;
    }

    public int hashCode() {
        return P().hashCode();
    }

    @Override // wd.s
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // wd.s
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // wd.d
    public /* bridge */ /* synthetic */ wd.a k(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return k(cVar);
    }

    @Override // wd.s
    public boolean o() {
        return Modifier.isStatic(getModifiers());
    }

    @fg.l
    public String toString() {
        return getClass().getName() + ProtectedSandApp.s("滿\u0001") + P();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h, wd.d
    @fg.l
    public List<e> getAnnotations() {
        Annotation[] declaredAnnotations;
        List<e> b5;
        AnnotatedElement element = getElement();
        return (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null || (b5 = i.b(declaredAnnotations)) == null) ? j0.f74919b : b5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h, wd.d
    @fg.m
    public e k(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        Annotation[] declaredAnnotations;
        l0.p(cVar, ProtectedSandApp.s("滾\u0001"));
        AnnotatedElement element = getElement();
        if (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null) {
            return null;
        }
        return i.a(declaredAnnotations, cVar);
    }
}
