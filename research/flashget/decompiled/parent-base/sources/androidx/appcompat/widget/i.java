package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import d.a;

/* compiled from: AppCompatEmojiEditTextHelper.java */
/* loaded from: classes.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.o0
    private final EditText f1872a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.o0
    private final androidx.emoji2.viewsintegration.a f1873b;

    i(@androidx.annotation.o0 EditText editText) {
        this.f1872a = editText;
        this.f1873b = new androidx.emoji2.viewsintegration.a(editText, false);
    }

    @androidx.annotation.q0
    KeyListener a(@androidx.annotation.q0 KeyListener keyListener) {
        return b(keyListener) ? this.f1873b.b(keyListener) : keyListener;
    }

    boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    boolean c() {
        return this.f1873b.d();
    }

    void d(@androidx.annotation.q0 AttributeSet attributeSet, int i4) {
        TypedArray obtainStyledAttributes = this.f1872a.getContext().obtainStyledAttributes(attributeSet, a.m.f73595v0, i4, 0);
        try {
            int i5 = a.m.K0;
            boolean z4 = obtainStyledAttributes.hasValue(i5) ? obtainStyledAttributes.getBoolean(i5, true) : true;
            obtainStyledAttributes.recycle();
            f(z4);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @androidx.annotation.q0
    InputConnection e(@androidx.annotation.q0 InputConnection inputConnection, @androidx.annotation.o0 EditorInfo editorInfo) {
        return this.f1873b.e(inputConnection, editorInfo);
    }

    void f(boolean z4) {
        this.f1873b.g(z4);
    }
}
