package androidx.constraintlayout.core.motion;

import androidx.core.view.x1;

/* compiled from: CustomAttribute.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: i, reason: collision with root package name */
    private static final String f21945i = "TransitionLayout";

    /* renamed from: a, reason: collision with root package name */
    private boolean f21946a;

    /* renamed from: b, reason: collision with root package name */
    String f21947b;

    /* renamed from: c, reason: collision with root package name */
    private b f21948c;

    /* renamed from: d, reason: collision with root package name */
    private int f21949d;

    /* renamed from: e, reason: collision with root package name */
    private float f21950e;

    /* renamed from: f, reason: collision with root package name */
    private String f21951f;

    /* renamed from: g, reason: collision with root package name */
    boolean f21952g;

    /* renamed from: h, reason: collision with root package name */
    private int f21953h;

    /* compiled from: CustomAttribute.java */
    /* renamed from: androidx.constraintlayout.core.motion.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0387a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21954a;

        static {
            int[] iArr = new int[b.values().length];
            f21954a = iArr;
            try {
                iArr[b.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21954a[b.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21954a[b.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21954a[b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21954a[b.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21954a[b.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21954a[b.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21954a[b.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: CustomAttribute.java */
    public enum b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public a(String str, b bVar) {
        this.f21946a = false;
        this.f21947b = str;
        this.f21948c = bVar;
    }

    private static int a(int i4) {
        int i5 = (i4 & (~(i4 >> 31))) - 255;
        return (i5 & (i5 >> 31)) + 255;
    }

    public static int f(float f4, float f5, float f6) {
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

    public boolean b(a aVar) {
        b bVar;
        if (aVar == null || (bVar = this.f21948c) != aVar.f21948c) {
            return false;
        }
        switch (C0387a.f21954a[bVar.ordinal()]) {
            case 1:
            case 6:
                return this.f21949d == aVar.f21949d;
            case 2:
                return this.f21952g == aVar.f21952g;
            case 3:
                return this.f21949d == aVar.f21949d;
            case 4:
            case 5:
                return this.f21953h == aVar.f21953h;
            case 7:
                return this.f21950e == aVar.f21950e;
            case 8:
                return this.f21950e == aVar.f21950e;
            default:
                return false;
        }
    }

    public b c() {
        return this.f21948c;
    }

    public float d() {
        switch (C0387a.f21954a[this.f21948c.ordinal()]) {
            case 2:
                return this.f21952g ? 1.0f : 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.f21949d;
            case 7:
                return this.f21950e;
            case 8:
                return this.f21950e;
            default:
                return Float.NaN;
        }
    }

    public void e(float[] fArr) {
        switch (C0387a.f21954a[this.f21948c.ordinal()]) {
            case 2:
                fArr[0] = this.f21952g ? 1.0f : 0.0f;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i4 = (this.f21953h >> 24) & 255;
                float pow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = i4 / 255.0f;
                return;
            case 6:
                fArr[0] = this.f21949d;
                return;
            case 7:
                fArr[0] = this.f21950e;
                return;
            case 8:
                fArr[0] = this.f21950e;
                return;
            default:
                return;
        }
    }

    public boolean g() {
        int i4 = C0387a.f21954a[this.f21948c.ordinal()];
        return (i4 == 1 || i4 == 2 || i4 == 3) ? false : true;
    }

    public int h() {
        int i4 = C0387a.f21954a[this.f21948c.ordinal()];
        return (i4 == 4 || i4 == 5) ? 4 : 1;
    }

    public void i(int i4) {
        this.f21953h = i4;
    }

    public void j(float f4) {
        this.f21950e = f4;
    }

    public void k(int i4) {
        this.f21949d = i4;
    }

    public void l(String str) {
        this.f21951f = str;
    }

    public void m(Object obj) {
        switch (C0387a.f21954a[this.f21948c.ordinal()]) {
            case 1:
            case 6:
                this.f21949d = ((Integer) obj).intValue();
                break;
            case 2:
                this.f21952g = ((Boolean) obj).booleanValue();
                break;
            case 3:
                this.f21951f = (String) obj;
                break;
            case 4:
            case 5:
                this.f21953h = ((Integer) obj).intValue();
                break;
            case 7:
                this.f21950e = ((Float) obj).floatValue();
                break;
            case 8:
                this.f21950e = ((Float) obj).floatValue();
                break;
        }
    }

    public void n(float[] fArr) {
        switch (C0387a.f21954a[this.f21948c.ordinal()]) {
            case 1:
            case 6:
                this.f21949d = (int) fArr[0];
                return;
            case 2:
                this.f21952g = ((double) fArr[0]) > 0.5d;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int f4 = f(fArr[0], fArr[1], fArr[2]);
                this.f21953h = f4;
                this.f21953h = (a((int) (fArr[3] * 255.0f)) << 24) | (f4 & 16777215);
                return;
            case 7:
                this.f21950e = fArr[0];
                return;
            case 8:
                this.f21950e = fArr[0];
                return;
            default:
                return;
        }
    }

    public a(String str, b bVar, Object obj, boolean z4) {
        this.f21947b = str;
        this.f21948c = bVar;
        this.f21946a = z4;
        m(obj);
    }

    public a(a aVar, Object obj) {
        this.f21946a = false;
        this.f21947b = aVar.f21947b;
        this.f21948c = aVar.f21948c;
        m(obj);
    }
}
