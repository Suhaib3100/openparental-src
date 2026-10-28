package org.mp4parser.aspectj.internal.lang.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import lg.w;
import lg.x;
import lg.y;
import org.mp4parser.aspectj.lang.reflect.NoSuchAdviceException;
import org.mp4parser.aspectj.lang.reflect.NoSuchPointcutException;

/* compiled from: AjTypeImpl.java */
/* loaded from: classes9.dex */
public class b<T> implements lg.d<T> {

    /* renamed from: m, reason: collision with root package name */
    private static final String f87610m = "ajc$";

    /* renamed from: b, reason: collision with root package name */
    private Class<T> f87611b;

    /* renamed from: c, reason: collision with root package name */
    private y[] f87612c = null;

    /* renamed from: d, reason: collision with root package name */
    private y[] f87613d = null;

    /* renamed from: e, reason: collision with root package name */
    private lg.a[] f87614e = null;

    /* renamed from: f, reason: collision with root package name */
    private lg.a[] f87615f = null;

    /* renamed from: g, reason: collision with root package name */
    private lg.s[] f87616g = null;

    /* renamed from: h, reason: collision with root package name */
    private lg.s[] f87617h = null;

    /* renamed from: i, reason: collision with root package name */
    private lg.r[] f87618i = null;

    /* renamed from: j, reason: collision with root package name */
    private lg.r[] f87619j = null;

    /* renamed from: k, reason: collision with root package name */
    private lg.p[] f87620k = null;

    /* renamed from: l, reason: collision with root package name */
    private lg.p[] f87621l = null;

    public b(Class<T> cls) {
        this.f87611b = cls;
    }

    private void c(List<lg.k> list) {
        for (Field field : this.f87611b.getDeclaredFields()) {
            if (field.isAnnotationPresent(jg.k.class) && field.getType().isInterface()) {
                list.add(new e(((jg.k) field.getAnnotation(jg.k.class)).value(), field.getType().getName(), false, this));
            }
        }
    }

    private void d(List<lg.r> list, boolean z4) {
    }

    private void k0(List<lg.s> list, boolean z4) {
        if (Z()) {
            for (Field field : this.f87611b.getDeclaredFields()) {
                if (field.getType().isInterface() && field.isAnnotationPresent(jg.k.class) && ((jg.k) field.getAnnotation(jg.k.class)).defaultImpl() != jg.k.class) {
                    for (Method method : field.getType().getDeclaredMethods()) {
                        if (Modifier.isPublic(method.getModifiers()) || !z4) {
                            list.add(new k(this, lg.e.a(field.getType()), method, 1));
                        }
                    }
                }
            }
        }
    }

    private lg.a l0(Method method) {
        if (method.getAnnotations().length == 0) {
            return null;
        }
        jg.g gVar = (jg.g) method.getAnnotation(jg.g.class);
        if (gVar != null) {
            return new a(method, gVar.value(), lg.b.BEFORE);
        }
        jg.b bVar = (jg.b) method.getAnnotation(jg.b.class);
        if (bVar != null) {
            return new a(method, bVar.value(), lg.b.AFTER);
        }
        jg.c cVar = (jg.c) method.getAnnotation(jg.c.class);
        if (cVar != null) {
            String pointcut = cVar.pointcut();
            if (pointcut.equals("")) {
                pointcut = cVar.value();
            }
            return new a(method, pointcut, lg.b.AFTER_RETURNING, cVar.returning());
        }
        jg.d dVar = (jg.d) method.getAnnotation(jg.d.class);
        if (dVar != null) {
            String pointcut2 = dVar.pointcut();
            if (pointcut2 == null) {
                pointcut2 = dVar.value();
            }
            return new a(method, pointcut2, lg.b.AFTER_THROWING, dVar.throwing());
        }
        jg.e eVar = (jg.e) method.getAnnotation(jg.e.class);
        if (eVar != null) {
            return new a(method, eVar.value(), lg.b.AROUND);
        }
        return null;
    }

