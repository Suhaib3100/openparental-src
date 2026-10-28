package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import androidx.annotation.c1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: TintContextWrapper.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class q0 extends ContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f2010c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static ArrayList<WeakReference<q0>> f2011d;

    /* renamed from: a, reason: collision with root package name */
    private final Resources f2012a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources.Theme f2013b;

    private q0(@androidx.annotation.o0 Context context) {
        super(context);
        if (!d1.d()) {
            this.f2012a = new s0(this, context.getResources());
            this.f2013b = null;
            return;
        }
        d1 d1Var = new d1(this, context.getResources());
        this.f2012a = d1Var;
        Resources.Theme newTheme = d1Var.newTheme();
        this.f2013b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    private static boolean a(@androidx.annotation.o0 Context context) {
        if ((context instanceof q0) || (context.getResources() instanceof s0) || (context.getResources() instanceof d1)) {
            return false;
        }
        return d1.d();
    }

    public static Context b(@androidx.annotation.o0 Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f2010c) {
            try {
                ArrayList<WeakReference<q0>> arrayList = f2011d;
                if (arrayList == null) {
                    f2011d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<q0> weakReference = f2011d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f2011d.remove(size);
                        }
                    }
                    for (int size2 = f2011d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<q0> weakReference2 = f2011d.get(size2);
                        q0 q0Var = weakReference2 != null ? weakReference2.get() : null;
                        if (q0Var != null && q0Var.getBaseContext() == context) {
                            return q0Var;
                        }
                    }
                }
                q0 q0Var2 = new q0(context);
                f2011d.add(new WeakReference<>(q0Var2));
                return q0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f2012a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f2012a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f2013b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i4) {
        Resources.Theme theme = this.f2013b;
        if (theme == null) {
            super.setTheme(i4);
        } else {
            theme.applyStyle(i4, true);
        }
    }
}
