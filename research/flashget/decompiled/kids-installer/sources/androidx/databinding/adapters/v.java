package androidx.databinding.adapters;

import android.widget.RadioGroup;
import androidx.annotation.c1;

/* compiled from: RadioGroupBindingAdapter.java */
@c1({c1.a.LIBRARY})
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:checkedButton", method = "getCheckedRadioButtonId", type = RadioGroup.class)})
/* loaded from: classes.dex */
public class v {

    /* compiled from: RadioGroupBindingAdapter.java */
    class a implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RadioGroup.OnCheckedChangeListener f6084a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f6085b;

        a(RadioGroup.OnCheckedChangeListener onCheckedChangeListener, androidx.databinding.o oVar) {
            this.f6084a = onCheckedChangeListener;
            this.f6085b = oVar;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i5) {
            RadioGroup.OnCheckedChangeListener onCheckedChangeListener = this.f6084a;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(radioGroup, i5);
            }
            this.f6085b.a();
        }
    }

    @androidx.databinding.d({"android:checkedButton"})
    public static void a(RadioGroup radioGroup, int i5) {
        if (i5 != radioGroup.getCheckedRadioButtonId()) {
            radioGroup.check(i5);
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onCheckedChanged", "android:checkedButtonAttrChanged"})
    public static void b(RadioGroup radioGroup, RadioGroup.OnCheckedChangeListener onCheckedChangeListener, androidx.databinding.o oVar) {
        if (oVar == null) {
            radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            radioGroup.setOnCheckedChangeListener(new a(onCheckedChangeListener, oVar));
        }
    }
}
