package androidx.recyclerview.widget;

import androidx.core.util.p;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: AdapterHelper.java */
/* loaded from: classes3.dex */
final class a implements y.a {

    /* renamed from: i, reason: collision with root package name */
    static final int f9126i = 0;

    /* renamed from: j, reason: collision with root package name */
    static final int f9127j = 1;

    /* renamed from: k, reason: collision with root package name */
    private static final boolean f9128k = false;

    /* renamed from: l, reason: collision with root package name */
    private static final String f9129l = "AHT";

    /* renamed from: a, reason: collision with root package name */
    private p.a<b> f9130a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<b> f9131b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<b> f9132c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC0109a f9133d;

    /* renamed from: e, reason: collision with root package name */
    Runnable f9134e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f9135f;

    /* renamed from: g, reason: collision with root package name */
    final y f9136g;

    /* renamed from: h, reason: collision with root package name */
    private int f9137h;

    /* compiled from: AdapterHelper.java */
    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    interface InterfaceC0109a {
        void a(int i5, int i6);

        void b(b bVar);

        void c(int i5, int i6, Object obj);

        void d(b bVar);

        RecyclerView.d0 e(int i5);

        void f(int i5, int i6);

        void g(int i5, int i6);

        void h(int i5, int i6);
    }

    /* compiled from: AdapterHelper.java */
    /* loaded from: classes.dex */
    static final class b {

        /* renamed from: e, reason: collision with root package name */
        static final int f9138e = 1;

        /* renamed from: f, reason: collision with root package name */
        static final int f9139f = 2;

        /* renamed from: g, reason: collision with root package name */
        static final int f9140g = 4;

        /* renamed from: h, reason: collision with root package name */
        static final int f9141h = 8;

        /* renamed from: i, reason: collision with root package name */
        static final int f9142i = 30;

        /* renamed from: a, reason: collision with root package name */
        int f9143a;

        /* renamed from: b, reason: collision with root package name */
        int f9144b;

        /* renamed from: c, reason: collision with root package name */
        Object f9145c;

        /* renamed from: d, reason: collision with root package name */
        int f9146d;

        b(int i5, int i6, int i7, Object obj) {
            this.f9143a = i5;
            this.f9144b = i6;
            this.f9146d = i7;
            this.f9145c = obj;
        }

