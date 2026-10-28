package android.view;

import android.view.i;
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

/* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
@i(name = "ViewTreeOnBackPressedDispatcherOwner")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Landroidx/activity/h;", "onBackPressedDispatcherOwner", "Lkotlin/m2;", "b", "(Landroid/view/View;Landroidx/activity/h;)V", "a", "(Landroid/view/View;)Landroidx/activity/h;", "activity_release"}, k = 2, mv = {1, 6, 0})
/* renamed from: androidx.activity.j, reason: from Kotlin metadata */
/* loaded from: classes.dex */
public final class View {

    /* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "it", "a", "(Landroid/view/View;)Landroid/view/View;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: androidx.activity.j$a, reason: from Kotlin metadata and collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0003a extends Lambda implements l<android.view.View, android.view.View> {

        /* renamed from: p, reason: collision with root package name */
        public static final C0003a f98p = new C0003a();

        C0003a() {
            super(1);
        }

        @Override // q3.l
        @e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final android.view.View N(@d android.view.View it) {
            l0.p(it, "it");
            Object parent = it.getParent();
            if (parent instanceof android.view.View) {
                return (android.view.View) parent;
            }
            return null;
        }
    }

    /* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Landroidx/activity/h;", "a", "(Landroid/view/View;)Landroidx/activity/h;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: androidx.activity.j$b, reason: from Kotlin metadata and collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0004b extends Lambda implements l<android.view.View, h> {

        /* renamed from: p, reason: collision with root package name */
        public static final C0004b f99p = new C0004b();

        C0004b() {
            super(1);
        }

        @Override // q3.l
        @e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h N(@d android.view.View it) {
            l0.p(it, "it");
            Object tag = it.getTag(i.a.f97a);
            if (tag instanceof h) {
                return (h) tag;
            }
            return null;
        }
    }

    @p3.i(name = "get")
    @e
    public static final h a(@d android.view.View view) {
        Sequence l5;
        Sequence p12;
        Object F0;
        l0.p(view, "<this>");
        l5 = s.l(view, C0003a.f98p);
        p12 = v.p1(l5, C0004b.f99p);
        F0 = v.F0(p12);
        return (h) F0;
    }

    @p3.i(name = "set")
    public static final void b(@d android.view.View view, @d h onBackPressedDispatcherOwner) {
        l0.p(view, "<this>");
        l0.p(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(i.a.f97a, onBackPressedDispatcherOwner);
    }
}
