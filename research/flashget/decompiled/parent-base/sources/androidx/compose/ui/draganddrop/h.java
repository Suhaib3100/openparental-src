package androidx.compose.ui.draganddrop;

import android.content.ClipData;
import androidx.compose.runtime.internal.u;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: DragAndDrop.android.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\f\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/draganddrop/h;", "", "Landroid/content/ClipData;", "clipData", "localState", "", "flags", "<init>", "(Landroid/content/ClipData;Ljava/lang/Object;I)V", "a", "Landroid/content/ClipData;", "()Landroid/content/ClipData;", "b", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "I", "()I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final int f17414d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final ClipData clipData;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private final Object localState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int flags;

    public h(@l ClipData clipData, @m Object obj, int i4) {
        this.clipData = clipData;
        this.localState = obj;
        this.flags = i4;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final ClipData getClipData() {
        return this.clipData;
    }

    /* renamed from: b, reason: from getter */
    public final int getFlags() {
        return this.flags;
    }

    @m
    /* renamed from: c, reason: from getter */
    public final Object getLocalState() {
        return this.localState;
    }

    public /* synthetic */ h(ClipData clipData, Object obj, int i4, int i5, w wVar) {
        this(clipData, (i5 & 2) != 0 ? null : obj, (i5 & 4) != 0 ? 0 : i4);
    }
}
