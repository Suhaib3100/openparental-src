package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;

/* compiled from: UnicodeUnpairedSurrogateRemover.java */
@Deprecated
/* loaded from: classes6.dex */
public class l extends c {
    @Override // org.apache.commons.lang3.text.translate.c
    public boolean f(int i4, Writer writer) throws IOException {
        return i4 >= 55296 && i4 <= 57343;
    }
}
