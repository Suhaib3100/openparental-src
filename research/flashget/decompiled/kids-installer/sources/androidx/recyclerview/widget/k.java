package androidx.recyclerview.widget;

import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: DiffUtil.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator<d> f9341a = new a();

    /* compiled from: DiffUtil.java */
    class a implements Comparator<d> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f9344a - dVar2.f9344a;
        }
    }

    /* compiled from: DiffUtil.java */
    public static abstract class b {
        public abstract boolean a(int i5, int i6);

        public abstract boolean b(int i5, int i6);

        @q0
        public Object c(int i5, int i6) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    /* compiled from: DiffUtil.java */
    static class c {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f9342a;

        /* renamed from: b, reason: collision with root package name */
        private final int f9343b;

        c(int i5) {
            int[] iArr = new int[i5];
            this.f9342a = iArr;
            this.f9343b = iArr.length / 2;
        }

        int[] a() {
            return this.f9342a;
        }

        public void b(int i5) {
            Arrays.fill(this.f9342a, i5);
        }

        int c(int i5) {
            return this.f9342a[i5 + this.f9343b];
        }

        void d(int i5, int i6) {
            this.f9342a[i5 + this.f9343b] = i6;
        }
    }

    /* compiled from: DiffUtil.java */
    static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f9344a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9345b;

        /* renamed from: c, reason: collision with root package name */
        public final int f9346c;

        d(int i5, int i6, int i7) {
            this.f9344a = i5;
            this.f9345b = i6;
            this.f9346c = i7;
        }

        int a() {
            return this.f9344a + this.f9346c;
        }

        int b() {
            return this.f9345b + this.f9346c;
        }
    }

    /* compiled from: DiffUtil.java */
    public static class e {

        /* renamed from: h, reason: collision with root package name */
        public static final int f9347h = -1;

        /* renamed from: i, reason: collision with root package name */
        private static final int f9348i = 1;

        /* renamed from: j, reason: collision with root package name */
        private static final int f9349j = 2;

        /* renamed from: k, reason: collision with root package name */
        private static final int f9350k = 4;

        /* renamed from: l, reason: collision with root package name */
        private static final int f9351l = 8;

        /* renamed from: m, reason: collision with root package name */
        private static final int f9352m = 12;

        /* renamed from: n, reason: collision with root package name */
        private static final int f9353n = 4;

        /* renamed from: o, reason: collision with root package name */
        private static final int f9354o = 15;

        /* renamed from: a, reason: collision with root package name */
        private final List<d> f9355a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f9356b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f9357c;

        /* renamed from: d, reason: collision with root package name */
        private final b f9358d;

        /* renamed from: e, reason: collision with root package name */
        private final int f9359e;

        /* renamed from: f, reason: collision with root package name */
        private final int f9360f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f9361g;

        e(b bVar, List<d> list, int[] iArr, int[] iArr2, boolean z5) {
            this.f9355a = list;
            this.f9356b = iArr;
            this.f9357c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f9358d = bVar;
            this.f9359e = bVar.e();
            this.f9360f = bVar.d();
            this.f9361g = z5;
            a();
            g();
        }

        private void a() {
            d dVar = this.f9355a.isEmpty() ? null : this.f9355a.get(0);
            if (dVar == null || dVar.f9344a != 0 || dVar.f9345b != 0) {
                this.f9355a.add(0, new d(0, 0, 0));
            }
            this.f9355a.add(new d(this.f9359e, this.f9360f, 0));
        }

        private void f(int i5) {
            int size = this.f9355a.size();
            int i6 = 0;
            for (int i7 = 0; i7 < size; i7++) {
                d dVar = this.f9355a.get(i7);
                while (i6 < dVar.f9345b) {
                    if (this.f9357c[i6] == 0 && this.f9358d.b(i5, i6)) {
                        int i8 = this.f9358d.a(i5, i6) ? 8 : 4;
                        this.f9356b[i5] = (i6 << 4) | i8;
                        this.f9357c[i6] = (i5 << 4) | i8;
                        return;
                    }
                    i6++;
                }
                i6 = dVar.b();
            }
        }

        private void g() {
            for (d dVar : this.f9355a) {
                for (int i5 = 0; i5 < dVar.f9346c; i5++) {
                    int i6 = dVar.f9344a + i5;
                    int i7 = dVar.f9345b + i5;
                    int i8 = this.f9358d.a(i6, i7) ? 1 : 2;
                    this.f9356b[i6] = (i7 << 4) | i8;
                    this.f9357c[i7] = (i6 << 4) | i8;
                }
            }
            if (this.f9361g) {
                h();
            }
        }

        private void h() {
            int i5 = 0;
            for (d dVar : this.f9355a) {
                while (i5 < dVar.f9344a) {
                    if (this.f9356b[i5] == 0) {
                        f(i5);
                    }
                    i5++;
                }
                i5 = dVar.a();
            }
        }

        @q0
        private static g i(Collection<g> collection, int i5, boolean z5) {
            g gVar;
            Iterator<g> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    gVar = null;
                    break;
                }
                gVar = it.next();
                if (gVar.f9362a == i5 && gVar.f9364c == z5) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                g next = it.next();
                if (z5) {
                    next.f9363b--;
                } else {
                    next.f9363b++;
                }
            }
            return gVar;
        }

        public int b(@androidx.annotation.g0(from = 0) int i5) {
            if (i5 < 0 || i5 >= this.f9360f) {
                StringBuilder a6 = androidx.core.app.x.a("Index out of bounds - passed position = ", i5, ", new list size = ");
                a6.append(this.f9360f);
                throw new IndexOutOfBoundsException(a6.toString());
            }
            int i6 = this.f9357c[i5];
            if ((i6 & 15) == 0) {
                return -1;
            }
            return i6 >> 4;
        }

        public int c(@androidx.annotation.g0(from = 0) int i5) {
            if (i5 < 0 || i5 >= this.f9359e) {
                StringBuilder a6 = androidx.core.app.x.a("Index out of bounds - passed position = ", i5, ", old list size = ");
                a6.append(this.f9359e);
                throw new IndexOutOfBoundsException(a6.toString());
            }
            int i6 = this.f9356b[i5];
            if ((i6 & 15) == 0) {
                return -1;
            }
            return i6 >> 4;
        }

        public void d(@o0 v vVar) {
            int i5;
            androidx.recyclerview.widget.f fVar = vVar instanceof androidx.recyclerview.widget.f ? (androidx.recyclerview.widget.f) vVar : new androidx.recyclerview.widget.f(vVar);
            int i6 = this.f9359e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i7 = this.f9359e;
            int i8 = this.f9360f;
            for (int size = this.f9355a.size() - 1; size >= 0; size--) {
                d dVar = this.f9355a.get(size);
                int a6 = dVar.a();
                int b6 = dVar.b();
                while (true) {
                    if (i7 <= a6) {
                        break;
                    }
                    i7--;
                    int i9 = this.f9356b[i7];
                    if ((i9 & 12) != 0) {
                        int i10 = i9 >> 4;
                        g i11 = i(arrayDeque, i10, false);
                        if (i11 != null) {
                            int i12 = (i6 - i11.f9363b) - 1;
                            fVar.a(i7, i12);
                            if ((i9 & 4) != 0) {
                                fVar.d(i12, 1, this.f9358d.c(i7, i10));
                            }
                        } else {
                            arrayDeque.add(new g(i7, (i6 - i7) - 1, true));
                        }
                    } else {
                        fVar.c(i7, 1);
                        i6--;
                    }
                }
                while (i8 > b6) {
                    i8--;
                    int i13 = this.f9357c[i8];
                    if ((i13 & 12) != 0) {
                        int i14 = i13 >> 4;
                        g i15 = i(arrayDeque, i14, true);
                        if (i15 == null) {
                            arrayDeque.add(new g(i8, i6 - i7, false));
                        } else {
                            fVar.a((i6 - i15.f9363b) - 1, i7);
                            if ((i13 & 4) != 0) {
                                fVar.d(i7, 1, this.f9358d.c(i14, i8));
                            }
                        }
                    } else {
                        fVar.b(i7, 1);
                        i6++;
                    }
                }
                int i16 = dVar.f9344a;
                int i17 = dVar.f9345b;
                for (i5 = 0; i5 < dVar.f9346c; i5++) {
                    if ((this.f9356b[i16] & 15) == 2) {
                        fVar.d(i16, 1, this.f9358d.c(i16, i17));
                    }
                    i16++;
                    i17++;
                }
                i7 = dVar.f9344a;
                i8 = dVar.f9345b;
            }
            fVar.e();
        }

        public void e(@o0 RecyclerView.h hVar) {
            d(new androidx.recyclerview.widget.b(hVar));
        }
    }

    /* compiled from: DiffUtil.java */
    public static abstract class f<T> {
        public abstract boolean a(@o0 T t5, @o0 T t6);

        public abstract boolean b(@o0 T t5, @o0 T t6);

        @q0
        public Object c(@o0 T t5, @o0 T t6) {
            return null;
        }
    }

    /* compiled from: DiffUtil.java */
    private static class g {

        /* renamed from: a, reason: collision with root package name */
        int f9362a;

        /* renamed from: b, reason: collision with root package name */
        int f9363b;

        /* renamed from: c, reason: collision with root package name */
        boolean f9364c;

        g(int i5, int i6, boolean z5) {
            this.f9362a = i5;
            this.f9363b = i6;
            this.f9364c = z5;
        }
    }

    /* compiled from: DiffUtil.java */
    static class h {

        /* renamed from: a, reason: collision with root package name */
        int f9365a;

        /* renamed from: b, reason: collision with root package name */
        int f9366b;

        /* renamed from: c, reason: collision with root package name */
        int f9367c;

        /* renamed from: d, reason: collision with root package name */
        int f9368d;

        public h() {
        }

        int a() {
            return this.f9368d - this.f9367c;
        }

        int b() {
            return this.f9366b - this.f9365a;
        }

        public h(int i5, int i6, int i7, int i8) {
            this.f9365a = i5;
            this.f9366b = i6;
            this.f9367c = i7;
            this.f9368d = i8;
        }
    }

    /* compiled from: DiffUtil.java */
    static class i {

        /* renamed from: a, reason: collision with root package name */
        public int f9369a;

        /* renamed from: b, reason: collision with root package name */
        public int f9370b;

        /* renamed from: c, reason: collision with root package name */
        public int f9371c;

        /* renamed from: d, reason: collision with root package name */
        public int f9372d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f9373e;

        i() {
        }

        int a() {
            return Math.min(this.f9371c - this.f9369a, this.f9372d - this.f9370b);
        }

        boolean b() {
            return this.f9372d - this.f9370b != this.f9371c - this.f9369a;
        }

        boolean c() {
            return this.f9372d - this.f9370b > this.f9371c - this.f9369a;
        }

        @o0
        d d() {
            if (b()) {
                return this.f9373e ? new d(this.f9369a, this.f9370b, a()) : c() ? new d(this.f9369a, this.f9370b + 1, a()) : new d(this.f9369a + 1, this.f9370b, a());
            }
            int i5 = this.f9369a;
            return new d(i5, this.f9370b, this.f9371c - i5);
        }
    }

    private k() {
    }

    @q0
    private static i a(h hVar, b bVar, c cVar, c cVar2, int i5) {
        int c6;
        int i6;
        int i7;
        boolean z5 = (hVar.b() - hVar.a()) % 2 == 0;
        int b6 = hVar.b() - hVar.a();
        int i8 = -i5;
        for (int i9 = i8; i9 <= i5; i9 += 2) {
            if (i9 == i8 || (i9 != i5 && cVar2.c(i9 + 1) < cVar2.c(i9 - 1))) {
                c6 = cVar2.c(i9 + 1);
                i6 = c6;
            } else {
                c6 = cVar2.c(i9 - 1);
                i6 = c6 - 1;
            }
            int i10 = hVar.f9368d - ((hVar.f9366b - i6) - i9);
            int i11 = (i5 == 0 || i6 != c6) ? i10 : i10 + 1;
            while (i6 > hVar.f9365a && i10 > hVar.f9367c && bVar.b(i6 - 1, i10 - 1)) {
                i6--;
                i10--;
            }
            cVar2.d(i9, i6);
            if (z5 && (i7 = b6 - i9) >= i8 && i7 <= i5 && cVar.c(i7) >= i6) {
                i iVar = new i();
                iVar.f9369a = i6;
                iVar.f9370b = i10;
                iVar.f9371c = c6;
                iVar.f9372d = i11;
                iVar.f9373e = true;
                return iVar;
            }
        }
        return null;
    }

    @o0
    public static e b(@o0 b bVar) {
        return c(bVar, true);
    }

    @o0
    public static e c(@o0 b bVar, boolean z5) {
        int e6 = bVar.e();
        int d6 = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new h(0, e6, 0, d6));
        int i5 = ((((e6 + d6) + 1) / 2) * 2) + 1;
        c cVar = new c(i5);
        c cVar2 = new c(i5);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            h hVar = (h) arrayList2.remove(arrayList2.size() - 1);
            i e7 = e(hVar, bVar, cVar, cVar2);
            if (e7 != null) {
                if (e7.a() > 0) {
                    arrayList.add(e7.d());
                }
                h hVar2 = arrayList3.isEmpty() ? new h() : (h) arrayList3.remove(arrayList3.size() - 1);
                hVar2.f9365a = hVar.f9365a;
                hVar2.f9367c = hVar.f9367c;
                hVar2.f9366b = e7.f9369a;
                hVar2.f9368d = e7.f9370b;
                arrayList2.add(hVar2);
                hVar.f9366b = hVar.f9366b;
                hVar.f9368d = hVar.f9368d;
                hVar.f9365a = e7.f9371c;
                hVar.f9367c = e7.f9372d;
                arrayList2.add(hVar);
            } else {
                arrayList3.add(hVar);
            }
        }
        Collections.sort(arrayList, f9341a);
        return new e(bVar, arrayList, cVar.a(), cVar2.a(), z5);
    }

    @q0
    private static i d(h hVar, b bVar, c cVar, c cVar2, int i5) {
        int c6;
        int i6;
        int i7;
        boolean z5 = Math.abs(hVar.b() - hVar.a()) % 2 == 1;
        int b6 = hVar.b() - hVar.a();
        int i8 = -i5;
        for (int i9 = i8; i9 <= i5; i9 += 2) {
            if (i9 == i8 || (i9 != i5 && cVar.c(i9 + 1) > cVar.c(i9 - 1))) {
                c6 = cVar.c(i9 + 1);
                i6 = c6;
            } else {
                c6 = cVar.c(i9 - 1);
                i6 = c6 + 1;
            }
            int i10 = ((i6 - hVar.f9365a) + hVar.f9367c) - i9;
            int i11 = (i5 == 0 || i6 != c6) ? i10 : i10 - 1;
            while (i6 < hVar.f9366b && i10 < hVar.f9368d && bVar.b(i6, i10)) {
                i6++;
                i10++;
            }
            cVar.d(i9, i6);
            if (z5 && (i7 = b6 - i9) >= i8 + 1 && i7 <= i5 - 1 && cVar2.c(i7) <= i6) {
                i iVar = new i();
                iVar.f9369a = c6;
                iVar.f9370b = i11;
                iVar.f9371c = i6;
                iVar.f9372d = i10;
                iVar.f9373e = false;
                return iVar;
            }
        }
        return null;
    }

    @q0
    private static i e(h hVar, b bVar, c cVar, c cVar2) {
        if (hVar.b() >= 1 && hVar.a() >= 1) {
            int b6 = ((hVar.b() + hVar.a()) + 1) / 2;
            cVar.d(1, hVar.f9365a);
            cVar2.d(1, hVar.f9366b);
            for (int i5 = 0; i5 < b6; i5++) {
                i d6 = d(hVar, bVar, cVar, cVar2, i5);
                if (d6 != null) {
                    return d6;
                }
                i a6 = a(hVar, bVar, cVar, cVar2, i5);
                if (a6 != null) {
                    return a6;
                }
            }
        }
        return null;
    }
}
