package androidx.core.util;

import android.util.SizeF;
import androidx.annotation.o0;
import androidx.annotation.x0;

/* compiled from: SizeFCompat.java */
/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    private final float f26841a;

    /* renamed from: b, reason: collision with root package name */
    private final float f26842b;

    /* compiled from: SizeFCompat.java */
    @x0(21)
    private static final class a {
        private a() {
        }

        @o0
        static SizeF a(@o0 f0 f0Var) {
            f0Var.getClass();
            return new SizeF(f0Var.b(), f0Var.a());
        }

        @o0
        static f0 b(@o0 SizeF sizeF) {
            sizeF.getClass();
            return new f0(sizeF.getWidth(), sizeF.getHeight());
        }
    }

    public f0(float f4, float f5) {
        this.f26841a = w.d(f4, "width");
        this.f26842b = w.d(f5, "height");
    }

    @o0
    @x0(21)
    public static f0 d(@o0 SizeF sizeF) {
        return a.b(sizeF);
    }

    public float a() {
        return this.f26842b;
    }

    public float b() {
        return this.f26841a;
    }

    @o0
    @x0(21)
    public SizeF c() {
        return a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return f0Var.f26841a == this.f26841a && f0Var.f26842b == this.f26842b;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f26841a) ^ Float.floatToIntBits(this.f26842b);
    }

    @o0
    public String toString() {
        return this.f26841a + "x" + this.f26842b;
    }
}
