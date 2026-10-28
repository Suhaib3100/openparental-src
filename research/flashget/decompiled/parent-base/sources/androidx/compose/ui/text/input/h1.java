package androidx.compose.ui.text.input;

import androidx.compose.ui.graphics.y4;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: TextInputService.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0082\b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013JI\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u001a2\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u00142\u0006\u0010\"\u001a\u00020\u0014¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u000b¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u000b¢\u0006\u0004\b'\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)R\u0011\u0010+\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010&¨\u0006,"}, d2 = {"Landroidx/compose/ui/text/input/h1;", "", "Landroidx/compose/ui/text/input/b1;", "textInputService", "Landroidx/compose/ui/text/input/t0;", "platformTextInputService", "<init>", "(Landroidx/compose/ui/text/input/b1;Landroidx/compose/ui/text/input/t0;)V", "Lkotlin/Function0;", "Lkotlin/k2;", "block", "", "b", "(Lld/a;)Z", "a", "()V", "Li0/i;", "rect", "e", "(Li0/i;)Z", "Landroidx/compose/ui/text/input/z0;", "textFieldValue", "Landroidx/compose/ui/text/input/p0;", "offsetMapping", "Landroidx/compose/ui/text/n0;", "textLayoutResult", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/y4;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "h", "(Landroidx/compose/ui/text/input/z0;Landroidx/compose/ui/text/input/p0;Landroidx/compose/ui/text/n0;Lld/l;Li0/i;Li0/i;)Z", "oldValue", "newValue", "g", "(Landroidx/compose/ui/text/input/z0;Landroidx/compose/ui/text/input/z0;)Z", "f", "()Z", "c", "Landroidx/compose/ui/text/input/b1;", "Landroidx/compose/ui/text/input/t0;", "d", "isOpen", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextInputService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputService.kt\nandroidx/compose/ui/text/input/TextInputSession\n*L\n1#1,365:1\n171#1,5:366\n171#1,5:371\n171#1,5:376\n171#1,5:381\n171#1,5:386\n*S KotlinDebug\n*F\n+ 1 TextInputService.kt\nandroidx/compose/ui/text/input/TextInputSession\n*L\n190#1:366,5\n214#1:371,5\n243#1:376,5\n263#1:381,5\n280#1:386,5\n*E\n"})
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f21037c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b1 textInputService;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final t0 platformTextInputService;

    public h1(@fg.l b1 b1Var, @fg.l t0 t0Var) {
        this.textInputService = b1Var;
        this.platformTextInputService = t0Var;
    }

    private final boolean b(ld.a<k2> block) {
        boolean d5 = d();
        if (d5) {
            block.invoke();
        }
        return d5;
    }

    public final void a() {
        this.textInputService.g(this);
    }

    public final boolean c() {
        boolean d5 = d();
        if (d5) {
            this.platformTextInputService.d();
        }
        return d5;
    }

    public final boolean d() {
        return kotlin.jvm.internal.l0.g(this.textInputService.a(), this);
    }

    public final boolean e(@fg.l i0.i rect) {
        boolean d5 = d();
        if (d5) {
            this.platformTextInputService.g(rect);
        }
        return d5;
    }

    public final boolean f() {
        boolean d5 = d();
        if (d5) {
            this.platformTextInputService.h();
        }
        return d5;
    }

    public final boolean g(@fg.m z0 oldValue, @fg.l z0 newValue) {
        boolean d5 = d();
        if (d5) {
            this.platformTextInputService.e(oldValue, newValue);
        }
        return d5;
    }

    public final boolean h(@fg.l z0 textFieldValue, @fg.l p0 offsetMapping, @fg.l androidx.compose.ui.text.n0 textLayoutResult, @fg.l ld.l<? super y4, k2> textFieldToRootTransform, @fg.l i0.i innerTextFieldBounds, @fg.l i0.i decorationBoxBounds) {
        boolean d5 = d();
        if (d5) {
            this.platformTextInputService.f(textFieldValue, offsetMapping, textLayoutResult, textFieldToRootTransform, innerTextFieldBounds, decorationBoxBounds);
        }
        return d5;
    }
}
