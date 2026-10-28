package com.luck.picture.lib.interfaces;

import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public interface OnPermissionDeniedListener {
    void onDenied(Fragment fragment, String[] strArr, int i4, OnCallbackListener<Boolean> onCallbackListener);
}
