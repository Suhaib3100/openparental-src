package com.lxj.xpopup.core;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.lxj.xpopup.b;
import com.lxj.xpopup.c;
import com.lxj.xpopup.util.KeyboardUtils;
import com.lxj.xpopup.util.XPermission;
import fb.e;

/* compiled from: FullScreenDialog.java */
/* loaded from: classes6.dex */
public class a extends Dialog {

    /* renamed from: b, reason: collision with root package name */
    BasePopupView f69622b;

    public a(@o0 Context context) {
        super(context, b.n.Tc);
    }

    private int a() {
        int i4 = this.f69622b.f69527b.f69644v;
        return i4 == 0 ? c.c() : i4;
    }

    private String b(int id2) {
        try {
            return getContext().getResources().getResourceEntryName(id2);
        } catch (Exception unused) {
            return "";
        }
    }

    private void f() {
        if (!this.f69622b.f69527b.f69642t.booleanValue()) {
            getWindow().getDecorView().setSystemUiVisibility(((ViewGroup) getWindow().getDecorView()).getSystemUiVisibility() | 1284);
            return;
        }
        int i4 = this.f69622b.f69527b.f69646x;
        if (i4 == 0) {
            i4 = c.f69509f;
        }
        if (i4 != 0) {
            View decorView = getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(i4 > 0 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
            getWindow().setStatusBarColor(this.f69622b.f69527b.P);
        }
    }

    public void c() {
        ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            int id2 = childAt.getId();
            if (id2 != -1) {
                if (ProtectedSandApp.s("ភ\u0001").equals(b(id2))) {
                    childAt.setVisibility(4);
                }
            }
        }
        viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() | 4610);
    }

    public a d(BasePopupView view) {
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        this.f69622b = view;
        return this;
    }

    public void e() {
        if (!this.f69622b.f69527b.f69643u.booleanValue()) {
            c();
        }
        int i4 = this.f69622b.f69527b.f69645w;
        if (i4 == 0) {
            i4 = c.f69510g;
        }
        if (Build.VERSION.SDK_INT < 26 || i4 == 0) {
            return;
        }
        View decorView = getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(i4 > 0 ? systemUiVisibility | 16 : systemUiVisibility & (-17));
    }

    public void g(final int bits, boolean on) {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (on) {
            attributes.flags = bits | attributes.flags;
        } else {
            attributes.flags = (~bits) & attributes.flags;
        }
        getWindow().setAttributes(attributes);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        BasePopupView basePopupView;
        b bVar;
        super.onCreate(savedInstanceState);
        if (getWindow() == null || (basePopupView = this.f69622b) == null || (bVar = basePopupView.f69527b) == null) {
            return;
        }
        if (bVar.H && XPermission.p(getContext(), new String[0]).w()) {
            if (Build.VERSION.SDK_INT >= 26) {
                getWindow().setType(2038);
            } else {
                getWindow().setType(2003);
            }
        }
        if (this.f69622b.f69527b.M) {
            getWindow().addFlags(128);
        }
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        getWindow().getAttributes().format = -2;
        getWindow().setFlags(16777216, 16777216);
        getWindow().setSoftInputMode(16);
        getWindow().setLayout(-1, -1);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        getWindow().setBackgroundDrawable(null);
        g(201326592, false);
        getWindow().setStatusBarColor(0);
        int a5 = a();
        if (a5 != 0) {
            getWindow().setNavigationBarColor(a5);
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        b bVar2 = this.f69622b.f69527b;
        if (!bVar2.C) {
            g(bVar2.S.booleanValue() ? 131080 : 8, true);
        } else if (bVar2.S.booleanValue()) {
            g(131072, true);
        }
        f();
        e();
        setContentView(this.f69622b);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        BasePopupView basePopupView;
        super.onWindowFocusChanged(hasFocus);
        f();
        e();
        if (hasFocus && (basePopupView = this.f69622b) != null && basePopupView.f69536k && basePopupView.f69532g == e.Show) {
            basePopupView.B();
            KeyboardUtils.g(this.f69622b);
        }
    }
}
