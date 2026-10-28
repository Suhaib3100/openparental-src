package androidx.compose.ui.platform;

import kotlin.Metadata;

/* compiled from: SoftwareKeyboardController.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/k1;", "Landroidx/compose/ui/platform/g5;", "Landroidx/compose/ui/text/input/b1;", "textInputService", "<init>", "(Landroidx/compose/ui/text/input/b1;)V", "Lkotlin/k2;", "b", "()V", "a", "Landroidx/compose/ui/text/input/b1;", "c", "()Landroidx/compose/ui/text/input/b1;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k1 implements g5 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f19956b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.input.b1 textInputService;

    public k1(@fg.l androidx.compose.ui.text.input.b1 b1Var) {
        this.textInputService = b1Var;
    }

    @Override // androidx.compose.ui.platform.g5
    public void a() {
        this.textInputService.b();
    }

    @Override // androidx.compose.ui.platform.g5
    public void b() {
        this.textInputService.c();
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final androidx.compose.ui.text.input.b1 getTextInputService() {
        return this.textInputService;
    }
}
