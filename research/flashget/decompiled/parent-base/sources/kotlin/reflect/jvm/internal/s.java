package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
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
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.calls.a;
import kotlin.reflect.jvm.internal.calls.f;
import kotlin.reflect.jvm.internal.calls.j;
import kotlin.reflect.jvm.internal.i0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.k;
import kotlin.reflect.jvm.internal.l;

/* compiled from: KFunctionImpl.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB7\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u0011B+\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J5\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b0\u001e2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u001b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001b\u0010\t\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001f\u0010:\u001a\u0006\u0012\u0002\b\u0003058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R!\u0010=\u001a\b\u0012\u0002\b\u0003\u0018\u0001058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b<\u00109R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010\r\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010(R\u0014\u0010E\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010&R\u0014\u0010F\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010AR\u0014\u0010H\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010AR\u0014\u0010J\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010AR\u0014\u0010L\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010AR\u0014\u0010M\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010A¨\u0006N"}, d2 = {"Lkotlin/reflect/jvm/internal/s;", "Lkotlin/reflect/jvm/internal/n;", "", "Lkotlin/reflect/i;", "Lkotlin/jvm/internal/e0;", "Lkotlin/reflect/jvm/internal/k;", "Lkotlin/reflect/jvm/internal/r;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/z;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/r;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "", "name", "signature", "descriptorInitialValue", "rawBoundReceiver", "(Lkotlin/reflect/jvm/internal/r;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "boundReceiver", "(Lkotlin/reflect/jvm/internal/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/reflect/Method;", "member", "Lkotlin/reflect/jvm/internal/calls/f$h;", "B0", "(Ljava/lang/reflect/Method;)Lkotlin/reflect/jvm/internal/calls/f$h;", "A0", "z0", "Ljava/lang/reflect/Constructor;", "", "isDefault", "Lkotlin/reflect/jvm/internal/calls/f;", "y0", "(Ljava/lang/reflect/Constructor;Lkotlin/reflect/jvm/internal/impl/descriptors/z;Z)Lkotlin/reflect/jvm/internal/calls/f;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "h", "Lkotlin/reflect/jvm/internal/r;", "n0", "()Lkotlin/reflect/jvm/internal/r;", "i", "Ljava/lang/String;", "j", "Ljava/lang/Object;", "k", "Lkotlin/reflect/jvm/internal/i0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "Lkotlin/reflect/jvm/internal/calls/e;", "l", "Lkotlin/b0;", "m0", "()Lkotlin/reflect/jvm/internal/calls/e;", "caller", "m", "o0", "defaultCaller", "C0", "()Ljava/lang/Object;", "s0", "()Z", "isBound", "getName", "getArity", "arity", "isInline", "t", "isExternal", "x", "isOperator", "B", "isInfix", "isSuspend", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class s extends n<Object> implements kotlin.jvm.internal.e0<Object>, kotlin.reflect.i<Object>, k {

    /* renamed from: n, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.o<Object>[] f78807n = {l1.u(new g1(l1.d(s.class), ProtectedSandApp.s("艵\u0001"), ProtectedSandApp.s("艶\u0001")))};

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final r container;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String signature;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Object rawBoundReceiver;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i0.a descriptor;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.b0 caller;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.b0 defaultCaller;

    /* compiled from: KFunctionImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/e;", "Ljava/lang/reflect/Executable;", "a", "()Lkotlin/reflect/jvm/internal/calls/e;"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nKFunctionImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KFunctionImpl.kt\nkotlin/reflect/jvm/internal/KFunctionImpl$caller$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1549#2:201\n1620#2,3:202\n1549#2:206\n1620#2,3:207\n1#3:205\n*S KotlinDebug\n*F\n+ 1 KFunctionImpl.kt\nkotlin/reflect/jvm/internal/KFunctionImpl$caller$2\n*L\n68#1:201\n68#1:202,3\n83#1:206\n83#1:207,3\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.reflect.jvm.internal.calls.e<? extends Executable>> {
        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.calls.e<Executable> invoke() {
            Object b5;
            kotlin.reflect.jvm.internal.calls.e z02;
            l g4 = l0.f78709a.g(s.this.p0());
            if (g4 instanceof l.d) {
                if (s.this.r0()) {
                    Class<?> e4 = s.this.getContainer().e();
                    List<kotlin.reflect.n> parameters = s.this.getParameters();
                    ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(parameters, 10));
                    Iterator<T> it = parameters.iterator();
                    while (it.hasNext()) {
                        String name = ((kotlin.reflect.n) it.next()).getName();
                        kotlin.jvm.internal.l0.m(name);
                        arrayList.add(name);
                    }
                    return new kotlin.reflect.jvm.internal.calls.a(e4, arrayList, a.EnumC1067a.POSITIONAL_CALL, a.b.KOTLIN, null, 16, null);
                }
                b5 = s.this.getContainer().H(((l.d) g4).b());
            } else if (g4 instanceof l.e) {
                kotlin.reflect.jvm.internal.impl.descriptors.z p02 = s.this.p0();
                kotlin.reflect.jvm.internal.impl.descriptors.m c5 = p02.c();
                kotlin.jvm.internal.l0.o(c5, ProtectedSandApp.s("艮\u0001"));
                if (kotlin.reflect.jvm.internal.impl.resolve.h.d(c5) && (p02 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l) && ((kotlin.reflect.jvm.internal.impl.descriptors.l) p02).f0()) {
                    kotlin.reflect.jvm.internal.impl.descriptors.z p03 = s.this.p0();
                    r container = s.this.getContainer();
                    String b6 = ((l.e) g4).b();
                    List<j1> i4 = s.this.p0().i();
                    kotlin.jvm.internal.l0.o(i4, ProtectedSandApp.s("良\u0001"));
                    return new j.b(p03, container, b6, i4);
                }
                l.e eVar = (l.e) g4;
                b5 = s.this.getContainer().M(eVar.c(), eVar.b());
            } else if (g4 instanceof l.c) {
                b5 = ((l.c) g4).getMethod();
            } else {
                if (!(g4 instanceof l.b)) {
                    if (!(g4 instanceof l.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<Method> b7 = ((l.a) g4).b();
                    Class<?> e5 = s.this.getContainer().e();
                    List<Method> list = b7;
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.w.b0(list, 10));
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((Method) it2.next()).getName());
                    }
                    return new kotlin.reflect.jvm.internal.calls.a(e5, arrayList2, a.EnumC1067a.POSITIONAL_CALL, a.b.JAVA, b7);
                }
                b5 = ((l.b) g4).b();
            }
            if (b5 instanceof Constructor) {
                s sVar = s.this;
                z02 = sVar.y0((Constructor) b5, sVar.p0(), false);
            } else {
                if (!(b5 instanceof Method)) {
                    throw new g0(ProtectedSandApp.s("艰\u0001") + s.this.p0() + ProtectedSandApp.s("艱\u0001") + b5 + ')');
                }
                Method method = (Method) b5;
                z02 = !Modifier.isStatic(method.getModifiers()) ? s.this.z0(method) : s.this.p0().getAnnotations().k(p0.l()) != null ? s.this.A0(method) : s.this.B0(method);
            }
            return kotlin.reflect.jvm.internal.calls.k.i(z02, s.this.p0(), false, 2, null);
        }
    }

    /* compiled from: KFunctionImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/e;", "Ljava/lang/reflect/Executable;", "a", "()Lkotlin/reflect/jvm/internal/calls/e;"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nKFunctionImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KFunctionImpl.kt\nkotlin/reflect/jvm/internal/KFunctionImpl$defaultCaller$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,200:1\n1#2:201\n1549#3:202\n1620#3,3:203\n1549#3:206\n1620#3,3:207\n*S KotlinDebug\n*F\n+ 1 KFunctionImpl.kt\nkotlin/reflect/jvm/internal/KFunctionImpl$defaultCaller$2\n*L\n113#1:202\n113#1:203,3\n118#1:206\n118#1:207,3\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<kotlin.reflect.jvm.internal.calls.e<? extends Executable>> {
        b() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.lang.reflect.Member] */
        @Override // ld.a
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.calls.e<Executable> invoke() {
            GenericDeclaration genericDeclaration;
            kotlin.reflect.jvm.internal.calls.e eVar;
            l g4 = l0.f78709a.g(s.this.p0());
            if (g4 instanceof l.e) {
                kotlin.reflect.jvm.internal.impl.descriptors.z p02 = s.this.p0();
                kotlin.reflect.jvm.internal.impl.descriptors.m c5 = p02.c();
                kotlin.jvm.internal.l0.o(c5, ProtectedSandApp.s("色\u0001"));
                if (kotlin.reflect.jvm.internal.impl.resolve.h.d(c5) && (p02 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l) && ((kotlin.reflect.jvm.internal.impl.descriptors.l) p02).f0()) {
                    throw new g0(s.this.p0().c() + ProtectedSandApp.s("艳\u0001"));
                }
                r container = s.this.getContainer();
                l.e eVar2 = (l.e) g4;
                String c6 = eVar2.c();
                String b5 = eVar2.b();
                kotlin.jvm.internal.l0.m(s.this.m0().d());
                genericDeclaration = container.J(c6, b5, !Modifier.isStatic(r5.getModifiers()));
            } else if (g4 instanceof l.d) {
                if (s.this.r0()) {
                    Class<?> e4 = s.this.getContainer().e();
                    List<kotlin.reflect.n> parameters = s.this.getParameters();
                    ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(parameters, 10));
                    Iterator<T> it = parameters.iterator();
                    while (it.hasNext()) {
                        String name = ((kotlin.reflect.n) it.next()).getName();
                        kotlin.jvm.internal.l0.m(name);
                        arrayList.add(name);
                    }
                    return new kotlin.reflect.jvm.internal.calls.a(e4, arrayList, a.EnumC1067a.CALL_BY_NAME, a.b.KOTLIN, null, 16, null);
                }
                genericDeclaration = s.this.getContainer().I(((l.d) g4).b());
            } else {
                if (g4 instanceof l.a) {
                    List<Method> b6 = ((l.a) g4).b();
                    Class<?> e5 = s.this.getContainer().e();
                    List<Method> list = b6;
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.w.b0(list, 10));
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((Method) it2.next()).getName());
                    }
                    return new kotlin.reflect.jvm.internal.calls.a(e5, arrayList2, a.EnumC1067a.CALL_BY_NAME, a.b.JAVA, b6);
                }
                genericDeclaration = null;
            }
            if (genericDeclaration instanceof Constructor) {
                s sVar = s.this;
                eVar = sVar.y0((Constructor) genericDeclaration, sVar.p0(), true);
            } else if (genericDeclaration instanceof Method) {
                if (s.this.p0().getAnnotations().k(p0.l()) != null) {
                    kotlin.reflect.jvm.internal.impl.descriptors.m c7 = s.this.p0().c();
                    kotlin.jvm.internal.l0.n(c7, ProtectedSandApp.s("艴\u0001"));
                    if (!((kotlin.reflect.jvm.internal.impl.descriptors.e) c7).e0()) {
                        eVar = s.this.A0((Method) genericDeclaration);
                    }
                }
                eVar = s.this.B0((Method) genericDeclaration);
            } else {
                eVar = null;
            }
            if (eVar != null) {
                return kotlin.reflect.jvm.internal.calls.k.h(eVar, s.this.p0(), true);
            }
            return null;
        }
    }

    /* compiled from: KFunctionImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/z;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/z;"}, k = 3, mv = {1, 9, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<kotlin.reflect.jvm.internal.impl.descriptors.z> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f78817c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.f78817c = str;
        }

        @Override // ld.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.z invoke() {
            return s.this.getContainer().K(this.f78817c, s.this.signature);
        }
    }

    /* synthetic */ s(r rVar, String str, String str2, kotlin.reflect.jvm.internal.impl.descriptors.z zVar, Object obj, int i4, kotlin.jvm.internal.w wVar) {
        this(rVar, str, str2, zVar, (i4 & 16) != 0 ? kotlin.jvm.internal.q.NO_RECEIVER : obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.h A0(Method member) {
        return s0() ? new f.h.b(member) : new f.h.C1069f(member);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.h B0(Method member) {
        return s0() ? new f.h.c(member, C0()) : new f.h.g(member);
    }

    private final Object C0() {
        return kotlin.reflect.jvm.internal.calls.k.g(this.rawBoundReceiver, p0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.calls.f<Constructor<?>> y0(Constructor<?> member, kotlin.reflect.jvm.internal.impl.descriptors.z descriptor, boolean isDefault) {
        return (isDefault || !kotlin.reflect.jvm.internal.impl.resolve.jvm.b.f(descriptor)) ? s0() ? new f.c(member, C0()) : new f.e(member) : s0() ? new f.a(member, C0()) : new f.b(member);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.h z0(Method member) {
        return s0() ? new f.h.a(member, C0()) : new f.h.e(member);
    }

    @Override // kotlin.reflect.i
    public boolean B() {
        return p0().B();
    }

    @Override // kotlin.reflect.jvm.internal.n
    @fg.l
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.z t0() {
        i0.a aVar = this.descriptor;
        kotlin.reflect.o<Object> oVar = f78807n[0];
        Object invoke = aVar.invoke();
        kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("艻\u0001"));
        return (kotlin.reflect.jvm.internal.impl.descriptors.z) invoke;
    }

    @Override // ld.t
    @fg.m
    public Object H(@fg.m Object obj, @fg.m Object obj2, @fg.m Object obj3, @fg.m Object obj4, @fg.m Object obj5, @fg.m Object obj6) {
        return k.a.g(this, obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // ld.f
    @fg.m
    public Object I(@fg.m Object obj, @fg.m Object obj2, @fg.m Object obj3, @fg.m Object obj4, @fg.m Object obj5, @fg.m Object obj6, @fg.m Object obj7, @fg.m Object obj8, @fg.m Object obj9, @fg.m Object obj10, @fg.m Object obj11, @fg.m Object obj12, @fg.m Object obj13, @fg.m Object obj14) {
        return k.a.o(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14);
    }

    @Override // ld.i
    @fg.m
    public Object J(@fg.m Object obj, @fg.m Object obj2, @fg.m Object obj3, @fg.m Object obj4, @fg.m Object obj5, @fg.m Object obj6, @fg.m Object obj7, @fg.m Object obj8, @fg.m Object obj9, @fg.m Object obj10, @fg.m Object obj11, @fg.m Object obj12, @fg.m Object obj13, @fg.m Object obj14, @fg.m Object obj15, @fg.m Object obj16, @fg.m Object obj17) {
        return k.a.r(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17);
    }

    @Override // ld.u
    @fg.m
    public Object K(@fg.m Object obj, @fg.m Object obj2, @fg.m Object obj3, @fg.m Object obj4, @fg.m Object obj5, @fg.m Object obj6, @fg.m Object obj7) {
        return k.a.h(this, obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // ld.g
    @fg.m
    public Object M(@fg.m Object obj, @fg.m Object obj2, @fg.m Object obj3, @fg.m Object obj4, @fg.m Object obj5, @fg.m Object obj6, @fg.m Object obj7, @fg.m Object obj8, @fg.m Object obj9, @fg.m Object obj10, @fg.m Object obj11, @fg.m Object obj12, @fg.m Object obj13, @fg.m Object obj14, @fg.m Object obj15) {
        return k.a.p(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15);
    }

    @Override // ld.j
    @fg.m
    public Object O(@fg.m Object obj, @fg.m Object obj2, @fg.m Object obj3, @fg.m Object obj4, @fg.m Object obj5, @fg.m Object obj6, @fg.m Object obj7, @fg.m Object obj8, @fg.m Object obj9, @fg.m Object obj10, @fg.m Object obj11, @fg.m Object obj12, @fg.m Object obj13, @fg.m Object obj14, @fg.m Object obj15, @fg.m Object obj16, @fg.m Object obj17, @fg.m Object obj18) {
        return k.a.s(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18);
    }

    @Override // ld.q
    @fg.m
    public Object R(@fg.m Object obj, @fg.m Object obj2, @fg.m Object obj3) {
        return k.a.d(this, obj, obj2, obj3);
    }

    @Override // ld.d
    @fg.m
    public Object S(@fg.m Object obj, @fg.m Object obj2, @fg.m Object obj3, @fg.m Object obj4, @fg.m Object obj5, @fg.m Object obj6, @fg.m Object obj7, @fg.m Object obj8, @fg.m Object obj9, @fg.m Object obj10, @fg.m Object obj11, @fg.m Object obj12) {
        return k.a.m(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12);
    }

    @Override // ld.k
    @fg.m
    public Object U(@fg.m Object obj, @fg.m Object obj2, @fg.m Object obj3, @fg.m Object obj4, @fg.m Object obj5, @fg.m Object obj6, @fg.m Object obj7, @fg.m Object obj8, @fg.m Object obj9, @fg.m Object obj10, @fg.m Object obj11, @fg.m Object obj12, @fg.m Object obj13, @fg.m Object obj14, @fg.m Object obj15, @fg.m Object obj16, @fg.m Object obj17, @fg.m Object obj18, @fg.m Object obj19) {
        return k.a.t(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19);
    }

    @Override // ld.h
    @fg.m
    public Object V(@fg.m Object obj, @fg.m Object obj2, @fg.m Object obj3, @fg.m Object obj4, @fg.m Object obj5, @fg.m Object obj6, @fg.m Object obj7, @fg.m Object obj8, @fg.m Object obj9, @fg.m Object obj10, @fg.m Object obj11, @fg.m Object obj12, @fg.m Object obj13, @fg.m Object obj14, @fg.m Object obj15, @fg.m Object obj16) {
        return k.a.q(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16);
    }

    @Override // ld.w
    @fg.m
    public Object Y(@fg.m Object obj, @fg.m Object obj2, @fg.m Object obj3, @fg.m Object obj4, @fg.m Object obj5, @fg.m Object obj6, @fg.m Object obj7, @fg.m Object obj8, @fg.m Object obj9) {
        return k.a.j(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    @Override // ld.s
    @fg.m
    public Object a0(@fg.m Object obj, @fg.m Object obj2, @fg.m Object obj3, @fg.m Object obj4, @fg.m Object obj5) {
        return k.a.f(this, obj, obj2, obj3, obj4, obj5);
    }

    @Override // ld.n
    @fg.m
    public Object b0(@fg.m Object obj, @fg.m Object obj2, @fg.m Object obj3, @fg.m Object obj4, @fg.m Object obj5, @fg.m Object obj6, @fg.m Object obj7, @fg.m Object obj8, @fg.m Object obj9, @fg.m Object obj10, @fg.m Object obj11, @fg.m Object obj12, @fg.m Object obj13, @fg.m Object obj14, @fg.m Object obj15, @fg.m Object obj16, @fg.m Object obj17, @fg.m Object obj18, @fg.m Object obj19, @fg.m Object obj20, @fg.m Object obj21) {
        return k.a.v(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21);
    }

    @Override // ld.b
    @fg.m
    public Object c0(@fg.m Object obj, @fg.m Object obj2, @fg.m Object obj3, @fg.m Object obj4, @fg.m Object obj5, @fg.m Object obj6, @fg.m Object obj7, @fg.m Object obj8, @fg.m Object obj9, @fg.m Object obj10) {
        return k.a.k(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    @Override // ld.c
    @fg.m
    public Object e(@fg.m Object obj, @fg.m Object obj2, @fg.m Object obj3, @fg.m Object obj4, @fg.m Object obj5, @fg.m Object obj6, @fg.m Object obj7, @fg.m Object obj8, @fg.m Object obj9, @fg.m Object obj10, @fg.m Object obj11) {
        return k.a.l(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    public boolean equals(@fg.m Object other) {
        s c5 = p0.c(other);
        return c5 != null && kotlin.jvm.internal.l0.g(this.container, c5.container) && kotlin.jvm.internal.l0.g(getName(), c5.getName()) && kotlin.jvm.internal.l0.g(this.signature, c5.signature) && kotlin.jvm.internal.l0.g(this.rawBoundReceiver, c5.rawBoundReceiver);
    }

    @Override // kotlin.jvm.internal.e0
    public int getArity() {
        return kotlin.reflect.jvm.internal.calls.g.a(m0());
    }

    @Override // kotlin.reflect.c
    @fg.l
    public String getName() {
        String b5 = p0().getName().b();
        kotlin.jvm.internal.l0.o(b5, ProtectedSandApp.s("艺\u0001"));
        return b5;
    }

    public int hashCode() {
        return this.signature.hashCode() + ((getName().hashCode() + (this.container.hashCode() * 31)) * 31);
    }

    @Override // ld.r
    @fg.m
    public Object i(@fg.m Object obj, @fg.m Object obj2, @fg.m Object obj3, @fg.m Object obj4) {
        return k.a.e(this, obj, obj2, obj3, obj4);
    }

    @Override // ld.a
    @fg.m
    public Object invoke() {
        return k.a.a(this);
    }

    @Override // kotlin.reflect.c, kotlin.reflect.i
    public boolean isSuspend() {
        return p0().isSuspend();
    }

    @Override // kotlin.reflect.i
    public boolean k() {
        return p0().k();
    }

    @Override // kotlin.reflect.jvm.internal.n
    @fg.l
    public kotlin.reflect.jvm.internal.calls.e<?> m0() {
        return (kotlin.reflect.jvm.internal.calls.e) this.caller.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.n
    @fg.l
    /* renamed from: n0, reason: from getter */
    public r getContainer() {
        return this.container;
    }

    @Override // ld.v
    @fg.m
    public Object o(@fg.m Object obj, @fg.m Object obj2, @fg.m Object obj3, @fg.m Object obj4, @fg.m Object obj5, @fg.m Object obj6, @fg.m Object obj7, @fg.m Object obj8) {
        return k.a.i(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    @Override // kotlin.reflect.jvm.internal.n
    @fg.m
    public kotlin.reflect.jvm.internal.calls.e<?> o0() {
        return (kotlin.reflect.jvm.internal.calls.e) this.defaultCaller.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.n
    public boolean s0() {
        return !kotlin.jvm.internal.l0.g(this.rawBoundReceiver, kotlin.jvm.internal.q.NO_RECEIVER);
    }

    @Override // kotlin.reflect.i
    public boolean t() {
        return p0().t();
    }

    @fg.l
    public String toString() {
        return k0.f78694a.d(p0());
    }

    @Override // ld.m
    @fg.m
    public Object u(@fg.m Object obj, @fg.m Object obj2, @fg.m Object obj3, @fg.m Object obj4, @fg.m Object obj5, @fg.m Object obj6, @fg.m Object obj7, @fg.m Object obj8, @fg.m Object obj9, @fg.m Object obj10, @fg.m Object obj11, @fg.m Object obj12, @fg.m Object obj13, @fg.m Object obj14, @fg.m Object obj15, @fg.m Object obj16, @fg.m Object obj17, @fg.m Object obj18, @fg.m Object obj19, @fg.m Object obj20) {
        return k.a.u(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20);
    }

    @Override // kotlin.reflect.i
    public boolean x() {
        return p0().x();
    }

    @Override // ld.o
    @fg.m
    public Object y(@fg.m Object obj, @fg.m Object obj2, @fg.m Object obj3, @fg.m Object obj4, @fg.m Object obj5, @fg.m Object obj6, @fg.m Object obj7, @fg.m Object obj8, @fg.m Object obj9, @fg.m Object obj10, @fg.m Object obj11, @fg.m Object obj12, @fg.m Object obj13, @fg.m Object obj14, @fg.m Object obj15, @fg.m Object obj16, @fg.m Object obj17, @fg.m Object obj18, @fg.m Object obj19, @fg.m Object obj20, @fg.m Object obj21, @fg.m Object obj22) {
        return k.a.w(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22);
    }

    @Override // ld.e
    @fg.m
    public Object z(@fg.m Object obj, @fg.m Object obj2, @fg.m Object obj3, @fg.m Object obj4, @fg.m Object obj5, @fg.m Object obj6, @fg.m Object obj7, @fg.m Object obj8, @fg.m Object obj9, @fg.m Object obj10, @fg.m Object obj11, @fg.m Object obj12, @fg.m Object obj13) {
        return k.a.n(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13);
    }

    @Override // ld.l
    @fg.m
    public Object invoke(@fg.m Object obj) {
        return k.a.b(this, obj);
    }

    private s(r rVar, String str, String str2, kotlin.reflect.jvm.internal.impl.descriptors.z zVar, Object obj) {
        this.container = rVar;
        this.signature = str2;
        this.rawBoundReceiver = obj;
        this.descriptor = i0.b(zVar, new c(str));
        kotlin.f0 f0Var = kotlin.f0.PUBLICATION;
        this.caller = kotlin.c0.b(f0Var, new a());
        this.defaultCaller = kotlin.c0.b(f0Var, new b());
    }

    @Override // ld.p
    @fg.m
    public Object invoke(@fg.m Object obj, @fg.m Object obj2) {
        return k.a.c(this, obj, obj2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(@fg.l r rVar, @fg.l String str, @fg.l String str2, @fg.m Object obj) {
        this(rVar, str, str2, null, obj);
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("艷\u0001"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("艸\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("艹\u0001"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s(@fg.l kotlin.reflect.jvm.internal.r r10, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.z r11) {
        /*
            r9 = this;
            java.lang.String r0 = "艷\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r10, r0)
            java.lang.String r0 = "艵\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r11, r0)
            kotlin.reflect.jvm.internal.impl.name.f r0 = r11.getName()
            java.lang.String r3 = r0.b()
            java.lang.String r0 = "艺\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.o(r3, r0)
            kotlin.reflect.jvm.internal.l0 r0 = kotlin.reflect.jvm.internal.l0.f78709a
            kotlin.reflect.jvm.internal.l r0 = r0.g(r11)
            java.lang.String r4 = r0.get_signature()
            r7 = 16
            r8 = 0
            r6 = 0
            r1 = r9
            r2 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.s.<init>(kotlin.reflect.jvm.internal.r, kotlin.reflect.jvm.internal.impl.descriptors.z):void");
    }
}
