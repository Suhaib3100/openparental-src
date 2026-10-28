package androidx.work;

import android.app.Notification;
import androidx.annotation.o0;

/* compiled from: ForegroundInfo.java */
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final int f36578a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36579b;

    /* renamed from: c, reason: collision with root package name */
    private final Notification f36580c;

    public l(int notificationId, @o0 Notification notification) {
        this(notificationId, notification, 0);
    }

    public int a() {
        return this.f36579b;
    }

    @o0
    public Notification b() {
        return this.f36580c;
    }

    public int c() {
        return this.f36578a;
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (o4 == null || l.class != o4.getClass()) {
            return false;
        }
        l lVar = (l) o4;
        if (this.f36578a == lVar.f36578a && this.f36579b == lVar.f36579b) {
            return this.f36580c.equals(lVar.f36580c);
        }
        return false;
    }

    public int hashCode() {
        return this.f36580c.hashCode() + (((this.f36578a * 31) + this.f36579b) * 31);
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f36578a + ", mForegroundServiceType=" + this.f36579b + ", mNotification=" + this.f36580c + '}';
    }

    public l(int notificationId, @o0 Notification notification, int foregroundServiceType) {
        this.f36578a = notificationId;
        this.f36580c = notification;
        this.f36579b = foregroundServiceType;
    }
}
