package androidx.databinding.adapters;

import android.widget.RatingBar;
import androidx.annotation.c1;

/* compiled from: RatingBarBindingAdapter.java */
@c1({c1.a.LIBRARY})
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:rating", type = RatingBar.class)})
/* loaded from: classes.dex */
public class w {

    /* compiled from: RatingBarBindingAdapter.java */
    class a implements RatingBar.OnRatingBarChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RatingBar.OnRatingBarChangeListener f6086a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f6087b;

        a(RatingBar.OnRatingBarChangeListener onRatingBarChangeListener, androidx.databinding.o oVar) {
            this.f6086a = onRatingBarChangeListener;
            this.f6087b = oVar;
        }

        @Override // android.widget.RatingBar.OnRatingBarChangeListener
        public void onRatingChanged(RatingBar ratingBar, float f6, boolean z5) {
            RatingBar.OnRatingBarChangeListener onRatingBarChangeListener = this.f6086a;
            if (onRatingBarChangeListener != null) {
                onRatingBarChangeListener.onRatingChanged(ratingBar, f6, z5);
            }
            this.f6087b.a();
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onRatingChanged", "android:ratingAttrChanged"})
    public static void a(RatingBar ratingBar, RatingBar.OnRatingBarChangeListener onRatingBarChangeListener, androidx.databinding.o oVar) {
        if (oVar == null) {
            ratingBar.setOnRatingBarChangeListener(onRatingBarChangeListener);
        } else {
            ratingBar.setOnRatingBarChangeListener(new a(onRatingBarChangeListener, oVar));
        }
    }

    @androidx.databinding.d({"android:rating"})
    public static void b(RatingBar ratingBar, float f6) {
        if (ratingBar.getRating() != f6) {
            ratingBar.setRating(f6);
        }
    }
}
