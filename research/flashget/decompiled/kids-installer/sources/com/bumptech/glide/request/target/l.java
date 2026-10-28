package com.bumptech.glide.request.target;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: NotificationTarget.java */
/* loaded from: classes4.dex */
public class l extends e<Bitmap> {

    /* renamed from: r, reason: collision with root package name */
    private final RemoteViews f12078r;

    /* renamed from: s, reason: collision with root package name */
    private final Context f12079s;

    /* renamed from: t, reason: collision with root package name */
    private final int f12080t;

    /* renamed from: u, reason: collision with root package name */
    private final String f12081u;

    /* renamed from: v, reason: collision with root package name */
    private final Notification f12082v;

    /* renamed from: w, reason: collision with root package name */
    private final int f12083w;

    public l(Context context, int i5, RemoteViews remoteViews, Notification notification, int i6) {
        this(context, i5, remoteViews, notification, i6, null);
    }

    private void d(@q0 Bitmap bitmap) {
        this.f12078r.setImageViewBitmap(this.f12083w, bitmap);
        e();
    }

    private void e() {
        ((NotificationManager) com.bumptech.glide.util.l.d((NotificationManager) this.f12079s.getSystemService(ProtectedSandApp.s("⯵")))).notify(this.f12081u, this.f12080t, this.f12082v);
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

    public l(Context context, int i5, RemoteViews remoteViews, Notification notification, int i6, String str) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i5, remoteViews, notification, i6, str);
    }

    public l(Context context, int i5, int i6, int i7, RemoteViews remoteViews, Notification notification, int i8, String str) {
        super(i5, i6);
        this.f12079s = (Context) com.bumptech.glide.util.l.e(context, ProtectedSandApp.s("⯲"));
        this.f12082v = (Notification) com.bumptech.glide.util.l.e(notification, ProtectedSandApp.s("⯳"));
        this.f12078r = (RemoteViews) com.bumptech.glide.util.l.e(remoteViews, ProtectedSandApp.s("⯴"));
        this.f12083w = i7;
        this.f12080t = i8;
        this.f12081u = str;
    }
}
