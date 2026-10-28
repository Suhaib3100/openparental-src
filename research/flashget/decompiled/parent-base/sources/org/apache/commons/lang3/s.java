package org.apache.commons.lang3;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: ClassUtils.java */
/* loaded from: classes6.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public static final char f86096a = '.';

    /* renamed from: c, reason: collision with root package name */
    public static final char f86098c = '$';

    /* renamed from: e, reason: collision with root package name */
    private static final Map<String, Class<?>> f86100e;

    /* renamed from: f, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f86101f;

    /* renamed from: g, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f86102g;

    /* renamed from: h, reason: collision with root package name */
    private static final Map<String, String> f86103h;

    /* renamed from: i, reason: collision with root package name */
    private static final Map<String, String> f86104i;

    /* renamed from: b, reason: collision with root package name */
    public static final String f86097b = String.valueOf('.');

    /* renamed from: d, reason: collision with root package name */
    public static final String f86099d = String.valueOf('$');

    /* compiled from: ClassUtils.java */
    static class a implements Iterator<Class<?>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ze.h f86105b;

        a(ze.h hVar) {
            this.f86105b = hVar;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Class<?> next() {
            Class<?> cls = (Class) this.f86105b.getValue();
            this.f86105b.setValue(cls.getSuperclass());
            return cls;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f86105b.getValue() != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: ClassUtils.java */
    static class b implements Iterator<Class<?>> {

        /* renamed from: b, reason: collision with root package name */
        Iterator f86106b = Collections.emptySet().iterator();

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator f86107c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Set f86108d;

        b(Iterator it, Set set) {
            this.f86107c = it;
            this.f86108d = set;
        }

        private void b(Set<Class<?>> set, Class<?> cls) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (!this.f86108d.contains(cls2)) {
                    set.add(cls2);
                }
                b(set, cls2);
            }
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Class<?> next() {
            if (this.f86106b.hasNext()) {
                Class<?> cls = (Class) this.f86106b.next();
                this.f86108d.add(cls);
                return cls;
            }
            Class<?> cls2 = (Class) this.f86107c.next();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            b(linkedHashSet, cls2);
            this.f86106b = linkedHashSet.iterator();
            return cls2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f86106b.hasNext() || this.f86107c.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: ClassUtils.java */
    public enum c {
        INCLUDE,
        EXCLUDE
    }

    static {
        HashMap hashMap = new HashMap();
        f86100e = hashMap;
        Class cls = Boolean.TYPE;
        hashMap.put("boolean", cls);
        Class cls2 = Byte.TYPE;
        hashMap.put("byte", cls2);
        Class cls3 = Character.TYPE;
        hashMap.put("char", cls3);
        Class cls4 = Short.TYPE;
        hashMap.put("short", cls4);
        Class cls5 = Integer.TYPE;
        hashMap.put("int", cls5);
        Class cls6 = Long.TYPE;
        hashMap.put("long", cls6);
        Class cls7 = Double.TYPE;
        hashMap.put("double", cls7);
        Class cls8 = Float.TYPE;
        hashMap.put("float", cls8);
        Class cls9 = Void.TYPE;
        hashMap.put("void", cls9);
        HashMap hashMap2 = new HashMap();
        f86101f = hashMap2;
        hashMap2.put(cls, Boolean.class);
        hashMap2.put(cls2, Byte.class);
        hashMap2.put(cls3, Character.class);
        hashMap2.put(cls4, Short.class);
        hashMap2.put(cls5, Integer.class);
        hashMap2.put(cls6, Long.class);
        hashMap2.put(cls7, Double.class);
        hashMap2.put(cls8, Float.class);
        hashMap2.put(cls9, cls9);
        f86102g = new HashMap();
        for (Map.Entry entry : hashMap2.entrySet()) {
            Class<?> cls10 = (Class) entry.getKey();
            Class<?> cls11 = (Class) entry.getValue();
            if (!cls10.equals(cls11)) {
                f86102g.put(cls11, cls10);
            }
        }
        HashMap a5 = com.coremedia.iso.boxes.d.a("int", "I", "boolean", "Z");
        a5.put("float", "F");
        a5.put("long", "J");
        a5.put("short", "S");
        a5.put("byte", "B");
        a5.put("double", "D");
        a5.put("char", "C");
        HashMap hashMap3 = new HashMap();
        for (Map.Entry entry2 : a5.entrySet()) {
            hashMap3.put(entry2.getValue(), entry2.getKey());
        }
        f86103h = Collections.unmodifiableMap(a5);
        f86104i = Collections.unmodifiableMap(hashMap3);
    }

    public static String A(Object obj, String str) {
        return obj == null ? str : z(obj.getClass());
    }

    public static String B(String str) {
        if (b1.G0(str)) {
            return "";
        }
        while (str.charAt(0) == '[') {
            str = str.substring(1);
        }
        if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
            str = str.substring(1);
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? "" : str.substring(0, lastIndexOf);
    }

    public static Method C(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Method method = cls.getMethod(str, clsArr);
        if (Modifier.isPublic(method.getDeclaringClass().getModifiers())) {
            return method;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(g(cls));
        arrayList.addAll(i(cls));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Class cls2 = (Class) it.next();
            if (Modifier.isPublic(cls2.getModifiers())) {
                try {
                    Method method2 = cls2.getMethod(str, clsArr);
                    if (Modifier.isPublic(method2.getDeclaringClass().getModifiers())) {
                        return method2;
                    }
                } catch (NoSuchMethodException unused) {
                    continue;
                }
            }
        }
        StringBuilder a5 = androidx.appcompat.view.g.a("Can't find a public method for ", str, " ");
        a5.append(e.S5(clsArr));
        throw new NoSuchMethodException(a5.toString());
    }

    public static String D(Class<?> cls) {
        return cls == null ? "" : F(cls.getName());
    }

    public static String E(Object obj, String str) {
        return obj == null ? str : F(obj.getClass().getName());
    }

    public static String F(String str) {
        return I(n(str));
    }

    public static String G(Class<?> cls) {
        return cls == null ? "" : I(cls.getName());
    }

    public static String H(Object obj, String str) {
        return obj == null ? str : G(obj.getClass());
    }

    public static String I(String str) {
        if (b1.G0(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (str.startsWith("[")) {
            while (str.charAt(0) == '[') {
                str = str.substring(1);
                sb.append("[]");
            }
            if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
                str = androidx.core.content.f.a(str, 1, 1);
            }
            Map<String, String> map = f86104i;
            if (map.containsKey(str)) {
                str = map.get(str);
            }
        }
        int lastIndexOf = str.lastIndexOf(46);
        int indexOf = str.indexOf(36, lastIndexOf != -1 ? lastIndexOf + 1 : 0);
        String substring = str.substring(lastIndexOf + 1);
        if (indexOf != -1) {
            substring = substring.replace('$', '.');
        }
        return substring + ((Object) sb);
    }

    public static String J(Class<?> cls) {
        return K(cls, "");
    }

    public static String K(Class<?> cls, String str) {
        return cls == null ? str : cls.getSimpleName();
    }

    public static String L(Object obj) {
        return M(obj, "");
    }

    public static String M(Object obj, String str) {
        return obj == null ? str : obj.getClass().getSimpleName();
    }

    public static Iterable<Class<?>> N(Class<?> cls) {
        return O(cls, c.EXCLUDE);
    }

    public static Iterable<Class<?>> O(final Class<?> cls, c cVar) {
        final Iterable<Class<?>> iterable = new Iterable() { // from class: org.apache.commons.lang3.q
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                Iterator W;
                W = s.W(cls);
                return W;
            }
        };
        return cVar != c.INCLUDE ? iterable : new Iterable() { // from class: org.apache.commons.lang3.r
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                Iterator X;
                X = s.X(iterable);
                return X;
            }
        };
    }

    public static boolean P(Class<?> cls, Class<?> cls2) {
        return Q(cls, cls2, true);
    }

    public static boolean Q(Class<?> cls, Class<?> cls2, boolean z4) {
        if (cls2 == null) {
            return false;
        }
        if (cls == null) {
            return !cls2.isPrimitive();
        }
        if (z4) {
            if (cls.isPrimitive() && !cls2.isPrimitive() && (cls = Y(cls)) == null) {
                return false;
            }
            if (cls2.isPrimitive() && !cls.isPrimitive() && (cls = d0(cls)) == null) {
                return false;
            }
        }
        if (cls.equals(cls2)) {
            return true;
        }
        if (!cls.isPrimitive()) {
            return cls2.isAssignableFrom(cls);
        }
        if (!cls2.isPrimitive()) {
            return false;
        }
        Class cls3 = Integer.TYPE;
        if (cls3.equals(cls)) {
            return Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2);
        }
        Class cls4 = Long.TYPE;
        if (cls4.equals(cls)) {
            return Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2);
        }
        if (Boolean.TYPE.equals(cls)) {
            return false;
        }
        Class cls5 = Double.TYPE;
        if (cls5.equals(cls)) {
            return false;
        }
        Class cls6 = Float.TYPE;
        if (cls6.equals(cls)) {
            return cls5.equals(cls2);
        }
        if (Character.TYPE.equals(cls)) {
            return cls3.equals(cls2) || cls4.equals(cls2) || cls6.equals(cls2) || cls5.equals(cls2);
        }
        Class cls7 = Short.TYPE;
        if (cls7.equals(cls)) {
            return cls3.equals(cls2) || cls4.equals(cls2) || cls6.equals(cls2) || cls5.equals(cls2);
        }
        if (Byte.TYPE.equals(cls)) {
            return cls7.equals(cls2) || cls3.equals(cls2) || cls4.equals(cls2) || cls6.equals(cls2) || cls5.equals(cls2);
        }
        return false;
    }

    public static boolean R(Class<?>[] clsArr, Class<?>... clsArr2) {
        return S(clsArr, clsArr2, true);
    }

    public static boolean S(Class<?>[] clsArr, Class<?>[] clsArr2, boolean z4) {
        if (!e.H1(clsArr, clsArr2)) {
            return false;
        }
        if (clsArr == null) {
            clsArr = e.f85955g;
        }
        if (clsArr2 == null) {
            clsArr2 = e.f85955g;
        }
        for (int i4 = 0; i4 < clsArr.length; i4++) {
            if (!Q(clsArr[i4], clsArr2[i4], z4)) {
                return false;
            }
        }
        return true;
    }

    public static boolean T(Class<?> cls) {
        return (cls == null || cls.getEnclosingClass() == null) ? false : true;
    }

    public static boolean U(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        return cls.isPrimitive() || f86102g.containsKey(cls);
    }

    public static boolean V(Class<?> cls) {
        return f86102g.containsKey(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator W(Class cls) {
        return new a(new ze.h(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator X(Iterable iterable) {
        return new b(iterable.iterator(), new HashSet());
    }

    public static Class<?> Y(Class<?> cls) {
        return (cls == null || !cls.isPrimitive()) ? cls : f86101f.get(cls);
    }

    public static Class<?>[] Z(Class<?>... clsArr) {
        if (clsArr == null) {
            return null;
        }
        if (clsArr.length == 0) {
            return clsArr;
        }
        Class<?>[] clsArr2 = new Class[clsArr.length];
        for (int i4 = 0; i4 < clsArr.length; i4++) {
            clsArr2[i4] = Y(clsArr[i4]);
        }
        return clsArr2;
    }

    private static String a0(String str) {
        String L = b1.L(str);
        k1.b0(L, "className must not be null.", new Object[0]);
        if (!L.endsWith("[]")) {
            return L;
        }
        StringBuilder sb = new StringBuilder();
        while (L.endsWith("[]")) {
            L = L.substring(0, L.length() - 2);
            sb.append("[");
        }
        String str2 = f86103h.get(L);
        if (str2 != null) {
            sb.append(str2);
        } else {
            androidx.concurrent.futures.a.a(sb, "L", L, ";");
        }
        return sb.toString();
    }

    public static Class<?>[] b0(Object... objArr) {
        if (objArr == null) {
            return null;
        }
        if (objArr.length == 0) {
            return e.f85955g;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i4 = 0; i4 < objArr.length; i4++) {
            Object obj = objArr[i4];
            clsArr[i4] = obj == null ? null : obj.getClass();
        }
        return clsArr;
    }

    public static List<Class<?>> c(List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Class.forName(it.next()));
            } catch (Exception unused) {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    private static boolean c0(int i4, int i5, int i6, int i7) {
        return i5 >= i6 || (i4 + i6) - i5 <= i7;
    }

    public static List<String> d(List<Class<?>> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Class<?> cls : list) {
            if (cls == null) {
                arrayList.add(null);
            } else {
                arrayList.add(cls.getName());
            }
        }
        return arrayList;
    }

    public static Class<?> d0(Class<?> cls) {
        return f86102g.get(cls);
    }

    public static String e(Class<?> cls, int i4) {
        return cls == null ? "" : f(cls.getName(), i4);
    }

    public static Class<?>[] e0(Class<?>... clsArr) {
        if (clsArr == null) {
            return null;
        }
        if (clsArr.length == 0) {
            return clsArr;
        }
        Class<?>[] clsArr2 = new Class[clsArr.length];
        for (int i4 = 0; i4 < clsArr.length; i4++) {
            clsArr2[i4] = d0(clsArr[i4]);
        }
        return clsArr2;
    }

    public static String f(String str, int i4) {
        char c5;
        if (i4 <= 0) {
            throw new IllegalArgumentException("len must be > 0");
        }
        if (str == null) {
            return "";
        }
        if (str.length() <= i4) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int i5 = 0;
        int i6 = 0;
        while (i5 < charArray.length) {
            int i7 = i6;
            while (i5 < charArray.length && (c5 = charArray[i5]) != '.') {
                i5++;
                charArray[i7] = c5;
                i7++;
            }
            int i10 = i6 + 1;
            if (!c0(i7, i5, charArray.length, i4) && i10 <= i7) {
                i7 = i10;
            }
            if (i5 < charArray.length) {
                i6 = i7 + 1;
                charArray[i7] = charArray[i5];
                i5++;
            } else {
                i6 = i7;
            }
        }
        return new String(charArray, 0, i6);
    }

    public static List<Class<?>> g(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        h(cls, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    private static void h(Class<?> cls, HashSet<Class<?>> hashSet) {
        while (cls != null) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (hashSet.add(cls2)) {
                    h(cls2, hashSet);
                }
            }
            cls = cls.getSuperclass();
        }
    }

    public static List<Class<?>> i(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.add(superclass);
        }
        return arrayList;
    }

    public static String j(Class<?> cls) {
        return k(cls, "");
    }

    public static String k(Class<?> cls, String str) {
        if (cls == null) {
            return str;
        }
        String canonicalName = cls.getCanonicalName();
        return canonicalName == null ? str : canonicalName;
    }

    public static String l(Object obj) {
        return m(obj, "");
    }

    public static String m(Object obj, String str) {
        if (obj == null) {
            return str;
        }
        String canonicalName = obj.getClass().getCanonicalName();
        return canonicalName == null ? str : canonicalName;
    }

    private static String n(String str) {
        String L = b1.L(str);
        if (L == null) {
            return null;
        }
        int i4 = 0;
        while (L.startsWith("[")) {
            i4++;
            L = L.substring(1);
        }
        if (i4 < 1) {
            return L;
        }
        if (L.startsWith("L")) {
            L = L.substring(1, L.endsWith(";") ? L.length() - 1 : L.length());
        } else if (!L.isEmpty()) {
            L = f86104i.get(L.substring(0, 1));
        }
        StringBuilder sb = new StringBuilder(L);
        for (int i5 = 0; i5 < i4; i5++) {
            sb.append("[]");
        }
        return sb.toString();
    }

    public static Class<?> o(ClassLoader classLoader, String str) throws ClassNotFoundException {
        return p(classLoader, str, true);
    }

    public static Class<?> p(ClassLoader classLoader, String str, boolean z4) throws ClassNotFoundException {
        try {
            Map<String, Class<?>> map = f86100e;
            return map.containsKey(str) ? map.get(str) : Class.forName(a0(str), z4, classLoader);
        } catch (ClassNotFoundException e4) {
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf != -1) {
                try {
                    return p(classLoader, str.substring(0, lastIndexOf) + '$' + str.substring(lastIndexOf + 1), z4);
                } catch (ClassNotFoundException unused) {
                    throw e4;
                }
            }
            throw e4;
        }
    }

    public static Class<?> q(String str) throws ClassNotFoundException {
        return r(str, true);
    }

    public static Class<?> r(String str, boolean z4) throws ClassNotFoundException {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            contextClassLoader = s.class.getClassLoader();
        }
        return p(contextClassLoader, str, z4);
    }

    public static String s(Class<?> cls) {
        return t(cls, "");
    }

    public static String t(Class<?> cls, String str) {
        return cls == null ? str : cls.getName();
    }

    public static String u(Object obj) {
        return v(obj, "");
    }

    public static String v(Object obj, String str) {
        return obj == null ? str : obj.getClass().getName();
    }

    public static String w(Class<?> cls) {
        return cls == null ? "" : y(cls.getName());
    }

    public static String x(Object obj, String str) {
        return obj == null ? str : y(obj.getClass().getName());
    }

    public static String y(String str) {
        return B(n(str));
    }

    public static String z(Class<?> cls) {
        return cls == null ? "" : B(cls.getName());
    }
}
