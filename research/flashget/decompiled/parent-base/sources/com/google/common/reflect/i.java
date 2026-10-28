package com.google.common.reflect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.e7;
import com.google.common.collect.f3;
import com.google.common.collect.o1;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

/* compiled from: Parameter.java */
@d9.a
@d
/* loaded from: classes6.dex */
public final class i implements AnnotatedElement {

    /* renamed from: b, reason: collision with root package name */
    private final f<?, ?> f57580b;

    /* renamed from: c, reason: collision with root package name */
    private final int f57581c;

    /* renamed from: d, reason: collision with root package name */
    private final p<?> f57582d;

    /* renamed from: e, reason: collision with root package name */
    private final f3<Annotation> f57583e;

    i(f<?, ?> fVar, int i4, p<?> pVar, Annotation[] annotationArr) {
        this.f57580b = fVar;
        this.f57581c = i4;
        this.f57582d = pVar;
        this.f57583e = f3.D(annotationArr);
    }

    public f<?, ?> c() {
        return this.f57580b;
    }

    public p<?> d() {
        return this.f57582d;
    }

    public boolean equals(@zc.a Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f57581c == iVar.f57581c && this.f57580b.equals(iVar.f57580b);
    }

    @Override // java.lang.reflect.AnnotatedElement
    @zc.a
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        cls.getClass();
        e7<Annotation> it = this.f57583e.iterator();
        while (it.hasNext()) {
            Annotation next = it.next();
            if (cls.isInstance(next)) {
                return cls.cast(next);
            }
        }
        return null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getAnnotations() {
        return getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A[] getAnnotationsByType(Class<A> cls) {
        return (A[]) getDeclaredAnnotationsByType(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    @zc.a
    public <A extends Annotation> A getDeclaredAnnotation(Class<A> cls) {
        cls.getClass();
        return (A) o1.F(this.f57583e).w(cls).x().j();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getDeclaredAnnotations() {
        return (Annotation[]) this.f57583e.toArray(new Annotation[0]);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A[] getDeclaredAnnotationsByType(Class<A> cls) {
        return (A[]) ((Annotation[]) o1.F(this.f57583e).w(cls).S(cls));
    }

    public int hashCode() {
        return this.f57581c;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return getAnnotation(cls) != null;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f57582d);
        int i4 = this.f57581c;
        StringBuilder sb = new StringBuilder(valueOf.length() + 15);
        sb.append(valueOf);
        sb.append(ProtectedSandApp.s("裸"));
        sb.append(i4);
        return sb.toString();
    }
}
