package androidx.media;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.x0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MediaBrowserServiceCompatApi21.java */
@x0(21)
/* loaded from: classes3.dex */
class e {

    /* compiled from: MediaBrowserServiceCompatApi21.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final String f30765a;

        /* renamed from: b, reason: collision with root package name */
        final Bundle f30766b;

        a(String str, Bundle bundle) {
            this.f30765a = str;
            this.f30766b = bundle;
        }
    }

    /* compiled from: MediaBrowserServiceCompatApi21.java */
    static class b extends MediaBrowserService {

        /* renamed from: b, reason: collision with root package name */
        final d f30767b;

        b(Context context, d dVar) {
            attachBaseContext(context);
            this.f30767b = dVar;
        }

        @Override // android.service.media.MediaBrowserService
        public MediaBrowserService.BrowserRoot onGetRoot(String str, int i4, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            a f4 = this.f30767b.f(str, i4, bundle == null ? null : new Bundle(bundle));
            if (f4 == null) {
                return null;
            }
            return new MediaBrowserService.BrowserRoot(f4.f30765a, f4.f30766b);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
            this.f30767b.k(str, new c<>(result));
        }
    }

    /* compiled from: MediaBrowserServiceCompatApi21.java */
    static class c<T> {

        /* renamed from: a, reason: collision with root package name */
        MediaBrowserService.Result f30768a;

        c(MediaBrowserService.Result result) {
            this.f30768a = result;
        }

        public void a() {
            this.f30768a.detach();
        }

        List<MediaBrowser.MediaItem> b(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void c(T t4) {
            if (t4 instanceof List) {
                this.f30768a.sendResult(b((List) t4));
                return;
            }
            if (!(t4 instanceof Parcel)) {
                this.f30768a.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) t4;
            parcel.setDataPosition(0);
            this.f30768a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
        }
    }

    /* compiled from: MediaBrowserServiceCompatApi21.java */
    public interface d {
        a f(String str, int i4, Bundle bundle);

        void k(String str, c<List<Parcel>> cVar);
    }

    private e() {
    }

    public static Object a(Context context, d dVar) {
        return new b(context, dVar);
    }

    public static void b(Object obj, String str) {
        ((MediaBrowserService) obj).notifyChildrenChanged(str);
    }

    public static IBinder c(Object obj, Intent intent) {
        return ((MediaBrowserService) obj).onBind(intent);
    }

    public static void d(Object obj) {
        ((MediaBrowserService) obj).onCreate();
    }

    public static void e(Object obj, Object obj2) {
        ((MediaBrowserService) obj).setSessionToken((MediaSession.Token) obj2);
    }
}
