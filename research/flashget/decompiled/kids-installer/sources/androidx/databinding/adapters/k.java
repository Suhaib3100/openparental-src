package androidx.databinding.adapters;

import android.widget.CompoundButton;
import androidx.annotation.c1;

/* compiled from: CompoundButtonBindingAdapter.java */
@c1({c1.a.LIBRARY})
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:buttonTint", method = "setButtonTintList", type = CompoundButton.class), @androidx.databinding.g(attribute = "android:onCheckedChanged", method = "setOnCheckedChangeListener", type = CompoundButton.class)})
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:checked", type = CompoundButton.class)})
/* loaded from: classes.dex */
public class k {

    /* compiled from: CompoundButtonBindingAdapter.java */
    class a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CompoundButton.OnCheckedChangeListener f6062a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f6063b;

        a(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, androidx.databinding.o oVar) {
            this.f6062a = onCheckedChangeListener;
            this.f6063b = oVar;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z5) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f6062a;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z5);
            }
            this.f6063b.a();
        }
    }

    @androidx.databinding.d({"android:checked"})
    public static void a(CompoundButton compoundButton, boolean z5) {
        if (compoundButton.isChecked() != z5) {
            compoundButton.setChecked(z5);
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onCheckedChanged", "android:checkedAttrChanged"})
    public static void b(CompoundButton compoundButton, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, androidx.databinding.o oVar) {
        if (oVar == null) {
            compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            compoundButton.setOnCheckedChangeListener(new a(onCheckedChangeListener, oVar));
        }
    }
}
