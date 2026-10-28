package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.annotation.c1;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.emoji2.text.g;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: EmojiTextWatcher.java */
@c1({c1.a.LIBRARY})
@x0(19)
/* loaded from: classes3.dex */
final class g implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    private final EditText f29550b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f29551c;

    /* renamed from: d, reason: collision with root package name */
    private g.AbstractC0478g f29552d;

    /* renamed from: e, reason: collision with root package name */
    private int f29553e = Integer.MAX_VALUE;

    /* renamed from: f, reason: collision with root package name */
    private int f29554f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f29555g = true;

    /* compiled from: EmojiTextWatcher.java */
    @x0(19)
    private static class a extends g.AbstractC0478g {

        /* renamed from: a, reason: collision with root package name */
        private final Reference<EditText> f29556a;

        a(EditText editText) {
            this.f29556a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.g.AbstractC0478g
        public void b() {
            g.e(this.f29556a.get(), 1);
        }
    }

    g(EditText editText, boolean z4) {
        this.f29550b = editText;
        this.f29551c = z4;
    }

    private g.AbstractC0478g b() {
        if (this.f29552d == null) {
            this.f29552d = new a(this.f29550b);
        }
        return this.f29552d;
    }

    static void e(@q0 EditText editText, int i4) {
        if (i4 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.g.c().x(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean i() {
        return (this.f29555g && (this.f29551c || androidx.emoji2.text.g.q())) ? false : true;
    }

    int a() {
        return this.f29554f;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
    }

    int c() {
        return this.f29553e;
    }

    public boolean d() {
        return this.f29555g;
    }

    void f(int i4) {
        this.f29554f = i4;
    }

    public void g(boolean z4) {
        if (this.f29555g != z4) {
            if (this.f29552d != null) {
                androidx.emoji2.text.g.c().F(this.f29552d);
            }
            this.f29555g = z4;
            if (z4) {
                e(this.f29550b, androidx.emoji2.text.g.c().i());
            }
        }
    }

    void h(int i4) {
        this.f29553e = i4;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        if (this.f29550b.isInEditMode() || i() || i5 > i6 || !(charSequence instanceof Spannable)) {
            return;
        }
        int i7 = androidx.emoji2.text.g.c().i();
        if (i7 != 0) {
            if (i7 == 1) {
                androidx.emoji2.text.g.c().A((Spannable) charSequence, i4, i4 + i6, this.f29553e, this.f29554f);
                return;
            } else if (i7 != 3) {
                return;
            }
        }
        androidx.emoji2.text.g.c().B(b());
    }
}
