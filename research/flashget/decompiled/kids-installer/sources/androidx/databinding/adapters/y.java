package androidx.databinding.adapters;

import android.widget.SeekBar;
import androidx.annotation.c1;

/* compiled from: SeekBarBindingAdapter.java */
@c1({c1.a.LIBRARY})
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:progress", type = SeekBar.class)})
/* loaded from: classes.dex */
public class y {

    /* compiled from: SeekBarBindingAdapter.java */
    class a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f6092a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f6093b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f6094c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f6095d;

        a(b bVar, androidx.databinding.o oVar, c cVar, d dVar) {
            this.f6092a = bVar;
            this.f6093b = oVar;
            this.f6094c = cVar;
            this.f6095d = dVar;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i5, boolean z5) {
            b bVar = this.f6092a;
            if (bVar != null) {
                bVar.onProgressChanged(seekBar, i5, z5);
            }
            androidx.databinding.o oVar = this.f6093b;
            if (oVar != null) {
                oVar.a();
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            c cVar = this.f6094c;
            if (cVar != null) {
                cVar.onStartTrackingTouch(seekBar);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            d dVar = this.f6095d;
            if (dVar != null) {
                dVar.onStopTrackingTouch(seekBar);
            }
        }
    }

    /* compiled from: SeekBarBindingAdapter.java */
    public interface b {
        void onProgressChanged(SeekBar seekBar, int i5, boolean z5);
    }

    /* compiled from: SeekBarBindingAdapter.java */
    public interface c {
        void onStartTrackingTouch(SeekBar seekBar);
    }

    /* compiled from: SeekBarBindingAdapter.java */
    public interface d {
        void onStopTrackingTouch(SeekBar seekBar);
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onStartTrackingTouch", "android:onStopTrackingTouch", "android:onProgressChanged", "android:progressAttrChanged"})
    public static void a(SeekBar seekBar, c cVar, d dVar, b bVar, androidx.databinding.o oVar) {
        if (cVar == null && dVar == null && bVar == null && oVar == null) {
            seekBar.setOnSeekBarChangeListener(null);
        } else {
            seekBar.setOnSeekBarChangeListener(new a(bVar, oVar, cVar, dVar));
        }
    }

    @androidx.databinding.d({"android:progress"})
    public static void b(SeekBar seekBar, int i5) {
        if (i5 != seekBar.getProgress()) {
            seekBar.setProgress(i5);
        }
    }
}
