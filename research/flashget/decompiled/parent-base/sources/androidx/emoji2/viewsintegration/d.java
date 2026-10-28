package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.emoji2.text.g;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: EmojiInputFilter.java */
@c1({c1.a.LIBRARY})
@x0(19)
/* loaded from: classes3.dex */
final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f29539a;

    /* renamed from: b, reason: collision with root package name */
    private g.AbstractC0478g f29540b;

    /* compiled from: EmojiInputFilter.java */
    @x0(19)
    private static class a extends g.AbstractC0478g {

        /* renamed from: a, reason: collision with root package name */
        private final Reference<TextView> f29541a;

        /* renamed from: b, reason: collision with root package name */
        private final Reference<d> f29542b;

        a(TextView textView, d dVar) {
            this.f29541a = new WeakReference(textView);
            this.f29542b = new WeakReference(dVar);
        }

        private boolean c(@q0 TextView textView, @q0 InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.g.AbstractC0478g
        public void b() {
            CharSequence text;
            CharSequence x4;
            TextView textView = this.f29541a.get();
            if (c(textView, this.f29542b.get()) && textView.isAttachedToWindow() && text != (x4 = androidx.emoji2.text.g.c().x((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(x4);
                int selectionEnd = Selection.getSelectionEnd(x4);
                textView.setText(x4);
                if (x4 instanceof Spannable) {
                    d.b((Spannable) x4, selectionStart, selectionEnd);
                }
            }
        }
    }

    d(@o0 TextView textView) {
        this.f29539a = textView;
    }

    private g.AbstractC0478g a() {
        if (this.f29540b == null) {
            this.f29540b = new a(this.f29539a, this);
        }
        return this.f29540b;
    }

    static void b(Spannable spannable, int i4, int i5) {
        if (i4 >= 0 && i5 >= 0) {
            Selection.setSelection(spannable, i4, i5);
        } else if (i4 >= 0) {
            Selection.setSelection(spannable, i4);
        } else if (i5 >= 0) {
            Selection.setSelection(spannable, i5);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) {
        if (this.f29539a.isInEditMode()) {
            return charSequence;
        }
        int i10 = androidx.emoji2.text.g.c().i();
        if (i10 != 0) {
            if (i10 == 1) {
                if ((i7 == 0 && i6 == 0 && spanned.length() == 0 && charSequence == this.f29539a.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i4 != 0 || i5 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i4, i5);
                }
                return androidx.emoji2.text.g.c().y(charSequence, 0, charSequence.length());
            }
            if (i10 != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.g.c().B(a());
        return charSequence;
    }
}
