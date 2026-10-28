package kotlin.reflect.jvm.internal.calls;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.b0;
import kotlin.collections.y;
import kotlin.d0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KClass;
import kotlin.text.Typography;
import q3.l;

/* compiled from: AnnotationConstructorCaller.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002\u001a$\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002\u001aK\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016²\u0006\u0016\u0010\u0014\u001a\u00020\u0004\"\b\b\u0000\u0010\u000b*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0016\u0010\u0015\u001a\u00020\u0006\"\b\b\u0000\u0010\u000b*\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "Ljava/lang/Class;", "expectedType", "k", "", "index", "", "name", "expectedJvmType", "", "j", "T", "annotationClass", "", "values", "", "Ljava/lang/reflect/Method;", "methods", "d", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "hashCode", "toString", "kotlin-reflection"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class c {

    /* compiled from: AnnotationConstructorCaller.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "", "a", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.a<Integer> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Map<String, Object> f23836p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Map<String, ? extends Object> map) {
            super(0);
            this.f23836p = map;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer n() {
            Iterator<T> it = this.f23836p.entrySet().iterator();
            int i5 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                i5 += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
            }
            return Integer.valueOf(i5);
        }
    }

    /* compiled from: AnnotationConstructorCaller.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.a<String> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Class<T> f23837p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Map<String, Object> f23838q;

        /* compiled from: AnnotationConstructorCaller.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "", "", "entry", "", "a", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
        static final class a extends Lambda implements l<Map.Entry<? extends String, ? extends Object>, CharSequence> {

            /* renamed from: p, reason: collision with root package name */
            public static final a f23839p = new a();

            a() {
                super(1);
            }

            @Override // q3.l
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence N(@d5.d Map.Entry<String, ? extends Object> entry) {
                String obj;
                l0.p(entry, ProtectedSandApp.s("羨"));
                String key = entry.getKey();
                Object value = entry.getValue();
                boolean z5 = value instanceof boolean[];
                String s5 = ProtectedSandApp.s("義");
                if (z5) {
                    obj = Arrays.toString((boolean[]) value);
                    l0.o(obj, s5);
                } else if (value instanceof char[]) {
                    obj = Arrays.toString((char[]) value);
                    l0.o(obj, s5);
                } else if (value instanceof byte[]) {
                    obj = Arrays.toString((byte[]) value);
                    l0.o(obj, s5);
                } else if (value instanceof short[]) {
                    obj = Arrays.toString((short[]) value);
                    l0.o(obj, s5);
                } else if (value instanceof int[]) {
                    obj = Arrays.toString((int[]) value);
                    l0.o(obj, s5);
                } else if (value instanceof float[]) {
                    obj = Arrays.toString((float[]) value);
                    l0.o(obj, s5);
                } else if (value instanceof long[]) {
                    obj = Arrays.toString((long[]) value);
                    l0.o(obj, s5);
                } else if (value instanceof double[]) {
                    obj = Arrays.toString((double[]) value);
                    l0.o(obj, s5);
                } else if (value instanceof Object[]) {
                    obj = Arrays.toString((Object[]) value);
                    l0.o(obj, s5);
                } else {
                    obj = value.toString();
                }
                return key + '=' + obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Class<T> cls, Map<String, ? extends Object> map) {
            super(0);
            this.f23837p = cls;
            this.f23838q = map;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String n() {
            Class<T> cls = this.f23837p;
            Map<String, Object> map = this.f23838q;
            StringBuilder sb = new StringBuilder();
            sb.append('@');
            sb.append(cls.getCanonicalName());
            y.k3(map.entrySet(), sb, ProtectedSandApp.s("羪"), ProtectedSandApp.s("羫"), ProtectedSandApp.s("羬"), 0, null, a.f23839p, 48, null);
            String sb2 = sb.toString();
            l0.o(sb2, ProtectedSandApp.s("羭"));
            return sb2;
        }
    }

    @d5.d
    public static final <T> T d(@d5.d Class<T> cls, @d5.d Map<String, ? extends Object> map, @d5.d List<Method> list) {
        Lazy c6;
        Lazy c7;
        l0.p(cls, ProtectedSandApp.s("䍮"));
        l0.p(map, ProtectedSandApp.s("䍯"));
        l0.p(list, ProtectedSandApp.s("䍰"));
        c6 = d0.c(new a(map));
        c7 = d0.c(new b(cls, map));
        T t5 = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new kotlin.reflect.jvm.internal.calls.b(cls, map, c7, c6, list));
        l0.n(t5, ProtectedSandApp.s("䍱"));
        return t5;
    }

    public static /* synthetic */ Object e(Class cls, Map map, List list, int i5, Object obj) {
        int b02;
        if ((i5 & 4) != 0) {
            Set keySet = map.keySet();
            b02 = b0.b0(keySet, 10);
            ArrayList arrayList = new ArrayList(b02);
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), new Class[0]));
            }
            list = arrayList;
        }
        return d(cls, map, list);
    }

    private static final <T> boolean f(Class<T> cls, List<Method> list, Map<String, ? extends Object> map, Object obj) {
        boolean g5;
        boolean z5;
        KClass a6;
        Class cls2 = null;
        Annotation annotation = obj instanceof Annotation ? (Annotation) obj : null;
        if (annotation != null && (a6 = p3.b.a(annotation)) != null) {
            cls2 = p3.b.e(a6);
        }
        if (!l0.g(cls2, cls)) {
            return false;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Method method : list) {
                Object obj2 = map.get(method.getName());
                Object invoke = method.invoke(obj, new Object[0]);
                if (obj2 instanceof boolean[]) {
                    l0.n(invoke, ProtectedSandApp.s("䍲"));
                    g5 = Arrays.equals((boolean[]) obj2, (boolean[]) invoke);
                } else if (obj2 instanceof char[]) {
                    l0.n(invoke, ProtectedSandApp.s("䍳"));
                    g5 = Arrays.equals((char[]) obj2, (char[]) invoke);
                } else if (obj2 instanceof byte[]) {
                    l0.n(invoke, ProtectedSandApp.s("䍴"));
                    g5 = Arrays.equals((byte[]) obj2, (byte[]) invoke);
                } else if (obj2 instanceof short[]) {
                    l0.n(invoke, ProtectedSandApp.s("䍵"));
                    g5 = Arrays.equals((short[]) obj2, (short[]) invoke);
                } else if (obj2 instanceof int[]) {
                    l0.n(invoke, ProtectedSandApp.s("䍶"));
                    g5 = Arrays.equals((int[]) obj2, (int[]) invoke);
                } else if (obj2 instanceof float[]) {
                    l0.n(invoke, ProtectedSandApp.s("䍷"));
                    g5 = Arrays.equals((float[]) obj2, (float[]) invoke);
                } else if (obj2 instanceof long[]) {
                    l0.n(invoke, ProtectedSandApp.s("䍸"));
                    g5 = Arrays.equals((long[]) obj2, (long[]) invoke);
                } else if (obj2 instanceof double[]) {
                    l0.n(invoke, ProtectedSandApp.s("䍹"));
                    g5 = Arrays.equals((double[]) obj2, (double[]) invoke);
                } else if (obj2 instanceof Object[]) {
                    l0.n(invoke, ProtectedSandApp.s("䍺"));
                    g5 = Arrays.equals((Object[]) obj2, (Object[]) invoke);
                } else {
                    g5 = l0.g(obj2, invoke);
                }
                if (!g5) {
                    z5 = false;
                    break;
                }
            }
        }
        z5 = true;
        return z5;
    }

    private static final int g(Lazy<Integer> lazy) {
        return lazy.getValue().intValue();
    }

    private static final String h(Lazy<String> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
    
        if (r9.length == 1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(java.lang.Class r2, java.util.Map r3, kotlin.Lazy r4, kotlin.Lazy r5, java.util.List r6, java.lang.Object r7, java.lang.reflect.Method r8, java.lang.Object[] r9) {
        /*
            java.lang.String r7 = "䍻"
            java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
            kotlin.jvm.internal.l0.p(r2, r7)
            java.lang.String r7 = "䍼"
            java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
            kotlin.jvm.internal.l0.p(r3, r7)
            java.lang.String r7 = "䍽"
            java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
            kotlin.jvm.internal.l0.p(r4, r7)
            java.lang.String r7 = "䍾"
            java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
            kotlin.jvm.internal.l0.p(r5, r7)
            java.lang.String r7 = "䍿"
            java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
            kotlin.jvm.internal.l0.p(r6, r7)
            java.lang.String r7 = r8.getName()
            if (r7 == 0) goto L7c
            int r0 = r7.hashCode()
            r1 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
            if (r0 == r1) goto L6a
            r4 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r0 == r4) goto L54
            r4 = 1444986633(0x5620bf09, float:4.4185588E13)
            if (r0 == r4) goto L47
            goto L7c
        L47:
            java.lang.String r4 = "䎀"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto Lb3
            goto L7c
        L54:
            java.lang.String r4 = "䎁"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L61
            goto L7c
        L61:
            int r2 = g(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto Lb3
        L6a:
            java.lang.String r5 = "䎂"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L77
            goto L7c
        L77:
            java.lang.String r2 = h(r4)
            goto Lb3
        L7c:
            java.lang.String r4 = "䎃"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
            boolean r4 = kotlin.jvm.internal.l0.g(r7, r4)
            r5 = 0
            if (r4 == 0) goto La9
            if (r9 == 0) goto L90
            int r4 = r9.length
            r0 = 1
            if (r4 != r0) goto L90
            goto L91
        L90:
            r0 = r5
        L91:
            if (r0 == 0) goto La9
            java.lang.String r4 = "䎄"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
            kotlin.jvm.internal.l0.o(r9, r4)
            java.lang.Object r4 = kotlin.collections.l.ft(r9)
            boolean r2 = f(r2, r6, r3, r4)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto Lb3
        La9:
            boolean r2 = r3.containsKey(r7)
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r3.get(r7)
        Lb3:
            return r2
        Lb4:
            kotlin.reflect.jvm.internal.e0 r2 = new kotlin.reflect.jvm.internal.e0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "䎅"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
            r3.<init>(r4)
            r3.append(r8)
            java.lang.String r4 = "䎆"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
            r3.append(r4)
            if (r9 != 0) goto Ld1
            java.lang.Object[] r9 = new java.lang.Object[r5]
        Ld1:
            java.util.List r4 = kotlin.collections.l.Jy(r9)
            r3.append(r4)
            r4 = 41
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.c.i(java.lang.Class, java.util.Map, kotlin.b0, kotlin.b0, java.util.List, java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void j(int i5, String str, Class<?> cls) {
        String J;
        KClass d6 = l0.g(cls, Class.class) ? l1.d(KClass.class) : (cls.isArray() && l0.g(cls.getComponentType(), Class.class)) ? l1.d(KClass[].class) : p3.b.i(cls);
        if (l0.g(d6.J(), l1.d(Object[].class).J())) {
            StringBuilder sb = new StringBuilder();
            sb.append(d6.J());
            sb.append(Typography.f27129e);
            Class<?> componentType = p3.b.e(d6).getComponentType();
            l0.o(componentType, ProtectedSandApp.s("䎇"));
            sb.append(p3.b.i(componentType).J());
            sb.append(Typography.f27130f);
            J = sb.toString();
        } else {
            J = d6.J();
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("䎈") + i5 + ' ' + str + ProtectedSandApp.s("䎉") + J);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object k(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof KClass) {
            obj = p3.b.e((KClass) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof KClass[]) {
                l0.n(obj, ProtectedSandApp.s("䎊"));
                KClass[] kClassArr = (KClass[]) obj;
                ArrayList arrayList = new ArrayList(kClassArr.length);
                for (KClass kClass : kClassArr) {
                    arrayList.add(p3.b.e(kClass));
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
