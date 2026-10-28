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
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.view.menu.p;
import androidx.core.view.b;
import d.a;

/* compiled from: MenuItemImpl.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class k implements c1.b {
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
    private final int f1262l;

    /* renamed from: m, reason: collision with root package name */
    private final int f1263m;

    /* renamed from: n, reason: collision with root package name */
    private final int f1264n;

    /* renamed from: o, reason: collision with root package name */
    private final int f1265o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f1266p;

    /* renamed from: q, reason: collision with root package name */
    private CharSequence f1267q;

    /* renamed from: r, reason: collision with root package name */
    private Intent f1268r;

    /* renamed from: s, reason: collision with root package name */
    private char f1269s;

    /* renamed from: u, reason: collision with root package name */
    private char f1271u;

    /* renamed from: w, reason: collision with root package name */
    private Drawable f1273w;

    /* renamed from: y, reason: collision with root package name */
    h f1275y;

    /* renamed from: z, reason: collision with root package name */
    private t f1276z;

    /* renamed from: t, reason: collision with root package name */
    private int f1270t = 4096;

    /* renamed from: v, reason: collision with root package name */
    private int f1272v = 4096;

    /* renamed from: x, reason: collision with root package name */
    private int f1274x = 0;
    private ColorStateList E = null;
    private PorterDuff.Mode F = null;
    private boolean G = false;
    private boolean H = false;
    private boolean I = false;
    private int J = 16;
    private boolean O = false;

    /* compiled from: MenuItemImpl.java */
    class a implements b.InterfaceC0438b {
        a() {
        }

        @Override // androidx.core.view.b.InterfaceC0438b
        public void onActionProviderVisibilityChanged(boolean z4) {
            k kVar = k.this;
            kVar.f1275y.M(kVar);
        }
    }

    k(h hVar, int i4, int i5, int i6, int i7, CharSequence charSequence, int i10) {
        this.f1275y = hVar;
        this.f1262l = i5;
        this.f1263m = i4;
        this.f1264n = i6;
        this.f1265o = i7;
        this.f1266p = charSequence;
        this.K = i10;
    }

    private static void f(StringBuilder sb, int i4, int i5, String str) {
        if ((i4 & i5) == i5) {
            sb.append(str);
        }
    }

    private Drawable g(Drawable drawable) {
        if (drawable != null && this.I && (this.G || this.H)) {
            drawable = drawable.mutate();
            if (this.G) {
                drawable.setTintList(this.E);
            }
            if (this.H) {
                drawable.setTintMode(this.F);
            }
            this.I = false;
        }
        return drawable;
    }

    public void A(t tVar) {
        this.f1276z = tVar;
        tVar.setHeaderTitle(this.f1266p);
    }

    boolean B(boolean z4) {
        int i4 = this.J;
        int i5 = (z4 ? 0 : 8) | (i4 & (-9));
        this.J = i5;
        return i4 != i5;
    }

    public boolean C() {
        return this.f1275y.D();
    }

    boolean D() {
        return this.f1275y.K() && j() != 0;
    }

    public boolean E() {
        return (this.K & 4) == 4;
    }

    @Override // c1.b
    public androidx.core.view.b a() {
        return this.M;
    }

    @Override // c1.b
    public boolean b() {
        return (this.K & 2) == 2;
    }

    @Override // c1.b
    @o0
    public c1.b c(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.M;
        if (bVar2 != null) {
            bVar2.j();
        }
        this.L = null;
        this.M = bVar;
        this.f1275y.N(true);
        androidx.core.view.b bVar3 = this.M;
        if (bVar3 != null) {
            bVar3.l(new a());
        }
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.K & 8) == 0) {
            return false;
        }
        if (this.L == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.N;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1275y.g(this);
        }
        return false;
    }

    @Override // c1.b
    public boolean d() {
        return (b() || q()) ? false : true;
    }

    public void e() {
        this.f1275y.L(this);
    }

    @Override // c1.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!m()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.N;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1275y.n(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // c1.b, android.view.MenuItem
    public View getActionView() {
        View view = this.L;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.M;
        if (bVar == null) {
            return null;
        }
        View e4 = bVar.e(this);
        this.L = e4;
        return e4;
    }

    @Override // c1.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1272v;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1271u;
    }

    @Override // c1.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1263m;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f1273w;
        if (drawable != null) {
            return g(drawable);
        }
        if (this.f1274x == 0) {
            return null;
        }
        Drawable b5 = e.a.b(this.f1275y.x(), this.f1274x);
        this.f1274x = 0;
        this.f1273w = b5;
        return g(b5);
    }

    @Override // c1.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.E;
    }

    @Override // c1.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.F;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1268r;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1262l;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.P;
    }

    @Override // c1.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1270t;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1269s;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1264n;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f1276z;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1266p;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1267q;
        return charSequence != null ? charSequence : this.f1266p;
    }

    @Override // c1.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.D;
    }

    Runnable h() {
        return this.A;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1276z != null;
    }

    public int i() {
        return this.f1265o;
    }

    @Override // c1.b, android.view.MenuItem
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
        return this.f1275y.J() ? this.f1271u : this.f1269s;
    }

    String k() {
        char j4 = j();
        if (j4 == 0) {
            return "";
        }
        Resources resources = this.f1275y.x().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f1275y.x()).hasPermanentMenuKey()) {
            sb.append(resources.getString(a.k.f73342r));
        }
        int i4 = this.f1275y.J() ? this.f1272v : this.f1270t;
        f(sb, i4, 65536, resources.getString(a.k.f73338n));
        f(sb, i4, 4096, resources.getString(a.k.f73334j));
        f(sb, i4, 2, resources.getString(a.k.f73333i));
        f(sb, i4, 1, resources.getString(a.k.f73339o));
        f(sb, i4, 4, resources.getString(a.k.f73341q));
        f(sb, i4, 8, resources.getString(a.k.f73337m));
        if (j4 == '\b') {
            sb.append(resources.getString(a.k.f73335k));
        } else if (j4 == '\n') {
            sb.append(resources.getString(a.k.f73336l));
        } else if (j4 != ' ') {
            sb.append(j4);
        } else {
            sb.append(resources.getString(a.k.f73340p));
        }
        return sb.toString();
    }

    CharSequence l(p.a aVar) {
        return (aVar == null || !aVar.h()) ? this.f1266p : getTitleCondensed();
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
        h hVar = this.f1275y;
        if (hVar.i(hVar, this)) {
            return true;
        }
        Runnable runnable = this.A;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1268r != null) {
            try {
                this.f1275y.x().startActivity(this.f1268r);
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

    @Override // c1.b, android.view.MenuItem
    @o0
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public c1.b setActionView(int i4) {
        Context x4 = this.f1275y.x();
        setActionView(LayoutInflater.from(x4).inflate(i4, (ViewGroup) new LinearLayout(x4), false));
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    @o0
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public c1.b setActionView(View view) {
        int i4;
        this.L = view;
        this.M = null;
        if (view != null && view.getId() == -1 && (i4 = this.f1262l) > 0) {
            view.setId(i4);
        }
        this.f1275y.L(this);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c5) {
        if (this.f1271u == c5) {
            return this;
        }
        this.f1271u = Character.toLowerCase(c5);
        this.f1275y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z4) {
        int i4 = this.J;
        int i5 = (z4 ? 1 : 0) | (i4 & (-2));
        this.J = i5;
        if (i4 != i5) {
            this.f1275y.N(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z4) {
        if ((this.J & 4) != 0) {
            this.f1275y.a0(this);
        } else {
            v(z4);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z4) {
        if (z4) {
            this.J |= 16;
        } else {
            this.J &= -17;
        }
        this.f1275y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1274x = 0;
        this.f1273w = drawable;
        this.I = true;
        this.f1275y.N(false);
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    @o0
    public MenuItem setIconTintList(@q0 ColorStateList colorStateList) {
        this.E = colorStateList;
        this.G = true;
        this.I = true;
        this.f1275y.N(false);
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    @o0
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.F = mode;
        this.H = true;
        this.I = true;
        this.f1275y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1268r = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c5) {
        if (this.f1269s == c5) {
            return this;
        }
        this.f1269s = c5;
        this.f1275y.N(false);
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
    public MenuItem setShortcut(char c5, char c6) {
        this.f1269s = c5;
        this.f1271u = Character.toLowerCase(c6);
        this.f1275y.N(false);
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    public void setShowAsAction(int i4) {
        int i5 = i4 & 3;
        if (i5 != 0 && i5 != 1 && i5 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.K = i4;
        this.f1275y.L(this);
    }

    @Override // c1.b, android.view.MenuItem
    @o0
    public MenuItem setShowAsActionFlags(int i4) {
        setShowAsAction(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1266p = charSequence;
        this.f1275y.N(false);
        t tVar = this.f1276z;
        if (tVar != null) {
            tVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1267q = charSequence;
        this.f1275y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z4) {
        if (B(z4)) {
            this.f1275y.M(this);
        }
        return this;
    }

    public void t(boolean z4) {
        this.O = z4;
        this.f1275y.N(false);
    }

    public String toString() {
        CharSequence charSequence = this.f1266p;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public MenuItem u(Runnable runnable) {
        this.A = runnable;
        return this;
    }

    void v(boolean z4) {
        int i4 = this.J;
        int i5 = (z4 ? 2 : 0) | (i4 & (-3));
        this.J = i5;
        if (i4 != i5) {
            this.f1275y.N(false);
        }
    }

    public void w(boolean z4) {
        this.J = (z4 ? 4 : 0) | (this.J & (-5));
    }

    public void x(boolean z4) {
        if (z4) {
            this.J |= 32;
        } else {
            this.J &= -33;
        }
    }

    void y(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.P = contextMenuInfo;
    }

    @o0
    public c1.b z(int i4) {
        setShowAsAction(i4);
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    @o0
    public c1.b setContentDescription(CharSequence charSequence) {
        this.C = charSequence;
        this.f1275y.N(false);
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    @o0
    public c1.b setTooltipText(CharSequence charSequence) {
        this.D = charSequence;
        this.f1275y.N(false);
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    @o0
    public MenuItem setAlphabeticShortcut(char c5, int i4) {
        if (this.f1271u == c5 && this.f1272v == i4) {
            return this;
        }
        this.f1271u = Character.toLowerCase(c5);
        this.f1272v = KeyEvent.normalizeMetaState(i4);
        this.f1275y.N(false);
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    @o0
    public MenuItem setNumericShortcut(char c5, int i4) {
        if (this.f1269s == c5 && this.f1270t == i4) {
            return this;
        }
        this.f1269s = c5;
        this.f1270t = KeyEvent.normalizeMetaState(i4);
        this.f1275y.N(false);
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    @o0
    public MenuItem setShortcut(char c5, char c6, int i4, int i5) {
        this.f1269s = c5;
        this.f1270t = KeyEvent.normalizeMetaState(i4);
        this.f1271u = Character.toLowerCase(c6);
        this.f1272v = KeyEvent.normalizeMetaState(i5);
        this.f1275y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i4) {
        this.f1273w = null;
        this.f1274x = i4;
        this.I = true;
        this.f1275y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i4) {
        return setTitle(this.f1275y.x().getString(i4));
    }
}
