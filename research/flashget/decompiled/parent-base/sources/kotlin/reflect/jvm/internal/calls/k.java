package kotlin.reflect.jvm.internal.calls;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlin.reflect.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.i0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.l1;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.p1;
import kotlin.reflect.jvm.internal.impl.types.t1;

/* compiled from: ValueClassAwareCaller.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u0014\u001a\u00020\u0013*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a6\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110\u0016¢\u0006\u0002\b\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a=\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\n\b\u0000\u0010\u001e*\u0004\u0018\u00010\u001d*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010!\u001a\u00020\u0011*\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010$\u001a\u00020\t*\u0006\u0012\u0002\b\u00030#2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010&\u001a\u00020\t*\u0006\u0012\u0002\b\u00030#2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010%\u001a\u0019\u0010'\u001a\b\u0012\u0002\b\u0003\u0018\u00010#*\u00020\u001aH\u0002¢\u0006\u0004\b'\u0010(\u001a\u001b\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010#*\u0004\u0018\u00010)H\u0000¢\u0006\u0004\b*\u0010+\u001a\u001f\u0010-\u001a\u0004\u0018\u00010,*\u0004\u0018\u00010,2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b-\u0010.\"\u001a\u00101\u001a\u0004\u0018\u00010\u001a*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/h;", "", "t", "(Lkotlin/reflect/jvm/internal/impl/descriptors/h;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/types/p0;", "type", "Lkotlin/reflect/jvm/internal/impl/descriptors/b;", "descriptor", "", "Ljava/lang/reflect/Method;", "o", "(Lkotlin/reflect/jvm/internal/impl/types/p0;Lkotlin/reflect/jvm/internal/impl/descriptors/b;)Ljava/util/List;", "m", "(Lkotlin/reflect/jvm/internal/impl/types/p0;)Ljava/util/List;", "Lkotlin/reflect/jvm/internal/calls/e;", "", "expectedArgsSize", "", "isDefault", "Lkotlin/k2;", "f", "(Lkotlin/reflect/jvm/internal/calls/e;ILkotlin/reflect/jvm/internal/impl/descriptors/b;Z)V", "Lkotlin/Function1;", "Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "Lkotlin/u;", "isSpecificClass", "Lkotlin/reflect/jvm/internal/impl/types/h0;", "q", "(Lkotlin/reflect/jvm/internal/impl/descriptors/b;Lld/l;)Ljava/util/List;", "Ljava/lang/reflect/Member;", "M", "h", "(Lkotlin/reflect/jvm/internal/calls/e;Lkotlin/reflect/jvm/internal/impl/descriptors/b;Z)Lkotlin/reflect/jvm/internal/calls/e;", "p", "(Lkotlin/reflect/jvm/internal/impl/descriptors/b;)Z", "Ljava/lang/Class;", "l", "(Ljava/lang/Class;Lkotlin/reflect/jvm/internal/impl/descriptors/b;)Ljava/lang/reflect/Method;", "j", "s", "(Lkotlin/reflect/jvm/internal/impl/types/h0;)Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/m;", "r", "(Lkotlin/reflect/jvm/internal/impl/descriptors/m;)Ljava/lang/Class;", "", "g", "(Ljava/lang/Object;Lkotlin/reflect/jvm/internal/impl/descriptors/b;)Ljava/lang/Object;", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "expectedReceiverType", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nValueClassAwareCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCallerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,363:1\n1#2:364\n1549#3:365\n1620#3,3:366\n1549#3:369\n1620#3,3:370\n1620#3,3:373\n1747#3,3:376\n1747#3,3:379\n1360#3:382\n1446#3,2:383\n1549#3:385\n1620#3,3:386\n1448#3,3:389\n*S KotlinDebug\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCallerKt\n*L\n252#1:365\n252#1:366,3\n254#1:369\n254#1:370,3\n290#1:373,3\n299#1:376,3\n300#1:379,3\n247#1:382\n247#1:383,2\n248#1:385\n248#1:386,3\n247#1:389,3\n*E\n"})
/* loaded from: classes7.dex */
public final class k {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(e<?> eVar, int i4, kotlin.reflect.jvm.internal.impl.descriptors.b bVar, boolean z4) {
        if (g.a(eVar) == i4) {
            return;
        }
        throw new g0(ProtectedSandApp.s("末\u0001") + g.a(eVar) + ProtectedSandApp.s("本\u0001") + i4 + ProtectedSandApp.s("札\u0001") + bVar + ProtectedSandApp.s("朮\u0001") + eVar.c() + ProtectedSandApp.s("术\u0001") + z4);
    }

