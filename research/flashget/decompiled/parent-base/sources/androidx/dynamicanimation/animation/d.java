package androidx.dynamicanimation.animation;

import android.util.FloatProperty;
import androidx.annotation.x0;

/* compiled from: FloatPropertyCompat.java */
/* loaded from: classes3.dex */
public abstract class d<T> {

    /* renamed from: a, reason: collision with root package name */
    final String f29239a;

    /* compiled from: FloatPropertyCompat.java */
    static class a extends d<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FloatProperty f29240b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, FloatProperty floatProperty) {
            super(str);
            this.f29240b = floatProperty;
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(T t4) {
            return ((Float) this.f29240b.get(t4)).floatValue();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(T t4, float f4) {
            this.f29240b.setValue(t4, f4);
        }
    }

    public d(String str) {
        this.f29239a = str;
    }

    @x0(24)
    public static <T> d<T> a(FloatProperty<T> floatProperty) {
        return new a(floatProperty.getName(), floatProperty);
    }

    public abstract float b(T t4);

    public abstract void c(T t4, float f4);
}
