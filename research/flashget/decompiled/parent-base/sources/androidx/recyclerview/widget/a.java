package androidx.recyclerview.widget;

import androidx.core.util.v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: AdapterHelper.java */
/* loaded from: classes3.dex */
final class a implements y.a {

    /* renamed from: i, reason: collision with root package name */
    static final int f33027i = 0;

    /* renamed from: j, reason: collision with root package name */
    static final int f33028j = 1;

    /* renamed from: k, reason: collision with root package name */
    private static final boolean f33029k = false;

    /* renamed from: l, reason: collision with root package name */
    private static final String f33030l = "AHT";

    /* renamed from: a, reason: collision with root package name */
    private v.a<b> f33031a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<b> f33032b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<b> f33033c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC0592a f33034d;

    /* renamed from: e, reason: collision with root package name */
    Runnable f33035e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f33036f;

    /* renamed from: g, reason: collision with root package name */
    final y f33037g;

    /* renamed from: h, reason: collision with root package name */
    private int f33038h;

    /* compiled from: AdapterHelper.java */
    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    interface InterfaceC0592a {
        void a(int i4, int i5);

        void b(b bVar);

        void c(b bVar);

        void d(int i4, int i5);

        void e(int i4, int i5, Object obj);

        RecyclerView.e0 f(int i4);

        void g(int i4, int i5);

        void h(int i4, int i5);
    }

    /* compiled from: AdapterHelper.java */
    static final class b {

        /* renamed from: e, reason: collision with root package name */
        static final int f33039e = 1;

        /* renamed from: f, reason: collision with root package name */
        static final int f33040f = 2;

        /* renamed from: g, reason: collision with root package name */
        static final int f33041g = 4;

        /* renamed from: h, reason: collision with root package name */
        static final int f33042h = 8;

        /* renamed from: i, reason: collision with root package name */
        static final int f33043i = 30;

        /* renamed from: a, reason: collision with root package name */
        int f33044a;

        /* renamed from: b, reason: collision with root package name */
        int f33045b;

        /* renamed from: c, reason: collision with root package name */
        Object f33046c;

        /* renamed from: d, reason: collision with root package name */
        int f33047d;

        b(int i4, int i5, int i6, Object obj) {
            this.f33044a = i4;
            this.f33045b = i5;
            this.f33047d = i6;
            this.f33046c = obj;
        }

