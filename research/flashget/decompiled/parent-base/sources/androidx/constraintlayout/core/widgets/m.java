package androidx.constraintlayout.core.widgets;

/* compiled from: Rectangle.java */
/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public int f23059a;

    /* renamed from: b, reason: collision with root package name */
    public int f23060b;

    /* renamed from: c, reason: collision with root package name */
    public int f23061c;

    /* renamed from: d, reason: collision with root package name */
    public int f23062d;

    public boolean a(int i4, int i5) {
        int i6;
        int i7 = this.f23059a;
        return i4 >= i7 && i4 < i7 + this.f23061c && i5 >= (i6 = this.f23060b) && i5 < i6 + this.f23062d;
    }

    public int b() {
        return (this.f23059a + this.f23061c) / 2;
    }

    public int c() {
        return (this.f23060b + this.f23062d) / 2;
    }

    void d(int i4, int i5) {
        this.f23059a -= i4;
        this.f23060b -= i5;
        this.f23061c = (i4 * 2) + this.f23061c;
        this.f23062d = (i5 * 2) + this.f23062d;
    }

    boolean e(m mVar) {
        int i4;
        int i5;
        int i6 = this.f23059a;
        int i7 = mVar.f23059a;
        return i6 >= i7 && i6 < i7 + mVar.f23061c && (i4 = this.f23060b) >= (i5 = mVar.f23060b) && i4 < i5 + mVar.f23062d;
    }

    public void f(int i4, int i5, int i6, int i7) {
        this.f23059a = i4;
        this.f23060b = i5;
        this.f23061c = i6;
        this.f23062d = i7;
    }
}
