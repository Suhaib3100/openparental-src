package com.bumptech.glide.request.target;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.annotation.b1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: NotificationTarget.java */
/* loaded from: classes3.dex */
public class l extends e<Bitmap> {

    /* renamed from: e, reason: collision with root package name */
    private final RemoteViews f44884e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f44885f;

    /* renamed from: g, reason: collision with root package name */
    private final int f44886g;

    /* renamed from: h, reason: collision with root package name */
    private final String f44887h;

    /* renamed from: i, reason: collision with root package name */
    private final Notification f44888i;

    /* renamed from: j, reason: collision with root package name */
    private final int f44889j;

    @SuppressLint({"InlinedApi"})
    @b1("android.permission.POST_NOTIFICATIONS")
    public l(Context context, int i4, RemoteViews remoteViews, Notification notification, int i5) {
        this(context, i4, remoteViews, notification, i5, null);
    }

    @SuppressLint({"InlinedApi"})
    @b1("android.permission.POST_NOTIFICATIONS")
    private void c(@q0 Bitmap bitmap) {
        this.f44884e.setImageViewBitmap(this.f44889j, bitmap);
        d();
    }

    @SuppressLint({"InlinedApi"})
    @b1("android.permission.POST_NOTIFICATIONS")
    private void d() {
        ((NotificationManager) com.bumptech.glide.util.m.f((NotificationManager) this.f44885f.getSystemService(ProtectedSandApp.s("ઇ")), ProtectedSandApp.s("ઈ"))).notify(this.f44887h, this.f44886g, this.f44888i);
    }

    @Override // com.bumptech.glide.request.target.p
    @SuppressLint({"InlinedApi"})
    @b1("android.permission.POST_NOTIFICATIONS")
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void j(@o0 Bitmap bitmap, @q0 com.bumptech.glide.request.transition.f<? super Bitmap> fVar) {
        c(bitmap);
    }

    @Override // com.bumptech.glide.request.target.p
    @SuppressLint({"InlinedApi"})
    @b1("android.permission.POST_NOTIFICATIONS")
    public void i(@q0 Drawable drawable) {
        c(null);
    }

    @SuppressLint({"InlinedApi"})
    @b1("android.permission.POST_NOTIFICATIONS")
    public l(Context context, int i4, RemoteViews remoteViews, Notification notification, int i5, String str) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i4, remoteViews, notification, i5, str);
    }

    @SuppressLint({"InlinedApi"})
    @b1("android.permission.POST_NOTIFICATIONS")
    public l(Context context, int i4, int i5, int i6, RemoteViews remoteViews, Notification notification, int i7, String str) {
        super(i4, i5);
        this.f44885f = (Context) com.bumptech.glide.util.m.f(context, ProtectedSandApp.s("\u0a84"));
        this.f44888i = (Notification) com.bumptech.glide.util.m.f(notification, ProtectedSandApp.s("અ"));
        this.f44884e = (RemoteViews) com.bumptech.glide.util.m.f(remoteViews, ProtectedSandApp.s("આ"));
        this.f44889j = i6;
        this.f44886g = i7;
        this.f44887h = str;
    }
}
