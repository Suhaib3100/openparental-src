package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.x0;

/* compiled from: EmojiKeyListener.java */
@c1({c1.a.LIBRARY})
@x0(19)
/* loaded from: classes3.dex */
final class e implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    private final KeyListener f29543a;

    /* renamed from: b, reason: collision with root package name */
    private final a f29544b;

    /* compiled from: EmojiKeyListener.java */
    public static class a {
        public boolean a(@o0 Editable editable, int i4, @o0 KeyEvent keyEvent) {
            return androidx.emoji2.text.g.k(editable, i4, keyEvent);
        }
    }

    e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i4) {
        this.f29543a.clearMetaKeyState(view, editable, i4);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f29543a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i4, KeyEvent keyEvent) {
        return this.f29544b.a(editable, i4, keyEvent) || this.f29543a.onKeyDown(view, editable, i4, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f29543a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i4, KeyEvent keyEvent) {
        return this.f29543a.onKeyUp(view, editable, i4, keyEvent);
    }

    e(KeyListener keyListener, a aVar) {
        this.f29543a = keyListener;
        this.f29544b = aVar;
    }
}
