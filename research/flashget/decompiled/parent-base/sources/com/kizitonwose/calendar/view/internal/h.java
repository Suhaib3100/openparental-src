package com.kizitonwose.calendar.view.internal;

import android.content.Context;
import android.view.ViewGroup;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.z0;

/* compiled from: CustomViewClass.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\u0007\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"", "customViewClass", "Landroid/view/ViewGroup;", "rootLayout", "Lkotlin/Function1;", "Lkotlin/k2;", "setupRoot", "a", "(Ljava/lang/String;Landroid/view/ViewGroup;Lld/l;)Landroid/view/ViewGroup;", "Ljava/lang/String;", "EXAMPLE_CUSTOM_CLASS_URL", "Calendar-View_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nCustomViewClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomViewClass.kt\ncom/kizitonwose/calendar/view/internal/CustomViewClassKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final String f66746a = ProtectedSandApp.s("ᓮ\u0001");

    @fg.l
    public static final ViewGroup a(@fg.m String str, @fg.l ViewGroup viewGroup, @fg.l ld.l<? super ViewGroup, k2> lVar) {
        Object a5;
        l0.p(viewGroup, ProtectedSandApp.s("ᓫ\u0001"));
        l0.p(lVar, ProtectedSandApp.s("ᓬ\u0001"));
        if (str != null) {
            try {
                z0.Companion companion = z0.INSTANCE;
                Object newInstance = Class.forName(str).getDeclaredConstructor(Context.class).newInstance(viewGroup.getContext());
                l0.n(newInstance, ProtectedSandApp.s("ᓭ\u0001"));
                a5 = (ViewGroup) newInstance;
            } catch (Throwable th) {
                z0.Companion companion2 = z0.INSTANCE;
                a5 = a1.a(th);
            }
            z0.e(a5);
            ViewGroup viewGroup2 = null;
            if (a5 instanceof z0.b) {
                a5 = null;
            }
            ViewGroup viewGroup3 = (ViewGroup) a5;
            if (viewGroup3 != null) {
                lVar.invoke(viewGroup3);
                viewGroup3.addView(viewGroup);
                viewGroup2 = viewGroup3;
            }
            if (viewGroup2 != null) {
                return viewGroup2;
            }
        }
        lVar.invoke(viewGroup);
        return viewGroup;
    }
}
