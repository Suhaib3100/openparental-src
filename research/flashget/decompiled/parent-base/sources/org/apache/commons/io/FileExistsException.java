package org.apache.commons.io;

import java.io.File;
import java.io.IOException;

/* loaded from: classes4.dex */
public class FileExistsException extends IOException {

    /* renamed from: b, reason: collision with root package name */
    private static final long f85302b = 1;

    public FileExistsException() {
    }

    public FileExistsException(String str) {
        super(str);
    }

    public FileExistsException(File file) {
        super(com.sand.file.b.a("File ", file, " exists"));
    }
}
