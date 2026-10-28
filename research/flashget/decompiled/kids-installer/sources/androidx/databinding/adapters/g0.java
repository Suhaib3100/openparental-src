package androidx.databinding.adapters;

import android.widget.TimePicker;
import androidx.annotation.c1;

/* compiled from: TimePickerBindingAdapter.java */
@c1({c1.a.LIBRARY})
/* loaded from: classes.dex */
public class g0 {

    /* compiled from: TimePickerBindingAdapter.java */
    class a implements TimePicker.OnTimeChangedListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TimePicker.OnTimeChangedListener f6054a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f6055b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f6056c;

        a(TimePicker.OnTimeChangedListener onTimeChangedListener, androidx.databinding.o oVar, androidx.databinding.o oVar2) {
            this.f6054a = onTimeChangedListener;
            this.f6055b = oVar;
            this.f6056c = oVar2;
        }

        @Override // android.widget.TimePicker.OnTimeChangedListener
        public void onTimeChanged(TimePicker timePicker, int i5, int i6) {
            TimePicker.OnTimeChangedListener onTimeChangedListener = this.f6054a;
            if (onTimeChangedListener != null) {
                onTimeChangedListener.onTimeChanged(timePicker, i5, i6);
            }
            androidx.databinding.o oVar = this.f6055b;
            if (oVar != null) {
                oVar.a();
            }
            androidx.databinding.o oVar2 = this.f6056c;
            if (oVar2 != null) {
                oVar2.a();
            }
        }
    }

    @androidx.databinding.n(attribute = "android:hour")
    public static int a(TimePicker timePicker) {
        return timePicker.getHour();
    }

    @androidx.databinding.n(attribute = "android:minute")
    public static int b(TimePicker timePicker) {
        return timePicker.getMinute();
    }

    @androidx.databinding.d({"android:hour"})
    public static void c(TimePicker timePicker, int i5) {
        if (timePicker.getHour() != i5) {
            timePicker.setHour(i5);
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onTimeChanged", "android:hourAttrChanged", "android:minuteAttrChanged"})
    public static void d(TimePicker timePicker, TimePicker.OnTimeChangedListener onTimeChangedListener, androidx.databinding.o oVar, androidx.databinding.o oVar2) {
        if (oVar == null && oVar2 == null) {
            timePicker.setOnTimeChangedListener(onTimeChangedListener);
        } else {
            timePicker.setOnTimeChangedListener(new a(onTimeChangedListener, oVar, oVar2));
        }
    }

    @androidx.databinding.d({"android:minute"})
    public static void e(TimePicker timePicker, int i5) {
        if (timePicker.getMinute() != i5) {
            timePicker.setMinute(i5);
        }
    }
}
