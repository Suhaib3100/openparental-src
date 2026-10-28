package com.cby.shareboard.widget;

import android.graphics.Bitmap;
import fg.l;
import fg.m;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: IDoodleListener.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\u00020\u00022\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH&¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/cby/shareboard/widget/IDoodleListener;", "", "Lkotlin/k2;", "onActionChanged", "()V", "", "data", "sendToRemote", "(Ljava/lang/String;)V", "", "", "", "missingData", "requestMissingData", "(Ljava/util/Map;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "drawChanged", "onDrawChanged", "(Landroid/graphics/Bitmap;Z)V", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface IDoodleListener {
    void onActionChanged();

    void onDrawChanged(@m Bitmap bitmap, boolean drawChanged);

    void requestMissingData(@l Map<String, ? extends List<Integer>> missingData);

    void sendToRemote(@l String data);
}
