package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.calls.a;
import kotlin.reflect.jvm.internal.calls.f;
import kotlin.reflect.jvm.internal.g0;
import kotlin.reflect.jvm.internal.i;
import kotlin.reflect.jvm.internal.j;

/* compiled from: KFunctionImpl.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b$\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B\u0019\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bH\u0010IB7\b\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010:\u001a\u00020\u0017\u0012\u0006\u0010!\u001a\u00020\u0017\u0012\b\u0010J\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bH\u0010KB+\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010:\u001a\u00020\u0017\u0012\u0006\u0010!\u001a\u00020\u0017\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bH\u0010LJ\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J.\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u00112\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0013\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010\u000e\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010.\u001a\u0006\u0012\u0002\b\u00030)8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R!\u00101\u001a\b\u0012\u0002\b\u0003\u0018\u00010)8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010-R\u0016\u00104\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00107\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010:\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010=\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u00106R\u0014\u0010A\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u00106R\u0014\u0010C\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u00106R\u0014\u0010E\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u00106R\u0014\u0010G\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u00106¨\u0006M"}, d2 = {"Lkotlin/reflect/jvm/internal/q;", "Lkotlin/reflect/jvm/internal/l;", "", "Lkotlin/reflect/i;", "Lkotlin/jvm/internal/e0;", "Lkotlin/reflect/jvm/internal/i;", "Ljava/lang/reflect/Method;", "member", "Lkotlin/reflect/jvm/internal/calls/f$h;", "N0", "M0", "L0", "Ljava/lang/reflect/Constructor;", "Lkotlin/reflect/jvm/internal/impl/descriptors/z;", "descriptor", "", "isDefault", "Lkotlin/reflect/jvm/internal/calls/f;", "K0", "other", "equals", "", "hashCode", "", "toString", "Lkotlin/reflect/jvm/internal/p;", "s", "Lkotlin/reflect/jvm/internal/p;", "A0", "()Lkotlin/reflect/jvm/internal/p;", "container", "t", "Ljava/lang/String;", "signature", "u", "Ljava/lang/Object;", "rawBoundReceiver", "v", "Lkotlin/reflect/jvm/internal/g0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "Lkotlin/reflect/jvm/internal/calls/e;", "w", "Lkotlin/reflect/jvm/internal/g0$b;", "z0", "()Lkotlin/reflect/jvm/internal/calls/e;", "caller", "x", "B0", "defaultCaller", "O0", "()Ljava/lang/Object;", "boundReceiver", "E0", "()Z", "isBound", "getName", "()Ljava/lang/String;", "name", "f", "()I", "arity", "p", "isInline", "q", "isExternal", "B", "isOperator", "H", "isInfix", "o", "isSuspend", "<init>", "(Lkotlin/reflect/jvm/internal/p;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "descriptorInitialValue", "(Lkotlin/reflect/jvm/internal/p;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "(Lkotlin/reflect/jvm/internal/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class q extends l<Object> implements FunctionBase<Object>, KFunction<Object>, i {

    /* renamed from: y, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f26789y = {l1.u(new g1(l1.d(q.class), ProtectedSandApp.s("訸"), ProtectedSandApp.s("訹"))), l1.u(new g1(l1.d(q.class), ProtectedSandApp.s("診"), ProtectedSandApp.s("註"))), l1.u(new g1(l1.d(q.class), ProtectedSandApp.s("証"), ProtectedSandApp.s("訽")))};

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final p container;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String signature;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final Object rawBoundReceiver;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final g0.a descriptor;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final g0.b caller;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final g0.b defaultCaller;

    /* compiled from: KFunctionImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0001 \u0002*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/e;", "Ljava/lang/reflect/Executable;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/calls/e;"}, k = 3, mv = {1, 8, 0})
    static final class a extends Lambda implements q3.a<kotlin.reflect.jvm.internal.calls.e<? extends Executable>> {
        a() {
            super(0);
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.calls.e<Executable> n() {
            int b02;
            Object b6;
            kotlin.reflect.jvm.internal.calls.e L0;
            int b03;
            j g5 = j0.f26695a.g(q.this.C0());
            if (g5 instanceof j.d) {
                if (q.this.D0()) {
                    Class<?> f6 = q.this.getContainer().f();
                    List<KParameter> r5 = q.this.r();
                    b03 = kotlin.collections.b0.b0(r5, 10);
                    ArrayList arrayList = new ArrayList(b03);
                    Iterator<T> it = r5.iterator();
                    while (it.hasNext()) {
                        String name = ((KParameter) it.next()).getName();
                        kotlin.jvm.internal.l0.m(name);
                        arrayList.add(name);
                    }
                    return new kotlin.reflect.jvm.internal.calls.a(f6, arrayList, a.EnumC0264a.POSITIONAL_CALL, a.b.KOTLIN, null, 16, null);
                }
                b6 = q.this.getContainer().N(((j.d) g5).b());
            } else if (g5 instanceof j.e) {
                j.e eVar = (j.e) g5;
                b6 = q.this.getContainer().S(eVar.c(), eVar.b());
            } else if (g5 instanceof j.c) {
                b6 = ((j.c) g5).getMethod();
            } else {
                if (!(g5 instanceof j.b)) {
                    if (!(g5 instanceof j.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<Method> b7 = ((j.a) g5).b();
                    Class<?> f7 = q.this.getContainer().f();
                    b02 = kotlin.collections.b0.b0(b7, 10);
                    ArrayList arrayList2 = new ArrayList(b02);
                    Iterator<T> it2 = b7.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((Method) it2.next()).getName());
                    }
                    return new kotlin.reflect.jvm.internal.calls.a(f7, arrayList2, a.EnumC0264a.POSITIONAL_CALL, a.b.JAVA, b7);
                }
                b6 = ((j.b) g5).b();
            }
            if (b6 instanceof Constructor) {
                q qVar = q.this;
                L0 = qVar.K0((Constructor) b6, qVar.C0(), false);
            } else {
                if (!(b6 instanceof Method)) {
                    throw new e0(ProtectedSandApp.s("訵") + q.this.C0() + ProtectedSandApp.s("訶") + b6 + ')');
                }
                Method method = (Method) b6;
                L0 = !Modifier.isStatic(method.getModifiers()) ? q.this.L0(method) : q.this.C0().getAnnotations().e(n0.j()) != null ? q.this.M0(method) : q.this.N0(method);
            }
            return kotlin.reflect.jvm.internal.calls.i.c(L0, q.this.C0(), false, 2, null);
        }
    }

    /* compiled from: KFunctionImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/e;", "Ljava/lang/reflect/Executable;", "a", "()Lkotlin/reflect/jvm/internal/calls/e;"}, k = 3, mv = {1, 8, 0})
    static final class b extends Lambda implements q3.a<kotlin.reflect.jvm.internal.calls.e<? extends Executable>> {
        b() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.lang.reflect.Member] */
        @Override // q3.a
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.calls.e<Executable> n() {
            GenericDeclaration genericDeclaration;
            int b02;
            int b03;
            kotlin.reflect.jvm.internal.calls.e eVar;
            j g5 = j0.f26695a.g(q.this.C0());
            if (g5 instanceof j.e) {
                p container = q.this.getContainer();
                j.e eVar2 = (j.e) g5;
                String c6 = eVar2.c();
                String b6 = eVar2.b();
                kotlin.jvm.internal.l0.m(q.this.z0().b());
                genericDeclaration = container.P(c6, b6, !Modifier.isStatic(r5.getModifiers()));
            } else if (g5 instanceof j.d) {
                if (q.this.D0()) {
                    Class<?> f6 = q.this.getContainer().f();
                    List<KParameter> r5 = q.this.r();
                    b03 = kotlin.collections.b0.b0(r5, 10);
                    ArrayList arrayList = new ArrayList(b03);
                    Iterator<T> it = r5.iterator();
                    while (it.hasNext()) {
                        String name = ((KParameter) it.next()).getName();
                        kotlin.jvm.internal.l0.m(name);
                        arrayList.add(name);
                    }
                    return new kotlin.reflect.jvm.internal.calls.a(f6, arrayList, a.EnumC0264a.CALL_BY_NAME, a.b.KOTLIN, null, 16, null);
                }
                genericDeclaration = q.this.getContainer().O(((j.d) g5).b());
            } else {
                if (g5 instanceof j.a) {
                    List<Method> b7 = ((j.a) g5).b();
                    Class<?> f7 = q.this.getContainer().f();
                    b02 = kotlin.collections.b0.b0(b7, 10);
                    ArrayList arrayList2 = new ArrayList(b02);
                    Iterator<T> it2 = b7.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((Method) it2.next()).getName());
                    }
                    return new kotlin.reflect.jvm.internal.calls.a(f7, arrayList2, a.EnumC0264a.CALL_BY_NAME, a.b.JAVA, b7);
                }
                genericDeclaration = null;
            }
            if (genericDeclaration instanceof Constructor) {
                q qVar = q.this;
                eVar = qVar.K0((Constructor) genericDeclaration, qVar.C0(), true);
            } else if (genericDeclaration instanceof Method) {
                if (q.this.C0().getAnnotations().e(n0.j()) != null) {
                    kotlin.reflect.jvm.internal.impl.descriptors.m b8 = q.this.C0().b();
                    kotlin.jvm.internal.l0.n(b8, ProtectedSandApp.s("訷"));
                    if (!((kotlin.reflect.jvm.internal.impl.descriptors.e) b8).L()) {
                        eVar = q.this.M0((Method) genericDeclaration);
                    }
                }
                eVar = q.this.N0((Method) genericDeclaration);
            } else {
                eVar = null;
            }
            if (eVar != null) {
                return kotlin.reflect.jvm.internal.calls.i.b(eVar, q.this.C0(), true);
            }
            return null;
        }
    }

    /* compiled from: KFunctionImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/z;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/z;"}, k = 3, mv = {1, 8, 0})
    static final class c extends Lambda implements q3.a<kotlin.reflect.jvm.internal.impl.descriptors.z> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f26799q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.f26799q = str;
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.z n() {
            return q.this.getContainer().Q(this.f26799q, q.this.signature);
        }
    }

    /* synthetic */ q(p pVar, String str, String str2, kotlin.reflect.jvm.internal.impl.descriptors.z zVar, Object obj, int i5, kotlin.jvm.internal.w wVar) {
        this(pVar, str, str2, zVar, (i5 & 16) != 0 ? kotlin.jvm.internal.q.f23594u : obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.calls.f<Constructor<?>> K0(Constructor<?> member, kotlin.reflect.jvm.internal.impl.descriptors.z descriptor, boolean isDefault) {
        return (isDefault || !kotlin.reflect.jvm.internal.impl.resolve.jvm.b.f(descriptor)) ? E0() ? new f.c(member, O0()) : new f.e(member) : E0() ? new f.a(member, O0()) : new f.b(member);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.h L0(Method member) {
        return E0() ? new f.h.a(member, O0()) : new f.h.d(member);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.h M0(Method member) {
        return E0() ? new f.h.b(member) : new f.h.e(member);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.h N0(Method member) {
        return E0() ? new f.h.c(member, O0()) : new f.h.C0266f(member);
    }

    private final Object O0() {
        return kotlin.reflect.jvm.internal.calls.i.a(this.rawBoundReceiver, C0());
    }

    @Override // kotlin.reflect.jvm.internal.l
    @d5.d
    /* renamed from: A0, reason: from getter */
    public p getContainer() {
        return this.container;
    }

    @Override // kotlin.reflect.KFunction
    public boolean B() {
        return C0().B();
    }

    @Override // kotlin.reflect.jvm.internal.l
    @d5.e
    public kotlin.reflect.jvm.internal.calls.e<?> B0() {
        return (kotlin.reflect.jvm.internal.calls.e) this.defaultCaller.b(this, f26789y[2]);
    }

    @Override // kotlin.reflect.jvm.internal.l
    public boolean E0() {
        return !kotlin.jvm.internal.l0.g(this.rawBoundReceiver, kotlin.jvm.internal.q.f23594u);
    }

    @Override // q3.q
    @d5.e
    public Object G(@d5.e Object obj, @d5.e Object obj2, @d5.e Object obj3) {
        return i.a.d(this, obj, obj2, obj3);
    }

    @Override // kotlin.reflect.KFunction
    public boolean H() {
        return C0().H();
    }

    @Override // q3.d
    @d5.e
    public Object M(@d5.e Object obj, @d5.e Object obj2, @d5.e Object obj3, @d5.e Object obj4, @d5.e Object obj5, @d5.e Object obj6, @d5.e Object obj7, @d5.e Object obj8, @d5.e Object obj9, @d5.e Object obj10, @d5.e Object obj11, @d5.e Object obj12) {
        return i.a.m(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12);
    }

    @Override // q3.l
    @d5.e
    public Object N(@d5.e Object obj) {
        return i.a.b(this, obj);
    }

    @Override // q3.k
    @d5.e
    public Object P(@d5.e Object obj, @d5.e Object obj2, @d5.e Object obj3, @d5.e Object obj4, @d5.e Object obj5, @d5.e Object obj6, @d5.e Object obj7, @d5.e Object obj8, @d5.e Object obj9, @d5.e Object obj10, @d5.e Object obj11, @d5.e Object obj12, @d5.e Object obj13, @d5.e Object obj14, @d5.e Object obj15, @d5.e Object obj16, @d5.e Object obj17, @d5.e Object obj18, @d5.e Object obj19) {
        return i.a.t(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19);
    }

    @Override // kotlin.reflect.jvm.internal.l
    @d5.d
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.z F0() {
        T b6 = this.descriptor.b(this, f26789y[0]);
        kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("詄"));
        return (kotlin.reflect.jvm.internal.impl.descriptors.z) b6;
    }

    @Override // q3.h
    @d5.e
    public Object Q(@d5.e Object obj, @d5.e Object obj2, @d5.e Object obj3, @d5.e Object obj4, @d5.e Object obj5, @d5.e Object obj6, @d5.e Object obj7, @d5.e Object obj8, @d5.e Object obj9, @d5.e Object obj10, @d5.e Object obj11, @d5.e Object obj12, @d5.e Object obj13, @d5.e Object obj14, @d5.e Object obj15, @d5.e Object obj16) {
        return i.a.q(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16);
    }

    @Override // q3.r
    @d5.e
    public Object S(@d5.e Object obj, @d5.e Object obj2, @d5.e Object obj3, @d5.e Object obj4) {
        return i.a.e(this, obj, obj2, obj3, obj4);
    }

    @Override // q3.v
    @d5.e
    public Object U(@d5.e Object obj, @d5.e Object obj2, @d5.e Object obj3, @d5.e Object obj4, @d5.e Object obj5, @d5.e Object obj6, @d5.e Object obj7, @d5.e Object obj8) {
        return i.a.i(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    @Override // q3.m
    @d5.e
    public Object Y(@d5.e Object obj, @d5.e Object obj2, @d5.e Object obj3, @d5.e Object obj4, @d5.e Object obj5, @d5.e Object obj6, @d5.e Object obj7, @d5.e Object obj8, @d5.e Object obj9, @d5.e Object obj10, @d5.e Object obj11, @d5.e Object obj12, @d5.e Object obj13, @d5.e Object obj14, @d5.e Object obj15, @d5.e Object obj16, @d5.e Object obj17, @d5.e Object obj18, @d5.e Object obj19, @d5.e Object obj20) {
        return i.a.u(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20);
    }

    @Override // q3.o
    @d5.e
    public Object a0(@d5.e Object obj, @d5.e Object obj2, @d5.e Object obj3, @d5.e Object obj4, @d5.e Object obj5, @d5.e Object obj6, @d5.e Object obj7, @d5.e Object obj8, @d5.e Object obj9, @d5.e Object obj10, @d5.e Object obj11, @d5.e Object obj12, @d5.e Object obj13, @d5.e Object obj14, @d5.e Object obj15, @d5.e Object obj16, @d5.e Object obj17, @d5.e Object obj18, @d5.e Object obj19, @d5.e Object obj20, @d5.e Object obj21, @d5.e Object obj22) {
        return i.a.w(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22);
    }

    @Override // q3.e
    @d5.e
    public Object b0(@d5.e Object obj, @d5.e Object obj2, @d5.e Object obj3, @d5.e Object obj4, @d5.e Object obj5, @d5.e Object obj6, @d5.e Object obj7, @d5.e Object obj8, @d5.e Object obj9, @d5.e Object obj10, @d5.e Object obj11, @d5.e Object obj12, @d5.e Object obj13) {
        return i.a.n(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13);
    }

    @Override // q3.t
    @d5.e
    public Object d0(@d5.e Object obj, @d5.e Object obj2, @d5.e Object obj3, @d5.e Object obj4, @d5.e Object obj5, @d5.e Object obj6) {
        return i.a.g(this, obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // q3.f
    @d5.e
    public Object e0(@d5.e Object obj, @d5.e Object obj2, @d5.e Object obj3, @d5.e Object obj4, @d5.e Object obj5, @d5.e Object obj6, @d5.e Object obj7, @d5.e Object obj8, @d5.e Object obj9, @d5.e Object obj10, @d5.e Object obj11, @d5.e Object obj12, @d5.e Object obj13, @d5.e Object obj14) {
        return i.a.o(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14);
    }

    public boolean equals(@d5.e Object other) {
        q c6 = n0.c(other);
        return c6 != null && kotlin.jvm.internal.l0.g(this.container, c6.container) && kotlin.jvm.internal.l0.g(getName(), c6.getName()) && kotlin.jvm.internal.l0.g(this.signature, c6.signature) && kotlin.jvm.internal.l0.g(this.rawBoundReceiver, c6.rawBoundReceiver);
    }

    @Override // kotlin.jvm.internal.FunctionBase
    /* renamed from: f */
    public int getF23321p() {
        return kotlin.reflect.jvm.internal.calls.g.a(z0());
    }

    @Override // q3.i
    @d5.e
    public Object f0(@d5.e Object obj, @d5.e Object obj2, @d5.e Object obj3, @d5.e Object obj4, @d5.e Object obj5, @d5.e Object obj6, @d5.e Object obj7, @d5.e Object obj8, @d5.e Object obj9, @d5.e Object obj10, @d5.e Object obj11, @d5.e Object obj12, @d5.e Object obj13, @d5.e Object obj14, @d5.e Object obj15, @d5.e Object obj16, @d5.e Object obj17) {
        return i.a.r(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17);
    }

    @Override // q3.p
    @d5.e
    public Object g0(@d5.e Object obj, @d5.e Object obj2) {
        return i.a.c(this, obj, obj2);
    }

    @Override // kotlin.reflect.KCallable
    @d5.d
    public String getName() {
        String h5 = C0().getName().h();
        kotlin.jvm.internal.l0.o(h5, ProtectedSandApp.s("詅"));
        return h5;
    }

    @Override // q3.w
    @d5.e
    public Object h0(@d5.e Object obj, @d5.e Object obj2, @d5.e Object obj3, @d5.e Object obj4, @d5.e Object obj5, @d5.e Object obj6, @d5.e Object obj7, @d5.e Object obj8, @d5.e Object obj9) {
        return i.a.j(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    public int hashCode() {
        return this.signature.hashCode() + ((getName().hashCode() + (this.container.hashCode() * 31)) * 31);
    }

    @Override // q3.s
    @d5.e
    public Object i0(@d5.e Object obj, @d5.e Object obj2, @d5.e Object obj3, @d5.e Object obj4, @d5.e Object obj5) {
        return i.a.f(this, obj, obj2, obj3, obj4, obj5);
    }

    @Override // q3.n
    @d5.e
    public Object k0(@d5.e Object obj, @d5.e Object obj2, @d5.e Object obj3, @d5.e Object obj4, @d5.e Object obj5, @d5.e Object obj6, @d5.e Object obj7, @d5.e Object obj8, @d5.e Object obj9, @d5.e Object obj10, @d5.e Object obj11, @d5.e Object obj12, @d5.e Object obj13, @d5.e Object obj14, @d5.e Object obj15, @d5.e Object obj16, @d5.e Object obj17, @d5.e Object obj18, @d5.e Object obj19, @d5.e Object obj20, @d5.e Object obj21) {
        return i.a.v(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21);
    }

    @Override // q3.a
    @d5.e
    public Object n() {
        return i.a.a(this);
    }

    @Override // q3.u
    @d5.e
    public Object n0(@d5.e Object obj, @d5.e Object obj2, @d5.e Object obj3, @d5.e Object obj4, @d5.e Object obj5, @d5.e Object obj6, @d5.e Object obj7) {
        return i.a.h(this, obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // kotlin.reflect.KCallable, kotlin.reflect.KFunction
    public boolean o() {
        return C0().o();
    }

    @Override // q3.b
    @d5.e
    public Object o0(@d5.e Object obj, @d5.e Object obj2, @d5.e Object obj3, @d5.e Object obj4, @d5.e Object obj5, @d5.e Object obj6, @d5.e Object obj7, @d5.e Object obj8, @d5.e Object obj9, @d5.e Object obj10) {
        return i.a.k(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    @Override // kotlin.reflect.KFunction
    public boolean p() {
        return C0().p();
    }

    @Override // kotlin.reflect.KFunction
    public boolean q() {
        return C0().q();
    }

    @d5.d
    public String toString() {
        return i0.f23876a.d(C0());
    }

    @Override // q3.g
    @d5.e
    public Object u0(@d5.e Object obj, @d5.e Object obj2, @d5.e Object obj3, @d5.e Object obj4, @d5.e Object obj5, @d5.e Object obj6, @d5.e Object obj7, @d5.e Object obj8, @d5.e Object obj9, @d5.e Object obj10, @d5.e Object obj11, @d5.e Object obj12, @d5.e Object obj13, @d5.e Object obj14, @d5.e Object obj15) {
        return i.a.p(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15);
    }

    @Override // q3.c
    @d5.e
    public Object v(@d5.e Object obj, @d5.e Object obj2, @d5.e Object obj3, @d5.e Object obj4, @d5.e Object obj5, @d5.e Object obj6, @d5.e Object obj7, @d5.e Object obj8, @d5.e Object obj9, @d5.e Object obj10, @d5.e Object obj11) {
        return i.a.l(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    @Override // q3.j
    @d5.e
    public Object z(@d5.e Object obj, @d5.e Object obj2, @d5.e Object obj3, @d5.e Object obj4, @d5.e Object obj5, @d5.e Object obj6, @d5.e Object obj7, @d5.e Object obj8, @d5.e Object obj9, @d5.e Object obj10, @d5.e Object obj11, @d5.e Object obj12, @d5.e Object obj13, @d5.e Object obj14, @d5.e Object obj15, @d5.e Object obj16, @d5.e Object obj17, @d5.e Object obj18) {
        return i.a.s(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18);
    }

    @Override // kotlin.reflect.jvm.internal.l
    @d5.d
    public kotlin.reflect.jvm.internal.calls.e<?> z0() {
        T b6 = this.caller.b(this, f26789y[1]);
        kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("詆"));
        return (kotlin.reflect.jvm.internal.calls.e) b6;
    }

    private q(p pVar, String str, String str2, kotlin.reflect.jvm.internal.impl.descriptors.z zVar, Object obj) {
        this.container = pVar;
        this.signature = str2;
        this.rawBoundReceiver = obj;
        this.descriptor = g0.c(zVar, new c(str));
        this.caller = g0.b(new a());
        this.defaultCaller = g0.b(new b());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(@d5.d p pVar, @d5.d String str, @d5.d String str2, @d5.e Object obj) {
        this(pVar, str, str2, null, obj);
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("訾"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("訿"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("詀"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(@d5.d kotlin.reflect.jvm.internal.p r10, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.z r11) {
        /*
            r9 = this;
            java.lang.String r0 = "詁"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r10, r0)
            java.lang.String r0 = "詂"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r11, r0)
            kotlin.reflect.jvm.internal.impl.name.f r0 = r11.getName()
            java.lang.String r3 = r0.h()
            java.lang.String r0 = "詃"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.o(r3, r0)
            kotlin.reflect.jvm.internal.j0 r0 = kotlin.reflect.jvm.internal.j0.f26695a
            kotlin.reflect.jvm.internal.j r0 = r0.g(r11)
            java.lang.String r4 = r0.get_signature()
            r6 = 0
            r7 = 16
            r8 = 0
            r1 = r9
            r2 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.q.<init>(kotlin.reflect.jvm.internal.p, kotlin.reflect.jvm.internal.impl.descriptors.z):void");
    }
}
