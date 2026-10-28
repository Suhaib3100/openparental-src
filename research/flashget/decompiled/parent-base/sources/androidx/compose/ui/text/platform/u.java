package androidx.compose.ui.text.platform;

import androidx.annotation.m1;
import androidx.compose.runtime.b5;
import kotlin.Metadata;

/* compiled from: EmojiCompatStatus.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/platform/u;", "Landroidx/compose/ui/text/platform/v;", "<init>", "()V", "newDelegate", "Lkotlin/k2;", "b", "(Landroidx/compose/ui/text/platform/v;)V", "Landroidx/compose/ui/text/platform/v;", "delegate", "Landroidx/compose/runtime/b5;", "", "a", "()Landroidx/compose/runtime/b5;", "fontLoaded", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u implements v {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final u f21288a = new u();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static v delegate = new s();

    /* renamed from: c, reason: collision with root package name */
    public static final int f21290c = 8;

    private u() {
    }

    @Override // androidx.compose.ui.text.platform.v
    @fg.l
    public b5<Boolean> a() {
        return delegate.a();
    }

    @m1
    public final void b(@fg.m v newDelegate) {
        if (newDelegate == null) {
            newDelegate = new s();
        }
        delegate = newDelegate;
    }
}
