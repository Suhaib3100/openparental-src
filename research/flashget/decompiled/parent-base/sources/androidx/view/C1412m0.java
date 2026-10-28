package androidx.view;

import android.view.View;
import androidx.view.j0;
import fg.m;
import kd.i;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.sequences.p;
import ld.l;

/* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
@i(name = "ViewTreeOnBackPressedDispatcherOwner")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Landroidx/activity/f0;", "onBackPressedDispatcherOwner", "Lkotlin/k2;", "b", "(Landroid/view/View;Landroidx/activity/f0;)V", "a", "(Landroid/view/View;)Landroidx/activity/f0;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.activity.m0, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1412m0 {

    /* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "it", "a", "(Landroid/view/View;)Landroid/view/View;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.activity.m0$a, reason: from Kotlin metadata and collision with other inner class name */
    static final class C0010a extends n0 implements l<View, View> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0010a f566b = new C0010a(1);

        C0010a() {
            super(1);
        }

        @Override // ld.l
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke(@fg.l View it) {
            l0.p(it, "it");
            Object parent = it.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Landroidx/activity/f0;", "a", "(Landroid/view/View;)Landroidx/activity/f0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.activity.m0$b, reason: from Kotlin metadata and collision with other inner class name */
    static final class C0011b extends n0 implements l<View, f0> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0011b f567b = new C0011b(1);

        C0011b() {
            super(1);
        }

        @Override // ld.l
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f0 invoke(@fg.l View it) {
            l0.p(it, "it");
            Object tag = it.getTag(j0.a.f553b);
            if (tag instanceof f0) {
                return (f0) tag;
            }
            return null;
        }
    }

    @m
    @i(name = "get")
    public static final f0 a(@fg.l View view) {
        l0.p(view, "<this>");
        return (f0) p.F0(p.p1(p.l(view, C0010a.f566b), C0011b.f567b));
    }

    @i(name = "set")
    public static final void b(@fg.l View view, @fg.l f0 onBackPressedDispatcherOwner) {
        l0.p(view, "<this>");
        l0.p(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(j0.a.f553b, onBackPressedDispatcherOwner);
    }
}
