package androidx.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.reflect.Field;
import java.util.Objects;

/* compiled from: LayoutInflaterCompat.java */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5546a = "LayoutInflaterCompatHC";

    /* renamed from: b, reason: collision with root package name */
    private static Field f5547b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f5548c;

    /* compiled from: LayoutInflaterCompat.java */
    static class a implements LayoutInflater.Factory2 {

        /* renamed from: o, reason: collision with root package name */
        final h0 f5549o;

        a(h0 h0Var) {
            this.f5549o = h0Var;
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.f5549o.onCreateView(null, str, context, attributeSet);
        }

        @androidx.annotation.o0
        public String toString() {
            return getClass().getName() + "{" + this.f5549o + "}";
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.f5549o.onCreateView(view, str, context, attributeSet);
        }
    }

    private g0() {
    }

    private static void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f5548c) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f5547b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f5548c = true;
        }
        Field field = f5547b;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException unused2) {
                Objects.toString(layoutInflater);
            }
        }
    }

    @Deprecated
    public static h0 b(LayoutInflater layoutInflater) {
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof a) {
            return ((a) factory).f5549o;
        }
        return null;
    }

    @Deprecated
    public static void c(@androidx.annotation.o0 LayoutInflater layoutInflater, @androidx.annotation.o0 h0 h0Var) {
        layoutInflater.setFactory2(new a(h0Var));
    }

    public static void d(@androidx.annotation.o0 LayoutInflater layoutInflater, @androidx.annotation.o0 LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
    }
}
