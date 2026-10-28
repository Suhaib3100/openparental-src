package androidx.databinding.adapters;

import android.R;
import android.widget.AbsSpinner;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import androidx.annotation.c1;
import java.util.List;

/* compiled from: AbsSpinnerBindingAdapter.java */
@c1({c1.a.LIBRARY})
/* loaded from: classes.dex */
public class c {
    @androidx.databinding.d({"android:entries"})
    public static <T> void a(AbsSpinner absSpinner, List<T> list) {
        if (list == null) {
            absSpinner.setAdapter((SpinnerAdapter) null);
            return;
        }
        SpinnerAdapter adapter = absSpinner.getAdapter();
        if (adapter instanceof t) {
            ((t) adapter).b(list);
        } else {
            absSpinner.setAdapter((SpinnerAdapter) new t(absSpinner.getContext(), list, R.layout.simple_spinner_item, R.layout.simple_spinner_dropdown_item, 0));
        }
    }

    @androidx.databinding.d({"android:entries"})
    public static <T extends CharSequence> void b(AbsSpinner absSpinner, T[] tArr) {
        if (tArr == null) {
            absSpinner.setAdapter((SpinnerAdapter) null);
            return;
        }
        SpinnerAdapter adapter = absSpinner.getAdapter();
        boolean z5 = true;
        if (adapter != null && adapter.getCount() == tArr.length) {
            int i5 = 0;
            while (true) {
                if (i5 >= tArr.length) {
                    z5 = false;
                    break;
                } else if (!tArr[i5].equals(adapter.getItem(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        if (z5) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(absSpinner.getContext(), R.layout.simple_spinner_item, tArr);
            arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
            absSpinner.setAdapter((SpinnerAdapter) arrayAdapter);
        }
    }
}
