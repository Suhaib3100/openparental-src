package com.lxj.xpopup.core;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.o0;
import b3.e;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.lxj.xpopup.b;
import com.lxj.xpopup.c;
import com.lxj.xpopup.util.KeyboardUtils;
import com.lxj.xpopup.util.XPermission;

/* compiled from: FullScreenDialog.java */
/* loaded from: classes5.dex */
public class a extends Dialog {

    /* renamed from: o, reason: collision with root package name */
    BasePopupView f21148o;

    public a(@o0 Context context) {
        super(context, b.n.Tc);
    }

    private int a() {
        int i5 = this.f21148o.f21074o.f21170v;
        return i5 == 0 ? c.c() : i5;
    }

    private String b(int id) {
        try {
            return getContext().getResources().getResourceEntryName(id);
        } catch (Exception unused) {
            return "";
        }
    }

    private void f() {
        if (!this.f21148o.f21074o.f21168t.booleanValue()) {
            getWindow().getDecorView().setSystemUiVisibility(((ViewGroup) getWindow().getDecorView()).getSystemUiVisibility() | 1284);
            return;
        }
        int i5 = this.f21148o.f21074o.f21172x;
        if (i5 == 0) {
            i5 = c.f21061f;
        }
        if (i5 != 0) {
            View decorView = getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(i5 > 0 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
            getWindow().setStatusBarColor(this.f21148o.f21074o.P);
        }
    }

    public void c() {
        ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            int id = childAt.getId();
            if (id != -1) {
                if (ProtectedSandApp.s("㔇").equals(b(id))) {
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
        this.f21148o = view;
        return this;
    }

    public void e() {
        if (!this.f21148o.f21074o.f21169u.booleanValue()) {
            c();
        }
        int i5 = this.f21148o.f21074o.f21171w;
        if (i5 == 0) {
            i5 = c.f21062g;
        }
        if (Build.VERSION.SDK_INT < 26 || i5 == 0) {
            return;
        }
        View decorView = getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(i5 > 0 ? systemUiVisibility | 16 : systemUiVisibility & (-17));
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
        if (getWindow() == null || (basePopupView = this.f21148o) == null || (bVar = basePopupView.f21074o) == null) {
            return;
        }
        if (bVar.H && XPermission.p(getContext(), new String[0]).w()) {
            if (Build.VERSION.SDK_INT >= 26) {
                getWindow().setType(2038);
            } else {
                getWindow().setType(2003);
            }
        }
        if (this.f21148o.f21074o.M) {
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
        int a6 = a();
        if (a6 != 0) {
            getWindow().setNavigationBarColor(a6);
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        b bVar2 = this.f21148o.f21074o;
        if (!bVar2.C) {
            g(bVar2.S.booleanValue() ? 131080 : 8, true);
        } else if (bVar2.S.booleanValue()) {
            g(131072, true);
        }
        f();
        e();
        setContentView(this.f21148o);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        BasePopupView basePopupView;
        super.onWindowFocusChanged(hasFocus);
        f();
        e();
        if (hasFocus && (basePopupView = this.f21148o) != null && basePopupView.f21083x && basePopupView.f21079t == e.Show) {
            basePopupView.F();
            KeyboardUtils.g(this.f21148o);
        }
    }
}
