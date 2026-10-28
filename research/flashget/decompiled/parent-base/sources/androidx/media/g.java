package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.x0;
import androidx.media.e;
import androidx.media.f;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MediaBrowserServiceCompatApi26.java */
@x0(26)
/* loaded from: classes3.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f30769a = "MBSCompatApi26";

    /* renamed from: b, reason: collision with root package name */
    static Field f30770b;

    /* compiled from: MediaBrowserServiceCompatApi26.java */
    static class a extends f.a {
        a(Context context, c cVar) {
            super(context, (e.d) cVar);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            ((c) this.f30767b).e(str, new b(result), bundle);
        }
    }

    /* compiled from: MediaBrowserServiceCompatApi26.java */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        MediaBrowserService.Result f30771a;

        b(MediaBrowserService.Result result) {
            this.f30771a = result;
        }

        public void a() {
            this.f30771a.detach();
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

        public void c(List<Parcel> list, int i4) {
            try {
                g.f30770b.setInt(this.f30771a, i4);
            } catch (IllegalAccessException unused) {
            }
            this.f30771a.sendResult(b(list));
        }
    }

    /* compiled from: MediaBrowserServiceCompatApi26.java */
    public interface c extends f.b {
        void e(String str, b bVar, Bundle bundle);
    }

    static {
        try {
            Field declaredField = MediaBrowserService.Result.class.getDeclaredField("mFlags");
            f30770b = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    private g() {
    }

    public static Object a(Context context, c cVar) {
        return new a(context, (e.d) cVar);
    }

    public static Bundle b(Object obj) {
        return ((MediaBrowserService) obj).getBrowserRootHints();
    }

    public static void c(Object obj, String str, Bundle bundle) {
        ((MediaBrowserService) obj).notifyChildrenChanged(str, bundle);
    }
}
