package kotlin.reflect.jvm.internal.calls;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.p1;
import kotlin.reflect.jvm.internal.p0;
import kotlin.reflect.jvm.internal.r;
import kotlin.text.v;

/* compiled from: ValueClassAwareCaller.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002\u0015\u000eB%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u001a\u0010\u001d\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0016R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020&0*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010+¨\u0006-"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/j;", "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/e;", "Lkotlin/reflect/jvm/internal/impl/descriptors/b;", "descriptor", "oldCaller", "", "isDefault", "<init>", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/e;Z)V", "", "index", "Lkotlin/ranges/l;", "b", "(I)Lkotlin/ranges/l;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "a", "Z", "Lkotlin/reflect/jvm/internal/calls/e;", "caller", "c", "Ljava/lang/reflect/Member;", "d", "()Ljava/lang/reflect/Member;", "member", "Lkotlin/reflect/jvm/internal/calls/j$a;", "Lkotlin/reflect/jvm/internal/calls/j$a;", "data", "e", "[Lkotlin/ranges/l;", "slices", "f", "hasMfvcParameters", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "", "()Ljava/util/List;", "parameterTypes", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nValueClassAwareCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,363:1\n1549#2:364\n1620#2,3:365\n1747#2,3:374\n1620#2,3:377\n37#3,2:368\n37#3,2:372\n37#3,2:380\n1#4:370\n26#5:371\n*S KotlinDebug\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller\n*L\n43#1:364\n43#1:365,3\n156#1:374,3\n174#1:377,3\n43#1:368,2\n145#1:372,2\n182#1:380,2\n79#1:371\n*E\n"})
/* loaded from: classes7.dex */
public final class j<M extends Member> implements e<M> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isDefault;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final e<M> caller;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final M member;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final a data;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final kotlin.ranges.l[] slices;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean hasMfvcParameters;

    /* compiled from: ValueClassAwareCaller.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR%\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/j$a;", "", "Lkotlin/ranges/l;", "argumentRange", "", "", "Ljava/lang/reflect/Method;", "unboxParameters", "box", "<init>", "(Lkotlin/ranges/l;[Ljava/util/List;Ljava/lang/reflect/Method;)V", "a", "Lkotlin/ranges/l;", "()Lkotlin/ranges/l;", "b", "[Ljava/util/List;", "c", "()[Ljava/util/List;", "Ljava/lang/reflect/Method;", "()Ljava/lang/reflect/Method;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final kotlin.ranges.l argumentRange;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final List<Method>[] unboxParameters;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @m
        private final Method box;

        public a(@l kotlin.ranges.l lVar, @l List<Method>[] listArr, @m Method method) {
            l0.p(lVar, ProtectedSandApp.s("朘\u0001"));
            l0.p(listArr, ProtectedSandApp.s("朙\u0001"));
            this.argumentRange = lVar;
            this.unboxParameters = listArr;
            this.box = method;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final kotlin.ranges.l getArgumentRange() {
            return this.argumentRange;
        }

        @m
        /* renamed from: b, reason: from getter */
        public final Method getBox() {
            return this.box;
        }

        @l
        public final List<Method>[] c() {
            return this.unboxParameters;
        }
    }

    /* compiled from: ValueClassAwareCaller.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR'\u0010\u001f\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0\t0\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0017\u0010\u001eR \u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\u0019\u0010\u001eR\u0016\u0010$\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010#R\u0014\u0010'\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lkotlin/reflect/jvm/internal/calls/j$b;", "Lkotlin/reflect/jvm/internal/calls/e;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/z;", "descriptor", "Lkotlin/reflect/jvm/internal/r;", "container", "", "constructorDesc", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/r0;", "originalParameters", "<init>", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/reflect/jvm/internal/r;Ljava/lang/String;Ljava/util/List;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "a", "Ljava/lang/reflect/Method;", "constructorImpl", "b", "boxMethod", "c", "Ljava/util/List;", "parameterUnboxMethods", "Ljava/lang/Class;", "d", "()Ljava/util/List;", "originalParametersGroups", "Ljava/lang/reflect/Type;", "e", "parameterTypes", "()Ljava/lang/Void;", "member", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nValueClassAwareCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$MultiFieldValueClassPrimaryConstructorCaller\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,363:1\n1549#2:364\n1620#2,3:365\n1559#2:368\n1590#2,3:369\n1549#2:372\n1620#2,3:373\n1593#2:376\n1360#2:377\n1446#2,2:378\n1549#2:380\n1620#2,3:381\n1448#2,3:384\n37#3,2:387\n*S KotlinDebug\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$MultiFieldValueClassPrimaryConstructorCaller\n*L\n214#1:364\n214#1:365,3\n222#1:368\n222#1:369,3\n224#1:372\n224#1:373,3\n222#1:376\n231#1:377\n231#1:378,2\n231#1:380\n231#1:381,3\n231#1:384,3\n231#1:387,2\n*E\n"})
    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final Method constructorImpl;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final Method boxMethod;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @l
        private final List<List<Method>> parameterUnboxMethods;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @l
        private final List<List<Class<?>>> originalParametersGroups;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @l
        private final List<Type> parameterTypes;

        public b(@l z zVar, @l r rVar, @l String str, @l List<? extends r0> list) {
            Collection k4;
            List o4;
            l0.p(zVar, ProtectedSandApp.s("朚\u0001"));
            l0.p(rVar, ProtectedSandApp.s("望\u0001"));
            l0.p(str, ProtectedSandApp.s("朜\u0001"));
            l0.p(list, ProtectedSandApp.s("朝\u0001"));
            Method M = rVar.M(ProtectedSandApp.s("朞\u0001"), str);
            l0.m(M);
            this.constructorImpl = M;
            Method M2 = rVar.M(ProtectedSandApp.s("朠\u0001"), v.g4(str, ProtectedSandApp.s("期\u0001")) + kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.b(rVar.e()));
            l0.m(M2);
            this.boxMethod = M2;
            List<? extends r0> list2 = list;
            ArrayList arrayList = new ArrayList(w.b0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                h0 type = ((r0) it.next()).getType();
                l0.o(type, ProtectedSandApp.s("朡\u0001"));
                o4 = k.o(p1.a(type), zVar);
                arrayList.add(o4);
            }
            this.parameterUnboxMethods = arrayList;
            ArrayList arrayList2 = new ArrayList(w.b0(list2, 10));
            int i4 = 0;
            for (Object obj : list2) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    w.Z();
                }
                kotlin.reflect.jvm.internal.impl.descriptors.h c5 = ((r0) obj).getType().O0().c();
                l0.n(c5, ProtectedSandApp.s("朢\u0001"));
                kotlin.reflect.jvm.internal.impl.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) c5;
                List<Method> list3 = this.parameterUnboxMethods.get(i4);
                if (list3 != null) {
                    List<Method> list4 = list3;
                    k4 = new ArrayList(w.b0(list4, 10));
                    Iterator<T> it2 = list4.iterator();
                    while (it2.hasNext()) {
                        k4.add(((Method) it2.next()).getReturnType());
                    }
                } else {
                    Class<?> s4 = p0.s(eVar);
                    l0.m(s4);
                    k4 = w.k(s4);
                }
                arrayList2.add(k4);
                i4 = i5;
            }
            this.originalParametersGroups = arrayList2;
            this.parameterTypes = w.d0(arrayList2);
        }

        @m
        public Void a() {
            return null;
        }

        @l
        public final List<List<Class<?>>> b() {
            return this.originalParametersGroups;
        }

        @Override // kotlin.reflect.jvm.internal.calls.e
        @l
        public List<Type> c() {
            return this.parameterTypes;
        }

        @Override // kotlin.reflect.jvm.internal.calls.e
        @m
        public Object call(@l Object[] args) {
            Collection k4;
            l0.p(args, ProtectedSandApp.s("朣\u0001"));
            List<q0> sA = kotlin.collections.l.sA(args, this.parameterUnboxMethods);
            ArrayList arrayList = new ArrayList();
            for (q0 q0Var : sA) {
                Object a5 = q0Var.a();
                List list = (List) q0Var.b();
                if (list != null) {
                    List list2 = list;
                    k4 = new ArrayList(w.b0(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        k4.add(((Method) it.next()).invoke(a5, null));
                    }
                } else {
                    k4 = w.k(a5);
                }
                w.q0(arrayList, k4);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            this.constructorImpl.invoke(null, Arrays.copyOf(array, array.length));
            return this.boxMethod.invoke(null, Arrays.copyOf(array, array.length));
        }

        @Override // kotlin.reflect.jvm.internal.calls.e
        public Member d() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.calls.e
        @l
        public Type getReturnType() {
            Class<?> returnType = this.boxMethod.getReturnType();
            l0.o(returnType, ProtectedSandApp.s("朤\u0001"));
            return returnType;
        }
    }

    /* compiled from: ValueClassAwareCaller.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\f\b\u0000\u0010\u0001 \u0001*\u0004\u0018\u00010\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "", "invoke", "(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class c extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.descriptors.e, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f75628b = new c(1);

        c() {
            super(1);
        }

        @Override // ld.l
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            l0.p(eVar, ProtectedSandApp.s("朥\u0001"));
            return Boolean.valueOf(kotlin.reflect.jvm.internal.impl.resolve.h.g(eVar));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x00ad, code lost:
    
        r13 = kotlin.reflect.jvm.internal.calls.k.s(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00df, code lost:
    
        if ((r12 instanceof kotlin.reflect.jvm.internal.calls.d) != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b r11, @fg.l kotlin.reflect.jvm.internal.calls.e<? extends M> r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.j.<init>(kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.calls.e, boolean):void");
    }

    private static final int a(h0 h0Var) {
        List<Method> m4 = k.m(p1.a(h0Var));
        if (m4 != null) {
            return m4.size();
        }
        return 1;
    }

    @l
    public final kotlin.ranges.l b(int index) {
        if (index >= 0) {
            kotlin.ranges.l[] lVarArr = this.slices;
            if (index < lVarArr.length) {
                return lVarArr[index];
            }
        }
        kotlin.ranges.l[] lVarArr2 = this.slices;
        if (lVarArr2.length == 0) {
            return new kotlin.ranges.l(index, index, 1);
        }
        int last = ((kotlin.ranges.l) kotlin.collections.l.Ah(lVarArr2)).getLast() + 1 + (index - lVarArr2.length);
        return new kotlin.ranges.l(last, last, 1);
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @l
    public List<Type> c() {
        return this.caller.c();
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @m
    public Object call(@l Object[] args) {
        Object invoke;
        Object obj;
        Object g4;
        l0.p(args, ProtectedSandApp.s("朩\u0001"));
        kotlin.ranges.l argumentRange = this.data.getArgumentRange();
        List<Method>[] c5 = this.data.c();
        Method box = this.data.getBox();
        if (!argumentRange.isEmpty()) {
            boolean z4 = this.hasMfvcParameters;
            String s4 = ProtectedSandApp.s("未\u0001");
            if (z4) {
                kotlin.collections.builders.b bVar = new kotlin.collections.builders.b(args.length);
                int first = argumentRange.getFirst();
                for (int i4 = 0; i4 < first; i4++) {
                    bVar.add(args[i4]);
                }
                int first2 = argumentRange.getFirst();
                int last = argumentRange.getLast();
                if (first2 <= last) {
                    while (true) {
                        List<Method> list = c5[first2];
                        Object obj2 = args[first2];
                        if (list != null) {
                            for (Method method : list) {
                                if (obj2 != null) {
                                    g4 = method.invoke(obj2, null);
                                } else {
                                    Class<?> returnType = method.getReturnType();
                                    l0.o(returnType, s4);
                                    g4 = p0.g(returnType);
                                }
                                bVar.add(g4);
                            }
                        } else {
                            bVar.add(obj2);
                        }
                        if (first2 == last) {
                            break;
                        }
                        first2++;
                    }
                }
                int last2 = argumentRange.getLast() + 1;
                int we2 = kotlin.collections.l.we(args);
                if (last2 <= we2) {
                    while (true) {
                        bVar.add(args[last2]);
                        if (last2 == we2) {
                            break;
                        }
                        last2++;
                    }
                }
                args = w.a(bVar).toArray(new Object[0]);
            } else {
                int length = args.length;
                Object[] objArr = new Object[length];
                for (int i5 = 0; i5 < length; i5++) {
                    int first3 = argumentRange.getFirst();
                    if (i5 > argumentRange.getLast() || first3 > i5) {
                        obj = args[i5];
                    } else {
                        List<Method> list2 = c5[i5];
                        Method method2 = list2 != null ? (Method) w.h5(list2) : null;
                        obj = args[i5];
                        if (method2 != null) {
                            if (obj != null) {
                                obj = method2.invoke(obj, null);
                            } else {
                                Class<?> returnType2 = method2.getReturnType();
                                l0.o(returnType2, s4);
                                obj = p0.g(returnType2);
                            }
                        }
                    }
                    objArr[i5] = obj;
                }
                args = objArr;
            }
        }
        Object call = this.caller.call(args);
        return call == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? call : (box == null || (invoke = box.invoke(null, call)) == null) ? call : invoke;
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    public M d() {
        return this.member;
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @l
    public Type getReturnType() {
        return this.caller.getReturnType();
    }
}
