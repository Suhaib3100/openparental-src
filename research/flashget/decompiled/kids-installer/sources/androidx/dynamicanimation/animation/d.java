package androidx.dynamicanimation.animation;

import android.util.FloatProperty;
import androidx.annotation.x0;

/* compiled from: FloatPropertyCompat.java */
/* loaded from: classes.dex */
public abstract class d<T> {

    /* renamed from: a, reason: collision with root package name */
    final String f7787a;

    /* compiled from: FloatPropertyCompat.java */
    /* loaded from: classes3.dex */
    static class a extends d<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FloatProperty f7788b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, FloatProperty floatProperty) {
            super(str);
            this.f7788b = floatProperty;
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(T t5) {
            return ((Float) this.f7788b.get(t5)).floatValue();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(T t5, float f6) {
            this.f7788b.setValue(t5, f6);
        }
    }

    public d(String str) {
        this.f7787a = str;
    }

    @x0(24)
    public static <T> d<T> a(FloatProperty<T> floatProperty) {
        return new a(floatProperty.getName(), floatProperty);
    }

    public abstract float b(T t5);

    public abstract void c(T t5, float f6);
}
