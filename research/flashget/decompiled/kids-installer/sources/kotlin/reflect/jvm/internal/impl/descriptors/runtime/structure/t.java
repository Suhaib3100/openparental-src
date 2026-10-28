package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.n1;
import kotlin.reflect.jvm.internal.impl.descriptors.o1;
import x3.a;

/* compiled from: ReflectJavaMember.kt */
/* loaded from: classes6.dex */
public abstract class t extends p implements h, v, b4.q {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h
    @d5.d
    public AnnotatedElement A() {
        Member V = V();
        l0.n(V, ProtectedSandApp.s("莜"));
        return (AnnotatedElement) V;
    }

    @Override // b4.s
    public boolean T() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // b4.q
    @d5.d
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public l S() {
        Class<?> declaringClass = V().getDeclaringClass();
        l0.o(declaringClass, ProtectedSandApp.s("莝"));
        return new l(declaringClass);
    }

    @d5.d
    public abstract Member V();

    @d5.d
    protected final List<b4.b0> W(@d5.d Type[] typeArr, @d5.d Annotation[][] annotationArr, boolean z5) {
        String str;
        boolean z6;
        int we;
        Object W2;
        l0.p(typeArr, ProtectedSandApp.s("莞"));
        l0.p(annotationArr, ProtectedSandApp.s("莟"));
        ArrayList arrayList = new ArrayList(typeArr.length);
        List<String> b6 = c.f24388a.b(V());
        int size = b6 != null ? b6.size() - typeArr.length : 0;
        int length = typeArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            z a6 = z.f24432a.a(typeArr[i5]);
            if (b6 != null) {
                W2 = j0.W2(b6, i5 + size);
                str = (String) W2;
                if (str == null) {
                    throw new IllegalStateException((ProtectedSandApp.s("莠") + i5 + '+' + size + ProtectedSandApp.s("莡") + getName() + ProtectedSandApp.s("莢") + a6 + ProtectedSandApp.s("莣") + this).toString());
                }
            } else {
                str = null;
            }
            if (z5) {
                we = kotlin.collections.t.we(typeArr);
                if (i5 == we) {
                    z6 = true;
                    arrayList.add(new b0(a6, annotationArr[i5], str, z6));
                }
            }
            z6 = false;
            arrayList.add(new b0(a6, annotationArr[i5], str, z6));
        }
        return arrayList;
    }

    @Override // b4.s
    public boolean a() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // b4.s
    @d5.d
    public o1 c() {
        int modifiers = getModifiers();
        return Modifier.isPublic(modifiers) ? n1.h.f24349c : Modifier.isPrivate(modifiers) ? n1.e.f24346c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? a.c.f34367c : a.b.f34366c : a.C0521a.f34365c;
    }

    @Override // b4.s
    public boolean d() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // b4.d
    public /* bridge */ /* synthetic */ b4.a e(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return e(cVar);
    }

    public boolean equals(@d5.e Object obj) {
        return (obj instanceof t) && l0.g(V(), ((t) obj).V());
    }

    @Override // b4.d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.v
    public int getModifiers() {
        return V().getModifiers();
    }

    @Override // b4.t
    @d5.d
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        String name = V().getName();
        kotlin.reflect.jvm.internal.impl.name.f p5 = name != null ? kotlin.reflect.jvm.internal.impl.name.f.p(name) : null;
        return p5 == null ? kotlin.reflect.jvm.internal.impl.name.h.f25606b : p5;
    }

    public int hashCode() {
        return V().hashCode();
    }

    @Override // b4.d
    public boolean o() {
        return false;
    }

    @d5.d
    public String toString() {
        return getClass().getName() + ProtectedSandApp.s("莥") + V();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h, b4.d
    @d5.e
    public e e(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        Annotation[] declaredAnnotations;
        l0.p(cVar, ProtectedSandApp.s("莤"));
        AnnotatedElement A = A();
        if (A == null || (declaredAnnotations = A.getDeclaredAnnotations()) == null) {
            return null;
        }
        return i.a(declaredAnnotations, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h, b4.d
    @d5.d
    public List<e> getAnnotations() {
        Annotation[] declaredAnnotations;
        List<e> b6;
        AnnotatedElement A = A();
        return (A == null || (declaredAnnotations = A.getDeclaredAnnotations()) == null || (b6 = i.b(declaredAnnotations)) == null) ? EmptyList.f23167o : b6;
    }
}
