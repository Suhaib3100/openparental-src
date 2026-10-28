package f8;

import android.graphics.DashPathEffect;
import android.graphics.Typeface;
import com.github.mikephil.charting.components.e;
import com.github.mikephil.charting.components.k;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.m;
import com.github.mikephil.charting.formatter.l;
import java.util.List;

/* compiled from: IDataSet.java */
/* loaded from: classes5.dex */
public interface e<T extends Entry> {
    void A(boolean z4);

    Typeface B();

    float B0();

    boolean D(T t4);

    int E(int i4);

    boolean F(T t4);

    int G0(int i4);

    void H(float f4);

    List<Integer> I();

    void L(float f4, float f5);

    boolean L0();

    boolean M0(T t4);

    List<T> N(float f4);

    int N0(float f4, float f5, m.a aVar);

    void O();

    List<h8.a> P();

    void P0(l lVar);

    T Q0(float f4, float f5, m.a aVar);

    boolean S();

    k.a U();

    boolean V(int i4);

    void V0(List<Integer> list);

    void W(boolean z4);

    void W0(com.github.mikephil.charting.utils.g gVar);

    int Y();

    void b(boolean z4);

    float b1();

    void clear();

    void d(k.a aVar);

    float f();

    int g(T t4);

    int h1();

    com.github.mikephil.charting.utils.g i1();

    boolean isVisible();

    float j0();

    boolean k1();

    boolean l0(float f4);

    e.c m();

    void m1(T t4);

    DashPathEffect n0();

    h8.a n1(int i4);

    String o();

    T o0(float f4, float f5);

    float p();

    void p1(String str);

    boolean q0();

    void r0(Typeface typeface);

    boolean removeFirst();

    boolean removeLast();

    int s(int i4);

    void setVisible(boolean z4);

    int t0();

    l u();

    h8.a v0();

    T w(int i4);

    float x();

    void x0(int i4);

    float z0();
}
