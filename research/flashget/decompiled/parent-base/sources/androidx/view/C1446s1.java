package androidx.view;

import android.view.View;
import fg.m;
import kd.i;
import kotlin.C1482f;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.sequences.p;
import ld.l;

/* compiled from: ViewTreeViewModelStoreOwner.kt */
@i(name = "ViewTreeViewModelStoreOwner")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Landroidx/lifecycle/o1;", "viewModelStoreOwner", "Lkotlin/k2;", "b", "(Landroid/view/View;Landroidx/lifecycle/o1;)V", "a", "(Landroid/view/View;)Landroidx/lifecycle/o1;", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.s1, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1446s1 {

    /* compiled from: ViewTreeViewModelStoreOwner.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "view", "a", "(Landroid/view/View;)Landroid/view/View;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.s1$a, reason: from Kotlin metadata and collision with other inner class name */
    static final class C0501a extends n0 implements l<View, View> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0501a f30442b = new C0501a(1);

        C0501a() {
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

    /* compiled from: ViewTreeViewModelStoreOwner.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Landroidx/lifecycle/o1;", "a", "(Landroid/view/View;)Landroidx/lifecycle/o1;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.s1$b, reason: from Kotlin metadata and collision with other inner class name */
    static final class C0502b extends n0 implements l<View, o1> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0502b f30443b = new C0502b(1);

        C0502b() {
            super(1);
        }

        @Override // ld.l
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o1 invoke(@fg.l View view) {
            l0.p(view, "view");
            Object tag = view.getTag(C1482f.a.f81494a);
            if (tag instanceof o1) {
                return (o1) tag;
            }
            return null;
        }
    }

    @m
    @i(name = "get")
    public static final o1 a(@fg.l View view) {
        l0.p(view, "<this>");
        return (o1) p.F0(p.p1(p.l(view, C0501a.f30442b), C0502b.f30443b));
    }

    @i(name = "set")
    public static final void b(@fg.l View view, @m o1 o1Var) {
        l0.p(view, "<this>");
        view.setTag(C1482f.a.f81494a, o1Var);
    }
}
