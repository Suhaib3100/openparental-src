package androidx.media.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.annotation.c1;
import androidx.annotation.x0;
import androidx.core.app.d0;
import androidx.core.app.y;
import androidx.media.r;

/* compiled from: NotificationCompat.java */
/* loaded from: classes3.dex */
public class a {

    /* compiled from: NotificationCompat.java */
    /* renamed from: androidx.media.app.a$a, reason: collision with other inner class name */
    public static class C0511a extends b {
        private void L(RemoteViews remoteViews) {
            remoteViews.setInt(r.e.f30873z, "setBackgroundColor", this.f25676a.r() != 0 ? this.f25676a.r() : this.f25676a.f25581a.getResources().getColor(r.b.f30805c));
        }

        @Override // androidx.media.app.a.b
        int E(int i4) {
            return i4 <= 3 ? r.g.f30883h : r.g.f30881f;
        }

        @Override // androidx.media.app.a.b
        int F() {
            return this.f25676a.s() != null ? r.g.f30888m : r.g.f30887l;
        }

        @Override // androidx.media.app.a.b, androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP})
        public void b(y yVar) {
            yVar.a().setStyle(A(new Notification.DecoratedMediaCustomViewStyle()));
        }

        @Override // androidx.media.app.a.b, androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP})
        public RemoteViews v(y yVar) {
            return null;
        }

        @Override // androidx.media.app.a.b, androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP})
        public RemoteViews w(y yVar) {
            return null;
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP})
        public RemoteViews x(y yVar) {
            return null;
        }
    }

    private a() {
    }

    /* compiled from: NotificationCompat.java */
    public static class b extends d0.y {

        /* renamed from: i, reason: collision with root package name */
        private static final int f30733i = 3;

        /* renamed from: j, reason: collision with root package name */
        private static final int f30734j = 5;

        /* renamed from: e, reason: collision with root package name */
        int[] f30735e = null;

        /* renamed from: f, reason: collision with root package name */
        MediaSessionCompat.Token f30736f;

        /* renamed from: g, reason: collision with root package name */
        boolean f30737g;

        /* renamed from: h, reason: collision with root package name */
        PendingIntent f30738h;

        public b() {
        }

        private RemoteViews D(d0.b bVar) {
            boolean z4 = bVar.a() == null;
            RemoteViews remoteViews = new RemoteViews(this.f25676a.f25581a.getPackageName(), r.g.f30878c);
            int i4 = r.e.f30848a;
            remoteViews.setImageViewResource(i4, bVar.e());
            if (!z4) {
                remoteViews.setOnClickPendingIntent(i4, bVar.a());
            }
            remoteViews.setContentDescription(i4, bVar.j());
            return remoteViews;
        }

        public static MediaSessionCompat.Token G(Notification notification) {
            Parcelable parcelable;
            Bundle bundle = notification.extras;
            if (bundle == null || (parcelable = bundle.getParcelable("android.mediaSession")) == null) {
                return null;
            }
            return MediaSessionCompat.Token.fromToken(parcelable);
        }

        @x0(21)
        Notification.MediaStyle A(Notification.MediaStyle mediaStyle) {
            int[] iArr = this.f30735e;
            if (iArr != null) {
                mediaStyle.setShowActionsInCompactView(iArr);
            }
            MediaSessionCompat.Token token = this.f30736f;
            if (token != null) {
                mediaStyle.setMediaSession((MediaSession.Token) token.getToken());
            }
            return mediaStyle;
        }

        RemoteViews B() {
            int min = Math.min(this.f25676a.f25582b.size(), 5);
            RemoteViews c5 = c(false, E(min), false);
            c5.removeAllViews(r.e.f30866s);
            if (min > 0) {
                for (int i4 = 0; i4 < min; i4++) {
                    c5.addView(r.e.f30866s, D(this.f25676a.f25582b.get(i4)));
                }
            }
            if (this.f30737g) {
                int i5 = r.e.f30856i;
                c5.setViewVisibility(i5, 0);
                c5.setInt(i5, "setAlpha", this.f25676a.f25581a.getResources().getInteger(r.f.f30874a));
                c5.setOnClickPendingIntent(i5, this.f30738h);
            } else {
                c5.setViewVisibility(r.e.f30856i, 8);
            }
            return c5;
        }

        RemoteViews C() {
            RemoteViews c5 = c(false, F(), true);
            int size = this.f25676a.f25582b.size();
            int[] iArr = this.f30735e;
            int min = iArr == null ? 0 : Math.min(iArr.length, 3);
            c5.removeAllViews(r.e.f30866s);
            if (min > 0) {
                for (int i4 = 0; i4 < min; i4++) {
                    if (i4 >= size) {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", Integer.valueOf(i4), Integer.valueOf(size - 1)));
                    }
                    c5.addView(r.e.f30866s, D(this.f25676a.f25582b.get(this.f30735e[i4])));
                }
            }
            if (this.f30737g) {
                c5.setViewVisibility(r.e.f30858k, 8);
                int i5 = r.e.f30856i;
                c5.setViewVisibility(i5, 0);
                c5.setOnClickPendingIntent(i5, this.f30738h);
                c5.setInt(i5, "setAlpha", this.f25676a.f25581a.getResources().getInteger(r.f.f30874a));
            } else {
                c5.setViewVisibility(r.e.f30858k, 0);
                c5.setViewVisibility(r.e.f30856i, 8);
            }
            return c5;
        }

        int E(int i4) {
            return i4 <= 3 ? r.g.f30882g : r.g.f30880e;
        }

        int F() {
            return r.g.f30887l;
        }

        public b H(PendingIntent pendingIntent) {
            this.f30738h = pendingIntent;
            return this;
        }

        public b I(MediaSessionCompat.Token token) {
            this.f30736f = token;
            return this;
        }

        public b J(int... iArr) {
            this.f30735e = iArr;
            return this;
        }

        public b K(boolean z4) {
            return this;
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP})
        public void b(y yVar) {
            yVar.a().setStyle(A(new Notification.MediaStyle()));
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP})
        public RemoteViews v(y yVar) {
            return null;
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP})
        public RemoteViews w(y yVar) {
            return null;
        }

        public b(d0.n nVar) {
            z(nVar);
        }
    }
}
