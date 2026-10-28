package androidx.databinding.adapters;

import androidx.annotation.c1;
import androidx.cardview.widget.CardView;

/* compiled from: CardViewBindingAdapter.java */
@c1({c1.a.LIBRARY})
@androidx.databinding.h({@androidx.databinding.g(attribute = "cardCornerRadius", method = "setRadius", type = CardView.class), @androidx.databinding.g(attribute = "cardMaxElevation", method = "setMaxCardElevation", type = CardView.class), @androidx.databinding.g(attribute = "cardPreventCornerOverlap", method = "setPreventCornerOverlap", type = CardView.class), @androidx.databinding.g(attribute = "cardUseCompatPadding", method = "setUseCompatPadding", type = CardView.class)})
/* loaded from: classes.dex */
public class h {
    @androidx.databinding.d({"contentPadding"})
    public static void a(CardView cardView, int i5) {
        cardView.C(i5, i5, i5, i5);
    }

    @androidx.databinding.d({"contentPaddingBottom"})
    public static void b(CardView cardView, int i5) {
        cardView.C(cardView.s(), cardView.u(), cardView.t(), i5);
    }

    @androidx.databinding.d({"contentPaddingLeft"})
    public static void c(CardView cardView, int i5) {
        cardView.C(i5, cardView.u(), cardView.t(), cardView.r());
    }

    @androidx.databinding.d({"contentPaddingRight"})
    public static void d(CardView cardView, int i5) {
        cardView.C(cardView.s(), cardView.u(), i5, cardView.r());
    }

    @androidx.databinding.d({"contentPaddingTop"})
    public static void e(CardView cardView, int i5) {
        cardView.C(cardView.s(), i5, cardView.t(), cardView.r());
    }
}
