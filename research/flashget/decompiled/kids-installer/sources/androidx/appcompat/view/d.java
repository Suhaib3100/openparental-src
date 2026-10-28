package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.annotation.h1;
import d.a;

/* compiled from: ContextThemeWrapper.java */
/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    private int f535a;

    /* renamed from: b, reason: collision with root package name */
    private Resources.Theme f536b;

    /* renamed from: c, reason: collision with root package name */
    private LayoutInflater f537c;

    /* renamed from: d, reason: collision with root package name */
    private Configuration f538d;

    /* renamed from: e, reason: collision with root package name */
    private Resources f539e;

    public d() {
        super(null);
    }

    private Resources b() {
        if (this.f539e == null) {
            Configuration configuration = this.f538d;
            if (configuration == null) {
                this.f539e = super.getResources();
            } else {
                this.f539e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f539e;
    }

    private void d() {
        boolean z5 = this.f536b == null;
        if (z5) {
            this.f536b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f536b.setTo(theme);
            }
        }
        e(this.f536b, this.f535a, z5);
    }

    public void a(Configuration configuration) {
        if (this.f539e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f538d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f538d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f535a;
    }

    protected void e(Resources.Theme theme, int i5, boolean z5) {
        theme.applyStyle(i5, true);
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
        if (this.f537c == null) {
            this.f537c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f537c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f536b;
        if (theme != null) {
            return theme;
        }
        if (this.f535a == 0) {
            this.f535a = a.m.f22049h4;
        }
        d();
        return this.f536b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i5) {
        if (this.f535a != i5) {
            this.f535a = i5;
            d();
        }
    }

    public d(Context context, @h1 int i5) {
        super(context);
        this.f535a = i5;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f536b = theme;
    }
}
