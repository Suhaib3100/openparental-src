package androidx.view;

import android.view.View;
import androidx.view.C1457a;
import fg.m;
import kd.i;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.sequences.p;
import ld.l;

/* compiled from: ViewTreeSavedStateRegistryOwner.kt */
@i(name = "ViewTreeSavedStateRegistryOwner")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Landroidx/savedstate/e;", "owner", "Lkotlin/k2;", "b", "(Landroid/view/View;Landroidx/savedstate/e;)V", "a", "(Landroid/view/View;)Landroidx/savedstate/e;", "savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.savedstate.g, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1463g {

    /* compiled from: ViewTreeSavedStateRegistryOwner.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "view", "a", "(Landroid/view/View;)Landroid/view/View;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.savedstate.g$a, reason: from Kotlin metadata and collision with other inner class name */
    static final class C0616a extends n0 implements l<View, View> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0616a f34021b = new C0616a(1);

        C0616a() {
            super(1);
        }

        @Override // ld.l
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke(@fg.l View view) {
            l0.p(view, "view");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* compiled from: ViewTreeSavedStateRegistryOwner.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Landroidx/savedstate/e;", "a", "(Landroid/view/View;)Landroidx/savedstate/e;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.savedstate.g$b, reason: from Kotlin metadata and collision with other inner class name */
    static final class C0617b extends n0 implements l<View, InterfaceC1461e> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0617b f34022b = new C0617b(1);

        C0617b() {
            super(1);
        }

        @Override // ld.l
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1461e invoke(@fg.l View view) {
            l0.p(view, "view");
            Object tag = view.getTag(C1457a.C0614a.f34007a);
            if (tag instanceof InterfaceC1461e) {
                return (InterfaceC1461e) tag;
            }
            return null;
        }
    }

    @m
    @i(name = "get")
    public static final InterfaceC1461e a(@fg.l View view) {
        l0.p(view, "<this>");
        return (InterfaceC1461e) p.F0(p.p1(p.l(view, C0616a.f34021b), C0617b.f34022b));
    }

    @i(name = "set")
    public static final void b(@fg.l View view, @m InterfaceC1461e interfaceC1461e) {
        l0.p(view, "<this>");
        view.setTag(C1457a.C0614a.f34007a, interfaceC1461e);
    }
}