    private y m0(Method method) {
        int indexOf;
        jg.n nVar = (jg.n) method.getAnnotation(jg.n.class);
        if (nVar == null) {
            return null;
        }
        String name = method.getName();
        if (name.startsWith("ajc$") && (indexOf = (name = name.substring(name.indexOf("$$") + 2, name.length())).indexOf("$")) != -1) {
            name = name.substring(0, indexOf);
        }
        return new o(name, nVar.value(), method, lg.e.a(method.getDeclaringClass()), nVar.argNames());
    }

    private lg.a[] n0(Set set) {
        if (this.f87615f == null) {
            p0();
        }
        ArrayList arrayList = new ArrayList();
        for (lg.a aVar : this.f87615f) {
            if (set.contains(aVar.b())) {
                arrayList.add(aVar);
            }
        }
        lg.a[] aVarArr = new lg.a[arrayList.size()];
        arrayList.toArray(aVarArr);
        return aVarArr;
    }

    private lg.a[] o0(Set set) {
        if (this.f87614e == null) {
            q0();
        }
        ArrayList arrayList = new ArrayList();
        for (lg.a aVar : this.f87614e) {
            if (set.contains(aVar.b())) {
                arrayList.add(aVar);
            }
        }
        lg.a[] aVarArr = new lg.a[arrayList.size()];
        arrayList.toArray(aVarArr);
        return aVarArr;
    }

    private void p0() {
        Method[] methods = this.f87611b.getMethods();
        ArrayList arrayList = new ArrayList();
        for (Method method : methods) {
            lg.a l02 = l0(method);
            if (l02 != null) {
                arrayList.add(l02);
            }
        }
        lg.a[] aVarArr = new lg.a[arrayList.size()];
        this.f87615f = aVarArr;
        arrayList.toArray(aVarArr);
    }

    private void q0() {
        Method[] declaredMethods = this.f87611b.getDeclaredMethods();
        ArrayList arrayList = new ArrayList();
        for (Method method : declaredMethods) {
            lg.a l02 = l0(method);
            if (l02 != null) {
                arrayList.add(l02);
            }
        }
        lg.a[] aVarArr = new lg.a[arrayList.size()];
        this.f87614e = aVarArr;
        arrayList.toArray(aVarArr);
    }

    private boolean r0(Method method) {
        if (method.getName().startsWith("ajc$")) {
            return false;
        }
        if (method.getAnnotations().length == 0) {
            return true;
        }
        return (method.isAnnotationPresent(jg.n.class) || method.isAnnotationPresent(jg.g.class) || method.isAnnotationPresent(jg.b.class) || method.isAnnotationPresent(jg.c.class) || method.isAnnotationPresent(jg.d.class) || method.isAnnotationPresent(jg.e.class)) ? false : true;
    }

    private lg.d<?>[] s0(Class<?>[] clsArr) {
        int length = clsArr.length;
        lg.d<?>[] dVarArr = new lg.d[length];
        for (int i4 = 0; i4 < length; i4++) {
            dVarArr[i4] = lg.e.a(clsArr[i4]);
        }
        return dVarArr;
    }

    private Class<?>[] t0(lg.d<?>[] dVarArr) {
        int length = dVarArr.length;
        Class<?>[] clsArr = new Class[length];
        for (int i4 = 0; i4 < length; i4++) {
            clsArr[i4] = dVarArr[i4].h0();
        }
        return clsArr;
    }

