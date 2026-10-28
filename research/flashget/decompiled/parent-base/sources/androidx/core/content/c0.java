package androidx.core.content;

import android.content.res.Configuration;
import kotlin.Metadata;

/* compiled from: OnConfigurationChangedProvider.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\b\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/core/content/c0;", "", "Landroidx/core/util/e;", "Landroid/content/res/Configuration;", "listener", "Lkotlin/k2;", "addOnConfigurationChangedListener", "(Landroidx/core/util/e;)V", "removeOnConfigurationChangedListener", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface c0 {
    void addOnConfigurationChangedListener(@fg.l androidx.core.util.e<Configuration> listener);

    void removeOnConfigurationChangedListener(@fg.l androidx.core.util.e<Configuration> listener);
}
