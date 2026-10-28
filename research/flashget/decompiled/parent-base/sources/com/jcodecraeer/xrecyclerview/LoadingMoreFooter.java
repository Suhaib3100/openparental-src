package com.jcodecraeer.xrecyclerview;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.jcodecraeer.xrecyclerview.g;
import com.jcodecraeer.xrecyclerview.progressindicator.AVLoadingIndicatorView;

/* loaded from: classes6.dex */
public class LoadingMoreFooter extends LinearLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final int f64851h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f64852i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f64853j = 2;

    /* renamed from: b, reason: collision with root package name */
    private SimpleViewSwitcher f64854b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f64855c;

    /* renamed from: d, reason: collision with root package name */
    private String f64856d;

    /* renamed from: e, reason: collision with root package name */
    private String f64857e;

    /* renamed from: f, reason: collision with root package name */
    private String f64858f;

    /* renamed from: g, reason: collision with root package name */
    private AVLoadingIndicatorView f64859g;

    public LoadingMoreFooter(Context context) {
        super(context);
        b();
    }

    public void a() {
        this.f64854b = null;
        AVLoadingIndicatorView aVLoadingIndicatorView = this.f64859g;
        if (aVLoadingIndicatorView != null) {
            aVLoadingIndicatorView.c();
            this.f64859g = null;
        }
    }

    public void b() {
        setGravity(17);
        setPadding(getPaddingLeft(), (int) getResources().getDimension(g.f.X1), getPaddingRight(), (int) getResources().getDimension(g.f.W1));
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        SimpleViewSwitcher simpleViewSwitcher = new SimpleViewSwitcher(getContext());
        this.f64854b = simpleViewSwitcher;
        simpleViewSwitcher.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        AVLoadingIndicatorView aVLoadingIndicatorView = new AVLoadingIndicatorView(getContext());
        this.f64859g = aVLoadingIndicatorView;
        aVLoadingIndicatorView.h(-4868683);
        this.f64859g.i(22);
        this.f64854b.a(this.f64859g);
        addView(this.f64854b);
        TextView textView = new TextView(getContext());
        this.f64855c = textView;
        Context context = getContext();
        int i4 = g.m.S;
        textView.setText(context.getString(i4));
        String str = this.f64856d;
        if (str == null || str.equals("")) {
            this.f64856d = (String) getContext().getText(i4);
        }
        String str2 = this.f64857e;
        if (str2 == null || str2.equals("")) {
            this.f64857e = (String) getContext().getText(g.m.H0);
        }
        String str3 = this.f64858f;
        if (str3 == null || str3.equals("")) {
            this.f64858f = (String) getContext().getText(g.m.T);
        }
        this.f64855c.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(this.f64855c);
    }

    public void c(String str) {
        this.f64858f = str;
    }

    public void d(String str) {
        this.f64856d = str;
    }

    public void e(String str) {
        this.f64857e = android.support.v4.media.d.a(ProtectedSandApp.s("ᑲ\u0001"), str, ProtectedSandApp.s("ᑳ\u0001"));
    }

    public void f(int i4) {
        if (i4 == -1) {
            this.f64854b.a(new ProgressBar(getContext(), null, R.attr.progressBarStyle));
            return;
        }
        AVLoadingIndicatorView aVLoadingIndicatorView = new AVLoadingIndicatorView(getContext());
        this.f64859g = aVLoadingIndicatorView;
        aVLoadingIndicatorView.h(-4868683);
        this.f64859g.i(i4);
        this.f64854b.a(this.f64859g);
    }

    public void g(int i4) {
        if (i4 == 0) {
            this.f64854b.setVisibility(0);
            if (this.f64856d == null) {
                this.f64855c.setVisibility(8);
            } else {
                this.f64855c.setVisibility(0);
                this.f64855c.setText(this.f64856d);
            }
            setVisibility(0);
            return;
        }
        if (i4 == 1) {
            if (this.f64856d == null) {
                this.f64855c.setVisibility(8);
            } else {
                this.f64855c.setVisibility(0);
                this.f64855c.setText(this.f64858f);
            }
            setVisibility(8);
            return;
        }
        if (i4 != 2) {
            return;
        }
        this.f64855c.setVisibility(0);
        this.f64855c.setText(this.f64857e);
        this.f64854b.setVisibility(8);
        setVisibility(0);
    }

    public LoadingMoreFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }
}
