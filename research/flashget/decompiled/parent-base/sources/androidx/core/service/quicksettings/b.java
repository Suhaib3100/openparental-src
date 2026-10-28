package androidx.core.service.quicksettings;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.service.quicksettings.TileService;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.x0;

/* compiled from: TileServiceCompat.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static c f26670a;

    /* compiled from: TileServiceCompat.java */
    @x0(24)
    private static class a {
        private a() {
        }

        static void a(TileService tileService, Intent intent) {
            tileService.startActivityAndCollapse(intent);
        }
    }

    /* compiled from: TileServiceCompat.java */
    @x0(34)
    /* renamed from: androidx.core.service.quicksettings.b$b, reason: collision with other inner class name */
    private static class C0427b {
        private C0427b() {
        }

        static void a(TileService tileService, PendingIntent pendingIntent) {
            tileService.startActivityAndCollapse(pendingIntent);
        }
    }

    /* compiled from: TileServiceCompat.java */
    interface c {
        void a(Intent intent);

        void b(PendingIntent pendingIntent);
    }

    private b() {
    }

    @c1({c1.a.LIBRARY})
    public static void a() {
        f26670a = null;
    }

    @c1({c1.a.LIBRARY})
    public static void b(@o0 c cVar) {
        f26670a = cVar;
    }

    public static void c(@o0 TileService tileService, @o0 androidx.core.service.quicksettings.a aVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            c cVar = f26670a;
            if (cVar != null) {
                cVar.b(aVar.f());
                return;
            } else {
                C0427b.a(tileService, aVar.f());
                return;
            }
        }
        c cVar2 = f26670a;
        if (cVar2 != null) {
            cVar2.a(aVar.d());
        } else {
            tileService.startActivityAndCollapse(aVar.d());
        }
    }
}
