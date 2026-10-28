package eightbitlab.com.blurview;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: SizeScaler.java */
/* loaded from: classes7.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    private static final int f73816b = 64;

    /* renamed from: a, reason: collision with root package name */
    private final float f73817a;

    /* compiled from: SizeScaler.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final int f73818a;

        /* renamed from: b, reason: collision with root package name */
        final int f73819b;

        /* renamed from: c, reason: collision with root package name */
        final float f73820c;

        a(int i4, int i5, float f4) {
            this.f73818a = i4;
            this.f73819b = i5;
            this.f73820c = f4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f73818a == aVar.f73818a && this.f73819b == aVar.f73819b && Float.compare(aVar.f73820c, this.f73820c) == 0;
        }

        public int hashCode() {
            int i4 = ((this.f73818a * 31) + this.f73819b) * 31;
            float f4 = this.f73820c;
            return i4 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("恂\u0001"));
            sb.append(this.f73818a);
            sb.append(ProtectedSandApp.s("恃\u0001"));
            sb.append(this.f73819b);
            sb.append(ProtectedSandApp.s("恄\u0001"));
            return androidx.compose.animation.b.a(sb, this.f73820c, '}');
        }
    }

    public k(float f4) {
        this.f73817a = f4;
    }

    private int a(float f4) {
        return (int) Math.ceil(f4 / this.f73817a);
    }

    private int c(int i4) {
        int i5 = i4 % 64;
        return i5 == 0 ? i4 : (i4 - i5) + 64;
    }

    boolean b(int i4, int i5) {
        return a((float) i5) == 0 || a((float) i4) == 0;
    }

    a d(int i4, int i5) {
        float f4 = i4;
        int c5 = c(a(f4));
        return new a(c5, (int) Math.ceil(i5 / r4), f4 / c5);
    }
}
