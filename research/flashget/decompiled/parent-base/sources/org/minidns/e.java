package org.minidns;

import java.io.IOException;
import java.util.List;
import org.minidns.f;
import org.minidns.util.MultipleIoException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements f.g {
    @Override // org.minidns.f.g
    public final Exception a(List list) {
        IOException d5;
        d5 = MultipleIoException.d(list);
        return d5;
    }
}
