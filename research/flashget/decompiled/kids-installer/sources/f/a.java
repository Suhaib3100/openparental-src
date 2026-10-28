package f;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.annotation.c1;
import java.util.Locale;

/* compiled from: AllCapsTransformationMethod.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class a implements TransformationMethod {

    /* renamed from: o, reason: collision with root package name */
    private Locale f22547o;

    public a(Context context) {
        this.f22547o = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f22547o);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z5, int i5, Rect rect) {
    }
}
