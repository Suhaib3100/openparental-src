package androidx.view;

import android.view.View;
import androidx.annotation.x0;
import fg.l;
import kotlin.Metadata;

/* compiled from: PipHintTracker.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/activity/b;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)Z", "activity-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x0(19)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final b f433a = new b();

    private b() {
    }

    public final boolean a(@l View view) {
        return view.isAttachedToWindow();
    }
}
