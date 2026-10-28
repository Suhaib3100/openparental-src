package h0;

import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;
import androidx.annotation.x0;
import kotlin.Metadata;

/* compiled from: AutofillCallback.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lh0/y;", "Landroid/view/autofill/AutofillManager$AutofillCallback;", "<init>", "()V", "Landroid/view/View;", "view", "", "virtualId", "event", "Lkotlin/k2;", "onAutofillEvent", "(Landroid/view/View;II)V", "Lh0/f;", "autofill", "a", "(Lh0/f;)V", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x0(26)
/* loaded from: classes.dex */
public final class y extends AutofillManager$AutofillCallback {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final y f73926a = new y();

    /* renamed from: b, reason: collision with root package name */
    public static final int f73927b = 0;

    private y() {
    }

    @androidx.annotation.u
    @androidx.compose.ui.k
    public final void a(@fg.l f autofill) {
        autofill.getAutofillManager().registerCallback(v.a(this));
    }

    @androidx.annotation.u
    @androidx.compose.ui.k
    public final void b(@fg.l f autofill) {
        autofill.getAutofillManager().unregisterCallback(v.a(this));
    }

    public void onAutofillEvent(@fg.l View view, int virtualId, int event) {
        super.onAutofillEvent(view, virtualId, event);
    }
}
