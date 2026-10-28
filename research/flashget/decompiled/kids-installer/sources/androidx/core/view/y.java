package androidx.core.view;

import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import androidx.annotation.c1;

/* compiled from: DragAndDropPermissionsCompat.java */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final DragAndDropPermissions f5738a;

    /* compiled from: DragAndDropPermissionsCompat.java */
    @androidx.annotation.x0(24)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(DragAndDropPermissions dragAndDropPermissions) {
            dragAndDropPermissions.release();
        }

        @androidx.annotation.u
        static DragAndDropPermissions b(Activity activity, DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }
    }

    private y(DragAndDropPermissions dragAndDropPermissions) {
        this.f5738a = dragAndDropPermissions;
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static y b(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 DragEvent dragEvent) {
        DragAndDropPermissions b6 = a.b(activity, dragEvent);
        if (b6 != null) {
            return new y(b6);
        }
        return null;
    }

    public void a() {
        a.a(this.f5738a);
    }
}
