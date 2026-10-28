package re;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: UIUtil.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lre/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/widget/EditText;", "target", "Lkotlin/k2;", "d", "(Landroid/content/Context;Landroid/widget/EditText;)V", "Landroid/app/Dialog;", "dialog", "e", "(Landroid/app/Dialog;Landroid/widget/EditText;)V", "Landroid/view/View;", "c", "(Landroid/content/Context;Landroid/view/View;)V", "Landroid/app/Activity;", "activity", "b", "(Landroid/app/Activity;)V", "Landroid/view/inputmethod/InputMethodManager;", "a", "(Landroid/content/Context;)Landroid/view/inputmethod/InputMethodManager;", "keyboardvisibilityevent_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final a f89868a = new a();

    private a() {
    }

    private final InputMethodManager a(Context context) {
        Object systemService = context.getSystemService(ProtectedSandApp.s("ꌁ\u0001"));
        if (systemService != null) {
            return (InputMethodManager) systemService;
        }
        throw new NullPointerException(ProtectedSandApp.s("ꌂ\u0001"));
    }

    @n
    public static final void b(@l Activity activity) {
        l0.p(activity, ProtectedSandApp.s("ꌃ\u0001"));
        Window window = activity.getWindow();
        l0.o(window, ProtectedSandApp.s("ꌄ\u0001"));
        View decorView = window.getDecorView();
        l0.o(decorView, ProtectedSandApp.s("ꌅ\u0001"));
        c(activity, decorView);
    }

    @n
    public static final void c(@l Context context, @l View target) {
        l0.p(context, ProtectedSandApp.s("ꌆ\u0001"));
        l0.p(target, ProtectedSandApp.s("ꌇ\u0001"));
        f89868a.a(context).hideSoftInputFromWindow(target.getWindowToken(), 0);
    }

    @n
    public static final void d(@l Context context, @l EditText target) {
        l0.p(context, ProtectedSandApp.s("ꌆ\u0001"));
        l0.p(target, ProtectedSandApp.s("ꌇ\u0001"));
        f89868a.a(context).showSoftInput(target, 1);
    }

    @n
    public static final void e(@l Dialog dialog, @l EditText target) {
        l0.p(dialog, ProtectedSandApp.s("ꌈ\u0001"));
        l0.p(target, ProtectedSandApp.s("ꌇ\u0001"));
        Window window = dialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(4);
        }
        target.requestFocus();
    }
}
