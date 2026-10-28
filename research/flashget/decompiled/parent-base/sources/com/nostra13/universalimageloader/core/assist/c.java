package com.nostra13.universalimageloader.core.assist;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: FlushedInputStream.java */
/* loaded from: classes6.dex */
public class c extends FilterInputStream {
    public c(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j4) throws IOException {
        long j5 = 0;
        while (j5 < j4) {
            long skip = ((FilterInputStream) this).in.skip(j4 - j5);
            if (skip == 0) {
                if (read() < 0) {
                    break;
                }
                skip = 1;
            }
            j5 += skip;
        }
        return j5;
    }
}
