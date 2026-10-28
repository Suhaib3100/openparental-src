package androidx.core.widget;

import android.os.Build;
import androidx.annotation.c1;
import androidx.annotation.o0;

/* compiled from: AutoSizeableTextView.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static final boolean f5874a;

    static {
        f5874a = Build.VERSION.SDK_INT >= 27;
    }

    int getAutoSizeMaxTextSize();

    int getAutoSizeMinTextSize();

    int getAutoSizeStepGranularity();

    int[] getAutoSizeTextAvailableSizes();

    int getAutoSizeTextType();

    void setAutoSizeTextTypeUniformWithConfiguration(int i5, int i6, int i7, int i8) throws IllegalArgumentException;

    void setAutoSizeTextTypeUniformWithPresetSizes(@o0 int[] iArr, int i5) throws IllegalArgumentException;

    void setAutoSizeTextTypeWithDefaults(int i5);
}
