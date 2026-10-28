package androidx.core.widget;

import android.os.Build;
import androidx.annotation.c1;
import androidx.annotation.o0;

/* compiled from: AutoSizeableTextView.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public interface b {

    /* renamed from: g0, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static final boolean f27579g0;

    static {
        f27579g0 = Build.VERSION.SDK_INT >= 27;
    }

    int getAutoSizeMaxTextSize();

    int getAutoSizeMinTextSize();

    int getAutoSizeStepGranularity();

    int[] getAutoSizeTextAvailableSizes();

    int getAutoSizeTextType();

    void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7) throws IllegalArgumentException;

    void setAutoSizeTextTypeUniformWithPresetSizes(@o0 int[] iArr, int i4) throws IllegalArgumentException;

    void setAutoSizeTextTypeWithDefaults(int i4);
}
