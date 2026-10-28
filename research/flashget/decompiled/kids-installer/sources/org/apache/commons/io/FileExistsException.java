package org.apache.commons.io;

import java.io.File;
import java.io.IOException;

/* loaded from: classes5.dex */
public class FileExistsException extends IOException {

    /* renamed from: o, reason: collision with root package name */
    private static final long f31802o = 1;

    public FileExistsException(File file) {
        super(h.a("File ", file, " exists"));
    }

    public FileExistsException() {
    }

    public FileExistsException(String str) {
        super(str);
    }
}
