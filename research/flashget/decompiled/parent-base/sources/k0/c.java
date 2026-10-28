package k0;

import android.view.View;
import androidx.compose.runtime.internal.u;
import fg.l;
import k0.b;
import kotlin.Metadata;

/* compiled from: PlatformHapticFeedback.android.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Lk0/c;", "Lk0/a;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lk0/b;", "hapticFeedbackType", "Lkotlin/k2;", "a", "(I)V", "Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: b, reason: collision with root package name */
    public static final int f74802b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final View view;

    public c(@l View view) {
        this.view = view;
    }

    @Override // k0.a
    public void a(int hapticFeedbackType) {
        b.Companion companion = b.INSTANCE;
        companion.getClass();
        d dVar = d.f74804a;
        if (b.d(hapticFeedbackType, dVar.a())) {
            this.view.performHapticFeedback(0);
            return;
        }
        companion.getClass();
        if (b.d(hapticFeedbackType, dVar.b())) {
            this.view.performHapticFeedback(9);
        }
    }
}
