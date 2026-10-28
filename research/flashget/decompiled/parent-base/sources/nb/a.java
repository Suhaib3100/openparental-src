package nb;

import android.graphics.Bitmap;
import com.nostra13.universalimageloader.utils.c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DiskCache.java */
/* loaded from: classes6.dex */
public interface a {
    File a();

    boolean b(String str, Bitmap bitmap) throws IOException;

    boolean c(String str, InputStream inputStream, c.a aVar) throws IOException;

    void clear();

    void close();

    File get(String str);

    boolean remove(String str);
}
