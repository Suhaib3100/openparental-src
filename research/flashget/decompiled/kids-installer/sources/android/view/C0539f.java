package android.view;

import android.view.C0534a;
import android.view.View;
import d5.d;
import d5.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.sequences.Sequence;
import kotlin.sequences.s;
import kotlin.sequences.v;
import p3.i;
import q3.l;

/* compiled from: ViewTreeSavedStateRegistryOwner.kt */
@i(name = "ViewTreeSavedStateRegistryOwner")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Landroidx/savedstate/e;", "owner", "Lkotlin/m2;", "b", "(Landroid/view/View;Landroidx/savedstate/e;)V", "a", "(Landroid/view/View;)Landroidx/savedstate/e;", "savedstate_release"}, k = 2, mv = {1, 6, 0})
/* renamed from: androidx.savedstate.f, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0539f {

    /* compiled from: ViewTreeSavedStateRegistryOwner.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "view", "a", "(Landroid/view/View;)Landroid/view/View;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: androidx.savedstate.f$a, reason: from Kotlin metadata and collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0118a extends Lambda implements l<View, View> {

        /* renamed from: p, reason: collision with root package name */
        public static final C0118a f9639p = new C0118a();

        C0118a() {
            super(1);
        }

        @Override // q3.l
        @e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View N(@d View view) {
            l0.p(view, "view");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* compiled from: ViewTreeSavedStateRegistryOwner.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Landroidx/savedstate/e;", "a", "(Landroid/view/View;)Landroidx/savedstate/e;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: androidx.savedstate.f$b, reason: from Kotlin metadata and collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0119b extends Lambda implements l<View, InterfaceC0538e> {

        /* renamed from: p, reason: collision with root package name */
        public static final C0119b f9640p = new C0119b();

        C0119b() {
            super(1);
        }

        @Override // q3.l
        @e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0538e N(@d View view) {
            l0.p(view, "view");
            Object tag = view.getTag(C0534a.C0116a.f9625a);
            if (tag instanceof InterfaceC0538e) {
                return (InterfaceC0538e) tag;
            }
            return null;
        }
    }

    @i(name = "get")
    @e
    public static final InterfaceC0538e a(@d View view) {
        Sequence l5;
        Sequence p12;
        Object F0;
        l0.p(view, "<this>");
        l5 = s.l(view, C0118a.f9639p);
        p12 = v.p1(l5, C0119b.f9640p);
        F0 = v.F0(p12);
        return (InterfaceC0538e) F0;
    }

    @i(name = "set")
    public static final void b(@d View view, @e InterfaceC0538e interfaceC0538e) {
        l0.p(view, "<this>");
        view.setTag(C0534a.C0116a.f9625a, interfaceC0538e);
    }
}
