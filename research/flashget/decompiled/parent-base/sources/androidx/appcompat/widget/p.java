package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: AppCompatTextClassifierHelper.java */
/* loaded from: classes.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.o0
    private TextView f1980a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.q0
    private TextClassifier f1981b;

    /* compiled from: AppCompatTextClassifierHelper.java */
    @androidx.annotation.x0(26)
    private static final class a {
        private a() {
        }

        @androidx.annotation.u
        @androidx.annotation.o0
        static TextClassifier a(@androidx.annotation.o0 TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    p(@androidx.annotation.o0 TextView textView) {
        textView.getClass();
        this.f1980a = textView;
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(api = 26)
    public TextClassifier a() {
        TextClassifier textClassifier = this.f1981b;
        return textClassifier == null ? a.a(this.f1980a) : textClassifier;
    }

    @androidx.annotation.x0(api = 26)
    public void b(@androidx.annotation.q0 TextClassifier textClassifier) {
        this.f1981b = textClassifier;
    }
}
