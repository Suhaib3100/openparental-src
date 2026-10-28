package com.luck.picture.lib.interfaces;

import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public interface OnPermissionDescriptionListener {
    void onDismiss(Fragment fragment);

    void onPermissionDescription(Fragment fragment, String[] strArr);
}
