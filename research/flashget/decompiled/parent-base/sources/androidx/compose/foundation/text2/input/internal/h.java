package androidx.compose.foundation.text2.input.internal;

import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: ComposeInputMethodManager.android.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u001a\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010!¨\u0006#"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/h;", "Landroidx/compose/foundation/text2/input/internal/g;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Landroid/view/inputmethod/InputMethodManager;", "f", "()Landroid/view/inputmethod/InputMethodManager;", "Lkotlin/k2;", "d", "()V", "b", "e", "", "token", "Landroid/view/inputmethod/ExtractedText;", "extractedText", "a", "(ILandroid/view/inputmethod/ExtractedText;)V", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "c", "(IIII)V", "h", "Landroid/view/View;", "g", "()Landroid/view/View;", "Landroid/view/inputmethod/InputMethodManager;", "imm", "Landroidx/core/view/l1;", "Landroidx/core/view/l1;", "softwareKeyboardControllerCompat", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nComposeInputMethodManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeInputMethodManager.android.kt\nandroidx/compose/foundation/text2/input/internal/ComposeInputMethodManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n1#2:173\n*E\n"})
/* loaded from: classes.dex */
abstract class h implements g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final View view;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private InputMethodManager imm;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l1 softwareKeyboardControllerCompat;

    public h(@fg.l View view) {
        this.view = view;
        this.softwareKeyboardControllerCompat = new l1(view);
    }

    private final InputMethodManager f() {
        Object systemService = this.view.getContext().getSystemService("input_method");
        kotlin.jvm.internal.l0.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }

    @Override // androidx.compose.foundation.text2.input.internal.g
    public void a(int token, @fg.l ExtractedText extractedText) {
        h().updateExtractedText(this.view, token, extractedText);
    }

    @Override // androidx.compose.foundation.text2.input.internal.g
    public void b() {
        this.softwareKeyboardControllerCompat.b();
    }

    @Override // androidx.compose.foundation.text2.input.internal.g
    public void c(int selectionStart, int selectionEnd, int compositionStart, int compositionEnd) {
        h().updateSelection(this.view, selectionStart, selectionEnd, compositionStart, compositionEnd);
    }

    @Override // androidx.compose.foundation.text2.input.internal.g
    public void d() {
        h().restartInput(this.view);
    }

    @Override // androidx.compose.foundation.text2.input.internal.g
    public void e() {
        this.softwareKeyboardControllerCompat.a();
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    protected final View getView() {
        return this.view;
    }

    @fg.l
    protected final InputMethodManager h() {
        InputMethodManager inputMethodManager = this.imm;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        InputMethodManager f4 = f();
        this.imm = f4;
        return f4;
    }
}
