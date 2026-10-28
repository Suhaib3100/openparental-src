package androidx.compose.ui.node;

import kotlin.Metadata;

/* compiled from: NodeKind.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR$\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/node/e;", "Landroidx/compose/ui/focus/t;", "<init>", "()V", "", "a", "()Z", "Lkotlin/k2;", "b", "Ljava/lang/Boolean;", "canFocusValue", "value", "t", "m", "(Z)V", "canFocus", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nNodeKind.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/CanFocusChecker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,342:1\n1#2:343\n*E\n"})
/* loaded from: classes.dex */
final class e implements androidx.compose.ui.focus.t {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final e f19227a = new e();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private static Boolean canFocusValue;

    private e() {
    }

    public final boolean a() {
        return canFocusValue != null;
    }

    public final void b() {
        canFocusValue = null;
    }

    @Override // androidx.compose.ui.focus.t
    public void m(boolean z4) {
        canFocusValue = Boolean.valueOf(z4);
    }

    @Override // androidx.compose.ui.focus.t
    public boolean t() {
        Boolean bool = canFocusValue;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("canFocus is read before it is written");
    }
}
