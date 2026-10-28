package androidx.window.sidecar;

import android.app.Activity;
import fg.l;
import kotlin.Metadata;

/* compiled from: ExtensionInterfaceCompat.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0001\bJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/window/layout/n;", "", "", "d", "()Z", "Landroidx/window/layout/n$a;", "extensionCallback", "Lkotlin/k2;", "a", "(Landroidx/window/layout/n$a;)V", "Landroid/app/Activity;", "activity", "b", "(Landroid/app/Activity;)V", "c", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface n {

    /* compiled from: ExtensionInterfaceCompat.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/window/layout/n$a;", "", "Landroid/app/Activity;", "activity", "Landroidx/window/layout/b0;", "newLayout", "Lkotlin/k2;", "a", "(Landroid/app/Activity;Landroidx/window/layout/b0;)V", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface a {
        void a(@l Activity activity, @l b0 newLayout);
    }

    void a(@l a extensionCallback);

    void b(@l Activity activity);

    void c(@l Activity activity);

    boolean d();
}
