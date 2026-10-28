package com.bumptech.glide.request.target;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: AppWidgetTarget.java */
/* loaded from: classes3.dex */
public class a extends e<Bitmap> {

    /* renamed from: r, reason: collision with root package name */
    private final int[] f12044r;

    /* renamed from: s, reason: collision with root package name */
    private final ComponentName f12045s;

    /* renamed from: t, reason: collision with root package name */
    private final RemoteViews f12046t;

    /* renamed from: u, reason: collision with root package name */
    private final Context f12047u;

    /* renamed from: v, reason: collision with root package name */
    private final int f12048v;

    public a(Context context, int i5, int i6, int i7, RemoteViews remoteViews, int... iArr) {
        super(i5, i6);
        if (iArr.length == 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᶰ"));
        }
        this.f12047u = (Context) com.bumptech.glide.util.l.e(context, ProtectedSandApp.s("ᶭ"));
        this.f12046t = (RemoteViews) com.bumptech.glide.util.l.e(remoteViews, ProtectedSandApp.s("ᶮ"));
        this.f12044r = (int[]) com.bumptech.glide.util.l.e(iArr, ProtectedSandApp.s("ᶯ"));
        this.f12048v = i7;
        this.f12045s = null;
    }

    private void d(@q0 Bitmap bitmap) {
        this.f12046t.setImageViewBitmap(this.f12048v, bitmap);
        e();
    }

    private void e() {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this.f12047u);
        ComponentName componentName = this.f12045s;
        if (componentName != null) {
            appWidgetManager.updateAppWidget(componentName, this.f12046t);
        } else {
            appWidgetManager.updateAppWidget(this.f12044r, this.f12046t);
        }
    }

    @Override // com.bumptech.glide.request.target.p
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(@o0 Bitmap bitmap, @q0 com.bumptech.glide.request.transition.f<? super Bitmap> fVar) {
        d(bitmap);
    }

    @Override // com.bumptech.glide.request.target.p
    public void p(@q0 Drawable drawable) {
        d(null);
    }

    public a(Context context, int i5, RemoteViews remoteViews, int... iArr) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i5, remoteViews, iArr);
    }

    public a(Context context, int i5, int i6, int i7, RemoteViews remoteViews, ComponentName componentName) {
        super(i5, i6);
        this.f12047u = (Context) com.bumptech.glide.util.l.e(context, ProtectedSandApp.s("ᶪ"));
        this.f12046t = (RemoteViews) com.bumptech.glide.util.l.e(remoteViews, ProtectedSandApp.s("ᶫ"));
        this.f12045s = (ComponentName) com.bumptech.glide.util.l.e(componentName, ProtectedSandApp.s("ᶬ"));
        this.f12048v = i7;
        this.f12044r = null;
    }

    public a(Context context, int i5, RemoteViews remoteViews, ComponentName componentName) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i5, remoteViews, componentName);
    }
}
