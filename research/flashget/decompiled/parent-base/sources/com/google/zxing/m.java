package com.google.zxing;

import java.util.Map;

/* compiled from: Reader.java */
/* loaded from: classes6.dex */
public interface m {
    n a(c cVar, Map<d, ?> map) throws NotFoundException, ChecksumException, FormatException;

    n c(c cVar) throws NotFoundException, ChecksumException, FormatException;

    void reset();
}
