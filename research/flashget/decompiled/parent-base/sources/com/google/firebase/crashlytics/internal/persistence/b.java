package com.google.firebase.crashlytics.internal.persistence;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.FilenameFilter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class b implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean startsWith;
        startsWith = str.startsWith(ProtectedSandApp.s("ｵ"));
        return startsWith;
    }
}
