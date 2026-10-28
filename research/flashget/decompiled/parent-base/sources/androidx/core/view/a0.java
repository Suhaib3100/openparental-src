package androidx.core.view;

import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import androidx.annotation.c1;

/* compiled from: DragAndDropPermissionsCompat.java */
/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    private final DragAndDropPermissions f26919a;

    /* compiled from: DragAndDropPermissionsCompat.java */
    @androidx.annotation.x0(24)
    static class a {
        private a() {
        }

        static void a(DragAndDropPermissions dragAndDropPermissions) {
            dragAndDropPermissions.release();
        }

        static DragAndDropPermissions b(Activity activity, DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }
    }

    private a0(DragAndDropPermissions dragAndDropPermissions) {
        this.f26919a = dragAndDropPermissions;
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static a0 b(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 DragEvent dragEvent) {
        DragAndDropPermissions requestDragAndDropPermissions = activity.requestDragAndDropPermissions(dragEvent);
        if (requestDragAndDropPermissions != null) {
            return new a0(requestDragAndDropPermissions);
        }
        return null;
    }

    public void a() {
        this.f26919a.release();
    }
}
