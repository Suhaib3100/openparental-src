package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import androidx.annotation.x0;
import androidx.media.e;

/* compiled from: MediaBrowserServiceCompatApi23.java */
@x0(23)
/* loaded from: classes3.dex */
class f {

    /* compiled from: MediaBrowserServiceCompatApi23.java */
    static class a extends e.b {
        a(Context context, b bVar) {
            super(context, bVar);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
            ((b) this.f30767b).c(str, new e.c<>(result));
        }
    }

    /* compiled from: MediaBrowserServiceCompatApi23.java */
    public interface b extends e.d {
        void c(String str, e.c<Parcel> cVar);
    }

    private f() {
    }

    public static Object a(Context context, b bVar) {
        return new a(context, (e.d) bVar);
    }
}
