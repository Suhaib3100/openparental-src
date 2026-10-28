package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.annotation.g0;
import androidx.annotation.o0;
import androidx.annotation.x0;

/* compiled from: EmojiInputConnection.java */
@c1({c1.a.LIBRARY})
@x0(19)
/* loaded from: classes3.dex */
final class c extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f29537a;

    /* renamed from: b, reason: collision with root package name */
    private final a f29538b;

    /* compiled from: EmojiInputConnection.java */
    public static class a {
        public boolean a(@o0 InputConnection inputConnection, @o0 Editable editable, @g0(from = 0) int i4, @g0(from = 0) int i5, boolean z4) {
            return androidx.emoji2.text.g.j(inputConnection, editable, i4, i5, z4);
        }

        public void b(@o0 EditorInfo editorInfo) {
            if (androidx.emoji2.text.g.q()) {
                androidx.emoji2.text.g.c().G(editorInfo);
            }
        }
    }

    c(@o0 TextView textView, @o0 InputConnection inputConnection, @o0 EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    private Editable b() {
        return this.f29537a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i4, int i5) {
        return this.f29538b.a(this, this.f29537a.getEditableText(), i4, i5, false) || super.deleteSurroundingText(i4, i5);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i4, int i5) {
        return this.f29538b.a(this, this.f29537a.getEditableText(), i4, i5, true) || super.deleteSurroundingTextInCodePoints(i4, i5);
    }

    c(@o0 TextView textView, @o0 InputConnection inputConnection, @o0 EditorInfo editorInfo, @o0 a aVar) {
        super(inputConnection, false);
        this.f29537a = textView;
        this.f29538b = aVar;
        aVar.b(editorInfo);
    }
}
