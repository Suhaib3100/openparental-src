package top.zibin.luban;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: InputStreamProvider.java */
/* loaded from: classes9.dex */
public interface g {
    void close();

    String getPath();

    InputStream open() throws IOException;
}
