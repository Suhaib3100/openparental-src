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
/* loaded from: classes2.dex */
public class k extends androidx.appcompat.view.menu.c implements MenuItem {

    /* renamed from: q, reason: collision with root package name */
    static final String f730q = "MenuItemWrapper";

    /* renamed from: o, reason: collision with root package name */
    private final m.b f731o;

    /* renamed from: p, reason: collision with root package name */
    private Method f732p;

    /* compiled from: MenuItemWrapperICS.java */
    private class a extends androidx.core.view.b {

        /* renamed from: e, reason: collision with root package name */
        final ActionProvider f733e;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f733e = actionProvider;
        }

        @Override // androidx.core.view.b
        public boolean b() {
            return this.f733e.hasSubMenu();
        }

        @Override // androidx.core.view.b
        public View d() {
            return this.f733e.onCreateActionView();
        }

        @Override // androidx.core.view.b
        public boolean f() {
            return this.f733e.onPerformDefaultAction();
        }

        @Override // androidx.core.view.b
        public void g(SubMenu subMenu) {
            this.f733e.onPrepareSubMenu(k.this.f(subMenu));
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    @x0(16)
    /* loaded from: classes3.dex */
    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: g, reason: collision with root package name */
        private b.InterfaceC0056b f735g;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.b
        public boolean c() {
            return this.f733e.isVisible();
        }

        @Override // androidx.core.view.b
        public View e(MenuItem menuItem) {
            return this.f733e.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.b
        public boolean h() {
            return this.f733e.overridesItemVisibility();
        }

        @Override // androidx.core.view.b
        public void i() {
            this.f733e.refreshVisibility();
        }

        @Override // androidx.core.view.b
        public void l(b.InterfaceC0056b interfaceC0056b) {
            this.f735g = interfaceC0056b;
            this.f733e.setVisibilityListener(interfaceC0056b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z5) {
            b.InterfaceC0056b interfaceC0056b = this.f735g;
            if (interfaceC0056b != null) {
                interfaceC0056b.onActionProviderVisibilityChanged(z5);
            }
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    static class c extends FrameLayout implements androidx.appcompat.view.c {

        /* renamed from: o, reason: collision with root package name */
        final CollapsibleActionView f737o;

        /* JADX WARN: Multi-variable type inference failed */
        c(View view) {
            super(view.getContext());
            this.f737o = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f737o;
        }

        @Override // androidx.appcompat.view.c
        public void onActionViewCollapsed() {
            this.f737o.onActionViewCollapsed();
        }

        @Override // androidx.appcompat.view.c
        public void onActionViewExpanded() {
            this.f737o.onActionViewExpanded();
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* loaded from: classes.dex */
    private class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f738a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f738a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f738a.onMenuItemActionCollapse(k.this.e(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f738a.onMenuItemActionExpand(k.this.e(menuItem));
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* loaded from: classes.dex */
    private class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f740a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f740a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f740a.onMenuItemClick(k.this.e(menuItem));
        }
    }

    public k(Context context, m.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f731o = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f731o.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f731o.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        androidx.core.view.b b6 = this.f731o.b();
        if (b6 instanceof a) {
            return ((a) b6).f733e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f731o.getActionView();
        return actionView instanceof c ? ((c) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f731o.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f731o.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f731o.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f731o.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f731o.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f731o.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f731o.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f731o.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f731o.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f731o.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f731o.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f731o.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f731o.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return f(this.f731o.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f731o.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f731o.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f731o.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f731o.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f731o.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f731o.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f731o.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f731o.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f731o.isVisible();
    }

    public void j(boolean z5) {
        try {
            if (this.f732p == null) {
                this.f732p = this.f731o.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f732p.invoke(this.f731o, Boolean.valueOf(z5));
        } catch (Exception unused) {
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f651l, actionProvider);
        m.b bVar2 = this.f731o;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f731o.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c6) {
        this.f731o.setAlphabeticShortcut(c6);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z5) {
        this.f731o.setCheckable(z5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z5) {
        this.f731o.setChecked(z5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f731o.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z5) {
        this.f731o.setEnabled(z5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f731o.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f731o.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f731o.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f731o.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c6) {
        this.f731o.setNumericShortcut(c6);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f731o.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f731o.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c6, char c7) {
        this.f731o.setShortcut(c6, c7);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i5) {
        this.f731o.setShowAsAction(i5);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i5) {
        this.f731o.setShowAsActionFlags(i5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f731o.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f731o.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f731o.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z5) {
        return this.f731o.setVisible(z5);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c6, int i5) {
        this.f731o.setAlphabeticShortcut(c6, i5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i5) {
        this.f731o.setIcon(i5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c6, int i5) {
        this.f731o.setNumericShortcut(c6, i5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c6, char c7, int i5, int i6) {
        this.f731o.setShortcut(c6, c7, i5, i6);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i5) {
        this.f731o.setTitle(i5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i5) {
        this.f731o.setActionView(i5);
        View actionView = this.f731o.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f731o.setActionView(new c(actionView));
        }
        return this;
    }
}
