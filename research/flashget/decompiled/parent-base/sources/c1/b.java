package c1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: SupportMenuItem.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public interface b extends MenuItem {

    /* renamed from: g, reason: collision with root package name */
    public static final int f38451g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f38452h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f38453i = 2;

    /* renamed from: j, reason: collision with root package name */
    public static final int f38454j = 4;

    /* renamed from: k, reason: collision with root package name */
    public static final int f38455k = 8;

    @q0
    androidx.core.view.b a();

    boolean b();

    @o0
    b c(@q0 androidx.core.view.b bVar);

    @Override // android.view.MenuItem
    boolean collapseActionView();

    boolean d();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    @q0
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    @q0
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    @q0
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    @q0
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    @q0
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    @o0
    MenuItem setActionView(int i4);

    @Override // android.view.MenuItem
    @o0
    MenuItem setActionView(@q0 View view);

    @Override // android.view.MenuItem
    @o0
    MenuItem setAlphabeticShortcut(char c5, int i4);

    @Override // android.view.MenuItem
    @o0
    b setContentDescription(@q0 CharSequence charSequence);

    @Override // android.view.MenuItem
    @o0
    MenuItem setIconTintList(@q0 ColorStateList colorStateList);

    @Override // android.view.MenuItem
    @o0
    MenuItem setIconTintMode(@q0 PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    @o0
    MenuItem setNumericShortcut(char c5, int i4);

    @Override // android.view.MenuItem
    @o0
    MenuItem setShortcut(char c5, char c6, int i4, int i5);

    @Override // android.view.MenuItem
    void setShowAsAction(int i4);

    @Override // android.view.MenuItem
    @o0
    MenuItem setShowAsActionFlags(int i4);

    @Override // android.view.MenuItem
    @o0
    b setTooltipText(@q0 CharSequence charSequence);
}
