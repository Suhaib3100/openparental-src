package androidx.constraintlayout.core.motion;

import androidx.compose.foundation.layout.f3;
import androidx.compose.material3.j4;
import androidx.compose.runtime.changelist.j;
import androidx.constraintlayout.core.motion.utils.w;
import androidx.core.view.x1;

/* compiled from: CustomVariable.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: g, reason: collision with root package name */
    private static final String f21955g = "TransitionLayout";

    /* renamed from: a, reason: collision with root package name */
    String f21956a;

    /* renamed from: b, reason: collision with root package name */
    private int f21957b;

    /* renamed from: c, reason: collision with root package name */
    private int f21958c;

    /* renamed from: d, reason: collision with root package name */
    private float f21959d;

    /* renamed from: e, reason: collision with root package name */
    private String f21960e;

    /* renamed from: f, reason: collision with root package name */
    boolean f21961f;

    public b(b bVar) {
        this.f21958c = Integer.MIN_VALUE;
        this.f21959d = Float.NaN;
        this.f21960e = null;
        this.f21956a = bVar.f21956a;
        this.f21957b = bVar.f21957b;
        this.f21958c = bVar.f21958c;
        this.f21959d = bVar.f21959d;
        this.f21960e = bVar.f21960e;
        this.f21961f = bVar.f21961f;
    }

    private static int b(int i4) {
        int i5 = (i4 & (~(i4 >> 31))) - 255;
        return (i5 & (i5 >> 31)) + 255;
    }

    public static String c(int i4) {
        return "#" + ("00000000" + Integer.toHexString(i4)).substring(r2.length() - 8);
    }

    public static int p(float f4, float f5, float f6) {
        float f7 = f4 * 6.0f;
        int i4 = (int) f7;
        float f10 = f7 - i4;
        float f11 = f6 * 255.0f;
        int a5 = (int) androidx.appcompat.graphics.drawable.d.a(1.0f, f5, f11, 0.5f);
        int i5 = (int) (((1.0f - (f10 * f5)) * f11) + 0.5f);
        int i6 = (int) (((1.0f - ((1.0f - f10) * f5)) * f11) + 0.5f);
        int i7 = (int) (f11 + 0.5f);
        if (i4 == 0) {
            return ((i7 << 16) + (i6 << 8) + a5) | x1.f27484y;
        }
        if (i4 == 1) {
            return ((i5 << 16) + (i7 << 8) + a5) | x1.f27484y;
        }
        if (i4 == 2) {
            return ((a5 << 16) + (i7 << 8) + i6) | x1.f27484y;
        }
        if (i4 == 3) {
            return ((a5 << 16) + (i5 << 8) + i7) | x1.f27484y;
        }
        if (i4 == 4) {
            return ((i6 << 16) + (a5 << 8) + i7) | x1.f27484y;
        }
        if (i4 != 5) {
            return 0;
        }
        return ((i7 << 16) + (a5 << 8) + i5) | x1.f27484y;
    }

    public static int s(float f4, float f5, float f6, float f7) {
        int b5 = b((int) (f4 * 255.0f));
        int b6 = b((int) (f5 * 255.0f));
        return (b5 << 16) | (b((int) (f7 * 255.0f)) << 24) | (b6 << 8) | b((int) (f6 * 255.0f));
    }

    public void a(f fVar) {
        int i4 = this.f21957b;
        switch (i4) {
            case w.b.f22438j /* 900 */:
            case w.b.f22440l /* 902 */:
            case w.b.f22444p /* 906 */:
                fVar.J(this.f21956a, i4, this.f21958c);
                break;
            case w.b.f22439k /* 901 */:
            case w.b.f22443o /* 905 */:
                fVar.I(this.f21956a, i4, this.f21959d);
                break;
            case w.b.f22441m /* 903 */:
                fVar.K(this.f21956a, i4, this.f21960e);
                break;
            case w.b.f22442n /* 904 */:
                fVar.L(this.f21956a, i4, this.f21961f);
                break;
        }
    }

    public b d() {
        return new b(this);
    }

    public boolean e(b bVar) {
        int i4;
        if (bVar == null || (i4 = this.f21957b) != bVar.f21957b) {
            return false;
        }
        switch (i4) {
            case w.b.f22438j /* 900 */:
            case w.b.f22444p /* 906 */:
                return this.f21958c == bVar.f21958c;
            case w.b.f22439k /* 901 */:
                return this.f21959d == bVar.f21959d;
            case w.b.f22440l /* 902 */:
                return this.f21958c == bVar.f21958c;
            case w.b.f22441m /* 903 */:
                return this.f21958c == bVar.f21958c;
            case w.b.f22442n /* 904 */:
                return this.f21961f == bVar.f21961f;
            case w.b.f22443o /* 905 */:
                return this.f21959d == bVar.f21959d;
            default:
                return false;
        }
    }

    public boolean f() {
        return this.f21961f;
    }

    public int g() {
        return this.f21958c;
    }

    public float h() {
        return this.f21959d;
    }

    public int i() {
        return this.f21958c;
    }

    public int j(float[] fArr) {
        return (b((int) (fArr[3] * 255.0f)) << 24) | (b((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (b((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | b((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    public String k() {
        return this.f21956a;
    }

    public String l() {
        return this.f21960e;
    }

    public int m() {
        return this.f21957b;
    }

    public float n() {
        switch (this.f21957b) {
            case w.b.f22438j /* 900 */:
                return this.f21958c;
            case w.b.f22439k /* 901 */:
                return this.f21959d;
            case w.b.f22440l /* 902 */:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case w.b.f22441m /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case w.b.f22442n /* 904 */:
                return this.f21961f ? 1.0f : 0.0f;
            case w.b.f22443o /* 905 */:
                return this.f21959d;
            default:
                return Float.NaN;
        }
    }

    public void o(float[] fArr) {
        switch (this.f21957b) {
            case w.b.f22438j /* 900 */:
                fArr[0] = this.f21958c;
                return;
            case w.b.f22439k /* 901 */:
                fArr[0] = this.f21959d;
                return;
            case w.b.f22440l /* 902 */:
                int i4 = (this.f21958c >> 24) & 255;
                float pow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = i4 / 255.0f;
                return;
            case w.b.f22441m /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case w.b.f22442n /* 904 */:
                fArr[0] = this.f21961f ? 1.0f : 0.0f;
                return;
            case w.b.f22443o /* 905 */:
                fArr[0] = this.f21959d;
                return;
            default:
                return;
        }
    }

    public boolean q() {
        int i4 = this.f21957b;
        return (i4 == 903 || i4 == 904 || i4 == 906) ? false : true;
    }

    public int r() {
        return this.f21957b != 902 ? 1 : 4;
    }

    public void t(boolean z4) {
        this.f21961f = z4;
    }

    public String toString() {
        String a5 = f3.a(new StringBuilder(), this.f21956a, ':');
        switch (this.f21957b) {
            case w.b.f22438j /* 900 */:
                StringBuilder a6 = j4.a(a5);
                a6.append(this.f21958c);
                return a6.toString();
            case w.b.f22439k /* 901 */:
                StringBuilder a7 = j4.a(a5);
                a7.append(this.f21959d);
                return a7.toString();
            case w.b.f22440l /* 902 */:
                StringBuilder a8 = j4.a(a5);
                a8.append(c(this.f21958c));
                return a8.toString();
            case w.b.f22441m /* 903 */:
                StringBuilder a10 = j4.a(a5);
                a10.append(this.f21960e);
                return a10.toString();
            case w.b.f22442n /* 904 */:
                StringBuilder a11 = j4.a(a5);
                a11.append(Boolean.valueOf(this.f21961f));
                return a11.toString();
            case w.b.f22443o /* 905 */:
                StringBuilder a12 = j4.a(a5);
                a12.append(this.f21959d);
                return a12.toString();
            default:
                return j.a(a5, "????");
        }
    }

    public void u(float f4) {
        this.f21959d = f4;
    }

    public void v(int i4) {
        this.f21958c = i4;
    }

    public void w(f fVar, float[] fArr) {
        int i4 = this.f21957b;
        switch (i4) {
            case w.b.f22438j /* 900 */:
                fVar.J(this.f21956a, i4, (int) fArr[0]);
                return;
            case w.b.f22439k /* 901 */:
            case w.b.f22443o /* 905 */:
                fVar.I(this.f21956a, i4, fArr[0]);
                return;
            case w.b.f22440l /* 902 */:
                fVar.J(this.f21956a, this.f21957b, (b((int) (fArr[3] * 255.0f)) << 24) | (b((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (b((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | b((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                return;
            case w.b.f22441m /* 903 */:
            case w.b.f22444p /* 906 */:
                throw new RuntimeException("unable to interpolate " + this.f21956a);
            case w.b.f22442n /* 904 */:
                fVar.L(this.f21956a, i4, fArr[0] > 0.5f);
                return;
            default:
                return;
        }
    }

    public void x(String str) {
        this.f21960e = str;
    }

    public void y(Object obj) {
        switch (this.f21957b) {
            case w.b.f22438j /* 900 */:
            case w.b.f22444p /* 906 */:
                this.f21958c = ((Integer) obj).intValue();
                break;
            case w.b.f22439k /* 901 */:
                this.f21959d = ((Float) obj).floatValue();
                break;
            case w.b.f22440l /* 902 */:
                this.f21958c = ((Integer) obj).intValue();
                break;
            case w.b.f22441m /* 903 */:
                this.f21960e = (String) obj;
                break;
            case w.b.f22442n /* 904 */:
                this.f21961f = ((Boolean) obj).booleanValue();
                break;
            case w.b.f22443o /* 905 */:
                this.f21959d = ((Float) obj).floatValue();
                break;
        }
    }

    public void z(float[] fArr) {
        switch (this.f21957b) {
            case w.b.f22438j /* 900 */:
            case w.b.f22444p /* 906 */:
                this.f21958c = (int) fArr[0];
                return;
            case w.b.f22439k /* 901 */:
            case w.b.f22443o /* 905 */:
                this.f21959d = fArr[0];
                return;
            case w.b.f22440l /* 902 */:
                this.f21958c = ((Math.round(fArr[3] * 255.0f) & 255) << 24) | ((Math.round(((float) Math.pow(fArr[0], 0.5d)) * 255.0f) & 255) << 16) | ((Math.round(((float) Math.pow(fArr[1], 0.5d)) * 255.0f) & 255) << 8) | (Math.round(((float) Math.pow(fArr[2], 0.5d)) * 255.0f) & 255);
                return;
            case w.b.f22441m /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case w.b.f22442n /* 904 */:
                this.f21961f = ((double) fArr[0]) > 0.5d;
                return;
            default:
                return;
        }
    }

    public b(String str, int i4, String str2) {
        this.f21958c = Integer.MIN_VALUE;
        this.f21959d = Float.NaN;
        this.f21956a = str;
        this.f21957b = i4;
        this.f21960e = str2;
    }

    public b(String str, int i4, int i5) {
        this.f21958c = Integer.MIN_VALUE;
        this.f21959d = Float.NaN;
        this.f21960e = null;
        this.f21956a = str;
        this.f21957b = i4;
        if (i4 == 901) {
            this.f21959d = i5;
        } else {
            this.f21958c = i5;
        }
    }

    public b(String str, int i4, float f4) {
        this.f21958c = Integer.MIN_VALUE;
        this.f21960e = null;
        this.f21956a = str;
        this.f21957b = i4;
        this.f21959d = f4;
    }

    public b(String str, int i4, boolean z4) {
        this.f21958c = Integer.MIN_VALUE;
        this.f21959d = Float.NaN;
        this.f21960e = null;
        this.f21956a = str;
        this.f21957b = i4;
        this.f21961f = z4;
    }

    public b(String str, int i4) {
        this.f21958c = Integer.MIN_VALUE;
        this.f21959d = Float.NaN;
        this.f21960e = null;
        this.f21956a = str;
        this.f21957b = i4;
    }

    public b(String str, int i4, Object obj) {
        this.f21958c = Integer.MIN_VALUE;
        this.f21959d = Float.NaN;
        this.f21960e = null;
        this.f21956a = str;
        this.f21957b = i4;
        y(obj);
    }

    public b(b bVar, Object obj) {
        this.f21958c = Integer.MIN_VALUE;
        this.f21959d = Float.NaN;
        this.f21960e = null;
        this.f21956a = bVar.f21956a;
        this.f21957b = bVar.f21957b;
        y(obj);
    }
}
