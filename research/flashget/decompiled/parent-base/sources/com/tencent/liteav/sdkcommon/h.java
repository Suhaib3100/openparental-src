package com.tencent.liteav.sdkcommon;

import android.widget.ScrollView;
import com.android.internal.telephony.cdma.UserData;

/* loaded from: classes7.dex */
final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final g f72052a;

    private h(g gVar) {
        this.f72052a = gVar;
    }

    public static Runnable a(g gVar) {
        return new h(gVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScrollView scrollView = this.f72052a.f72041k;
        if (scrollView != null) {
            scrollView.fullScroll(UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS);
        }
    }
}
