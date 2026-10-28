package android.content.preferences.protobuf;

import android.content.preferences.protobuf.o1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ListFieldSchema.java */
/* loaded from: classes.dex */
abstract class v1 {

    /* renamed from: a, reason: collision with root package name */
    private static final v1 f7535a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final v1 f7536b = new c(null);

    /* compiled from: ListFieldSchema.java */
    /* loaded from: classes3.dex */
    private static final class b extends v1 {

        /* renamed from: c, reason: collision with root package name */
        private static final Class<?> f7537c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super(null);
        }

        static <E> List<E> f(Object obj, long j5) {
            return (List) m4.O(obj, j5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static <L> List<L> g(Object obj, long j5, int i5) {
            t1 t1Var;
            List<L> f6 = f(obj, j5);
            if (f6.isEmpty()) {
                List<L> t1Var2 = f6 instanceof u1 ? new t1(i5) : ((f6 instanceof a3) && (f6 instanceof o1.k)) ? ((o1.k) f6).a2(i5) : new ArrayList<>(i5);
                m4.q0(obj, j5, t1Var2);
                return t1Var2;
            }
            if (f7537c.isAssignableFrom(f6.getClass())) {
                ArrayList arrayList = new ArrayList(f6.size() + i5);
                arrayList.addAll(f6);
                m4.q0(obj, j5, arrayList);
                t1Var = arrayList;
            } else {
                if (!(f6 instanceof l4)) {
                    if (!(f6 instanceof a3) || !(f6 instanceof o1.k)) {
                        return f6;
                    }
                    o1.k kVar = (o1.k) f6;
                    if (kVar.m1()) {
                        return f6;
                    }
                    o1.k a22 = kVar.a2(f6.size() + i5);
                    m4.q0(obj, j5, a22);
                    return a22;
                }
                t1 t1Var3 = new t1(f6.size() + i5);
                t1Var3.addAll((l4) f6);
                m4.q0(obj, j5, t1Var3);
                t1Var = t1Var3;
            }
            return t1Var;
        }

        @Override // android.content.preferences.protobuf.v1
        void c(Object obj, long j5) {
            Object unmodifiableList;
            List list = (List) m4.O(obj, j5);
            if (list instanceof u1) {
                unmodifiableList = ((u1) list).l();
            } else {
                if (f7537c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof a3) && (list instanceof o1.k)) {
                    o1.k kVar = (o1.k) list;
                    if (kVar.m1()) {
                        kVar.w();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            m4.q0(obj, j5, unmodifiableList);
        }

        @Override // android.content.preferences.protobuf.v1
        <E> void d(Object obj, Object obj2, long j5) {
            List f6 = f(obj2, j5);
            List g5 = g(obj, j5, f6.size());
            int size = g5.size();
            int size2 = f6.size();
            if (size > 0 && size2 > 0) {
                g5.addAll(f6);
            }
            if (size > 0) {
                f6 = g5;
            }
            m4.q0(obj, j5, f6);
        }

        @Override // android.content.preferences.protobuf.v1
        <L> List<L> e(Object obj, long j5) {
            return g(obj, j5, 10);
        }

        b(a aVar) {
            super(null);
        }
    }

    /* compiled from: ListFieldSchema.java */
    /* loaded from: classes3.dex */
    private static final class c extends v1 {
        private c() {
            super(null);
        }

        static <E> o1.k<E> f(Object obj, long j5) {
            return (o1.k) m4.O(obj, j5);
        }

        @Override // android.content.preferences.protobuf.v1
        void c(Object obj, long j5) {
            f(obj, j5).w();
        }

        @Override // android.content.preferences.protobuf.v1
        <E> void d(Object obj, Object obj2, long j5) {
            o1.k f6 = f(obj, j5);
            o1.k f7 = f(obj2, j5);
            int size = f6.size();
            int size2 = f7.size();
            if (size > 0 && size2 > 0) {
                if (!f6.m1()) {
                    f6 = f6.a2(size2 + size);
                }
                f6.addAll(f7);
            }
            if (size > 0) {
                f7 = f6;
            }
            m4.q0(obj, j5, f7);
        }

        @Override // android.content.preferences.protobuf.v1
        <L> List<L> e(Object obj, long j5) {
            o1.k f6 = f(obj, j5);
            if (f6.m1()) {
                return f6;
            }
            int size = f6.size();
            o1.k a22 = f6.a2(size == 0 ? 10 : size * 2);
            m4.q0(obj, j5, a22);
            return a22;
        }

        c(a aVar) {
            super(null);
        }
    }

    private v1() {
    }

    static v1 a() {
        return f7535a;
    }

    static v1 b() {
        return f7536b;
    }

    abstract void c(Object obj, long j5);

    abstract <L> void d(Object obj, Object obj2, long j5);

    abstract <L> List<L> e(Object obj, long j5);

    v1(a aVar) {
    }
}
