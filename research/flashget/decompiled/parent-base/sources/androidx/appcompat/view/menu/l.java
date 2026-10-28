package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.c1;
import androidx.annotation.x0;
import androidx.core.view.b;
import java.lang.reflect.Method;

/* compiled from: MenuItemWrapperICS.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class l extends androidx.appcompat.view.menu.c implements MenuItem {

    /* renamed from: q, reason: collision with root package name */
    static final String f1278q = "MenuItemWrapper";

    /* renamed from: o, reason: collision with root package name */
    private final c1.b f1279o;

    /* renamed from: p, reason: collision with root package name */
    private Method f1280p;

    /* compiled from: MenuItemWrapperICS.java */
    private class a extends androidx.core.view.b {

        /* renamed from: e, reason: collision with root package name */
        final ActionProvider f1281e;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f1281e = actionProvider;
        }

        @Override // androidx.core.view.b
        public boolean b() {
            return this.f1281e.hasSubMenu();
        }

        @Override // androidx.core.view.b
        public View d() {
            return this.f1281e.onCreateActionView();
        }

        @Override // androidx.core.view.b
        public boolean f() {
            return this.f1281e.onPerformDefaultAction();
        }

        @Override // androidx.core.view.b
        public void g(SubMenu subMenu) {
            this.f1281e.onPrepareSubMenu(l.this.f(subMenu));
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    @x0(16)
    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: g, reason: collision with root package name */
        private b.InterfaceC0438b f1283g;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.b
        public boolean c() {
            return this.f1281e.isVisible();
        }

        @Override // androidx.core.view.b
        public View e(MenuItem menuItem) {
            return this.f1281e.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.b
        public boolean h() {
            return this.f1281e.overridesItemVisibility();
        }

        @Override // androidx.core.view.b
        public void i() {
            this.f1281e.refreshVisibility();
        }

        @Override // androidx.core.view.b
        public void l(b.InterfaceC0438b interfaceC0438b) {
            this.f1283g = interfaceC0438b;
            this.f1281e.setVisibilityListener(interfaceC0438b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z4) {
            b.InterfaceC0438b interfaceC0438b = this.f1283g;
            if (interfaceC0438b != null) {
                interfaceC0438b.onActionProviderVisibilityChanged(z4);
            }
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    static class c extends FrameLayout implements androidx.appcompat.view.c {

        /* renamed from: b, reason: collision with root package name */
        final CollapsibleActionView f1285b;

        /* JADX WARN: Multi-variable type inference failed */
        c(View view) {
            super(view.getContext());
            this.f1285b = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f1285b;
        }

        @Override // androidx.appcompat.view.c
        public void c() {
            this.f1285b.onActionViewExpanded();
        }

        @Override // androidx.appcompat.view.c
        public void j() {
            this.f1285b.onActionViewCollapsed();
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    private class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f1286a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f1286a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f1286a.onMenuItemActionCollapse(l.this.e(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f1286a.onMenuItemActionExpand(l.this.e(menuItem));
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    private class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f1288a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f1288a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f1288a.onMenuItemClick(l.this.e(menuItem));
        }
    }

    public l(Context context, c1.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f1279o = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f1279o.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f1279o.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        androidx.core.view.b a5 = this.f1279o.a();
        if (a5 instanceof a) {
            return ((a) a5).f1281e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f1279o.getActionView();
        return actionView instanceof c ? ((c) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1279o.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1279o.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1279o.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1279o.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f1279o.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1279o.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1279o.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1279o.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f1279o.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1279o.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1279o.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1279o.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1279o.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return f(this.f1279o.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f1279o.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f1279o.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1279o.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1279o.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f1279o.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f1279o.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f1279o.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f1279o.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f1279o.isVisible();
    }

    public void j(boolean z4) {
        try {
            if (this.f1280p == null) {
                this.f1280p = this.f1279o.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f1280p.invoke(this.f1279o, Boolean.valueOf(z4));
        } catch (Exception unused) {
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f1186l, actionProvider);
        c1.b bVar2 = this.f1279o;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.c(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f1279o.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c5) {
        this.f1279o.setAlphabeticShortcut(c5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z4) {
        this.f1279o.setCheckable(z4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z4) {
        this.f1279o.setChecked(z4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1279o.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z4) {
        this.f1279o.setEnabled(z4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1279o.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1279o.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1279o.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1279o.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c5) {
        this.f1279o.setNumericShortcut(c5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1279o.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1279o.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c5, char c6) {
        this.f1279o.setShortcut(c5, c6);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i4) {
        this.f1279o.setShowAsAction(i4);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i4) {
        this.f1279o.setShowAsActionFlags(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1279o.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1279o.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f1279o.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z4) {
        return this.f1279o.setVisible(z4);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c5, int i4) {
        this.f1279o.setAlphabeticShortcut(c5, i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i4) {
        this.f1279o.setIcon(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c5, int i4) {
        this.f1279o.setNumericShortcut(c5, i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c5, char c6, int i4, int i5) {
        this.f1279o.setShortcut(c5, c6, i4, i5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i4) {
        this.f1279o.setTitle(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i4) {
        this.f1279o.setActionView(i4);
        View actionView = this.f1279o.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f1279o.setActionView(new c(actionView));
        }
        return this;
    }
}