    @m
    public static final Object g(@m Object obj, @l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        Class<?> s4;
        Method l4;
        l0.p(bVar, ProtectedSandApp.s("朰\u0001"));
        if ((bVar instanceof u0) && kotlin.reflect.jvm.internal.impl.resolve.h.e((l1) bVar)) {
            return obj;
        }
        h0 k4 = k(bVar);
        return (k4 == null || (s4 = s(k4)) == null || (l4 = l(s4, bVar)) == null) ? obj : l4.invoke(obj, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final <M extends Member> e<M> h(@l e<? extends M> eVar, @l kotlin.reflect.jvm.internal.impl.descriptors.b bVar, boolean z4) {
        l0.p(eVar, ProtectedSandApp.s("朱\u0001"));
        l0.p(bVar, ProtectedSandApp.s("朰\u0001"));
        if (!kotlin.reflect.jvm.internal.impl.resolve.h.a(bVar)) {
            List<x0> z02 = bVar.z0();
            l0.o(z02, ProtectedSandApp.s("朲\u0001"));
            List<x0> list = z02;
            boolean z5 = list instanceof Collection;
            String s4 = ProtectedSandApp.s("朳\u0001");
            if (!z5 || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    h0 type = ((x0) it.next()).getType();
                    l0.o(type, s4);
                    if (kotlin.reflect.jvm.internal.impl.resolve.h.h(type)) {
                        break;
                    }
                }
            }
            List<j1> i4 = bVar.i();
            l0.o(i4, ProtectedSandApp.s("朴\u0001"));
            List<j1> list2 = i4;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    h0 type2 = ((j1) it2.next()).getType();
                    l0.o(type2, s4);
                    if (kotlin.reflect.jvm.internal.impl.resolve.h.h(type2)) {
                        break;
                    }
                }
            }
            h0 returnType = bVar.getReturnType();
            if ((returnType == null || !kotlin.reflect.jvm.internal.impl.resolve.h.c(returnType)) && !p(bVar)) {
                return eVar;
            }
        }
        return new j(bVar, eVar, z4);
    }

    public static /* synthetic */ e i(e eVar, kotlin.reflect.jvm.internal.impl.descriptors.b bVar, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return h(eVar, bVar, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method j(Class<?> cls, kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(ProtectedSandApp.s("朵\u0001"), l(cls, bVar).getReturnType());
            l0.m(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new g0(ProtectedSandApp.s("朶\u0001") + cls + ProtectedSandApp.s("朷\u0001") + bVar + ')');
        }
    }

    private static final h0 k(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        x0 S = bVar.S();
        x0 O = bVar.O();
        if (S != null) {
            return S.getType();
        }
        if (O != null) {
            if (bVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.l) {
                return O.getType();
            }
            kotlin.reflect.jvm.internal.impl.descriptors.m c5 = bVar.c();
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) c5 : null;
            if (eVar != null) {
                return eVar.r();
            }
        }
        return null;
    }

    @l
    public static final Method l(@l Class<?> cls, @l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        l0.p(cls, ProtectedSandApp.s("朱\u0001"));
        l0.p(bVar, ProtectedSandApp.s("朰\u0001"));
        try {
            Method declaredMethod = cls.getDeclaredMethod(ProtectedSandApp.s("朸\u0001"), null);
            l0.m(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new g0(ProtectedSandApp.s("朹\u0001") + cls + ProtectedSandApp.s("朷\u0001") + bVar + ')');
        }
    }

    @m
    public static final List<Method> m(@l p0 p0Var) {
        l0.p(p0Var, ProtectedSandApp.s("机\u0001"));
        List<String> n4 = n(p1.a(p0Var));
        if (n4 == null) {
            return null;
        }
        List<String> list = n4;
        ArrayList arrayList = new ArrayList(w.b0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ProtectedSandApp.s("朻\u0001") + ((String) it.next()));
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = p0Var.O0().c();
        l0.n(c5, ProtectedSandApp.s("朼\u0001"));
        Class<?> s4 = kotlin.reflect.jvm.internal.p0.s((kotlin.reflect.jvm.internal.impl.descriptors.e) c5);
        l0.m(s4);
        ArrayList arrayList2 = new ArrayList(w.b0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(s4.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    private static final List<String> n(p0 p0Var) {
        Collection k4;
        if (!kotlin.reflect.jvm.internal.impl.resolve.h.i(p0Var)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = p0Var.O0().c();
        l0.n(c5, ProtectedSandApp.s("朼\u0001"));
        i0<p0> q4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.q((kotlin.reflect.jvm.internal.impl.descriptors.e) c5);
        l0.m(q4);
        List<q0<kotlin.reflect.jvm.internal.impl.name.f, p0>> b5 = q4.b();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = b5.iterator();
        while (it.hasNext()) {
            q0 q0Var = (q0) it.next();
            kotlin.reflect.jvm.internal.impl.name.f fVar = (kotlin.reflect.jvm.internal.impl.name.f) q0Var.a();
            List<String> n4 = n((p0) q0Var.b());
            if (n4 != null) {
                List<String> list = n4;
                k4 = new ArrayList(w.b0(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    k4.add(fVar.d() + '-' + ((String) it2.next()));
                }
            } else {
                k4 = w.k(fVar.d());
            }
            w.q0(arrayList, k4);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Method> o(p0 p0Var, kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        Method l4;
        List<Method> m4 = m(p0Var);
        if (m4 != null) {
            return m4;
        }
        Class<?> s4 = s(p0Var);
        if (s4 == null || (l4 = l(s4, bVar)) == null) {
            return null;
        }
        return w.k(l4);
    }

    private static final boolean p(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        h0 k4 = k(bVar);
        return k4 != null && kotlin.reflect.jvm.internal.impl.resolve.h.h(k4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<h0> q(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, ld.l<? super kotlin.reflect.jvm.internal.impl.descriptors.e, Boolean> lVar) {
        ArrayList arrayList = new ArrayList();
        x0 S = bVar.S();
        h0 type = S != null ? S.getType() : null;
        if (type != null) {
            arrayList.add(type);
        } else if (bVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.l) {
            kotlin.reflect.jvm.internal.impl.descriptors.e g02 = ((kotlin.reflect.jvm.internal.impl.descriptors.l) bVar).g0();
            l0.o(g02, ProtectedSandApp.s("朽\u0001"));
            if (g02.n()) {
                kotlin.reflect.jvm.internal.impl.descriptors.m c5 = g02.c();
                l0.n(c5, ProtectedSandApp.s("朼\u0001"));
                arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.e) c5).r());
            }
        } else {
            kotlin.reflect.jvm.internal.impl.descriptors.m c6 = bVar.c();
            l0.o(c6, ProtectedSandApp.s("朾\u0001"));
            if ((c6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && lVar.invoke(c6).booleanValue()) {
                arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.e) c6).r());
            }
        }
        List<j1> i4 = bVar.i();
        l0.o(i4, ProtectedSandApp.s("朴\u0001"));
        Iterator<T> it = i4.iterator();
        while (it.hasNext()) {
            arrayList.add(((j1) it.next()).getType());
        }
        return arrayList;
    }

    @m
    public static final Class<?> r(@m kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (!(mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) || !kotlin.reflect.jvm.internal.impl.resolve.h.b(mVar)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) mVar;
        Class<?> s4 = kotlin.reflect.jvm.internal.p0.s(eVar);
        if (s4 != null) {
            return s4;
        }
        throw new g0(ProtectedSandApp.s("朿\u0001") + eVar.getName() + ProtectedSandApp.s("杀\u0001") + kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.k((kotlin.reflect.jvm.internal.impl.descriptors.h) mVar) + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class<?> s(h0 h0Var) {
        Class<?> r4 = r(h0Var.O0().c());
        if (r4 == null) {
            return null;
        }
        if (!t1.l(h0Var)) {
            return r4;
        }
        h0 k4 = kotlin.reflect.jvm.internal.impl.resolve.h.k(h0Var);
        if (k4 == null || t1.l(k4) || kotlin.reflect.jvm.internal.impl.builtins.h.s0(k4)) {
            return null;
        }
        return r4;
    }

    @l
    public static final String t(@l kotlin.reflect.jvm.internal.impl.descriptors.h hVar) {
        l0.p(hVar, ProtectedSandApp.s("朱\u0001"));
        kotlin.reflect.jvm.internal.impl.name.b k4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.k(hVar);
        l0.m(k4);
        String c5 = k4.c();
        l0.o(c5, ProtectedSandApp.s("杁\u0001"));
        return kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b.b(c5);
    }
}
