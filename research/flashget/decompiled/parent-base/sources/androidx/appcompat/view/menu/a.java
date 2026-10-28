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
import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: ActionMenuItem.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class a implements c1.b {
    private static final int F = 1;
    private static final int G = 2;
    private static final int H = 4;
    private static final int I = 8;
    private static final int J = 16;

    /* renamed from: l, reason: collision with root package name */
    private final int f1161l;

    /* renamed from: m, reason: collision with root package name */
    private final int f1162m;

    /* renamed from: n, reason: collision with root package name */
    private final int f1163n;

    /* renamed from: o, reason: collision with root package name */
    private CharSequence f1164o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f1165p;

    /* renamed from: q, reason: collision with root package name */
    private Intent f1166q;

    /* renamed from: r, reason: collision with root package name */
    private char f1167r;

    /* renamed from: t, reason: collision with root package name */
    private char f1169t;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f1171v;

    /* renamed from: w, reason: collision with root package name */
    private Context f1172w;

    /* renamed from: x, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f1173x;

    /* renamed from: y, reason: collision with root package name */
    private CharSequence f1174y;

    /* renamed from: z, reason: collision with root package name */
    private CharSequence f1175z;

    /* renamed from: s, reason: collision with root package name */
    private int f1168s = 4096;

    /* renamed from: u, reason: collision with root package name */
    private int f1170u = 4096;
    private ColorStateList A = null;
    private PorterDuff.Mode B = null;
    private boolean C = false;
    private boolean D = false;
    private int E = 16;

    public a(Context context, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        this.f1172w = context;
        this.f1161l = i5;
        this.f1162m = i4;
        this.f1163n = i7;
        this.f1164o = charSequence;
    }

    private void e() {
        Drawable drawable = this.f1171v;
        if (drawable != null) {
            if (this.C || this.D) {
                this.f1171v = drawable;
                Drawable mutate = drawable.mutate();
                this.f1171v = mutate;
                if (this.C) {
                    mutate.setTintList(this.A);
                }
                if (this.D) {
                    this.f1171v.setTintMode(this.B);
                }
            }
        }
    }

    @Override // c1.b
    public androidx.core.view.b a() {
        return null;
    }

    @Override // c1.b
    public boolean b() {
        return true;
    }

    @Override // c1.b
    @o0
    public c1.b c(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // c1.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // c1.b
    public boolean d() {
        return false;
    }

    @Override // c1.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    public boolean f() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1173x;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        Intent intent = this.f1166q;
        if (intent == null) {
            return false;
        }
        this.f1172w.startActivity(intent);
        return true;
    }

    @Override // c1.b, android.view.MenuItem
    @o0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public c1.b setActionView(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // c1.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // c1.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1170u;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1169t;
    }

    @Override // c1.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1174y;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1162m;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f1171v;
    }

    @Override // c1.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.A;
    }

    @Override // c1.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.B;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1166q;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f1161l;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // c1.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1168s;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1167r;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1163n;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f1164o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1165p;
        return charSequence != null ? charSequence : this.f1164o;
    }

    @Override // c1.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1175z;
    }

    @Override // c1.b, android.view.MenuItem
    @o0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public c1.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    public a i(boolean z4) {
        this.E = (z4 ? 4 : 0) | (this.E & (-5));
        return this;
    }

    @Override // c1.b, android.view.MenuItem
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

    @Override // c1.b, android.view.MenuItem
    @o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public c1.b setShowAsActionFlags(int i4) {
        setShowAsAction(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c5) {
        this.f1169t = Character.toLowerCase(c5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z4) {
        this.E = (z4 ? 1 : 0) | (this.E & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z4) {
        this.E = (z4 ? 2 : 0) | (this.E & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z4) {
        this.E = (z4 ? 16 : 0) | (this.E & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1171v = drawable;
        e();
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    @o0
    public MenuItem setIconTintList(@q0 ColorStateList colorStateList) {
        this.A = colorStateList;
        this.C = true;
        e();
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    @o0
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.B = mode;
        this.D = true;
        e();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1166q = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c5) {
        this.f1167r = c5;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1173x = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c5, char c6) {
        this.f1167r = c5;
        this.f1169t = Character.toLowerCase(c6);
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    public void setShowAsAction(int i4) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1164o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1165p = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z4) {
        this.E = (this.E & 8) | (z4 ? 0 : 8);
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    @o0
    public MenuItem setAlphabeticShortcut(char c5, int i4) {
        this.f1169t = Character.toLowerCase(c5);
        this.f1170u = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    @o0
    public c1.b setContentDescription(CharSequence charSequence) {
        this.f1174y = charSequence;
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    @o0
    public MenuItem setNumericShortcut(char c5, int i4) {
        this.f1167r = c5;
        this.f1168s = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i4) {
        this.f1164o = this.f1172w.getResources().getString(i4);
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    @o0
    public c1.b setTooltipText(CharSequence charSequence) {
        this.f1175z = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i4) {
        this.f1171v = androidx.core.content.d.getDrawable(this.f1172w, i4);
        e();
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    @o0
    public MenuItem setShortcut(char c5, char c6, int i4, int i5) {
        this.f1167r = c5;
        this.f1168s = KeyEvent.normalizeMetaState(i4);
        this.f1169t = Character.toLowerCase(c6);
        this.f1170u = KeyEvent.normalizeMetaState(i5);
        return this;
    }
}
