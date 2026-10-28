package org.mortbay.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: LazyList.java */
/* loaded from: classes9.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f87582a = new String[0];

    private a() {
    }

    public static Object a(Object obj, int i4, Object obj2) {
        if (obj == null) {
            if (i4 <= 0 && !(obj2 instanceof List) && obj2 != null) {
                return obj2;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(i4, obj2);
            return arrayList;
        }
        if (obj instanceof List) {
            ((List) obj).add(i4, obj2);
            return obj;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(obj);
        arrayList2.add(i4, obj2);
        return arrayList2;
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == null) {
            if (!(obj2 instanceof List) && obj2 != null) {
                return obj2;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj2);
            return arrayList;
        }
        if (obj instanceof List) {
            ((List) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(obj);
        arrayList2.add(obj2);
        return arrayList2;
    }

    public static Object d(Object obj, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            obj = b(obj, it.next());
        }
        return obj;
    }

    public static Object e(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof List ? new ArrayList((List) obj) : obj;
    }

    public static boolean f(Object obj, Object obj2) {
        if (obj == null) {
            return false;
        }
        return obj instanceof List ? ((List) obj).contains(obj2) : obj.equals(obj2);
    }

    public static Object g(Object obj, int i4) {
        if (obj == null) {
            return new ArrayList(i4);
        }
        if (obj instanceof ArrayList) {
            return obj;
        }
        ArrayList arrayList = new ArrayList(i4);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object h(Object obj, int i4) {
        if (obj == null) {
            throw new IndexOutOfBoundsException();
        }
        if (obj instanceof List) {
            return ((List) obj).get(i4);
        }
        if (i4 == 0) {
            return obj;
        }
        throw new IndexOutOfBoundsException();
    }

    public static List i(Object obj) {
        return j(obj, false);
    }

    public static List j(Object obj, boolean z4) {
        if (obj == null) {
            if (z4) {
                return null;
            }
            return Collections.EMPTY_LIST;
        }
        if (obj instanceof List) {
            return (List) obj;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(obj);
        return arrayList;
    }

    public static Iterator k(Object obj) {
        return obj == null ? Collections.EMPTY_LIST.iterator() : obj instanceof List ? ((List) obj).iterator() : j(obj, false).iterator();
    }

    public static ListIterator l(Object obj) {
        return obj == null ? Collections.EMPTY_LIST.listIterator() : obj instanceof List ? ((List) obj).listIterator() : j(obj, false).listIterator();
    }

    public static Object m(Object obj, int i4) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            if (i4 == 0) {
                return null;
            }
            return obj;
        }
        List list = (List) obj;
        list.remove(i4);
        if (list.size() == 0) {
            return null;
        }
        return obj;
    }

    public static Object n(Object obj, Object obj2) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            if (obj.equals(obj2)) {
                return null;
            }
            return obj;
        }
        List list = (List) obj;
        list.remove(obj2);
        if (list.size() == 0) {
            return null;
        }
        return obj;
    }

    public static int o(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof List) {
            return ((List) obj).size();
        }
        return 1;
    }

    public static String p(Object obj) {
        if (obj == null) {
            return "[]";
        }
        if (obj instanceof List) {
            return ((List) obj).toString();
        }
        return "[" + obj + "]";
    }

    public static String[] q(Object obj) {
        if (obj == null) {
            return f87582a;
        }
        if (!(obj instanceof List)) {
            return new String[]{obj.toString()};
        }
        List list = (List) obj;
        String[] strArr = new String[list.size()];
        int size = list.size();
        while (true) {
            int i4 = size - 1;
            if (size <= 0) {
                return strArr;
            }
            Object obj2 = list.get(i4);
            if (obj2 != null) {
                strArr[i4] = obj2.toString();
            }
            size = i4;
        }
    }

    @Deprecated
    protected Object c(Object obj, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            obj = b(obj, it.next());
        }
        return obj;
    }
}
