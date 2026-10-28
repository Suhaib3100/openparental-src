package com.squareup.picasso;

import android.app.Notification;
import android.app.NotificationManager;
import android.appwidget.AppWidgetManager;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.squareup.picasso.w;

/* compiled from: RemoteViewsAction.java */
/* loaded from: classes6.dex */
abstract class a0 extends com.squareup.picasso.a<c> {

    /* renamed from: m, reason: collision with root package name */
    final RemoteViews f70731m;

    /* renamed from: n, reason: collision with root package name */
    final int f70732n;

    /* renamed from: o, reason: collision with root package name */
    f f70733o;

    /* renamed from: p, reason: collision with root package name */
    private c f70734p;

    /* compiled from: RemoteViewsAction.java */
    static class a extends a0 {

        /* renamed from: q, reason: collision with root package name */
        private final int[] f70735q;

        a(w wVar, b0 b0Var, RemoteViews remoteViews, int i4, int[] iArr, int i5, int i6, String str, Object obj, int i7, f fVar) {
            super(wVar, b0Var, remoteViews, i4, i7, i5, i6, obj, str, fVar);
            this.f70735q = iArr;
        }

        @Override // com.squareup.picasso.a0, com.squareup.picasso.a
        /* bridge */ /* synthetic */ c k() {
            return super.k();
        }

        @Override // com.squareup.picasso.a0
        void p() {
            AppWidgetManager.getInstance(this.f70718a.f70975e).updateAppWidget(this.f70735q, this.f70731m);
        }
    }

    /* compiled from: RemoteViewsAction.java */
    static class b extends a0 {

        /* renamed from: q, reason: collision with root package name */
        private final int f70736q;

        /* renamed from: r, reason: collision with root package name */
        private final String f70737r;

        /* renamed from: s, reason: collision with root package name */
        private final Notification f70738s;

        b(w wVar, b0 b0Var, RemoteViews remoteViews, int i4, int i5, Notification notification, String str, int i6, int i7, String str2, Object obj, int i10, f fVar) {
            super(wVar, b0Var, remoteViews, i4, i10, i6, i7, obj, str2, fVar);
            this.f70736q = i5;
            this.f70737r = str;
            this.f70738s = notification;
        }

        @Override // com.squareup.picasso.a0, com.squareup.picasso.a
        /* bridge */ /* synthetic */ c k() {
            return super.k();
        }

        @Override // com.squareup.picasso.a0
        void p() {
            ((NotificationManager) k0.o(this.f70718a.f70975e, "notification")).notify(this.f70737r, this.f70736q, this.f70738s);
        }
    }

    /* compiled from: RemoteViewsAction.java */
    static class c {

        /* renamed from: a, reason: collision with root package name */
        final RemoteViews f70739a;

        /* renamed from: b, reason: collision with root package name */
        final int f70740b;

        c(RemoteViews remoteViews, int i4) {
            this.f70739a = remoteViews;
            this.f70740b = i4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f70740b == cVar.f70740b && this.f70739a.equals(cVar.f70739a);
        }

        public int hashCode() {
            return (this.f70739a.hashCode() * 31) + this.f70740b;
        }
    }

    a0(w wVar, b0 b0Var, RemoteViews remoteViews, int i4, int i5, int i6, int i7, Object obj, String str, f fVar) {
        super(wVar, null, b0Var, i6, i7, i5, null, str, obj, false);
        this.f70731m = remoteViews;
        this.f70732n = i4;
        this.f70733o = fVar;
    }

    @Override // com.squareup.picasso.a
    void a() {
        this.f70729l = true;
        if (this.f70733o != null) {
            this.f70733o = null;
        }
    }

    @Override // com.squareup.picasso.a
    void b(Bitmap bitmap, w.e eVar) {
        this.f70731m.setImageViewBitmap(this.f70732n, bitmap);
        p();
        f fVar = this.f70733o;
        if (fVar != null) {
            fVar.onSuccess();
        }
    }

    @Override // com.squareup.picasso.a
    public void c(Exception exc) {
        int i4 = this.f70724g;
        if (i4 != 0) {
            o(i4);
        }
        f fVar = this.f70733o;
        if (fVar != null) {
            fVar.onError(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.squareup.picasso.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public c k() {
        if (this.f70734p == null) {
            this.f70734p = new c(this.f70731m, this.f70732n);
        }
        return this.f70734p;
    }

    void o(int i4) {
        this.f70731m.setImageViewResource(this.f70732n, i4);
        p();
    }

    abstract void p();
}
