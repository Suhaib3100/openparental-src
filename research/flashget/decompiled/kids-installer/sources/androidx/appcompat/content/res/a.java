package androidx.appcompat.content.res;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.n;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.core.content.res.c;
import java.util.WeakHashMap;

/* compiled from: AppCompatResources.java */
@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f461a = "AppCompatResources";

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f462b = new ThreadLocal<>();

    /* renamed from: c, reason: collision with root package name */
    private static final WeakHashMap<Context, SparseArray<C0006a>> f463c = new WeakHashMap<>(0);

    /* renamed from: d, reason: collision with root package name */
    private static final Object f464d = new Object();

    /* compiled from: AppCompatResources.java */
    /* renamed from: androidx.appcompat.content.res.a$a, reason: collision with other inner class name */
    private static class C0006a {

        /* renamed from: a, reason: collision with root package name */
        final ColorStateList f465a;

        /* renamed from: b, reason: collision with root package name */
        final Configuration f466b;

        C0006a(@o0 ColorStateList colorStateList, @o0 Configuration configuration) {
            this.f465a = colorStateList;
            this.f466b = configuration;
        }
    }

    private a() {
    }

    private static void a(@o0 Context context, @n int i5, @o0 ColorStateList colorStateList) {
        synchronized (f464d) {
            WeakHashMap<Context, SparseArray<C0006a>> weakHashMap = f463c;
            SparseArray<C0006a> sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i5, new C0006a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    @q0
    private static ColorStateList b(@o0 Context context, @n int i5) {
        C0006a c0006a;
        synchronized (f464d) {
            SparseArray<C0006a> sparseArray = f463c.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (c0006a = sparseArray.get(i5)) != null) {
                if (c0006a.f466b.equals(context.getResources().getConfiguration())) {
                    return c0006a.f465a;
                }
                sparseArray.remove(i5);
            }
            return null;
        }
    }

    public static ColorStateList c(@o0 Context context, @n int i5) {
        return context.getColorStateList(i5);
    }

    @q0
    public static Drawable d(@o0 Context context, @v int i5) {
        return androidx.appcompat.widget.o0.h().j(context, i5);
    }

    @o0
    private static TypedValue e() {
        ThreadLocal<TypedValue> threadLocal = f462b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    @q0
    private static ColorStateList f(Context context, int i5) {
        if (g(context, i5)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return c.a(resources, resources.getXml(i5), context.getTheme());
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean g(@o0 Context context, @n int i5) {
        Resources resources = context.getResources();
        TypedValue e6 = e();
        resources.getValue(i5, e6, true);
        int i6 = e6.type;
        return i6 >= 28 && i6 <= 31;
    }
}
