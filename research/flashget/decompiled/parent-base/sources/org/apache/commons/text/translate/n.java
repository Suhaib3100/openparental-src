package org.apache.commons.text.translate;

import java.io.IOException;
import java.io.Writer;

/* compiled from: UnicodeUnpairedSurrogateRemover.java */
/* loaded from: classes3.dex */
public class n extends c {
    @Override // org.apache.commons.text.translate.c
    public boolean f(int i4, Writer writer) throws IOException {
        return i4 >= 55296 && i4 <= 57343;
    }
}
