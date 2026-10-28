package com.google.firebase.crashlytics.ndk;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class h implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean g4;
        g4 = JniNativeApi.g(file, str);
        return g4;
    }
}
