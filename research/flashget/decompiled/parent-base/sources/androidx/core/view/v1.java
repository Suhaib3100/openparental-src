package androidx.core.view;

import android.view.MotionEvent;

/* compiled from: VelocityTrackerFallback.java */
/* loaded from: classes3.dex */
class v1 {

    /* renamed from: f, reason: collision with root package name */
    private static final long f27447f = 100;

    /* renamed from: g, reason: collision with root package name */
    private static final int f27448g = 20;

    /* renamed from: h, reason: collision with root package name */
    private static final long f27449h = 40;

    /* renamed from: a, reason: collision with root package name */
    private final float[] f27450a = new float[20];

    /* renamed from: b, reason: collision with root package name */
    private final long[] f27451b = new long[20];

    /* renamed from: c, reason: collision with root package name */
    private float f27452c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    private int f27453d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f27454e = 0;

    v1() {
    }

    private void b() {
        this.f27453d = 0;
        this.f27452c = 0.0f;
    }

    private float f() {
        long[] jArr;
        long j4;
        int i4 = this.f27453d;
        if (i4 < 2) {
            return 0.0f;
        }
        int i5 = this.f27454e;
        int i6 = ((i5 + 20) - (i4 - 1)) % 20;
        long j5 = this.f27451b[i5];
        while (true) {
            jArr = this.f27451b;
            j4 = jArr[i6];
            if (j5 - j4 <= 100) {
                break;
            }
            this.f27453d--;
            i6 = (i6 + 1) % 20;
        }
        int i7 = this.f27453d;
        if (i7 < 2) {
            return 0.0f;
        }
        if (i7 == 2) {
            int i10 = (i6 + 1) % 20;
            if (j4 == jArr[i10]) {
                return 0.0f;
            }
            return this.f27450a[i10] / (r2 - j4);
        }
        float f4 = 0.0f;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f27453d - 1; i12++) {
            int i13 = i12 + i6;
            long[] jArr2 = this.f27451b;
            long j6 = jArr2[i13 % 20];
            int i14 = (i13 + 1) % 20;
            if (jArr2[i14] != j6) {
                i11++;
                float g4 = g(f4);
                float f5 = this.f27450a[i14] / (this.f27451b[i14] - j6);
                float abs = (Math.abs(f5) * (f5 - g4)) + f4;
                if (i11 == 1) {
                    abs *= 0.5f;
                }
                f4 = abs;
            }
        }
        return g(f4);
    }

    private static float g(float f4) {
        return (f4 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f4) * 2.0f));
    }

    void a(@androidx.annotation.o0 MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f27453d != 0 && eventTime - this.f27451b[this.f27454e] > f27449h) {
            b();
        }
        int i4 = (this.f27454e + 1) % 20;
        this.f27454e = i4;
        int i5 = this.f27453d;
        if (i5 != 20) {
            this.f27453d = i5 + 1;
        }
        this.f27450a[i4] = motionEvent.getAxisValue(26);
        this.f27451b[this.f27454e] = eventTime;
    }

    void c(int i4) {
        d(i4, Float.MAX_VALUE);
    }

    void d(int i4, float f4) {
        float f5 = f() * i4;
        this.f27452c = f5;
        if (f5 < (-Math.abs(f4))) {
            this.f27452c = -Math.abs(f4);
        } else if (this.f27452c > Math.abs(f4)) {
            this.f27452c = Math.abs(f4);
        }
    }

    float e(int i4) {
        if (i4 != 26) {
            return 0.0f;
        }
        return this.f27452c;
    }
}
