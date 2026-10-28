package androidx.emoji2.viewsintegration;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.c1;
import androidx.annotation.g0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.core.util.w;

/* compiled from: EmojiEditTextHelper.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f29529a;

    /* renamed from: b, reason: collision with root package name */
    private int f29530b;

    /* renamed from: c, reason: collision with root package name */
    private int f29531c;

    /* compiled from: EmojiEditTextHelper.java */
    @x0(19)
    /* renamed from: androidx.emoji2.viewsintegration.a$a, reason: collision with other inner class name */
    private static class C0479a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final EditText f29532a;

        /* renamed from: b, reason: collision with root package name */
        private final g f29533b;

        C0479a(@o0 EditText editText, boolean z4) {
            this.f29532a = editText;
            g gVar = new g(editText, z4);
            this.f29533b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(androidx.emoji2.viewsintegration.b.getInstance());
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        KeyListener a(@q0 KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        boolean b() {
            return this.f29533b.d();
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        InputConnection c(@o0 InputConnection inputConnection, @o0 EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f29532a, inputConnection, editorInfo);
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        void d(int i4) {
            this.f29533b.f(i4);
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        void e(boolean z4) {
            this.f29533b.g(z4);
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        void f(int i4) {
            this.f29533b.h(i4);
        }
    }

    /* compiled from: EmojiEditTextHelper.java */
    static class b {
        b() {
        }

        @q0
        KeyListener a(@q0 KeyListener keyListener) {
            return keyListener;
        }

        boolean b() {
            return false;
        }

        InputConnection c(@o0 InputConnection inputConnection, @o0 EditorInfo editorInfo) {
            return inputConnection;
        }

        void d(int i4) {
        }

        void e(boolean z4) {
        }

        void f(int i4) {
        }
    }

    public a(@o0 EditText editText) {
        this(editText, true);
    }

    @c1({c1.a.LIBRARY_GROUP})
    public int a() {
        return this.f29531c;
    }

    @q0
    public KeyListener b(@q0 KeyListener keyListener) {
        return this.f29529a.a(keyListener);
    }

    public int c() {
        return this.f29530b;
    }

    public boolean d() {
        return this.f29529a.b();
    }

    @q0
    public InputConnection e(@q0 InputConnection inputConnection, @o0 EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f29529a.c(inputConnection, editorInfo);
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void f(int i4) {
        this.f29531c = i4;
        this.f29529a.d(i4);
    }

    public void g(boolean z4) {
        this.f29529a.e(z4);
    }

    public void h(@g0(from = 0) int i4) {
        w.j(i4, "maxEmojiCount should be greater than 0");
        this.f29530b = i4;
        this.f29529a.f(i4);
    }

    public a(@o0 EditText editText, boolean z4) {
        this.f29530b = Integer.MAX_VALUE;
        this.f29531c = 0;
        w.m(editText, "editText cannot be null");
        this.f29529a = new C0479a(editText, z4);
    }
}
