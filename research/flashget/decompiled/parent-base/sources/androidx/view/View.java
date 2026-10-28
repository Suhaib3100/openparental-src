package androidx.view;

import androidx.view.j0;
import fg.m;
import kd.i;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.sequences.p;
import ld.l;

/* compiled from: ViewTreeFullyLoadedReporterOwner.kt */
@i(name = "ViewTreeFullyDrawnReporterOwner")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Landroidx/activity/b0;", "fullyDrawnReporterOwner", "Lkotlin/k2;", "b", "(Landroid/view/View;Landroidx/activity/b0;)V", "a", "(Landroid/view/View;)Landroidx/activity/b0;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.activity.l0, reason: from Kotlin metadata */
/* loaded from: classes.dex */
public final class View {

    /* compiled from: ViewTreeFullyLoadedReporterOwner.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "it", "a", "(Landroid/view/View;)Landroid/view/View;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.activity.l0$a, reason: from Kotlin metadata and collision with other inner class name */
    static final class C0008a extends n0 implements l<android.view.View, android.view.View> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0008a f564b = new C0008a(1);

        C0008a() {
            super(1);
        }

        @Override // ld.l
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final android.view.View invoke(@fg.l android.view.View it) {
            l0.p(it, "it");
            Object parent = it.getParent();
            if (parent instanceof android.view.View) {
                return (android.view.View) parent;
            }
            return null;
        }
    }

    /* compiled from: ViewTreeFullyLoadedReporterOwner.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Landroidx/activity/b0;", "a", "(Landroid/view/View;)Landroidx/activity/b0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.activity.l0$b, reason: from Kotlin metadata and collision with other inner class name */
    static final class C0009b extends n0 implements l<android.view.View, b0> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0009b f565b = new C0009b(1);

        C0009b() {
            super(1);
        }

        @Override // ld.l
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b0 invoke(@fg.l android.view.View it) {
            l0.p(it, "it");
            Object tag = it.getTag(j0.a.f552a);
            if (tag instanceof b0) {
                return (b0) tag;
            }
            return null;
        }
    }

    @m
    @i(name = "get")
    public static final b0 a(@fg.l android.view.View view) {
        l0.p(view, "<this>");
        return (b0) p.F0(p.p1(p.l(view, C0008a.f564b), C0009b.f565b));
    }

    @i(name = "set")
    public static final void b(@fg.l android.view.View view, @fg.l b0 fullyDrawnReporterOwner) {
        l0.p(view, "<this>");
        l0.p(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(j0.a.f552a, fullyDrawnReporterOwner);
    }
}
