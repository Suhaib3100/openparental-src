package com.github.mikephil.charting.data;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DataSet.java */
/* loaded from: classes5.dex */
public abstract class m<T extends Entry> extends e<T> {

    /* renamed from: s, reason: collision with root package name */
    protected List<T> f50401s;

    /* renamed from: t, reason: collision with root package name */
    protected float f50402t;

    /* renamed from: u, reason: collision with root package name */
    protected float f50403u;

    /* renamed from: v, reason: collision with root package name */
    protected float f50404v;

    /* renamed from: w, reason: collision with root package name */
    protected float f50405w;

    /* compiled from: DataSet.java */
    public enum a {
        UP,
        DOWN,
        CLOSEST
    }

    public m(List<T> list, String str) {
        super(str);
        this.f50402t = -3.4028235E38f;
        this.f50403u = Float.MAX_VALUE;
        this.f50404v = -3.4028235E38f;
        this.f50405w = Float.MAX_VALUE;
        this.f50401s = list;
        if (list == null) {
            this.f50401s = new ArrayList();
        }
        O();
    }

    @Override // f8.e
    public boolean D(T t4) {
        if (t4 == null) {
            return false;
        }
        List<T> P1 = P1();
        if (P1 == null) {
            P1 = new ArrayList<>();
        }
        K1(t4);
        return P1.add(t4);
    }

    protected void K1(T t4) {
        if (t4 == null) {
            return;
        }
        L1(t4);
        M1(t4);
    }

    @Override // f8.e
    public void L(float f4, float f5) {
        List<T> list = this.f50401s;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f50402t = -3.4028235E38f;
        this.f50403u = Float.MAX_VALUE;
        int N0 = N0(f5, Float.NaN, a.UP);
        for (int N02 = N0(f4, Float.NaN, a.DOWN); N02 <= N0; N02++) {
            M1(this.f50401s.get(N02));
        }
    }

    protected void L1(T t4) {
        if (t4.j() < this.f50405w) {
            this.f50405w = t4.j();
        }
        if (t4.j() > this.f50404v) {
            this.f50404v = t4.j();
        }
    }

    @Override // f8.e
    public boolean M0(T t4) {
        List<T> list;
        if (t4 == null || (list = this.f50401s) == null) {
            return false;
        }
        boolean remove = list.remove(t4);
        if (remove) {
            O();
        }
        return remove;
    }

    protected void M1(T t4) {
        if (t4.c() < this.f50403u) {
            this.f50403u = t4.c();
        }
        if (t4.c() > this.f50402t) {
            this.f50402t = t4.c();
        }
    }

