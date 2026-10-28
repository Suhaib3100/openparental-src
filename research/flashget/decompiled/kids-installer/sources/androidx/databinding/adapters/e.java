package androidx.databinding.adapters;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import androidx.annotation.c1;

/* compiled from: AdapterViewBindingAdapter.java */
@c1({c1.a.LIBRARY})
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:onItemClick", method = "setOnItemClickListener", type = AdapterView.class), @androidx.databinding.g(attribute = "android:onItemLongClick", method = "setOnItemLongClickListener", type = AdapterView.class)})
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:selectedItemPosition", type = AdapterView.class), @androidx.databinding.p(attribute = "android:selection", event = "android:selectedItemPositionAttrChanged", method = "getSelectedItemPosition", type = AdapterView.class)})
/* loaded from: classes.dex */
public class e {

    /* compiled from: AdapterViewBindingAdapter.java */
    public interface a {
        void onItemSelected(AdapterView<?> adapterView, View view, int i5, long j5);
    }

    /* compiled from: AdapterViewBindingAdapter.java */
    public static class b implements AdapterView.OnItemSelectedListener {

        /* renamed from: o, reason: collision with root package name */
        private final a f6037o;

        /* renamed from: p, reason: collision with root package name */
        private final c f6038p;

        /* renamed from: q, reason: collision with root package name */
        private final androidx.databinding.o f6039q;

        public b(a aVar, c cVar, androidx.databinding.o oVar) {
            this.f6037o = aVar;
            this.f6038p = cVar;
            this.f6039q = oVar;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i5, long j5) {
            a aVar = this.f6037o;
            if (aVar != null) {
                aVar.onItemSelected(adapterView, view, i5, j5);
            }
            androidx.databinding.o oVar = this.f6039q;
            if (oVar != null) {
                oVar.a();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            c cVar = this.f6038p;
            if (cVar != null) {
                cVar.onNothingSelected(adapterView);
            }
            androidx.databinding.o oVar = this.f6039q;
            if (oVar != null) {
                oVar.a();
            }
        }
    }

    /* compiled from: AdapterViewBindingAdapter.java */
    public interface c {
        void onNothingSelected(AdapterView<?> adapterView);
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onItemSelected", "android:onNothingSelected", "android:selectedItemPositionAttrChanged"})
    public static void a(AdapterView adapterView, a aVar, c cVar, androidx.databinding.o oVar) {
        if (aVar == null && cVar == null && oVar == null) {
            adapterView.setOnItemSelectedListener(null);
        } else {
            adapterView.setOnItemSelectedListener(new b(aVar, cVar, oVar));
        }
    }

    @androidx.databinding.d({"android:selectedItemPosition"})
    public static void b(AdapterView adapterView, int i5) {
        if (adapterView.getSelectedItemPosition() != i5) {
            adapterView.setSelection(i5);
        }
    }

    @androidx.databinding.d({"android:selectedItemPosition", "android:adapter"})
    public static void c(AdapterView adapterView, int i5, Adapter adapter) {
        if (adapter != adapterView.getAdapter()) {
            adapterView.setAdapter(adapter);
            adapterView.setSelection(i5);
        } else if (adapterView.getSelectedItemPosition() != i5) {
            adapterView.setSelection(i5);
        }
    }

    @androidx.databinding.d({"android:selection"})
    public static void d(AdapterView adapterView, int i5) {
        b(adapterView, i5);
    }

    @androidx.databinding.d({"android:selection", "android:adapter"})
    public static void e(AdapterView adapterView, int i5, Adapter adapter) {
        c(adapterView, i5, adapter);
    }
}
