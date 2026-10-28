package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.c1;
import androidx.annotation.q0;
import androidx.appcompat.view.menu.o;
import androidx.core.view.b;
import d.a;

/* compiled from: MenuItemImpl.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class j implements m.b {
    private static final String Q = "MenuItemImpl";
    private static final int R = 3;
    private static final int S = 1;
    private static final int T = 2;
    private static final int U = 4;
    private static final int V = 8;
    private static final int W = 16;
    private static final int X = 32;
    static final int Y = 0;
    private Runnable A;
    private MenuItem.OnMenuItemClickListener B;
    private CharSequence C;
    private CharSequence D;
    private int K;
    private View L;
    private androidx.core.view.b M;
    private MenuItem.OnActionExpandListener N;
    private ContextMenu.ContextMenuInfo P;

    /* renamed from: l, reason: collision with root package name */
    private final int f714l;

    /* renamed from: m, reason: collision with root package name */
    private final int f715m;

    /* renamed from: n, reason: collision with root package name */
    private final int f716n;

    /* renamed from: o, reason: collision with root package name */
    private final int f717o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f718p;

    /* renamed from: q, reason: collision with root package name */
    private CharSequence f719q;

    /* renamed from: r, reason: collision with root package name */
    private Intent f720r;

    /* renamed from: s, reason: collision with root package name */
    private char f721s;

    /* renamed from: u, reason: collision with root package name */
    private char f723u;

    /* renamed from: w, reason: collision with root package name */
    private Drawable f725w;

    /* renamed from: y, reason: collision with root package name */
    g f727y;

    /* renamed from: z, reason: collision with root package name */
    private t f728z;

    /* renamed from: t, reason: collision with root package name */
    private int f722t = 4096;

    /* renamed from: v, reason: collision with root package name */
    private int f724v = 4096;

    /* renamed from: x, reason: collision with root package name */
    private int f726x = 0;
    private ColorStateList E = null;
    private PorterDuff.Mode F = null;
    private boolean G = false;
    private boolean H = false;
    private boolean I = false;
    private int J = 16;
    private boolean O = false;

    /* compiled from: MenuItemImpl.java */
    class a implements b.InterfaceC0056b {
        a() {
        }

        @Override // androidx.core.view.b.InterfaceC0056b
        public void onActionProviderVisibilityChanged(boolean z5) {
            j jVar = j.this;
            jVar.f727y.M(jVar);
        }
    }

    j(g gVar, int i5, int i6, int i7, int i8, CharSequence charSequence, int i9) {
        this.f727y = gVar;
        this.f714l = i6;
        this.f715m = i5;
        this.f716n = i7;
        this.f717o = i8;
        this.f718p = charSequence;
        this.K = i9;
    }

    private static void f(StringBuilder sb, int i5, int i6, String str) {
        if ((i5 & i6) == i6) {
            sb.append(str);
        }
    }

    private Drawable g(Drawable drawable) {
        if (drawable != null && this.I && (this.G || this.H)) {
            drawable = drawable.mutate();
            if (this.G) {
                androidx.core.graphics.drawable.d.o(drawable, this.E);
            }
            if (this.H) {
                androidx.core.graphics.drawable.d.p(drawable, this.F);
            }
            this.I = false;
        }
        return drawable;
    }

    public void A(t tVar) {
        this.f728z = tVar;
        tVar.setHeaderTitle(this.f718p);
    }

    boolean B(boolean z5) {
        int i5 = this.J;
        int i6 = (z5 ? 0 : 8) | (i5 & (-9));
        this.J = i6;
        return i5 != i6;
    }

    public boolean C() {
        return this.f727y.D();
    }

    boolean D() {
        return this.f727y.K() && j() != 0;
    }

    public boolean E() {
        return (this.K & 4) == 4;
    }

    @Override // m.b
    public m.b a(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.M;
        if (bVar2 != null) {
            bVar2.j();
        }
        this.L = null;
        this.M = bVar;
        this.f727y.N(true);
        androidx.core.view.b bVar3 = this.M;
        if (bVar3 != null) {
            bVar3.l(new a());
        }
        return this;
    }

    @Override // m.b
    public androidx.core.view.b b() {
        return this.M;
    }

    @Override // m.b
    public boolean c() {
        return (d() || q()) ? false : true;
    }

    @Override // m.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.K & 8) == 0) {
            return false;
        }
        if (this.L == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.N;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f727y.g(this);
        }
        return false;
    }

    @Override // m.b
    public boolean d() {
        return (this.K & 2) == 2;
    }

    public void e() {
        this.f727y.L(this);
    }

    @Override // m.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!m()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.N;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f727y.n(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // m.b, android.view.MenuItem
    public View getActionView() {
        View view = this.L;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.M;
        if (bVar == null) {
            return null;
        }
        View e6 = bVar.e(this);
        this.L = e6;
        return e6;
    }

    @Override // m.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f724v;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f723u;
    }

    @Override // m.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f715m;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f725w;
        if (drawable != null) {
            return g(drawable);
        }
        if (this.f726x == 0) {
            return null;
        }
        Drawable d6 = androidx.appcompat.content.res.a.d(this.f727y.x(), this.f726x);
        this.f726x = 0;
        this.f725w = d6;
        return g(d6);
    }

    @Override // m.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.E;
    }

    @Override // m.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.F;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f720r;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f714l;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.P;
    }

    @Override // m.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f722t;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f721s;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f716n;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f728z;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f718p;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f719q;
        return charSequence != null ? charSequence : this.f718p;
    }

    @Override // m.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.D;
    }

    Runnable h() {
        return this.A;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f728z != null;
    }

    public int i() {
        return this.f717o;
    }

    @Override // m.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.O;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.J & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.J & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.J & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.b bVar = this.M;
        return (bVar == null || !bVar.h()) ? (this.J & 8) == 0 : (this.J & 8) == 0 && this.M.c();
    }

    char j() {
        return this.f727y.J() ? this.f723u : this.f721s;
    }

    String k() {
        char j5 = j();
        if (j5 == 0) {
            return "";
        }
        Resources resources = this.f727y.x().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f727y.x()).hasPermanentMenuKey()) {
            sb.append(resources.getString(a.l.f21987r));
        }
        int i5 = this.f727y.J() ? this.f724v : this.f722t;
        f(sb, i5, 65536, resources.getString(a.l.f21983n));
        f(sb, i5, 4096, resources.getString(a.l.f21979j));
        f(sb, i5, 2, resources.getString(a.l.f21978i));
        f(sb, i5, 1, resources.getString(a.l.f21984o));
        f(sb, i5, 4, resources.getString(a.l.f21986q));
        f(sb, i5, 8, resources.getString(a.l.f21982m));
        if (j5 == '\b') {
            sb.append(resources.getString(a.l.f21980k));
        } else if (j5 == '\n') {
            sb.append(resources.getString(a.l.f21981l));
        } else if (j5 != ' ') {
            sb.append(j5);
        } else {
            sb.append(resources.getString(a.l.f21985p));
        }
        return sb.toString();
    }

    CharSequence l(o.a aVar) {
        return (aVar == null || !aVar.g()) ? this.f718p : getTitleCondensed();
    }

    public boolean m() {
        androidx.core.view.b bVar;
        if ((this.K & 8) == 0) {
            return false;
        }
        if (this.L == null && (bVar = this.M) != null) {
            this.L = bVar.e(this);
        }
        return this.L != null;
    }

    public boolean n() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.B;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        g gVar = this.f727y;
        if (gVar.i(gVar, this)) {
            return true;
        }
        Runnable runnable = this.A;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f720r != null) {
            try {
                this.f727y.x().startActivity(this.f720r);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        androidx.core.view.b bVar = this.M;
        return bVar != null && bVar.f();
    }

    public boolean o() {
        return (this.J & 32) == 32;
    }

    public boolean p() {
        return (this.J & 4) != 0;
    }

    public boolean q() {
        return (this.K & 1) == 1;
    }

    @Override // m.b, android.view.MenuItem
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public m.b setActionView(int i5) {
        Context x5 = this.f727y.x();
        setActionView(LayoutInflater.from(x5).inflate(i5, (ViewGroup) new LinearLayout(x5), false));
        return this;
    }

    @Override // m.b, android.view.MenuItem
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public m.b setActionView(View view) {
        int i5;
        this.L = view;
        this.M = null;
        if (view != null && view.getId() == -1 && (i5 = this.f714l) > 0) {
            view.setId(i5);
        }
        this.f727y.L(this);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c6) {
        if (this.f723u == c6) {
            return this;
        }
        this.f723u = Character.toLowerCase(c6);
        this.f727y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z5) {
        int i5 = this.J;
        int i6 = (z5 ? 1 : 0) | (i5 & (-2));
        this.J = i6;
        if (i5 != i6) {
            this.f727y.N(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z5) {
        if ((this.J & 4) != 0) {
            this.f727y.a0(this);
        } else {
            v(z5);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z5) {
        if (z5) {
            this.J |= 16;
        } else {
            this.J &= -17;
        }
        this.f727y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f726x = 0;
        this.f725w = drawable;
        this.I = true;
        this.f727y.N(false);
        return this;
    }

    @Override // m.b, android.view.MenuItem
    public MenuItem setIconTintList(@q0 ColorStateList colorStateList) {
        this.E = colorStateList;
        this.G = true;
        this.I = true;
        this.f727y.N(false);
        return this;
    }

    @Override // m.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.F = mode;
        this.H = true;
        this.I = true;
        this.f727y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f720r = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c6) {
        if (this.f721s == c6) {
            return this;
        }
        this.f721s = c6;
        this.f727y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.N = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.B = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c6, char c7) {
        this.f721s = c6;
        this.f723u = Character.toLowerCase(c7);
        this.f727y.N(false);
        return this;
    }

    @Override // m.b, android.view.MenuItem
    public void setShowAsAction(int i5) {
        int i6 = i5 & 3;
        if (i6 != 0 && i6 != 1 && i6 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.K = i5;
        this.f727y.L(this);
    }

    @Override // m.b, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i5) {
        setShowAsAction(i5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f718p = charSequence;
        this.f727y.N(false);
        t tVar = this.f728z;
        if (tVar != null) {
            tVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f719q = charSequence;
        this.f727y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z5) {
        if (B(z5)) {
            this.f727y.M(this);
        }
        return this;
    }

    public void t(boolean z5) {
        this.O = z5;
        this.f727y.N(false);
    }

    public String toString() {
        CharSequence charSequence = this.f718p;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public MenuItem u(Runnable runnable) {
        this.A = runnable;
        return this;
    }

    void v(boolean z5) {
        int i5 = this.J;
        int i6 = (z5 ? 2 : 0) | (i5 & (-3));
        this.J = i6;
        if (i5 != i6) {
            this.f727y.N(false);
        }
    }

    public void w(boolean z5) {
        this.J = (z5 ? 4 : 0) | (this.J & (-5));
    }

    public void x(boolean z5) {
        if (z5) {
            this.J |= 32;
        } else {
            this.J &= -33;
        }
    }

    void y(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.P = contextMenuInfo;
    }

    public m.b z(int i5) {
        setShowAsAction(i5);
        return this;
    }

    @Override // m.b, android.view.MenuItem
    public m.b setContentDescription(CharSequence charSequence) {
        this.C = charSequence;
        this.f727y.N(false);
        return this;
    }

    @Override // m.b, android.view.MenuItem
    public m.b setTooltipText(CharSequence charSequence) {
        this.D = charSequence;
        this.f727y.N(false);
        return this;
    }

    @Override // m.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c6, int i5) {
        if (this.f723u == c6 && this.f724v == i5) {
            return this;
        }
        this.f723u = Character.toLowerCase(c6);
        this.f724v = KeyEvent.normalizeMetaState(i5);
        this.f727y.N(false);
        return this;
    }

    @Override // m.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c6, int i5) {
        if (this.f721s == c6 && this.f722t == i5) {
            return this;
        }
        this.f721s = c6;
        this.f722t = KeyEvent.normalizeMetaState(i5);
        this.f727y.N(false);
        return this;
    }

    @Override // m.b, android.view.MenuItem
    public MenuItem setShortcut(char c6, char c7, int i5, int i6) {
        this.f721s = c6;
        this.f722t = KeyEvent.normalizeMetaState(i5);
        this.f723u = Character.toLowerCase(c7);
        this.f724v = KeyEvent.normalizeMetaState(i6);
        this.f727y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i5) {
        this.f725w = null;
        this.f726x = i5;
        this.I = true;
        this.f727y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i5) {
        return setTitle(this.f727y.x().getString(i5));
    }
}
