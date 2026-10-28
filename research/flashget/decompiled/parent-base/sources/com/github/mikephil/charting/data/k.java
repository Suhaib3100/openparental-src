package com.github.mikephil.charting.data;

import android.graphics.Typeface;
import com.github.mikephil.charting.components.k;
import f8.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ChartData.java */
/* loaded from: classes5.dex */
public abstract class k<T extends f8.e<? extends Entry>> {

    /* renamed from: a, reason: collision with root package name */
    protected float f50387a;

    /* renamed from: b, reason: collision with root package name */
    protected float f50388b;

    /* renamed from: c, reason: collision with root package name */
    protected float f50389c;

    /* renamed from: d, reason: collision with root package name */
    protected float f50390d;

    /* renamed from: e, reason: collision with root package name */
    protected float f50391e;

    /* renamed from: f, reason: collision with root package name */
    protected float f50392f;

    /* renamed from: g, reason: collision with root package name */
    protected float f50393g;

    /* renamed from: h, reason: collision with root package name */
    protected float f50394h;

    /* renamed from: i, reason: collision with root package name */
    protected List<T> f50395i;

    public k() {
        this.f50387a = -3.4028235E38f;
        this.f50388b = Float.MAX_VALUE;
        this.f50389c = -3.4028235E38f;
        this.f50390d = Float.MAX_VALUE;
        this.f50391e = -3.4028235E38f;
        this.f50392f = Float.MAX_VALUE;
        this.f50393g = -3.4028235E38f;
        this.f50394h = Float.MAX_VALUE;
        this.f50395i = new ArrayList();
    }

    private List<T> c(T[] tArr) {
        ArrayList arrayList = new ArrayList();
        for (T t4 : tArr) {
            arrayList.add(t4);
        }
        return arrayList;
    }

    public float A(k.a aVar) {
        if (aVar == k.a.LEFT) {
            float f4 = this.f50391e;
            return f4 == -3.4028235E38f ? this.f50393g : f4;
        }
        float f5 = this.f50393g;
        return f5 == -3.4028235E38f ? this.f50391e : f5;
    }

    public float B() {
        return this.f50388b;
    }

    public float C(k.a aVar) {
        if (aVar == k.a.LEFT) {
            float f4 = this.f50392f;
            return f4 == Float.MAX_VALUE ? this.f50394h : f4;
        }
        float f5 = this.f50394h;
        return f5 == Float.MAX_VALUE ? this.f50392f : f5;
    }

    public boolean D() {
        Iterator<T> it = this.f50395i.iterator();
        while (it.hasNext()) {
            if (!it.next().k1()) {
                return false;
            }
        }
        return true;
    }

    public void E() {
        d();
    }

    public boolean F(int i4) {
        if (i4 >= this.f50395i.size() || i4 < 0) {
            return false;
        }
        return G(this.f50395i.get(i4));
    }

    public boolean G(T t4) {
        if (t4 == null) {
            return false;
        }
        boolean remove = this.f50395i.remove(t4);
        if (remove) {
            d();
        }
        return remove;
    }

    public boolean H(float f4, int i4) {
        Entry o02;
        if (i4 < this.f50395i.size() && (o02 = this.f50395i.get(i4).o0(f4, Float.NaN)) != null) {
            return I(o02, i4);
        }
        return false;
    }

    public boolean I(Entry entry, int i4) {
        T t4;
        if (entry == null || i4 >= this.f50395i.size() || (t4 = this.f50395i.get(i4)) == null) {
            return false;
        }
        boolean M0 = t4.M0(entry);
        if (M0) {
            d();
        }
        return M0;
    }

    public void J(boolean z4) {
        Iterator<T> it = this.f50395i.iterator();
        while (it.hasNext()) {
            it.next().W(z4);
        }
    }

    public void K(boolean z4) {
        Iterator<T> it = this.f50395i.iterator();
        while (it.hasNext()) {
            it.next().b(z4);
        }
    }

    public void L(com.github.mikephil.charting.formatter.l lVar) {
        if (lVar == null) {
            return;
        }
        Iterator<T> it = this.f50395i.iterator();
        while (it.hasNext()) {
            it.next().P0(lVar);
        }
    }

    public void M(int i4) {
        Iterator<T> it = this.f50395i.iterator();
        while (it.hasNext()) {
            it.next().x0(i4);
        }
    }

