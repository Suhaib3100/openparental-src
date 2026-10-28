package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.s1;
import kotlin.reflect.jvm.internal.impl.descriptors.n1;
import kotlin.reflect.jvm.internal.impl.descriptors.o1;
import sd.a;
import wd.d0;

/* compiled from: ReflectJavaClass.kt */
@r1({"SMAP\nReflectJavaClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaClass.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaClass\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,208:1\n179#2,2:209\n1#3:211\n1549#4:212\n1620#4,3:213\n11065#5:216\n11400#5,3:217\n11065#5:221\n11400#5,3:222\n11065#5:225\n11400#5,3:226\n26#6:220\n*S KotlinDebug\n*F\n+ 1 ReflectJavaClass.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaClass\n*L\n51#1:209,2\n64#1:212\n64#1:213,3\n118#1:216\n118#1:217,3\n131#1:221\n131#1:222,3\n138#1:225\n138#1:226,3\n131#1:220\n*E\n"})
/* loaded from: classes7.dex */
public final class l extends p implements kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h, v, wd.g {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final Class<?> f76260a;

    /* compiled from: ReflectJavaClass.kt */
    /* synthetic */ class a extends g0 implements ld.l<Member, Boolean> {

        /* renamed from: d, reason: collision with root package name */
        public static final a f76261d = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l Member member) {
            l0.p(member, ProtectedSandApp.s("滏\u0001"));
            return Boolean.valueOf(member.isSynthetic());
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.c
        @fg.l
        public final String getName() {
            return ProtectedSandApp.s("滐\u0001");
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final kotlin.reflect.h getOwner() {
            return l1.d(Member.class);
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final String getSignature() {
            return ProtectedSandApp.s("滑\u0001");
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    /* synthetic */ class b extends g0 implements ld.l<Constructor<?>, o> {

        /* renamed from: d, reason: collision with root package name */
        public static final b f76262d = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final o invoke(@fg.l Constructor<?> constructor) {
            l0.p(constructor, ProtectedSandApp.s("滒\u0001"));
            return new o(constructor);
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.c
        @fg.l
        public final String getName() {
            return ProtectedSandApp.s("滓\u0001");
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final kotlin.reflect.h getOwner() {
            return l1.d(o.class);
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final String getSignature() {
            return ProtectedSandApp.s("滔\u0001");
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    /* synthetic */ class c extends g0 implements ld.l<Member, Boolean> {

        /* renamed from: d, reason: collision with root package name */
        public static final c f76263d = new c(1);

        c() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l Member member) {
            l0.p(member, ProtectedSandApp.s("滕\u0001"));
            return Boolean.valueOf(member.isSynthetic());
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.c
        @fg.l
        public final String getName() {
            return ProtectedSandApp.s("滖\u0001");
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final kotlin.reflect.h getOwner() {
            return l1.d(Member.class);
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final String getSignature() {
            return ProtectedSandApp.s("滗\u0001");
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    /* synthetic */ class d extends g0 implements ld.l<Field, r> {

        /* renamed from: d, reason: collision with root package name */
        public static final d f76264d = new d(1);

        d() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final r invoke(@fg.l Field field) {
            l0.p(field, ProtectedSandApp.s("滘\u0001"));
            return new r(field);
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.c
        @fg.l
        public final String getName() {
            return ProtectedSandApp.s("滙\u0001");
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final kotlin.reflect.h getOwner() {
            return l1.d(r.class);
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final String getSignature() {
            return ProtectedSandApp.s("滚\u0001");
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    static final class e extends n0 implements ld.l<Class<?>, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f76265b = new e(1);

        e() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            l0.o(simpleName, ProtectedSandApp.s("滛\u0001"));
            return Boolean.valueOf(simpleName.length() == 0);
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    @r1({"SMAP\nReflectJavaClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaClass.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaClass$innerClassNames$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n1#2:209\n*E\n"})
    static final class f extends n0 implements ld.l<Class<?>, kotlin.reflect.jvm.internal.impl.name.f> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f76266b = new f(1);

        f() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.name.f invoke(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            if (!kotlin.reflect.jvm.internal.impl.name.f.h(simpleName)) {
                simpleName = null;
            }
            if (simpleName != null) {
                return kotlin.reflect.jvm.internal.impl.name.f.f(simpleName);
            }
            return null;
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    static final class g extends n0 implements ld.l<Method, Boolean> {
        g() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
        
            if (r0.V(r4) == false) goto L9;
         */
        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(java.lang.reflect.Method r4) {
            /*
                r3 = this;
                boolean r0 = r4.isSynthetic()
                r1 = 0
                if (r0 == 0) goto L8
                goto L1d
            L8:
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l.this
                boolean r0 = r0.b()
                r2 = 1
                if (r0 == 0) goto L1c
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l.this
                kotlin.jvm.internal.l0.m(r4)
                boolean r4 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l.O(r0, r4)
                if (r4 != 0) goto L1d
            L1c:
                r1 = r2
            L1d:
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l.g.invoke(java.lang.reflect.Method):java.lang.Boolean");
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    /* synthetic */ class h extends g0 implements ld.l<Method, u> {

        /* renamed from: d, reason: collision with root package name */
        public static final h f76268d = new h(1);

        h() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final u invoke(@fg.l Method method) {
            l0.p(method, ProtectedSandApp.s("滜\u0001"));
            return new u(method);
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.c
        @fg.l
        public final String getName() {
            return ProtectedSandApp.s("滝\u0001");
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final kotlin.reflect.h getOwner() {
            return l1.d(u.class);
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final String getSignature() {
            return ProtectedSandApp.s("滞\u0001");
        }
    }

    public l(@fg.l Class<?> cls) {
        l0.p(cls, ProtectedSandApp.s("滟\u0001"));
        this.f76260a = cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean V(Method method) {
        String name = method.getName();
        if (l0.g(name, ProtectedSandApp.s("滠\u0001"))) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            l0.o(parameterTypes, ProtectedSandApp.s("满\u0001"));
            return parameterTypes.length == 0;
        }
        if (l0.g(name, ProtectedSandApp.s("滢\u0001"))) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    @Override // wd.g
    @fg.l
    public Collection<wd.j> D() {
        Class<?>[] c5 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.f76228a.c(this.f76260a);
        if (c5 == null) {
            return j0.f74919b;
        }
        ArrayList arrayList = new ArrayList(c5.length);
        for (Class<?> cls : c5) {
            arrayList.add(new n(cls));
        }
        return arrayList;
    }

    @Override // wd.d
    public boolean E() {
        return false;
    }

    @Override // wd.g
    @fg.m
    public d0 K() {
        return null;
    }

    @Override // wd.g
    @fg.l
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public List<o> h() {
        Constructor<?>[] declaredConstructors = this.f76260a.getDeclaredConstructors();
        l0.o(declaredConstructors, ProtectedSandApp.s("滣\u0001"));
        return kotlin.sequences.p.c3(kotlin.sequences.p.k1(kotlin.sequences.p.u0(kotlin.collections.l.K5(declaredConstructors), a.f76261d), b.f76262d));
    }

    @fg.l
    public Class<?> Q() {
        return this.f76260a;
    }

    @Override // wd.g
    @fg.l
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public List<r> l() {
        Field[] declaredFields = this.f76260a.getDeclaredFields();
        l0.o(declaredFields, ProtectedSandApp.s("滤\u0001"));
        return kotlin.sequences.p.c3(kotlin.sequences.p.k1(kotlin.sequences.p.u0(kotlin.collections.l.K5(declaredFields), c.f76263d), d.f76264d));
    }

    @Override // wd.g
    @fg.l
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public List<kotlin.reflect.jvm.internal.impl.name.f> C() {
        Class<?>[] declaredClasses = this.f76260a.getDeclaredClasses();
        l0.o(declaredClasses, ProtectedSandApp.s("滥\u0001"));
        return kotlin.sequences.p.c3(kotlin.sequences.p.p1(kotlin.sequences.p.u0(kotlin.collections.l.K5(declaredClasses), e.f76265b), f.f76266b));
    }

    @Override // wd.g
    @fg.l
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public List<u> e() {
        Method[] declaredMethods = this.f76260a.getDeclaredMethods();
        l0.o(declaredMethods, ProtectedSandApp.s("滦\u0001"));
        return kotlin.sequences.p.c3(kotlin.sequences.p.k1(kotlin.sequences.p.p0(kotlin.collections.l.K5(declaredMethods), new g()), h.f76268d));
    }

    @Override // wd.g
    @fg.m
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public l q() {
        Class<?> declaringClass = this.f76260a.getDeclaringClass();
        if (declaringClass != null) {
            return new l(declaringClass);
        }
        return null;
    }

    @Override // wd.g
    public boolean b() {
        return this.f76260a.isEnum();
    }

    public boolean equals(@fg.m Object obj) {
        return (obj instanceof l) && l0.g(this.f76260a, ((l) obj).f76260a);
    }

    @Override // wd.g
    public boolean f() {
        return this.f76260a.isInterface();
    }

    @Override // wd.g
    @fg.l
    public kotlin.reflect.jvm.internal.impl.name.c g() {
        kotlin.reflect.jvm.internal.impl.name.c b5 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.a(this.f76260a).b();
        l0.o(b5, ProtectedSandApp.s("滧\u0001"));
        return b5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h
    public AnnotatedElement getElement() {
        return this.f76260a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.v
    public int getModifiers() {
        return this.f76260a.getModifiers();
    }

    @Override // wd.t
    @fg.l
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        if (!this.f76260a.isAnonymousClass()) {
            kotlin.reflect.jvm.internal.impl.name.f f4 = kotlin.reflect.jvm.internal.impl.name.f.f(this.f76260a.getSimpleName());
            l0.m(f4);
            return f4;
        }
        String name = this.f76260a.getName();
        l0.o(name, ProtectedSandApp.s("滨\u0001"));
        kotlin.reflect.jvm.internal.impl.name.f f5 = kotlin.reflect.jvm.internal.impl.name.f.f(kotlin.text.v.r5(name, ProtectedSandApp.s("滩\u0001"), null, 2, null));
        l0.m(f5);
        return f5;
    }

    @Override // wd.z
    @fg.l
    public List<a0> getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.f76260a.getTypeParameters();
        l0.o(typeParameters, ProtectedSandApp.s("滪\u0001"));
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new a0(typeVariable));
        }
        return arrayList;
    }

    @Override // wd.s
    @fg.l
    public o1 getVisibility() {
        int modifiers = this.f76260a.getModifiers();
        return Modifier.isPublic(modifiers) ? n1.h.f76199c : Modifier.isPrivate(modifiers) ? n1.e.f76196c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? a.c.f91854c : a.b.f91853c : a.C1395a.f91852c;
    }

    public int hashCode() {
        return this.f76260a.hashCode();
    }

    @Override // wd.s
    public boolean isAbstract() {
        return Modifier.isAbstract(this.f76260a.getModifiers());
    }

    @Override // wd.s
    public boolean isFinal() {
        return Modifier.isFinal(this.f76260a.getModifiers());
    }

    @Override // wd.g
    @fg.l
    public Collection<wd.j> j() {
        Class cls;
        cls = Object.class;
        if (l0.g(this.f76260a, cls)) {
            return j0.f74919b;
        }
        s1 s1Var = new s1(2);
        Object genericSuperclass = this.f76260a.getGenericSuperclass();
        s1Var.a(genericSuperclass != null ? genericSuperclass : Object.class);
        Type[] genericInterfaces = this.f76260a.getGenericInterfaces();
        l0.o(genericInterfaces, ProtectedSandApp.s("滫\u0001"));
        s1Var.b(genericInterfaces);
        List O = kotlin.collections.w.O(s1Var.d(new Type[s1Var.c()]));
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(O, 10));
        Iterator it = O.iterator();
        while (it.hasNext()) {
            arrayList.add(new n((Type) it.next()));
        }
        return arrayList;
    }

    @Override // wd.s
    public boolean o() {
        return Modifier.isStatic(this.f76260a.getModifiers());
    }

    @Override // wd.g
    public boolean p() {
        Boolean f4 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.f76228a.f(this.f76260a);
        if (f4 != null) {
            return f4.booleanValue();
        }
        return false;
    }

    @Override // wd.g
    @fg.l
    public Collection<wd.w> r() {
        Object[] d5 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.f76228a.d(this.f76260a);
        if (d5 == null) {
            d5 = new Object[0];
        }
        ArrayList arrayList = new ArrayList(d5.length);
        for (Object obj : d5) {
            arrayList.add(new y(obj));
        }
        return arrayList;
    }

    @Override // wd.g
    public boolean t() {
        return this.f76260a.isAnnotation();
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        m2.a(l.class, sb, ProtectedSandApp.s("滭\u0001"));
        sb.append(this.f76260a);
        return sb.toString();
    }

    @Override // wd.g
    public boolean v() {
        Boolean e4 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.f76228a.e(this.f76260a);
        if (e4 != null) {
            return e4.booleanValue();
        }
        return false;
    }

    @Override // wd.g
    public boolean w() {
        return false;
    }

    @Override // wd.d
    @fg.l
    public List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e> getAnnotations() {
        Annotation[] declaredAnnotations;
        List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e> b5;
        Class<?> cls = this.f76260a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null || (b5 = i.b(declaredAnnotations)) == null) ? j0.f74919b : b5;
    }

    @Override // wd.d
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e k(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        Annotation[] declaredAnnotations;
        l0.p(cVar, ProtectedSandApp.s("滬\u0001"));
        Class<?> cls = this.f76260a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return i.a(declaredAnnotations, cVar);
    }
}
