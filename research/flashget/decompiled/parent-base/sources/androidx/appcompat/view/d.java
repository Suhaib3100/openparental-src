package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import androidx.annotation.h1;
import androidx.annotation.u;
import androidx.annotation.x0;
import d.a;

/* compiled from: ContextThemeWrapper.java */
/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    private static Configuration f1057f;

    /* renamed from: a, reason: collision with root package name */
    private int f1058a;

    /* renamed from: b, reason: collision with root package name */
    private Resources.Theme f1059b;

    /* renamed from: c, reason: collision with root package name */
    private LayoutInflater f1060c;

    /* renamed from: d, reason: collision with root package name */
    private Configuration f1061d;

    /* renamed from: e, reason: collision with root package name */
    private Resources f1062e;

    /* compiled from: ContextThemeWrapper.java */
    @x0(17)
    static class a {
        private a() {
        }

        @u
        static Context a(d dVar, Configuration configuration) {
            return dVar.createConfigurationContext(configuration);
        }
    }

    public d() {
        super(null);
    }

    private Resources b() {
        if (this.f1062e == null) {
            Configuration configuration = this.f1061d;
            if (configuration == null || (Build.VERSION.SDK_INT >= 26 && e(configuration))) {
                this.f1062e = super.getResources();
            } else {
                this.f1062e = a.a(this, this.f1061d).getResources();
            }
        }
        return this.f1062e;
    }

    private void d() {
        boolean z4 = this.f1059b == null;
        if (z4) {
            this.f1059b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1059b.setTo(theme);
            }
        }
        f(this.f1059b, this.f1058a, z4);
    }

    @x0(26)
    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f1057f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f1057f = configuration2;
        }
        return configuration.equals(f1057f);
    }

    public void a(Configuration configuration) {
        if (this.f1062e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f1061d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f1061d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f1058a;
    }

    protected void f(Resources.Theme theme, int i4, boolean z4) {
        theme.applyStyle(i4, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f1060c == null) {
            this.f1060c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1060c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1059b;
        if (theme != null) {
            return theme;
        }
        if (this.f1058a == 0) {
            this.f1058a = a.l.f73368c4;
        }
        d();
        return this.f1059b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i4) {
        if (this.f1058a != i4) {
            this.f1058a = i4;
            d();
        }
    }

    public d(Context context, @h1 int i4) {
        super(context);
        this.f1058a = i4;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f1059b = theme;
    }
}
