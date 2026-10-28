package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import androidx.compose.runtime.internal.u;
import fg.l;
import kotlin.Metadata;

/* compiled from: DragAndDrop.android.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/draganddrop/b;", "", "Landroid/view/DragEvent;", "dragEvent", "<init>", "(Landroid/view/DragEvent;)V", "a", "Landroid/view/DragEvent;", "()Landroid/view/DragEvent;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final int f17393b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final DragEvent dragEvent;

    public b(@l DragEvent dragEvent) {
        this.dragEvent = dragEvent;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final DragEvent getDragEvent() {
        return this.dragEvent;
    }
}
