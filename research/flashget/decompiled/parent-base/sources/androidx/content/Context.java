package androidx.content;

import fg.l;
import java.io.File;
import kd.i;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: DataStoreFile.kt */
@i(name = "DataStoreFile")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/content/Context;", "", "fileName", "Ljava/io/File;", "a", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", "datastore_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* renamed from: androidx.datastore.b, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class Context {
    @l
    public static final File a(@l android.content.Context context, @l String fileName) {
        l0.p(context, "<this>");
        l0.p(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), l0.C("datastore/", fileName));
    }
}
