package androidx.constraintlayout.solver.widgets;

/* compiled from: Rectangle.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public int f2637a;

    /* renamed from: b, reason: collision with root package name */
    public int f2638b;

    /* renamed from: c, reason: collision with root package name */
    public int f2639c;

    /* renamed from: d, reason: collision with root package name */
    public int f2640d;

    public boolean a(int i5, int i6) {
        int i7;
        int i8 = this.f2637a;
        return i5 >= i8 && i5 < i8 + this.f2639c && i6 >= (i7 = this.f2638b) && i6 < i7 + this.f2640d;
    }

    public int b() {
        return (this.f2637a + this.f2639c) / 2;
    }

    public int c() {
        return (this.f2638b + this.f2640d) / 2;
    }

    void d(int i5, int i6) {
        this.f2637a -= i5;
        this.f2638b -= i6;
        this.f2639c = (i5 * 2) + this.f2639c;
        this.f2640d = (i6 * 2) + this.f2640d;
    }

    boolean e(l lVar) {
        int i5;
        int i6;
        int i7 = this.f2637a;
        int i8 = lVar.f2637a;
        return i7 >= i8 && i7 < i8 + lVar.f2639c && (i5 = this.f2638b) >= (i6 = lVar.f2638b) && i5 < i6 + lVar.f2640d;
    }

    public void f(int i5, int i6, int i7, int i8) {
        this.f2637a = i5;
        this.f2638b = i6;
        this.f2639c = i7;
        this.f2640d = i8;
    }
}