    @Override // lg.d
    public lg.l[] A() {
        ArrayList arrayList = new ArrayList();
        if (this.f87611b.isAnnotationPresent(jg.l.class)) {
            arrayList.add(new f(((jg.l) this.f87611b.getAnnotation(jg.l.class)).value(), this));
        }
        for (Method method : this.f87611b.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ig.d.class)) {
                arrayList.add(new f(((ig.d) method.getAnnotation(ig.d.class)).value(), this));
            }
        }
        if (e0().Z()) {
            arrayList.addAll(Arrays.asList(e0().A()));
        }
        lg.l[] lVarArr = new lg.l[arrayList.size()];
        arrayList.toArray(lVarArr);
        return lVarArr;
    }

    @Override // lg.d
    public boolean B() {
        return this.f87611b.isArray();
    }

    @Override // lg.d
    public Field[] C() {
        Field[] declaredFields = this.f87611b.getDeclaredFields();
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if (!field.getName().startsWith("ajc$") && !field.isAnnotationPresent(jg.m.class) && !field.isAnnotationPresent(jg.i.class)) {
                arrayList.add(field);
            }
        }
        Field[] fieldArr = new Field[arrayList.size()];
        arrayList.toArray(fieldArr);
        return fieldArr;
    }

    @Override // lg.d
    public lg.m[] D() {
        ArrayList arrayList = new ArrayList();
        for (Method method : this.f87611b.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ig.e.class)) {
                ig.e eVar = (ig.e) method.getAnnotation(ig.e.class);
                arrayList.add(new g(this, eVar.pointcut(), eVar.exceptionType()));
            }
        }
        if (e0().Z()) {
            arrayList.addAll(Arrays.asList(e0().D()));
        }
        lg.m[] mVarArr = new lg.m[arrayList.size()];
        arrayList.toArray(mVarArr);
        return mVarArr;
    }

    @Override // lg.d
    public boolean E() {
        return this.f87611b.isPrimitive();
    }

    @Override // lg.d
    public boolean F() {
        return Z() && this.f87611b.isAnnotationPresent(ig.g.class);
    }

    @Override // lg.d
    public Constructor G() {
        return this.f87611b.getEnclosingConstructor();
    }

    @Override // lg.d
    public lg.a H(String str) throws NoSuchAdviceException {
        if (str.equals("")) {
            throw new IllegalArgumentException("use getAdvice(AdviceType...) instead for un-named advice");
        }
        if (this.f87615f == null) {
            p0();
        }
        for (lg.a aVar : this.f87615f) {
            if (aVar.getName().equals(str)) {
                return aVar;
            }
        }
        throw new NoSuchAdviceException(str);
    }

    @Override // lg.d
    public Package I() {
        return this.f87611b.getPackage();
    }

    @Override // lg.d
    public lg.r[] J() {
        ArrayList arrayList = new ArrayList();
        if (this.f87619j == null) {
            for (Method method : this.f87611b.getMethods()) {
                if (method.isAnnotationPresent(ig.f.class)) {
                    ig.f fVar = (ig.f) method.getAnnotation(ig.f.class);
                    if (method.getName().contains("ajc$interFieldInit") && Modifier.isPublic(fVar.modifiers())) {
                        try {
                            Method declaredMethod = method.getDeclaringClass().getDeclaredMethod(method.getName().replace("FieldInit", "FieldGetDispatch"), method.getParameterTypes());
                            arrayList.add(new j(this, fVar.targetType(), fVar.modifiers(), fVar.name(), lg.e.a(declaredMethod.getReturnType()), declaredMethod.getGenericReturnType()));
                        } catch (NoSuchMethodException unused) {
                            throw new IllegalStateException("Can't find field get dispatch method for " + method.getName());
                        }
                    }
                }
            }
            lg.r[] rVarArr = new lg.r[arrayList.size()];
            this.f87619j = rVarArr;
            arrayList.toArray(rVarArr);
        }
        return this.f87619j;
    }

    @Override // lg.d
    public lg.s[] K() {
        if (this.f87617h == null) {
            ArrayList arrayList = new ArrayList();
            for (Method method : this.f87611b.getDeclaredMethods()) {
                if (method.getName().contains("ajc$interMethod$") && method.isAnnotationPresent(ig.f.class)) {
                    ig.f fVar = (ig.f) method.getAnnotation(ig.f.class);
                    if (Modifier.isPublic(fVar.modifiers())) {
                        arrayList.add(new k(this, fVar.targetType(), fVar.modifiers(), fVar.name(), method));
                    }
                }
            }
            k0(arrayList, true);
            lg.s[] sVarArr = new lg.s[arrayList.size()];
            this.f87617h = sVarArr;
            arrayList.toArray(sVarArr);
        }
        return this.f87617h;
    }

    @Override // lg.d
    public Method L(String str, lg.d<?>... dVarArr) throws NoSuchMethodException {
        Method method = this.f87611b.getMethod(str, t0(dVarArr));
        if (r0(method)) {
            return method;
        }
        throw new NoSuchMethodException(str);
    }

    @Override // lg.d
    public boolean M() {
        return this.f87611b.isLocalClass() && !Z();
    }

    @Override // lg.d
    public lg.k[] N() {
        ArrayList arrayList = new ArrayList();
        for (Method method : this.f87611b.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ig.c.class)) {
                ig.c cVar = (ig.c) method.getAnnotation(ig.c.class);
                arrayList.add(new e(cVar.targetTypePattern(), cVar.parentTypes(), cVar.isExtends(), this));
            }
        }
        c(arrayList);
        if (e0().Z()) {
            arrayList.addAll(Arrays.asList(e0().N()));
        }
        lg.k[] kVarArr = new lg.k[arrayList.size()];
        arrayList.toArray(kVarArr);
        return kVarArr;
    }

    @Override // lg.d
    public lg.d<?> O() {
        Class<?> enclosingClass = this.f87611b.getEnclosingClass();
        if (enclosingClass != null) {
            return new b(enclosingClass);
        }
        return null;
    }

    @Override // lg.d
    public Method[] P() {
        Method[] declaredMethods = this.f87611b.getDeclaredMethods();
        ArrayList arrayList = new ArrayList();
        for (Method method : declaredMethods) {
            if (r0(method)) {
                arrayList.add(method);
            }
        }
        Method[] methodArr = new Method[arrayList.size()];
        arrayList.toArray(methodArr);
        return methodArr;
    }

    @Override // lg.d
    public lg.r[] Q() {
        ArrayList arrayList = new ArrayList();
        if (this.f87618i == null) {
            for (Method method : this.f87611b.getDeclaredMethods()) {
                if (method.isAnnotationPresent(ig.f.class) && method.getName().contains("ajc$interFieldInit")) {
                    ig.f fVar = (ig.f) method.getAnnotation(ig.f.class);
                    try {
                        Method declaredMethod = this.f87611b.getDeclaredMethod(method.getName().replace("FieldInit", "FieldGetDispatch"), method.getParameterTypes());
                        arrayList.add(new j(this, fVar.targetType(), fVar.modifiers(), fVar.name(), lg.e.a(declaredMethod.getReturnType()), declaredMethod.getGenericReturnType()));
                    } catch (NoSuchMethodException unused) {
                        throw new IllegalStateException("Can't find field get dispatch method for " + method.getName());
                    }
                }
            }
            lg.r[] rVarArr = new lg.r[arrayList.size()];
            this.f87618i = rVarArr;
            arrayList.toArray(rVarArr);
        }
        return this.f87618i;
    }

    @Override // lg.d
    public lg.s[] R() {
        if (this.f87616g == null) {
            ArrayList arrayList = new ArrayList();
            for (Method method : this.f87611b.getDeclaredMethods()) {
                if (method.getName().contains("ajc$interMethodDispatch1$") && method.isAnnotationPresent(ig.f.class)) {
                    ig.f fVar = (ig.f) method.getAnnotation(ig.f.class);
                    arrayList.add(new k(this, fVar.targetType(), fVar.modifiers(), fVar.name(), method));
                }
            }
            k0(arrayList, false);
            lg.s[] sVarArr = new lg.s[arrayList.size()];
            this.f87616g = sVarArr;
            arrayList.toArray(sVarArr);
        }
        return this.f87616g;
    }

    @Override // lg.d
    public y S(String str) throws NoSuchPointcutException {
        for (y yVar : g0()) {
            if (yVar.getName().equals(str)) {
                return yVar;
            }
        }
        throw new NoSuchPointcutException(str);
    }

    @Override // lg.d
    public lg.r T(String str, lg.d<?> dVar) throws NoSuchFieldException {
        for (lg.r rVar : J()) {
            if (rVar.getName().equals(str)) {
                try {
                    if (rVar.g().equals(dVar)) {
                        return rVar;
                    }
                } catch (ClassNotFoundException unused) {
                    continue;
                }
            }
        }
        throw new NoSuchFieldException(str);
    }

    @Override // lg.d
    public T[] U() {
        return this.f87611b.getEnumConstants();
    }

    @Override // lg.d
    public Field V(String str) throws NoSuchFieldException {
        Field field = this.f87611b.getField(str);
        if (field.getName().startsWith("ajc$")) {
            throw new NoSuchFieldException(str);
        }
        return field;
    }

    @Override // lg.d
    public Method W() {
        return this.f87611b.getEnclosingMethod();
    }

    @Override // lg.d
    public Constructor[] X() {
        return this.f87611b.getDeclaredConstructors();
    }

    @Override // lg.d
    public lg.p Y(lg.d<?> dVar, lg.d<?>... dVarArr) throws NoSuchMethodException {
        for (lg.p pVar : o()) {
            try {
                if (pVar.g().equals(dVar)) {
                    lg.d<?>[] c5 = pVar.c();
                    if (c5.length == dVarArr.length) {
                        for (int i4 = 0; i4 < c5.length; i4++) {
                            if (!c5[i4].equals(dVarArr[i4])) {
                                break;
                            }
                        }
                        return pVar;
                    }
                    continue;
                } else {
                    continue;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        throw new NoSuchMethodException();
    }

    @Override // lg.d
    public boolean Z() {
        return this.f87611b.getAnnotation(jg.f.class) != null;
    }

    @Override // lg.d
    public lg.d<?> a() {
        Class<?> declaringClass = this.f87611b.getDeclaringClass();
        if (declaringClass != null) {
            return new b(declaringClass);
        }
        return null;
    }

    @Override // lg.d
    public lg.a[] a0(lg.b... bVarArr) {
        EnumSet enumSet;
        if (bVarArr.length == 0) {
            enumSet = EnumSet.allOf(lg.b.class);
        } else {
            EnumSet noneOf = EnumSet.noneOf(lg.b.class);
            noneOf.addAll(Arrays.asList(bVarArr));
            enumSet = noneOf;
        }
        return o0(enumSet);
    }

    @Override // lg.d
    public boolean b() {
        return this.f87611b.isEnum();
    }

    @Override // lg.d
    public Type b0() {
        return this.f87611b.getGenericSuperclass();
    }

    @Override // lg.d
    public Constructor c0(lg.d<?>... dVarArr) throws NoSuchMethodException {
        return this.f87611b.getConstructor(t0(dVarArr));
    }

    @Override // lg.d
    public lg.a d0(String str) throws NoSuchAdviceException {
        if (str.equals("")) {
            throw new IllegalArgumentException("use getAdvice(AdviceType...) instead for un-named advice");
        }
        if (this.f87614e == null) {
            q0();
        }
        for (lg.a aVar : this.f87614e) {
            if (aVar.getName().equals(str)) {
                return aVar;
            }
        }
        throw new NoSuchAdviceException(str);
    }

    @Override // lg.d
    public Method[] e() {
        Method[] methods = this.f87611b.getMethods();
        ArrayList arrayList = new ArrayList();
        for (Method method : methods) {
            if (r0(method)) {
                arrayList.add(method);
            }
        }
        Method[] methodArr = new Method[arrayList.size()];
        arrayList.toArray(methodArr);
        return methodArr;
    }

    @Override // lg.d
    public lg.d<? super T> e0() {
        Class<? super T> superclass = this.f87611b.getSuperclass();
        if (superclass == null) {
            return null;
        }
        return new b(superclass);
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f87611b.equals(this.f87611b);
        }
        return false;
    }

    @Override // lg.d
    public boolean f() {
        return this.f87611b.isInterface();
    }

    @Override // lg.d
    public w f0() {
        if (!Z()) {
            return null;
        }
        String value = ((jg.f) this.f87611b.getAnnotation(jg.f.class)).value();
        if (value.equals("")) {
            return e0().Z() ? e0().f0() : new l(x.SINGLETON);
        }
        if (value.startsWith("perthis(")) {
            return new m(x.PERTHIS, androidx.core.content.f.a(value, 1, 8));
        }
        if (value.startsWith("pertarget(")) {
            return new m(x.PERTARGET, androidx.core.content.f.a(value, 1, 10));
        }
        if (value.startsWith("percflow(")) {
            return new m(x.PERCFLOW, androidx.core.content.f.a(value, 1, 9));
        }
        if (value.startsWith("percflowbelow(")) {
            return new m(x.PERCFLOWBELOW, androidx.core.content.f.a(value, 1, 14));
        }
        if (value.startsWith("pertypewithin")) {
            return new r(x.PERTYPEWITHIN, androidx.core.content.f.a(value, 1, 14));
        }
        throw new IllegalStateException("Per-clause not recognized: ".concat(value));
    }

    @Override // lg.d
    public Constructor g(lg.d<?>... dVarArr) throws NoSuchMethodException {
        return this.f87611b.getDeclaredConstructor(t0(dVarArr));
    }

    @Override // lg.d
    public y[] g0() {
        y[] yVarArr = this.f87612c;
        if (yVarArr != null) {
            return yVarArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Method method : this.f87611b.getDeclaredMethods()) {
            y m02 = m0(method);
            if (m02 != null) {
                arrayList.add(m02);
            }
        }
        y[] yVarArr2 = new y[arrayList.size()];
        arrayList.toArray(yVarArr2);
        this.f87612c = yVarArr2;
        return yVarArr2;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.f87611b.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getAnnotations() {
        return this.f87611b.getAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getDeclaredAnnotations() {
        return this.f87611b.getDeclaredAnnotations();
    }

    @Override // lg.d
    public int getModifiers() {
        return this.f87611b.getModifiers();
    }

    @Override // lg.d
    public String getName() {
        return this.f87611b.getName();
    }

    @Override // lg.d
    public TypeVariable<Class<T>>[] getTypeParameters() {
        return this.f87611b.getTypeParameters();
    }

    @Override // lg.d
    public Constructor[] h() {
        return this.f87611b.getConstructors();
    }

    @Override // lg.d
    public Class<T> h0() {
        return this.f87611b;
    }

    public int hashCode() {
        return this.f87611b.hashCode();
    }

    @Override // lg.d
    public lg.d<?>[] i() {
        return s0(this.f87611b.getDeclaredClasses());
    }

    @Override // lg.d
    public lg.j[] i0() {
        ArrayList arrayList = new ArrayList();
        for (Field field : this.f87611b.getDeclaredFields()) {
            try {
                if (field.isAnnotationPresent(jg.m.class)) {
                    jg.m mVar = (jg.m) field.getAnnotation(jg.m.class);
                    if (Modifier.isPublic(field.getModifiers()) && Modifier.isStatic(field.getModifiers())) {
                        arrayList.add(new d(mVar.value(), (String) field.get(null), false, this));
                    }
                } else if (field.isAnnotationPresent(jg.i.class)) {
                    jg.i iVar = (jg.i) field.getAnnotation(jg.i.class);
                    if (Modifier.isPublic(field.getModifiers()) && Modifier.isStatic(field.getModifiers())) {
                        arrayList.add(new d(iVar.value(), (String) field.get(null), true, this));
                    }
                }
            } catch (IllegalAccessException | IllegalArgumentException unused) {
            }
        }
        for (Method method : this.f87611b.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ig.b.class)) {
                ig.b bVar = (ig.b) method.getAnnotation(ig.b.class);
                arrayList.add(new d(bVar.pointcut(), bVar.message(), bVar.isError(), this));
            }
        }
        lg.j[] jVarArr = new lg.j[arrayList.size()];
        arrayList.toArray(jVarArr);
        return jVarArr;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.f87611b.isAnnotationPresent(cls);
    }

    @Override // lg.d
    public lg.a[] j(lg.b... bVarArr) {
        EnumSet enumSet;
        if (bVarArr.length == 0) {
            enumSet = EnumSet.allOf(lg.b.class);
        } else {
            EnumSet noneOf = EnumSet.noneOf(lg.b.class);
            noneOf.addAll(Arrays.asList(bVarArr));
            enumSet = noneOf;
        }
        return n0(enumSet);
    }

    @Override // lg.d
    public lg.s j0(String str, lg.d<?> dVar, lg.d<?>... dVarArr) throws NoSuchMethodException {
        for (lg.s sVar : R()) {
            try {
                if (sVar.getName().equals(str) && sVar.g().equals(dVar)) {
                    lg.d<?>[] c5 = sVar.c();
                    if (c5.length == dVarArr.length) {
                        for (int i4 = 0; i4 < c5.length; i4++) {
                            if (!c5[i4].equals(dVarArr[i4])) {
                                break;
                            }
                        }
                        return sVar;
                    }
                    continue;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        throw new NoSuchMethodException(str);
    }

    @Override // lg.d
    public Field k(String str) throws NoSuchFieldException {
        Field declaredField = this.f87611b.getDeclaredField(str);
        if (declaredField.getName().startsWith("ajc$")) {
            throw new NoSuchFieldException(str);
        }
        return declaredField;
    }

    @Override // lg.d
    public Field[] l() {
        Field[] fields = this.f87611b.getFields();
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (!field.getName().startsWith("ajc$") && !field.isAnnotationPresent(jg.m.class) && !field.isAnnotationPresent(jg.i.class)) {
                arrayList.add(field);
            }
        }
        Field[] fieldArr = new Field[arrayList.size()];
        arrayList.toArray(fieldArr);
        return fieldArr;
    }

    @Override // lg.d
    public lg.p[] m() {
        if (this.f87620k == null) {
            ArrayList arrayList = new ArrayList();
            for (Method method : this.f87611b.getMethods()) {
                if (method.getName().contains("ajc$postInterConstructor") && method.isAnnotationPresent(ig.f.class)) {
                    ig.f fVar = (ig.f) method.getAnnotation(ig.f.class);
                    if (Modifier.isPublic(fVar.modifiers())) {
                        arrayList.add(new h(this, fVar.targetType(), fVar.modifiers(), method));
                    }
                }
            }
            lg.p[] pVarArr = new lg.p[arrayList.size()];
            this.f87620k = pVarArr;
            arrayList.toArray(pVarArr);
        }
        return this.f87620k;
    }

    @Override // lg.d
    public lg.r n(String str, lg.d<?> dVar) throws NoSuchFieldException {
        for (lg.r rVar : Q()) {
            if (rVar.getName().equals(str)) {
                try {
                    if (rVar.g().equals(dVar)) {
                        return rVar;
                    }
                } catch (ClassNotFoundException unused) {
                    continue;
                }
            }
        }
        throw new NoSuchFieldException(str);
    }

    @Override // lg.d
    public lg.p[] o() {
        if (this.f87621l == null) {
            ArrayList arrayList = new ArrayList();
            for (Method method : this.f87611b.getDeclaredMethods()) {
                if (method.getName().contains("ajc$postInterConstructor") && method.isAnnotationPresent(ig.f.class)) {
                    ig.f fVar = (ig.f) method.getAnnotation(ig.f.class);
                    arrayList.add(new h(this, fVar.targetType(), fVar.modifiers(), method));
                }
            }
            lg.p[] pVarArr = new lg.p[arrayList.size()];
            this.f87621l = pVarArr;
            arrayList.toArray(pVarArr);
        }
        return this.f87621l;
    }

    @Override // lg.d
    public lg.i[] p() {
        Annotation annotation;
        ArrayList arrayList = new ArrayList();
        for (Method method : this.f87611b.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ig.a.class)) {
                ig.a aVar = (ig.a) method.getAnnotation(ig.a.class);
                Annotation[] annotations = method.getAnnotations();
                int length = annotations.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        annotation = null;
                        break;
                    }
                    Annotation annotation2 = annotations[i4];
                    if (annotation2.annotationType() != ig.a.class) {
                        annotation = annotation2;
                        break;
                    }
                    i4++;
                }
                arrayList.add(new c(this, aVar.kind(), aVar.pattern(), annotation, aVar.annotation()));
            }
        }
        if (e0().Z()) {
            arrayList.addAll(Arrays.asList(e0().p()));
        }
        lg.i[] iVarArr = new lg.i[arrayList.size()];
        arrayList.toArray(iVarArr);
        return iVarArr;
    }

    @Override // lg.d
    public boolean q(Object obj) {
        return this.f87611b.isInstance(obj);
    }

    @Override // lg.d
    public y[] r() {
        y[] yVarArr = this.f87613d;
        if (yVarArr != null) {
            return yVarArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Method method : this.f87611b.getMethods()) {
            y m02 = m0(method);
            if (m02 != null) {
                arrayList.add(m02);
            }
        }
        y[] yVarArr2 = new y[arrayList.size()];
        arrayList.toArray(yVarArr2);
        this.f87613d = yVarArr2;
        return yVarArr2;
    }

    @Override // lg.d
    public boolean s() {
        return this.f87611b.isMemberClass() && !Z();
    }

    @Override // lg.d
    public y t(String str) throws NoSuchPointcutException {
        for (y yVar : r()) {
            if (yVar.getName().equals(str)) {
                return yVar;
            }
        }
        throw new NoSuchPointcutException(str);
    }

    public String toString() {
        return getName();
    }

    @Override // lg.d
    public lg.s u(String str, lg.d<?> dVar, lg.d<?>... dVarArr) throws NoSuchMethodException {
        for (lg.s sVar : K()) {
            try {
                if (sVar.getName().equals(str) && sVar.g().equals(dVar)) {
                    lg.d<?>[] c5 = sVar.c();
                    if (c5.length == dVarArr.length) {
                        for (int i4 = 0; i4 < c5.length; i4++) {
                            if (!c5[i4].equals(dVarArr[i4])) {
                                break;
                            }
                        }
                        return sVar;
                    }
                    continue;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        throw new NoSuchMethodException(str);
    }

    @Override // lg.d
    public lg.p v(lg.d<?> dVar, lg.d<?>... dVarArr) throws NoSuchMethodException {
        for (lg.p pVar : m()) {
            try {
                if (pVar.g().equals(dVar)) {
                    lg.d<?>[] c5 = pVar.c();
                    if (c5.length == dVarArr.length) {
                        for (int i4 = 0; i4 < c5.length; i4++) {
                            if (!c5[i4].equals(dVarArr[i4])) {
                                break;
                            }
                        }
                        return pVar;
                    }
                    continue;
                } else {
                    continue;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        throw new NoSuchMethodException();
    }

    @Override // lg.d
    public lg.d<?>[] w() {
        return s0(this.f87611b.getInterfaces());
    }

    @Override // lg.d
    public lg.d<?>[] x() {
        return s0(this.f87611b.getClasses());
    }

    @Override // lg.d
    public Method y(String str, lg.d<?>... dVarArr) throws NoSuchMethodException {
        Method declaredMethod = this.f87611b.getDeclaredMethod(str, t0(dVarArr));
        if (r0(declaredMethod)) {
            return declaredMethod;
        }
        throw new NoSuchMethodException(str);
    }

    @Override // lg.d
    public boolean z() {
        return this.f87611b.isMemberClass() && Z();
    }
}