    @Override // f8.e
    public List<T> N(float f4) {
        ArrayList arrayList = new ArrayList();
        int size = this.f50401s.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                break;
            }
            int i5 = (size + i4) / 2;
            T t4 = this.f50401s.get(i5);
            if (f4 == t4.j()) {
                while (i5 > 0 && this.f50401s.get(i5 - 1).j() == f4) {
                    i5--;
                }
                int size2 = this.f50401s.size();
                while (i5 < size2) {
                    T t5 = this.f50401s.get(i5);
                    if (t5.j() != f4) {
                        break;
                    }
                    arrayList.add(t5);
                    i5++;
                }
            } else if (f4 > t4.j()) {
                i4 = i5 + 1;
            } else {
                size = i5 - 1;
            }
        }
        return arrayList;
    }

    @Override // f8.e
    public int N0(float f4, float f5, a aVar) {
        int i4;
        T t4;
        List<T> list = this.f50401s;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int size = this.f50401s.size() - 1;
        int i5 = 0;
        while (i5 < size) {
            int i6 = (i5 + size) / 2;
            float j4 = this.f50401s.get(i6).j() - f4;
            int i7 = i6 + 1;
            float j5 = this.f50401s.get(i7).j() - f4;
            float abs = Math.abs(j4);
            float abs2 = Math.abs(j5);
            if (abs2 >= abs) {
                if (abs >= abs2) {
                    double d5 = j4;
                    if (d5 < com.google.firebase.remoteconfig.p.f60679p) {
                        if (d5 < com.google.firebase.remoteconfig.p.f60679p) {
                        }
                    }
                }
                size = i6;
            }
            i5 = i7;
        }
        if (size == -1) {
            return size;
        }
        float j6 = this.f50401s.get(size).j();
        if (aVar == a.UP) {
            if (j6 < f4 && size < this.f50401s.size() - 1) {
                size++;
            }
        } else if (aVar == a.DOWN && j6 > f4 && size > 0) {
            size--;
        }
        if (Float.isNaN(f5)) {
            return size;
        }
        while (size > 0 && this.f50401s.get(size - 1).j() == j6) {
            size--;
        }
        float c5 = this.f50401s.get(size).c();
        loop2: while (true) {
            i4 = size;
            do {
                size++;
                if (size >= this.f50401s.size()) {
                    break loop2;
                }
                t4 = this.f50401s.get(size);
                if (t4.j() != j6) {
                    break loop2;
                }
            } while (Math.abs(t4.c() - f5) >= Math.abs(c5 - f5));
            c5 = f5;
        }
        return i4;
    }

    public abstract m<T> N1();

    @Override // f8.e
    public void O() {
        List<T> list = this.f50401s;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f50402t = -3.4028235E38f;
        this.f50403u = Float.MAX_VALUE;
        this.f50404v = -3.4028235E38f;
        this.f50405w = Float.MAX_VALUE;
        Iterator<T> it = this.f50401s.iterator();
        while (it.hasNext()) {
            K1(it.next());
        }
    }

    protected void O1(m mVar) {
        super.u1(mVar);
    }

    public List<T> P1() {
        return this.f50401s;
    }

    @Override // f8.e
    public T Q0(float f4, float f5, a aVar) {
        int N0 = N0(f4, f5, aVar);
        if (N0 > -1) {
            return this.f50401s.get(N0);
        }
        return null;
    }

    public void Q1(List<T> list) {
        this.f50401s = list;
        w1();
    }

    public String R1() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("쐝"));
        sb.append(o() == null ? "" : o());
        sb.append(ProtectedSandApp.s("쐞"));
        sb.append(this.f50401s.size());
        sb.append(ProtectedSandApp.s("쐟"));
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    @Override // f8.e
    public float b1() {
        return this.f50404v;
    }

    @Override // f8.e
    public void clear() {
        this.f50401s.clear();
        w1();
    }

    @Override // f8.e
    public float f() {
        return this.f50402t;
    }

    @Override // f8.e
    public int g(Entry entry) {
        return this.f50401s.indexOf(entry);
    }

    @Override // f8.e
    public int h1() {
        return this.f50401s.size();
    }

    @Override // f8.e
    public float j0() {
        return this.f50405w;
    }

    @Override // f8.e
    public void m1(T t4) {
        if (t4 == null) {
            return;
        }
        if (this.f50401s == null) {
            this.f50401s = new ArrayList();
        }
        K1(t4);
        if (this.f50401s.size() <= 0 || ((Entry) androidx.appcompat.view.menu.d.a(this.f50401s, 1)).j() <= t4.j()) {
            this.f50401s.add(t4);
        } else {
            this.f50401s.add(N0(t4.j(), t4.c(), a.UP), t4);
        }
    }

    @Override // f8.e
    public T o0(float f4, float f5) {
        return Q0(f4, f5, a.CLOSEST);
    }

    @Override // f8.e
    public float p() {
        return this.f50403u;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(R1());
        for (int i4 = 0; i4 < this.f50401s.size(); i4++) {
            stringBuffer.append(this.f50401s.get(i4).toString() + ProtectedSandApp.s("쐠"));
        }
        return stringBuffer.toString();
    }

    @Override // f8.e
    public T w(int i4) {
        return this.f50401s.get(i4);
    }
}
