package com.androidquery.util;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.view.View;
import android.widget.ProgressBar;
import org.threeten.bp.chrono.m;

/* compiled from: Progress.java */
/* loaded from: classes3.dex */
public class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private ProgressBar f41261b;

    /* renamed from: c, reason: collision with root package name */
    private ProgressDialog f41262c;

    /* renamed from: d, reason: collision with root package name */
    private Activity f41263d;

    /* renamed from: e, reason: collision with root package name */
    private View f41264e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f41265f;

    /* renamed from: g, reason: collision with root package name */
    private int f41266g;

    /* renamed from: h, reason: collision with root package name */
    private int f41267h;

    /* renamed from: i, reason: collision with root package name */
    private String f41268i;

    public f(Object obj) {
        if (obj instanceof ProgressBar) {
            this.f41261b = (ProgressBar) obj;
            return;
        }
        if (obj instanceof ProgressDialog) {
            this.f41262c = (ProgressDialog) obj;
        } else if (obj instanceof Activity) {
            this.f41263d = (Activity) obj;
        } else if (obj instanceof View) {
            this.f41264e = (View) obj;
        }
    }

    private void a(String str) {
        if (this.f41262c != null) {
            new com.androidquery.a(this.f41262c.getContext()).C(this.f41262c);
        }
        Activity activity = this.f41263d;
        if (activity != null) {
            activity.setProgressBarIndeterminateVisibility(false);
            this.f41263d.setProgressBarVisibility(false);
        }
        ProgressBar progressBar = this.f41261b;
        if (progressBar != null) {
            progressBar.setTag(d.f41256v, str);
            this.f41261b.setVisibility(0);
        }
        View view = this.f41261b;
        if (view == null) {
            view = this.f41264e;
        }
        if (view != null) {
            Object tag = view.getTag(d.f41256v);
            if (tag == null || tag.equals(str)) {
                view.setTag(d.f41256v, null);
                ProgressBar progressBar2 = this.f41261b;
                if (progressBar2 == null || !progressBar2.isIndeterminate()) {
                    return;
                }
                view.setVisibility(8);
            }
        }
    }

    private void h(Object obj, String str, boolean z4) {
        if (obj != null) {
            if (!(obj instanceof View)) {
                if (obj instanceof Dialog) {
                    Dialog dialog = (Dialog) obj;
                    com.androidquery.a aVar = new com.androidquery.a(dialog.getContext());
                    if (z4) {
                        aVar.y1(dialog);
                        return;
                    } else {
                        aVar.C(dialog);
                        return;
                    }
                }
                if (obj instanceof Activity) {
                    Activity activity = (Activity) obj;
                    activity.setProgressBarIndeterminateVisibility(z4);
                    activity.setProgressBarVisibility(z4);
                    if (z4) {
                        activity.setProgress(0);
                        return;
                    }
                    return;
                }
                return;
            }
            View view = (View) obj;
            ProgressBar progressBar = obj instanceof ProgressBar ? (ProgressBar) obj : null;
            if (z4) {
                view.setTag(d.f41256v, str);
                view.setVisibility(0);
                if (progressBar != null) {
                    progressBar.setProgress(0);
                    progressBar.setMax(100);
                    return;
                }
                return;
            }
            Object tag = view.getTag(d.f41256v);
            if (tag == null || tag.equals(str)) {
                view.setTag(d.f41256v, null);
                if (progressBar == null || !progressBar.isIndeterminate()) {
                    return;
                }
                view.setVisibility(8);
            }
        }
    }

    public void b() {
        ProgressBar progressBar = this.f41261b;
        if (progressBar != null) {
            progressBar.setProgress(progressBar.getMax());
        }
        ProgressDialog progressDialog = this.f41262c;
        if (progressDialog != null) {
            progressDialog.setProgress(progressDialog.getMax());
        }
        Activity activity = this.f41263d;
        if (activity != null) {
            activity.setProgress(m.f87989n);
        }
    }

    public void c(String str) {
        if (a.F()) {
            a(str);
        } else {
            this.f41268i = str;
            a.L(this);
        }
    }

    public void d(int i4) {
        int i5;
        ProgressBar progressBar = this.f41261b;
        if (progressBar != null) {
            progressBar.incrementProgressBy(this.f41265f ? 1 : i4);
        }
        ProgressDialog progressDialog = this.f41262c;
        if (progressDialog != null) {
            progressDialog.incrementProgressBy(this.f41265f ? 1 : i4);
        }
        Activity activity = this.f41263d;
        if (activity != null) {
            if (this.f41265f) {
                i5 = this.f41267h;
                this.f41267h = i5 + 1;
            } else {
                int i6 = this.f41267h + i4;
                this.f41267h = i6;
                i5 = (i6 * 10000) / this.f41266g;
            }
            if (i5 > 9999) {
                i5 = 9999;
            }
            activity.setProgress(i5);
        }
    }

    public void e() {
        ProgressBar progressBar = this.f41261b;
        if (progressBar != null) {
            progressBar.setProgress(0);
            this.f41261b.setMax(10000);
        }
        ProgressDialog progressDialog = this.f41262c;
        if (progressDialog != null) {
            progressDialog.setProgress(0);
            this.f41262c.setMax(10000);
        }
        Activity activity = this.f41263d;
        if (activity != null) {
            activity.setProgress(0);
        }
        this.f41265f = false;
        this.f41267h = 0;
        this.f41266g = 10000;
    }

    public void f(int i4) {
        if (i4 <= 0) {
            this.f41265f = true;
            i4 = 10000;
        }
        this.f41266g = i4;
        ProgressBar progressBar = this.f41261b;
        if (progressBar != null) {
            progressBar.setProgress(0);
            this.f41261b.setMax(i4);
        }
        ProgressDialog progressDialog = this.f41262c;
        if (progressDialog != null) {
            progressDialog.setProgress(0);
            this.f41262c.setMax(i4);
        }
    }

    public void g(String str) {
        e();
        if (this.f41262c != null) {
            new com.androidquery.a(this.f41262c.getContext()).y1(this.f41262c);
        }
        Activity activity = this.f41263d;
        if (activity != null) {
            activity.setProgressBarIndeterminateVisibility(true);
            this.f41263d.setProgressBarVisibility(true);
        }
        ProgressBar progressBar = this.f41261b;
        if (progressBar != null) {
            progressBar.setTag(d.f41256v, str);
            this.f41261b.setVisibility(0);
        }
        View view = this.f41264e;
        if (view != null) {
            view.setTag(d.f41256v, str);
            this.f41264e.setVisibility(0);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        a(this.f41268i);
    }
}
