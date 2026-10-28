package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: AppCompatTextClassifierHelper.java */
/* loaded from: classes.dex */
final class n {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.o0
    private TextView f1265a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.q0
    private TextClassifier f1266b;

    n(@androidx.annotation.o0 TextView textView) {
        textView.getClass();
        this.f1265a = textView;
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(api = 26)
    public TextClassifier a() {
        TextClassifier textClassifier;
        TextClassifier textClassifier2;
        TextClassifier textClassifier3 = this.f1266b;
        if (textClassifier3 != null) {
            return textClassifier3;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1265a.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            textClassifier2 = textClassificationManager.getTextClassifier();
            return textClassifier2;
        }
        textClassifier = TextClassifier.NO_OP;
        return textClassifier;
    }

    @androidx.annotation.x0(api = 26)
    public void b(@androidx.annotation.q0 TextClassifier textClassifier) {
        this.f1266b = textClassifier;
    }
}
