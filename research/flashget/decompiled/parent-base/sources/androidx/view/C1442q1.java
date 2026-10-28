package androidx.view;

import android.view.View;
import fg.m;
import j2.a;
import kd.i;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.sequences.p;
import ld.l;

/* compiled from: ViewTreeLifecycleOwner.kt */
@i(name = "ViewTreeLifecycleOwner")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Landroidx/lifecycle/e0;", "lifecycleOwner", "Lkotlin/k2;", "b", "(Landroid/view/View;Landroidx/lifecycle/e0;)V", "a", "(Landroid/view/View;)Landroidx/lifecycle/e0;", "lifecycle-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.q1, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1442q1 {

    /* compiled from: ViewTreeLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "currentView", "a", "(Landroid/view/View;)Landroid/view/View;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.q1$a, reason: from Kotlin metadata and collision with other inner class name */
    static final class C0497a extends n0 implements l<View, View> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0497a f30417b = new C0497a(1);

        C0497a() {
            super(1);
        }

        @Override // ld.l
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke(@fg.l View currentView) {
            l0.p(currentView, "currentView");
            Object parent = currentView.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* compiled from: ViewTreeLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "viewParent", "Landroidx/lifecycle/e0;", "a", "(Landroid/view/View;)Landroidx/lifecycle/e0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.q1$b, reason: from Kotlin metadata and collision with other inner class name */
    static final class C0498b extends n0 implements l<View, InterfaceC1423e0> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0498b f30418b = new C0498b(1);

        C0498b() {
            super(1);
        }

        @Override // ld.l
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1423e0 invoke(@fg.l View viewParent) {
            l0.p(viewParent, "viewParent");
            Object tag = viewParent.getTag(a.C1034a.f74488a);
            if (tag instanceof InterfaceC1423e0) {
                return (InterfaceC1423e0) tag;
            }
            return null;
        }
    }

    @m
    @i(name = "get")
    public static final InterfaceC1423e0 a(@fg.l View view) {
        l0.p(view, "<this>");
        return (InterfaceC1423e0) p.F0(p.p1(p.l(view, C0497a.f30417b), C0498b.f30418b));
    }

    @i(name = "set")
    public static final void b(@fg.l View view, @m InterfaceC1423e0 interfaceC1423e0) {
        l0.p(view, "<this>");
        view.setTag(a.C1034a.f74488a, interfaceC1423e0);
    }
}
