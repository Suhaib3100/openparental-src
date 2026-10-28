package androidx.compose.ui.text.input;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.l1;
import kotlin.Metadata;

/* compiled from: InputMethodManager.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010%¨\u0006'"}, d2 = {"Landroidx/compose/ui/text/input/d0;", "Landroidx/compose/ui/text/input/c0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "", "isActive", "()Z", "Lkotlin/k2;", "d", "()V", "b", "e", "", "token", "Landroid/view/inputmethod/ExtractedText;", "extractedText", "a", "(ILandroid/view/inputmethod/ExtractedText;)V", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "c", "(IIII)V", "Landroid/view/inputmethod/CursorAnchorInfo;", "cursorAnchorInfo", "f", "(Landroid/view/inputmethod/CursorAnchorInfo;)V", "Landroid/view/View;", "Landroid/view/inputmethod/InputMethodManager;", "Lkotlin/b0;", "h", "()Landroid/view/inputmethod/InputMethodManager;", "imm", "Landroidx/core/view/l1;", "Landroidx/core/view/l1;", "softwareKeyboardControllerCompat", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d0 implements c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f20989d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final View view;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.b0 imm = kotlin.c0.b(kotlin.f0.NONE, new a());

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l1 softwareKeyboardControllerCompat;

    /* compiled from: InputMethodManager.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/inputmethod/InputMethodManager;", "a", "()Landroid/view/inputmethod/InputMethodManager;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<InputMethodManager> {
        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputMethodManager invoke() {
            Object systemService = d0.this.view.getContext().getSystemService("input_method");
            kotlin.jvm.internal.l0.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public d0(@fg.l View view) {
        this.view = view;
        this.softwareKeyboardControllerCompat = new l1(view);
    }

    private final InputMethodManager h() {
        return (InputMethodManager) this.imm.getValue();
    }

    @Override // androidx.compose.ui.text.input.c0
    public void a(int token, @fg.l ExtractedText extractedText) {
        h().updateExtractedText(this.view, token, extractedText);
    }

    @Override // androidx.compose.ui.text.input.c0
    public void b() {
        this.softwareKeyboardControllerCompat.b();
    }

    @Override // androidx.compose.ui.text.input.c0
    public void c(int selectionStart, int selectionEnd, int compositionStart, int compositionEnd) {
        h().updateSelection(this.view, selectionStart, selectionEnd, compositionStart, compositionEnd);
    }

    @Override // androidx.compose.ui.text.input.c0
    public void d() {
        h().restartInput(this.view);
    }

    @Override // androidx.compose.ui.text.input.c0
    public void e() {
        this.softwareKeyboardControllerCompat.a();
    }

    @Override // androidx.compose.ui.text.input.c0
    public void f(@fg.l CursorAnchorInfo cursorAnchorInfo) {
        h().updateCursorAnchorInfo(this.view, cursorAnchorInfo);
    }

    @Override // androidx.compose.ui.text.input.c0
    public boolean isActive() {
        return h().isActive(this.view);
    }
}
