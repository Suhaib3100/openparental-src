package androidx.core.net;

import android.net.Uri;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Uri.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\u0086\b\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0001¨\u0006\u0006"}, d2 = {"", "Landroid/net/Uri;", "c", "Ljava/io/File;", "b", "a", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class f {
    @d5.d
    public static final File a(@d5.d Uri uri) {
        l0.p(uri, "<this>");
        if (!l0.g(uri.getScheme(), "file")) {
            throw new IllegalArgumentException(l0.C("Uri lacks 'file' scheme: ", uri).toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        throw new IllegalArgumentException(l0.C("Uri path is null: ", uri).toString());
    }

    @d5.d
    public static final Uri b(@d5.d File file) {
        l0.p(file, "<this>");
        Uri fromFile = Uri.fromFile(file);
        l0.o(fromFile, "fromFile(this)");
        return fromFile;
    }

    @d5.d
    public static final Uri c(@d5.d String str) {
        l0.p(str, "<this>");
        Uri parse = Uri.parse(str);
        l0.o(parse, "parse(this)");
        return parse;
    }
}
