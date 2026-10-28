package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.p1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ListFieldSchema.java */
/* loaded from: classes3.dex */
abstract class w1 {

    /* renamed from: a, reason: collision with root package name */
    private static final w1 f29022a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static final w1 f29023b = new c();

    /* compiled from: ListFieldSchema.java */
    private static final class b extends w1 {

        /* renamed from: c, reason: collision with root package name */
        private static final Class<?> f29024c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
        }

        static <E> List<E> f(Object obj, long j4) {
            return (List) p4.O(obj, j4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static <L> List<L> g(Object obj, long j4, int i4) {
            u1 u1Var;
            List<L> list = (List) p4.O(obj, j4);
            if (list.isEmpty()) {
                List<L> u1Var2 = list instanceof v1 ? new u1(i4) : ((list instanceof d3) && (list instanceof p1.k)) ? ((p1.k) list).e2(i4) : new ArrayList<>(i4);
                p4.q0(obj, j4, u1Var2);
                return u1Var2;
            }
            if (f29024c.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i4);
                arrayList.addAll(list);
                p4.q0(obj, j4, arrayList);
                u1Var = arrayList;
            } else {
                if (!(list instanceof o4)) {
                    if (!(list instanceof d3) || !(list instanceof p1.k)) {
                        return list;
                    }
                    p1.k kVar = (p1.k) list;
                    if (kVar.S1()) {
                        return list;
                    }
                    p1.k e22 = kVar.e2(list.size() + i4);
                    p4.q0(obj, j4, e22);
                    return e22;
                }
                u1 u1Var3 = new u1(list.size() + i4);
                u1Var3.addAll((o4) list);
                p4.q0(obj, j4, u1Var3);
                u1Var = u1Var3;
            }
            return u1Var;
        }

        @Override // androidx.content.preferences.protobuf.w1
        void c(Object obj, long j4) {
            Object unmodifiableList;
            List list = (List) p4.O(obj, j4);
            if (list instanceof v1) {
                unmodifiableList = ((v1) list).N();
            } else {
                if (f29024c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof d3) && (list instanceof p1.k)) {
                    p1.k kVar = (p1.k) list;
                    if (kVar.S1()) {
                        kVar.c0();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            p4.q0(obj, j4, unmodifiableList);
        }

        @Override // androidx.content.preferences.protobuf.w1
        <E> void d(Object obj, Object obj2, long j4) {
            List list = (List) p4.O(obj2, j4);
            List g4 = g(obj, j4, list.size());
            int size = g4.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                g4.addAll(list);
            }
            if (size > 0) {
                list = g4;
            }
            p4.q0(obj, j4, list);
        }

        @Override // androidx.content.preferences.protobuf.w1
        <L> List<L> e(Object obj, long j4) {
            return g(obj, j4, 10);
        }

        b(a aVar) {
        }
    }

    /* compiled from: ListFieldSchema.java */
    private static final class c extends w1 {
        private c() {
        }

        static <E> p1.k<E> f(Object obj, long j4) {
            return (p1.k) p4.O(obj, j4);
        }

        @Override // androidx.content.preferences.protobuf.w1
        void c(Object obj, long j4) {
            ((p1.k) p4.O(obj, j4)).c0();
        }

        @Override // androidx.content.preferences.protobuf.w1
        <E> void d(Object obj, Object obj2, long j4) {
            p1.k kVar = (p1.k) p4.O(obj, j4);
            p1.k kVar2 = (p1.k) p4.O(obj2, j4);
            int size = kVar.size();
            int size2 = kVar2.size();
            if (size > 0 && size2 > 0) {
                if (!kVar.S1()) {
                    kVar = kVar.e2(size2 + size);
                }
                kVar.addAll(kVar2);
            }
            if (size > 0) {
                kVar2 = kVar;
            }
            p4.q0(obj, j4, kVar2);
        }

        @Override // androidx.content.preferences.protobuf.w1
        <L> List<L> e(Object obj, long j4) {
            p1.k kVar = (p1.k) p4.O(obj, j4);
            if (kVar.S1()) {
                return kVar;
            }
            int size = kVar.size();
            p1.k e22 = kVar.e2(size == 0 ? 10 : size * 2);
            p4.q0(obj, j4, e22);
            return e22;
        }

        c(a aVar) {
        }
    }

    private w1() {
    }

    static w1 a() {
        return f29022a;
    }

    static w1 b() {
        return f29023b;
    }

    abstract void c(Object obj, long j4);

    abstract <L> void d(Object obj, Object obj2, long j4);

    abstract <L> List<L> e(Object obj, long j4);

    w1(a aVar) {
    }
}
