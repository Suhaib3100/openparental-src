package androidx.databinding.adapters;

import android.widget.NumberPicker;
import androidx.annotation.c1;

/* compiled from: NumberPickerBindingAdapter.java */
@c1({c1.a.LIBRARY})
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:format", method = "setFormatter", type = NumberPicker.class), @androidx.databinding.g(attribute = "android:onScrollStateChange", method = "setOnScrollListener", type = NumberPicker.class)})
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:value", type = NumberPicker.class)})
/* loaded from: classes.dex */
public class s {

    /* compiled from: NumberPickerBindingAdapter.java */
    class a implements NumberPicker.OnValueChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ NumberPicker.OnValueChangeListener f6074a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f6075b;

        a(NumberPicker.OnValueChangeListener onValueChangeListener, androidx.databinding.o oVar) {
            this.f6074a = onValueChangeListener;
            this.f6075b = oVar;
        }

        @Override // android.widget.NumberPicker.OnValueChangeListener
        public void onValueChange(NumberPicker numberPicker, int i5, int i6) {
            NumberPicker.OnValueChangeListener onValueChangeListener = this.f6074a;
            if (onValueChangeListener != null) {
                onValueChangeListener.onValueChange(numberPicker, i5, i6);
            }
            this.f6075b.a();
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onValueChange", "android:valueAttrChanged"})
    public static void a(NumberPicker numberPicker, NumberPicker.OnValueChangeListener onValueChangeListener, androidx.databinding.o oVar) {
        if (oVar == null) {
            numberPicker.setOnValueChangedListener(onValueChangeListener);
        } else {
            numberPicker.setOnValueChangedListener(new a(onValueChangeListener, oVar));
        }
    }

    @androidx.databinding.d({"android:value"})
    public static void b(NumberPicker numberPicker, int i5) {
        if (numberPicker.getValue() != i5) {
            numberPicker.setValue(i5);
        }
    }
}
