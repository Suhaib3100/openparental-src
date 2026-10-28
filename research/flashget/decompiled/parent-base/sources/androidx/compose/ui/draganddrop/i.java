package androidx.compose.ui.draganddrop;

import android.content.ClipDescription;
import android.view.DragEvent;
import fg.l;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.builders.j;
import kotlin.collections.l0;
import kotlin.collections.l1;

/* compiled from: DragAndDrop.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0018\u0010\u000b\u001a\u00020\b*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/draganddrop/b;", "Landroid/view/DragEvent;", "c", "(Landroidx/compose/ui/draganddrop/b;)Landroid/view/DragEvent;", "", "", "b", "(Landroidx/compose/ui/draganddrop/b;)Ljava/util/Set;", "Li0/f;", "a", "(Landroidx/compose/ui/draganddrop/b;)J", "positionInRoot", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {
    public static final long a(@l b bVar) {
        return i0.g.a(bVar.getDragEvent().getX(), bVar.getDragEvent().getY());
    }

    @l
    public static final Set<String> b(@l b bVar) {
        ClipDescription clipDescription = bVar.getDragEvent().getClipDescription();
        if (clipDescription == null) {
            return l0.f74939b;
        }
        j jVar = new j(clipDescription.getMimeTypeCount());
        int mimeTypeCount = clipDescription.getMimeTypeCount();
        for (int i4 = 0; i4 < mimeTypeCount; i4++) {
            jVar.add(clipDescription.getMimeType(i4));
        }
        return l1.a(jVar);
    }

    @l
    public static final DragEvent c(@l b bVar) {
        return bVar.getDragEvent();
    }
}