    public void N(List<Integer> list) {
        Iterator<T> it = this.f50395i.iterator();
        while (it.hasNext()) {
            it.next().V0(list);
        }
    }

    public void O(float f4) {
        Iterator<T> it = this.f50395i.iterator();
        while (it.hasNext()) {
            it.next().H(f4);
        }
    }

    public void P(Typeface typeface) {
        Iterator<T> it = this.f50395i.iterator();
        while (it.hasNext()) {
            it.next().r0(typeface);
        }
    }

    public void a(T t4) {
        if (t4 == null) {
            return;
        }
        f(t4);
        this.f50395i.add(t4);
    }

    public void b(Entry entry, int i4) {
        if (this.f50395i.size() <= i4 || i4 < 0) {
            return;
        }
        T t4 = this.f50395i.get(i4);
        if (t4.D(entry)) {
            e(entry, t4.U());
        }
    }

    protected void d() {
        List<T> list = this.f50395i;
        if (list == null) {
            return;
        }
        this.f50387a = -3.4028235E38f;
        this.f50388b = Float.MAX_VALUE;
        this.f50389c = -3.4028235E38f;
        this.f50390d = Float.MAX_VALUE;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            f(it.next());
        }
        this.f50391e = -3.4028235E38f;
        this.f50392f = Float.MAX_VALUE;
        this.f50393g = -3.4028235E38f;
        this.f50394h = Float.MAX_VALUE;
        T t4 = t(this.f50395i);
        if (t4 != null) {
            this.f50391e = t4.f();
            this.f50392f = t4.p();
            for (T t5 : this.f50395i) {
                if (t5.U() == k.a.LEFT) {
                    if (t5.p() < this.f50392f) {
                        this.f50392f = t5.p();
                    }
                    if (t5.f() > this.f50391e) {
                        this.f50391e = t5.f();
                    }
                }
            }
        }
        T u4 = u(this.f50395i);
        if (u4 != null) {
            this.f50393g = u4.f();
            this.f50394h = u4.p();
            for (T t6 : this.f50395i) {
                if (t6.U() == k.a.RIGHT) {
                    if (t6.p() < this.f50394h) {
                        this.f50394h = t6.p();
                    }
                    if (t6.f() > this.f50393g) {
                        this.f50393g = t6.f();
                    }
                }
            }
        }
    }

    protected void e(Entry entry, k.a aVar) {
        if (this.f50387a < entry.c()) {
            this.f50387a = entry.c();
        }
        if (this.f50388b > entry.c()) {
            this.f50388b = entry.c();
        }
        if (this.f50389c < entry.j()) {
            this.f50389c = entry.j();
        }
        if (this.f50390d > entry.j()) {
            this.f50390d = entry.j();
        }
        if (aVar == k.a.LEFT) {
            if (this.f50391e < entry.c()) {
                this.f50391e = entry.c();
            }
            if (this.f50392f > entry.c()) {
                this.f50392f = entry.c();
                return;
            }
            return;
        }
        if (this.f50393g < entry.c()) {
            this.f50393g = entry.c();
        }
        if (this.f50394h > entry.c()) {
            this.f50394h = entry.c();
        }
    }

    protected void f(T t4) {
        if (this.f50387a < t4.f()) {
            this.f50387a = t4.f();
        }
        if (this.f50388b > t4.p()) {
            this.f50388b = t4.p();
        }
        if (this.f50389c < t4.b1()) {
            this.f50389c = t4.b1();
        }
        if (this.f50390d > t4.j0()) {
            this.f50390d = t4.j0();
        }
        if (t4.U() == k.a.LEFT) {
            if (this.f50391e < t4.f()) {
                this.f50391e = t4.f();
            }
            if (this.f50392f > t4.p()) {
                this.f50392f = t4.p();
                return;
            }
            return;
        }
        if (this.f50393g < t4.f()) {
            this.f50393g = t4.f();
        }
        if (this.f50394h > t4.p()) {
            this.f50394h = t4.p();
        }
    }

    public void g(float f4, float f5) {
        Iterator<T> it = this.f50395i.iterator();
        while (it.hasNext()) {
            it.next().L(f4, f5);
        }
        d();
    }

    public void h() {
        List<T> list = this.f50395i;
        if (list != null) {
            list.clear();
        }
        E();
    }

    public boolean i(T t4) {
        Iterator<T> it = this.f50395i.iterator();
        while (it.hasNext()) {
            if (it.next().equals(t4)) {
                return true;
            }
        }
        return false;
    }

    public int[] j() {
        if (this.f50395i == null) {
            return null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f50395i.size(); i5++) {
            i4 += this.f50395i.get(i5).I().size();
        }
        int[] iArr = new int[i4];
        int i6 = 0;
        for (int i7 = 0; i7 < this.f50395i.size(); i7++) {
            Iterator<Integer> it = this.f50395i.get(i7).I().iterator();
            while (it.hasNext()) {
                iArr[i6] = it.next().intValue();
                i6++;
            }
        }
        return iArr;
    }

    public T k(int i4) {
        List<T> list = this.f50395i;
        if (list == null || i4 < 0 || i4 >= list.size()) {
            return null;
        }
        return this.f50395i.get(i4);
    }

    public T l(String str, boolean z4) {
        int o4 = o(this.f50395i, str, z4);
        if (o4 < 0 || o4 >= this.f50395i.size()) {
            return null;
        }
        return this.f50395i.get(o4);
    }

    public int m() {
        List<T> list = this.f50395i;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public T n(Entry entry) {
        if (entry == null) {
            return null;
        }
        for (int i4 = 0; i4 < this.f50395i.size(); i4++) {
            T t4 = this.f50395i.get(i4);
            for (int i5 = 0; i5 < t4.h1(); i5++) {
                if (entry.h(t4.o0(entry.j(), entry.c()))) {
                    return t4;
                }
            }
        }
        return null;
    }

    protected int o(List<T> list, String str, boolean z4) {
        int i4 = 0;
        if (z4) {
            while (i4 < list.size()) {
                if (str.equalsIgnoreCase(list.get(i4).o())) {
                    return i4;
                }
                i4++;
            }
            return -1;
        }
        while (i4 < list.size()) {
            if (str.equals(list.get(i4).o())) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public String[] p() {
        String[] strArr = new String[this.f50395i.size()];
        for (int i4 = 0; i4 < this.f50395i.size(); i4++) {
            strArr[i4] = this.f50395i.get(i4).o();
        }
        return strArr;
    }

    public List<T> q() {
        return this.f50395i;
    }

    public int r() {
        Iterator<T> it = this.f50395i.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += it.next().h1();
        }
        return i4;
    }

    public Entry s(com.github.mikephil.charting.highlight.d dVar) {
        if (dVar.d() >= this.f50395i.size()) {
            return null;
        }
        return this.f50395i.get(dVar.d()).o0(dVar.h(), dVar.j());
    }

    protected T t(List<T> list) {
        for (T t4 : list) {
            if (t4.U() == k.a.LEFT) {
                return t4;
            }
        }
        return null;
    }

    public T u(List<T> list) {
        for (T t4 : list) {
            if (t4.U() == k.a.RIGHT) {
                return t4;
            }
        }
        return null;
    }

    public int v(T t4) {
        return this.f50395i.indexOf(t4);
    }

    public T w() {
        List<T> list = this.f50395i;
        if (list == null || list.isEmpty()) {
            return null;
        }
        T t4 = this.f50395i.get(0);
        for (T t5 : this.f50395i) {
            if (t5.h1() > t4.h1()) {
                t4 = t5;
            }
        }
        return t4;
    }

    public float x() {
        return this.f50389c;
    }

    public float y() {
        return this.f50390d;
    }

    public float z() {
        return this.f50387a;
    }

    public k(T... tArr) {
        this.f50387a = -3.4028235E38f;
        this.f50388b = Float.MAX_VALUE;
        this.f50389c = -3.4028235E38f;
        this.f50390d = Float.MAX_VALUE;
        this.f50391e = -3.4028235E38f;
        this.f50392f = Float.MAX_VALUE;
        this.f50393g = -3.4028235E38f;
        this.f50394h = Float.MAX_VALUE;
        this.f50395i = c(tArr);
        E();
    }

    public k(List<T> list) {
        this.f50387a = -3.4028235E38f;
        this.f50388b = Float.MAX_VALUE;
        this.f50389c = -3.4028235E38f;
        this.f50390d = Float.MAX_VALUE;
        this.f50391e = -3.4028235E38f;
        this.f50392f = Float.MAX_VALUE;
        this.f50393g = -3.4028235E38f;
        this.f50394h = Float.MAX_VALUE;
        this.f50395i = list;
        E();
    }
}
