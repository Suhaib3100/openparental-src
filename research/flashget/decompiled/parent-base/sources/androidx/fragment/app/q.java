package androidx.fragment.app;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Fragment.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001aQ\u0010\u000f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000126\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0011\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"Landroidx/fragment/app/Fragment;", "", "requestKey", "Landroid/os/Bundle;", "result", "Lkotlin/k2;", "d", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/os/Bundle;)V", "b", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "bundle", "listener", "e", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lld/p;)V", "c", "fragment-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class q {
    public static final void b(@fg.l Fragment fragment, @fg.l String requestKey) {
        kotlin.jvm.internal.l0.p(fragment, "<this>");
        kotlin.jvm.internal.l0.p(requestKey, "requestKey");
        fragment.getParentFragmentManager().d(requestKey);
    }

    public static final void c(@fg.l Fragment fragment, @fg.l String requestKey) {
        kotlin.jvm.internal.l0.p(fragment, "<this>");
        kotlin.jvm.internal.l0.p(requestKey, "requestKey");
        fragment.getParentFragmentManager().c(requestKey);
    }

    public static final void d(@fg.l Fragment fragment, @fg.l String requestKey, @fg.l Bundle result) {
        kotlin.jvm.internal.l0.p(fragment, "<this>");
        kotlin.jvm.internal.l0.p(requestKey, "requestKey");
        kotlin.jvm.internal.l0.p(result, "result");
        fragment.getParentFragmentManager().a(requestKey, result);
    }

    public static final void e(@fg.l Fragment fragment, @fg.l String requestKey, @fg.l final ld.p<? super String, ? super Bundle, k2> listener) {
        kotlin.jvm.internal.l0.p(fragment, "<this>");
        kotlin.jvm.internal.l0.p(requestKey, "requestKey");
        kotlin.jvm.internal.l0.p(listener, "listener");
        fragment.getParentFragmentManager().b(requestKey, fragment, new f0() { // from class: androidx.fragment.app.p
            @Override // androidx.fragment.app.f0
            public final void a(String str, Bundle bundle) {
                q.f(ld.p.this, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ld.p tmp0, String p02, Bundle p12) {
        kotlin.jvm.internal.l0.p(tmp0, "$tmp0");
        kotlin.jvm.internal.l0.p(p02, "p0");
        kotlin.jvm.internal.l0.p(p12, "p1");
        tmp0.invoke(p02, p12);
    }
}
