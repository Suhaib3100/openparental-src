package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import b4.d0;
import com.flashget.kidsdownloader.ProtectedSandApp;
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
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.s1;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.n1;
import kotlin.reflect.jvm.internal.impl.descriptors.o1;
import kotlin.sequences.Sequence;
import x3.a;

/* compiled from: ReflectJavaClass.kt */
/* loaded from: classes6.dex */
public final class l extends p implements kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h, v, b4.g {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final Class<?> f24410a;

    /* compiled from: ReflectJavaClass.kt */
    /* synthetic */ class a extends g0 implements q3.l<Member, Boolean> {

        /* renamed from: x, reason: collision with root package name */
        public static final a f24411x = new a();

        a() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public final Boolean N(@d5.d Member member) {
            l0.p(member, ProtectedSandApp.s("荵"));
            return Boolean.valueOf(member.isSynthetic());
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.KCallable
        @d5.d
        public final String getName() {
            return ProtectedSandApp.s("荶");
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final KDeclarationContainer w0() {
            return l1.d(Member.class);
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final String y0() {
            return ProtectedSandApp.s("荷");
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    /* synthetic */ class b extends g0 implements q3.l<Constructor<?>, o> {

        /* renamed from: x, reason: collision with root package name */
        public static final b f24412x = new b();

        b() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public final o N(@d5.d Constructor<?> constructor) {
            l0.p(constructor, ProtectedSandApp.s("荸"));
            return new o(constructor);
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.KCallable
        @d5.d
        public final String getName() {
            return ProtectedSandApp.s("荹");
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final KDeclarationContainer w0() {
            return l1.d(o.class);
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final String y0() {
            return ProtectedSandApp.s("荺");
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    /* synthetic */ class c extends g0 implements q3.l<Member, Boolean> {

        /* renamed from: x, reason: collision with root package name */
        public static final c f24413x = new c();

        c() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public final Boolean N(@d5.d Member member) {
            l0.p(member, ProtectedSandApp.s("荻"));
            return Boolean.valueOf(member.isSynthetic());
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.KCallable
        @d5.d
        public final String getName() {
            return ProtectedSandApp.s("荼");
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final KDeclarationContainer w0() {
            return l1.d(Member.class);
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final String y0() {
            return ProtectedSandApp.s("荽");
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    /* synthetic */ class d extends g0 implements q3.l<Field, r> {

        /* renamed from: x, reason: collision with root package name */
        public static final d f24414x = new d();

        d() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public final r N(@d5.d Field field) {
            l0.p(field, ProtectedSandApp.s("荾"));
            return new r(field);
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.KCallable
        @d5.d
        public final String getName() {
            return ProtectedSandApp.s("荿");
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final KDeclarationContainer w0() {
            return l1.d(r.class);
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final String y0() {
            return ProtectedSandApp.s("莀");
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    static final class e extends Lambda implements q3.l<Class<?>, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        public static final e f24415p = new e();

        e() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            l0.o(simpleName, ProtectedSandApp.s("莁"));
            return Boolean.valueOf(simpleName.length() == 0);
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    static final class f extends Lambda implements q3.l<Class<?>, kotlin.reflect.jvm.internal.impl.name.f> {

        /* renamed from: p, reason: collision with root package name */
        public static final f f24416p = new f();

        f() {
            super(1);
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.name.f N(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            if (!kotlin.reflect.jvm.internal.impl.name.f.r(simpleName)) {
                simpleName = null;
            }
            if (simpleName != null) {
                return kotlin.reflect.jvm.internal.impl.name.f.p(simpleName);
            }
            return null;
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    static final class g extends Lambda implements q3.l<Method, Boolean> {
        g() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
        
            if (r0.b0(r5) == false) goto L9;
         */
        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean N(java.lang.reflect.Method r5) {
            /*
                r4 = this;
                boolean r0 = r5.isSynthetic()
                r1 = 0
                if (r0 == 0) goto L8
                goto L23
            L8:
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l.this
                boolean r0 = r0.G()
                r2 = 1
                if (r0 == 0) goto L22
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l.this
                java.lang.String r3 = "莂"
                java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)
                kotlin.jvm.internal.l0.o(r5, r3)
                boolean r5 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l.U(r0, r5)
                if (r5 != 0) goto L23
            L22:
                r1 = r2
            L23:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l.g.N(java.lang.reflect.Method):java.lang.Boolean");
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    /* synthetic */ class h extends g0 implements q3.l<Method, u> {

        /* renamed from: x, reason: collision with root package name */
        public static final h f24418x = new h();

        h() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public final u N(@d5.d Method method) {
            l0.p(method, ProtectedSandApp.s("莃"));
            return new u(method);
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.KCallable
        @d5.d
        public final String getName() {
            return ProtectedSandApp.s("莄");
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final KDeclarationContainer w0() {
            return l1.d(u.class);
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final String y0() {
            return ProtectedSandApp.s("莅");
        }
    }

    public l(@d5.d Class<?> cls) {
        l0.p(cls, ProtectedSandApp.s("莆"));
        this.f24410a = cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b0(Method method) {
        String name = method.getName();
        if (l0.g(name, ProtectedSandApp.s("莇"))) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            l0.o(parameterTypes, ProtectedSandApp.s("莈"));
            if (parameterTypes.length == 0) {
                return true;
            }
        } else if (l0.g(name, ProtectedSandApp.s("莉"))) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h
    public AnnotatedElement A() {
        return this.f24410a;
    }

    @Override // b4.g
    public boolean G() {
        return this.f24410a.isEnum();
    }

    @Override // b4.g
    public boolean K() {
        return this.f24410a.isInterface();
    }

    @Override // b4.g
    @d5.e
    public d0 L() {
        return null;
    }

    @Override // b4.g
    @d5.d
    public Collection<b4.j> Q() {
        Class<?>[] c6 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.f24378a.c(this.f24410a);
        if (c6 == null) {
            return EmptyList.f23167o;
        }
        ArrayList arrayList = new ArrayList(c6.length);
        for (Class<?> cls : c6) {
            arrayList.add(new n(cls));
        }
        return arrayList;
    }

    @Override // b4.s
    public boolean T() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // b4.g
    @d5.d
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public List<o> l() {
        Sequence K5;
        Sequence u02;
        Sequence k12;
        Constructor<?>[] declaredConstructors = this.f24410a.getDeclaredConstructors();
        l0.o(declaredConstructors, ProtectedSandApp.s("莊"));
        K5 = kotlin.collections.t.K5(declaredConstructors);
        u02 = kotlin.sequences.v.u0(K5, a.f24411x);
        k12 = kotlin.sequences.v.k1(u02, b.f24412x);
        return kotlin.sequences.v.c3(k12);
    }

    @d5.d
    public Class<?> W() {
        return this.f24410a;
    }

    @Override // b4.g
    @d5.d
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public List<r> v() {
        Sequence K5;
        Sequence u02;
        Sequence k12;
        Field[] declaredFields = this.f24410a.getDeclaredFields();
        l0.o(declaredFields, ProtectedSandApp.s("莋"));
        K5 = kotlin.collections.t.K5(declaredFields);
        u02 = kotlin.sequences.v.u0(K5, c.f24413x);
        k12 = kotlin.sequences.v.k1(u02, d.f24414x);
        return kotlin.sequences.v.c3(k12);
    }

    @Override // b4.g
    @d5.d
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public List<kotlin.reflect.jvm.internal.impl.name.f> N() {
        Sequence K5;
        Sequence u02;
        Sequence p12;
        Class<?>[] declaredClasses = this.f24410a.getDeclaredClasses();
        l0.o(declaredClasses, ProtectedSandApp.s("莌"));
        K5 = kotlin.collections.t.K5(declaredClasses);
        u02 = kotlin.sequences.v.u0(K5, e.f24415p);
        p12 = kotlin.sequences.v.p1(u02, f.f24416p);
        return kotlin.sequences.v.c3(p12);
    }

    @Override // b4.g
    @d5.d
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public List<u> P() {
        Sequence K5;
        Sequence p02;
        Sequence k12;
        Method[] declaredMethods = this.f24410a.getDeclaredMethods();
        l0.o(declaredMethods, ProtectedSandApp.s("莍"));
        K5 = kotlin.collections.t.K5(declaredMethods);
        p02 = kotlin.sequences.v.p0(K5, new g());
        k12 = kotlin.sequences.v.k1(p02, h.f24418x);
        return kotlin.sequences.v.c3(k12);
    }

    @Override // b4.s
    public boolean a() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // b4.g
    @d5.e
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public l u() {
        Class<?> declaringClass = this.f24410a.getDeclaringClass();
        if (declaringClass != null) {
            return new l(declaringClass);
        }
        return null;
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

    public boolean equals(@d5.e Object obj) {
        return (obj instanceof l) && l0.g(this.f24410a, ((l) obj).f24410a);
    }

    @Override // b4.g
    @d5.d
    public kotlin.reflect.jvm.internal.impl.name.c f() {
        kotlin.reflect.jvm.internal.impl.name.c b6 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.a(this.f24410a).b();
        l0.o(b6, ProtectedSandApp.s("莏"));
        return b6;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.v
    public int getModifiers() {
        return this.f24410a.getModifiers();
    }

    @Override // b4.t
    @d5.d
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        kotlin.reflect.jvm.internal.impl.name.f p5 = kotlin.reflect.jvm.internal.impl.name.f.p(this.f24410a.getSimpleName());
        l0.o(p5, ProtectedSandApp.s("莐"));
        return p5;
    }

    @Override // b4.z
    @d5.d
    public List<a0> getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.f24410a.getTypeParameters();
        l0.o(typeParameters, ProtectedSandApp.s("莑"));
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new a0(typeVariable));
        }
        return arrayList;
    }

    public int hashCode() {
        return this.f24410a.hashCode();
    }

    @Override // b4.g
    @d5.d
    public Collection<b4.j> m() {
        Class cls;
        List O;
        int b02;
        cls = Object.class;
        if (l0.g(this.f24410a, cls)) {
            return EmptyList.f23167o;
        }
        s1 s1Var = new s1(2);
        Object genericSuperclass = this.f24410a.getGenericSuperclass();
        s1Var.a(genericSuperclass != null ? genericSuperclass : Object.class);
        Type[] genericInterfaces = this.f24410a.getGenericInterfaces();
        l0.o(genericInterfaces, ProtectedSandApp.s("莒"));
        s1Var.b(genericInterfaces);
        O = kotlin.collections.a0.O(s1Var.d(new Type[s1Var.c()]));
        b02 = kotlin.collections.b0.b0(O, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator it = O.iterator();
        while (it.hasNext()) {
            arrayList.add(new n((Type) it.next()));
        }
        return arrayList;
    }

    @Override // b4.d
    public boolean o() {
        return false;
    }

    @Override // b4.g
    public boolean t() {
        Boolean f6 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.f24378a.f(this.f24410a);
        if (f6 != null) {
            return f6.booleanValue();
        }
        return false;
    }

    @d5.d
    public String toString() {
        return l.class.getName() + ProtectedSandApp.s("莓") + this.f24410a;
    }

    @Override // b4.g
    @d5.d
    public Collection<b4.w> w() {
        Object[] d6 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.f24378a.d(this.f24410a);
        if (d6 == null) {
            d6 = new Object[0];
        }
        ArrayList arrayList = new ArrayList(d6.length);
        for (Object obj : d6) {
            arrayList.add(new y(obj));
        }
        return arrayList;
    }

    @Override // b4.g
    public boolean x() {
        return this.f24410a.isAnnotation();
    }

    @Override // b4.g
    public boolean y() {
        Boolean e6 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.f24378a.e(this.f24410a);
        if (e6 != null) {
            return e6.booleanValue();
        }
        return false;
    }

    @Override // b4.g
    public boolean z() {
        return false;
    }

    @Override // b4.d
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e e(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        Annotation[] declaredAnnotations;
        l0.p(cVar, ProtectedSandApp.s("莎"));
        Class<?> cls = this.f24410a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return i.a(declaredAnnotations, cVar);
    }

    @Override // b4.d
    @d5.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e> getAnnotations() {
        Annotation[] declaredAnnotations;
        List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e> b6;
        Class<?> cls = this.f24410a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null || (b6 = i.b(declaredAnnotations)) == null) ? EmptyList.f23167o : b6;
    }
}
