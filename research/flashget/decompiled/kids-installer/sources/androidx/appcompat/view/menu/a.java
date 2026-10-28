package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.c1;
import androidx.annotation.q0;

/* compiled from: ActionMenuItem.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class a implements m.b {
    private static final int F = 1;
    private static final int G = 2;
    private static final int H = 4;
    private static final int I = 8;
    private static final int J = 16;

    /* renamed from: l, reason: collision with root package name */
    private final int f626l;

    /* renamed from: m, reason: collision with root package name */
    private final int f627m;

    /* renamed from: n, reason: collision with root package name */
    private final int f628n;

    /* renamed from: o, reason: collision with root package name */
    private CharSequence f629o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f630p;

    /* renamed from: q, reason: collision with root package name */
    private Intent f631q;

    /* renamed from: r, reason: collision with root package name */
    private char f632r;

    /* renamed from: t, reason: collision with root package name */
    private char f634t;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f636v;

    /* renamed from: w, reason: collision with root package name */
    private Context f637w;

    /* renamed from: x, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f638x;

    /* renamed from: y, reason: collision with root package name */
    private CharSequence f639y;

    /* renamed from: z, reason: collision with root package name */
    private CharSequence f640z;

    /* renamed from: s, reason: collision with root package name */
    private int f633s = 4096;

    /* renamed from: u, reason: collision with root package name */
    private int f635u = 4096;
    private ColorStateList A = null;
    private PorterDuff.Mode B = null;
    private boolean C = false;
    private boolean D = false;
    private int E = 16;

    public a(Context context, int i5, int i6, int i7, int i8, CharSequence charSequence) {
        this.f637w = context;
        this.f626l = i6;
        this.f627m = i5;
        this.f628n = i8;
        this.f629o = charSequence;
    }

    private void e() {
        Drawable drawable = this.f636v;
        if (drawable != null) {
            if (this.C || this.D) {
                this.f636v = drawable;
                Drawable mutate = drawable.mutate();
                this.f636v = mutate;
                if (this.C) {
                    androidx.core.graphics.drawable.d.o(mutate, this.A);
                }
                if (this.D) {
                    androidx.core.graphics.drawable.d.p(this.f636v, this.B);
                }
            }
        }
    }

    @Override // m.b
    public m.b a(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // m.b
    public androidx.core.view.b b() {
        return null;
    }

    @Override // m.b
    public boolean c() {
        return false;
    }

    @Override // m.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // m.b
    public boolean d() {
        return true;
    }

    @Override // m.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    public boolean f() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f638x;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        Intent intent = this.f631q;
        if (intent == null) {
            return false;
        }
        this.f637w.startActivity(intent);
        return true;
    }

    @Override // m.b, android.view.MenuItem
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public m.b setActionView(int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // m.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // m.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f635u;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f634t;
    }

    @Override // m.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f639y;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f627m;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f636v;
    }

    @Override // m.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.A;
    }

    @Override // m.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.B;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f631q;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f626l;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // m.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f633s;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f632r;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f628n;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f629o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f630p;
        return charSequence != null ? charSequence : this.f629o;
    }

    @Override // m.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f640z;
    }

    @Override // m.b, android.view.MenuItem
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public m.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    public a i(boolean z5) {
        this.E = (z5 ? 4 : 0) | (this.E & (-5));
        return this;
    }

    @Override // m.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.E & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.E & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.E & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.E & 8) == 0;
    }

    @Override // m.b, android.view.MenuItem
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public m.b setShowAsActionFlags(int i5) {
        setShowAsAction(i5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c6) {
        this.f634t = Character.toLowerCase(c6);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z5) {
        this.E = (z5 ? 1 : 0) | (this.E & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z5) {
        this.E = (z5 ? 2 : 0) | (this.E & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z5) {
        this.E = (z5 ? 16 : 0) | (this.E & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f636v = drawable;
        e();
        return this;
    }

    @Override // m.b, android.view.MenuItem
    public MenuItem setIconTintList(@q0 ColorStateList colorStateList) {
        this.A = colorStateList;
        this.C = true;
        e();
        return this;
    }

    @Override // m.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.B = mode;
        this.D = true;
        e();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f631q = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c6) {
        this.f632r = c6;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f638x = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c6, char c7) {
        this.f632r = c6;
        this.f634t = Character.toLowerCase(c7);
        return this;
    }

    @Override // m.b, android.view.MenuItem
    public void setShowAsAction(int i5) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f629o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f630p = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z5) {
        this.E = (this.E & 8) | (z5 ? 0 : 8);
        return this;
    }

    @Override // m.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c6, int i5) {
        this.f634t = Character.toLowerCase(c6);
        this.f635u = KeyEvent.normalizeMetaState(i5);
        return this;
    }

    @Override // m.b, android.view.MenuItem
    public m.b setContentDescription(CharSequence charSequence) {
        this.f639y = charSequence;
        return this;
    }

    @Override // m.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c6, int i5) {
        this.f632r = c6;
        this.f633s = KeyEvent.normalizeMetaState(i5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i5) {
        this.f629o = this.f637w.getResources().getString(i5);
        return this;
    }

    @Override // m.b, android.view.MenuItem
    public m.b setTooltipText(CharSequence charSequence) {
        this.f640z = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i5) {
        this.f636v = androidx.core.content.d.i(this.f637w, i5);
        e();
        return this;
    }

    @Override // m.b, android.view.MenuItem
    public MenuItem setShortcut(char c6, char c7, int i5, int i6) {
        this.f632r = c6;
        this.f633s = KeyEvent.normalizeMetaState(i5);
        this.f634t = Character.toLowerCase(c7);
        this.f635u = KeyEvent.normalizeMetaState(i6);
        return this;
    }
}