        String a() {
            int i5 = this.f9143a;
            return i5 != 1 ? i5 != 2 ? i5 != 4 ? i5 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i5 = this.f9143a;
            if (i5 != bVar.f9143a) {
                return false;
            }
            if (i5 == 8 && Math.abs(this.f9146d - this.f9144b) == 1 && this.f9146d == bVar.f9144b && this.f9144b == bVar.f9146d) {
                return true;
            }
            if (this.f9146d != bVar.f9146d || this.f9144b != bVar.f9144b) {
                return false;
            }
            Object obj2 = this.f9145c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f9145c)) {
                    return false;
                }
            } else if (bVar.f9145c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f9143a * 31) + this.f9144b) * 31) + this.f9146d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f9144b + "c:" + this.f9146d + ",p:" + this.f9145c + "]";
        }
    }

    a(InterfaceC0109a interfaceC0109a) {
        this(interfaceC0109a, false);
    }

    private int A(int i5, int i6) {
        int i7;
        int i8;
        for (int size = this.f9132c.size() - 1; size >= 0; size--) {
            b bVar = this.f9132c.get(size);
            int i9 = bVar.f9143a;
            if (i9 == 8) {
                int i10 = bVar.f9144b;
                int i11 = bVar.f9146d;
                if (i10 < i11) {
                    i8 = i10;
                    i7 = i11;
                } else {
                    i7 = i10;
                    i8 = i11;
                }
                if (i5 < i8 || i5 > i7) {
                    if (i5 < i10) {
                        if (i6 == 1) {
                            bVar.f9144b = i10 + 1;
                            bVar.f9146d = i11 + 1;
                        } else if (i6 == 2) {
                            bVar.f9144b = i10 - 1;
                            bVar.f9146d = i11 - 1;
                        }
                    }
                } else if (i8 == i10) {
                    if (i6 == 1) {
                        bVar.f9146d = i11 + 1;
                    } else if (i6 == 2) {
                        bVar.f9146d = i11 - 1;
                    }
                    i5++;
                } else {
                    if (i6 == 1) {
                        bVar.f9144b = i10 + 1;
                    } else if (i6 == 2) {
                        bVar.f9144b = i10 - 1;
                    }
                    i5--;
                }
            } else {
                int i12 = bVar.f9144b;
                if (i12 <= i5) {
                    if (i9 == 1) {
                        i5 -= bVar.f9146d;
                    } else if (i9 == 2) {
                        i5 += bVar.f9146d;
                    }
                } else if (i6 == 1) {
                    bVar.f9144b = i12 + 1;
                } else if (i6 == 2) {
                    bVar.f9144b = i12 - 1;
                }
            }
        }
        for (int size2 = this.f9132c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f9132c.get(size2);
            if (bVar2.f9143a == 8) {
                int i13 = bVar2.f9146d;
                if (i13 == bVar2.f9144b || i13 < 0) {
                    this.f9132c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f9146d <= 0) {
                this.f9132c.remove(size2);
                a(bVar2);
            }
        }
        return i5;
    }

    private void d(b bVar) {
        w(bVar);
    }

    private void e(b bVar) {
        w(bVar);
    }

    private void g(b bVar) {
        boolean z5;
        char c6;
        int i5 = bVar.f9144b;
        int i6 = bVar.f9146d + i5;
        char c7 = 65535;
        int i7 = i5;
        int i8 = 0;
        while (i7 < i6) {
            if (this.f9133d.e(i7) != null || i(i7)) {
                if (c7 == 0) {
                    l(b(2, i5, i8, null));
                    z5 = true;
                } else {
                    z5 = false;
                }
                c6 = 1;
            } else {
                if (c7 == 1) {
                    w(b(2, i5, i8, null));
                    z5 = true;
                } else {
                    z5 = false;
                }
                c6 = 0;
            }
            if (z5) {
                i7 -= i8;
                i6 -= i8;
                i8 = 1;
            } else {
                i8++;
            }
            i7++;
            c7 = c6;
        }
        if (i8 != bVar.f9146d) {
            a(bVar);
            bVar = b(2, i5, i8, null);
        }
        if (c7 == 0) {
            l(bVar);
        } else {
            w(bVar);
        }
    }

    private void h(b bVar) {
        int i5 = bVar.f9144b;
        int i6 = bVar.f9146d + i5;
        int i7 = 0;
        boolean z5 = -1;
        int i8 = i5;
        while (i5 < i6) {
            if (this.f9133d.e(i5) != null || i(i5)) {
                if (!z5) {
                    l(b(4, i8, i7, bVar.f9145c));
                    i8 = i5;
                    i7 = 0;
                }
                z5 = true;
            } else {
                if (z5) {
                    w(b(4, i8, i7, bVar.f9145c));
                    i8 = i5;
                    i7 = 0;
                }
                z5 = false;
            }
            i7++;
            i5++;
        }
        if (i7 != bVar.f9146d) {
            Object obj = bVar.f9145c;
            a(bVar);
            bVar = b(4, i8, i7, obj);
        }
        if (z5) {
            w(bVar);
        } else {
            l(bVar);
        }
    }

    private boolean i(int i5) {
        int size = this.f9132c.size();
        for (int i6 = 0; i6 < size; i6++) {
            b bVar = this.f9132c.get(i6);
            int i7 = bVar.f9143a;
            if (i7 == 8) {
                if (o(bVar.f9146d, i6 + 1) == i5) {
                    return true;
                }
            } else if (i7 == 1) {
                int i8 = bVar.f9144b;
                int i9 = bVar.f9146d + i8;
                while (i8 < i9) {
                    if (o(i8, i6 + 1) == i5) {
                        return true;
                    }
                    i8++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void l(b bVar) {
        int i5;
        int i6 = bVar.f9143a;
        if (i6 == 1 || i6 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int A = A(bVar.f9144b, i6);
        int i7 = bVar.f9144b;
        int i8 = bVar.f9143a;
        if (i8 == 2) {
            i5 = 0;
        } else {
            if (i8 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i5 = 1;
        }
        int i9 = 1;
        for (int i10 = 1; i10 < bVar.f9146d; i10++) {
            int A2 = A((i5 * i10) + bVar.f9144b, bVar.f9143a);
            int i11 = bVar.f9143a;
            if (i11 == 2 ? A2 == A : i11 == 4 && A2 == A + 1) {
                i9++;
            } else {
                b b6 = b(i11, A, i9, bVar.f9145c);
                m(b6, i7);
                a(b6);
                if (bVar.f9143a == 4) {
                    i7 += i9;
                }
                i9 = 1;
                A = A2;
            }
        }
        Object obj = bVar.f9145c;
        a(bVar);
        if (i9 > 0) {
            b b7 = b(bVar.f9143a, A, i9, obj);
            m(b7, i7);
            a(b7);
        }
    }

    private void w(b bVar) {
        this.f9132c.add(bVar);
        int i5 = bVar.f9143a;
        if (i5 == 1) {
            this.f9133d.g(bVar.f9144b, bVar.f9146d);
            return;
        }
        if (i5 == 2) {
            this.f9133d.f(bVar.f9144b, bVar.f9146d);
            return;
        }
        if (i5 == 4) {
            this.f9133d.c(bVar.f9144b, bVar.f9146d, bVar.f9145c);
        } else if (i5 == 8) {
            this.f9133d.a(bVar.f9144b, bVar.f9146d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    @Override // androidx.recyclerview.widget.y.a
    public void a(b bVar) {
        if (this.f9135f) {
            return;
        }
        bVar.f9145c = null;
        this.f9130a.a(bVar);
    }

    @Override // androidx.recyclerview.widget.y.a
    public b b(int i5, int i6, int i7, Object obj) {
        b b6 = this.f9130a.b();
        if (b6 == null) {
            return new b(i5, i6, i7, obj);
        }
        b6.f9143a = i5;
        b6.f9144b = i6;
        b6.f9146d = i7;
        b6.f9145c = obj;
        return b6;
    }

    a c(b... bVarArr) {
        Collections.addAll(this.f9131b, bVarArr);
        return this;
    }

    public int f(int i5) {
        int size = this.f9131b.size();
        for (int i6 = 0; i6 < size; i6++) {
            b bVar = this.f9131b.get(i6);
            int i7 = bVar.f9143a;
            if (i7 != 1) {
                if (i7 == 2) {
                    int i8 = bVar.f9144b;
                    if (i8 <= i5) {
                        int i9 = bVar.f9146d;
                        if (i8 + i9 > i5) {
                            return -1;
                        }
                        i5 -= i9;
                    } else {
                        continue;
                    }
                } else if (i7 == 8) {
                    int i10 = bVar.f9144b;
                    if (i10 == i5) {
                        i5 = bVar.f9146d;
                    } else {
                        if (i10 < i5) {
                            i5--;
                        }
                        if (bVar.f9146d <= i5) {
                            i5++;
                        }
                    }
                }
            } else if (bVar.f9144b <= i5) {
                i5 += bVar.f9146d;
            }
        }
        return i5;
    }

    void j() {
        int size = this.f9132c.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f9133d.d(this.f9132c.get(i5));
        }
        y(this.f9132c);
        this.f9137h = 0;
    }

    void k() {
        j();
        int size = this.f9131b.size();
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = this.f9131b.get(i5);
            int i6 = bVar.f9143a;
            if (i6 == 1) {
                this.f9133d.d(bVar);
                this.f9133d.g(bVar.f9144b, bVar.f9146d);
            } else if (i6 == 2) {
                this.f9133d.d(bVar);
                this.f9133d.h(bVar.f9144b, bVar.f9146d);
            } else if (i6 == 4) {
                this.f9133d.d(bVar);
                this.f9133d.c(bVar.f9144b, bVar.f9146d, bVar.f9145c);
            } else if (i6 == 8) {
                this.f9133d.d(bVar);
                this.f9133d.a(bVar.f9144b, bVar.f9146d);
            }
            Runnable runnable = this.f9134e;
            if (runnable != null) {
                runnable.run();
            }
        }
        y(this.f9131b);
        this.f9137h = 0;
    }

    void m(b bVar, int i5) {
        this.f9133d.b(bVar);
        int i6 = bVar.f9143a;
        if (i6 == 2) {
            this.f9133d.h(i5, bVar.f9146d);
        } else {
            if (i6 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f9133d.c(i5, bVar.f9146d, bVar.f9145c);
        }
    }

    int n(int i5) {
        return o(i5, 0);
    }

    int o(int i5, int i6) {
        int size = this.f9132c.size();
        while (i6 < size) {
            b bVar = this.f9132c.get(i6);
            int i7 = bVar.f9143a;
            if (i7 == 8) {
                int i8 = bVar.f9144b;
                if (i8 == i5) {
                    i5 = bVar.f9146d;
                } else {
                    if (i8 < i5) {
                        i5--;
                    }
                    if (bVar.f9146d <= i5) {
                        i5++;
                    }
                }
            } else {
                int i9 = bVar.f9144b;
                if (i9 > i5) {
                    continue;
                } else if (i7 == 2) {
                    int i10 = bVar.f9146d;
                    if (i5 < i9 + i10) {
                        return -1;
                    }
                    i5 -= i10;
                } else if (i7 == 1) {
                    i5 += bVar.f9146d;
                }
            }
            i6++;
        }
        return i5;
    }

    boolean p(int i5) {
        return (i5 & this.f9137h) != 0;
    }

    boolean q() {
        return this.f9131b.size() > 0;
    }

    boolean r() {
        return (this.f9132c.isEmpty() || this.f9131b.isEmpty()) ? false : true;
    }

    boolean s(int i5, int i6, Object obj) {
        if (i6 < 1) {
            return false;
        }
        this.f9131b.add(b(4, i5, i6, obj));
        this.f9137h |= 4;
        return this.f9131b.size() == 1;
    }

    boolean t(int i5, int i6) {
        if (i6 < 1) {
            return false;
        }
        this.f9131b.add(b(1, i5, i6, null));
        this.f9137h |= 1;
        return this.f9131b.size() == 1;
    }

    boolean u(int i5, int i6, int i7) {
        if (i5 == i6) {
            return false;
        }
        if (i7 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f9131b.add(b(8, i5, i6, null));
        this.f9137h |= 8;
        return this.f9131b.size() == 1;
    }

    boolean v(int i5, int i6) {
        if (i6 < 1) {
            return false;
        }
        this.f9131b.add(b(2, i5, i6, null));
        this.f9137h |= 2;
        return this.f9131b.size() == 1;
    }

    void x() {
        this.f9136g.b(this.f9131b);
        int size = this.f9131b.size();
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = this.f9131b.get(i5);
            int i6 = bVar.f9143a;
            if (i6 == 1) {
                w(bVar);
            } else if (i6 == 2) {
                g(bVar);
            } else if (i6 == 4) {
                h(bVar);
            } else if (i6 == 8) {
                w(bVar);
            }
            Runnable runnable = this.f9134e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f9131b.clear();
    }

    void y(List<b> list) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            a(list.get(i5));
        }
        list.clear();
    }

    void z() {
        y(this.f9131b);
        y(this.f9132c);
        this.f9137h = 0;
    }

    a(InterfaceC0109a interfaceC0109a, boolean z5) {
        this.f9130a = new p.b(30);
        this.f9131b = new ArrayList<>();
        this.f9132c = new ArrayList<>();
        this.f9137h = 0;
        this.f9133d = interfaceC0109a;
        this.f9135f = z5;
        this.f9136g = new y(this);
    }
}
