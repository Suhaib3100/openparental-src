package androidx.view;

import androidx.view.InterfaceC1423e0;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import ld.l;

/* compiled from: OnBackPressedDispatcher.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\n\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "Landroidx/lifecycle/e0;", "owner", "", "enabled", "Lkotlin/Function1;", "Landroidx/activity/c0;", "Lkotlin/k2;", "Lkotlin/u;", "onBackPressed", "a", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/e0;ZLld/l;)Landroidx/activity/c0;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e0 {

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/activity/e0$a", "Landroidx/activity/c0;", "Lkotlin/k2;", "handleOnBackPressed", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends c0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l<c0, k2> f526a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z4, l<? super c0, k2> lVar) {
            super(z4);
            this.f526a = lVar;
        }

        @Override // androidx.view.c0
        public void handleOnBackPressed() {
            this.f526a.invoke(this);
        }
    }

    @fg.l
    public static final c0 a(@fg.l OnBackPressedDispatcher onBackPressedDispatcher, @m InterfaceC1423e0 interfaceC1423e0, boolean z4, @fg.l l<? super c0, k2> onBackPressed) {
        l0.p(onBackPressedDispatcher, "<this>");
        l0.p(onBackPressed, "onBackPressed");
        a aVar = new a(z4, onBackPressed);
        if (interfaceC1423e0 != null) {
            onBackPressedDispatcher.i(interfaceC1423e0, aVar);
        } else {
            onBackPressedDispatcher.h(aVar);
        }
        return aVar;
    }

    public static /* synthetic */ c0 b(OnBackPressedDispatcher onBackPressedDispatcher, InterfaceC1423e0 interfaceC1423e0, boolean z4, l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            interfaceC1423e0 = null;
        }
        if ((i4 & 2) != 0) {
            z4 = true;
        }
        return a(onBackPressedDispatcher, interfaceC1423e0, z4, lVar);
    }
}
