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
/* loaded from: classes3.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator<d> f33232a = new a();

    /* compiled from: DiffUtil.java */
    class a implements Comparator<d> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f33235a - dVar2.f33235a;
        }
    }

    /* compiled from: DiffUtil.java */
    public static abstract class b {
        public abstract boolean areContentsTheSame(int i4, int i5);

        public abstract boolean areItemsTheSame(int i4, int i5);

        @q0
        public Object getChangePayload(int i4, int i5) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* compiled from: DiffUtil.java */
    static class c {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f33233a;

        /* renamed from: b, reason: collision with root package name */
        private final int f33234b;

        c(int i4) {
            int[] iArr = new int[i4];
            this.f33233a = iArr;
            this.f33234b = iArr.length / 2;
        }

        int[] a() {
            return this.f33233a;
        }

        public void b(int i4) {
            Arrays.fill(this.f33233a, i4);
        }

        int c(int i4) {
            return this.f33233a[i4 + this.f33234b];
        }

        void d(int i4, int i5) {
            this.f33233a[i4 + this.f33234b] = i5;
        }
    }

    /* compiled from: DiffUtil.java */
    static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f33235a;

        /* renamed from: b, reason: collision with root package name */
        public final int f33236b;

        /* renamed from: c, reason: collision with root package name */
        public final int f33237c;

        d(int i4, int i5, int i6) {
            this.f33235a = i4;
            this.f33236b = i5;
            this.f33237c = i6;
        }

        int a() {
            return this.f33235a + this.f33237c;
        }

        int b() {
            return this.f33236b + this.f33237c;
        }
    }

    /* compiled from: DiffUtil.java */
    public static class e {

        /* renamed from: h, reason: collision with root package name */
        public static final int f33238h = -1;

        /* renamed from: i, reason: collision with root package name */
        private static final int f33239i = 1;

        /* renamed from: j, reason: collision with root package name */
        private static final int f33240j = 2;

        /* renamed from: k, reason: collision with root package name */
        private static final int f33241k = 4;

        /* renamed from: l, reason: collision with root package name */
        private static final int f33242l = 8;

        /* renamed from: m, reason: collision with root package name */
        private static final int f33243m = 12;

        /* renamed from: n, reason: collision with root package name */
        private static final int f33244n = 4;

        /* renamed from: o, reason: collision with root package name */
        private static final int f33245o = 15;

        /* renamed from: a, reason: collision with root package name */
        private final List<d> f33246a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f33247b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f33248c;

        /* renamed from: d, reason: collision with root package name */
        private final b f33249d;

        /* renamed from: e, reason: collision with root package name */
        private final int f33250e;

        /* renamed from: f, reason: collision with root package name */
        private final int f33251f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f33252g;

        e(b bVar, List<d> list, int[] iArr, int[] iArr2, boolean z4) {
            this.f33246a = list;
            this.f33247b = iArr;
            this.f33248c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f33249d = bVar;
            this.f33250e = bVar.getOldListSize();
            this.f33251f = bVar.getNewListSize();
            this.f33252g = z4;
            a();
            g();
        }

        private void a() {
            d dVar = this.f33246a.isEmpty() ? null : this.f33246a.get(0);
            if (dVar == null || dVar.f33235a != 0 || dVar.f33236b != 0) {
                this.f33246a.add(0, new d(0, 0, 0));
            }
            this.f33246a.add(new d(this.f33250e, this.f33251f, 0));
        }

        private void f(int i4) {
            int size = this.f33246a.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                d dVar = this.f33246a.get(i6);
                while (i5 < dVar.f33236b) {
                    if (this.f33248c[i5] == 0 && this.f33249d.areItemsTheSame(i4, i5)) {
                        int i7 = this.f33249d.areContentsTheSame(i4, i5) ? 8 : 4;
                        this.f33247b[i4] = (i5 << 4) | i7;
                        this.f33248c[i5] = (i4 << 4) | i7;
                        return;
                    }
                    i5++;
                }
                i5 = dVar.b();
            }
        }

        private void g() {
            for (d dVar : this.f33246a) {
                for (int i4 = 0; i4 < dVar.f33237c; i4++) {
                    int i5 = dVar.f33235a + i4;
                    int i6 = dVar.f33236b + i4;
                    int i7 = this.f33249d.areContentsTheSame(i5, i6) ? 1 : 2;
                    this.f33247b[i5] = (i6 << 4) | i7;
                    this.f33248c[i6] = (i5 << 4) | i7;
                }
            }
            if (this.f33252g) {
                h();
            }
        }

        private void h() {
            int i4 = 0;
            for (d dVar : this.f33246a) {
                while (i4 < dVar.f33235a) {
                    if (this.f33247b[i4] == 0) {
                        f(i4);
                    }
                    i4++;
                }
                i4 = dVar.a();
            }
        }

        @q0
        private static g i(Collection<g> collection, int i4, boolean z4) {
            g gVar;
            Iterator<g> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    gVar = null;
                    break;
                }
                gVar = it.next();
                if (gVar.f33253a == i4 && gVar.f33255c == z4) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                g next = it.next();
                if (z4) {
                    next.f33254b--;
                } else {
                    next.f33254b++;
                }
            }
            return gVar;
        }

        public int b(@androidx.annotation.g0(from = 0) int i4) {
            if (i4 < 0 || i4 >= this.f33251f) {
                StringBuilder a5 = androidx.collection.s.a("Index out of bounds - passed position = ", i4, ", new list size = ");
                a5.append(this.f33251f);
                throw new IndexOutOfBoundsException(a5.toString());
            }
            int i5 = this.f33248c[i4];
            if ((i5 & 15) == 0) {
                return -1;
            }
            return i5 >> 4;
        }

        public int c(@androidx.annotation.g0(from = 0) int i4) {
            if (i4 < 0 || i4 >= this.f33250e) {
                StringBuilder a5 = androidx.collection.s.a("Index out of bounds - passed position = ", i4, ", old list size = ");
                a5.append(this.f33250e);
                throw new IndexOutOfBoundsException(a5.toString());
            }
            int i5 = this.f33247b[i4];
            if ((i5 & 15) == 0) {
                return -1;
            }
            return i5 >> 4;
        }

        public void d(@o0 v vVar) {
            int i4;
            androidx.recyclerview.widget.f fVar = vVar instanceof androidx.recyclerview.widget.f ? (androidx.recyclerview.widget.f) vVar : new androidx.recyclerview.widget.f(vVar);
            int i5 = this.f33250e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i6 = this.f33250e;
            int i7 = this.f33251f;
            for (int size = this.f33246a.size() - 1; size >= 0; size--) {
                d dVar = this.f33246a.get(size);
                int a5 = dVar.a();
                int b5 = dVar.b();
                while (true) {
                    if (i6 <= a5) {
                        break;
                    }
                    i6--;
                    int i10 = this.f33247b[i6];
                    if ((i10 & 12) != 0) {
                        int i11 = i10 >> 4;
                        g i12 = i(arrayDeque, i11, false);
                        if (i12 != null) {
                            int i13 = (i5 - i12.f33254b) - 1;
                            fVar.onMoved(i6, i13);
                            if ((i10 & 4) != 0) {
                                fVar.onChanged(i13, 1, this.f33249d.getChangePayload(i6, i11));
                            }
                        } else {
                            arrayDeque.add(new g(i6, (i5 - i6) - 1, true));
                        }
                    } else {
                        fVar.onRemoved(i6, 1);
                        i5--;
                    }
                }
                while (i7 > b5) {
                    i7--;
                    int i14 = this.f33248c[i7];
                    if ((i14 & 12) != 0) {
                        int i15 = i14 >> 4;
                        g i16 = i(arrayDeque, i15, true);
                        if (i16 == null) {
                            arrayDeque.add(new g(i7, i5 - i6, false));
                        } else {
                            fVar.onMoved((i5 - i16.f33254b) - 1, i6);
                            if ((i14 & 4) != 0) {
                                fVar.onChanged(i6, 1, this.f33249d.getChangePayload(i15, i7));
                            }
                        }
                    } else {
                        fVar.onInserted(i6, 1);
                        i5++;
                    }
                }
                int i17 = dVar.f33235a;
                int i18 = dVar.f33236b;
                for (i4 = 0; i4 < dVar.f33237c; i4++) {
                    if ((this.f33247b[i17] & 15) == 2) {
                        fVar.onChanged(i17, 1, this.f33249d.getChangePayload(i17, i18));
                    }
                    i17++;
                    i18++;
                }
                i6 = dVar.f33235a;
                i7 = dVar.f33236b;
            }
            fVar.a();
        }

        public void e(@o0 RecyclerView.h hVar) {
            d(new androidx.recyclerview.widget.b(hVar));
        }
    }

    /* compiled from: DiffUtil.java */
    public static abstract class f<T> {
        public abstract boolean areContentsTheSame(@o0 T t4, @o0 T t5);

        public abstract boolean areItemsTheSame(@o0 T t4, @o0 T t5);

        @q0
        public Object getChangePayload(@o0 T t4, @o0 T t5) {
            return null;
        }
    }

    /* compiled from: DiffUtil.java */
    private static class g {

        /* renamed from: a, reason: collision with root package name */
        int f33253a;

        /* renamed from: b, reason: collision with root package name */
        int f33254b;

        /* renamed from: c, reason: collision with root package name */
        boolean f33255c;

        g(int i4, int i5, boolean z4) {
            this.f33253a = i4;
            this.f33254b = i5;
            this.f33255c = z4;
        }
    }

    /* compiled from: DiffUtil.java */
    static class h {

        /* renamed from: a, reason: collision with root package name */
        int f33256a;

        /* renamed from: b, reason: collision with root package name */
        int f33257b;

        /* renamed from: c, reason: collision with root package name */
        int f33258c;

        /* renamed from: d, reason: collision with root package name */
        int f33259d;

        public h() {
        }

        int a() {
            return this.f33259d - this.f33258c;
        }

        int b() {
            return this.f33257b - this.f33256a;
        }

        public h(int i4, int i5, int i6, int i7) {
            this.f33256a = i4;
            this.f33257b = i5;
            this.f33258c = i6;
            this.f33259d = i7;
        }
    }

    /* compiled from: DiffUtil.java */
    static class i {

        /* renamed from: a, reason: collision with root package name */
        public int f33260a;

        /* renamed from: b, reason: collision with root package name */
        public int f33261b;

        /* renamed from: c, reason: collision with root package name */
        public int f33262c;

        /* renamed from: d, reason: collision with root package name */
        public int f33263d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f33264e;

        i() {
        }

        int a() {
            return Math.min(this.f33262c - this.f33260a, this.f33263d - this.f33261b);
        }

        boolean b() {
            return this.f33263d - this.f33261b != this.f33262c - this.f33260a;
        }

        boolean c() {
            return this.f33263d - this.f33261b > this.f33262c - this.f33260a;
        }

        @o0
        d d() {
            if (b()) {
                return this.f33264e ? new d(this.f33260a, this.f33261b, a()) : c() ? new d(this.f33260a, this.f33261b + 1, a()) : new d(this.f33260a + 1, this.f33261b, a());
            }
            int i4 = this.f33260a;
            return new d(i4, this.f33261b, this.f33262c - i4);
        }
    }

    private k() {
    }

    @q0
    private static i a(h hVar, b bVar, c cVar, c cVar2, int i4) {
        int c5;
        int i5;
        int i6;
        boolean z4 = (hVar.b() - hVar.a()) % 2 == 0;
        int b5 = hVar.b() - hVar.a();
        int i7 = -i4;
        for (int i10 = i7; i10 <= i4; i10 += 2) {
            if (i10 == i7 || (i10 != i4 && cVar2.c(i10 + 1) < cVar2.c(i10 - 1))) {
                c5 = cVar2.c(i10 + 1);
                i5 = c5;
            } else {
                c5 = cVar2.c(i10 - 1);
                i5 = c5 - 1;
            }
            int i11 = hVar.f33259d - ((hVar.f33257b - i5) - i10);
            int i12 = (i4 == 0 || i5 != c5) ? i11 : i11 + 1;
            while (i5 > hVar.f33256a && i11 > hVar.f33258c && bVar.areItemsTheSame(i5 - 1, i11 - 1)) {
                i5--;
                i11--;
            }
            cVar2.d(i10, i5);
            if (z4 && (i6 = b5 - i10) >= i7 && i6 <= i4 && cVar.c(i6) >= i5) {
                i iVar = new i();
                iVar.f33260a = i5;
                iVar.f33261b = i11;
                iVar.f33262c = c5;
                iVar.f33263d = i12;
                iVar.f33264e = true;
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
    public static e c(@o0 b bVar, boolean z4) {
        int oldListSize = bVar.getOldListSize();
        int newListSize = bVar.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new h(0, oldListSize, 0, newListSize));
        int i4 = ((((oldListSize + newListSize) + 1) / 2) * 2) + 1;
        c cVar = new c(i4);
        c cVar2 = new c(i4);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            h hVar = (h) arrayList2.remove(arrayList2.size() - 1);
            i e4 = e(hVar, bVar, cVar, cVar2);
            if (e4 != null) {
                if (e4.a() > 0) {
                    arrayList.add(e4.d());
                }
                h hVar2 = arrayList3.isEmpty() ? new h() : (h) arrayList3.remove(arrayList3.size() - 1);
                hVar2.f33256a = hVar.f33256a;
                hVar2.f33258c = hVar.f33258c;
                hVar2.f33257b = e4.f33260a;
                hVar2.f33259d = e4.f33261b;
                arrayList2.add(hVar2);
                hVar.f33257b = hVar.f33257b;
                hVar.f33259d = hVar.f33259d;
                hVar.f33256a = e4.f33262c;
                hVar.f33258c = e4.f33263d;
                arrayList2.add(hVar);
            } else {
                arrayList3.add(hVar);
            }
        }
        Collections.sort(arrayList, f33232a);
        return new e(bVar, arrayList, cVar.a(), cVar2.a(), z4);
    }

    @q0
    private static i d(h hVar, b bVar, c cVar, c cVar2, int i4) {
        int c5;
        int i5;
        int i6;
        boolean z4 = Math.abs(hVar.b() - hVar.a()) % 2 == 1;
        int b5 = hVar.b() - hVar.a();
        int i7 = -i4;
        for (int i10 = i7; i10 <= i4; i10 += 2) {
            if (i10 == i7 || (i10 != i4 && cVar.c(i10 + 1) > cVar.c(i10 - 1))) {
                c5 = cVar.c(i10 + 1);
                i5 = c5;
            } else {
                c5 = cVar.c(i10 - 1);
                i5 = c5 + 1;
            }
            int i11 = ((i5 - hVar.f33256a) + hVar.f33258c) - i10;
            int i12 = (i4 == 0 || i5 != c5) ? i11 : i11 - 1;
            while (i5 < hVar.f33257b && i11 < hVar.f33259d && bVar.areItemsTheSame(i5, i11)) {
                i5++;
                i11++;
            }
            cVar.d(i10, i5);
            if (z4 && (i6 = b5 - i10) >= i7 + 1 && i6 <= i4 - 1 && cVar2.c(i6) <= i5) {
                i iVar = new i();
                iVar.f33260a = c5;
                iVar.f33261b = i12;
                iVar.f33262c = i5;
                iVar.f33263d = i11;
                iVar.f33264e = false;
                return iVar;
            }
        }
        return null;
    }

    @q0
    private static i e(h hVar, b bVar, c cVar, c cVar2) {
        if (hVar.b() >= 1 && hVar.a() >= 1) {
            int b5 = ((hVar.b() + hVar.a()) + 1) / 2;
            cVar.d(1, hVar.f33256a);
            cVar2.d(1, hVar.f33257b);
            for (int i4 = 0; i4 < b5; i4++) {
                i d5 = d(hVar, bVar, cVar, cVar2, i4);
                if (d5 != null) {
                    return d5;
                }
                i a5 = a(hVar, bVar, cVar, cVar2, i4);
                if (a5 != null) {
                    return a5;
                }
            }
        }
        return null;
    }
}
