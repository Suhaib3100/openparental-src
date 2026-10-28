package kotlin.reflect.jvm.internal.calls;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.c0;
import kotlin.collections.g0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.text.m0;

/* compiled from: AnnotationConstructorCaller.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00000\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018²\u0006\u0016\u0010\u0016\u001a\u00020\u0005\"\b\b\u0000\u0010\r*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0016\u0010\u0017\u001a\u00020\u0007\"\b\b\u0000\u0010\r*\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "Ljava/lang/Class;", "expectedType", "k", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", "", "index", "", "name", "expectedJvmType", "", "j", "(ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Void;", "T", "annotationClass", "", "values", "", "Ljava/lang/reflect/Method;", "methods", "d", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "hashCode", "toString", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nAnnotationConstructorCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationConstructorCaller.kt\nkotlin/reflect/jvm/internal/calls/AnnotationConstructorCallerKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,181:1\n11065#2:182\n11400#2,3:183\n37#3,2:186\n18#3:195\n1549#4:188\n1620#4,3:189\n1726#4,3:192\n26#5:196\n*S KotlinDebug\n*F\n+ 1 AnnotationConstructorCaller.kt\nkotlin/reflect/jvm/internal/calls/AnnotationConstructorCallerKt\n*L\n75#1:182\n75#1:183,3\n75#1:186,2\n173#1:195\n102#1:188\n102#1:189,3\n106#1:192,3\n173#1:196\n*E\n"})
/* loaded from: classes7.dex */
public final class c {

