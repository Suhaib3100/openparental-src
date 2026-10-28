package androidx.databinding.adapters;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.method.DialerKeyListener;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TextKeyListener;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.databinding.library.baseAdapters.c;
import java.util.Objects;

/* compiled from: TextViewBindingAdapter.java */
@c1({c1.a.LIBRARY})
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:autoLink", method = "setAutoLinkMask", type = TextView.class), @androidx.databinding.g(attribute = "android:drawablePadding", method = "setCompoundDrawablePadding", type = TextView.class), @androidx.databinding.g(attribute = "android:editorExtras", method = "setInputExtras", type = TextView.class), @androidx.databinding.g(attribute = "android:inputType", method = "setRawInputType", type = TextView.class), @androidx.databinding.g(attribute = "android:scrollHorizontally", method = "setHorizontallyScrolling", type = TextView.class), @androidx.databinding.g(attribute = "android:textAllCaps", method = "setAllCaps", type = TextView.class), @androidx.databinding.g(attribute = "android:textColorHighlight", method = "setHighlightColor", type = TextView.class), @androidx.databinding.g(attribute = "android:textColorHint", method = "setHintTextColor", type = TextView.class), @androidx.databinding.g(attribute = "android:textColorLink", method = "setLinkTextColor", type = TextView.class), @androidx.databinding.g(attribute = "android:onEditorAction", method = "setOnEditorActionListener", type = TextView.class)})
/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f6044a = "TextViewBindingAdapters";

    /* renamed from: b, reason: collision with root package name */
    public static final int f6045b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6046c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6047d = 5;

    /* compiled from: TextViewBindingAdapter.java */
    class a implements TextWatcher {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ c f6048o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ d f6049p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f6050q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ b f6051r;

        a(c cVar, d dVar, androidx.databinding.o oVar, b bVar) {
            this.f6048o = cVar;
            this.f6049p = dVar;
            this.f6050q = oVar;
            this.f6051r = bVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            b bVar = this.f6051r;
            if (bVar != null) {
                bVar.afterTextChanged(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            c cVar = this.f6048o;
            if (cVar != null) {
                cVar.beforeTextChanged(charSequence, i5, i6, i7);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            d dVar = this.f6049p;
            if (dVar != null) {
                dVar.onTextChanged(charSequence, i5, i6, i7);
            }
            androidx.databinding.o oVar = this.f6050q;
            if (oVar != null) {
                oVar.a();
            }
        }
    }

    /* compiled from: TextViewBindingAdapter.java */
    public interface b {
        void afterTextChanged(Editable editable);
    }

    /* compiled from: TextViewBindingAdapter.java */
    public interface c {
        void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7);
    }

    /* compiled from: TextViewBindingAdapter.java */
    public interface d {
        void onTextChanged(CharSequence charSequence, int i5, int i6, int i7);
    }

    @androidx.databinding.d({"android:text"})
    public static void A(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (charSequence != text) {
            if (charSequence == null && text.length() == 0) {
                return;
            }
            if (charSequence instanceof Spanned) {
                if (charSequence.equals(text)) {
                    return;
                }
            } else if (!b(charSequence, text)) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    @androidx.databinding.d({"android:textSize"})
    public static void B(TextView textView, float f6) {
        textView.setTextSize(0, f6);
    }

    @androidx.databinding.d(requireAll = false, value = {"android:beforeTextChanged", "android:onTextChanged", "android:afterTextChanged", "android:textAttrChanged"})
    public static void C(TextView textView, c cVar, d dVar, b bVar, androidx.databinding.o oVar) {
        a aVar = (cVar == null && bVar == null && dVar == null && oVar == null) ? null : new a(cVar, dVar, oVar, bVar);
        TextWatcher textWatcher = (TextWatcher) r.b(textView, aVar, c.g.V0);
        if (textWatcher != null) {
            textView.removeTextChangedListener(textWatcher);
        }
        if (aVar != null) {
            textView.addTextChangedListener(aVar);
        }
    }

    @androidx.databinding.n(attribute = "android:text", event = "android:textAttrChanged")
    public static String a(TextView textView) {
        return textView.getText().toString();
    }

    private static boolean b(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence == null) != (charSequence2 == null)) {
            return true;
        }
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        if (length != charSequence2.length()) {
            return true;
        }
        for (int i5 = 0; i5 < length; i5++) {
            if (charSequence.charAt(i5) != charSequence2.charAt(i5)) {
                return true;
            }
        }
        return false;
    }

    @androidx.databinding.d({"android:autoText"})
    public static void c(TextView textView, boolean z5) {
        KeyListener keyListener = textView.getKeyListener();
        TextKeyListener.Capitalize capitalize = TextKeyListener.Capitalize.NONE;
        int inputType = keyListener != null ? keyListener.getInputType() : 0;
        if ((inputType & 4096) != 0) {
            capitalize = TextKeyListener.Capitalize.CHARACTERS;
        } else if ((inputType & 8192) != 0) {
            capitalize = TextKeyListener.Capitalize.WORDS;
        } else if ((inputType & 16384) != 0) {
            capitalize = TextKeyListener.Capitalize.SENTENCES;
        }
        textView.setKeyListener(TextKeyListener.getInstance(z5, capitalize));
    }

    @androidx.databinding.d({"android:bufferType"})
    public static void d(TextView textView, TextView.BufferType bufferType) {
        textView.setText(textView.getText(), bufferType);
    }

    @androidx.databinding.d({"android:capitalize"})
    public static void e(TextView textView, TextKeyListener.Capitalize capitalize) {
        textView.setKeyListener(TextKeyListener.getInstance((textView.getKeyListener().getInputType() & 32768) != 0, capitalize));
    }

    @androidx.databinding.d({"android:digits"})
    public static void f(TextView textView, CharSequence charSequence) {
        if (charSequence != null) {
            textView.setKeyListener(DigitsKeyListener.getInstance(charSequence.toString()));
        } else if (textView.getKeyListener() instanceof DigitsKeyListener) {
            textView.setKeyListener(null);
        }
    }

    @androidx.databinding.d({"android:drawableBottom"})
    public static void g(TextView textView, Drawable drawable) {
        p(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], drawable);
    }

    @androidx.databinding.d({"android:drawableEnd"})
    public static void h(TextView textView, Drawable drawable) {
        p(drawable);
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        textView.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], drawable, compoundDrawablesRelative[3]);
    }

    @androidx.databinding.d({"android:drawableLeft"})
    public static void i(TextView textView, Drawable drawable) {
        p(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(drawable, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
    }

    @androidx.databinding.d({"android:drawableRight"})
    public static void j(TextView textView, Drawable drawable) {
        p(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], drawable, compoundDrawables[3]);
    }

    @androidx.databinding.d({"android:drawableStart"})
    public static void k(TextView textView, Drawable drawable) {
        p(drawable);
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        textView.setCompoundDrawablesRelative(drawable, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    @androidx.databinding.d({"android:drawableTop"})
    public static void l(TextView textView, Drawable drawable) {
        p(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], drawable, compoundDrawables[2], compoundDrawables[3]);
    }

    @androidx.databinding.d({"android:imeActionId"})
    public static void m(TextView textView, int i5) {
        textView.setImeActionLabel(textView.getImeActionLabel(), i5);
    }

    @androidx.databinding.d({"android:imeActionLabel"})
    public static void n(TextView textView, CharSequence charSequence) {
        textView.setImeActionLabel(charSequence, textView.getImeActionId());
    }

    @androidx.databinding.d({"android:inputMethod"})
    public static void o(TextView textView, CharSequence charSequence) {
        try {
            textView.setKeyListener((KeyListener) Class.forName(charSequence.toString()).newInstance());
        } catch (ClassNotFoundException unused) {
            Objects.toString(charSequence);
        } catch (IllegalAccessException unused2) {
            Objects.toString(charSequence);
        } catch (InstantiationException unused3) {
            Objects.toString(charSequence);
        }
    }

    private static void p(Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    @androidx.databinding.d({"android:lineSpacingExtra"})
    public static void q(TextView textView, float f6) {
        textView.setLineSpacing(f6, textView.getLineSpacingMultiplier());
    }

    @androidx.databinding.d({"android:lineSpacingMultiplier"})
    public static void r(TextView textView, float f6) {
        textView.setLineSpacing(textView.getLineSpacingExtra(), f6);
    }

    @androidx.databinding.d({"android:maxLength"})
    public static void s(TextView textView, int i5) {
        boolean z5;
        InputFilter[] filters = textView.getFilters();
        if (filters == null) {
            filters = new InputFilter[]{new InputFilter.LengthFilter(i5)};
        } else {
            int i6 = 0;
            while (true) {
                if (i6 >= filters.length) {
                    z5 = false;
                    break;
                }
                InputFilter inputFilter = filters[i6];
                if (inputFilter instanceof InputFilter.LengthFilter) {
                    if (((InputFilter.LengthFilter) inputFilter).getMax() != i5) {
                        filters[i6] = new InputFilter.LengthFilter(i5);
                    }
                    z5 = true;
                } else {
                    i6++;
                }
            }
            if (!z5) {
                int length = filters.length + 1;
                InputFilter[] inputFilterArr = new InputFilter[length];
                System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
                inputFilterArr[length - 1] = new InputFilter.LengthFilter(i5);
                filters = inputFilterArr;
            }
        }
        textView.setFilters(filters);
    }

    @androidx.databinding.d({"android:numeric"})
    public static void t(TextView textView, int i5) {
        textView.setKeyListener(DigitsKeyListener.getInstance((i5 & 3) != 0, (i5 & 5) != 0));
    }

    @androidx.databinding.d({"android:password"})
    public static void u(TextView textView, boolean z5) {
        if (z5) {
            textView.setTransformationMethod(PasswordTransformationMethod.getInstance());
        } else if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textView.setTransformationMethod(null);
        }
    }

    @androidx.databinding.d({"android:phoneNumber"})
    public static void v(TextView textView, boolean z5) {
        if (z5) {
            textView.setKeyListener(DialerKeyListener.getInstance());
        } else if (textView.getKeyListener() instanceof DialerKeyListener) {
            textView.setKeyListener(null);
        }
    }

    @androidx.databinding.d({"android:shadowColor"})
    public static void w(TextView textView, int i5) {
        textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), textView.getShadowDy(), i5);
    }

    @androidx.databinding.d({"android:shadowDx"})
    public static void x(TextView textView, float f6) {
        int shadowColor = textView.getShadowColor();
        textView.setShadowLayer(textView.getShadowRadius(), f6, textView.getShadowDy(), shadowColor);
    }

    @androidx.databinding.d({"android:shadowDy"})
    public static void y(TextView textView, float f6) {
        int shadowColor = textView.getShadowColor();
        textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), f6, shadowColor);
    }

    @androidx.databinding.d({"android:shadowRadius"})
    public static void z(TextView textView, float f6) {
        textView.setShadowLayer(f6, textView.getShadowDx(), textView.getShadowDy(), textView.getShadowColor());
    }
}
