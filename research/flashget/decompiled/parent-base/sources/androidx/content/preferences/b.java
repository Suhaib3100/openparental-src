package androidx.content.preferences;

import android.content.Context;
import fg.l;
import java.io.File;
import kd.i;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: PreferenceDataStoreFile.kt */
@i(name = "PreferenceDataStoreFile")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/content/Context;", "", "name", "Ljava/io/File;", "a", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", "datastore-preferences_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class b {
    @l
    public static final File a(@l Context context, @l String name) {
        l0.p(context, "<this>");
        l0.p(name, "name");
        return androidx.content.Context.a(context, l0.C(name, ".preferences_pb"));
    }
}