    /* compiled from: AnnotationConstructorCaller.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "", "a", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    static final class a extends n0 implements ld.a<Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map<String, Object> f75591b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Map<String, ? extends Object> map) {
            super(0);
            this.f75591b = map;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            Iterator<T> it = this.f75591b.entrySet().iterator();
            int i4 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                i4 += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
            }
            return Integer.valueOf(i4);
        }
    }

    /* compiled from: AnnotationConstructorCaller.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class b extends n0 implements ld.a<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class<T> f75592b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<String, Object> f75593c;

        /* compiled from: AnnotationConstructorCaller.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "", "", "entry", "", "a", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
        static final class a extends n0 implements ld.l<Map.Entry<? extends String, ? extends Object>, CharSequence> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f75594b = new a(1);

            a() {
                super(1);
            }

            @Override // ld.l
            @l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(@l Map.Entry<String, ? extends Object> entry) {
                String obj;
                l0.p(entry, ProtectedSandApp.s("暮\u0001"));
                String key = entry.getKey();
                Object value = entry.getValue();
                boolean z4 = value instanceof boolean[];
                String s4 = ProtectedSandApp.s("暯\u0001");
                if (z4) {
                    obj = Arrays.toString((boolean[]) value);
                    l0.o(obj, s4);
                } else if (value instanceof char[]) {
                    obj = Arrays.toString((char[]) value);
                    l0.o(obj, s4);
                } else if (value instanceof byte[]) {
                    obj = Arrays.toString((byte[]) value);
                    l0.o(obj, s4);
                } else if (value instanceof short[]) {
                    obj = Arrays.toString((short[]) value);
                    l0.o(obj, s4);
                } else if (value instanceof int[]) {
                    obj = Arrays.toString((int[]) value);
                    l0.o(obj, s4);
                } else if (value instanceof float[]) {
                    obj = Arrays.toString((float[]) value);
                    l0.o(obj, s4);
                } else if (value instanceof long[]) {
                    obj = Arrays.toString((long[]) value);
                    l0.o(obj, s4);
                } else if (value instanceof double[]) {
                    obj = Arrays.toString((double[]) value);
                    l0.o(obj, s4);
                } else if (value instanceof Object[]) {
                    obj = Arrays.toString((Object[]) value);
                    l0.o(obj, s4);
                } else {
                    obj = value.toString();
                }
                return key + '=' + obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Class<T> cls, Map<String, ? extends Object> map) {
            super(0);
            this.f75592b = cls;
            this.f75593c = map;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            Class<T> cls = this.f75592b;
            Map<String, Object> map = this.f75593c;
            StringBuilder sb = new StringBuilder();
            sb.append('@');
            sb.append(cls.getCanonicalName());
            g0.j3(map.entrySet(), sb, (r14 & 2) != 0 ? ProtectedSandApp.s("慰\u0001") : ProtectedSandApp.s("暰\u0001"), (r14 & 4) != 0 ? "" : ProtectedSandApp.s("暱\u0001"), (r14 & 8) == 0 ? ProtectedSandApp.s("暲\u0001") : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? ProtectedSandApp.s("慱\u0001") : null, (r14 & 64) != 0 ? null : a.f75594b);
            String sb2 = sb.toString();
            l0.o(sb2, ProtectedSandApp.s("暳\u0001"));
            return sb2;
        }
    }

    @l
    public static final <T> T d(@l Class<T> cls, @l Map<String, ? extends Object> map, @l List<Method> list) {
        l0.p(cls, ProtectedSandApp.s("暴\u0001"));
        l0.p(map, ProtectedSandApp.s("暵\u0001"));
        l0.p(list, ProtectedSandApp.s("暶\u0001"));
        b0 c5 = c0.c(new a(map));
        T t4 = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new kotlin.reflect.jvm.internal.calls.b(cls, map, c0.c(new b(cls, map)), c5, list));
        l0.n(t4, ProtectedSandApp.s("暷\u0001"));
        return t4;
    }

    public static /* synthetic */ Object e(Class cls, Map map, List list, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            Set keySet = map.keySet();
            ArrayList arrayList = new ArrayList(w.b0(keySet, 10));
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
            }
            list = arrayList;
        }
        return d(cls, map, list);
    }

    private static final <T> boolean f(Class<T> cls, List<Method> list, Map<String, ? extends Object> map, Object obj) {
        boolean g4;
        boolean z4;
        kotlin.reflect.d a5;
        Annotation annotation = obj instanceof Annotation ? (Annotation) obj : null;
        if (!l0.g((annotation == null || (a5 = kd.b.a(annotation)) == null) ? null : kd.b.e(a5), cls)) {
            return false;
        }
        List<Method> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (Method method : list2) {
                Object obj2 = map.get(method.getName());
                Object invoke = method.invoke(obj, null);
                if (obj2 instanceof boolean[]) {
                    l0.n(invoke, ProtectedSandApp.s("暸\u0001"));
                    g4 = Arrays.equals((boolean[]) obj2, (boolean[]) invoke);
                } else if (obj2 instanceof char[]) {
                    l0.n(invoke, ProtectedSandApp.s("暹\u0001"));
                    g4 = Arrays.equals((char[]) obj2, (char[]) invoke);
                } else if (obj2 instanceof byte[]) {
                    l0.n(invoke, ProtectedSandApp.s("暺\u0001"));
                    g4 = Arrays.equals((byte[]) obj2, (byte[]) invoke);
                } else if (obj2 instanceof short[]) {
                    l0.n(invoke, ProtectedSandApp.s("暻\u0001"));
                    g4 = Arrays.equals((short[]) obj2, (short[]) invoke);
                } else if (obj2 instanceof int[]) {
                    l0.n(invoke, ProtectedSandApp.s("暼\u0001"));
                    g4 = Arrays.equals((int[]) obj2, (int[]) invoke);
                } else if (obj2 instanceof float[]) {
                    l0.n(invoke, ProtectedSandApp.s("暽\u0001"));
                    g4 = Arrays.equals((float[]) obj2, (float[]) invoke);
                } else if (obj2 instanceof long[]) {
                    l0.n(invoke, ProtectedSandApp.s("暾\u0001"));
                    g4 = Arrays.equals((long[]) obj2, (long[]) invoke);
                } else if (obj2 instanceof double[]) {
                    l0.n(invoke, ProtectedSandApp.s("暿\u0001"));
                    g4 = Arrays.equals((double[]) obj2, (double[]) invoke);
                } else if (obj2 instanceof Object[]) {
                    l0.n(invoke, ProtectedSandApp.s("曀\u0001"));
                    g4 = Arrays.equals((Object[]) obj2, (Object[]) invoke);
                } else {
                    g4 = l0.g(obj2, invoke);
                }
                if (!g4) {
                    z4 = false;
                    break;
                }
            }
        }
        z4 = true;
        return z4;
    }

    private static final int g(b0<Integer> b0Var) {
        return b0Var.getValue().intValue();
    }

    private static final String h(b0<String> b0Var) {
        return b0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(Class cls, Map map, b0 b0Var, b0 b0Var2, List list, Object obj, Method method, Object[] objArr) {
        l0.p(cls, ProtectedSandApp.s("曁\u0001"));
        l0.p(map, ProtectedSandApp.s("曂\u0001"));
        l0.p(b0Var, ProtectedSandApp.s("曃\u0001"));
        l0.p(b0Var2, ProtectedSandApp.s("曄\u0001"));
        l0.p(list, ProtectedSandApp.s("曅\u0001"));
        String name = method.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -1776922004) {
                if (hashCode != 147696667) {
                    if (hashCode == 1444986633 && name.equals(ProtectedSandApp.s("曆\u0001"))) {
                        return cls;
                    }
                } else if (name.equals(ProtectedSandApp.s("曇\u0001"))) {
                    return Integer.valueOf(g(b0Var2));
                }
            } else if (name.equals(ProtectedSandApp.s("曈\u0001"))) {
                return (String) b0Var.getValue();
            }
        }
        if (l0.g(name, ProtectedSandApp.s("曉\u0001")) && objArr != null && objArr.length == 1) {
            l0.m(objArr);
            return Boolean.valueOf(f(cls, list, map, kotlin.collections.l.gt(objArr)));
        }
        if (map.containsKey(name)) {
            return map.get(name);
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("曊\u0001"));
        sb.append(method);
        sb.append(ProtectedSandApp.s("曋\u0001"));
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb.append(kotlin.collections.l.Ky(objArr));
        sb.append(')');
        throw new kotlin.reflect.jvm.internal.g0(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void j(int i4, String str, Class<?> cls) {
        String N;
        kotlin.reflect.d d5 = l0.g(cls, Class.class) ? l1.d(kotlin.reflect.d.class) : (cls.isArray() && l0.g(cls.getComponentType(), Class.class)) ? l1.d(kotlin.reflect.d[].class) : kd.b.i(cls);
        if (l0.g(d5.N(), l1.d(Object[].class).N())) {
            StringBuilder sb = new StringBuilder();
            sb.append(d5.N());
            sb.append(m0.less);
            Class<?> componentType = kd.b.e(d5).getComponentType();
            l0.o(componentType, ProtectedSandApp.s("曌\u0001"));
            sb.append(kd.b.i(componentType).N());
            sb.append(m0.greater);
            N = sb.toString();
        } else {
            N = d5.N();
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("曍\u0001") + i4 + ' ' + str + ProtectedSandApp.s("曎\u0001") + N);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object k(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof kotlin.reflect.d) {
            obj = kd.b.e((kotlin.reflect.d) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof kotlin.reflect.d[]) {
                l0.n(obj, ProtectedSandApp.s("曏\u0001"));
                kotlin.reflect.d[] dVarArr = (kotlin.reflect.d[]) obj;
                ArrayList arrayList = new ArrayList(dVarArr.length);
                for (kotlin.reflect.d dVar : dVarArr) {
                    arrayList.add(kd.b.e(dVar));
                }
                obj = arrayList.toArray(new Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}
