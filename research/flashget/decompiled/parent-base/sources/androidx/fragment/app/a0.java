package androidx.fragment.app;

import kotlin.Metadata;
import kotlin.k2;

/* compiled from: FragmentManager.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a:\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a:\u0010\n\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\t\u001aD\u0010\f\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"Landroidx/fragment/app/FragmentManager;", "", "allowStateLoss", "Lkotlin/Function1;", "Landroidx/fragment/app/l0;", "Lkotlin/k2;", "Lkotlin/u;", "body", "a", "(Landroidx/fragment/app/FragmentManager;ZLld/l;)V", "c", "now", "e", "(Landroidx/fragment/app/FragmentManager;ZZLld/l;)V", "fragment-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class a0 {
    public static final void a(@fg.l FragmentManager fragmentManager, boolean z4, @fg.l ld.l<? super l0, k2> body) {
        kotlin.jvm.internal.l0.p(fragmentManager, "<this>");
        kotlin.jvm.internal.l0.p(body, "body");
        l0 u4 = fragmentManager.u();
        kotlin.jvm.internal.l0.o(u4, "beginTransaction()");
        body.invoke(u4);
        if (z4) {
            u4.s();
        } else {
            u4.r();
        }
    }

    public static /* synthetic */ void b(FragmentManager fragmentManager, boolean z4, ld.l body, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        kotlin.jvm.internal.l0.p(fragmentManager, "<this>");
        kotlin.jvm.internal.l0.p(body, "body");
        l0 u4 = fragmentManager.u();
        kotlin.jvm.internal.l0.o(u4, "beginTransaction()");
        body.invoke(u4);
        if (z4) {
            u4.s();
        } else {
            u4.r();
        }
    }

    public static final void c(@fg.l FragmentManager fragmentManager, boolean z4, @fg.l ld.l<? super l0, k2> body) {
        kotlin.jvm.internal.l0.p(fragmentManager, "<this>");
        kotlin.jvm.internal.l0.p(body, "body");
        l0 u4 = fragmentManager.u();
        kotlin.jvm.internal.l0.o(u4, "beginTransaction()");
        body.invoke(u4);
        if (z4) {
            u4.u();
        } else {
            u4.t();
        }
    }

    public static /* synthetic */ void d(FragmentManager fragmentManager, boolean z4, ld.l body, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        kotlin.jvm.internal.l0.p(fragmentManager, "<this>");
        kotlin.jvm.internal.l0.p(body, "body");
        l0 u4 = fragmentManager.u();
        kotlin.jvm.internal.l0.o(u4, "beginTransaction()");
        body.invoke(u4);
        if (z4) {
            u4.u();
        } else {
            u4.t();
        }
    }

    @kotlin.k(message = "Use commit { .. } or commitNow { .. } extensions")
    public static final void e(@fg.l FragmentManager fragmentManager, boolean z4, boolean z5, @fg.l ld.l<? super l0, k2> body) {
        kotlin.jvm.internal.l0.p(fragmentManager, "<this>");
        kotlin.jvm.internal.l0.p(body, "body");
        l0 u4 = fragmentManager.u();
        kotlin.jvm.internal.l0.o(u4, "beginTransaction()");
        body.invoke(u4);
        if (z4) {
            if (z5) {
                u4.u();
                return;
            } else {
                u4.t();
                return;
            }
        }
        if (z5) {
            u4.s();
        } else {
            u4.r();
        }
    }

    public static /* synthetic */ void f(FragmentManager fragmentManager, boolean z4, boolean z5, ld.l body, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        if ((i4 & 2) != 0) {
            z5 = false;
        }
        kotlin.jvm.internal.l0.p(fragmentManager, "<this>");
        kotlin.jvm.internal.l0.p(body, "body");
        l0 u4 = fragmentManager.u();
        kotlin.jvm.internal.l0.o(u4, "beginTransaction()");
        body.invoke(u4);
        if (z4) {
            if (z5) {
                u4.u();
                return;
            } else {
                u4.t();
                return;
            }
        }
        if (z5) {
            u4.s();
        } else {
            u4.r();
        }
    }
}
