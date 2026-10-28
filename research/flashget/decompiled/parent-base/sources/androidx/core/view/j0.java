package androidx.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.reflect.Field;
import java.util.Objects;

/* compiled from: LayoutInflaterCompat.java */
/* loaded from: classes3.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f27267a = "LayoutInflaterCompatHC";

    /* renamed from: b, reason: collision with root package name */
    private static Field f27268b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f27269c;

    /* compiled from: LayoutInflaterCompat.java */
    static class a implements LayoutInflater.Factory2 {

        /* renamed from: b, reason: collision with root package name */
        final k0 f27270b;

        a(k0 k0Var) {
            this.f27270b = k0Var;
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.f27270b.onCreateView(null, str, context, attributeSet);
        }

        @androidx.annotation.o0
        public String toString() {
            return getClass().getName() + "{" + this.f27270b + "}";
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.f27270b.onCreateView(view, str, context, attributeSet);
        }
    }

    private j0() {
    }

    private static void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f27269c) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f27268b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f27269c = true;
        }
        Field field = f27268b;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException unused2) {
                Objects.toString(layoutInflater);
            }
        }
    }

    @Deprecated
    public static k0 b(LayoutInflater layoutInflater) {
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof a) {
            return ((a) factory).f27270b;
        }
        return null;
    }

    @Deprecated
    public static void c(@androidx.annotation.o0 LayoutInflater layoutInflater, @androidx.annotation.o0 k0 k0Var) {
        layoutInflater.setFactory2(new a(k0Var));
    }

    public static void d(@androidx.annotation.o0 LayoutInflater layoutInflater, @androidx.annotation.o0 LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
    }
}