        String a() {
            int i4 = this.f33044a;
            return i4 != 1 ? i4 != 2 ? i4 != 4 ? i4 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i4 = this.f33044a;
            if (i4 != bVar.f33044a) {
                return false;
            }
            if (i4 == 8 && Math.abs(this.f33047d - this.f33045b) == 1 && this.f33047d == bVar.f33045b && this.f33045b == bVar.f33047d) {
                return true;
            }
            if (this.f33047d != bVar.f33047d || this.f33045b != bVar.f33045b) {
                return false;
            }
            Object obj2 = this.f33046c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f33046c)) {
                    return false;
                }
            } else if (bVar.f33046c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f33044a * 31) + this.f33045b) * 31) + this.f33047d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            sb.append(a());
            sb.append(",s:");
            sb.append(this.f33045b);
            sb.append("c:");
            sb.append(this.f33047d);
            sb.append(",p:");
            return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.i.a(sb, this.f33046c, "]");
        }
    }

    a(InterfaceC0592a interfaceC0592a) {
        this(interfaceC0592a, false);
    }

    private int A(int i4, int i5) {
        int i6;
        int i7;
        for (int size = this.f33033c.size() - 1; size >= 0; size--) {
            b bVar = this.f33033c.get(size);
            int i10 = bVar.f33044a;
            if (i10 == 8) {
                int i11 = bVar.f33045b;
                int i12 = bVar.f33047d;
                if (i11 < i12) {
                    i7 = i11;
                    i6 = i12;
                } else {
                    i6 = i11;
                    i7 = i12;
                }
                if (i4 < i7 || i4 > i6) {
                    if (i4 < i11) {
                        if (i5 == 1) {
                            bVar.f33045b = i11 + 1;
                            bVar.f33047d = i12 + 1;
                        } else if (i5 == 2) {
                            bVar.f33045b = i11 - 1;
                            bVar.f33047d = i12 - 1;
                        }
                    }
                } else if (i7 == i11) {
                    if (i5 == 1) {
                        bVar.f33047d = i12 + 1;
                    } else if (i5 == 2) {
                        bVar.f33047d = i12 - 1;
                    }
                    i4++;
                } else {
                    if (i5 == 1) {
                        bVar.f33045b = i11 + 1;
                    } else if (i5 == 2) {
                        bVar.f33045b = i11 - 1;
                    }
                    i4--;
                }
            } else {
                int i13 = bVar.f33045b;
                if (i13 <= i4) {
                    if (i10 == 1) {
                        i4 -= bVar.f33047d;
                    } else if (i10 == 2) {
                        i4 += bVar.f33047d;
                    }
                } else if (i5 == 1) {
                    bVar.f33045b = i13 + 1;
                } else if (i5 == 2) {
                    bVar.f33045b = i13 - 1;
                }
            }
        }
        for (int size2 = this.f33033c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f33033c.get(size2);
            if (bVar2.f33044a == 8) {
                int i14 = bVar2.f33047d;
                if (i14 == bVar2.f33045b || i14 < 0) {
                    this.f33033c.remove(size2);
                    b(bVar2);
                }
            } else if (bVar2.f33047d <= 0) {
                this.f33033c.remove(size2);
                b(bVar2);
            }
        }
        return i4;
    }

    private void d(b bVar) {
        w(bVar);
    }

    private void e(b bVar) {
        w(bVar);
    }

    private void g(b bVar) {
        boolean z4;
        char c5;
        int i4 = bVar.f33045b;
        int i5 = bVar.f33047d + i4;
        char c6 = 65535;
        int i6 = i4;
        int i7 = 0;
        while (i6 < i5) {
            if (this.f33034d.f(i6) != null || i(i6)) {
                if (c6 == 0) {
                    l(a(2, i4, i7, null));
                    z4 = true;
                } else {
                    z4 = false;
                }
                c5 = 1;
            } else {
                if (c6 == 1) {
                    w(a(2, i4, i7, null));
                    z4 = true;
                } else {
                    z4 = false;
                }
                c5 = 0;
            }
            if (z4) {
                i6 -= i7;
                i5 -= i7;
                i7 = 1;
            } else {
                i7++;
            }
            i6++;
            c6 = c5;
        }
        if (i7 != bVar.f33047d) {
            b(bVar);
            bVar = a(2, i4, i7, null);
        }
        if (c6 == 0) {
            l(bVar);
        } else {
            w(bVar);
        }
    }

    private void h(b bVar) {
        int i4 = bVar.f33045b;
        int i5 = bVar.f33047d + i4;
        int i6 = 0;
        boolean z4 = -1;
        int i7 = i4;
        while (i4 < i5) {
            if (this.f33034d.f(i4) != null || i(i4)) {
                if (!z4) {
                    l(a(4, i7, i6, bVar.f33046c));
                    i7 = i4;
                    i6 = 0;
                }
                z4 = true;
            } else {
                if (z4) {
                    w(a(4, i7, i6, bVar.f33046c));
                    i7 = i4;
                    i6 = 0;
                }
                z4 = false;
            }
            i6++;
            i4++;
        }
        if (i6 != bVar.f33047d) {
            Object obj = bVar.f33046c;
            b(bVar);
            bVar = a(4, i7, i6, obj);
        }
        if (z4) {
            w(bVar);
        } else {
            l(bVar);
        }
    }

    private boolean i(int i4) {
        int size = this.f33033c.size();
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = this.f33033c.get(i5);
            int i6 = bVar.f33044a;
            if (i6 == 8) {
                if (o(bVar.f33047d, i5 + 1) == i4) {
                    return true;
                }
            } else if (i6 == 1) {
                int i7 = bVar.f33045b;
                int i10 = bVar.f33047d + i7;
                while (i7 < i10) {
                    if (o(i7, i5 + 1) == i4) {
                        return true;
                    }
                    i7++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void l(b bVar) {
        int i4;
        int i5 = bVar.f33044a;
        if (i5 == 1 || i5 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int A = A(bVar.f33045b, i5);
        int i6 = bVar.f33045b;
        int i7 = bVar.f33044a;
        if (i7 == 2) {
            i4 = 0;
        } else {
            if (i7 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i4 = 1;
        }
        int i10 = 1;
        for (int i11 = 1; i11 < bVar.f33047d; i11++) {
            int A2 = A((i4 * i11) + bVar.f33045b, bVar.f33044a);
            int i12 = bVar.f33044a;
            if (i12 == 2 ? A2 != A : !(i12 == 4 && A2 == A + 1)) {
                b a5 = a(i12, A, i10, bVar.f33046c);
                m(a5, i6);
                b(a5);
                if (bVar.f33044a == 4) {
                    i6 += i10;
                }
                i10 = 1;
                A = A2;
            } else {
                i10++;
            }
        }
        Object obj = bVar.f33046c;
        b(bVar);
        if (i10 > 0) {
            b a6 = a(bVar.f33044a, A, i10, obj);
            m(a6, i6);
            b(a6);
        }
    }

    private void w(b bVar) {
        this.f33033c.add(bVar);
        int i4 = bVar.f33044a;
        if (i4 == 1) {
            this.f33034d.g(bVar.f33045b, bVar.f33047d);
            return;
        }
        if (i4 == 2) {
            this.f33034d.d(bVar.f33045b, bVar.f33047d);
            return;
        }
        if (i4 == 4) {
            this.f33034d.e(bVar.f33045b, bVar.f33047d, bVar.f33046c);
        } else if (i4 == 8) {
            this.f33034d.a(bVar.f33045b, bVar.f33047d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    @Override // androidx.recyclerview.widget.y.a
    public b a(int i4, int i5, int i6, Object obj) {
        b acquire = this.f33031a.acquire();
        if (acquire == null) {
            return new b(i4, i5, i6, obj);
        }
        acquire.f33044a = i4;
        acquire.f33045b = i5;
        acquire.f33047d = i6;
        acquire.f33046c = obj;
        return acquire;
    }

    @Override // androidx.recyclerview.widget.y.a
    public void b(b bVar) {
        if (this.f33036f) {
            return;
        }
        bVar.f33046c = null;
        this.f33031a.release(bVar);
    }

    a c(b... bVarArr) {
        Collections.addAll(this.f33032b, bVarArr);
        return this;
    }

    public int f(int i4) {
        int size = this.f33032b.size();
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = this.f33032b.get(i5);
            int i6 = bVar.f33044a;
            if (i6 != 1) {
                if (i6 == 2) {
                    int i7 = bVar.f33045b;
                    if (i7 <= i4) {
                        int i10 = bVar.f33047d;
                        if (i7 + i10 > i4) {
                            return -1;
                        }
                        i4 -= i10;
                    } else {
                        continue;
                    }
                } else if (i6 == 8) {
                    int i11 = bVar.f33045b;
                    if (i11 == i4) {
                        i4 = bVar.f33047d;
                    } else {
                        if (i11 < i4) {
                            i4--;
                        }
                        if (bVar.f33047d <= i4) {
                            i4++;
                        }
                    }
                }
            } else if (bVar.f33045b <= i4) {
                i4 += bVar.f33047d;
            }
        }
        return i4;
    }

    void j() {
        int size = this.f33033c.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f33034d.c(this.f33033c.get(i4));
        }
        y(this.f33033c);
        this.f33038h = 0;
    }

    void k() {
        j();
        int size = this.f33032b.size();
        for (int i4 = 0; i4 < size; i4++) {
            b bVar = this.f33032b.get(i4);
            int i5 = bVar.f33044a;
            if (i5 == 1) {
                this.f33034d.c(bVar);
                this.f33034d.g(bVar.f33045b, bVar.f33047d);
            } else if (i5 == 2) {
                this.f33034d.c(bVar);
                this.f33034d.h(bVar.f33045b, bVar.f33047d);
            } else if (i5 == 4) {
                this.f33034d.c(bVar);
                this.f33034d.e(bVar.f33045b, bVar.f33047d, bVar.f33046c);
            } else if (i5 == 8) {
                this.f33034d.c(bVar);
                this.f33034d.a(bVar.f33045b, bVar.f33047d);
            }
            Runnable runnable = this.f33035e;
            if (runnable != null) {
                runnable.run();
            }
        }
        y(this.f33032b);
        this.f33038h = 0;
    }

    void m(b bVar, int i4) {
        this.f33034d.b(bVar);
        int i5 = bVar.f33044a;
        if (i5 == 2) {
            this.f33034d.h(i4, bVar.f33047d);
        } else {
            if (i5 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f33034d.e(i4, bVar.f33047d, bVar.f33046c);
        }
    }

    int n(int i4) {
        return o(i4, 0);
    }

    int o(int i4, int i5) {
        int size = this.f33033c.size();
        while (i5 < size) {
            b bVar = this.f33033c.get(i5);
            int i6 = bVar.f33044a;
            if (i6 == 8) {
                int i7 = bVar.f33045b;
                if (i7 == i4) {
                    i4 = bVar.f33047d;
                } else {
                    if (i7 < i4) {
                        i4--;
                    }
                    if (bVar.f33047d <= i4) {
                        i4++;
                    }
                }
            } else {
                int i10 = bVar.f33045b;
                if (i10 > i4) {
                    continue;
                } else if (i6 == 2) {
                    int i11 = bVar.f33047d;
                    if (i4 < i10 + i11) {
                        return -1;
                    }
                    i4 -= i11;
                } else if (i6 == 1) {
                    i4 += bVar.f33047d;
                }
            }
            i5++;
        }
        return i4;
    }

    boolean p(int i4) {
        return (i4 & this.f33038h) != 0;
    }

    boolean q() {
        return this.f33032b.size() > 0;
    }

    boolean r() {
        return (this.f33033c.isEmpty() || this.f33032b.isEmpty()) ? false : true;
    }

    boolean s(int i4, int i5, Object obj) {
        if (i5 < 1) {
            return false;
        }
        this.f33032b.add(a(4, i4, i5, obj));
        this.f33038h |= 4;
        return this.f33032b.size() == 1;
    }

    boolean t(int i4, int i5) {
        if (i5 < 1) {
            return false;
        }
        this.f33032b.add(a(1, i4, i5, null));
        this.f33038h |= 1;
        return this.f33032b.size() == 1;
    }

    boolean u(int i4, int i5, int i6) {
        if (i4 == i5) {
            return false;
        }
        if (i6 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f33032b.add(a(8, i4, i5, null));
        this.f33038h |= 8;
        return this.f33032b.size() == 1;
    }

    boolean v(int i4, int i5) {
        if (i5 < 1) {
            return false;
        }
        this.f33032b.add(a(2, i4, i5, null));
        this.f33038h |= 2;
        return this.f33032b.size() == 1;
    }

    void x() {
        this.f33037g.b(this.f33032b);
        int size = this.f33032b.size();
        for (int i4 = 0; i4 < size; i4++) {
            b bVar = this.f33032b.get(i4);
            int i5 = bVar.f33044a;
            if (i5 == 1) {
                w(bVar);
            } else if (i5 == 2) {
                g(bVar);
            } else if (i5 == 4) {
                h(bVar);
            } else if (i5 == 8) {
                w(bVar);
            }
            Runnable runnable = this.f33035e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f33032b.clear();
    }

    void y(List<b> list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            b(list.get(i4));
        }
        list.clear();
    }

    void z() {
        y(this.f33032b);
        y(this.f33033c);
        this.f33038h = 0;
    }

    a(InterfaceC0592a interfaceC0592a, boolean z4) {
        this.f33031a = new v.b(30);
        this.f33032b = new ArrayList<>();
        this.f33033c = new ArrayList<>();
        this.f33038h = 0;
        this.f33034d = interfaceC0592a;
        this.f33036f = z4;
        this.f33037g = new y(this);
    }
}
