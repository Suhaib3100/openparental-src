package androidx.compose.ui.platform;

import androidx.view.AbstractC1450w;
import androidx.view.InterfaceC1416b0;
import androidx.view.InterfaceC1423e0;
import kotlin.Metadata;

/* compiled from: ViewCompositionStrategy.android.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Landroidx/lifecycle/w;", "lifecycle", "Lkotlin/Function0;", "Lkotlin/k2;", "c", "(Landroidx/compose/ui/platform/AbstractComposeView;Landroidx/lifecycle/w;)Lld/a;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r5 {

    /* compiled from: ViewCompositionStrategy.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC1450w f20106b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC1416b0 f20107c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC1450w abstractC1450w, InterfaceC1416b0 interfaceC1416b0) {
            super(0);
            this.f20106b = abstractC1450w;
            this.f20107c = interfaceC1416b0;
        }

        public final void a() {
            this.f20106b.d(this.f20107c);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ld.a<kotlin.k2> c(final AbstractComposeView abstractComposeView, AbstractC1450w abstractC1450w) {
        if (abstractC1450w.getState().compareTo(AbstractC1450w.b.DESTROYED) > 0) {
            InterfaceC1416b0 interfaceC1416b0 = new InterfaceC1416b0() { // from class: androidx.compose.ui.platform.q5
                @Override // androidx.view.InterfaceC1416b0
                public final void f(InterfaceC1423e0 interfaceC1423e0, AbstractC1450w.a aVar) {
                    r5.d(AbstractComposeView.this, interfaceC1423e0, aVar);
                }
            };
            abstractC1450w.a(interfaceC1416b0);
            return new a(abstractC1450w, interfaceC1416b0);
        }
        throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + abstractC1450w + "is already destroyed").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AbstractComposeView abstractComposeView, InterfaceC1423e0 interfaceC1423e0, AbstractC1450w.a aVar) {
        if (aVar == AbstractC1450w.a.ON_DESTROY) {
            abstractComposeView.i();
        }
    }
}
