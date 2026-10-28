package com.bumptech.glide.request.target;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: AppWidgetTarget.java */
/* loaded from: classes3.dex */
public class a extends e<Bitmap> {

    /* renamed from: e, reason: collision with root package name */
    private final int[] f44850e;

    /* renamed from: f, reason: collision with root package name */
    private final ComponentName f44851f;

    /* renamed from: g, reason: collision with root package name */
    private final RemoteViews f44852g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f44853h;

    /* renamed from: i, reason: collision with root package name */
    private final int f44854i;

    public a(Context context, int i4, int i5, int i6, RemoteViews remoteViews, int... iArr) {
        super(i4, i5);
        if (iArr.length == 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u0a77"));
        }
        this.f44853h = (Context) com.bumptech.glide.util.m.f(context, ProtectedSandApp.s("ੳ"));
        this.f44852g = (RemoteViews) com.bumptech.glide.util.m.f(remoteViews, ProtectedSandApp.s("ੴ"));
        this.f44850e = (int[]) com.bumptech.glide.util.m.f(iArr, ProtectedSandApp.s("੶"));
        this.f44854i = i6;
        this.f44851f = null;
    }

    private void c(@q0 Bitmap bitmap) {
        this.f44852g.setImageViewBitmap(this.f44854i, bitmap);
        d();
    }

    private void d() {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this.f44853h);
        ComponentName componentName = this.f44851f;
        if (componentName != null) {
            appWidgetManager.updateAppWidget(componentName, this.f44852g);
        } else {
            appWidgetManager.updateAppWidget(this.f44850e, this.f44852g);
        }
    }

    @Override // com.bumptech.glide.request.target.p
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void j(@o0 Bitmap bitmap, @q0 com.bumptech.glide.request.transition.f<? super Bitmap> fVar) {
        c(bitmap);
    }

    @Override // com.bumptech.glide.request.target.p
    public void i(@q0 Drawable drawable) {
        c(null);
    }

    public a(Context context, int i4, RemoteViews remoteViews, int... iArr) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i4, remoteViews, iArr);
    }

    public a(Context context, int i4, int i5, int i6, RemoteViews remoteViews, ComponentName componentName) {
        super(i4, i5);
        this.f44853h = (Context) com.bumptech.glide.util.m.f(context, ProtectedSandApp.s("ੳ"));
        this.f44852g = (RemoteViews) com.bumptech.glide.util.m.f(remoteViews, ProtectedSandApp.s("ੴ"));
        this.f44851f = (ComponentName) com.bumptech.glide.util.m.f(componentName, ProtectedSandApp.s("ੵ"));
        this.f44854i = i6;
        this.f44850e = null;
    }

    public a(Context context, int i4, RemoteViews remoteViews, ComponentName componentName) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i4, remoteViews, componentName);
    }
}
