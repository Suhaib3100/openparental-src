package androidx.core.util;

import android.util.SizeF;
import androidx.annotation.o0;
import androidx.annotation.x0;

/* compiled from: SizeFCompat.java */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final float f5283a;

    /* renamed from: b, reason: collision with root package name */
    private final float f5284b;

    /* compiled from: SizeFCompat.java */
    @x0(21)
    private static final class a {
        private a() {
        }

        @androidx.annotation.u
        @o0
        static SizeF a(@o0 t tVar) {
            tVar.getClass();
            return new SizeF(tVar.b(), tVar.a());
        }

        @androidx.annotation.u
        @o0
        static t b(@o0 SizeF sizeF) {
            sizeF.getClass();
            return new t(sizeF.getWidth(), sizeF.getHeight());
        }
    }

    public t(float f6, float f7) {
        this.f5283a = q.d(f6, "width");
        this.f5284b = q.d(f7, "height");
    }

    @o0
    @x0(21)
    public static t d(@o0 SizeF sizeF) {
        return a.b(sizeF);
    }

    public float a() {
        return this.f5284b;
    }

    public float b() {
        return this.f5283a;
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
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return tVar.f5283a == this.f5283a && tVar.f5284b == this.f5284b;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f5283a) ^ Float.floatToIntBits(this.f5284b);
    }

    @o0
    public String toString() {
        return this.f5283a + "x" + this.f5284b;
    }
}
