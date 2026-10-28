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
public class w0 extends ContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f1401c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static ArrayList<WeakReference<w0>> f1402d;

    /* renamed from: a, reason: collision with root package name */
    private final Resources f1403a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources.Theme f1404b;

    private w0(@androidx.annotation.o0 Context context) {
        super(context);
        if (!f1.c()) {
            this.f1403a = new y0(this, context.getResources());
            this.f1404b = null;
            return;
        }
        f1 f1Var = new f1(this, context.getResources());
        this.f1403a = f1Var;
        Resources.Theme newTheme = f1Var.newTheme();
        this.f1404b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    private static boolean a(@androidx.annotation.o0 Context context) {
        return ((context instanceof w0) || (context.getResources() instanceof y0) || (context.getResources() instanceof f1) || !f1.c()) ? false : true;
    }

    public static Context b(@androidx.annotation.o0 Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f1401c) {
            ArrayList<WeakReference<w0>> arrayList = f1402d;
            if (arrayList == null) {
                f1402d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<w0> weakReference = f1402d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1402d.remove(size);
                    }
                }
                for (int size2 = f1402d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<w0> weakReference2 = f1402d.get(size2);
                    w0 w0Var = weakReference2 != null ? weakReference2.get() : null;
                    if (w0Var != null && w0Var.getBaseContext() == context) {
                        return w0Var;
                    }
                }
            }
            w0 w0Var2 = new w0(context);
            f1402d.add(new WeakReference<>(w0Var2));
            return w0Var2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1403a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1403a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1404b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i5) {
        Resources.Theme theme = this.f1404b;
        if (theme == null) {
            super.setTheme(i5);
        } else {
            theme.applyStyle(i5, true);
        }
    }
}
