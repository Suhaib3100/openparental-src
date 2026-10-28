package androidx.databinding.adapters;

import android.widget.DatePicker;
import androidx.annotation.c1;
import androidx.databinding.library.baseAdapters.c;

/* compiled from: DatePickerBindingAdapter.java */
@c1({c1.a.LIBRARY})
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:year", type = DatePicker.class), @androidx.databinding.p(attribute = "android:month", type = DatePicker.class), @androidx.databinding.p(attribute = "android:day", method = "getDayOfMonth", type = DatePicker.class)})
/* loaded from: classes.dex */
public class m {

    /* compiled from: DatePickerBindingAdapter.java */
    private static class b implements DatePicker.OnDateChangedListener {

        /* renamed from: o, reason: collision with root package name */
        DatePicker.OnDateChangedListener f6069o;

        /* renamed from: p, reason: collision with root package name */
        androidx.databinding.o f6070p;

        /* renamed from: q, reason: collision with root package name */
        androidx.databinding.o f6071q;

        /* renamed from: r, reason: collision with root package name */
        androidx.databinding.o f6072r;

        private b() {
        }

        public void a(DatePicker.OnDateChangedListener onDateChangedListener, androidx.databinding.o oVar, androidx.databinding.o oVar2, androidx.databinding.o oVar3) {
            this.f6069o = onDateChangedListener;
            this.f6070p = oVar;
            this.f6071q = oVar2;
            this.f6072r = oVar3;
        }

        @Override // android.widget.DatePicker.OnDateChangedListener
        public void onDateChanged(DatePicker datePicker, int i5, int i6, int i7) {
            DatePicker.OnDateChangedListener onDateChangedListener = this.f6069o;
            if (onDateChangedListener != null) {
                onDateChangedListener.onDateChanged(datePicker, i5, i6, i7);
            }
            androidx.databinding.o oVar = this.f6070p;
            if (oVar != null) {
                oVar.a();
            }
            androidx.databinding.o oVar2 = this.f6071q;
            if (oVar2 != null) {
                oVar2.a();
            }
            androidx.databinding.o oVar3 = this.f6072r;
            if (oVar3 != null) {
                oVar3.a();
            }
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:year", "android:month", "android:day", "android:onDateChanged", "android:yearAttrChanged", "android:monthAttrChanged", "android:dayAttrChanged"})
    public static void a(DatePicker datePicker, int i5, int i6, int i7, DatePicker.OnDateChangedListener onDateChangedListener, androidx.databinding.o oVar, androidx.databinding.o oVar2, androidx.databinding.o oVar3) {
        if (i5 == 0) {
            i5 = datePicker.getYear();
        }
        if (i7 == 0) {
            i7 = datePicker.getDayOfMonth();
        }
        if (oVar == null && oVar2 == null && oVar3 == null) {
            datePicker.init(i5, i6, i7, onDateChangedListener);
            return;
        }
        int i8 = c.g.f6494h0;
        b bVar = (b) r.a(datePicker, i8);
        if (bVar == null) {
            bVar = new b();
            r.b(datePicker, bVar, i8);
        }
        bVar.a(onDateChangedListener, oVar, oVar2, oVar3);
        datePicker.init(i5, i6, i7, bVar);
    }
}
